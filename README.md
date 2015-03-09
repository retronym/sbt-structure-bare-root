## IntelliJ SBT import bug

If the root project disables the Ivy plugin (as a way to disable all publishing
and building of JARs and POMs), IntelliJ fails to import with a `None.get`
exception on import (Screenshot: https://www.dropbox.com/s/mjon9ehwvsq5hli/Screenshot%202015-03-09%2015.42.39.png?dl=0)

This behaviour will become the default for aggregate projects in the next
version of SBT: https://github.com/sbt/sbt/issues/1869