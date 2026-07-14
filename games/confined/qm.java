/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm extends db {
    static boolean[] field_C;
    static java.awt.Image field_z;
    static String field_A;
    static bm[] field_B;
    static int field_y;

    public static void c(int param0) {
        field_z = null;
        field_C = null;
        field_B = null;
        int var1 = 86 / ((param0 - -12) / 61);
        field_A = null;
    }

    qm(int param0) {
        this(gm.field_cb, param0);
    }

    final String b(fj param0, int param1) {
        if (param1 != -2) {
          qm.c(67);
          return qd.a('*', param0.field_B.length(), (byte) -118);
        } else {
          return qd.a('*', param0.field_B.length(), (byte) -118);
        }
    }

    private qm(ok param0, int param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new boolean[]{false, true, true, true, false, true, true, true, false, false, false, false, true};
        field_y = -1;
        field_A = "<col=FFFFFF>Lasers:</col> this upgrade gives you focused beams of light that operate at any distance and inflict continuous damage on whatever they hit. Hold <col=FFFFFF><%0></col> to fire, and remember to manage your ready energy.";
    }
}
