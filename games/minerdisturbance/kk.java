/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    static IntrusiveDeque field_a;
    static int[] field_b;
    static int[] field_c;
    static volatile boolean field_d;

    final static Sprite[] a(int param0) {
        int var2 = 0;
        int var6 = 0;
        int var7 = 0;
        Sprite[] var1;
        int var3;
        byte[] var5;
        int[] var6_ref_int__;
        int var8;
        byte[] var9;
        int[] var10;
        byte[] var12;
        int[] var13;
        byte[] var16;
        int[] var17;
        byte[] var21;
        int[] var22;
        var8 = MinerDisturbance.field_ab;
        var1 = new Sprite[sc.field_d];
        if (param0 < 83) {
          kk.a(45);
        }
        for (var2 = 0; sc.field_d > var2; var2++) {
          var3 = qk.field_b[var2] * ng.field_e[var2];
          var21 = ClientException.field_b[var2];
          if (!jk.field_gb[var2]) {
            var10 = new int[var3];
            var22 = var10;
            for (var6 = 0; var6 < var3; var6++) {
              var10[var6] = af.field_p[c.a(255, (int) var21[var6])];
            }
            var1[var2] = new Sprite(pf.field_c, wd.field_a, bg.field_d[var2], oc.field_e[var2], qk.field_b[var2], ng.field_e[var2], var22);
          } else {
            var16 = ci.field_a[var2];
            var12 = var16;
            var9 = var12;
            var5 = var9;
            var17 = new int[var3];
            var13 = var17;
            var6_ref_int__ = var13;
            for (var7 = 0; var3 > var7; var7++) {
              var6_ref_int__[var7] = SpriteState.a(af.field_p[c.a(255, (int) var21[var7])], c.a(-16777216, var16[var7] << 24));
            }
            var1[var2] = (Sprite) ((Object) new ArgbSprite(pf.field_c, wd.field_a, bg.field_d[var2], oc.field_e[var2], qk.field_b[var2], ng.field_e[var2], var17));
          }
        }
        ec.a((byte) -120);
        return var1;
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 < 40) {
          kk.a(103);
        }
    }

    static {
        field_b = new int[8192];
        field_c = new int[8192];
        field_a = new IntrusiveDeque();
        field_d = false;
    }
}
