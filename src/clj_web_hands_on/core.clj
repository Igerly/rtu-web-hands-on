(ns clj-web-hands-on.core
  (:use ring.adapter.jetty)
  (:use clj-web-hands-on.task0))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (greet)})

(run-jetty handler {:port 3000})
