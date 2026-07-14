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
        if (param0 > -20) {
            ((gj) this).field_f = 116;
        }
        ((gj) this).field_k = param1;
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

    public static void a(int param0) {
        if (param0 != -909082559) {
            return;
        }
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
        param0.field_j = ((gj) this).field_j;
        param0.field_k = ((gj) this).field_k;
        param0.field_h = ((gj) this).field_h;
        param0.field_g = ((gj) this).field_g;
        param0.field_d = ((gj) this).field_d;
        param0.field_i = ((gj) this).field_i;
        param0.field_f = ((gj) this).field_f;
    }

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
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        String[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        String[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        String[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        String stackIn_39_2 = null;
        String[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        String[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        String[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        String stackIn_45_2 = null;
        int stackIn_85_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        int stackIn_105_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        String[] stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        String[] stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        String stackOut_44_2 = null;
        String[] stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        String stackOut_43_2 = null;
        String[] stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        String[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        String stackOut_38_2 = null;
        String[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        String stackOut_37_2 = null;
        int stackOut_104_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_84_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        L0: {
          var9 = TorChallenge.field_F ? 1 : 0;
          gi.field_c = true;
          nd.field_c = param1;
          if (param0 != (nd.field_c ^ -1)) {
            if (nd.field_c == 1) {
              var3 = ga.a(0, pf.field_c, wf.field_e, aj.field_b, ll.field_c);
              var4 = 2 - -var3;
              gf.field_s = new String[var4];
              dl.field_s = new int[var4];
              var5 = 0;
              L1: while (true) {
                if (var4 <= var5) {
                  pe.field_db = new int[1];
                  var5 = 0;
                  L2: while (true) {
                    if (var3 <= var5) {
                      gf.field_s[var4 + -2] = "";
                      gf.field_s[-1 + var4] = ab.field_n;
                      dl.field_s[var4 - 1] = 0;
                      pe.field_db[0] = 5;
                      break L0;
                    } else {
                      gf.field_s[var5] = wf.field_e[var5];
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  dl.field_s[var5] = -1;
                  var5++;
                  continue L1;
                }
              }
            } else {
              if (nd.field_c != 2) {
                if (3 != nd.field_c) {
                  if ((nd.field_c ^ -1) == -5) {
                    var3 = ga.a(param0 ^ -1, pf.field_c, wf.field_e, aj.field_b, uc.field_T);
                    var4 = 2 + var3;
                    gf.field_s = new String[var4];
                    dl.field_s = new int[var4];
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var4) {
                        pe.field_db = new int[1];
                        var5 = 0;
                        L4: while (true) {
                          if (var5 >= var3) {
                            gf.field_s[var4 - 2] = "";
                            gf.field_s[-1 + var4] = ab.field_n;
                            dl.field_s[var4 + -1] = 0;
                            pe.field_db[0] = 5;
                            break L0;
                          } else {
                            gf.field_s[var5] = wf.field_e[var5];
                            var5++;
                            continue L4;
                          }
                        }
                      } else {
                        dl.field_s[var5] = -1;
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    if (nd.field_c != 5) {
                      throw new IllegalArgumentException();
                    } else {
                      var3 = ga.a(0, pf.field_c, wf.field_e, aj.field_b, jd.field_d);
                      var4 = 3 + var3;
                      gf.field_s = new String[var4];
                      dl.field_s = new int[var4];
                      var5 = 0;
                      L5: while (true) {
                        if (var4 <= var5) {
                          pe.field_db = new int[2];
                          var5 = 0;
                          L6: while (true) {
                            if (var5 >= var3) {
                              gf.field_s[-3 + var4] = "";
                              gf.field_s[-2 + var4] = ak.field_g;
                              dl.field_s[-2 + var4] = 0;
                              pe.field_db[0] = 3;
                              gf.field_s[-1 + var4] = ab.field_n;
                              dl.field_s[var4 - 1] = 1;
                              pe.field_db[1] = 5;
                              break L0;
                            } else {
                              gf.field_s[var5] = wf.field_e[var5];
                              var5++;
                              continue L6;
                            }
                          }
                        } else {
                          dl.field_s[var5] = -1;
                          var5++;
                          continue L5;
                        }
                      }
                    }
                  }
                } else {
                  L7: {
                    if (!sh.field_u.field_g) {
                      var3 = ga.a(0, pf.field_c, wf.field_e, aj.field_b, d.field_z);
                      break L7;
                    } else {
                      var3 = ga.a(0, pf.field_c, wf.field_e, aj.field_b, cj.field_a);
                      break L7;
                    }
                  }
                  var4 = var3 + 2;
                  gf.field_s = new String[var4];
                  dl.field_s = new int[var4];
                  var5 = 0;
                  L8: while (true) {
                    if (var5 >= var4) {
                      pe.field_db = new int[1];
                      var5 = 0;
                      L9: while (true) {
                        if (var5 >= var3) {
                          gf.field_s[-2 + var4] = "";
                          gf.field_s[-1 + var4] = ab.field_n;
                          dl.field_s[-1 + var4] = 0;
                          pe.field_db[0] = 5;
                          break L0;
                        } else {
                          gf.field_s[var5] = wf.field_e[var5];
                          var5++;
                          continue L9;
                        }
                      }
                    } else {
                      dl.field_s[var5] = -1;
                      var5++;
                      continue L8;
                    }
                  }
                }
              } else {
                var3 = ga.a(0, pf.field_c, wf.field_e, aj.field_b, ni.a(new String[1], 0, qf.field_b));
                var4 = -1;
                var5 = 0;
                L10: while (true) {
                  L11: {
                    if (var5 >= var3) {
                      break L11;
                    } else {
                      if (!"<%0>".equals((Object) (Object) wf.field_e[var5])) {
                        var5++;
                        continue L10;
                      } else {
                        var4 = var5;
                        break L11;
                      }
                    }
                  }
                  if (0 != (var4 ^ -1)) {
                    ji.field_n = new String[var4];
                    he.a((Object[]) (Object) wf.field_e, 0, (Object[]) (Object) ji.field_n, 0, var4);
                    jl.field_c = new String[-1 + (var3 - var4)];
                    he.a((Object[]) (Object) wf.field_e, var4 + 1, (Object[]) (Object) jl.field_c, 0, -var4 + var3 + -1);
                    var3 = ga.a(param0 ^ -1, pf.field_c, wf.field_e, aj.field_b, ni.a(new String[1], 0, wb.field_q));
                    var4 = -1;
                    var5 = 0;
                    L12: while (true) {
                      L13: {
                        if (var3 <= var5) {
                          break L13;
                        } else {
                          if ("<%0>".equals((Object) (Object) wf.field_e[var5])) {
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
                          qb.field_c = new String[var4];
                          he.a((Object[]) (Object) wf.field_e, 0, (Object[]) (Object) qb.field_c, 0, var4);
                          qi.field_b = new String[-1 + (-var4 + var3)];
                          he.a((Object[]) (Object) wf.field_e, 1 + var4, (Object[]) (Object) qi.field_b, 0, -1 + (-var4 + var3));
                          if (qb.field_c.length > ji.field_n.length) {
                            stackOut_27_0 = qb.field_c.length;
                            stackIn_28_0 = stackOut_27_0;
                            break L14;
                          } else {
                            stackOut_26_0 = ji.field_n.length;
                            stackIn_28_0 = stackOut_26_0;
                            break L14;
                          }
                        }
                        L15: {
                          var5 = stackIn_28_0;
                          if (qi.field_b.length > jl.field_c.length) {
                            stackOut_30_0 = qi.field_b.length;
                            stackIn_31_0 = stackOut_30_0;
                            break L15;
                          } else {
                            stackOut_29_0 = jl.field_c.length;
                            stackIn_31_0 = stackOut_29_0;
                            break L15;
                          }
                        }
                        var6 = stackIn_31_0;
                        var7 = 7 + (var5 - -var6);
                        gf.field_s = new String[var7];
                        dl.field_s = new int[var7];
                        var8 = 0;
                        L16: while (true) {
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
                            L17: while (true) {
                              if (var5 <= var8) {
                                gf.field_s[6 - -var5] = null;
                                dl.field_s[var5 + 6] = -2;
                                var8 = 0;
                                L18: while (true) {
                                  if (var6 <= var8) {
                                    fd.field_e = ol.a(256);
                                    break L0;
                                  } else {
                                    L19: {
                                      stackOut_42_0 = gf.field_s;
                                      stackOut_42_1 = var8 + 7 + var5;
                                      stackIn_44_0 = stackOut_42_0;
                                      stackIn_44_1 = stackOut_42_1;
                                      stackIn_43_0 = stackOut_42_0;
                                      stackIn_43_1 = stackOut_42_1;
                                      if (qi.field_b.length > var8) {
                                        stackOut_44_0 = (String[]) (Object) stackIn_44_0;
                                        stackOut_44_1 = stackIn_44_1;
                                        stackOut_44_2 = qi.field_b[var8];
                                        stackIn_45_0 = stackOut_44_0;
                                        stackIn_45_1 = stackOut_44_1;
                                        stackIn_45_2 = stackOut_44_2;
                                        break L19;
                                      } else {
                                        stackOut_43_0 = (String[]) (Object) stackIn_43_0;
                                        stackOut_43_1 = stackIn_43_1;
                                        stackOut_43_2 = "";
                                        stackIn_45_0 = stackOut_43_0;
                                        stackIn_45_1 = stackOut_43_1;
                                        stackIn_45_2 = stackOut_43_2;
                                        break L19;
                                      }
                                    }
                                    stackIn_45_0[stackIn_45_1] = stackIn_45_2;
                                    var8++;
                                    continue L18;
                                  }
                                }
                              } else {
                                L20: {
                                  stackOut_36_0 = gf.field_s;
                                  stackOut_36_1 = 6 - -var8;
                                  stackIn_38_0 = stackOut_36_0;
                                  stackIn_38_1 = stackOut_36_1;
                                  stackIn_37_0 = stackOut_36_0;
                                  stackIn_37_1 = stackOut_36_1;
                                  if (0 > -var5 + (var8 - -qb.field_c.length)) {
                                    stackOut_38_0 = (String[]) (Object) stackIn_38_0;
                                    stackOut_38_1 = stackIn_38_1;
                                    stackOut_38_2 = "";
                                    stackIn_39_0 = stackOut_38_0;
                                    stackIn_39_1 = stackOut_38_1;
                                    stackIn_39_2 = stackOut_38_2;
                                    break L20;
                                  } else {
                                    stackOut_37_0 = (String[]) (Object) stackIn_37_0;
                                    stackOut_37_1 = stackIn_37_1;
                                    stackOut_37_2 = qb.field_c[-var5 + (qb.field_c.length + var8)];
                                    stackIn_39_0 = stackOut_37_0;
                                    stackIn_39_1 = stackOut_37_1;
                                    stackIn_39_2 = stackOut_37_2;
                                    break L20;
                                  }
                                }
                                stackIn_39_0[stackIn_39_1] = stackIn_39_2;
                                var8++;
                                continue L17;
                              }
                            }
                          } else {
                            dl.field_s[var8] = -1;
                            var8++;
                            continue L16;
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
            var3 = ga.a(0, pf.field_c, wf.field_e, aj.field_b, ll.field_c);
            var4 = 3 + var3;
            dl.field_s = new int[var4];
            gf.field_s = new String[var4];
            var5 = 0;
            L21: while (true) {
              if (var4 <= var5) {
                pe.field_db = new int[2];
                var5 = 0;
                L22: while (true) {
                  if (var5 >= var3) {
                    gf.field_s[-3 + var4] = "";
                    gf.field_s[var4 - 2] = cb.field_d;
                    dl.field_s[-2 + var4] = 0;
                    pe.field_db[0] = 4;
                    gf.field_s[-1 + var4] = ab.field_n;
                    dl.field_s[-1 + var4] = 1;
                    pe.field_db[1] = 5;
                    break L0;
                  } else {
                    gf.field_s[var5] = wf.field_e[var5];
                    var5++;
                    continue L22;
                  }
                }
              } else {
                dl.field_s[var5] = -1;
                var5++;
                continue L21;
              }
            }
          }
        }
        ui.field_c.field_b = pe.field_db.length;
        var3 = 0;
        var4 = 0;
        L23: while (true) {
          if (var4 >= gf.field_s.length) {
            L24: {
              if (nd.field_c == 2) {
                var10 = ji.field_n;
                var5 = 0;
                L25: while (true) {
                  if (var10.length <= var5) {
                    var11 = jl.field_c;
                    var5 = 0;
                    L26: while (true) {
                      if (var11.length <= var5) {
                        break L24;
                      } else {
                        var13 = var11[var5];
                        var7 = ki.a((byte) -18, false, var13);
                        if (var7 > var3) {
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
                    var7 = ki.a((byte) -18, false, var12);
                    if (var7 > var3) {
                      var3 = var7;
                      var5++;
                      continue L25;
                    } else {
                      var5++;
                      continue L25;
                    }
                  }
                }
              } else {
                break L24;
              }
            }
            qe.field_R = dg.field_ab + -(var3 >> -1415445375);
            fh.field_c = ui.field_c.field_b * (ai.field_a + uc.field_Y << -729991359);
            sd.field_a = -(var3 >> -1292213855) + (var3 + dg.field_ab);
            var4 = 0;
            L27: while (true) {
              if (gf.field_s.length <= var4) {
                jl.field_e = -(fh.field_c >> -909082559) + ii.field_c;
                r.field_h = new int[gf.field_s.length][];
                var4 = 0;
                var5 = jl.field_e;
                L28: while (true) {
                  if (gf.field_s.length <= var4) {
                    L29: {
                      if (2 == nd.field_c) {
                        ui.field_c.a((byte) -86, param2, -1, -1);
                        break L29;
                      } else {
                        ui.field_c.a((byte) 13, param2, 0, ha.a(ph.field_d, kc.field_u, -36));
                        break L29;
                      }
                    }
                    return;
                  } else {
                    var6 = dl.field_s[var4];
                    if (0 > var6) {
                      var5 = var5 + ok.field_e;
                      var4++;
                      continue L28;
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
                      var4++;
                      continue L28;
                    }
                  }
                }
              } else {
                L30: {
                  stackOut_104_0 = fh.field_c;
                  stackIn_106_0 = stackOut_104_0;
                  stackIn_105_0 = stackOut_104_0;
                  if (-1 >= (dl.field_s[var4] ^ -1)) {
                    stackOut_106_0 = stackIn_106_0;
                    stackOut_106_1 = sl.field_f;
                    stackIn_107_0 = stackOut_106_0;
                    stackIn_107_1 = stackOut_106_1;
                    break L30;
                  } else {
                    stackOut_105_0 = stackIn_105_0;
                    stackOut_105_1 = ok.field_e;
                    stackIn_107_0 = stackOut_105_0;
                    stackIn_107_1 = stackOut_105_1;
                    break L30;
                  }
                }
                fh.field_c = stackIn_107_0 + stackIn_107_1;
                var4++;
                continue L27;
              }
            }
          } else {
            L31: {
              stackOut_84_0 = -18;
              stackIn_86_0 = stackOut_84_0;
              stackIn_85_0 = stackOut_84_0;
              if (dl.field_s[var4] < 0) {
                stackOut_86_0 = stackIn_86_0;
                stackOut_86_1 = 0;
                stackIn_87_0 = stackOut_86_0;
                stackIn_87_1 = stackOut_86_1;
                break L31;
              } else {
                stackOut_85_0 = stackIn_85_0;
                stackOut_85_1 = 1;
                stackIn_87_0 = stackOut_85_0;
                stackIn_87_1 = stackOut_85_1;
                break L31;
              }
            }
            var5 = ki.a((byte) stackIn_87_0, stackIn_87_1 != 0, gf.field_s[var4]);
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

    final void a(int param0, ee param1, int param2, ga param3, byte param4) {
        int var6_int = 0;
        String var6 = null;
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
        L0: {
          hd.a(((gj) this).field_k, param1.field_l, param1.field_p, (byte) 95, param1.field_i + param0, param1.field_m + param2);
          if (null != ((gj) this).field_e) {
            L1: {
              var6_int = param2 - -param1.field_m + ((gj) this).field_f;
              var7 = param1.field_i + (param0 + ((gj) this).field_h);
              if (-2 == (param3.field_e ^ -1)) {
                var6_int = var6_int + (param1.field_p + -((gj) this).field_e.field_q) / 2;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param3.field_i != 1) {
                break L2;
              } else {
                var7 = var7 + (param1.field_l + -((gj) this).field_e.field_v) / 2;
                break L2;
              }
            }
            L3: {
              if (param3.field_e != 2) {
                break L3;
              } else {
                var6_int = var6_int + (param1.field_p - ((gj) this).field_e.field_q);
                break L3;
              }
            }
            L4: {
              if (-3 == (param3.field_i ^ -1)) {
                var7 = var7 + (param1.field_l + -((gj) this).field_e.field_v);
                break L4;
              } else {
                break L4;
              }
            }
            ((gj) this).field_e.g(var6_int, var7);
            break L0;
          } else {
            break L0;
          }
        }
        L5: {
          var6 = param3.a(param1, -6782);
          if (param4 == 44) {
            break L5;
          } else {
            gj discarded$2 = ((gj) this).b(-104, 43);
            break L5;
          }
        }
        L6: {
          if (var6 == null) {
            break L6;
          } else {
            if (param3.field_g == null) {
              break L6;
            } else {
              if (-1 < (((gj) this).field_i ^ -1)) {
                break L6;
              } else {
                L7: {
                  stackOut_18_0 = param3.field_g;
                  stackOut_18_1 = (String) var6;
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
                    break L7;
                  } else {
                    stackOut_19_0 = (eg) (Object) stackIn_19_0;
                    stackOut_19_1 = (String) (Object) stackIn_19_1;
                    stackOut_19_2 = ((gj) this).field_f;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    stackIn_21_2 = stackOut_19_2;
                    break L7;
                  }
                }
                L8: {
                  stackOut_21_0 = (eg) (Object) stackIn_21_0;
                  stackOut_21_1 = (String) (Object) stackIn_21_1;
                  stackOut_21_2 = stackIn_21_2 + (param3.field_r + (param1.field_m + param2));
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  if ((((gj) this).field_h ^ -1) != 2147483647) {
                    stackOut_23_0 = (eg) (Object) stackIn_23_0;
                    stackOut_23_1 = (String) (Object) stackIn_23_1;
                    stackOut_23_2 = stackIn_23_2;
                    stackOut_23_3 = ((gj) this).field_h;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    stackIn_24_3 = stackOut_23_3;
                    break L8;
                  } else {
                    stackOut_22_0 = (eg) (Object) stackIn_22_0;
                    stackOut_22_1 = (String) (Object) stackIn_22_1;
                    stackOut_22_2 = stackIn_22_2;
                    stackOut_22_3 = 0;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    stackIn_24_2 = stackOut_22_2;
                    stackIn_24_3 = stackOut_22_3;
                    break L8;
                  }
                }
                L9: {
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
                    break L9;
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
                    break L9;
                  }
                }
                int discarded$3 = ((eg) (Object) stackIn_27_0).a(stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_27_8, param3.field_e, param3.field_i, param3.field_n);
                break L6;
              }
            }
          }
        }
    }

    final static String a(int param0, byte param1, int param2) {
        if (param1 != -123) {
            field_c = 114;
        }
        return param2 + "/" + param0;
    }

    final gj b(int param0, byte param1) {
        ((gj) this).field_g = param0;
        int var3 = 89 % ((param1 - 48) / 54);
        return (gj) this;
    }

    final void a(int param0, gj param1, ga param2, int param3, int param4, ee param5) {
        if (!(!((gj) this).field_d)) {
            param1.a(param4, param5, param0, param2, (byte) 44);
            param1.b(param3 ^ -15012);
        }
        if (!(((gj) this).field_f == 2147483647)) {
            param1.field_f = ((gj) this).field_f;
        }
        if (!(0 > ((gj) this).field_g)) {
            param1.field_g = ((gj) this).field_g;
        }
        if (!(-2147483648 == ((gj) this).field_h)) {
            param1.field_h = ((gj) this).field_h;
        }
        if (!(2147483647 == (((gj) this).field_j ^ -1))) {
            param1.field_j = ((gj) this).field_j;
        }
        if (!(null == ((gj) this).field_e)) {
            param1.field_e = ((gj) this).field_e;
        }
        if (((gj) this).field_i >= param3) {
            param1.field_i = ((gj) this).field_i;
        }
        if (null != ((gj) this).field_k) {
            param1.field_k = ((gj) this).field_k;
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
