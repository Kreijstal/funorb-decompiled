/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static int field_f;
    private oi field_d;
    static String field_c;
    static boolean field_g;
    static o field_b;
    private wl field_a;
    static char[] field_e;

    final static int c(byte param0) {
        int var1 = 48 / ((-9 - param0) / 52);
        return -fe.field_l + sj.field_n;
    }

    final wl b(int param0) {
        wl var2 = null;
        var2 = ((pf) this).field_a;
        if (param0 == 35) {
          if (((pf) this).field_d.field_a == var2) {
            ((pf) this).field_a = null;
            return null;
          } else {
            ((pf) this).field_a = var2.field_b;
            return var2;
          }
        } else {
          field_c = null;
          if (((pf) this).field_d.field_a == var2) {
            ((pf) this).field_a = null;
            return null;
          } else {
            ((pf) this).field_a = var2.field_b;
            return var2;
          }
        }
    }

    final wl a(wl param0, int param1) {
        wl var3 = null;
        if (param1 >= -59) {
            field_b = null;
            if (param0 == null) {
                var3 = ((pf) this).field_d.field_a.field_b;
            } else {
                var3 = param0;
            }
            if (!(var3 != ((pf) this).field_d.field_a)) {
                ((pf) this).field_a = null;
                return null;
            }
            ((pf) this).field_a = var3.field_b;
            return var3;
        }
        if (param0 == null) {
            var3 = ((pf) this).field_d.field_a.field_b;
        } else {
            var3 = param0;
        }
        if (!(var3 != ((pf) this).field_d.field_a)) {
            ((pf) this).field_a = null;
            return null;
        }
        ((pf) this).field_a = var3.field_b;
        return var3;
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 < 107) {
            return -123;
        }
        int var3 = param0 >>> -1554317377;
        return (param0 - -var3) / param2 - var3;
    }

    final wl a(byte param0) {
        wl var2 = null;
        var2 = ((pf) this).field_d.field_a.field_b;
        if (((pf) this).field_d.field_a != var2) {
          ((pf) this).field_a = var2.field_b;
          if (param0 != 31) {
            ((pf) this).field_a = null;
            return var2;
          } else {
            return var2;
          }
        } else {
          ((pf) this).field_a = null;
          return null;
        }
    }

    final wl a(int param0, wl param1) {
        wl var3 = null;
        if (param1 != null) {
            var3 = param1;
        } else {
            var3 = ((pf) this).field_d.field_a.field_c;
        }
        if (!(var3 != ((pf) this).field_d.field_a)) {
            ((pf) this).field_a = null;
            return null;
        }
        int var4 = -120 % ((param0 - 11) / 37);
        ((pf) this).field_a = var3.field_c;
        return var3;
    }

    final wl a(boolean param0) {
        wl var2 = null;
        var2 = ((pf) this).field_a;
        if (var2 != ((pf) this).field_d.field_a) {
          ((pf) this).field_a = var2.field_c;
          if (!param0) {
            field_g = true;
            return var2;
          } else {
            return var2;
          }
        } else {
          ((pf) this).field_a = null;
          return null;
        }
    }

    final wl b(byte param0) {
        wl var2 = ((pf) this).field_d.field_a.field_c;
        int var3 = -75 / ((-15 - param0) / 61);
        if (!(((pf) this).field_d.field_a != var2)) {
            ((pf) this).field_a = null;
            return null;
        }
        ((pf) this).field_a = var2.field_c;
        return var2;
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 91) {
            field_f = -44;
            field_c = null;
            field_b = null;
            return;
        }
        field_c = null;
        field_b = null;
    }

    pf(oi param0) {
        ((pf) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Visit the Account Management section on the main site to view.";
        field_e = new char[]{(char)91, (char)93, (char)35};
    }
}
