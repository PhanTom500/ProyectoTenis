package com.tenis.dao;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.tenis.bean.NoticiaBean;
import com.tenis.bean.NoticiaFilFecBean;

public class MySqlNoticiaDAO implements NoticiaDAO{
	
	SqlSessionFactory sqlMapper = null;
	{
		String archivo = "ConfiguracionIbatis.xml";
		try {
			Reader reader = Resources.getResourceAsReader(archivo);
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int eliminaNoticia(int idNoticia) throws Exception {
		int salida = -1;
		SqlSession session = null;
		try {
			session = sqlMapper.openSession();
			salida = session.delete("SQL_eliminaNoticia",idNoticia);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally{
			session.close();
		}
		return salida;
	}

	@Override
	public int insertaNoticia(NoticiaBean obj) throws Exception {
		int salida = -1;
		SqlSession session = null;
		try {
			session = sqlMapper.openSession();
			salida = session.insert("SQL_insertaNoticia",obj);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally{
			session.close();
		}
		return salida;
	}

	@Override
	public int actualizaNoticia(NoticiaBean obj) throws Exception {
		int salida = -1;
		SqlSession session = null;
		try {
			session = sqlMapper.openSession();
			salida = session.update("SQL_actualizaNoticia",obj);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally{
			session.close();
		}
		return salida;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<NoticiaBean> consultaNoticia(String filtro) throws Exception {
		SqlSession session = null;
		List<NoticiaBean> salida = null;
		try{
			session = sqlMapper.openSession();
			salida = session.selectList("SQL_listaNoticia","%"+filtro+"%");
		} catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return salida;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<NoticiaBean> consultaNoticiaFecha(NoticiaFilFecBean filtro) throws Exception {
		List<NoticiaBean> salida =  new ArrayList<NoticiaBean>();
		SqlSession session = null;
		try {
			session = sqlMapper.openSession();
			salida = session.selectList("SQL_consultaNoticiaFecha",filtro);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			session.close();
		}
		return salida;
	}


}
