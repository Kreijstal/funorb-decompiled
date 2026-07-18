/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Frame;
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
        RuntimeException var6 = null;
        hf[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        hf[] var10 = null;
        od var11 = null;
        Object stackIn_7_0 = null;
        Object stackIn_24_0 = null;
        java.awt.Frame stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        java.awt.Frame stackOut_26_0 = null;
        Object stackOut_23_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var9 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param3.a(107)) {
              L1: {
                if (param5 != 0) {
                  break L1;
                } else {
                  var10 = nd.a(true, param3);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          return null;
                        }
                      } else {
                        L3: {
                          if (var10[var8].field_c != param4) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    return (java.awt.Frame) (Object) stackIn_7_0;
                  }
                }
              }
              var11 = param3.a(param4, (byte) -50, param2, param5, 0);
              L4: while (true) {
                if (var11.field_b != 0) {
                  var7 = (java.awt.Frame) var11.field_e;
                  if (var7 != null) {
                    if (var11.field_b != 2) {
                      stackOut_26_0 = (java.awt.Frame) var7;
                      stackIn_27_0 = stackOut_26_0;
                      break L0;
                    } else {
                      hi.a(param3, var7, (byte) 52);
                      stackOut_23_0 = null;
                      stackIn_24_0 = stackOut_23_0;
                      return (java.awt.Frame) (Object) stackIn_24_0;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("pf.A(").append(18316).append(',').append(0).append(',').append(param2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_27_0;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if ((7 & param1) != 0) {
            var2 = -(7 & param1) + 8;
        }
        int var3 = param1 - -var2;
        return var3;
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
        String stackIn_86_1 = null;
        int stackIn_87_0 = 0;
        String stackIn_87_1 = null;
        int stackIn_88_0 = 0;
        String stackIn_88_1 = null;
        int stackIn_88_2 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
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
        int stackOut_106_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_85_0 = 0;
        String stackOut_85_1 = null;
        int stackOut_87_0 = 0;
        String stackOut_87_1 = null;
        int stackOut_87_2 = 0;
        int stackOut_86_0 = 0;
        String stackOut_86_1 = null;
        int stackOut_86_2 = 0;
        var9 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              vc.field_a = param0;
              d.field_L = true;
              if (vc.field_a != 0) {
                if (vc.field_a == 1) {
                  var3_int = nb.a(rh.field_o, vh.field_l, pb.field_e, sc.field_d, 1);
                  var4 = 2 + var3_int;
                  fb.field_d = new String[var4];
                  m.field_c = new int[var4];
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var4) {
                      em.field_e = new int[1];
                      var5 = 0;
                      L3: while (true) {
                        if (var3_int <= var5) {
                          fb.field_d[-2 + var4] = "";
                          fb.field_d[-1 + var4] = ja.field_O;
                          m.field_c[var4 + -1] = 0;
                          em.field_e[0] = 5;
                          break L1;
                        } else {
                          fb.field_d[var5] = sc.field_d[var5];
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      m.field_c[var5] = -1;
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (vc.field_a != 2) {
                    if (vc.field_a == 3) {
                      L4: {
                        if (!fg.field_q.field_e) {
                          var3_int = nb.a(sa.field_b, vh.field_l, pb.field_e, sc.field_d, 1);
                          break L4;
                        } else {
                          var3_int = nb.a(aj.field_x, vh.field_l, pb.field_e, sc.field_d, 1);
                          break L4;
                        }
                      }
                      var4 = 2 + var3_int;
                      m.field_c = new int[var4];
                      fb.field_d = new String[var4];
                      var5 = 0;
                      L5: while (true) {
                        if (var4 <= var5) {
                          em.field_e = new int[1];
                          var5 = 0;
                          L6: while (true) {
                            if (var5 >= var3_int) {
                              fb.field_d[-2 + var4] = "";
                              fb.field_d[var4 + -1] = ja.field_O;
                              m.field_c[-1 + var4] = 0;
                              em.field_e[0] = 5;
                              break L1;
                            } else {
                              fb.field_d[var5] = sc.field_d[var5];
                              var5++;
                              continue L6;
                            }
                          }
                        } else {
                          m.field_c[var5] = -1;
                          var5++;
                          continue L5;
                        }
                      }
                    } else {
                      if (vc.field_a == 4) {
                        var3_int = nb.a(oc.field_c, vh.field_l, pb.field_e, sc.field_d, 1);
                        var4 = var3_int + 2;
                        fb.field_d = new String[var4];
                        m.field_c = new int[var4];
                        var5 = 0;
                        L7: while (true) {
                          if (var5 >= var4) {
                            em.field_e = new int[1];
                            var5 = 0;
                            L8: while (true) {
                              if (var5 >= var3_int) {
                                fb.field_d[-2 + var4] = "";
                                fb.field_d[-1 + var4] = ja.field_O;
                                m.field_c[-1 + var4] = 0;
                                em.field_e[0] = 5;
                                break L1;
                              } else {
                                fb.field_d[var5] = sc.field_d[var5];
                                var5++;
                                continue L8;
                              }
                            }
                          } else {
                            m.field_c[var5] = -1;
                            var5++;
                            continue L7;
                          }
                        }
                      } else {
                        if (vc.field_a == 5) {
                          var3_int = nb.a(tg.field_a, vh.field_l, pb.field_e, sc.field_d, 1);
                          var4 = var3_int + 3;
                          m.field_c = new int[var4];
                          fb.field_d = new String[var4];
                          var5 = 0;
                          L9: while (true) {
                            if (var4 <= var5) {
                              em.field_e = new int[2];
                              var5 = 0;
                              L10: while (true) {
                                if (var3_int <= var5) {
                                  fb.field_d[var4 - 3] = "";
                                  fb.field_d[var4 - 2] = s.field_a;
                                  m.field_c[var4 + -2] = 0;
                                  em.field_e[0] = 3;
                                  fb.field_d[-1 + var4] = ja.field_O;
                                  m.field_c[-1 + var4] = 1;
                                  em.field_e[1] = 5;
                                  break L1;
                                } else {
                                  fb.field_d[var5] = sc.field_d[var5];
                                  var5++;
                                  continue L10;
                                }
                              }
                            } else {
                              m.field_c[var5] = -1;
                              var5++;
                              continue L9;
                            }
                          }
                        } else {
                          throw new IllegalArgumentException();
                        }
                      }
                    }
                  } else {
                    var3_int = nb.a(db.a(wa.field_q, new String[1], true), vh.field_l, pb.field_e, sc.field_d, 1);
                    var4 = -1;
                    var5 = 0;
                    L11: while (true) {
                      L12: {
                        if (var5 >= var3_int) {
                          break L12;
                        } else {
                          if (!"<%0>".equals((Object) (Object) sc.field_d[var5])) {
                            var5++;
                            continue L11;
                          } else {
                            var4 = var5;
                            break L12;
                          }
                        }
                      }
                      if (var4 != -1) {
                        j.field_o = new String[var4];
                        dm.a((Object[]) (Object) sc.field_d, 0, (Object[]) (Object) j.field_o, 0, var4);
                        oe.field_c = new String[var3_int - (var4 + 1)];
                        dm.a((Object[]) (Object) sc.field_d, var4 - -1, (Object[]) (Object) oe.field_c, 0, -var4 + (var3_int - 1));
                        var4 = -1;
                        var3_int = nb.a(db.a(cd.field_g, new String[1], true), vh.field_l, pb.field_e, sc.field_d, 1);
                        var5 = 0;
                        L13: while (true) {
                          L14: {
                            if (var5 >= var3_int) {
                              break L14;
                            } else {
                              if ("<%0>".equals((Object) (Object) sc.field_d[var5])) {
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
                              uk.field_a = new String[var4];
                              dm.a((Object[]) (Object) sc.field_d, 0, (Object[]) (Object) uk.field_a, 0, var4);
                              rc.field_g = new String[-1 + -var4 + var3_int];
                              dm.a((Object[]) (Object) sc.field_d, 1 + var4, (Object[]) (Object) rc.field_g, 0, -1 + -var4 + var3_int);
                              if (j.field_o.length >= uk.field_a.length) {
                                stackOut_28_0 = j.field_o.length;
                                stackIn_29_0 = stackOut_28_0;
                                break L15;
                              } else {
                                stackOut_27_0 = uk.field_a.length;
                                stackIn_29_0 = stackOut_27_0;
                                break L15;
                              }
                            }
                            L16: {
                              var5 = stackIn_29_0;
                              if (rc.field_g.length <= oe.field_c.length) {
                                stackOut_31_0 = oe.field_c.length;
                                stackIn_32_0 = stackOut_31_0;
                                break L16;
                              } else {
                                stackOut_30_0 = rc.field_g.length;
                                stackIn_32_0 = stackOut_30_0;
                                break L16;
                              }
                            }
                            var6 = stackIn_32_0;
                            var7 = 7 + var5 - -var6;
                            fb.field_d = new String[var7];
                            m.field_c = new int[var7];
                            var8 = 0;
                            L17: while (true) {
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
                                L18: while (true) {
                                  if (var5 <= var8) {
                                    fb.field_d[6 + var5] = null;
                                    m.field_c[var5 + 6] = -2;
                                    var8 = 0;
                                    L19: while (true) {
                                      if (var6 <= var8) {
                                        sd.field_h = lj.a((byte) -52);
                                        break L1;
                                      } else {
                                        L20: {
                                          stackOut_43_0 = fb.field_d;
                                          stackOut_43_1 = var5 + (7 + var8);
                                          stackIn_45_0 = stackOut_43_0;
                                          stackIn_45_1 = stackOut_43_1;
                                          stackIn_44_0 = stackOut_43_0;
                                          stackIn_44_1 = stackOut_43_1;
                                          if (var8 >= rc.field_g.length) {
                                            stackOut_45_0 = (String[]) (Object) stackIn_45_0;
                                            stackOut_45_1 = stackIn_45_1;
                                            stackOut_45_2 = "";
                                            stackIn_46_0 = stackOut_45_0;
                                            stackIn_46_1 = stackOut_45_1;
                                            stackIn_46_2 = stackOut_45_2;
                                            break L20;
                                          } else {
                                            stackOut_44_0 = (String[]) (Object) stackIn_44_0;
                                            stackOut_44_1 = stackIn_44_1;
                                            stackOut_44_2 = rc.field_g[var8];
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
                                      stackOut_37_0 = fb.field_d;
                                      stackOut_37_1 = var8 + 6;
                                      stackIn_39_0 = stackOut_37_0;
                                      stackIn_39_1 = stackOut_37_1;
                                      stackIn_38_0 = stackOut_37_0;
                                      stackIn_38_1 = stackOut_37_1;
                                      if (-var5 + (uk.field_a.length + var8) < 0) {
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
                                        stackOut_38_2 = uk.field_a[uk.field_a.length + (var8 + -var5)];
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
                                m.field_c[var8] = -1;
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
                var3_int = nb.a(rh.field_o, vh.field_l, pb.field_e, sc.field_d, 1);
                var4 = var3_int + 3;
                m.field_c = new int[var4];
                fb.field_d = new String[var4];
                var5 = 0;
                L22: while (true) {
                  if (var5 >= var4) {
                    em.field_e = new int[2];
                    var5 = 0;
                    L23: while (true) {
                      if (var3_int <= var5) {
                        fb.field_d[var4 + -3] = "";
                        fb.field_d[-2 + var4] = md.field_M;
                        m.field_c[var4 + -2] = 0;
                        em.field_e[0] = 4;
                        fb.field_d[-1 + var4] = ja.field_O;
                        m.field_c[-1 + var4] = 1;
                        em.field_e[1] = 5;
                        break L1;
                      } else {
                        fb.field_d[var5] = sc.field_d[var5];
                        var5++;
                        continue L23;
                      }
                    }
                  } else {
                    m.field_c[var5] = -1;
                    var5++;
                    continue L22;
                  }
                }
              }
            }
            bk.field_a.field_m = em.field_e.length;
            var3_int = 0;
            var4 = 0;
            L24: while (true) {
              if (var4 >= fb.field_d.length) {
                L25: {
                  if (vc.field_a == 2) {
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
                            L28: {
                              var13 = var11[var5];
                              var7 = se.a(3, var13, false);
                              if (var7 <= var3_int) {
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
                          var7 = se.a(3, var12, false);
                          if (var3_int >= var7) {
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
                em.field_d = bk.field_a.field_m * (id.field_c + ge.field_h << 1);
                bm.field_K = af.field_b + (var3_int - (var3_int >> 1));
                ei.field_M = -(var3_int >> 1) + af.field_b;
                var4 = 0;
                L30: while (true) {
                  if (var4 >= fb.field_d.length) {
                    rb.field_H = vc.field_f - (em.field_d >> 1);
                    vh.field_j = new int[fb.field_d.length][];
                    var4 = 0;
                    var5 = rb.field_H;
                    L31: while (true) {
                      if (fb.field_d.length <= var4) {
                        L32: {
                          if (vc.field_a == 2) {
                            bk.field_a.a(-1, -1, param2, -101);
                            break L32;
                          } else {
                            bk.field_a.a(bg.a(ag.field_f, kc.field_b, 112), 0, param2, -84);
                            break L32;
                          }
                        }
                        break L0;
                      } else {
                        L33: {
                          var6 = m.field_c[var4];
                          if (var6 >= 0) {
                            var7 = se.a(3, fb.field_d[var4], true);
                            var5 = var5 + id.field_c;
                            var8 = af.field_b + -(var7 >> 1);
                            vh.field_j[var4] = new int[4];
                            vh.field_j[var4][0] = -ae.field_c + var8;
                            vh.field_j[var4][1] = var5;
                            vh.field_j[var4][2] = (ae.field_c << 1) + var7;
                            var5 = var5 + ((ge.field_h << 1) + (id.field_c + hb.field_t));
                            vh.field_j[var4][3] = hb.field_t + (ge.field_h << 1);
                            break L33;
                          } else {
                            var5 = var5 + cm.field_f;
                            break L33;
                          }
                        }
                        var4++;
                        continue L31;
                      }
                    }
                  } else {
                    L34: {
                      stackOut_106_0 = em.field_d;
                      stackIn_108_0 = stackOut_106_0;
                      stackIn_107_0 = stackOut_106_0;
                      if (0 > m.field_c[var4]) {
                        stackOut_108_0 = stackIn_108_0;
                        stackOut_108_1 = cm.field_f;
                        stackIn_109_0 = stackOut_108_0;
                        stackIn_109_1 = stackOut_108_1;
                        break L34;
                      } else {
                        stackOut_107_0 = stackIn_107_0;
                        stackOut_107_1 = hb.field_t;
                        stackIn_109_0 = stackOut_107_0;
                        stackIn_109_1 = stackOut_107_1;
                        break L34;
                      }
                    }
                    em.field_d = stackIn_109_0 + stackIn_109_1;
                    var4++;
                    continue L30;
                  }
                }
              } else {
                L35: {
                  stackOut_85_0 = 3;
                  stackOut_85_1 = fb.field_d[var4];
                  stackIn_87_0 = stackOut_85_0;
                  stackIn_87_1 = stackOut_85_1;
                  stackIn_86_0 = stackOut_85_0;
                  stackIn_86_1 = stackOut_85_1;
                  if (m.field_c[var4] < 0) {
                    stackOut_87_0 = stackIn_87_0;
                    stackOut_87_1 = (String) (Object) stackIn_87_1;
                    stackOut_87_2 = 0;
                    stackIn_88_0 = stackOut_87_0;
                    stackIn_88_1 = stackOut_87_1;
                    stackIn_88_2 = stackOut_87_2;
                    break L35;
                  } else {
                    stackOut_86_0 = stackIn_86_0;
                    stackOut_86_1 = (String) (Object) stackIn_86_1;
                    stackOut_86_2 = 1;
                    stackIn_88_0 = stackOut_86_0;
                    stackIn_88_1 = stackOut_86_1;
                    stackIn_88_2 = stackOut_86_2;
                    break L35;
                  }
                }
                L36: {
                  var5 = se.a(stackIn_88_0, stackIn_88_1, stackIn_88_2 != 0);
                  if (var5 > var3_int) {
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
          throw pf.a((Throwable) (Object) var3, "pf.B(" + param0 + ',' + 1 + ',' + param2 + ')');
        }
    }

    final static h a(Throwable param0, String param1) {
        h var2 = null;
        if (!(param0 instanceof h)) {
            var2 = new h(param0, param1);
        } else {
            var2 = (h) (Object) param0;
            var2.field_f = var2.field_f + ' ' + param1;
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new char[128];
        field_c = null;
    }
}
