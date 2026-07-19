/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mia extends cia {
    int field_s;
    int field_r;

    final static void b(int param0) {
        sna discarded$0 = null;
        int var1_int = 0;
        int var2 = BachelorFridge.field_y;
        try {
            ena.field_m.a(false);
            for (var1_int = 0; var1_int < 32; var1_int++) {
                ta.field_d[var1_int] = 0L;
            }
            if (param0 != 32) {
                discarded$0 = mia.d((byte) 3);
            }
            for (var1_int = 0; var1_int < 32; var1_int++) {
                baa.field_C[var1_int] = 0L;
            }
            ea.field_f = 0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "mia.I(" + param0 + ')');
        }
    }

    mia(int param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2);
        this.field_r = param3;
        this.field_l = -8;
        this.field_m = 0;
        this.field_s = param4;
    }

    final static sna d(byte param0) {
        if (param0 != -104) {
            mia.b(-95);
        }
        return kja.a((byte) 20);
    }

    static {
    }
}
