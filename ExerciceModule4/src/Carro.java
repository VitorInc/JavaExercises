public class Carro {

    /*
     Peças Pneu
     */
    private Integer quantidadeDePneu;
    private Integer quantiadeDeCalotas;
    private Integer quantidadeDeParafuso;
    /*
    Peças portas
     */
    private Integer quantidadeDePortas;
    private Integer Macanetas;
    private Integer Vidros;
    private Integer Travas;
    /*
    Peças Motor
         */
    private Integer Motor;
    private Integer velasDeIgnição;
    private Integer FiltroDeOleo;
    private Integer Pistao;
    private Integer CaixaDeCambio;
    private Integer Suspensao;
    private Integer Cilindro;
        /*
    Atividade Info
    */

    private Integer AnoFabricacao;
    private Integer Chassi;
    private String Combustivel;
    private String Cor;
        /*

    */


    public Carro(Integer quantidadeDePneus, Integer quantidadeDePortas,Integer Motor, String Combustivel,
                 String Cor, Integer AnoFabricacao, Integer chassi ){
        setQuantidadeDePneu(quantidadeDePneus);
        setQuantidadeDePortas(quantidadeDePortas);
        setMotor(Motor);
        setCor(Cor);
        setCombustivel(Combustivel);
        setAnoFabricacao(AnoFabricacao);
        setChassi(chassi);
    }
    /*
     Peças portas
     */
    public Integer getQuantidadeDePortas(){
        return quantidadeDePortas;
    }
    public void setQuantidadeDePortas(Integer quantidadeDePortas){
        Travas = quantidadeDePortas;
        Vidros = quantidadeDePortas;
        Macanetas = quantidadeDePortas;
        this.quantidadeDePortas = quantidadeDePortas;
    }



    public Integer getMacanetas() {
        return Macanetas;
    }

    public void setMacanetas(Integer macanetas) {
        Macanetas = macanetas;
    }

    public Integer getVidros() {
        return Vidros;
    }

    public void setVidros(Integer vidros) {
        Vidros = vidros;
    }

    public Integer getTravas() {
        return Travas;
    }

    public void setTravas(Integer travas) {
        Travas = travas;
    }
    /*     Peças Pneu
     */

    public Integer getQuantidadeDePneu(){
        return quantidadeDePneu + 1;
    }

   public void setQuantidadeDePneu(Integer quantidadeDePneu){
        quantiadeDeCalotas = quantidadeDePneu;
        quantidadeDeParafuso = quantidadeDePneu * 8;
        this.quantidadeDePneu = quantidadeDePneu;
   }




    public Integer getQuantiadeDeCalotas() {
        return quantiadeDeCalotas;
    }

    public void setQuantiadeDeCalotas(Integer quantiadeDeCalotas) {
        quantiadeDeCalotas = quantiadeDeCalotas;
    }

    public Integer getQuantidadeDeParafuso() {
        return quantidadeDeParafuso;
    }

    public void setQuantidadeDeParafuso(Integer quantidadeDeParafuso) {
        quantidadeDeParafuso = quantidadeDeParafuso;
    }
    /*
    Atividade Info
    */

    public Integer getAnoFabricacao() {
        return AnoFabricacao;
    }

    public void setAnoFabricacao( Integer AnoFabricacao) {
        this.AnoFabricacao = AnoFabricacao;
    }
    public Integer getChassi() {
        return Chassi;
    }

    public void setChassi( Integer Chassi) {
        this.Chassi = Chassi;
    }
    public String getCombustivel() {
        return Combustivel;
    }

    public void setCombustivel(String Combustivel) {
        this.Combustivel = Combustivel;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }


    /*
     Peças Motor
     */
    public Integer getMotor(){
        return Motor;
    }


    public void setMotor(Integer Motor){
        Pistao = Motor * 4;
        CaixaDeCambio = Motor;
        Suspensao = Motor;
        FiltroDeOleo = Motor;
        Cilindro = Motor * 4 ;
        velasDeIgnição = Motor * 4;
        this.Motor = Motor;
    }
    public Integer getVelasDeIgnição(){
        return velasDeIgnição;
    }
    public void setVelasDeIgnição( Integer velasDeIgnição){
       velasDeIgnição = velasDeIgnição;
    }
    public Integer getFiltroDeOleo(){
        return FiltroDeOleo;
    }
    public void setFiltroDeOleo(Integer FiltroDeOleo) {
        FiltroDeOleo = FiltroDeOleo;
    }
    public Integer getSuspensao(){
        return Suspensao;
    }
    public void setSuspensao(Integer Suspensao){
        Suspensao = Suspensao;
    }
    public Integer getCaixaDeCambio(){
        return CaixaDeCambio;
    }
    public void setCaixaDeCambio(Integer CaixaDeCambio){
        CaixaDeCambio = CaixaDeCambio;
    }
    public Integer getPistao(){
        return Pistao;
    }
    public void setPistao(Integer Pistao){
        Pistao = Pistao;
    }
    public Integer getCilindro(){
        return Cilindro;
    }
    public void setCilindro(Integer Cilindro){
        Cilindro = Cilindro;
    }

    public void imprimeValores(){
        System.out.println("Quantidade de Pneus : " + getQuantidadeDePneu());
        System.out.println("Quantidade de calotas : " + getQuantiadeDeCalotas());
        System.out.println("Quantidade de parafuso  : " + getQuantidadeDeParafuso());
        System.out.println("Quantidade de porta  : " + getQuantidadeDePortas());
        System.out.println("Quantidade de travas  : " + getTravas());
        System.out.println("Quantidade de vidros  : " + getVidros());
        System.out.println("Quantidade de Maçanetas  : " + getMacanetas());
        System.out.println("Quantidade de Motor:" + getMotor());
        System.out.println("Quantidade de Vela de Ignição:" + getVelasDeIgnição());
        System.out.println("Quantidade de Filtro de óleo:" + getFiltroDeOleo());
        System.out.println("Quantidade de Suspençõs :" + getSuspensao());
        System.out.println("Quantidade de Caixas de câmbio :" + getCaixaDeCambio());
        System.out.println("Quantidade de Cilindros :" + getCilindro());
        System.out.println("Ano de fabricação"+ getAnoFabricacao());
        System.out.println("Chassi :" + getChassi());
        System.out.println("Combustivel :" + getCombustivel());
        System.out.println("Cor :" + getCor());}
}
