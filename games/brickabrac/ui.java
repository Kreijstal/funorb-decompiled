/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    static int[] field_a;
    static String field_b;

    final static void a(String param0, bi param1, int param2, tp[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int dupTemp$0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        var18 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                param1.a(param3, vj.field_f);
                break L1;
              }
            }
            L2: {
              if (param6 == 1729) {
                break L2;
              } else {
                field_a = (int[]) null;
                break L2;
              }
            }
            L3: {
              var19 = new String[16];
              var20 = var19;
              var11 = new int[]{param8};
              var12 = param1.a(param0, var11, var20);
              if (param1 == nn.field_g) {
                stackIn_8_0 = param1.field_B;
                break L3;
              } else {
                stackIn_8_0 = param1.field_P + param1.field_F;
                break L3;
              }
            }
            var13 = stackIn_8_0;
            var14 = param8;
            var15 = 0;
            var16 = 0;
            L4: while (true) {
              if (var16 >= var12) {
                L5: {
                  var15 = var13 * var12;
                  if (var13 * var12 > param4) {
                    param4 = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (param8 < var14) {
                    param8 = var14;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                nh.a(param8 - -18, param4 + 18, -40, -9 + (param5 + -param8), qi.field_K, -param4 + -9 + param7);
                ap.field_a.c(-(param8 * 0) + (param5 + -30), 6 + (param4 + (param7 - param4)));
                var16 = param7 + (-(var12 * var13) + param4 - -18) / 2;
                var17 = 0;
                L7: while (true) {
                  if (var12 <= var17) {
                    break L0;
                  } else {
                    L8: {
                      if (-1 == (param9 ^ -1)) {
                        param1.c(var20[var17], -param8 + param5 + param8 * 0 / 2, param1.field_F / 3 + (var16 + -param4), param2, -1);
                        break L8;
                      } else {
                        param1.b(var20[var17], -2 + param5 + -(param8 / 2), var16 + (-param4 - -(param1.field_F / 3)), param2, -1);
                        break L8;
                      }
                    }
                    var16 = var16 + var13;
                    var17++;
                    continue L7;
                  }
                }
              } else {
                L9: {
                  dupTemp$0 = param1.c(var19[var16]);
                  var15 = dupTemp$0;
                  if (dupTemp$0 > var14) {
                    var14 = var15;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                var16++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var10 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var10);

            stackIn_30_1 = new StringBuilder().append("ui.A(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L11;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L12;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L12;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_31_0), stackIn_37_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        int var3 = 0;
        pn var4 = null;
        pe var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var4 = (pn) ((Object) qa.field_t.d(-14));
            L1: while (true) {
              if (var4 == null) {
                var5 = (pe) ((Object) ob.field_F.d(-61));
                L2: while (true) {
                  if (var5 == null) {
                    L3: {
                      if (param1 == 115) {
                        break L3;
                      } else {
                        ui.a(-72);
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    i.a(param0, var5, 61);
                    var5 = (pe) ((Object) ob.field_F.a((byte) 116));
                    continue L2;
                  }
                }
              } else {
                kp.a(param0, (byte) 112, var4);
                var4 = (pn) ((Object) qa.field_t.a((byte) 116));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2), "ui.F(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0) {
        if (param0 != 384920353) {
            ui.a(false);
        }
        oj.field_r = null;
        eo.field_g = null;
    }

    final static void a(int param0, java.applet.Applet param1, String param2) {
        try {
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var3 = null;
            int var3_int = 0;
            RuntimeException var3_ref = null;
            String var4 = null;
            String var5 = null;
            String var6 = null;
            String var7 = null;
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
                    ne.a(param1, "document.cookie=\"" + var5 + "\"", 5797);
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
                stackIn_11_0 = (RuntimeException) (var3_ref);

                stackIn_11_1 = new StringBuilder().append("ui.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L4;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

                if (param2 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L5;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L5;
                }
              }
              throw qb.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(boolean param0) {
        int stackIn_7_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            field_b = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if ((i.field_j ^ -1) > -11) {
              break L2;
            } else {
              if (ol.field_s) {
                break L2;
              } else {
                if (ik.a(false)) {
                  break L2;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
            }
          }
          stackIn_7_0 = 0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    public static void b(int param0) {
        if (param0 != 1516) {
            field_b = (String) null;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "The power-up gauges above fill as you destroy their picture bricks. When a gauge is filled it releases a power-up.<br><br>Power-up charge earned on one level carries over to the next.";
        field_a = new int[]{29, 31, 30, 8, 23};
    }
}
