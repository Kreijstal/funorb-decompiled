/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class od extends fc {
    static bd field_D;
    static String field_B;
    static bd[] field_G;
    static java.lang.reflect.Constructor field_F;
    static String field_E;
    static String field_C;
    static fk field_I;
    static String field_H;

    private od(int param0, int param1, int param2, int param3, nn param4, mh param5, ag param6) {
        super(param0, param1, param2, param3, param4, param5);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            ((od) this).field_A = param6;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("od.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param4 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param6 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final static bd[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        bd[] var10 = null;
        bd[] var11_ref_bd__ = null;
        int var11 = 0;
        int var12 = 0;
        bd var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_50_0 = 0;
        Object stackIn_52_0 = null;
        bd[] stackIn_64_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_49_0 = 0;
        bd[] stackOut_63_0 = null;
        Object stackOut_51_0 = null;
        var15 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var9_int = param2 + (param4 - -param7);
            var10 = new bd[]{new bd(var9_int, var9_int), new bd(param0, var9_int), new bd(var9_int, var9_int), new bd(var9_int, param0), new bd(64, 64), new bd(var9_int, param0), new bd(var9_int, var9_int), new bd(param0, var9_int), new bd(var9_int, var9_int)};
            var11_ref_bd__ = var10;
            var12 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var12 >= var11_ref_bd__.length) {
                    break L3;
                  } else {
                    var13 = var11_ref_bd__[var12];
                    stackOut_3_0 = 0;
                    stackIn_13_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var15 != 0) {
                      break L2;
                    } else {
                      var14 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (~var14 <= ~var13.field_D.length) {
                              break L6;
                            } else {
                              var13.field_D[var14] = param8;
                              var14++;
                              if (var15 != 0) {
                                break L5;
                              } else {
                                if (var15 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var12++;
                          break L5;
                        }
                        if (var15 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              }
              var11 = stackIn_13_0;
              L7: while (true) {
                L8: {
                  L9: {
                    if (var11 >= param4) {
                      break L9;
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_25_0 = stackOut_15_0;
                      stackIn_16_0 = stackOut_15_0;
                      if (var15 != 0) {
                        break L8;
                      } else {
                        var12 = stackIn_16_0;
                        L10: while (true) {
                          L11: {
                            L12: {
                              if (var9_int <= var12) {
                                break L12;
                              } else {
                                var10[6].field_D[(-var11 + var9_int + -1) * var9_int + var12] = param5;
                                var10[8].field_D[var12 + var9_int * (-var11 + (var9_int - 1))] = param5;
                                var10[2].field_D[-var11 + var9_int - (1 - var9_int * var12)] = param5;
                                var10[8].field_D[var9_int * var12 + (-var11 + (-1 + var9_int))] = param5;
                                var12++;
                                if (var15 != 0) {
                                  break L11;
                                } else {
                                  if (var15 == 0) {
                                    continue L10;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                            var11++;
                            break L11;
                          }
                          if (var15 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  }
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  break L8;
                }
                var11 = stackIn_25_0;
                L13: while (true) {
                  stackOut_26_0 = param4;
                  stackOut_26_1 = var11;
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  L14: while (true) {
                    L15: {
                      L16: {
                        if (stackIn_27_0 <= stackIn_27_1) {
                          break L16;
                        } else {
                          stackOut_28_0 = 0;
                          stackIn_38_0 = stackOut_28_0;
                          stackIn_29_0 = stackOut_28_0;
                          if (var15 != 0) {
                            break L15;
                          } else {
                            var12 = stackIn_29_0;
                            L17: while (true) {
                              L18: {
                                if (~var9_int >= ~var12) {
                                  break L18;
                                } else {
                                  var10[0].field_D[var12 + var9_int * var11] = param6;
                                  var10[0].field_D[var11 + var12 * var9_int] = param6;
                                  stackOut_31_0 = var12;
                                  stackOut_31_1 = -var11 + var9_int;
                                  stackIn_27_0 = stackOut_31_0;
                                  stackIn_27_1 = stackOut_31_1;
                                  stackIn_32_0 = stackOut_31_0;
                                  stackIn_32_1 = stackOut_31_1;
                                  if (var15 != 0) {
                                    continue L14;
                                  } else {
                                    L19: {
                                      if (stackIn_32_0 >= stackIn_32_1) {
                                        break L19;
                                      } else {
                                        var10[2].field_D[var12 + var9_int * var11] = param6;
                                        var10[6].field_D[var11 + var12 * var9_int] = param6;
                                        break L19;
                                      }
                                    }
                                    var12++;
                                    if (var15 == 0) {
                                      continue L17;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                              }
                              var11++;
                              if (var15 == 0) {
                                continue L13;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                      }
                      stackOut_37_0 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      break L15;
                    }
                    var11 = stackIn_38_0;
                    L20: while (true) {
                      L21: {
                        L22: {
                          if (~var11 <= ~param0) {
                            break L22;
                          } else {
                            stackOut_40_0 = 0;
                            stackIn_50_0 = stackOut_40_0;
                            stackIn_41_0 = stackOut_40_0;
                            if (var15 != 0) {
                              break L21;
                            } else {
                              var12 = stackIn_41_0;
                              L23: while (true) {
                                L24: {
                                  L25: {
                                    if (~param4 >= ~var12) {
                                      break L25;
                                    } else {
                                      var10[7].field_D[param0 * (var9_int - (var12 + 1)) + var11] = param5;
                                      var10[5].field_D[var9_int * var11 - (-var9_int + 1) - var12] = param5;
                                      var10[1].field_D[var11 + var12 * param0] = param6;
                                      var10[3].field_D[var12 + var9_int * var11] = param6;
                                      var12++;
                                      if (var15 != 0) {
                                        break L24;
                                      } else {
                                        if (var15 == 0) {
                                          continue L23;
                                        } else {
                                          break L25;
                                        }
                                      }
                                    }
                                  }
                                  var11++;
                                  break L24;
                                }
                                if (var15 == 0) {
                                  continue L20;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                        }
                        stackOut_49_0 = param1;
                        stackIn_50_0 = stackOut_49_0;
                        break L21;
                      }
                      if (stackIn_50_0 >= 17) {
                        var11 = 0;
                        L26: while (true) {
                          L27: {
                            if (~var11 <= ~(param0 >> 1644375105)) {
                              break L27;
                            } else {
                              var12 = 0;
                              L28: while (true) {
                                L29: {
                                  L30: {
                                    if (~var12 <= ~param2) {
                                      break L30;
                                    } else {
                                      var10[1].field_D[var11 + param0 * (-1 + var9_int - var12)] = param3;
                                      var10[3].field_D[var11 * var9_int + -1 + (var9_int - var12)] = param3;
                                      var10[7].field_D[var12 * param0 - -var11] = param3;
                                      var10[5].field_D[var12 + var9_int * var11] = param3;
                                      var12++;
                                      if (var15 != 0) {
                                        break L29;
                                      } else {
                                        if (var15 == 0) {
                                          continue L28;
                                        } else {
                                          break L30;
                                        }
                                      }
                                    }
                                  }
                                  var11++;
                                  break L29;
                                }
                                if (var15 == 0) {
                                  continue L26;
                                } else {
                                  break L27;
                                }
                              }
                            }
                          }
                          stackOut_63_0 = (bd[]) var10;
                          stackIn_64_0 = stackOut_63_0;
                          break L0;
                        }
                      } else {
                        stackOut_51_0 = null;
                        stackIn_52_0 = stackOut_51_0;
                        return (bd[]) (Object) stackIn_52_0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var9, "od.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_64_0;
    }

    final static void k(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!md.field_k) {
              throw new IllegalStateException();
            } else {
              ka.field_r = true;
              w.b(false, -23960);
              fa.field_c = param0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1, "od.D(" + param0 + ')');
        }
    }

    final static boolean a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_34_0 = 0;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0;
              if (var2_int == 10) {
                break L1;
              } else {
                if (var2_int == 11) {
                  break L1;
                } else {
                  L2: {
                    if (var2_int != 129) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (var2_int != 128) {
                      break L3;
                    } else {
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var2_int != 131) {
                      break L4;
                    } else {
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var2_int == 130) {
                    break L1;
                  } else {
                    if (var2_int == 133) {
                      break L1;
                    } else {
                      if (132 != var2_int) {
                        if (param1 == 1) {
                          stackOut_39_0 = 0;
                          stackIn_40_0 = stackOut_39_0;
                          break L0;
                        } else {
                          stackOut_37_0 = 1;
                          stackIn_38_0 = stackOut_37_0;
                          return stackIn_38_0 != 0;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            stackOut_34_0 = 1;
            stackIn_35_0 = stackOut_34_0;
            return stackIn_35_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "od.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_40_0 != 0;
    }

    final static String a(byte param0, Throwable param1) throws IOException {
        String var2 = null;
        kc var3 = null;
        StringWriter var3_ref = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        L0: {
          L1: {
            var13 = HostileSpawn.field_I ? 1 : 0;
            if (!(param1 instanceof kc)) {
              break L1;
            } else {
              var3 = (kc) (Object) param1;
              var2 = var3.field_a + " | ";
              param1 = var3.field_g;
              if (var13 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var2 = "";
          break L0;
        }
        L2: {
          var3_ref = new StringWriter();
          var4 = new PrintWriter((Writer) (Object) var3_ref);
          param1.printStackTrace(var4);
          var4.close();
          var5 = var3_ref.toString();
          var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
          if (param0 == -77) {
            break L2;
          } else {
            boolean discarded$1 = od.a(68, -28);
            break L2;
          }
        }
        var7 = var6.readLine();
        L3: while (true) {
          L4: {
            L5: {
              var8 = var6.readLine();
              if (null == var8) {
                break L5;
              } else {
                var9 = var8.indexOf('(');
                var10 = var8.indexOf(')', 1 + var9);
                if (var13 != 0) {
                  break L4;
                } else {
                  L6: {
                    L7: {
                      if (var9 != -1) {
                        break L7;
                      } else {
                        var11 = var8;
                        if (var13 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var11 = var8.substring(0, var9);
                    break L6;
                  }
                  L8: {
                    var11 = var11.trim();
                    var11 = var11.substring(1 + var11.lastIndexOf(' '));
                    var11 = var11.substring(var11.lastIndexOf('\t') + 1);
                    var2 = var2 + var11;
                    if (-1 == var9) {
                      break L8;
                    } else {
                      if (var10 != -1) {
                        var12 = var8.indexOf(".java:", var9);
                        if (var12 < 0) {
                          break L8;
                        } else {
                          var2 = var2 + var8.substring(var12 - -5, var10);
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                  }
                  var2 = var2 + ' ';
                  if (var13 == 0) {
                    continue L3;
                  } else {
                    break L5;
                  }
                }
              }
            }
            var2 = var2 + "| " + var7;
            break L4;
          }
          return var2;
        }
    }

    public static void e(byte param0) {
        field_F = null;
        if (param0 > -43) {
            return;
        }
        try {
            field_C = null;
            field_E = null;
            field_B = null;
            field_D = null;
            field_H = null;
            field_I = null;
            field_G = null;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "od.A(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, ag param4, int param5) {
        RuntimeException runtimeException = null;
        rj var7 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3, param4, param5);
              var7 = rh.field_D;
              if (null == var7) {
                break L1;
              } else {
                if (((od) this).b(param3, param0, 255, param1, param2)) {
                  L2: {
                    if (((od) this).field_p instanceof k) {
                      break L2;
                    } else {
                      if (var7.field_p instanceof k) {
                        ((k) (Object) var7.field_p).a(var7, false, (od) this);
                        rh.field_D = null;
                        if (!HostileSpawn.field_I) {
                          break L1;
                        } else {
                          break L2;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  ((k) (Object) ((od) this).field_p).a(var7, false, (od) this);
                  rh.field_D = null;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) runtimeException;
            stackOut_16_1 = new StringBuilder().append("od.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param5 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "<col=ffffff>Health<nbsp>packs</col><br>One of the wonders of the century, the Omega Medicine Inc. health pack combines nanites with stem cells to repair almost every injury in a matter of seconds.";
        field_E = "Use the rocket launcher to destroy the turrets blocking the lift.";
        field_C = "<col=ffffff>Grenade<nbsp>launcher</col><br>The grenade launcher takes explosive ammo, and sets it to detonate after a time delay instead of on impact. It is very useful for clearing small rooms with the minimum of personal risk, but less useful in open spaces.";
        field_H = "Connection timed out. Please try using a different server.";
    }
}
