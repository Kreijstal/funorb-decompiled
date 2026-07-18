/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mi {
    static Hashtable field_b;
    static int field_a;

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (0 >= param2) {
                stackOut_4_0 = var3_int;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3_int = var3_int << 1 | param1 & 1;
                param2--;
                param1 = param1 >>> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var3, "mi.B(" + 72 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_5_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a() {
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new Hashtable();
        field_a = 0;
    }
}
