(defproject day-of-datomic "1.0.0-SNAPSHOT"
  :description "Sample Code for Day of Datomic Presentation"
  :plugins [[lein-tg "0.0.1"]
            [lein-swank "1.4.4"]]
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [lein-tg "0.0.1"]
                 [org.clojure/test.generative "0.1.9"]
                 [com.datomic/datomic-free "0.8.3538"]
                 [incanter/incanter-charts "1.3.0"]
                 [incanter/incanter-pdf "1.3.0"]])
