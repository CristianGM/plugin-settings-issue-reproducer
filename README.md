# plugin-settings-issue-reproducer

Just running `./gradlew assemble` will fail with:
> e: .../plugin-settings-issue-reproducer/src/main/kotlin/org/example/custom-plugin.settings.gradle.kts: (3, 1): Unresolved reference. None of the following candidates is applicable because of receiver type mismatch: 
> @Deprecated @Incubating public fun Project.plugins(block: PluginDependenciesSpec.() -> Unit): Nothing defined in org.gradle.kotlin.dsl
