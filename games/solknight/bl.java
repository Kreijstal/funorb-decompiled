/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl extends gg {
    int field_h;
    static String field_m;
    static boolean field_p;
    static int field_i;
    int field_q;
    int field_l;
    int field_n;
    int field_j;
    int field_o;
    static int field_k;

    public static void a(int param0) {
        field_m = null;
    }

    final static od a(od param0, int[] param1, byte param2) {
        od var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        od stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        od stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 100) {
                break L1;
              } else {
                var4 = null;
                od discarded$2 = bl.a((od) null, (int[]) null, (byte) -77);
                break L1;
              }
            }
            var3 = new od(0, 0, 0);
            var3.field_m = param1;
            var3.field_b = param0.field_b;
            var3.field_a = param0.field_a;
            var3.field_i = param0.field_i;
            var3.field_n = param0.field_n;
            var3.field_d = param0.field_d;
            var3.field_l = param0.field_l;
            var3.field_j = param0.field_j;
            stackOut_2_0 = (od) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("bl.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(byte param0) {
        if (param0 != -81) {
            boolean discarded$3 = bl.a((byte) -9);
            if (kj.field_R < 20) {
                return true;
            }
            if (!bb.h(param0 + -44)) {
                return true;
            }
            if (c.field_H <= 0) {
                return false;
            }
            if (rd.b(6144)) {
                return false;
            }
            return true;
        }
        if (kj.field_R < 20) {
            return true;
        }
        if (!bb.h(param0 + -44)) {
            return true;
        }
        if (c.field_H <= 0) {
            return false;
        }
        if (rd.b(6144)) {
            return false;
        }
        return true;
    }

    final static od[] b(boolean param0) {
        int var2 = 0;
        int var3 = SolKnight.field_L ? 1 : 0;
        od[] var1 = new od[nb.field_c];
        for (var2 = 0; nb.field_c > var2; var2++) {
            var1[var2] = new od(kl.field_a, we.field_e, ph.field_h[var2], qf.field_d[var2], sa.field_l[var2], uj.field_b[var2], jc.field_c[var2], ig.field_H);
        }
        og.a((byte) -97);
        return var1;
    }

    bl(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((bl) this).field_q = param2;
        ((bl) this).field_j = param1;
        ((bl) this).field_h = param3;
        ((bl) this).field_n = param0;
        ((bl) this).field_l = param5;
        ((bl) this).field_o = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = false;
        field_m = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
