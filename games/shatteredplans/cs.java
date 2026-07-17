/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cs extends oh {
    ln field_n;
    static fg field_j;
    ln field_k;
    static boolean field_i;
    static v field_l;
    int field_m;
    static bi field_h;

    public static void a(int param0) {
        field_l = null;
        field_j = null;
        int var1 = 115 / ((-10 - param0) / 45);
        field_h = null;
    }

    final static bi[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        bi var9 = null;
        bi var10 = null;
        bi var11 = null;
        bi var12 = null;
        bi var13 = null;
        Object var14 = null;
        int[] var15 = null;
        bi var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        L0: {
          var20 = gf.field_h;
          var19 = var20;
          var18 = var19;
          var17 = var18;
          var15 = var17;
          var6 = var15;
          var7 = gf.field_b;
          var8 = gf.field_k;
          var9 = new bi(3, param2 - 6);
          var9.e();
          gf.i(0, 0, 3, param2 - 6, param3, param4);
          var10 = new bi(3, 3);
          var10.e();
          gf.d(0, 0, 3, 3, param3);
          var11 = new bi(16, 3);
          var11.e();
          gf.d(0, 0, 16, 3, param3);
          var12 = new bi(3, 3);
          var12.e();
          gf.d(0, 0, 3, 3, param4);
          var13 = new bi(16, 3);
          var13.e();
          gf.d(0, 0, 16, 3, param4);
          var14 = null;
          if (0 < param5) {
            var16 = new bi(16, 16);
            var14 = (Object) (Object) var16;
            var16.e();
            gf.d(0, 0, 16, 16, param5);
            break L0;
          } else {
            break L0;
          }
        }
        gf.a(var20, var7, var8);
        return new bi[]{var10, var11, var10, var9, (bi) var14, var9, var12, var13, var12};
    }

    cs(ln param0, ln param1, int param2) {
        try {
            ((cs) this).field_k = param1;
            ((cs) this).field_m = param2;
            ((cs) this).field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "cs.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static void a(byte param0) {
        an.field_b = new aa();
        if (param0 <= 64) {
          cs.a(14);
          ae.field_f.b((vg) (Object) an.field_b, -88);
          return;
        } else {
          ae.field_f.b((vg) (Object) an.field_b, -88);
          return;
        }
    }

    static {
    }
}
