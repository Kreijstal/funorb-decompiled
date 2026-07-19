/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class doa {
    private va field_a;

    final static jua a(String param0, int param1, byte param2) {
        int discarded$2 = 0;
        jua var3 = null;
        RuntimeException var3_ref = null;
        jua stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        jua stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3 = new jua(false);
              var3.field_b = param0;
              var3.field_f = param1;
              if (param2 == 114) {
                break L1;
              } else {
                discarded$2 = doa.a(-6, 122, 25);
                break L1;
              }
            }
            stackOut_2_0 = (jua) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("doa.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(int param0, int param1, int param2) {
        if (param0 != 2) {
            return -126;
        }
        return gqa.a(param2, (byte) 24, param1 >> 434451208) << 1759462184;
    }

    final static g b(int param0, int param1, int param2) {
        g var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        g[] var7 = cm.field_a[param2].field_c;
        g[] var3 = var7;
        int var4 = param1;
        do {
            if (var7.length <= var4) {
                return null;
            }
            var5 = var7[var4];
            if (var5.field_f == param0) {
                return var5;
            }
            var4++;
        } while (var6 == 0);
        return null;
    }

    doa() {
        qf discarded$0 = new qf(786336);
        int discarded$1 = bia.a((byte) 93, 1600);
    }

    final void a(int param0, cka param1) {
        tj discarded$0 = null;
        tj discarded$2 = null;
        tj discarded$3 = null;
        try {
            this.field_a = param1.a(196584, (byte[]) null, 24, true, (byte) 88);
            discarded$0 = new tj(this.field_a, 5126, 2, 0);
            discarded$2 = new tj(this.field_a, 5126, 3, 8);
            if (param0 != 22091) {
                cka var4 = (cka) null;
                this.a(19, (cka) null);
            }
            discarded$3 = new tj(this.field_a, 5121, 4, 20);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "doa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
