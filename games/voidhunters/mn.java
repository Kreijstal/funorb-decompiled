/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn {
    static String field_a;

    final static void a(boolean param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        llb var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        pgb var9 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (uh.field_p != jl.field_q.field_b) {
                kga.field_o = kga.field_o + (jl.field_q.field_b + -uh.field_p);
                uh.field_p = jl.field_q.field_b;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (tb.field_b >= ldb.field_o) {
                break L2;
              } else {
                tb.field_b = tb.field_b + 1;
                break L2;
              }
            }
            if (tb.field_b > 0) {
              L3: {
                cs.b((byte) 71);
                hca.field_o.a(param0, 1332);
                if (ada.field_b == null) {
                  break L3;
                } else {
                  if (erb.field_p) {
                    boolean discarded$1 = ada.field_b.a((byte) -5, hca.field_o.field_M, hca.field_o.field_u, param0);
                    break L3;
                  } else {
                    ada.field_b = null;
                    break L3;
                  }
                }
              }
              var4_int = 0;
              L4: while (true) {
                if (5 <= var4_int) {
                  L5: {
                    if (nlb.field_o.field_o != 0) {
                      crb.field_v = new bwa(nlb.field_o.field_M, nlb.field_o.field_u, nlb.field_o.field_hb, nlb.field_o.field_G, param2, fh.field_g, lo.field_b, kn.field_p, qc.field_q, urb.field_o, iga.field_o, (String) null, 0L);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    var9 = aq.b(nna.field_w, qs.field_c, param1, -123);
                    if (var9 != null) {
                      aka.a(var9, 22859);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    var8 = sdb.a(-8037);
                    var6 = 50;
                    if (var8 != null) {
                      lob.field_a = var8;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  break L0;
                } else {
                  L8: {
                    var5 = ul.field_b[var4_int];
                    if (var5 == null) {
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var4_int++;
                  continue L4;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var4, "mn.C(" + param0 + 44 + param1 + 44 + param2 + 44 + 97 + 41);
        }
    }

    public static void a(int param0) {
        int var1 = 19;
        field_a = null;
    }

    final static boolean a(CharSequence param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var3 = VoidHunters.field_G;
        try {
          L0: {
            if (!je.a((byte) -31, param0, true)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (param1 <= -107) {
                  break L1;
                } else {
                  field_a = null;
                  break L1;
                }
              }
              var2_int = 0;
              L2: while (true) {
                if (var2_int >= param0.length()) {
                  stackOut_14_0 = 1;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  if (!qnb.a((byte) -108, param0.charAt(var2_int))) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0 != 0;
                  } else {
                    var2_int++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2;
            stackOut_16_1 = new StringBuilder().append("mn.A(");
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
          throw rta.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param1 + 41);
        }
        return stackIn_15_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Please remove <%0> from your ignore list first.";
    }
}
