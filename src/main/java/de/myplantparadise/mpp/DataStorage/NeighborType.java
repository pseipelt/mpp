package DataStorage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NeighborType {
    List<String> good_neighbors = new ArrayList();
    List<String> bad_neighbors = new ArrayList();
    String neighbor_type;

    public NeighborType(String nt) {
        this.neighbor_type = nt;
        //switch over all neighbor types
        switch (neighbor_type) {
            case "":
                this.good_neighbors = Arrays.asList("");
                this.bad_neighbors = Arrays.asList("");
                break;
            case "Alant":
                this.good_neighbors = Arrays.asList("Artischocke", "Königskerze");
                this.bad_neighbors = Arrays.asList("");
                break;
            case "Amaranth":
                this.good_neighbors = Arrays.asList("Bohne", "Sellerie");
                this.bad_neighbors = Arrays.asList("");
                break;
            case "Anis":
                this.good_neighbors = Arrays.asList("Erbse", "Koriander");
                this.bad_neighbors = Arrays.asList("");
                break;
            case "Artischocke":
                this.good_neighbors = Arrays.asList("Alant", "Endivie", "Feldsalat", "Fenchel", "Salat", "Radieschen", "Blumenkohl", "Brokkoli", "Chinakohl", "Krauskohl", "Kohlrabi", "Kopfkohl", "Rosenkohl");
                this.bad_neighbors = Arrays.asList("Sellerie" , "Bärlauch", "Knoblauch", "Lauch", "Schnittlauch", "Zwiebel");
                break;
            case "Aubergine":
                this.good_neighbors = Arrays.asList("Bohne", "Endivie", "Feldsalat", "Salat", "Möhre", "Petersilie", "Lauch", "Radieschen", "Raps", "Rübe", "Schnittlauch", "Sellerie", "Spinat" , "Blumenkohl", "Brokkoli", "Chinakohl", "Krauskohl", "Kohlrabi", "Kopfkohl", "Rosenkohl");
                this.bad_neighbors = Arrays.asList("Erbse", "Fenchel", "Gurke", "Kartoffel", "Tomate" , "Paprika");
                break;
            case "Baldrian":
                this.good_neighbors = Arrays.asList("Bohne", "Tomate");
                this.bad_neighbors = Arrays.asList("Feldsalat");
                break;
            case "Basilikum":
                this.good_neighbors = Arrays.asList("Fenchel", "Gurke", "Mangold", "Rosmarin", "Tomate", "Zucchini" , "Blumenkohl", "Brokkoli", "Chinakohl", "Krauskohl", "Kohlrabi", "Kopfkohl", "Rosenkohl");
                this.bad_neighbors = Arrays.asList("Bohnenkraut", "Dill", "Majoran", "Melisse", "Salbei", "Thymian", "Weinraute", "Wermut");
                break;
            case "Bete":
                this.good_neighbors = Arrays.asList("Bohnenkraut", "Bohne", "Dill", "Endivie", "Gurke", "Kichererbse", "Bärlauch", "Knoblauch", "Kohlrabi", "Kopfkohl", "Lein", "Pastinake", "Puffbohne", "Sojabohne", "Zwiebel" , "Paprika");
                this.bad_neighbors = Arrays.asList("Hirse", "Kartoffel", "Mais", "Mangold", "Lauch", "Spinat");
                break;
            case "Blumenkohl":
                this.good_neighbors = Arrays.asList("Artischocke", "Aubergine", "Basilikum", "Bohne", "Eberraute", "Endivie", "Salat", "Mangold", "Minze", "Möhre", "Phacelia", "Radicchio", "Rhabarber", "Ringelblume", "Rosmarin", "Salbei", "Schnittlauch", "Sellerie", "Sonnenblume", "Spinat", "Tagetes", "Tetragonia", "Thymian", "Tomate", "Topinambur");
                this.bad_neighbors = Arrays.asList("Brokkoli", "Chinakohl", "Erdbeere", "Krauskohl", "Kartoffel", "Kopfkohl", "Rettich", "Rosenkohl", "Raps", "Rübe", "Senf", "Zwiebel");
                break;
            case "Bohne":
                this.good_neighbors = Arrays.asList("Amaranth", "Aubergine", "Baldrian", "Bete", "Bohnenkraut", "Chicoree", "Dill", "Erdbeere", "Gurke", "Hafer", "Hirse", "Kamille", "Karde", "Kartoffel", "Mangold", "Melone", "Radicchio", "Rhabarber", "Raps", "Rübe", "Schwarzwurzel", "Sellerie", "Sonnenblume", "Spargel", "Tomate", "Topinambur", "Zucchini", "Mais" , "Blumenkohl", "Brokkoli", "Chinakohl", "Krauskohl", "Kohlrabi", "Kopfkohl", "Rosenkohl" , "Paprika");
                this.bad_neighbors = Arrays.asList("Erbse", "Erdnuss", "Fenchel", "Bärlauch", "Kichererbse", "Knoblauch", "Lein", "Linse", "Lauch", "Puffbohne", "Sojabohne", "Zwiebel");
                break;
            case "Bohnenkraut":
                this.good_neighbors = Arrays.asList("Bohne", "Bete", "Puffbohne", "Salbei", "Sojabohne", "Thymian", "Ysop");
                this.bad_neighbors = Arrays.asList("Basilikum");
                break;
            case "Borretsch":
                this.good_neighbors = Arrays.asList("Erdbeere", "Erdnuss", "Kohlrabi", "Kopfkohl", "Linse", "Radicchio", "Thymian", "Tomate" , "Gurke", "Kürbis", "Melone", "Zucchini");
                this.bad_neighbors = Arrays.asList("Petersilie", "Rukola");
                break;
            case "Brokkoli":
                this.good_neighbors = Arrays.asList("Aubergine", "Artischocke", "Basilikum", "Bohne", "Eberraute", "Endivie", "Kürbis", "Minze", "Phacelia", "Puffbohne", "Radicchio", "Rhabarber", "Ringelblume", "Rosmarin", "Salbei", "Schnittlauch", "Sellerie", "Sonnenblume", "Spinat", "Tagetes", "Thymian", "Topinambur");
                this.bad_neighbors = Arrays.asList("Blumenkohl", "Chinakohl", "Erdbeere", "Krauskohl", "Kopfkohl", "Radieschen", "Rettich", "Rosenkohl", "Raps", "Rübe", "Senf");
                break;
            case "Buchweizen":
                this.good_neighbors = Arrays.asList("Sellerie");
                this.bad_neighbors = Arrays.asList("");
                break;
            case "Chicoree":
                this.good_neighbors = Arrays.asList("Bohne", "Erbse", "Erdnuss", "Fenchel", "Kichererbse", "Salat", "Kümmel", "Linse", "Möhre", "Lauch", "Sojabohne", "Tomate", "Zwiebel");
                this.bad_neighbors = Arrays.asList("Haferwurzel", "Kartoffel");
                break;
            case "Chinakohl":
                this.good_neighbors = Arrays.asList("Artischocke", "Aubergine", "Basilikum", "Bohne", "Eberraute", "Erbse", "Endivie", "Minze", "Phacelia", "Radicchio", "Rhabarber", "Ringelblume", "Rosmarin", "Salbei", "Schnittlauch", "Sellerie", "Sonnenblume", "Spinat", "Tagetes", "Thymian", "Topinambur", "Winterportulak");
                this.bad_neighbors = Arrays.asList("Blumenkohl", "Brokkoli", "Erdbeere", "Krauskohl", "Gurke", "Kohlrabi", "Kopfkohl", "Radieschen", "Rettich", "Raps", "Rübe", "Senf");
                break;
            case "Dill":
                this.good_neighbors = Arrays.asList("Bete", "Bohne", "Erbse", "Erdnuss", "Gurke", "Kamille", "Kartoffel", "Kichererbse", "Kohlrabi", "Kopfkohl", "Salat", "Linse", "Möhre", "Spargel", "Radicchio", "Zucchini", "Zwiebel");
                this.bad_neighbors = Arrays.asList("Basilikum", "Dill", "Estragon", "Fenchel", "Kerbel", "Kresse", "Kümmel", "Kürbis", "Liebstöckel", "Pastinake", "Petersilie", "Sellerie");
                break;
            case "Eberraute":
                this.good_neighbors = Arrays.asList("Wermut" , "Blumenkohl", "Brokkoli", "Chinakohl", "Krauskohl", "Kohlrabi", "Kopfkohl", "Rosenkohl");
                this.bad_neighbors = Arrays.asList("");
                break;
            case "Endivie":
                this.good_neighbors = Arrays.asList("Artischocke", "Aubergine", "Fenchel", "Kerbel", "Möhre", "Tetragonia", "Lauch", "Bete", "Spinat" , "Blumenkohl", "Brokkoli", "Chinakohl", "Krauskohl", "Kohlrabi", "Kopfkohl", "Rosenkohl");
                this.bad_neighbors = Arrays.asList("Haferwurzel", "Petersilie", "Radicchio", "Sellerie");
                break;
            case "Erbse":
                this.good_neighbors = Arrays.asList("Anis", "Chicoree", "Chinakohl", "Kartoffel", "Dill", "Fenchel", "Hirse", "Krauskohl", "Hafer", "Kamille", "Kohlrabi", "Mais", "Melisse", "Minze", "Möhre", "Radicchio", "Rettich", "Rhabarber", "Rosenkohl", "Raps", "Rübe", "Spargel");
                this.bad_neighbors = Arrays.asList("Aubergine", "Bohne", "Erdnuss", "Kichererbse", "Bärlauch", "Knoblauch", "Linse", "Lauch", "Puffbohne", "Sojabohne", "Tomate", "Zwiebel" , "Paprika");
                break;
            case "Erdbeere":
                this.good_neighbors = Arrays.asList("Bohne", "Borretsch", "Feldsalat", "Bärlauch", "Knoblauch", "Salat", "Melisse", "Petersilie", "Lauch", "Radieschen", "Rettich", "Ringelblume", "Schnittlauch", "Senf", "Sommerportulak", "Spinat", "Tagetes", "Thymian", "Zwiebel");
                this.bad_neighbors = Arrays.asList("Raps", "Rübe" , "Blumenkohl", "Brokkoli", "Chinakohl", "Krauskohl", "Kohlrabi", "Kopfkohl", "Rosenkohl");
                break;
            case "Erdnuss":
                this.good_neighbors = Arrays.asList("Borretsch", "Chicoree", "Dill", "Krauskohl", "Kamille", "Radicchio", "Rosenkohl");
                this.bad_neighbors = Arrays.asList("Bohne", "Erbse", "Kichererbse", "Bärlauch", "Knoblauch", "Linse", "Lauch", "Puffbohne", "Schnittlauch", "Sojabohne", "Zwiebel");
                break;
            case "Estragon":
                this.good_neighbors = Arrays.asList("Thymian");
                this.bad_neighbors = Arrays.asList("Dill", "Petersilie");
                break;
            case "Feldsalat":
                this.good_neighbors = Arrays.asList("Artischocke", "Aubergine", "Erdbeere", "Fenchel", "Hirse", "Kerbel", "Kohlrabi", "Mais", "Radieschen", "Ringelblume", "Raps", "Rübe", "Winterportulak", "Zwiebel");
                this.bad_neighbors = Arrays.asList("Baldrian", "Karde");
                break;
            case "Fenchel":
                this.good_neighbors = Arrays.asList("Artischocke", "Basilikum", "Chicoree", "Endivie", "Erbse", "Feldsalat", "Gurke", "Salat", "Liebstöckel", "Radicchio", "Salbei", "Tetragonia", "Thymian");
                this.bad_neighbors = Arrays.asList("Aubergine", "Bohne", "Dill", "Fenchel", "Kerbel", "Koriander", "Kresse", "Kümmel", "Majoran", "Möhre", "Pastinake", "Petersilie", "Puffbohne", "Sellerie", "Tomate", "Wermut", "Ysop");
                break;
            case "Gurke":
                this.good_neighbors = Arrays.asList("Basilikum", "Bete", "Bohne", "Borretsch", "Dill", "Fenchel", "Krauskohl", "Bärlauch", "Knoblauch", "Kohlrabi", "Salat", "Mais", "Petersilie", "Radicchio", "Rosenkohl", "Sellerie", "Sonnenblume", "Spargel", "Topinambur", "Zwiebel");
                this.bad_neighbors = Arrays.asList("Aubergine", "Chinakohl", "Kartoffel", "Kürbis", "Physalis", "Radieschen", "Rettich", "Tomate" , "Paprika");
                break;
            case "Hafer":
                this.good_neighbors = Arrays.asList("Bohne", "Erbse", "Kichererbse", "Linse", "Puffbohne", "Sojabohne");
                this.bad_neighbors = Arrays.asList("");
                break;
            case "Haferwurzel":
                this.good_neighbors = Arrays.asList("Möhre", "Pastinake", "Sellerie");
                this.bad_neighbors = Arrays.asList("Chicoree", "Endivie", "Salat", "Schwarzwurzel");
                break;
            case "Hirse":
                this.good_neighbors = Arrays.asList("Bohne", "Erbse", "Feldsalat", "Kichererbse", "Linse", "Puffbohne", "Salbei", "Sojabohne");
                this.bad_neighbors = Arrays.asList("Bete", "Rukola", "Sellerie");
		break;
            case "Kamille":
                this.good_neighbors = Arrays.asList("Bohne", "Dill", "Erbse", "Erdnuss", "Kartoffel", "Kerbel", "Kichererbse", "Kohlrabi", "Kopfkohl", "Salat", "Linse", "Majoran", "Lauch", "Schnittlauch", "Sellerie", "Sojabohne", "Spinat", "Zucchini", "Zwiebel");
                this.bad_neighbors = Arrays.asList("Minze");
                break;
            case "Kapuzinerkresse":
                this.good_neighbors = Arrays.asList("Kartoffel", "Radicchio", "Süßkartoffel", "Tomate", "Zucchini" , "Paprika");
                this.bad_neighbors = Arrays.asList("Kerbel", "Petersilie", "Rukola");
                break;
            case "Karde":
                this.good_neighbors = Arrays.asList("Bohne", "Tomate");
                this.bad_neighbors = Arrays.asList("Feldsalat");
                break;
            case "Kartoffel":
                this.good_neighbors = Arrays.asList("Bohne", "Dill", "Kamille", "Kapuzinerkresse", "Bärlauch", "Erbse", "Knoblauch", "Kohlrabi", "Kopfkohl", "Kümmel", "Lein", "Mais", "Meerrettich", "Minze", "Oregano", "Puffbohne", "Ringelblume", "Sojabohne", "Spinat", "Tagetes");
                this.bad_neighbors = Arrays.asList("Aubergine", "Bete", "Blumenkohl", "Chicoree", "Krauskohl", "Gurke", "Kürbis", "Melone", "Physalis", "Rosenkohl", "Sellerie", "Sonnenblume", "Tomate", "Topinambur", "Zwiebel" , "Paprika");
                break;
            case "Kerbel":
                this.good_neighbors = Arrays.asList("Endivie", "Feldsalat", "Kamille", "Salat", "Radieschen", "Rettich", "Rosenkohl");
                this.bad_neighbors = Arrays.asList("Dill", "Fenchel", "Kapuzinerkresse", "Koriander", "Kresse", "Kümmel", "Liebstöckel", "Möhre", "Pastinake", "Petersilie", "Sellerie", "Rukola");
                break;
            case "Kichererbse":
                this.good_neighbors = Arrays.asList("Bete", "Chicoree", "Dill", "Krauskohl", "Hafer", "Hirse", "Kamille", "Kohlrabi", "Salat", "Möhre", "Radicchio", "Radieschen", "Rhabarber", "Rosenkohl", "Raps", "Rübe", "Spargel", "Spinat");
                this.bad_neighbors = Arrays.asList("Bohne", "Erbse", "Erdnuss", "Bärlauch", "Knoblauch", "Linse", "Lauch", "Puffbohne", "Schnittlauch", "Sojabohne", "Zwiebel");
                break;
            case "Bärlauch":
            case "Knoblauch":
                this.good_neighbors = Arrays.asList("Bete", "Erdbeere", "Gurke", "Kartoffel", "Möhre", "Rettich", "Rose", "Sellerie", "Süßkartoffel", "Tomate");
                this.bad_neighbors = Arrays.asList("Artischocke", "Bohne", "Erbse", "Erdnuss", "Kichererbse", "Krauskohl", "Kohlrabi", "Kopfkohl", "Linse", "Puffbohne", "Sojabohne", "Spargel");
                break;
            case "Kohlrabi":
                this.good_neighbors = Arrays.asList("Artischocke", "Aubergine", "Basilikum", "Bete", "Bohne", "Borretsch", "Dill", "Eberraute", "Endivie", "Erbse", "Feldsalat", "Krauskohl", "Gurke", "Kamille", "Kartoffel", "Kichererbse", "Salat", "Linse", "Minze", "Phacelia", "Physalis", "Lauch", "Radicchio", "Rhabarber", "Ringelblume", "Rosmarin", "Salbei", "Schnittlauch", "Schwarzwurzel", "Sellerie", "Sommerportulak", "Sonnenblume", "Spargel", "Spinat", "Tagetes", "Thymian", "Topinambur");
                this.bad_neighbors = Arrays.asList("Chinakohl", "Erdbeere", "Bärlauch", "Knoblauch", "Radieschen", "Rettich", "Raps", "Rübe", "Senf");
                break;
            case "Königskerze":
                this.good_neighbors = Arrays.asList("Alant");
                this.bad_neighbors = Arrays.asList("");
                break;
            case "Kopfkohl":
                this.good_neighbors = Arrays.asList("Artischocke", "Aubergine", "Basilikum", "Bete", "Bohne", "Borretsch", "Dill", "Eberraute", "Endivie", "Kamille", "Kartoffel", "Koriander", "Kresse", "Kümmel", "Mangold", "Minze", "Phacelia", "Lauch", "Radicchio", "Rhabarber", "Ringelblume", "Rosmarin", "Salbei", "Schnittlauch", "Sellerie", "Sonnenblume", "Spinat", "Tagetes", "Thymian", "Tomate", "Topinambur");
                this.bad_neighbors = Arrays.asList("Blumenkohl", "Brokkoli", "Chinakohl", "Erdbeere", "Krauskohl", "Bärlauch", "Knoblauch", "Radieschen", "Rettich", "Raps", "Rübe", "Senf", "Zwiebel");
                break;
            case "Koriander":
                this.good_neighbors = Arrays.asList("Anis", "Kopfkohl", "Thymian");
                this.bad_neighbors = Arrays.asList("Fenchel", "Kerbel", "Kresse", "Petersilie", "Rukola", "Schnittlauch");
                break;
            case "Krauskohl":
                this.good_neighbors = Arrays.asList("Artischocke", "Aubergine", "Basilikum", "Bohne", "Eberraute", "Endivie", "Erbse", "Erdnuss", "Gurke", "Kichererbse", "Kohlrabi", "Linse", "Minze", "Petersilie", "Phacelia", "Puffbohne", "Radicchio", "Radieschen", "Rettich", "Rhabarber", "Ringelblume", "Rosmarin", "Salbei", "Schnittlauch", "Sellerie", "Sojabohne", "Sonnenblume", "Spinat", "Tagetes", "Thymian", "Topinambur", "Winterportulak");
                this.bad_neighbors = Arrays.asList("Blumenkohl", "Brokkoli", "Chinakohl", "Erdbeere", "Kartoffel", "Bärlauch", "Knoblauch", "Kopfkohl", "Lauch", "Raps", "Rübe", "Senf");
                break;
            case "Kresse":
                this.good_neighbors = Arrays.asList("Kopfkohl", "Radieschen", "Rettich");
                this.bad_neighbors = Arrays.asList("Dill", "Fenchel", "Kerbel", "Koriander", "Petersilie", "Rukola", "Schnittlauch");
                break;
            case "Kümmel":
                this.good_neighbors = Arrays.asList("Chicoree", "Kartoffel", "Kopfkohl");
                this.bad_neighbors = Arrays.asList("Dill", "Fenchel", "Kerbel", "Liebstöckel", "Möhre", "Pastinake", "Petersilie", "Sellerie", "Wermut");
                break;
            case "Kürbis":
                this.good_neighbors = Arrays.asList("Borretsch", "Brokkoli", "Mangold", "Mais", "Ringelblume");
                this.bad_neighbors = Arrays.asList("Dill", "Gurke", "Kartoffel");
                break;
            case "Lavendel":
                this.good_neighbors = Arrays.asList("Nelke", "Rose", "Tomate", "Ysop");
                this.bad_neighbors = Arrays.asList("Petersilie");
                break;
            case "Lein":
                this.good_neighbors = Arrays.asList("Bete", "Kartoffel", "Raps", "Rübe");
                this.bad_neighbors = Arrays.asList("Bohne");
                break;
            case "Liebstöckel":
                this.good_neighbors = Arrays.asList("Fenchel", "Petersilie");
                this.bad_neighbors = Arrays.asList("Dill", "Kerbel", "Kümmel", "Möhre", "Pastinake", "Sellerie");
                break;
            case "Linse":
                this.good_neighbors = Arrays.asList("Borretsch", "Chicoree", "Dill", "Krauskohl", "Hafer", "Hirse", "Kamille", "Kohlrabi", "Möhre", "Radicchio", "Rosenkohl", "Raps", "Rübe", "Spargel");
                this.bad_neighbors = Arrays.asList("Bohne", "Erbse", "Erdnuss", "Kichererbse", "Bärlauch", "Knoblauch", "Lauch", "Puffbohne", "Schnittlauch", "Sojabohne", "Zwiebel");
                break;
            case "Mais":
                this.good_neighbors = Arrays.asList("Bohne", "Erbse", "Feldsalat", "Gurke", "Kartoffel", "Salat", "Kürbis", "Melone", "Phacelia", "Salbei", "Senf", "Sommerportulak", "Tomate", "Zucchini");
                this.bad_neighbors = Arrays.asList("Bete", "Rukola", "Sellerie");
                break;
            case "Majoran":
                this.good_neighbors = Arrays.asList("Kamille");
                this.bad_neighbors = Arrays.asList("Basilikum", "Fenchel", "Thymian");
                break;
            case "Mangold":
                this.good_neighbors = Arrays.asList("Basilikum", "Blumenkohl", "Bohne", "Kopfkohl", "Kürbis", "Möhre", "Pastinake", "Radieschen", "Rettich", "Raps", "Rübe");
                this.bad_neighbors = Arrays.asList("Bete", "Spinat");
                break;
            case "Melisse":
                this.good_neighbors = Arrays.asList("Erbse", "Erdbeere");
                this.bad_neighbors = Arrays.asList("Basilikum", "Wermut");
                break;
            case "Meerrettich":
                this.good_neighbors = Arrays.asList("Kartoffel");
                this.bad_neighbors = Arrays.asList("");
                break;
            case "Melone":
                this.good_neighbors = Arrays.asList("Bohne", "Borretsch", "Mais", "Sonnenblume", "Topinambur");
                this.bad_neighbors = Arrays.asList("Kartoffel");
                break;
            case "Minze":
                this.good_neighbors = Arrays.asList("Erbse", "Kartoffel", "Salat", "Tomate" , "Blumenkohl", "Brokkoli", "Chinakohl", "Krauskohl", "Kohlrabi", "Kopfkohl", "Rosenkohl");
                this.bad_neighbors = Arrays.asList("Kamille", "Möhre", "Petersilie");
                break;
            case "Möhre":
                this.good_neighbors = Arrays.asList("Aubergine", "Blumenkohl", "Chicoree", "Dill", "Endivie", "Erbse", "Haferwurzel", "Kichererbse", "Bärlauch", "Knoblauch", "Salat", "Linse", "Mangold", "Oregano", "Lauch", "Rosmarin", "Schnittlauch", "Schwarzwurzel", "Zwiebel");
                this.bad_neighbors = Arrays.asList("Fenchel", "Kerbel", "Kümmel", "Liebstöckel", "Minze", "Pastinake", "Petersilie", "Sellerie");
                break;
            case "Nelke":
                this.good_neighbors = Arrays.asList("Lavendel", "Salbei", "Wermut");
                this.bad_neighbors = Arrays.asList("Rose");
                break;
            case "Oregano":
                this.good_neighbors = Arrays.asList("Kartoffel", "Möhre", "Lauch", "Salbei", "Tomate", "Zwiebeln");
                this.bad_neighbors = Arrays.asList("");
                break;
            case "Paprika":
                this.good_neighbors = Arrays.asList("Bete", "Bohne", "Kapuzinerkresse", "Ringelblume");
                this.bad_neighbors = Arrays.asList("Aubergine", "Erbse", "Gurke", "Kartoffel", "Sellerie", "Tomate");
                break;
            case "Pastinake":
                this.good_neighbors = Arrays.asList("Mangold", "Bete", "Haferwurzel", "Spinat", "Winterportulak");
                this.bad_neighbors = Arrays.asList("Dill", "Fenchel", "Kerbel", "Kümmel", "Liebstöckel", "Möhre", "Petersilie", "Sellerie");
                break;
            case "Petersilie":
                this.good_neighbors = Arrays.asList("Aubergine", "Erdbeere", "Krauskohl", "Gurke", "Liebstöckel", "Lauch", "Radieschen", "Rettich", "Ringelblume", "Schnittlauch", "Spargel", "Tomate", "Zwiebel");
                this.bad_neighbors = Arrays.asList("Borretsch", "Dill", "Endivie", "Estragon", "Fenchel", "Kapuzinerkresse", "Kerbel", "Salat", "Koriander", "Kresse", "Kümmel", "Lavendel", "Minze", "Möhre", "Pastinake", "Radicchio", "Sellerie");
                break;
            case "Phacelia":
                this.good_neighbors = Arrays.asList("Mais", "Physalis" , "Blumenkohl", "Brokkoli", "Chinakohl", "Krauskohl", "Kohlrabi", "Kopfkohl", "Rosenkohl");
                this.bad_neighbors = Arrays.asList("");
                break;
            case "Physalis":
                this.good_neighbors = Arrays.asList("Kohlrabi", "Phacelia", "Lauch", "Radieschen", "Ringelblume", "Sonnenblume", "Topinambur");
                this.bad_neighbors = Arrays.asList("Gurke", "Kartoffel", "Tomate");
                break;
            case "Lauch":
                this.good_neighbors = Arrays.asList("Aubergine", "Chicoree", "Endivie", "Erdbeere", "Kamille", "Kohlrabi", "Kopfkohl", "Möhre", "Oregano", "Petersilie", "Physalis", "Radicchio", "Rettich", "Schwarzwurzel", "Sellerie", "Süßkartoffel", "Tomate", "Wermut");
                this.bad_neighbors = Arrays.asList("Artischocke", "Bete", "Bohne", "Erbse", "Erdnuss", "Kichererbse", "Krauskohl", "Linse", "Puffbohne", "Schnittlauch", "Sojabohne", "Spargel");
                break;
            case "Puffbohne":
                this.good_neighbors = Arrays.asList("Bete", "Bohnenkraut", "Brokkoli", "Krauskohl", "Hafer", "Hirse", "Kartoffel", "Rosenkohl", "Spargel", "Spinat", "Winterportulak");
                this.bad_neighbors = Arrays.asList("Bohne", "Erbse", "Erdnuss", "Fenchel", "Bärlauch", "Kichererbse", "Knoblauch", "Linse", "Lauch", "Schnittlauch", "Sojabohne", "Zwiebel");
                break;
            case "Radicchio":
                this.good_neighbors = Arrays.asList("Bohne", "Borretsch", "Dill", "Erbse", "Erdnuss", "Fenchel", "Gurke", "Kapuzinerkresse", "Kichererbse", "Linse", "Lauch", "Ringelblume", "Schnittlauch", "Sojabohne", "Spinat", "Tomate", "Zwiebel" , "Blumenkohl", "Brokkoli", "Chinakohl", "Krauskohl", "Kohlrabi", "Kopfkohl", "Rosenkohl");
                this.bad_neighbors = Arrays.asList("Endivie", "Petersilie", "Radieschen", "Sellerie");
                break;
            case "Radieschen":
                this.good_neighbors = Arrays.asList("Artischocke", "Aubergine", "Erdbeere", "Feldsalat", "Krauskohl", "Kerbel", "Kichererbse", "Kresse", "Salat", "Mangold", "Petersilie", "Physalis", "Schwarzwurzel", "Sommerportulak", "Spinat");
                this.bad_neighbors = Arrays.asList("Brokkoli", "Chinakohl", "Gurke", "Kohlrabi", "Kopfkohl", "Radicchio", "Rettich", "Rosenkohl", "Raps", "Rübe", "Rukola", "Senf", "Zucchini");
                break;
            case "Rettich":
                this.good_neighbors = Arrays.asList("Erbse", "Erdbeere", "Krauskohl", "Kerbel", "Kresse", "Bärlauch", "Knoblauch", "Salat", "Mangold", "Petersilie", "Lauch", "Schnittlauch", "Sommerportulak");
                this.bad_neighbors = Arrays.asList("Blumenkohl", "Brokkoli", "Chinakohl", "Gurke", "Kohlrabi", "Kopfkohl", "Radieschen", "Rosenkohl", "Raps", "Rübe", "Rukola", "Tomate", "Zucchini");
                break;
            case "Rhabarber":
                this.good_neighbors = Arrays.asList("Bohne", "Erbse", "Kichererbse", "Salat", "Spinat" , "Blumenkohl", "Brokkoli", "Chinakohl", "Krauskohl", "Kohlrabi", "Kopfkohl", "Rosenkohl");
                this.bad_neighbors = Arrays.asList("");
                break;
            case "Ringelblume":
                this.good_neighbors = Arrays.asList("Erdbeere", "Feldsalat", "Kartoffel", "Kürbis", "Petersilie", "Physalis", "Radicchio", "Sellerie", "Senf", "Spargel", "Tomate" , "Blumenkohl", "Brokkoli", "Chinakohl", "Krauskohl", "Kohlrabi", "Kopfkohl", "Rosenkohl" , "Paprika");
                this.bad_neighbors = Arrays.asList("Thymian");
                break;
            case "Rose":
                this.good_neighbors = Arrays.asList("Bärlauch", "Knoblauch", "Lavendel");
                this.bad_neighbors = Arrays.asList("Nelke");
                break;
            case "Rosenkohl":
                this.good_neighbors = Arrays.asList("Artischocke", "Aubergine", "Basilikum", "Bohne", "Eberraute", "Endivie", "Erbse", "Erdnuss", "Gurke", "Kerbel", "Kichererbse", "Linse", "Minze", "Phacelia", "Puffbohne", "Radicchio", "Rhabarber", "Ringelblume", "Rosmarin", "Salbei", "Schnittlauch", "Sellerie", "Sojabohne", "Sonnenblume", "Spinat", "Tagetes", "Thymian", "Topinambur");
                this.bad_neighbors = Arrays.asList("Blumenkohl", "Brokkoli", "Erdbeere", "Kartoffel", "Radieschen", "Rettich", "Raps", "Rübe", "Senf");
                break;
            case "Rosmarin":
                this.good_neighbors = Arrays.asList("Basilikum", "Möhre", "Salbei", "Thymian", "Tomate" , "Blumenkohl", "Brokkoli", "Chinakohl", "Krauskohl", "Kohlrabi", "Kopfkohl", "Rosenkohl");
                this.bad_neighbors = Arrays.asList("Senf");
                break;
            case "Raps":
            case "Rübe":
                this.good_neighbors = Arrays.asList("Aubergine", "Bohne", "Erbse", "Feldsalat", "Salat", "Kichererbse", "Lein", "Linse", "Mangold", "Spinat", "Tomate");
                this.bad_neighbors = Arrays.asList("Erdbeere", "Radieschen", "Rettich", "Senf" , "Blumenkohl", "Brokkoli", "Chinakohl", "Krauskohl", "Kohlrabi", "Kopfkohl", "Rosenkohl");
                break;
            case "Rukola":
                this.good_neighbors = Arrays.asList("Salat", "Sellerie", "Sommerportulak", "Winterportulak");
                this.bad_neighbors = Arrays.asList("Borretsch", "Hirse", "Kapuzinerkresse", "Kerbel", "Koriander", "Kresse", "Mais", "Radieschen", "Rettich");
                break;
            case "Salat":
                this.good_neighbors = Arrays.asList("Artischocke", "Aubergine", "Blumenkohl", "Chicoree", "Dill", "Erdbeere", "Fenchel", "Gurke", "Kamille", "Kerbel", "Kichererbse", "Kohlrabi", "Mais", "Minze", "Möhre", "Radieschen", "Rettich", "Rhabarber", "Raps", "Rübe", "Rukola", "Schwarzwurzel", "Sommerportulak", "Spargel", "Zwiebel");
                this.bad_neighbors = Arrays.asList("Haferwurzel", "Petersilie", "Sellerie");
                break;
            case "Salbei":
                this.good_neighbors = Arrays.asList("Bohnenkraut", "Fenchel", "Hirse", "Mais", "Nelke", "Oregano", "Rosmarin", "Thymian" , "Blumenkohl", "Brokkoli", "Chinakohl", "Krauskohl", "Kohlrabi", "Kopfkohl", "Rosenkohl");
                this.bad_neighbors = Arrays.asList("Basilikum");
                break;
            case "Schnittlauch":
                this.good_neighbors = Arrays.asList("Aubergine", "Erdbeere", "Kamille", "Möhre", "Petersilie", "Radicchio", "Rettich", "Süßkartoffel", "Tomate" , "Blumenkohl", "Brokkoli", "Chinakohl", "Krauskohl", "Kohlrabi", "Kopfkohl", "Rosenkohl");
                this.bad_neighbors = Arrays.asList("Artischocke", "Erdnuss", "Kichererbse", "Koriander", "Kresse", "Linse", "Lauch", "Puffbohne", "Sojabohne", "Spargel");
                break;
            case "Schwarzwurzel":
                this.good_neighbors = Arrays.asList("Bohne", "Kohlrabi", "Salat", "Möhre", "Lauch", "Radieschen", "Zwiebel");
                this.bad_neighbors = Arrays.asList("Haferwurzel");
                break;
            case "Sellerie":
                this.good_neighbors = Arrays.asList("Amaranth", "Aubergine", "Blumenkohl", "Bohne", "Buchweizen", "Gurke", "Haferwurzel", "Kamille", "Bärlauch", "Knoblauch", "Lauch", "Ringelblume", "Rosenkohl", "Rukola", "Spinat", "Tagetes", "Tomate" , "Blumenkohl", "Brokkoli", "Chinakohl", "Krauskohl", "Kohlrabi", "Kopfkohl", "Rosenkohl");
                this.bad_neighbors = Arrays.asList("Artischocke", "Dill", "Endivie", "Fenchel", "Hirse", "Kartoffel", "Kerbel", "Kümmel", "Salat", "Liebstöckel", "Mais", "Möhre", "Pastinake", "Petersilie", "Radicchio" , "Paprika");
                break;
            case "Senf":
                this.good_neighbors = Arrays.asList("Erdbeere", "Mais", "Ringelblume");
                this.bad_neighbors = Arrays.asList("Radieschen", "Rosmarin", "Raps", "Rübe" , "Blumenkohl", "Brokkoli", "Chinakohl", "Krauskohl", "Kohlrabi", "Kopfkohl", "Rosenkohl");
                break;
            case "Sojabohne":
                this.good_neighbors = Arrays.asList("Bete", "Bohnenkraut", "Chicoree", "Hafer", "Hirse", "Krauskohl", "Kamille", "Kartoffel", "Radicchio", "Rosenkohl", "Spargel");
                this.bad_neighbors = Arrays.asList("Bohne", "Erbse", "Erdnuss", "Kichererbse", "Bärlauch", "Knoblauch", "Linse", "Lauch", "Puffbohne", "Schnittlauch", "Zwiebel");
                break;
            case "Sommerportulak":
                this.good_neighbors = Arrays.asList("Erdbeere", "Kohlrabi", "Salat", "Mais", "Radieschen", "Rettich", "Rukola");
                this.bad_neighbors = Arrays.asList("Winterportulak");
                break;
            case "Topinambur":
            case "Sonnenblume":
                this.good_neighbors = Arrays.asList("Bohne", "Gurke", "Melone", "Physalis" , "Blumenkohl", "Brokkoli", "Chinakohl", "Krauskohl", "Kohlrabi", "Kopfkohl", "Rosenkohl");
                this.bad_neighbors = Arrays.asList("Kartoffel");
                break;
            case "Spargel":
                this.good_neighbors = Arrays.asList("Bohnen", "Dill", "Erbsen", "Gurken", "Kichererbse", "Kohlrabi", "Salat", "Linse", "Petersilie", "Puffbohne", "Ringelblume", "Sojabohne", "Tomate");
                this.bad_neighbors = Arrays.asList("Bärlauch", "Knoblauch", "Lauch", "Schnittlauch", "Zwiebel");
                break;
            case "Spinat":
                this.good_neighbors = Arrays.asList("Aubergine", "Endivie", "Erdbeere", "Kamille", "Kartoffel", "Kichererbse", "Pastinake", "Puffbohne", "Radicchio", "Radieschen", "Rhabarber", "Raps", "Rübe", "Sellerie", "Winterportulak", "Zucchini" , "Blumenkohl", "Brokkoli", "Chinakohl", "Krauskohl", "Kohlrabi", "Kopfkohl", "Rosenkohl");
                this.bad_neighbors = Arrays.asList("Mangold", "Bete");
                break;
            case "Süßkartoffel":
                this.good_neighbors = Arrays.asList("Kapuzinerkresse" , "Bärlauch", "Knoblauch", "Lauch", "Schnittlauch", "Zwiebel");
                this.bad_neighbors = Arrays.asList("");
                break;
            case "Tagetes":
                this.good_neighbors = Arrays.asList("Erdbeere", "Kartoffel", "Sellerie", "Tomate" , "Blumenkohl", "Brokkoli", "Chinakohl", "Krauskohl", "Kohlrabi", "Kopfkohl", "Rosenkohl");
                this.bad_neighbors = Arrays.asList("");
                break;
            case "Tetragonia":
                this.good_neighbors = Arrays.asList("Blumenkohl", "Endivie", "Fenchel", "Tomate");
                this.bad_neighbors = Arrays.asList("");
                break;
            case "Thymian":
                this.good_neighbors = Arrays.asList("Bohnenkraut", "Borretsch", "Erdbeere", "Estragon", "Fenchel", "Koriander", "Rosmarin", "Salbei" , "Blumenkohl", "Brokkoli", "Chinakohl", "Krauskohl", "Kohlrabi", "Kopfkohl", "Rosenkohl");
                this.bad_neighbors = Arrays.asList("Basilikum", "Majoran", "Ringelblume");
                break;
            case "Tomate":
                this.good_neighbors = Arrays.asList("Baldrian", "Basilikum", "Blumenkohl", "Bohne", "Borretsch", "Chicoree", "Kapuzinerkresse", "Bärlauch", "Karde", "Knoblauch", "Kopfkohl", "Lavendel", "Mais", "Minze", "Oregano", "Petersilie", "Lauch", "Radicchio", "Ringelblume", "Rosmarin", "Raps", "Rübe", "Schnittlauch", "Sellerie", "Spargel", "Tagetes", "Tetragonia");
                this.bad_neighbors = Arrays.asList("Aubergine", "Erbse", "Fenchel", "Gurke", "Kartoffel", "Physalis", "Rettich" , "Paprika");
                break;
            case "Weinraute":
                this.good_neighbors = Arrays.asList("Wermut", "Ysop");
                this.bad_neighbors = Arrays.asList("Basilikum");
                break;
            case "Wermut":
                this.good_neighbors = Arrays.asList("Eberraute", "Nelke", "Lauch", "Weinraute");
                this.bad_neighbors = Arrays.asList("Basilikum", "Fenchel", "Kümmel", "Melisse");
                break;
            case "Winterportulak":
                this.good_neighbors = Arrays.asList("Chinakohl", "Feldsalat", "Krauskohl", "Pastinake", "Puffbohne", "Rukola", "Spinat");
                this.bad_neighbors = Arrays.asList("Sommerportulak");
                break;
            case "Ysop":
                this.good_neighbors = Arrays.asList("Bohnenkraut", "Lavendel", "Weinraute");
                this.bad_neighbors = Arrays.asList("Fenchel");
                break;
            case "Zucchini":
                this.good_neighbors = Arrays.asList("Basilikum", "Bohne", "Borretsch", "Dill", "Kamille", "Kapuzinerkresse", "Mais", "Spinat");
                this.bad_neighbors = Arrays.asList("Radieschen", "Rettich");
                break;
            case "Zwiebel":
                this.good_neighbors = Arrays.asList("Bete", "Chicoree", "Dill", "Erdbeere", "Feldsalat", "Gurke", "Kamille", "Salat", "Möhre", "Oregano", "Petersilie", "Radicchio", "Schwarzwurzel", "Süßkartoffel");
                this.bad_neighbors = Arrays.asList("Artischocke", "Blumenkohl", "Bohne", "Erbse", "Erdnuss", "Kartoffel", "Kichererbse", "Kopfkohl", "Linse", "Puffbohne", "Sojabohne", "Spargel");
                break;
            default:
                this.good_neighbors = Arrays.asList("");
                this.bad_neighbors = Arrays.asList("");
                break;
        }
    }
}