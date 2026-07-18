/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static String field_c;
    static ef field_b;
    static String field_a;
    static String field_d;
    static go field_e;

    final static void a(String param0, int param1, int param2) {
        sa.field_f = param2;
        if (param1 < 10) {
            return;
        }
        try {
            fm.field_a = dg.field_H;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ik.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          ik.a(75);
          field_a = null;
          field_b = null;
          field_c = null;
          field_d = null;
          field_e = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          field_c = null;
          field_d = null;
          field_e = null;
          return;
        }
    }

    final static void a(Object[] param0, int param1, int[] param2) {
        if (param1 > -85) {
            return;
        }
        try {
            uo.a(256, -1 + param2.length, param2, param0, 0);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ik.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "The dark fetishes hanging from the shaman's robes indicate he has been taking power from his enemies for some time. His connection to the spirits of his home far in the north grants him speed and strength in combat.";
        field_b = new ef();
        field_d = "Orc Shaman";
        field_a = "Unpacking music";
    }
}
