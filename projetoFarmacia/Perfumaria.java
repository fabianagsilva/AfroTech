package projetoFarmacia;

	public class Perfumaria extends Farmacia {

		public String Creme;
		protected float Ml;

		public Perfumaria(int Medicamento, String Creme, float Ml) {
			super(Medicamento);
			this.Creme = Creme;
			this.Ml = Ml;

		}

		public String getCreme() {
			return Creme;
		}

		public void setCreme(String creme) {
			Creme = creme;
		}

		public float getMl() {
			return Ml;
		}

		public void setMl(float ml, float Ml) {
			Ml = Ml;

		}

		@Override
		public void visualizar() {
			System.out.println("Digite o Creme " + this.Creme);
			System.out.println("Digite o Mls " + this.Ml);

		}
	}