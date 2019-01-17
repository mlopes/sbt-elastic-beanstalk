package com.ovoenergy.sbt.ebs

case class PortMapping(hostPort: Int,
                       containerPort: Int,
                       protocol: String = "tcp")
