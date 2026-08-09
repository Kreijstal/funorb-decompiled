/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class aa {
    static jp field_b;
    static vl field_a;
    static String field_c;

    public static void b(int param0) {
        field_b = null;
        if (param0 < 64) {
            aa.a((byte) 28);
            field_a = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static int a(int param0) {
        if (param0 != 480) {
            return 109;
        }
        return vo.field_x;
    }

    final static void a(int param0, jp param1, boolean param2, int param3, pb param4, int param5) {
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_6_2 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              fc.a(-109, param4.field_p);
              lb.g(0, 0, param4.field_i, param4.field_q, fj.field_Sb[param3], 0);
              stackIn_2_0 = -120;

              if (param5 == 1) {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = 13;
                break L1;
              } else {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = 0;
                break L1;
              }
            }
            L2: {




              if ((param5 ^ -1) == -2) {


                stackIn_6_2 = 13;
                break L2;
              } else {


                stackIn_6_2 = 20;
                break L2;
              }
            }
            og.a(stackIn_3_0, stackIn_3_1, stackIn_6_2, param1, 16777215, (param4.field_i - param1.field_x) / 2, 10 / param5 + -param1.field_z + (480 + param0));
            sc.b(-86);
            if (param2) {
              break L0;
            } else {
              field_c = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("aa.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param5 + ')');
        }
    }

    final static void a(byte param0) {
        pb var2;
        if (param0 < 23) {
          L0: {
            var2 = (pb) null;
            aa.a(90, (jp) null, false, 114, (pb) null, 94);
            if (-1 > (hc.field_f ^ -1)) {
              hc.field_f = hc.field_f - 1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (kc.field_q.field_f != ej.field_O) {
              rn.field_h = rn.field_h + (kc.field_q.field_f + -ej.field_O);
              ej.field_O = kc.field_q.field_f;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (-1 > (hc.field_f ^ -1)) {
              ef.a(-83);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        } else {
          L3: {
            if (-1 > (hc.field_f ^ -1)) {
              hc.field_f = hc.field_f - 1;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (kc.field_q.field_f != ej.field_O) {
              rn.field_h = rn.field_h + (kc.field_q.field_f + -ej.field_O);
              ej.field_O = kc.field_q.field_f;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (-1 > (hc.field_f ^ -1)) {
              ef.a(-83);
              break L5;
            } else {
              break L5;
            }
          }
          return;
        }
    }

    final static int a(int param0, Random param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 0) {
              L1: {
                if (param2) {
                  break L1;
                } else {
                  field_b = (jp) null;
                  break L1;
                }
              }
              if (wn.a(param0, (byte) -6)) {
                stackIn_7_0 = (int)((long)param0 * ((long)param1.nextInt() & 4294967295L) >> -1771002016);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                var3_int = -2147483648 - (int)(4294967296L % (long)param0);
                L2: while (true) {
                  var4 = param1.nextInt();
                  if (var3_int > var4) {
                    stackIn_12_0 = er.a(-1560508993, param0, var4);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    continue L2;
                  }
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("aa.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_12_0;
        }
    }

    static {
        field_b = new jp(270, 70);
        field_c = "Use this alternative as your account name";
        field_a = new vl();
    }
}
