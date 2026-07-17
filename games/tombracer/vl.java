/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends vg {
    private int field_f;
    private int field_h;
    private int field_g;

    vl(int param0, fsa param1) {
        try {
            ((vl) this).field_f = param0;
            ((vl) this).field_g = param1.f((byte) -72).c(121);
            ((vl) this).field_h = param1.n(31974).field_d;
            dt discarded$0 = param1.x(15470);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "vl.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final String toString() {
        return "PlayerItem(" + ((vl) this).field_f + "," + ((vl) this).field_g + "," + ((vl) this).field_h + ")";
    }

    final static iu[] a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        iu[] var7 = new iu[9];
        iu[] var4 = var7;
        var7[0] = jf.a(param1, 121, param3);
        if (param0 <= 111) {
            iu[] discarded$0 = vl.a((byte) 34, 94, 33, 36);
        }
        for (var5 = 1; var5 < 9; var5++) {
            var7[var5] = var7[0];
        }
        var4[4] = jf.a(param2, 43, 64);
        return var4;
    }

    static {
    }
}
