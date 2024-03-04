package com.mycompany.tareano3;

    class Nodo{
        
        int dato;
        Nodo izquierdo, derecho;
        
        public Nodo(int valor){
            
            dato = valor;
            izquierdo = derecho = null;   
        }
    }
    
    class TareaNo3{
        
        Nodo raiz;
        
        public TareaNo3(){
            raiz = null;
        }
        
        public void insertar (int valor){
            
            raiz = insertarRec(raiz,valor);
        }
        
        private Nodo insertarRec(Nodo raiz, int valor){
            
            if(raiz == null){
                raiz = new Nodo(valor);
                return raiz;
            }
            
            if(valor < raiz.dato){
                raiz.izquierdo  = insertarRec(raiz.izquierdo, valor);
            }else if(valor > raiz.dato){
                raiz.derecho = insertarRec(raiz.derecho,valor);
            }
            return raiz;
        }
        public void inOrden(){
            
            inOrdenRec(raiz);
        }
        private void inOrdenRec(Nodo nodo){
            if(nodo != null){
                inOrdenRec(nodo.izquierdo);
                System.out.println(nodo.dato + "");
                inOrdenRec(nodo.derecho);
            }
        }
        public void postOrden(){
            
            postOrdenRec(raiz);
        }
        
        private void postOrdenRec(Nodo nodo){
            
            if(nodo != null){
                
                postOrdenRec(nodo.izquierdo);
                postOrdenRec(nodo.derecho);
                System.out.println(nodo.dato + "");
            }
        }
        public void preOrden(){
            
            preOrdenRec(raiz);
            
        }
        public void preOrdenRec(Nodo nodo){
            
            if(nodo != null){
                System.out.println(nodo.dato + "");
                preOrdenRec(nodo.izquierdo);
                preOrdenRec(nodo.derecho);
                
            }
        }

    public static void main(String[] args) {
        
        TareaNo3 arbol = new TareaNo3();
        
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);
        
        System.out.println("InOrden: ");
        arbol.inOrden();
        
        System.out.println("\nPostOrden: ");
        arbol.postOrden();
        
        System.out.println("\nPreOrden: ");
        arbol.preOrden();
    }
   }
    



    
