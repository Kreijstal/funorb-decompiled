/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s implements qk {
    static int field_a;
    static String field_b;

    final static void b(int param0) {
        int var1 = 0;
        if (32 < ll.field_q) {
            var1 = ll.field_q % 32;
            if (var1 == 0) {
                var1 = 32;
            }
            ef.a(1, -var1 + ll.field_q);
        } else {
            ef.a(1, 0);
        }
        if (param0 < 124) {
            field_b = (String) null;
        }
    }

    final static void a(gi param0, int param1, int param2, int param3, int param4) {
        try {
            param0.a((byte) 112, param1);
            param0.d(17, 77);
            param0.d(param3, 107);
            param0.d(param2, param1 + 108);
            param0.a((byte) 109, param4);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "s.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, boolean param1, boolean param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                var6_int = 0;
                L2: while (true) {
                  if (11 <= var6_int) {
                    break L1;
                  } else {
                    L3: {
                      var7 = 10;
                      if ((var6_int ^ -1) > -6) {
                        var7 = var6_int * 2 + 2;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (5 >= var6_int) {
                        break L4;
                      } else {
                        var7 = (-var6_int + 10) * 2 + 2;
                        break L4;
                      }
                    }
                    L5: {
                      if (!param2) {
                        pb.g(param4 - 5, var6_int + param3 - 5, var7, param0);
                        break L5;
                      } else {
                        pb.g(6 + (param4 + -var7), param3 + -5 - -var6_int, var7, param0);
                        break L5;
                      }
                    }
                    var6_int++;
                    continue L2;
                  }
                }
              }
            }
            L6: {
              if (-1 == param5) {
                break L6;
              } else {
                if (!param2) {
                  pb.d(-5 + param4, param3 + -5, 11, param5);
                  pb.d(param4 + -4, param3 - 5, 5 + param4, param3, param5);
                  pb.d(-4 + param4, 5 + param3, param4 + 5, param3, param5);
                  break L6;
                } else {
                  pb.d(param4 - -5, param3 + -5, 11, param5);
                  pb.d(param4 - -4, param3 - 5, -5 + param4, param3, param5);
                  pb.d(4 + param4, 5 + param3, param4 + -5, param3, param5);
                  break L6;
                }
              }
            }
            if ((param4 ^ -1) != 0) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L7: {
                var6_int = param4 + -10;
                var7 = param4 + 10;
                if (param0 != -1) {
                  pb.a(var6_int, -2 + param3, 20, 5, param0);
                  var8 = 0;
                  L8: while (true) {
                    if (5 <= var8) {
                      break L7;
                    } else {
                      L9: {
                        if (!param2) {
                          pb.d(-var8 + 3 + var7, param3, -7 + (-var8 + 3) + var7, param3 - 7, param0);
                          pb.d(var7 - -3 - var8, param3, -7 + -var8 + (var7 - -3), 7 + param3, param0);
                          break L9;
                        } else {
                          pb.d(-3 + var6_int - -var8, param3, 7 + var6_int + (-3 + var8), param3 + -7, param0);
                          pb.d(var8 + var6_int - 3, param3, 7 + (-3 + var6_int) - -var8, 7 + param3, param0);
                          break L9;
                        }
                      }
                      var8++;
                      continue L8;
                    }
                  }
                } else {
                  break L7;
                }
              }
              L10: {
                if (param5 == -1) {
                  break L10;
                } else {
                  if (param2) {
                    pb.d(var6_int - 3, param3, 4 + var6_int, -7 + param3, param5);
                    pb.g(var6_int - -4, param3 + -7, 4, param5);
                    pb.d(8 + var6_int, param3 + -7, var6_int + 4, param3 - 3, param5);
                    pb.g(4 + var6_int, param3 - 3, 16, param5);
                    pb.d(var6_int + -3, param3, 4 + var6_int, 7 + param3, param5);
                    pb.g(4 + var6_int, 7 + param3, 4, param5);
                    pb.d(var6_int - -8, 7 + param3, var6_int - -4, param3 - -3, param5);
                    pb.g(var6_int - -4, param3 - -3, 16, param5);
                    pb.d(var7 - 1, param3 + -3, 6, param5);
                    break L10;
                  } else {
                    pb.d(3 + var7, param3, -4 + var7, -7 + param3, param5);
                    pb.g(-4 + var7 - 4, param3 - 7, 4, param5);
                    pb.d(var7 - 8, -7 + param3, var7 - 4, -3 + param3, param5);
                    pb.g(-16 + (-4 + var7), param3 + -3, 16, param5);
                    pb.d(3 + var7, param3, var7 - 4, 7 + param3, param5);
                    pb.g(-8 + var7, 7 + param3, 4, param5);
                    pb.d(-8 + var7, param3 + 7, -4 + var7, 3 + param3, param5);
                    pb.g(-4 + var7 + -16, param3 + 3, 16, param5);
                    pb.d(var6_int, param3 + -3, 6, param5);
                    break L10;
                  }
                }
              }
              L11: {
                if (param1) {
                  break L11;
                } else {
                  s.b(-92);
                  break L11;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var6), "s.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = SteelSentinels.field_G;
          if (!param1) {
            break L0;
          } else {
            field_a = 125;
            break L0;
          }
        }
        var2 = param0;
        if (-1 != (var2 ^ -1)) {
          if (1 == var2) {
            return 2;
          } else {
            if (var2 == 2) {
              return 3;
            } else {
              if (var2 != 3) {
                if (var2 == 4) {
                  return 5;
                } else {
                  if ((var2 ^ -1) != -21) {
                    if (var2 == 5) {
                      return 1;
                    } else {
                      if ((var2 ^ -1) == -7) {
                        return 2;
                      } else {
                        if (var2 != 7) {
                          if ((var2 ^ -1) != -9) {
                            if (-10 != (var2 ^ -1)) {
                              if (var2 != 10) {
                                if ((var2 ^ -1) == -12) {
                                  return 2;
                                } else {
                                  if (12 == var2) {
                                    return 5;
                                  } else {
                                    if ((var2 ^ -1) != -14) {
                                      if (14 == var2) {
                                        return 20;
                                      } else {
                                        return 0;
                                      }
                                    } else {
                                      return 10;
                                    }
                                  }
                                }
                              } else {
                                return 1;
                              }
                            } else {
                              return 5;
                            }
                          } else {
                            return 4;
                          }
                        } else {
                          return 3;
                        }
                      }
                    }
                  } else {
                    return 10;
                  }
                }
              } else {
                return 4;
              }
            }
          }
        } else {
          return 1;
        }
    }

    final static void a(int param0) {
        if (ag.field_p != null) {
            ag.field_p.g((byte) 103);
        }
        if (!(r.field_r == null)) {
            r.field_r.m(-13521);
        }
        ca.d(-30603);
        if (param0 != 10) {
            field_b = (String) null;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = -115 % ((param0 - 47) / 58);
    }

    public final void a(int param0, lh param1, byte param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        wk var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == -30) {
                break L1;
              } else {
                s.a((byte) -83);
                break L1;
              }
            }
            L2: {
              var6_int = param0 + param1.field_o;
              var7 = param1.field_z + param4;
              ra.a(var7, param1.field_x, param1.field_E, var6_int, (byte) 120);
              var8 = t.field_i[1];
              if (!(param1 instanceof oa)) {
                break L2;
              } else {
                if (((oa) ((Object) param1)).field_T) {
                  var8.a(1 + (var6_int + (param1.field_x - var8.field_z >> 375283361)), (-var8.field_B + param1.field_E >> -1234744735) + (1 + var7), 256);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param1.d(0)) {
                ha.a(var6_int - -2, -4 + param1.field_x, -4 + param1.field_E, param2 + 30, 2 + var7);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var6);
            stackOut_10_1 = new StringBuilder().append("s.A(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static short[] a(short[] param0, int param1, kj param2, boolean param3) {
        short[] discarded$2 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kj var9 = null;
        Object stackIn_3_0 = null;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_17_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            var4_int = param2.g(-118, param1);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    if (param0.length == var4_int) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param0 = new short[var4_int];
                break L1;
              }
              L3: {
                var5 = param2.g(20, 4);
                var6 = (short)param2.g(-91, 16);
                if (!param3) {
                  break L3;
                } else {
                  var9 = (kj) null;
                  discarded$2 = s.a((short[]) null, 108, (kj) null, false);
                  break L3;
                }
              }
              L4: {
                if (var5 > 0) {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param0[var7] = (short)(var6 + param2.g(36, var5));
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param0[var7] = (short)var6;
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackOut_17_0 = (short[]) (param0);
              stackIn_18_0 = stackOut_17_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var4);
            stackOut_19_1 = new StringBuilder().append("s.G(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (short[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_18_0;
        }
    }

    static {
        field_a = 0;
        field_b = "<%0> has lost connection.";
    }
}
