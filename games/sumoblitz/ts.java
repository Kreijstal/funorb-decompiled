/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ts {
    static int field_a;
    static hr[] field_e;
    static int field_c;
    static boolean field_d;
    int field_b;
    int field_f;

    public static void a() {
        field_e = null;
    }

    final static void a(int param0, jn param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        float[] var8 = null;
        int var9 = 0;
        float[] var10 = null;
        float[] var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        float[] var14 = null;
        float[] var15 = null;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (ul.field_f != 1) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var6_int = stackIn_4_0;
            var7 = 0;
            L2: while (true) {
              L3: {
                if (var6_int == 0) {
                  stackOut_9_0 = 20;
                  stackIn_10_0 = stackOut_9_0;
                  break L3;
                } else {
                  stackOut_8_0 = 10;
                  stackIn_10_0 = stackOut_8_0;
                  break L3;
                }
              }
              if (stackIn_10_0 <= var7) {
                var7 = 0;
                L4: while (true) {
                  L5: {
                    stackOut_13_0 = ~var7;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if (var6_int == 0) {
                      stackOut_15_0 = stackIn_15_0;
                      stackOut_15_1 = 20;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      break L5;
                    } else {
                      stackOut_14_0 = stackIn_14_0;
                      stackOut_14_1 = 10;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      break L5;
                    }
                  }
                  if (stackIn_16_0 <= ~stackIn_16_1) {
                    break L0;
                  } else {
                    int discarded$3 = -96;
                    var8 = new float[]{0.0f, (float)(-(fi.a(param3, he.field_o) + 1))};
                    float[] dupTemp$4 = kt.a((byte) -10, var8, (float)(0.0 + 0.017453292519943295 * (double)(2048.0f / (float)var7)));
                    var11 = dupTemp$4;
                    var8 = dupTemp$4;
                    param1.a((ms) (Object) new vt(64, param0, param5, param4, (int)var11[0] << 8, (int)var11[1] << 8, 1), (byte) 39);
                    var7++;
                    continue L4;
                  }
                }
              } else {
                int discarded$5 = -96;
                var8 = new float[]{0.0f, (float)(-(fi.a(param3, he.field_o) + 1))};
                var15 = kt.a((byte) -124, var8, (float)((double)(2048.0f / (float)var7) * 0.017453292519943295 + 0.0));
                var14 = var15;
                var13 = var14;
                var12 = var13;
                var10 = var12;
                var8 = var10;
                param1.a((ms) (Object) new vt(64, param0, param5, param4, (int)var15[0] << 8, (int)var15[1] << 8, 0), (byte) 39);
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var6;
            stackOut_19_1 = new StringBuilder().append("ts.B(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + -16240 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    ts(int param0, int param1, int param2, int param3) {
        ((ts) this).field_f = param3;
        ((ts) this).field_b = param0;
    }

    static {
    }
}
