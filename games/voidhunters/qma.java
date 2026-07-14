/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qma {
    private int field_b;
    private long field_a;

    final int a(int param0) {
        int var2 = 84 / ((17 - param0) / 34);
        return ((qma) this).field_b;
    }

    private final void a(boolean param0, pb param1) {
        if (!param0) {
            Object var4 = null;
            this.a(false, (pb) null);
            ((qma) this).field_b = ((qma) this).field_b + 1;
            ((qma) this).field_a = ((qma) this).field_a | (long)(param1.field_j << pb.field_m * ((qma) this).field_b);
            return;
        }
        ((qma) this).field_b = ((qma) this).field_b + 1;
        ((qma) this).field_a = ((qma) this).field_a | (long)(param1.field_j << pb.field_m * ((qma) this).field_b);
    }

    private final int a(int param0, int param1) {
        if (param0 != 15) {
            Object var4 = null;
            qma.a((no) null, 36, 72, 17, 121, -94, -120, 88, (no) null, (bc) null, 76, 114, (bc) null, 55, -78, 123, -51, -27, (bc) null, -111);
            return 15 & (int)(((qma) this).field_a >> param1 * pb.field_m);
        }
        return 15 & (int)(((qma) this).field_a >> param1 * pb.field_m);
    }

    final static void a(no param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, no param8, bc param9, int param10, int param11, bc param12, int param13, int param14, int param15, int param16, int param17, bc param18, int param19) {
        oja.field_p = param8;
        bl.field_x = param0;
        wm.a(param6, param10, 116, param19, param5);
        ue.a(param15, (byte) 111, param9, param1);
        wqa.a(param17, param12, 114, param3, param18, param11);
        int var20 = 20 % ((param16 - -14) / 55);
        tl.a(param4, -22699, param7);
        nva.a(param13, true, param2, param14);
    }

    final pb b(int param0, int param1) {
        if (param1 < 65) {
            return null;
        }
        return pb.a((byte) -120, this.a(15, param0));
    }

    qma(pb param0) {
        ((qma) this).field_a = (long)param0.field_j;
        ((qma) this).field_b = 1;
    }

    qma(pb[] param0) {
        int var2 = 0;
        for (var2 = 0; var2 < param0.length; var2++) {
            this.a(true, param0[var2]);
        }
    }

    static {
    }
}
