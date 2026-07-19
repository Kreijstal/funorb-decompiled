/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hla extends jea {
    jea field_yb;
    jea field_tb;
    jea field_wb;
    iv field_vb;
    static int field_xb;
    static ji field_ub;

    public static void f(int param0) {
        if (param0 != 23613) {
            hla.f(-65);
            field_ub = null;
            return;
        }
        field_ub = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = (param3 + this.field_G) / 2;
        int var6 = this.field_t - param0;
        this.field_vb.a(this.field_G, param3, (byte) 127, 0, param1, -param3 + var6, 0);
        this.field_yb.field_G = var5 + -param3;
        this.field_yb.field_qb = param2;
        this.field_yb.field_t = param0;
        this.field_yb.field_T = var6;
        this.field_wb.field_T = var6;
        this.field_wb.field_qb = var5;
        this.field_wb.field_t = param0;
        this.field_wb.field_G = this.field_G - var5;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_T = param4;
        if (param2 >= -122) {
          hla.f(-42);
          this.field_t = param6;
          this.field_qb = param3;
          this.field_G = param7;
          this.a(param1, param0, 0, param5);
          return;
        } else {
          this.field_t = param6;
          this.field_qb = param3;
          this.field_G = param7;
          this.a(param1, param0, 0, param5);
          return;
        }
    }

    hla(long param0, jea param1, jea param2, oj param3, jea param4, String param5, String param6) {
        super(param0, param1);
        try {
            this.field_tb = new jea(0L, (jea) null);
            this.field_vb = new iv(0L, this.field_tb, param2, param3);
            this.field_yb = new jea(0L, param4);
            this.field_wb = new jea(0L, param4);
            this.field_yb.field_r = param5;
            this.field_wb.field_r = param6;
            this.b(-124, this.field_vb);
            this.b(-124, this.field_yb);
            this.b(-126, this.field_wb);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "hla.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    hla(long param0, hla param1, String param2, String param3) {
        this(param0, param1, param1.field_vb.field_vb, param1.field_vb.field_wb, param1.field_yb, param2, param3);
    }

    static {
        field_xb = -1;
        field_ub = new ji(8);
    }
}
