/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mp {
    static String field_e;
    static String field_b;
    static se field_a;
    static String field_c;
    static String field_f;
    static String field_g;
    static int field_d;

    public static void a(byte param0) {
        field_e = null;
        field_g = null;
        int var1 = 20 / ((param0 - 45) / 60);
        field_b = null;
        field_c = null;
        field_a = null;
        field_f = null;
    }

    final static void a(Random param0, int[] param1, int param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException runtimeException = null;
        int var6 = 0;
        int[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = DungeonAssault.field_K;
        try {
          if (param2 > -126) {
            var7 = (int[]) null;
            mp.a((Random) null, (int[]) null, -15, 56, 15);
          }
          for (var5_int = 0; 8 > var5_int; var5_int++) {
            oh.a(param4, 7);
            if (!al.field_o.a(param3, (byte) 104)) {
              return;
            }
            if (ll.a((byte) -110, param0, hb.a((byte) -111, param3), param1)) {
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("mp.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static cf a(String param0, String param1, int param2, int param3) {
        RuntimeException var4 = null;
        int[] var5 = null;
        cf stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            var5 = (int[]) null;
            mp.a((Random) null, (int[]) null, -57, -11, 117);
          }
          stackIn_3_0 = hd.a(false, param3, param1 + "_" + param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("mp.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    static {
        field_b = "Email (Login):";
        field_c = "Loading fonts";
        field_e = "Yes";
        field_f = "Orb coins: ";
        field_g = "Shapeshifter";
    }
}
