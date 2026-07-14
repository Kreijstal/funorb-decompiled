/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class hh {
    static int field_e;
    static bd[] field_a;
    static bd field_b;
    static String field_c;
    static int field_d;

    final static void a(int param0, int param1, boolean param2) {
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
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        String[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        String[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        String[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        String stackIn_75_2 = null;
        String[] stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        String[] stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        String[] stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        String stackIn_81_2 = null;
        int stackIn_86_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_105_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        String[] stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        String[] stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        String stackOut_80_2 = null;
        String[] stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        String stackOut_79_2 = null;
        String[] stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        String[] stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        String stackOut_74_2 = null;
        String[] stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        String stackOut_73_2 = null;
        int stackOut_104_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        L0: {
          var9 = HostileSpawn.field_I ? 1 : 0;
          sf.field_U = true;
          be.field_e = param1;
          if (be.field_e != 0) {
            if (-2 != (be.field_e ^ -1)) {
              if (2 == be.field_e) {
                var3 = fa.a(gf.field_c, cg.field_a, 53, lj.field_u, vg.a(new String[1], param0 + 108, wa.field_l));
                var4 = -1;
                var5 = 0;
                L1: while (true) {
                  L2: {
                    if (var5 >= var3) {
                      break L2;
                    } else {
                      if ("<%0>".equals((Object) (Object) gf.field_c[var5])) {
                        var4 = var5;
                        break L2;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                  if ((var4 ^ -1) != 0) {
                    ka.field_o = new String[var4];
                    kf.a((Object[]) (Object) gf.field_c, 0, (Object[]) (Object) ka.field_o, 0, var4);
                    p.field_k = new String[-1 + -var4 + var3];
                    kf.a((Object[]) (Object) gf.field_c, 1 + var4, (Object[]) (Object) p.field_k, 0, -var4 + (var3 + -1));
                    var3 = fa.a(gf.field_c, cg.field_a, param0 ^ 102, lj.field_u, vg.a(new String[1], param0 ^ 70, jc.field_d));
                    var4 = -1;
                    var5 = 0;
                    L3: while (true) {
                      L4: {
                        if (var3 <= var5) {
                          break L4;
                        } else {
                          if ("<%0>".equals((Object) (Object) gf.field_c[var5])) {
                            var4 = var5;
                            break L4;
                          } else {
                            var5++;
                            continue L3;
                          }
                        }
                      }
                      if (0 != (var4 ^ -1)) {
                        L5: {
                          gg.field_D = new String[var4];
                          kf.a((Object[]) (Object) gf.field_c, 0, (Object[]) (Object) gg.field_D, 0, var4);
                          uh.field_j = new String[var3 + -var4 - 1];
                          kf.a((Object[]) (Object) gf.field_c, 1 + var4, (Object[]) (Object) uh.field_j, 0, -var4 + var3 + -1);
                          if (ka.field_o.length >= gg.field_D.length) {
                            stackOut_63_0 = ka.field_o.length;
                            stackIn_64_0 = stackOut_63_0;
                            break L5;
                          } else {
                            stackOut_62_0 = gg.field_D.length;
                            stackIn_64_0 = stackOut_62_0;
                            break L5;
                          }
                        }
                        L6: {
                          var5 = stackIn_64_0;
                          if (p.field_k.length < uh.field_j.length) {
                            stackOut_66_0 = uh.field_j.length;
                            stackIn_67_0 = stackOut_66_0;
                            break L6;
                          } else {
                            stackOut_65_0 = p.field_k.length;
                            stackIn_67_0 = stackOut_65_0;
                            break L6;
                          }
                        }
                        var6 = stackIn_67_0;
                        var7 = var6 + (var5 + 7);
                        jf.field_b = new int[var7];
                        hf.field_d = new String[var7];
                        var8 = 0;
                        L7: while (true) {
                          if (var8 >= var7) {
                            hf.field_d[1] = al.field_X;
                            jf.field_b[1] = 0;
                            ue.field_k = new int[2];
                            hf.field_d[0] = sg.field_e;
                            hf.field_d[2] = ve.field_d;
                            ue.field_k[0] = 5;
                            ue.field_k[1] = 2;
                            hf.field_d[4] = an.field_f;
                            jf.field_b[3] = 1;
                            hf.field_d[5] = "";
                            hf.field_d[3] = sc.field_i;
                            var8 = 0;
                            L8: while (true) {
                              if (var5 <= var8) {
                                hf.field_d[6 + var5] = null;
                                jf.field_b[6 - -var5] = -2;
                                var8 = 0;
                                L9: while (true) {
                                  if (var8 >= var6) {
                                    fj.field_Rb = hn.a((byte) 80);
                                    break L0;
                                  } else {
                                    L10: {
                                      stackOut_78_0 = hf.field_d;
                                      stackOut_78_1 = var8 + 7 - -var5;
                                      stackIn_80_0 = stackOut_78_0;
                                      stackIn_80_1 = stackOut_78_1;
                                      stackIn_79_0 = stackOut_78_0;
                                      stackIn_79_1 = stackOut_78_1;
                                      if (uh.field_j.length <= var8) {
                                        stackOut_80_0 = (String[]) (Object) stackIn_80_0;
                                        stackOut_80_1 = stackIn_80_1;
                                        stackOut_80_2 = "";
                                        stackIn_81_0 = stackOut_80_0;
                                        stackIn_81_1 = stackOut_80_1;
                                        stackIn_81_2 = stackOut_80_2;
                                        break L10;
                                      } else {
                                        stackOut_79_0 = (String[]) (Object) stackIn_79_0;
                                        stackOut_79_1 = stackIn_79_1;
                                        stackOut_79_2 = uh.field_j[var8];
                                        stackIn_81_0 = stackOut_79_0;
                                        stackIn_81_1 = stackOut_79_1;
                                        stackIn_81_2 = stackOut_79_2;
                                        break L10;
                                      }
                                    }
                                    stackIn_81_0[stackIn_81_1] = stackIn_81_2;
                                    var8++;
                                    continue L9;
                                  }
                                }
                              } else {
                                L11: {
                                  stackOut_72_0 = hf.field_d;
                                  stackOut_72_1 = 6 + var8;
                                  stackIn_74_0 = stackOut_72_0;
                                  stackIn_74_1 = stackOut_72_1;
                                  stackIn_73_0 = stackOut_72_0;
                                  stackIn_73_1 = stackOut_72_1;
                                  if (gg.field_D.length + (var8 + -var5) < 0) {
                                    stackOut_74_0 = (String[]) (Object) stackIn_74_0;
                                    stackOut_74_1 = stackIn_74_1;
                                    stackOut_74_2 = "";
                                    stackIn_75_0 = stackOut_74_0;
                                    stackIn_75_1 = stackOut_74_1;
                                    stackIn_75_2 = stackOut_74_2;
                                    break L11;
                                  } else {
                                    stackOut_73_0 = (String[]) (Object) stackIn_73_0;
                                    stackOut_73_1 = stackIn_73_1;
                                    stackOut_73_2 = gg.field_D[gg.field_D.length + (var8 - var5)];
                                    stackIn_75_0 = stackOut_73_0;
                                    stackIn_75_1 = stackOut_73_1;
                                    stackIn_75_2 = stackOut_73_2;
                                    break L11;
                                  }
                                }
                                stackIn_75_0[stackIn_75_1] = stackIn_75_2;
                                var8++;
                                continue L8;
                              }
                            }
                          } else {
                            jf.field_b[var8] = -1;
                            var8++;
                            continue L7;
                          }
                        }
                      } else {
                        throw new IllegalStateException();
                      }
                    }
                  } else {
                    throw new IllegalStateException();
                  }
                }
              } else {
                if (be.field_e == 3) {
                  L12: {
                    if (gf.field_b.field_k) {
                      var3 = fa.a(gf.field_c, cg.field_a, 98, lj.field_u, kc.field_e);
                      break L12;
                    } else {
                      var3 = fa.a(gf.field_c, cg.field_a, 50, lj.field_u, he.field_z);
                      break L12;
                    }
                  }
                  var4 = var3 + 2;
                  hf.field_d = new String[var4];
                  jf.field_b = new int[var4];
                  var5 = 0;
                  L13: while (true) {
                    if (var5 >= var4) {
                      ue.field_k = new int[1];
                      var5 = 0;
                      L14: while (true) {
                        if (var5 >= var3) {
                          hf.field_d[-2 + var4] = "";
                          hf.field_d[var4 + -1] = gi.field_n;
                          jf.field_b[-1 + var4] = 0;
                          ue.field_k[0] = 5;
                          break L0;
                        } else {
                          hf.field_d[var5] = gf.field_c[var5];
                          var5++;
                          continue L14;
                        }
                      }
                    } else {
                      jf.field_b[var5] = -1;
                      var5++;
                      continue L13;
                    }
                  }
                } else {
                  if (4 == be.field_e) {
                    var3 = fa.a(gf.field_c, cg.field_a, param0 ^ 119, lj.field_u, ha.field_y);
                    var4 = 2 + var3;
                    jf.field_b = new int[var4];
                    hf.field_d = new String[var4];
                    var5 = 0;
                    L15: while (true) {
                      if (var5 >= var4) {
                        ue.field_k = new int[1];
                        var5 = 0;
                        L16: while (true) {
                          if (var3 <= var5) {
                            hf.field_d[var4 - 2] = "";
                            hf.field_d[var4 - 1] = gi.field_n;
                            jf.field_b[-1 + var4] = 0;
                            ue.field_k[0] = 5;
                            break L0;
                          } else {
                            hf.field_d[var5] = gf.field_c[var5];
                            var5++;
                            continue L16;
                          }
                        }
                      } else {
                        jf.field_b[var5] = -1;
                        var5++;
                        continue L15;
                      }
                    }
                  } else {
                    if (5 == be.field_e) {
                      var3 = fa.a(gf.field_c, cg.field_a, 62, lj.field_u, ph.field_y);
                      var4 = 3 - -var3;
                      hf.field_d = new String[var4];
                      jf.field_b = new int[var4];
                      var5 = 0;
                      L17: while (true) {
                        if (var5 >= var4) {
                          ue.field_k = new int[2];
                          var5 = 0;
                          L18: while (true) {
                            if (var3 <= var5) {
                              hf.field_d[var4 + -3] = "";
                              hf.field_d[var4 + -2] = field_c;
                              jf.field_b[-2 + var4] = 0;
                              ue.field_k[0] = 3;
                              hf.field_d[-1 + var4] = gi.field_n;
                              jf.field_b[var4 - 1] = 1;
                              ue.field_k[1] = 5;
                              break L0;
                            } else {
                              hf.field_d[var5] = gf.field_c[var5];
                              var5++;
                              continue L18;
                            }
                          }
                        } else {
                          jf.field_b[var5] = -1;
                          var5++;
                          continue L17;
                        }
                      }
                    } else {
                      throw new IllegalArgumentException();
                    }
                  }
                }
              }
            } else {
              var3 = fa.a(gf.field_c, cg.field_a, 105, lj.field_u, ne.field_p);
              var4 = var3 + 2;
              hf.field_d = new String[var4];
              jf.field_b = new int[var4];
              var5 = 0;
              L19: while (true) {
                if (var4 <= var5) {
                  ue.field_k = new int[1];
                  var5 = 0;
                  L20: while (true) {
                    if (var5 >= var3) {
                      hf.field_d[-2 + var4] = "";
                      hf.field_d[var4 - 1] = gi.field_n;
                      jf.field_b[-1 + var4] = 0;
                      ue.field_k[0] = 5;
                      break L0;
                    } else {
                      hf.field_d[var5] = gf.field_c[var5];
                      var5++;
                      continue L20;
                    }
                  }
                } else {
                  jf.field_b[var5] = -1;
                  var5++;
                  continue L19;
                }
              }
            }
          } else {
            var3 = fa.a(gf.field_c, cg.field_a, 113, lj.field_u, ne.field_p);
            var4 = var3 + 3;
            jf.field_b = new int[var4];
            hf.field_d = new String[var4];
            var5 = 0;
            L21: while (true) {
              if (var5 >= var4) {
                ue.field_k = new int[2];
                var5 = 0;
                L22: while (true) {
                  if (var3 <= var5) {
                    hf.field_d[-3 + var4] = "";
                    hf.field_d[var4 + -2] = lh.field_c;
                    jf.field_b[var4 - 2] = 0;
                    ue.field_k[0] = 4;
                    hf.field_d[var4 - 1] = gi.field_n;
                    jf.field_b[var4 + -1] = 1;
                    ue.field_k[1] = 5;
                    break L0;
                  } else {
                    hf.field_d[var5] = gf.field_c[var5];
                    var5++;
                    continue L22;
                  }
                }
              } else {
                jf.field_b[var5] = -1;
                var5++;
                continue L21;
              }
            }
          }
        }
        mc.field_F.field_b = ue.field_k.length;
        var3 = 0;
        var4 = 0;
        L23: while (true) {
          if (var4 >= hf.field_d.length) {
            L24: {
              if (-3 != (be.field_e ^ -1)) {
                break L24;
              } else {
                var10 = ka.field_o;
                var5 = 0;
                L25: while (true) {
                  if (var5 >= var10.length) {
                    var11 = p.field_k;
                    var5 = 0;
                    L26: while (true) {
                      if (var11.length <= var5) {
                        break L24;
                      } else {
                        var13 = var11[var5];
                        var7 = wb.a(115, false, var13);
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
                    var12 = var10[var5];
                    var7 = wb.a(86, false, var12);
                    if (var3 < var7) {
                      var3 = var7;
                      var5++;
                      continue L25;
                    } else {
                      var5++;
                      continue L25;
                    }
                  }
                }
              }
            }
            pc.field_d = -(var3 >> 2119517185) + (wk.field_c - -var3);
            hg.field_f = -(var3 >> 1891470049) + wk.field_c;
            wc.field_m = (ab.field_b - -cl.field_l << -1675940927) * mc.field_F.field_b;
            var4 = 0;
            L27: while (true) {
              if (var4 >= hf.field_d.length) {
                L28: {
                  if (param0 == 5) {
                    break L28;
                  } else {
                    hh.a(36);
                    break L28;
                  }
                }
                s.field_g = -(wc.field_m >> -176299615) + qg.field_l;
                q.field_e = new int[hf.field_d.length][];
                var4 = 0;
                var5 = s.field_g;
                L29: while (true) {
                  if (var4 >= hf.field_d.length) {
                    L30: {
                      if (2 == be.field_e) {
                        mc.field_F.a(param2, 0, -1, -1);
                        break L30;
                      } else {
                        mc.field_F.a(param2, 0, sd.a(2, j.field_c, rb.field_m), 0);
                        break L30;
                      }
                    }
                    return;
                  } else {
                    var6 = jf.field_b[var4];
                    if (0 > var6) {
                      var5 = var5 + kb.field_d;
                      var4++;
                      continue L29;
                    } else {
                      var7 = wb.a(103, true, hf.field_d[var4]);
                      var5 = var5 + cl.field_l;
                      var8 = -(var7 >> -1817928287) + wk.field_c;
                      q.field_e[var4] = new int[4];
                      q.field_e[var4][0] = -jd.field_l + var8;
                      q.field_e[var4][1] = var5;
                      q.field_e[var4][2] = (jd.field_l << 33875201) + var7;
                      var5 = var5 + (eh.field_d + (cl.field_l + (ab.field_b << -1455983519)));
                      q.field_e[var4][3] = (ab.field_b << -355479423) + eh.field_d;
                      var4++;
                      continue L29;
                    }
                  }
                }
              } else {
                L31: {
                  stackOut_104_0 = wc.field_m;
                  stackIn_106_0 = stackOut_104_0;
                  stackIn_105_0 = stackOut_104_0;
                  if ((jf.field_b[var4] ^ -1) > -1) {
                    stackOut_106_0 = stackIn_106_0;
                    stackOut_106_1 = kb.field_d;
                    stackIn_107_0 = stackOut_106_0;
                    stackIn_107_1 = stackOut_106_1;
                    break L31;
                  } else {
                    stackOut_105_0 = stackIn_105_0;
                    stackOut_105_1 = eh.field_d;
                    stackIn_107_0 = stackOut_105_0;
                    stackIn_107_1 = stackOut_105_1;
                    break L31;
                  }
                }
                wc.field_m = stackIn_107_0 + stackIn_107_1;
                var4++;
                continue L27;
              }
            }
          } else {
            L32: {
              stackOut_85_0 = 110;
              stackIn_87_0 = stackOut_85_0;
              stackIn_86_0 = stackOut_85_0;
              if ((jf.field_b[var4] ^ -1) > -1) {
                stackOut_87_0 = stackIn_87_0;
                stackOut_87_1 = 0;
                stackIn_88_0 = stackOut_87_0;
                stackIn_88_1 = stackOut_87_1;
                break L32;
              } else {
                stackOut_86_0 = stackIn_86_0;
                stackOut_86_1 = 1;
                stackIn_88_0 = stackOut_86_0;
                stackIn_88_1 = stackOut_86_1;
                break L32;
              }
            }
            var5 = wb.a(stackIn_88_0, stackIn_88_1 != 0, hf.field_d[var4]);
            if (var3 < var5) {
              var3 = var5;
              var4++;
              continue L23;
            } else {
              var4++;
              continue L23;
            }
          }
        }
    }

    final static void a(int param0, int param1, fd param2, int param3, String param4, int param5, int param6, int param7, int param8) {
        hn.field_a = param6;
        jj.field_k = param2;
        fk.field_a = param4;
        if (param8 != -1) {
            hh.a(114);
        }
        mb.field_p = param1;
        ab.field_c = param7;
        nj.field_a = param0;
        ik.field_a = param3;
        mm.field_s = param5;
        ig.field_N = (ej) (Object) new ih();
        vc.field_c = new dh(param2);
        sj.field_a = new sg(ig.field_N, vc.field_c);
    }

    final static void a(boolean param0, p param1, int[] param2) {
        double var3 = 0.0;
        double var5 = 0.0;
        int var7 = 0;
        int var8_int = 0;
        double var8 = 0.0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        oj var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_29_0 = 0;
        p stackIn_105_0 = null;
        p stackIn_106_0 = null;
        p stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        p stackOut_104_0 = null;
        p stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        p stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        L0: {
          var14 = HostileSpawn.field_I ? 1 : 0;
          var3 = param1.field_c;
          var5 = 0.0;
          if (-91 >= (param1.field_e ^ -1)) {
            break L0;
          } else {
            var5 = (double)(90 - param1.field_e) / 150.0;
            break L0;
          }
        }
        L1: {
          if (!param0) {
            break L1;
          } else {
            field_d = -42;
            break L1;
          }
        }
        var7 = mm.field_m[0].field_j.b(-4);
        var8_int = 0;
        L2: while (true) {
          L3: {
            if (var8_int >= 10) {
              break L3;
            } else {
              L4: {
                param1.field_l.b(var5, param1.field_c, 127);
                param1.a(8573);
                var9 = param1.field_j.b(-4);
                if (var7 == var9) {
                  break L4;
                } else {
                  L5: {
                    if (2 == param2[var9]) {
                      break L5;
                    } else {
                      if (param2[var9] == 4) {
                        break L5;
                      } else {
                        if ((param2[var9] ^ -1) != -4) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  L6: {
                    L7: {
                      L8: {
                        param1.field_l.b(-var5, param1.field_c, 114);
                        param1.a(8573);
                        var10 = 0;
                        var11_int = 0;
                        if (64.0 > param1.field_c) {
                          break L8;
                        } else {
                          if (param1.field_c <= 192.0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var10 = ln.field_a.field_d + var9;
                      if (0 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                    var10 = var9 + -ln.field_a.field_d;
                    break L6;
                  }
                  L9: {
                    L10: {
                      if (param1.field_c >= 128.0) {
                        break L10;
                      } else {
                        var11_int = var9 + 1;
                        if (0 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    var11_int = -1 + var9;
                    break L9;
                  }
                  L11: {
                    L12: {
                      var10 = param2[var10];
                      var11_int = param2[var11_int];
                      if (param1.field_c <= 32.0) {
                        break L12;
                      } else {
                        if (96.0 <= param1.field_c) {
                          break L12;
                        } else {
                          stackOut_21_0 = 1;
                          stackIn_29_0 = stackOut_21_0;
                          break L11;
                        }
                      }
                    }
                    if (160.0 < param1.field_c) {
                      if (param1.field_c < 224.0) {
                        stackOut_27_0 = 1;
                        stackIn_29_0 = stackOut_27_0;
                        break L11;
                      } else {
                        stackOut_26_0 = 0;
                        stackIn_29_0 = stackOut_26_0;
                        break L11;
                      }
                    } else {
                      stackOut_24_0 = 0;
                      stackIn_29_0 = stackOut_24_0;
                      break L11;
                    }
                  }
                  L13: {
                    var12 = stackIn_29_0;
                    if (var12 == 0) {
                      break L13;
                    } else {
                      if (var11_int == 2) {
                        break L13;
                      } else {
                        if (4 == var11_int) {
                          break L13;
                        } else {
                          if (var11_int == 3) {
                            break L13;
                          } else {
                            param1.field_c = -param1.field_c + 256.0;
                            if (0 == 0) {
                              break L4;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (2 == var10) {
                    if (var12 != 0) {
                      break L4;
                    } else {
                      if (var11_int == 2) {
                        break L4;
                      } else {
                        if (var11_int == 4) {
                          break L4;
                        } else {
                          if (var11_int == 3) {
                            break L4;
                          } else {
                            param1.field_c = -param1.field_c + 256.0;
                            break L4;
                          }
                        }
                      }
                    }
                  } else {
                    if (var12 != 0) {
                      break L4;
                    } else {
                      if (var11_int == 2) {
                        break L4;
                      } else {
                        if (var11_int == 4) {
                          break L4;
                        } else {
                          if (var11_int == 3) {
                            break L4;
                          } else {
                            param1.field_c = -param1.field_c + 256.0;
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L14: {
                if (param1.field_e < 90) {
                  var10 = 0;
                  L15: while (true) {
                    if (el.field_j <= var10) {
                      break L14;
                    } else {
                      L16: {
                        L17: {
                          var11 = mm.field_m[var10];
                          var12 = 0;
                          if (var11 == null) {
                            break L17;
                          } else {
                            if (!var11.field_b) {
                              break L17;
                            } else {
                              L18: {
                                L19: {
                                  var13 = var11.field_j.b(-4);
                                  if (var9 == var13) {
                                    break L19;
                                  } else {
                                    if (var13 - 1 == var9) {
                                      break L19;
                                    } else {
                                      if (var9 == -ln.field_a.field_d + var13) {
                                        break L19;
                                      } else {
                                        if (var9 == var13 - 1 + -ln.field_a.field_d) {
                                          break L19;
                                        } else {
                                          L20: {
                                            if ((var11.field_i ^ -1) == -9) {
                                              break L20;
                                            } else {
                                              if (27 != var11.field_i) {
                                                break L18;
                                              } else {
                                                break L20;
                                              }
                                            }
                                          }
                                          L21: {
                                            if (var9 == -2 + (var13 + -ln.field_a.field_d)) {
                                              break L21;
                                            } else {
                                              if (var9 == var13 + -(2 * ln.field_a.field_d) - 1) {
                                                break L21;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                          var12 = 1;
                                          if (0 == 0) {
                                            break L18;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var12 = 1;
                                break L18;
                              }
                              if (0 == 0) {
                                break L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                        L22: {
                          L23: {
                            if (var11 == null) {
                              break L23;
                            } else {
                              if (!od.a(var11.field_i, 1)) {
                                break L23;
                              } else {
                                if (0 != var11.field_h) {
                                  break L22;
                                } else {
                                  break L23;
                                }
                              }
                            }
                          }
                          if (20 != var11.field_i) {
                            break L16;
                          } else {
                            L24: {
                              L25: {
                                var13 = var11.field_j.b(-4);
                                if (var9 == var13) {
                                  break L25;
                                } else {
                                  if (-ln.field_a.field_d + var13 == var9) {
                                    break L25;
                                  } else {
                                    if (var9 == ln.field_a.field_d + var13) {
                                      break L25;
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                              }
                              var12 = 1;
                              break L24;
                            }
                            if (0 == 0) {
                              break L16;
                            } else {
                              break L22;
                            }
                          }
                        }
                        L26: {
                          var13 = var11.field_j.b(-4);
                          if (var13 == var9) {
                            break L26;
                          } else {
                            L27: {
                              if (rh.a(var11.field_i, true)) {
                                break L27;
                              } else {
                                if (var13 - -1 == var9) {
                                  var12 = 1;
                                  if (0 == 0) {
                                    break L16;
                                  } else {
                                    break L27;
                                  }
                                } else {
                                  break L16;
                                }
                              }
                            }
                            if (var9 != -ln.field_a.field_d + var13) {
                              break L16;
                            } else {
                              var12 = 1;
                              if (0 == 0) {
                                break L16;
                              } else {
                                break L26;
                              }
                            }
                          }
                        }
                        var12 = 1;
                        break L16;
                      }
                      L28: {
                        if (var12 != 0) {
                          param1.field_e = 90;
                          if (0 == 0) {
                            break L14;
                          } else {
                            break L28;
                          }
                        } else {
                          break L28;
                        }
                      }
                      var10++;
                      if (0 == 0) {
                        continue L15;
                      } else {
                        break L14;
                      }
                    }
                  }
                } else {
                  break L14;
                }
              }
              var8_int++;
              if (0 == 0) {
                continue L2;
              } else {
                break L3;
              }
            }
          }
          L29: {
            L30: {
              if (256.0 > param1.field_c) {
                break L30;
              } else {
                param1.field_c = param1.field_c - 256.0;
                if (0 == 0) {
                  break L29;
                } else {
                  break L30;
                }
              }
            }
            if (param1.field_c >= 0.0) {
              break L29;
            } else {
              param1.field_c = param1.field_c + 256.0;
              break L29;
            }
          }
          L31: {
            L32: {
              var8 = param1.field_c - var3;
              if (0.0 <= var8) {
                break L32;
              } else {
                var8 = var8 + 256.0;
                if (0 == 0) {
                  break L31;
                } else {
                  break L32;
                }
              }
            }
            if (256.0 <= var8) {
              var8 = var8 - 256.0;
              break L31;
            } else {
              break L31;
            }
          }
          L33: {
            param1.field_e = param1.field_e + 1;
            if (var8 <= 64.0) {
              break L33;
            } else {
              if (var8 < 192.0) {
                L34: {
                  stackOut_104_0 = (p) param1;
                  stackIn_106_0 = stackOut_104_0;
                  stackIn_105_0 = stackOut_104_0;
                  if (param1.field_f) {
                    stackOut_106_0 = (p) (Object) stackIn_106_0;
                    stackOut_106_1 = 0;
                    stackIn_107_0 = stackOut_106_0;
                    stackIn_107_1 = stackOut_106_1;
                    break L34;
                  } else {
                    stackOut_105_0 = (p) (Object) stackIn_105_0;
                    stackOut_105_1 = 1;
                    stackIn_107_0 = stackOut_105_0;
                    stackIn_107_1 = stackOut_105_1;
                    break L34;
                  }
                }
                stackIn_107_0.field_f = stackIn_107_1 != 0;
                break L33;
              } else {
                break L33;
              }
            }
          }
          L35: {
            if ((param1.field_e ^ -1) < -101) {
              L36: {
                hg.a((byte) 64, param1);
                if (param1.field_i == 27) {
                  u.a(30, param1.field_j, true, 48, param1.field_l, 28);
                  break L36;
                } else {
                  break L36;
                }
              }
              jn.field_F[ib.field_c].field_c = (double)(int)(Math.random() * 256.0);
              jn.field_F[ib.field_c].field_j.a((byte) 46, param1.field_j);
              jn.field_F[ib.field_c].field_l.a(param1.field_l, -28860);
              jn.field_F[ib.field_c].field_e = 0;
              jn.field_F[ib.field_c].field_h = 1;
              jn.field_F[ib.field_c].field_i = 12;
              ib.field_c = ib.field_c + 1;
              u.a(-1, param1.field_j, true, 32, param1.field_l, 35);
              param1.field_i = -1;
              if (uj.field_l != 1) {
                break L35;
              } else {
                if (ej.d((byte) 116)) {
                  eh.field_c.a(em.field_a[0], 50, uh.field_i);
                  break L35;
                } else {
                  break L35;
                }
              }
            } else {
              break L35;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            field_a = null;
        }
        field_c = null;
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new bd[4];
        field_c = "Try again";
    }
}
