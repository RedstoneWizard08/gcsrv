package io.github.redstonewizard08.gcsrv.loggingfilter;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Collection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.LoggerConfig;

@Mod(modid = LoggingFilter.MODID, name = LoggingFilter.NAME, version = LoggingFilter.VERSION)
@SideOnly(Side.SERVER)
public class LoggingFilter {
    public static final String MODID = "logging-filter";
    public static final String NAME = "Logging Filter";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();

        setupFilter();
    }

    public void setupFilter() {
        logger.info("Setting up filter!");

        LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
        Collection<LoggerConfig> configs = ctx.getConfiguration().getLoggers().values();

        for (LoggerConfig config : configs) {
            config.addFilter(new SpamFilter());
        }

        logger.info("Set up filter!");
    }
}
