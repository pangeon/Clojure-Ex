(ns lesson2)

(def x 5)
; 5
(def l1 
    (list 'raz 'dwa 'trzy)
)
; (raz dwa trzy)
(def l2 
    (list 1 2 3)
)
; (1 2 3)
(def l3 
    (list 
        (fn [5] 
            (* 2 x)
        )
    )
)
; (#object[user$fn__2812 0x574d405d "user$fn__2812@574d405d"])
(def zakupy
  '(
    (warzywniak (marchewka pietruszka))
    (spożywczy  (mleko herbata bułki))
   )
)
(defn incr [a]
    (+ a 1)
)
(defn +_ [a b c]
  (str a b c)
)
; (+_ 'raz 2 x)
; "raz25" 


