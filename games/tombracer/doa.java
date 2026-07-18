/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class doa {
    private va field_a;

    final static jua a(String param0, int param1, byte param2) {
        jua var3 = null;
        RuntimeException var3_ref = null;
        jua stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        jua stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = new jua(false);
            var3.field_b = param0;
            var3.field_f = param1;
            stackOut_0_0 = (jua) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("doa.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ',' + 114 + ')');
        }
        return stackIn_1_0;
    }

    final static int a(int param0, int param1, int param2) {
        return gqa.a(param2, (byte) 24, param1 >> 8) << 8;
    }

    final static g b(int param0, int param1, int param2) {
        g[] var3 = null;
        int var4 = 0;
        g var5 = null;
        int var6 = 0;
        g[] var7 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        var7 = cm.field_a[param2].field_c;
        var3 = var7;
        var4 = 0;
        L0: while (true) {
          if (var7.length > var4) {
            var5 = var7[var4];
            if (var5.field_f != param0) {
              var4++;
              continue L0;
            } else {
              return var5;
            }
          } else {
            return null;
          }
        }
    }

    doa() {
        qf discarded$0 = new qf(786336);
        int discarded$1 = bia.a((byte) 93, 1600);
    }

    final void a(int param0, cka param1) {
        try {
            ((doa) this).field_a = param1.a(196584, (byte[]) null, 24, true, (byte) 88);
            tj discarded$0 = new tj(((doa) this).field_a, 5126, 2, 0);
            tj discarded$2 = new tj(((doa) this).field_a, 5126, 3, 8);
            if (param0 != 22091) {
                Object var4 = null;
                ((doa) this).a(19, (cka) null);
            }
            tj discarded$3 = new tj(((doa) this).field_a, 5121, 4, 20);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "doa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
