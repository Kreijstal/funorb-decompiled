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
        float[] dupTemp$1 = null;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        float[] var8 = null;
        int var9 = 0;
        float[] var10 = null;
        float[] var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
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
            if (param2 == -16240) {
              var7 = 0;
              L2: while (true) {
                L3: {
                  if (var6_int == 0) {
                    stackOut_10_0 = 20;
                    stackIn_11_0 = stackOut_10_0;
                    break L3;
                  } else {
                    stackOut_8_0 = 10;
                    stackIn_11_0 = stackOut_8_0;
                    stackIn_9_0 = stackOut_8_0;
                    if (var9 != 0) {
                      break L3;
                    } else {
                      stackOut_9_0 = stackIn_9_0;
                      stackIn_11_0 = stackOut_9_0;
                      break L3;
                    }
                  }
                }
                L4: {
                  if (stackIn_11_0 <= var7) {
                    break L4;
                  } else {
                    var8 = new float[]{0.0f, (float)(-(fi.a(param3, he.field_o, (byte) -96) + 1))};
                    var13 = kt.a((byte) -124, var8, (float)((double)(2048.0f / (float)var7) * 0.017453292519943295 + 0.0));
                    var12 = var13;
                    var10 = var12;
                    var8 = var10;
                    param1.a((ms) (new vt(64, param0, param5, param4, (int)var13[0] << -1515274104, (int)var13[1] << -828949496, 0)), (byte) 39);
                    var7++;
                    if (var9 == 0) {
                      continue L2;
                    } else {
                      break L4;
                    }
                  }
                }
                var7 = 0;
                L5: while (true) {
                  L6: {
                    L7: {
                      L8: {
                        stackOut_14_0 = var7 ^ -1;
                        stackIn_18_0 = stackOut_14_0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var6_int == 0) {
                          stackOut_18_0 = stackIn_18_0;
                          stackOut_18_1 = 20;
                          stackIn_19_0 = stackOut_18_0;
                          stackIn_19_1 = stackOut_18_1;
                          break L8;
                        } else {
                          stackOut_15_0 = stackIn_15_0;
                          stackOut_15_1 = 10;
                          stackIn_19_0 = stackOut_15_0;
                          stackIn_19_1 = stackOut_15_1;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          if (var9 == 0) {
                            break L8;
                          } else {
                            if (stackIn_16_0 <= stackIn_16_1) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      if (stackIn_19_0 <= (stackIn_19_1 ^ -1)) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                    var8 = new float[]{0.0f, (float)(-(fi.a(param3, he.field_o, (byte) -96) + 1))};
                    dupTemp$1 = kt.a((byte) -10, var8, (float)(0.0 + 0.017453292519943295 * (double)(2048.0f / (float)var7)));
                    var11 = dupTemp$1;
                    var8 = dupTemp$1;
                    param1.a((ms) (new vt(64, param0, param5, param4, (int)var11[0] << -193480408, (int)var11[1] << 76610824, 1)), (byte) 39);
                    var7++;
                    continue L5;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var6);
            stackOut_22_1 = new StringBuilder().append("ts.B(").append(param0).append(',');
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
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    ts(int param0, int param1, int param2, int param3) {
        this.field_f = param3;
        this.field_b = param0;
    }

    static {
    }
}
