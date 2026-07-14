/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static ka[] field_b;
    private static String[] field_a;
    static int[] field_c;

    final static boolean a(int param0, byte param1, int param2) {
        if (param1 != 5) {
            return true;
        }
        return false;
    }

    final static void a(int param0, boolean param1) {
        if (param0 != 40) {
            field_a = null;
            wi.field_s.b(108, param1);
            return;
        }
        wi.field_s.b(108, param1);
    }

    public static void a(boolean param0) {
        field_c = null;
        field_a = null;
        if (param0) {
            hh.a(54, false);
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[7];
        field_a[6] = "Difficulty Down";
        field_a[2] = "Bulletproof";
        field_a[3] = "Time Stop";
        field_a[0] = "Lamp";
        field_a[1] = "Speed Up";
        field_a[4] = "Levitation";
        field_a[5] = "Invisibility";
        field_c = new int[]{36, 37, 38, 39, 40, 7, 5, 6, 17};
    }
}
