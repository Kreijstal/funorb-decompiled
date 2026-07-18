/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lqb extends rqa {
    static int[][] field_o;

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        int stackIn_4_0 = 0;
        String stackIn_7_0 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        String stackOut_6_0 = null;
        String stackOut_24_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 != null) {
                stackOut_3_0 = param1.length();
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 0;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var2_int = stackIn_4_0;
            if (var2_int == 0) {
              stackOut_6_0 = (String) param1;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              var10 = new char[var2_int];
              var9 = var10;
              var8 = var9;
              var7 = var8;
              var3 = var7;
              var4 = 0;
              var5 = 0;
              L2: while (true) {
                if (var2_int <= var5) {
                  stackOut_24_0 = new String(var10);
                  stackIn_25_0 = stackOut_24_0;
                  break L0;
                } else {
                  L3: {
                    var3[var5] = param1.charAt(var5);
                    if (60 != var10[var5]) {
                      L4: {
                        if (62 != var10[var5]) {
                          break L4;
                        } else {
                          if (var4 <= 0) {
                            break L4;
                          } else {
                            var4--;
                            var5++;
                            break L3;
                          }
                        }
                      }
                      if (var4 != 0) {
                        var5++;
                        break L3;
                      } else {
                        var3[var5] = Character.toUpperCase(var10[var5]);
                        break L3;
                      }
                    } else {
                      var4++;
                      var5++;
                      break L3;
                    }
                  }
                  var5++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var2;
            stackOut_26_1 = new StringBuilder().append("lqb.C(").append(-1).append(',');
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
              break L5;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
        return stackIn_25_0;
    }

    lqb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 < 101) {
            lqb.a(-22);
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
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
              si.a(47, 62, param0[0].a(109));
              if (param1 <= -119) {
                break L1;
              } else {
                lqb.a(115);
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
            stackOut_4_1 = new StringBuilder().append("lqb.A(");
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
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[][]{new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2]};
    }
}
