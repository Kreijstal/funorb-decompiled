/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh implements dja {
    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return (tv[]) null;
        }
        return (tv[]) ((Object) new rgb[param1]);
    }

    final static void a(int param0, boolean param1) {
        faa var2 = null;
        int var3 = 0;
        int var4 = 0;
        var2 = dpa.field_p;
        var2.h(24335, param0);
        if (!param1) {
          bh.a(-30, true);
          var2.field_e = var2.field_e + 1;
          var3 = var2.field_e;
          var2.c(0, 5);
          var2.c(0, lqa.field_o.field_Fb);
          var4 = lqa.field_o.field_Cb - -(lqa.field_o.field_Bb << -1295663930);
          var2.c(0, var4);
          var2.a(0, lqa.field_o.field_Pb, -1, lqa.field_o.field_Pb.length);
          var2.e(-var3 + var2.field_e, -129);
          return;
        } else {
          var2.field_e = var2.field_e + 1;
          var3 = var2.field_e;
          var2.c(0, 5);
          var2.c(0, lqa.field_o.field_Fb);
          var4 = lqa.field_o.field_Cb - -(lqa.field_o.field_Bb << -1295663930);
          var2.c(0, var4);
          var2.a(0, lqa.field_o.field_Pb, -1, lqa.field_o.field_Pb.length);
          var2.e(-var3 + var2.field_e, -129);
          return;
        }
    }

    final static apb[] a(faa param0, byte param1) {
        int discarded$30 = 0;
        int discarded$31 = 0;
        int discarded$32 = 0;
        int discarded$33 = 0;
        int discarded$34 = 0;
        int discarded$35 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        apb[] var4 = null;
        int var5 = 0;
        apb var6_ref_apb = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        apb[] stackIn_6_0 = null;
        apb[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        apb[] stackOut_14_0 = null;
        apb[] stackOut_5_0 = null;
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
              if (param1 <= -31) {
                var3 = param0.i(0, 12);
                var4 = new apb[var3];
                var5 = 0;
                L1: while (true) {
                  if (var3 <= var5) {
                    stackOut_14_0 = (apb[]) (var4);
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L2: {
                      if (!kv.a(false, param0)) {
                        var6 = param0.i(0, iia.a(-97, var5 + -1));
                        var4[var5] = var4[var6];
                        break L2;
                      } else {
                        var6_ref_apb = new apb();
                        discarded$30 = param0.i(0, 24);
                        discarded$31 = param0.i(0, 24);
                        var6_ref_apb.field_c = param0.i(0, 24);
                        discarded$32 = param0.i(0, 9);
                        discarded$33 = param0.i(0, 12);
                        discarded$34 = param0.i(0, 12);
                        discarded$35 = param0.i(0, 12);
                        var4[var5] = var6_ref_apb;
                        break L2;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              } else {
                stackOut_5_0 = (apb[]) null;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2);
            stackOut_16_1 = new StringBuilder().append("bh.C(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (apb[]) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    public final tv a(byte param0) {
        int var2 = 15 / ((param0 - -64) / 50);
        return (tv) ((Object) new rgb());
    }

    static {
    }
}
