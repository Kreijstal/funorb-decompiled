/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn extends nv {
    static String field_n;
    private int field_o;

    wn(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            ((wn) this).field_o = param1.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wn.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final int a(int param0, int param1) {
        if (param1 > -48) {
            field_n = null;
        }
        return param0;
    }

    public final void m(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        fsa stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        fsa stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        fsa stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        fsa stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        fsa stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        fsa stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          super.m(115);
          var2 = 81 % ((28 - param0) / 49);
          var3 = ((wn) this).field_o;
          if (var3 == 0) {
            ((wn) this).field_g.v((byte) 109);
            break L0;
          } else {
            if (var3 != 1) {
              break L0;
            } else {
              L1: {
                stackOut_4_0 = ((wn) this).field_g;
                stackOut_4_1 = 17;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (((wn) this).field_g.z((byte) 90)) {
                  stackOut_6_0 = (fsa) (Object) stackIn_6_0;
                  stackOut_6_1 = stackIn_6_1;
                  stackOut_6_2 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L1;
                } else {
                  stackOut_5_0 = (fsa) (Object) stackIn_5_0;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L1;
                }
              }
              ((fsa) (Object) stackIn_7_0).b((byte) stackIn_7_1, stackIn_7_2 != 0);
              break L0;
            }
          }
        }
    }

    final int a(boolean param0) {
        if (param0) {
            return -85;
        }
        return 14;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -125, ((wn) this).field_o, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wn.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(boolean param0, fsa param1) {
        try {
            if (!param0) {
                Object var4 = null;
                ((wn) this).a(true, (fsa) null);
            }
            super.a(param0, param1);
            ((wn) this).field_f = false;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wn.Q(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void b(int param0) {
        field_n = null;
    }

    final static hra a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6_ref_String = null;
        int var6 = 0;
        hra var7 = null;
        int var8 = 0;
        hra stackIn_4_0 = null;
        hra stackIn_8_0 = null;
        hra stackIn_12_0 = null;
        hra stackIn_17_0 = null;
        hra stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        hra stackOut_3_0 = null;
        hra stackOut_7_0 = null;
        hra stackOut_11_0 = null;
        hra stackOut_19_0 = null;
        hra stackOut_16_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == 0) {
              stackOut_3_0 = is.field_wb;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (255 < var2_int) {
                stackOut_7_0 = rg.field_A;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                var3 = rga.a(32287, param1, '.');
                if (var3.length < 2) {
                  stackOut_11_0 = is.field_wb;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var4.length) {
                      var6 = -62 / ((param0 - -53) / 56);
                      stackOut_19_0 = qh.a(-58, var3[var3.length + -1]);
                      stackIn_20_0 = stackOut_19_0;
                      break L0;
                    } else {
                      var6_ref_String = var4[var5];
                      var7 = kua.a(var6_ref_String, -6962);
                      if (var7 == null) {
                        var5++;
                        continue L1;
                      } else {
                        stackOut_16_0 = (hra) var7;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("wn.L(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L2;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
        return stackIn_20_0;
    }

    final void k(int param0) {
        if (param0 != 5418) {
            Object var3 = null;
            hra discarded$0 = wn.a(-40, (String) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Press TAB to chat or F10 to open Quick Chat.";
    }
}
