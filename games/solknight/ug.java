/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ug {
    static String field_d;
    static String field_e;
    static volatile int field_a;
    static int field_f;
    String field_c;
    static hd field_g;
    int field_b;

    final java.net.Socket a(int param0) throws IOException {
        int var2 = 75 / ((param0 - 58) / 57);
        return new java.net.Socket(((ug) this).field_c, ((ug) this).field_b);
    }

    final static ud a(byte param0, sh param1, int param2) {
        Object var4 = null;
        if (param0 != -76) {
          var4 = null;
          ud discarded$2 = ug.a((byte) -126, (sh) null, -3);
          return qb.a(true, qi.a(param1, 100, param2));
        } else {
          return qb.a(true, qi.a(param1, 100, param2));
        }
    }

    final static o[] a(int param0, int param1, int param2, int param3, int param4) {
        o[] var5 = null;
        o[] var6 = null;
        var6 = new o[9];
        var5 = var6;
        o dupTemp$4 = ib.a(param2, true, param4);
        var6[6] = dupTemp$4;
        var5[3] = dupTemp$4;
        var5[2] = dupTemp$4;
        var5[1] = dupTemp$4;
        var5[0] = dupTemp$4;
        o dupTemp$5 = ib.a(param2, true, param3);
        var6[8] = dupTemp$5;
        var5[7] = dupTemp$5;
        var5[5] = dupTemp$5;
        if (param1 == -8591) {
          if (-1 != (param0 ^ -1)) {
            var6[4] = ib.a(64, true, param0);
            return var5;
          } else {
            return var5;
          }
        } else {
          return null;
        }
    }

    public static void b(int param0) {
        Object var2 = null;
        field_d = null;
        field_e = null;
        if (param0 != 100) {
          var2 = null;
          ug.a((hi) null, 114, 25, 55, (byte) -101, (hi) null);
          field_g = null;
          return;
        } else {
          field_g = null;
          return;
        }
    }

    abstract java.net.Socket a(byte param0) throws IOException;

    final static void a(hi param0, int param1, int param2, int param3, byte param4, hi param5) {
        ai.field_a = param5;
        kb.field_d = param0;
        vg.field_N = param3;
        int var6 = 57 % ((param4 - 32) / 62);
        bl.field_i = param2;
        g.field_l = param1;
    }

    final static ia a(String param0, int param1) {
        String var2 = null;
        ia var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = SolKnight.field_L ? 1 : 0;
        if (null != lc.field_m) {
          var6 = (CharSequence) (Object) param0;
          var2 = jg.a(var6, -2);
          if (param1 >= 103) {
            L0: {
              if (var2 == null) {
                var2 = param0;
                break L0;
              } else {
                break L0;
              }
            }
            var3 = (ia) (Object) lc.field_m.a((long)var2.hashCode(), true);
            L1: while (true) {
              if (var3 != null) {
                L2: {
                  var7 = (CharSequence) (Object) var3.field_ib;
                  var4 = jg.a(var7, -2);
                  if (var4 == null) {
                    var4 = var3.field_ib;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (!var4.equals((Object) (Object) var2)) {
                  var3 = (ia) (Object) lc.field_m.a((byte) -9);
                  continue L1;
                } else {
                  return var3;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Unpacking sound effects";
        field_a = 0;
    }
}
