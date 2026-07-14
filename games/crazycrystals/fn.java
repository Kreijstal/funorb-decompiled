/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn extends ln {
    static String field_g;
    static am field_h;
    static int field_j;
    static String field_i;

    public static void a(boolean param0) {
        field_i = null;
        if (!param0) {
            fn.a(true);
            field_g = null;
            field_h = null;
            return;
        }
        field_g = null;
        field_h = null;
    }

    fn(String param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
    }

    final static boolean a(int param0, md param1) {
        if (param0 != 1) {
            return true;
        }
        return param1.d((byte) -96, 1) == 1 ? true : false;
    }

    final int a(int param0, byte param1) {
        int var3 = -121 % ((param1 - 55) / 50);
        return (va.field_d & 1 << param0) != 0 ? 1 : 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Rocks roll off curved surfaces. You can use this fact to get through.";
        field_i = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
