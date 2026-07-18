/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ab {
    static te field_a;
    static Object field_b;
    static String field_d;
    static String field_e;
    static int field_c;

    abstract void a(float param0, int param1, float param2, float param3, int param4, int param5, int param6, float[] param7, int param8, float param9, int param10);

    final static void a(int param0, jn param1, ah param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        float[] var9 = null;
        int var10 = 0;
        float[] var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        float[] var14 = null;
        float[] var15 = null;
        float[] var16 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
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
            var7_int = stackIn_4_0;
            var8 = 0;
            L2: while (true) {
              L3: {
                if (var7_int == 0) {
                  stackOut_7_0 = 30;
                  stackIn_8_0 = stackOut_7_0;
                  break L3;
                } else {
                  stackOut_6_0 = 15;
                  stackIn_8_0 = stackOut_6_0;
                  break L3;
                }
              }
              if (stackIn_8_0 <= var8) {
                var8 = 0;
                L4: while (true) {
                  L5: {
                    if (var7_int != 0) {
                      stackOut_13_0 = 15;
                      stackIn_14_0 = stackOut_13_0;
                      break L5;
                    } else {
                      stackOut_12_0 = 30;
                      stackIn_14_0 = stackOut_12_0;
                      break L5;
                    }
                  }
                  if (~stackIn_14_0 >= ~var8) {
                    break L0;
                  } else {
                    int discarded$3 = -96;
                    var9 = new float[]{0.0f, (float)(-(1 + fi.a(40, he.field_o)))};
                    float[] dupTemp$4 = kt.a((byte) -52, var9, (float)(0.0 + (double)(2048.0f / (float)var8) * 0.017453292519943295));
                    var12 = dupTemp$4;
                    var9 = dupTemp$4;
                    param1.a((ms) (Object) new cl(64, (int)var12[0] << 11, (int)var12[1] << 11, param0, -(int)var12[0] << 8, -(int)var12[1] << 8, 1, param2), (byte) 39);
                    var8++;
                    continue L4;
                  }
                }
              } else {
                int discarded$5 = -96;
                var9 = new float[]{0.0f, (float)(-(fi.a(40, he.field_o) + 1))};
                var16 = kt.a((byte) -33, var9, (float)((double)(2048.0f / (float)var8) * 0.017453292519943295 + 0.0));
                var15 = var16;
                var14 = var15;
                var13 = var14;
                var11 = var13;
                var9 = var11;
                param1.a((ms) (Object) new cl(64, (int)var16[0] << 11, (int)var16[1] << 11, param0, -(int)var16[0] << 8, -(int)var16[1] << 8, 0, param2), (byte) 39);
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var7 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var7;
            stackOut_17_1 = new StringBuilder().append("ab.C(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + 40 + ',' + param4 + ',' + param5 + ',' + 121 + ')');
        }
    }

    final static byte[] a(boolean param0, Object param1) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        nn var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_10_0 = null;
        byte[] stackOut_7_0 = null;
        byte[] stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          if (param1 != null) {
            if (!(param1 instanceof byte[])) {
              int discarded$5 = -28;
              ab.a();
              if (!(param1 instanceof nn)) {
                throw new IllegalArgumentException();
              } else {
                var4 = (nn) param1;
                stackOut_10_0 = var4.a(false);
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0;
              }
            } else {
              var3 = (byte[]) param1;
              if (!param0) {
                stackOut_7_0 = (byte[]) var3;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                stackOut_5_0 = cp.a(var3, 0);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (byte[]) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("ab.A(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L0;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L0;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + 0 + ')');
        }
    }

    public static void a() {
        field_d = null;
        field_a = null;
        field_e = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Achieved";
        field_d = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
