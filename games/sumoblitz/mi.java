/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mi {
    static Hashtable field_b;
    static int field_a;

    final static int a(byte param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var3 = 0;
        L0: while (true) {
          if (0 >= param2) {
            if (param0 != 72) {
              field_a = 103;
              return var3;
            } else {
              return var3;
            }
          } else {
            var3 = var3 << 1786806113 | param1 & 1;
            param2--;
            param1 = param1 >>> 1;
            continue L0;
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
            int discarded$0 = mi.a((byte) 75, 50, 40);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new Hashtable();
        field_a = 0;
    }
}
