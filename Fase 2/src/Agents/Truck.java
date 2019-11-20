package Agents;

public class Truck extends Fighter {

    protected void setup() {
		super.setup();

		this.setSpeed(5);
		this.setWaterCapacity(10);
		this.setFuelCapacity(15);
		this.setCurrentFuel(this.getFuelCapacity());
		this.setCurrentWater(this.getWaterCapacity());
		
		//exemplo da ficha da loja
		//addBehaviour(new Comprarproduto()); // fazer a compra de um produto
	}
}
