package com.carst.bu

import org.slf4j.Logger
import org.slf4j.LoggerFactory

class BackUp {
    Logger log = LoggerFactory.getLogger(this.class)
    ConfigObject config

    public static void main(String[] args) {
        if(args.size() == 0){
            throw new Exception("\n\nYou need to pass the following program arguments: computerName")
        }

        String computerName = args[0]
        BackUp backUp = new BackUp()
        backUp.go(computerName)
    }

    void go(String computerName){
        log.info("Welcome to BackUp!")
        log.info("Running as computer name: ${computerName}")

        // read in config file
        File configLocation = new File(System.properties.getProperty('config.location', './BackUpConfig.groovy'))
        log.info("Using config file: ${configLocation.getAbsolutePath()}")
        config = new ConfigSlurper().parse(configLocation.toURI().toURL())

        backUpMyFiles()
        backUpOthersFiles()

        log.info("BackUp out.")
    }

    void backUpMyFiles(){
        log.info("Backing up my files.")

    }

    void backUpOthersFiles(){
        log.info("Backing up other's files.")
    }
}
