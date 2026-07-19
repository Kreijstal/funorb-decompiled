/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static int field_d;
    static oh[] field_e;
    static String field_b;
    static boolean field_f;
    static float field_c;
    static wf[] field_a;

    final static void a(int param0, qa param1) {
        try {
            param1.field_t = new int[]{param0};
            param1.field_u = new char[]{(char)63};
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "s.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 63) {
            field_b = (String) null;
            field_b = null;
            field_e = null;
            return;
        }
        field_b = null;
        field_e = null;
    }

    final static boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 63) {
          L0: {
            field_a = (wf[]) null;
            if ((qb.field_N.field_cc ^ -1L) != (oj.field_c ^ -1L)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((qb.field_N.field_cc ^ -1L) != (oj.field_c ^ -1L)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(int param0, oh[] param1, byte param2, int param3, boolean param4, int param5, int param6, int param7, int param8, int param9, jb param10, oh[] param11) {
        try {
            if (param2 != 7) {
                field_b = (String) null;
            }
            li.a(param6, param1, param8, param4, -89, param7, param9, param11, param3, param5, param10, param9, param10, param8, param0);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "s.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + (param10 != null ? "{...}" : "null") + ',' + (param11 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "You are invited to <%0>'s game.";
        field_c = 0.0f;
        field_f = false;
        field_d = 0;
    }
}
