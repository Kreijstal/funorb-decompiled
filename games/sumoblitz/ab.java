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
        int var7 = 0;
        int var8 = 0;
        float[] var9 = null;
        int var10 = 0;
        Object var11 = null;
        float[] var12 = null;
        float[] var14 = null;
        float[] var15 = null;
        float[] var16 = null;
        float[] var18 = null;
        float[] var19 = null;
        float[] var20 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var10 = Sumoblitz.field_L ? 1 : 0;
          if (-2 != (ul.field_f ^ -1)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var7 = stackIn_3_0;
        var8 = 0;
        L1: while (true) {
          L2: {
            if (var7 == 0) {
              stackOut_6_0 = 30;
              stackIn_7_0 = stackOut_6_0;
              break L2;
            } else {
              stackOut_5_0 = 15;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
          }
          if (stackIn_7_0 <= var8) {
            if (param6 <= 92) {
              var11 = null;
              byte[] discarded$1 = ab.a(false, (Object) null, -86);
              var8 = 0;
              L3: while (true) {
                L4: {
                  if (var7 != 0) {
                    stackOut_20_0 = 15;
                    stackIn_21_0 = stackOut_20_0;
                    break L4;
                  } else {
                    stackOut_19_0 = 30;
                    stackIn_21_0 = stackOut_19_0;
                    break L4;
                  }
                }
                if ((stackIn_21_0 ^ -1) < (var8 ^ -1)) {
                  var9 = new float[]{0.0f, (float)(-(1 + fi.a(param3, he.field_o, (byte) -96)))};
                  var18 = kt.a((byte) -52, var9, (float)(0.0 + (double)(2048.0f / (float)var8) * 0.017453292519943295));
                  var9 = kt.a((byte) -52, var9, (float)(0.0 + (double)(2048.0f / (float)var8) * 0.017453292519943295));
                  param1.a((ms) (Object) new cl(64, (int)var18[0] << -1422295733, (int)var18[1] << 686062187, param0, -(int)var18[0] << 678690536, -(int)var18[1] << -355984472, 1, param2), (byte) 39);
                  var8++;
                  continue L3;
                } else {
                  return;
                }
              }
            } else {
              var8 = 0;
              L5: while (true) {
                L6: {
                  if (var7 != 0) {
                    stackOut_13_0 = 15;
                    stackIn_14_0 = stackOut_13_0;
                    break L6;
                  } else {
                    stackOut_12_0 = 30;
                    stackIn_14_0 = stackOut_12_0;
                    break L6;
                  }
                }
                if ((stackIn_14_0 ^ -1) >= (var8 ^ -1)) {
                  return;
                } else {
                  var9 = new float[]{0.0f, (float)(-(1 + fi.a(param3, he.field_o, (byte) -96)))};
                  var19 = kt.a((byte) -52, var9, (float)(0.0 + (double)(2048.0f / (float)var8) * 0.017453292519943295));
                  var9 = kt.a((byte) -52, var9, (float)(0.0 + (double)(2048.0f / (float)var8) * 0.017453292519943295));
                  param1.a((ms) (Object) new cl(64, (int)var19[0] << -1422295733, (int)var19[1] << 686062187, param0, -(int)var19[0] << 678690536, -(int)var19[1] << -355984472, 1, param2), (byte) 39);
                  var8++;
                  continue L5;
                }
              }
            }
          } else {
            var9 = new float[]{0.0f, (float)(-(fi.a(param3, he.field_o, (byte) -96) + 1))};
            var20 = kt.a((byte) -33, var9, (float)((double)(2048.0f / (float)var8) * 0.017453292519943295 + 0.0));
            var16 = var20;
            var15 = var16;
            var14 = var15;
            var12 = var14;
            var9 = var12;
            param1.a((ms) (Object) new cl(64, (int)var20[0] << 1439863275, (int)var20[1] << 2070029355, param0, -(int)var20[0] << -2112349432, -(int)var20[1] << -1360937048, 0, param2), (byte) 39);
            var8++;
            continue L1;
          }
        }
    }

    final static byte[] a(boolean param0, Object param1, int param2) {
        byte[] var3 = null;
        nn var4 = null;
        if (param1 != null) {
          if (!(param1 instanceof byte[])) {
            if (param2 == 0) {
              if (param1 instanceof nn) {
                var4 = (nn) param1;
                return var4.a(false);
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              ab.a(-28);
              if (param1 instanceof nn) {
                var4 = (nn) param1;
                return var4.a(false);
              } else {
                throw new IllegalArgumentException();
              }
            }
          } else {
            var3 = (byte[]) param1;
            if (param0) {
              return cp.a(var3, param2 ^ 0);
            } else {
              return var3;
            }
          }
        } else {
          return null;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Achieved";
        field_d = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
