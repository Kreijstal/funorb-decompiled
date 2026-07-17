/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends jg implements vo {
    private qm field_O;
    static bb field_P;
    static int field_G;
    private gj field_Q;
    static int[] field_N;
    static String field_R;

    final void a(int param0) {
        int var2 = 0;
        var2 = 250;
        if (param0 != 14210) {
          return;
        } else {
          ((oj) this).field_Q.a(140, (byte) 73, 20 + (((oj) this).field_C - 25) >> 1, ((oj) this).field_E - var2 >> 1, 25);
          ((oj) this).field_O.a(100, (byte) 57, 2 + (-30 + (20 + ((oj) this).field_C) >> 1), 10 + ((((oj) this).field_E + -var2 >> 1) + 140), 30);
          return;
        }
    }

    public static void n() {
        field_R = null;
        field_N = null;
        field_P = null;
    }

    final void a(int param0, int param1, int param2, ng param3) {
        RuntimeException var5 = null;
        Object var6 = null;
        qm stackIn_1_0 = null;
        qm stackIn_2_0 = null;
        qm stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        qm stackOut_0_0 = null;
        qm stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        qm stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              stackOut_0_0 = ((oj) this).field_O;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (((oj) this).field_Q.a(1).a((byte) 88) != qk.field_g) {
                stackOut_2_0 = (qm) (Object) stackIn_2_0;
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = (qm) (Object) stackIn_1_0;
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            stackIn_3_0.field_H = stackIn_3_1 != 0;
            if (param0 == 40) {
              break L0;
            } else {
              var6 = null;
              ((oj) this).a(78, -97, 93, (ng) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("oj.L(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    public final void a(qm param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (((oj) this).field_Q.a(1).a((byte) 69) != qk.field_g) {
              return;
            } else {
              L1: {
                ui.a(123, ((oj) this).field_Q.e((byte) 83), ((oj) this).field_Q.c(true), ((oj) this).field_Q.l(25));
                if (param2 == 11) {
                  break L1;
                } else {
                  field_R = null;
                  break L1;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) runtimeException;
            stackOut_6_1 = new StringBuilder().append("oj.Q(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    oj(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (eb) null);
        ((oj) this).field_Q = new gj((eb) (Object) new gh(10000536), mg.field_l, 0, 0, 140, 25);
        ((oj) this).field_Q.a(new oa(), 20672);
        ((oj) this).field_O = new qm(vi.field_J, (fn) this);
        ((oj) this).field_L = new ng[]{(ng) (Object) ((oj) this).field_Q, (ng) (Object) ((oj) this).field_O};
        ((oj) this).field_O.field_y = (eb) (Object) new ad();
        ((oj) this).c((byte) 121);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, (byte) 119);
        ep.field_b.a(ng.field_v, 4 + param2 + ((oj) this).field_z, ep.field_b.field_w + (param0 + ((oj) this).field_p + 4), 16777215, -1);
        int var5 = -53 % ((70 - param3) / 49);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = -1;
        field_P = new bb();
        field_N = new int[]{2, 20, 21, 27, 6, 5, 9};
        field_R = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
