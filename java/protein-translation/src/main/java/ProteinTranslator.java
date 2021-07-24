import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

class ProteinTranslator {

    private final Set<String> rnaStopSequences = Set.of("UAA", "UAG", "UGA");
    // complete set of protines inspired by jbberinger's solution
    private final List<Protein> proteins = List.of(
            new Methionine(),
            new Phenylalanine(),
            new Leucine(),
            new Valine(),
            new Serine(),
            new Proline(),
            new Threonine(),
            new Histidine(),
            new Glutamine(),
            new Asparagine(),
            new Lysine(),
            new AsparticAcid(),
            new GlutamicAcid(),
            new Tyrosine(),
            new Cysteine(),
            new Tryptophan(),
            new Arginine(),
            new Glycine(),
            new Isoleucine()
    );

    List<String> translate(String rnaSequence) {
        var pattern = Pattern.compile("([A-Z]){3}");
        var matcher = pattern.matcher(rnaSequence);
        var polypeptide = new ArrayList<String>();

        while (matcher.find()) {
            String codon = matcher.group();
            if (rnaStopSequences.contains(codon)) {
                break;
            }

            this.proteins.forEach(protein -> protein.getRnaCodons()
                    .stream()
                    .filter(codon::equals)
                    .findFirst()
                    .ifPresent(ignore -> polypeptide.add(protein.getName())));
        }

        return polypeptide;
    }
}

interface Protein {
    default String getName() {
        return this.getClass().getSimpleName();
    }

    List<String> getRnaCodons();
}

class Methionine implements Protein {
    @Override
    public List<String> getRnaCodons() {
        return List.of("AUG");
    }
}

class Phenylalanine implements Protein {
    @Override
    public List<String> getRnaCodons() {
        return List.of("UUU", "UUC");
    }
}

class Leucine implements Protein {
    @Override
    public List<String> getRnaCodons() {
        return List.of("UUA", "UUG", "CUU", "CUC", "CUA", "CUG");
    }
}

class Valine implements Protein {
    @Override
    public List<String> getRnaCodons() {
        return List.of("GUU", "GUC", "GUA", "GUG");
    }
}

class Serine implements Protein {
    @Override
    public List<String> getRnaCodons() {
        return List.of("UCU", "UCC", "UCA", "UCG", "AGU", "AGC");
    }
}

class Proline implements Protein {
    @Override
    public List<String> getRnaCodons() {
        return List.of("CCU", "CCC", "CCA", "CCG");
    }
}

class Threonine implements Protein {
    @Override
    public List<String> getRnaCodons() {
        return List.of("ACU", "ACC", "ACA", "ACG");
    }
}

class Histidine implements Protein {
    @Override
    public List<String> getRnaCodons() {
        return List.of("CAU", "CAC");
    }
}

class Glutamine implements Protein {
    @Override
    public List<String> getRnaCodons() {
        return List.of("CAA", "CAG");
    }
}

class Asparagine implements Protein {
    @Override
    public List<String> getRnaCodons() {
        return List.of("AAU", "AAC");
    }
}

class Lysine implements Protein {
    @Override
    public List<String> getRnaCodons() {
        return List.of("AAA", "AAG");
    }
}

class AsparticAcid implements Protein {
    @Override
    public String getName() {
        return "Aspartic Acid";
    }

    @Override
    public List<String> getRnaCodons() {
        return List.of("GAU", "GAC");
    }
}

class GlutamicAcid implements Protein {
    @Override
    public String getName() {
        return "Glutamic Acid";
    }

    @Override
    public List<String> getRnaCodons() {
        return List.of("GAA", "GAG");
    }
}

class Tyrosine implements Protein {
    @Override
    public List<String> getRnaCodons() {
        return List.of("UAU", "UAC");
    }
}

class Cysteine implements Protein {
    @Override
    public List<String> getRnaCodons() {
        return List.of("UGU", "UGC");
    }
}

class Tryptophan implements Protein {
    @Override
    public List<String> getRnaCodons() {
        return List.of("UGG");
    }
}

class Arginine implements Protein {
    @Override
    public List<String> getRnaCodons() {
        return List.of("CGU", "CGC", "CGA", "CGG", "AGA", "AGG");
    }
}

class Glycine implements Protein {
    @Override
    public List<String> getRnaCodons() {
        return List.of("GGU", "GGC", "GGA", "GGG");
    }
}

class Isoleucine implements Protein {
    @Override
    public List<String> getRnaCodons() {
        return List.of("AUU", "AUC", "AUA");
    }
}
