/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends wf {
    int field_i;
    int field_e;
    int[] field_h;
    static int field_l;
    int field_m;
    int field_f;
    int field_k;
    long field_j;
    int field_g;
    int field_n;

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            ga.a(-70);
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 == (param2 & 2048)) {
              break L2;
            } else {
              if ((param1 & 55) == 0) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ha var6 = null;
        L0: {
          var4 = AceOfSkies.field_G ? 1 : 0;
          var6 = pk.field_wb.a((byte) 100);
          if (hr.field_d != null) {
            break L0;
          } else {
            hr.field_d = new pa[jd.field_d.length][];
            is.field_a = new pa[oo.field_ab.length];
            sd.field_k = new pa[na.field_c.length];
            es.field_b = new pa[tq.field_h.length];
            bl.field_b = new pa[ud.field_f.length];
            ac.field_f = new pa[qa.field_a.length];
            jm.field_a = new pa[hq.field_a.length];
            aa.field_a = new pa[la.field_g.length];
            rs.field_u = new pa[af.field_c.length];
            bs.field_b = new pa[qq.field_e.length];
            uc.field_o = new pa[tt.field_c.length];
            ua.field_g = new pa[eb.field_c.length];
            in.field_c = new pa[kb.field_D.length];
            ii.field_k = new pa[ps.field_f.length][];
            wm.field_i = new pa[ol.field_e.length];
            po.field_e = new pa[nu.field_b.length];
            co.field_i = new pa[gn.field_b.length];
            ec.field_e = new pa[o.field_a.length];
            mb.field_u = new pa[vl.field_b.length];
            dl.field_n = new pa[qk.field_a.length];
            ko.field_g = new pa[gu.field_a.length];
            var2 = 0;
            L1: while (true) {
              if (ii.field_k.length <= var2) {
                break L0;
              } else {
                ii.field_k[var2] = new pa[ps.field_f[var2].length];
                var2++;
                continue L1;
              }
            }
          }
        }
        var2 = 0;
        L2: while (true) {
          if (var2 >= jd.field_d.length) {
            var2 = 0;
            L3: while (true) {
              if (var2 >= oo.field_ab.length) {
                var2 = 0;
                L4: while (true) {
                  if (na.field_c.length <= var2) {
                    var2 = 0;
                    L5: while (true) {
                      if (tq.field_h.length <= var2) {
                        var2 = 0;
                        L6: while (true) {
                          if (ud.field_f.length <= var2) {
                            var2 = 0;
                            L7: while (true) {
                              if (ol.field_e.length <= var2) {
                                var2 = 0;
                                L8: while (true) {
                                  if (nu.field_b.length <= var2) {
                                    var2 = 0;
                                    L9: while (true) {
                                      if (gn.field_b.length <= var2) {
                                        var2 = 0;
                                        L10: while (true) {
                                          if (o.field_a.length <= var2) {
                                            L11: {
                                              var2 = 0;
                                              if (param0 > 38) {
                                                break L11;
                                              } else {
                                                ga.a(65);
                                                break L11;
                                              }
                                            }
                                            L12: while (true) {
                                              if (var2 >= gu.field_a.length) {
                                                var2 = 0;
                                                L13: while (true) {
                                                  if (var2 >= vl.field_b.length) {
                                                    var2 = 0;
                                                    L14: while (true) {
                                                      if (qk.field_a.length <= var2) {
                                                        qk.field_i = var6.a(lt.field_v, false);
                                                        var2 = 0;
                                                        L15: while (true) {
                                                          if (var2 >= qa.field_a.length) {
                                                            var2 = 0;
                                                            L16: while (true) {
                                                              if (var2 >= ps.field_f.length) {
                                                                var2 = 0;
                                                                L17: while (true) {
                                                                  if (qq.field_e.length <= var2) {
                                                                    var2 = 0;
                                                                    L18: while (true) {
                                                                      if (var2 >= tt.field_c.length) {
                                                                        var2 = 0;
                                                                        L19: while (true) {
                                                                          if (hq.field_a.length <= var2) {
                                                                            var2 = 0;
                                                                            L20: while (true) {
                                                                              if (var2 >= eb.field_c.length) {
                                                                                var2 = 0;
                                                                                L21: while (true) {
                                                                                  if (var2 >= kb.field_D.length) {
                                                                                    mp.field_h = var6.a(fs.field_e, false);
                                                                                    dc.field_g = var6.a(l.field_a, false);
                                                                                    se.field_c = var6.a(kn.field_b, q.field_o, true);
                                                                                    kn.field_a = var6.a(dp.field_h, nc.field_a, true);
                                                                                    rb.field_j = var6.a(hi.field_v, dl.field_m, true);
                                                                                    var2 = 0;
                                                                                    L22: while (true) {
                                                                                      if (la.field_g.length <= var2) {
                                                                                        var2 = 0;
                                                                                        L23: while (true) {
                                                                                          if (var2 >= af.field_c.length) {
                                                                                            lg.field_k = var6.a(vl.field_c, false);
                                                                                            ut.field_c = var6.a(es.field_i, false);
                                                                                            dh.field_k = var6.a(uc.field_g, false);
                                                                                            return;
                                                                                          } else {
                                                                                            rs.field_u[var2] = var6.a(af.field_c[var2], false);
                                                                                            var2++;
                                                                                            continue L23;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        aa.field_a[var2] = var6.a(la.field_g[var2], false);
                                                                                        var2++;
                                                                                        continue L22;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    in.field_c[var2] = var6.a(kb.field_D[var2], false);
                                                                                    var2++;
                                                                                    continue L21;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                ua.field_g[var2] = var6.a(eb.field_c[var2], false);
                                                                                var2++;
                                                                                continue L20;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            jm.field_a[var2] = var6.a(hq.field_a[var2], false);
                                                                            var2++;
                                                                            continue L19;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        uc.field_o[var2] = var6.a(tt.field_c[var2], false);
                                                                        var2++;
                                                                        continue L18;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    bs.field_b[var2] = var6.a(qq.field_e[var2], false);
                                                                    var2++;
                                                                    continue L17;
                                                                  }
                                                                }
                                                              } else {
                                                                var5 = 0;
                                                                var3 = var5;
                                                                L24: while (true) {
                                                                  if (var5 >= ps.field_f[var2].length) {
                                                                    var2++;
                                                                    continue L16;
                                                                  } else {
                                                                    ii.field_k[var2][var5] = var6.a(ps.field_f[var2][var5], false);
                                                                    var5++;
                                                                    continue L24;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            ac.field_f[var2] = var6.a(qa.field_a[var2], false);
                                                            var2++;
                                                            continue L15;
                                                          }
                                                        }
                                                      } else {
                                                        dl.field_n[var2] = var6.a(qk.field_a[var2], false);
                                                        var2++;
                                                        continue L14;
                                                      }
                                                    }
                                                  } else {
                                                    mb.field_u[var2] = var6.a(vl.field_b[var2], false);
                                                    var2++;
                                                    continue L13;
                                                  }
                                                }
                                              } else {
                                                ko.field_g[var2] = var6.a(gu.field_a[var2], false);
                                                var2++;
                                                continue L12;
                                              }
                                            }
                                          } else {
                                            ec.field_e[var2] = var6.a(o.field_a[var2], false);
                                            var2++;
                                            continue L10;
                                          }
                                        }
                                      } else {
                                        co.field_i[var2] = var6.a(gn.field_b[var2], false);
                                        var2++;
                                        continue L9;
                                      }
                                    }
                                  } else {
                                    po.field_e[var2] = var6.a(nu.field_b[var2], false);
                                    var2++;
                                    continue L8;
                                  }
                                }
                              } else {
                                wm.field_i[var2] = var6.a(ol.field_e[var2], false);
                                var2++;
                                continue L7;
                              }
                            }
                          } else {
                            bl.field_b[var2] = var6.a(ud.field_f[var2], false);
                            var2++;
                            continue L6;
                          }
                        }
                      } else {
                        es.field_b[var2] = var6.a(tq.field_h[var2], false);
                        var2++;
                        continue L5;
                      }
                    }
                  } else {
                    sd.field_k[var2] = var6.a(na.field_c[var2], false);
                    var2++;
                    continue L4;
                  }
                }
              } else {
                is.field_a[var2] = var6.a(oo.field_ab[var2], false);
                var2++;
                continue L3;
              }
            }
          } else {
            L25: {
              if (hr.field_d[var2] == null) {
                hr.field_d[var2] = new pa[jd.field_d[var2].length];
                break L25;
              } else {
                break L25;
              }
            }
            var3 = 0;
            L26: while (true) {
              if (var3 >= jd.field_d[var2].length) {
                var2++;
                continue L2;
              } else {
                hr.field_d[var2][var3] = var6.a(jd.field_d[var2][var3], false);
                var3++;
                continue L26;
              }
            }
          }
        }
    }

    ga(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        ((ga) this).field_k = param1;
        ((ga) this).field_g = param3;
        ((ga) this).field_n = param4;
        ((ga) this).field_e = param0;
        ((ga) this).field_h = param6;
        am.field_a = am.field_a + 1;
        ((ga) this).field_m = 65535 & am.field_a;
        ((ga) this).field_i = param2;
        ((ga) this).field_f = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = -1;
    }
}
