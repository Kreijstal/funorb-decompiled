/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh implements ad {
    static String field_d;
    static int field_e;
    static int field_a;
    static int field_c;
    static String field_b;

    final static Object a(byte param0, boolean param1, byte[] param2) {
        t var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_4_0 = null;
        t stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 112) {
                break L1;
              } else {
                field_e = 94;
                break L1;
              }
            }
            if (param2 != null) {
              if (136 < param2.length) {
                var3 = new t();
                ((ni) ((Object) var3)).a((byte) -119, param2);
                stackIn_8_0 = (t) (var3);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1) {
                  stackIn_13_0 = kh.a(param2, (byte) -16);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_11_0 = (byte[]) (param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("qh.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    public final void a(int param0, int param1, fe param2, int param3, boolean param4) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ea var8 = null;
        try {
          L0: {
            var6_int = param1 - -param2.field_u;
            var7 = param2.field_t + param3;
            if (param0 == 12088) {
              L1: {
                ng.a(param2.field_q, param2.field_v, 127, var6_int, var7);
                var8 = ed.field_g[1];
                if (!(param2 instanceof hc)) {
                  break L1;
                } else {
                  if (((hc) ((Object) param2)).field_H) {
                    var8.g((-var8.field_x + param2.field_v >> 827505249) + 1 + var6_int, var7 - (-1 - (-var8.field_A + param2.field_q >> 213302753)), 256);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (param2.k(73)) {
                  se.c(2 + var6_int, 2, 2 + var7, param2.field_v - 4, param2.field_q + -4);
                  break L2;
                } else {
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6);

            stackIn_12_1 = new StringBuilder().append("qh.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(boolean param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_12_0 = null;
        String stackIn_17_0 = null;
        String stackIn_22_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (param1 == null) {
              stackIn_4_0 = rd.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = param1.length();
              if (!param2) {
                L1: {
                  if ((var3_int ^ -1) > -2) {
                    break L1;
                  } else {
                    if (var3_int > 12) {
                      break L1;
                    } else {
                      L2: {
                        var4 = cl.a(-95, param1);
                        if (var4 == null) {
                          break L2;
                        } else {
                          if (var4.length() < 1) {
                            break L2;
                          } else {
                            L3: {
                              if (ra.a(118, var4.charAt(0))) {
                                break L3;
                              } else {
                                if (ra.a(117, var4.charAt(-1 + var4.length()))) {
                                  break L3;
                                } else {
                                  var5 = 0;
                                  var6 = 0;
                                  L4: while (true) {
                                    if (var6 >= param1.length()) {
                                      if (0 < var5) {
                                        stackIn_36_0 = vh.field_d;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      } else {
                                        return null;
                                      }
                                    } else {
                                      L5: {
                                        var7 = param1.charAt(var6);
                                        if (!ra.a(116, (char) var7)) {
                                          var5 = 0;
                                          break L5;
                                        } else {
                                          var5++;
                                          break L5;
                                        }
                                      }
                                      L6: {
                                        if (var5 < 2) {
                                          break L6;
                                        } else {
                                          if (param0) {
                                            break L6;
                                          } else {
                                            stackIn_31_0 = ra.field_a;
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
                            stackIn_22_0 = vh.field_d;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          }
                        }
                      }
                      stackIn_17_0 = rd.field_c;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                }
                stackIn_12_0 = rd.field_c;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_7_0 = (String) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var3);

            stackIn_40_1 = new StringBuilder().append("qh.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L7;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L7;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_31_0;
                  } else {
                    return stackIn_36_0;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param2 != 1) {
            return;
        }
        vd.field_y = param0;
        h.field_b = param1;
    }

    public static void a(byte param0) {
        field_d = null;
        int var1 = 127 % ((param0 - 44) / 48);
        field_b = null;
    }

    static {
        field_d = "The 3x multiplier gives you triple points! Skilled miners use this to get the best rankings. If you buy 2x AND 3x, they combine to a massive 6x multiplier!";
        field_a = -1;
        field_e = 0;
        field_c = 2;
        field_b = "Ranking: Mhor's Mickaxe mof Massive Mining Multraness";
    }
}
