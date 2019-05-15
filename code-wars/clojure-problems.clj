You have to extract a portion of the file name as follows:

Assume it will start with date represented as long number
Followed by an underscore
Youll have then a filename with an extension
it will always have an extra extension at the end

Inputs:
;1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION
;1_This_is_an_otherExample.mpg.OTHEREXTENSIONadasdassdassds34
;1231231223123131_myFile.tar.gz2

Outputs
;FILE_NAME.EXTENSION
;This_is_an_otherExample.mpg
;myFile.tar

Acceptable characters for random tests:
;abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-0123456789

The recommend way to solve it is using RegEx and specifically groups.


(ns file-name-extractor)

(defn extract-file-name [dirty-file-name]
  "do it"
  (let [split-dirty-file-name (str/split dirty-file-name #"_")]
  )
)


;;street-fighter 2 characters

(ns street-fighter)

(defn figter-location [fighters [x y]]
  (nth (nth fighters y) x))

(defn new-position [[x y] move]
  (cond
    (= move "up")
    (if (zero? y)
      [x y]
      [x (dec y)])
    (= move "down")
    (if (= y 1)
      [x y]
      [x (inc y)])
    (= move "left")
    (if (zero? x)
      [5 y]
      [(dec x) y])
    (= move "right")
    (if (= x 5)
      [0 y]
      [(inc x) y])))

(defn street-fighter-selection [fighters position moves]
    (loop [solution []
           position position
           moves moves]
       (let [next-move (first moves)]
         (if (nil? next-move)
           solution
           (let [position' (new-position position next-move)]
           (recur
              (conj solution (figter-location fighters position'))
              position'
              (rest moves)))))))
