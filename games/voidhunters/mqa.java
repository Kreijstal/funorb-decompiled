/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mqa extends rqa {
    static int field_s;
    static gl field_r;
    static String field_p;
    static float field_o;
    static int field_q;

    mqa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static lkb a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        lkb stackIn_4_0 = null;
        lkb stackIn_8_0 = null;
        lkb stackIn_16_0 = null;
        lkb stackIn_20_0 = null;
        Object stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        lkb stackOut_3_0 = null;
        lkb stackOut_7_0 = null;
        Object stackOut_24_0 = null;
        lkb stackOut_19_0 = null;
        lkb stackOut_15_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == 0) {
              stackOut_3_0 = br.field_f;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (var2_int > 63) {
                stackOut_7_0 = qw.field_j;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                var3 = 0;
                L1: while (true) {
                  if (var2_int <= var3) {
                    if (param0 != -23150) {
                      var6 = null;
                      lkb discarded$2 = mqa.a(-101, (String) null);
                      stackOut_24_0 = null;
                      stackIn_25_0 = stackOut_24_0;
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    L2: {
                      var4 = param1.charAt(var3);
                      if (var4 != 45) {
                        if (tea.field_a.indexOf(var4) == -1) {
                          stackOut_19_0 = ira.field_b;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0;
                        } else {
                          break L2;
                        }
                      } else {
                        L3: {
                          if (var3 == 0) {
                            break L3;
                          } else {
                            if (var3 == var2_int - 1) {
                              break L3;
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackOut_15_0 = ira.field_b;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0;
                      }
                    }
                    var3++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var2;
            stackOut_26_1 = new StringBuilder().append("mqa.B(").append(param0).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L4;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
        }
        return (lkb) (Object) stackIn_25_0;
    }

    public static void a() {
        field_p = null;
        field_r = null;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
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
              si.a(33, 62, param0[0].a(29));
              if (param1 < -119) {
                break L1;
              } else {
                var4 = null;
                nc discarded$2 = ((mqa) this).a((nc[]) null, -71);
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) "void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("mqa.A(");
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
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = 131072;
        field_r = new gl(1);
        field_o = 1.0f;
        field_p = "Remove selected event";
    }
}
