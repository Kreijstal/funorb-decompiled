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
        float[] dupTemp$0 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        float[] var9 = null;
        int var10 = 0;
        Object var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        float[] var14 = null;
        float[] var15 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-2 != (ul.field_f ^ -1)) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            var7_int = stackIn_4_0;
            var8 = 0;
            L2: while (true) {
              L3: {
                if (var7_int == 0) {
                  stackIn_8_0 = 30;
                  break L3;
                } else {
                  stackIn_8_0 = 15;
                  break L3;
                }
              }
              if (stackIn_8_0 <= var8) {
                L4: {
                  if (param6 > 92) {
                    break L4;
                  } else {
                    var11 = (Object) null;
                    ab.a(false, (Object) null, -86);
                    break L4;
                  }
                }
                var8 = 0;
                L5: while (true) {
                  L6: {
                    if (var7_int != 0) {
                      stackIn_16_0 = 15;
                      break L6;
                    } else {
                      stackIn_16_0 = 30;
                      break L6;
                    }
                  }
                  if ((stackIn_16_0 ^ -1) >= (var8 ^ -1)) {
                    break L0;
                  } else {
                    var9 = new float[]{0.0f, (float)(-(1 + fi.a(param3, he.field_o, (byte) -96)))};
                    dupTemp$0 = kt.a((byte) -52, var9, (float)(0.0 + (double)(2048.0f / (float)var8) * 0.017453292519943295));
                    var13 = dupTemp$0;
                    var9 = dupTemp$0;
                    param1.a((ms) (new cl(64, (int)var13[0] << -1422295733, (int)var13[1] << 686062187, param0, -(int)var13[0] << 678690536, -(int)var13[1] << -355984472, 1, param2)), (byte) 39);
                    var8++;
                    continue L5;
                  }
                }
              } else {
                var9 = new float[]{0.0f, (float)(-(fi.a(param3, he.field_o, (byte) -96) + 1))};
                var15 = kt.a((byte) -33, var9, (float)((double)(2048.0f / (float)var8) * 0.017453292519943295 + 0.0));
                var14 = var15;
                var12 = var14;
                var9 = var12;
                param1.a((ms) (new cl(64, (int)var15[0] << 1439863275, (int)var15[1] << 2070029355, param0, -(int)var15[0] << -2112349432, -(int)var15[1] << -1360937048, 0, param2)), (byte) 39);
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var7);

            stackIn_21_1 = new StringBuilder().append("ab.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                  stackIn_13_0 = var4.a(false);
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                var3 = (byte[]) (param1);
                if (!param0) {
                  stackIn_8_0 = (byte[]) (var3);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_6_0 = cp.a(var3, param2 ^ 0);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("ab.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
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
