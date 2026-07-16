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

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        field_d = null;
        int var1 = -18 / ((param0 - -37) / 32);
        field_g = null;
        field_a = null;
    }

    final synchronized static byte[] a(byte param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if ((param1 ^ -1) == -101) {
          if (g.field_h <= 0) {
            L0: {
              if (5000 != param1) {
                break L0;
              } else {
                if (wm.field_q <= 0) {
                  break L0;
                } else {
                  int fieldTemp$6 = wm.field_q - 1;
                  wm.field_q = wm.field_q - 1;
                  var2_ref_byte__ = di.field_Ib[fieldTemp$6];
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
                  int fieldTemp$7 = hn.field_t - 1;
                  hn.field_t = hn.field_t - 1;
                  var2_ref_byte__ = cg.field_b[fieldTemp$7];
                  cg.field_b[hn.field_t] = null;
                  return var2_ref_byte__;
                }
              }
            }
            L2: {
              if (null == se.field_Y) {
                break L2;
              } else {
                var2 = 0;
                if (he.field_Fb.length <= var2) {
                  break L2;
                } else {
                  L3: {
                    if (he.field_Fb[var2] != param1) {
                      var2++;
                      break L3;
                    } else {
                      if (-1 <= (sg.field_g[var2] ^ -1)) {
                        var2++;
                        break L3;
                      } else {
                        sg.field_g[var2] = sg.field_g[var2] - 1;
                        var3 = se.field_Y[var2][sg.field_g[var2] - 1];
                        se.field_Y[var2][sg.field_g[var2]] = null;
                        return var3;
                      }
                    }
                  }
                  var2++;
                  var2++;
                  var2++;
                  break L2;
                }
              }
            }
            if (param0 == -2) {
              return new byte[param1];
            } else {
              field_f = '';
              return new byte[param1];
            }
          } else {
            int fieldTemp$8 = g.field_h - 1;
            g.field_h = g.field_h - 1;
            var2_ref_byte__ = hk.field_K[fieldTemp$8];
            hk.field_K[g.field_h] = null;
            return var2_ref_byte__;
          }
        } else {
          if (5000 == param1) {
            if (wm.field_q <= 0) {
              if (param1 == 30000) {
                if (hn.field_t <= 0) {
                  L4: {
                    if (null == se.field_Y) {
                      break L4;
                    } else {
                      var2 = 0;
                      if (he.field_Fb.length <= var2) {
                        break L4;
                      } else {
                        L5: {
                          if (he.field_Fb[var2] != param1) {
                            var2++;
                            break L5;
                          } else {
                            if (-1 <= (sg.field_g[var2] ^ -1)) {
                              var2++;
                              break L5;
                            } else {
                              sg.field_g[var2] = sg.field_g[var2] - 1;
                              var3 = se.field_Y[var2][sg.field_g[var2] - 1];
                              se.field_Y[var2][sg.field_g[var2]] = null;
                              return var3;
                            }
                          }
                        }
                        var2++;
                        var2++;
                        var2++;
                        break L4;
                      }
                    }
                  }
                  if (param0 != -2) {
                    field_f = '';
                    return new byte[param1];
                  } else {
                    return new byte[param1];
                  }
                } else {
                  int fieldTemp$9 = hn.field_t - 1;
                  hn.field_t = hn.field_t - 1;
                  var2_ref_byte__ = cg.field_b[fieldTemp$9];
                  cg.field_b[hn.field_t] = null;
                  return var2_ref_byte__;
                }
              } else {
                L6: {
                  if (null == se.field_Y) {
                    break L6;
                  } else {
                    var2 = 0;
                    if (he.field_Fb.length <= var2) {
                      break L6;
                    } else {
                      L7: {
                        if (he.field_Fb[var2] != param1) {
                          var2++;
                          break L7;
                        } else {
                          if (-1 <= (sg.field_g[var2] ^ -1)) {
                            var2++;
                            break L7;
                          } else {
                            sg.field_g[var2] = sg.field_g[var2] - 1;
                            var3 = se.field_Y[var2][sg.field_g[var2] - 1];
                            se.field_Y[var2][sg.field_g[var2]] = null;
                            return var3;
                          }
                        }
                      }
                      var2++;
                      var2++;
                      var2++;
                      break L6;
                    }
                  }
                }
                if (param0 != -2) {
                  field_f = '';
                  return new byte[param1];
                } else {
                  return new byte[param1];
                }
              }
            } else {
              int fieldTemp$10 = wm.field_q - 1;
              wm.field_q = wm.field_q - 1;
              var2_ref_byte__ = di.field_Ib[fieldTemp$10];
              di.field_Ib[wm.field_q] = null;
              return var2_ref_byte__;
            }
          } else {
            L8: {
              if (param1 != 30000) {
                break L8;
              } else {
                if (hn.field_t <= 0) {
                  break L8;
                } else {
                  int fieldTemp$11 = hn.field_t - 1;
                  hn.field_t = hn.field_t - 1;
                  var2_ref_byte__ = cg.field_b[fieldTemp$11];
                  cg.field_b[hn.field_t] = null;
                  return var2_ref_byte__;
                }
              }
            }
            L9: {
              if (null == se.field_Y) {
                break L9;
              } else {
                var2 = 0;
                if (he.field_Fb.length <= var2) {
                  break L9;
                } else {
                  L10: {
                    if (he.field_Fb[var2] != param1) {
                      var2++;
                      break L10;
                    } else {
                      if (-1 <= (sg.field_g[var2] ^ -1)) {
                        var2++;
                        break L10;
                      } else {
                        sg.field_g[var2] = sg.field_g[var2] - 1;
                        var3 = se.field_Y[var2][sg.field_g[var2] - 1];
                        se.field_Y[var2][sg.field_g[var2]] = null;
                        return var3;
                      }
                    }
                  }
                  var2++;
                  var2++;
                  var2++;
                  break L9;
                }
              }
            }
            if (param0 != -2) {
              field_f = '';
              return new byte[param1];
            } else {
              return new byte[param1];
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        th.field_a = param3;
        ug.field_a = param2;
        qd.field_r = param1;
        jb.field_f = param0;
        if (param4 != 66) {
            ql.a((byte) 119);
        }
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
              if ((param1 ^ -1) <= -5) {
                var2 += 2;
                param1 = param1 >>> 2;
                break L2;
              } else {
                break L2;
              }
            }
            if (param0 < -109) {
              L3: {
                if (-2 < (param1 ^ -1)) {
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
                if (-2 < (param1 ^ -1)) {
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
              if ((param1 ^ -1) <= -5) {
                var2 += 2;
                param1 = param1 >>> 2;
                break L7;
              } else {
                break L7;
              }
            }
            if (param0 < -109) {
              L8: {
                if (-2 < (param1 ^ -1)) {
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
                if (-2 < (param1 ^ -1)) {
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
            if ((param1 ^ -1) <= -5) {
              var2 += 2;
              param1 = param1 >>> 2;
              break L12;
            } else {
              break L12;
            }
          }
          if (param0 < -109) {
            L13: {
              if (-2 < (param1 ^ -1)) {
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
              if (-2 < (param1 ^ -1)) {
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
