/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PerlinNoiseFactory {
    static ValidationStatus VALID;
    static String connectionLostAttemptingToText;

    final static int[][] generateNoise(boolean normalize, int octaves, int unused, int repeatY, int fixedPointScale, int repeatX, int width, int height, float persistence) {
        int var11 = 0;
        int var12 = Sumoblitz.field_L ? 1 : 0;
        int[][] var15 = new int[height][width];
        int[][] var14 = var15;
        int[][] var13 = var14;
        int[][] var9 = var13;
        PerlinNoise2D var10 = new PerlinNoise2D();
        var10.octaveCount = octaves;
        var10.persistenceQ12 = (int)(persistence * (float)fixedPointScale);
        var10.repeatY = repeatY;
        var10.repeatX = repeatX;
        var10.normalizeOutput = normalize ? true : false;
        var10.initialize(-8);
        SecondaryNodeDequeIterator.a(-1203350004, width, height);
        for (var11 = 0; var11 < height; var11++) {
          var10.fillRow(fixedPointScale - 32792, var11, var15[var11]);
        }
        return var9;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          VALID = (ValidationStatus) null;
        }
        connectionLostAttemptingToText = null;
        VALID = null;
    }

    static {
        VALID = new ValidationStatus();
        connectionLostAttemptingToText = "Connection lost - attempting to reconnect";
    }
}
