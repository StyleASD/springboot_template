load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_library")

kt_jvm_library(
    name = "lib",
    srcs = glob(["*.kt"]),
    visibility = ["//src/test:__subpackages__"],
    deps = [
        "@maven//:org_springframework_boot_spring_boot",
        "@maven//:org_springframework_boot_spring_boot_autoconfigure",
        "@maven//:org_springframework_boot_spring_boot_starter_web",
        "@maven//:org_springframework_spring_context",
        "@maven//:org_springframework_spring_web",
    ],
)

java_binary(
    name = "app",
    main_class = "hello.ApplicationKt",
    resources = [],
    runtime_deps = [
        ":lib",
    ],
)
