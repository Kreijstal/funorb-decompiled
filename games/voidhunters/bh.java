/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh implements dja {
    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return null;
        }
        return (tv[]) (Object) new rgb[param1];
    }

    final static void a(int param0, boolean param1) {
        faa var2 = dpa.field_p;
        var2.h(24335, param0);
        var2.field_e = var2.field_e + 1;
        int var3 = var2.field_e;
        var2.c(0, 5);
        var2.c(0, lqa.field_o.field_Fb);
        int var4 = lqa.field_o.field_Cb - -(lqa.field_o.field_Bb << 6);
        var2.c(0, var4);
        var2.a(0, lqa.field_o.field_Pb, -1, lqa.field_o.field_Pb.length);
        var2.e(-var3 + var2.field_e, -129);
    }

    final static apb[] a(faa param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        apb[] var4 = null;
        int var5 = 0;
        apb var6_ref_apb = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        apb[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        apb[] stackOut_14_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            var2_int = param0.i(0, 8);
            if (var2_int <= 0) {
              var3 = param0.i(0, 12);
              var4 = new apb[var3];
              var5 = 0;
              L1: while (true) {
                if (var3 <= var5) {
                  stackOut_14_0 = (apb[]) var4;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  L2: {
                    if (!kv.a(false, param0)) {
                      var6 = param0.i(0, iia.a(-97, var5 + -1));
                      var4[var5] = var4[var6];
                      var5++;
                      break L2;
                    } else {
                      var6_ref_apb = new apb();
                      int discarded$126 = param0.i(0, 24);
                      int discarded$127 = param0.i(0, 24);
                      var6_ref_apb.field_c = param0.i(0, 24);
                      int discarded$128 = param0.i(0, 9);
                      int discarded$129 = param0.i(0, 12);
                      int discarded$130 = param0.i(0, 12);
                      int discarded$131 = param0.i(0, 12);
                      var4[var5] = var6_ref_apb;
                      var5++;
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (apb[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2;
            stackOut_16_1 = new StringBuilder().append("bh.C(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + -122 + ')');
        }
        return stackIn_15_0;
    }

    public final tv a(byte param0) {
        int var2 = 15 / ((param0 - -64) / 50);
        return (tv) (Object) new rgb();
    }

    static {
    }
}
