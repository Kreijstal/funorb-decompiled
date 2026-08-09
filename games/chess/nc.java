/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends fb {
    private int field_R;
    int field_M;
    static pj field_N;
    int field_U;
    static jc field_O;
    private ml field_S;
    static String field_Q;
    static String field_P;
    static int field_T;

    final int a(int param0, byte param1) {
        if (param1 == 86) {
          if (0 <= param0) {
            if (param0 >= this.field_S.a(true)) {
              return -1;
            } else {
              return this.field_S.c(param0, 1);
            }
          } else {
            return -1;
          }
        } else {
          return 60;
        }
    }

    public static void e(byte param0) {
        field_Q = null;
        int var1 = -3 / ((-55 - param0) / 42);
        field_N = null;
        field_P = null;
        field_O = null;
    }

    final int f(byte param0) {
        if (param0 < 51) {
            this.field_S = (ml) null;
            return this.field_R;
        }
        return this.field_R;
    }

    final boolean a(int param0, int param1, int param2, byte param3, mf param4, int param5, int param6) {
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Chess.field_G;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackIn_24_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L1: {
                var8_int = -param6 + (param1 + -this.field_U);
                var9 = this.field_y + -(2 * this.field_U);
                if (var8_int <= var9) {
                  break L1;
                } else {
                  var8_int = var9;
                  break L1;
                }
              }
              L2: {
                if ((var8_int ^ -1) > -1) {
                  var8_int = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var8_int = var8_int * this.field_R / var9;
                if (param0 == 1) {
                  this.field_S.a(var8_int, (byte) 43);
                  break L3;
                } else {
                  if (2 != param0) {
                    break L3;
                  } else {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (this.field_S.a(true) <= var12) {
                        if (-1 < (var11 ^ -1)) {
                          return true;
                        } else {
                          this.field_S.a(-1, var11);
                          break L3;
                        }
                      } else {
                        L5: {
                          var13 = -var8_int + this.field_S.c(var12, 1);
                          var13 = var13 * var13;
                          if (var13 < var10) {
                            var10 = var13;
                            var11 = var12;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  }
                }
              }
              stackIn_22_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var8);

            stackIn_27_1 = new StringBuilder().append("nc.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_22_0 != 0;
        } else {
          return stackIn_24_0 != 0;
        }
    }

    final int a(int param0) {
        if (param0 != -1) {
            field_P = (String) null;
            return this.field_S.a(true);
        }
        return this.field_S.a(true);
    }

    final static boolean j(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        if (param0 >= 120) {
          if ((rm.field_Q ^ -1) <= -11) {
            if (ad.field_b) {
              return false;
            } else {
              L0: {
                if (ub.a(21549)) {
                  stackIn_16_0 = 0;
                  break L0;
                } else {
                  stackIn_16_0 = 1;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          nc.e((byte) -4);
          if ((rm.field_Q ^ -1) <= -11) {
            if (ad.field_b) {
              return false;
            } else {
              L1: {
                if (ub.a(21549)) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    final static void i(int param0) {
        RuntimeException decompiledCaughtException = null;
        r var1 = null;
        ln var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        var2 = Chess.field_G;
        try {
          L0: {
            var1 = (r) ((Object) bb.field_d.g(-18110));
            L1: while (true) {
              if (var1 == null) {
                var1_ref = (ln) ((Object) nk.field_t.g(-18110));
                L2: while (true) {
                  if (var1_ref == null) {
                    L3: {
                      if (param0 == 20579) {
                        break L3;
                      } else {
                        nc.j(-85);
                        break L3;
                      }
                    }
                    var1 = (r) ((Object) pd.field_Sb.g(-18110));
                    L4: while (true) {
                      if (var1 == null) {
                        break L0;
                      } else {
                        L5: {
                          if (-1 <= (var1.field_Sb ^ -1)) {
                            break L5;
                          } else {
                            var1.field_Sb = var1.field_Sb - 1;
                            if (0 == var1.field_Sb) {
                              var1.field_Mb = 0;
                              if (var1.l(1)) {
                                var1.c(-2193);
                                break L5;
                              } else {
                                break L5;
                              }
                            } else {
                              var1 = (r) ((Object) pd.field_Sb.a((byte) -125));
                              continue L4;
                            }
                          }
                        }
                        var1 = (r) ((Object) pd.field_Sb.a((byte) -125));
                        continue L4;
                      }
                    }
                  } else {
                    L6: {
                      if (var1_ref.field_Hb > 0) {
                        var1_ref.field_Hb = var1_ref.field_Hb - 1;
                        if (var1_ref.field_Hb != 0) {
                          break L6;
                        } else {
                          var1_ref.field_jc = 0;
                          if (!var1_ref.m(-23901)) {
                            break L6;
                          } else {
                            var1_ref.c(-2193);
                            break L6;
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                    var1_ref = (ln) ((Object) nk.field_t.a((byte) -114));
                    continue L2;
                  }
                }
              } else {
                L7: {
                  if (-1 > (var1.field_Sb ^ -1)) {
                    var1.field_Sb = var1.field_Sb - 1;
                    if (-1 != (var1.field_Sb ^ -1)) {
                      break L7;
                    } else {
                      var1.field_Mb = 0;
                      if (!var1.l(1)) {
                        break L7;
                      } else {
                        var1.c(-2193);
                        break L7;
                      }
                    }
                  } else {
                    break L7;
                  }
                }
                var1 = (r) ((Object) bb.field_d.a((byte) -94));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1_ref2), "nc.RA(" + param0 + ')');
        }
    }

    private nc() throws Throwable {
        throw new Error();
    }

    static {
        field_N = new pj();
        field_O = new jc();
        field_Q = "Connection timed out. Please try using a different server.";
        field_P = "Loading fonts";
    }
}
