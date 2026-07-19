/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class qe {
    static int field_a;
    static String[] field_g;
    static String field_e;
    String field_c;
    static boolean[] field_f;
    static int field_b;
    int field_d;

    final java.net.Socket a(int param0) throws IOException {
        if (param0 != 675834672) {
            field_e = (String) null;
        }
        return new java.net.Socket(this.field_c, this.field_d);
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, boolean param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        var19 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (0 > param2) {
                break L1;
              } else {
                if (li.field_d <= param1) {
                  break L1;
                } else {
                  L2: {
                    if (0 <= param6) {
                      break L2;
                    } else {
                      if (0 <= param0) {
                        break L2;
                      } else {
                        if ((param3 ^ -1) > -1) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (li.field_i > param6) {
                      break L3;
                    } else {
                      if (param0 < li.field_i) {
                        break L3;
                      } else {
                        if (param3 < li.field_i) {
                          break L3;
                        } else {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  if (!param5) {
                    L4: {
                      var14 = param2 - param1;
                      if (param7 != param1) {
                        L5: {
                          var10 = param6 << -1153547920;
                          var9_int = param6 << -1153547920;
                          var15 = param7 - param1;
                          var11 = (param0 + -param6 << -1187923408) / var15;
                          var12 = (param3 + -param6 << -485399856) / var14;
                          if (var12 > var11) {
                            var13 = 0;
                            break L5;
                          } else {
                            var16 = var11;
                            var11 = var12;
                            var12 = var16;
                            var13 = 1;
                            break L5;
                          }
                        }
                        L6: {
                          if (0 > param1) {
                            if ((param7 ^ -1) > -1) {
                              param1 = -param1 + param7;
                              var9_int = var9_int + var11 * param1;
                              var10 = var10 + param1 * var12;
                              param1 = param7;
                              break L6;
                            } else {
                              param1 = -param1;
                              var9_int = var9_int + param1 * var11;
                              var10 = var10 + param1 * var12;
                              param1 = 0;
                              var16 = li.field_a[param1];
                              L7: while (true) {
                                if (param7 <= param1) {
                                  break L6;
                                } else {
                                  L8: {
                                    var17 = var9_int >> -1231621712;
                                    if (li.field_i <= var17) {
                                      break L8;
                                    } else {
                                      var18 = (var10 >> -135199504) + -(var9_int >> -1791326448);
                                      if (var18 == 0) {
                                        if (0 > var17) {
                                          break L8;
                                        } else {
                                          if (li.field_i > var17) {
                                            ud.a(var18, var17 - -var16, param8, (byte) -85, param4);
                                            break L8;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      } else {
                                        L9: {
                                          if (li.field_i <= var17 + var18) {
                                            var18 = -1 + li.field_i + -var17;
                                            break L9;
                                          } else {
                                            break L9;
                                          }
                                        }
                                        if (-1 >= (var17 ^ -1)) {
                                          ud.a(var18, var17 - -var16, param8, (byte) -85, param4);
                                          break L8;
                                        } else {
                                          ud.a(var17 + var18, var16, param8, (byte) -85, param4);
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                  param1++;
                                  if (param1 >= li.field_d) {
                                    decompiledRegionSelector0 = 4;
                                    break L0;
                                  } else {
                                    var16 = var16 + tc.field_j;
                                    var10 = var10 + var12;
                                    var9_int = var9_int + var11;
                                    continue L7;
                                  }
                                }
                              }
                            }
                          } else {
                            var16 = li.field_a[param1];
                            L10: while (true) {
                              if (param7 <= param1) {
                                break L6;
                              } else {
                                L11: {
                                  var17 = var9_int >> -1231621712;
                                  if (li.field_i <= var17) {
                                    break L11;
                                  } else {
                                    var18 = (var10 >> -135199504) + -(var9_int >> -1791326448);
                                    if (var18 == 0) {
                                      if (0 > var17) {
                                        break L11;
                                      } else {
                                        if (li.field_i > var17) {
                                          ud.a(var18, var17 - -var16, param8, (byte) -85, param4);
                                          break L11;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    } else {
                                      L12: {
                                        if (li.field_i <= var17 + var18) {
                                          var18 = -1 + li.field_i + -var17;
                                          break L12;
                                        } else {
                                          break L12;
                                        }
                                      }
                                      if (-1 >= (var17 ^ -1)) {
                                        ud.a(var18, var17 - -var16, param8, (byte) -85, param4);
                                        break L11;
                                      } else {
                                        ud.a(var17 + var18, var16, param8, (byte) -85, param4);
                                        break L11;
                                      }
                                    }
                                  }
                                }
                                param1++;
                                if (param1 >= li.field_d) {
                                  return;
                                } else {
                                  var16 = var16 + tc.field_j;
                                  var10 = var10 + var12;
                                  var9_int = var9_int + var11;
                                  continue L10;
                                }
                              }
                            }
                          }
                        }
                        var16 = param2 + -param7;
                        if (-1 == (var16 ^ -1)) {
                          var12 = 0;
                          var11 = 0;
                          break L4;
                        } else {
                          L13: {
                            var17 = param3 << 1875113136;
                            if (var13 != 0) {
                              var10 = param0 << 1427790032;
                              break L13;
                            } else {
                              var9_int = param0 << 2062286608;
                              break L13;
                            }
                          }
                          var11 = (-var9_int + var17) / var16;
                          var12 = (var17 + -var10) / var16;
                          break L4;
                        }
                      } else {
                        L14: {
                          if (param1 == param2) {
                            var9_int = param6 << 1222250288;
                            var10 = param0 << 667141296;
                            var12 = 0;
                            var11 = 0;
                            break L14;
                          } else {
                            var15 = -param7 + param2;
                            if (param6 < param0) {
                              var12 = (param3 - param0 << 878968400) / var15;
                              var9_int = param6 << -1082763728;
                              var11 = (param3 + -param6 << 770219280) / var14;
                              var10 = param0 << -2138433296;
                              break L14;
                            } else {
                              var11 = (param3 - param0 << -577349424) / var15;
                              var10 = param6 << -171538960;
                              var9_int = param0 << 2007314640;
                              var12 = (param3 + -param6 << 593322160) / var14;
                              break L14;
                            }
                          }
                        }
                        var13 = 0;
                        if (-1 < (param1 ^ -1)) {
                          param1 = Math.min(-param1, -param1 + param7);
                          var10 = var10 + param1 * var12;
                          var9_int = var9_int + param1 * var11;
                          param1 = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L15: {
                      if (param1 < 0) {
                        param1 = -param1;
                        var10 = var10 + var12 * param1;
                        var9_int = var9_int + param1 * var11;
                        param1 = 0;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    var15 = li.field_a[param1];
                    L16: while (true) {
                      if (param2 <= param1) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        L17: {
                          var16 = var9_int >> 2123057648;
                          if (li.field_i > var16) {
                            var17 = -(var9_int >> 675834672) + (var10 >> 1980934832);
                            if (var17 != 0) {
                              L18: {
                                if (li.field_i <= var17 + var16) {
                                  var17 = -1 + (-var16 + li.field_i);
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              if (-1 < (var16 ^ -1)) {
                                ud.a(var17 + var16, var15, param8, (byte) -85, param4);
                                break L17;
                              } else {
                                ud.a(var17, var15 + var16, param8, (byte) -85, param4);
                                break L17;
                              }
                            } else {
                              if (-1 < (var16 ^ -1)) {
                                break L17;
                              } else {
                                if (var16 < li.field_i) {
                                  ud.a(var17, var15 + var16, param8, (byte) -85, param4);
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                            }
                          } else {
                            break L17;
                          }
                        }
                        param1++;
                        if (li.field_d > param1) {
                          var15 = var15 + tc.field_j;
                          var10 = var10 + var12;
                          var9_int = var9_int + var11;
                          continue L16;
                        } else {
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var9 = decompiledCaughtException;
            stackOut_97_0 = (RuntimeException) (var9);
            stackOut_97_1 = new StringBuilder().append("qe.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_99_0 = stackOut_97_0;
            stackIn_99_1 = stackOut_97_1;
            stackIn_98_0 = stackOut_97_0;
            stackIn_98_1 = stackOut_97_1;
            if (param4 == null) {
              stackOut_99_0 = (RuntimeException) ((Object) stackIn_99_0);
              stackOut_99_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackOut_99_2 = "null";
              stackIn_100_0 = stackOut_99_0;
              stackIn_100_1 = stackOut_99_1;
              stackIn_100_2 = stackOut_99_2;
              break L19;
            } else {
              stackOut_98_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackOut_98_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackOut_98_2 = "{...}";
              stackIn_100_0 = stackOut_98_0;
              stackIn_100_1 = stackOut_98_1;
              stackIn_100_2 = stackOut_98_2;
              break L19;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_100_0), stackIn_100_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        int var1 = -119 % ((-76 - param0) / 34);
        field_f = null;
        field_e = null;
        field_g = null;
    }

    final static byte[] a(byte[] param0, int param1, da param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_18_0 = null;
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
        byte[] stackOut_17_0 = null;
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
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            var4_int = param2.h(param1, 7);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    if (param0.length != var4_int) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param0 = new byte[var4_int];
                break L1;
              }
              L3: {
                if (param3 >= 96) {
                  break L3;
                } else {
                  qe.a((byte) -29);
                  break L3;
                }
              }
              L4: {
                var5 = param2.h(3, 7);
                var6 = (byte)param2.h(8, 7);
                if (var5 <= 0) {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param0[var7] = (byte)var6;
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
                      param0[var7] = (byte)(var6 + param2.h(var5, 7));
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackOut_17_0 = (byte[]) (param0);
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
            stackOut_19_1 = new StringBuilder().append("qe.F(");
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
          throw kk.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_18_0;
        }
    }

    final static void a(long param0, byte param1) {
        if (param0 <= 0L) {
            return;
        }
        if (param1 != 45) {
            field_e = (String) null;
        }
        if ((param0 % 10L ^ -1L) == -1L) {
            uj.a(-1L + param0, -79);
            uj.a(1L, -62);
        } else {
            uj.a(param0, param1 ^ -110);
        }
    }

    final static int a(int param0, int param1, int param2, byte[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            var4_int = -1;
            var5 = param0;
            L1: while (true) {
              if (var5 >= param1) {
                L2: {
                  if (param2 == 0) {
                    break L2;
                  } else {
                    field_f = (boolean[]) null;
                    break L2;
                  }
                }
                var4_int = var4_int ^ -1;
                stackOut_6_0 = var4_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var4_int = var4_int >>> 5593256 ^ mc.field_d[255 & (var4_int ^ param3[var5])];
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("qe.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    abstract java.net.Socket b(int param0) throws IOException;

    static {
        field_e = "(Player 2)";
        field_b = 100;
    }
}
