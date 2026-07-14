/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends kd {
    static int field_p;
    static db[] field_n;
    ng field_s;
    static int field_l;
    ng field_k;
    static boolean[] field_o;
    int field_i;
    static int field_j;
    int field_q;
    static volatile int field_h;
    mk field_t;
    ij field_m;
    ij field_r;

    final static void a(df param0, int param1) {
        int var2 = 0;
        int var4 = 0;
        Object var5 = null;
        df var6 = null;
        df var7 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (null != param0.field_h) {
          if (param0.field_i != 0) {
            var2 = 0;
            L0: while (true) {
              if (pj.field_H <= var2) {
                if (param1 <= 106) {
                  L1: {
                    var5 = null;
                    String discarded$3 = ij.a(5, 11, (wf) null);
                    if (null == param0.field_b) {
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  r.a(param0, 0);
                  return;
                } else {
                  L2: {
                    if (null == param0.field_b) {
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  r.a(param0, 0);
                  return;
                }
              } else {
                var7 = tf.field_d[var2];
                if (-3 != (var7.field_g ^ -1)) {
                  var2++;
                  var2++;
                  continue L0;
                } else {
                  if (param0.field_i == var7.field_i) {
                    if (param0.field_k == var7.field_k) {
                      return;
                    } else {
                      var2++;
                      continue L0;
                    }
                  } else {
                    var2++;
                    continue L0;
                  }
                }
              }
            }
          } else {
            if (-1 != (param0.field_k ^ -1)) {
              L3: {
                var2 = 0;
                if (pj.field_H <= var2) {
                  break L3;
                } else {
                  L4: {
                    var6 = tf.field_d[var2];
                    if (-3 != (var6.field_g ^ -1)) {
                      var2++;
                      break L4;
                    } else {
                      L5: {
                        if (param0.field_i != var6.field_i) {
                          var2++;
                          break L5;
                        } else {
                          if (param0.field_k == var6.field_k) {
                            return;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var2++;
                      break L4;
                    }
                  }
                  var2++;
                  var2++;
                  var2++;
                  var2++;
                  break L3;
                }
              }
              if (param1 > 106) {
                L6: {
                  if (null == param0.field_b) {
                    break L6;
                  } else {
                    break L6;
                  }
                }
                r.a(param0, 0);
                return;
              } else {
                L7: {
                  var5 = null;
                  String discarded$4 = ij.a(5, 11, (wf) null);
                  if (null == param0.field_b) {
                    break L7;
                  } else {
                    break L7;
                  }
                }
                r.a(param0, 0);
                return;
              }
            } else {
              if (param1 <= 106) {
                L8: {
                  var5 = null;
                  String discarded$5 = ij.a(5, 11, (wf) null);
                  if (null == param0.field_b) {
                    break L8;
                  } else {
                    break L8;
                  }
                }
                r.a(param0, 0);
                return;
              } else {
                L9: {
                  if (null == param0.field_b) {
                    break L9;
                  } else {
                    break L9;
                  }
                }
                r.a(param0, 0);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final void b(int param0, ij[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int stackIn_15_0 = 0;
        int stackIn_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        var3 = ((ij) this).field_i * 2 + 1;
        var4 = 1 + var3;
        var5 = -1;
        if (param0 == -3) {
          L0: {
            if (var3 >= param1.length) {
              break L0;
            } else {
              if (param1[var3] == null) {
                break L0;
              } else {
                if (var4 >= param1.length) {
                  var5 = var3;
                  if (var5 > -1) {
                    param1[((ij) this).field_i] = param1[var5];
                    param1[var5].b(-3, param1);
                    param1[((ij) this).field_i].field_i = ((ij) this).field_i;
                    ((ij) this).field_i = -1;
                    return;
                  } else {
                    param1[((ij) this).field_i] = null;
                    ((ij) this).field_i = -1;
                    return;
                  }
                } else {
                  if (null != param1[var4]) {
                    L1: {
                      if (param1[var4].field_q > param1[var3].field_q) {
                        stackOut_42_0 = var3;
                        stackIn_43_0 = stackOut_42_0;
                        break L1;
                      } else {
                        stackOut_41_0 = var4;
                        stackIn_43_0 = stackOut_41_0;
                        break L1;
                      }
                    }
                    var5 = stackIn_43_0;
                    if (var5 > -1) {
                      param1[((ij) this).field_i] = param1[var5];
                      param1[var5].b(-3, param1);
                      param1[((ij) this).field_i].field_i = ((ij) this).field_i;
                      ((ij) this).field_i = -1;
                      return;
                    } else {
                      param1[((ij) this).field_i] = null;
                      ((ij) this).field_i = -1;
                      return;
                    }
                  } else {
                    var5 = var3;
                    if (var5 > -1) {
                      param1[((ij) this).field_i] = param1[var5];
                      param1[var5].b(-3, param1);
                      param1[((ij) this).field_i].field_i = ((ij) this).field_i;
                      ((ij) this).field_i = -1;
                      return;
                    } else {
                      param1[((ij) this).field_i] = null;
                      ((ij) this).field_i = -1;
                      return;
                    }
                  }
                }
              }
            }
          }
          L2: {
            if (var4 >= param1.length) {
              break L2;
            } else {
              if (param1[var4] != null) {
                var5 = var4;
                break L2;
              } else {
                if (var5 > -1) {
                  param1[((ij) this).field_i] = param1[var5];
                  param1[var5].b(-3, param1);
                  param1[((ij) this).field_i].field_i = ((ij) this).field_i;
                  ((ij) this).field_i = -1;
                  return;
                } else {
                  param1[((ij) this).field_i] = null;
                  ((ij) this).field_i = -1;
                  return;
                }
              }
            }
          }
          if (var5 > -1) {
            param1[((ij) this).field_i] = param1[var5];
            param1[var5].b(-3, param1);
            param1[((ij) this).field_i].field_i = ((ij) this).field_i;
            ((ij) this).field_i = -1;
            return;
          } else {
            param1[((ij) this).field_i] = null;
            ((ij) this).field_i = -1;
            return;
          }
        } else {
          L3: {
            L4: {
              var7 = null;
              ((ij) this).a(-19, (ij[]) null);
              if (var3 >= param1.length) {
                break L4;
              } else {
                if (param1[var3] == null) {
                  break L4;
                } else {
                  if (var4 < param1.length) {
                    if (null != param1[var4]) {
                      L5: {
                        if (param1[var4].field_q > param1[var3].field_q) {
                          stackOut_14_0 = var3;
                          stackIn_15_0 = stackOut_14_0;
                          break L5;
                        } else {
                          stackOut_13_0 = var4;
                          stackIn_15_0 = stackOut_13_0;
                          break L5;
                        }
                      }
                      var5 = stackIn_15_0;
                      break L3;
                    } else {
                      var5 = var3;
                      break L3;
                    }
                  } else {
                    L6: {
                      var5 = var3;
                      if (var5 > -1) {
                        param1[((ij) this).field_i] = param1[var5];
                        param1[var5].b(-3, param1);
                        param1[((ij) this).field_i].field_i = ((ij) this).field_i;
                        ((ij) this).field_i = -1;
                        break L6;
                      } else {
                        param1[((ij) this).field_i] = null;
                        ((ij) this).field_i = -1;
                        break L6;
                      }
                    }
                    return;
                  }
                }
              }
            }
            if (var4 >= param1.length) {
              break L3;
            } else {
              if (param1[var4] != null) {
                var5 = var4;
                break L3;
              } else {
                break L3;
              }
            }
          }
          if (var5 > -1) {
            param1[((ij) this).field_i] = param1[var5];
            param1[var5].b(-3, param1);
            param1[((ij) this).field_i].field_i = ((ij) this).field_i;
            ((ij) this).field_i = -1;
            return;
          } else {
            param1[((ij) this).field_i] = null;
            ((ij) this).field_i = -1;
            return;
          }
        }
    }

    final ij a(int param0, ij param1) {
        if (((ij) this).field_m != null) {
          return ((ij) this).field_m.a(23446, param1);
        } else {
          if (param1.field_m != null) {
            return ((ij) this).a(23446, param1.field_m);
          } else {
            if (param0 == 23446) {
              if (this == (Object) (Object) param1) {
                return (ij) this;
              } else {
                ((ij) this).field_s.a(param1.field_s, 82);
                ((ij) this).field_s = null;
                ((ij) this).field_k.a(param1.field_k, param0 + -23345);
                ((ij) this).field_m = param1;
                ((ij) this).field_k = null;
                ((ij) this).b((byte) -128);
                return param1;
              }
            } else {
              ((ij) this).field_k = null;
              if (this == (Object) (Object) param1) {
                return (ij) this;
              } else {
                ((ij) this).field_s.a(param1.field_s, 82);
                ((ij) this).field_s = null;
                ((ij) this).field_k.a(param1.field_k, param0 + -23345);
                ((ij) this).field_m = param1;
                ((ij) this).field_k = null;
                ((ij) this).b((byte) -128);
                return param1;
              }
            }
          }
        }
    }

    final static String a(int param0, int param1, wf param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        Object var6 = null;
        String stackIn_5_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_4_0 = null;
        try {
          L0: {
            var3_int = param2.h((byte) -124);
            if (var3_int <= param0) {
              break L0;
            } else {
              var3_int = param0;
              break L0;
            }
          }
          L1: {
            if (param1 == -22651) {
              break L1;
            } else {
              var6 = null;
              db[] discarded$2 = ij.a(-74, (byte) 99, (sh) null, 63);
              break L1;
            }
          }
          var4 = new byte[var3_int];
          param2.field_h = param2.field_h + aa.field_g.a(var3_int, -1, param2.field_j, 0, param2.field_h, var4);
          var5 = dc.a(var3_int, var4, (byte) 16, 0);
          stackOut_4_0 = (String) var5;
          stackIn_5_0 = stackOut_4_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_5_0;
        }
        return null;
    }

    final void a(ij param0, int param1, int param2, int param3, int param4) {
        if (null == ((ij) this).field_m) {
          if (null != param0.field_m) {
            ((ij) this).a(param0.field_m, param1, -1009900016, param3, param4);
            return;
          } else {
            ((ij) this).field_s.b(116, (kd) (Object) new bd((param3 << -1009900016) + param1));
            if (param2 != -1009900016) {
              return;
            } else {
              L0: {
                if ((Object) (Object) param0 != this) {
                  param0.field_k.b(param2 ^ -1009899913, (kd) (Object) new mk(param4, (ij) this));
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            }
          }
        } else {
          ((ij) this).field_m.a(param0, param1, -1009900016, param3, param4);
          return;
        }
    }

    final static db[] a(int param0, byte param1, sh param2, int param3) {
        int var4 = 0;
        if (!nb.a(param3, param0, (byte) 126, param2)) {
          return null;
        } else {
          var4 = 19 / ((-51 - param1) / 53);
          return vi.b(23793);
        }
    }

    final void a(int param0, ij[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Lexicominos.field_L ? 1 : 0;
        var3 = 51 / ((-8 - param0) / 50);
        var4 = (-1 + ((ij) this).field_i) / 2;
        L0: while (true) {
          if (0 < ((ij) this).field_i) {
            if (param1[var4].field_q > ((ij) this).field_q) {
              param1[((ij) this).field_i] = param1[var4];
              param1[((ij) this).field_i].field_i = ((ij) this).field_i;
              param1[var4] = (ij) (Object) param1;
              ((ij) this).field_i = var4;
              var4 = (-1 + ((ij) this).field_i) / 2;
              continue L0;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != 66) {
            return;
        }
        field_o = null;
        field_n = null;
    }

    ij() {
        ((ij) this).field_s = new ng();
        ((ij) this).field_k = new ng();
        ((ij) this).field_i = -1;
        ((ij) this).field_q = 1073741823;
        ((ij) this).field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new db[15];
        field_h = -1;
        field_o = new boolean[64];
        field_j = 0;
    }
}
