/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends at {
    private int field_n;
    static sna field_l;
    static mu field_m;
    static int field_k;
    private ad field_j;
    static String field_p;
    static String field_o;

    final static String d(int param0) {
        if (param0 != 320) {
            return null;
        }
        return re.field_D;
    }

    final boolean c(byte param0) {
        ((mg) this).field_n = ((mg) this).field_n - 1;
        if (!((((mg) this).field_n - 1 ^ -1) < -1)) {
            this.d((byte) -56);
            return true;
        }
        int var2 = ((mg) this).field_n * (320 * (50 - ((mg) this).field_n)) / 2500;
        int var3 = -17 % ((param0 - 71) / 47);
        ((mg) this).field_j.field_k = var2;
        return false;
    }

    private final void d(byte param0) {
        if (param0 != -56) {
            field_o = null;
            ((mg) this).field_j.field_k = 0;
            return;
        }
        ((mg) this).field_j.field_k = 0;
    }

    final static be a(byte param0, int param1) {
        be var2 = null;
        if (param0 <= -114) {
          if (0 == (param1 ^ -1)) {
            return null;
          } else {
            var2 = jga.field_y[param1];
            return var2;
          }
        } else {
          return null;
        }
    }

    public static void e(int param0) {
        field_p = null;
        int var1 = 107 / ((param0 - 24) / 42);
        field_o = null;
        field_l = null;
        field_m = null;
    }

    mg(ad param0) {
        ((mg) this).field_n = 50;
        ((mg) this).field_j = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Flingstuff</col>";
        field_o = "New Game";
    }
}
