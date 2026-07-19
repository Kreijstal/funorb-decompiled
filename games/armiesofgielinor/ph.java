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
        boolean discarded$1 = false;
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        char[] var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_29_0 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (Character.isISOControl(param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (bi.a(param1, -31000)) {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var11 = ll.field_Nb;
                var9 = var11;
                var7 = var9;
                var2 = var7;
                var3 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      L4: {
                        if (var3 >= var11.length) {
                          break L4;
                        } else {
                          var4 = var11[var3];
                          var14 = param1 ^ -1;
                          var13 = var4 ^ -1;
                          if (var5 != 0) {
                            if (var13 < var14) {
                              break L2;
                            } else {
                              break L3;
                            }
                          } else {
                            if (var13 == var14) {
                              stackOut_16_0 = 1;
                              stackIn_17_0 = stackOut_16_0;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              var3++;
                              if (var5 == 0) {
                                continue L1;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      if (param0 < -8) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                    var6 = (String) null;
                    discarded$1 = ph.a((String) null, (byte) -108);
                    break L2;
                  }
                  var12 = qv.field_i;
                  var10 = var12;
                  var8 = var10;
                  var2 = var8;
                  var3 = 0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var12.length <= var3) {
                          break L7;
                        } else {
                          var4 = var12[var3];
                          stackOut_23_0 = param1 ^ -1;
                          stackIn_30_0 = stackOut_23_0;
                          stackIn_24_0 = stackOut_23_0;
                          if (var5 != 0) {
                            break L6;
                          } else {
                            if (stackIn_24_0 == (var4 ^ -1)) {
                              stackOut_26_0 = 1;
                              stackIn_27_0 = stackOut_26_0;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            } else {
                              var3++;
                              if (var5 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                      stackOut_29_0 = 0;
                      stackIn_30_0 = stackOut_29_0;
                      break L6;
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
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
              return stackIn_17_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_30_0 != 0;
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
        int var5 = 0;
        int var6 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param0.charAt(0);
            var3 = 1;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var3 >= param0.length()) {
                      break L4;
                    } else {
                      var6 = param0.charAt(var3);
                      var5 = var2_int;
                      if (var4 != 0) {
                        if (var5 >= var6) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        if (var5 == var6) {
                          var3++;
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                  if (param1 >= 41) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                field_d = 88L;
                break L2;
              }
              stackOut_12_0 = 1;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("ph.C(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final static void a(String param0, java.applet.Applet param1, boolean param2) {
        try {
            boolean discarded$1 = false;
            Throwable var3 = null;
            RuntimeException var3_ref = null;
            String var4 = null;
            String var5 = null;
            String var6 = null;
            String var7 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
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
                        discarded$1 = ph.a(103, '');
                        break L2;
                      }
                    }
                    L3: {
                      L4: {
                        var4 = param1.getParameter("cookiehost");
                        var5 = var4;
                        var5 = var4;
                        var7 = var6 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
                        var5 = var7;
                        var5 = var7;
                        var5 = var7;
                        if (-1 == (param0.length() ^ -1)) {
                          break L4;
                        } else {
                          var5 = var7 + "; Expires=" + fq.a((byte) -82, vi.b(-118) + 94608000000L) + "; Max-Age=" + 94608000L;
                          if (!ArmiesOfGielinor.field_M) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                      break L3;
                    }
                    lj.a((byte) -52, param1, "document.cookie=\"" + var5 + "\"");
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var3 = decompiledCaughtException;
                    break L5;
                  }
                }
                ld.a(16058, param1);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) (var3_ref);
                stackOut_11_1 = new StringBuilder().append("ph.B(");
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param0 == null) {
                  stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L6;
                } else {
                  stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L6;
                }
              }
              L7: {
                stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param1 == null) {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L7;
                } else {
                  stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L7;
                }
              }
              throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
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
