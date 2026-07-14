/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag {
    static String field_g;
    private static int field_h;
    static dd field_b;
    static vh field_f;
    static int field_e;
    static int field_a;
    static String field_d;
    static int field_c;

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            Object var2 = null;
            gi discarded$0 = ag.a(105, (ko) null, -112, 90);
        }
        field_g = null;
        field_d = null;
        field_f = null;
    }

    final static void a(int[] param0, float[] param1, int param2) {
        param1[0] = param1[0] - (float)param0[0];
        param1[1] = param1[1] - (float)param0[1];
        param1[2] = param1[2] - (float)param0[2];
        float var3 = param1[1] * (float)param0[4] / 65536.0f + param1[0] * (float)param0[3] / 65536.0f + (float)param0[5] * param1[2] / 65536.0f;
        float var4 = param1[0] * (float)param0[6] / 65536.0f + param1[1] * (float)param0[7] / 65536.0f + (float)param0[8] * param1[2] / 65536.0f;
        float var5 = param1[0] * (float)param0[param2] / 65536.0f + param1[1] * (float)param0[10] / 65536.0f + param1[2] * (float)param0[11] / 65536.0f;
        param1[0] = (float)fb.field_q + 512.0f * var3 / var5;
        param1[1] = 512.0f * var4 / var5 + (float)fb.field_d;
        param1[2] = var5;
    }

    final static gi a(int param0, ko param1, int param2, int param3) {
        gi var6 = null;
        int var7 = Pool.field_O;
        aa var9 = new aa(param1);
        gi var5 = (gi) (Object) var9.b((byte) -92);
        while (var5 != null) {
            var6 = var5;
            while (var5 != null) {
                if (var6.field_m <= param2) {
                    if (param2 < var6.field_l + var6.field_m) {
                        if (param0 >= var6.field_q) {
                            if (var6.field_q - -var6.field_r > param0) {
                                return var5;
                            }
                        }
                    }
                }
                gi var5_ref = var5.field_s;
            }
            var5 = (gi) (Object) var9.b(-81);
        }
        if (param3 == 15395) {
            return null;
        }
        Object var8 = null;
        gi discarded$0 = ag.a(15, (ko) null, 110, 38);
        return null;
    }

    final static dd a(byte param0, int param1, String param2) {
        dd var10 = new dd(4 + ni.field_Z.b(param2), 4 + ni.field_Z.field_C - -ni.field_Z.field_w);
        var10.field_G = -2;
        var10.field_B = -2;
        int[] var12 = new int[4];
        int[] var13 = qh.field_d;
        int var6 = qh.field_l;
        int var7 = qh.field_f;
        qh.a(var12);
        var10.e();
        ni.field_Z.d(param2, 2, 2 + ni.field_Z.field_C, param1, -1);
        var10.e(4144959);
        qh.a(var13, var6, var7);
        qh.b(var12);
        var10.field_y = var10.field_A;
        var10.field_w = var10.field_z;
        var10.field_B = 0;
        dd var8 = var10;
        var8.field_G = 0;
        if (param0 != 89) {
            ag.a(-120);
        }
        return var10;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 7;
        field_e = 1 << field_h;
        field_g = "Connection restored.";
        field_d = "Add name";
    }
}
