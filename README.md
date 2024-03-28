# ChatGPT AI问答助手

## 项目简介
项目地址：https://bugstack.cn/md/project/chatbot-api/chatbot-api.html(opens new window)

项目名称：ChatGPT AI 服务化问答中心
系统架构：DDD 领域驱动设计，构建问答模型

核心技术：SpringBoot、MyBatis【项目中没有使用，你可以扩展落库了】、MySQL、XXL_JOB、Docker

项目描述：此项目用于通过ChatGPT的能力，解决日常研发学习过程中的通用共性类问题信息处理，并根据所积累的提问进行资料汇总。此项目对接了知识星球提供问答服务，也提供了对接公众号和企业微信的接口，可以按需扩展。

核心职责：
负责项目的整体架构设计，包括选择适合的框架和技术，设计领域模型和服务，保证系统具有高可用性、可扩展性和易维护性。
针对项目中出现的技术问题进行分析和解决，如接口爬虫时遇到的反爬机制、AI接口调用时的异常处理等，同时需要根据用户反馈及时修复bug和改进系统功能。
熟悉SpringBoot框架、DDD架构设计思想、Github仓库管理工具、定时任务调度工具等，掌握Docker容器部署和镜像打包的技术，能够灵活运用不同的技术手段解决实际问题。
整合 ChatGPT API 和网页问答系统，使用 Spring Boot 框架将 ChatGPT API 集成到网页问答系统中。让用户可以通过问答网页或软件向系统提问，并获得 ChatGPT 的回复。
应用 DDD 架构进行领域隔离，通过将不同功能的代码分组到不同的领域中，实现更好的模块化和解耦，使项目易于维护和扩展。在此过程中，我学习到了 DDD 领域驱动设计的模型设计和架构分层，以及领域中聚合、实体、值对象的使用。
使用爬虫获取网页提问并自动回复，用于从网页上获取用户的提问。然后，将这些提问通过任务扫描的方式采集到系统，再转发到 ChatGPT，并将 ChatGPT 给出的答案自动回复给用户。同时对任务扫描的组件进行了扩展，可以支持配置，自动创建出不同的任务类型来扫描所需的数据信息。
此项目使用Git维护分支版本，这样可以更好地组织各个功能模块的迭代，并使不同功能的开发过程更加独立和可控。我也掌握到了很多 Git 的操作实践能力，并且可以结合各类仓库使用。为后续与其他多人开发打下了良好的基础。
最后使用 Docker 打包部署项目并进行部署。通过对 Docker 的使用，熟练的掌握了容器化环境的配置以及项目的部署和维护。


## 项目名称

项目名称：ChatGPT AI 服务化问答中心

## 项目架构

系统架构：DDD 领域驱动设计，构建问答模型

## 核心技术

核心技术：SpringBoot、MyBatis、MySQL、XXL_JOB、Docker

## 项目描述

项目描述：此项目用于通过ChatGPT的能力，解决日常研发学习过程中的通用共性类问题信息处理，并根据所积累的提问进行资料汇总。此项目对接了知识星球提供问答服务，也提供了对接公众号和企业微信的接口，可以按需扩展。
ChatGPT是由OpenAI训练的大型语言模型，可以生成文本、解释代码、回答问题等
现在将ChatGPT接入到知识星球，通过爬虫接口回答用户提问，可以实现自动回复，提高回答效率。

## 核心职责

1. 负责项目的整体架构设计，包括选择适合的框架和技术，设计领域模型和服务，保证系统具有高可用性、可扩展性和易维护性。
2. 针对项目中出现的技术问题进行分析和解决，如接口爬虫时遇到的反爬机制、AI接口调用时的异常处理等，同时需要根据用户反馈及时修复bug和改进系统功能。
3. 熟悉SpringBoot框架、DDD架构设计思想、Github仓库管理工具、定时任务调度工具等，掌握Docker容器部署和镜像打包的技术，能够灵活运用不同的技术手段解决实际问题

# 课程目录

## 项目介绍

《ChatGPT AI 问答助手》涵盖爬虫接口、ChatGPT API对接、DDD架构设计、镜像打包、Docker容器部署，这个项目是为知识星球开发的一个智能问答回复系统，
用于解决一些常见的技术问题，提高回答效率。 有了这样一个智能AI问答助手，可以大大的减少很多对于这些通用类技术问题的回复


视频课程：https://www.bilibili.com/video/BV1YT411o7Hb


| 目录 - `点击章节进入到学习视频`                              | Github                                                       | Gitcode                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| [开篇介绍，学习引导](https://www.bilibili.com/video/BV1YT411o7Hb) |                                                              |                                                              |
| [第1节：SpringBoot DDD 工程创建和 Github/Gitcode 仓库使用](https://www.bilibili.com/video/BV1RR4y1b7UQ) | [【23_xfg_init_project】](https://github.com/fuzhengwei/chatbot-api/tree/23_xfg_init_project) | [【23_xfg_init_project】](https://gitcode.net/fuzhengwei/chatbot-api/-/tree/23_xfg_init_project) |
| [第2节：创建知识星球，爬取接口信息](https://www.bilibili.com/video/BV1L341197x1) | [【23_xfg_zsxq_api】](https://github.com/fuzhengwei/chatbot-api/tree/23_xfg_zsxq_api) | [【23_xfg_zsxq_api】](https://gitcode.net/fuzhengwei/chatbot-api/-/tree/23_xfg_zsxq_api) |
| [第3节：知识星球接口领域服务开发](https://www.bilibili.com/video/BV1Wv4y1671x) | [【23_xfg_zsxq_domain】](https://github.com/fuzhengwei/chatbot-api/tree/23_xfg_zsxq_domain) | [【23_xfg_zsxq_domain】](https://gitcode.net/fuzhengwei/chatbot-api/-/tree/23_xfg_zsxq_domain) |
| [第4节：对接ChatGPT，调用接口](https://www.bilibili.com/video/BV1KT411Z7z3) | [【23_xfg_chatgpt】](https://github.com/fuzhengwei/chatbot-api/tree/23_xfg_chatgpt) | [【23_xfg_chatgpt】](https://gitcode.net/fuzhengwei/chatbot-api/-/tree/23_xfg_chatgpt) |
| [第5节：整合知识星球与ChatGPT，完成自动化回答](https://www.bilibili.com/video/BV1Ny4y1R7EK) | [【23_xfg_job】](https://github.com/fuzhengwei/chatbot-api/tree/23_xfg_job) | [【23_xfg_job】](https://gitcode.net/fuzhengwei/chatbot-api/-/tree/23_xfg_job) |
| [第6节：打包镜像文件，部署服务到 Docker 容器](https://www.bilibili.com/video/BV1gT411C7nn) | [【23_xfg_docker】](https://github.com/fuzhengwei/chatbot-api/tree/23_xfg_docker) | [【23_xfg_docker】](https://gitcode.net/fuzhengwei/chatbot-api/-/tree/23_xfg_docker) |
| [【扩展】第7节：多组任务服务配置](https://www.bilibili.com/video/BV1XR4y1h7JP) | [【230127-xfg-task】](https://github.com/fuzhengwei/chatbot-api/tree/230127-xfg-task) | [【230127-xfg-task】](https://gitcode.net/fuzhengwei/chatbot-api/-/tree/230127-xfg-task) |

































