val sub = project

val root = Project("root", file(".")).aggregate(sub).disablePlugins(plugins.IvyPlugin)
