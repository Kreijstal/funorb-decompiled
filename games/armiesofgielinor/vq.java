/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vq {
    static int field_d;
    static hd field_c;
    static dn field_a;
    static String field_g;
    static String field_f;
    static String field_e;
    static ru field_b;

    final static void a(int param0, boolean param1, byte param2) {
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        String[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        String[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        String stackIn_42_2 = null;
        String[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        String[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        String stackIn_48_2 = null;
        String stackIn_89_0 = null;
        String stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              no.field_J = param0;
              ip.field_e = true;
              if (no.field_J == 0) {
                var3_int = iu.a(pf.field_d, hw.field_z, 7502, sc.field_b, du.field_b);
                var4 = 3 + var3_int;
                ca.field_h = new int[var4];
                wp.field_v = new String[var4];
                var5 = 0;
                L2: while (true) {
                  if (var4 <= var5) {
                    mi.field_G = new int[2];
                    var5 = 0;
                    L3: while (true) {
                      if (var3_int <= var5) {
                        wp.field_v[-3 + var4] = "";
                        wp.field_v[-2 + var4] = tg.field_j;
                        ca.field_h[var4 - 2] = 0;
                        mi.field_G[0] = 4;
                        wp.field_v[-1 + var4] = pd.field_f;
                        ca.field_h[-1 + var4] = 1;
                        mi.field_G[1] = 5;
                        break L1;
                      } else {
                        wp.field_v[var5] = du.field_b[var5];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    ca.field_h[var5] = -1;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if (1 != no.field_J) {
                  if (-3 != (no.field_J ^ -1)) {
                    if (-4 == (no.field_J ^ -1)) {
                      L4: {
                        if (!ft.field_m.field_e) {
                          var3_int = iu.a(pf.field_d, tl.field_a, 7502, sc.field_b, du.field_b);
                          break L4;
                        } else {
                          var3_int = iu.a(pf.field_d, ud.field_ab, 7502, sc.field_b, du.field_b);
                          break L4;
                        }
                      }
                      var4 = var3_int + 2;
                      ca.field_h = new int[var4];
                      wp.field_v = new String[var4];
                      var5 = 0;
                      L5: while (true) {
                        if (var5 >= var4) {
                          mi.field_G = new int[1];
                          var5 = 0;
                          L6: while (true) {
                            if (var3_int <= var5) {
                              wp.field_v[-2 + var4] = "";
                              wp.field_v[var4 - 1] = pd.field_f;
                              ca.field_h[-1 + var4] = 0;
                              mi.field_G[0] = 5;
                              break L1;
                            } else {
                              wp.field_v[var5] = du.field_b[var5];
                              var5++;
                              continue L6;
                            }
                          }
                        } else {
                          ca.field_h[var5] = -1;
                          var5++;
                          continue L5;
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
                          L7: while (true) {
                            if (var5 >= var4) {
                              mi.field_G = new int[2];
                              var5 = 0;
                              L8: while (true) {
                                if (var3_int <= var5) {
                                  wp.field_v[var4 - 3] = "";
                                  wp.field_v[var4 + -2] = oo.field_j;
                                  ca.field_h[-2 + var4] = 0;
                                  mi.field_G[0] = 3;
                                  wp.field_v[-1 + var4] = pd.field_f;
                                  ca.field_h[var4 + -1] = 1;
                                  mi.field_G[1] = 5;
                                  break L1;
                                } else {
                                  wp.field_v[var5] = du.field_b[var5];
                                  var5++;
                                  continue L8;
                                }
                              }
                            } else {
                              ca.field_h[var5] = -1;
                              var5++;
                              continue L7;
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
                        L9: while (true) {
                          if (var4 <= var5) {
                            mi.field_G = new int[1];
                            var5 = 0;
                            L10: while (true) {
                              if (var3_int <= var5) {
                                wp.field_v[-2 + var4] = "";
                                wp.field_v[-1 + var4] = pd.field_f;
                                ca.field_h[-1 + var4] = 0;
                                mi.field_G[0] = 5;
                                break L1;
                              } else {
                                wp.field_v[var5] = du.field_b[var5];
                                var5++;
                                continue L10;
                              }
                            }
                          } else {
                            ca.field_h[var5] = -1;
                            var5++;
                            continue L9;
                          }
                        }
                      }
                    }
                  } else {
                    var3_int = iu.a(pf.field_d, fo.a(4800, db.field_f, new String[]{"<br><%0><br>"}), 7502, sc.field_b, du.field_b);
                    var4 = -1;
                    var5 = 0;
                    L11: while (true) {
                      L12: {
                        if (var3_int <= var5) {
                          break L12;
                        } else {
                          if ("<%0>".equals(du.field_b[var5])) {
                            var4 = var5;
                            break L12;
                          } else {
                            var5++;
                            continue L11;
                          }
                        }
                      }
                      if (var4 == -1) {
                        throw new IllegalStateException();
                      } else {
                        mo.field_i = new String[var4];
                        vm.a(du.field_b, 0, mo.field_i, 0, var4);
                        hg.field_d = new String[var3_int + (-var4 - 1)];
                        vm.a(du.field_b, 1 + var4, hg.field_d, 0, -1 + var3_int + -var4);
                        var4 = -1;
                        var3_int = iu.a(pf.field_d, fo.a(4800, be.field_v, new String[]{"<br><%0><br>"}), 7502, sc.field_b, du.field_b);
                        var5 = 0;
                        L13: while (true) {
                          L14: {
                            if (var5 >= var3_int) {
                              break L14;
                            } else {
                              if ("<%0>".equals(du.field_b[var5])) {
                                var4 = var5;
                                break L14;
                              } else {
                                var5++;
                                continue L13;
                              }
                            }
                          }
                          if (var4 != -1) {
                            L15: {
                              va.field_A = new String[var4];
                              vm.a(du.field_b, 0, va.field_A, 0, var4);
                              tc.field_f = new String[var3_int - var4 + -1];
                              vm.a(du.field_b, var4 - -1, tc.field_f, 0, -1 + (-var4 + var3_int));
                              if (va.field_A.length <= mo.field_i.length) {
                                stackIn_31_0 = mo.field_i.length;
                                break L15;
                              } else {
                                stackIn_31_0 = va.field_A.length;
                                break L15;
                              }
                            }
                            L16: {
                              var5 = stackIn_31_0;
                              if (tc.field_f.length > hg.field_d.length) {
                                stackIn_34_0 = tc.field_f.length;
                                break L16;
                              } else {
                                stackIn_34_0 = hg.field_d.length;
                                break L16;
                              }
                            }
                            var6 = stackIn_34_0;
                            var7 = var6 + var5 + 7;
                            ca.field_h = new int[var7];
                            wp.field_v = new String[var7];
                            var8 = 0;
                            L17: while (true) {
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
                                L18: while (true) {
                                  if (var5 <= var8) {
                                    wp.field_v[var5 + 6] = null;
                                    ca.field_h[6 - -var5] = -2;
                                    var8 = 0;
                                    L19: while (true) {
                                      if (var8 >= var6) {
                                        vi.b(71);
                                        break L1;
                                      } else {
                                        L20: {
                                          stackIn_47_0 = wp.field_v;

                                          stackIn_47_1 = var5 + 7 - -var8;

                                          if (tc.field_f.length <= var8) {
                                            stackIn_48_0 = (String[]) ((Object) stackIn_47_0);
                                            stackIn_48_1 = stackIn_47_1;
                                            stackIn_48_2 = "";
                                            break L20;
                                          } else {
                                            stackIn_48_0 = (String[]) ((Object) stackIn_47_0);
                                            stackIn_48_1 = stackIn_47_1;
                                            stackIn_48_2 = tc.field_f[var8];
                                            break L20;
                                          }
                                        }
                                        stackIn_48_0[stackIn_48_1] = stackIn_48_2;
                                        var8++;
                                        continue L19;
                                      }
                                    }
                                  } else {
                                    L21: {
                                      stackIn_41_0 = wp.field_v;

                                      stackIn_41_1 = 6 + var8;

                                      if (-var5 + (va.field_A.length + var8) < 0) {
                                        stackIn_42_0 = (String[]) ((Object) stackIn_41_0);
                                        stackIn_42_1 = stackIn_41_1;
                                        stackIn_42_2 = "";
                                        break L21;
                                      } else {
                                        stackIn_42_0 = (String[]) ((Object) stackIn_41_0);
                                        stackIn_42_1 = stackIn_41_1;
                                        stackIn_42_2 = va.field_A[-var5 + (va.field_A.length + var8)];
                                        break L21;
                                      }
                                    }
                                    stackIn_42_0[stackIn_42_1] = stackIn_42_2;
                                    var8++;
                                    continue L18;
                                  }
                                }
                              } else {
                                ca.field_h[var8] = -1;
                                var8++;
                                continue L17;
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
                  L22: while (true) {
                    if (var4 <= var5) {
                      mi.field_G = new int[1];
                      var5 = 0;
                      L23: while (true) {
                        if (var3_int <= var5) {
                          wp.field_v[var4 - 2] = "";
                          wp.field_v[-1 + var4] = pd.field_f;
                          ca.field_h[-1 + var4] = 0;
                          mi.field_G[0] = 5;
                          break L1;
                        } else {
                          wp.field_v[var5] = du.field_b[var5];
                          var5++;
                          continue L23;
                        }
                      }
                    } else {
                      ca.field_h[var5] = -1;
                      var5++;
                      continue L22;
                    }
                  }
                }
              }
            }
            ug.field_c.field_k = mi.field_G.length;
            var3_int = 0;
            var4 = 0;
            L24: while (true) {
              if (var4 >= wp.field_v.length) {
                L25: {
                  if (no.field_J == 2) {
                    var10 = mo.field_i;
                    var4_ref_String__ = var10;
                    var5 = 0;
                    L26: while (true) {
                      if (var5 >= var10.length) {
                        var4_ref_String__ = hg.field_d;
                        var5 = 0;
                        L27: while (true) {
                          if (var5 >= var4_ref_String__.length) {
                            break L25;
                          } else {
                            var12 = var4_ref_String__[var5];
                            var7 = lg.a(var12, false, (byte) -122);
                            if (var3_int < var7) {
                              var3_int = var7;
                              var5++;
                              continue L27;
                            } else {
                              var5++;
                              continue L27;
                            }
                          }
                        }
                      } else {
                        var11 = var10[var5];
                        var7 = lg.a(var11, false, (byte) -128);
                        if ((var7 ^ -1) < (var3_int ^ -1)) {
                          var3_int = var7;
                          var5++;
                          continue L26;
                        } else {
                          var5++;
                          continue L26;
                        }
                      }
                    }
                  } else {
                    break L25;
                  }
                }
                m.field_i = (el.field_c + cp.field_a << -1590907679) * ug.field_c.field_k;
                var4 = 0;
                var5 = -42 % ((-39 - param2) / 37);
                L28: while (true) {
                  if (wp.field_v.length <= var4) {
                    od.field_b = -(m.field_i >> -1934319263) + ar.field_C;
                    lg.field_b = new int[wp.field_v.length][];
                    var4 = 0;
                    var5 = od.field_b;
                    L29: while (true) {
                      if (wp.field_v.length <= var4) {
                        L30: {
                          if ((no.field_J ^ -1) != -3) {
                            ug.field_c.a(0, param1, ec.a(sm.field_d, 120, ko.field_b), 0);
                            break L30;
                          } else {
                            ug.field_c.a(-1, param1, -1, 0);
                            break L30;
                          }
                        }
                        break L0;
                      } else {
                        L31: {
                          var6 = ca.field_h[var4];
                          if ((var6 ^ -1) <= -1) {
                            var7 = lg.a(wp.field_v[var4], true, (byte) -89);
                            var8 = -(var7 >> 2029515649) + rk.field_B;
                            var5 = var5 + cp.field_a;
                            lg.field_b[var4] = new int[4];
                            lg.field_b[var4][0] = var8 - et.field_b;
                            lg.field_b[var4][1] = var5;
                            lg.field_b[var4][2] = var7 + (et.field_b << 253363105);
                            var5 = var5 + (q.field_B + (cp.field_a + (el.field_c << -1269442399)));
                            lg.field_b[var4][3] = q.field_B + (el.field_c << 1958105697);
                            break L31;
                          } else {
                            var5 = var5 + fh.field_e;
                            break L31;
                          }
                        }
                        var4++;
                        continue L29;
                      }
                    }
                  } else {
                    L32: {
                      stackIn_109_0 = m.field_i;

                      if (0 > ca.field_h[var4]) {
                        stackIn_110_0 = stackIn_109_0;
                        stackIn_110_1 = fh.field_e;
                        break L32;
                      } else {
                        stackIn_110_0 = stackIn_109_0;
                        stackIn_110_1 = q.field_B;
                        break L32;
                      }
                    }
                    m.field_i = stackIn_110_0 + stackIn_110_1;
                    var4++;
                    continue L28;
                  }
                }
              } else {
                L33: {
                  stackIn_89_0 = wp.field_v[var4];

                  if (-1 < (ca.field_h[var4] ^ -1)) {
                    stackIn_90_0 = (String) ((Object) stackIn_89_0);
                    stackIn_90_1 = 0;
                    break L33;
                  } else {
                    stackIn_90_0 = (String) ((Object) stackIn_89_0);
                    stackIn_90_1 = 1;
                    break L33;
                  }
                }
                var5 = lg.a(stackIn_90_0, stackIn_90_1 != 0, (byte) -101);
                if (var3_int < var5) {
                  var3_int = var5;
                  var4++;
                  continue L24;
                } else {
                  var4++;
                  continue L24;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "vq.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        field_e = null;
        field_g = null;
        field_a = null;
        if (param0 < 95) {
            field_c = (hd) null;
        }
        field_f = null;
    }

    final static boolean a(CharSequence param0, boolean param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1) {
              stackIn_4_0 = wt.a(param0, (byte) 65, false);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("vq.B(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final static boolean a(bv param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -2) {
                break L1;
              } else {
                field_b = (ru) null;
                break L1;
              }
            }
            L2: {
              if (-2 != (param0.g(-108, 1) ^ -1)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("vq.C(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    static {
        field_g = "Reject <%0> from this game";
        field_e = "Liquids to permanently affect your units and your enemy's.";
        field_f = "Back to Menu";
    }
}
