/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mia extends cia {
    int field_s;
    int field_r;

    final static void b(int param0) {
        int var1 = 0;
        int var2 = BachelorFridge.field_y;
        ena.field_m.a(false);
        for (var1 = 0; var1 < 32; var1++) {
            ta.field_d[var1] = 0L;
        }
        if (param0 != 32) {
            sna discarded$0 = mia.d((byte) 3);
        }
        for (var1 = 0; var1 < 32; var1++) {
            baa.field_C[var1] = 0L;
        }
        ea.field_f = 0;
    }

    mia(int param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2);
        ((mia) this).field_r = param3;
        ((mia) this).field_l = -8;
        ((mia) this).field_m = 0;
        ((mia) this).field_s = param4;
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
