(ns lesson6)

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

(def f1 
	(future 
		(foo 3)
	)
)
(def p1 (promise)) ;obietnica - obiekt

(def f2 
	(future
		(println "Próbuje odczytać")
		(println @p1) ;przekazanie referencji
		(println "f2 koniec")
	)
)
(deliver p1 3) ;przekazuje do "obietnicy" wartość 3  
