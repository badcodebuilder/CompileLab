package com;

/**
 * @apiNote: 
 */
public class token {
    public int index;
    public String symbol;

    public token(int index, String symbol) {
        this.index = index;
        this.symbol = symbol;
    }

    public String toString() {
        return String.format("<%3d,%s>", this.index, this.symbol);
    }

    // FIXME: note that the function need to be rewritten
    public boolean equals(token another) {
        if (another.index == this.index &&
            another.symbol.equals(this.symbol)) {
            return true;
        }
        else {
            return false;
        }
    }
}