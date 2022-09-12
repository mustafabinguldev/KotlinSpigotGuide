package dev.bingulhan

import dev.bingulhan.listeners.PlayerListener
import org.bukkit.plugin.java.JavaPlugin

//this is how a class is inherited
class Example : JavaPlugin(){

    //a function is defined like this
    override fun onEnable() {
        logger.info("Plugin Aktif")

        config.options().copyDefaults(true)
        saveConfig()

        if (config.getBoolean("test-events")) {

            //This is how a new instance of a class is set up and a listener has been added.
            server.pluginManager.registerEvents(PlayerListener(), this);


            logger.info("Test events active")
        }
    }
}