
cmake_minimum_required(VERSION 3.10.2)

# 工程名
project("ImageFinalCompress")
#吧xxx.cpp 编译成xxx 动态库（也就是java 代码中loadLibrary 加载的）
add_library( # Sets the name of the library.
        libjpegbither

        # Sets the library as a shared library.
        SHARED

        # Provides a relative path to your source file(s).
        libjpegbither.cpp
        )

# 先不管
find_library( # Sets the name of the path variable.
        log-lib

        # Specifies the name of the NDK library that
        # you want CMake to locate.
        log
        )


# 吧自己的libjpegbither 与系统的log-lib库关联
target_link_libraries( # Specifies the target library.
        libjpegbither

        # Links the target library to the log library
        # included in the NDK.
        ${log-lib}
        )
