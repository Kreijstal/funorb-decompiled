/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class vq {
    static int field_d;
    static hd field_c;
    static dn field_a;
    static String field_g;
    static String field_f;
    static String field_e;
    static ru field_b;

    final static void a(int param0, boolean param1, byte param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        String[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        String[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        String[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        String stackIn_41_2 = null;
        String[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        String[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        String[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        String stackIn_47_2 = null;
        String stackIn_87_0 = null;
        String stackIn_88_0 = null;
        String stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        int stackIn_104_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        String[] stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        String[] stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        String stackOut_46_2 = null;
        String[] stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        String stackOut_45_2 = null;
        String[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        String[] stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        String stackOut_40_2 = null;
        String[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        String stackOut_39_2 = null;
        int stackOut_103_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_104_0 = 0;
        int stackOut_104_1 = 0;
        String stackOut_86_0 = null;
        String stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        String stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          no.field_J = param0;
          ip.field_e = true;
          if (no.field_J == 0) {
            var3_int = iu.a(pf.field_d, hw.field_z, 7502, sc.field_b, du.field_b);
            var4 = 3 + var3_int;
            ca.field_h = new int[var4];
            wp.field_v = new String[var4];
            var5 = 0;
            L1: while (true) {
              if (var4 <= var5) {
                mi.field_G = new int[2];
                var5 = 0;
                L2: while (true) {
                  if (var3_int <= var5) {
                    wp.field_v[-3 + var4] = "";
                    wp.field_v[-2 + var4] = tg.field_j;
                    ca.field_h[var4 - 2] = 0;
                    mi.field_G[0] = 4;
                    wp.field_v[-1 + var4] = pd.field_f;
                    ca.field_h[-1 + var4] = 1;
                    mi.field_G[1] = 5;
                    break L0;
                  } else {
                    wp.field_v[var5] = du.field_b[var5];
                    var5++;
                    continue L2;
                  }
                }
              } else {
                ca.field_h[var5] = -1;
                var5++;
                continue L1;
              }
            }
          } else {
            if (1 != no.field_J) {
              if (no.field_J != 2) {
                if (no.field_J == 3) {
                  L3: {
                    if (!ft.field_m.field_e) {
                      var3_int = iu.a(pf.field_d, tl.field_a, 7502, sc.field_b, du.field_b);
                      break L3;
                    } else {
                      var3_int = iu.a(pf.field_d, ud.field_ab, 7502, sc.field_b, du.field_b);
                      break L3;
                    }
                  }
                  var4 = var3_int + 2;
                  ca.field_h = new int[var4];
                  wp.field_v = new String[var4];
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= var4) {
                      mi.field_G = new int[1];
                      var5 = 0;
                      L5: while (true) {
                        if (var3_int <= var5) {
                          wp.field_v[-2 + var4] = "";
                          wp.field_v[var4 - 1] = pd.field_f;
                          ca.field_h[-1 + var4] = 0;
                          mi.field_G[0] = 5;
                          break L0;
                        } else {
                          wp.field_v[var5] = du.field_b[var5];
                          var5++;
                          continue L5;
                        }
                      }
                    } else {
                      ca.field_h[var5] = -1;
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  if (no.field_J != 4) {
                    if (no.field_J == 5) {
                      var3_int = iu.a(pf.field_d, hb.field_a, 7502, sc.field_b, du.field_b);
                      var4 = 3 - -var3_int;
                      wp.field_v = new String[var4];
                      ca.field_h = new int[var4];
                      var5 = 0;
                      L6: while (true) {
                        if (var5 >= var4) {
                          mi.field_G = new int[2];
                          var5 = 0;
                          L7: while (true) {
                            if (var3_int <= var5) {
                              wp.field_v[var4 - 3] = "";
                              wp.field_v[var4 + -2] = oo.field_j;
                              ca.field_h[-2 + var4] = 0;
                              mi.field_G[0] = 3;
                              wp.field_v[-1 + var4] = pd.field_f;
                              ca.field_h[var4 + -1] = 1;
                              mi.field_G[1] = 5;
                              break L0;
                            } else {
                              wp.field_v[var5] = du.field_b[var5];
                              var5++;
                              continue L7;
                            }
                          }
                        } else {
                          ca.field_h[var5] = -1;
                          var5++;
                          continue L6;
                        }
                      }
                    } else {
                      throw new IllegalArgumentException();
                    }
                  } else {
                    var3_int = iu.a(pf.field_d, am.field_y, 7502, sc.field_b, du.field_b);
                    var4 = 2 - -var3_int;
                    wp.field_v = new String[var4];
                    ca.field_h = new int[var4];
                    var5 = 0;
                    L8: while (true) {
                      if (var4 <= var5) {
                        mi.field_G = new int[1];
                        var5 = 0;
                        L9: while (true) {
                          if (var3_int <= var5) {
                            wp.field_v[-2 + var4] = "";
                            wp.field_v[-1 + var4] = pd.field_f;
                            ca.field_h[-1 + var4] = 0;
                            mi.field_G[0] = 5;
                            break L0;
                          } else {
                            wp.field_v[var5] = du.field_b[var5];
                            var5++;
                            continue L9;
                          }
                        }
                      } else {
                        ca.field_h[var5] = -1;
                        var5++;
                        continue L8;
                      }
                    }
                  }
                }
              } else {
                var3_int = iu.a(pf.field_d, fo.a(4800, db.field_f, new String[1]), 7502, sc.field_b, du.field_b);
                var4 = -1;
                var5 = 0;
                L10: while (true) {
                  L11: {
                    if (var3_int <= var5) {
                      break L11;
                    } else {
                      if ("<%0>".equals((Object) (Object) du.field_b[var5])) {
                        var4 = var5;
                        break L11;
                      } else {
                        var5++;
                        continue L10;
                      }
                    }
                  }
                  if (var4 == -1) {
                    throw new IllegalStateException();
                  } else {
                    mo.field_i = new String[var4];
                    vm.a((Object[]) (Object) du.field_b, 0, (Object[]) (Object) mo.field_i, 0, var4);
                    hg.field_d = new String[var3_int + (-var4 - 1)];
                    vm.a((Object[]) (Object) du.field_b, 1 + var4, (Object[]) (Object) hg.field_d, 0, -1 + var3_int + -var4);
                    var4 = -1;
                    var3_int = iu.a(pf.field_d, fo.a(4800, be.field_v, new String[1]), 7502, sc.field_b, du.field_b);
                    var5 = 0;
                    L12: while (true) {
                      L13: {
                        if (var5 >= var3_int) {
                          break L13;
                        } else {
                          if ("<%0>".equals((Object) (Object) du.field_b[var5])) {
                            var4 = var5;
                            break L13;
                          } else {
                            var5++;
                            continue L12;
                          }
                        }
                      }
                      if (var4 != -1) {
                        L14: {
                          va.field_A = new String[var4];
                          vm.a((Object[]) (Object) du.field_b, 0, (Object[]) (Object) va.field_A, 0, var4);
                          tc.field_f = new String[var3_int - var4 + -1];
                          vm.a((Object[]) (Object) du.field_b, var4 - -1, (Object[]) (Object) tc.field_f, 0, -1 + (-var4 + var3_int));
                          if (va.field_A.length <= mo.field_i.length) {
                            stackOut_29_0 = mo.field_i.length;
                            stackIn_30_0 = stackOut_29_0;
                            break L14;
                          } else {
                            stackOut_28_0 = va.field_A.length;
                            stackIn_30_0 = stackOut_28_0;
                            break L14;
                          }
                        }
                        L15: {
                          var5 = stackIn_30_0;
                          if (tc.field_f.length > hg.field_d.length) {
                            stackOut_32_0 = tc.field_f.length;
                            stackIn_33_0 = stackOut_32_0;
                            break L15;
                          } else {
                            stackOut_31_0 = hg.field_d.length;
                            stackIn_33_0 = stackOut_31_0;
                            break L15;
                          }
                        }
                        var6 = stackIn_33_0;
                        var7 = var6 + var5 + 7;
                        ca.field_h = new int[var7];
                        wp.field_v = new String[var7];
                        var8 = 0;
                        L16: while (true) {
                          if (var8 >= var7) {
                            ca.field_h[1] = 0;
                            mi.field_G = new int[2];
                            wp.field_v[0] = c.field_d;
                            wp.field_v[1] = ui.field_e;
                            mi.field_G[1] = 2;
                            wp.field_v[5] = "";
                            mi.field_G[0] = 5;
                            wp.field_v[4] = ts.field_f;
                            wp.field_v[2] = od.field_e;
                            wp.field_v[3] = ge.field_m;
                            ca.field_h[3] = 1;
                            var8 = 0;
                            L17: while (true) {
                              if (var5 <= var8) {
                                wp.field_v[var5 + 6] = null;
                                ca.field_h[6 - -var5] = -2;
                                var8 = 0;
                                L18: while (true) {
                                  if (var8 >= var6) {
                                    break L0;
                                  } else {
                                    L19: {
                                      stackOut_44_0 = wp.field_v;
                                      stackOut_44_1 = var5 + 7 - -var8;
                                      stackIn_46_0 = stackOut_44_0;
                                      stackIn_46_1 = stackOut_44_1;
                                      stackIn_45_0 = stackOut_44_0;
                                      stackIn_45_1 = stackOut_44_1;
                                      if (tc.field_f.length <= var8) {
                                        stackOut_46_0 = (String[]) (Object) stackIn_46_0;
                                        stackOut_46_1 = stackIn_46_1;
                                        stackOut_46_2 = "";
                                        stackIn_47_0 = stackOut_46_0;
                                        stackIn_47_1 = stackOut_46_1;
                                        stackIn_47_2 = stackOut_46_2;
                                        break L19;
                                      } else {
                                        stackOut_45_0 = (String[]) (Object) stackIn_45_0;
                                        stackOut_45_1 = stackIn_45_1;
                                        stackOut_45_2 = tc.field_f[var8];
                                        stackIn_47_0 = stackOut_45_0;
                                        stackIn_47_1 = stackOut_45_1;
                                        stackIn_47_2 = stackOut_45_2;
                                        break L19;
                                      }
                                    }
                                    stackIn_47_0[stackIn_47_1] = stackIn_47_2;
                                    var8++;
                                    continue L18;
                                  }
                                }
                              } else {
                                L20: {
                                  stackOut_38_0 = wp.field_v;
                                  stackOut_38_1 = 6 + var8;
                                  stackIn_40_0 = stackOut_38_0;
                                  stackIn_40_1 = stackOut_38_1;
                                  stackIn_39_0 = stackOut_38_0;
                                  stackIn_39_1 = stackOut_38_1;
                                  if (-var5 + (va.field_A.length + var8) < 0) {
                                    stackOut_40_0 = (String[]) (Object) stackIn_40_0;
                                    stackOut_40_1 = stackIn_40_1;
                                    stackOut_40_2 = "";
                                    stackIn_41_0 = stackOut_40_0;
                                    stackIn_41_1 = stackOut_40_1;
                                    stackIn_41_2 = stackOut_40_2;
                                    break L20;
                                  } else {
                                    stackOut_39_0 = (String[]) (Object) stackIn_39_0;
                                    stackOut_39_1 = stackIn_39_1;
                                    stackOut_39_2 = va.field_A[-var5 + (va.field_A.length + var8)];
                                    stackIn_41_0 = stackOut_39_0;
                                    stackIn_41_1 = stackOut_39_1;
                                    stackIn_41_2 = stackOut_39_2;
                                    break L20;
                                  }
                                }
                                stackIn_41_0[stackIn_41_1] = stackIn_41_2;
                                var8++;
                                continue L17;
                              }
                            }
                          } else {
                            ca.field_h[var8] = -1;
                            var8++;
                            continue L16;
                          }
                        }
                      } else {
                        throw new IllegalStateException();
                      }
                    }
                  }
                }
              }
            } else {
              var3_int = iu.a(pf.field_d, hw.field_z, 7502, sc.field_b, du.field_b);
              var4 = var3_int + 2;
              ca.field_h = new int[var4];
              wp.field_v = new String[var4];
              var5 = 0;
              L21: while (true) {
                if (var4 <= var5) {
                  mi.field_G = new int[1];
                  var5 = 0;
                  L22: while (true) {
                    if (var3_int <= var5) {
                      wp.field_v[var4 - 2] = "";
                      wp.field_v[-1 + var4] = pd.field_f;
                      ca.field_h[-1 + var4] = 0;
                      mi.field_G[0] = 5;
                      break L0;
                    } else {
                      wp.field_v[var5] = du.field_b[var5];
                      var5++;
                      continue L22;
                    }
                  }
                } else {
                  ca.field_h[var5] = -1;
                  var5++;
                  continue L21;
                }
              }
            }
          }
        }
        ug.field_c.field_k = mi.field_G.length;
        var3_int = 0;
        var4 = 0;
        L23: while (true) {
          if (var4 >= wp.field_v.length) {
            L24: {
              if (no.field_J == 2) {
                var10 = mo.field_i;
                var5 = 0;
                L25: while (true) {
                  if (var5 >= var10.length) {
                    var11 = hg.field_d;
                    var5 = 0;
                    L26: while (true) {
                      if (var5 >= var11.length) {
                        break L24;
                      } else {
                        L27: {
                          var13 = var11[var5];
                          var7 = lg.a(var13, false, (byte) -122);
                          if (var3_int >= var7) {
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        var5++;
                        continue L26;
                      }
                    }
                  } else {
                    L28: {
                      var12 = var10[var5];
                      var7 = lg.a(var12, false, (byte) -128);
                      if (var7 <= var3_int) {
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    var5++;
                    continue L25;
                  }
                }
              } else {
                break L24;
              }
            }
            m.field_i = (el.field_c + cp.field_a << 1) * ug.field_c.field_k;
            var4 = 0;
            var5 = -42 % ((-39 - param2) / 37);
            L29: while (true) {
              if (wp.field_v.length <= var4) {
                od.field_b = -(m.field_i >> 1) + ar.field_C;
                lg.field_b = new int[wp.field_v.length][];
                var4 = 0;
                var5 = od.field_b;
                L30: while (true) {
                  if (wp.field_v.length <= var4) {
                    L31: {
                      if (no.field_J != 2) {
                        ug.field_c.a(0, param1, ec.a(sm.field_d, 120, ko.field_b), 0);
                        break L31;
                      } else {
                        ug.field_c.a(-1, param1, -1, 0);
                        break L31;
                      }
                    }
                    return;
                  } else {
                    L32: {
                      var6 = ca.field_h[var4];
                      if (var6 >= 0) {
                        var7 = lg.a(wp.field_v[var4], true, (byte) -89);
                        var8 = -(var7 >> 1) + rk.field_B;
                        var5 = var5 + cp.field_a;
                        lg.field_b[var4] = new int[4];
                        lg.field_b[var4][0] = var8 - et.field_b;
                        lg.field_b[var4][1] = var5;
                        lg.field_b[var4][2] = var7 + (et.field_b << 1);
                        var5 = var5 + (q.field_B + (cp.field_a + (el.field_c << 1)));
                        lg.field_b[var4][3] = q.field_B + (el.field_c << 1);
                        break L32;
                      } else {
                        var5 = var5 + fh.field_e;
                        break L32;
                      }
                    }
                    var4++;
                    continue L30;
                  }
                }
              } else {
                L33: {
                  stackOut_103_0 = m.field_i;
                  stackIn_105_0 = stackOut_103_0;
                  stackIn_104_0 = stackOut_103_0;
                  if (0 > ca.field_h[var4]) {
                    stackOut_105_0 = stackIn_105_0;
                    stackOut_105_1 = fh.field_e;
                    stackIn_106_0 = stackOut_105_0;
                    stackIn_106_1 = stackOut_105_1;
                    break L33;
                  } else {
                    stackOut_104_0 = stackIn_104_0;
                    stackOut_104_1 = q.field_B;
                    stackIn_106_0 = stackOut_104_0;
                    stackIn_106_1 = stackOut_104_1;
                    break L33;
                  }
                }
                m.field_i = stackIn_106_0 + stackIn_106_1;
                var4++;
                continue L29;
              }
            }
          } else {
            L34: {
              stackOut_86_0 = wp.field_v[var4];
              stackIn_88_0 = stackOut_86_0;
              stackIn_87_0 = stackOut_86_0;
              if (ca.field_h[var4] < 0) {
                stackOut_88_0 = (String) (Object) stackIn_88_0;
                stackOut_88_1 = 0;
                stackIn_89_0 = stackOut_88_0;
                stackIn_89_1 = stackOut_88_1;
                break L34;
              } else {
                stackOut_87_0 = (String) (Object) stackIn_87_0;
                stackOut_87_1 = 1;
                stackIn_89_0 = stackOut_87_0;
                stackIn_89_1 = stackOut_87_1;
                break L34;
              }
            }
            L35: {
              var5 = lg.a(stackIn_89_0, stackIn_89_1 != 0, (byte) -101);
              if (var3_int >= var5) {
                break L35;
              } else {
                break L35;
              }
            }
            var4++;
            continue L23;
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        field_e = null;
        field_g = null;
        field_a = null;
        field_f = null;
    }

    final static boolean a(CharSequence param0, boolean param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            stackOut_2_0 = wt.a(param0, (byte) 65, false);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("vq.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + true + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(bv param0, int param1) {
        return param0.g(-108, 1) == 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Reject <%0> from this game";
        field_e = "Liquids to permanently affect your units and your enemy's.";
        field_f = "Back to Menu";
    }
}
