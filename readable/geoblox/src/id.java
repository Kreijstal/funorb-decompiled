/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    static String resumeGameText;
    static lc[] field_b;
    static Sprite[] field_c;

    public static void b(boolean param0) {
        field_c = null;
        field_b = null;
        resumeGameText = null;
        if (!param0) {
            resumeGameText = (String) null;
        }
    }

    final static void a(boolean param0) {
        tl var1 = (tl) ((Object) MatchingTextValidator.field_l.removeLast(1));
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        SoftwareRasterizer.setRasterTarget(var1.field_q, var1.field_j, var1.field_k);
        SoftwareRasterizer.setClip(var1.field_n, var1.field_p, var1.field_i, var1.field_m);
        var1.field_q = null;
        if (!param0) {
            return;
        }
        sg.field_b.addLast(-110, var1);
    }

    static {
        int var0 = 0;
        resumeGameText = "Resume Game";
        field_b = new lc[255];
        for (var0 = 0; var0 < field_b.length; var0++) {
            field_b[var0] = new lc();
        }
    }
}
