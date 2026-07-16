/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends l {
    static boolean field_n;
    static he field_h;
    static int field_k;
    static String field_i;
    static int field_l;
    static int field_g;
    int field_o;
    static String field_m;
    int field_j;

    final static void a(int param0, eh param1) {
        gj var2 = null;
        if (param0 != 1048576) {
          return;
        } else {
          gj.a(param1.a("headers.packvorbis", 100, ""));
          var2 = gj.a(param1, "jagex logo2.packvorbis", "");
          ml discarded$2 = var2.a();
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 < 45) {
          field_g = 115;
          field_h = null;
          field_i = null;
          field_m = null;
          return;
        } else {
          field_h = null;
          field_i = null;
          field_m = null;
          return;
        }
    }

    final static void a(int param0, int param1, boolean param2, sc param3) {
        Object var4 = null;
        Throwable var5 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (null == wc.field_f) {
            break L0;
          } else {
            wl.a(1048576, param0 + -10509, param1, param3, param2);
            break L0;
          }
        }
        if (param0 == -1) {
          if (vg.field_B != null) {
            var4 = (Object) (Object) ae.field_g;
            synchronized (var4) {
              L1: {
                vg.field_B.a(param1, true, -1);
                if (param3 != qi.field_b) {
                  L2: {
                    vg.field_B.c(false);
                    ae.field_g.h();
                    qi.field_b = param3;
                    if (null == qi.field_b) {
                      break L2;
                    } else {
                      vg.field_B.a(param2, 37, qi.field_b);
                      break L2;
                    }
                  }
                  break L1;
                } else {
                  return;
                }
              }
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, boolean param1) {
        ab var2 = null;
        Object var3 = null;
        we.field_c.a(param1, 24960);
        var2 = fh.field_c;
        if (param0 >= -60) {
          L0: {
            var3 = null;
            la.a(22, -99, true, (sc) null);
            if (var2 != null) {
              var2.a(0, we.field_c.field_J, we.field_c.field_Bb);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (var2 != null) {
              var2.a(0, we.field_c.field_J, we.field_c.field_Bb);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    private la() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Ask to join <%0>'s game";
        field_n = false;
        field_m = "Hide game chat";
        field_g = 0;
    }
}
