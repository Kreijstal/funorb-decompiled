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
            field_b = (ut) null;
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
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            try {
              L1: {
                if (bu.field_h.startsWith("win")) {
                  L2: {
                    if (param1.startsWith("http://")) {
                      break L2;
                    } else {
                      if (!param1.startsWith("https://")) {
                        stackIn_8_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var3 = 0;
                  L3: while (true) {
                    if (param1.length() <= var3) {
                      L4: {
                        if (param0 < -84) {
                          break L4;
                        } else {
                          field_c = (String) null;
                          break L4;
                        }
                      }
                      Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                      stackIn_18_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L1;
                    } else {
                      if (var2.indexOf((int) param1.charAt(var3)) != -1) {
                        var3++;
                        continue L3;
                      } else {
                        stackIn_13_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L1;
                      }
                    }
                  }
                } else {
                  stackIn_3_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackIn_20_0 = 0;
              return stackIn_20_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2_ref2);

            stackIn_23_1 = new StringBuilder().append("fv.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_13_0 != 0;
            } else {
              return stackIn_18_0 != 0;
            }
          }
        }
    }

    final static int a(int param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            if (!ob.field_T[param0]) {
              var2_int = 0;
              var3 = 0;
              L1: while (true) {
                if (vg.field_Db.length <= var3) {
                  L2: {
                    var3 = 0;
                    var4 = 0;
                    if (param1 == 19) {
                      break L2;
                    } else {
                      var6 = (String) null;
                      fv.a((byte) 41, (String) null);
                      break L2;
                    }
                  }
                  L3: while (true) {
                    if (var4 >= vg.field_Db.length) {
                      ob.field_T[param0] = true;
                      stackIn_21_0 = -1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (param0 == vg.field_Db[var4].field_c) {
                        L4: {
                          if (vg.field_Db[var4].field_d) {
                            break L4;
                          } else {
                            if (vg.field_Db[var4].b(32)) {
                              break L4;
                            } else {
                              stackIn_18_0 = (int)(100.0 * (double)var3 / (double)var2_int);
                              decompiledRegionSelector0 = 1;
                              break L0;
                            }
                          }
                        }
                        var3++;
                        var4++;
                        continue L3;
                      } else {
                        var4++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  L5: {
                    if (vg.field_Db[var3].field_c == param0) {
                      var2_int++;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var3++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "fv.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0;
          } else {
            return stackIn_21_0;
          }
        }
    }

    public final void a(int param0) {
        String[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        String[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        String stackIn_21_2 = null;
        int var2;
        int var3;
        uo var4;
        int var5;
        String[] var6;
        int var6_int;
        int var7;
        int var8;
        int var9;
        int var10;
        int var12;
        int var13;
        int[] var24;
        int[] var25;
        int[] var26;
        int[] var27;
        var13 = Kickabout.field_G;
        if ((fp.field_e ^ -1) == 0) {
          return;
        } else {
          L0: {
            L1: {
              var2 = wt.field_x;
              var3 = us.field_j + 18;
              var5 = 44 / ((param0 - 50) / 45);
              var4 = q.field_d;
              if ((fp.field_e ^ -1) == -3) {
                L2: {
                  var6 = new String[3];
                  var6[0] = vo.a((byte) -18, oj.field_Z, new String[]{ad.a(si.field_k, 26300)});
                  if (ag.field_h != 0) {
                    L3: {
                      stackIn_20_0 = (String[]) (var6);

                      stackIn_20_1 = 1;

                      if (0 >= ag.field_h) {
                        stackIn_21_0 = (String[]) ((Object) stackIn_20_0);
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = vo.a((byte) -18, lc.field_b, new String[]{ad.a(Math.abs(ag.field_h), 26300)});
                        break L3;
                      } else {
                        stackIn_21_0 = (String[]) ((Object) stackIn_20_0);
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = vo.a((byte) -18, ni.field_h, new String[]{ad.a(Math.abs(ag.field_h), 26300)});
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
                    var6[2] = vo.a((byte) -18, hg.field_F, new String[]{ad.a(ag.field_h + si.field_k, 26300)});
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
                        if (null != var6[var12]) {
                          ((hu) ((Object) var4)).a(var6[var12], var2 + 5, 5 + (12 * var12 - -12) + var3, 65793, -1);
                          var12++;
                          continue L6;
                        } else {
                          var12++;
                          continue L6;
                        }
                      }
                    }
                  } else {
                    if (null != var6[var9]) {
                      var8++;
                      if (var7 < ((hu) ((Object) var4)).a(var6[var9])) {
                        var7 = ((hu) ((Object) var4)).a(var6[var9]);
                        var9++;
                        continue L5;
                      } else {
                        var9++;
                        continue L5;
                      }
                    } else {
                      var9++;
                      continue L5;
                    }
                  }
                }
              } else {
                if (-4 != (fp.field_e ^ -1)) {
                  if (-7 == (fp.field_e ^ -1)) {
                    var6_int = pc.field_a.b(0) + 6;
                    var7 = pc.field_a.a(15) - -7;
                    var26 = ra.a(var2, var7, var6_int, 0, var3);
                    var2 = var26[0];
                    var3 = var26[1];
                    on.a(-2 + var2, var3 + -2, var6_int - -4, var7 + 4, 6, 65793, 200);
                    pc.field_a.a((var7 >> 261134625) + var3, 23, var2 + (var6_int >> -694105695));
                    break L0;
                  } else {
                    if (fp.field_e != 1) {
                      break L1;
                    } else {
                      L7: {
                        var6_int = ((hu) ((Object) var4)).b(wp.field_h, 200);
                        if (var6_int != 1) {
                          var7 = 10 + ((hu) ((Object) var4)).a(wp.field_h, 200);
                          var8 = 12 * var6_int - -10;
                          break L7;
                        } else {
                          var8 = 22;
                          var7 = ((hu) ((Object) var4)).a(wp.field_h) - -10;
                          break L7;
                        }
                      }
                      var25 = ra.a(var2, var8, var7, 0, var3);
                      var3 = var25[1];
                      var2 = var25[0];
                      on.a(3 + var2, var3 + 2, var7, var8, 65793, 128);
                      on.e(var2 + -1, -1 + var3, 2 + var7, var8 - -2, 65793);
                      on.a(var2, var3, var7, var8, 16777185);
                      ((hu) ((Object) var4)).a(wp.field_h, 5 + var2, -2 + var3 - -5, var7 - 10, var8, 65793, -1, 0, 0, 12);
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
            field_b = (ut) null;
        }
    }

    public static void b(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 < 66) {
            return;
        }
        field_a = null;
    }

    public final boolean a(int param0, int param1, char param2) {
        if (param0 != 11516) {
            field_a = (String) null;
            return false;
        }
        return false;
    }

    static {
        field_a = "This game has started.";
        field_d = true;
        field_c = "Orb Coins: 100";
    }
}
