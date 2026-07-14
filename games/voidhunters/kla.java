/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kla {
    private sja field_e;
    private int[] field_g;
    private ha field_f;
    private aja field_c;
    static dfa field_d;
    private sja field_a;
    static String field_b;

    private final void a(aja param0, int param1, boolean param2) {
        L0: {
          this.b(-117);
          if (((kla) this).field_c != null) {
            ((kla) this).field_f.j();
            break L0;
          } else {
            break L0;
          }
        }
        ((kla) this).field_f.a(param0, param2);
        if (param1 != 4) {
          field_d = null;
          ((kla) this).field_c = param0;
          return;
        } else {
          ((kla) this).field_c = param0;
          return;
        }
    }

    final void a(boolean param0) {
        sja var2 = null;
        sja var3 = null;
        if (((kla) this).field_e.field_k != ((kla) this).field_c) {
          ((kla) this).field_f.j();
          if (null == ((kla) this).field_e.field_k) {
            ((kla) this).field_c = ((kla) this).field_e.field_k;
            ((kla) this).field_f.KA(((kla) this).field_e.field_h, ((kla) this).field_e.field_f, ((kla) this).field_e.field_l, ((kla) this).field_e.field_a);
            if (param0) {
              var3 = ((kla) this).field_e;
              var2 = var3;
              ((kla) this).field_e = ((kla) this).field_e.field_e;
              var3.field_e = ((kla) this).field_a;
              var3.field_k = null;
              ((kla) this).field_a = var3;
              return;
            } else {
              this.b(0);
              var3 = ((kla) this).field_e;
              var2 = var3;
              ((kla) this).field_e = ((kla) this).field_e.field_e;
              var3.field_e = ((kla) this).field_a;
              var3.field_k = null;
              ((kla) this).field_a = var3;
              return;
            }
          } else {
            ((kla) this).field_f.a(((kla) this).field_e.field_k, true);
            ((kla) this).field_c = ((kla) this).field_e.field_k;
            ((kla) this).field_f.KA(((kla) this).field_e.field_h, ((kla) this).field_e.field_f, ((kla) this).field_e.field_l, ((kla) this).field_e.field_a);
            if (!param0) {
              this.b(0);
              var3 = ((kla) this).field_e;
              var2 = var3;
              ((kla) this).field_e = ((kla) this).field_e.field_e;
              var3.field_e = ((kla) this).field_a;
              var3.field_k = null;
              ((kla) this).field_a = var3;
              return;
            } else {
              var3 = ((kla) this).field_e;
              var2 = var3;
              ((kla) this).field_e = ((kla) this).field_e.field_e;
              var3.field_e = ((kla) this).field_a;
              var3.field_k = null;
              ((kla) this).field_a = var3;
              return;
            }
          }
        } else {
          ((kla) this).field_f.KA(((kla) this).field_e.field_h, ((kla) this).field_e.field_f, ((kla) this).field_e.field_l, ((kla) this).field_e.field_a);
          if (param0) {
            var3 = ((kla) this).field_e;
            var2 = var3;
            ((kla) this).field_e = ((kla) this).field_e.field_e;
            var3.field_e = ((kla) this).field_a;
            var3.field_k = null;
            ((kla) this).field_a = var3;
            return;
          } else {
            this.b(0);
            var3 = ((kla) this).field_e;
            var2 = var3;
            ((kla) this).field_e = ((kla) this).field_e.field_e;
            var3.field_e = ((kla) this).field_a;
            var3.field_k = null;
            ((kla) this).field_a = var3;
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 > -3) {
            return;
        }
        this.b(-127);
        ((kla) this).field_f.T(param0, param2, param1, param3);
    }

    private final void b(int param0) {
        sja var2 = null;
        L0: {
          ((kla) this).field_f.K(((kla) this).field_g);
          if (null != ((kla) this).field_a) {
            var2 = ((kla) this).field_a;
            ((kla) this).field_a = ((kla) this).field_a.field_e;
            break L0;
          } else {
            var2 = new sja();
            break L0;
          }
        }
        var2.a(((kla) this).field_g[2], ((kla) this).field_e, ((kla) this).field_g[3], ((kla) this).field_c, 4096, ((kla) this).field_g[1], ((kla) this).field_g[0]);
        if (param0 >= -25) {
          return;
        } else {
          ((kla) this).field_e = var2;
          return;
        }
    }

    final void a(aja param0, int param1) {
        this.a(param0, param1 + 4, false);
        if (param1 != 0) {
            ((kla) this).field_e = null;
        }
    }

    public static void a(int param0) {
        if (param0 <= 37) {
            field_d = null;
            field_b = null;
            field_d = null;
            return;
        }
        field_b = null;
        field_d = null;
    }

    kla(ha param0) {
        ((kla) this).field_g = new int[4];
        ((kla) this).field_c = null;
        ((kla) this).field_f = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new dfa();
        field_b = "More missile defence";
    }
}
