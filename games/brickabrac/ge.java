/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends no {
    int field_y;
    static boolean field_v;
    static String field_x;
    static volatile int field_w;

    ge(ge param0, int param1) {
        this(param0.field_j, param0.field_m, param0.field_i, param1);
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.removeKeyListener((java.awt.event.KeyListener) (Object) gp.field_c);
            param1.removeFocusListener((java.awt.event.FocusListener) (Object) gp.field_c);
            pl.field_d = -1;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ge.F(" + -2846 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private ge(int param0, int param1, int param2, int param3) {
        super(param0, param1, 0, 1024, 2048, param2);
        ((ge) this).field_y = param3;
    }

    public static void c(int param0) {
        field_x = null;
        if (param0 != 6) {
            ge.c(-60);
        }
    }

    ge(int param0, int param1, int param2) {
        this(param0, param1, param2, 0);
    }

    final static pb a(int param0, int param1) {
        return so.a(0, param1, param0, ip.field_s);
    }

    final boolean b(boolean param0) {
        if (param0) {
            Object var3 = null;
            int discarded$0 = ((ge) this).a(61, (StringBuilder) null);
        }
        return ck.field_m[((ge) this).field_i];
    }

    final int a(int param0, StringBuilder param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 >= 79) {
              stackOut_3_0 = 139 * ((ge) this).field_y - -131 << 5 ^ super.a(121, param1);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -19;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ge.A(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final void a(j param0, byte param1) {
        Object var3 = null;
        RuntimeException var3_ref = null;
        vn var3_ref2 = null;
        int var4 = 0;
        vn var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        vn var8 = null;
        int var9 = 0;
        int var10 = 0;
        vn var11 = null;
        vn var12 = null;
        vn var13 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        var3 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param0.field_Z != 3) {
              L1: {
                if (((ge) this).field_i != 3) {
                  if (4 != ((ge) this).field_i) {
                    if (5 != ((ge) this).field_i) {
                      if (6 != ((ge) this).field_i) {
                        if (((ge) this).field_i == 7) {
                          param0.field_yb.e((byte) 127);
                          break L1;
                        } else {
                          if (((ge) this).field_i == 8) {
                            param0.field_yb.b(true);
                            break L1;
                          } else {
                            if (((ge) this).field_i == 9) {
                              L2: {
                                if (param0.field_gb.a(false)) {
                                  break L2;
                                } else {
                                  var12 = (vn) (Object) param0.field_gb.d(-63);
                                  var3_ref2 = var12;
                                  var4 = (31457280 + -(var12.field_m << 8)) / var12.field_o;
                                  var5 = (vn) (Object) param0.field_gb.d(-8);
                                  L3: while (true) {
                                    if (var5 == null) {
                                      break L2;
                                    } else {
                                      L4: {
                                        var5.field_C = 0;
                                        var5.field_v = 0;
                                        var6 = (31457280 + -(var5.field_m << 8)) / var5.field_o;
                                        if (var4 <= var6) {
                                          if (var6 > var4) {
                                            var3_ref2.b((byte) 111);
                                            var4 = var6;
                                            var3_ref2 = var5;
                                            break L4;
                                          } else {
                                            break L4;
                                          }
                                        } else {
                                          var5.b((byte) 111);
                                          break L4;
                                        }
                                      }
                                      var5 = (vn) (Object) param0.field_gb.a((byte) 116);
                                      continue L3;
                                    }
                                  }
                                }
                              }
                              L5: {
                                if (param0.field_K.a(false)) {
                                  break L5;
                                } else {
                                  if (!param0.field_gb.a(false)) {
                                    param0.field_K.c((byte) -62);
                                    break L5;
                                  } else {
                                    var3_ref2 = (vn) (Object) param0.field_K.d(param1 + -108);
                                    var3_ref2.field_C = 0;
                                    var3_ref2.field_v = 0;
                                    param0.field_K.c((byte) -63);
                                    param0.field_K.a((nm) (Object) var3_ref2, (byte) 3);
                                    break L5;
                                  }
                                }
                              }
                              L6: while (true) {
                                if (param0.field_yb.field_F <= 8) {
                                  param0.field_yb.field_H = 0;
                                  param0.field_yb.field_z = 0;
                                  break L1;
                                } else {
                                  param0.field_yb.e((byte) 126);
                                  continue L6;
                                }
                              }
                            } else {
                              if (10 == ((ge) this).field_i) {
                                if (param0.field_gb.e(118) != 1) {
                                  break L1;
                                } else {
                                  var11 = (vn) (Object) param0.field_gb.d(param1 + -161);
                                  var4 = kj.a(var11.field_o * var11.field_o + var11.field_k * var11.field_k, param1 ^ 97) >> 8;
                                  var5_int = var11.field_k;
                                  var6 = var11.field_o;
                                  var7 = 0;
                                  L7: while (true) {
                                    if (7 <= var7) {
                                      var7 = 0;
                                      var8 = (vn) (Object) param0.field_gb.d(-39);
                                      L8: while (true) {
                                        if (var8 == null) {
                                          break L1;
                                        } else {
                                          var8.field_k = (15 * BrickABrac.c(param1 + 1949, 1024 * var7) >> 8) + var5_int;
                                          var8.field_o = var6 - -(15 * sa.a(var7 * 1024, -4097) >> 8);
                                          var9 = kj.a(var8.field_o * var8.field_o + var8.field_k * var8.field_k, 2) >> 8;
                                          var8.field_k = var4 * var8.field_k / var9;
                                          var8.field_o = var4 * var8.field_o / var9;
                                          var7++;
                                          var8 = (vn) (Object) param0.field_gb.a((byte) 116);
                                          continue L8;
                                        }
                                      }
                                    } else {
                                      param0.field_gb.a((nm) (Object) new vn(var11.field_j, var11.field_m, 0, 0), (byte) 3);
                                      var7++;
                                      continue L7;
                                    }
                                  }
                                }
                              } else {
                                if (((ge) this).field_i != 11) {
                                  if (((ge) this).field_i == 12) {
                                    param0.field_yb.field_H = param0.field_yb.field_H + 300;
                                    break L1;
                                  } else {
                                    if (((ge) this).field_i == 13) {
                                      var13 = (vn) (Object) param0.field_gb.d(param1 + -224);
                                      L9: while (true) {
                                        if (var13 == null) {
                                          break L1;
                                        } else {
                                          var13.c(512, -128);
                                          var13 = (vn) (Object) param0.field_gb.a((byte) 116);
                                          continue L9;
                                        }
                                      }
                                    } else {
                                      if (((ge) this).field_i != 14) {
                                        if (((ge) this).field_i != 15) {
                                          if (16 == ((ge) this).field_i) {
                                            param0.field_n = param0.field_n + 16;
                                            break L1;
                                          } else {
                                            if (17 != ((ge) this).field_i) {
                                              if (18 == ((ge) this).field_i) {
                                                var3_ref2 = (vn) (Object) param0.field_gb.d(-73);
                                                L10: while (true) {
                                                  if (var3_ref2 == null) {
                                                    break L1;
                                                  } else {
                                                    var3_ref2.field_C = var3_ref2.field_C + 40;
                                                    var3_ref2 = (vn) (Object) param0.field_gb.a((byte) 116);
                                                    continue L10;
                                                  }
                                                }
                                              } else {
                                                break L1;
                                              }
                                            } else {
                                              param0.field_yb.d(82);
                                              break L1;
                                            }
                                          }
                                        } else {
                                          var3_ref2 = (vn) (Object) param0.field_K.d(-30);
                                          L11: while (true) {
                                            if (var3_ref2 == null) {
                                              var3_ref2 = (vn) (Object) param0.field_gb.d(-88);
                                              L12: while (true) {
                                                if (var3_ref2 == null) {
                                                  break L1;
                                                } else {
                                                  var3_ref2.b(-128, 150);
                                                  var3_ref2 = (vn) (Object) param0.field_gb.a((byte) 116);
                                                  continue L12;
                                                }
                                              }
                                            } else {
                                              var3_ref2.b(param1 + -150, 150);
                                              var3_ref2 = (vn) (Object) param0.field_K.a((byte) 116);
                                              continue L11;
                                            }
                                          }
                                        }
                                      } else {
                                        param0.field_yb.field_z = param0.field_yb.field_z + 150;
                                        break L1;
                                      }
                                    }
                                  }
                                } else {
                                  var3_ref2 = (vn) (Object) param0.field_gb.d(-54);
                                  L13: while (true) {
                                    if (var3_ref2 == null) {
                                      break L1;
                                    } else {
                                      var3_ref2.c(512, 128);
                                      var3_ref2 = (vn) (Object) param0.field_gb.a((byte) 116);
                                      continue L13;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        if (param0.field_C.a(false)) {
                          param0.field_k = 0;
                          param0.field_R = param0.e(param1 + 22);
                          param0.f(1000);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      param0.field_rb = param0.field_rb + 1;
                      break L1;
                    }
                  } else {
                    var3_ref2 = (vn) (Object) param0.field_K.d(-75);
                    L14: while (true) {
                      if (var3_ref2 == null) {
                        var3_ref2 = (vn) (Object) param0.field_gb.d(-9);
                        L15: while (true) {
                          if (var3_ref2 == null) {
                            break L1;
                          } else {
                            var3_ref2.a((byte) 40, 150);
                            var3_ref2 = (vn) (Object) param0.field_gb.a((byte) 116);
                            continue L15;
                          }
                        }
                      } else {
                        var3_ref2.a((byte) 40, 150);
                        var3_ref2 = (vn) (Object) param0.field_K.a((byte) 116);
                        continue L14;
                      }
                    }
                  }
                } else {
                  param0.field_yb.field_w = param0.field_yb.field_w + 250;
                  break L1;
                }
              }
              L16: {
                if (param1 == 99) {
                  break L16;
                } else {
                  ge.c(-104);
                  break L16;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var3_ref = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) var3_ref;
            stackOut_78_1 = new StringBuilder().append("ge.C(");
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param0 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L17;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L17;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + ',' + param1 + ')');
        }
    }

    ge() {
        this(0, 0, 0, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "If you do nothing the game will revert to normal view in <%0> second.";
        field_w = 0;
        field_v = false;
    }
}
