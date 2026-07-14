/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class pf {
    static rh field_b;
    static char[] field_d;
    static dd field_a;
    static cd field_c;

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0 != 13480) {
            pf.a(40);
        }
    }

    final static java.awt.Frame a(int param0, int param1, int param2, ce param3, int param4, int param5) {
        hf[] var6 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        hf[] var10 = null;
        od var11 = null;
        var9 = fleas.field_A ? 1 : 0;
        if (param3.a(107)) {
          L0: {
            if (param5 != 0) {
              break L0;
            } else {
              var10 = nd.a(true, param3);
              var6 = var10;
              if (var6 != null) {
                var7_int = 0;
                var8 = 0;
                L1: while (true) {
                  if (var8 >= var10.length) {
                    if (var7_int != 0) {
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    if (var10[var8].field_c == param4) {
                      if (param2 == var10[var8].field_a) {
                        L2: {
                          if (0 == param1) {
                            break L2;
                          } else {
                            if (var10[var8].field_j == param1) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        L3: {
                          if (var7_int == 0) {
                            break L3;
                          } else {
                            if (param5 < var10[var8].field_i) {
                              break L3;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        param5 = var10[var8].field_i;
                        var7_int = 1;
                        var8++;
                        continue L1;
                      } else {
                        var8++;
                        continue L1;
                      }
                    } else {
                      var8++;
                      continue L1;
                    }
                  }
                }
              } else {
                return null;
              }
            }
          }
          var11 = param3.a(param4, (byte) -50, param2, param5, param1);
          L4: while (true) {
            if (-1 != (var11.field_b ^ -1)) {
              var7 = (java.awt.Frame) var11.field_e;
              if (var7 != null) {
                if (-3 != (var11.field_b ^ -1)) {
                  if (param0 == 18316) {
                    return var7;
                  } else {
                    return null;
                  }
                } else {
                  hi.a(param3, var7, (byte) 52);
                  return null;
                }
              } else {
                return null;
              }
            } else {
              vh.a(10L, -88);
              continue L4;
            }
          }
        } else {
          return null;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if ((7 & param1) != 0) {
            var2 = -(7 & param1) + 8;
        }
        int var3 = param1 - -var2;
        if (param0 > -65) {
            return -9;
        }
        return var3;
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
        int stackIn_87_0 = 0;
        String stackIn_87_1 = null;
        int stackIn_88_0 = 0;
        String stackIn_88_1 = null;
        int stackIn_89_0 = 0;
        String stackIn_89_1 = null;
        int stackIn_89_2 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
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
        int stackOut_106_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_86_0 = 0;
        String stackOut_86_1 = null;
        int stackOut_88_0 = 0;
        String stackOut_88_1 = null;
        int stackOut_88_2 = 0;
        int stackOut_87_0 = 0;
        String stackOut_87_1 = null;
        int stackOut_87_2 = 0;
        L0: {
          var9 = fleas.field_A ? 1 : 0;
          vc.field_a = param0;
          d.field_L = true;
          if (vc.field_a != 0) {
            if ((vc.field_a ^ -1) == -2) {
              var3 = nb.a(rh.field_o, vh.field_l, pb.field_e, sc.field_d, 1);
              var4 = 2 + var3;
              fb.field_d = new String[var4];
              m.field_c = new int[var4];
              var5 = 0;
              L1: while (true) {
                if (var5 >= var4) {
                  em.field_e = new int[1];
                  var5 = 0;
                  L2: while (true) {
                    if (var3 <= var5) {
                      fb.field_d[-2 + var4] = "";
                      fb.field_d[-1 + var4] = ja.field_O;
                      m.field_c[var4 + -1] = 0;
                      em.field_e[0] = 5;
                      break L0;
                    } else {
                      fb.field_d[var5] = sc.field_d[var5];
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  m.field_c[var5] = -1;
                  var5++;
                  continue L1;
                }
              }
            } else {
              if (vc.field_a != 2) {
                if (vc.field_a == 3) {
                  L3: {
                    if (!fg.field_q.field_e) {
                      var3 = nb.a(sa.field_b, vh.field_l, pb.field_e, sc.field_d, 1);
                      break L3;
                    } else {
                      var3 = nb.a(aj.field_x, vh.field_l, pb.field_e, sc.field_d, 1);
                      break L3;
                    }
                  }
                  var4 = 2 + var3;
                  m.field_c = new int[var4];
                  fb.field_d = new String[var4];
                  var5 = 0;
                  L4: while (true) {
                    if (var4 <= var5) {
                      em.field_e = new int[1];
                      var5 = 0;
                      L5: while (true) {
                        if (var5 >= var3) {
                          fb.field_d[-2 + var4] = "";
                          fb.field_d[var4 + -1] = ja.field_O;
                          m.field_c[-1 + var4] = 0;
                          em.field_e[0] = 5;
                          break L0;
                        } else {
                          fb.field_d[var5] = sc.field_d[var5];
                          var5++;
                          continue L5;
                        }
                      }
                    } else {
                      m.field_c[var5] = -1;
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  if (-5 == (vc.field_a ^ -1)) {
                    var3 = nb.a(oc.field_c, vh.field_l, pb.field_e, sc.field_d, 1);
                    var4 = var3 + 2;
                    fb.field_d = new String[var4];
                    m.field_c = new int[var4];
                    var5 = 0;
                    L6: while (true) {
                      if (var5 >= var4) {
                        em.field_e = new int[1];
                        var5 = 0;
                        L7: while (true) {
                          if (var5 >= var3) {
                            fb.field_d[-2 + var4] = "";
                            fb.field_d[-1 + var4] = ja.field_O;
                            m.field_c[-1 + var4] = 0;
                            em.field_e[0] = 5;
                            break L0;
                          } else {
                            fb.field_d[var5] = sc.field_d[var5];
                            var5++;
                            continue L7;
                          }
                        }
                      } else {
                        m.field_c[var5] = -1;
                        var5++;
                        continue L6;
                      }
                    }
                  } else {
                    if (vc.field_a == 5) {
                      var3 = nb.a(tg.field_a, vh.field_l, pb.field_e, sc.field_d, 1);
                      var4 = var3 + 3;
                      m.field_c = new int[var4];
                      fb.field_d = new String[var4];
                      var5 = 0;
                      L8: while (true) {
                        if (var4 <= var5) {
                          em.field_e = new int[2];
                          var5 = 0;
                          L9: while (true) {
                            if (var3 <= var5) {
                              fb.field_d[var4 - 3] = "";
                              fb.field_d[var4 - 2] = s.field_a;
                              m.field_c[var4 + -2] = 0;
                              em.field_e[0] = 3;
                              fb.field_d[-1 + var4] = ja.field_O;
                              m.field_c[-1 + var4] = 1;
                              em.field_e[1] = 5;
                              break L0;
                            } else {
                              fb.field_d[var5] = sc.field_d[var5];
                              var5++;
                              continue L9;
                            }
                          }
                        } else {
                          m.field_c[var5] = -1;
                          var5++;
                          continue L8;
                        }
                      }
                    } else {
                      throw new IllegalArgumentException();
                    }
                  }
                }
              } else {
                var3 = nb.a(db.a(wa.field_q, new String[1], true), vh.field_l, pb.field_e, sc.field_d, 1);
                var4 = -1;
                var5 = 0;
                L10: while (true) {
                  L11: {
                    if (var5 >= var3) {
                      break L11;
                    } else {
                      if (!"<%0>".equals((Object) (Object) sc.field_d[var5])) {
                        var5++;
                        continue L10;
                      } else {
                        var4 = var5;
                        break L11;
                      }
                    }
                  }
                  if ((var4 ^ -1) != 0) {
                    j.field_o = new String[var4];
                    dm.a((Object[]) (Object) sc.field_d, 0, (Object[]) (Object) j.field_o, 0, var4);
                    oe.field_c = new String[var3 - (var4 + 1)];
                    dm.a((Object[]) (Object) sc.field_d, var4 - -1, (Object[]) (Object) oe.field_c, 0, -var4 + (var3 - 1));
                    var4 = -1;
                    var3 = nb.a(db.a(cd.field_g, new String[1], true), vh.field_l, pb.field_e, sc.field_d, 1);
                    var5 = 0;
                    L12: while (true) {
                      L13: {
                        if (var5 >= var3) {
                          break L13;
                        } else {
                          if ("<%0>".equals((Object) (Object) sc.field_d[var5])) {
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
                          uk.field_a = new String[var4];
                          dm.a((Object[]) (Object) sc.field_d, 0, (Object[]) (Object) uk.field_a, 0, var4);
                          rc.field_g = new String[-1 + -var4 + var3];
                          dm.a((Object[]) (Object) sc.field_d, 1 + var4, (Object[]) (Object) rc.field_g, 0, -1 + -var4 + var3);
                          if (j.field_o.length >= uk.field_a.length) {
                            stackOut_27_0 = j.field_o.length;
                            stackIn_28_0 = stackOut_27_0;
                            break L14;
                          } else {
                            stackOut_26_0 = uk.field_a.length;
                            stackIn_28_0 = stackOut_26_0;
                            break L14;
                          }
                        }
                        L15: {
                          var5 = stackIn_28_0;
                          if (rc.field_g.length <= oe.field_c.length) {
                            stackOut_30_0 = oe.field_c.length;
                            stackIn_31_0 = stackOut_30_0;
                            break L15;
                          } else {
                            stackOut_29_0 = rc.field_g.length;
                            stackIn_31_0 = stackOut_29_0;
                            break L15;
                          }
                        }
                        var6 = stackIn_31_0;
                        var7 = 7 + var5 - -var6;
                        fb.field_d = new String[var7];
                        m.field_c = new int[var7];
                        var8 = 0;
                        L16: while (true) {
                          if (var7 <= var8) {
                            em.field_e = new int[2];
                            m.field_c[1] = 0;
                            fb.field_d[1] = ck.field_p;
                            fb.field_d[0] = ki.field_e;
                            fb.field_d[5] = "";
                            m.field_c[3] = 1;
                            fb.field_d[2] = cf.field_a;
                            fb.field_d[3] = rc.field_h;
                            em.field_e[0] = 5;
                            em.field_e[1] = 2;
                            fb.field_d[4] = ib.field_d;
                            var8 = 0;
                            L17: while (true) {
                              if (var5 <= var8) {
                                fb.field_d[6 + var5] = null;
                                m.field_c[var5 + 6] = -2;
                                var8 = 0;
                                L18: while (true) {
                                  if (var6 <= var8) {
                                    sd.field_h = lj.a((byte) -52);
                                    break L0;
                                  } else {
                                    L19: {
                                      stackOut_42_0 = fb.field_d;
                                      stackOut_42_1 = var5 + (7 + var8);
                                      stackIn_44_0 = stackOut_42_0;
                                      stackIn_44_1 = stackOut_42_1;
                                      stackIn_43_0 = stackOut_42_0;
                                      stackIn_43_1 = stackOut_42_1;
                                      if (var8 >= rc.field_g.length) {
                                        stackOut_44_0 = (String[]) (Object) stackIn_44_0;
                                        stackOut_44_1 = stackIn_44_1;
                                        stackOut_44_2 = "";
                                        stackIn_45_0 = stackOut_44_0;
                                        stackIn_45_1 = stackOut_44_1;
                                        stackIn_45_2 = stackOut_44_2;
                                        break L19;
                                      } else {
                                        stackOut_43_0 = (String[]) (Object) stackIn_43_0;
                                        stackOut_43_1 = stackIn_43_1;
                                        stackOut_43_2 = rc.field_g[var8];
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
                                  stackOut_36_0 = fb.field_d;
                                  stackOut_36_1 = var8 + 6;
                                  stackIn_38_0 = stackOut_36_0;
                                  stackIn_38_1 = stackOut_36_1;
                                  stackIn_37_0 = stackOut_36_0;
                                  stackIn_37_1 = stackOut_36_1;
                                  if (-1 < (-var5 + (uk.field_a.length + var8) ^ -1)) {
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
                                    stackOut_37_2 = uk.field_a[uk.field_a.length + (var8 + -var5)];
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
                            m.field_c[var8] = -1;
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
            var3 = nb.a(rh.field_o, vh.field_l, pb.field_e, sc.field_d, 1);
            var4 = var3 + 3;
            m.field_c = new int[var4];
            fb.field_d = new String[var4];
            var5 = 0;
            L21: while (true) {
              if (var5 >= var4) {
                em.field_e = new int[2];
                var5 = 0;
                L22: while (true) {
                  if (var3 <= var5) {
                    fb.field_d[var4 + -3] = "";
                    fb.field_d[-2 + var4] = md.field_M;
                    m.field_c[var4 + -2] = 0;
                    em.field_e[0] = 4;
                    fb.field_d[-1 + var4] = ja.field_O;
                    m.field_c[-1 + var4] = 1;
                    em.field_e[1] = 5;
                    break L0;
                  } else {
                    fb.field_d[var5] = sc.field_d[var5];
                    var5++;
                    continue L22;
                  }
                }
              } else {
                m.field_c[var5] = -1;
                var5++;
                continue L21;
              }
            }
          }
        }
        L23: {
          if (param1 == 1) {
            break L23;
          } else {
            field_a = null;
            break L23;
          }
        }
        bk.field_a.field_m = em.field_e.length;
        var3 = 0;
        var4 = 0;
        L24: while (true) {
          if (var4 >= fb.field_d.length) {
            L25: {
              if (-3 == (vc.field_a ^ -1)) {
                var10 = j.field_o;
                var5 = 0;
                L26: while (true) {
                  if (var5 >= var10.length) {
                    var11 = oe.field_c;
                    var5 = 0;
                    L27: while (true) {
                      if (var11.length <= var5) {
                        break L25;
                      } else {
                        var13 = var11[var5];
                        var7 = se.a(param1 ^ 2, var13, false);
                        if (var7 > var3) {
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
                    var7 = se.a(3, var12, false);
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
            em.field_d = bk.field_a.field_m * (id.field_c + ge.field_h << -437442015);
            bm.field_K = af.field_b + (var3 - (var3 >> 155126785));
            ei.field_M = -(var3 >> -846725215) + af.field_b;
            var4 = 0;
            L28: while (true) {
              if (var4 >= fb.field_d.length) {
                rb.field_H = vc.field_f - (em.field_d >> -650894943);
                vh.field_j = new int[fb.field_d.length][];
                var4 = 0;
                var5 = rb.field_H;
                L29: while (true) {
                  if (fb.field_d.length <= var4) {
                    L30: {
                      if (vc.field_a == 2) {
                        bk.field_a.a(-1, -1, param2, -101);
                        break L30;
                      } else {
                        bk.field_a.a(bg.a(ag.field_f, kc.field_b, 112), 0, param2, param1 + -85);
                        break L30;
                      }
                    }
                    return;
                  } else {
                    var6 = m.field_c[var4];
                    if (-1 >= (var6 ^ -1)) {
                      var7 = se.a(3, fb.field_d[var4], true);
                      var5 = var5 + id.field_c;
                      var8 = af.field_b + -(var7 >> -1817673599);
                      vh.field_j[var4] = new int[4];
                      vh.field_j[var4][0] = -ae.field_c + var8;
                      vh.field_j[var4][1] = var5;
                      vh.field_j[var4][2] = (ae.field_c << -1862173087) + var7;
                      var5 = var5 + ((ge.field_h << -1455016543) + (id.field_c + hb.field_t));
                      vh.field_j[var4][3] = hb.field_t + (ge.field_h << -1461306399);
                      var4++;
                      continue L29;
                    } else {
                      var5 = var5 + cm.field_f;
                      var4++;
                      continue L29;
                    }
                  }
                }
              } else {
                L31: {
                  stackOut_106_0 = em.field_d;
                  stackIn_108_0 = stackOut_106_0;
                  stackIn_107_0 = stackOut_106_0;
                  if (0 > m.field_c[var4]) {
                    stackOut_108_0 = stackIn_108_0;
                    stackOut_108_1 = cm.field_f;
                    stackIn_109_0 = stackOut_108_0;
                    stackIn_109_1 = stackOut_108_1;
                    break L31;
                  } else {
                    stackOut_107_0 = stackIn_107_0;
                    stackOut_107_1 = hb.field_t;
                    stackIn_109_0 = stackOut_107_0;
                    stackIn_109_1 = stackOut_107_1;
                    break L31;
                  }
                }
                em.field_d = stackIn_109_0 + stackIn_109_1;
                var4++;
                continue L28;
              }
            }
          } else {
            L32: {
              stackOut_86_0 = 3;
              stackOut_86_1 = fb.field_d[var4];
              stackIn_88_0 = stackOut_86_0;
              stackIn_88_1 = stackOut_86_1;
              stackIn_87_0 = stackOut_86_0;
              stackIn_87_1 = stackOut_86_1;
              if (m.field_c[var4] < 0) {
                stackOut_88_0 = stackIn_88_0;
                stackOut_88_1 = (String) (Object) stackIn_88_1;
                stackOut_88_2 = 0;
                stackIn_89_0 = stackOut_88_0;
                stackIn_89_1 = stackOut_88_1;
                stackIn_89_2 = stackOut_88_2;
                break L32;
              } else {
                stackOut_87_0 = stackIn_87_0;
                stackOut_87_1 = (String) (Object) stackIn_87_1;
                stackOut_87_2 = 1;
                stackIn_89_0 = stackOut_87_0;
                stackIn_89_1 = stackOut_87_1;
                stackIn_89_2 = stackOut_87_2;
                break L32;
              }
            }
            var5 = se.a(stackIn_89_0, stackIn_89_1, stackIn_89_2 != 0);
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

    final static h a(Throwable param0, String param1) {
        h var2_ref = null;
        h var2 = null;
        if (!(param0 instanceof h)) {
            var2 = new h(param0, param1);
        } else {
            var2_ref = (h) (Object) param0;
            var2_ref.field_f = var2_ref.field_f + 32 + param1;
        }
        return var2_ref;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new char[128];
        field_c = null;
    }
}
