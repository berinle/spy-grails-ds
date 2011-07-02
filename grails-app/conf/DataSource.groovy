dataSource {
    pooled = true
//    driverClassName = "org.h2.Driver"
    driverClassName = "com.p6spy.engine.spy.P6SpyDriver" // use this driver to enable p6spy logging
    username = "sa"
    password = ""
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop','update'
            //url = "jdbc:h2:mem:devDb"
            jndiName = "jdbc/spyDB"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:mem:testDb"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            //url = "jdbc:h2:prodDb"
            jndiName = "jdbc/spyDB"
        }
    }
}
