/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.Class;

final class eh {
    static int field_c;
    static cr field_a;
    static int field_e;
    static String field_g;
    static String[] field_d;
    static int[] field_b;
    static int field_f;

    public static void a() {
        field_g = null;
        field_b = null;
        field_d = null;
        int var1 = 0;
        field_a = null;
    }

    final static int a(int param0) {
        param0 = (param0 & 1431655765) - -(-715827883 & param0 >>> 1);
        param0 = ((-858993460 & param0) >>> 2) + (858993459 & param0);
        param0 = (param0 >>> 4) + param0 & 252645135;
        param0 = param0 + (param0 >>> 8);
        param0 = param0 + (param0 >>> 16);
        return param0 & 255;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Vertigo2.field_L ? 1 : 0;
        var6 = -param5 + param1;
        var7 = -param3 + param0;
        if (param2 == -4) {
          if (0 != var6) {
            if (var7 == 0) {
              e.a(param2 ^ -29, param1, param4, param3, param5);
              return;
            } else {
              var12 = (var7 << 12) / var6;
              var13 = -(param5 * var12 >> 12) + param3;
              if (ap.field_e <= param1) {
                if (param1 <= ib.field_a) {
                  var11 = param0;
                  var9 = param1;
                  if (ap.field_e <= param5) {
                    if (ib.field_a >= param5) {
                      var8 = param5;
                      var10 = param3;
                      if (ua.field_e > var11) {
                        var11 = ua.field_e;
                        var9 = (ua.field_e - var13 << 12) / var12;
                        if (var10 >= ua.field_e) {
                          if (var10 > cj.field_D) {
                            var8 = (cj.field_D + -var13 << 12) / var12;
                            var10 = cj.field_D;
                            uj.a(var8, var9, var11, true, var10, param4);
                            return;
                          } else {
                            uj.a(var8, var9, var11, true, var10, param4);
                            return;
                          }
                        } else {
                          var10 = ua.field_e;
                          var8 = (ua.field_e + -var13 << 12) / var12;
                          uj.a(var8, var9, var11, true, var10, param4);
                          return;
                        }
                      } else {
                        if (var11 > cj.field_D) {
                          var9 = (cj.field_D + -var13 << 12) / var12;
                          var11 = cj.field_D;
                          if (var10 >= ua.field_e) {
                            if (var10 > cj.field_D) {
                              var8 = (cj.field_D + -var13 << 12) / var12;
                              var10 = cj.field_D;
                              uj.a(var8, var9, var11, true, var10, param4);
                              return;
                            } else {
                              uj.a(var8, var9, var11, true, var10, param4);
                              return;
                            }
                          } else {
                            var10 = ua.field_e;
                            var8 = (ua.field_e + -var13 << 12) / var12;
                            uj.a(var8, var9, var11, true, var10, param4);
                            return;
                          }
                        } else {
                          if (var10 >= ua.field_e) {
                            if (var10 > cj.field_D) {
                              var8 = (cj.field_D + -var13 << 12) / var12;
                              var10 = cj.field_D;
                              uj.a(var8, var9, var11, true, var10, param4);
                              return;
                            } else {
                              uj.a(var8, var9, var11, true, var10, param4);
                              return;
                            }
                          } else {
                            var10 = ua.field_e;
                            var8 = (ua.field_e + -var13 << 12) / var12;
                            uj.a(var8, var9, var11, true, var10, param4);
                            return;
                          }
                        }
                      }
                    } else {
                      var10 = (ib.field_a * var12 >> 12) + var13;
                      var8 = ib.field_a;
                      if (ua.field_e > var11) {
                        var11 = ua.field_e;
                        var9 = (ua.field_e - var13 << 12) / var12;
                        if (var10 >= ua.field_e) {
                          if (var10 > cj.field_D) {
                            var8 = (cj.field_D + -var13 << 12) / var12;
                            var10 = cj.field_D;
                            uj.a(var8, var9, var11, true, var10, param4);
                            return;
                          } else {
                            uj.a(var8, var9, var11, true, var10, param4);
                            return;
                          }
                        } else {
                          var10 = ua.field_e;
                          var8 = (ua.field_e + -var13 << 12) / var12;
                          uj.a(var8, var9, var11, true, var10, param4);
                          return;
                        }
                      } else {
                        if (var11 > cj.field_D) {
                          var9 = (cj.field_D + -var13 << 12) / var12;
                          var11 = cj.field_D;
                          if (var10 >= ua.field_e) {
                            if (var10 > cj.field_D) {
                              var8 = (cj.field_D + -var13 << 12) / var12;
                              var10 = cj.field_D;
                              uj.a(var8, var9, var11, true, var10, param4);
                              return;
                            } else {
                              uj.a(var8, var9, var11, true, var10, param4);
                              return;
                            }
                          } else {
                            var10 = ua.field_e;
                            var8 = (ua.field_e + -var13 << 12) / var12;
                            uj.a(var8, var9, var11, true, var10, param4);
                            return;
                          }
                        } else {
                          if (var10 >= ua.field_e) {
                            if (var10 > cj.field_D) {
                              var8 = (cj.field_D + -var13 << 12) / var12;
                              var10 = cj.field_D;
                              uj.a(var8, var9, var11, true, var10, param4);
                              return;
                            } else {
                              uj.a(var8, var9, var11, true, var10, param4);
                              return;
                            }
                          } else {
                            var10 = ua.field_e;
                            var8 = (ua.field_e + -var13 << 12) / var12;
                            uj.a(var8, var9, var11, true, var10, param4);
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    var10 = (var12 * ap.field_e >> 12) + var13;
                    var8 = ap.field_e;
                    if (ua.field_e > var11) {
                      var11 = ua.field_e;
                      var9 = (ua.field_e - var13 << 12) / var12;
                      if (var10 >= ua.field_e) {
                        if (var10 > cj.field_D) {
                          var8 = (cj.field_D + -var13 << 12) / var12;
                          var10 = cj.field_D;
                          uj.a(var8, var9, var11, true, var10, param4);
                          return;
                        } else {
                          uj.a(var8, var9, var11, true, var10, param4);
                          return;
                        }
                      } else {
                        var10 = ua.field_e;
                        var8 = (ua.field_e + -var13 << 12) / var12;
                        uj.a(var8, var9, var11, true, var10, param4);
                        return;
                      }
                    } else {
                      if (var11 > cj.field_D) {
                        var9 = (cj.field_D + -var13 << 12) / var12;
                        var11 = cj.field_D;
                        if (var10 >= ua.field_e) {
                          if (var10 > cj.field_D) {
                            var8 = (cj.field_D + -var13 << 12) / var12;
                            var10 = cj.field_D;
                            uj.a(var8, var9, var11, true, var10, param4);
                            return;
                          } else {
                            uj.a(var8, var9, var11, true, var10, param4);
                            return;
                          }
                        } else {
                          var10 = ua.field_e;
                          var8 = (ua.field_e + -var13 << 12) / var12;
                          uj.a(var8, var9, var11, true, var10, param4);
                          return;
                        }
                      } else {
                        if (var10 >= ua.field_e) {
                          if (var10 > cj.field_D) {
                            var8 = (cj.field_D + -var13 << 12) / var12;
                            var10 = cj.field_D;
                            uj.a(var8, var9, var11, true, var10, param4);
                            return;
                          } else {
                            uj.a(var8, var9, var11, true, var10, param4);
                            return;
                          }
                        } else {
                          var10 = ua.field_e;
                          var8 = (ua.field_e + -var13 << 12) / var12;
                          uj.a(var8, var9, var11, true, var10, param4);
                          return;
                        }
                      }
                    }
                  }
                } else {
                  L0: {
                    var9 = ib.field_a;
                    var11 = (ib.field_a * var12 >> 12) + var13;
                    if (ap.field_e <= param5) {
                      if (ib.field_a >= param5) {
                        var8 = param5;
                        var10 = param3;
                        break L0;
                      } else {
                        var10 = (ib.field_a * var12 >> 12) + var13;
                        var8 = ib.field_a;
                        break L0;
                      }
                    } else {
                      var10 = (var12 * ap.field_e >> 12) + var13;
                      var8 = ap.field_e;
                      break L0;
                    }
                  }
                  if (ua.field_e > var11) {
                    var11 = ua.field_e;
                    var9 = (ua.field_e - var13 << 12) / var12;
                    if (var10 >= ua.field_e) {
                      if (var10 > cj.field_D) {
                        var8 = (cj.field_D + -var13 << 12) / var12;
                        var10 = cj.field_D;
                        uj.a(var8, var9, var11, true, var10, param4);
                        return;
                      } else {
                        uj.a(var8, var9, var11, true, var10, param4);
                        return;
                      }
                    } else {
                      var10 = ua.field_e;
                      var8 = (ua.field_e + -var13 << 12) / var12;
                      uj.a(var8, var9, var11, true, var10, param4);
                      return;
                    }
                  } else {
                    if (var11 > cj.field_D) {
                      var9 = (cj.field_D + -var13 << 12) / var12;
                      var11 = cj.field_D;
                      if (var10 >= ua.field_e) {
                        if (var10 > cj.field_D) {
                          var8 = (cj.field_D + -var13 << 12) / var12;
                          var10 = cj.field_D;
                          uj.a(var8, var9, var11, true, var10, param4);
                          return;
                        } else {
                          uj.a(var8, var9, var11, true, var10, param4);
                          return;
                        }
                      } else {
                        var10 = ua.field_e;
                        var8 = (ua.field_e + -var13 << 12) / var12;
                        uj.a(var8, var9, var11, true, var10, param4);
                        return;
                      }
                    } else {
                      if (var10 >= ua.field_e) {
                        if (var10 > cj.field_D) {
                          var8 = (cj.field_D + -var13 << 12) / var12;
                          var10 = cj.field_D;
                          uj.a(var8, var9, var11, true, var10, param4);
                          return;
                        } else {
                          uj.a(var8, var9, var11, true, var10, param4);
                          return;
                        }
                      } else {
                        var10 = ua.field_e;
                        var8 = (ua.field_e + -var13 << 12) / var12;
                        uj.a(var8, var9, var11, true, var10, param4);
                        return;
                      }
                    }
                  }
                }
              } else {
                L1: {
                  var9 = ap.field_e;
                  var11 = var13 - -(var12 * ap.field_e >> 12);
                  if (ap.field_e <= param5) {
                    if (ib.field_a >= param5) {
                      var8 = param5;
                      var10 = param3;
                      break L1;
                    } else {
                      var10 = (ib.field_a * var12 >> 12) + var13;
                      var8 = ib.field_a;
                      break L1;
                    }
                  } else {
                    var10 = (var12 * ap.field_e >> 12) + var13;
                    var8 = ap.field_e;
                    break L1;
                  }
                }
                L2: {
                  if (ua.field_e > var11) {
                    var11 = ua.field_e;
                    var9 = (ua.field_e - var13 << 12) / var12;
                    break L2;
                  } else {
                    if (var11 > cj.field_D) {
                      var9 = (cj.field_D + -var13 << 12) / var12;
                      var11 = cj.field_D;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var10 >= ua.field_e) {
                  if (var10 > cj.field_D) {
                    var8 = (cj.field_D + -var13 << 12) / var12;
                    var10 = cj.field_D;
                    uj.a(var8, var9, var11, true, var10, param4);
                    return;
                  } else {
                    uj.a(var8, var9, var11, true, var10, param4);
                    return;
                  }
                } else {
                  var10 = ua.field_e;
                  var8 = (ua.field_e + -var13 << 12) / var12;
                  uj.a(var8, var9, var11, true, var10, param4);
                  return;
                }
              }
            }
          } else {
            L3: {
              if (var7 != 0) {
                cr.b(param3, param0, param2 ^ 3, param5, param4);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_2_0 = null;
        Class stackOut_6_0 = null;
        Class stackOut_16_0 = null;
        Class stackOut_26_0 = null;
        Class stackOut_22_0 = null;
        Class stackOut_19_0 = null;
        Class stackOut_12_0 = null;
        Class stackOut_9_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            if (param1.equals((Object) (Object) "B")) {
              stackOut_2_0 = Byte.TYPE;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param1.equals((Object) (Object) "I")) {
                stackOut_6_0 = Integer.TYPE;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (!param1.equals((Object) (Object) "S")) {
                  if (!param1.equals((Object) (Object) "J")) {
                    if (param1.equals((Object) (Object) "Z")) {
                      stackOut_16_0 = Boolean.TYPE;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    } else {
                      if (!param1.equals((Object) (Object) "F")) {
                        if (!param1.equals((Object) (Object) "D")) {
                          if (param1.equals((Object) (Object) "C")) {
                            stackOut_26_0 = Character.TYPE;
                            stackIn_27_0 = stackOut_26_0;
                            break L0;
                          } else {
                            return Class.forName(param1);
                          }
                        } else {
                          stackOut_22_0 = Double.TYPE;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        }
                      } else {
                        stackOut_19_0 = Float.TYPE;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      }
                    }
                  } else {
                    stackOut_12_0 = Long.TYPE;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                } else {
                  stackOut_9_0 = Short.TYPE;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var2;
            stackOut_28_1 = new StringBuilder().append("eh.E(").append(-1147375319).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L1;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
        return stackIn_27_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param1 != param7) {
          if (param0 + -param7 >= ap.field_e) {
            if (ib.field_a >= param7 + param0) {
              if (param2 - param1 >= ua.field_e) {
                if (cj.field_D >= param2 + param1) {
                  ip.a(param3, param0, param5, (byte) -45, param6, param7, param2, param1);
                  return;
                } else {
                  sg.a(param1, param5, param7, (byte) 47, param0, param3, param2, param6);
                  return;
                }
              } else {
                sg.a(param1, param5, param7, (byte) 47, param0, param3, param2, param6);
                return;
              }
            } else {
              sg.a(param1, param5, param7, (byte) 47, param0, param3, param2, param6);
              return;
            }
          } else {
            sg.a(param1, param5, param7, (byte) 47, param0, param3, param2, param6);
            return;
          }
        } else {
          nf.a(param5, param6, (byte) 121, param0, param3, param7, param2);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 200;
        field_g = "Invite players";
        field_d = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
