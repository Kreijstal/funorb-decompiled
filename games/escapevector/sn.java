/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class sn {
    static mf field_c;
    private boolean field_e;
    static long field_d;
    static boolean[] field_b;
    private String field_a;

    final static void c(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            var1 = l.a(-8462, od.field_q);
            var2 = vh.f(127);
            if (var1 != od.field_q) {
              break L1;
            } else {
              if (hn.field_l.field_h != var2) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          var3 = di.field_d.field_j ? 1 : 0;
          ll.a(0, var1, var3 != 0, var2);
          break L0;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, int param1, boolean param2) {
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
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        String[] stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        String[] stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        String[] stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        String stackIn_62_2 = null;
        String[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        String[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String stackIn_68_2 = null;
        int stackIn_87_0 = 0;
        String stackIn_87_1 = null;
        int stackIn_88_0 = 0;
        String stackIn_88_1 = null;
        int stackIn_89_0 = 0;
        String stackIn_89_1 = null;
        int stackIn_89_2 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        String[] stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        String[] stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        String stackOut_67_2 = null;
        String[] stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        String stackOut_66_2 = null;
        String[] stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        String[] stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        String stackOut_61_2 = null;
        String[] stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        String stackOut_60_2 = null;
        int stackOut_108_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_86_0 = 0;
        String stackOut_86_1 = null;
        int stackOut_88_0 = 0;
        String stackOut_88_1 = null;
        int stackOut_88_2 = 0;
        int stackOut_87_0 = 0;
        String stackOut_87_1 = null;
        int stackOut_87_2 = 0;
        L0: {
          var9 = EscapeVector.field_A;
          tb.field_D = true;
          f.field_j = param0;
          if (f.field_j == 0) {
            var3_int = un.a(pf.field_e, -118, nb.field_a, sb.field_h, ac.field_a);
            var4 = var3_int + 3;
            jj.field_a = new int[var4];
            s.field_I = new String[var4];
            var5 = 0;
            L1: while (true) {
              if (var5 >= var4) {
                wh.field_j = new int[2];
                var5 = 0;
                L2: while (true) {
                  if (~var3_int >= ~var5) {
                    s.field_I[var4 + -3] = "";
                    s.field_I[var4 - 2] = lh.field_a;
                    jj.field_a[-2 + var4] = 0;
                    wh.field_j[0] = 4;
                    s.field_I[var4 - 1] = ah.field_k;
                    jj.field_a[-1 + var4] = 1;
                    wh.field_j[1] = 5;
                    break L0;
                  } else {
                    s.field_I[var5] = pf.field_e[var5];
                    var5++;
                    continue L2;
                  }
                }
              } else {
                jj.field_a[var5] = -1;
                var5++;
                continue L1;
              }
            }
          } else {
            if (f.field_j == 1) {
              var3_int = un.a(pf.field_e, -126, nb.field_a, sb.field_h, ac.field_a);
              var4 = 2 + var3_int;
              s.field_I = new String[var4];
              jj.field_a = new int[var4];
              var5 = 0;
              L3: while (true) {
                if (~var4 >= ~var5) {
                  wh.field_j = new int[1];
                  var5 = 0;
                  L4: while (true) {
                    if (~var5 <= ~var3_int) {
                      s.field_I[-2 + var4] = "";
                      s.field_I[-1 + var4] = ah.field_k;
                      jj.field_a[var4 + -1] = 0;
                      wh.field_j[0] = 5;
                      break L0;
                    } else {
                      s.field_I[var5] = pf.field_e[var5];
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  jj.field_a[var5] = -1;
                  var5++;
                  continue L3;
                }
              }
            } else {
              if (f.field_j == 2) {
                var3_int = un.a(pf.field_e, -101, nb.field_a, sb.field_h, r.a(fn.field_d, -63, new String[1]));
                var4 = -1;
                var5 = 0;
                L5: while (true) {
                  L6: {
                    if (~var5 <= ~var3_int) {
                      break L6;
                    } else {
                      if ("<%0>".equals((Object) (Object) pf.field_e[var5])) {
                        var4 = var5;
                        break L6;
                      } else {
                        var5++;
                        continue L5;
                      }
                    }
                  }
                  if (-1 == var4) {
                    throw new IllegalStateException();
                  } else {
                    tg.field_nb = new String[var4];
                    qg.a((Object[]) (Object) pf.field_e, 0, (Object[]) (Object) tg.field_nb, 0, var4);
                    nn.field_i = new String[-1 + -var4 + var3_int];
                    qg.a((Object[]) (Object) pf.field_e, 1 + var4, (Object[]) (Object) nn.field_i, 0, -var4 + (var3_int - 1));
                    var4 = -1;
                    var3_int = un.a(pf.field_e, param1 ^ 71, nb.field_a, sb.field_h, r.a(al.field_c, param1 ^ -63, new String[1]));
                    var5 = 0;
                    L7: while (true) {
                      L8: {
                        if (~var3_int >= ~var5) {
                          break L8;
                        } else {
                          if (!"<%0>".equals((Object) (Object) pf.field_e[var5])) {
                            var5++;
                            continue L7;
                          } else {
                            var4 = var5;
                            break L8;
                          }
                        }
                      }
                      if (var4 == -1) {
                        throw new IllegalStateException();
                      } else {
                        L9: {
                          qm.field_f = new String[var4];
                          qg.a((Object[]) (Object) pf.field_e, 0, (Object[]) (Object) qm.field_f, 0, var4);
                          tb.field_G = new String[var3_int + -var4 - 1];
                          qg.a((Object[]) (Object) pf.field_e, 1 + var4, (Object[]) (Object) tb.field_G, 0, -1 + var3_int - var4);
                          if (~qm.field_f.length < ~tg.field_nb.length) {
                            stackOut_50_0 = qm.field_f.length;
                            stackIn_51_0 = stackOut_50_0;
                            break L9;
                          } else {
                            stackOut_49_0 = tg.field_nb.length;
                            stackIn_51_0 = stackOut_49_0;
                            break L9;
                          }
                        }
                        L10: {
                          var5 = stackIn_51_0;
                          if (~nn.field_i.length <= ~tb.field_G.length) {
                            stackOut_53_0 = nn.field_i.length;
                            stackIn_54_0 = stackOut_53_0;
                            break L10;
                          } else {
                            stackOut_52_0 = tb.field_G.length;
                            stackIn_54_0 = stackOut_52_0;
                            break L10;
                          }
                        }
                        var6 = stackIn_54_0;
                        var7 = var5 + 7 - -var6;
                        jj.field_a = new int[var7];
                        s.field_I = new String[var7];
                        var8 = 0;
                        L11: while (true) {
                          if (var8 >= var7) {
                            wh.field_j = new int[2];
                            jj.field_a[1] = 0;
                            s.field_I[1] = jh.field_j;
                            s.field_I[0] = td.field_a;
                            s.field_I[2] = bb.field_I;
                            wh.field_j[0] = 5;
                            jj.field_a[3] = 1;
                            s.field_I[5] = "";
                            s.field_I[4] = p.field_e;
                            s.field_I[3] = bb.field_J;
                            wh.field_j[1] = 2;
                            var8 = 0;
                            L12: while (true) {
                              if (~var8 <= ~var5) {
                                s.field_I[6 - -var5] = null;
                                jj.field_a[var5 + 6] = -2;
                                var8 = 0;
                                L13: while (true) {
                                  if (var6 <= var8) {
                                    bd.field_k = td.b(128);
                                    break L0;
                                  } else {
                                    L14: {
                                      stackOut_65_0 = s.field_I;
                                      stackOut_65_1 = var8 + var5 + 7;
                                      stackIn_67_0 = stackOut_65_0;
                                      stackIn_67_1 = stackOut_65_1;
                                      stackIn_66_0 = stackOut_65_0;
                                      stackIn_66_1 = stackOut_65_1;
                                      if (~var8 > ~tb.field_G.length) {
                                        stackOut_67_0 = (String[]) (Object) stackIn_67_0;
                                        stackOut_67_1 = stackIn_67_1;
                                        stackOut_67_2 = tb.field_G[var8];
                                        stackIn_68_0 = stackOut_67_0;
                                        stackIn_68_1 = stackOut_67_1;
                                        stackIn_68_2 = stackOut_67_2;
                                        break L14;
                                      } else {
                                        stackOut_66_0 = (String[]) (Object) stackIn_66_0;
                                        stackOut_66_1 = stackIn_66_1;
                                        stackOut_66_2 = "";
                                        stackIn_68_0 = stackOut_66_0;
                                        stackIn_68_1 = stackOut_66_1;
                                        stackIn_68_2 = stackOut_66_2;
                                        break L14;
                                      }
                                    }
                                    stackIn_68_0[stackIn_68_1] = stackIn_68_2;
                                    var8++;
                                    continue L13;
                                  }
                                }
                              } else {
                                L15: {
                                  stackOut_59_0 = s.field_I;
                                  stackOut_59_1 = 6 - -var8;
                                  stackIn_61_0 = stackOut_59_0;
                                  stackIn_61_1 = stackOut_59_1;
                                  stackIn_60_0 = stackOut_59_0;
                                  stackIn_60_1 = stackOut_59_1;
                                  if (qm.field_f.length + var8 + -var5 < 0) {
                                    stackOut_61_0 = (String[]) (Object) stackIn_61_0;
                                    stackOut_61_1 = stackIn_61_1;
                                    stackOut_61_2 = "";
                                    stackIn_62_0 = stackOut_61_0;
                                    stackIn_62_1 = stackOut_61_1;
                                    stackIn_62_2 = stackOut_61_2;
                                    break L15;
                                  } else {
                                    stackOut_60_0 = (String[]) (Object) stackIn_60_0;
                                    stackOut_60_1 = stackIn_60_1;
                                    stackOut_60_2 = qm.field_f[-var5 + (qm.field_f.length + var8)];
                                    stackIn_62_0 = stackOut_60_0;
                                    stackIn_62_1 = stackOut_60_1;
                                    stackIn_62_2 = stackOut_60_2;
                                    break L15;
                                  }
                                }
                                stackIn_62_0[stackIn_62_1] = stackIn_62_2;
                                var8++;
                                continue L12;
                              }
                            }
                          } else {
                            jj.field_a[var8] = -1;
                            var8++;
                            continue L11;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                if (f.field_j == 3) {
                  L16: {
                    if (!g.field_r.field_f) {
                      var3_int = un.a(pf.field_e, param1 ^ 114, nb.field_a, sb.field_h, tj.field_k);
                      break L16;
                    } else {
                      var3_int = un.a(pf.field_e, -122, nb.field_a, sb.field_h, aj.field_e);
                      break L16;
                    }
                  }
                  var4 = 2 + var3_int;
                  s.field_I = new String[var4];
                  jj.field_a = new int[var4];
                  var5 = 0;
                  L17: while (true) {
                    if (~var4 >= ~var5) {
                      wh.field_j = new int[1];
                      var5 = 0;
                      L18: while (true) {
                        if (~var3_int >= ~var5) {
                          s.field_I[-2 + var4] = "";
                          s.field_I[-1 + var4] = ah.field_k;
                          jj.field_a[var4 + -1] = 0;
                          wh.field_j[0] = 5;
                          break L0;
                        } else {
                          s.field_I[var5] = pf.field_e[var5];
                          var5++;
                          continue L18;
                        }
                      }
                    } else {
                      jj.field_a[var5] = -1;
                      var5++;
                      continue L17;
                    }
                  }
                } else {
                  if (f.field_j == 4) {
                    var3_int = un.a(pf.field_e, -110, nb.field_a, sb.field_h, ol.field_K);
                    var4 = var3_int + 2;
                    s.field_I = new String[var4];
                    jj.field_a = new int[var4];
                    var5 = 0;
                    L19: while (true) {
                      if (~var4 >= ~var5) {
                        wh.field_j = new int[1];
                        var5 = 0;
                        L20: while (true) {
                          if (var3_int <= var5) {
                            s.field_I[var4 - 2] = "";
                            s.field_I[-1 + var4] = ah.field_k;
                            jj.field_a[var4 + -1] = 0;
                            wh.field_j[0] = 5;
                            break L0;
                          } else {
                            s.field_I[var5] = pf.field_e[var5];
                            var5++;
                            continue L20;
                          }
                        }
                      } else {
                        jj.field_a[var5] = -1;
                        var5++;
                        continue L19;
                      }
                    }
                  } else {
                    if (5 != f.field_j) {
                      throw new IllegalArgumentException();
                    } else {
                      var3_int = un.a(pf.field_e, 122, nb.field_a, sb.field_h, eg.field_a);
                      var4 = 3 + var3_int;
                      s.field_I = new String[var4];
                      jj.field_a = new int[var4];
                      var5 = 0;
                      L21: while (true) {
                        if (~var4 >= ~var5) {
                          wh.field_j = new int[2];
                          var5 = 0;
                          L22: while (true) {
                            if (~var5 <= ~var3_int) {
                              s.field_I[var4 + -3] = "";
                              s.field_I[-2 + var4] = ve.field_f;
                              jj.field_a[var4 - 2] = 0;
                              wh.field_j[0] = 3;
                              s.field_I[-1 + var4] = ah.field_k;
                              jj.field_a[-1 + var4] = 1;
                              wh.field_j[1] = 5;
                              break L0;
                            } else {
                              s.field_I[var5] = pf.field_e[var5];
                              var5++;
                              continue L22;
                            }
                          }
                        } else {
                          jj.field_a[var5] = -1;
                          var5++;
                          continue L21;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        cb.field_c.field_k = wh.field_j.length;
        var3_int = 0;
        var4 = 0;
        L23: while (true) {
          if (var4 >= s.field_I.length) {
            L24: {
              if (2 != f.field_j) {
                break L24;
              } else {
                var10 = tg.field_nb;
                var5 = 0;
                L25: while (true) {
                  if (var5 >= var10.length) {
                    var11 = nn.field_i;
                    var5 = 0;
                    L26: while (true) {
                      if (~var5 <= ~var11.length) {
                        break L24;
                      } else {
                        L27: {
                          var13 = var11[var5];
                          var7 = ee.a(-104, var13, false);
                          if (~var7 < ~var3_int) {
                            var3_int = var7;
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
                      var7 = ee.a(param1 ^ -92, var12, false);
                      if (var3_int < var7) {
                        var3_int = var7;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    var5++;
                    continue L25;
                  }
                }
              }
            }
            vi.field_a = -(var3_int >> 1) + rn.field_e - -var3_int;
            ia.field_x = rn.field_e - (var3_int >> 1);
            mh.field_f = cb.field_c.field_k * (hn.field_s + en.field_k << 1);
            var4 = param1;
            L29: while (true) {
              if (s.field_I.length <= var4) {
                hi.field_o = ng.field_nb + -(mh.field_f >> 1);
                cj.field_d = new int[s.field_I.length][];
                var4 = 0;
                var5 = hi.field_o;
                L30: while (true) {
                  if (s.field_I.length <= var4) {
                    L31: {
                      if (2 != f.field_j) {
                        cb.field_c.a(param1 ^ 90, param2, hk.a((byte) 122, dh.field_d, bj.field_y), 0);
                        break L31;
                      } else {
                        cb.field_c.a(param1 + 91, param2, -1, -1);
                        break L31;
                      }
                    }
                    return;
                  } else {
                    L32: {
                      var6 = jj.field_a[var4];
                      if (var6 >= 0) {
                        var7 = ee.a(param1 ^ 61, s.field_I[var4], true);
                        var5 = var5 + hn.field_s;
                        var8 = rn.field_e + -(var7 >> 1);
                        cj.field_d[var4] = new int[4];
                        cj.field_d[var4][0] = var8 - fe.field_k;
                        cj.field_d[var4][1] = var5;
                        cj.field_d[var4][2] = (fe.field_k << 1) + var7;
                        cj.field_d[var4][3] = (en.field_k << 1) + ok.field_a;
                        var5 = var5 + (hn.field_s + (en.field_k << 1) + ok.field_a);
                        break L32;
                      } else {
                        var5 = var5 + je.field_b;
                        break L32;
                      }
                    }
                    var4++;
                    continue L30;
                  }
                }
              } else {
                L33: {
                  stackOut_108_0 = mh.field_f;
                  stackIn_110_0 = stackOut_108_0;
                  stackIn_109_0 = stackOut_108_0;
                  if (jj.field_a[var4] < 0) {
                    stackOut_110_0 = stackIn_110_0;
                    stackOut_110_1 = je.field_b;
                    stackIn_111_0 = stackOut_110_0;
                    stackIn_111_1 = stackOut_110_1;
                    break L33;
                  } else {
                    stackOut_109_0 = stackIn_109_0;
                    stackOut_109_1 = ok.field_a;
                    stackIn_111_0 = stackOut_109_0;
                    stackIn_111_1 = stackOut_109_1;
                    break L33;
                  }
                }
                mh.field_f = stackIn_111_0 + stackIn_111_1;
                var4++;
                continue L29;
              }
            }
          } else {
            L34: {
              stackOut_86_0 = 25;
              stackOut_86_1 = s.field_I[var4];
              stackIn_88_0 = stackOut_86_0;
              stackIn_88_1 = stackOut_86_1;
              stackIn_87_0 = stackOut_86_0;
              stackIn_87_1 = stackOut_86_1;
              if (0 > jj.field_a[var4]) {
                stackOut_88_0 = stackIn_88_0;
                stackOut_88_1 = (String) (Object) stackIn_88_1;
                stackOut_88_2 = 0;
                stackIn_89_0 = stackOut_88_0;
                stackIn_89_1 = stackOut_88_1;
                stackIn_89_2 = stackOut_88_2;
                break L34;
              } else {
                stackOut_87_0 = stackIn_87_0;
                stackOut_87_1 = (String) (Object) stackIn_87_1;
                stackOut_87_2 = 1;
                stackIn_89_0 = stackOut_87_0;
                stackIn_89_1 = stackOut_87_1;
                stackIn_89_2 = stackOut_87_2;
                break L34;
              }
            }
            L35: {
              var5 = ee.a(stackIn_89_0, stackIn_89_1, stackIn_89_2 != 0);
              if (var3_int < var5) {
                var3_int = var5;
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

    final boolean b(int param0) {
        if (param0 <= 75) {
            return true;
        }
        return ((sn) this).field_e;
    }

    sn(String param0) {
        this(param0, false);
    }

    sn(String param0, boolean param1) {
        RuntimeException runtimeException = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              ((sn) this).field_a = param0;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param1) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((sn) this).field_e = stackIn_4_1 != 0;
              if (((sn) this).field_a != null) {
                break L2;
              } else {
                ((sn) this).field_a = "";
                break L2;
              }
            }
            L3: {
              if (((sn) this).field_a.length() != 0) {
                break L3;
              } else {
                ((sn) this).field_e = false;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("sn.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
    }

    final String a(int param0) {
        if (param0 > -67) {
            sn.a(119, -87, true);
        }
        return ((sn) this).field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 20000000L;
        field_b = new boolean[64];
    }
}
