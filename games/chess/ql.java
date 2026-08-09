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
        field_a = (int[][]) null;
    }

    final synchronized static byte[] a(byte param0, int param1) {
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int dupTemp$4 = 0;
        byte[][] arrayValue$5 = null;
        int fieldTemp$6 = 0;
        int dupTemp$7 = 0;
        byte[][] arrayValue$8 = null;
        int dupTemp$9 = 0;
        byte[][] arrayValue$10 = null;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int dupTemp$13 = 0;
        byte[][] arrayValue$14 = null;
        byte[] var2;
        int var2_int;
        byte[] var3;
        if ((param1 ^ -1) == -101) {
          if (g.field_h > 0) {
            fieldTemp$1 = g.field_h - 1;
            g.field_h = g.field_h - 1;
            var2 = hk.field_K[fieldTemp$1];
            hk.field_K[g.field_h] = null;
            return var2;
          } else {
            L0: {
              if (5000 != param1) {
                break L0;
              } else {
                if (wm.field_q <= 0) {
                  break L0;
                } else {
                  fieldTemp$2 = wm.field_q - 1;
                  wm.field_q = wm.field_q - 1;
                  var2 = di.field_Ib[fieldTemp$2];
                  di.field_Ib[wm.field_q] = null;
                  return var2;
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
                  fieldTemp$3 = hn.field_t - 1;
                  hn.field_t = hn.field_t - 1;
                  var2 = cg.field_b[fieldTemp$3];
                  cg.field_b[hn.field_t] = null;
                  return var2;
                }
              }
            }
            L2: {
              if (null == se.field_Y) {
                break L2;
              } else {
                var2_int = 0;
                L3: while (true) {
                  if (he.field_Fb.length <= var2_int) {
                    break L2;
                  } else {
                    if (he.field_Fb[var2_int] == param1) {
                      if (-1 > (sg.field_g[var2_int] ^ -1)) {
                        dupTemp$4 = sg.field_g[var2_int] - 1;
                        arrayValue$5 = se.field_Y[var2_int];
                        sg.field_g[var2_int] = dupTemp$4;
                        var3 = arrayValue$5[dupTemp$4];
                        se.field_Y[var2_int][sg.field_g[var2_int]] = null;
                        return var3;
                      } else {
                        var2_int++;
                        continue L3;
                      }
                    } else {
                      var2_int++;
                      continue L3;
                    }
                  }
                }
              }
            }
            if (param0 == -2) {
              return new byte[param1];
            } else {
              field_f = '';
              return new byte[param1];
            }
          }
        } else {
          if (5000 == param1) {
            if (wm.field_q <= 0) {
              if (param1 == 30000) {
                if (hn.field_t > 0) {
                  fieldTemp$6 = hn.field_t - 1;
                  hn.field_t = hn.field_t - 1;
                  var2 = cg.field_b[fieldTemp$6];
                  cg.field_b[hn.field_t] = null;
                  return var2;
                } else {
                  L4: {
                    if (null == se.field_Y) {
                      break L4;
                    } else {
                      var2_int = 0;
                      L5: while (true) {
                        if (he.field_Fb.length <= var2_int) {
                          break L4;
                        } else {
                          if (he.field_Fb[var2_int] == param1) {
                            if (-1 > (sg.field_g[var2_int] ^ -1)) {
                              dupTemp$7 = sg.field_g[var2_int] - 1;
                              arrayValue$8 = se.field_Y[var2_int];
                              sg.field_g[var2_int] = dupTemp$7;
                              var3 = arrayValue$8[dupTemp$7];
                              se.field_Y[var2_int][sg.field_g[var2_int]] = null;
                              return var3;
                            } else {
                              var2_int++;
                              continue L5;
                            }
                          } else {
                            var2_int++;
                            continue L5;
                          }
                        }
                      }
                    }
                  }
                  if (param0 == -2) {
                    return new byte[param1];
                  } else {
                    field_f = '';
                    return new byte[param1];
                  }
                }
              } else {
                L6: {
                  if (null == se.field_Y) {
                    break L6;
                  } else {
                    var2_int = 0;
                    L7: while (true) {
                      if (he.field_Fb.length <= var2_int) {
                        break L6;
                      } else {
                        if (he.field_Fb[var2_int] == param1) {
                          if (-1 > (sg.field_g[var2_int] ^ -1)) {
                            dupTemp$9 = sg.field_g[var2_int] - 1;
                            arrayValue$10 = se.field_Y[var2_int];
                            sg.field_g[var2_int] = dupTemp$9;
                            var3 = arrayValue$10[dupTemp$9];
                            se.field_Y[var2_int][sg.field_g[var2_int]] = null;
                            return var3;
                          } else {
                            var2_int++;
                            continue L7;
                          }
                        } else {
                          var2_int++;
                          continue L7;
                        }
                      }
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
              fieldTemp$11 = wm.field_q - 1;
              wm.field_q = wm.field_q - 1;
              var2 = di.field_Ib[fieldTemp$11];
              di.field_Ib[wm.field_q] = null;
              return var2;
            }
          } else {
            L8: {
              if (param1 != 30000) {
                break L8;
              } else {
                if (hn.field_t <= 0) {
                  break L8;
                } else {
                  fieldTemp$12 = hn.field_t - 1;
                  hn.field_t = hn.field_t - 1;
                  var2 = cg.field_b[fieldTemp$12];
                  cg.field_b[hn.field_t] = null;
                  return var2;
                }
              }
            }
            L9: {
              if (null == se.field_Y) {
                break L9;
              } else {
                var2_int = 0;
                L10: while (true) {
                  if (he.field_Fb.length <= var2_int) {
                    break L9;
                  } else {
                    if (he.field_Fb[var2_int] == param1) {
                      if (-1 > (sg.field_g[var2_int] ^ -1)) {
                        dupTemp$13 = sg.field_g[var2_int] - 1;
                        arrayValue$14 = se.field_Y[var2_int];
                        sg.field_g[var2_int] = dupTemp$13;
                        var3 = arrayValue$14[dupTemp$13];
                        se.field_Y[var2_int][sg.field_g[var2_int]] = null;
                        return var3;
                      } else {
                        var2_int++;
                        continue L10;
                      }
                    } else {
                      var2_int++;
                      continue L10;
                    }
                  }
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
        int var2;
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
            if (param0 >= -109) {
              L3: {
                ql.a(99, -61);
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
            if (param0 >= -109) {
              L8: {
                ql.a(99, -61);
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
          if (param0 >= -109) {
            L13: {
              ql.a(99, -61);
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
        field_g = new hg(7, 0, 1, 1);
        field_f = '/';
        field_c = true;
        field_e = "Player";
        field_b = "Status";
    }
}
