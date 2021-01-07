public class TestaBanco {
	public static void main(String[] args) {
		Cliente Beatriz = new Cliente();
		Beatriz.setNome("Beatriz Morais");
		Beatriz.setCpf("222.222.222.-22");
		Beatriz.setProfissao("programadora");

		Conta contaDaBeatriz = new Conta();
		contaDaBeatriz.deposita(100);

		contaDaBeatriz.setTitular(Beatriz);
		System.out.println(contaDaBeatriz.getTitular().getNome());
		System.out.println(contaDaBeatriz.getTitular());

	}
}