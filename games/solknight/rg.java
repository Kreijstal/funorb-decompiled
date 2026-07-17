/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    static boolean[] field_e;
    static qf field_f;
    static byte[][][] field_d;
    static ff field_b;
    static int field_c;
    static String field_a;

    final static pc a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        pc stackIn_3_0 = null;
        pc stackIn_6_0 = null;
        pc stackIn_15_0 = null;
        pc stackIn_18_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_22_0 = null;
        pc stackOut_14_0 = null;
        pc stackOut_17_0 = null;
        pc stackOut_5_0 = null;
        pc stackOut_2_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int != 0) {
              if (var2_int <= 63) {
                var3 = 0;
                L1: while (true) {
                  if (var3 >= var2_int) {
                    if (param0 <= 102) {
                      var6 = null;
                      ug discarded$2 = rg.a((String) null, -120, -30);
                      stackOut_22_0 = null;
                      stackIn_23_0 = stackOut_22_0;
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    L2: {
                      var4 = param1.charAt(var3);
                      if (var4 == 45) {
                        L3: {
                          if (0 == var3) {
                            break L3;
                          } else {
                            if (var3 != var2_int + -1) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        stackOut_14_0 = si.field_C;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0;
                      } else {
                        if (cg.field_b.indexOf(var4) != -1) {
                          break L2;
                        } else {
                          stackOut_17_0 = si.field_C;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0;
                        }
                      }
                    }
                    var3++;
                    continue L1;
                  }
                }
              } else {
                stackOut_5_0 = el.field_o;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            } else {
              stackOut_2_0 = h.field_a;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("rg.C(").append(param0).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L4;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L4;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
        return (pc) (Object) stackIn_23_0;
    }

    final static ug a(String param0, int param1, int param2) {
        qk var3 = null;
        RuntimeException var3_ref = null;
        qk stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        qk stackOut_2_0 = null;
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
              var3 = new qk();
              ((ug) (Object) var3).field_b = param1;
              if (param2 == 2525) {
                break L1;
              } else {
                String discarded$2 = rg.a(-91);
                break L1;
              }
            }
            ((ug) (Object) var3).field_c = param0;
            stackOut_2_0 = (qk) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("rg.B(");
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
          throw fc.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 41);
        }
        return (ug) (Object) stackIn_3_0;
    }

    final static void a(o[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              var2_int = -19;
              jb.field_d = param0;
              if (jb.field_d == null) {
                break L1;
              } else {
                if (param0.length >= 3) {
                  break L1;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("rg.E(");
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
          throw fc.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + -40 + 41);
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        field_d = null;
        field_a = null;
        field_f = null;
    }

    final static String a(int param0) {
        if (param0 != 0) {
            field_c = 11;
        }
        if (!(gf.field_Z != ma.field_o)) {
            return te.field_K;
        }
        if (!(gb.field_i != gf.field_Z)) {
            return uh.field_r;
        }
        if (!(td.field_h.a(false))) {
            return uh.field_r;
        }
        return me.field_h;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new qf();
        field_b = new ff(8, 0, 4, 1);
        field_a = "Game over";
    }
}
