/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bqa implements bo {
    private int field_a;
    private int field_b;
    private int field_c;
    private int field_i;
    private boolean field_e;
    private int[] field_d;
    private int field_h;
    private int field_f;
    static String field_g;

    final void a(v param0, int param1, qh param2) {
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (!param2.f(param1 ^ param1)) {
            return;
        }
        if (!((bqa) this).field_e) {
            if (param0.a(((bqa) this).field_h, 54)) {
                // ifeq L172
            }
        }
        this.a(param2.field_k, (byte) -98);
        hca var7 = param2.field_k.field_H[((bqa) this).field_h];
        hca var4 = var7;
        for (var5 = 0; 3 > var5; var5++) {
            var7.a(true, var5, ((bqa) this).field_d[var5]);
        }
        if (param2.field_x == ((bqa) this).field_h) {
            param0.f(10);
        } else {
            param2.c(((bqa) this).field_h, 51);
            param0.a(((bqa) this).field_f, (byte) 125, ((bqa) this).field_h);
        }
        param2.field_r = ((bqa) this).field_i;
    }

    public final void a(int param0, kh param1) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        param1.i(8);
        param1.a((byte) 3, ((bqa) this).field_e ? 1 : 0, 1);
        param1.a((byte) -125, ((bqa) this).field_h, 3);
        param1.a((byte) -125, ((bqa) this).field_c, 5);
        param1.a((byte) 113, ((bqa) this).field_b, 24);
        param1.a((byte) -128, ((bqa) this).field_a, 24);
        param1.a((byte) -126, ((bqa) this).field_f, 5);
        for (var3 = 0; ((bqa) this).field_d.length > var3; var3++) {
            param1.a((byte) -125, ((bqa) this).field_d[var3], 8);
        }
        if (param0 != 200) {
            ((bqa) this).field_a = -62;
        }
        param1.a((byte) -126, 1 + ((bqa) this).field_i, 32);
        param1.k(-1826190686);
    }

    public final String toString() {
        return "S2CNewRoomPacket (force:" + ((bqa) this).field_e + ", playerid:" + ((bqa) this).field_h + ", roomid:" + ((bqa) this).field_c + ", course ticks:" + ((bqa) this).field_b + ", room ticks:" + ((bqa) this).field_a + ", disregard:" + ((bqa) this).field_f + ", treasure: " + this.a(1) + ")";
    }

    public final void a(kh param0, byte param1) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        param0.h((byte) 125);
        ((bqa) this).field_e = (param0.b((byte) 44, 1) ^ -1) != -2 ? false : true;
        ((bqa) this).field_h = param0.b((byte) 44, 3);
        ((bqa) this).field_c = param0.b((byte) 44, 5);
        ((bqa) this).field_b = param0.b((byte) 44, 24);
        ((bqa) this).field_a = param0.b((byte) 44, 24);
        ((bqa) this).field_f = param0.b((byte) 44, 5);
        for (var3 = 0; ((bqa) this).field_d.length > var3; var3++) {
            ((bqa) this).field_d[var3] = param0.b((byte) 44, 8);
        }
        if (param1 != -19) {
            return;
        }
        ((bqa) this).field_i = -1 + param0.b((byte) 44, 32);
        param0.i((byte) 98);
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param0 != 540800) {
            return false;
        }
        return 0 != (param1 & 540800) ? true : false;
    }

    private final void a(ff param0, byte param1) {
        if (param1 >= -75) {
            return;
        }
        param0.a(((bqa) this).field_c, ((bqa) this).field_h, 1, ((bqa) this).field_b, ((bqa) this).field_a);
    }

    public static void a(byte param0) {
        if (param0 >= -48) {
            return;
        }
        field_g = null;
    }

    final static void a(boolean param0, int param1) {
        qja.a(true, param0, -127);
        if (param1 < 103) {
            field_g = null;
        }
    }

    private final String a(int param0) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        String var2 = String.valueOf(((bqa) this).field_d[0]);
        for (var3 = param0; (var3 ^ -1) > -4; var3++) {
            var2 = var2 + "," + ((bqa) this).field_d[var3];
        }
        return var2;
    }

    bqa() {
        ((bqa) this).field_i = -1;
        ((bqa) this).field_d = new int[3];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "2nd";
    }
}
