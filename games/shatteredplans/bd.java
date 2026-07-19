/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends qk {
    static qr field_E;
    static boolean field_A;
    static bi[] field_C;
    static String field_F;
    static bi field_D;
    private int field_B;
    static bi field_G;

    final void a(int param0) {
        int discarded$2 = 0;
        int var2 = 0;
        if (!this.field_s) {
          return;
        } else {
          if (this.field_u != null) {
            discarded$2 = rs.field_Cb.a(this.field_u, this.field_k, this.field_t, this.field_m, 480, 16777215, -1, this.field_B, 0, rs.field_Cb.field_J);
            var2 = 40 % ((param0 - 67) / 47);
            return;
          } else {
            var2 = 40 % ((param0 - 67) / 47);
            return;
          }
        }
    }

    bd(int param0, int param1, int param2, int param3, String param4, int param5) {
        super(param0, param1, param2, param3, param4);
        try {
            this.field_B = param5;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "bd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final void a(int param0, String param1, int param2) {
        try {
            if (param2 != 16777215) {
                this.field_B = 50;
            }
            this.field_u = param1;
            this.field_B = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "bd.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void h(int param0) {
        field_E = null;
        if (param0 > -104) {
          field_F = (String) null;
          field_G = null;
          field_D = null;
          field_C = null;
          field_F = null;
          return;
        } else {
          field_G = null;
          field_D = null;
          field_C = null;
          field_F = null;
          return;
        }
    }

    static {
        field_A = false;
        field_F = "Report abuse";
    }
}
