/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static String field_b;
    static int field_a;
    static int[] field_d;
    static String field_c;

    final static void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        de var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        d var6_ref_d = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        hb var28 = null;
        L0: {
          var26 = MonkeyPuzzle2.field_F ? 1 : 0;
          var28 = MonkeyPuzzle2.field_D;
          var2 = var28.a((byte) 114);
          if (var2 == 0) {
            var3 = var28.j(17277);
            var4 = (de) (Object) qa.field_d.a((byte) -117);
            L1: while (true) {
              L2: {
                if (var4 == null) {
                  break L2;
                } else {
                  if (var3 != var4.field_k) {
                    var4 = (de) (Object) qa.field_d.d((byte) 63);
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var4 == null) {
                gk.a(-1);
                return;
              } else {
                L3: {
                  var5 = var28.a((byte) 114);
                  if (-1 != (var5 ^ -1)) {
                    var6 = var4.field_h;
                    var7 = var4.field_e;
                    ah.field_a[0].field_d = cl.field_e;
                    ah.field_a[0].field_c = null;
                    ah.field_a[0].field_a = false;
                    var8_int = 1;
                    L4: while (true) {
                      if (var8_int >= var5) {
                        var4.field_g = new String[3][var6];
                        var8 = new String[3][var6];
                        var9 = new String[3][var6];
                        var4.field_p = new long[3][var6];
                        var10 = new long[3][var6];
                        var4.field_i = new int[3][var6 * var7];
                        var11 = new int[3][var6 * var7];
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var28.a((byte) 114);
                        if (var18 > 0) {
                          var19 = 0;
                          L5: while (true) {
                            if (var18 <= var19) {
                              break L3;
                            } else {
                              L6: {
                                var20 = var28.a((byte) 114);
                                var21 = ah.field_a[var20].field_d;
                                var22 = var28.i(89);
                                var24 = var28.field_h;
                                if (var19 < var6) {
                                  var8[0][var12] = var21;
                                  var9[0][var12] = ah.field_a[var20].field_c;
                                  var10[0][var12] = var22;
                                  var25 = 0;
                                  L7: while (true) {
                                    if (var7 <= var25) {
                                      var12++;
                                      break L6;
                                    } else {
                                      var15++;
                                      var11[0][var15] = var28.e(-95);
                                      var25++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  break L6;
                                }
                              }
                              L8: {
                                if (var21 == null) {
                                  break L8;
                                } else {
                                  if (!f.a(-15189, var21)) {
                                    break L8;
                                  } else {
                                    var8[1][var13] = cl.field_e;
                                    var9[1][var13] = null;
                                    var10[1][var13] = var22;
                                    var13++;
                                    var28.field_h = var24;
                                    var25 = 0;
                                    L9: while (true) {
                                      if (var25 >= var7) {
                                        break L8;
                                      } else {
                                        var16++;
                                        var11[1][var16] = var28.e(126);
                                        var25++;
                                        continue L9;
                                      }
                                    }
                                  }
                                }
                              }
                              if (var14 < var6) {
                                if (!ah.field_a[var20].field_a) {
                                  ah.field_a[var20].field_a = true;
                                  var8[2][var14] = var21;
                                  var9[2][var14] = ah.field_a[var20].field_c;
                                  var10[2][var14] = var22;
                                  var14++;
                                  var28.field_h = var24;
                                  var25 = 0;
                                  L10: while (true) {
                                    if (var7 > var25) {
                                      var17++;
                                      var11[2][var17] = var28.e(127);
                                      var25++;
                                      continue L10;
                                    } else {
                                      var19++;
                                      continue L5;
                                    }
                                  }
                                } else {
                                  var19++;
                                  continue L5;
                                }
                              } else {
                                var19++;
                                continue L5;
                              }
                            }
                          }
                        } else {
                          break L3;
                        }
                      } else {
                        ah.field_a[var8_int].field_d = var28.f(-1);
                        ah.field_a[var8_int].field_a = false;
                        if (1 != var28.a((byte) 114)) {
                          ah.field_a[var8_int].field_c = null;
                          var8_int++;
                          continue L4;
                        } else {
                          ah.field_a[var8_int].field_c = var28.f(-1);
                          var8_int++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var4.field_l = true;
                var4.c(-19822);
                break L0;
              }
            }
          } else {
            if (1 == var2) {
              var3 = var28.j(17277);
              var4_long = var28.i(58);
              var6_ref_d = (d) (Object) wk.field_b.a((byte) -117);
              L11: while (true) {
                L12: {
                  if (var6_ref_d == null) {
                    break L12;
                  } else {
                    if (var6_ref_d.field_n != var3) {
                      var6_ref_d = (d) (Object) wk.field_b.d((byte) 63);
                      continue L11;
                    } else {
                      break L12;
                    }
                  }
                }
                if (var6_ref_d != null) {
                  var6_ref_d.field_g = var4_long;
                  var6_ref_d.c(-19822);
                  break L0;
                } else {
                  gk.a(-1);
                  return;
                }
              }
            } else {
              kk.a("HS1: " + bh.a((byte) -105), (byte) 115, (Throwable) null);
              gk.a(-1);
              break L0;
            }
          }
        }
        L13: {
          if (param0 < -62) {
            break L13;
          } else {
            field_b = null;
            break L13;
          }
        }
    }

    final static void a(String param0, byte param1, int param2, String[] param3) {
        String[] var4 = null;
        int var5 = 0;
        Object var6 = null;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param1 >= 95) {
          L0: {
            ed.field_c = f.field_i;
            if (255 == param2) {
              L1: {
                stackOut_8_0 = -89;
                stackIn_10_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if ((dd.field_d ^ -1) <= -14) {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  break L1;
                } else {
                  stackOut_9_0 = stackIn_9_0;
                  stackOut_9_1 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  break L1;
                }
              }
              w.field_c = hj.a((byte) stackIn_11_0, stackIn_11_1 != 0);
              var6 = null;
              wh.a((String[]) null, true);
              break L0;
            } else {
              L2: {
                if (param2 < 100) {
                  break L2;
                } else {
                  if (105 >= param2) {
                    var4 = param3;
                    wh.a(var4, true);
                    w.field_c = jj.a(param3, true);
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              w.field_c = lh.a(true, param0, param2);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static Object a(byte[] param0, byte param1, boolean param2) {
        ab var3 = null;
        if (param0 == null) {
            return null;
        }
        if (!(-137 <= (param0.length ^ -1))) {
            var3 = new ab();
            ((ka) (Object) var3).a(76, param0);
            return (Object) (Object) var3;
        }
        if (param1 < 109) {
            p.a(39);
        }
        if (!param2) {
            return (Object) (Object) param0;
        }
        return (Object) (Object) bk.a(0, param0);
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != -14) {
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_a = 0;
        field_d = new int[8192];
        field_c = "Email: ";
    }
}
