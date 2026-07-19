/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends ms {
    static il field_n;
    byte[] field_m;
    static ri field_k;
    boolean field_o;
    static ji field_l;
    static String field_p;

    public static void a(int param0) {
        field_k = null;
        field_l = null;
        field_n = null;
        field_p = null;
        int var1 = -90 / ((param0 - 71) / 51);
    }

    final static dk a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        dk var7 = null;
        int var8 = 0;
        dk stackIn_3_0 = null;
        dk stackIn_7_0 = null;
        dk stackIn_11_0 = null;
        dk stackIn_15_0 = null;
        dk stackIn_18_0 = null;
        dk stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        dk stackOut_6_0 = null;
        dk stackOut_10_0 = null;
        dk stackOut_14_0 = null;
        dk stackOut_17_0 = null;
        dk stackOut_20_0 = null;
        dk stackOut_2_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (param1 != (var2_int ^ -1)) {
              if (255 < var2_int) {
                stackOut_6_0 = cn.field_ib;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = cn.a('.', param0, -27224);
                if (var3.length < 2) {
                  stackOut_10_0 = qo.field_a;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (var5 >= var4.length) {
                          break L3;
                        } else {
                          var6 = var4[var5];
                          var7 = fh.a(var6, -1);
                          stackOut_14_0 = (dk) (var7);
                          stackIn_21_0 = stackOut_14_0;
                          stackIn_15_0 = stackOut_14_0;
                          if (var8 != 0) {
                            break L2;
                          } else {
                            if (stackIn_15_0 != null) {
                              stackOut_17_0 = (dk) (var7);
                              stackIn_18_0 = stackOut_17_0;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            } else {
                              var5++;
                              if (var8 == 0) {
                                continue L1;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      stackOut_20_0 = cp.a(param1 ^ -26, var3[var3.length + -1]);
                      stackIn_21_0 = stackOut_20_0;
                      break L2;
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            } else {
              stackOut_2_0 = qo.field_a;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2);
            stackOut_22_1 = new StringBuilder().append("lh.A(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0;
              } else {
                return stackIn_18_0;
              }
            }
          }
        }
    }

    lh() {
    }

    static {
        field_n = new il();
        field_l = new ji();
        field_p = "reset stats";
    }
}
