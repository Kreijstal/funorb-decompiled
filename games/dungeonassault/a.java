/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a extends ne {
    static String field_m;
    static wm field_o;
    static String field_p;
    static String field_k;
    static String field_l;
    static int field_i;
    int field_j;
    static nk field_n;

    public static void a() {
        field_l = null;
        field_n = null;
        field_m = null;
        field_p = null;
        field_o = null;
        field_k = null;
    }

    final static void a(int param0, int param1, se param2, boolean param3, boolean param4, int param5, int param6, int param7, int param8, int param9, cn[] param10, cn[] param11) {
        try {
            he.a(240, 0, 8, 2, param1, 8, param9, param11, param1, 320, param10, param2, param2, param9, param4);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "a.A(" + 320 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + true + ',' + param4 + ',' + 8 + ',' + 240 + ',' + 2 + ',' + 8 + ',' + param9 + ',' + (param10 != null ? "{...}" : "null") + ',' + (param11 != null ? "{...}" : "null") + ')');
        }
    }

    a(int param0) {
        ((a) this).field_j = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Select raiders from the panel on the left";
        field_p = "Like all lizardmen of the eastern deserts, the saurus spawn is sly and agile, though his simple rags and battered weapon leave something to be desired.";
        field_k = "Order your raider to enter the room. It will engage the <%0> in combat if detected; otherwise, you may pass through the room.";
        field_l = "A perfect vision of beauty, her skill in the arts of deception are legendary, allowing herself and others to trick their way past a dungeon's obstacles.";
        field_i = -1;
    }
}
