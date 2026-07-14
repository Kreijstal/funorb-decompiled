/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends java.awt.Canvas {
    private java.awt.Component field_c;
    static int field_b;
    static rk field_f;
    static String field_e;
    static int[] field_d;
    static String field_a;

    hi(java.awt.Component param0) {
        ((hi) this).field_c = param0;
    }

    final static void a(byte[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        rb var16 = null;
        rb var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        var15 = StarCannon.field_A;
        var16 = new rb(param0);
        var17 = var16;
        var17.field_g = -2 + param0.length;
        bj.field_b = var17.i(-1174051992);
        hc.field_a = new boolean[bj.field_b];
        gh.field_C = new int[bj.field_b];
        gg.field_d = new int[bj.field_b];
        ac.field_d = new byte[bj.field_b][];
        og.field_c = new byte[bj.field_b][];
        qd.field_H = new int[bj.field_b];
        fc.field_d = new int[bj.field_b];
        var17.field_g = -(bj.field_b * 8) + (-7 + param0.length);
        td.field_m = var17.i(-1174051992);
        gb.field_w = var17.i(-1174051992);
        var3 = 1 + (255 & var17.j(7909));
        var4 = 0;
        L0: while (true) {
          L1: {
            if (bj.field_b <= var4) {
              break L1;
            } else {
              fc.field_d[var4] = var16.i(param1 + -1174051992);
              var4++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var4 = 0;
          L2: while (true) {
            L3: {
              if (bj.field_b <= var4) {
                break L3;
              } else {
                qd.field_H[var4] = var16.i(-1174051992);
                var4++;
                if (0 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            var4 = 0;
            L4: while (true) {
              L5: {
                if (bj.field_b <= var4) {
                  break L5;
                } else {
                  gg.field_d[var4] = var16.i(-1174051992);
                  var4++;
                  if (0 == 0) {
                    continue L4;
                  } else {
                    break L5;
                  }
                }
              }
              var4 = 0;
              L6: while (true) {
                L7: {
                  if (bj.field_b <= var4) {
                    break L7;
                  } else {
                    gh.field_C[var4] = var16.i(-1174051992);
                    var4++;
                    if (0 == 0) {
                      continue L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var17.field_g = -((-1 + var3) * 3) + (-7 + param0.length) + -(8 * bj.field_b);
                of.field_g = new int[var3];
                var4 = 1;
                L8: while (true) {
                  L9: {
                    if (var3 <= var4) {
                      break L9;
                    } else {
                      L10: {
                        of.field_g[var4] = var16.g(-115);
                        if ((of.field_g[var4] ^ -1) == -1) {
                          of.field_g[var4] = 1;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      var4++;
                      if (0 == 0) {
                        continue L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var17.field_g = 0;
                  var4 = param1;
                  L11: while (true) {
                    L12: {
                      if (var4 >= bj.field_b) {
                        break L12;
                      } else {
                        L13: {
                          L14: {
                            var5 = gg.field_d[var4];
                            var6 = gh.field_C[var4];
                            var7 = var5 * var6;
                            var24 = new byte[var7];
                            var22 = var24;
                            var20 = var22;
                            var18 = var20;
                            var8 = var18;
                            og.field_c[var4] = var24;
                            var25 = new byte[var7];
                            var23 = var25;
                            var21 = var23;
                            var19 = var21;
                            var9 = var19;
                            ac.field_d[var4] = var25;
                            var10 = 0;
                            var11 = var17.j(7909);
                            if (-1 != (1 & var11 ^ -1)) {
                              break L14;
                            } else {
                              var12 = 0;
                              L15: while (true) {
                                L16: {
                                  if (var12 >= var7) {
                                    break L16;
                                  } else {
                                    var8[var12] = var16.a(false);
                                    var12++;
                                    if (0 == 0) {
                                      continue L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                if ((2 & var11) == 0) {
                                  break L13;
                                } else {
                                  var12 = 0;
                                  L17: while (true) {
                                    L18: {
                                      if (var12 >= var7) {
                                        break L18;
                                      } else {
                                        L19: {
                                          var9[var12] = var16.a(false);
                                          var13 = var16.a(false);
                                          stackOut_32_0 = var10;
                                          stackIn_34_0 = stackOut_32_0;
                                          stackIn_33_0 = stackOut_32_0;
                                          if (0 == (var13 ^ -1)) {
                                            stackOut_34_0 = stackIn_34_0;
                                            stackOut_34_1 = 0;
                                            stackIn_35_0 = stackOut_34_0;
                                            stackIn_35_1 = stackOut_34_1;
                                            break L19;
                                          } else {
                                            stackOut_33_0 = stackIn_33_0;
                                            stackOut_33_1 = 1;
                                            stackIn_35_0 = stackOut_33_0;
                                            stackIn_35_1 = stackOut_33_1;
                                            break L19;
                                          }
                                        }
                                        var10 = stackIn_35_0 | stackIn_35_1;
                                        var12++;
                                        if (0 == 0) {
                                          continue L17;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    if (0 == 0) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var12 = 0;
                          L20: while (true) {
                            L21: {
                              if (var5 <= var12) {
                                break L21;
                              } else {
                                var13 = 0;
                                L22: while (true) {
                                  L23: {
                                    if (var6 <= var13) {
                                      break L23;
                                    } else {
                                      var8[var13 * var5 + var12] = var16.a(false);
                                      var13++;
                                      if (0 == 0) {
                                        continue L22;
                                      } else {
                                        break L23;
                                      }
                                    }
                                  }
                                  var12++;
                                  if (0 == 0) {
                                    continue L20;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                            }
                            if ((2 & var11) != 0) {
                              var12 = 0;
                              L24: while (true) {
                                if (var12 >= var5) {
                                  break L13;
                                } else {
                                  var13 = 0;
                                  L25: while (true) {
                                    L26: {
                                      if (var6 <= var13) {
                                        break L26;
                                      } else {
                                        L27: {
                                          var9[var5 * var13 + var12] = var16.a(false);
                                          var14 = var16.a(false);
                                          stackOut_50_0 = var10;
                                          stackIn_52_0 = stackOut_50_0;
                                          stackIn_51_0 = stackOut_50_0;
                                          if (0 == (var14 ^ -1)) {
                                            stackOut_52_0 = stackIn_52_0;
                                            stackOut_52_1 = 0;
                                            stackIn_53_0 = stackOut_52_0;
                                            stackIn_53_1 = stackOut_52_1;
                                            break L27;
                                          } else {
                                            stackOut_51_0 = stackIn_51_0;
                                            stackOut_51_1 = 1;
                                            stackIn_53_0 = stackOut_51_0;
                                            stackIn_53_1 = stackOut_51_1;
                                            break L27;
                                          }
                                        }
                                        var10 = stackIn_53_0 | stackIn_53_1;
                                        var13++;
                                        if (0 == 0) {
                                          continue L25;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                    var12++;
                                    if (0 == 0) {
                                      continue L24;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L13;
                            }
                          }
                        }
                        hc.field_a[var4] = var10 != 0;
                        var4++;
                        if (0 == 0) {
                          continue L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_a = null;
        if (param0 != 56) {
            return;
        }
        field_e = null;
        field_d = null;
    }

    public final void paint(java.awt.Graphics param0) {
        ((hi) this).field_c.paint(param0);
    }

    public final void update(java.awt.Graphics param0) {
        ((hi) this).field_c.update(param0);
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            vk.field_v = param1;
            try {
                var3 = param2.getParameter("cookieprefix");
                var4 = param2.getParameter("cookiehost");
                var5 = var3 + "session=" + param1 + "; version=1; path=/; domain=" + var4;
                if (!(param0 != param1.length())) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                mb.a("document.cookie=\"" + var5 + "\"", param2, 790);
            } catch (Throwable throwable) {
            }
            lj.a(816415832, param2);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new rk();
        field_e = "Email address is unavailable";
        field_d = new int[8192];
        field_a = null;
    }
}
