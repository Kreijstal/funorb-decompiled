/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lqb extends rqa {
    static int[][] field_o;

    final static String a(int param0, String param1) {
        int var2_int = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        int stackIn_4_0 = 0;
        String stackIn_7_0 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 != null) {
                stackIn_4_0 = param1.length();
                break L1;
              } else {
                stackIn_4_0 = 0;
                break L1;
              }
            }
            var2_int = stackIn_4_0;
            if (var2_int == 0) {
              stackIn_7_0 = (String) (param1);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var8 = new char[var2_int];
              var7 = var8;
              var3 = var7;
              var4 = 0;
              var5 = 0;
              L2: while (true) {
                if (var2_int <= var5) {
                  L3: {
                    if (param0 == -1) {
                      break L3;
                    } else {
                      field_o = (int[][]) null;
                      break L3;
                    }
                  }
                  stackIn_24_0 = new String(var8);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L4: {
                    var3[var5] = param1.charAt(var5);
                    if (60 != var8[var5]) {
                      L5: {
                        if (62 != var8[var5]) {
                          break L5;
                        } else {
                          if (-1 <= (var4 ^ -1)) {
                            break L5;
                          } else {
                            var4--;
                            break L4;
                          }
                        }
                      }
                      if (var4 != 0) {
                        break L4;
                      } else {
                        var3[var5] = Character.toUpperCase(var8[var5]);
                        break L4;
                      }
                    } else {
                      var4++;
                      break L4;
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
          L6: {
            var2 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("lqb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_24_0;
        }
    }

    lqb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_o = (int[][]) null;
        if (param0 < 101) {
            lqb.a(-22);
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("lqb.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_o = new int[][]{new int[]{14, 24}, new int[]{25, 28}, new int[]{29, 34}, new int[]{35, 41}, new int[]{42, 48}, new int[]{49, 52}, new int[]{53, 58}, new int[]{72, 83}, new int[]{84, 85}, new int[]{86, 90}, new int[]{94, 99}, new int[]{91, 92}, new int[]{101, 113}, new int[]{114, 116}, new int[]{117, 119}};
    }
}
