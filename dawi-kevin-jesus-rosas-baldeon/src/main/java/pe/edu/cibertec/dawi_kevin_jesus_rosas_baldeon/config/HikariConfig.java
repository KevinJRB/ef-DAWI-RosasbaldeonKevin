package pe.edu.cibertec.dawi_kevin_jesus_rosas_baldeon.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class HikariConfig {
    @Value("${DB_WORLD_URL}")
    private String dbFabricUrl;
    @Value("${DB_ WORLD_USER}")
    private String dbFabricUser;
    @Value("${DB_ WORLD_PASS}")
    private String dbFabricPass;
    @Value("${DB_ WORLD_DRIVER}")
    private String dbFabricDriver;

    @Bean
    public HikariDataSource hikariDataSource() {

        com.zaxxer.hikari.HikariConfig config = new com.zaxxer.hikari.HikariConfig();

        /**
         * Configurar propiedad de conexion a BD
         */
        config.setJdbcUrl(dbFabricUrl);
        config.setUsername(dbFabricUser);
        config.setPassword(dbFabricPass);
        config.setDriverClassName(dbFabricDriver);

        /**
         * Configurar propiedades del pool de HikariCP
         * - MaximumPoolSize: Máximo # de conexiones del pool.
         * - MinimumIdle: Mínimo # de conexiones inactivas del pool.
         * - IdleTimeout: Tiempo máximo de espera para
         *      eliminar una conexión inactiva.
         * - ConnectionTimeout: Tiempo máximo de espera
         *      para conectarse a la BD.
         */
        config.setMaximumPoolSize(20);
        config.setMinimumIdle(5);
        config.setIdleTimeout(300000);
        config.setConnectionTimeout(30000);

        System.out.println("###### HikariCP initialized ######");
        return new HikariDataSource(config);

    }
}

