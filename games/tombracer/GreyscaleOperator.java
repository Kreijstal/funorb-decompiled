/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GreyscaleOperator extends TextureOperator {
    static int field_m;

    final static void a(boolean param0, int param1) {
        LegacyOpenGlFlowingWaterEffect.a(false, param0, (byte) 116);
        if (param1 != 262144) {
          field_m = -89;
        }
    }

    public GreyscaleOperator() {
        super(1, true);
    }

    final static boolean d(int param0, int param1, int param2) {
        if (param1 != -28090) {
          return false;
        }
        if (EdgeDetectOperator.hasFlag256(param0, param2, param1 ^ -3045) | ((262144 & param2) != 0 ? true : false)) {
          return true;
        }
        if (!no.a(param0, param2, 36864)) {
          return false;
        }
        return true;
    }

    final int[] getMonochromeRow(int param0, int param1) {
        int[][] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = TombRacer.field_G ? 1 : 0;
        int[] var10 = this.monochromeCache.getRow((byte) -103, param1);
        int[] var3 = var10;
        if (param0 != 1) {
          return (int[]) null;
        }
        if (this.monochromeCache.rowMissed) {
          var4 = this.getInputColourRow(param1, 0, -1);
          var5 = var4[0];
          var6 = var4[1];
          var7 = var4[2];
          for (var8 = 0; LegacyOpenGlTurbulentTextureEffect.textureWidth > var8; var8++) {
            var10[var8] = (var7[var8] + (var6[var8] + var5[var8])) / 3;
          }
          return var3;
        }
        return var3;
    }

    static {
    }
}
