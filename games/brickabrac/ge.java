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
        param1.removeKeyListener((java.awt.event.KeyListener) (Object) gp.field_c);
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) gp.field_c);
        if (param0 != -2846) {
            ge.c(91);
        }
        pl.field_d = -1;
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

    final static pb a(int param0, int param1, int param2) {
        if (param2 != -20777) {
            Object var4 = null;
            ge.a(58, (java.awt.Component) null);
        }
        return so.a(param2 ^ -20777, param1, param0, ip.field_s);
    }

    final boolean b(boolean param0) {
        if (param0) {
            Object var3 = null;
            int discarded$0 = ((ge) this).a(61, (StringBuilder) null);
        }
        return ck.field_m[((ge) this).field_i];
    }

    final int a(int param0, StringBuilder param1) {
        if (param0 < 79) {
          return -19;
        } else {
          return 139 * ((ge) this).field_y - -131 << -1763036443 ^ super.a(121, param1);
        }
    }

    final void a(j param0, byte param1) {
        vn var3 = null;
        vn var3_ref = null;
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
        var3 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        if (param0.field_Z != 3) {
          L0: {
            if (((ge) this).field_i != 3) {
              if (4 != ((ge) this).field_i) {
                if (5 != ((ge) this).field_i) {
                  if (6 != ((ge) this).field_i) {
                    if (((ge) this).field_i == -8) {
                      param0.field_yb.e((byte) 127);
                      break L0;
                    } else {
                      if (-9 == ((ge) this).field_i) {
                        param0.field_yb.b(true);
                        break L0;
                      } else {
                        if (-10 == (((ge) this).field_i ^ -1)) {
                          L1: {
                            if (param0.field_gb.a(false)) {
                              break L1;
                            } else {
                              var12 = (vn) (Object) param0.field_gb.d(-63);
                              var3 = var12;
                              var4 = (31457280 + -(var12.field_m << 512207880)) / var12.field_o;
                              var5 = (vn) (Object) param0.field_gb.d(-8);
                              L2: while (true) {
                                if (var5 == null) {
                                  break L1;
                                } else {
                                  L3: {
                                    var5.field_C = 0;
                                    var5.field_v = 0;
                                    var6 = (31457280 + -(var5.field_m << -1250615224)) / var5.field_o;
                                    if (var4 <= var6) {
                                      if (var6 > var4) {
                                        var3.b((byte) 111);
                                        var4 = var6;
                                        var3 = var5;
                                        break L3;
                                      } else {
                                        break L3;
                                      }
                                    } else {
                                      var5.b((byte) 111);
                                      break L3;
                                    }
                                  }
                                  var5 = (vn) (Object) param0.field_gb.a((byte) 116);
                                  continue L2;
                                }
                              }
                            }
                          }
                          L4: {
                            if (param0.field_K.a(false)) {
                              break L4;
                            } else {
                              if (!param0.field_gb.a(false)) {
                                param0.field_K.c((byte) -62);
                                break L4;
                              } else {
                                var3_ref = (vn) (Object) param0.field_K.d(param1 + -108);
                                var3_ref.field_C = 0;
                                var3_ref.field_v = 0;
                                param0.field_K.c((byte) -63);
                                param0.field_K.a((nm) (Object) var3_ref, (byte) 3);
                                break L4;
                              }
                            }
                          }
                          L5: while (true) {
                            if (param0.field_yb.field_F <= 8) {
                              param0.field_yb.field_H = 0;
                              param0.field_yb.field_z = 0;
                              break L0;
                            } else {
                              param0.field_yb.e((byte) 126);
                              continue L5;
                            }
                          }
                        } else {
                          if (10 == ((ge) this).field_i) {
                            if (param0.field_gb.e(118) != 1) {
                              break L0;
                            } else {
                              var11 = (vn) (Object) param0.field_gb.d(param1 + -161);
                              var4 = kj.a(var11.field_o * var11.field_o + var11.field_k * var11.field_k, param1 ^ 97) >> -1867539480;
                              var5_int = var11.field_k;
                              var6 = var11.field_o;
                              var7 = 0;
                              L6: while (true) {
                                if (7 <= var7) {
                                  var7 = 0;
                                  var8 = (vn) (Object) param0.field_gb.d(-39);
                                  L7: while (true) {
                                    if (var8 == null) {
                                      break L0;
                                    } else {
                                      var8.field_k = (15 * BrickABrac.c(param1 + 1949, 1024 * var7) >> -378108984) + var5_int;
                                      var8.field_o = var6 - -(15 * sa.a(var7 * 1024, -4097) >> 1688167464);
                                      var9 = kj.a(var8.field_o * var8.field_o + var8.field_k * var8.field_k, 2) >> 437563272;
                                      var8.field_k = var4 * var8.field_k / var9;
                                      var8.field_o = var4 * var8.field_o / var9;
                                      var7++;
                                      var8 = (vn) (Object) param0.field_gb.a((byte) 116);
                                      continue L7;
                                    }
                                  }
                                } else {
                                  param0.field_gb.a((nm) (Object) new vn(var11.field_j, var11.field_m, 0, 0), (byte) 3);
                                  var7++;
                                  continue L6;
                                }
                              }
                            }
                          } else {
                            if (((ge) this).field_i != 11) {
                              if (((ge) this).field_i == -13) {
                                param0.field_yb.field_H = param0.field_yb.field_H + 300;
                                break L0;
                              } else {
                                if (-14 == ((ge) this).field_i) {
                                  var13 = (vn) (Object) param0.field_gb.d(param1 + -224);
                                  L8: while (true) {
                                    if (var13 == null) {
                                      break L0;
                                    } else {
                                      var13.c(512, -128);
                                      var13 = (vn) (Object) param0.field_gb.a((byte) 116);
                                      continue L8;
                                    }
                                  }
                                } else {
                                  if ((((ge) this).field_i ^ -1) != -15) {
                                    if ((((ge) this).field_i ^ -1) != -16) {
                                      if (16 == ((ge) this).field_i) {
                                        param0.field_n = param0.field_n + 16;
                                        break L0;
                                      } else {
                                        if (17 != ((ge) this).field_i) {
                                          if (18 == ((ge) this).field_i) {
                                            var3_ref = (vn) (Object) param0.field_gb.d(-73);
                                            L9: while (true) {
                                              if (var3_ref == null) {
                                                break L0;
                                              } else {
                                                var3_ref.field_C = var3_ref.field_C + 40;
                                                var3_ref = (vn) (Object) param0.field_gb.a((byte) 116);
                                                continue L9;
                                              }
                                            }
                                          } else {
                                            break L0;
                                          }
                                        } else {
                                          param0.field_yb.d(82);
                                          break L0;
                                        }
                                      }
                                    } else {
                                      var3_ref = (vn) (Object) param0.field_K.d(-30);
                                      L10: while (true) {
                                        if (var3_ref == null) {
                                          var3_ref = (vn) (Object) param0.field_gb.d(-88);
                                          L11: while (true) {
                                            if (var3_ref == null) {
                                              break L0;
                                            } else {
                                              var3_ref.b(-128, 150);
                                              var3_ref = (vn) (Object) param0.field_gb.a((byte) 116);
                                              continue L11;
                                            }
                                          }
                                        } else {
                                          var3_ref.b(param1 + -150, 150);
                                          var3_ref = (vn) (Object) param0.field_K.a((byte) 116);
                                          continue L10;
                                        }
                                      }
                                    }
                                  } else {
                                    param0.field_yb.field_z = param0.field_yb.field_z + 150;
                                    break L0;
                                  }
                                }
                              }
                            } else {
                              var3_ref = (vn) (Object) param0.field_gb.d(-54);
                              L12: while (true) {
                                if (var3_ref == null) {
                                  break L0;
                                } else {
                                  var3_ref.c(512, 128);
                                  var3_ref = (vn) (Object) param0.field_gb.a((byte) 116);
                                  continue L12;
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
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                } else {
                  param0.field_rb = param0.field_rb + 1;
                  break L0;
                }
              } else {
                var3_ref = (vn) (Object) param0.field_K.d(-75);
                L13: while (true) {
                  if (var3_ref == null) {
                    var3_ref = (vn) (Object) param0.field_gb.d(-9);
                    L14: while (true) {
                      if (var3_ref == null) {
                        break L0;
                      } else {
                        var3_ref.a((byte) 40, 150);
                        var3_ref = (vn) (Object) param0.field_gb.a((byte) 116);
                        continue L14;
                      }
                    }
                  } else {
                    var3_ref.a((byte) 40, 150);
                    var3_ref = (vn) (Object) param0.field_K.a((byte) 116);
                    continue L13;
                  }
                }
              }
            } else {
              param0.field_yb.field_w = param0.field_yb.field_w + 250;
              break L0;
            }
          }
          L15: {
            if (param1 == 99) {
              break L15;
            } else {
              ge.c(-104);
              break L15;
            }
          }
          return;
        } else {
          return;
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
