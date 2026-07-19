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
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        var4 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param0 <= -100) {
                break L1;
              } else {
                field_f = (String) null;
                break L1;
              }
            }
            L2: {
              if (param2 > param1) {
                var3_int = param1;
                param1 = param2;
                param2 = var3_int;
                L3: while (true) {
                  if (0 == param2) {
                    break L2;
                  } else {
                    var3_int = param1 % param2;
                    param1 = param2;
                    param2 = var3_int;
                    continue L3;
                  }
                }
              } else {
                L4: while (true) {
                  if (0 == param2) {
                    break L2;
                  } else {
                    var3_int = param1 % param2;
                    param1 = param2;
                    param2 = var3_int;
                    continue L4;
                  }
                }
              }
            }
            stackOut_9_0 = param1;
            stackIn_10_0 = stackOut_9_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "fe.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_10_0;
    }

    public static void a(int param0) {
        field_f = null;
        field_g = null;
        if (param0 != 31147) {
          field_g = (char[]) null;
          field_c = null;
          field_a = null;
          field_d = (pb[][]) null;
          return;
        } else {
          field_c = null;
          field_a = null;
          field_d = (pb[][]) null;
          return;
        }
    }

    final static void a(ka param0, int param1) {
        int var2_int = 0;
        if (param1 != 12726) {
            return;
        }
        try {
            ci.field_b = param0.c((byte) 86) << -2100393883;
            var2_int = param0.f(4);
            rc.field_h = (var2_int & 7) << -501015630;
            ci.field_b = ci.field_b + (var2_int >> -363528413);
            rc.field_h = rc.field_h + (param0.c((byte) 60) << -775967230);
            var2_int = param0.f(4);
            rc.field_h = rc.field_h + (var2_int >> -1786230554);
            b.field_t = var2_int << 1788458575 & 2064384;
            b.field_t = b.field_t + (param0.f(param1 + -12722) << 1568877031);
            var2_int = param0.f(4);
            rb.field_w = 65536 & var2_int << -646771856;
            b.field_t = b.field_t + (var2_int >> 1008506945);
            rb.field_w = rb.field_w + param0.c((byte) 25);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "fe.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract int b(int param0);

    static {
        field_b = false;
        field_g = new char[]{(char)91, (char)93, (char)35};
        field_f = "Music          ";
        field_d = new pb[8][128];
    }
}
