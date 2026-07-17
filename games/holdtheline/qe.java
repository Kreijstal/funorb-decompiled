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
            field_e = null;
        }
        return new java.net.Socket(((qe) this).field_c, ((qe) this).field_d);
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
                        if (param3 < 0) {
                          return;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (~li.field_i < ~param6) {
                      break L3;
                    } else {
                      if (param0 < li.field_i) {
                        break L3;
                      } else {
                        if (~param3 > ~li.field_i) {
                          break L3;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (!param5) {
                    L4: {
                      var14 = param2 - param1;
                      if (param7 != param1) {
                        L5: {
                          var10 = param6 << 16;
                          var9_int = param6 << 16;
                          var15 = param7 - param1;
                          var11 = (param0 + -param6 << 16) / var15;
                          var12 = (param3 + -param6 << 16) / var14;
                          if (~var12 < ~var11) {
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
                            if (param7 < 0) {
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
                                    var17 = var9_int >> 16;
                                    if (li.field_i <= var17) {
                                      break L8;
                                    } else {
                                      var18 = (var10 >> 16) + -(var9_int >> 16);
                                      if (var18 == 0) {
                                        if (0 > var17) {
                                          break L8;
                                        } else {
                                          if (~li.field_i < ~var17) {
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
                                        if (var17 >= 0) {
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
                                  if (~param1 <= ~li.field_d) {
                                    return;
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
                                  var17 = var9_int >> 16;
                                  if (li.field_i <= var17) {
                                    break L11;
                                  } else {
                                    var18 = (var10 >> 16) + -(var9_int >> 16);
                                    if (var18 == 0) {
                                      if (0 > var17) {
                                        break L11;
                                      } else {
                                        if (~li.field_i < ~var17) {
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
                                      if (var17 >= 0) {
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
                                if (~param1 <= ~li.field_d) {
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
                        if (var16 == 0) {
                          var12 = 0;
                          var11 = 0;
                          break L4;
                        } else {
                          L13: {
                            var17 = param3 << 16;
                            if (var13 != 0) {
                              var10 = param0 << 16;
                              break L13;
                            } else {
                              var9_int = param0 << 16;
                              break L13;
                            }
                          }
                          var11 = (-var9_int + var17) / var16;
                          var12 = (var17 + -var10) / var16;
                          break L4;
                        }
                      } else {
                        L14: {
                          if (~param1 == ~param2) {
                            var9_int = param6 << 16;
                            var10 = param0 << 16;
                            var12 = 0;
                            var11 = 0;
                            break L14;
                          } else {
                            var15 = -param7 + param2;
                            if (~param6 > ~param0) {
                              var12 = (param3 - param0 << 16) / var15;
                              var9_int = param6 << 16;
                              var11 = (param3 + -param6 << 16) / var14;
                              var10 = param0 << 16;
                              break L14;
                            } else {
                              var11 = (param3 - param0 << 16) / var15;
                              var10 = param6 << 16;
                              var9_int = param0 << 16;
                              var12 = (param3 + -param6 << 16) / var14;
                              break L14;
                            }
                          }
                        }
                        var13 = 0;
                        if (param1 < 0) {
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
                      if (~param2 >= ~param1) {
                        break L0;
                      } else {
                        L17: {
                          var16 = var9_int >> 16;
                          if (li.field_i > var16) {
                            var17 = -(var9_int >> 16) + (var10 >> 16);
                            if (var17 != 0) {
                              L18: {
                                if (li.field_i <= var17 + var16) {
                                  var17 = -1 + (-var16 + li.field_i);
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              if (var16 < 0) {
                                ud.a(var17 + var16, var15, param8, (byte) -85, param4);
                                break L17;
                              } else {
                                ud.a(var17, var15 + var16, param8, (byte) -85, param4);
                                break L17;
                              }
                            } else {
                              if (var16 < 0) {
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
                          return;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var9 = decompiledCaughtException;
            stackOut_97_0 = (RuntimeException) var9;
            stackOut_97_1 = new StringBuilder().append("qe.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_99_0 = stackOut_97_0;
            stackIn_99_1 = stackOut_97_1;
            stackIn_98_0 = stackOut_97_0;
            stackIn_98_1 = stackOut_97_1;
            if (param4 == null) {
              stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
              stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
              stackOut_99_2 = "null";
              stackIn_100_0 = stackOut_99_0;
              stackIn_100_1 = stackOut_99_1;
              stackIn_100_2 = stackOut_99_2;
              break L19;
            } else {
              stackOut_98_0 = (RuntimeException) (Object) stackIn_98_0;
              stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
              stackOut_98_2 = "{...}";
              stackIn_100_0 = stackOut_98_0;
              stackIn_100_1 = stackOut_98_1;
              stackIn_100_2 = stackOut_98_2;
              break L19;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_100_0, stackIn_100_2 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
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
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_15_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
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
                var5 = param2.h(3, 7);
                var6 = (byte)param2.h(8, 7);
                if (var5 <= 0) {
                  var7 = 0;
                  L4: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param0[var7] = (byte)var6;
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param0[var7] = (byte)(var6 + param2.h(var5, 7));
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_15_0 = (byte[]) param0;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (byte[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("qe.F(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(param1).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + 105 + 41);
        }
        return stackIn_16_0;
    }

    final static void a(long param0, byte param1) {
        if (param0 <= 0L) {
            return;
        }
        if (param0 % 10L == 0L) {
            uj.a(-1L + param0, -79);
            uj.a(1L, -62);
        } else {
            uj.a(param0, -65);
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
                    field_f = null;
                    break L2;
                  }
                }
                var4_int = ~var4_int;
                stackOut_6_0 = var4_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var4_int = var4_int >>> 8 ^ mc.field_d[255 & (var4_int ^ param3[var5])];
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("qe.G(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    abstract java.net.Socket b(int param0) throws IOException;

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "(Player 2)";
        field_b = 100;
    }
}
