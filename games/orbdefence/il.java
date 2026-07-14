/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static nk field_f;
    private o field_b;
    static String field_d;
    static boolean field_a;
    static hj[] field_e;
    private o field_c;

    final o b(int param0) {
        o var2 = null;
        var2 = ((il) this).field_c;
        if (var2 == ((il) this).field_b) {
          ((il) this).field_c = null;
          return null;
        } else {
          ((il) this).field_c = var2.field_f;
          if (param0 != 0) {
            return null;
          } else {
            return var2;
          }
        }
    }

    final int a(byte param0) {
        int var2 = 0;
        o var3 = null;
        int var4 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 != -4) {
          return -79;
        } else {
          var2 = 0;
          var3 = ((il) this).field_b.field_f;
          L0: while (true) {
            if (var3 == ((il) this).field_b) {
              return var2;
            } else {
              var3 = var3.field_f;
              var2++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, o param1) {
        Object var4 = null;
        L0: {
          if (null != param1.field_g) {
            param1.c(-1);
            break L0;
          } else {
            break L0;
          }
        }
        param1.field_g = ((il) this).field_b.field_g;
        param1.field_f = ((il) this).field_b;
        param1.field_g.field_f = param1;
        param1.field_f.field_g = param1;
        if (param0 >= -39) {
          var4 = null;
          ((il) this).a(-33, (o) null);
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != 0) {
            return;
        }
        mc.field_g = param0;
    }

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        field_d = null;
        if (param0 != 0) {
            field_a = false;
        }
    }

    final o c(int param0) {
        o var2 = null;
        if (param0 == 30664) {
          var2 = ((il) this).field_b.field_f;
          if (((il) this).field_b == var2) {
            return null;
          } else {
            var2.c(param0 ^ -30665);
            return var2;
          }
        } else {
          o discarded$2 = ((il) this).b(40);
          var2 = ((il) this).field_b.field_f;
          if (((il) this).field_b == var2) {
            return null;
          } else {
            var2.c(param0 ^ -30665);
            return var2;
          }
        }
    }

    public il() {
        ((il) this).field_b = new o();
        ((il) this).field_b.field_g = ((il) this).field_b;
        ((il) this).field_b.field_f = ((il) this).field_b;
    }

    final o b(byte param0) {
        o var2 = null;
        Object var3 = null;
        if (param0 == 46) {
          var2 = ((il) this).field_b.field_f;
          if (var2 == ((il) this).field_b) {
            ((il) this).field_c = null;
            return null;
          } else {
            ((il) this).field_c = var2.field_f;
            return var2;
          }
        } else {
          var3 = null;
          ((il) this).a(49, (o) null);
          var2 = ((il) this).field_b.field_f;
          if (var2 == ((il) this).field_b) {
            ((il) this).field_c = null;
            return null;
          } else {
            ((il) this).field_c = var2.field_f;
            return var2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Return to game";
    }
}
