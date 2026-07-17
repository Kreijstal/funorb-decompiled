/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fv implements hc {
    static ut field_b;
    static String field_a;
    static boolean field_d;
    static String field_c;

    public final boolean a(byte param0) {
        if (param0 < 63) {
            field_b = null;
            return false;
        }
        return false;
    }

    final static boolean a(byte param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var4 = Kickabout.field_G;
        try {
          try {
            if (bu.field_h.startsWith("win")) {
              L0: {
                if (param1.startsWith("http://")) {
                  break L0;
                } else {
                  if (!param1.startsWith("https://")) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  } else {
                    break L0;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = 0;
              L1: while (true) {
                if (param1.length() <= var3) {
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                  stackOut_17_0 = 1;
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0 != 0;
                } else {
                  if (var2.indexOf((int) param1.charAt(var3)) != -1) {
                    var3++;
                    continue L1;
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            stackOut_19_0 = 0;
            stackIn_20_0 = stackOut_19_0;
            return stackIn_20_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2_ref2;
            stackOut_21_1 = new StringBuilder().append("fv.B(").append(-92).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L2;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
    }

    final static int a(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_2_0 = 0;
        var5 = Kickabout.field_G;
        try {
          L0: {
            if (!ob.field_T[param0]) {
              var2_int = 0;
              var3 = 0;
              L1: while (true) {
                if (vg.field_Db.length <= var3) {
                  var3 = 0;
                  var4 = 0;
                  L2: while (true) {
                    if (var4 >= vg.field_Db.length) {
                      ob.field_T[param0] = true;
                      stackOut_17_0 = -1;
                      stackIn_18_0 = stackOut_17_0;
                      break L0;
                    } else {
                      L3: {
                        if (param0 != vg.field_Db[var4].field_c) {
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var4++;
                      continue L2;
                    }
                  }
                } else {
                  L4: {
                    if (vg.field_Db[var3].field_c == param0) {
                      var2_int++;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var3++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "fv.A(" + param0 + 44 + 19 + 41);
        }
        return stackIn_18_0;
    }

    public final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        uo var4 = null;
        int var5 = 0;
        String[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        String[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        String[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        String[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        String stackIn_21_2 = null;
        String[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        String[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        String stackOut_20_2 = null;
        String[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        String stackOut_19_2 = null;
        var13 = Kickabout.field_G;
        if (fp.field_e == -1) {
          return;
        } else {
          L0: {
            L1: {
              var2 = wt.field_x;
              var3 = us.field_j + 18;
              var5 = 44 / ((param0 - 50) / 45);
              var4 = q.field_d;
              if (fp.field_e == 2) {
                L2: {
                  var6 = new String[3];
                  var6[0] = vo.a((byte) -18, oj.field_Z, new String[1]);
                  if (ag.field_h != 0) {
                    L3: {
                      stackOut_18_0 = (String[]) var6;
                      stackOut_18_1 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      if (0 >= ag.field_h) {
                        stackOut_20_0 = (String[]) (Object) stackIn_20_0;
                        stackOut_20_1 = stackIn_20_1;
                        stackOut_20_2 = vo.a((byte) -18, lc.field_b, new String[1]);
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        stackIn_21_2 = stackOut_20_2;
                        break L3;
                      } else {
                        stackOut_19_0 = (String[]) (Object) stackIn_19_0;
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = vo.a((byte) -18, ni.field_h, new String[1]);
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_21_2 = stackOut_19_2;
                        break L3;
                      }
                    }
                    stackIn_21_0[stackIn_21_1] = stackIn_21_2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L4: {
                  if (ag.field_h == 0) {
                    break L4;
                  } else {
                    var6[2] = vo.a((byte) -18, hg.field_F, new String[1]);
                    break L4;
                  }
                }
                var7 = 0;
                var8 = 0;
                var9 = 0;
                L5: while (true) {
                  if (var6.length <= var9) {
                    var9 = var7 + 10;
                    var10 = 10 + 12 * var8;
                    var27 = ra.a(var2, var10, var9, 0, var3);
                    var3 = var27[1];
                    var2 = var27[0];
                    on.a(4 + var2, 3 + var3, var9, var10, 65793, 128);
                    on.e(var2 + -1, var3 - 1, 2 + var9, var10 + 2, 65793);
                    on.a(var2, var3, var9, var10, 16777185);
                    var12 = 0;
                    L6: while (true) {
                      if (var6.length <= var12) {
                        break L1;
                      } else {
                        L7: {
                          if (null != var6[var12]) {
                            ((hu) (Object) var4).a(var6[var12], var2 + 5, 5 + (12 * var12 - -12) + var3, 65793, -1);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var12++;
                        continue L6;
                      }
                    }
                  } else {
                    L8: {
                      if (null != var6[var9]) {
                        var8++;
                        if (~var7 <= ~((hu) (Object) var4).a(var6[var9])) {
                          break L8;
                        } else {
                          var7 = ((hu) (Object) var4).a(var6[var9]);
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                    var9++;
                    continue L5;
                  }
                }
              } else {
                if (fp.field_e != 3) {
                  if (fp.field_e == 6) {
                    var6_int = pc.field_a.b(0) + 6;
                    var7 = pc.field_a.a(15) - -7;
                    var26 = ra.a(var2, var7, var6_int, 0, var3);
                    var2 = var26[0];
                    var3 = var26[1];
                    on.a(-2 + var2, var3 + -2, var6_int - -4, var7 + 4, 6, 65793, 200);
                    pc.field_a.a((var7 >> 1) + var3, 23, var2 + (var6_int >> 1));
                    break L0;
                  } else {
                    if (fp.field_e != 1) {
                      break L1;
                    } else {
                      L9: {
                        var6_int = ((hu) (Object) var4).b(wp.field_h, 200);
                        if (var6_int != 1) {
                          var7 = 10 + ((hu) (Object) var4).a(wp.field_h, 200);
                          var8 = 12 * var6_int - -10;
                          break L9;
                        } else {
                          var8 = 22;
                          var7 = ((hu) (Object) var4).a(wp.field_h) - -10;
                          break L9;
                        }
                      }
                      var25 = ra.a(var2, var8, var7, 0, var3);
                      var3 = var25[1];
                      var2 = var25[0];
                      on.a(3 + var2, var3 + 2, var7, var8, 65793, 128);
                      on.e(var2 + -1, -1 + var3, 2 + var7, var8 - -2, 65793);
                      on.a(var2, var3, var7, var8, 16777185);
                      int discarded$1 = ((hu) (Object) var4).a(wp.field_h, 5 + var2, -2 + var3 - -5, var7 - 10, var8, 65793, -1, 0, 0, 12);
                      break L0;
                    }
                  }
                } else {
                  if (ai.field_G.c(-2)) {
                    return;
                  } else {
                    var6_int = 6 + ai.field_G.b(0);
                    var7 = ai.field_G.a(ok.field_c, iu.field_j, (byte) 77) - -7;
                    var24 = ra.a(var2, var7, var6_int, 0, var3);
                    var3 = var24[1];
                    var2 = var24[0];
                    on.a(var2 - 2, var3 - 2, 4 + var6_int, var7 - -4, 6, 65793, 200);
                    ai.field_G.a((byte) 77, 3 + var2, ok.field_c, na.field_Ib, i.field_x, cr.field_c, var3 - -3, iu.field_j);
                    break L0;
                  }
                }
              }
            }
            break L0;
          }
          return;
        }
    }

    public final void a(int param0, boolean param1) {
        if (!(et.field_b)) {
            fp.field_e = -1;
        }
        et.field_b = false;
        if (param0 != -25) {
            field_b = null;
        }
    }

    public static void b() {
        field_b = null;
        field_c = null;
        field_a = null;
    }

    public final boolean a(int param0, int param1, char param2) {
        if (param0 != 11516) {
            field_a = null;
            return false;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This game has started.";
        field_d = true;
        field_c = "Orb Coins: 100";
    }
}
