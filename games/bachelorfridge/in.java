/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in {
    static String field_d;
    static double field_e;
    private eo field_a;
    private eo field_c;
    static kv field_b;

    final eo a(boolean param0) {
        eo var2 = null;
        var2 = ((in) this).field_a.field_m;
        if (((in) this).field_a != var2) {
          var2.b(0);
          if (!param0) {
            return null;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final int b(boolean param0) {
        int var2 = 0;
        eo var3 = null;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        var2 = 0;
        var3 = ((in) this).field_a.field_m;
        L0: while (true) {
          if (var3 == ((in) this).field_a) {
            if (!param0) {
              field_e = 0.13565851329759948;
              return var2;
            } else {
              return var2;
            }
          } else {
            var3 = var3.field_m;
            var2++;
            continue L0;
          }
        }
    }

    final eo a(int param0) {
        eo var2 = null;
        var2 = ((in) this).field_a.field_m;
        if (param0 < -73) {
          if (var2 == ((in) this).field_a) {
            ((in) this).field_c = null;
            return null;
          } else {
            ((in) this).field_c = var2.field_m;
            return var2;
          }
        } else {
          return null;
        }
    }

    final eo a(byte param0) {
        eo var2 = null;
        var2 = ((in) this).field_c;
        if (var2 != ((in) this).field_a) {
          ((in) this).field_c = var2.field_m;
          if (param0 < 80) {
            eo discarded$2 = ((in) this).a((byte) 52);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((in) this).field_c = null;
          return null;
        }
    }

    public in() {
        ((in) this).field_a = new eo();
        ((in) this).field_a.field_i = ((in) this).field_a;
        ((in) this).field_a.field_m = ((in) this).field_a;
    }

    public static void b(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != -1) {
            field_d = null;
        }
    }

    final void a(eo param0, byte param1) {
        if (!(param0.field_i == null)) {
            param0.b(0);
        }
        param0.field_i = ((in) this).field_a.field_i;
        param0.field_m = ((in) this).field_a;
        param0.field_i.field_m = param0;
        int var3 = -71 / ((param1 - 20) / 55);
        param0.field_m.field_i = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = -1.0;
        field_d = "<%0> is not a member, and cannot play with the current options.";
    }
}
