/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextureCoordinateMode {
    static int field_b;
    static String field_a;

    public static void clearSharedReferences(byte param0) {
        field_a = null;
        if (param0 > -121) {
          TextureCoordinateMode.clearSharedReferences((byte) 103);
        }
    }

    final static Sprite[] a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = VoidHunters.field_G;
        Sprite[] var1 = new Sprite[GpuProjectionMode.field_a];
        for (var2 = 0; var2 < GpuProjectionMode.field_a; var2++) {
          var3 = hla.field_a[var2] * SetMissionTerrainDebrisProbability.field_o[var2];
          var4 = sh.field_a[var2];
          var5 = new int[var3];
          for (var6 = 0; var6 < var3; var6++) {
            var5[var6] = rlb.field_d[dla.a(255, (int) var4[var6])];
          }
          var1[var2] = new Sprite(LegacyOpenGlMaterialEffectManager.field_i, Ship.field_H, LegacyOpenGlScrollingNoiseEffect.field_e[var2], SettingsChange.field_f[var2], SetMissionTerrainDebrisProbability.field_o[var2], hla.field_a[var2], var5);
        }
        MatchResults.a(84);
        if (param0) {
          TextureCoordinateMode.a(false);
        }
        return var1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = 20;
    }
}
