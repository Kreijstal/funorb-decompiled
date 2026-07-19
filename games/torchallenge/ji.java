/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji extends da {
    static sl field_q;
    int field_o;
    int field_l;
    long field_x;
    int field_t;
    int field_s;
    int field_i;
    static String[] field_n;
    static ka[] field_p;
    int field_j;
    static lj field_r;
    static vh field_k;
    int[] field_w;
    int field_v;
    static String[] field_u;
    static wl field_m;
    static long field_y;

    public static void a(int param0) {
        if (param0 != 65535) {
          field_p = (ka[]) null;
          field_p = null;
          field_q = null;
          field_n = null;
          field_r = null;
          field_k = null;
          field_u = null;
          field_m = null;
          return;
        } else {
          field_p = null;
          field_q = null;
          field_n = null;
          field_r = null;
          field_k = null;
          field_u = null;
          field_m = null;
          return;
        }
    }

    final static void a(byte param0, int param1, ue param2) {
        pa var3 = null;
        try {
            var3 = dk.field_s;
            var3.d(25, param1);
            if (param0 <= 17) {
                ue var4 = (ue) null;
                ji.a((byte) -117, 1, (ue) null);
            }
            var3.d(param2.field_k, (byte) 122);
            var3.d(param2.field_m, (byte) 122);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "ji.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ji(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
            this.field_j = param5;
            this.field_v = param4;
            this.field_w = param6;
            this.field_i = param3;
            fieldTemp$0 = sa.field_a;
            sa.field_a = sa.field_a + 1;
            this.field_l = fieldTemp$0 & 65535;
            this.field_t = param1;
            this.field_o = param0;
            this.field_s = param2;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "ji.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_u = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_q = new sl();
    }
}
