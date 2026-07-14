/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    static wk field_b;
    static String field_f;
    static int[] field_a;
    static ul field_c;
    static int field_d;
    static String field_e;

    final static wk a(cm param0, String param1, String param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param0.a(param1, 32);
        if (param3) {
          return null;
        } else {
          var5 = param0.a(var4, -32759, param2);
          return im.a(param0, var5, var4, 1048576);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_f = null;
        field_c = null;
        field_a = null;
        field_e = null;
        if (param0 == 0) {
            return;
        }
        field_d = -11;
    }

    final static boolean a(byte param0, int[] param1) {
        long var2 = 0L;
        int var4 = 0;
        kc var4_ref_kc = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        kc var8 = null;
        kc var9 = null;
        kc var13 = null;
        kc var14 = null;
        var7 = SteelSentinels.field_G;
        if (rn.field_v == jd.field_sb) {
          if (param0 > 10) {
            var2 = mm.a(112);
            if (ej.field_H != 0) {
              if ((ub.field_g ^ -1) > -1) {
                var4_ref_kc = (kc) (Object) ll.field_r.e(13058);
                if (var4_ref_kc != null) {
                  if ((var2 ^ -1L) >= (var4_ref_kc.field_v ^ -1L)) {
                    L0: while (true) {
                      L1: {
                        if (ub.field_g >= 0) {
                          break L1;
                        } else {
                          rf.field_d.field_p = 0;
                          if (ve.a((byte) -127, 1)) {
                            ub.field_g = rf.field_d.f(false);
                            rf.field_d.field_p = 0;
                            jg.field_f = param1[ub.field_g];
                            break L1;
                          } else {
                            return false;
                          }
                        }
                      }
                      if (pm.n(24)) {
                        if (-1 != (ej.field_H ^ -1)) {
                          L2: {
                            var4 = ej.field_H;
                            if (nh.field_f == 0.0) {
                              break L2;
                            } else {
                              var4 = (int)((double)var4 + rb.field_g.nextGaussian() * nh.field_f);
                              if (0 > var4) {
                                var4 = 0;
                                break L2;
                              } else {
                                break L2;
                              }
                            }
                          }
                          var14 = new kc(var2 - -(long)var4, ub.field_g, new byte[jg.field_f]);
                          var6 = 0;
                          L3: while (true) {
                            if (jg.field_f <= var6) {
                              ll.field_r.a(3, (ck) (Object) var14);
                              ub.field_g = -1;
                              continue L0;
                            } else {
                              var14.field_B[var6] = rf.field_d.field_t[var6];
                              var6++;
                              continue L3;
                            }
                          }
                        } else {
                          di.field_d = ma.field_W;
                          ma.field_W = aj.field_u;
                          aj.field_u = ch.field_N;
                          ch.field_N = ub.field_g;
                          ub.field_g = -1;
                          return true;
                        }
                      } else {
                        return false;
                      }
                    }
                  } else {
                    var4_ref_kc.b(4);
                    jg.field_f = var4_ref_kc.field_B.length;
                    rf.field_d.field_p = 0;
                    var5 = 0;
                    L4: while (true) {
                      if (jg.field_f <= var5) {
                        di.field_d = ma.field_W;
                        ma.field_W = aj.field_u;
                        aj.field_u = ch.field_N;
                        ch.field_N = var4_ref_kc.field_p;
                        return true;
                      } else {
                        rf.field_d.field_t[var5] = var4_ref_kc.field_B[var5];
                        var5++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  L5: while (true) {
                    L6: {
                      if (ub.field_g >= 0) {
                        break L6;
                      } else {
                        rf.field_d.field_p = 0;
                        if (ve.a((byte) -127, 1)) {
                          ub.field_g = rf.field_d.f(false);
                          rf.field_d.field_p = 0;
                          jg.field_f = param1[ub.field_g];
                          break L6;
                        } else {
                          return false;
                        }
                      }
                    }
                    if (pm.n(24)) {
                      if (-1 != (ej.field_H ^ -1)) {
                        L7: {
                          var4 = ej.field_H;
                          if (nh.field_f == 0.0) {
                            break L7;
                          } else {
                            var4 = (int)((double)var4 + rb.field_g.nextGaussian() * nh.field_f);
                            if (0 > var4) {
                              var4 = 0;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var13 = new kc(var2 - -(long)var4, ub.field_g, new byte[jg.field_f]);
                        var6 = 0;
                        L8: while (true) {
                          if (jg.field_f <= var6) {
                            ll.field_r.a(3, (ck) (Object) var13);
                            ub.field_g = -1;
                            continue L5;
                          } else {
                            var13.field_B[var6] = rf.field_d.field_t[var6];
                            var6++;
                            continue L8;
                          }
                        }
                      } else {
                        di.field_d = ma.field_W;
                        ma.field_W = aj.field_u;
                        aj.field_u = ch.field_N;
                        ch.field_N = ub.field_g;
                        ub.field_g = -1;
                        return true;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              } else {
                L9: while (true) {
                  L10: {
                    if (ub.field_g >= 0) {
                      break L10;
                    } else {
                      rf.field_d.field_p = 0;
                      if (ve.a((byte) -127, 1)) {
                        ub.field_g = rf.field_d.f(false);
                        rf.field_d.field_p = 0;
                        jg.field_f = param1[ub.field_g];
                        break L10;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (pm.n(24)) {
                    if (-1 != (ej.field_H ^ -1)) {
                      L11: {
                        var4 = ej.field_H;
                        if (nh.field_f == 0.0) {
                          break L11;
                        } else {
                          var4 = (int)((double)var4 + rb.field_g.nextGaussian() * nh.field_f);
                          if (0 > var4) {
                            var4 = 0;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                      }
                      var9 = new kc(var2 - -(long)var4, ub.field_g, new byte[jg.field_f]);
                      var6 = 0;
                      L12: while (true) {
                        if (jg.field_f <= var6) {
                          ll.field_r.a(3, (ck) (Object) var9);
                          ub.field_g = -1;
                          continue L9;
                        } else {
                          var9.field_B[var6] = rf.field_d.field_t[var6];
                          var6++;
                          continue L12;
                        }
                      }
                    } else {
                      di.field_d = ma.field_W;
                      ma.field_W = aj.field_u;
                      aj.field_u = ch.field_N;
                      ch.field_N = ub.field_g;
                      ub.field_g = -1;
                      return true;
                    }
                  } else {
                    return false;
                  }
                }
              }
            } else {
              L13: while (true) {
                L14: {
                  if (ub.field_g >= 0) {
                    break L14;
                  } else {
                    rf.field_d.field_p = 0;
                    if (ve.a((byte) -127, 1)) {
                      ub.field_g = rf.field_d.f(false);
                      rf.field_d.field_p = 0;
                      jg.field_f = param1[ub.field_g];
                      break L14;
                    } else {
                      return false;
                    }
                  }
                }
                if (pm.n(24)) {
                  if (-1 != (ej.field_H ^ -1)) {
                    L15: {
                      var4 = ej.field_H;
                      if (nh.field_f == 0.0) {
                        break L15;
                      } else {
                        var4 = (int)((double)var4 + rb.field_g.nextGaussian() * nh.field_f);
                        if (0 > var4) {
                          var4 = 0;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                    }
                    var8 = new kc(var2 - -(long)var4, ub.field_g, new byte[jg.field_f]);
                    var6 = 0;
                    L16: while (true) {
                      if (jg.field_f <= var6) {
                        ll.field_r.a(3, (ck) (Object) var8);
                        ub.field_g = -1;
                        continue L13;
                      } else {
                        var8.field_B[var6] = rf.field_d.field_t[var6];
                        var6++;
                        continue L16;
                      }
                    }
                  } else {
                    di.field_d = ma.field_W;
                    ma.field_W = aj.field_u;
                    aj.field_u = ch.field_N;
                    ch.field_N = ub.field_g;
                    ub.field_g = -1;
                    return true;
                  }
                } else {
                  return false;
                }
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static boolean a(String param0, vi param1, String param2, int param3, String param4, boolean param5, boolean param6) {
        if (cb.field_j != mm.field_e) {
            return false;
        }
        fg var8 = new fg(ag.field_p, param1);
        ag.field_p.a((lh) (Object) var8, 20);
        if (!param6) {
            rl.a(121);
            if (ee.b(88)) {
                var8.o(126);
                return true;
            }
            bk.field_ab = param0;
            bl.field_a = param5 ? true : false;
            cb.field_j = nj.field_ab;
            bl.field_f = param2;
            qf.field_d = null;
            wi.field_y = param3;
            kf.field_o = param4;
            return true;
        }
        if (ee.b(88)) {
            var8.o(126);
        } else {
            bk.field_ab = param0;
            bl.field_a = param5 ? true : false;
            cb.field_j = nj.field_ab;
            bl.field_f = param2;
            qf.field_d = null;
            wi.field_y = param3;
            kf.field_o = param4;
            return true;
        }
        return true;
    }

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) ub.field_e;
                    // monitorenter ub.field_e
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        nc.field_d = wn.field_d;
                        ob.field_q = ob.field_q + 1;
                        oh.field_f = ji.field_j;
                        pi.field_c = hc.field_G;
                        ik.field_a = ce.field_w;
                        ce.field_w = false;
                        lb.field_gc = ad.field_c;
                        oa.field_S = fg.field_Rb;
                        rj.field_j = me.field_d;
                        ad.field_c = param0;
                        sf.field_d = rb.field_a;
                        // monitorexit var1
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 4: {
                    throw (RuntimeException) (Object) var2;
                }
                case 5: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new wk(80, 90);
        field_c = null;
        field_e = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
    }
}
