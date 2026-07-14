/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk {
    static String field_d;
    static hj field_b;
    static String field_a;
    int field_c;

    final static qj a(boolean param0, byte param1) {
        qj var2 = null;
        qj stackIn_2_0 = null;
        qj stackIn_3_0 = null;
        qj stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        qj stackIn_6_0 = null;
        qj stackIn_7_0 = null;
        qj stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        qj stackOut_5_0 = null;
        qj stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        qj stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        qj stackOut_1_0 = null;
        qj stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        qj stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var2 = new qj(true);
        if (param1 != -68) {
          L0: {
            boolean discarded$9 = fk.a(-117);
            stackOut_5_0 = (qj) var2;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param0) {
              stackOut_7_0 = (qj) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (qj) (Object) stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          stackIn_8_0.field_d = stackIn_8_1 != 0;
          return var2;
        } else {
          L1: {
            stackOut_1_0 = (qj) var2;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = (qj) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (qj) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_d = stackIn_4_1 != 0;
          return var2;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0 != -102) {
            fk.a((byte) 29);
        }
    }

    final static boolean a(int param0) {
        if (param0 != 1113) {
            field_a = null;
            return tl.a(uj.b((byte) -120), 61);
        }
        return tl.a(uj.b((byte) -120), 61);
    }

    final static hj a(ki param0, String param1, int param2, String param3) {
        int var4 = 122 % ((param2 - -6) / 44);
        int var5 = param0.a(param3, 0);
        int var6 = param0.a(param1, 5187, var5);
        return va.a(var5, var6, param0, (byte) -127);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    fk(int param0) {
        ((fk) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Change display name";
        field_a = "Type your password again to make sure it's correct";
    }
}
