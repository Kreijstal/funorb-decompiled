/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    private ug field_a;
    static jd field_e;
    static tg field_d;
    static String field_c;
    static int[] field_f;
    private ug field_b;

    final static void e() {
        ge.field_c = 0;
        mh.field_Z = -1;
        nh.field_P = false;
        ha.field_b = -1;
        oc.field_b = null;
    }

    final int a(byte param0) {
        int var2 = 0;
        ug var3 = null;
        int var4 = 0;
        var4 = Bounce.field_N;
        var2 = 0;
        if (param0 != 12) {
          field_e = null;
          var3 = ((ml) this).field_a.field_l;
          L0: while (true) {
            if (var3 == ((ml) this).field_a) {
              return var2;
            } else {
              var3 = var3.field_l;
              var2++;
              continue L0;
            }
          }
        } else {
          var3 = ((ml) this).field_a.field_l;
          L1: while (true) {
            if (var3 == ((ml) this).field_a) {
              return var2;
            } else {
              var3 = var3.field_l;
              var2++;
              continue L1;
            }
          }
        }
    }

    final ug d(int param0) {
        ug var2 = null;
        var2 = ((ml) this).field_a.field_l;
        if (param0 < -74) {
          if (var2 == ((ml) this).field_a) {
            ((ml) this).field_b = null;
            return null;
          } else {
            ((ml) this).field_b = var2.field_l;
            return var2;
          }
        } else {
          field_c = null;
          if (var2 == ((ml) this).field_a) {
            ((ml) this).field_b = null;
            return null;
          } else {
            ((ml) this).field_b = var2.field_l;
            return var2;
          }
        }
    }

    final void a(byte param0, ug param1) {
        if (!(param1.field_i == null)) {
            param1.a(92);
        }
        param1.field_l = ((ml) this).field_a;
        param1.field_i = ((ml) this).field_a.field_i;
        param1.field_i.field_l = param1;
        if (param0 != -78) {
            return;
        }
        try {
            param1.field_l.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "ml.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ug a(int param0) {
        ug var2 = null;
        var2 = ((ml) this).field_a.field_l;
        if (param0 == -1) {
          if (((ml) this).field_a == var2) {
            return null;
          } else {
            var2.a(param0 ^ -7);
            return var2;
          }
        } else {
          return null;
        }
    }

    public static void c(int param0) {
        field_f = null;
        field_c = null;
        field_d = null;
        if (param0 != -1) {
            ml.c(53);
            field_e = null;
            return;
        }
        field_e = null;
    }

    final ug b(int param0) {
        ug var2 = null;
        var2 = ((ml) this).field_b;
        if (((ml) this).field_a == var2) {
          ((ml) this).field_b = null;
          return null;
        } else {
          if (param0 != 0) {
            ug discarded$2 = ((ml) this).b(96);
            ((ml) this).field_b = var2.field_l;
            return var2;
          } else {
            ((ml) this).field_b = var2.field_l;
            return var2;
          }
        }
    }

    public ml() {
        ((ml) this).field_a = new ug();
        ((ml) this).field_a.field_i = ((ml) this).field_a;
        ((ml) this).field_a.field_l = ((ml) this).field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Confirm Password: ";
        field_f = new int[8192];
    }
}
