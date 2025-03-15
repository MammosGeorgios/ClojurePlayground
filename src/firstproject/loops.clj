(ns firstproject.loops)

(defn firstLoop [x]
  (println x "Count of loops")

  (def index (atom 0))
  (while (< @index x)
    (do
      (println @index)
      (swap! index inc))))


(firstLoop 5)