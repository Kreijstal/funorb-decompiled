/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wdb extends llb {
    static llb field_Ab;
    llb field_zb;
    static int field_vb;
    soa field_xb;
    llb field_wb;
    llb field_yb;

    wdb(long param0, wdb param1, String param2, String param3) {
        this(param0, param1, param1.field_xb.field_xb, param1.field_xb.field_vb, param1.field_wb, param2, param3);
    }

    wdb(long param0, llb param1, llb param2, pjb param3, llb param4, String param5, String param6) {
        super(param0, param1);
        try {
            this.field_yb = new llb(0L, (llb) null);
            this.field_xb = new soa(0L, this.field_yb, param2, param3);
            this.field_wb = new llb(0L, param4);
            this.field_zb = new llb(0L, param4);
            this.field_wb.field_R = param5;
            this.field_zb.field_R = param6;
            this.b(-561, this.field_xb);
            this.b(-561, this.field_wb);
            this.b(-561, this.field_zb);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "wdb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(byte param0) {
        field_Ab = null;
        if (param0 < 126) {
            field_vb = 24;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = (this.field_hb + param0) / 2;
        var6 = -param1 + this.field_G;
        this.field_xb.a(this.field_hb, param0, -1, -param0 + var6, 0, 0, param2);
        this.field_wb.field_K = var6;
        this.field_wb.field_L = 0;
        this.field_wb.field_hb = -param0 + var5;
        if (param3 != 63) {
          this.a(84, -31, 113, -108, 43, -89, 51, 115);
          this.field_wb.field_G = param1;
          this.field_zb.field_K = var6;
          this.field_zb.field_L = var5;
          this.field_zb.field_hb = this.field_hb + -var5;
          this.field_zb.field_G = param1;
          return;
        } else {
          this.field_wb.field_G = param1;
          this.field_zb.field_K = var6;
          this.field_zb.field_L = var5;
          this.field_zb.field_hb = this.field_hb + -var5;
          this.field_zb.field_G = param1;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_G = param4;
        this.field_K = param1;
        this.field_hb = param5;
        if (param6 != 0) {
          this.a(-108, 59, -20, (byte) -43);
          this.field_L = param0;
          this.a(param7, param2, param3, (byte) 63);
          return;
        } else {
          this.field_L = param0;
          this.a(param7, param2, param3, (byte) 63);
          return;
        }
    }

    static {
        field_vb = 0;
    }
}
