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

    public static void a() {
        field_f = null;
        field_d = null;
        field_c = null;
        field_a = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
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
              if (param1 == 0) {
                stackOut_7_0 = param2;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                var3_int = param2 % param1;
                param2 = param1;
                param1 = var3_int;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var3, "ge.B(" + -1 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_8_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_a = new oa();
        field_b = 608;
    }
}
