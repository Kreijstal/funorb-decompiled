/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SceneSpriteFactory {
    static Sprite[] field_e;
    private static int[] field_d;
    static int[] field_a;
    static String field_c;
    static ResourceArchive field_b;
    static int[] field_f;

    final static int fixedRatio16(long param0, int param1, long param2) {
        if (param1 != 249299984) {
          SceneSpriteFactory.createSceneSprite(32, -61, false, -3, 30, true);
        }
        return (int)((param2 << 16) / param0);
    }

    public static void releaseStatics(boolean param0) {
        field_f = null;
        if (param0) {
          SceneSpriteFactory.releaseStatics(false);
        }
        field_c = null;
        field_d = null;
        field_e = null;
        field_b = null;
        field_a = null;
    }

    final static WorldDrawEntry createSceneSprite(int param0, int param1, boolean param2, int param3, int param4, boolean param5) {
        int var7 = 0;
        int var8 = Kickabout.field_G;
        if (param4 != 9103) {
          return (WorldDrawEntry) null;
        }
        WorldDrawEntry var6 = new WorldDrawEntry(4);
        var6.field_e = ((ArgbSprite) (SpriteState.field_p[param5 ? 1 : 0])).copyArgb();
        if (param2) {
          var6.field_e.flipHorizontalInPlace();
        }
        for (var7 = 0; var7 < param1; var7++) {
          var6.field_e.rotateClockwise();
        }
        var6.field_g = -(var6.field_e.field_v >> 1) + param3;
        var6.field_k = param0;
        return var6;
    }

    static {
        int var0 = 0;
        field_a = new int[8];
        field_d = new int[8];
        field_a[1] = 50;
        field_a[5] = 64;
        field_a[4] = 128;
        field_a[2] = 50;
        field_a[6] = 140;
        field_a[0] = 78;
        field_a[7] = 100;
        field_a[3] = 50;
        for (var0 = 0; var0 < field_a.length; var0++) {
          field_d[var0] = field_a[var0];
        }
        field_c = "<%0> has just resigned and left, <%1> goes through <%2>.";
        field_f = new int[8192];
    }
}
