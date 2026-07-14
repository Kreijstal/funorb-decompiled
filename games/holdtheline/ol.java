/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    private ln field_e;
    static uf field_h;
    static int field_f;
    static uf field_i;
    static int field_d;
    static int field_g;
    static ah field_b;
    static String field_a;
    private ln field_c;

    final void a(int param0, ln param1) {
        int var3 = 0;
        if (param1.field_l != null) {
          param1.a((byte) -42);
          param1.field_n = ((ol) this).field_e;
          param1.field_l = ((ol) this).field_e.field_l;
          var3 = 36 / ((param0 - 35) / 56);
          param1.field_l.field_n = param1;
          param1.field_n.field_l = param1;
          return;
        } else {
          param1.field_n = ((ol) this).field_e;
          param1.field_l = ((ol) this).field_e.field_l;
          var3 = 36 / ((param0 - 35) / 56);
          param1.field_l.field_n = param1;
          param1.field_n.field_l = param1;
          return;
        }
    }

    final static void a(boolean param0, byte param1) {
        cg.a((byte) -119, false, param0);
        int var2 = 99 % ((param1 - -21) / 62);
    }

    final int a(int param0) {
        int var5 = HoldTheLine.field_D;
        int var3 = -20 % ((param0 - -63) / 42);
        int var2 = 0;
        ln var4 = ((ol) this).field_e.field_n;
        while (((ol) this).field_e != var4) {
            var4 = var4.field_n;
            var2++;
        }
        return var2;
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 6985) {
          field_i = null;
          field_i = null;
          field_h = null;
          return;
        } else {
          field_i = null;
          field_h = null;
          return;
        }
    }

    final ln a(byte param0) {
        ln var2 = null;
        int var3 = 0;
        var3 = -20 / ((32 - param0) / 51);
        var2 = ((ol) this).field_e.field_n;
        if (((ol) this).field_e == var2) {
          return null;
        } else {
          var2.a((byte) -42);
          return var2;
        }
    }

    final static boolean b(byte param0) {
        if (param0 != 38) {
            field_i = null;
            return ra.field_Z.a(-42);
        }
        return ra.field_Z.a(-42);
    }

    final ln e(int param0) {
        ln var2 = null;
        int var3 = 0;
        var3 = -90 / ((23 - param0) / 32);
        var2 = ((ol) this).field_c;
        if (((ol) this).field_e == var2) {
          ((ol) this).field_c = null;
          return null;
        } else {
          ((ol) this).field_c = var2.field_n;
          return var2;
        }
    }

    final ln c(int param0) {
        ln var2 = null;
        if (param0 < 64) {
            Object var3 = null;
            ((ol) this).a(-122, (ln) null);
            var2 = ((ol) this).field_e.field_n;
            if (!(((ol) this).field_e != var2)) {
                ((ol) this).field_c = null;
                return null;
            }
            ((ol) this).field_c = var2.field_n;
            return var2;
        }
        var2 = ((ol) this).field_e.field_n;
        if (!(((ol) this).field_e != var2)) {
            ((ol) this).field_c = null;
            return null;
        }
        ((ol) this).field_c = var2.field_n;
        return var2;
    }

    final static void a(int param0, ah param1) {
        param1.a(-30510, mm.field_e);
        if (param0 != 256) {
            field_d = 120;
        }
    }

    final static boolean d(int param0) {
        if (param0 == 0) {
          if (!pj.b((byte) 87)) {
            if (0 < fc.field_a) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_f = 110;
          if (!pj.b((byte) 87)) {
            if (0 < fc.field_a) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public ol() {
        ((ol) this).field_e = new ln();
        ((ol) this).field_e.field_l = ((ol) this).field_e;
        ((ol) this).field_e.field_n = ((ol) this).field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 256;
        field_f = 0;
        field_b = new ah();
    }
}
