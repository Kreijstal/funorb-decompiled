/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends RuntimeException {
    String field_c;
    static lj field_e;
    static String field_d;
    static hd field_b;
    Throwable field_a;
    static String field_f;
    static int[] field_g;
    private static String field_z;

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_g = null;
        if (param0 != 640) {
          return;
        }
        field_f = null;
        field_b = null;
    }

    jd(Throwable param0, String param1) {
        this.field_c = param1;
        this.field_a = param0;
    }

    final static void a(byte param0) {
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var8Lifetime1;
        int var9Lifetime1;
        int var8Lifetime1Lifetime1;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          var1_int = rf.field_ib;
          var4 = 0;
          var5 = 0;
          var6 = 50;
          if (rf.field_ib == 0 &&
            nd.field_e < 100) {
            var6 = 100;
          }
          if (nd.field_e >= var6) {
            if (nd.field_e > gh.field_n[rf.field_ib] - var6) {
              var4 = 1;
              var5 = (-nd.field_e + gh.field_n[rf.field_ib]) * 256 / var6;
            }
          } else {
            var4 = 1;
            var5 = 256 * nd.field_e / var6;
          }
          if (5 == rf.field_ib) {
            var4 = 1;
            var5 = 0;
          }
          if (5 > rf.field_ib) {
            bh.d((byte) -128);
          } else {
            var1_int = 4;
          }
          qg.f(0, 0, 640, 60, 1);
          qg.f(0, 419, 640, 60, 1);
          qg.a(pf.field_g);
          qg.a(0, 59, 640, 419);
          if (param0 != 68) {
            field_g = (int[]) null;
          }
          for (var8 = 0; s.field_l[var1_int] > var8; var8++) {
            var2 = -cg.field_e[0] + (gh.field_k[var1_int][var8][0] << 4);
            var3 = -cg.field_e[1] + (gh.field_k[var1_int][var8][1] + 59 << 4);
            ef.field_h[var1_int][var8].b(0, 0, var2, var3, 0, 4096);
          }
          qg.b(pf.field_g);
          if (var4 != 0) {
            dg.a(var5, true);
          }
          if (rf.field_ib < 5) {
            var8Lifetime1 = -1;
            var9 = -1;
            for (var10 = 0; var10 < dg.field_bb[rf.field_ib].length; var10++) {
              var8Lifetime1Lifetime1 = v.field_X[0][rf.field_ib][var10][0];
              var9Lifetime1 = v.field_X[1][rf.field_ib][var10][1];
              if (nd.field_e >= var8Lifetime1Lifetime1 &&
                var9Lifetime1 >= nd.field_e) {
                var7 = lc.a(var10, 1);
                if (0 > var7) {
                  tf.field_x.a(dg.field_bb[rf.field_ib][var10], 0, 420, 640, 60, 0, -1, 1, 1, 0);
                } else {
                  tf.field_x.a(dg.field_bb[rf.field_ib][var10], 0, 420, 640, 60, 0, -1, var7, 1, 1, 0);
                }
                return;
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), field_z + param0 + ')');
        }
    }

    static {
        field_z = "jd.B(";
        field_d = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_b = new hd();
        field_f = "From only <%0>/month";
        field_g = new int[]{10, 10, 5};
    }
}
