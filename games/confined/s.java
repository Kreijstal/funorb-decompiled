/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends am {
    static String field_L;
    static boolean field_K;
    static String field_J;
    static nf[] field_M;

    public static void g(byte param0) {
        field_M = null;
        field_J = null;
        field_L = null;
        if (param0 < 57) {
            s.g((byte) -22);
        }
    }

    final void a(int param0, int param1, int param2, fj param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        qe var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              super.a(-51, param1, param2, param3, param4, param5);
              var7 = rk.field_k;
              if (param0 <= -18) {
                break L1;
              } else {
                field_J = null;
                break L1;
              }
            }
            L2: {
              if (var7 == null) {
                break L2;
              } else {
                if (!((s) this).a(param2, (byte) 123, param5, param4, param1)) {
                  break L2;
                } else {
                  if (!(((s) this).field_t instanceof sn)) {
                    if (var7.field_t instanceof sn) {
                      ((sn) (Object) var7.field_t).a((s) this, var7, (byte) 105);
                      rk.field_k = null;
                      break L2;
                    } else {
                      return;
                    }
                  } else {
                    ((sn) (Object) ((s) this).field_t).a((s) this, var7, (byte) 105);
                    rk.field_k = null;
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("s.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void h(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        pe var3_ref_pe = null;
        int var3 = 0;
        int var4_int = 0;
        gg var4 = null;
        Object var5 = null;
        int var6 = 0;
        hb var9 = null;
        byte[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var9 = e.field_c;
            var2 = var9.c(32);
            if (0 != var2) {
              if (1 == var2) {
                var3 = var9.f((byte) 36);
                var4 = (gg) (Object) gj.field_b.a(-117);
                L1: while (true) {
                  L2: {
                    if (var4 == null) {
                      break L2;
                    } else {
                      if (var4.field_o != var3) {
                        var4 = (gg) (Object) gj.field_b.d(2123);
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (var4 != null) {
                    var4.a(true);
                    break L0;
                  } else {
                    dc.d(116);
                    return;
                  }
                }
              } else {
                mb.a("A1: " + ui.a(10), true, (Throwable) null);
                dc.d(116);
                return;
              }
            } else {
              var3_ref_pe = (pe) (Object) gh.field_e.a(38);
              if (var3_ref_pe == null) {
                dc.d(111);
                return;
              } else {
                L3: {
                  var4_int = var9.c(32);
                  if (var4_int == 0) {
                    var5 = null;
                    break L3;
                  } else {
                    var13 = new byte[var4_int];
                    var9.a(0, (byte) 115, var4_int, var13);
                    break L3;
                  }
                }
                var9.field_n = var9.field_n + 4;
                if (var9.e(4)) {
                  var3_ref_pe.a(true);
                  return;
                } else {
                  dc.d(119);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "s.A(" + 0 + ')');
        }
    }

    private s(int param0, int param1, int param2, int param3, fe param4, uk param5, fj param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            ((s) this).field_H = param6;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "s.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(bn param0, bn param1, byte param2) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            var4 = null;
            stackOut_0_0 = ai.a(0, (String) null, param0, false, 0, 126, param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("s.B(");
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
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + -87 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "S";
        field_J = "Close";
        field_K = false;
    }
}
