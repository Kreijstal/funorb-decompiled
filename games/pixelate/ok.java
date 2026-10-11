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
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          if (0 >= param2) {
            throw new IllegalArgumentException();
          }
          if (oa.a(param2, 1890)) {
            stackIn_6_0 = (int)((long)param2 * (4294967295L & (long)param0.nextInt()) >> 32);
            return stackIn_6_0;
          }
          if (param1 > -95) {
            stackIn_9_0 = -54;
            return stackIn_9_0;
          }
          var3_int = -(int)(4294967296L % (long)param2) + -2147483648;
          do {
            var4 = param0.nextInt();
          } while (var4 >= var3_int);
          stackIn_13_0 = eh.a(var4, param2, -510336929);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ok.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_b = "Unable to delete name - system busy";
        field_c = "Suggested names: ";
        field_a = "You are invited to <%0>'s game.";
    }
}
