/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class bk extends mf {
    static String field_i;
    static int[] field_h;
    static bi[] field_j;

    final static jb a(int param0, boolean param1, boolean param2, int param3) {
        bd var8 = null;
        bd var9 = null;
        jb var7 = new jb(3);
        var7.field_m = param1 ? true : false;
        var7.field_b = 215;
        var7.field_k = 520;
        var7.field_s = 62;
        var7.field_c = 81;
        var7.field_l = param3;
        int var5 = 20 + (var7.field_c + var7.field_b);
        int discarded$3 = 1;
        if (tj.a()) {
            var8 = new bd(16, ba.field_Q, (ok) (Object) pn.field_a);
            var8.field_j = 320 + -(var8.field_f / 2);
            var8.field_b = var5;
            var7.a((byte) -61, var8);
            var5 += 40;
        }
        if (bj.field_m) {
            var9 = new bd(11, rn.field_d, (ok) (Object) pn.field_a);
            var9.field_b = var5;
            var9.field_j = 320 - var9.field_f / 2;
            var5 += 40;
            var7.a((byte) -120, var9);
        }
        bd var10 = new bd(14, fl.field_b, (ok) (Object) pn.field_a);
        var10.field_j = -(var10.field_f / 2) + 320;
        var10.field_b = var5;
        var7.a((byte) -111, var10);
        var7.a(param2, 26206, 0);
        return var7;
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (((bk) this).a((byte) -126, param0) != fb.field_e) {
              if (param1) {
                stackOut_6_0 = si.field_d;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (String) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = ml.field_c;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("bk.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
        return stackIn_7_0;
    }

    final fi a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        Object stackIn_5_0 = null;
        fi stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        fi stackOut_8_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (null != nl.a(0, param1)) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            var3_int = stackIn_3_0;
            if (param0 <= -44) {
              if (var3_int == 0) {
                stackOut_8_0 = fb.field_e;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                return nn.field_q;
              }
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (fi) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("bk.C(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0;
    }

    public static void e() {
        field_i = null;
        field_h = null;
        field_j = null;
    }

    bk(ul param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "<col=FFFFFF>Other missiles:</col> awarded at random whenever nothing else is due.";
        field_j = new bi[4];
        field_h = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1};
    }
}
