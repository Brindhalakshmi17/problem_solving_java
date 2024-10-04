public class TileCalculator {

    public static int calculateTilesByArea(int length, int breadth, int tileSize) {
        
        int gardenArea = length * breadth;
        int tileArea = tileSize * tileSize;
        return (int) Math.ceil((double) gardenArea / tileArea);
    }

    public static void main(String[] args) {
        int gardenLength = 2;
        int gardenBreadth = 6;
        int tileSize = 4;

        int tilesNeeded = calculateTilesByArea(gardenLength, gardenBreadth, tileSize);
        System.out.println("Number of tiles required: " + tilesNeeded);
    }
}
