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
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var14 = Chess.field_G;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
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
              stackOut_20_0 = 1;
              stackIn_21_0 = stackOut_20_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var8);
            stackOut_24_1 = new StringBuilder().append("nc.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param4 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_21_0 != 0;
        } else {
          return stackIn_23_0 != 0;
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
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 >= 120) {
          if ((rm.field_Q ^ -1) <= -11) {
            if (ad.field_b) {
              return false;
            } else {
              L0: {
                if (ub.a(21549)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
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
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
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
        boolean discarded$1 = false;
        RuntimeException var1 = null;
        r var1_ref = null;
        ln var1_ref2 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Chess.field_G;
        try {
          L0: {
            var1_ref = (r) ((Object) bb.field_d.g(-18110));
            L1: while (true) {
              if (var1_ref == null) {
                var1_ref2 = (ln) ((Object) nk.field_t.g(-18110));
                L2: while (true) {
                  if (var1_ref2 == null) {
                    L3: {
                      if (param0 == 20579) {
                        break L3;
                      } else {
                        discarded$1 = nc.j(-85);
                        break L3;
                      }
                    }
                    var1_ref = (r) ((Object) pd.field_Sb.g(-18110));
                    L4: while (true) {
                      if (var1_ref == null) {
                        break L0;
                      } else {
                        L5: {
                          if (-1 <= (var1_ref.field_Sb ^ -1)) {
                            break L5;
                          } else {
                            var1_ref.field_Sb = var1_ref.field_Sb - 1;
                            if (0 == var1_ref.field_Sb) {
                              var1_ref.field_Mb = 0;
                              if (var1_ref.l(1)) {
                                var1_ref.c(-2193);
                                break L5;
                              } else {
                                break L5;
                              }
                            } else {
                              var1_ref = (r) ((Object) pd.field_Sb.a((byte) -125));
                              continue L4;
                            }
                          }
                        }
                        var1_ref = (r) ((Object) pd.field_Sb.a((byte) -125));
                        continue L4;
                      }
                    }
                  } else {
                    L6: {
                      if (var1_ref2.field_Hb > 0) {
                        var1_ref2.field_Hb = var1_ref2.field_Hb - 1;
                        if (var1_ref2.field_Hb != 0) {
                          break L6;
                        } else {
                          var1_ref2.field_jc = 0;
                          if (!var1_ref2.m(-23901)) {
                            break L6;
                          } else {
                            var1_ref2.c(-2193);
                            break L6;
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                    var1_ref2 = (ln) ((Object) nk.field_t.a((byte) -114));
                    continue L2;
                  }
                }
              } else {
                L7: {
                  if (-1 > (var1_ref.field_Sb ^ -1)) {
                    var1_ref.field_Sb = var1_ref.field_Sb - 1;
                    if (-1 != (var1_ref.field_Sb ^ -1)) {
                      break L7;
                    } else {
                      var1_ref.field_Mb = 0;
                      if (!var1_ref.l(1)) {
                        break L7;
                      } else {
                        var1_ref.c(-2193);
                        break L7;
                      }
                    }
                  } else {
                    break L7;
                  }
                }
                var1_ref = (r) ((Object) bb.field_d.a((byte) -94));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "nc.RA(" + param0 + ')');
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
