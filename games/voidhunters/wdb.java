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
        this(param0, (llb) (Object) param1, param1.field_xb.field_xb, param1.field_xb.field_vb, param1.field_wb, param2, param3);
    }

    wdb(long param0, llb param1, llb param2, pjb param3, llb param4, String param5, String param6) {
        super(param0, param1);
        try {
            ((wdb) this).field_yb = new llb(0L, (llb) null);
            ((wdb) this).field_xb = new soa(0L, ((wdb) this).field_yb, param2, param3);
            ((wdb) this).field_wb = new llb(0L, param4);
            ((wdb) this).field_zb = new llb(0L, param4);
            ((wdb) this).field_wb.field_R = param5;
            ((wdb) this).field_zb.field_R = param6;
            ((wdb) this).b(-561, (llb) (Object) ((wdb) this).field_xb);
            ((wdb) this).b(-561, ((wdb) this).field_wb);
            ((wdb) this).b(-561, ((wdb) this).field_zb);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "wdb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(byte param0) {
        field_Ab = null;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = (((wdb) this).field_hb + param0) / 2;
        var6 = -param1 + ((wdb) this).field_G;
        ((wdb) this).field_xb.a(((wdb) this).field_hb, param0, -1, -param0 + var6, 0, 0, param2);
        ((wdb) this).field_wb.field_K = var6;
        ((wdb) this).field_wb.field_L = 0;
        ((wdb) this).field_wb.field_hb = -param0 + var5;
        if (param3 != 63) {
          ((wdb) this).a(84, -31, 113, -108, 43, -89, 51, 115);
          ((wdb) this).field_wb.field_G = param1;
          ((wdb) this).field_zb.field_K = var6;
          ((wdb) this).field_zb.field_L = var5;
          ((wdb) this).field_zb.field_hb = ((wdb) this).field_hb + -var5;
          ((wdb) this).field_zb.field_G = param1;
          return;
        } else {
          ((wdb) this).field_wb.field_G = param1;
          ((wdb) this).field_zb.field_K = var6;
          ((wdb) this).field_zb.field_L = var5;
          ((wdb) this).field_zb.field_hb = ((wdb) this).field_hb + -var5;
          ((wdb) this).field_zb.field_G = param1;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((wdb) this).field_G = param4;
        ((wdb) this).field_K = param1;
        ((wdb) this).field_hb = param5;
        if (param6 != 0) {
          ((wdb) this).a(-108, 59, -20, (byte) -43);
          ((wdb) this).field_L = param0;
          ((wdb) this).a(param7, param2, param3, (byte) 63);
          return;
        } else {
          ((wdb) this).field_L = param0;
          ((wdb) this).a(param7, param2, param3, (byte) 63);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_vb = 0;
    }
}
