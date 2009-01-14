@Test void concreteClassCoercion() {
    def rhyme = [ getLyrics : { -> "London Bridge is coming down."}] as NurseryRhyme
    assert rhyme.sing() == "London Bridge is coming down."
}