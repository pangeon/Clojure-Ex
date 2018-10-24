(ns lesson1)

(def x (div (mult (mins (sum 6 7) 3) 2) 8))

(defn sump [x y] (println (+ x y)))
(defn sum [x y] (+ x y)) ; aby zwrócić wartość nie piszemy return
(defn minp [x y] (println (- x y)))
(defn mins [x y] (- x y))
(defn multp [x y] (println (* x y)))
(defn mult [x y] (* x y))
(defn divp [x y] (println (/ x y)))
(defn div [x y] (/ x y))
;(defn mod [x y] (println (% x y))) modulo wygląda inaczej !
(defn modp [x y] (println (mod x y)))
(defn mods [x y] (mod x y))


;funkcje sump, minp, multp, divp zwracają nil
;nie można ich użyć do tworzenia zagnieżdżonych wywołań
  
