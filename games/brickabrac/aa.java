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
        int stackIn_1_0 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackOut_0_0;
        int stackOut_2_0;
        int stackOut_2_1;
        int stackOut_1_0;
        int stackOut_1_1;
        int stackOut_3_0;
        int stackOut_3_1;
        int stackOut_5_0;
        int stackOut_5_1;
        int stackOut_5_2;
        int stackOut_4_0;
        int stackOut_4_1;
        int stackOut_4_2;
        L0: {
          fc.a(-109, param4.field_p);
          lb.g(0, 0, param4.field_i, param4.field_q, fj.field_Sb[param3], 0);
          stackOut_0_0 = -120;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param5 == 1) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = 13;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = stackIn_3_0;
          stackOut_3_1 = stackIn_3_1;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          if ((param5 ^ -1) == -2) {
            stackOut_5_0 = stackIn_5_0;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = 13;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            break L1;
          } else {
            stackOut_4_0 = stackIn_4_0;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = 20;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            break L1;
          }
        }
        og.a(stackIn_6_0, stackIn_6_1, stackIn_6_2, param1, 16777215, (param4.field_i - param1.field_x) / 2, 10 / param5 + -param1.field_z + (480 + param0));
        sc.b(-86);
        if (!param2) {
          field_c = null;
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        Object var2 = null;
        if (param0 < 23) {
          L0: {
            var2 = null;
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
            if (-1 > hc.field_f) {
              ef.a(-83);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        } else {
          L3: {
            if (-1 < hc.field_f) {
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
        int var3 = 0;
        int var4 = 0;
        if (param0 <= 0) {
            throw new IllegalArgumentException();
        }
        if (!param2) {
            field_b = null;
            if (!(!wn.a(param0, (byte) -6))) {
                return (int)((long)param0 * ((long)param1.nextInt() & 4294967295L) >> -1771002016);
            }
            var3 = -2147483648 - (int)(4294967296L % (long)param0);
            while (true) {
                var4 = param1.nextInt();
                if (var3 > var4) {
                    break;
                }
            }
            return er.a(-1560508993, param0, var4);
        }
        if (!(!wn.a(param0, (byte) -6))) {
            return (int)((long)param0 * ((long)param1.nextInt() & 4294967295L) >> -1771002016);
        }
        var3 = -2147483648 - (int)(4294967296L % (long)param0);
        while (true) {
            var4 = param1.nextInt();
            if (var3 > var4) {
                break;
            }
        }
        return er.a(-1560508993, param0, var4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new jp(270, 70);
        field_c = "Use this alternative as your account name";
        field_a = new vl();
    }
}
