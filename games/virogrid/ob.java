/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob {
    static String field_d;
    static String field_c;
    static String field_a;
    static String field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != 29137) {
          var2 = null;
          ob.a((byte) 35, (String) null);
          field_c = null;
          field_d = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_b = null;
          field_a = null;
          return;
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        hg var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        sa var11 = null;
        hg var12 = null;
        ka var13 = null;
        int[] var14 = null;
        ka var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 == 97) {
              var12 = sh.field_qb;
              var2 = var12.g(11132);
              if (var2 == 0) {
                var10 = cf.b(param0 ^ -30578);
                var18 = var10;
                var17 = var18;
                var16 = var17;
                var14 = var16;
                var3 = var14;
                var9 = var10;
                var4 = var9;
                var5 = var12;
                var6 = ((jc) (Object) var5).g(param0 + 11035);
                var7 = 0;
                L1: while (true) {
                  if (var6 <= var7) {
                    var15 = (ka) (Object) tf.field_a.a((byte) -24);
                    if (var15 == null) {
                      tn.a(false);
                      return;
                    } else {
                      var15.field_h = var3;
                      var15.field_g = var18[0];
                      var15.field_l = true;
                      var15.a(false);
                      break L0;
                    }
                  } else {
                    var9[var7] = ((jc) (Object) var5).d((byte) 103);
                    var7++;
                    continue L1;
                  }
                }
              } else {
                if (1 == var2) {
                  var11 = (sa) (Object) fj.field_b.a((byte) -89);
                  if (var11 != null) {
                    var11.a(false);
                    return;
                  } else {
                    tn.a(false);
                    return;
                  }
                } else {
                  if (2 != var2) {
                    int discarded$2 = 1;
                    int discarded$3 = 1;
                    en.a("A1: " + rg.a(), (Throwable) null);
                    tn.a(false);
                    return;
                  } else {
                    var13 = (ka) (Object) tf.field_a.a((byte) -127);
                    if (var13 == null) {
                      tn.a(false);
                      return;
                    } else {
                      var13.field_h = cf.b(-30481);
                      var13.field_l = true;
                      var13.field_g = var13.field_h[0];
                      var13.a(false);
                      return;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "ob.A(" + param0 + 41);
        }
    }

    final static void a(byte param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            var2_int = nl.field_u;
            var3 = hk.field_Jb;
            var4 = ti.field_h.field_C.b(param1, 500);
            var5 = ti.field_h.field_C.c(param1, 500) + 6;
            if (param0 >= -31) {
                ob.a((byte) 79);
            }
            var6 = 2 + var4 * pg.field_e;
            var7 = sh.b(0, 12, var2_int, var5);
            var8 = p.a(-1, var6, var3, 20);
            df.e(var7, var8, var5, var6, 0);
            df.b(var7 - -1, var8 + 1, var5 - 2, -2 + var6, 16777088);
            int discarded$0 = ti.field_h.field_C.a(param1, 3 + var7, -ti.field_h.field_C.field_H + var8 - (-1 + -rf.field_e), 500, 1000, 0, -1, 0, 0, pg.field_e);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ob.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0> cannot join; the game has started.";
        field_d = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_b = "Close";
        field_a = "Clan";
    }
}
