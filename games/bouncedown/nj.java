/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class nj extends al {
    static ph field_k;
    static rb field_l;
    static long field_n;
    static int field_p;
    static rd field_o;
    static int field_m;
    static String field_j;

    final String a(String param0, byte param1) {
        if (!(((nj) this).b(param0, (byte) 54) != a.field_e)) {
            return ke.field_l;
        }
        if (param1 != -114) {
            nj.a(false, -29, 82);
        }
        return ha.field_g;
    }

    final vf b(String param0, byte param1) {
        if (param1 != 54) {
            return null;
        }
        int var3 = null == hc.a(param0, 4011) ? 1 : 0;
        if (var3 == 0) {
            return a.field_e;
        }
        return mc.field_a;
    }

    public static void d(int param0) {
        field_l = null;
        field_k = null;
        if (param0 != 22382) {
            nj.d(83);
        }
        field_o = null;
        field_j = null;
    }

    nj(ba param0) {
        super(param0);
    }

    final static void a(boolean param0, int param1, int param2) {
        int var3 = 0;
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
        int stackIn_56_0 = 0;
        int stackIn_59_0 = 0;
        String[] stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        String[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        String[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        String stackIn_67_2 = null;
        String[] stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        String[] stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        String[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        String stackIn_73_2 = null;
        int stackIn_89_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        String[] stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        String[] stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        String stackOut_72_2 = null;
        String[] stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        String stackOut_71_2 = null;
        String[] stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        String[] stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        String stackOut_66_2 = null;
        String[] stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        String stackOut_65_2 = null;
        int stackOut_106_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_88_0 = 0;
        int stackOut_87_0 = 0;
        L0: {
          var9 = Bounce.field_N;
          ea.field_f = true;
          ne.field_u = param2;
          if (-1 != (ne.field_u ^ -1)) {
            if (1 == ne.field_u) {
              var3 = r.a(ba.field_E, ga.field_g, vg.field_g, 1, gk.field_a);
              var4 = var3 + 2;
              se.field_E = new String[var4];
              m.field_a = new int[var4];
              var5 = 0;
              L1: while (true) {
                if (var4 <= var5) {
                  ii.field_n = new int[1];
                  var5 = 0;
                  L2: while (true) {
                    if (var3 <= var5) {
                      se.field_E[var4 + -2] = "";
                      se.field_E[-1 + var4] = uk.field_b;
                      m.field_a[var4 - 1] = 0;
                      ii.field_n[0] = 5;
                      break L0;
                    } else {
                      se.field_E[var5] = ga.field_g[var5];
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  m.field_a[var5] = -1;
                  var5++;
                  continue L1;
                }
              }
            } else {
              if (2 == ne.field_u) {
                var3 = r.a(ba.field_E, ga.field_g, jf.a(al.field_g, new String[1], (byte) -126), 1, gk.field_a);
                var4 = -1;
                var5 = 0;
                L3: while (true) {
                  L4: {
                    if (var3 <= var5) {
                      break L4;
                    } else {
                      if (!"<%0>".equals((Object) (Object) ga.field_g[var5])) {
                        var5++;
                        continue L3;
                      } else {
                        var4 = var5;
                        break L4;
                      }
                    }
                  }
                  if (var4 == -1) {
                    throw new IllegalStateException();
                  } else {
                    eb.field_E = new String[var4];
                    cb.a((Object[]) (Object) ga.field_g, 0, (Object[]) (Object) eb.field_E, 0, var4);
                    ll.field_E = new String[var3 + -var4 - 1];
                    cb.a((Object[]) (Object) ga.field_g, var4 - -1, (Object[]) (Object) ll.field_E, 0, -var4 + (var3 + -1));
                    var4 = -1;
                    var3 = r.a(ba.field_E, ga.field_g, jf.a(se.field_B, new String[1], (byte) -126), param1 ^ -25697, gk.field_a);
                    var5 = 0;
                    L5: while (true) {
                      L6: {
                        if (var3 <= var5) {
                          break L6;
                        } else {
                          if (!"<%0>".equals((Object) (Object) ga.field_g[var5])) {
                            var5++;
                            continue L5;
                          } else {
                            var4 = var5;
                            break L6;
                          }
                        }
                      }
                      if (-1 != var4) {
                        L7: {
                          t.field_r = new String[var4];
                          cb.a((Object[]) (Object) ga.field_g, 0, (Object[]) (Object) t.field_r, 0, var4);
                          vb.field_k = new String[-1 + (var3 - var4)];
                          cb.a((Object[]) (Object) ga.field_g, var4 + 1, (Object[]) (Object) vb.field_k, 0, var3 + (-var4 - 1));
                          if (eb.field_E.length >= t.field_r.length) {
                            stackOut_55_0 = eb.field_E.length;
                            stackIn_56_0 = stackOut_55_0;
                            break L7;
                          } else {
                            stackOut_54_0 = t.field_r.length;
                            stackIn_56_0 = stackOut_54_0;
                            break L7;
                          }
                        }
                        L8: {
                          var5 = stackIn_56_0;
                          if (vb.field_k.length > ll.field_E.length) {
                            stackOut_58_0 = vb.field_k.length;
                            stackIn_59_0 = stackOut_58_0;
                            break L8;
                          } else {
                            stackOut_57_0 = ll.field_E.length;
                            stackIn_59_0 = stackOut_57_0;
                            break L8;
                          }
                        }
                        var6 = stackIn_59_0;
                        var7 = var6 + (7 - -var5);
                        se.field_E = new String[var7];
                        m.field_a = new int[var7];
                        var8 = 0;
                        L9: while (true) {
                          if (var7 <= var8) {
                            m.field_a[1] = 0;
                            se.field_E[0] = mg.field_l;
                            se.field_E[1] = eb.field_F;
                            ii.field_n = new int[2];
                            ii.field_n[0] = 5;
                            ii.field_n[1] = 2;
                            m.field_a[3] = 1;
                            se.field_E[4] = ma.field_u;
                            se.field_E[5] = "";
                            se.field_E[3] = ab.field_g;
                            se.field_E[2] = field_j;
                            var8 = 0;
                            L10: while (true) {
                              if (var8 >= var5) {
                                se.field_E[6 - -var5] = null;
                                m.field_a[var5 + 6] = -2;
                                var8 = 0;
                                L11: while (true) {
                                  if (var6 <= var8) {
                                    gd.field_a = fa.a(109);
                                    break L0;
                                  } else {
                                    L12: {
                                      stackOut_70_0 = se.field_E;
                                      stackOut_70_1 = var8 + (7 - -var5);
                                      stackIn_72_0 = stackOut_70_0;
                                      stackIn_72_1 = stackOut_70_1;
                                      stackIn_71_0 = stackOut_70_0;
                                      stackIn_71_1 = stackOut_70_1;
                                      if (var8 >= vb.field_k.length) {
                                        stackOut_72_0 = (String[]) (Object) stackIn_72_0;
                                        stackOut_72_1 = stackIn_72_1;
                                        stackOut_72_2 = "";
                                        stackIn_73_0 = stackOut_72_0;
                                        stackIn_73_1 = stackOut_72_1;
                                        stackIn_73_2 = stackOut_72_2;
                                        break L12;
                                      } else {
                                        stackOut_71_0 = (String[]) (Object) stackIn_71_0;
                                        stackOut_71_1 = stackIn_71_1;
                                        stackOut_71_2 = vb.field_k[var8];
                                        stackIn_73_0 = stackOut_71_0;
                                        stackIn_73_1 = stackOut_71_1;
                                        stackIn_73_2 = stackOut_71_2;
                                        break L12;
                                      }
                                    }
                                    stackIn_73_0[stackIn_73_1] = stackIn_73_2;
                                    var8++;
                                    continue L11;
                                  }
                                }
                              } else {
                                L13: {
                                  stackOut_64_0 = se.field_E;
                                  stackOut_64_1 = 6 - -var8;
                                  stackIn_66_0 = stackOut_64_0;
                                  stackIn_66_1 = stackOut_64_1;
                                  stackIn_65_0 = stackOut_64_0;
                                  stackIn_65_1 = stackOut_64_1;
                                  if ((-var5 + t.field_r.length + var8 ^ -1) > -1) {
                                    stackOut_66_0 = (String[]) (Object) stackIn_66_0;
                                    stackOut_66_1 = stackIn_66_1;
                                    stackOut_66_2 = "";
                                    stackIn_67_0 = stackOut_66_0;
                                    stackIn_67_1 = stackOut_66_1;
                                    stackIn_67_2 = stackOut_66_2;
                                    break L13;
                                  } else {
                                    stackOut_65_0 = (String[]) (Object) stackIn_65_0;
                                    stackOut_65_1 = stackIn_65_1;
                                    stackOut_65_2 = t.field_r[-var5 + var8 - -t.field_r.length];
                                    stackIn_67_0 = stackOut_65_0;
                                    stackIn_67_1 = stackOut_65_1;
                                    stackIn_67_2 = stackOut_65_2;
                                    break L13;
                                  }
                                }
                                stackIn_67_0[stackIn_67_1] = stackIn_67_2;
                                var8++;
                                continue L10;
                              }
                            }
                          } else {
                            m.field_a[var8] = -1;
                            var8++;
                            continue L9;
                          }
                        }
                      } else {
                        throw new IllegalStateException();
                      }
                    }
                  }
                }
              } else {
                if (ne.field_u != 3) {
                  if (-5 == (ne.field_u ^ -1)) {
                    var3 = r.a(ba.field_E, ga.field_g, of.field_a, 1, gk.field_a);
                    var4 = var3 + 2;
                    m.field_a = new int[var4];
                    se.field_E = new String[var4];
                    var5 = 0;
                    L14: while (true) {
                      if (var5 >= var4) {
                        ii.field_n = new int[1];
                        var5 = 0;
                        L15: while (true) {
                          if (var3 <= var5) {
                            se.field_E[var4 + -2] = "";
                            se.field_E[var4 + -1] = uk.field_b;
                            m.field_a[-1 + var4] = 0;
                            ii.field_n[0] = 5;
                            break L0;
                          } else {
                            se.field_E[var5] = ga.field_g[var5];
                            var5++;
                            continue L15;
                          }
                        }
                      } else {
                        m.field_a[var5] = -1;
                        var5++;
                        continue L14;
                      }
                    }
                  } else {
                    if (5 != ne.field_u) {
                      throw new IllegalArgumentException();
                    } else {
                      var3 = r.a(ba.field_E, ga.field_g, pe.field_g, param1 + 25699, gk.field_a);
                      var4 = 3 + var3;
                      se.field_E = new String[var4];
                      m.field_a = new int[var4];
                      var5 = 0;
                      L16: while (true) {
                        if (var5 >= var4) {
                          ii.field_n = new int[2];
                          var5 = 0;
                          L17: while (true) {
                            if (var5 >= var3) {
                              se.field_E[-3 + var4] = "";
                              se.field_E[var4 + -2] = wa.field_f;
                              m.field_a[-2 + var4] = 0;
                              ii.field_n[0] = 3;
                              se.field_E[-1 + var4] = uk.field_b;
                              m.field_a[var4 - 1] = 1;
                              ii.field_n[1] = 5;
                              break L0;
                            } else {
                              se.field_E[var5] = ga.field_g[var5];
                              var5++;
                              continue L17;
                            }
                          }
                        } else {
                          m.field_a[var5] = -1;
                          var5++;
                          continue L16;
                        }
                      }
                    }
                  }
                } else {
                  L18: {
                    if (ck.field_e.field_l) {
                      var3 = r.a(ba.field_E, ga.field_g, vg.field_f, param1 + 25699, gk.field_a);
                      break L18;
                    } else {
                      var3 = r.a(ba.field_E, ga.field_g, ra.field_f, param1 + 25699, gk.field_a);
                      break L18;
                    }
                  }
                  var4 = 2 - -var3;
                  se.field_E = new String[var4];
                  m.field_a = new int[var4];
                  var5 = 0;
                  L19: while (true) {
                    if (var5 >= var4) {
                      ii.field_n = new int[1];
                      var5 = 0;
                      L20: while (true) {
                        if (var3 <= var5) {
                          se.field_E[-2 + var4] = "";
                          se.field_E[-1 + var4] = uk.field_b;
                          m.field_a[var4 + -1] = 0;
                          ii.field_n[0] = 5;
                          break L0;
                        } else {
                          se.field_E[var5] = ga.field_g[var5];
                          var5++;
                          continue L20;
                        }
                      }
                    } else {
                      m.field_a[var5] = -1;
                      var5++;
                      continue L19;
                    }
                  }
                }
              }
            }
          } else {
            var3 = r.a(ba.field_E, ga.field_g, vg.field_g, 1, gk.field_a);
            var4 = 3 - -var3;
            se.field_E = new String[var4];
            m.field_a = new int[var4];
            var5 = 0;
            L21: while (true) {
              if (var4 <= var5) {
                ii.field_n = new int[2];
                var5 = 0;
                L22: while (true) {
                  if (var3 <= var5) {
                    se.field_E[var4 + -3] = "";
                    se.field_E[-2 + var4] = tb.field_o;
                    m.field_a[var4 + -2] = 0;
                    ii.field_n[0] = 4;
                    se.field_E[-1 + var4] = uk.field_b;
                    m.field_a[var4 - 1] = 1;
                    ii.field_n[1] = 5;
                    break L0;
                  } else {
                    se.field_E[var5] = ga.field_g[var5];
                    var5++;
                    continue L22;
                  }
                }
              } else {
                m.field_a[var5] = -1;
                var5++;
                continue L21;
              }
            }
          }
        }
        L23: {
          cf.field_f.field_f = ii.field_n.length;
          if (param1 == -25698) {
            break L23;
          } else {
            nj.d(-32);
            break L23;
          }
        }
        var3 = 0;
        var4 = 0;
        L24: while (true) {
          if (var4 >= se.field_E.length) {
            L25: {
              if (ne.field_u == 2) {
                var10 = eb.field_E;
                var5 = 0;
                L26: while (true) {
                  if (var10.length <= var5) {
                    var11 = ll.field_E;
                    var5 = 0;
                    L27: while (true) {
                      if (var5 >= var11.length) {
                        break L25;
                      } else {
                        var13 = var11[var5];
                        var7 = vh.a(false, var13, true);
                        if (var3 < var7) {
                          var3 = var7;
                          var5++;
                          continue L27;
                        } else {
                          var5++;
                          continue L27;
                        }
                      }
                    }
                  } else {
                    var12 = var10[var5];
                    var7 = vh.a(false, var12, true);
                    if (var3 < var7) {
                      var3 = var7;
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
            ef.field_a = (hj.field_a + cl.field_m << 2079012545) * cf.field_f.field_f;
            ui.field_p = var3 + bi.field_h - (var3 >> 469846241);
            bb.field_b = bi.field_h - (var3 >> 900701377);
            var4 = 0;
            L28: while (true) {
              if (var4 >= se.field_E.length) {
                jl.field_a = uf.field_a - (ef.field_a >> 1951849121);
                lf.field_r = new int[se.field_E.length][];
                var4 = 0;
                var5 = jl.field_a;
                L29: while (true) {
                  if (se.field_E.length <= var4) {
                    L30: {
                      if (ne.field_u != 2) {
                        cf.field_f.a(param0, -125, qe.a(uc.field_C, (byte) -101, ll.field_y), 0);
                        break L30;
                      } else {
                        cf.field_f.a(param0, 99, -1, -1);
                        break L30;
                      }
                    }
                    return;
                  } else {
                    var6 = m.field_a[var4];
                    if ((var6 ^ -1) <= -1) {
                      var7 = vh.a(true, se.field_E[var4], true);
                      var5 = var5 + hj.field_a;
                      var8 = -(var7 >> -506967263) + bi.field_h;
                      lf.field_r[var4] = new int[4];
                      lf.field_r[var4][0] = -kk.field_z + var8;
                      lf.field_r[var4][1] = var5;
                      lf.field_r[var4][2] = (kk.field_z << 438568193) + var7;
                      lf.field_r[var4][3] = pb.field_j + (cl.field_m << -354945087);
                      var5 = var5 + (pb.field_j + (hj.field_a + (cl.field_m << 1943345889)));
                      var4++;
                      continue L29;
                    } else {
                      var5 = var5 + k.field_D;
                      var4++;
                      continue L29;
                    }
                  }
                }
              } else {
                L31: {
                  stackOut_106_0 = ef.field_a;
                  stackIn_108_0 = stackOut_106_0;
                  stackIn_107_0 = stackOut_106_0;
                  if (m.field_a[var4] >= 0) {
                    stackOut_108_0 = stackIn_108_0;
                    stackOut_108_1 = pb.field_j;
                    stackIn_109_0 = stackOut_108_0;
                    stackIn_109_1 = stackOut_108_1;
                    break L31;
                  } else {
                    stackOut_107_0 = stackIn_107_0;
                    stackOut_107_1 = k.field_D;
                    stackIn_109_0 = stackOut_107_0;
                    stackIn_109_1 = stackOut_107_1;
                    break L31;
                  }
                }
                ef.field_a = stackIn_109_0 + stackIn_109_1;
                var4++;
                continue L28;
              }
            }
          } else {
            L32: {
              if ((m.field_a[var4] ^ -1) > -1) {
                stackOut_88_0 = 0;
                stackIn_89_0 = stackOut_88_0;
                break L32;
              } else {
                stackOut_87_0 = 1;
                stackIn_89_0 = stackOut_87_0;
                break L32;
              }
            }
            var5 = vh.a(stackIn_89_0 != 0, se.field_E[var4], true);
            if (var5 > var3) {
              var3 = var5;
              var4++;
              continue L24;
            } else {
              var4++;
              continue L24;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new ph("email");
        field_m = 64;
        field_o = new rd();
        field_j = "to keep fullscreen or";
    }
}
