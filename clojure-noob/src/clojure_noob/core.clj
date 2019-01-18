(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little teapot"))

(defn addthese
  [arg1 arg2]
  (println (+ arg1 arg2)))

(defn add-list
  [[ar1 & tail]]
  (if (nil? tail)
    ar1
    (+ ar1 (add-list tail))))

(defn solve-one
  [string]
  (split-lines string)
