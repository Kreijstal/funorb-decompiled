/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static vn field_g;
    static boolean field_a;
    static String field_d;
    static String field_f;
    static v[] field_e;
    static vn[] field_c;
    static int field_b;

    final static void a(int param0, int param1, boolean param2) {
        RuntimeException var3 = null;
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
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        String[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        String[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String stackIn_68_2 = null;
        String[] stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        String[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        String[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        String stackIn_74_2 = null;
        String stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        String stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        String stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        int stackIn_88_2 = 0;
        int stackIn_111_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_113_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        String[] stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        String[] stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        String stackOut_73_2 = null;
        String[] stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        String stackOut_72_2 = null;
        String[] stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        String[] stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        String stackOut_67_2 = null;
        String[] stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        String stackOut_66_2 = null;
        int stackOut_110_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_112_1 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        String stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        String stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        int stackOut_87_2 = 0;
        String stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        int stackOut_86_2 = 0;
        var9 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              pg.field_p = param0;
              ic.field_U = true;
              if (-1 == (pg.field_p ^ -1)) {
                var3_int = ja.a((byte) 16, jc.field_p, mf.field_a, di.field_O, ZombieDawn.field_K);
                var4 = 3 + var3_int;
                cj.field_h = new String[var4];
                hd.field_s = new int[var4];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var4) {
                    qk.field_Kb = new int[2];
                    var5 = 0;
                    L3: while (true) {
                      if (var3_int <= var5) {
                        cj.field_h[-3 + var4] = "";
                        cj.field_h[var4 - 2] = wd.field_w;
                        hd.field_s[var4 + -2] = 0;
                        qk.field_Kb[0] = 4;
                        cj.field_h[-1 + var4] = re.field_c;
                        hd.field_s[var4 - 1] = 1;
                        qk.field_Kb[1] = 5;
                        break L1;
                      } else {
                        cj.field_h[var5] = jc.field_p[var5];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    hd.field_s[var5] = -1;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if (pg.field_p != 1) {
                  if (-3 == (pg.field_p ^ -1)) {
                    var3_int = ja.a((byte) 16, jc.field_p, s.a(1938762664, pm.field_e, new String[]{"<br><%0><br>"}), di.field_O, ZombieDawn.field_K);
                    var4 = -1;
                    var5 = 0;
                    L4: while (true) {
                      L5: {
                        if (var5 >= var3_int) {
                          break L5;
                        } else {
                          if (!"<%0>".equals(jc.field_p[var5])) {
                            var5++;
                            continue L4;
                          } else {
                            var4 = var5;
                            break L5;
                          }
                        }
                      }
                      if (var4 != -1) {
                        pn.field_R = new String[var4];
                        gp.a(jc.field_p, 0, pn.field_R, 0, var4);
                        hl.field_b = new String[-1 + -var4 + var3_int];
                        gp.a(jc.field_p, 1 + var4, hl.field_b, 0, var3_int + -var4 - 1);
                        var4 = -1;
                        var3_int = ja.a((byte) 16, jc.field_p, s.a(1938762664, ma.field_q, new String[]{"<br><%0><br>"}), di.field_O, ZombieDawn.field_K);
                        var5 = 0;
                        L6: while (true) {
                          L7: {
                            if (var3_int <= var5) {
                              break L7;
                            } else {
                              if (!"<%0>".equals(jc.field_p[var5])) {
                                var5++;
                                continue L6;
                              } else {
                                var4 = var5;
                                break L7;
                              }
                            }
                          }
                          if (var4 == -1) {
                            throw new IllegalStateException();
                          } else {
                            L8: {
                              dl.field_h = new String[var4];
                              gp.a(jc.field_p, 0, dl.field_h, 0, var4);
                              bp.field_a = new String[-1 + -var4 + var3_int];
                              gp.a(jc.field_p, var4 - -1, bp.field_a, 0, var3_int - (var4 + 1));
                              if (dl.field_h.length <= pn.field_R.length) {
                                stackOut_56_0 = pn.field_R.length;
                                stackIn_57_0 = stackOut_56_0;
                                break L8;
                              } else {
                                stackOut_55_0 = dl.field_h.length;
                                stackIn_57_0 = stackOut_55_0;
                                break L8;
                              }
                            }
                            L9: {
                              var5 = stackIn_57_0;
                              if (hl.field_b.length < bp.field_a.length) {
                                stackOut_59_0 = bp.field_a.length;
                                stackIn_60_0 = stackOut_59_0;
                                break L9;
                              } else {
                                stackOut_58_0 = hl.field_b.length;
                                stackIn_60_0 = stackOut_58_0;
                                break L9;
                              }
                            }
                            var6 = stackIn_60_0;
                            var7 = var6 + var5 + 7;
                            hd.field_s = new int[var7];
                            cj.field_h = new String[var7];
                            var8 = 0;
                            L10: while (true) {
                              if (var8 >= var7) {
                                hd.field_s[1] = 0;
                                cj.field_h[1] = ap.field_s;
                                qk.field_Kb = new int[2];
                                cj.field_h[0] = bj.field_p;
                                cj.field_h[2] = oo.field_S;
                                qk.field_Kb[1] = 2;
                                qk.field_Kb[0] = 5;
                                cj.field_h[3] = ki.field_bb;
                                cj.field_h[4] = ub.field_j;
                                hd.field_s[3] = 1;
                                cj.field_h[5] = "";
                                var8 = 0;
                                L11: while (true) {
                                  if (var5 <= var8) {
                                    cj.field_h[var5 + 6] = null;
                                    hd.field_s[6 - -var5] = -2;
                                    var8 = 0;
                                    L12: while (true) {
                                      if (var6 <= var8) {
                                        ge.field_f = pd.a(-22826);
                                        break L1;
                                      } else {
                                        L13: {
                                          stackOut_71_0 = cj.field_h;
                                          stackOut_71_1 = var8 + (var5 + 7);
                                          stackIn_73_0 = stackOut_71_0;
                                          stackIn_73_1 = stackOut_71_1;
                                          stackIn_72_0 = stackOut_71_0;
                                          stackIn_72_1 = stackOut_71_1;
                                          if (var8 < bp.field_a.length) {
                                            stackOut_73_0 = (String[]) ((Object) stackIn_73_0);
                                            stackOut_73_1 = stackIn_73_1;
                                            stackOut_73_2 = bp.field_a[var8];
                                            stackIn_74_0 = stackOut_73_0;
                                            stackIn_74_1 = stackOut_73_1;
                                            stackIn_74_2 = stackOut_73_2;
                                            break L13;
                                          } else {
                                            stackOut_72_0 = (String[]) ((Object) stackIn_72_0);
                                            stackOut_72_1 = stackIn_72_1;
                                            stackOut_72_2 = "";
                                            stackIn_74_0 = stackOut_72_0;
                                            stackIn_74_1 = stackOut_72_1;
                                            stackIn_74_2 = stackOut_72_2;
                                            break L13;
                                          }
                                        }
                                        stackIn_74_0[stackIn_74_1] = stackIn_74_2;
                                        var8++;
                                        continue L12;
                                      }
                                    }
                                  } else {
                                    L14: {
                                      stackOut_65_0 = cj.field_h;
                                      stackOut_65_1 = 6 + var8;
                                      stackIn_67_0 = stackOut_65_0;
                                      stackIn_67_1 = stackOut_65_1;
                                      stackIn_66_0 = stackOut_65_0;
                                      stackIn_66_1 = stackOut_65_1;
                                      if ((var8 - -dl.field_h.length - var5 ^ -1) > -1) {
                                        stackOut_67_0 = (String[]) ((Object) stackIn_67_0);
                                        stackOut_67_1 = stackIn_67_1;
                                        stackOut_67_2 = "";
                                        stackIn_68_0 = stackOut_67_0;
                                        stackIn_68_1 = stackOut_67_1;
                                        stackIn_68_2 = stackOut_67_2;
                                        break L14;
                                      } else {
                                        stackOut_66_0 = (String[]) ((Object) stackIn_66_0);
                                        stackOut_66_1 = stackIn_66_1;
                                        stackOut_66_2 = dl.field_h[-var5 + var8 + dl.field_h.length];
                                        stackIn_68_0 = stackOut_66_0;
                                        stackIn_68_1 = stackOut_66_1;
                                        stackIn_68_2 = stackOut_66_2;
                                        break L14;
                                      }
                                    }
                                    stackIn_68_0[stackIn_68_1] = stackIn_68_2;
                                    var8++;
                                    continue L11;
                                  }
                                }
                              } else {
                                hd.field_s[var8] = -1;
                                var8++;
                                continue L10;
                              }
                            }
                          }
                        }
                      } else {
                        throw new IllegalStateException();
                      }
                    }
                  } else {
                    if (-4 != (pg.field_p ^ -1)) {
                      if (pg.field_p == 4) {
                        var3_int = ja.a((byte) 16, jc.field_p, d.field_a, di.field_O, ZombieDawn.field_K);
                        var4 = var3_int + 2;
                        cj.field_h = new String[var4];
                        hd.field_s = new int[var4];
                        var5 = 0;
                        L15: while (true) {
                          if (var4 <= var5) {
                            qk.field_Kb = new int[1];
                            var5 = 0;
                            L16: while (true) {
                              if (var3_int <= var5) {
                                cj.field_h[var4 + -2] = "";
                                cj.field_h[var4 + -1] = re.field_c;
                                hd.field_s[-1 + var4] = 0;
                                qk.field_Kb[0] = 5;
                                break L1;
                              } else {
                                cj.field_h[var5] = jc.field_p[var5];
                                var5++;
                                continue L16;
                              }
                            }
                          } else {
                            hd.field_s[var5] = -1;
                            var5++;
                            continue L15;
                          }
                        }
                      } else {
                        if (pg.field_p != 5) {
                          throw new IllegalArgumentException();
                        } else {
                          var3_int = ja.a((byte) 16, jc.field_p, hc.field_c, di.field_O, ZombieDawn.field_K);
                          var4 = 3 + var3_int;
                          hd.field_s = new int[var4];
                          cj.field_h = new String[var4];
                          var5 = 0;
                          L17: while (true) {
                            if (var4 <= var5) {
                              qk.field_Kb = new int[2];
                              var5 = 0;
                              L18: while (true) {
                                if (var3_int <= var5) {
                                  cj.field_h[var4 + -3] = "";
                                  cj.field_h[-2 + var4] = ja.field_c;
                                  hd.field_s[-2 + var4] = 0;
                                  qk.field_Kb[0] = 3;
                                  cj.field_h[var4 - 1] = re.field_c;
                                  hd.field_s[-1 + var4] = 1;
                                  qk.field_Kb[1] = 5;
                                  break L1;
                                } else {
                                  cj.field_h[var5] = jc.field_p[var5];
                                  var5++;
                                  continue L18;
                                }
                              }
                            } else {
                              hd.field_s[var5] = -1;
                              var5++;
                              continue L17;
                            }
                          }
                        }
                      }
                    } else {
                      L19: {
                        if (vh.field_a.field_t) {
                          var3_int = ja.a((byte) 16, jc.field_p, me.field_Cb, di.field_O, ZombieDawn.field_K);
                          break L19;
                        } else {
                          var3_int = ja.a((byte) 16, jc.field_p, lo.field_n, di.field_O, ZombieDawn.field_K);
                          break L19;
                        }
                      }
                      var4 = var3_int + 2;
                      cj.field_h = new String[var4];
                      hd.field_s = new int[var4];
                      var5 = 0;
                      L20: while (true) {
                        if (var5 >= var4) {
                          qk.field_Kb = new int[1];
                          var5 = 0;
                          L21: while (true) {
                            if (var3_int <= var5) {
                              cj.field_h[-2 + var4] = "";
                              cj.field_h[-1 + var4] = re.field_c;
                              hd.field_s[-1 + var4] = 0;
                              qk.field_Kb[0] = 5;
                              break L1;
                            } else {
                              cj.field_h[var5] = jc.field_p[var5];
                              var5++;
                              continue L21;
                            }
                          }
                        } else {
                          hd.field_s[var5] = -1;
                          var5++;
                          continue L20;
                        }
                      }
                    }
                  }
                } else {
                  var3_int = ja.a((byte) 16, jc.field_p, mf.field_a, di.field_O, ZombieDawn.field_K);
                  var4 = 2 - -var3_int;
                  cj.field_h = new String[var4];
                  hd.field_s = new int[var4];
                  var5 = 0;
                  L22: while (true) {
                    if (var5 >= var4) {
                      qk.field_Kb = new int[1];
                      var5 = 0;
                      L23: while (true) {
                        if (var5 >= var3_int) {
                          cj.field_h[var4 + -2] = "";
                          cj.field_h[var4 + -1] = re.field_c;
                          hd.field_s[-1 + var4] = 0;
                          qk.field_Kb[0] = 5;
                          break L1;
                        } else {
                          cj.field_h[var5] = jc.field_p[var5];
                          var5++;
                          continue L23;
                        }
                      }
                    } else {
                      hd.field_s[var5] = -1;
                      var5++;
                      continue L22;
                    }
                  }
                }
              }
            }
            i.field_W.field_h = qk.field_Kb.length;
            var3_int = 0;
            var4 = 0;
            L24: while (true) {
              if (var4 >= cj.field_h.length) {
                L25: {
                  if (-3 == (pg.field_p ^ -1)) {
                    var10 = pn.field_R;
                    var5 = 0;
                    L26: while (true) {
                      if (var10.length <= var5) {
                        var11 = hl.field_b;
                        var5 = 0;
                        L27: while (true) {
                          if (var11.length <= var5) {
                            break L25;
                          } else {
                            L28: {
                              var13 = var11[var5];
                              var7 = tk.a(var13, true, false);
                              if (var3_int < var7) {
                                var3_int = var7;
                                break L28;
                              } else {
                                break L28;
                              }
                            }
                            var5++;
                            continue L27;
                          }
                        }
                      } else {
                        L29: {
                          var12 = var10[var5];
                          var7 = tk.a(var12, true, false);
                          if (var7 > var3_int) {
                            var3_int = var7;
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                        var5++;
                        continue L26;
                      }
                    }
                  } else {
                    break L25;
                  }
                }
                L30: {
                  p.field_d = i.field_W.field_h * (fe.field_H + cn.field_h << -318826975);
                  if (param1 >= 49) {
                    break L30;
                  } else {
                    ti.a((String) null, false, true);
                    break L30;
                  }
                }
                rg.field_E = -(var3_int >> 415603265) + mo.field_b - -var3_int;
                wh.field_c = mo.field_b - (var3_int >> -66696607);
                var4 = 0;
                L31: while (true) {
                  if (cj.field_h.length <= var4) {
                    wm.field_d = -(p.field_d >> -505719679) + ff.field_a;
                    hm.field_F = new int[cj.field_h.length][];
                    var4 = 0;
                    var5 = wm.field_d;
                    L32: while (true) {
                      if (cj.field_h.length <= var4) {
                        L33: {
                          if (2 != pg.field_p) {
                            i.field_W.a(param2, (byte) -70, r.b(6199969, ha.field_b, ei.field_K), 0);
                            break L33;
                          } else {
                            i.field_W.a(param2, (byte) -75, -1, -1);
                            break L33;
                          }
                        }
                        break L0;
                      } else {
                        L34: {
                          var6 = hd.field_s[var4];
                          if (-1 >= (var6 ^ -1)) {
                            var7 = tk.a(cj.field_h[var4], true, true);
                            var5 = var5 + fe.field_H;
                            var8 = mo.field_b - (var7 >> -51409631);
                            hm.field_F[var4] = new int[4];
                            hm.field_F[var4][0] = var8 + -lk.field_f;
                            hm.field_F[var4][1] = var5;
                            hm.field_F[var4][2] = (lk.field_f << -851703551) + var7;
                            hm.field_F[var4][3] = qh.field_f + (cn.field_h << 1345894785);
                            var5 = var5 + ((cn.field_h << 613816609) - -fe.field_H + qh.field_f);
                            break L34;
                          } else {
                            var5 = var5 + vl.field_r;
                            break L34;
                          }
                        }
                        var4++;
                        continue L32;
                      }
                    }
                  } else {
                    L35: {
                      stackOut_110_0 = p.field_d;
                      stackIn_112_0 = stackOut_110_0;
                      stackIn_111_0 = stackOut_110_0;
                      if ((hd.field_s[var4] ^ -1) > -1) {
                        stackOut_112_0 = stackIn_112_0;
                        stackOut_112_1 = vl.field_r;
                        stackIn_113_0 = stackOut_112_0;
                        stackIn_113_1 = stackOut_112_1;
                        break L35;
                      } else {
                        stackOut_111_0 = stackIn_111_0;
                        stackOut_111_1 = qh.field_f;
                        stackIn_113_0 = stackOut_111_0;
                        stackIn_113_1 = stackOut_111_1;
                        break L35;
                      }
                    }
                    p.field_d = stackIn_113_0 + stackIn_113_1;
                    var4++;
                    continue L31;
                  }
                }
              } else {
                L36: {
                  stackOut_85_0 = cj.field_h[var4];
                  stackOut_85_1 = 1;
                  stackIn_87_0 = stackOut_85_0;
                  stackIn_87_1 = stackOut_85_1;
                  stackIn_86_0 = stackOut_85_0;
                  stackIn_86_1 = stackOut_85_1;
                  if (hd.field_s[var4] < 0) {
                    stackOut_87_0 = (String) ((Object) stackIn_87_0);
                    stackOut_87_1 = stackIn_87_1;
                    stackOut_87_2 = 0;
                    stackIn_88_0 = stackOut_87_0;
                    stackIn_88_1 = stackOut_87_1;
                    stackIn_88_2 = stackOut_87_2;
                    break L36;
                  } else {
                    stackOut_86_0 = (String) ((Object) stackIn_86_0);
                    stackOut_86_1 = stackIn_86_1;
                    stackOut_86_2 = 1;
                    stackIn_88_0 = stackOut_86_0;
                    stackIn_88_1 = stackOut_86_1;
                    stackIn_88_2 = stackOut_86_2;
                    break L36;
                  }
                }
                L37: {
                  var5 = tk.a(stackIn_88_0, stackIn_88_1 != 0, stackIn_88_2 != 0);
                  if (var5 > var3_int) {
                    var3_int = var5;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                var4++;
                continue L24;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var3), "ti.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_g = null;
        field_f = null;
        if (param0 != 4) {
            ti.a(126);
        }
        field_e = null;
    }

    final static void a(String param0, boolean param1, boolean param2) {
        try {
            pk.field_J = param1;
            ce.field_q = true;
            kk.field_i = new sg(e.field_S, rk.field_b, param0, nm.field_c, pk.field_J);
            if (param2) {
                String var4 = (String) null;
                ti.a((String) null, false, true);
            }
            e.field_S.a(kk.field_i, !param2 ? true : false);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "ti.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = new vn(540, 140);
        field_d = "SCREECH";
        field_f = "Play free version";
        field_a = false;
        field_b = 0;
    }
}
