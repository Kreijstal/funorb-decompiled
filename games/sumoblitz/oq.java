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
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
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
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("oq.G(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L6;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final static wb[] a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7, int param8) {
        int var9 = 0;
        wb[] var10 = null;
        wb[] var11_ref_wb__ = null;
        int var11 = 0;
        int var12 = 0;
        wb var13_ref_wb = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_42_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_33_0 = 0;
        var15 = Sumoblitz.field_L ? 1 : 0;
        var9 = param2 + (param3 + param4);
        var10 = new wb[]{new wb(var9, var9), new wb(param8, var9), new wb(var9, var9), new wb(var9, param8), new wb(64, 64), new wb(var9, param8), new wb(var9, var9), new wb(param8, var9), new wb(var9, var9)};
        var11_ref_wb__ = var10;
        var12 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var11_ref_wb__.length <= var12) {
                break L2;
              } else {
                var13_ref_wb = var11_ref_wb__[var12];
                stackOut_2_0 = 0;
                stackIn_11_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var15 != 0) {
                  break L1;
                } else {
                  var14 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var13_ref_wb.field_C.length <= var14) {
                          break L5;
                        } else {
                          var13_ref_wb.field_C[var14] = param0;
                          var14++;
                          if (var15 != 0) {
                            break L4;
                          } else {
                            if (var15 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var12++;
                      break L4;
                    }
                    if (var15 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L1;
          }
          var11 = stackIn_11_0;
          L6: while (true) {
            L7: {
              if (var11 >= param3) {
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L7;
              } else {
                stackOut_13_0 = 0;
                stackIn_22_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (var15 != 0) {
                  break L7;
                } else {
                  var12 = stackIn_14_0;
                  L8: while (true) {
                    L9: {
                      if (var9 <= var12) {
                        var11++;
                        break L9;
                      } else {
                        var10[6].field_C[var12 + (-1 + (var9 + -var11)) * var9] = param7;
                        var10[8].field_C[var12 + var9 * (-1 + (var9 - var11))] = param7;
                        var10[2].field_C[-1 - -var9 + -var11 + var12 * var9] = param7;
                        var10[8].field_C[-var11 + (var9 - 1) + var12 * var9] = param7;
                        var12++;
                        if (var15 != 0) {
                          break L9;
                        } else {
                          continue L8;
                        }
                      }
                    }
                    continue L6;
                  }
                }
              }
            }
            var11 = stackIn_22_0;
            L10: while (true) {
              stackOut_23_0 = param3;
              stackOut_23_1 = var11;
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              L11: while (true) {
                L12: {
                  if (stackIn_24_0 <= stackIn_24_1) {
                    var11 = -16 / ((30 - param6) / 43);
                    stackOut_30_0 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    break L12;
                  } else {
                    stackOut_25_0 = 0;
                    stackIn_31_0 = stackOut_25_0;
                    stackIn_26_0 = stackOut_25_0;
                    if (var15 != 0) {
                      break L12;
                    } else {
                      var12 = stackIn_26_0;
                      if (var9 <= var12) {
                        var11++;
                        continue L10;
                      } else {
                        var10[0].field_C[var12 - -(var11 * var9)] = param5;
                        var10[0].field_C[var11 + var12 * var9] = param5;
                        stackOut_27_0 = var9 + -var11 ^ -1;
                        stackOut_27_1 = var12 ^ -1;
                        stackIn_24_0 = stackOut_27_0;
                        stackIn_24_1 = stackOut_27_1;
                        continue L11;
                      }
                    }
                  }
                }
                var12 = stackIn_31_0;
                L13: while (true) {
                  L14: {
                    if (var12 >= param8) {
                      stackOut_41_0 = 0;
                      stackIn_42_0 = stackOut_41_0;
                      break L14;
                    } else {
                      stackOut_33_0 = 0;
                      stackIn_42_0 = stackOut_33_0;
                      stackIn_34_0 = stackOut_33_0;
                      if (var15 != 0) {
                        break L14;
                      } else {
                        var13 = stackIn_34_0;
                        L15: while (true) {
                          L16: {
                            if (param3 <= var13) {
                              var12++;
                              break L16;
                            } else {
                              var10[7].field_C[var12 + param8 * (-1 + (-var13 + var9))] = param7;
                              var10[5].field_C[var9 - 1 + -var13 + var9 * var12] = param7;
                              var10[1].field_C[var12 + var13 * param8] = param5;
                              var10[3].field_C[var13 + var12 * var9] = param5;
                              var13++;
                              if (var15 != 0) {
                                break L16;
                              } else {
                                continue L15;
                              }
                            }
                          }
                          continue L13;
                        }
                      }
                    }
                  }
                  var12 = stackIn_42_0;
                  L17: while (true) {
                    L18: {
                      if (var12 >= param8 >> -59129087) {
                        break L18;
                      } else {
                        var13 = 0;
                        L19: while (true) {
                          L20: {
                            if (var13 >= param4) {
                              var12++;
                              break L20;
                            } else {
                              var10[1].field_C[var12 + (-1 + -var13 + var9) * param8] = param1;
                              var10[3].field_C[var9 * var12 - (var13 + 1) - -var9] = param1;
                              var10[7].field_C[var12 + param8 * var13] = param1;
                              var10[5].field_C[var9 * var12 - -var13] = param1;
                              var13++;
                              if (var15 != 0) {
                                break L20;
                              } else {
                                continue L19;
                              }
                            }
                          }
                          if (var15 == 0) {
                            continue L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                    return var10;
                  }
                }
              }
            }
          }
        }
    }

    final String f(int param0) {
        StringBuilder discarded$8 = null;
        String discarded$9 = null;
        StringBuilder discarded$10 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var6 = null;
        StringBuilder stackIn_6_0 = null;
        StringBuilder stackIn_9_0 = null;
        StringBuilder stackOut_5_0 = null;
        StringBuilder stackOut_8_0 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var6 = new StringBuilder(80);
        var6 = var6;
        if (this.field_v != null) {
          L0: {
            discarded$8 = var6.append(this.field_v[0]);
            var3 = 1;
            if (param0 == 1118) {
              break L0;
            } else {
              discarded$9 = this.f(26);
              break L0;
            }
          }
          L1: while (true) {
            L2: {
              L3: {
                if (this.field_v.length <= var3) {
                  break L3;
                } else {
                  discarded$10 = var6.append("...");
                  stackOut_5_0 = var6.append(this.field_v[var3]);
                  stackIn_9_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    var3++;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_8_0 = (StringBuilder) (var6);
              stackIn_9_0 = stackOut_8_0;
              break L2;
            }
            return ((StringBuilder) (Object) stackIn_9_0).toString();
          }
        } else {
          return "";
        }
    }

    public static void g(int param0) {
        wb[] discarded$0 = null;
        if (param0 != -6811) {
            discarded$0 = oq.a(112, -53, -51, -110, 1, 98, (byte) -59, -49, -95);
        }
        field_r = null;
    }

    private final void a(fs param0, int param1, byte param2) {
        int[] array$1 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        ts var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 >= 41) {
                break L1;
              } else {
                this.field_v = (String[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (1 != param1) {
                  break L3;
                } else {
                  this.field_v = cn.a('<', param0.d(-1), -27224);
                  if (var9 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (-3 == (param1 ^ -1)) {
                var4_int = param0.e(-31302);
                this.field_u = new int[var4_int];
                var5 = 0;
                L4: while (true) {
                  if (var5 >= var4_int) {
                    break L2;
                  } else {
                    this.field_u[var5] = param0.a(255);
                    var5++;
                    if (var9 != 0) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      continue L4;
                    }
                  }
                }
              } else {
                L5: {
                  if ((param1 ^ -1) != -4) {
                    break L5;
                  } else {
                    var4_int = param0.e(-31302);
                    this.field_s = new int[var4_int];
                    this.field_t = new int[var4_int][];
                    var5 = 0;
                    L6: while (true) {
                      if (var4_int <= var5) {
                        if (var9 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      } else {
                        var6 = param0.a(255);
                        var7 = ij.a(10341, var6);
                        if (var9 != 0) {
                          break L2;
                        } else {
                          L7: {
                            L8: {
                              if (var7 == null) {
                                break L8;
                              } else {
                                this.field_s[var5] = var6;
                                array$1 = new int[var7.field_f];
                                this.field_t[var5] = array$1;
                                var8 = 0;
                                L9: while (true) {
                                  if (var8 >= var7.field_f) {
                                    break L8;
                                  } else {
                                    this.field_t[var5][var8] = param0.a(255);
                                    var8++;
                                    if (var9 != 0) {
                                      break L7;
                                    } else {
                                      if (var9 == 0) {
                                        continue L9;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var5++;
                            break L7;
                          }
                          continue L6;
                        }
                      }
                    }
                  }
                }
                if (4 != param1) {
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var4);
            stackOut_28_1 = new StringBuilder().append("oq.B(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            var3 = Sumoblitz.field_L ? 1 : 0;
            if (null != this.field_u) {
              var2 = 0;
              L2: while (true) {
                if (var2 >= this.field_u.length) {
                  break L1;
                } else {
                  this.field_u[var2] = ic.a(this.field_u[var2], 32768);
                  var2++;
                  if (var3 != 0) {
                    break L0;
                  } else {
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            } else {
              break L1;
            }
          }
          if (param0 <= -102) {
            break L0;
          } else {
            this.field_s = (int[]) null;
            break L0;
          }
        }
    }

    oq() {
    }

    final static void a(int param0) {
        wb[] discarded$0 = null;
        mn.b((byte) -116);
        if (param0 != -24233) {
            discarded$0 = oq.a(99, -71, 95, 31, -80, 103, (byte) 57, 84, 30);
        }
    }

    static {
        field_r = "Player names can be up to 12 letters, numbers and underscores";
    }
}
