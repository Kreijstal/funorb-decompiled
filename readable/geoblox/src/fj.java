/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fj extends DualLinkNode {
    static pk field_q;
    static int field_m;
    int field_n;
    static AudioOutput field_p;
    static int field_o;

    abstract boolean g(int param0);

    abstract Object e(byte param0);

    fj(int param0) {
        this.field_n = param0;
    }

    final static boolean f(int param0) {
        if (param0 != -31456) {
            field_q = (pk) null;
            if (hj.field_a < 10) {
                return false;
            }
            if (mi.field_C >= 13) {
                return true;
            }
            return false;
        }
        if (hj.field_a < 10) {
            return false;
        }
        if (mi.field_C >= 13) {
            return true;
        }
        return false;
    }

    public static void e(int param0) {
        field_p = null;
        if (param0 > -92) {
            fj.f(64);
            field_q = null;
            return;
        }
        field_q = null;
    }

    final static void a(byte param0, rh param1, boolean param2, rh param3, rh param4) {
        try {
            ih.field_c = ImageProducerRasterBuffer.a((byte) 86, "");
            int var5_int = 103 / ((param0 - 70) / 34);
            ih.field_c.a((byte) -126, false);
            IndexedSpriteState.a((byte) 103, param1, param4, param3);
            qh.h((byte) -121);
            kd.field_b = uf.field_l;
            si.field_g = uf.field_l;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "fj.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = 4;
    }
}
