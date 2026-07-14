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
            if (param0 >= ((nc) this).field_S.a(true)) {
              return -1;
            } else {
              return ((nc) this).field_S.c(param0, 1);
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
            ((nc) this).field_S = null;
            return ((nc) this).field_R;
        }
        return ((nc) this).field_R;
    }

    final boolean a(int param0, int param1, int param2, byte param3, mf param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Chess.field_G;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          L0: {
            var8 = -param6 + (param1 + -((nc) this).field_U);
            var9 = ((nc) this).field_y + -(2 * ((nc) this).field_U);
            if (var8 <= var9) {
              break L0;
            } else {
              var8 = var9;
              break L0;
            }
          }
          L1: {
            if ((var8 ^ -1) > -1) {
              var8 = 0;
              break L1;
            } else {
              break L1;
            }
          }
          var8 = var8 * ((nc) this).field_R / var9;
          if (param0 != 1) {
            if (2 == param0) {
              var10 = 2147483647;
              var11 = -1;
              var12 = 0;
              L2: while (true) {
                if (((nc) this).field_S.a(true) <= var12) {
                  if (-1 >= (var11 ^ -1)) {
                    ((nc) this).field_S.a(-1, var11);
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  var13 = -var8 + ((nc) this).field_S.c(var12, 1);
                  var13 = var13 * var13;
                  if (var13 < var10) {
                    var10 = var13;
                    var11 = var12;
                    var12++;
                    var12++;
                    continue L2;
                  } else {
                    var12++;
                    var12++;
                    continue L2;
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            ((nc) this).field_S.a(var8, (byte) 43);
            return true;
          }
        } else {
          return false;
        }
    }

    final int a(int param0) {
        if (param0 != -1) {
            field_P = null;
            return ((nc) this).field_S.a(true);
        }
        return ((nc) this).field_S.a(true);
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
        r var1 = null;
        ln var1_ref = null;
        int var2 = 0;
        var2 = Chess.field_G;
        var1 = (r) (Object) bb.field_d.g(-18110);
        L0: while (true) {
          if (var1 == null) {
            var1_ref = (ln) (Object) nk.field_t.g(-18110);
            L1: while (true) {
              if (var1_ref == null) {
                if (param0 == 20579) {
                  var1 = (r) (Object) pd.field_Sb.g(-18110);
                  L2: while (true) {
                    if (var1 == null) {
                      return;
                    } else {
                      L3: {
                        if (-1 <= (var1.field_Sb ^ -1)) {
                          break L3;
                        } else {
                          var1.field_Sb = var1.field_Sb - 1;
                          if (0 == var1.field_Sb) {
                            var1.field_Mb = 0;
                            if (var1.l(1)) {
                              var1.c(-2193);
                              break L3;
                            } else {
                              break L3;
                            }
                          } else {
                            var1 = (r) (Object) pd.field_Sb.a((byte) -125);
                            continue L2;
                          }
                        }
                      }
                      var1 = (r) (Object) pd.field_Sb.a((byte) -125);
                      continue L2;
                    }
                  }
                } else {
                  boolean discarded$1 = nc.j(-85);
                  var1 = (r) (Object) pd.field_Sb.g(-18110);
                  L4: while (true) {
                    if (var1 == null) {
                      return;
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
                            var1 = (r) (Object) pd.field_Sb.a((byte) -125);
                            continue L4;
                          }
                        }
                      }
                      var1 = (r) (Object) pd.field_Sb.a((byte) -125);
                      continue L4;
                    }
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
                var1_ref = (ln) (Object) nk.field_t.a((byte) -114);
                continue L1;
              }
            }
          } else {
            L7: {
              if (-1 > var1.field_Sb) {
                var1.field_Sb = var1.field_Sb - 1;
                if (-1 != var1.field_Sb) {
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
            var1 = (r) (Object) bb.field_d.a((byte) -94);
            continue L0;
          }
        }
    }

    private nc() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new pj();
        field_O = new jc();
        field_Q = "Connection timed out. Please try using a different server.";
        field_P = "Loading fonts";
    }
}
