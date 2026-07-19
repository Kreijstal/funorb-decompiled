/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oo extends dg {
    private sea field_p;
    private int field_q;
    private int field_o;
    private bt[] field_s;
    private lca[][] field_r;
    static String field_m;
    static jua field_t;
    private int field_u;
    static byte[] field_n;

    final static kg a(cn param0, cn param1, boolean param2, String param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        kg stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        kg stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var5_int = param0.b(param3, -7768);
              if (!param2) {
                break L1;
              } else {
                field_n = (byte[]) null;
                break L1;
              }
            }
            var6 = param0.a(true, param4, var5_int);
            stackOut_2_0 = sv.a(param1, var5_int, param0, 24876, var6);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("oo.I(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
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
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, uw param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    if (this.field_r != null) {
                      var4_int = 0;
                      L5: while (true) {
                        if (var4_int >= this.field_o) {
                          break L4;
                        } else {
                          stackOut_5_0 = 0;
                          stackIn_16_0 = stackOut_5_0;
                          stackIn_6_0 = stackOut_5_0;
                          if (var6 != 0) {
                            break L3;
                          } else {
                            var5 = stackIn_6_0;
                            L6: while (true) {
                              L7: {
                                L8: {
                                  if (this.field_q <= var5) {
                                    break L8;
                                  } else {
                                    param1.a(param0, this.field_r[var4_int][var5], (byte) -33);
                                    var5++;
                                    if (var6 != 0) {
                                      break L7;
                                    } else {
                                      if (var6 == 0) {
                                        continue L6;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                                var4_int++;
                                break L7;
                              }
                              if (var6 == 0) {
                                continue L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  if (null != this.field_s) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L3;
                  } else {
                    break L2;
                  }
                }
                var4_int = stackIn_16_0;
                L9: while (true) {
                  if (var4_int >= this.field_s.length) {
                    break L2;
                  } else {
                    param1.a(2, this.field_s[var4_int], (byte) -33);
                    var4_int++;
                    if (var6 != 0) {
                      break L1;
                    } else {
                      if (var6 == 0) {
                        continue L9;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              if (param2 > 40) {
                break L1;
              } else {
                field_m = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var4);
            stackOut_24_1 = new StringBuilder().append("oo.FA(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param2 + ')');
        }
    }

    final int m(byte param0) {
        if (param0 >= -63) {
            return -82;
        }
        return 0;
    }

    private final void k(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        lca var18 = null;
        la var19 = null;
        lca var20 = null;
        la var21 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_125_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_61_0 = 0;
        var16 = TombRacer.field_G ? 1 : 0;
        if (param0 == -3440) {
          var21 = this.a(param0 + 3494);
          var3 = this.field_h.d(3);
          var4 = this.field_h.e(9648);
          this.field_o = this.field_h.c(param0 ^ 3403) / dba.field_a;
          this.field_q = this.field_h.a((byte) 55) / dba.field_a;
          this.field_r = new lca[this.field_o][this.field_q];
          var5 = -(this.field_h.a((byte) 55) / 2) + (var4 - -(dba.field_a / 2));
          var6 = 0;
          L0: while (true) {
            if (var6 < this.field_q) {
              var7 = var3 - this.field_h.c(-60) / 2 + dba.field_a / 2;
              if (var16 == 0) {
                var8 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (this.field_o <= var8) {
                        break L3;
                      } else {
                        var20 = new lca();
                        this.field_r[var8][var6] = var20;
                        stackOut_71_0 = var8;
                        stackIn_125_0 = stackOut_71_0;
                        stackIn_72_0 = stackOut_71_0;
                        if (var16 != 0) {
                          break L2;
                        } else {
                          L4: {
                            if (stackIn_72_0 <= 0) {
                              stackOut_74_0 = 0;
                              stackIn_75_0 = stackOut_74_0;
                              break L4;
                            } else {
                              stackOut_73_0 = 1;
                              stackIn_75_0 = stackOut_73_0;
                              break L4;
                            }
                          }
                          L5: {
                            var10 = stackIn_75_0;
                            if (var8 >= this.field_o + -1) {
                              stackOut_77_0 = 0;
                              stackIn_78_0 = stackOut_77_0;
                              break L5;
                            } else {
                              stackOut_76_0 = 1;
                              stackIn_78_0 = stackOut_76_0;
                              break L5;
                            }
                          }
                          L6: {
                            var11 = stackIn_78_0;
                            if (-1 <= (var6 ^ -1)) {
                              stackOut_80_0 = 0;
                              stackIn_81_0 = stackOut_80_0;
                              break L6;
                            } else {
                              stackOut_79_0 = 1;
                              stackIn_81_0 = stackOut_79_0;
                              break L6;
                            }
                          }
                          L7: {
                            var12 = stackIn_81_0;
                            if (this.field_q - 1 <= var6) {
                              stackOut_83_0 = 0;
                              stackIn_84_0 = stackOut_83_0;
                              break L7;
                            } else {
                              stackOut_82_0 = 1;
                              stackIn_84_0 = stackOut_82_0;
                              break L7;
                            }
                          }
                          L8: {
                            var13 = stackIn_84_0;
                            var14 = 0;
                            if (var10 != 0) {
                              var14++;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L9: {
                            if (var11 == 0) {
                              break L9;
                            } else {
                              var14++;
                              break L9;
                            }
                          }
                          L10: {
                            if (var12 == 0) {
                              break L10;
                            } else {
                              var14++;
                              break L10;
                            }
                          }
                          L11: {
                            if (var13 == 0) {
                              break L11;
                            } else {
                              var14++;
                              break L11;
                            }
                          }
                          L12: {
                            L13: {
                              var15 = 0;
                              if (var14 == 4) {
                                break L13;
                              } else {
                                L14: {
                                  if (3 == var14) {
                                    break L14;
                                  } else {
                                    L15: {
                                      if (var14 != 2) {
                                        break L15;
                                      } else {
                                        L16: {
                                          L17: {
                                            L18: {
                                              if (var10 != 0) {
                                                break L18;
                                              } else {
                                                if (var12 == 0) {
                                                  break L17;
                                                } else {
                                                  break L18;
                                                }
                                              }
                                            }
                                            L19: {
                                              L20: {
                                                if (var10 != 0) {
                                                  break L20;
                                                } else {
                                                  if (var13 == 0) {
                                                    break L19;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                              }
                                              L21: {
                                                L22: {
                                                  if (var11 != 0) {
                                                    break L22;
                                                  } else {
                                                    if (var12 == 0) {
                                                      break L21;
                                                    } else {
                                                      break L22;
                                                    }
                                                  }
                                                }
                                                if (var11 != 0) {
                                                  break L16;
                                                } else {
                                                  if (var13 == 0) {
                                                    var15 = -512;
                                                    if (var16 == 0) {
                                                      break L16;
                                                    } else {
                                                      break L21;
                                                    }
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                              }
                                              var15 = 1024;
                                              if (var16 == 0) {
                                                break L16;
                                              } else {
                                                break L19;
                                              }
                                            }
                                            var15 = 0;
                                            if (var16 == 0) {
                                              break L16;
                                            } else {
                                              break L17;
                                            }
                                          }
                                          var15 = 512;
                                          break L16;
                                        }
                                        var20.field_f = 1;
                                        if (var16 == 0) {
                                          break L12;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    var20.field_f = 2;
                                    if (var16 == 0) {
                                      break L12;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                L23: {
                                  var20.field_f = 0;
                                  if (var12 == 0) {
                                    break L23;
                                  } else {
                                    L24: {
                                      if (var13 == 0) {
                                        break L24;
                                      } else {
                                        L25: {
                                          if (var11 == 0) {
                                            break L25;
                                          } else {
                                            var15 = 512;
                                            if (var16 == 0) {
                                              break L12;
                                            } else {
                                              break L25;
                                            }
                                          }
                                        }
                                        var15 = -512;
                                        if (var16 == 0) {
                                          break L12;
                                        } else {
                                          break L24;
                                        }
                                      }
                                    }
                                    var15 = 0;
                                    if (var16 == 0) {
                                      break L12;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                                var15 = 1024;
                                if (var16 == 0) {
                                  break L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            var20.field_f = 2;
                            break L12;
                          }
                          var20.field_c = var21.e(true).a(100, param0 + 3440);
                          var20.field_a = (oo) (this);
                          var20.field_e = dfa.a(var15 + tfa.field_d[var20.field_f], 2048, -78);
                          var20.field_d = -var4 + var5;
                          var20.field_b = var7 - var3;
                          var7 = var7 + dba.field_a;
                          var8++;
                          if (var16 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    stackOut_124_0 = var5 + dba.field_a;
                    stackIn_125_0 = stackOut_124_0;
                    break L2;
                  }
                  var5 = stackIn_125_0;
                  var6++;
                  if (var16 == 0) {
                    continue L0;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          this.field_r = (lca[][]) null;
          var19 = this.a(param0 + 3494);
          var3 = this.field_h.d(3);
          var4 = this.field_h.e(9648);
          this.field_o = this.field_h.c(param0 ^ 3403) / dba.field_a;
          this.field_q = this.field_h.a((byte) 55) / dba.field_a;
          this.field_r = new lca[this.field_o][this.field_q];
          var5 = -(this.field_h.a((byte) 55) / 2) + (var4 - -(dba.field_a / 2));
          var6 = 0;
          L26: while (true) {
            if (var6 < this.field_q) {
              var7 = var3 - this.field_h.c(-60) / 2 + dba.field_a / 2;
              if (var16 == 0) {
                var8 = 0;
                L27: while (true) {
                  L28: {
                    L29: {
                      if (this.field_o <= var8) {
                        break L29;
                      } else {
                        var18 = new lca();
                        this.field_r[var8][var6] = var18;
                        stackOut_8_0 = var8;
                        stackIn_62_0 = stackOut_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        if (var16 != 0) {
                          break L28;
                        } else {
                          L30: {
                            if (stackIn_9_0 <= 0) {
                              stackOut_11_0 = 0;
                              stackIn_12_0 = stackOut_11_0;
                              break L30;
                            } else {
                              stackOut_10_0 = 1;
                              stackIn_12_0 = stackOut_10_0;
                              break L30;
                            }
                          }
                          L31: {
                            var10 = stackIn_12_0;
                            if (var8 >= this.field_o + -1) {
                              stackOut_14_0 = 0;
                              stackIn_15_0 = stackOut_14_0;
                              break L31;
                            } else {
                              stackOut_13_0 = 1;
                              stackIn_15_0 = stackOut_13_0;
                              break L31;
                            }
                          }
                          L32: {
                            var11 = stackIn_15_0;
                            if (-1 <= (var6 ^ -1)) {
                              stackOut_17_0 = 0;
                              stackIn_18_0 = stackOut_17_0;
                              break L32;
                            } else {
                              stackOut_16_0 = 1;
                              stackIn_18_0 = stackOut_16_0;
                              break L32;
                            }
                          }
                          L33: {
                            var12 = stackIn_18_0;
                            if (this.field_q - 1 <= var6) {
                              stackOut_20_0 = 0;
                              stackIn_21_0 = stackOut_20_0;
                              break L33;
                            } else {
                              stackOut_19_0 = 1;
                              stackIn_21_0 = stackOut_19_0;
                              break L33;
                            }
                          }
                          L34: {
                            var13 = stackIn_21_0;
                            var14 = 0;
                            if (var10 != 0) {
                              var14++;
                              break L34;
                            } else {
                              break L34;
                            }
                          }
                          L35: {
                            if (var11 == 0) {
                              break L35;
                            } else {
                              var14++;
                              break L35;
                            }
                          }
                          L36: {
                            if (var12 == 0) {
                              break L36;
                            } else {
                              var14++;
                              break L36;
                            }
                          }
                          L37: {
                            if (var13 == 0) {
                              break L37;
                            } else {
                              var14++;
                              break L37;
                            }
                          }
                          L38: {
                            L39: {
                              var15 = 0;
                              if (var14 == 4) {
                                break L39;
                              } else {
                                L40: {
                                  if (3 == var14) {
                                    break L40;
                                  } else {
                                    L41: {
                                      if (var14 != 2) {
                                        break L41;
                                      } else {
                                        L42: {
                                          L43: {
                                            L44: {
                                              if (var10 != 0) {
                                                break L44;
                                              } else {
                                                if (var12 == 0) {
                                                  break L43;
                                                } else {
                                                  break L44;
                                                }
                                              }
                                            }
                                            L45: {
                                              L46: {
                                                if (var10 != 0) {
                                                  break L46;
                                                } else {
                                                  if (var13 == 0) {
                                                    break L45;
                                                  } else {
                                                    break L46;
                                                  }
                                                }
                                              }
                                              L47: {
                                                L48: {
                                                  if (var11 != 0) {
                                                    break L48;
                                                  } else {
                                                    if (var12 == 0) {
                                                      break L47;
                                                    } else {
                                                      break L48;
                                                    }
                                                  }
                                                }
                                                if (var11 != 0) {
                                                  break L42;
                                                } else {
                                                  if (var13 == 0) {
                                                    var15 = -512;
                                                    if (var16 == 0) {
                                                      break L42;
                                                    } else {
                                                      break L47;
                                                    }
                                                  } else {
                                                    break L42;
                                                  }
                                                }
                                              }
                                              var15 = 1024;
                                              if (var16 == 0) {
                                                break L42;
                                              } else {
                                                break L45;
                                              }
                                            }
                                            var15 = 0;
                                            if (var16 == 0) {
                                              break L42;
                                            } else {
                                              break L43;
                                            }
                                          }
                                          var15 = 512;
                                          break L42;
                                        }
                                        var18.field_f = 1;
                                        if (var16 == 0) {
                                          break L38;
                                        } else {
                                          break L41;
                                        }
                                      }
                                    }
                                    var18.field_f = 2;
                                    if (var16 == 0) {
                                      break L38;
                                    } else {
                                      break L40;
                                    }
                                  }
                                }
                                L49: {
                                  var18.field_f = 0;
                                  if (var12 == 0) {
                                    break L49;
                                  } else {
                                    L50: {
                                      if (var13 == 0) {
                                        break L50;
                                      } else {
                                        L51: {
                                          if (var11 == 0) {
                                            break L51;
                                          } else {
                                            var15 = 512;
                                            if (var16 == 0) {
                                              break L38;
                                            } else {
                                              break L51;
                                            }
                                          }
                                        }
                                        var15 = -512;
                                        if (var16 == 0) {
                                          break L38;
                                        } else {
                                          break L50;
                                        }
                                      }
                                    }
                                    var15 = 0;
                                    if (var16 == 0) {
                                      break L38;
                                    } else {
                                      break L49;
                                    }
                                  }
                                }
                                var15 = 1024;
                                if (var16 == 0) {
                                  break L38;
                                } else {
                                  break L39;
                                }
                              }
                            }
                            var18.field_f = 2;
                            break L38;
                          }
                          var18.field_c = var19.e(true).a(100, param0 + 3440);
                          var18.field_a = (oo) (this);
                          var18.field_e = dfa.a(var15 + tfa.field_d[var18.field_f], 2048, -78);
                          var18.field_d = -var4 + var5;
                          var18.field_b = var7 - var3;
                          var7 = var7 + dba.field_a;
                          var8++;
                          if (var16 == 0) {
                            continue L27;
                          } else {
                            break L29;
                          }
                        }
                      }
                    }
                    stackOut_61_0 = var5 + dba.field_a;
                    stackIn_62_0 = stackOut_61_0;
                    break L28;
                  }
                  var5 = stackIn_62_0;
                  var6++;
                  if (var16 == 0) {
                    continue L26;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param2 != 0) {
          field_m = (String) null;
          return param1 / (1 << param0) * param3;
        } else {
          return param1 / (1 << param0) * param3;
        }
    }

    oo(int param0) {
        super(param0);
        this.field_u = 20;
    }

    final int k(byte param0) {
        if (param0 != -99) {
            return -7;
        }
        return 2;
    }

    final void b(int param0, uw param1) {
        try {
            if (!(this.field_r != null)) {
                this.k(-3440);
            }
            if (!(null != this.field_s)) {
                this.i(-20687);
            }
            super.b(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "oo.WA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, uw param2) {
        int discarded$2 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 50) {
                break L1;
              } else {
                discarded$2 = this.k((byte) -70);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (this.field_r == null) {
                    break L4;
                  } else {
                    var4_int = 0;
                    L5: while (true) {
                      if (this.field_o <= var4_int) {
                        break L4;
                      } else {
                        stackOut_6_0 = 0;
                        stackIn_17_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var6 != 0) {
                          break L3;
                        } else {
                          var5 = stackIn_7_0;
                          L6: while (true) {
                            L7: {
                              L8: {
                                if (this.field_q <= var5) {
                                  break L8;
                                } else {
                                  param2.a((byte) -100, param1, this.field_r[var4_int][var5]);
                                  var5++;
                                  if (var6 != 0) {
                                    break L7;
                                  } else {
                                    if (var6 == 0) {
                                      continue L6;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                              var4_int++;
                              break L7;
                            }
                            if (var6 == 0) {
                              continue L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                if (null != this.field_s) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L3;
                } else {
                  break L2;
                }
              }
              var4_int = stackIn_17_0;
              L9: while (true) {
                if (var4_int >= this.field_s.length) {
                  break L2;
                } else {
                  param2.a((byte) -88, 2, this.field_s[var4_int]);
                  var4_int++;
                  if (var6 == 0) {
                    continue L9;
                  } else {
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var4);
            stackOut_24_1 = new StringBuilder().append("oo.V(").append(param0).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
    }

    public static void j(int param0) {
        field_n = null;
        field_m = null;
        int var1 = 93 / ((-49 - param0) / 61);
        field_t = null;
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        try {
            int var6_int = 23 % ((param4 - -38) / 47);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "oo.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        lca var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        super.h(106);
        if (this.field_r != null) {
          if (param0 >= 0) {
            var2 = 0;
            L0: while (true) {
              if (this.field_o > var2) {
                if (var6 == 0) {
                  var3 = 0;
                  L1: while (true) {
                    L2: {
                      if (this.field_q <= var3) {
                        var2++;
                        break L2;
                      } else {
                        var4 = this.field_r[var2][var3];
                        var5 = tfa.field_d[var4.field_f];
                        var4.field_e = dfa.a(var5 + -var4.field_e, 2048, -102);
                        var4.field_b = -var4.field_b;
                        var3++;
                        if (var6 != 0) {
                          break L2;
                        } else {
                          continue L1;
                        }
                      }
                    }
                    continue L0;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = 8 + param3 + 8 + (param2 - -487);
              v.field_i.a(var6_int + -6, -6 + era.field_e.field_t, -23776, 3, 3);
              var7 = -5 + v.field_i.field_t;
              if (param1 == -104) {
                break L1;
              } else {
                discarded$1 = oo.a(-101, -90, 0, -88);
                break L1;
              }
            }
            L2: {
              sua.field_K.a(2 + (485 + param2 - -param3), param5, param1 + -23672, var7 + -param5, 5);
              pq.field_g.a(-param2 + sua.field_K.field_G - mka.field_b.field_G, param5, -23776, 0, param2);
              var7 = var7 - (2 + param5);
              mka.field_b.a(mka.field_b.field_G, param5, -23776, 0, param2 - -pq.field_g.field_G);
              ne.field_d.a(param3 + (2 + param2) + 485, 2, (byte) 127, 5, param3, -5 + var7, 5);
              if (apa.field_c == null) {
                break L2;
              } else {
                apa.field_c.a((byte) -31, ne.field_d.field_G, ne.field_d.field_t, ne.field_d.field_qb, ne.field_d.field_T);
                break L2;
              }
            }
            var8 = era.field_e.field_G - (param2 + var6_int);
            var9 = var8 / 2;
            var10 = var9 + (param0 - -param2);
            var11 = 0;
            var12 = 0;
            L3: while (true) {
              L4: {
                if (var12 >= 6) {
                  break L4;
                } else {
                  if (var14 == 0) {
                    L5: {
                      L6: {
                        if (var12 >= 5) {
                          break L6;
                        } else {
                          if (null == wba.field_p[var12]) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var13 = 3 + var11 * (era.field_e.field_t + -6 - -2) / (gka.field_g - -1);
                      var11++;
                      var7 = -2 + (3 + var11 * (era.field_e.field_t + -6 - -2) / (1 + gka.field_g)) - var13;
                      if (var12 >= 5) {
                        ara.field_ub.a(var8, var7, -23776, var13, var6_int);
                        break L5;
                      } else {
                        wba.field_p[var12].a(var8, var7, -23776, var13, var6_int);
                        bt.field_c[var12].a(var9 + -param2, var7, -23776, 0, param2);
                        oka.field_y[var12].a(param0, -param4 + (var7 + -param4), -23776, param4, var9);
                        kva.field_p[var12].a(-var10 + (var8 + -param2), -param4 + (var7 - param4), -23776, param4, var10);
                        if (var14 == 0) {
                          break L5;
                        } else {
                          ara.field_ub.a(var8, var7, -23776, var13, var6_int);
                          break L5;
                        }
                      }
                    }
                    var12++;
                    if (var14 == 0) {
                      continue L3;
                    } else {
                      break L4;
                    }
                  } else {
                    return;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var6), "oo.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    oo(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        this.field_u = 20;
    }

    private final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (this.field_p != null) {
          this.field_s = new bt[this.field_p.c(3)];
          if (param0 == -20687) {
            var2 = 0;
            L0: while (true) {
              if (var2 < this.field_s.length) {
                this.field_s[var2] = new bt();
                this.field_s[var2].field_a = (oo) (this);
                this.field_s[var2].field_e = this.field_p.b(45, var2);
                var2++;
                if (var3 == 0) {
                  continue L0;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          this.field_s = new bt[]{};
          return;
        }
    }

    final void d(int param0) {
        fla discarded$3 = null;
        fla discarded$4 = null;
        fla discarded$5 = null;
        w var2 = null;
        fsa var3 = null;
        int var3_int = 0;
        hca var4 = null;
        ac var5 = null;
        int var6 = 0;
        w var7 = null;
        fsa var8 = null;
        hca var9 = null;
        fsa var10 = null;
        hca var11 = null;
        fsa var12 = null;
        hca var13 = null;
        fsa var14 = null;
        hca var15 = null;
        Object var16 = null;
        fsa var16_ref = null;
        hca var17 = null;
        Object var18 = null;
        fsa var18_ref = null;
        hca var19 = null;
        var16 = null;
        var18 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        super.d(param0 ^ 0);
        if (this.field_s != null) {
          var7 = (w) ((Object) this.a(47).field_G);
          var2 = var7;
          if (var2 == null) {
            return;
          } else {
            L0: {
              if (0 < this.field_u) {
                break L0;
              } else {
                this.field_u = uca.field_c.a(100, 0) + 50;
                var3_int = uca.field_c.a(this.field_s.length, param0 ^ -1);
                if (this.field_s[var3_int].field_e.a(0)) {
                  discarded$3 = var7.a(new fm(24, this.field_s[var3_int].b((byte) -123), this.field_s[var3_int].c((byte) 94), this.field_s[var3_int].e((byte) -112)), param0 + -57);
                  if (var6 == 0) {
                    var14 = (fsa) ((Object) this.field_h);
                    var3 = var14;
                    if (var14 == null) {
                      return;
                    } else {
                      var15 = var14.H(3);
                      var4 = var15;
                      if (param0 == -1) {
                        if (var15 != null) {
                          L1: {
                            if (var14.a((byte) 110, var15.e(param0 ^ -9649), var15.d(3), var15.a((byte) 55), var15.c(-30))) {
                              var5 = var15.n((byte) -98);
                              if (var5 == null) {
                                return;
                              } else {
                                ((hf) ((Object) var5)).field_k = 1;
                                break L1;
                              }
                            } else {
                              break L1;
                            }
                          }
                          return;
                        } else {
                          return;
                        }
                      } else {
                        this.field_q = -26;
                        if (var15 != null) {
                          L2: {
                            if (var14.a((byte) 110, var15.e(param0 ^ -9649), var15.d(3), var15.a((byte) 55), var15.c(-30))) {
                              var5 = var15.n((byte) -98);
                              if (var5 == null) {
                                return;
                              } else {
                                ((hf) ((Object) var5)).field_k = 1;
                                break L2;
                              }
                            } else {
                              break L2;
                            }
                          }
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    this.field_u = this.field_u - 1;
                    var12 = (fsa) ((Object) this.field_h);
                    var3 = var12;
                    if (var12 == null) {
                      return;
                    } else {
                      L3: {
                        var13 = var12.H(3);
                        var4 = var13;
                        if (param0 == -1) {
                          break L3;
                        } else {
                          this.field_q = -26;
                          break L3;
                        }
                      }
                      if (var13 != null) {
                        L4: {
                          if (var12.a((byte) 110, var13.e(param0 ^ -9649), var13.d(3), var13.a((byte) 55), var13.c(-30))) {
                            var5 = var13.n((byte) -98);
                            if (var5 == null) {
                              return;
                            } else {
                              ((hf) ((Object) var5)).field_k = 1;
                              break L4;
                            }
                          } else {
                            break L4;
                          }
                        }
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  discarded$4 = var7.a(new fm(23, this.field_s[var3_int].b((byte) -83), this.field_s[var3_int].c((byte) 122), this.field_s[var3_int].e((byte) -107)), param0 + -57);
                  if (var6 == 0) {
                    if (var6 == 0) {
                      var18_ref = (fsa) ((Object) this.field_h);
                      if (var18_ref == null) {
                        return;
                      } else {
                        var19 = var18_ref.H(3);
                        if (param0 == -1) {
                          if (var19 != null) {
                            L5: {
                              if (var18_ref.a((byte) 110, var19.e(param0 ^ -9649), var19.d(3), var19.a((byte) 55), var19.c(-30))) {
                                var5 = var19.n((byte) -98);
                                if (var5 == null) {
                                  return;
                                } else {
                                  ((hf) ((Object) var5)).field_k = 1;
                                  break L5;
                                }
                              } else {
                                break L5;
                              }
                            }
                            return;
                          } else {
                            return;
                          }
                        } else {
                          this.field_q = -26;
                          if (var19 != null) {
                            L6: {
                              if (var18_ref.a((byte) 110, var19.e(param0 ^ -9649), var19.d(3), var19.a((byte) 55), var19.c(-30))) {
                                var5 = var19.n((byte) -98);
                                if (var5 == null) {
                                  return;
                                } else {
                                  ((hf) ((Object) var5)).field_k = 1;
                                  break L6;
                                }
                              } else {
                                break L6;
                              }
                            }
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    } else {
                      break L0;
                    }
                  } else {
                    discarded$5 = var7.a(new fm(24, this.field_s[var3_int].b((byte) -123), this.field_s[var3_int].c((byte) 94), this.field_s[var3_int].e((byte) -112)), param0 + -57);
                    if (var6 != 0) {
                      this.field_u = this.field_u - 1;
                      var10 = (fsa) ((Object) this.field_h);
                      var3 = var10;
                      if (var10 == null) {
                        return;
                      } else {
                        var11 = var10.H(3);
                        var4 = var11;
                        if (param0 != -1) {
                          this.field_q = -26;
                          if (var11 != null) {
                            L7: {
                              if (var10.a((byte) 110, var11.e(param0 ^ -9649), var11.d(3), var11.a((byte) 55), var11.c(-30))) {
                                var5 = var11.n((byte) -98);
                                if (var5 == null) {
                                  return;
                                } else {
                                  ((hf) ((Object) var5)).field_k = 1;
                                  break L7;
                                }
                              } else {
                                break L7;
                              }
                            }
                            return;
                          } else {
                            return;
                          }
                        } else {
                          if (var11 != null) {
                            L8: {
                              if (var10.a((byte) 110, var11.e(param0 ^ -9649), var11.d(3), var11.a((byte) 55), var11.c(-30))) {
                                var5 = var11.n((byte) -98);
                                if (var5 == null) {
                                  return;
                                } else {
                                  ((hf) ((Object) var5)).field_k = 1;
                                  break L8;
                                }
                              } else {
                                break L8;
                              }
                            }
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    } else {
                      var8 = (fsa) ((Object) this.field_h);
                      var3 = var8;
                      if (var8 == null) {
                        return;
                      } else {
                        L9: {
                          var9 = var8.H(3);
                          var4 = var9;
                          if (param0 == -1) {
                            break L9;
                          } else {
                            this.field_q = -26;
                            break L9;
                          }
                        }
                        if (var9 != null) {
                          L10: {
                            if (var8.a((byte) 110, var9.e(param0 ^ -9649), var9.d(3), var9.a((byte) 55), var9.c(-30))) {
                              var5 = var9.n((byte) -98);
                              if (var5 == null) {
                                return;
                              } else {
                                ((hf) ((Object) var5)).field_k = 1;
                                break L10;
                              }
                            } else {
                              break L10;
                            }
                          }
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
            this.field_u = this.field_u - 1;
            var16_ref = (fsa) ((Object) this.field_h);
            var3 = var16_ref;
            if (var16_ref == null) {
              return;
            } else {
              var17 = var16_ref.H(3);
              var4 = var17;
              if (param0 == -1) {
                if (var17 != null) {
                  L11: {
                    if (var16_ref.a((byte) 110, var17.e(param0 ^ -9649), var17.d(3), var17.a((byte) 55), var17.c(-30))) {
                      var5 = var17.n((byte) -98);
                      if (var5 == null) {
                        return;
                      } else {
                        ((hf) ((Object) var5)).field_k = 1;
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                this.field_q = -26;
                if (var17 != null) {
                  L12: {
                    if (var16_ref.a((byte) 110, var17.e(param0 ^ -9649), var17.d(3), var17.a((byte) 55), var17.c(-30))) {
                      var5 = var17.n((byte) -98);
                      if (var5 == null) {
                        return;
                      } else {
                        ((hf) ((Object) var5)).field_k = 1;
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final ka a(boolean param0, lca param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        uw var4 = null;
        ka stackIn_10_0 = null;
        ka stackIn_14_0 = null;
        ka stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ka stackOut_13_0 = null;
        ka stackOut_15_0 = null;
        ka stackOut_9_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var4 = (uw) null;
                this.a((byte) -92, -110, (uw) null);
                break L1;
              }
            }
            L2: {
              var3_int = param1.field_f;
              if (var3_int == 0) {
                break L2;
              } else {
                if (1 == var3_int) {
                  if ((param1.field_c ^ -1) > -51) {
                    stackOut_13_0 = df.field_J[42];
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return df.field_J[43];
                  }
                } else {
                  if (-3 != (var3_int ^ -1)) {
                    break L2;
                  } else {
                    if (!TombRacer.field_G) {
                      stackOut_15_0 = df.field_J[44];
                      stackIn_16_0 = stackOut_15_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            if ((param1.field_c ^ -1) > -51) {
              stackOut_9_0 = df.field_J[40];
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              return df.field_J[41];
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3);
            stackOut_17_1 = new StringBuilder().append("oo.B(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    final int f(byte param0) {
        int var2 = 94 / ((param0 - 15) / 45);
        return -1;
    }

    final void a(uw param0, int param1) {
        super.a(param0, 118);
        if (param1 <= 82) {
            return;
        }
        try {
            this.field_r = (lca[][]) null;
            this.field_s = null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "oo.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2);
              if (!(param0 instanceof sea)) {
                break L1;
              } else {
                this.field_p = (sea) ((Object) param0);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("oo.E(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    static {
        field_m = "Status";
    }
}
