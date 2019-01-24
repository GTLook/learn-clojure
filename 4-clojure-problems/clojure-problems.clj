
(fn
  "Expects a list of values and returns the second to last in the list"
  [[var & input]]
   (if (nil? (second input)) var (recur input)))

(fn
  "Returns true iff the map contains an entry with that key and its value is nil.
   Defaults to false if not key not contianed in the map"
  [given-key map-item]
  (contains? (nil? (given-key map-item false))))

(fn
  "Write a function which returns the Nth element from a sequence."
  [given-list given-integer]
  (if (= 0 given-integer)
      (first given-list)
      (recur (rest given-list) (dec given-integer))))

(fn
  "write a sequence that returns the number of elelments in the sequence"
  [given-list]
  (if (nil? given-list)
    ))
