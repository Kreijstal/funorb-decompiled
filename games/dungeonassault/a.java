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

    public static void a(int param0) {
        field_l = null;
        field_n = null;
        field_m = null;
        if (param0 != 23779) {
          field_k = (String) null;
          field_p = null;
          field_o = null;
          field_k = null;
          return;
        } else {
          field_p = null;
          field_o = null;
          field_k = null;
          return;
        }
    }

    final static void a(int param0, int param1, se param2, boolean param3, boolean param4, int param5, int param6, int param7, int param8, int param9, cn[] param10, cn[] param11) {
        if (!param3) {
            return;
        }
        try {
            he.a(param6, 0, param8, param7, param1, param5, param9, param11, param1, param0, param10, param2, param2, param9, param4);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "a.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + (param10 != null ? "{...}" : "null") + ',' + (param11 != null ? "{...}" : "null") + ')');
        }
    }

    a(int param0) {
        this.field_j = param0;
    }

    static {
        field_m = "Select raiders from the panel on the left";
        field_p = "Like all lizardmen of the eastern deserts, the saurus spawn is sly and agile, though his simple rags and battered weapon leave something to be desired.";
        field_k = "Order your raider to enter the room. It will engage the <%0> in combat if detected; otherwise, you may pass through the room.";
        field_l = "A perfect vision of beauty, her skill in the arts of deception are legendary, allowing herself and others to trick their way past a dungeon's obstacles.";
        field_i = -1;
    }
}
