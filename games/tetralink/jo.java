/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jo {
    private gb field_d;
    static boolean field_a;
    static ah field_f;
    private gb field_c;
    static String field_b;
    static boolean field_e;

    final int d(int param0) {
        int var4 = TetraLink.field_J;
        int var2 = param0;
        gb var3 = ((jo) this).field_d.field_o;
        while (var3 != ((jo) this).field_d) {
            var3 = var3.field_o;
            var2++;
        }
        return var2;
    }

    final static boolean b(int param0) {
        if (param0 != 0) {
            return false;
        }
        if (hn.field_M == null) {
            return false;
        }
        if (!hn.field_M.d(0)) {
            return false;
        }
        return true;
    }

    public static void a(int param0) {
        if (param0 != 21332) {
            return;
        }
        field_b = null;
        field_f = null;
    }

    final gb a(boolean param0) {
        gb var2 = null;
        var2 = ((jo) this).field_c;
        if (((jo) this).field_d == var2) {
          ((jo) this).field_c = null;
          return null;
        } else {
          if (param0) {
            field_a = true;
            ((jo) this).field_c = var2.field_o;
            return var2;
          } else {
            ((jo) this).field_c = var2.field_o;
            return var2;
          }
        }
    }

    final gb a(byte param0) {
        int var2 = 0;
        gb var3 = null;
        var2 = 15 % ((param0 - 20) / 62);
        var3 = ((jo) this).field_d.field_o;
        if (var3 == ((jo) this).field_d) {
          ((jo) this).field_c = null;
          return null;
        } else {
          ((jo) this).field_c = var3.field_o;
          return var3;
        }
    }

    final gb c(int param0) {
        gb var2 = null;
        if (param0 == -15464) {
          var2 = ((jo) this).field_d.field_o;
          if (var2 == ((jo) this).field_d) {
            return null;
          } else {
            var2.e(0);
            return var2;
          }
        } else {
          return null;
        }
    }

    final static void a(int[] param0, int param1, int param2) {
        hg.field_f[param1] = param0;
        kk.field_X[param1] = new cl(param1);
        if (param2 != -13850) {
            field_a = true;
        }
    }

    public jo() {
        ((jo) this).field_d = new gb();
        ((jo) this).field_d.field_o = ((jo) this).field_d;
        ((jo) this).field_d.field_s = ((jo) this).field_d;
    }

    final void a(gb param0, int param1) {
        L0: {
          if (null != param0.field_s) {
            param0.e(param1 + 0);
            break L0;
          } else {
            break L0;
          }
        }
        param0.field_s = ((jo) this).field_d.field_s;
        param0.field_o = ((jo) this).field_d;
        param0.field_s.field_o = param0;
        param0.field_o.field_s = param0;
        if (param1 != 0) {
          field_b = null;
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You have not yet unlocked this option for use.";
    }
}
