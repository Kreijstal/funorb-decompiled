/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class im extends IOException {
    static int field_a;

    final static int a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param1 >= param0) {
                break L1;
              } else {
                var3_int = param1;
                param1 = param0;
                param0 = var3_int;
                break L1;
              }
            }
            L2: while (true) {
              if (param0 == 0) {
                var3_int = 0;
                stackOut_5_0 = param1;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                var3_int = param1 % param0;
                param1 = param0;
                param0 = var3_int;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var3, "im.A(" + param0 + 44 + param1 + 44 + 62 + 41);
        }
        return stackIn_6_0;
    }

    final static void a() {
        RuntimeException var2 = null;
        int var3 = 0;
        cc var4 = null;
        dc var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = EscapeVector.field_A;
        try {
          L0: {
            var4 = (cc) (Object) vn.field_e.a(false);
            L1: while (true) {
              if (var4 == null) {
                var5 = (dc) (Object) en.field_i.a(false);
                L2: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    int discarded$4 = -755;
                    oa.a(5, var5);
                    var5 = (dc) (Object) en.field_i.b((byte) 70);
                    continue L2;
                  }
                }
              } else {
                hg.a(-121, 5, var4);
                var4 = (cc) (Object) vn.field_e.b((byte) 70);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "im.B(" + 88 + 44 + 5 + 41);
        }
    }

    im(String param0) {
        super(param0);
    }

    static {
    }
}
