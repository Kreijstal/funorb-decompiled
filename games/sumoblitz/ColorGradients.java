/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ColorGradients {
    private static String field_z;

    final static int[] rgbGradient(int startColor, byte guard, int length, int endColor) {
        int var20 = 0;
        int var21 = Sumoblitz.field_L ? 1 : 0;
        int[] var24 = new int[length];
        int[] var23 = var24;
        int[] var22 = var23;
        int[] var4 = var22;
        int var5 = 255 & startColor >> 16;
        int var6 = startColor >> 8 & 255;
        int var7 = 255 & startColor;
        double var8 = (double)((endColor >> 16 & 255) - var5) / (double)length;
        double var10 = (double)(((65280 & endColor) >> 8) - var6) / (double)length;
        var24[0] = startColor;
        double var12 = (double)(-var7 + (endColor & 255)) / (double)length;
        var22[-1 + length] = endColor;
        double var14 = (double)var5;
        double var16 = (double)var6;
        double var18 = (double)var7;
        if (guard >= -86) {
          ColorGradients.rgbGradient(-111, (byte) -80, -51, -78);
        }
        for (var20 = 1; var20 < length - 1; var20++) {
          var16 = var16 + var10;
          var18 = var18 + var12;
          var14 = var14 + var8;
          var22[var20] = LegacyOpenGlInterleavedStream.bitwiseOr(LegacyOpenGlInterleavedStream.bitwiseOr(LegacyOpenGlPostProcessManager.bitwiseAnd(1144783103, (int)Math.round(var14)) << 16, LegacyOpenGlPostProcessManager.bitwiseAnd((int)Math.round(var16), 1979711743) << 8), LegacyOpenGlPostProcessManager.bitwiseAnd((int)Math.round(var18), 255));
        }
        return var4;
    }

    static {
        field_z = "nf.A(";
    }
}
