backUpDestination = 'C:\\Workspaces\\BackUp\\src\\test\\resources\\test1\\backUpDestination'

computers {
    adamMandy {
        backUpComputer = 'momDad'

        foldersToBackUp = [
                "C:\\Workspaces\\BackUp\\src\\test\\resources\\test1\\adamMandy\\toBackUpOne",
                "C:\\Workspaces\\BackUp\\src\\test\\resources\\test1\\adamMandy\\toBackUpTwo",
                "C:\\Workspaces\\BackUp\\src\\test\\resources\\test1\\adamMandy\\doesntExist",
                "C:\\Workspaces\\BackUp\\src\\test\\resources\\test1\\adamMandy\\toBackUpEmpty"
        ]
    }

    momDad {
        backUpComputer = 'adamMandy'

        foldersToBackUp = [
                "C:\\Workspaces\\BackUp\\src\\test\\resources\\test1\\momDad\\toBackUpOne",
                "C:\\Workspaces\\BackUp\\src\\test\\resources\\test1\\momDad\\toBackUpTwo",
                "C:\\Workspaces\\BackUp\\src\\test\\resources\\test1\\momDad\\doesntExist",
                "C:\\Workspaces\\BackUp\\src\\test\\resources\\test1\\momDad\\toBackUpEmpty"
        ]
    }
}