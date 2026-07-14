/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sca extends mc {
    private String field_A;
    private int field_z;
    private no field_v;
    private int field_w;
    private boolean field_y;
    private int field_x;

    sca(int param0, int param1, int param2, int param3, shb param4, boolean param5, int param6, int param7, no param8, int param9, String param10) {
        super(param0, param1, param2, param3, (wwa) null, (sba) null);
        ((sca) this).field_z = param9;
        ((sca) this).field_t = param4;
        ((sca) this).field_v = param8;
        ((sca) this).field_w = param6;
        ((sca) this).field_y = param5 ? true : false;
        ((sca) this).field_A = param10;
        ((sca) this).field_x = param7;
        int var12 = ((sca) this).field_w - ((sca) this).field_x;
        int var13 = ((sca) this).field_v.b(param10, var12, ((sca) this).field_v.field_k) - -(((sca) this).field_x * 2);
        if (var13 > param3) {
            ((sca) this).a(param0, param2, var13, 1, param1);
        } else {
            var13 = param3;
        }
        int var14 = ((sca) this).field_y ? 0 : ((sca) this).field_w + ((sca) this).field_x * 2;
        ((sca) this).field_t.a(var14, -((sca) this).field_w + (param2 - 3 * ((sca) this).field_x), param3 - ((sca) this).field_x * 2, 1, ((sca) this).field_x + (var13 - param3 >> -1381408415));
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var5 = ((sca) this).field_g - -param0;
        if (param2 <= 47) {
            return;
        }
        int var6 = ((sca) this).field_r + param3;
        super.b(param0, param1, 121, param3);
        if (!(param1 == 0)) {
            return;
        }
        int var7 = ((sca) this).field_y ? ((sca) this).field_h + -((sca) this).field_w - ((sca) this).field_x * 2 : 0;
        int discarded$0 = ((sca) this).field_v.a(((sca) this).field_A, ((sca) this).field_x + (var7 + var5), var6 + ((sca) this).field_x, ((sca) this).field_w - ((sca) this).field_x, -(((sca) this).field_x * 2) + ((sca) this).field_f, ((sca) this).field_z, -1, ((sca) this).field_y ? 0 : 2, 1, ((sca) this).field_v.field_k);
    }

    final String d(byte param0) {
        int var2 = ((sca) this).field_t.field_e ? 1 : 0;
        ((sca) this).field_t.field_e = ((sca) this).field_e;
        String var3 = ((sca) this).field_t.d(param0);
        ((sca) this).field_t.field_e = var2 != 0 ? true : false;
        return var3;
    }

    static {
    }
}
