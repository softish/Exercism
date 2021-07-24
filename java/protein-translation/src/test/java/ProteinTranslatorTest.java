import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProteinTranslatorTest {

    private ProteinTranslator proteinTranslator;

    @Before
    public void setUp() {
        proteinTranslator = new ProteinTranslator();
    }

    @Test
    public void testMethionineRnaSequence() {
        List<String> expected = Arrays.asList("Methionine");
        assertEquals(expected, proteinTranslator.translate("AUG"));
    }

    @Test
    public void testPhenylalanineRnaSequence1() {
        List<String> expected = Arrays.asList("Phenylalanine");
        assertEquals(expected, proteinTranslator.translate("UUU"));
    }

    @Test
    public void testPhenylalanineRnaSequence2() {
        List<String> expected = Arrays.asList("Phenylalanine");
        assertEquals(expected, proteinTranslator.translate("UUC"));
    }

    @Test
    public void testLeucineRnaSequence1() {
        List<String> expected = Arrays.asList("Leucine");
        assertEquals(expected, proteinTranslator.translate("UUA"));
    }

    @Test
    public void testLeucineRnaSequence2() {
        List<String> expected = Arrays.asList("Leucine");
        assertEquals(expected, proteinTranslator.translate("UUG"));
    }

    @Test
    public void testLeucineRnaSequence3() {
        List<String> expected = Arrays.asList("Leucine");
        assertEquals(expected, proteinTranslator.translate("CUU"));
    }

    @Test
    public void testLeucineRnaSequence4() {
        List<String> expected = Arrays.asList("Leucine");
        assertEquals(expected, proteinTranslator.translate("CUC"));
    }

    @Test
    public void testLeucineRnaSequence5() {
        List<String> expected = Arrays.asList("Leucine");
        assertEquals(expected, proteinTranslator.translate("CUA"));
    }

    @Test
    public void testLeucineRnaSequence6() {
        List<String> expected = Arrays.asList("Leucine");
        assertEquals(expected, proteinTranslator.translate("CUG"));
    }

    @Test
    public void testValineRnaSequence1() {
        List<String> expected = Arrays.asList("Valine");
        assertEquals(expected, proteinTranslator.translate("GUU"));
    }

    @Test
    public void testValineRnaSequence2() {
        List<String> expected = Arrays.asList("Valine");
        assertEquals(expected, proteinTranslator.translate("GUC"));
    }

    @Test
    public void testValineRnaSequence3() {
        List<String> expected = Arrays.asList("Valine");
        assertEquals(expected, proteinTranslator.translate("GUA"));
    }

    @Test
    public void testValineRnaSequence4() {
        List<String> expected = Arrays.asList("Valine");
        assertEquals(expected, proteinTranslator.translate("GUG"));
    }

    @Test
    public void testSerineRnaSequence1() {
        List<String> expected = Arrays.asList("Serine");
        assertEquals(expected, proteinTranslator.translate("UCU"));
    }

    @Test
    public void testSerineRnaSequence2() {
        List<String> expected = Arrays.asList("Serine");
        assertEquals(expected, proteinTranslator.translate("UCC"));
    }

    @Test
    public void testSerineRnaSequence3() {
        List<String> expected = Arrays.asList("Serine");
        assertEquals(expected, proteinTranslator.translate("UCA"));
    }

    @Test
    public void testSerineRnaSequence4() {
        List<String> expected = Arrays.asList("Serine");
        assertEquals(expected, proteinTranslator.translate("UCG"));
    }

    @Test
    public void testSerineRnaSequence5() {
        List<String> expected = Arrays.asList("Serine");
        assertEquals(expected, proteinTranslator.translate("AGU"));
    }

    @Test
    public void testSerineRnaSequence6() {
        List<String> expected = Arrays.asList("Serine");
        assertEquals(expected, proteinTranslator.translate("AGC"));
    }

    @Test
    public void testProlineRnaSequence1() {
        List<String> expected = Arrays.asList("Proline");
        assertEquals(expected, proteinTranslator.translate("CCU"));
    }

    @Test
    public void testProlineRnaSequence2() {
        List<String> expected = Arrays.asList("Proline");
        assertEquals(expected, proteinTranslator.translate("CCC"));
    }

    @Test
    public void testProlineRnaSequence3() {
        List<String> expected = Arrays.asList("Proline");
        assertEquals(expected, proteinTranslator.translate("CCA"));
    }

    @Test
    public void testProlineRnaSequence4() {
        List<String> expected = Arrays.asList("Proline");
        assertEquals(expected, proteinTranslator.translate("CCG"));
    }

    @Test
    public void testThreonineRnaSequence1() {
        List<String> expected = Arrays.asList("Threonine");
        assertEquals(expected, proteinTranslator.translate("ACU"));
    }

    @Test
    public void testThreonineRnaSequence2() {
        List<String> expected = Arrays.asList("Threonine");
        assertEquals(expected, proteinTranslator.translate("ACC"));
    }

    @Test
    public void testThreonineRnaSequence3() {
        List<String> expected = Arrays.asList("Threonine");
        assertEquals(expected, proteinTranslator.translate("ACA"));
    }

    @Test
    public void testThreonineRnaSequence4() {
        List<String> expected = Arrays.asList("Threonine");
        assertEquals(expected, proteinTranslator.translate("ACG"));
    }

    @Test
    public void testHistidineRnaSequence1() {
        List<String> expected = Arrays.asList("Histidine");
        assertEquals(expected, proteinTranslator.translate("CAU"));
    }

    @Test
    public void testHistidineRnaSequence2() {
        List<String> expected = Arrays.asList("Histidine");
        assertEquals(expected, proteinTranslator.translate("CAC"));
    }

    @Test
    public void testGlutamineRnaSequence1() {
        List<String> expected = Arrays.asList("Glutamine");
        assertEquals(expected, proteinTranslator.translate("CAA"));
    }

    @Test
    public void testGlutamineRnaSequence2() {
        List<String> expected = Arrays.asList("Glutamine");
        assertEquals(expected, proteinTranslator.translate("CAG"));
    }

    @Test
    public void testAsparagineRnaSequence1() {
        List<String> expected = Arrays.asList("Asparagine");
        assertEquals(expected, proteinTranslator.translate("AAU"));
    }

    @Test
    public void testAsparagineRnaSequence2() {
        List<String> expected = Arrays.asList("Asparagine");
        assertEquals(expected, proteinTranslator.translate("AAC"));
    }

    @Test
    public void testLysineRnaSequence1() {
        List<String> expected = Arrays.asList("Lysine");
        assertEquals(expected, proteinTranslator.translate("AAA"));
    }

    @Test
    public void testLysineRnaSequence2() {
        List<String> expected = Arrays.asList("Lysine");
        assertEquals(expected, proteinTranslator.translate("AAG"));
    }

    @Test
    public void testAsparticAcidRnaSequence1() {
        List<String> expected = Arrays.asList("Aspartic Acid");
        assertEquals(expected, proteinTranslator.translate("GAU"));
    }

    @Test
    public void testAsparticAcidRnaSequence2() {
        List<String> expected = Arrays.asList("Aspartic Acid");
        assertEquals(expected, proteinTranslator.translate("GAC"));
    }

    @Test
    public void testGlutamicAcidRnaSequence1() {
        List<String> expected = Arrays.asList("Glutamic Acid");
        assertEquals(expected, proteinTranslator.translate("GAA"));
    }

    @Test
    public void testGlutamicAcidRnaSequence2() {
        List<String> expected = Arrays.asList("Glutamic Acid");
        assertEquals(expected, proteinTranslator.translate("GAG"));
    }

    @Test
    public void testTyrosineRnaSequence1() {
        List<String> expected = Arrays.asList("Tyrosine");
        assertEquals(expected, proteinTranslator.translate("UAU"));
    }

    @Test
    public void testTyrosineRnaSequence2() {
        List<String> expected = Arrays.asList("Tyrosine");
        assertEquals(expected, proteinTranslator.translate("UAC"));
    }

    @Test
    public void testCysteineRnaSequence1() {
        List<String> expected = Arrays.asList("Cysteine");
        assertEquals(expected, proteinTranslator.translate("UGU"));
    }

    @Test
    public void testCysteineRnaSequence2() {
        List<String> expected = Arrays.asList("Cysteine");
        assertEquals(expected, proteinTranslator.translate("UGC"));
    }

    @Test
    public void testTryptophanRnaSequence1() {
        List<String> expected = Arrays.asList("Tryptophan");
        assertEquals(expected, proteinTranslator.translate("UGG"));
    }

    @Test
    public void testArginineRnaSequence1() {
        List<String> expected = Arrays.asList("Arginine");
        assertEquals(expected, proteinTranslator.translate("CGU"));
    }

    @Test
    public void testArginineRnaSequence2() {
        List<String> expected = Arrays.asList("Arginine");
        assertEquals(expected, proteinTranslator.translate("CGC"));
    }

    @Test
    public void testArginineRnaSequence3() {
        List<String> expected = Arrays.asList("Arginine");
        assertEquals(expected, proteinTranslator.translate("CGA"));
    }

    @Test
    public void testArginineRnaSequence4() {
        List<String> expected = Arrays.asList("Arginine");
        assertEquals(expected, proteinTranslator.translate("CGG"));
    }

    @Test
    public void testArginineRnaSequence5() {
        List<String> expected = Arrays.asList("Arginine");
        assertEquals(expected, proteinTranslator.translate("AGA"));
    }

    @Test
    public void testArginineRnaSequence6() {
        List<String> expected = Arrays.asList("Arginine");
        assertEquals(expected, proteinTranslator.translate("AGG"));
    }

    @Test
    public void testGlycineRnaSequence1() {
        List<String> expected = Arrays.asList("Glycine");
        assertEquals(expected, proteinTranslator.translate("GGU"));
    }

    @Test
    public void testGlycineRnaSequence2() {
        List<String> expected = Arrays.asList("Glycine");
        assertEquals(expected, proteinTranslator.translate("GGC"));
    }

    @Test
    public void testGlycineRnaSequence3() {
        List<String> expected = Arrays.asList("Glycine");
        assertEquals(expected, proteinTranslator.translate("GGA"));
    }

    @Test
    public void testGlycineRnaSequence4() {
        List<String> expected = Arrays.asList("Glycine");
        assertEquals(expected, proteinTranslator.translate("GGG"));
    }

    @Test
    public void testIsoleucineRnaSequence1() {
        List<String> expected = Arrays.asList("Isoleucine");
        assertEquals(expected, proteinTranslator.translate("AUU"));
    }

    @Test
    public void testIsoleucineRnaSequence2() {
        List<String> expected = Arrays.asList("Isoleucine");
        assertEquals(expected, proteinTranslator.translate("AUC"));
    }

    @Test
    public void testIsoleucineRnaSequence3() {
        List<String> expected = Arrays.asList("Isoleucine");
        assertEquals(expected, proteinTranslator.translate("AUA"));
    }

    @Test
    public void testStopRnaSequence1() {
        List<String> expected = Arrays.asList();
        assertEquals(expected, proteinTranslator.translate("UAA"));
    }

    @Test
    public void testStopRnaSequence2() {
        List<String> expected = Arrays.asList();
        assertEquals(expected, proteinTranslator.translate("UAG"));
    }

    @Test
    public void testStopRnaSequence3() {
        List<String> expected = Arrays.asList();
        assertEquals(expected, proteinTranslator.translate("UGA"));
    }

    @Test
    public void testTranslationOfRnaToProteinList() {
        List<String> expected = Arrays.asList("Methionine", "Phenylalanine", "Tryptophan");

        assertEquals(expected, proteinTranslator.translate("AUGUUUUGG"));
    }

    @Test
    public void testTranslationStopsIfStopCodonAtBeginning() {
        List<String> expected = Arrays.asList();
        assertEquals(expected, proteinTranslator.translate("UAGUGG"));
    }

    @Test
    public void testTranslationStopsIfStopCodonAtEnd1() {
        List<String> expected = Arrays.asList("Tryptophan");
        assertEquals(expected, proteinTranslator.translate("UGGUAG"));
    }

    @Test
    public void testTranslationStopsIfStopCodonAtEnd2() {
        List<String> expected = Arrays.asList("Methionine", "Phenylalanine");
        assertEquals(expected, proteinTranslator.translate("AUGUUUUAA"));
    }

    @Test
    public void testTranslationStopsIfStopCodonInMiddle1() {
        List<String> expected = Arrays.asList("Tryptophan");
        assertEquals(expected, proteinTranslator.translate("UGGUAGUGG"));
    }

    @Test
    public void testTranslationStopsIfStopCodonInMiddle2() {
        List<String> expected = Arrays.asList("Tryptophan", "Cysteine", "Tyrosine");
        assertEquals(expected, proteinTranslator.translate("UGGUGUUAUUAAUGGUUU"));
    }

}
