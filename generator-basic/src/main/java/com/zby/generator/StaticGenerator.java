package com.zby.generator;

import cn.hutool.core.io.FileUtil;

import java.io.File;

/**
 * @Author: zby
 * @Date: 2020/5/27  10:41
 * @Description:静态文件生成器
 *
 */


public class StaticGenerator {
    public static void main(String[] args) {
        String projectPath= System.getProperty("user.dir");
        // 输入路径
        String inputpath = projectPath + File.separator +"generator-demo-project" + File.separator + "acm-template";
        // 打印输入路径
        System.out.println(inputpath);
        // 输出路径
        String outputpath = projectPath;
        // 复制
        copyFilesByHutool(inputpath,outputpath);
    }
    /**
     * 拷贝文件（Hutool 实现，会将输入目录完整拷贝到输出目录下）
     * @param @inputPath 输入路径
     * @param @outputPath 输出路径
     */
    public static void copyFilesByHutool(String inputpath,String outputpath) {
        FileUtil.copy(inputpath, outputpath, false);
    }
}

