/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oq extends pj {
    int[] field_u;
    static String field_r;
    private int[][] field_t;
    private int[] field_s;
    private String[] field_v;

    final void a(fs param0, boolean param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    var3_int = param0.e(-31302);
                    if (0 != var3_int) {
                      break L4;
                    } else {
                      if (var4 != 0) {
                        break L3;
                      } else {
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  this.a(param0, var3_int, (byte) 111);
                  break L3;
                }
                if (var4 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
              L5: {
                if (param1) {
                  break L5;
                } else {
                  oq.a(-64);
                  break L5;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("oq.G(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
    }

    final static wb[] a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        wb[] var10 = null;
        wb[] var11_ref_wb__ = null;
        int var11 = 0;
        int var12 = 0;
        wb var13_ref_wb = null;
        int var13 = 0;
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
        wb[] stackIn_61_0 = null;
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
        wb[] stackOut_60_0 = null;
        var15 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var9_int = param2 + (param3 + param4);
            var10 = new wb[]{new wb(var9_int, var9_int), new wb(param8, var9_int), new wb(var9_int, var9_int), new wb(var9_int, param8), new wb(64, 64), new wb(var9_int, param8), new wb(var9_int, var9_int), new wb(param8, var9_int), new wb(var9_int, var9_int)};
            var11_ref_wb__ = var10;
            var12 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var11_ref_wb__.length >= ~var12) {
                    break L3;
                  } else {
                    var13_ref_wb = var11_ref_wb__[var12];
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
                            if (~var13_ref_wb.field_C.length >= ~var14) {
                              break L6;
                            } else {
                              var13_ref_wb.field_C[var14] = param0;
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
                    if (var11 >= param3) {
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
                              if (~var9_int >= ~var12) {
                                break L12;
                              } else {
                                var10[6].field_C[var12 + (-1 + (var9_int + -var11)) * var9_int] = param7;
                                var10[8].field_C[var12 + var9_int * (-1 + (var9_int - var11))] = param7;
                                var10[2].field_C[-1 - -var9_int + -var11 + var12 * var9_int] = param7;
                                var10[8].field_C[-var11 + (var9_int - 1) + var12 * var9_int] = param7;
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
                  stackOut_26_0 = ~param3;
                  stackOut_26_1 = ~var11;
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  L14: while (true) {
                    L15: {
                      L16: {
                        if (stackIn_27_0 >= stackIn_27_1) {
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
                                if (var9_int <= var12) {
                                  break L18;
                                } else {
                                  var10[0].field_C[var12 - -(var11 * var9_int)] = param5;
                                  var10[0].field_C[var11 + var12 * var9_int] = param5;
                                  stackOut_31_0 = ~(var9_int + -var11);
                                  stackOut_31_1 = ~var12;
                                  stackIn_27_0 = stackOut_31_0;
                                  stackIn_27_1 = stackOut_31_1;
                                  stackIn_32_0 = stackOut_31_0;
                                  stackIn_32_1 = stackOut_31_1;
                                  if (var15 != 0) {
                                    continue L14;
                                  } else {
                                    L19: {
                                      if (stackIn_32_0 < stackIn_32_1) {
                                        var10[2].field_C[var12 + var9_int * var11] = param5;
                                        var10[6].field_C[var11 + var9_int * var12] = param5;
                                        break L19;
                                      } else {
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
                      var11 = -16 / ((30 - param6) / 43);
                      stackOut_37_0 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      break L15;
                    }
                    var12 = stackIn_38_0;
                    L20: while (true) {
                      L21: {
                        L22: {
                          if (var12 >= param8) {
                            break L22;
                          } else {
                            stackOut_40_0 = 0;
                            stackIn_50_0 = stackOut_40_0;
                            stackIn_41_0 = stackOut_40_0;
                            if (var15 != 0) {
                              break L21;
                            } else {
                              var13 = stackIn_41_0;
                              L23: while (true) {
                                L24: {
                                  L25: {
                                    if (param3 <= var13) {
                                      break L25;
                                    } else {
                                      var10[7].field_C[var12 + param8 * (-1 + (-var13 + var9_int))] = param7;
                                      var10[5].field_C[var9_int - 1 + -var13 + var9_int * var12] = param7;
                                      var10[1].field_C[var12 + var13 * param8] = param5;
                                      var10[3].field_C[var13 + var12 * var9_int] = param5;
                                      var13++;
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
                                  var12++;
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
                        stackOut_49_0 = 0;
                        stackIn_50_0 = stackOut_49_0;
                        break L21;
                      }
                      var12 = stackIn_50_0;
                      L26: while (true) {
                        L27: {
                          if (~var12 <= ~(param8 >> -59129087)) {
                            break L27;
                          } else {
                            var13 = 0;
                            L28: while (true) {
                              L29: {
                                L30: {
                                  if (var13 >= param4) {
                                    break L30;
                                  } else {
                                    var10[1].field_C[var12 + (-1 + -var13 + var9_int) * param8] = param1;
                                    var10[3].field_C[var9_int * var12 - (var13 + 1) - -var9_int] = param1;
                                    var10[7].field_C[var12 + param8 * var13] = param1;
                                    var10[5].field_C[var9_int * var12 - -var13] = param1;
                                    var13++;
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
                                var12++;
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
                        stackOut_60_0 = (wb[]) var10;
                        stackIn_61_0 = stackOut_60_0;
                        break L0;
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
          throw qo.a((Throwable) (Object) var9, "oq.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_61_0;
    }

    final String f(int param0) {
        StringBuilder var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        String stackIn_3_0 = null;
        StringBuilder stackIn_9_0 = null;
        StringBuilder stackIn_13_0 = null;
        String stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_8_0 = null;
        StringBuilder stackOut_12_0 = null;
        String stackOut_13_0 = null;
        String stackOut_2_0 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2 = new StringBuilder(80);
            if (((oq) this).field_v != null) {
              L1: {
                StringBuilder discarded$8 = var2.append(((oq) this).field_v[0]);
                var3 = 1;
                if (param0 == 1118) {
                  break L1;
                } else {
                  String discarded$9 = ((oq) this).f(26);
                  break L1;
                }
              }
              L2: while (true) {
                L3: {
                  L4: {
                    if (~((oq) this).field_v.length >= ~var3) {
                      break L4;
                    } else {
                      StringBuilder discarded$10 = var2.append("...");
                      stackOut_8_0 = var2.append(((oq) this).field_v[var3]);
                      stackIn_13_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var4 != 0) {
                        break L3;
                      } else {
                        var3++;
                        if (var4 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_12_0 = (StringBuilder) var2;
                  stackIn_13_0 = stackOut_12_0;
                  break L3;
                }
                stackOut_13_0 = ((StringBuilder) (Object) stackIn_13_0).toString();
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            } else {
              stackOut_2_0 = "";
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2_ref, "oq.E(" + param0 + ')');
        }
        return stackIn_14_0;
    }

    public static void g(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -6811) {
                break L1;
              } else {
                wb[] discarded$2 = oq.a(112, -53, -51, -110, 1, 98, (byte) -59, -49, -95);
                break L1;
              }
            }
            field_r = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var1, "oq.C(" + param0 + ')');
        }
    }

    private final void a(fs param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        ts var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 >= 41) {
                break L1;
              } else {
                ((oq) this).field_v = null;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (1 != param1) {
                    break L4;
                  } else {
                    ((oq) this).field_v = cn.a('<', param0.d(-1), -27224);
                    if (var9 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (param1 == 2) {
                  var4_int = param0.e(-31302);
                  ((oq) this).field_u = new int[var4_int];
                  var5 = 0;
                  L5: while (true) {
                    if (var5 >= var4_int) {
                      break L3;
                    } else {
                      ((oq) this).field_u[var5] = param0.a(255);
                      var5++;
                      if (var9 != 0) {
                        break L2;
                      } else {
                        if (var9 == 0) {
                          continue L5;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  L6: {
                    if (param1 != 3) {
                      break L6;
                    } else {
                      var4_int = param0.e(-31302);
                      ((oq) this).field_s = new int[var4_int];
                      ((oq) this).field_t = new int[var4_int][];
                      var5 = 0;
                      L7: while (true) {
                        L8: {
                          if (~var4_int >= ~var5) {
                            break L8;
                          } else {
                            var6 = param0.a(255);
                            var7 = ij.a(10341, var6);
                            if (var9 != 0) {
                              break L3;
                            } else {
                              L9: {
                                L10: {
                                  if (null == var7) {
                                    break L10;
                                  } else {
                                    ((oq) this).field_s[var5] = var6;
                                    ((oq) this).field_t[var5] = new int[var7.field_f];
                                    var8 = 0;
                                    L11: while (true) {
                                      if (var8 >= var7.field_f) {
                                        break L10;
                                      } else {
                                        ((oq) this).field_t[var5][var8] = param0.a(255);
                                        var8++;
                                        if (var9 != 0) {
                                          break L9;
                                        } else {
                                          if (var9 == 0) {
                                            continue L11;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var5++;
                                break L9;
                              }
                              if (var9 == 0) {
                                continue L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        if (var9 == 0) {
                          break L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (4 != param1) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var4;
            stackOut_41_1 = new StringBuilder().append("oq.B(");
            stackIn_44_0 = stackOut_41_0;
            stackIn_44_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param0 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L12;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_45_0 = stackOut_42_0;
              stackIn_45_1 = stackOut_42_1;
              stackIn_45_2 = stackOut_42_2;
              break L12;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void e(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null != ((oq) this).field_u) {
                  var2_int = 0;
                  L3: while (true) {
                    if (~var2_int <= ~((oq) this).field_u.length) {
                      break L2;
                    } else {
                      ((oq) this).field_u[var2_int] = ic.a(((oq) this).field_u[var2_int], 32768);
                      var2_int++;
                      if (var3 != 0) {
                        break L1;
                      } else {
                        if (var3 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              if (param0 <= -102) {
                break L1;
              } else {
                ((oq) this).field_s = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "oq.F(" + param0 + ')');
        }
    }

    oq() {
    }

    final static void a(int param0) {
        try {
            mn.b((byte) -116);
            if (param0 != -24233) {
                wb[] discarded$0 = oq.a(99, -71, 95, 31, -80, 103, (byte) 57, 84, 30);
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "oq.D(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Player names can be up to 12 letters, numbers and underscores";
    }
}
