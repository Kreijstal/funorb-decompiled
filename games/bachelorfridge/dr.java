/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dr extends td {
    static ee field_p;

    public static void c(boolean param0) {
        if (!param0) {
            return;
        }
        field_p = null;
    }

    dr(int param0, aga param1) {
        super(param0, param1);
    }

    final static ee b(int param0) {
        ee var1 = null;
        var1 = new ee(ok.field_Bb, kh.field_r, fl.field_j[0], fd.field_D[0], lq.field_A[0], eha.field_s[0], baa.field_P[0], hk.field_f);
        if (param0 != -32124) {
          field_p = (ee) null;
          al.b(-18073);
          return var1;
        } else {
          al.b(-18073);
          return var1;
        }
    }

    final static int[] c(int param0) {
        if (!o.d((byte) 80)) {
          if (bf.field_h[wca.field_n].c((byte) 95)) {
            if (!bf.field_h[wca.field_n].field_i) {
              return bf.field_h[wca.field_n].field_c[bf.field_h[wca.field_n].field_a - 1];
            } else {
              if (param0 >= 90) {
                return null;
              } else {
                return (int[]) null;
              }
            }
          } else {
            if (!bf.field_h[wca.field_n].field_i) {
              if (!bf.field_h[wca.field_n].field_i) {
                return bf.field_h[wca.field_n].field_c[bf.field_h[wca.field_n].field_a - 1];
              } else {
                if (param0 >= 90) {
                  return null;
                } else {
                  return (int[]) null;
                }
              }
            } else {
              return bf.field_h[wca.field_n].field_c[bf.field_h[wca.field_n].field_e];
            }
          }
        } else {
          return null;
        }
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        wga var4 = null;
        ii stackIn_2_0 = null;
        wga stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wga stackOut_3_0 = null;
        ii stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3 = this.field_h.a(param1 ^ 20, param0);
            var4 = new wga(this.field_g, new nq(var3));
            var4.field_o.a(new iv(new nq(var3), false, 1, 0, 33), true);
            if (param1 == 3) {
              stackOut_3_0 = (wga) (var4);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (ii) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3_ref);
            stackOut_5_1 = new StringBuilder().append("dr.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (ii) ((Object) stackIn_4_0);
        }
    }

    static {
    }
}
