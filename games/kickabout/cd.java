/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    static int[] field_a;
    static String field_b;

    final static void a(byte param0, int param1, int param2) {
        int discarded$9 = 0;
        ku.a(16777215, al.a(false, (byte) 66), param2, -1, param1);
        if (param0 >= -126) {
            cd.a((byte) 70);
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 != -98) {
            field_a = null;
        }
    }

    final static boolean a() {
        return hk.field_G;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "At the end of every game, you are awarded <col=ffff00>league points</col>.<br><br><br><br><br><br><br><img=0>Your team is promoted through the leagues as these accumulate - from the Pebble Playoffs all the way up to the Diamond<nbsp>Division!<br><br><img=0>There are no relegations in Kickabout. Once you reach the number of points required to enter a league, your score can't drop below that value.";
        field_a = new int[4];
        field_a[1] = 16;
        field_a[2] = 20;
        field_a[0] = 13;
        field_a[3] = 12;
    }
}
