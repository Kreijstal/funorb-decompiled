/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gtb implements ntb {
    static String field_a;
    private int field_b;
    static int field_c;
    static ij field_d;

    public final boolean a(byte param0, tv param1) {
        int var4 = 1 / ((param0 - 22) / 59);
        gtb var3 = (gtb) (Object) param1;
        return var3.field_b != var3.field_b ? true : false;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -88) {
            field_c = -87;
            field_d = null;
            return;
        }
        field_d = null;
    }

    public final void b(byte param0, tv param1) {
        if (param0 <= 54) {
            return;
        }
        gtb var5 = (gtb) (Object) param1;
        gtb var6 = var5;
        var6.field_b = var5.field_b;
    }

    public final void a(tv param0, int param1) {
        gtb var3 = null;
        int var4 = 0;
        var3 = (gtb) (Object) param0;
        if (param1 >= -19) {
          return;
        } else {
          L0: {
            var4 = 0;
            if (var3.field_b == var3.field_b) {
              break L0;
            } else {
              iva.a(-6940, "int playerid has changed. before=" + var3.field_b + ", now=" + var3.field_b);
              var4 = 1;
              break L0;
            }
          }
          L1: {
            if (var4 != 0) {
              iva.a(-6940, "This instance of PlayerReady has changed");
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    public final void a(faa param0, boolean param1) {
        Object var4 = null;
        if (param1) {
          var4 = null;
          ((gtb) this).a((faa) null, true);
          ((gtb) this).field_b = param0.i(0, 32);
          return;
        } else {
          ((gtb) this).field_b = param0.i(0, 32);
          return;
        }
    }

    gtb() {
    }

    public final void b(faa param0, int param1) {
        param0.a(-632, ((gtb) this).field_b, 32);
        if (param1 >= -109) {
            Object var4 = null;
            ((gtb) this).a((tv) null, -73);
        }
    }

    gtb(int param0) {
        ((gtb) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
    }
}
