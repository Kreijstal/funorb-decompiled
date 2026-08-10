/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static String field_b;
    static int field_a;
    static int[] field_d;
    static String field_c;

    final static void b(int param0) {
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        de var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        int var6 = 0;
        d var6_ref_d = null;
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
        var26 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var28 = MonkeyPuzzle2.field_D;
              var2 = var28.a((byte) 114);
              if (var2 == 0) {
                var3 = var28.j(17277);
                var4 = (de) ((Object) qa.field_d.a((byte) -117));
                L2: while (true) {
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      if ((var3 ^ -1) != (var4.field_k ^ -1)) {
                        var4 = (de) ((Object) qa.field_d.d((byte) 63));
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (var4 == null) {
                    gk.a(-1);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L4: {
                      var5 = var28.a((byte) 114);
                      if (-1 != (var5 ^ -1)) {
                        var6 = var4.field_h;
                        var7 = var4.field_e;
                        ah.field_a[0].field_d = cl.field_e;
                        ah.field_a[0].field_c = null;
                        ah.field_a[0].field_a = false;
                        var8_int = 1;
                        L5: while (true) {
                          if (var8_int >= var5) {
                            dupTemp$0 = new String[3][var6];
                            var4.field_g = dupTemp$0;
                            var8 = dupTemp$0;
                            var9 = new String[3][var6];
                            dupTemp$1 = new long[3][var6];
                            var4.field_p = dupTemp$1;
                            var10 = dupTemp$1;
                            dupTemp$2 = new int[3][var6 * var7];
                            var4.field_i = dupTemp$2;
                            var11 = dupTemp$2;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var28.a((byte) 114);
                            if (var18 > 0) {
                              var19 = 0;
                              L6: while (true) {
                                if (var18 <= var19) {
                                  break L4;
                                } else {
                                  L7: {
                                    var20 = var28.a((byte) 114);
                                    var21 = ah.field_a[var20].field_d;
                                    var22 = var28.i(89);
                                    var24 = var28.field_h;
                                    if ((var19 ^ -1) > (var6 ^ -1)) {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = ah.field_a[var20].field_c;
                                      var10[0][var12] = var22;
                                      var25 = 0;
                                      L8: while (true) {
                                        if (var7 <= var25) {
                                          var12++;
                                          break L7;
                                        } else {
                                          incrementValue$3 = var15;
                                          var15++;
                                          var11[0][incrementValue$3] = var28.e(-95);
                                          var25++;
                                          continue L8;
                                        }
                                      }
                                    } else {
                                      break L7;
                                    }
                                  }
                                  L9: {
                                    if (var21 == null) {
                                      break L9;
                                    } else {
                                      if (!f.a(-15189, var21)) {
                                        break L9;
                                      } else {
                                        var8[1][var13] = cl.field_e;
                                        var9[1][var13] = null;
                                        var10[1][var13] = var22;
                                        var13++;
                                        var28.field_h = var24;
                                        var25 = 0;
                                        L10: while (true) {
                                          if (var25 >= var7) {
                                            break L9;
                                          } else {
                                            incrementValue$4 = var16;
                                            var16++;
                                            var11[1][incrementValue$4] = var28.e(126);
                                            var25++;
                                            continue L10;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var14 >= var6) {
                                      break L11;
                                    } else {
                                      if (!ah.field_a[var20].field_a) {
                                        ah.field_a[var20].field_a = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = ah.field_a[var20].field_c;
                                        var10[2][var14] = var22;
                                        var14++;
                                        var28.field_h = var24;
                                        var25 = 0;
                                        L12: while (true) {
                                          if (var7 <= var25) {
                                            break L11;
                                          } else {
                                            incrementValue$5 = var17;
                                            var17++;
                                            var11[2][incrementValue$5] = var28.e(127);
                                            var25++;
                                            continue L12;
                                          }
                                        }
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  var19++;
                                  continue L6;
                                }
                              }
                            } else {
                              break L4;
                            }
                          } else {
                            L13: {
                              ah.field_a[var8_int].field_d = var28.f(-1);
                              ah.field_a[var8_int].field_a = false;
                              if (1 != var28.a((byte) 114)) {
                                ah.field_a[var8_int].field_c = null;
                                break L13;
                              } else {
                                ah.field_a[var8_int].field_c = var28.f(-1);
                                break L13;
                              }
                            }
                            var8_int++;
                            continue L5;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    var4.field_l = true;
                    var4.c(-19822);
                    break L1;
                  }
                }
              } else {
                if (1 == var2) {
                  var3 = var28.j(17277);
                  var4_long = var28.i(58);
                  var6_ref_d = (d) ((Object) wk.field_b.a((byte) -117));
                  L14: while (true) {
                    L15: {
                      if (var6_ref_d == null) {
                        break L15;
                      } else {
                        if ((var6_ref_d.field_n ^ -1) != (var3 ^ -1)) {
                          var6_ref_d = (d) ((Object) wk.field_b.d((byte) 63));
                          continue L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if (var6_ref_d != null) {
                      var6_ref_d.field_g = var4_long;
                      var6_ref_d.c(-19822);
                      break L1;
                    } else {
                      gk.a(-1);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                } else {
                  kk.a("HS1: " + bh.a((byte) -105), (byte) 115, (Throwable) null);
                  gk.a(-1);
                  break L1;
                }
              }
            }
            L16: {
              if (param0 < -62) {
                break L16;
              } else {
                field_b = (String) null;
                break L16;
              }
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "p.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(String param0, byte param1, int param2, String[] param3) {
        int var5 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String[] var4 = null;
        RuntimeException var4_ref = null;
        String[] var6 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 >= 95) {
              L1: {
                ed.field_c = f.field_i;
                if (255 == param2) {
                  L2: {
                    stackIn_11_0 = -89;

                    if ((dd.field_d ^ -1) <= -14) {
                      stackIn_12_0 = stackIn_11_0;
                      stackIn_12_1 = 0;
                      break L2;
                    } else {
                      stackIn_12_0 = stackIn_11_0;
                      stackIn_12_1 = 1;
                      break L2;
                    }
                  }
                  w.field_c = hj.a((byte) stackIn_12_0, stackIn_12_1 != 0);
                  var6 = (String[]) null;
                  wh.a((String[]) null, true);
                  break L1;
                } else {
                  L3: {
                    if (param2 < 100) {
                      break L3;
                    } else {
                      if (105 >= param2) {
                        var4 = param3;
                        wh.a(var4, true);
                        w.field_c = jj.a(param3, true);
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  w.field_c = lh.a(true, param0, param2);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4_ref);

            stackIn_16_1 = new StringBuilder().append("p.B(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static Object a(byte[] param0, byte param1, boolean param2) {
        ab var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        ab stackIn_6_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              if (-137 > (param0.length ^ -1)) {
                var3 = new ab();
                ((ka) ((Object) var3)).a(76, param0);
                stackIn_6_0 = (ab) (var3);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param1 >= 109) {
                    break L1;
                  } else {
                    p.a(39);
                    break L1;
                  }
                }
                if (param2) {
                  stackIn_13_0 = bk.a(0, param0);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_11_0 = (byte[]) (param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("p.C(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
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
        field_b = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_a = 0;
        field_d = new int[8192];
        field_c = "Email: ";
    }
}
