package at.refugeescode.mp11piratesofthecodebean3.persistence;

import javax.persistence.*;

@Entity
public class Pirate {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private PieceOfEight pieceOfEight;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PieceOfEight getPieceOfEight() {
        return pieceOfEight;
    }

    public void setPieceOfEight(PieceOfEight pieceOfEight) {
        this.pieceOfEight = pieceOfEight;
    }
}
