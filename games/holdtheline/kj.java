/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kj extends rd {
    static String field_o;
    static hj field_q;
    private int field_m;
    static boolean field_r;
    static hj field_p;
    static String field_n;

    final static int b(int param0, int param1) {
        if (param0 != 2) {
            field_o = (String) null;
        }
        return rf.a(param1, in.field_c, -1);
    }

    public static void a(byte param0) {
        field_o = null;
        field_q = null;
        if (param0 <= 96) {
            kj.a((byte) 21);
        }
        field_n = null;
        field_p = null;
    }

    final void a(int[] param0, int param1, byte param2, int[] param3) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            var9 = new int[param0.length + param3.length];
            var12 = var9;
            var11 = var12;
            var5 = var11;
            var6 = 0;
            L1: while (true) {
              if (param0.length <= var6) {
                L2: {
                  var10 = 0;
                  var6 = var10;
                  if (param2 < -49) {
                    break L2;
                  } else {
                    var8 = (int[]) null;
                    this.a((int[]) null, 1, (byte) -32, (int[]) null);
                    break L2;
                  }
                }
                L3: while (true) {
                  if (param3.length / 2 <= var10) {
                    gf.a(var12, this.field_m);
                    break L0;
                  } else {
                    var5[param0.length - -(2 * var10)] = param3[param3.length - (2 + 2 * var10)];
                    var5[1 + var10 * 2 + param0.length] = param3[param3.length + -1 + -(2 * var10)];
                    var10++;
                    continue L3;
                  }
                }
              } else {
                var9[var6] = param0[var6];
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5_ref);

            stackIn_12_1 = new StringBuilder().append("kj.D(");

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


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    kj(int param0, int param1) {
        this.field_c = param0 / 2;
        this.field_i = 2;
        this.field_h = -this.field_c + param0;
        this.field_k = 40.0f;
        this.field_m = param1;
    }

    final static boolean a(int param0, qm param1, qm param2, ei param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        ei var6 = null;
        int var7 = 0;
        lb var8 = null;
        int var9 = 0;
        lb var10 = null;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var10 = new lb(param2, param1, 0, false, true);
              if (param0 == 140) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            var5 = 0;
            L2: while (true) {
              if (var5 >= param3.field_e) {
                stackIn_13_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var6 = (ei) (param3.field_b[var5]);
                var7 = 0;
                L3: while (true) {
                  if (var7 >= var6.field_e) {
                    var5++;
                    continue L2;
                  } else {
                    var8 = (lb) (var6.field_b[var7]);
                    if (!th.a(param0 + -141, var10, var8)) {
                      var7++;
                      continue L3;
                    } else {
                      stackIn_9_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("kj.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_17_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    static {
        field_o = "Waiting for music";
        field_n = "<%0> unlocked!";
        field_p = new hj(540, 140);
    }
}
