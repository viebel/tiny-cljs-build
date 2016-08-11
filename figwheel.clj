(require '[figwheel-sidecar.repl :as r]
         '[figwheel-sidecar.repl-api :as ra])

(ra/start-figwheel!
  {:figwheel-options {
                      :open-file-command "emacsclient"
                      :server-port 5014}
   :build-ids ["figwheel"]
   :all-builds
   [{:id "figwheel"
     :figwheel true
     :source-paths ["src"]
     :compiler {:main 'tiny-cljs-build.core
                :asset-path "fig/js"
                :output-to "resources/public/fig/js/main.js"
                :output-dir "resources/public/fig/js"
                :source-map-timestamp true }}
    ]})

(ra/cljs-repl)
