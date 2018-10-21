final - Słowo kluczowe. Tworzy zmienną finalną.

finally{} - Blok. Stosowany przy wyjątkach blok instrukcji, który wykona się niezależnie, czy wyjątki wystąpią, czy nie.

            /*
            try{
	              kod programu mogący generować wyjątki
                }
            catch (TypWyjątku1 a){ Obsługa wyjątku a }
            catch (TypWyjątku2 b){ Obsługa wyjątku b }
            //...
            finally{ Blok instrukcji, który wykona się niezależnie, czy wyjątki wystąpią, czy nie }
            */
            
finalize() - Metoda. Przestarzała od JDK 9. Określa działania, które zostaną wykonane tuż przed usunięciem obiektu.

            /*
            protected void finalize(){
            //kod finalizacji...
            }
            */
