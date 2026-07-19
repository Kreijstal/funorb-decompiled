/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class im extends IOException {
    static int field_a;

    final static int a(int param0, int param1, int param2) {
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
                var3_int = 59 % ((-4 - param2) / 49);
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
          throw t.a((Throwable) ((Object) var3), "im.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(byte param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        cc var4 = null;
        dc var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param0 > 48) {
                break L1;
              } else {
                field_a = 28;
                break L1;
              }
            }
            var4 = (cc) ((Object) vn.field_e.a(false));
            L2: while (true) {
              if (var4 == null) {
                var5 = (dc) ((Object) en.field_i.a(false));
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    oa.a(param1, var5, -755);
                    var5 = (dc) ((Object) en.field_i.b((byte) 70));
                    continue L3;
                  }
                }
              } else {
                hg.a(-121, param1, var4);
                var4 = (cc) ((Object) vn.field_e.b((byte) 70));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "im.B(" + param0 + ',' + param1 + ')');
        }
    }

    im(String param0) {
        super(param0);
    }

    static {
    }
}
