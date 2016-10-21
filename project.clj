(defproject thinktopic/think.image "0.4.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [net.mikera/core.matrix "0.56.0"]
                 [net.mikera/imagez "0.11.0"]
                 [net.mikera/vectorz-clj "0.45.0"]]
  :java-source-paths ["java"]
  :profiles { :uberjar { :aot :all }
             :dev {:source-paths ["test/shared"
                                  "test/clj"] }
             :test {:source-paths ["test/shared"
                                   "test/clj"] }})