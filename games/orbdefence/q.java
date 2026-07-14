/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static float field_b;
    static String field_a;
    static String field_c;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 <= 96) {
            hj[] discarded$0 = q.a(false, -77, -89, 87, 85);
        }
    }

    final synchronized static byte[] a(int param0, byte param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3_ref_byte__ = null;
        int var3 = 0;
        byte[] var4 = null;
        if (-101 != (param0 ^ -1)) {
          var2 = 25 % ((param1 - -16) / 48);
          if (param0 != -5001) {
            if (-30001 != (param0 ^ -1)) {
              L0: {
                if (null == ef.field_g) {
                  break L0;
                } else {
                  var3 = 0;
                  L1: while (true) {
                    if (ec.field_E.length <= var3) {
                      break L0;
                    } else {
                      if (ec.field_E[var3] != param0) {
                        var3++;
                        var3++;
                        continue L1;
                      } else {
                        if ((fb.field_f[var3] ^ -1) < -1) {
                          fb.field_f[var3] = fb.field_f[var3] - 1;
                          var4 = ef.field_g[var3][fb.field_f[var3] - 1];
                          ef.field_g[var3][fb.field_f[var3]] = null;
                          return var4;
                        } else {
                          var3++;
                          continue L1;
                        }
                      }
                    }
                  }
                }
              }
              return new byte[param0];
            } else {
              if ((lf.field_d ^ -1) < -1) {
                lf.field_d = lf.field_d - 1;
                var3_ref_byte__ = vf.field_c[lf.field_d - 1];
                vf.field_c[lf.field_d] = null;
                return var3_ref_byte__;
              } else {
                L2: {
                  if (null == ef.field_g) {
                    break L2;
                  } else {
                    var3 = 0;
                    L3: while (true) {
                      if (ec.field_E.length <= var3) {
                        break L2;
                      } else {
                        if (ec.field_E[var3] != param0) {
                          var3++;
                          var3++;
                          continue L3;
                        } else {
                          if ((fb.field_f[var3] ^ -1) < -1) {
                            fb.field_f[var3] = fb.field_f[var3] - 1;
                            var4 = ef.field_g[var3][fb.field_f[var3] - 1];
                            ef.field_g[var3][fb.field_f[var3]] = null;
                            return var4;
                          } else {
                            var3++;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                }
                return new byte[param0];
              }
            }
          } else {
            if (pd.field_C <= 0) {
              if (-30001 != param0) {
                L4: {
                  if (null == ef.field_g) {
                    break L4;
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if (ec.field_E.length <= var3) {
                        break L4;
                      } else {
                        if (ec.field_E[var3] != param0) {
                          var3++;
                          var3++;
                          continue L5;
                        } else {
                          if ((fb.field_f[var3] ^ -1) < -1) {
                            fb.field_f[var3] = fb.field_f[var3] - 1;
                            var4 = ef.field_g[var3][fb.field_f[var3] - 1];
                            ef.field_g[var3][fb.field_f[var3]] = null;
                            return var4;
                          } else {
                            var3++;
                            continue L5;
                          }
                        }
                      }
                    }
                  }
                }
                return new byte[param0];
              } else {
                if ((lf.field_d ^ -1) >= -1) {
                  if (null != ef.field_g) {
                    var3 = 0;
                    L6: while (true) {
                      if (ec.field_E.length > var3) {
                        if (ec.field_E[var3] != param0) {
                          var3++;
                          var3++;
                          continue L6;
                        } else {
                          if ((fb.field_f[var3] ^ -1) < -1) {
                            fb.field_f[var3] = fb.field_f[var3] - 1;
                            var4 = ef.field_g[var3][fb.field_f[var3] - 1];
                            ef.field_g[var3][fb.field_f[var3]] = null;
                            return var4;
                          } else {
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        return new byte[param0];
                      }
                    }
                  } else {
                    return new byte[param0];
                  }
                } else {
                  lf.field_d = lf.field_d - 1;
                  var3_ref_byte__ = vf.field_c[lf.field_d - 1];
                  vf.field_c[lf.field_d] = null;
                  return var3_ref_byte__;
                }
              }
            } else {
              pd.field_C = pd.field_C - 1;
              var3_ref_byte__ = pe.field_a[pd.field_C - 1];
              pe.field_a[pd.field_C] = null;
              return var3_ref_byte__;
            }
          }
        } else {
          if ((gg.field_Q ^ -1) >= -1) {
            var2 = 25 % ((param1 - -16) / 48);
            if (param0 == -5001) {
              if (pd.field_C > 0) {
                pd.field_C = pd.field_C - 1;
                var3_ref_byte__ = pe.field_a[pd.field_C - 1];
                pe.field_a[pd.field_C] = null;
                return var3_ref_byte__;
              } else {
                if (-30001 == (param0 ^ -1)) {
                  if ((lf.field_d ^ -1) < -1) {
                    lf.field_d = lf.field_d - 1;
                    var3_ref_byte__ = vf.field_c[lf.field_d - 1];
                    vf.field_c[lf.field_d] = null;
                    return var3_ref_byte__;
                  } else {
                    if (null != ef.field_g) {
                      var3 = 0;
                      L7: while (true) {
                        if (ec.field_E.length > var3) {
                          if (ec.field_E[var3] != param0) {
                            var3++;
                            var3++;
                            continue L7;
                          } else {
                            if ((fb.field_f[var3] ^ -1) < -1) {
                              fb.field_f[var3] = fb.field_f[var3] - 1;
                              var4 = ef.field_g[var3][fb.field_f[var3] - 1];
                              ef.field_g[var3][fb.field_f[var3]] = null;
                              return var4;
                            } else {
                              var3++;
                              continue L7;
                            }
                          }
                        } else {
                          return new byte[param0];
                        }
                      }
                    } else {
                      return new byte[param0];
                    }
                  }
                } else {
                  if (null != ef.field_g) {
                    var3 = 0;
                    L8: while (true) {
                      if (ec.field_E.length > var3) {
                        if (ec.field_E[var3] != param0) {
                          var3++;
                          var3++;
                          continue L8;
                        } else {
                          if ((fb.field_f[var3] ^ -1) < -1) {
                            fb.field_f[var3] = fb.field_f[var3] - 1;
                            var4 = ef.field_g[var3][fb.field_f[var3] - 1];
                            ef.field_g[var3][fb.field_f[var3]] = null;
                            return var4;
                          } else {
                            var3++;
                            continue L8;
                          }
                        }
                      } else {
                        return new byte[param0];
                      }
                    }
                  } else {
                    return new byte[param0];
                  }
                }
              }
            } else {
              L9: {
                if (-30001 != param0) {
                  break L9;
                } else {
                  if ((lf.field_d ^ -1) < -1) {
                    lf.field_d = lf.field_d - 1;
                    var3_ref_byte__ = vf.field_c[lf.field_d - 1];
                    vf.field_c[lf.field_d] = null;
                    return var3_ref_byte__;
                  } else {
                    break L9;
                  }
                }
              }
              if (null != ef.field_g) {
                var3 = 0;
                if (ec.field_E.length > var3) {
                  if (ec.field_E[var3] == param0) {
                    if ((fb.field_f[var3] ^ -1) < -1) {
                      fb.field_f[var3] = fb.field_f[var3] - 1;
                      var4 = ef.field_g[var3][fb.field_f[var3] - 1];
                      ef.field_g[var3][fb.field_f[var3]] = null;
                      return var4;
                    } else {
                      var3++;
                      var3++;
                      var3++;
                      var3++;
                      return new byte[param0];
                    }
                  } else {
                    var3++;
                    var3++;
                    var3++;
                    var3++;
                    return new byte[param0];
                  }
                } else {
                  return new byte[param0];
                }
              } else {
                return new byte[param0];
              }
            }
          } else {
            gg.field_Q = gg.field_Q - 1;
            var2_ref_byte__ = qh.field_b[gg.field_Q - 1];
            qh.field_b[gg.field_Q] = null;
            return var2_ref_byte__;
          }
        }
    }

    final static hj[] a(boolean param0, int param1, int param2, int param3, int param4) {
        if (param0) {
            return null;
        }
        return kk.a(3, 1, param1, 1, (byte) 123, param3, 1, param2, param4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Log in";
        field_c = "BEAM BLAST";
    }
}
