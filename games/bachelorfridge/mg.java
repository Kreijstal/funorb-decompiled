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
            return (String) null;
        }
        return re.field_D;
    }

    final boolean c(byte param0) {
        int fieldTemp$0 = this.field_n - 1;
        this.field_n = this.field_n - 1;
        if (!((fieldTemp$0 ^ -1) < -1)) {
            this.d((byte) -56);
            return true;
        }
        int var2 = this.field_n * (320 * (50 - this.field_n)) / 2500;
        int var3 = -17 % ((param0 - 71) / 47);
        this.field_j.field_k = var2;
        return false;
    }

    private final void d(byte param0) {
        if (param0 != -56) {
            field_o = (String) null;
            this.field_j.field_k = 0;
            return;
        }
        this.field_j.field_k = 0;
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
          return (be) null;
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
        try {
            this.field_n = 50;
            this.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "mg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = "Flingstuff</col>";
        field_o = "New Game";
    }
}
