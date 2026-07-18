/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class gj {
    private int field_j;
    static ka field_b;
    private int field_g;
    ka field_e;
    private int field_f;
    static ne field_a;
    static int field_c;
    ka[] field_k;
    private int field_h;
    private boolean field_d;
    private int field_i;

    final gj a(byte param0, ka[] param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
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
            L1: {
              if (param0 <= -20) {
                break L1;
              } else {
                ((gj) this).field_f = 116;
                break L1;
              }
            }
            ((gj) this).field_k = param1;
            stackOut_2_0 = this;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("gj.D(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return (gj) this;
    }

    final gj a(boolean param0, int param1) {
        if (param1 != -1) {
            return null;
        }
        ((gj) this).field_d = param0 ? true : false;
        return (gj) this;
    }

    final gj a(int param0, byte param1) {
        ((gj) this).field_f = param0;
        if (param1 != 118) {
            return null;
        }
        return (gj) this;
    }

    public static void a() {
        field_a = null;
        field_b = null;
    }

    final gj b(int param0, int param1) {
        if (param0 != -764) {
            return null;
        }
        ((gj) this).field_i = param1;
        return (gj) this;
    }

    final void a(gj param0, byte param1) {
        param0.field_e = ((gj) this).field_e;
        if (param1 != 73) {
            return;
        }
        try {
            param0.field_j = ((gj) this).field_j;
            param0.field_k = ((gj) this).field_k;
            param0.field_h = ((gj) this).field_h;
            param0.field_g = ((gj) this).field_g;
            param0.field_d = ((gj) this).field_d;
            param0.field_i = ((gj) this).field_i;
            param0.field_f = ((gj) this).field_f;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "gj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

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
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        String[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        String[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        String[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        String stackIn_40_2 = null;
        String[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        String[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        String[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        String stackIn_46_2 = null;
        int stackIn_86_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        String[] stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        String[] stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        String stackOut_45_2 = null;
        String[] stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        String stackOut_44_2 = null;
        String[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        String[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        String stackOut_39_2 = null;
        String[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        String stackOut_38_2 = null;
        int stackOut_107_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              gi.field_c = true;
              nd.field_c = param1;
              if (nd.field_c != 0) {
                if (nd.field_c == 1) {
                  var3_int = ga.a(0, pf.field_c, wf.field_e, aj.field_b, ll.field_c);
                  var4 = 2 - -var3_int;
                  gf.field_s = new String[var4];
                  dl.field_s = new int[var4];
                  var5 = 0;
                  L2: while (true) {
                    if (var4 <= var5) {
                      pe.field_db = new int[1];
                      var5 = 0;
                      L3: while (true) {
                        if (var3_int <= var5) {
                          gf.field_s[var4 + -2] = "";
                          gf.field_s[-1 + var4] = ab.field_n;
                          dl.field_s[var4 - 1] = 0;
                          pe.field_db[0] = 5;
                          break L1;
                        } else {
                          gf.field_s[var5] = wf.field_e[var5];
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      dl.field_s[var5] = -1;
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (nd.field_c != 2) {
                    if (3 != nd.field_c) {
                      if (nd.field_c == 4) {
                        var3_int = ga.a(0, pf.field_c, wf.field_e, aj.field_b, uc.field_T);
                        var4 = 2 + var3_int;
                        gf.field_s = new String[var4];
                        dl.field_s = new int[var4];
                        var5 = 0;
                        L4: while (true) {
                          if (var5 >= var4) {
                            pe.field_db = new int[1];
                            var5 = 0;
                            L5: while (true) {
                              if (var5 >= var3_int) {
                                gf.field_s[var4 - 2] = "";
                                gf.field_s[-1 + var4] = ab.field_n;
                                dl.field_s[var4 + -1] = 0;
                                pe.field_db[0] = 5;
                                break L1;
                              } else {
                                gf.field_s[var5] = wf.field_e[var5];
                                var5++;
                                continue L5;
                              }
                            }
                          } else {
                            dl.field_s[var5] = -1;
                            var5++;
                            continue L4;
                          }
                        }
                      } else {
                        if (nd.field_c != 5) {
                          throw new IllegalArgumentException();
                        } else {
                          var3_int = ga.a(0, pf.field_c, wf.field_e, aj.field_b, jd.field_d);
                          var4 = 3 + var3_int;
                          gf.field_s = new String[var4];
                          dl.field_s = new int[var4];
                          var5 = 0;
                          L6: while (true) {
                            if (var4 <= var5) {
                              pe.field_db = new int[2];
                              var5 = 0;
                              L7: while (true) {
                                if (var5 >= var3_int) {
                                  gf.field_s[-3 + var4] = "";
                                  gf.field_s[-2 + var4] = ak.field_g;
                                  dl.field_s[-2 + var4] = 0;
                                  pe.field_db[0] = 3;
                                  gf.field_s[-1 + var4] = ab.field_n;
                                  dl.field_s[var4 - 1] = 1;
                                  pe.field_db[1] = 5;
                                  break L1;
                                } else {
                                  gf.field_s[var5] = wf.field_e[var5];
                                  var5++;
                                  continue L7;
                                }
                              }
                            } else {
                              dl.field_s[var5] = -1;
                              var5++;
                              continue L6;
                            }
                          }
                        }
                      }
                    } else {
                      L8: {
                        if (!sh.field_u.field_g) {
                          var3_int = ga.a(0, pf.field_c, wf.field_e, aj.field_b, d.field_z);
                          break L8;
                        } else {
                          var3_int = ga.a(0, pf.field_c, wf.field_e, aj.field_b, cj.field_a);
                          break L8;
                        }
                      }
                      var4 = var3_int + 2;
                      gf.field_s = new String[var4];
                      dl.field_s = new int[var4];
                      var5 = 0;
                      L9: while (true) {
                        if (var5 >= var4) {
                          pe.field_db = new int[1];
                          var5 = 0;
                          L10: while (true) {
                            if (var5 >= var3_int) {
                              gf.field_s[-2 + var4] = "";
                              gf.field_s[-1 + var4] = ab.field_n;
                              dl.field_s[-1 + var4] = 0;
                              pe.field_db[0] = 5;
                              break L1;
                            } else {
                              gf.field_s[var5] = wf.field_e[var5];
                              var5++;
                              continue L10;
                            }
                          }
                        } else {
                          dl.field_s[var5] = -1;
                          var5++;
                          continue L9;
                        }
                      }
                    }
                  } else {
                    var3_int = ga.a(0, pf.field_c, wf.field_e, aj.field_b, ni.a(new String[1], 0, qf.field_b));
                    var4 = -1;
                    var5 = 0;
                    L11: while (true) {
                      L12: {
                        if (var5 >= var3_int) {
                          break L12;
                        } else {
                          if (!"<%0>".equals((Object) (Object) wf.field_e[var5])) {
                            var5++;
                            continue L11;
                          } else {
                            var4 = var5;
                            break L12;
                          }
                        }
                      }
                      if (var4 != -1) {
                        ji.field_n = new String[var4];
                        he.a((Object[]) (Object) wf.field_e, 0, (Object[]) (Object) ji.field_n, 0, var4);
                        jl.field_c = new String[-1 + (var3_int - var4)];
                        he.a((Object[]) (Object) wf.field_e, var4 + 1, (Object[]) (Object) jl.field_c, 0, -var4 + var3_int + -1);
                        var3_int = ga.a(0, pf.field_c, wf.field_e, aj.field_b, ni.a(new String[1], 0, wb.field_q));
                        var4 = -1;
                        var5 = 0;
                        L13: while (true) {
                          L14: {
                            if (var3_int <= var5) {
                              break L14;
                            } else {
                              if ("<%0>".equals((Object) (Object) wf.field_e[var5])) {
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
                              qb.field_c = new String[var4];
                              he.a((Object[]) (Object) wf.field_e, 0, (Object[]) (Object) qb.field_c, 0, var4);
                              qi.field_b = new String[-1 + (-var4 + var3_int)];
                              he.a((Object[]) (Object) wf.field_e, 1 + var4, (Object[]) (Object) qi.field_b, 0, -1 + (-var4 + var3_int));
                              if (qb.field_c.length > ji.field_n.length) {
                                stackOut_28_0 = qb.field_c.length;
                                stackIn_29_0 = stackOut_28_0;
                                break L15;
                              } else {
                                stackOut_27_0 = ji.field_n.length;
                                stackIn_29_0 = stackOut_27_0;
                                break L15;
                              }
                            }
                            L16: {
                              var5 = stackIn_29_0;
                              if (qi.field_b.length > jl.field_c.length) {
                                stackOut_31_0 = qi.field_b.length;
                                stackIn_32_0 = stackOut_31_0;
                                break L16;
                              } else {
                                stackOut_30_0 = jl.field_c.length;
                                stackIn_32_0 = stackOut_30_0;
                                break L16;
                              }
                            }
                            var6 = stackIn_32_0;
                            var7 = 7 + (var5 - -var6);
                            gf.field_s = new String[var7];
                            dl.field_s = new int[var7];
                            var8 = 0;
                            L17: while (true) {
                              if (var7 <= var8) {
                                dl.field_s[1] = 0;
                                gf.field_s[0] = kl.field_c;
                                pe.field_db = new int[2];
                                gf.field_s[1] = ua.field_a;
                                gf.field_s[2] = fb.field_i;
                                gf.field_s[3] = ti.field_c;
                                pe.field_db[0] = 5;
                                gf.field_s[4] = tk.field_T;
                                pe.field_db[1] = 2;
                                gf.field_s[5] = "";
                                dl.field_s[3] = 1;
                                var8 = 0;
                                L18: while (true) {
                                  if (var5 <= var8) {
                                    gf.field_s[6 - -var5] = null;
                                    dl.field_s[var5 + 6] = -2;
                                    var8 = 0;
                                    L19: while (true) {
                                      if (var6 <= var8) {
                                        fd.field_e = ol.a(256);
                                        break L1;
                                      } else {
                                        L20: {
                                          stackOut_43_0 = gf.field_s;
                                          stackOut_43_1 = var8 + 7 + var5;
                                          stackIn_45_0 = stackOut_43_0;
                                          stackIn_45_1 = stackOut_43_1;
                                          stackIn_44_0 = stackOut_43_0;
                                          stackIn_44_1 = stackOut_43_1;
                                          if (qi.field_b.length > var8) {
                                            stackOut_45_0 = (String[]) (Object) stackIn_45_0;
                                            stackOut_45_1 = stackIn_45_1;
                                            stackOut_45_2 = qi.field_b[var8];
                                            stackIn_46_0 = stackOut_45_0;
                                            stackIn_46_1 = stackOut_45_1;
                                            stackIn_46_2 = stackOut_45_2;
                                            break L20;
                                          } else {
                                            stackOut_44_0 = (String[]) (Object) stackIn_44_0;
                                            stackOut_44_1 = stackIn_44_1;
                                            stackOut_44_2 = "";
                                            stackIn_46_0 = stackOut_44_0;
                                            stackIn_46_1 = stackOut_44_1;
                                            stackIn_46_2 = stackOut_44_2;
                                            break L20;
                                          }
                                        }
                                        stackIn_46_0[stackIn_46_1] = stackIn_46_2;
                                        var8++;
                                        continue L19;
                                      }
                                    }
                                  } else {
                                    L21: {
                                      stackOut_37_0 = gf.field_s;
                                      stackOut_37_1 = 6 - -var8;
                                      stackIn_39_0 = stackOut_37_0;
                                      stackIn_39_1 = stackOut_37_1;
                                      stackIn_38_0 = stackOut_37_0;
                                      stackIn_38_1 = stackOut_37_1;
                                      if (0 > -var5 + (var8 - -qb.field_c.length)) {
                                        stackOut_39_0 = (String[]) (Object) stackIn_39_0;
                                        stackOut_39_1 = stackIn_39_1;
                                        stackOut_39_2 = "";
                                        stackIn_40_0 = stackOut_39_0;
                                        stackIn_40_1 = stackOut_39_1;
                                        stackIn_40_2 = stackOut_39_2;
                                        break L21;
                                      } else {
                                        stackOut_38_0 = (String[]) (Object) stackIn_38_0;
                                        stackOut_38_1 = stackIn_38_1;
                                        stackOut_38_2 = qb.field_c[-var5 + (qb.field_c.length + var8)];
                                        stackIn_40_0 = stackOut_38_0;
                                        stackIn_40_1 = stackOut_38_1;
                                        stackIn_40_2 = stackOut_38_2;
                                        break L21;
                                      }
                                    }
                                    stackIn_40_0[stackIn_40_1] = stackIn_40_2;
                                    var8++;
                                    continue L18;
                                  }
                                }
                              } else {
                                dl.field_s[var8] = -1;
                                var8++;
                                continue L17;
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
                }
              } else {
                var3_int = ga.a(0, pf.field_c, wf.field_e, aj.field_b, ll.field_c);
                var4 = 3 + var3_int;
                dl.field_s = new int[var4];
                gf.field_s = new String[var4];
                var5 = 0;
                L22: while (true) {
                  if (var4 <= var5) {
                    pe.field_db = new int[2];
                    var5 = 0;
                    L23: while (true) {
                      if (var5 >= var3_int) {
                        gf.field_s[-3 + var4] = "";
                        gf.field_s[var4 - 2] = cb.field_d;
                        dl.field_s[-2 + var4] = 0;
                        pe.field_db[0] = 4;
                        gf.field_s[-1 + var4] = ab.field_n;
                        dl.field_s[-1 + var4] = 1;
                        pe.field_db[1] = 5;
                        break L1;
                      } else {
                        gf.field_s[var5] = wf.field_e[var5];
                        var5++;
                        continue L23;
                      }
                    }
                  } else {
                    dl.field_s[var5] = -1;
                    var5++;
                    continue L22;
                  }
                }
              }
            }
            ui.field_c.field_b = pe.field_db.length;
            var3_int = 0;
            var4 = 0;
            L24: while (true) {
              if (var4 >= gf.field_s.length) {
                L25: {
                  if (nd.field_c == 2) {
                    var10 = ji.field_n;
                    var5 = 0;
                    L26: while (true) {
                      if (var10.length <= var5) {
                        var11 = jl.field_c;
                        var5 = 0;
                        L27: while (true) {
                          if (var11.length <= var5) {
                            break L25;
                          } else {
                            L28: {
                              var13 = var11[var5];
                              var7 = ki.a((byte) -18, false, var13);
                              if (var7 > var3_int) {
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
                          var7 = ki.a((byte) -18, false, var12);
                          if (var7 <= var3_int) {
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
                qe.field_R = dg.field_ab + -(var3_int >> 1);
                fh.field_c = ui.field_c.field_b * (ai.field_a + uc.field_Y << 1);
                sd.field_a = -(var3_int >> 1) + (var3_int + dg.field_ab);
                var4 = 0;
                L30: while (true) {
                  if (gf.field_s.length <= var4) {
                    jl.field_e = -(fh.field_c >> 1) + ii.field_c;
                    r.field_h = new int[gf.field_s.length][];
                    var4 = 0;
                    var5 = jl.field_e;
                    L31: while (true) {
                      if (gf.field_s.length <= var4) {
                        L32: {
                          if (2 == nd.field_c) {
                            ui.field_c.a((byte) -86, param2, -1, -1);
                            break L32;
                          } else {
                            ui.field_c.a((byte) 13, param2, 0, ha.a(ph.field_d, kc.field_u, -36));
                            break L32;
                          }
                        }
                        break L0;
                      } else {
                        L33: {
                          var6 = dl.field_s[var4];
                          if (0 > var6) {
                            var5 = var5 + ok.field_e;
                            break L33;
                          } else {
                            var7 = ki.a((byte) -18, true, gf.field_s[var4]);
                            var5 = var5 + uc.field_Y;
                            var8 = -(var7 >> 1) + dg.field_ab;
                            r.field_h[var4] = new int[4];
                            r.field_h[var4][0] = var8 - ni.field_i;
                            r.field_h[var4][1] = var5;
                            r.field_h[var4][2] = (ni.field_i << 1) + var7;
                            var5 = var5 + (uc.field_Y + (ai.field_a << 1) + sl.field_f);
                            r.field_h[var4][3] = sl.field_f + (ai.field_a << 1);
                            break L33;
                          }
                        }
                        var4++;
                        continue L31;
                      }
                    }
                  } else {
                    L34: {
                      stackOut_107_0 = fh.field_c;
                      stackIn_109_0 = stackOut_107_0;
                      stackIn_108_0 = stackOut_107_0;
                      if (dl.field_s[var4] >= 0) {
                        stackOut_109_0 = stackIn_109_0;
                        stackOut_109_1 = sl.field_f;
                        stackIn_110_0 = stackOut_109_0;
                        stackIn_110_1 = stackOut_109_1;
                        break L34;
                      } else {
                        stackOut_108_0 = stackIn_108_0;
                        stackOut_108_1 = ok.field_e;
                        stackIn_110_0 = stackOut_108_0;
                        stackIn_110_1 = stackOut_108_1;
                        break L34;
                      }
                    }
                    fh.field_c = stackIn_110_0 + stackIn_110_1;
                    var4++;
                    continue L30;
                  }
                }
              } else {
                L35: {
                  stackOut_85_0 = -18;
                  stackIn_87_0 = stackOut_85_0;
                  stackIn_86_0 = stackOut_85_0;
                  if (dl.field_s[var4] < 0) {
                    stackOut_87_0 = stackIn_87_0;
                    stackOut_87_1 = 0;
                    stackIn_88_0 = stackOut_87_0;
                    stackIn_88_1 = stackOut_87_1;
                    break L35;
                  } else {
                    stackOut_86_0 = stackIn_86_0;
                    stackOut_86_1 = 1;
                    stackIn_88_0 = stackOut_86_0;
                    stackIn_88_1 = stackOut_86_1;
                    break L35;
                  }
                }
                L36: {
                  var5 = ki.a((byte) stackIn_88_0, stackIn_88_1 != 0, gf.field_s[var4]);
                  if (var3_int < var5) {
                    var3_int = var5;
                    break L36;
                  } else {
                    break L36;
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
          throw oj.a((Throwable) (Object) var3, "gj.M(" + -1 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, ee param1, int param2, ga param3, byte param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        String var6_ref = null;
        int var7 = 0;
        eg stackIn_19_0 = null;
        String stackIn_19_1 = null;
        eg stackIn_20_0 = null;
        String stackIn_20_1 = null;
        eg stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        eg stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        eg stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        eg stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        eg stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        eg stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        int stackIn_26_7 = 0;
        eg stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        int stackIn_27_8 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        eg stackOut_18_0 = null;
        String stackOut_18_1 = null;
        eg stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        eg stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        eg stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        eg stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        eg stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        eg stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        int stackOut_24_7 = 0;
        eg stackOut_26_0 = null;
        String stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        int stackOut_26_8 = 0;
        eg stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int stackOut_25_7 = 0;
        int stackOut_25_8 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            L1: {
              hd.a(((gj) this).field_k, param1.field_l, param1.field_p, (byte) 95, param1.field_i + param0, param1.field_m + param2);
              if (null != ((gj) this).field_e) {
                L2: {
                  var6_int = param2 - -param1.field_m + ((gj) this).field_f;
                  var7 = param1.field_i + (param0 + ((gj) this).field_h);
                  if (param3.field_e == 1) {
                    var6_int = var6_int + (param1.field_p + -((gj) this).field_e.field_q) / 2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param3.field_i != 1) {
                    break L3;
                  } else {
                    var7 = var7 + (param1.field_l + -((gj) this).field_e.field_v) / 2;
                    break L3;
                  }
                }
                L4: {
                  if (param3.field_e != 2) {
                    break L4;
                  } else {
                    var6_int = var6_int + (param1.field_p - ((gj) this).field_e.field_q);
                    break L4;
                  }
                }
                L5: {
                  if (param3.field_i == 2) {
                    var7 = var7 + (param1.field_l + -((gj) this).field_e.field_v);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((gj) this).field_e.g(var6_int, var7);
                break L1;
              } else {
                break L1;
              }
            }
            L6: {
              var6_ref = param3.a(param1, -6782);
              if (param4 == 44) {
                break L6;
              } else {
                gj discarded$2 = ((gj) this).b(-104, 43);
                break L6;
              }
            }
            L7: {
              if (var6_ref == null) {
                break L7;
              } else {
                if (param3.field_g == null) {
                  break L7;
                } else {
                  if (((gj) this).field_i < 0) {
                    break L7;
                  } else {
                    L8: {
                      stackOut_18_0 = param3.field_g;
                      stackOut_18_1 = (String) var6_ref;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      if (((gj) this).field_f == -2147483648) {
                        stackOut_20_0 = (eg) (Object) stackIn_20_0;
                        stackOut_20_1 = (String) (Object) stackIn_20_1;
                        stackOut_20_2 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        stackIn_21_2 = stackOut_20_2;
                        break L8;
                      } else {
                        stackOut_19_0 = (eg) (Object) stackIn_19_0;
                        stackOut_19_1 = (String) (Object) stackIn_19_1;
                        stackOut_19_2 = ((gj) this).field_f;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_21_2 = stackOut_19_2;
                        break L8;
                      }
                    }
                    L9: {
                      stackOut_21_0 = (eg) (Object) stackIn_21_0;
                      stackOut_21_1 = (String) (Object) stackIn_21_1;
                      stackOut_21_2 = stackIn_21_2 + (param3.field_r + (param1.field_m + param2));
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      stackIn_23_2 = stackOut_21_2;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      stackIn_22_2 = stackOut_21_2;
                      if (((gj) this).field_h != -2147483648) {
                        stackOut_23_0 = (eg) (Object) stackIn_23_0;
                        stackOut_23_1 = (String) (Object) stackIn_23_1;
                        stackOut_23_2 = stackIn_23_2;
                        stackOut_23_3 = ((gj) this).field_h;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        stackIn_24_3 = stackOut_23_3;
                        break L9;
                      } else {
                        stackOut_22_0 = (eg) (Object) stackIn_22_0;
                        stackOut_22_1 = (String) (Object) stackIn_22_1;
                        stackOut_22_2 = stackIn_22_2;
                        stackOut_22_3 = 0;
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        stackIn_24_2 = stackOut_22_2;
                        stackIn_24_3 = stackOut_22_3;
                        break L9;
                      }
                    }
                    L10: {
                      stackOut_24_0 = (eg) (Object) stackIn_24_0;
                      stackOut_24_1 = (String) (Object) stackIn_24_1;
                      stackOut_24_2 = stackIn_24_2;
                      stackOut_24_3 = stackIn_24_3 + param1.field_i + (param0 + param3.field_a);
                      stackOut_24_4 = -param3.field_p + -param3.field_r + param1.field_p;
                      stackOut_24_5 = param1.field_l + -param3.field_a - param3.field_b;
                      stackOut_24_6 = ((gj) this).field_i;
                      stackOut_24_7 = ((gj) this).field_g;
                      stackIn_26_0 = stackOut_24_0;
                      stackIn_26_1 = stackOut_24_1;
                      stackIn_26_2 = stackOut_24_2;
                      stackIn_26_3 = stackOut_24_3;
                      stackIn_26_4 = stackOut_24_4;
                      stackIn_26_5 = stackOut_24_5;
                      stackIn_26_6 = stackOut_24_6;
                      stackIn_26_7 = stackOut_24_7;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      stackIn_25_2 = stackOut_24_2;
                      stackIn_25_3 = stackOut_24_3;
                      stackIn_25_4 = stackOut_24_4;
                      stackIn_25_5 = stackOut_24_5;
                      stackIn_25_6 = stackOut_24_6;
                      stackIn_25_7 = stackOut_24_7;
                      if (((gj) this).field_j != -2147483648) {
                        stackOut_26_0 = (eg) (Object) stackIn_26_0;
                        stackOut_26_1 = (String) (Object) stackIn_26_1;
                        stackOut_26_2 = stackIn_26_2;
                        stackOut_26_3 = stackIn_26_3;
                        stackOut_26_4 = stackIn_26_4;
                        stackOut_26_5 = stackIn_26_5;
                        stackOut_26_6 = stackIn_26_6;
                        stackOut_26_7 = stackIn_26_7;
                        stackOut_26_8 = ((gj) this).field_j;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        stackIn_27_2 = stackOut_26_2;
                        stackIn_27_3 = stackOut_26_3;
                        stackIn_27_4 = stackOut_26_4;
                        stackIn_27_5 = stackOut_26_5;
                        stackIn_27_6 = stackOut_26_6;
                        stackIn_27_7 = stackOut_26_7;
                        stackIn_27_8 = stackOut_26_8;
                        break L10;
                      } else {
                        stackOut_25_0 = (eg) (Object) stackIn_25_0;
                        stackOut_25_1 = (String) (Object) stackIn_25_1;
                        stackOut_25_2 = stackIn_25_2;
                        stackOut_25_3 = stackIn_25_3;
                        stackOut_25_4 = stackIn_25_4;
                        stackOut_25_5 = stackIn_25_5;
                        stackOut_25_6 = stackIn_25_6;
                        stackOut_25_7 = stackIn_25_7;
                        stackOut_25_8 = 256;
                        stackIn_27_0 = stackOut_25_0;
                        stackIn_27_1 = stackOut_25_1;
                        stackIn_27_2 = stackOut_25_2;
                        stackIn_27_3 = stackOut_25_3;
                        stackIn_27_4 = stackOut_25_4;
                        stackIn_27_5 = stackOut_25_5;
                        stackIn_27_6 = stackOut_25_6;
                        stackIn_27_7 = stackOut_25_7;
                        stackIn_27_8 = stackOut_25_8;
                        break L10;
                      }
                    }
                    int discarded$3 = ((eg) (Object) stackIn_27_0).a(stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_27_8, param3.field_e, param3.field_i, param3.field_n);
                    break L7;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var6;
            stackOut_29_1 = new StringBuilder().append("gj.A(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L11;
            }
          }
          L12: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param2).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param3 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L12;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L12;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + param4 + ')');
        }
    }

    final static String a(int param0, byte param1, int param2) {
        return param2 + "/" + 10;
    }

    final gj b(int param0, byte param1) {
        ((gj) this).field_g = param0;
        int var3 = 89 % ((param1 - 48) / 54);
        return (gj) this;
    }

    final void a(int param0, gj param1, ga param2, int param3, int param4, ee param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              if (((gj) this).field_d) {
                param1.a(param4, param5, param0, param2, (byte) 44);
                param1.b(param3 ^ -15012);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((gj) this).field_f != -2147483648) {
                param1.field_f = ((gj) this).field_f;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (((gj) this).field_g >= -1) {
                param1.field_g = ((gj) this).field_g;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (-2147483648 != ((gj) this).field_h) {
                param1.field_h = ((gj) this).field_h;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (((gj) this).field_j != -2147483648) {
                param1.field_j = ((gj) this).field_j;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (null != ((gj) this).field_e) {
                param1.field_e = ((gj) this).field_e;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (((gj) this).field_i < param3) {
                break L7;
              } else {
                param1.field_i = ((gj) this).field_i;
                break L7;
              }
            }
            L8: {
              if (null == ((gj) this).field_k) {
                break L8;
              } else {
                param1.field_k = ((gj) this).field_k;
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var7;
            stackOut_23_1 = new StringBuilder().append("gj.I(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          L10: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L10;
            }
          }
          L11: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param5 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L11;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ')');
        }
    }

    final gj a(int param0, int param1) {
        if (param1 != 0) {
            return null;
        }
        ((gj) this).field_h = param0;
        return (gj) this;
    }

    final void b(int param0) {
        ((gj) this).field_i = 0;
        ((gj) this).field_e = null;
        ((gj) this).field_g = -1;
        ((gj) this).field_h = 0;
        ((gj) this).field_j = 256;
        if (param0 != 15011) {
            return;
        }
        ((gj) this).field_k = null;
        ((gj) this).field_f = 0;
    }

    gj() {
        ((gj) this).field_j = -2147483648;
        ((gj) this).field_f = -2147483648;
        ((gj) this).field_g = -2;
        ((gj) this).field_e = null;
        ((gj) this).field_k = null;
        ((gj) this).field_d = false;
        ((gj) this).field_h = -2147483648;
        ((gj) this).field_i = -2;
    }

    static {
    }
}
