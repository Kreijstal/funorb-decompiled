/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    private nm field_f;
    static int[][] field_e;
    private vl field_g;
    static int field_a;
    static jp[][] field_d;
    static int[][] field_c;
    static mf field_i;
    static int[][] field_h;
    static jp field_b;

    public static void c(int param0) {
        field_b = null;
        field_i = null;
        field_d = null;
        field_h = null;
        field_e = null;
        if (param0 <= 23) {
          field_i = null;
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    final nm a(boolean param0) {
        nm var2 = null;
        var2 = ((kh) this).field_g.field_e.field_b;
        if (param0) {
          if (var2 == ((kh) this).field_g.field_e) {
            ((kh) this).field_f = null;
            return null;
          } else {
            ((kh) this).field_f = var2.field_b;
            return var2;
          }
        } else {
          nm discarded$7 = ((kh) this).a(-11);
          if (var2 == ((kh) this).field_g.field_e) {
            ((kh) this).field_f = null;
            return null;
          } else {
            ((kh) this).field_f = var2.field_b;
            return var2;
          }
        }
    }

    final nm d(int param0) {
        if (param0 != -24706) {
            return null;
        }
        nm var2 = ((kh) this).field_f;
        if (!(((kh) this).field_g.field_e != var2)) {
            ((kh) this).field_f = null;
            return null;
        }
        ((kh) this).field_f = var2.field_b;
        return var2;
    }

    kh(vl param0) {
        ((kh) this).field_g = param0;
    }

    final nm b(int param0) {
        nm var2 = null;
        if (param0 != 7) {
            Object var3 = null;
            nm discarded$0 = ((kh) this).b(16, (nm) null);
            var2 = ((kh) this).field_f;
            if (!(var2 != ((kh) this).field_g.field_e)) {
                ((kh) this).field_f = null;
                return null;
            }
            ((kh) this).field_f = var2.field_e;
            return var2;
        }
        var2 = ((kh) this).field_f;
        if (!(var2 != ((kh) this).field_g.field_e)) {
            ((kh) this).field_f = null;
            return null;
        }
        ((kh) this).field_f = var2.field_e;
        return var2;
    }

    final nm a(int param0) {
        nm var2 = null;
        var2 = ((kh) this).field_g.field_e.field_e;
        if (var2 == ((kh) this).field_g.field_e) {
          ((kh) this).field_f = null;
          return null;
        } else {
          ((kh) this).field_f = var2.field_e;
          if (param0 != 240) {
            return null;
          } else {
            return var2;
          }
        }
    }

    final nm b(int param0, nm param1) {
        nm var3 = null;
        L0: {
          if (param1 != null) {
            var3 = param1;
            break L0;
          } else {
            var3 = ((kh) this).field_g.field_e.field_b;
            break L0;
          }
        }
        if (param0 == 16802) {
          if (var3 == ((kh) this).field_g.field_e) {
            ((kh) this).field_f = null;
            return null;
          } else {
            ((kh) this).field_f = var3.field_b;
            return var3;
          }
        } else {
          nm discarded$7 = ((kh) this).d(-118);
          if (var3 == ((kh) this).field_g.field_e) {
            ((kh) this).field_f = null;
            return null;
          } else {
            ((kh) this).field_f = var3.field_b;
            return var3;
          }
        }
    }

    final nm a(int param0, nm param1) {
        nm var3 = null;
        L0: {
          if (param1 == null) {
            var3 = ((kh) this).field_g.field_e.field_e;
            break L0;
          } else {
            var3 = param1;
            break L0;
          }
        }
        if (((kh) this).field_g.field_e == var3) {
          ((kh) this).field_f = null;
          return null;
        } else {
          ((kh) this).field_f = var3.field_e;
          if (param0 < 100) {
            return null;
          } else {
            return var3;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[5][];
        field_c = new int[5][];
        field_h = new int[5][];
        field_c[0] = new int[1];
        field_c[3] = new int[5];
        field_c[4] = new int[5];
        field_c[2] = new int[5];
        field_c[1] = new int[2];
        field_e[4] = new int[5];
        field_e[3] = new int[5];
        field_e[2] = new int[5];
        field_e[1] = new int[2];
        field_e[0] = new int[1];
        field_h[0] = new int[1];
        field_h[2] = new int[5];
        field_h[4] = new int[5];
        field_h[3] = new int[5];
        field_h[1] = new int[2];
    }
}
