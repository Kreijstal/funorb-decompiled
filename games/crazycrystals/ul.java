/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.util.Vector;

final class ul extends um {
    private int field_h;
    private int field_i;
    static mk field_j;
    static int field_g;
    static vm field_k;

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        RuntimeException var6 = null;
        jo stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ul.b(true);
                break L1;
              }
            }
            this.field_i = this.field_i + 1;
            this.field_h = this.field_h + param3;
            stackIn_3_0 = new jo(bm.field_g, 1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("ul.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (f) ((Object) stackIn_3_0);
    }

    final static void a(mj param0, boolean param1, f[][] param2, byte param3) {
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: while (true) {
              param0.a(120);
              if (param2[param0.field_c][param0.field_b].a(false, param2, param0)) {
                param2[param0.field_c][param0.field_b] = param2[param0.field_c][param0.field_b].a(param0, (byte) -119, param1, param2);
                continue L1;
              } else {
                if (param3 >= 18) {
                  break L0;
                } else {
                  ul.a((mj) null, true, (f[][]) null, (byte) 24);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("ul.D(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0) {
        tb.field_d.a(jj.field_a, 100, this.field_i * (48 * gi.field_m), this.field_h / this.field_i);
        int var2 = -101 % ((29 - param0) / 42);
        this.field_i = 0;
        this.field_h = 0;
    }

    final static boolean a(boolean param0) {
        Vector[] stackIn_3_0 = null;
        Vector[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        Vector[] stackIn_20_0 = null;
        Vector[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_29_0 = 0;
        if (param0) {
          L0: {
            stackIn_20_0 = ol.field_z;

            if (0 < mo.field_l) {
              stackIn_21_0 = (Vector[]) ((Object) stackIn_20_0);
              stackIn_21_1 = 2;
              break L0;
            } else {
              stackIn_21_0 = (Vector[]) ((Object) stackIn_20_0);
              stackIn_21_1 = 1;
              break L0;
            }
          }
          if (stackIn_21_0[stackIn_21_1] != null) {
            if (!jc.field_b) {
              if (!rc.a(-82)) {
                return false;
              } else {
                return true;
              }
            } else {
              if (!gh.field_y) {
                L1: {
                  if (!rc.a(-82)) {
                    stackIn_29_0 = 0;
                    break L1;
                  } else {
                    stackIn_29_0 = 1;
                    break L1;
                  }
                }
                return stackIn_29_0 != 0;
              } else {
                return true;
              }
            }
          } else {
            return false;
          }
        } else {
          L2: {
            ul.b(false);
            stackIn_3_0 = ol.field_z;

            if (0 < mo.field_l) {
              stackIn_4_0 = (Vector[]) ((Object) stackIn_3_0);
              stackIn_4_1 = 2;
              break L2;
            } else {
              stackIn_4_0 = (Vector[]) ((Object) stackIn_3_0);
              stackIn_4_1 = 1;
              break L2;
            }
          }
          if (stackIn_4_0[stackIn_4_1] != null) {
            if (jc.field_b) {
              if (gh.field_y) {
                return true;
              } else {
                L3: {
                  if (!rc.a(-82)) {
                    stackIn_15_0 = 0;
                    break L3;
                  } else {
                    stackIn_15_0 = 1;
                    break L3;
                  }
                }
                return stackIn_15_0 != 0;
              }
            } else {
              L4: {
                if (!rc.a(-82)) {
                  stackIn_10_0 = 0;
                  break L4;
                } else {
                  stackIn_10_0 = 1;
                  break L4;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    ul() {
        this.field_h = 0;
        this.field_i = 0;
    }

    final pb b(byte param0) {
        if (param0 > -127) {
            this.field_h = 60;
            return (pb) ((Object) new tc());
        }
        return (pb) ((Object) new tc());
    }

    public static void b(boolean param0) {
        if (!param0) {
            field_k = (vm) null;
            field_j = null;
            field_k = null;
            return;
        }
        field_j = null;
        field_k = null;
    }

    static {
        field_j = new mk();
    }
}
