/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impostos.produto;

/**
 *
 * @author ra21605248
 */
//Herda as caracteristícas de Produto
public class BemDuravel extends Produto{
    private int durabilidadeMinima;

    public int getDurabilidadeMinima() {
        return durabilidadeMinima;
    }

    public void setDurabilidadeMinima(int durabilidadeMinima) {
        this.durabilidadeMinima = durabilidadeMinima;
    }
    
    
}
