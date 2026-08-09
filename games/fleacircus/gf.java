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
        int fieldTemp$2 = 0;
        int dupTemp$3 = 0;
        byte[][] arrayValue$4 = null;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int dupTemp$7 = 0;
        byte[][] arrayValue$8 = null;
        int fieldTemp$9 = 0;
        int dupTemp$10 = 0;
        byte[][] arrayValue$11 = null;
        int fieldTemp$12 = 0;
        int dupTemp$13 = 0;
        byte[][] arrayValue$14 = null;
        int fieldTemp$15 = 0;
        int dupTemp$16 = 0;
        byte[][] arrayValue$17 = null;
        int fieldTemp$18 = 0;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        if (100 != param1) {
          if (-5001 != (param1 ^ -1)) {
            L0: {
              if ((param1 ^ -1) != -30001) {
                break L0;
              } else {
                if (pg.field_a <= 0) {
                  break L0;
                } else {
                  fieldTemp$2 = pg.field_a - 1;
                  pg.field_a = pg.field_a - 1;
                  var2_ref_byte__ = jk.field_n[fieldTemp$2];
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
                    if (param1 == a.field_g[var2]) {
                      if (-1 > (pj.field_x[var2] ^ -1)) {
                        dupTemp$3 = pj.field_x[var2] - 1;
                        arrayValue$4 = pc.field_h[var2];
                        pj.field_x[var2] = dupTemp$3;
                        var3 = arrayValue$4[dupTemp$3];
                        pc.field_h[var2][pj.field_x[var2]] = null;
                        return var3;
                      } else {
                        var2++;
                        continue L2;
                      }
                    } else {
                      var2++;
                      continue L2;
                    }
                  }
                }
              }
            }
            var2 = -89 % ((-38 - param0) / 62);
            return new byte[param1];
          } else {
            if (0 < field_c) {
              fieldTemp$5 = field_c - 1;
              field_c = field_c - 1;
              var2_ref_byte__ = v.field_U[fieldTemp$5];
              v.field_U[field_c] = null;
              return var2_ref_byte__;
            } else {
              L3: {
                if ((param1 ^ -1) != -30001) {
                  break L3;
                } else {
                  if (pg.field_a <= 0) {
                    break L3;
                  } else {
                    fieldTemp$6 = pg.field_a - 1;
                    pg.field_a = pg.field_a - 1;
                    var2_ref_byte__ = jk.field_n[fieldTemp$6];
                    jk.field_n[pg.field_a] = null;
                    return var2_ref_byte__;
                  }
                }
              }
              L4: {
                if (null == pc.field_h) {
                  break L4;
                } else {
                  var2 = 0;
                  L5: while (true) {
                    if (a.field_g.length <= var2) {
                      break L4;
                    } else {
                      if (param1 == a.field_g[var2]) {
                        if (-1 > (pj.field_x[var2] ^ -1)) {
                          dupTemp$7 = pj.field_x[var2] - 1;
                          arrayValue$8 = pc.field_h[var2];
                          pj.field_x[var2] = dupTemp$7;
                          var3 = arrayValue$8[dupTemp$7];
                          pc.field_h[var2][pj.field_x[var2]] = null;
                          return var3;
                        } else {
                          var2++;
                          continue L5;
                        }
                      } else {
                        var2++;
                        continue L5;
                      }
                    }
                  }
                }
              }
              var2 = -89 % ((-38 - param0) / 62);
              return new byte[param1];
            }
          }
        } else {
          if (th.field_n <= 0) {
            if (-5001 == (param1 ^ -1)) {
              if (0 < field_c) {
                fieldTemp$9 = field_c - 1;
                field_c = field_c - 1;
                var2_ref_byte__ = v.field_U[fieldTemp$9];
                v.field_U[field_c] = null;
                return var2_ref_byte__;
              } else {
                if ((param1 ^ -1) == -30001) {
                  if (pg.field_a <= 0) {
                    if (null != pc.field_h) {
                      var2 = 0;
                      L6: while (true) {
                        if (a.field_g.length > var2) {
                          if (param1 == a.field_g[var2]) {
                            if (-1 > (pj.field_x[var2] ^ -1)) {
                              dupTemp$10 = pj.field_x[var2] - 1;
                              arrayValue$11 = pc.field_h[var2];
                              pj.field_x[var2] = dupTemp$10;
                              var3 = arrayValue$11[dupTemp$10];
                              pc.field_h[var2][pj.field_x[var2]] = null;
                              return var3;
                            } else {
                              var2++;
                              continue L6;
                            }
                          } else {
                            var2++;
                            continue L6;
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
                    fieldTemp$12 = pg.field_a - 1;
                    pg.field_a = pg.field_a - 1;
                    var2_ref_byte__ = jk.field_n[fieldTemp$12];
                    jk.field_n[pg.field_a] = null;
                    return var2_ref_byte__;
                  }
                } else {
                  if (null != pc.field_h) {
                    var2 = 0;
                    L7: while (true) {
                      if (a.field_g.length > var2) {
                        if (param1 == a.field_g[var2]) {
                          if (-1 > (pj.field_x[var2] ^ -1)) {
                            dupTemp$13 = pj.field_x[var2] - 1;
                            arrayValue$14 = pc.field_h[var2];
                            pj.field_x[var2] = dupTemp$13;
                            var3 = arrayValue$14[dupTemp$13];
                            pc.field_h[var2][pj.field_x[var2]] = null;
                            return var3;
                          } else {
                            var2++;
                            continue L7;
                          }
                        } else {
                          var2++;
                          continue L7;
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
              L8: {
                if ((param1 ^ -1) != -30001) {
                  break L8;
                } else {
                  if (pg.field_a <= 0) {
                    break L8;
                  } else {
                    fieldTemp$15 = pg.field_a - 1;
                    pg.field_a = pg.field_a - 1;
                    var2_ref_byte__ = jk.field_n[fieldTemp$15];
                    jk.field_n[pg.field_a] = null;
                    return var2_ref_byte__;
                  }
                }
              }
              if (null != pc.field_h) {
                var2 = 0;
                L9: while (true) {
                  if (a.field_g.length > var2) {
                    if (param1 == a.field_g[var2]) {
                      if (-1 > (pj.field_x[var2] ^ -1)) {
                        dupTemp$16 = pj.field_x[var2] - 1;
                        arrayValue$17 = pc.field_h[var2];
                        pj.field_x[var2] = dupTemp$16;
                        var3 = arrayValue$17[dupTemp$16];
                        pc.field_h[var2][pj.field_x[var2]] = null;
                        return var3;
                      } else {
                        var2++;
                        continue L9;
                      }
                    } else {
                      var2++;
                      continue L9;
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
          } else {
            fieldTemp$18 = th.field_n - 1;
            th.field_n = th.field_n - 1;
            var2_ref_byte__ = rd.field_a[fieldTemp$18];
            rd.field_a[th.field_n] = null;
            return var2_ref_byte__;
          }
        }
    }

    final static void a(int param0) {
        ih var2 = null;
        vh var1 = (vh) ((Object) al.field_e.c((byte) 47));
        if (param0 > -5) {
            gf.c(126);
            if (!(var1 != null)) {
                k.c(-28354);
                return;
            }
            var2 = ae.field_a;
            var2.c((byte) -32);
            var2.c((byte) 122);
            var2.c((byte) 127);
            var2.c((byte) 124);
            var1.c(-1);
            return;
        }
        if (!(var1 != null)) {
            k.c(-28354);
            return;
        }
        var2 = ae.field_a;
        var2.c((byte) -32);
        var2.c((byte) 122);
        var2.c((byte) 127);
        var2.c((byte) 124);
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
        field_d = 256;
        field_b = null;
        field_c = 0;
        field_f = "Updates will sent to the email address you've given";
        field_a = "<%0>Bridge:<%1> This breaks and falls away after a single flea crosses it.";
    }
}
