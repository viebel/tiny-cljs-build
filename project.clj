(defproject tiny-cljs-build "0.0.1"
  :description "Tiny cljs build for testing purpose"
  :dependencies [[org.clojure/clojure "1.9.0-alpha10"]
                 [org.clojure/clojurescript "1.9.183"]
                 [org.omcljs/om "1.0.0-alpha36"]]
  :profiles {:dev {:dependencies [[figwheel-sidecar "0.5.4-7"]] }}  
  :jvm-opts ["-Xms356M" "-Xmx1G"]
  :plugins [[lein-cljsbuild "1.1.1"]]
  :source-paths ["src"]
  :cljsbuild {
              :builds {
                      :dev {
                               :source-paths ["src/tiny_cljs_build/"]
                               :compiler {
                                          :output-to "resources/public/dev/js/main.js"
                                          :output-dir "resources/public/dev/js"
                                          :pretty-print false
                                          :optimize-constants true
                                          :static-fns true
                                          ;:elide-asserts true
                                          :optimizations :whitespace
                                          :verbose false}}
                       
                       
                       
                       }})
