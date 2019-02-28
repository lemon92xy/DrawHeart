package com.lemon.drawheart.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.lemon.drawheart.entity.Present;

import com.lemon.drawheart.dao.PresentDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig presentDaoConfig;

    private final PresentDao presentDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        presentDaoConfig = daoConfigMap.get(PresentDao.class).clone();
        presentDaoConfig.initIdentityScope(type);

        presentDao = new PresentDao(presentDaoConfig, this);

        registerDao(Present.class, presentDao);
    }
    
    public void clear() {
        presentDaoConfig.clearIdentityScope();
    }

    public PresentDao getPresentDao() {
        return presentDao;
    }

}
