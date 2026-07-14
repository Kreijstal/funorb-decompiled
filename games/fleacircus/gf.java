/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static int field_d;
    static String field_a;
    static uf field_e;
    static String field_b;
    private static int field_c;
    static String field_f;
    static sf field_g;

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if (100 != param1) {
          if (-5001 != (param1 ^ -1)) {
            L0: {
              if ((param1 ^ -1) != -30001) {
                break L0;
              } else {
                if (pg.field_a <= 0) {
                  break L0;
                } else {
                  pg.field_a = pg.field_a - 1;
                  var2_ref_byte__ = jk.field_n[pg.field_a - 1];
                  jk.field_n[pg.field_a] = null;
                  return var2_ref_byte__;
                }
              }
            }
            L1: {
              if (null == pc.field_h) {
                break L1;
              } else {
                var2 = 0;
                L2: while (true) {
                  if (a.field_g.length <= var2) {
                    break L1;
                  } else {
                    if (param1 != a.field_g[var2]) {
                      var2++;
                      var2++;
                      continue L2;
                    } else {
                      if (-1 > (pj.field_x[var2] ^ -1)) {
                        pj.field_x[var2] = pj.field_x[var2] - 1;
                        var3 = pc.field_h[var2][pj.field_x[var2] - 1];
                        pc.field_h[var2][pj.field_x[var2]] = null;
                        return var3;
                      } else {
                        var2++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
            var2 = -89 % ((-38 - param0) / 62);
            return new byte[param1];
          } else {
            if (0 >= field_c) {
              L3: {
                if ((param1 ^ -1) != -30001) {
                  break L3;
                } else {
                  if (pg.field_a <= 0) {
                    break L3;
                  } else {
                    pg.field_a = pg.field_a - 1;
                    var2_ref_byte__ = jk.field_n[pg.field_a - 1];
                    jk.field_n[pg.field_a] = null;
                    return var2_ref_byte__;
                  }
                }
              }
              if (null != pc.field_h) {
                var2 = 0;
                L4: while (true) {
                  if (a.field_g.length <= var2) {
                    var2 = -89 % ((-38 - param0) / 62);
                    return new byte[param1];
                  } else {
                    if (param1 != a.field_g[var2]) {
                      var2++;
                      var2++;
                      continue L4;
                    } else {
                      if (-1 > (pj.field_x[var2] ^ -1)) {
                        pj.field_x[var2] = pj.field_x[var2] - 1;
                        var3 = pc.field_h[var2][pj.field_x[var2] - 1];
                        pc.field_h[var2][pj.field_x[var2]] = null;
                        return var3;
                      } else {
                        var2++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var2 = -89 % ((-38 - param0) / 62);
                return new byte[param1];
              }
            } else {
              field_c = field_c - 1;
              var2_ref_byte__ = v.field_U[field_c - 1];
              v.field_U[field_c] = null;
              return var2_ref_byte__;
            }
          }
        } else {
          if (th.field_n <= 0) {
            if (-5001 == (param1 ^ -1)) {
              if (0 < field_c) {
                field_c = field_c - 1;
                var2_ref_byte__ = v.field_U[field_c - 1];
                v.field_U[field_c] = null;
                return var2_ref_byte__;
              } else {
                if ((param1 ^ -1) == -30001) {
                  if (pg.field_a <= 0) {
                    if (null != pc.field_h) {
                      var2 = 0;
                      L5: while (true) {
                        if (a.field_g.length > var2) {
                          if (param1 != a.field_g[var2]) {
                            var2++;
                            var2++;
                            continue L5;
                          } else {
                            if (-1 > (pj.field_x[var2] ^ -1)) {
                              pj.field_x[var2] = pj.field_x[var2] - 1;
                              var3 = pc.field_h[var2][pj.field_x[var2] - 1];
                              pc.field_h[var2][pj.field_x[var2]] = null;
                              return var3;
                            } else {
                              var2++;
                              continue L5;
                            }
                          }
                        } else {
                          var2 = -89 % ((-38 - param0) / 62);
                          return new byte[param1];
                        }
                      }
                    } else {
                      var2 = -89 % ((-38 - param0) / 62);
                      return new byte[param1];
                    }
                  } else {
                    pg.field_a = pg.field_a - 1;
                    var2_ref_byte__ = jk.field_n[pg.field_a - 1];
                    jk.field_n[pg.field_a] = null;
                    return var2_ref_byte__;
                  }
                } else {
                  if (null != pc.field_h) {
                    var2 = 0;
                    L6: while (true) {
                      if (a.field_g.length > var2) {
                        if (param1 != a.field_g[var2]) {
                          var2++;
                          var2++;
                          continue L6;
                        } else {
                          if (-1 > (pj.field_x[var2] ^ -1)) {
                            pj.field_x[var2] = pj.field_x[var2] - 1;
                            var3 = pc.field_h[var2][pj.field_x[var2] - 1];
                            pc.field_h[var2][pj.field_x[var2]] = null;
                            return var3;
                          } else {
                            var2++;
                            continue L6;
                          }
                        }
                      } else {
                        var2 = -89 % ((-38 - param0) / 62);
                        return new byte[param1];
                      }
                    }
                  } else {
                    var2 = -89 % ((-38 - param0) / 62);
                    return new byte[param1];
                  }
                }
              }
            } else {
              L7: {
                if ((param1 ^ -1) != -30001) {
                  break L7;
                } else {
                  if (pg.field_a <= 0) {
                    break L7;
                  } else {
                    pg.field_a = pg.field_a - 1;
                    var2_ref_byte__ = jk.field_n[pg.field_a - 1];
                    jk.field_n[pg.field_a] = null;
                    return var2_ref_byte__;
                  }
                }
              }
              if (null != pc.field_h) {
                var2 = 0;
                if (a.field_g.length > var2) {
                  if (param1 == a.field_g[var2]) {
                    if (-1 > (pj.field_x[var2] ^ -1)) {
                      pj.field_x[var2] = pj.field_x[var2] - 1;
                      var3 = pc.field_h[var2][pj.field_x[var2] - 1];
                      pc.field_h[var2][pj.field_x[var2]] = null;
                      return var3;
                    } else {
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      var2 = -89 % ((-38 - param0) / 62);
                      return new byte[param1];
                    }
                  } else {
                    var2++;
                    var2++;
                    var2++;
                    var2++;
                    var2 = -89 % ((-38 - param0) / 62);
                    return new byte[param1];
                  }
                } else {
                  var2 = -89 % ((-38 - param0) / 62);
                  return new byte[param1];
                }
              } else {
                var2 = -89 % ((-38 - param0) / 62);
                return new byte[param1];
              }
            }
          } else {
            th.field_n = th.field_n - 1;
            var2_ref_byte__ = rd.field_a[th.field_n - 1];
            rd.field_a[th.field_n] = null;
            return var2_ref_byte__;
          }
        }
    }

    final static void a(int param0) {
        ih var2 = null;
        vh var1 = (vh) (Object) al.field_e.c((byte) 47);
        if (param0 > -5) {
            gf.c(126);
            if (!(var1 != null)) {
                k.c(-28354);
                return;
            }
            var2 = ae.field_a;
            int discarded$0 = var2.c((byte) -32);
            int discarded$1 = var2.c((byte) 122);
            int discarded$2 = var2.c((byte) 127);
            int discarded$3 = var2.c((byte) 124);
            var1.c(-1);
            return;
        }
        if (!(var1 != null)) {
            k.c(-28354);
            return;
        }
        var2 = ae.field_a;
        int discarded$4 = var2.c((byte) -32);
        int discarded$5 = var2.c((byte) 122);
        int discarded$6 = var2.c((byte) 127);
        int discarded$7 = var2.c((byte) 124);
        var1.c(-1);
    }

    public static void c(int param0) {
        field_b = null;
        field_e = null;
        if (param0 >= -40) {
          gf.c(95);
          field_g = null;
          field_a = null;
          field_f = null;
          return;
        } else {
          field_g = null;
          field_a = null;
          field_f = null;
          return;
        }
    }

    final static boolean b(int param0) {
        int var1 = 0;
        if (0 == (pd.field_l ^ -1)) {
            if (!(gi.a(1, true))) {
                return false;
            }
            pd.field_l = ae.field_a.e(false);
            ae.field_a.field_i = 0;
        }
        if (!(pd.field_l != -2)) {
            if (gi.a(2, true)) {
                pd.field_l = ae.field_a.d((byte) -65);
                ae.field_a.field_i = 0;
                var1 = -114 % ((param0 - 53) / 54);
                return gi.a(pd.field_l, true);
            }
            return false;
        }
        var1 = -114 % ((param0 - 53) / 54);
        return gi.a(pd.field_l, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 256;
        field_b = null;
        field_c = 0;
        field_f = "Updates will sent to the email address you've given";
        field_a = "<%0>Bridge:<%1> This breaks and falls away after a single flea crosses it.";
    }
}
