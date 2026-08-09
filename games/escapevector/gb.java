/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    static hj field_b;
    int field_c;
    int field_a;

    final static void a(java.math.BigInteger param0, boolean param1, java.math.BigInteger param2, byte[] param3, n param4, int param5, int param6) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        var10 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var7_int = am.a((byte) 57, param5);
              if (null != ae.field_d) {
                break L1;
              } else {
                ae.field_d = new java.security.SecureRandom();
                break L1;
              }
            }
            L2: {
              var13 = new int[4];
              var12 = var13;
              var8 = var12;
              if (!param1) {
                break L2;
              } else {
                gb.b(43);
                break L2;
              }
            }
            var9 = 0;
            L3: while (true) {
              if (-5 >= (var9 ^ -1)) {
                L4: {
                  L5: {
                    if (null == kf.field_r) {
                      break L5;
                    } else {
                      if (var7_int > kf.field_r.field_g.length) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  kf.field_r = new n(var7_int);
                  break L4;
                }
                L6: {
                  L7: {
                    kf.field_r.field_m = 0;
                    kf.field_r.a(param5, (byte) 21, param6, param3);
                    kf.field_r.g(-1, var7_int);
                    kf.field_r.a(1527987844, var13);
                    if (null == oj.field_L) {
                      break L7;
                    } else {
                      if (100 <= oj.field_L.field_g.length) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  oj.field_L = new n(100);
                  break L6;
                }
                oj.field_L.field_m = 0;
                oj.field_L.f(10, -123);
                var11 = 0;
                var9 = var11;
                L8: while (true) {
                  if (-5 >= (var11 ^ -1)) {
                    oj.field_L.h(48, param5);
                    oj.field_L.a((byte) -94, param0, param2);
                    param4.a(oj.field_L.field_m, (byte) 21, 0, oj.field_L.field_g);
                    param4.a(kf.field_r.field_m, (byte) 21, 0, kf.field_r.field_g);
                    break L0;
                  } else {
                    oj.field_L.a((byte) 127, var13[var11]);
                    var11++;
                    continue L8;
                  }
                }
              } else {
                var8[var9] = ae.field_d.nextInt();
                var9++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var7);

            stackIn_23_1 = new StringBuilder().append("gb.B(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L9;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L10;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L11;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param4 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L12;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L12;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_24_0), stackIn_33_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final gb a(int param0) {
        if (param0 != 10) {
          this.field_c = 110;
          return new gb(this.field_a, this.field_c);
        } else {
          return new gb(this.field_a, this.field_c);
        }
    }

    final static void a(boolean param0, byte param1, java.awt.Canvas param2) {
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (fc.field_a < 10) {
                L2: {
                  var3_int = 0;
                  if (!rh.field_H) {
                    break L2;
                  } else {
                    rh.field_H = false;
                    var3_int = 1;
                    break L2;
                  }
                }
                rh.a((byte) 9, var3_int != 0, wi.field_f, qe.a(-111), le.b(1));
                break L1;
              } else {
                if (!jf.l(param1 + -89)) {
                  em.d();
                  ok.a(240, 320, param1 ^ 72);
                  nn.a(param2, 0, -1, 0);
                  break L1;
                } else {
                  if (ff.field_e != 0) {
                    ah.a(param2, 0);
                    break L1;
                  } else {
                    wc.a(param0, 1983, false);
                    nn.a(param2, 0, -1, 0);
                    break L1;
                  }
                }
              }
            }
            if (param1 == 92) {
              break L0;
            } else {
              gb.b(90);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("gb.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != -5) {
            return;
        }
        field_b = null;
    }

    final static int a(int param0, int param1, int param2) {
        if (240 <= param0) {
          if ((param0 ^ -1) > -401) {
            L0: {
              if (param1 < 262) {
                break L0;
              } else {
                if (289 <= param1) {
                  break L0;
                } else {
                  return 0;
                }
              }
            }
            if (param2 == 8158) {
              L1: {
                if (-281 < (param0 ^ -1)) {
                  break L1;
                } else {
                  if (360 <= param0) {
                    break L1;
                  } else {
                    if ((param1 ^ -1) > -333) {
                      break L1;
                    } else {
                      if ((param1 ^ -1) <= -360) {
                        break L1;
                      } else {
                        return 1;
                      }
                    }
                  }
                }
              }
              return -1;
            } else {
              field_b = (hj) null;
              if (-281 >= (param0 ^ -1)) {
                if (360 > param0) {
                  if ((param1 ^ -1) <= -333) {
                    if ((param1 ^ -1) > -360) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            }
          } else {
            if (param2 == 8158) {
              if (-281 >= (param0 ^ -1)) {
                if (360 > param0) {
                  if ((param1 ^ -1) <= -333) {
                    if ((param1 ^ -1) <= -360) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            } else {
              field_b = (hj) null;
              if (-281 >= (param0 ^ -1)) {
                if (360 > param0) {
                  if ((param1 ^ -1) <= -333) {
                    if ((param1 ^ -1) <= -360) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            }
          }
        } else {
          if (param2 == 8158) {
            if (-281 >= (param0 ^ -1)) {
              if (360 > param0) {
                if ((param1 ^ -1) <= -333) {
                  if ((param1 ^ -1) > -360) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          } else {
            field_b = (hj) null;
            if (-281 >= (param0 ^ -1)) {
              if (360 > param0) {
                if ((param1 ^ -1) <= -333) {
                  if ((param1 ^ -1) > -360) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          }
        }
    }

    gb(int param0, int param1) {
        this.field_a = param0;
        this.field_c = param1;
    }

    static {
    }
}
