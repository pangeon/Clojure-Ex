;(ns lesson) jest opcjonalne - wystarczy wczytać plik do REPL-a (load file "<nazwa_pliku>")

(def zakupy
  '((warzywniak (marchewka pietruszka))
    (spożywczy  (mleko herbata bułki))))

(defn li [produkty]
  (str (apply str "<li>" (interpose "</li>\n<li>" produkty)) "</li>\n</ul>\n"))

(defn ul [formator-produktu zakup]
  (str "<ul>" (first zakup) "\n"
       (apply str (map formator-produktu (rest zakup)))))

(defn drukuj-liste
  [dane formator-zakupu formator-produktu]
  (print (apply str (map (partial formator-zakupu formator-produktu) dane))))

(drukuj-liste zakupy ul li)

