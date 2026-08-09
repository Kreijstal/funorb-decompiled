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
        hca var7 = null;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (!param2.f(param1 ^ param1)) {
            return;
        }
        try {
            if (this.field_e || !param0.a(this.field_h, 54) || param2.field_k.a(false, this.field_h, this.field_c)) {
                this.a(param2.field_k, (byte) -98);
                var7 = param2.field_k.field_H[this.field_h];
                hca var4 = var7;
                for (var5 = 0; 3 > var5; var5++) {
                    var7.a(true, var5, this.field_d[var5]);
                }
                if (param2.field_x == this.field_h) {
                    param0.f(10);
                } else {
                    param2.c(this.field_h, 51);
                    param0.a(this.field_f, (byte) 125, this.field_h);
                }
            }
            param2.field_r = this.field_i;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "bqa.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, kh param1) {
        int var3_int = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        try {
            param1.i(8);
            param1.a((byte) 3, this.field_e ? 1 : 0, 1);
            param1.a((byte) -125, this.field_h, 3);
            param1.a((byte) -125, this.field_c, 5);
            param1.a((byte) 113, this.field_b, 24);
            param1.a((byte) -128, this.field_a, 24);
            param1.a((byte) -126, this.field_f, 5);
            for (var3_int = 0; this.field_d.length > var3_int; var3_int++) {
                param1.a((byte) -125, this.field_d[var3_int], 8);
            }
            if (param0 != 200) {
                this.field_a = -62;
            }
            param1.a((byte) -126, 1 + this.field_i, 32);
            param1.k(-1826190686);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "bqa.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final String toString() {
        return "S2CNewRoomPacket (force:" + this.field_e + ", playerid:" + this.field_h + ", roomid:" + this.field_c + ", course ticks:" + this.field_b + ", room ticks:" + this.field_a + ", disregard:" + this.field_f + ", treasure: " + this.a(1) + ")";
    }

    public final void a(kh param0, byte param1) {
        int var3_int = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        param0.h((byte) 125);
        this.field_e = (param0.b((byte) 44, 1) ^ -1) != -2 ? false : true;
        this.field_h = param0.b((byte) 44, 3);
        this.field_c = param0.b((byte) 44, 5);
        this.field_b = param0.b((byte) 44, 24);
        this.field_a = param0.b((byte) 44, 24);
        this.field_f = param0.b((byte) 44, 5);
        for (var3_int = 0; this.field_d.length > var3_int; var3_int++) {
            this.field_d[var3_int] = param0.b((byte) 44, 8);
        }
        if (param1 != -19) {
            return;
        }
        try {
            this.field_i = -1 + param0.b((byte) 44, 32);
            param0.i((byte) 98);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "bqa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
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
        try {
            param0.a(this.field_c, this.field_h, 1, this.field_b, this.field_a);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "bqa.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
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
            field_g = (String) null;
        }
    }

    private final String a(int param0) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        String var2 = String.valueOf(this.field_d[0]);
        for (var3 = param0; (var3 ^ -1) > -4; var3++) {
            var2 = var2 + "," + this.field_d[var3];
        }
        return var2;
    }

    bqa() {
        this.field_i = -1;
        this.field_d = new int[3];
    }

    static {
        field_g = "2nd";
    }
}
