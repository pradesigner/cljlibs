(ns cljlibs.core
  (:require [clojure.string :as str]))

(defn -main [& args]
  (println "Hello, World!" (str/join " " args)))
