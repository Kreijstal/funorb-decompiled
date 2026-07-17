/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    static int[] field_a;
    static String field_b;

    final static void a(String param0, bi param1, int param2, tp[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException var10 = null;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        String[] var19 = null;
        String[] var20 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var18 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                param1.a((fc[]) (Object) param3, vj.field_f);
                break L1;
              }
            }
            L2: {
              var19 = new String[16];
              var20 = var19;
              var11 = new int[]{param8};
              var12 = param1.a(param0, var11, var20);
              if (param1 == nn.field_g) {
                stackOut_5_0 = param1.field_B;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = param1.field_P + param1.field_F;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            var13 = stackIn_6_0;
            var14 = param8;
            var15 = 0;
            var16 = 0;
            L3: while (true) {
              if (var16 >= var12) {
                L4: {
                  var15 = var13 * var12;
                  if (var13 * var12 > param4) {
                    param4 = var15;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param8 < var14) {
                    param8 = var14;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                nh.a(param8 - -18, param4 + 18, -40, -9 + (621 + -param8), qi.field_K, -param4 + 331);
                ap.field_a.c(-(param8 * 0) + 591, 6 + (param4 + (340 - param4)));
                var16 = 340 + (-(var12 * var13) + param4 - -18) / 2;
                var17 = 0;
                L6: while (true) {
                  if (var12 <= var17) {
                    break L0;
                  } else {
                    L7: {
                      if (param9 == 0) {
                        param1.c(var20[var17], -param8 + 621 + param8 * 0 / 2, param1.field_F / 3 + (var16 + -param4), param2, -1);
                        break L7;
                      } else {
                        param1.b(var20[var17], 619 + -(param8 / 2), var16 + (-param4 - -(param1.field_F / 3)), param2, -1);
                        break L7;
                      }
                    }
                    var16 = var16 + var13;
                    var17++;
                    continue L6;
                  }
                }
              } else {
                L8: {
                  int dupTemp$1 = param1.c(var19[var16]);
                  var15 = dupTemp$1;
                  if (dupTemp$1 > var14) {
                    var14 = var15;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var16++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var10 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var10;
            stackOut_25_1 = new StringBuilder().append("ui.A(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          L10: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          L11: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(44).append(param2).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param3 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param4 + 44 + 621 + 44 + 1729 + 44 + 340 + 44 + param8 + 44 + param9 + 41);
        }
    }

    final static void a(int param0, byte param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        pn var4 = null;
        pe var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var4 = (pn) (Object) qa.field_t.d(-14);
            L1: while (true) {
              if (var4 == null) {
                var5 = (pe) (Object) ob.field_F.d(-61);
                L2: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    i.a(5, var5, 61);
                    var5 = (pe) (Object) ob.field_F.a((byte) 116);
                    continue L2;
                  }
                }
              } else {
                kp.a(5, (byte) 112, var4);
                var4 = (pn) (Object) qa.field_t.a((byte) 116);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "ui.F(" + 5 + 44 + 115 + 41);
        }
    }

    final static void a() {
        oj.field_r = null;
        eo.field_g = null;
    }

    final static void a(int param0, java.applet.Applet param1, String param2) {
        try {
            Throwable var3 = null;
            RuntimeException var3_ref = null;
            int var3_int = 0;
            String var4 = null;
            String var5 = null;
            String var6 = null;
            String var7 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            try {
              L0: {
                wp.field_d = param2;
                try {
                  L1: {
                    L2: {
                      var6 = param1.getParameter("cookieprefix");
                      var5 = var6;
                      var5 = var6;
                      var4 = param1.getParameter("cookiehost");
                      var5 = var4;
                      var5 = var4;
                      var7 = var6 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
                      var5 = var7;
                      var5 = var7;
                      if (param2.length() == 0) {
                        var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                        break L2;
                      } else {
                        var5 = var7 + "; Expires=" + ke.a((byte) -75, 94608000000L + ue.a(false)) + "; Max-Age=" + 94608000L;
                        break L2;
                      }
                    }
                    int discarded$1 = 5797;
                    ne.a(param1, "document.cookie=\"" + var5 + "\"");
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3 = decompiledCaughtException;
                    break L3;
                  }
                }
                td.a(false, param1);
                var3_int = -23 / ((0 - param0) / 43);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) var3_ref;
                stackOut_9_1 = new StringBuilder().append("ui.B(").append(param0).append(44);
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1 == null) {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L4;
                } else {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L4;
                }
              }
              L5: {
                stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param2 == null) {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L5;
                } else {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L5;
                }
              }
              throw qb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(boolean param0) {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          L1: {
            if (i.field_j < 10) {
              break L1;
            } else {
              if (ol.field_s) {
                break L1;
              } else {
                if (ik.a(false)) {
                  break L1;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L0;
                }
              }
            }
          }
          stackOut_4_0 = 0;
          stackIn_5_0 = stackOut_4_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    public static void b() {
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "The power-up gauges above fill as you destroy their picture bricks. When a gauge is filled it releases a power-up.<br><br>Power-up charge earned on one level carries over to the next.";
        field_a = new int[]{29, 31, 30, 8, 23};
    }
}
