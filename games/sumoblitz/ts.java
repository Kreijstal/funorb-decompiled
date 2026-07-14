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

    public static void a(int param0) {
        if (param0 != -13252) {
            return;
        }
        field_e = null;
    }

    final static void a(int param0, jn param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        float[] var8 = null;
        int var9 = 0;
        float[] var10 = null;
        float[] var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        float[] var14 = null;
        float[] var15 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        L0: {
          var9 = Sumoblitz.field_L ? 1 : 0;
          if (ul.field_f != 1) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var6 = stackIn_3_0;
        if (param2 == -16240) {
          var7 = 0;
          L1: while (true) {
            L2: {
              if (var6 == 0) {
                stackOut_8_0 = 20;
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = 10;
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            if (stackIn_9_0 <= var7) {
              var7 = 0;
              L3: while (true) {
                L4: {
                  stackOut_12_0 = var7 ^ -1;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_13_0 = stackOut_12_0;
                  if (var6 == 0) {
                    stackOut_14_0 = stackIn_14_0;
                    stackOut_14_1 = 20;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    break L4;
                  } else {
                    stackOut_13_0 = stackIn_13_0;
                    stackOut_13_1 = 10;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    break L4;
                  }
                }
                if (stackIn_15_0 <= (stackIn_15_1 ^ -1)) {
                  return;
                } else {
                  var8 = new float[]{0.0f, (float)(-(fi.a(param3, he.field_o, (byte) -96) + 1))};
                  var11 = kt.a((byte) -10, var8, (float)(0.0 + 0.017453292519943295 * (double)(2048.0f / (float)var7)));
                  var8 = kt.a((byte) -10, var8, (float)(0.0 + 0.017453292519943295 * (double)(2048.0f / (float)var7)));
                  param1.a((ms) (Object) new vt(64, param0, param5, param4, (int)var11[0] << -193480408, (int)var11[1] << 76610824, 1), (byte) 39);
                  var7++;
                  continue L3;
                }
              }
            } else {
              var8 = new float[]{0.0f, (float)(-(fi.a(param3, he.field_o, (byte) -96) + 1))};
              var15 = kt.a((byte) -124, var8, (float)((double)(2048.0f / (float)var7) * 0.017453292519943295 + 0.0));
              var14 = var15;
              var13 = var14;
              var12 = var13;
              var10 = var12;
              var8 = var10;
              param1.a((ms) (Object) new vt(64, param0, param5, param4, (int)var15[0] << -1515274104, (int)var15[1] << -828949496, 0), (byte) 39);
              var7++;
              continue L1;
            }
          }
        } else {
          return;
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
