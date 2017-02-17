/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impostos.imposto;

import impostos.produto.BemDuravel;
import impostos.produto.Produto;
import impostos.produto.Servico;

/**
 *
 * @author ra21605248
 */
public class ImpostoIPI extends Imposto{

    public ImpostoIPI(String n) {
        super(n);
    }

    @Override
    public float calcularValor(Produto p) {
       if(p instanceof BemDuravel){
			return p.getPreco() * 0.11F;
		}
		return 0;
    }
    
}
