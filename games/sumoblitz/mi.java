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
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          var3_int = 0;
          while (0 < param2) {
            var3_int = var3_int << 1 | param1 & 1;
            param2--;
            param1 = param1 >>> 1;
          }
          if (param0 != 72) {
            field_a = 103;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var3), "mi.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
          mi.a((byte) 75, 50, 40);
        }
    }

    static {
        field_b = new Hashtable();
        field_a = 0;
    }
}
