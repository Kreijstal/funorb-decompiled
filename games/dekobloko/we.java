/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class we {
    int field_f;
    static String field_c;
    static String field_g;
    static String field_e;
    static uf field_b;
    String field_d;
    static String field_a;

    final static void a(byte param0) {
        if (!gd.field_f) {
          if (param0 <= 46) {
            int discarded$4 = we.a(true);
            return;
          } else {
            return;
          }
        } else {
          bb.b(true);
          jd.g(74);
          d.a(true);
          gd.field_f = false;
          if (param0 > 46) {
            return;
          } else {
            int discarded$5 = we.a(true);
            return;
          }
        }
    }

    final static ck[] a(ji param0, int param1, int param2, int param3) {
        if (gb.a(param3, param0, param2, 115)) {
          if (param1 >= -123) {
            we.a((byte) 55);
            return de.c(false);
          } else {
            return de.c(false);
          }
        } else {
          return null;
        }
    }

    final java.net.Socket b(int param0) throws IOException {
        if (param0 != 2) {
            return null;
        }
        return new java.net.Socket(((we) this).field_d, ((we) this).field_f);
    }

    abstract java.net.Socket a(int param0) throws IOException;

    public static void b(byte param0) {
        field_g = null;
        field_e = null;
        if (param0 != -37) {
            return;
        }
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static int a(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = client.field_A ? 1 : 0;
        var1 = param0 ? 1 : 0;
        L0: while (true) {
          if (!ab.c((byte) 114)) {
            L1: {
              wj.field_Jb.a(pm.a(pm.field_f, -2141435999, bh.field_g), -20563, pm.a(nf.field_h, -2141435999, he.field_S));
              if (!wj.field_Jb.b((byte) 114)) {
                break L1;
              } else {
                var1 = 1;
                break L1;
              }
            }
            var2 = 0;
            if (var1 != 0) {
              if ((wj.field_Jb.field_h ^ -1) <= -1) {
                var2 = ef.field_T[wj.field_Jb.field_h];
                if (var2 != 2) {
                  return var2;
                } else {
                  ek.g(-1209);
                  return var2;
                }
              } else {
                return var2;
              }
            } else {
              return var2;
            }
          } else {
            wj.field_Jb.a(-38);
            if (!wj.field_Jb.b((byte) 114)) {
              continue L0;
            } else {
              var1 = 1;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "<%0> players want to draw. Hold 'F1' for details.";
        field_c = "achievements to collect";
        field_g = "Rematch!";
        field_a = "EXCLUSIVE";
    }
}
