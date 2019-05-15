;;"Expects a list of values and returns the second to last in the list"
(fn
  [[var & input]]
   (if (nil? (second input)) var (recur input)))


;;"Returns true iff the map contains an entry with that key and its value is nil.
;; Defaults to false if not key not contianed in the map"
(fn
  [given-key map-item]
  (contains? (nil? (given-key map-item false))))


;;"Write a function which returns the Nth element from a sequence."
(fn
  [given-list given-integer]
  (if (= 0 given-integer)
      (first given-list)
      (recur (rest given-list) (dec given-integer))))


;;"write a sequence that returns the number of elelments in the sequence"
(fn
  [given-list x]
  (if (nil? given-list)
    x
    (let [x (inc x)])))

(fn
  [given-list]
  (let [x 0]
    (inc x)
    (if (nil? given-list)
      x
      (recur (rest given-list)))))


;;Reverse a Sequence
(fn [nums]
  (loop [i '()
         nums nums]
    (if (empty? nums)
      i
   	  (recur (conj i (first nums)) (rest nums)))))


;;Fibonacci Sequence
(defn fib [i]
  (loop [a 0
         b 1
         xs []]
     (if (= (count xs) i)
       xs
       (recur
        b
        (+ a b)
        (conj xs b)))))


;;Palindrome Detector
(fn [xs]
 (loop [xs xs]
   (if (< (count xs) 2)
    true
    (if (= (first xs) (last xs))
      (recur (rest (pop xs)))
      false))))
