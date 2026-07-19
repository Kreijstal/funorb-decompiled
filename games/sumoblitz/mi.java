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
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (0 >= param2) {
                    break L3;
                  } else {
                    var3_int = var3_int << 1786806113 | param1 & 1;
                    param2--;
                    param1 = param1 >>> 1;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == 72) {
                  break L2;
                } else {
                  field_a = 103;
                  break L2;
                }
              }
              stackOut_8_0 = var3_int;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var3), "mi.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(boolean param0) {
        int discarded$0 = 0;
        field_b = null;
        if (param0) {
            discarded$0 = mi.a((byte) 75, 50, 40);
        }
    }

    static {
        field_b = new Hashtable();
        field_a = 0;
    }
}
