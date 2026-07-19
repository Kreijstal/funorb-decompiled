/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends q {
    private int field_m;
    private int field_k;
    private String field_o;
    static boolean field_p;
    private int field_j;
    private int field_l;
    static String[] field_n;

    public static void a(int param0) {
        boolean discarded$0 = false;
        if (param0 != 31238) {
            discarded$0 = sb.b(-114);
            field_n = null;
            return;
        }
        field_n = null;
    }

    final void a(byte param0) {
        if (param0 > -77) {
          return;
        } else {
          L0: {
            this.field_j = this.field_j - 2;
            this.field_m = this.field_m - this.field_l;
            if (-17 >= (this.field_j ^ -1)) {
              break L0;
            } else {
              this.f(0);
              break L0;
            }
          }
          return;
        }
    }

    final static boolean b(int param0) {
        if (param0 != -80) {
            return true;
        }
        return no.field_n.a((byte) -74);
    }

    final void c(int param0) {
        int var2 = 60 % ((param0 - -38) / 54);
        int discarded$0 = dd.field_c.a(this.field_o, -80 + this.field_k, this.field_m, 160, 1000, 16776960, -1, this.field_j, 1, 0, dd.field_c.field_t + dd.field_c.field_x);
    }

    sb(String param0, int param1, int param2, int param3) {
        try {
            this.field_m = param2;
            this.field_j = 255;
            this.field_k = param1;
            this.field_o = param0;
            this.field_l = param3;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "sb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_n = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
