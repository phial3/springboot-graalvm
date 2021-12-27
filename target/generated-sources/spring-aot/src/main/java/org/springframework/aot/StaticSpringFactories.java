package org.springframework.aot;

import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.util.function.Supplier;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.SpringBootExceptionReporter;
import org.springframework.boot._FactoryProvider;
import org.springframework.boot.context.config.ConfigDataLocationResolver;
import org.springframework.boot.diagnostics.FailureAnalyzer;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.boot.sql.init.dependency.DatabaseInitializerDetector;
import org.springframework.boot.sql.init.dependency.DependsOnDatabaseInitializationDetector;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ApplicationListener;
import org.springframework.core.NativeDetector;
import org.springframework.util.ClassUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/**
 * Class generated - do not edit this file
 */
public abstract class StaticSpringFactories {
  public static MultiValueMap<Class, Supplier<Object>> factories = new LinkedMultiValueMap();

  public static MultiValueMap<Class, String> names = new LinkedMultiValueMap();

  static {
    System.setProperty("spring.xml.ignore", "true");
    if (!NativeDetector.inNativeImage()) {
      System.setProperty("org.graalvm.nativeimage.imagecode", "runtime");
    }
    if (ClassUtils.isPresent("org.hibernate.Session", null)) {
      System.setProperty("hibernate.bytecode.provider", "none");
    }
    factories.add(org.springframework.boot.diagnostics.FailureAnalysisReporter.class, () -> new org.springframework.boot.diagnostics.LoggingFailureAnalysisReporter());
    names.add(SpringApplicationRunListener.class, "org.springframework.boot.context.event.EventPublishingRunListener");
    factories.add(ApplicationListener.class, () -> _FactoryProvider.clearCachesApplicationListener());
    factories.add(org.springframework.context.ApplicationListener.class, () -> new org.springframework.boot.builder.ParentContextCloserApplicationListener());
    factories.add(org.springframework.context.ApplicationListener.class, () -> new org.springframework.boot.context.FileEncodingApplicationListener());
    factories.add(org.springframework.context.ApplicationListener.class, () -> new org.springframework.boot.context.config.AnsiOutputApplicationListener());
    factories.add(org.springframework.context.ApplicationListener.class, () -> new org.springframework.boot.context.config.DelegatingApplicationListener());
    factories.add(org.springframework.context.ApplicationListener.class, () -> new org.springframework.boot.context.logging.LoggingApplicationListener());
    factories.add(org.springframework.context.ApplicationListener.class, () -> new org.springframework.boot.env.EnvironmentPostProcessorApplicationListener());
    factories.add(org.springframework.boot.logging.LoggingSystemFactory.class, () -> new org.springframework.boot.logging.logback.LogbackLoggingSystem.Factory());
    factories.add(org.springframework.boot.logging.LoggingSystemFactory.class, () -> new org.springframework.boot.logging.log4j2.Log4J2LoggingSystem.Factory());
    factories.add(org.springframework.boot.logging.LoggingSystemFactory.class, () -> new org.springframework.boot.logging.java.JavaLoggingSystem.Factory());
    factories.add(DatabaseInitializerDetector.class, () -> org.springframework.boot.flyway._FactoryProvider.flywayDatabaseInitializerDetector());
    factories.add(DatabaseInitializerDetector.class, () -> org.springframework.boot.jdbc._FactoryProvider.abstractDataSourceInitializerDatabaseInitializerDetector());
    factories.add(DatabaseInitializerDetector.class, () -> org.springframework.boot.jdbc.init._FactoryProvider.dataSourceScriptDatabaseInitializerDetector());
    factories.add(DatabaseInitializerDetector.class, () -> org.springframework.boot.liquibase._FactoryProvider.liquibaseDatabaseInitializerDetector());
    names.add(DatabaseInitializerDetector.class, "org.springframework.boot.orm.jpa.JpaDatabaseInitializerDetector");
    factories.add(DatabaseInitializerDetector.class, () -> org.springframework.boot.r2dbc.init._FactoryProvider.r2dbcScriptDatabaseInitializerDetector());
    factories.add(org.springframework.boot.env.PropertySourceLoader.class, () -> new org.springframework.boot.env.PropertiesPropertySourceLoader());
    factories.add(org.springframework.boot.env.PropertySourceLoader.class, () -> new org.springframework.boot.env.YamlPropertySourceLoader());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.context.config._FactoryProvider.configDataNotFoundFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.context.properties._FactoryProvider.incompatibleConfigurationFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.context.properties._FactoryProvider.notConstructorBoundInjectionFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.beanCurrentlyInCreationFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.beanDefinitionOverrideFailureAnalyzer());
    factories.add(org.springframework.boot.diagnostics.FailureAnalyzer.class, () -> new org.springframework.boot.diagnostics.analyzer.BeanNotOfRequiredTypeFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.bindFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.bindValidationFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.unboundConfigurationPropertyFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.connectorStartFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.mutuallyExclusiveConfigurationPropertiesFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.noSuchMethodFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.noUniqueBeanDefinitionFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.portInUseFailureAnalyzer());
    names.add(FailureAnalyzer.class, "org.springframework.boot.diagnostics.analyzer.ValidationExceptionFailureAnalyzer");
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.invalidConfigurationPropertyNameFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.invalidConfigurationPropertyValueFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.patternParseFailureAnalyzer());
    names.add(FailureAnalyzer.class, "org.springframework.boot.liquibase.LiquibaseChangelogMissingFailureAnalyzer");
    names.add(SpringBootExceptionReporter.class, "org.springframework.boot.diagnostics.FailureAnalyzers");
    factories.add(DependsOnDatabaseInitializationDetector.class, () -> org.springframework.boot.sql.init.dependency._FactoryProvider.annotationDependsOnDatabaseInitializationDetector());
    factories.add(DependsOnDatabaseInitializationDetector.class, () -> org.springframework.boot.jdbc._FactoryProvider.springJdbcDependsOnDatabaseInitializationDetector());
    factories.add(DependsOnDatabaseInitializationDetector.class, () -> org.springframework.boot.jooq._FactoryProvider.jooqDependsOnDatabaseInitializationDetector());
    names.add(DependsOnDatabaseInitializationDetector.class, "org.springframework.boot.orm.jpa.JpaDependsOnDatabaseInitializationDetector");
    names.add(ConfigDataLocationResolver.class, "org.springframework.boot.context.config.ConfigTreeConfigDataLocationResolver");
    names.add(ConfigDataLocationResolver.class, "org.springframework.boot.context.config.StandardConfigDataLocationResolver");
    factories.add(org.springframework.boot.context.config.ConfigDataLoader.class, () -> new org.springframework.boot.context.config.ConfigTreeConfigDataLoader());
    factories.add(org.springframework.boot.context.config.ConfigDataLoader.class, () -> new org.springframework.boot.context.config.StandardConfigDataLoader());
    factories.add(org.springframework.context.ApplicationContextInitializer.class, () -> new org.springframework.boot.context.ConfigurationWarningsApplicationContextInitializer());
    factories.add(org.springframework.context.ApplicationContextInitializer.class, () -> new org.springframework.boot.context.ContextIdApplicationContextInitializer());
    factories.add(org.springframework.context.ApplicationContextInitializer.class, () -> new org.springframework.boot.context.config.DelegatingApplicationContextInitializer());
    factories.add(org.springframework.context.ApplicationContextInitializer.class, () -> new org.springframework.boot.rsocket.context.RSocketPortInfoApplicationContextInitializer());
    factories.add(org.springframework.context.ApplicationContextInitializer.class, () -> new org.springframework.boot.web.context.ServerPortInfoApplicationContextInitializer());
    names.add(EnvironmentPostProcessor.class, "org.springframework.boot.cloud.CloudFoundryVcapEnvironmentPostProcessor");
    names.add(EnvironmentPostProcessor.class, "org.springframework.boot.context.config.ConfigDataEnvironmentPostProcessor");
    names.add(EnvironmentPostProcessor.class, "org.springframework.boot.env.RandomValuePropertySourceEnvironmentPostProcessor");
    factories.add(org.springframework.boot.env.EnvironmentPostProcessor.class, () -> new org.springframework.boot.env.SpringApplicationJsonEnvironmentPostProcessor());
    factories.add(org.springframework.boot.env.EnvironmentPostProcessor.class, () -> new org.springframework.boot.env.SystemEnvironmentPropertySourceEnvironmentPostProcessor());
    factories.add(org.springframework.boot.env.EnvironmentPostProcessor.class, () -> new org.springframework.boot.reactor.DebugAgentEnvironmentPostProcessor());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.data.redis._FactoryProvider.redisUrlSyntaxFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.diagnostics.analyzer._FactoryProvider.noSuchBeanDefinitionFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.flyway._FactoryProvider.flywayMigrationScriptMissingFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.jdbc._FactoryProvider.dataSourceBeanCreationFailureAnalyzer());
    names.add(FailureAnalyzer.class, "org.springframework.boot.autoconfigure.jdbc.HikariDriverConfigurationFailureAnalyzer");
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.jooq._FactoryProvider.noDslContextBeanFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.r2dbc._FactoryProvider.connectionFactoryBeanCreationFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.r2dbc._FactoryProvider.missingR2dbcPoolDependencyFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.r2dbc._FactoryProvider.multipleConnectionPoolConfigurationsFailureAnalzyer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.r2dbc._FactoryProvider.noConnectionFactoryBeanFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.session._FactoryProvider.nonUniqueSessionRepositoryFailureAnalyzer());
    factories.add(DependsOnDatabaseInitializationDetector.class, () -> org.springframework.boot.autoconfigure.batch._FactoryProvider.jobRepositoryDependsOnDatabaseInitializationDetector());
    factories.add(DependsOnDatabaseInitializationDetector.class, () -> org.springframework.boot.autoconfigure.quartz._FactoryProvider.schedulerDependsOnDatabaseInitializationDetector());
    factories.add(DependsOnDatabaseInitializationDetector.class, () -> org.springframework.boot.autoconfigure.session._FactoryProvider.jdbcIndexedSessionRepositoryDependsOnDatabaseInitializationDetector());
    factories.add(DatabaseInitializerDetector.class, () -> org.springframework.boot.autoconfigure.flyway._FactoryProvider.flywayMigrationInitializerDatabaseInitializerDetector());
    factories.add(ApplicationContextInitializer.class, () -> org.springframework.boot.autoconfigure._FactoryProvider.sharedMetadataReaderFactoryContextInitializer());
    factories.add(org.springframework.context.ApplicationContextInitializer.class, () -> new org.springframework.boot.autoconfigure.logging.ConditionEvaluationReportLoggingListener());
    factories.add(EnvironmentPostProcessor.class, () -> org.springframework.boot.autoconfigure.integration._FactoryProvider.integrationPropertiesEnvironmentPostProcessor());
    factories.add(org.springframework.beans.BeanInfoFactory.class, () -> new org.springframework.beans.ExtendedBeanInfoFactory());
    factories.add(org.springframework.boot.diagnostics.FailureAnalyzer.class, () -> new org.springframework.nativex.GeneratedClassNotFoundExceptionFailureAnalyzer());
    factories.add(org.springframework.boot.diagnostics.FailureAnalyzer.class, () -> new org.springframework.nativex.ClassNotFoundExceptionNativeFailureAnalyzer());
    factories.add(org.springframework.boot.diagnostics.FailureAnalyzer.class, () -> new org.springframework.nativex.NoSuchMethodExceptionNativeFailureAnalyzer());
    factories.add(org.springframework.context.ApplicationListener.class, () -> new org.springframework.nativex.NativeListener());
  }
}