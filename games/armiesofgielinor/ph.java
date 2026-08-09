/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static lg field_c;
    static long field_d;
    static int[][][] field_e;
    static String[] field_b;
    static String field_a;
    static boolean field_f;

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var7 = null;
        char[] var10 = null;
        char[] var12 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        String var6 = null;
        char[] var8 = null;
        int var9 = 0;
        char[] var11 = null;
        char[] var13 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (Character.isISOControl(param1)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (bi.a(param1, -31000)) {
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var12 = ll.field_Nb;
                var10 = var12;
                var7 = var10;
                var2 = var7;
                var3 = 0;
                L1: while (true) {
                  if (var3 >= var12.length) {
                    L2: {
                      if (param0 < -8) {
                        break L2;
                      } else {
                        var6 = (String) null;
                        ph.a((String) null, (byte) -108);
                        break L2;
                      }
                    }
                    var13 = qv.field_i;
                    var11 = var13;
                    var8 = var11;
                    var2 = var8;
                    var9 = 0;
                    var3 = var9;
                    L3: while (true) {
                      if (var13.length <= var9) {
                        stackIn_27_0 = 0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        var4 = var13[var9];
                        if (param1 == var4) {
                          stackIn_24_0 = 1;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var9++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var4 = var12[var3];
                    if ((var4 ^ -1) == (param1 ^ -1)) {
                      stackIn_15_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2_ref), "ph.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_24_0 != 0;
              } else {
                return stackIn_27_0 != 0;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_e = (int[][][]) null;
        if (param0 > -24) {
            return;
        }
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param0.charAt(0);
            var3 = 1;
            L1: while (true) {
              if (var3 >= param0.length()) {
                L2: {
                  if (param1 >= 41) {
                    break L2;
                  } else {
                    field_d = 88L;
                    break L2;
                  }
                }
                stackIn_11_0 = 1;
                break L0;
              } else {
                if (var2_int == param0.charAt(var3)) {
                  var3++;
                  continue L1;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("ph.C(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final static void a(String param0, java.applet.Applet param1, boolean param2) {
        try {
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            StringBuilder stackIn_16_1 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var3 = null;
            RuntimeException var3_ref = null;
            String var4 = null;
            String var5 = null;
            String var6 = null;
            String var7 = null;
            try {
              L0: {
                sj.field_b = param0;
                try {
                  L1: {
                    L2: {
                      var6 = param1.getParameter("cookieprefix");
                      var5 = var6;
                      var5 = var6;
                      if (!param2) {
                        break L2;
                      } else {
                        ph.a(103, '');
                        break L2;
                      }
                    }
                    L3: {
                      var4 = param1.getParameter("cookiehost");
                      var5 = var4;
                      var5 = var4;
                      var7 = var6 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
                      var5 = var7;
                      var5 = var7;
                      if (-1 == (param0.length() ^ -1)) {
                        var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                        break L3;
                      } else {
                        var5 = var7 + "; Expires=" + fq.a((byte) -82, vi.b(-118) + 94608000000L) + "; Max-Age=" + 94608000L;
                        break L3;
                      }
                    }
                    lj.a((byte) -52, param1, "document.cookie=\"" + var5 + "\"");
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    break L4;
                  }
                }
                ld.a(16058, param1);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_13_0 = (RuntimeException) (var3_ref);

                stackIn_13_1 = new StringBuilder().append("ph.B(");

                if (param0 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "null";
                  break L5;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

                if (param1 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L6;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L6;
                }
              }
              throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = new lg();
        field_a = "Unpacking sound effects";
        field_b = new String[]{"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th"};
        field_e = new int[][][]{new int[][]{new int[]{-60, 0}, new int[]{60, 0}}, new int[][]{new int[]{-80, 20}, new int[]{80, 20}, new int[]{0, 20}}, new int[][]{new int[]{120, 20}, new int[]{-120, 20}, new int[]{40, 20}, new int[]{-40, 20}}};
    }
}
