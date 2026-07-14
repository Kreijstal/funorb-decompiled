/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends cb {
    static r field_k;
    static int field_n;
    static int field_o;
    private String field_l;
    private jg field_j;
    static String field_i;
    private boolean field_m;

    final static boolean e(boolean param0) {
        if (param0) {
            od.a(16, -41);
            if (kj.a(param0)) {
                return false;
            }
            if (hc.field_D) {
                return false;
            }
            return true;
        }
        if (kj.a(param0)) {
            return false;
        }
        if (hc.field_D) {
            return false;
        }
        return true;
    }

    public static void f(int param0) {
        field_i = null;
        field_k = null;
        if (param0 != 4) {
            od.a(-85, -61);
        }
    }

    final String a(byte param0, String param1) {
        if (((od) this).field_j.a(param1, 5) == fg.field_d) {
            return ((od) this).field_j.a((byte) 122, param1);
        }
        int var3 = 71 / ((param0 - 49) / 56);
        if (((od) this).a(param1, 5) == fg.field_d) {
            return dl.field_a;
        }
        return c.field_b;
    }

    od(ui param0, ui param1) {
        super(param0);
        ((od) this).field_m = false;
        ((od) this).field_l = "";
        ((od) this).field_j = new jg(param0, param1);
    }

    final ag a(String param0, int param1) {
        jf var3 = null;
        if (!(((od) this).field_j.a(param0, param1 + 0) != fg.field_d)) {
            return fg.field_d;
        }
        if (param1 != 5) {
            return null;
        }
        if (!(param0.equals((Object) (Object) ((od) this).field_l))) {
            var3 = l.a(param0, (byte) -128);
            if (!var3.a(0)) {
                return bm.field_o;
            }
            ((od) this).field_l = param0;
            ((od) this).field_m = var3.b(-118);
        }
        return !((od) this).field_m ? fg.field_d : sc.field_a;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var5 = MinerDisturbance.field_ab;
        if ((param1 ^ -1) != -36) {
          if (36 == param1) {
            if (wi.field_v == null) {
              wi.field_v = rc.b(re.field_a[param1], 100, param2, param0);
              sa discarded$9 = mg.a(1963987425, wi.field_v);
              if (param3 == 4) {
                return;
              } else {
                od.a(-80, -28, -12, -111);
                return;
              }
            } else {
              if (!wi.field_v.k()) {
                return;
              } else {
                wi.field_v = rc.b(re.field_a[param1], 100, param2, param0);
                sa discarded$10 = mg.a(1963987425, wi.field_v);
                if (param3 == 4) {
                  return;
                } else {
                  od.a(-80, -28, -12, -111);
                  return;
                }
              }
            }
          } else {
            if (param1 != 42) {
              if (46 != param1) {
                if ((param1 ^ -1) == -48) {
                  var6 = 4;
                  var4 = var6;
                  L0: while (true) {
                    if (-1 < (var6 ^ -1)) {
                      if (param3 == 4) {
                        return;
                      } else {
                        od.a(-80, -28, -12, -111);
                        return;
                      }
                    } else {
                      L1: {
                        if (null == si.field_b[var6]) {
                          break L1;
                        } else {
                          if (!si.field_b[var6].k()) {
                            var6--;
                            var6--;
                            continue L0;
                          } else {
                            break L1;
                          }
                        }
                      }
                      L2: {
                        si.field_b[var6] = rc.b(re.field_a[param1], 100, param2, param0);
                        sa discarded$11 = mg.a(1963987425, si.field_b[var6]);
                        if (param3 == 4) {
                          break L2;
                        } else {
                          od.a(-80, -28, -12, -111);
                          break L2;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  sa discarded$12 = ii.a(re.field_a[param1], false);
                  if (param3 == 4) {
                    return;
                  } else {
                    od.a(-80, -28, -12, -111);
                    return;
                  }
                }
              } else {
                var4 = 4;
                L3: while (true) {
                  if ((var4 ^ -1) <= -1) {
                    L4: {
                      if (mh.field_b[var4] == null) {
                        break L4;
                      } else {
                        if (!mh.field_b[var4].k()) {
                          var4--;
                          var4--;
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    mh.field_b[var4] = rc.b(re.field_a[param1], 100, param2, param0);
                    sa discarded$13 = mg.a(param3 + 1963987421, mh.field_b[var4]);
                    L5: {
                      if (param3 == 4) {
                        break L5;
                      } else {
                        od.a(-80, -28, -12, -111);
                        break L5;
                      }
                    }
                    return;
                  } else {
                    if (param3 == 4) {
                      return;
                    } else {
                      od.a(-80, -28, -12, -111);
                      return;
                    }
                  }
                }
              }
            } else {
              if (df.field_a != null) {
                if (!df.field_a.k()) {
                  return;
                } else {
                  df.field_a = rc.b(re.field_a[param1], 100, param2, param0);
                  sa discarded$14 = mg.a(1963987425, df.field_a);
                  if (param3 == 4) {
                    return;
                  } else {
                    od.a(-80, -28, -12, -111);
                    return;
                  }
                }
              } else {
                df.field_a = rc.b(re.field_a[param1], 100, param2, param0);
                sa discarded$15 = mg.a(1963987425, df.field_a);
                if (param3 == 4) {
                  return;
                } else {
                  od.a(-80, -28, -12, -111);
                  return;
                }
              }
            }
          }
        } else {
          if (null != qg.field_b) {
            if (!qg.field_b.k()) {
              return;
            } else {
              qg.field_b = rc.b(re.field_a[param1], 100, param2, param0);
              sa discarded$16 = mg.a(param3 + 1963987421, qg.field_b);
              if (param3 == 4) {
                return;
              } else {
                od.a(-80, -28, -12, -111);
                return;
              }
            }
          } else {
            qg.field_b = rc.b(re.field_a[param1], 100, param2, param0);
            sa discarded$17 = mg.a(param3 + 1963987421, qg.field_b);
            if (param3 == 4) {
              return;
            } else {
              od.a(-80, -28, -12, -111);
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        aa.field_f = oi.field_J[param1];
        ge.field_d = kd.field_k[param1];
        ic.field_g = ra.field_e[param1];
        if (param0 < 77) {
            field_i = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 640;
        field_i = "       ";
        field_o = 250;
        field_k = new r();
    }
}
