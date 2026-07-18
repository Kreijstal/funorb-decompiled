/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ar {
    static boolean field_d;
    toa[] field_c;
    static int field_b;
    static String field_a;

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        toa var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = VoidHunters.field_G;
          if (((ar) this).field_c == null) {
            break L0;
          } else {
            if (0 == ((ar) this).field_c.length) {
              break L0;
            } else {
              if (((ar) this).field_c[0].field_b > param0) {
                break L0;
              } else {
                if (((ar) this).field_c[-1 + ((ar) this).field_c.length].field_a < param0) {
                  return -1;
                } else {
                  if (param1 == -23381) {
                    if (1 == ((ar) this).field_c.length) {
                      return ((ar) this).field_c[0].a(-74, param2);
                    } else {
                      var4 = 0;
                      var5 = 0;
                      L1: while (true) {
                        if (var5 >= ((ar) this).field_c.length) {
                          return -1;
                        } else {
                          L2: {
                            var6 = ((ar) this).field_c[var5];
                            if (var6.field_b > param0) {
                              break L2;
                            } else {
                              if (param0 <= var6.field_a) {
                                var7 = var6.a(-88, param2);
                                if (-1 != var7) {
                                  return var4 + var7;
                                } else {
                                  return -1;
                                }
                              } else {
                                break L2;
                              }
                            }
                          }
                          var4 = var4 + (-1 + var6.field_c.length);
                          var5++;
                          continue L1;
                        }
                      }
                    }
                  } else {
                    return 25;
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    final int a(int param0) {
        Object var3 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 29565) {
            break L0;
          } else {
            var3 = null;
            int discarded$2 = ((ar) this).a(true, -112, -23, (String) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((ar) this).field_c == null) {
              break L2;
            } else {
              if (((ar) this).field_c.length <= 0) {
                break L2;
              } else {
                stackOut_4_0 = -((ar) this).field_c[0].field_b + ((ar) this).field_c[((ar) this).field_c.length + -1].field_a;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    final int a(boolean param0, int param1, int param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            var5_int = 0;
            var6 = param0 ? 1 : 0;
            var7 = param3.length();
            var8 = 0;
            L1: while (true) {
              if (var8 >= var7) {
                if (var5_int <= 0) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_12_0 = (-param2 + param1 << 8) / var5_int;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                }
              } else {
                L2: {
                  var9 = param3.charAt(var8);
                  if (60 != var9) {
                    if (var9 != 62) {
                      if (var6 != 0) {
                        break L2;
                      } else {
                        if (var9 != 32) {
                          break L2;
                        } else {
                          var5_int++;
                          break L2;
                        }
                      }
                    } else {
                      var6 = 0;
                      break L2;
                    }
                  } else {
                    var6 = 1;
                    break L2;
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("ar.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_15_0;
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        toa var4 = null;
        int var5 = VoidHunters.field_G;
        if (!param0) {
            return -43;
        }
        for (var3 = 0; ((ar) this).field_c.length > var3; var3++) {
            var4 = ((ar) this).field_c[var3];
            if (!(param1 >= var4.field_c.length)) {
                return var3;
            }
            param1 = param1 - (-1 + var4.field_c.length);
        }
        return ((ar) this).field_c.length;
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_47_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        L0: {
          if (param1 >= 102) {
            break L0;
          } else {
            field_b = 115;
            break L0;
          }
        }
        L1: {
          var4 = param0 >> 31;
          param0 = var4 ^ var4 + param0;
          var4 = param2 >> 31;
          param2 = var4 ^ param2 + var4;
          var3 = 0;
          if (~param2 < ~param0) {
            var4 = param0;
            param0 = param2;
            param2 = var4;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param0 < 32768) {
            break L2;
          } else {
            L3: {
              if (param0 < 1073741824) {
                break L3;
              } else {
                param0 = param0 >> 16;
                var3 += 16;
                break L3;
              }
            }
            L4: {
              if (param0 < 4194304) {
                break L4;
              } else {
                var3 += 8;
                param0 = param0 >> 8;
                break L4;
              }
            }
            L5: {
              if (262144 > param0) {
                break L5;
              } else {
                var3 += 4;
                param0 = param0 >> 4;
                break L5;
              }
            }
            L6: {
              if (param0 >= 65536) {
                param0 = param0 >> 2;
                var3 += 2;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param0 < 32768) {
                break L7;
              } else {
                var3++;
                param0 = param0 >> 1;
                break L7;
              }
            }
            param2 = param2 >> var3;
            break L2;
          }
        }
        if (param0 > param2 << 5) {
          return param0 << var3;
        } else {
          param0 = param2 * param2 + param0 * param0;
          if (param0 >= 65536) {
            if (16777216 <= param0) {
              if (param0 < 268435456) {
                if (param0 < 67108864) {
                  L8: {
                    if (var3 >= 3) {
                      stackOut_55_0 = eo.field_o[param0 >> 18] << -3 + var3;
                      stackIn_56_0 = stackOut_55_0;
                      break L8;
                    } else {
                      stackOut_54_0 = eo.field_o[param0 >> 18] >> -var3 + 3;
                      stackIn_56_0 = stackOut_54_0;
                      break L8;
                    }
                  }
                  return stackIn_56_0;
                } else {
                  L9: {
                    if (var3 < 2) {
                      stackOut_51_0 = eo.field_o[param0 >> 20] >> 2 + -var3;
                      stackIn_52_0 = stackOut_51_0;
                      break L9;
                    } else {
                      stackOut_50_0 = eo.field_o[param0 >> 20] << var3 - 2;
                      stackIn_52_0 = stackOut_50_0;
                      break L9;
                    }
                  }
                  return stackIn_52_0;
                }
              } else {
                if (1073741824 > param0) {
                  L10: {
                    if (var3 >= 1) {
                      stackOut_46_0 = eo.field_o[param0 >> 22] << -1 + var3;
                      stackIn_47_0 = stackOut_46_0;
                      break L10;
                    } else {
                      stackOut_45_0 = eo.field_o[param0 >> 22] >> 1 - var3;
                      stackIn_47_0 = stackOut_45_0;
                      break L10;
                    }
                  }
                  return stackIn_47_0;
                } else {
                  return eo.field_o[param0 >> 24] << var3;
                }
              }
            } else {
              if (param0 < 1048576) {
                if (262144 <= param0) {
                  return eo.field_o[param0 >> 12] >> 6;
                } else {
                  return eo.field_o[param0 >> 10] >> 7;
                }
              } else {
                if (param0 < 4194304) {
                  return eo.field_o[param0 >> 14] >> 5;
                } else {
                  return eo.field_o[param0 >> 16] >> 4;
                }
              }
            }
          } else {
            if (param0 >= 256) {
              if (4096 <= param0) {
                if (param0 < 16384) {
                  return eo.field_o[param0 >> 6] >> 9;
                } else {
                  return eo.field_o[param0 >> 8] >> 8;
                }
              } else {
                if (param0 >= 1024) {
                  return eo.field_o[param0 >> 4] >> 10;
                } else {
                  return eo.field_o[param0 >> 2] >> 11;
                }
              }
            } else {
              if (param0 < 0) {
                return -1;
              } else {
                return eo.field_o[param0] >> 12;
              }
            }
          }
        }
    }

    final int c(int param0) {
        int var2 = 0;
        toa[] var3 = null;
        int var4 = 0;
        toa var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = VoidHunters.field_G;
          if (param0 == -18877) {
            break L0;
          } else {
            int discarded$2 = ar.a(-4, (byte) -85, -6);
            break L0;
          }
        }
        L1: {
          var2 = -1;
          if (null == ((ar) this).field_c) {
            break L1;
          } else {
            var3 = ((ar) this).field_c;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3.length) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a(0);
                  if (var6 > var2) {
                    var2 = var6;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
        return var2;
    }

    public static void b(int param0) {
        field_a = null;
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        toa var5 = null;
        int var6 = VoidHunters.field_G;
        toa[] var7 = ((ar) this).field_c;
        toa[] var3 = var7;
        if (param1 > -107) {
            int discarded$0 = ((ar) this).c(-56);
        }
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5.field_c.length > param0) {
                return var5.field_c[param0];
            }
            param0 = param0 - (-1 + var5.field_c.length);
        }
        return 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<%0> has withdrawn the request to join.";
        field_b = 0;
    }
}
