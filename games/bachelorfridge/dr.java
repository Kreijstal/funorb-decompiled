/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dr extends td {
    static ee field_p;

    public static void c(boolean param0) {
        if (!param0) {
            return;
        }
        try {
            field_p = null;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "dr.B(" + param0 + ')');
        }
    }

    dr(int param0, aga param1) {
        super(param0, param1);
    }

    final static ee b(int param0) {
        ee var1 = null;
        RuntimeException var1_ref = null;
        ee stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        ee stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              var1 = new ee(ok.field_Bb, kh.field_r, fl.field_j[0], fd.field_D[0], lq.field_A[0], eha.field_s[0], baa.field_P[0], hk.field_f);
              if (param0 == -32124) {
                break L1;
              } else {
                field_p = null;
                break L1;
              }
            }
            al.b(-18073);
            stackOut_3_0 = (ee) var1;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1_ref, "dr.C(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static int[] c(int param0) {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        int[] stackIn_13_0 = null;
        int[] stackIn_15_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_20_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_14_0 = null;
        int[] stackOut_12_0 = null;
        Object stackOut_19_0 = null;
        Object stackOut_17_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (!o.d((byte) 80)) {
              L1: {
                if (bf.field_h[wca.field_n].c((byte) 95)) {
                  break L1;
                } else {
                  if (bf.field_h[wca.field_n].field_i) {
                    stackOut_14_0 = bf.field_h[wca.field_n].field_c[bf.field_h[wca.field_n].field_e];
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  } else {
                    break L1;
                  }
                }
              }
              if (!bf.field_h[wca.field_n].field_i) {
                stackOut_12_0 = bf.field_h[wca.field_n].field_c[bf.field_h[wca.field_n].field_a - 1];
                stackIn_13_0 = stackOut_12_0;
                return stackIn_13_0;
              } else {
                if (param0 >= 90) {
                  stackOut_19_0 = null;
                  stackIn_20_0 = stackOut_19_0;
                  break L0;
                } else {
                  stackOut_17_0 = null;
                  stackIn_18_0 = stackOut_17_0;
                  return (int[]) (Object) stackIn_18_0;
                }
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (int[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "dr.D(" + param0 + ')');
        }
        return (int[]) (Object) stackIn_20_0;
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        wga var4 = null;
        Object stackIn_2_0 = null;
        wga stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        wga stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3 = ((dr) this).field_h.a(param1 ^ 20, param0);
            var4 = new wga(((dr) this).field_g, new nq(var3));
            var4.field_o.a((bw) (Object) new iv(new nq(var3), false, 1, 0, 33), true);
            if (param1 == 3) {
              stackOut_3_0 = (wga) var4;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ii) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("dr.A(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return (ii) (Object) stackIn_4_0;
    }

    static {
    }
}
