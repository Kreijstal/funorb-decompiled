/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    static String field_d;
    static int field_e;
    static oa field_b;
    static int[] field_g;
    static String field_c;
    static int field_f;
    static int[] field_a;

    final static void a(int param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException decompiledCaughtException = null;
        var13 = HoldTheLine.field_D;
        try {
          L0: {
            var4_int = param0 / 2;
            var5 = param0 * 15 / 16;
            var6 = param0 / 32;
            var7 = param0 * 15 / 16;
            var8 = param0 * 115 / 128;
            var9 = 0;
            L1: while (true) {
              if (var8 <= var9) {
                L2: {
                  if (param1 == 4209) {
                    break L2;
                  } else {
                    field_d = (String) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                var10 = var4_int - -((-var4_int + var6) * var9 / var8);
                var11 = var5 + var9 * (var7 - var5) / var8;
                var12 = -96 * var9 / var8 + 160;
                tc.c(var10 + (-(param0 / 2) + param2), -(param0 / 2) + param3 + var9, var11 - var10, 16777088, var12);
                var9++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var4), "pe.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_a = null;
        field_b = null;
        field_g = null;
        field_d = null;
        field_c = null;
    }

    final static void a(int param0, boolean param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        String[] var12 = null;
        String var13 = null;
        String var14 = null;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        String[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        String[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        String[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        String stackIn_47_2 = null;
        String[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        String[] stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        String[] stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        String stackIn_53_2 = null;
        String stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        String stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        String stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        int stackIn_88_2 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        String[] stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        String[] stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        String stackOut_52_2 = null;
        String[] stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        String stackOut_51_2 = null;
        String[] stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        String[] stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        String stackOut_46_2 = null;
        String[] stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        String stackOut_45_2 = null;
        int stackOut_106_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        String stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        String stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        int stackOut_87_2 = 0;
        String stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        int stackOut_86_2 = 0;
        var10 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              oi.field_f = true;
              pa.field_h = param0;
              if (pa.field_h != 0) {
                if (-2 != (pa.field_h ^ -1)) {
                  if ((pa.field_h ^ -1) != -3) {
                    if (pa.field_h == 3) {
                      L2: {
                        if (wi.field_b.field_f) {
                          var3_int = mg.a(sj.field_G, sj.field_J, an.field_c, (byte) -60, p.field_j);
                          break L2;
                        } else {
                          var3_int = mg.a(sj.field_G, ek.field_w, an.field_c, (byte) -70, p.field_j);
                          break L2;
                        }
                      }
                      var4 = var3_int + 2;
                      cd.field_f = new int[var4];
                      ii.field_b = new String[var4];
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var4) {
                          ii.field_e = new int[1];
                          var5 = 0;
                          L4: while (true) {
                            if (var5 >= var3_int) {
                              ii.field_b[-2 + var4] = "";
                              ii.field_b[-1 + var4] = h.field_f;
                              cd.field_f[-1 + var4] = 0;
                              ii.field_e[0] = 5;
                              break L1;
                            } else {
                              ii.field_b[var5] = an.field_c[var5];
                              var5++;
                              continue L4;
                            }
                          }
                        } else {
                          cd.field_f[var5] = -1;
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      if (-5 == (pa.field_h ^ -1)) {
                        var3_int = mg.a(sj.field_G, dk.field_m, an.field_c, (byte) 106, p.field_j);
                        var4 = 2 + var3_int;
                        cd.field_f = new int[var4];
                        ii.field_b = new String[var4];
                        var5 = 0;
                        L5: while (true) {
                          if (var4 <= var5) {
                            ii.field_e = new int[1];
                            var5 = 0;
                            L6: while (true) {
                              if (var3_int <= var5) {
                                ii.field_b[var4 - 2] = "";
                                ii.field_b[var4 - 1] = h.field_f;
                                cd.field_f[-1 + var4] = 0;
                                ii.field_e[0] = 5;
                                break L1;
                              } else {
                                ii.field_b[var5] = an.field_c[var5];
                                var5++;
                                continue L6;
                              }
                            }
                          } else {
                            cd.field_f[var5] = -1;
                            var5++;
                            continue L5;
                          }
                        }
                      } else {
                        if (5 == pa.field_h) {
                          var3_int = mg.a(sj.field_G, hc.field_c, an.field_c, (byte) 119, p.field_j);
                          var4 = var3_int + 3;
                          ii.field_b = new String[var4];
                          cd.field_f = new int[var4];
                          var5 = 0;
                          L7: while (true) {
                            if (var4 <= var5) {
                              ii.field_e = new int[2];
                              var5 = 0;
                              L8: while (true) {
                                if (var3_int <= var5) {
                                  ii.field_b[var4 + -3] = "";
                                  ii.field_b[-2 + var4] = vk.field_i;
                                  cd.field_f[var4 - 2] = 0;
                                  ii.field_e[0] = 3;
                                  ii.field_b[-1 + var4] = h.field_f;
                                  cd.field_f[-1 + var4] = 1;
                                  ii.field_e[1] = 5;
                                  break L1;
                                } else {
                                  ii.field_b[var5] = an.field_c[var5];
                                  var5++;
                                  continue L8;
                                }
                              }
                            } else {
                              cd.field_f[var5] = -1;
                              var5++;
                              continue L7;
                            }
                          }
                        } else {
                          throw new IllegalArgumentException();
                        }
                      }
                    }
                  } else {
                    var3_int = mg.a(sj.field_G, sd.a(qg.field_a, new String[]{"<br><%0><br>"}, true), an.field_c, (byte) -59, p.field_j);
                    var4 = -1;
                    var5 = 0;
                    L9: while (true) {
                      L10: {
                        if (var5 >= var3_int) {
                          break L10;
                        } else {
                          if ("<%0>".equals(an.field_c[var5])) {
                            var4 = var5;
                            break L10;
                          } else {
                            var5++;
                            continue L9;
                          }
                        }
                      }
                      if ((var4 ^ -1) != 0) {
                        qg.field_b = new String[var4];
                        bc.a(an.field_c, 0, qg.field_b, 0, var4);
                        aa.field_j = new String[-1 + (var3_int + -var4)];
                        bc.a(an.field_c, var4 + 1, aa.field_j, 0, -var4 + var3_int - 1);
                        var3_int = mg.a(sj.field_G, sd.a(b.field_b, new String[]{"<br><%0><br>"}, true), an.field_c, (byte) 118, p.field_j);
                        var4 = -1;
                        var5 = 0;
                        L11: while (true) {
                          L12: {
                            if (var5 >= var3_int) {
                              break L12;
                            } else {
                              if (!"<%0>".equals(an.field_c[var5])) {
                                var5++;
                                continue L11;
                              } else {
                                var4 = var5;
                                break L12;
                              }
                            }
                          }
                          if ((var4 ^ -1) != 0) {
                            L13: {
                              dg.field_b = new String[var4];
                              bc.a(an.field_c, 0, dg.field_b, 0, var4);
                              pb.field_a = new String[-1 + (-var4 + var3_int)];
                              bc.a(an.field_c, 1 + var4, pb.field_a, 0, var3_int + -var4 - 1);
                              if (dg.field_b.length > qg.field_b.length) {
                                stackOut_35_0 = dg.field_b.length;
                                stackIn_36_0 = stackOut_35_0;
                                break L13;
                              } else {
                                stackOut_34_0 = qg.field_b.length;
                                stackIn_36_0 = stackOut_34_0;
                                break L13;
                              }
                            }
                            L14: {
                              var5 = stackIn_36_0;
                              if (pb.field_a.length > aa.field_j.length) {
                                stackOut_38_0 = pb.field_a.length;
                                stackIn_39_0 = stackOut_38_0;
                                break L14;
                              } else {
                                stackOut_37_0 = aa.field_j.length;
                                stackIn_39_0 = stackOut_37_0;
                                break L14;
                              }
                            }
                            var6 = stackIn_39_0;
                            var7 = var5 + (7 - -var6);
                            ii.field_b = new String[var7];
                            cd.field_f = new int[var7];
                            var8 = 0;
                            L15: while (true) {
                              if (var8 >= var7) {
                                ii.field_e = new int[2];
                                ii.field_b[1] = eb.field_k;
                                cd.field_f[1] = 0;
                                ii.field_b[0] = rc.field_b;
                                cd.field_f[3] = 1;
                                ii.field_b[2] = mg.field_k;
                                ii.field_e[0] = 5;
                                ii.field_b[5] = "";
                                ii.field_b[3] = d.field_d;
                                ii.field_e[1] = 2;
                                ii.field_b[4] = wl.field_d;
                                var8 = 0;
                                L16: while (true) {
                                  if (var5 <= var8) {
                                    ii.field_b[6 - -var5] = null;
                                    cd.field_f[var5 + 6] = -2;
                                    var8 = 0;
                                    L17: while (true) {
                                      if (var8 >= var6) {
                                        cg.field_g = bb.b(-1);
                                        break L1;
                                      } else {
                                        L18: {
                                          stackOut_50_0 = ii.field_b;
                                          stackOut_50_1 = var5 + 7 + var8;
                                          stackIn_52_0 = stackOut_50_0;
                                          stackIn_52_1 = stackOut_50_1;
                                          stackIn_51_0 = stackOut_50_0;
                                          stackIn_51_1 = stackOut_50_1;
                                          if (var8 < pb.field_a.length) {
                                            stackOut_52_0 = (String[]) ((Object) stackIn_52_0);
                                            stackOut_52_1 = stackIn_52_1;
                                            stackOut_52_2 = pb.field_a[var8];
                                            stackIn_53_0 = stackOut_52_0;
                                            stackIn_53_1 = stackOut_52_1;
                                            stackIn_53_2 = stackOut_52_2;
                                            break L18;
                                          } else {
                                            stackOut_51_0 = (String[]) ((Object) stackIn_51_0);
                                            stackOut_51_1 = stackIn_51_1;
                                            stackOut_51_2 = "";
                                            stackIn_53_0 = stackOut_51_0;
                                            stackIn_53_1 = stackOut_51_1;
                                            stackIn_53_2 = stackOut_51_2;
                                            break L18;
                                          }
                                        }
                                        stackIn_53_0[stackIn_53_1] = stackIn_53_2;
                                        var8++;
                                        continue L17;
                                      }
                                    }
                                  } else {
                                    L19: {
                                      stackOut_44_0 = ii.field_b;
                                      stackOut_44_1 = var8 + 6;
                                      stackIn_46_0 = stackOut_44_0;
                                      stackIn_46_1 = stackOut_44_1;
                                      stackIn_45_0 = stackOut_44_0;
                                      stackIn_45_1 = stackOut_44_1;
                                      if ((-var5 + (var8 + dg.field_b.length) ^ -1) > -1) {
                                        stackOut_46_0 = (String[]) ((Object) stackIn_46_0);
                                        stackOut_46_1 = stackIn_46_1;
                                        stackOut_46_2 = "";
                                        stackIn_47_0 = stackOut_46_0;
                                        stackIn_47_1 = stackOut_46_1;
                                        stackIn_47_2 = stackOut_46_2;
                                        break L19;
                                      } else {
                                        stackOut_45_0 = (String[]) ((Object) stackIn_45_0);
                                        stackOut_45_1 = stackIn_45_1;
                                        stackOut_45_2 = dg.field_b[-var5 + var8 - -dg.field_b.length];
                                        stackIn_47_0 = stackOut_45_0;
                                        stackIn_47_1 = stackOut_45_1;
                                        stackIn_47_2 = stackOut_45_2;
                                        break L19;
                                      }
                                    }
                                    stackIn_47_0[stackIn_47_1] = stackIn_47_2;
                                    var8++;
                                    continue L16;
                                  }
                                }
                              } else {
                                cd.field_f[var8] = -1;
                                var8++;
                                continue L15;
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
                  }
                } else {
                  var3_int = mg.a(sj.field_G, fm.field_c, an.field_c, (byte) -95, p.field_j);
                  var4 = 2 - -var3_int;
                  cd.field_f = new int[var4];
                  ii.field_b = new String[var4];
                  var5 = 0;
                  L20: while (true) {
                    if (var4 <= var5) {
                      ii.field_e = new int[1];
                      var5 = 0;
                      L21: while (true) {
                        if (var3_int <= var5) {
                          ii.field_b[var4 - 2] = "";
                          ii.field_b[-1 + var4] = h.field_f;
                          cd.field_f[var4 + -1] = 0;
                          ii.field_e[0] = 5;
                          break L1;
                        } else {
                          ii.field_b[var5] = an.field_c[var5];
                          var5++;
                          continue L21;
                        }
                      }
                    } else {
                      cd.field_f[var5] = -1;
                      var5++;
                      continue L20;
                    }
                  }
                }
              } else {
                var3_int = mg.a(sj.field_G, fm.field_c, an.field_c, (byte) 115, p.field_j);
                var4 = var3_int + 3;
                cd.field_f = new int[var4];
                ii.field_b = new String[var4];
                var5 = 0;
                L22: while (true) {
                  if (var4 <= var5) {
                    ii.field_e = new int[2];
                    var5 = 0;
                    L23: while (true) {
                      if (var5 >= var3_int) {
                        ii.field_b[var4 + -3] = "";
                        ii.field_b[var4 + -2] = mg.field_e;
                        cd.field_f[-2 + var4] = 0;
                        ii.field_e[0] = 4;
                        ii.field_b[-1 + var4] = h.field_f;
                        cd.field_f[var4 - 1] = 1;
                        ii.field_e[1] = 5;
                        break L1;
                      } else {
                        ii.field_b[var5] = an.field_c[var5];
                        var5++;
                        continue L23;
                      }
                    }
                  } else {
                    cd.field_f[var5] = -1;
                    var5++;
                    continue L22;
                  }
                }
              }
            }
            kl.field_q.field_b = ii.field_e.length;
            var3_int = 0;
            var4 = 0;
            L24: while (true) {
              if (var4 >= ii.field_b.length) {
                L25: {
                  if (2 == pa.field_h) {
                    var11 = qg.field_b;
                    var5 = 0;
                    L26: while (true) {
                      if (var5 >= var11.length) {
                        var12 = aa.field_j;
                        var5 = 0;
                        L27: while (true) {
                          if (var12.length <= var5) {
                            break L25;
                          } else {
                            var14 = var12[var5];
                            var7 = h.a(var14, (byte) -113, false);
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
                        L28: {
                          var13 = var11[var5];
                          var7 = h.a(var13, (byte) -113, false);
                          if (var7 > var3_int) {
                            var3_int = var7;
                            break L28;
                          } else {
                            break L28;
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
                var4 = 95 / ((-38 - param2) / 48);
                mk.field_d = mk.field_i - (var3_int >> 2048921985);
                vf.field_t = var3_int + (mk.field_i + -(var3_int >> -1554627647));
                lb.field_v = (vf.field_w + dc.field_bb << -714960735) * kl.field_q.field_b;
                var5 = 0;
                L29: while (true) {
                  if (var5 >= ii.field_b.length) {
                    ie.field_j = in.field_i - (lb.field_v >> -1908208319);
                    fi.field_lb = new int[ii.field_b.length][];
                    var5 = 0;
                    var6 = ie.field_j;
                    L30: while (true) {
                      if (var5 >= ii.field_b.length) {
                        L31: {
                          if ((pa.field_h ^ -1) == -3) {
                            kl.field_q.a(-1, 0, param1, -1);
                            break L31;
                          } else {
                            kl.field_q.a(cm.a((byte) 110, rf.field_X, nc.field_g), 0, param1, 0);
                            break L31;
                          }
                        }
                        break L0;
                      } else {
                        L32: {
                          var7 = cd.field_f[var5];
                          if (0 <= var7) {
                            var8 = h.a(ii.field_b[var5], (byte) -113, true);
                            var6 = var6 + dc.field_bb;
                            var9 = -(var8 >> -409461279) + mk.field_i;
                            fi.field_lb[var5] = new int[4];
                            fi.field_lb[var5][0] = var9 + -pg.field_G;
                            fi.field_lb[var5][1] = var6;
                            fi.field_lb[var5][2] = (pg.field_G << 194507745) + var8;
                            fi.field_lb[var5][3] = (vf.field_w << -1818268447) + w.field_b;
                            var6 = var6 + (dc.field_bb + ((vf.field_w << 1054392641) - -w.field_b));
                            break L32;
                          } else {
                            var6 = var6 + hn.field_M;
                            break L32;
                          }
                        }
                        var5++;
                        continue L30;
                      }
                    }
                  } else {
                    L33: {
                      stackOut_106_0 = lb.field_v;
                      stackIn_108_0 = stackOut_106_0;
                      stackIn_107_0 = stackOut_106_0;
                      if (0 <= cd.field_f[var5]) {
                        stackOut_108_0 = stackIn_108_0;
                        stackOut_108_1 = w.field_b;
                        stackIn_109_0 = stackOut_108_0;
                        stackIn_109_1 = stackOut_108_1;
                        break L33;
                      } else {
                        stackOut_107_0 = stackIn_107_0;
                        stackOut_107_1 = hn.field_M;
                        stackIn_109_0 = stackOut_107_0;
                        stackIn_109_1 = stackOut_107_1;
                        break L33;
                      }
                    }
                    lb.field_v = stackIn_109_0 + stackIn_109_1;
                    var5++;
                    continue L29;
                  }
                }
              } else {
                L34: {
                  stackOut_85_0 = ii.field_b[var4];
                  stackOut_85_1 = -113;
                  stackIn_87_0 = stackOut_85_0;
                  stackIn_87_1 = stackOut_85_1;
                  stackIn_86_0 = stackOut_85_0;
                  stackIn_86_1 = stackOut_85_1;
                  if (cd.field_f[var4] < 0) {
                    stackOut_87_0 = (String) ((Object) stackIn_87_0);
                    stackOut_87_1 = stackIn_87_1;
                    stackOut_87_2 = 0;
                    stackIn_88_0 = stackOut_87_0;
                    stackIn_88_1 = stackOut_87_1;
                    stackIn_88_2 = stackOut_87_2;
                    break L34;
                  } else {
                    stackOut_86_0 = (String) ((Object) stackIn_86_0);
                    stackOut_86_1 = stackIn_86_1;
                    stackOut_86_2 = 1;
                    stackIn_88_0 = stackOut_86_0;
                    stackIn_88_1 = stackOut_86_1;
                    stackIn_88_2 = stackOut_86_2;
                    break L34;
                  }
                }
                var5 = h.a(stackIn_88_0, (byte) stackIn_88_1, stackIn_88_2 != 0);
                if (var5 > var3_int) {
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
          throw kk.a((Throwable) ((Object) var3), "pe.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = "<col=1><%0></col><br><br>Power: <%1><br>Speed: <%2><br>Grip: <%3>";
        field_e = 480;
        field_f = 2;
        field_a = new int[8192];
    }
}
