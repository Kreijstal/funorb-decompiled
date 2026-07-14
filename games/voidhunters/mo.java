/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo extends ub implements ntb {
    String field_i;
    static String field_j;

    public final void a(faa param0, boolean param1) {
        param0.f((byte) -74);
        ((mo) this).field_i = param0.g(-1609246200);
        if (param1) {
            return;
        }
        param0.p(-23497);
    }

    mo() {
    }

    public final void b(byte param0, tv param1) {
        Object var4 = null;
        mo var6 = null;
        mo var7 = null;
        var6 = (mo) (Object) param1;
        var7 = var6;
        if (param0 <= 54) {
          var4 = null;
          ((mo) this).b((byte) -13, (tv) null);
          var7.field_i = ((mo) this).field_i;
          return;
        } else {
          var7.field_i = ((mo) this).field_i;
          return;
        }
    }

    public static void d(byte param0) {
        field_j = null;
        if (param0 != 46) {
            field_j = null;
        }
    }

    public final void b(faa param0, int param1) {
        param0.r(32712);
        param0.b((byte) 0, ((mo) this).field_i);
        if (param1 >= -109) {
            return;
        }
        param0.q(-100);
    }

    mo(String param0) {
        ((mo) this).field_i = param0;
    }

    public final boolean a(byte param0, tv param1) {
        int var4 = 34 / ((param0 - 22) / 59);
        mo var3 = (mo) (Object) param1;
        return !var3.field_i.equals((Object) (Object) var3.field_i) ? true : false;
    }

    public final void a(tv param0, int param1) {
        Object var3 = null;
        mo var3_ref = null;
        int var4 = 0;
        var3 = null;
        if (param1 >= -19) {
          L0: {
            field_j = null;
            var3_ref = (mo) (Object) param0;
            var4 = 0;
            if (var3_ref.field_i.equals((Object) (Object) var3_ref.field_i)) {
              break L0;
            } else {
              iva.a(-6940, "String requeststring has changed. ");
              var4 = 1;
              break L0;
            }
          }
          L1: {
            if (var4 != 0) {
              tfb.a((byte) -116, "This instance of DebugRequest has changed");
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            var3_ref = (mo) (Object) param0;
            var4 = 0;
            if (var3_ref.field_i.equals((Object) (Object) var3_ref.field_i)) {
              break L2;
            } else {
              iva.a(-6940, "String requeststring has changed. ");
              var4 = 1;
              break L2;
            }
          }
          L3: {
            if (var4 != 0) {
              tfb.a((byte) -116, "This instance of DebugRequest has changed");
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Screen Size";
    }
}
