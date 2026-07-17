/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql {
    static hg field_g;
    static int[][] field_a;
    static ci field_d;
    static char field_f;
    static String field_b;
    static boolean field_c;
    static String field_e;

    public static void a() {
        field_b = null;
        field_e = null;
        field_d = null;
        int var1 = -4;
        field_g = null;
        field_a = null;
    }

    final synchronized static byte[] a(byte param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if (param1 == 100) {
          if (g.field_h <= 0) {
            L0: {
              if (5000 != param1) {
                break L0;
              } else {
                if (wm.field_q <= 0) {
                  break L0;
                } else {
                  int fieldTemp$12 = wm.field_q - 1;
                  wm.field_q = wm.field_q - 1;
                  var2_ref_byte__ = di.field_Ib[fieldTemp$12];
                  di.field_Ib[wm.field_q] = null;
                  return var2_ref_byte__;
                }
              }
            }
            L1: {
              if (param1 != 30000) {
                break L1;
              } else {
                if (hn.field_t <= 0) {
                  break L1;
                } else {
                  int fieldTemp$13 = hn.field_t - 1;
                  hn.field_t = hn.field_t - 1;
                  var2_ref_byte__ = cg.field_b[fieldTemp$13];
                  cg.field_b[hn.field_t] = null;
                  return var2_ref_byte__;
                }
              }
            }
            if (null != se.field_Y) {
              var2 = 0;
              if (he.field_Fb.length > var2) {
                if (he.field_Fb[var2] == param1) {
                  if (sg.field_g[var2] > 0) {
                    sg.field_g[var2] = sg.field_g[var2] - 1;
                    var3 = se.field_Y[var2][sg.field_g[var2] - 1];
                    se.field_Y[var2][sg.field_g[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    var2++;
                    var2++;
                    var2++;
                    return new byte[param1];
                  }
                } else {
                  var2++;
                  var2++;
                  var2++;
                  var2++;
                  return new byte[param1];
                }
              } else {
                return new byte[param1];
              }
            } else {
              return new byte[param1];
            }
          } else {
            int fieldTemp$14 = g.field_h - 1;
            g.field_h = g.field_h - 1;
            var2_ref_byte__ = hk.field_K[fieldTemp$14];
            hk.field_K[g.field_h] = null;
            return var2_ref_byte__;
          }
        } else {
          if (5000 == param1) {
            if (wm.field_q <= 0) {
              L2: {
                if (param1 != 30000) {
                  break L2;
                } else {
                  if (hn.field_t <= 0) {
                    break L2;
                  } else {
                    int fieldTemp$15 = hn.field_t - 1;
                    hn.field_t = hn.field_t - 1;
                    var2_ref_byte__ = cg.field_b[fieldTemp$15];
                    cg.field_b[hn.field_t] = null;
                    return var2_ref_byte__;
                  }
                }
              }
              if (null != se.field_Y) {
                var2 = 0;
                if (he.field_Fb.length > var2) {
                  if (he.field_Fb[var2] == param1) {
                    if (sg.field_g[var2] <= 0) {
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      return new byte[param1];
                    } else {
                      sg.field_g[var2] = sg.field_g[var2] - 1;
                      var3 = se.field_Y[var2][sg.field_g[var2] - 1];
                      se.field_Y[var2][sg.field_g[var2]] = null;
                      return var3;
                    }
                  } else {
                    var2++;
                    var2++;
                    var2++;
                    var2++;
                    return new byte[param1];
                  }
                } else {
                  return new byte[param1];
                }
              } else {
                return new byte[param1];
              }
            } else {
              int fieldTemp$16 = wm.field_q - 1;
              wm.field_q = wm.field_q - 1;
              var2_ref_byte__ = di.field_Ib[fieldTemp$16];
              di.field_Ib[wm.field_q] = null;
              return var2_ref_byte__;
            }
          } else {
            L3: {
              if (param1 != 30000) {
                break L3;
              } else {
                if (hn.field_t <= 0) {
                  break L3;
                } else {
                  int fieldTemp$17 = hn.field_t - 1;
                  hn.field_t = hn.field_t - 1;
                  var2_ref_byte__ = cg.field_b[fieldTemp$17];
                  cg.field_b[hn.field_t] = null;
                  return var2_ref_byte__;
                }
              }
            }
            if (null != se.field_Y) {
              var2 = 0;
              if (he.field_Fb.length > var2) {
                if (he.field_Fb[var2] == param1) {
                  if (sg.field_g[var2] > 0) {
                    sg.field_g[var2] = sg.field_g[var2] - 1;
                    var3 = se.field_Y[var2][sg.field_g[var2] - 1];
                    se.field_Y[var2][sg.field_g[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    var2++;
                    var2++;
                    var2++;
                    return new byte[param1];
                  }
                } else {
                  var2++;
                  var2++;
                  var2++;
                  var2++;
                  return new byte[param1];
                }
              } else {
                return new byte[param1];
              }
            } else {
              return new byte[param1];
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        th.field_a = param3;
        ug.field_a = param2;
        qd.field_r = param1;
        jb.field_f = param0;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        var2 = 0;
        if (0 <= param1) {
          if (65536 > param1) {
            L0: {
              if (param1 < 256) {
                break L0;
              } else {
                param1 = param1 >>> 8;
                var2 += 8;
                break L0;
              }
            }
            L1: {
              if (16 <= param1) {
                param1 = param1 >>> 4;
                var2 += 4;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 >= 4) {
                var2 += 2;
                param1 = param1 >>> 2;
                break L2;
              } else {
                break L2;
              }
            }
            if (param0 < -109) {
              L3: {
                if (param1 < 1) {
                  break L3;
                } else {
                  var2++;
                  param1 = param1 >>> 1;
                  break L3;
                }
              }
              return param1 + var2;
            } else {
              L4: {
                int discarded$3 = ql.a(99, -61);
                if (param1 < 1) {
                  break L4;
                } else {
                  var2++;
                  param1 = param1 >>> 1;
                  break L4;
                }
              }
              return param1 + var2;
            }
          } else {
            L5: {
              var2 += 16;
              param1 = param1 >>> 16;
              if (param1 < 256) {
                break L5;
              } else {
                param1 = param1 >>> 8;
                var2 += 8;
                break L5;
              }
            }
            L6: {
              if (16 <= param1) {
                param1 = param1 >>> 4;
                var2 += 4;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param1 >= 4) {
                var2 += 2;
                param1 = param1 >>> 2;
                break L7;
              } else {
                break L7;
              }
            }
            if (param0 < -109) {
              L8: {
                if (param1 < 1) {
                  break L8;
                } else {
                  var2++;
                  param1 = param1 >>> 1;
                  break L8;
                }
              }
              return param1 + var2;
            } else {
              L9: {
                int discarded$4 = ql.a(99, -61);
                if (param1 < 1) {
                  break L9;
                } else {
                  var2++;
                  param1 = param1 >>> 1;
                  break L9;
                }
              }
              return param1 + var2;
            }
          }
        } else {
          L10: {
            var2 += 16;
            param1 = param1 >>> 16;
            if (param1 < 256) {
              break L10;
            } else {
              param1 = param1 >>> 8;
              var2 += 8;
              break L10;
            }
          }
          L11: {
            if (16 <= param1) {
              param1 = param1 >>> 4;
              var2 += 4;
              break L11;
            } else {
              break L11;
            }
          }
          L12: {
            if (param1 >= 4) {
              var2 += 2;
              param1 = param1 >>> 2;
              break L12;
            } else {
              break L12;
            }
          }
          if (param0 < -109) {
            L13: {
              if (param1 < 1) {
                break L13;
              } else {
                var2++;
                param1 = param1 >>> 1;
                break L13;
              }
            }
            return param1 + var2;
          } else {
            L14: {
              int discarded$5 = ql.a(99, -61);
              if (param1 < 1) {
                break L14;
              } else {
                var2++;
                param1 = param1 >>> 1;
                break L14;
              }
            }
            return param1 + var2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new hg(7, 0, 1, 1);
        field_f = '/';
        field_c = true;
        field_e = "Player";
        field_b = "Status";
    }
}
