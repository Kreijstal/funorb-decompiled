/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -20) {
                break L1;
              } else {
                this.field_f = 116;
                break L1;
              }
            }
            this.field_k = param1;
            stackIn_3_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("gj.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (gj) (this);
    }

    final gj a(boolean param0, int param1) {
        if (param1 != -1) {
            return (gj) null;
        }
        this.field_d = param0 ? true : false;
        return (gj) (this);
    }

    final gj a(int param0, byte param1) {
        this.field_f = param0;
        if (param1 != 118) {
            return (gj) null;
        }
        return (gj) (this);
    }

    public static void a(int param0) {
        if (param0 != -909082559) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    final gj b(int param0, int param1) {
        if (param0 != -764) {
            return (gj) null;
        }
        this.field_i = param1;
        return (gj) (this);
    }

    final void a(gj param0, byte param1) {
        param0.field_e = this.field_e;
        if (param1 != 73) {
            return;
        }
        try {
            param0.field_j = this.field_j;
            param0.field_k = this.field_k;
            param0.field_h = this.field_h;
            param0.field_g = this.field_g;
            param0.field_d = this.field_d;
            param0.field_i = this.field_i;
            param0.field_f = this.field_f;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "gj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        String[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        String[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        String stackIn_40_2 = null;
        String[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        int stackIn_44_3 = 0;
        String stackIn_47_2 = null;
        int stackIn_88_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_110_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
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
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              gi.field_c = true;
              nd.field_c = param1;
              if (param0 != (nd.field_c ^ -1)) {
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
                      if ((nd.field_c ^ -1) == -5) {
                        var3_int = ga.a(param0 ^ -1, pf.field_c, wf.field_e, aj.field_b, uc.field_T);
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
                    var3_int = ga.a(0, pf.field_c, wf.field_e, aj.field_b, ni.a(new String[]{"<br><%0><br>"}, 0, qf.field_b));
                    var4 = -1;
                    var5 = 0;
                    L11: while (true) {
                      L12: {
                        if (var5 >= var3_int) {
                          break L12;
                        } else {
                          if (!"<%0>".equals(wf.field_e[var5])) {
                            var5++;
                            continue L11;
                          } else {
                            var4 = var5;
                            break L12;
                          }
                        }
                      }
                      if (0 != (var4 ^ -1)) {
                        ji.field_n = new String[var4];
                        he.a(wf.field_e, 0, ji.field_n, 0, var4);
                        jl.field_c = new String[-1 + (var3_int - var4)];
                        he.a(wf.field_e, var4 + 1, jl.field_c, 0, -var4 + var3_int + -1);
                        var3_int = ga.a(param0 ^ -1, pf.field_c, wf.field_e, aj.field_b, ni.a(new String[]{"<br><%0><br>"}, 0, wb.field_q));
                        var4 = -1;
                        var5 = 0;
                        L13: while (true) {
                          L14: {
                            if (var3_int <= var5) {
                              break L14;
                            } else {
                              if ("<%0>".equals(wf.field_e[var5])) {
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
                              he.a(wf.field_e, 0, qb.field_c, 0, var4);
                              qi.field_b = new String[-1 + (-var4 + var3_int)];
                              he.a(wf.field_e, 1 + var4, qi.field_b, 0, -1 + (-var4 + var3_int));
                              if (qb.field_c.length > ji.field_n.length) {
                                stackIn_29_0 = qb.field_c.length;
                                break L15;
                              } else {
                                stackIn_29_0 = ji.field_n.length;
                                break L15;
                              }
                            }
                            L16: {
                              var5 = stackIn_29_0;
                              if (qi.field_b.length > jl.field_c.length) {
                                stackIn_32_0 = qi.field_b.length;
                                break L16;
                              } else {
                                stackIn_32_0 = jl.field_c.length;
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
                                        stackIn_44_0 = gf.field_s;
                                        stackIn_44_1 = var8 + 7 + var5;
                                        stackIn_44_2 = qi.field_b.length ^ -1;
                                        stackIn_44_3 = var8 ^ -1;
                                        L20: {




                                          if (stackIn_44_2 < stackIn_44_3) {
                                            stackIn_44_0 = (String[]) ((Object) stackIn_44_0);

                                            stackIn_47_2 = qi.field_b[var8];
                                            break L20;
                                          } else {
                                            stackIn_44_0 = (String[]) ((Object) stackIn_44_0);

                                            stackIn_47_2 = "";
                                            break L20;
                                          }
                                        }
                                        stackIn_44_0[stackIn_44_1] = stackIn_47_2;
                                        var8++;
                                        continue L19;
                                      }
                                    }
                                  } else {
                                    L21: {
                                      stackIn_39_0 = gf.field_s;

                                      stackIn_39_1 = 6 - -var8;

                                      if (0 > -var5 + (var8 - -qb.field_c.length)) {
                                        stackIn_40_0 = (String[]) ((Object) stackIn_39_0);
                                        stackIn_40_1 = stackIn_39_1;
                                        stackIn_40_2 = "";
                                        break L21;
                                      } else {
                                        stackIn_40_0 = (String[]) ((Object) stackIn_39_0);
                                        stackIn_40_1 = stackIn_39_1;
                                        stackIn_40_2 = qb.field_c[-var5 + (qb.field_c.length + var8)];
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
                    var4_ref_String__ = var10;
                    var5 = 0;
                    L26: while (true) {
                      if (var10.length <= var5) {
                        var4_ref_String__ = jl.field_c;
                        var5 = 0;
                        L27: while (true) {
                          if (var4_ref_String__.length <= var5) {
                            break L25;
                          } else {
                            L28: {
                              var12 = var4_ref_String__[var5];
                              var7 = ki.a((byte) -18, false, var12);
                              if ((var7 ^ -1) < (var3_int ^ -1)) {
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
                        var11 = var10[var5];
                        var7 = ki.a((byte) -18, false, var11);
                        if (var7 > var3_int) {
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
                qe.field_R = dg.field_ab + -(var3_int >> -1415445375);
                fh.field_c = ui.field_c.field_b * (ai.field_a + uc.field_Y << -729991359);
                sd.field_a = -(var3_int >> -1292213855) + (var3_int + dg.field_ab);
                var4 = 0;
                L29: while (true) {
                  if (gf.field_s.length <= var4) {
                    jl.field_e = -(fh.field_c >> -909082559) + ii.field_c;
                    r.field_h = new int[gf.field_s.length][];
                    var4 = 0;
                    var5 = jl.field_e;
                    L30: while (true) {
                      if (gf.field_s.length <= var4) {
                        L31: {
                          if (2 == nd.field_c) {
                            ui.field_c.a((byte) -86, param2, -1, -1);
                            break L31;
                          } else {
                            ui.field_c.a((byte) 13, param2, 0, ha.a(ph.field_d, kc.field_u, -36));
                            break L31;
                          }
                        }
                        break L0;
                      } else {
                        L32: {
                          var6 = dl.field_s[var4];
                          if (0 > var6) {
                            var5 = var5 + ok.field_e;
                            break L32;
                          } else {
                            var7 = ki.a((byte) -18, true, gf.field_s[var4]);
                            var5 = var5 + uc.field_Y;
                            var8 = -(var7 >> 305552833) + dg.field_ab;
                            r.field_h[var4] = new int[4];
                            r.field_h[var4][0] = var8 - ni.field_i;
                            r.field_h[var4][1] = var5;
                            r.field_h[var4][2] = (ni.field_i << -2027668831) + var7;
                            var5 = var5 + (uc.field_Y + (ai.field_a << -1908381375) + sl.field_f);
                            r.field_h[var4][3] = sl.field_f + (ai.field_a << -38028927);
                            break L32;
                          }
                        }
                        var4++;
                        continue L30;
                      }
                    }
                  } else {
                    L33: {
                      stackIn_110_0 = fh.field_c;

                      if (-1 >= (dl.field_s[var4] ^ -1)) {
                        stackIn_111_0 = stackIn_110_0;
                        stackIn_111_1 = sl.field_f;
                        break L33;
                      } else {
                        stackIn_111_0 = stackIn_110_0;
                        stackIn_111_1 = ok.field_e;
                        break L33;
                      }
                    }
                    fh.field_c = stackIn_111_0 + stackIn_111_1;
                    var4++;
                    continue L29;
                  }
                }
              } else {
                L34: {
                  stackIn_88_0 = -18;

                  if (dl.field_s[var4] < 0) {
                    stackIn_89_0 = stackIn_88_0;
                    stackIn_89_1 = 0;
                    break L34;
                  } else {
                    stackIn_89_0 = stackIn_88_0;
                    stackIn_89_1 = 1;
                    break L34;
                  }
                }
                L35: {
                  var5 = ki.a((byte) stackIn_89_0, stackIn_89_1 != 0, gf.field_s[var4]);
                  if (var3_int < var5) {
                    var3_int = var5;
                    break L35;
                  } else {
                    break L35;
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
          throw oj.a((Throwable) ((Object) var3), "gj.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, ee param1, int param2, ga param3, byte param4) {
        eg stackIn_20_0 = null;
        String stackIn_20_1 = null;
        eg stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_23_2 = 0;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_26_3;
        int stackIn_26_4;
        int stackIn_26_5;
        int stackIn_26_6;
        int stackIn_26_7;
        int stackIn_27_3;
        int stackIn_27_4;
        int stackIn_27_5;
        int stackIn_27_6;
        int stackIn_27_7;
        int stackIn_27_8;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              hd.a(this.field_k, param1.field_l, param1.field_p, (byte) 95, param1.field_i + param0, param1.field_m + param2);
              if (null != this.field_e) {
                L2: {
                  var6_int = param2 - -param1.field_m + this.field_f;
                  var7 = param1.field_i + (param0 + this.field_h);
                  if (-2 == (param3.field_e ^ -1)) {
                    var6_int = var6_int + (param1.field_p + -this.field_e.field_q) / 2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param3.field_i != 1) {
                    break L3;
                  } else {
                    var7 = var7 + (param1.field_l + -this.field_e.field_v) / 2;
                    break L3;
                  }
                }
                L4: {
                  if (param3.field_e != 2) {
                    break L4;
                  } else {
                    var6_int = var6_int + (param1.field_p - this.field_e.field_q);
                    break L4;
                  }
                }
                L5: {
                  if (-3 == (param3.field_i ^ -1)) {
                    var7 = var7 + (param1.field_l + -this.field_e.field_v);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                this.field_e.g(var6_int, var7);
                break L1;
              } else {
                break L1;
              }
            }
            L6: {
              var6 = param3.a(param1, -6782);
              if (param4 == 44) {
                break L6;
              } else {
                this.b(-104, 43);
                break L6;
              }
            }
            L7: {
              if (var6 == null) {
                break L7;
              } else {
                if (param3.field_g == null) {
                  break L7;
                } else {
                  if (-1 < (this.field_i ^ -1)) {
                    break L7;
                  } else {
                    L8: {
                      stackIn_20_0 = param3.field_g;

                      stackIn_20_1 = (String) (var6);

                      if (this.field_f == -2147483648) {
                        stackIn_21_0 = (eg) ((Object) stackIn_20_0);
                        stackIn_21_1 = (String) ((Object) stackIn_20_1);
                        stackIn_21_2 = 0;
                        break L8;
                      } else {
                        stackIn_21_0 = (eg) ((Object) stackIn_20_0);
                        stackIn_21_1 = (String) ((Object) stackIn_20_1);
                        stackIn_21_2 = this.field_f;
                        break L8;
                      }
                    }
                    L9: {




                      stackIn_23_2 = stackIn_21_2 + (param3.field_r + (param1.field_m + param2));

                      if ((this.field_h ^ -1) != 2147483647) {
                        stackIn_21_0 = (eg) ((Object) stackIn_21_0);
                        stackIn_21_1 = (String) ((Object) stackIn_21_1);
                        stackIn_24_2 = stackIn_23_2;
                        stackIn_24_3 = this.field_h;
                        break L9;
                      } else {
                        stackIn_21_0 = (eg) ((Object) stackIn_21_0);
                        stackIn_21_1 = (String) ((Object) stackIn_21_1);
                        stackIn_24_2 = stackIn_23_2;
                        stackIn_24_3 = 0;
                        break L9;
                      }
                    }
                    L10: {






                      stackIn_26_3 = stackIn_24_3 + param1.field_i + (param0 + param3.field_a);

                      stackIn_26_4 = -param3.field_p + -param3.field_r + param1.field_p;

                      stackIn_26_5 = param1.field_l + -param3.field_a - param3.field_b;

                      stackIn_26_6 = this.field_i;

                      stackIn_26_7 = this.field_g;

                      if (this.field_j != -2147483648) {
                        stackIn_21_0 = (eg) ((Object) stackIn_21_0);
                        stackIn_21_1 = (String) ((Object) stackIn_21_1);

                        stackIn_27_3 = stackIn_26_3;
                        stackIn_27_4 = stackIn_26_4;
                        stackIn_27_5 = stackIn_26_5;
                        stackIn_27_6 = stackIn_26_6;
                        stackIn_27_7 = stackIn_26_7;
                        stackIn_27_8 = this.field_j;
                        break L10;
                      } else {
                        stackIn_21_0 = (eg) ((Object) stackIn_21_0);
                        stackIn_21_1 = (String) ((Object) stackIn_21_1);

                        stackIn_27_3 = stackIn_26_3;
                        stackIn_27_4 = stackIn_26_4;
                        stackIn_27_5 = stackIn_26_5;
                        stackIn_27_6 = stackIn_26_6;
                        stackIn_27_7 = stackIn_26_7;
                        stackIn_27_8 = 256;
                        break L10;
                      }
                    }
                    ((eg) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_24_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_27_8, param3.field_e, param3.field_i, param3.field_n);
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
            var6_ref = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var6_ref);

            stackIn_31_1 = new StringBuilder().append("gj.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L11;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L12;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L12;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_32_0), stackIn_35_2 + ',' + param4 + ')');
        }
    }

    final static String a(int param0, byte param1, int param2) {
        if (param1 != -123) {
            field_c = 114;
        }
        return param2 + "/" + param0;
    }

    final gj b(int param0, byte param1) {
        this.field_g = param0;
        int var3 = 89 % ((param1 - 48) / 54);
        return (gj) (this);
    }

    final void a(int param0, gj param1, ga param2, int param3, int param4, ee param5) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (this.field_d) {
                param1.a(param4, param5, param0, param2, (byte) 44);
                param1.b(param3 ^ -15012);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((this.field_f ^ -1) != 2147483647) {
                param1.field_f = this.field_f;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (0 >= (this.field_g ^ -1)) {
                param1.field_g = this.field_g;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (-2147483648 != this.field_h) {
                param1.field_h = this.field_h;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (2147483647 != (this.field_j ^ -1)) {
                param1.field_j = this.field_j;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (null != this.field_e) {
                param1.field_e = this.field_e;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (this.field_i < param3) {
                break L7;
              } else {
                param1.field_i = this.field_i;
                break L7;
              }
            }
            L8: {
              if (null == this.field_k) {
                break L8;
              } else {
                param1.field_k = this.field_k;
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var7);

            stackIn_25_1 = new StringBuilder().append("gj.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param2 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L10;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L11;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L11;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_26_0), stackIn_32_2 + ')');
        }
    }

    final gj a(int param0, int param1) {
        if (param1 != 0) {
            return (gj) null;
        }
        this.field_h = param0;
        return (gj) (this);
    }

    final void b(int param0) {
        this.field_i = 0;
        this.field_e = null;
        this.field_g = -1;
        this.field_h = 0;
        this.field_j = 256;
        if (param0 != 15011) {
            return;
        }
        this.field_k = null;
        this.field_f = 0;
    }

    gj() {
        this.field_j = -2147483648;
        this.field_f = -2147483648;
        this.field_g = -2;
        this.field_e = null;
        this.field_k = null;
        this.field_d = false;
        this.field_h = -2147483648;
        this.field_i = -2;
    }

    static {
    }
}
