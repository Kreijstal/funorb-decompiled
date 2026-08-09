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
        int var6 = 0;
        int[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param2 <= -126) {
                break L1;
              } else {
                var7 = (int[]) null;
                mp.a((Random) null, (int[]) null, -15, 56, 15);
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              L3: {
                if (8 <= var5_int) {
                  break L3;
                } else {
                  oh.a(param4, 7);
                  if (al.field_o.a(param3, (byte) 104)) {
                    if (!ll.a((byte) -110, param0, hb.a((byte) -111, param3), param1)) {
                      break L3;
                    } else {
                      var5_int++;
                      continue L2;
                    }
                  } else {
                    return;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("mp.C(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static cf a(String param0, String param1, int param2, int param3) {
        RuntimeException var4 = null;
        int[] var5 = null;
        cf stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                var5 = (int[]) null;
                mp.a((Random) null, (int[]) null, -57, -11, 117);
                break L1;
              }
            }
            stackIn_3_0 = hd.a(false, param3, param1 + "_" + param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("mp.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
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
