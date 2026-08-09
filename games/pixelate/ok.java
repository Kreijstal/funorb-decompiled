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
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (0 >= param2) {
              throw new IllegalArgumentException();
            } else {
              if (!oa.a(param2, 1890)) {
                if (param1 <= -95) {
                  var3_int = -(int)(4294967296L % (long)param2) + -2147483648;
                  L1: while (true) {
                    var4 = param0.nextInt();
                    if (var4 >= var3_int) {
                      continue L1;
                    } else {
                      stackIn_13_0 = eh.a(var4, param2, -510336929);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  stackIn_9_0 = -54;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackIn_6_0 = (int)((long)param2 * (4294967295L & (long)param0.nextInt()) >> -516798880);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("ok.B(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    static {
        field_b = "Unable to delete name - system busy";
        field_c = "Suggested names: ";
        field_a = "You are invited to <%0>'s game.";
    }
}
