
(fn
  "expects a list of values and returns the second to last in the list"
  [[var & input]]
   (if (nil? (second input)) var (recur input)))
