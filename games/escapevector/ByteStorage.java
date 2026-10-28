/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ByteStorage {
    private static String[] retributionLevelNames;
    static TriangleMesh[] logoMeshes;
    static int[] field_d;
    static boolean field_a;
    private static String[] retrievalLevelNames;
    private static String[] normalRetrievalLevelNames;
    private static String[] simulatorLevelNames;
    static String[][] levelNamesByMode;
    static BinaryBitmapFont gameFont;

    public static void releaseStatics(byte guard) {
        simulatorLevelNames = null;
        retributionLevelNames = null;
        if (guard == 86) {
          normalRetrievalLevelNames = null;
          retrievalLevelNames = null;
          field_d = null;
          gameFont = null;
          levelNamesByMode = (String[][]) null;
          logoMeshes = null;
          return;
        }
    }

    abstract byte[] toByteArray(int guard);

    final static void requestQuit(int guard) {
        if (guard > -27) {
          ByteStorage.releaseStatics((byte) 2);
          WhirlpoolHasher.setAccountAction(17, 27);
          return;
        }
        WhirlpoolHasher.setAccountAction(17, 27);
    }

    abstract void setBytes(boolean guard, byte[] bytes);

    static {
        retributionLevelNames = new String[]{"Eggtimer", "FuelEconomy", "13", "TunnelPractice", "TunnelsOfDestruction", "GunRunner", "TwistsAndTurns", "EscapeToVectory", "passages", "CavernOfDestruction", "15", "GunCaves", "Spelunking", "rorschach", "ContainmentNetwork", "DendriticDestruction"};
        field_d = new int[]{2, 3, 4};
        retrievalLevelNames = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"};
        simulatorLevelNames = new String[]{"antigrav", "Breach", "cataclysm", "Dash", "DeepVertigo", "divided", "ExplosiveExit", "GravityChamber", "14", "orb", "pinball", "pulse", "12", "UpwardsAndOnwards", "AsteroidsNormal", "Asteroids"};
        normalRetrievalLevelNames = retrievalLevelNames;
        levelNamesByMode = new String[][]{normalRetrievalLevelNames, retrievalLevelNames, retributionLevelNames, simulatorLevelNames};
    }
}
