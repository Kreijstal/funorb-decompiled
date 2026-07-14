/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ok {
    static String field_b;
    static String field_c;
    static String field_a;

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 > -105) {
            ok.a((byte) -61);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static int a(Random param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        if (0 >= param2) {
          throw new IllegalArgumentException();
        } else {
          if (!oa.a(param2, 1890)) {
            if (param1 > -95) {
              return -54;
            } else {
              var3 = -(int)(4294967296L % (long)param2) + -2147483648;
              L0: while (true) {
                var4 = param0.nextInt();
                if (var4 >= var3) {
                  continue L0;
                } else {
                  return eh.a(var4, param2, -510336929);
                }
              }
            }
          } else {
            return (int)((long)param2 * (4294967295L & (long)param0.nextInt()) >> -516798880);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Unable to delete name - system busy";
        field_c = "Suggested names: ";
        field_a = "You are invited to <%0>'s game.";
    }
}
