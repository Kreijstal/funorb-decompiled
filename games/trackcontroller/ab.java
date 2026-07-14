/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    static int field_a;
    static String field_b;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 98) {
            field_a = 29;
        }
    }

    final static qj a(String param0, int param1, String param2, kk param3) {
        int var4 = 0;
        int var5 = 0;
        if (param1 != -15383) {
          field_a = -117;
          var4 = param3.a(true, param0);
          var5 = param3.a(param2, var4, param1 ^ 15382);
          return kh.a(false, var4, var5, param3);
        } else {
          var4 = param3.a(true, param0);
          var5 = param3.a(param2, var4, param1 ^ 15382);
          return kh.a(false, var4, var5, param3);
        }
    }

    final static kh a(boolean param0) {
        kh stackIn_3_0 = null;
        kh stackIn_3_1 = null;
        String stackIn_3_2 = null;
        int stackIn_3_3 = 0;
        kh stackIn_5_0 = null;
        kh stackIn_5_1 = null;
        String stackIn_5_2 = null;
        kh stackIn_6_0 = null;
        kh stackIn_6_1 = null;
        String stackIn_6_2 = null;
        kh stackIn_7_0 = null;
        kh stackIn_7_1 = null;
        String stackIn_7_2 = null;
        int stackIn_7_3 = 0;
        kh stackOut_4_0 = null;
        kh stackOut_4_1 = null;
        String stackOut_4_2 = null;
        kh stackOut_6_0 = null;
        kh stackOut_6_1 = null;
        String stackOut_6_2 = null;
        int stackOut_6_3 = 0;
        kh stackOut_5_0 = null;
        kh stackOut_5_1 = null;
        String stackOut_5_2 = null;
        int stackOut_5_3 = 0;
        kh stackOut_1_0 = null;
        kh stackOut_1_1 = null;
        String stackOut_1_2 = null;
        int stackOut_1_3 = 0;
        if (param0) {
          L0: {
            field_a = 107;
            stackOut_4_0 = null;
            stackOut_4_1 = null;
            stackOut_4_2 = re.c(6);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            stackIn_5_2 = stackOut_4_2;
            if (param0) {
              stackOut_6_0 = null;
              stackOut_6_1 = null;
              stackOut_6_2 = (String) (Object) stackIn_6_2;
              stackOut_6_3 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              stackIn_7_3 = stackOut_6_3;
              break L0;
            } else {
              stackOut_5_0 = null;
              stackOut_5_1 = null;
              stackOut_5_2 = (String) (Object) stackIn_5_2;
              stackOut_5_3 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              stackIn_7_3 = stackOut_5_3;
              break L0;
            }
          }
          new kh(stackIn_7_2, r.b(stackIn_7_3 != 0));
          return stackIn_7_0;
        } else {
          stackOut_1_0 = null;
          stackOut_1_1 = null;
          stackOut_1_2 = re.c(6);
          stackOut_1_3 = 1;
          stackIn_3_0 = stackOut_1_0;
          stackIn_3_1 = stackOut_1_1;
          stackIn_3_2 = stackOut_1_2;
          stackIn_3_3 = stackOut_1_3;
          new kh(stackIn_3_2, r.b(stackIn_3_3 != 0));
          return stackIn_3_0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = null;
    }
}
