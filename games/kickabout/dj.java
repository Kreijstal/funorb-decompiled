/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dj extends qt {
    static int field_A;
    static hd field_D;
    int field_C;
    static String field_B;

    final void h(byte param0) {
        if (param0 > -76) {
            ((dj) this).field_C = 32;
        }
        ((dj) this).field_C = ((dj) this).field_C - 1;
        if (!(((dj) this).field_C >= 0)) {
            ((dj) this).field_C = 0;
        }
        kj.a((byte) -103);
    }

    final boolean a(int param0, byte param1) {
        if (((dj) this).field_i[param0].field_m == 21) {
            if (!this.g((byte) -122)) {
                return false;
            }
        }
        if (param1 != -95) {
            return true;
        }
        if ((((dj) this).field_i[param0].field_m ^ -1) == -23) {
            if (!this.b(false)) {
                return false;
            }
        }
        return super.a(param0, (byte) -95);
    }

    boolean a(int param0, int param1, char param2) {
        ((dj) this).field_x.a(1, true);
        if (((dj) this).field_x.field_e >= 0) {
            if (!(!((dj) this).field_x.c(-1))) {
                ((dj) this).field_i[((dj) this).field_x.field_e].a(-1, false);
                return true;
            }
        }
        if (param1 >= -5) {
            field_D = null;
        }
        return super.a(param0, -53, param2);
    }

    void a(int param0, boolean param1) {
        int var3_int = 0;
        int var4_int = 0;
        int var5_int = 0;
        int var6 = 0;
        super.a(param0, param1);
        if (!(this.g((byte) -120))) {
            var3_int = ((dj) this).field_i[0].field_d;
            var4_int = ((dj) this).field_i[0].field_h;
            var5_int = ((dj) this).b(0, -22667) + (((dj) this).field_j + -(var3_int >> -1522629823));
            var6 = ((dj) this).a(-124, 0) - (var4_int >> 758989121);
            on.a(var5_int - 4, -4 + var6, 8 + var3_int, var4_int + 8, 10, 0, 128);
            eo.field_r[0][3].c(var5_int, var6);
        }
        if (!(this.b(false))) {
            var3_int = ((dj) this).field_i[2].field_d;
            var4_int = ((dj) this).field_i[2].field_h;
            var5_int = -(var3_int >> 1468389729) + (((dj) this).b(2, param0 ^ 22670) - -((dj) this).field_j);
            var6 = -(var4_int >> 1779281729) + ((dj) this).a(101, 2);
            on.a(-4 + var5_int, -4 + var6, 8 + var3_int, var4_int - -8, 10, 0, 128);
            eo.field_c[0][3].c(var5_int, var6);
        }
        on.a(((dj) this).field_j + 15, 60, 610, 355, 10, 0, 128);
        String[] var7 = this.a(true);
        String[] var3 = var7;
        String var4 = var7[((dj) this).field_C].toUpperCase();
        on.a(((dj) this).field_j + 40, 76, 560, 36, 10, 65793, 140);
        un.field_d.d(var4, ((dj) this).field_j + 320, 101, 16777215, -1);
        String var5 = ((dj) this).field_C - -1 + " / " + var7.length;
        un.field_d.c(var5, 580 - -((dj) this).field_j, 101, 16777215, -1);
    }

    final static StringBuilder a(int param0, char param1, int param2, StringBuilder param3) {
        int var5 = 0;
        int var6 = Kickabout.field_G;
        int var4 = param3.length();
        param3.setLength(param0);
        if (param2 != -11407) {
            field_B = null;
        }
        for (var5 = var4; var5 < param0; var5++) {
            param3.setCharAt(var5, param1);
        }
        return param3;
    }

    void a(byte param0, boolean param1) {
        super.a((byte) 98, param1);
        int var3 = -34 / ((param0 - 38) / 60);
        if (((dj) this).field_x.field_e == 0) {
            if (!this.g((byte) -93)) {
                ((dj) this).field_x.a((byte) 68, 1);
            }
        }
        if ((((dj) this).field_x.field_e ^ -1) == -3) {
            if (!(this.b(false))) {
                ((dj) this).field_x.a((byte) 68, 1);
            }
        }
    }

    private final String[] a(boolean param0) {
        if (((dj) this).field_c == 19) {
            return iq.field_a;
        }
        if (!(20 != ((dj) this).field_c)) {
            return uv.field_d;
        }
        if (!param0) {
            return null;
        }
        if (((dj) this).field_c == 21) {
            return ue.field_g;
        }
        if (!((((dj) this).field_c ^ -1) != -23)) {
            return pt.field_l;
        }
        return null;
    }

    final void f(int param0) {
        ((dj) this).field_C = ((dj) this).field_C + 1;
        int var2 = this.a(true).length;
        if (!(((dj) this).field_C < var2)) {
            ((dj) this).field_C = var2 + -1;
        }
        kj.a((byte) 58);
        if (param0 != 21) {
            ((dj) this).field_C = 21;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0, param1, param2);
        ((dj) this).field_C = 0;
    }

    private final boolean b(boolean param0) {
        if (!(((dj) this).field_C != -1 + this.a(true).length)) {
            return false;
        }
        if (param0) {
            ((dj) this).a((byte) -54, true);
        }
        return true;
    }

    final int b(int param0, int param1) {
        if (param1 != -22667) {
            boolean discarded$0 = this.g((byte) 91);
        }
        return 320 - -(70 * (-1 + param0));
    }

    public static void e(int param0) {
        field_B = null;
        field_D = null;
        if (param0 != -29104) {
            Object var2 = null;
            StringBuilder discarded$0 = dj.a(40, 'ﾄ', 84, (StringBuilder) null);
        }
    }

    private final boolean g(byte param0) {
        if (param0 > -70) {
            ((dj) this).field_C = -4;
        }
        if (0 == ((dj) this).field_C) {
            return false;
        }
        return true;
    }

    dj() {
    }

    final int a(int param0, int param1) {
        int var3 = -127 / ((param0 - -49) / 52);
        return 457;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = -1;
        field_B = "You cannot join this game - it is in progress";
    }
}
