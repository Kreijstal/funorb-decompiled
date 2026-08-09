/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb extends ph {
    private df field_O;
    int field_G;
    static int field_N;
    static vi field_M;
    static int[] field_K;
    int field_H;
    static bd field_I;
    static bd field_L;
    private int field_J;
    static int field_P;

    final int a(byte param0) {
        if (param0 != 65) {
            return 117;
        }
        return this.field_O.b(-25);
    }

    final int j(int param0) {
        if (param0 != 11884) {
            field_I = (bd) null;
            return this.field_J;
        }
        return this.field_J;
    }

    final static String a(CharSequence param0, int param1, boolean param2) {
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_11_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_30_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param1 == -24224) {
              if (param0 != null) {
                L1: {
                  var3_int = param0.length();
                  if (1 > var3_int) {
                    break L1;
                  } else {
                    if ((var3_int ^ -1) >= -13) {
                      L2: {
                        var4 = mf.a(false, param0);
                        if (var4 == null) {
                          break L2;
                        } else {
                          if ((var4.length() ^ -1) <= -2) {
                            L3: {
                              if (rg.a((byte) -109, var4.charAt(0))) {
                                break L3;
                              } else {
                                if (rg.a((byte) -109, var4.charAt(-1 + var4.length()))) {
                                  break L3;
                                } else {
                                  var5 = 0;
                                  var6 = 0;
                                  L4: while (true) {
                                    if (param0.length() <= var6) {
                                      if (var5 > 0) {
                                        stackIn_35_0 = ui.field_g;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      } else {
                                        return null;
                                      }
                                    } else {
                                      L5: {
                                        var7 = param0.charAt(var6);
                                        if (!rg.a((byte) -109, (char) var7)) {
                                          var5 = 0;
                                          break L5;
                                        } else {
                                          var5++;
                                          break L5;
                                        }
                                      }
                                      L6: {
                                        if (-3 < (var5 ^ -1)) {
                                          break L6;
                                        } else {
                                          if (param2) {
                                            break L6;
                                          } else {
                                            stackIn_30_0 = mm.field_k;
                                            decompiledRegionSelector0 = 5;
                                            break L0;
                                          }
                                        }
                                      }
                                      var6++;
                                      continue L4;
                                    }
                                  }
                                }
                              }
                            }
                            stackIn_21_0 = ui.field_g;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackIn_16_0 = hm.field_n;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                stackIn_11_0 = hm.field_n;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_6_0 = hm.field_n;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var3);

            stackIn_39_1 = new StringBuilder().append("tb.B(");

            if (param0 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L7;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L7;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_30_0;
                  } else {
                    return stackIn_35_0;
                  }
                }
              }
            }
          }
        }
    }

    private tb() throws Throwable {
        throw new Error();
    }

    final static void f(byte param0) {
        if (null != wa.field_q) {
          v.a(8, wa.field_q);
          wa.field_q.a(true, gf.field_b);
          if (param0 >= -84) {
            L0: {
              tb.e((byte) -36);
              wa.field_q = null;
              if (ie.field_c != null) {
                ie.field_c.c(73);
                break L0;
              } else {
                break L0;
              }
            }
            se.field_h.requestFocus();
            return;
          } else {
            L1: {
              wa.field_q = null;
              if (ie.field_c != null) {
                ie.field_c.c(73);
                break L1;
              } else {
                break L1;
              }
            }
            se.field_h.requestFocus();
            return;
          }
        } else {
          return;
        }
    }

    public static void e(byte param0) {
        field_K = null;
        field_I = null;
        field_L = null;
        field_M = null;
        if (param0 <= 47) {
            field_L = (bd) null;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4, ag param5, int param6) {
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              L1: {
                var8_int = -this.field_G + (-param1 + param0);
                var9 = this.field_s + -(this.field_G * 2);
                if (var9 < var8_int) {
                  var8_int = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (0 <= var8_int) {
                  break L2;
                } else {
                  var8_int = 0;
                  break L2;
                }
              }
              L3: {
                var8_int = var8_int * this.field_J / var9;
                if ((param6 ^ -1) != -2) {
                  if ((param6 ^ -1) != -3) {
                    break L3;
                  } else {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (this.field_O.b(-25) <= var12) {
                        if ((var11 ^ -1) > -1) {
                          break L3;
                        } else {
                          this.field_O.a(var11, (byte) 35);
                          break L3;
                        }
                      } else {
                        L5: {
                          var13 = this.field_O.a(var12, -2262) - var8_int;
                          var13 = var13 * var13;
                          if (var10 > var13) {
                            var11 = var12;
                            var10 = var13;
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
                } else {
                  this.field_O.b(true, var8_int);
                  break L3;
                }
              }
              stackIn_22_0 = 1;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var8);

            stackIn_25_1 = new StringBuilder().append("tb.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param6 + ')');
        }
        return stackIn_22_0 != 0;
    }

    final int a(int param0, int param1) {
        if (0 <= param0) {
          if (this.field_O.b(param1 + 24559) > param0) {
            if (param1 != -24584) {
              field_L = (bd) null;
              return this.field_O.a(param0, param1 ^ 26834);
            } else {
              return this.field_O.a(param0, param1 ^ 26834);
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    static {
        field_N = 0;
        field_K = new int[8192];
    }
}
