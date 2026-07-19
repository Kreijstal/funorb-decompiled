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

    final static void a(int param0, jn param1, ah param2, int param3, int param4, int param5, byte param6) {
        byte[] discarded$2 = null;
        float[] dupTemp$3 = null;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        float[] var9 = null;
        int var10 = 0;
        Object var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        float[] var14 = null;
        float[] var15 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-2 != (ul.field_f ^ -1)) {
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
                  stackOut_8_0 = 30;
                  stackIn_9_0 = stackOut_8_0;
                  break L3;
                } else {
                  stackOut_6_0 = 15;
                  stackIn_9_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (var10 != 0) {
                    break L3;
                  } else {
                    stackOut_7_0 = stackIn_7_0;
                    stackIn_9_0 = stackOut_7_0;
                    break L3;
                  }
                }
              }
              L4: {
                if (stackIn_9_0 <= var8) {
                  break L4;
                } else {
                  var9 = new float[]{0.0f, (float)(-(fi.a(param3, he.field_o, (byte) -96) + 1))};
                  var15 = kt.a((byte) -33, var9, (float)((double)(2048.0f / (float)var8) * 0.017453292519943295 + 0.0));
                  var14 = var15;
                  var12 = var14;
                  var9 = var12;
                  param1.a((ms) (new cl(64, (int)var15[0] << 1439863275, (int)var15[1] << 2070029355, param0, -(int)var15[0] << -2112349432, -(int)var15[1] << -1360937048, 0, param2)), (byte) 39);
                  var8++;
                  if (var10 == 0) {
                    continue L2;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (param6 > 92) {
                  break L5;
                } else {
                  var11 = (Object) null;
                  discarded$2 = ab.a(false, (Object) null, -86);
                  break L5;
                }
              }
              var8 = 0;
              L6: while (true) {
                L7: {
                  L8: {
                    if (var7_int != 0) {
                      stackOut_17_0 = 15;
                      stackIn_18_0 = stackOut_17_0;
                      break L8;
                    } else {
                      stackOut_15_0 = 30;
                      stackIn_19_0 = stackOut_15_0;
                      stackIn_16_0 = stackOut_15_0;
                      if (var10 != 0) {
                        break L7;
                      } else {
                        stackOut_16_0 = stackIn_16_0;
                        stackIn_18_0 = stackOut_16_0;
                        break L8;
                      }
                    }
                  }
                  stackOut_18_0 = stackIn_18_0 ^ -1;
                  stackIn_19_0 = stackOut_18_0;
                  break L7;
                }
                L9: {
                  if (stackIn_19_0 >= (var8 ^ -1)) {
                    break L9;
                  } else {
                    var9 = new float[]{0.0f, (float)(-(1 + fi.a(param3, he.field_o, (byte) -96)))};
                    dupTemp$3 = kt.a((byte) -52, var9, (float)(0.0 + (double)(2048.0f / (float)var8) * 0.017453292519943295));
                    var13 = dupTemp$3;
                    var9 = dupTemp$3;
                    param1.a((ms) (new cl(64, (int)var13[0] << -1422295733, (int)var13[1] << 686062187, param0, -(int)var13[0] << 678690536, -(int)var13[1] << -355984472, 1, param2)), (byte) 39);
                    var8++;
                    if (var10 == 0) {
                      continue L6;
                    } else {
                      break L9;
                    }
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var7);
            stackOut_22_1 = new StringBuilder().append("ab.C(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L10;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L10;
            }
          }
          L11: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L11;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L11;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static byte[] a(boolean param0, Object param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        nn var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_12_0 = null;
        byte[] stackOut_7_0 = null;
        byte[] stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (param1 != null) {
              if (!(param1 instanceof byte[])) {
                L1: {
                  if (param2 == 0) {
                    break L1;
                  } else {
                    ab.a(-28);
                    break L1;
                  }
                }
                if (!(param1 instanceof nn)) {
                  throw new IllegalArgumentException();
                } else {
                  var4 = (nn) (param1);
                  stackOut_12_0 = var4.a(false);
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                var3 = (byte[]) (param1);
                if (!param0) {
                  stackOut_7_0 = (byte[]) (var3);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_5_0 = cp.a(var3, param2 ^ 0);
                  stackIn_6_0 = stackOut_5_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3_ref);
            stackOut_15_1 = new StringBuilder().append("ab.A(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 64) {
            return;
        }
        field_e = null;
        field_b = null;
    }

    static {
        field_e = "Achieved";
        field_d = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
