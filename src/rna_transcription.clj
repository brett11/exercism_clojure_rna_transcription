(ns rna-transcription)

(defn find-complement [x]
  (case (str x)
    "C" "G"
    "G" "C"
    "A" "U"
    "T" "A"
    (throw (AssertionError. "Wrong input.")))
  )

(defn to-rna [list]
  (let [complement-coll (map find-complement (seq list))]
    (apply str complement-coll))
  )

(println (to-rna "CGAT"))
