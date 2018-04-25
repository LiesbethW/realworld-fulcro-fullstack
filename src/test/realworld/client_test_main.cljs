(ns realworld.client-test-main
  (:require realworld.tests-to-run
            [fulcro-spec.selectors :as sel]
            [fulcro-spec.suite :as suite]))

(enable-console-print!)

(suite/def-test-suite client-tests {:ns-regex #"realworld..*-spec"}
  {:default   #{::sel/none :focused}
   :available #{:focused}})

