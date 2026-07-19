/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge {
    static int field_e;
    static String field_f;
    static oa field_a;
    static String field_c;
    static Boolean field_d;
    static int field_b;

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        field_c = null;
        field_a = null;
        if (param0 <= -102) {
            return;
        }
        field_b = -22;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_2_0 = 0;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            if (param0 == -1) {
              L1: {
                if (param1 <= param2) {
                  break L1;
                } else {
                  var3_int = param2;
                  param2 = param1;
                  param1 = var3_int;
                  break L1;
                }
              }
              L2: while (true) {
                if (-1 == (param1 ^ -1)) {
                  stackOut_8_0 = param2;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3_int = param2 % param1;
                  param2 = param1;
                  param1 = var3_int;
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = -89;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var3), "ge.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_9_0;
        }
    }

    static {
        field_f = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_a = new oa();
        field_b = 608;
    }
}
