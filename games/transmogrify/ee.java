/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee extends aj implements df {
    private String field_z;
    private lj[] field_F;
    private int[] field_E;
    private int field_w;
    static int field_D;
    private kg field_A;
    private ik field_x;
    static String field_C;
    static String field_y;

    public static void l(int param0) {
        if (param0 != -31263) {
            field_C = null;
        }
        field_y = null;
        field_C = null;
    }

    ee(ik param0, kg param1, String param2) {
        super(0, 0, 288, 0, (ui) null);
        ((ee) this).field_w = 0;
        ((ee) this).field_A = param1;
        ((ee) this).field_z = param2;
        ((ee) this).field_x = param0;
        int var4 = null != ((ee) this).field_z ? ((ee) this).field_A.a(((ee) this).field_z, 260, ((ee) this).field_A.field_y) : 0;
        ((ee) this).a(-108, 0, 0, 288, var4 + 22);
    }

    final void a(String param0, int param1, int param2) {
        int var4 = ((ee) this).field_w;
        this.b((byte) -114, param2 + var4);
        ((ee) this).field_F[var4] = ((ee) this).a((ma) this, 8283, param0);
        ((ee) this).field_E[var4] = param1;
    }

    private final void b(byte param0, int param1) {
        int var6 = Transmogrify.field_A ? 1 : 0;
        if (!(((ee) this).field_w < param1)) {
            return;
        }
        lj[] var7 = new lj[param1];
        lj[] var3 = var7;
        int[] var4 = new int[param1];
        int var5 = 0;
        if (param0 > -45) {
            return;
        }
        while (var5 < ((ee) this).field_w) {
            var7[var5] = ((ee) this).field_F[var5];
            var4[var5] = ((ee) this).field_E[var5];
            var5++;
        }
        ((ee) this).field_w = param1;
        ((ee) this).field_F = var3;
        ((ee) this).field_E = var4;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, (byte) 113);
        int discarded$0 = ((ee) this).field_A.a(((ee) this).field_z, 14 + ((ee) this).field_p + param0, ((ee) this).field_n + (param1 + 10), -28 + ((ee) this).field_l, ((ee) this).field_h, 16777215, -1, 0, 0, ((ee) this).field_A.field_y);
        int var5 = -84 / ((77 - param3) / 34);
    }

    public final void a(lj param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = Transmogrify.field_A ? 1 : 0;
        for (var6 = 0; var6 < ((ee) this).field_w; var6++) {
            if (param0 == ((ee) this).field_F[var6]) {
                var7 = ((ee) this).field_E[var6];
                if (-1 == var7) {
                    ((ee) this).field_x.r(77);
                    break;
                }
                ba.a(param1 + 99, ((ee) this).field_E[var6]);
                break;
            }
        }
        if (param1 != 17) {
            ((ee) this).field_w = 61;
        }
    }

    final static String a(String param0, byte param1, String param2, ci param3, String param4) {
        if (param1 < 69) {
            Object var6 = null;
            String discarded$0 = ee.a((String) null, (byte) 66, (String) null, (ci) null, (String) null);
        }
        if (!(param3.a((byte) -115))) {
            return param0;
        }
        return param2 + " - " + param3.a(0, param4) + "%";
    }

    final lj a(ma param0, int param1, String param2) {
        lj var4 = new lj(param2, param0);
        var4.field_q = (ui) (Object) new qa();
        int var5 = -2 + ((ee) this).field_h;
        ((ee) this).a(85, 0, 0, ((ee) this).field_l, 34 + ((ee) this).field_h);
        var4.a(73, var5, 7, ((ee) this).field_l + -14, 30);
        ((ee) this).a((qg) (Object) var4, (byte) -83);
        if (param1 != 8283) {
            ((ee) this).field_A = null;
        }
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "To Customer Support";
        field_y = "Password: ";
    }
}
