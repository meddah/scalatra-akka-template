package com.earldouglas.scalatraakkatemplate

import akka.actor._
import akka.routing.Routing._
import akka.routing.CyclicIterator
import org.scalatra._
 
class ScalatraAkkaTemplate extends ScalatraServlet with UrlSupport {

  before {
    contentType = "text/html"
  }

  get("/") {
    <html>
      <head>
        <title></title>
      </head>
      <body>
        <h1>Scalatra Akka Template</h1>
      </body>
    </html>
  }

  protected def contextPath = request.getContextPath
}
