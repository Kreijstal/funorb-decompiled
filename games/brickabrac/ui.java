/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    static int[] field_a;
    static String field_b;

    final static void a(String param0, bi param1, int param2, tp[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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
        int stackIn_7_0 = 0;
        int stackOut_6_0;
        int stackOut_5_0;
        L0: {
          var18 = BrickABrac.field_J ? 1 : 0;
          if (param3 == null) {
            break L0;
          } else {
            param1.a((fc[]) (Object) param3, vj.field_f);
            break L0;
          }
        }
        L1: {
          if (param6 == 1729) {
            break L1;
          } else {
            field_a = null;
            break L1;
          }
        }
        L2: {
          var19 = new String[16];
          var20 = var19;
          var11 = new int[]{param8};
          var12 = param1.a(param0, var11, var20);
          if (param1 == nn.field_g) {
            stackOut_6_0 = param1.field_B;
            stackIn_7_0 = stackOut_6_0;
            break L2;
          } else {
            stackOut_5_0 = param1.field_P + param1.field_F;
            stackIn_7_0 = stackOut_5_0;
            break L2;
          }
        }
        var13 = stackIn_7_0;
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
            nh.a(param8 - -18, param4 + 18, -40, -9 + (param5 + -param8), qi.field_K, -param4 + -9 + param7);
            ap.field_a.c(-(param8 * 0) + (param5 + -30), 6 + (param4 + (param7 - param4)));
            var16 = param7 + (-(var12 * var13) + param4 - -18) / 2;
            var17 = 0;
            L6: while (true) {
              if (var12 <= var17) {
                return;
              } else {
                L7: {
                  if (-1 == (param9 ^ -1)) {
                    param1.c(var20[var17], -param8 + param5 + param8 * 0 / 2, param1.field_F / 3 + (var16 + -param4), param2, -1);
                    break L7;
                  } else {
                    param1.b(var20[var17], -2 + param5 + -(param8 / 2), var16 + (-param4 - -(param1.field_F / 3)), param2, -1);
                    break L7;
                  }
                }
                var16 = var16 + var13;
                var17++;
                continue L6;
              }
            }
          } else {
            var15 = param1.c(var19[var16]);
            if (param1.c(var19[var16]) > var14) {
              var14 = var15;
              var16++;
              continue L3;
            } else {
              var16++;
              continue L3;
            }
          }
        }
    }

    final static void a(int param0, byte param1) {
        int var3 = BrickABrac.field_J ? 1 : 0;
        pn var4 = (pn) (Object) qa.field_t.d(-14);
        while (var4 != null) {
            kp.a(param0, (byte) 112, var4);
            var4 = (pn) (Object) qa.field_t.a((byte) 116);
        }
        pe var5 = (pe) (Object) ob.field_F.d(-61);
        while (var5 != null) {
            i.a(param0, var5, 61);
            var5 = (pe) (Object) ob.field_F.a((byte) 116);
        }
        if (param1 != 115) {
            ui.a(-72);
        }
    }

    final static void a(int param0) {
        if (param0 != 384920353) {
            boolean discarded$0 = ui.a(false);
        }
        oj.field_r = null;
        eo.field_g = null;
    }

    final static void a(int param0, java.applet.Applet param1, String param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            wp.field_d = param2;
            try {
                var6 = param1.getParameter("cookieprefix");
                var5 = var6;
                var5 = var6;
                var4 = param1.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var7 = var6 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
                var5 = var7;
                var5 = var7;
                if (param2.length() != 0) {
                    var5 = var7 + "; Expires=" + ke.a((byte) -75, 94608000000L + ue.a(false)) + "; Max-Age=" + 94608000L;
                } else {
                    var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                ne.a(param1, "document.cookie=\"" + var5 + "\"", 5797);
            } catch (Throwable throwable) {
            }
            td.a(false, param1);
            int var3 = -23 / ((0 - param0) / 43);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0;
        int stackOut_6_0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            field_b = null;
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
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    public static void b(int param0) {
        if (param0 != 1516) {
            field_b = null;
        }
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
