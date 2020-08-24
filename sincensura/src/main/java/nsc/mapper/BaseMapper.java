package nsc.mapper;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;


public abstract class BaseMapper<SO, T> {
	
	private static Logger LOG = Logger.getLogger(BaseMapper.class.getName());

	protected Class<SO> soType;

	protected Class<T> entityType;

	public Collection<T> fromSO(Iterable<SO> entitiesSO) {
		if (entitiesSO != null) {
			Collection<T> entities = new ArrayList<>();
			for (SO entitySO : entitiesSO) {
				entities.add(fromSO(entitySO));
			}
			return entities;
		} else {
			return Collections.emptyList();
		}
	}

	public Set<T> fromSO(Set<SO> entitiesSO) {
		if (entitiesSO != null) {
			Set<T> entities = new HashSet<>();
			for (SO entitySO : entitiesSO) {
				entities.add(fromSO(entitySO));
			}
			return entities;
		} else {
			return Collections.emptySet();
		}
	}

	public Collection<SO> toSO(Iterable<T> entities) {
		if (entities != null) {
			Collection<SO> entitiesSO = new ArrayList<>();
			for (T entity : entities) {
				entitiesSO.add(toSO(entity));
			}
			return entitiesSO;
		} else {
			return Collections.emptyList();
		}
	}

	public Set<SO> toSO(Set<T> entities) {
		if (entities != null) {
			Set<SO> entitiesSO = new HashSet<>();
			for (T entity : entities) {
				entitiesSO.add(toSO(entity));
			}
			return entitiesSO;
		} else {
			return Collections.emptySet();
		}
	}

	public T fromSO(SO entitySO) {
		T entity = null;
		try {
			entity = getEntityType().newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			LOG.warning("Error al mapear en BaseMapper");
		}

		return entity;
	}
	public SO toSO(T entity) {
		SO entitySO = null;
		try {
			entity = getEntityType().newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			LOG.warning("Error al mapear en BaseMapper");
		}
		
		return entitySO;
	}

	@SuppressWarnings("unchecked")
	public Class<SO> getSoType() {
		if (soType == null) {
			this.soType = (Class<SO>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
			LOG.warning("Error al mapear en BaseMapper");
		}
		return soType;
	}

	@SuppressWarnings("unchecked")
	public Class<T> getEntityType() {
		if (entityType == null) {
			this.entityType = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
			LOG.warning("Error al mapear en BaseMapper");
		}
		return entityType;
	}

}