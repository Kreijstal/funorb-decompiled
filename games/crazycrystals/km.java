/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km {
    static int field_c;
    private ij field_a;
    static int field_d;
    private ij field_b;
    static int field_e;
    static byte[] field_f;

    final ij a(int param0) {
        ij var2 = null;
        var2 = ((km) this).field_b;
        if (var2 != ((km) this).field_a) {
          ((km) this).field_b = var2.field_j;
          if (param0 <= 82) {
            km.e(44);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((km) this).field_b = null;
          return null;
        }
    }

    final int c(int param0) {
        int var4 = CrazyCrystals.field_B;
        int var2 = param0;
        ij var3 = ((km) this).field_a.field_j;
        while (var3 != ((km) this).field_a) {
            var3 = var3.field_j;
            var2++;
        }
        return var2;
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final void a(byte param0, ij param1) {
        if (param1.field_g == null) {
          param1.field_g = ((km) this).field_a.field_g;
          param1.field_j = ((km) this).field_a;
          if (param0 < 69) {
            return;
          } else {
            param1.field_g.field_j = param1;
            param1.field_j.field_g = param1;
            return;
          }
        } else {
          param1.a(1);
          param1.field_g = ((km) this).field_a.field_g;
          param1.field_j = ((km) this).field_a;
          if (param0 < 69) {
            return;
          } else {
            param1.field_g.field_j = param1;
            param1.field_j.field_g = param1;
            return;
          }
        }
    }

    final static boolean a(byte param0) {
        if (param0 >= -95) {
            return true;
        }
        return !gk.field_e.b(-45) ? true : false;
    }

    final ij d(int param0) {
        ij var2 = null;
        if (param0 == -4425) {
          var2 = ((km) this).field_a.field_j;
          if (((km) this).field_a == var2) {
            return null;
          } else {
            var2.a(1);
            return var2;
          }
        } else {
          ((km) this).field_a = null;
          var2 = ((km) this).field_a.field_j;
          if (((km) this).field_a == var2) {
            return null;
          } else {
            var2.a(1);
            return var2;
          }
        }
    }

    final ij b(int param0) {
        ij var2 = null;
        var2 = ((km) this).field_a.field_j;
        if (((km) this).field_a == var2) {
          ((km) this).field_b = null;
          return null;
        } else {
          if (param0 <= 106) {
            ((km) this).field_b = null;
            ((km) this).field_b = var2.field_j;
            return var2;
          } else {
            ((km) this).field_b = var2.field_j;
            return var2;
          }
        }
    }

    public static void e(int param0) {
        field_f = null;
        if (param0 != 0) {
            field_f = null;
        }
    }

    public km() {
        ((km) this).field_a = new ij();
        ((km) this).field_a.field_j = ((km) this).field_a;
        ((km) this).field_a.field_g = ((km) this).field_a;
    }

    static {
    }
}
