(ns lesson5)

(defn pow [x y] 
	(str "Wynik: " 
		(long 
			(Math/pow x y)
		)
	)
)
(defn foo [x]
	(.. System out 
		(println "foo... ")
	)
	(Thread/sleep 1000)
	(.. System out 
		(println "done... ")
	)
	(+ x 2)
)

(def x1 
	(delay 
		(foo 5)
	)
)

;user=> x1
;#object[clojure.lang.Delay 0xbc5e946 
;{:status :pending, :val nil}]

;user=> @x1
;foo... 
;done... 
;7

;user=> x1
;#object[clojure.lang.Delay 0xbc5e946 
;{:status :ready, :val 7}]







