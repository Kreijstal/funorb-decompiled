/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    static int field_f;
    static double[] field_e;
    static long field_b;
    static String field_d;
    static int field_c;
    static int[] field_g;
    static String field_a;
    private static String field_z;

    public static void a(byte param0) {
        field_d = null;
        field_e = null;
        field_a = null;
        if (param0 >= -37) {
            return;
        }
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "uh.A(";
        field_e = new double[]{0.9, 0.7, 1.0, 1.0, 1.0, 1.0, 1.0, 0.9, 0.8, 1.0, 1.0, 1.0, 1.0, 0.9, 0.8, 0.8, 0.9, 0.9};
        field_d = "<col=FFFFFF>Concussion missiles:</col> good old-fashioned physical explosives, these missiles can add an edge to your attack. You get four at once and can carry up to 20. Tap <col=FFFFFF><%0></col> to fire one. Hold <col=FFFFFF><%0></col> to fire many.";
        field_g = new int[10];
        field_a = "Collect extra ones#to strengthen or#restore your shield.";
    }
}
