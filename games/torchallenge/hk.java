/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk {
    static int[][][][] field_a;
    static boolean field_b;
    static int[] field_c;
    static int field_e;
    static boolean field_d;

    final static void a(int param0) {
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        fe var3 = null;
        int var4 = 0;
        int var6 = 0;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          var4 = -1;
          if (sh.field_r == 0) {
            return;
          }
          db.g(-56);
          for (var5 = 0; var5 < 2; var5++) {
            if (fk.field_u[var5] > 0) {
              fk.field_u[var5] = fk.field_u[var5] - 1;
            }
            boolean decompiledFrameRemainder0 = true;
            if (0 >= fh.field_h[var5]) {
              if (tg.field_r[var5] != null &&
                wh.field_d[var5]) {
                je.a((byte) 15, tg.field_r[var5]);
              }
              wh.field_d[var5] = false;
            } else {
              var2 = fj.field_p[var5];
              if (ea.field_g != null &&
                var2 >= 0 &&
                ea.field_g.length > var2) {
                var1_int = fh.field_h[var5];
                if (tg.field_r[var5] == null) {
                  if (var5 == 0) {
                    var4 = 11;
                  }
                  if (var5 == 1) {
                    var4 = 12;
                  }
                  decompiledFrameRemainder0 = !(var4 < 0);
                  if (decompiledFrameRemainder0) {
                    var3 = cj.field_h[var4];
                    tg.field_r[var5] = nc.a(var3, 100, var1_int);
                    tg.field_r[var5].e(-1);
                    tg.field_r[var5].e(0, var3.field_k.length);
                    da.field_g[var5] = we.a(tg.field_r[var5], 6222);
                    wh.field_d[var5] = true;
                    fk.field_u[var5] = 25;
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (!wh.field_d[var5]) {
                    tg.field_r[var5].h(var1_int);
                    da.field_g[var5] = we.a(tg.field_r[var5], 6222);
                    wh.field_d[var5] = true;
                    fk.field_u[var5] = 25;
                  }
                  if (wh.field_d[var5] &&
                    fk.field_u[var5] == 0) {
                    tg.field_r[var5].f(25, var1_int);
                    fk.field_u[var5] = 25;
                  }
                }
              }
            }
          }
          if (param0 <= 93) {
            hk.a(-56);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "hk.A(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_a = (int[][][][]) null;
        if (param0 != 0) {
          field_c = (int[]) null;
        }
    }

    static {
        field_c = new int[3];
        field_a = new int[][][][]{new int[][][]{new int[][]{new int[]{-1, -1}, new int[]{-1, -1}, new int[]{-1, -1}, new int[]{-1, -1}, new int[]{-1, -1}, new int[]{0, 0}}, new int[][]{new int[]{-1, 0}}, new int[][]{new int[]{-1, 0}}, new int[][]{new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{17, 0}, new int[]{17, 0}}, new int[][]{new int[]{-1, 0}}, new int[][]{new int[]{-1, 0}}, new int[][]{new int[]{-1, 0}}}, new int[][][]{new int[][]{new int[]{-1, -1}, new int[]{-1, -1}, new int[]{-1, -1}, new int[]{-1, -1}, new int[]{-1, -1}, new int[]{4, 0}}, new int[][]{new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{5, 0}}, new int[][]{new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{3, 0}}, new int[][]{new int[]{-1, 0}}, new int[][]{new int[]{-1, 0}}, new int[][]{new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{0, 0}}, new int[][]{new int[]{-1, 0}}}, new int[][][]{new int[][]{new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{0, 0}}, new int[][]{new int[]{-1, 0}}, new int[][]{new int[]{-1, 0}}, new int[][]{new int[]{-1, 0}}, new int[][]{new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{0, 0}}, new int[][]{new int[]{-1, 0}}, new int[][]{new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{0, 0}}}};
        field_b = false;
    }
}
