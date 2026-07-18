/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fe {
    static boolean field_e;
    static boolean field_b;
    static d field_c;
    static char[] field_g;
    static pb[][] field_d;
    static pb field_a;
    static String field_f;

    abstract void a(int param0, java.awt.Component param1);

    abstract void a(byte param0, java.awt.Component param1);

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        var4 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param2 > param1) {
                var3_int = param1;
                param1 = param2;
                param2 = var3_int;
                L2: while (true) {
                  if (0 == param2) {
                    break L1;
                  } else {
                    var3_int = param1 % param2;
                    param1 = param2;
                    param2 = var3_int;
                    continue L2;
                  }
                }
              } else {
                L3: while (true) {
                  if (0 == param2) {
                    break L1;
                  } else {
                    var3_int = param1 % param2;
                    param1 = param2;
                    param2 = var3_int;
                    continue L3;
                  }
                }
              }
            }
            stackOut_7_0 = param1;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var3, "fe.E(" + -102 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_8_0;
    }

    public static void a() {
        field_f = null;
        field_g = null;
        field_c = null;
        field_a = null;
        field_d = null;
    }

    final static void a(ka param0) {
        int var2_int = 0;
        try {
            ci.field_b = param0.c((byte) 86) << 5;
            var2_int = param0.f(4);
            rc.field_h = (var2_int & 7) << 18;
            ci.field_b = ci.field_b + (var2_int >> 3);
            rc.field_h = rc.field_h + (param0.c((byte) 60) << 2);
            var2_int = param0.f(4);
            rc.field_h = rc.field_h + (var2_int >> 6);
            b.field_t = var2_int << 15 & 2064384;
            b.field_t = b.field_t + (param0.f(4) << 7);
            var2_int = param0.f(4);
            rb.field_w = 65536 & var2_int << 16;
            b.field_t = b.field_t + (var2_int >> 1);
            rb.field_w = rb.field_w + param0.c((byte) 25);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "fe.C(" + (param0 != null ? "{...}" : "null") + ',' + 12726 + ')');
        }
    }

    abstract int b(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_g = new char[]{'[', ']', '#'};
        field_f = "Music          ";
        field_d = new pb[8][128];
    }
}
