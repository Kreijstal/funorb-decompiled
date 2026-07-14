/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nw {
    private tf field_e;
    static int field_d;
    static String field_c;
    static ut[] field_a;
    private gn field_f;
    static nu field_b;

    public static void c(byte param0) {
        int var1 = 119 / ((34 - param0) / 56);
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final gn a(byte param0, gn param1) {
        gn var3 = null;
        if (param1 != null) {
            var3 = param1;
        } else {
            var3 = ((nw) this).field_e.field_c.field_b;
        }
        if (param0 <= 82) {
            ((nw) this).field_f = null;
            if (!(((nw) this).field_e.field_c != var3)) {
                ((nw) this).field_f = null;
                return null;
            }
            ((nw) this).field_f = var3.field_b;
            return var3;
        }
        if (!(((nw) this).field_e.field_c != var3)) {
            ((nw) this).field_f = null;
            return null;
        }
        ((nw) this).field_f = var3.field_b;
        return var3;
    }

    final gn a(int param0, gn param1) {
        gn var3 = null;
        L0: {
          if (param1 == null) {
            var3 = ((nw) this).field_e.field_c.field_d;
            break L0;
          } else {
            var3 = param1;
            break L0;
          }
        }
        if (((nw) this).field_e.field_c == var3) {
          ((nw) this).field_f = null;
          return null;
        } else {
          if (param0 != 395869153) {
            return null;
          } else {
            ((nw) this).field_f = var3.field_d;
            return var3;
          }
        }
    }

    final gn a(byte param0) {
        int var2 = -27 % ((param0 - 9) / 40);
        gn var3 = ((nw) this).field_e.field_c.field_d;
        if (!(var3 != ((nw) this).field_e.field_c)) {
            ((nw) this).field_f = null;
            return null;
        }
        ((nw) this).field_f = var3.field_d;
        return var3;
    }

    final static void a(int param0, ut param1) {
        bw.field_e = new ut[4];
        bw.field_e[1] = param1;
        bw.field_e[0] = param1.b();
        bw.field_e[0].a();
        bw.field_e[2] = param1.b();
        int var2 = 50 % ((-82 - param0) / 42);
        bw.field_e[2].d();
        bw.field_e[3] = bw.field_e[2].f();
        du.field_e = param1.field_q;
        re.field_k = param1.field_w;
        kw.field_h = du.field_e >> 395869153;
    }

    final gn a(int param0) {
        gn var2 = null;
        Object var3 = null;
        if (param0 == 0) {
          var2 = ((nw) this).field_f;
          if (((nw) this).field_e.field_c == var2) {
            ((nw) this).field_f = null;
            return null;
          } else {
            ((nw) this).field_f = var2.field_d;
            return var2;
          }
        } else {
          var3 = null;
          nw.a(-36, (ut) null);
          var2 = ((nw) this).field_f;
          if (((nw) this).field_e.field_c == var2) {
            ((nw) this).field_f = null;
            return null;
          } else {
            ((nw) this).field_f = var2.field_d;
            return var2;
          }
        }
    }

    final gn b(int param0) {
        gn var2 = null;
        var2 = ((nw) this).field_e.field_c.field_b;
        if (param0 == 0) {
          if (var2 == ((nw) this).field_e.field_c) {
            ((nw) this).field_f = null;
            return null;
          } else {
            ((nw) this).field_f = var2.field_b;
            return var2;
          }
        } else {
          field_d = -67;
          if (var2 == ((nw) this).field_e.field_c) {
            ((nw) this).field_f = null;
            return null;
          } else {
            ((nw) this).field_f = var2.field_b;
            return var2;
          }
        }
    }

    final gn b(byte param0) {
        gn var2 = null;
        Object var3 = null;
        if (param0 == 46) {
          var2 = ((nw) this).field_f;
          if (var2 == ((nw) this).field_e.field_c) {
            ((nw) this).field_f = null;
            return null;
          } else {
            ((nw) this).field_f = var2.field_b;
            return var2;
          }
        } else {
          var3 = null;
          gn discarded$2 = ((nw) this).a((byte) -96, (gn) null);
          var2 = ((nw) this).field_f;
          if (var2 == ((nw) this).field_e.field_c) {
            ((nw) this).field_f = null;
            return null;
          } else {
            ((nw) this).field_f = var2.field_b;
            return var2;
          }
        }
    }

    nw(tf param0) {
        ((nw) this).field_e = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "increase buyout price by <%0>";
        field_d = 64;
    }
}
