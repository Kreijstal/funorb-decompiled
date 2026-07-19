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
        String var2 = null;
        if (param0 != 29137) {
          var2 = (String) null;
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
        int[] var10 = null;
        int[] var11 = null;
        sa var12 = null;
        hg var13 = null;
        ka var14 = null;
        int[] var15 = null;
        Object var16 = null;
        ka var16_ref = null;
        int[] var17 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var16 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 == 97) {
              var13 = sh.field_qb;
              var2 = var13.g(11132);
              if (var2 == 0) {
                var11 = cf.b(param0 ^ -30578);
                var17 = var11;
                var15 = var17;
                var3 = var15;
                var10 = var11;
                var4 = var10;
                var5 = var13;
                var6 = ((jc) ((Object) var5)).g(param0 + 11035);
                var7 = 0;
                L1: while (true) {
                  if (var6 <= var7) {
                    var16_ref = (ka) ((Object) tf.field_a.a((byte) -24));
                    if (var16_ref == null) {
                      tn.a(false);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      var16_ref.field_h = var3;
                      var16_ref.field_g = var17[0];
                      var16_ref.field_l = true;
                      var16_ref.a(false);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    var10[var7] = ((jc) ((Object) var5)).d((byte) 103);
                    var7++;
                    continue L1;
                  }
                }
              } else {
                if (1 == var2) {
                  var12 = (sa) ((Object) fj.field_b.a((byte) -89));
                  if (var12 != null) {
                    var12.a(false);
                    return;
                  } else {
                    tn.a(false);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  if (2 != var2) {
                    en.a("A1: " + rg.a(true), (Throwable) null, 1);
                    tn.a(false);
                    return;
                  } else {
                    var14 = (ka) ((Object) tf.field_a.a((byte) -127));
                    if (var14 == null) {
                      tn.a(false);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var14.field_h = cf.b(-30481);
                      var14.field_l = true;
                      var14.field_g = var14.field_h[0];
                      var14.a(false);
                      return;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "ob.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
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
        int discarded$0 = 0;
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
            discarded$0 = ti.field_h.field_C.a(param1, 3 + var7, -ti.field_h.field_C.field_H + var8 - (-1 + -rf.field_e), 500, 1000, 0, -1, 0, 0, pg.field_e);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "ob.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "<%0> cannot join; the game has started.";
        field_d = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_b = "Close";
        field_a = "Clan";
    }
}
