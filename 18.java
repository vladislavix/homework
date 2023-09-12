enum ClothingSize {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;

    ClothingSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        if (this == XXS) {
            return "Детский размер";
        } else {
            return "Взрослый размер";
        }
    }

    public int getEuroSize() {
        return euroSize;
    }
}

interface MenClothing {
    void dressMan();
}

interface WomenClothing {
    void dressWoman();
}

abstract class Clothing {
    private final ClothingSize size;
    private final double cost;
    private final String color;

    public Clothing(ClothingSize size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public ClothingSize getSize() {
        return size;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
}

class TShirt extends Clothing implements MenClothing, WomenClothing {
    public TShirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка:\n\tРазмер " + getSize().getDescription() + ",\n\tЦвет " + getColor() + ",\n\tСтоимость " + getCost() + " руб.");
    }

    @Override
    public void dressWoman() {
        System.out.println("Женская футболка:\n\tРазмер " + getSize().getDescription() + ",\n\tЦвет " + getColor() + ",\n\tСтоимость " + getCost() + " руб.");
    }
}

class Pants extends Clothing implements MenClothing, WomenClothing {
    public Pants(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские штаны:\n\tРазмер " + getSize().getDescription() + ",\n\tЦвет " + getColor() + ",\n\tСтоимость " + getCost() + " руб.");
    }

    @Override
    public void dressWoman() {
        System.out.println("Женские штаны:\n\tРазмер " + getSize().getDescription() + ",\n\tЦвет " + getColor() + ",\n\tСтоимость " + getCost() + " руб.");
    }
}

class Skirt extends Clothing implements WomenClothing {
    public Skirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Женская юбка:\n\tРазмер " + getSize().getDescription() + ",\n\tЦвет " + getColor() + ",\n\tСтоимость " + getCost() + " руб.");
    }
}

class Tie extends Clothing implements MenClothing {

    public Tie(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужской галстук:\n\tРазмер " + getSize().getDescription() + ",\n\tЦвет " + getColor() + ",\n\tСтоимость " + getCost() + " руб.");
    }
}

class Atelier {
    public void dressWoman(Clothing[] clothes) {
        for (Clothing clothing : clothes) {
            if (clothing instanceof WomenClothing) {
                ((WomenClothing) clothing).dressWoman();
            }
        }
    }

    public void dressMan(Clothing[] clothes) {
        for (Clothing clothing : clothes) {
            if (clothing instanceof MenClothing) {
                ((MenClothing) clothing).dressMan();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Clothing[] clothes = {
                new TShirt(ClothingSize.XXS, 500.0, "белый"),
                new Pants(ClothingSize.XS, 2000.0, "черный"),
                new Pants(ClothingSize.M, 1999, "черный"),
                new Skirt(ClothingSize.S, 3000, "красный"),
                new Tie(ClothingSize.L, 500, "синий")
        };

        Atelier atelier = new Atelier();
        atelier.dressWoman(clothes);
        atelier.dressMan(clothes);
    }
}
