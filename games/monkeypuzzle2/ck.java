/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    static boolean field_e;
    private ug field_c;
    static int field_b;
    static String field_f;
    static le[] field_a;
    private pj field_h;
    static String field_d;
    static int[] field_g;

    public static void b(int param0) {
        field_a = null;
        if (param0 != 110) {
            return;
        }
        field_g = null;
        field_d = null;
        field_f = null;
    }

    final ug a(byte param0, ug param1) {
        ug var3 = null;
        if (param0 != -127) {
            field_e = false;
            if (param1 != null) {
                var3 = param1;
            } else {
                var3 = ((ck) this).field_h.field_f.field_d;
            }
            if (!(var3 != ((ck) this).field_h.field_f)) {
                ((ck) this).field_c = null;
                return null;
            }
            ((ck) this).field_c = var3.field_d;
            return var3;
        }
        if (param1 != null) {
            var3 = param1;
        } else {
            var3 = ((ck) this).field_h.field_f.field_d;
        }
        if (!(var3 != ((ck) this).field_h.field_f)) {
            ((ck) this).field_c = null;
            return null;
        }
        ((ck) this).field_c = var3.field_d;
        return var3;
    }

    final static le[] a(int param0, int param1) {
        le[] var2 = null;
        le[] var3 = null;
        var3 = new le[9];
        var2 = var3;
        var3[4] = sj.a(64, 74, param0);
        if (param1 != -14377) {
          field_g = null;
          return var2;
        } else {
          return var2;
        }
    }

    final ug a(boolean param0) {
        ug var2 = null;
        var2 = ((ck) this).field_c;
        if (var2 != ((ck) this).field_h.field_f) {
          if (!param0) {
            field_d = null;
            ((ck) this).field_c = var2.field_d;
            return var2;
          } else {
            ((ck) this).field_c = var2.field_d;
            return var2;
          }
        } else {
          ((ck) this).field_c = null;
          return null;
        }
    }

    final ug b(byte param0) {
        ug var2 = null;
        if (param0 <= -95) {
          var2 = ((ck) this).field_h.field_f.field_c;
          if (var2 == ((ck) this).field_h.field_f) {
            ((ck) this).field_c = null;
            return null;
          } else {
            ((ck) this).field_c = var2.field_c;
            return var2;
          }
        } else {
          return null;
        }
    }

    final ug a(int param0) {
        ug var2 = null;
        if (param0 != -3703) {
            ug discarded$0 = ((ck) this).a(false);
            var2 = ((ck) this).field_c;
            if (!(var2 != ((ck) this).field_h.field_f)) {
                ((ck) this).field_c = null;
                return null;
            }
            ((ck) this).field_c = var2.field_c;
            return var2;
        }
        var2 = ((ck) this).field_c;
        if (!(var2 != ((ck) this).field_h.field_f)) {
            ((ck) this).field_c = null;
            return null;
        }
        ((ck) this).field_c = var2.field_c;
        return var2;
    }

    ck(pj param0) {
        ((ck) this).field_h = param0;
    }

    final ug a(byte param0) {
        ug var2 = null;
        var2 = ((ck) this).field_h.field_f.field_d;
        if (var2 == ((ck) this).field_h.field_f) {
          ((ck) this).field_c = null;
          return null;
        } else {
          ((ck) this).field_c = var2.field_d;
          if (param0 != -37) {
            return null;
          } else {
            return var2;
          }
        }
    }

    final ug a(int param0, ug param1) {
        ug var3 = null;
        if (param0 != -11121) {
            field_e = true;
            if (param1 == null) {
                var3 = ((ck) this).field_h.field_f.field_c;
            } else {
                var3 = param1;
            }
            if (!(((ck) this).field_h.field_f != var3)) {
                ((ck) this).field_c = null;
                return null;
            }
            ((ck) this).field_c = var3.field_c;
            return var3;
        }
        if (param1 == null) {
            var3 = ((ck) this).field_h.field_f.field_c;
        } else {
            var3 = param1;
        }
        if (!(((ck) this).field_h.field_f != var3)) {
            ((ck) this).field_c = null;
            return null;
        }
        ((ck) this).field_c = var3.field_c;
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_g = new int[]{0, 110, 10, 100, 20, 90, 30, 80, 40, 70, 50, 60};
        field_d = "This password is part of your Player Name, and would be easy to guess";
    }
}
