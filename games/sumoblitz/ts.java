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
        float[] dupTemp$0 = null;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        float[] var8 = null;
        int var9 = 0;
        float[] var10 = null;
        float[] var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (ul.field_f != 1) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            var6_int = stackIn_4_0;
            if (param2 == -16240) {
              var7 = 0;
              L2: while (true) {
                L3: {
                  if (var6_int == 0) {
                    stackIn_10_0 = 20;
                    break L3;
                  } else {
                    stackIn_10_0 = 10;
                    break L3;
                  }
                }
                if (stackIn_10_0 <= var7) {
                  var7 = 0;
                  L4: while (true) {
                    L5: {
                      L6: {
                        L7: {
                          stackIn_17_0 = var7 ^ -1;

                          if (var6_int == 0) {
                            stackIn_18_0 = stackIn_17_0;
                            stackIn_18_1 = 20;
                            break L7;
                          } else {
                            stackIn_18_0 = stackIn_17_0;
                            stackIn_17_0 = stackIn_18_0;
                            stackIn_18_1 = 10;

                            break L7;
                          }
                        }
                        if (stackIn_18_0 <= (stackIn_18_1 ^ -1)) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                      var8 = new float[]{0.0f, (float)(-(fi.a(param3, he.field_o, (byte) -96) + 1))};
                      dupTemp$0 = kt.a((byte) -10, var8, (float)(0.0 + 0.017453292519943295 * (double)(2048.0f / (float)var7)));
                      var11 = dupTemp$0;
                      var8 = dupTemp$0;
                      param1.a((ms) (new vt(64, param0, param5, param4, (int)var11[0] << -193480408, (int)var11[1] << 76610824, 1)), (byte) 39);
                      var7++;
                      continue L4;
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  var8 = new float[]{0.0f, (float)(-(fi.a(param3, he.field_o, (byte) -96) + 1))};
                  var13 = kt.a((byte) -124, var8, (float)((double)(2048.0f / (float)var7) * 0.017453292519943295 + 0.0));
                  var12 = var13;
                  var10 = var12;
                  var8 = var10;
                  param1.a((ms) (new vt(64, param0, param5, param4, (int)var13[0] << -1515274104, (int)var13[1] << -828949496, 0)), (byte) 39);
                  var7++;
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var6);

            stackIn_23_1 = new StringBuilder().append("ts.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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
