/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends ik {
    private boolean field_i;
    static String field_h;
    static int field_j;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = param2 + -param3;
        int var8 = var7 + (param2 + param4 * 100) * 100;
        lo.field_b = new hp(param6, param1, fn.field_j, mb.field_g, field_j, ob.field_l, new int[]{var8});
        if (param0 > -74) {
            field_h = (String) null;
        }
        if (!rc.a(-53)) {
            ba.a(3, 51, lo.field_b);
        }
        dk.field_q = param3;
        kp.field_m = param4;
        oc.field_b = param2;
    }

    public static void c(int param0) {
        if (param0 != 31441) {
            field_j = -109;
        }
        field_h = null;
    }

    wd(int param0, int param1, int param2, int param3, boolean param4) {
        this.field_a = param0;
        this.field_c = param3;
        this.field_d = param1;
        this.field_i = param4 ? true : false;
        this.field_b = param2;
    }

    final void a(boolean param0, int param1, int param2) {
        il.a(this.field_c, param0, this.field_d, this.field_a, this.field_b, false);
        this.a(0, this.field_d, param2 + 1, this.field_a + -1);
        this.a(0, this.field_d, 2, param2 + this.field_a);
        this.a(0, this.field_d - 1, 2, this.field_a);
        this.a(0, 1 + this.field_d, 2, this.field_a);
        this.a(param1, this.field_d, param2 + 1, this.field_a);
    }

    final static long d(int param0) {
        if (param0 != -1322) {
            field_j = 104;
        }
        return -wg.field_y + lo.a((byte) 82);
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = CrazyCrystals.field_B;
        if (param2 != 2) {
            this.a(-104, 80, -33, 70);
        }
        if (!this.field_i) {
            for (var5 = 0; (var5 ^ -1) > -8; var5++) {
                kh.f(-var5 + (-1 + (14 + param3)), -8 + (15 + param1 - -var5), 2 + var5 * 2, param0);
            }
            kh.f(-3 + (14 + param3), param1 - -15 - 1, 6, 7, param0);
        } else {
            kh.f(param3 - -15 - 4, -7 + (-1 + param1) - -15, 6, 7, param0);
            for (var5 = 0; var5 < 7; var5++) {
                kh.f(-8 + (15 + param3) - -var5, -1 + (15 + param1) - -var5, 14 - var5 * 2, param0);
            }
        }
    }

    static {
        field_h = "Sticky Ball";
    }
}
