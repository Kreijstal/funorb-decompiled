/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static String field_e;
    static ak field_g;
    static int[] field_c;
    static String field_d;
    static String field_b;
    static tf[] field_a;
    static int field_f;

    final static uc a(byte param0) {
        int var1 = 116 % ((3 - param0) / 36);
        if (!(rf.field_d != null)) {
            rf.field_d = new uc(ep.field_b, 20, 0, 0, 0, 11579568, -1, 0, 0, ep.field_b.field_w, -1, 2147483647, true);
        }
        return rf.field_d;
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        field_e = null;
        field_b = null;
        if (param0 != -1) {
            return;
        }
        field_g = null;
    }

    final static void a(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        if (param0) {
            field_c = (int[]) null;
            if (fq.field_o == null) {
                return;
            }
            fq.field_o.c(-1);
            fieldTemp$0 = hn.field_d + 1;
            hn.field_d = hn.field_d + 1;
            if (fieldTemp$0 < ce.field_f) {
                fo.field_t = hn.field_d + -128;
                fo.field_t = fo.field_t < 0 ? 0 : 6 * fo.field_t;
                fo.field_t = (fo.field_t ^ -1) < -257 ? 256 : fo.field_t;
                if (jc.field_d) {
                    return;
                }
                if (hn.field_d >= ce.field_f - 2) {
                    return;
                }
                hn.field_d = -2 + ce.field_f;
                return;
            }
            rg.field_e = fq.field_o;
            hn.field_d = 0;
            fq.field_o = null;
            fo.field_t = hn.field_d + -128;
            fo.field_t = fo.field_t < 0 ? 0 : 6 * fo.field_t;
            fo.field_t = (fo.field_t ^ -1) < -257 ? 256 : fo.field_t;
            if (jc.field_d) {
                return;
            }
            if (hn.field_d >= ce.field_f - 2) {
                return;
            }
            hn.field_d = -2 + ce.field_f;
            return;
        }
        if (fq.field_o != null) {
            fq.field_o.c(-1);
            fieldTemp$1 = hn.field_d + 1;
            hn.field_d = hn.field_d + 1;
            if (fieldTemp$1 >= ce.field_f) {
                rg.field_e = fq.field_o;
                hn.field_d = 0;
                fq.field_o = null;
                fo.field_t = hn.field_d + -128;
                fo.field_t = fo.field_t < 0 ? 0 : 6 * fo.field_t;
                fo.field_t = (fo.field_t ^ -1) < -257 ? 256 : fo.field_t;
                if (!jc.field_d && hn.field_d < ce.field_f - 2) {
                    hn.field_d = -2 + ce.field_f;
                    return;
                }
                return;
            }
            fo.field_t = hn.field_d + -128;
            fo.field_t = fo.field_t < 0 ? 0 : 6 * fo.field_t;
            fo.field_t = (fo.field_t ^ -1) < -257 ? 256 : fo.field_t;
            if (!jc.field_d && hn.field_d < ce.field_f - 2) {
                hn.field_d = -2 + ce.field_f;
                return;
            }
        }
    }

    static {
        field_c = new int[8192];
        field_d = "Connecting to<br>friend server...";
        field_e = "End Game";
        field_b = "Invite";
    }
}
