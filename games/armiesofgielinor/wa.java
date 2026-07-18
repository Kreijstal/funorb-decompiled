/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends ik {
    static String field_h;
    static String field_e;
    int field_f;
    int field_g;

    private final void a(int param0, ha param1) {
        jd var4 = null;
        try {
            var4 = param1.c(((wa) this).field_f, true, ((wa) this).field_g);
            jd var3 = var4;
            var4.field_P = uc.field_d[((wa) this).field_c][5];
            var4.field_o = uc.field_d[((wa) this).field_c][6];
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "wa.S(" + 0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, vh param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param1.b(true, ((wa) this).field_c);
              param1.b(1, ((wa) this).field_g);
              param1.b(1, ((wa) this).field_f);
              if (param0 == -11637) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("wa.E(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    private final void d(byte param0, ha param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        jd var5 = null;
        jd var6 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = param1.c(((wa) this).field_f, true, ((wa) this).field_g);
              var6 = var5;
              if (-8 == uc.field_d[((wa) this).field_c][6]) {
                var5.field_I = true;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (uc.field_d[((wa) this).field_c][6] != 16) {
                break L2;
              } else {
                if (-1 < var6.field_cb) {
                  var6.field_cb = var6.field_cb - 1;
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (34 != var6.field_N) {
                        break L4;
                      } else {
                        if (var6.field_W) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var6.field_s = false;
                    break L3;
                  }
                  if (74 != var6.field_N) {
                    var6.field_B = 1;
                    break L2;
                  } else {
                    var6.field_B = 2;
                    break L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("wa.R(").append(-106).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    private final void a(boolean param0, ha param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = uc.field_d[((wa) this).field_c][5];
              if (var3_int != 0) {
                if (var3_int != 64) {
                  this.b(true, param1);
                  break L1;
                } else {
                  this.c((byte) 78, param1);
                  break L1;
                }
              } else {
                this.d((byte) -106, param1);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("wa.M(").append(true).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    private final void b(int param0, ha param1) {
        jd var4 = null;
        try {
            var4 = param1.c(((wa) this).field_f, true, ((wa) this).field_g);
            jd var3 = var4;
            var4.field_r = uc.field_d[((wa) this).field_c][6] | uc.field_d[((wa) this).field_c][5] << 5;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "wa.I(" + 95 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(byte param0, ha param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        jd var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = uc.field_d[((wa) this).field_c][7];
            var4 = ((wa) this).field_g + -var3_int;
            L1: while (true) {
              if (var4 > var3_int + ((wa) this).field_g) {
                break L0;
              } else {
                var5 = -var3_int + ((wa) this).field_f;
                L2: while (true) {
                  if (((wa) this).field_f + var3_int < var5) {
                    var4++;
                    continue L1;
                  } else {
                    L3: {
                      var6 = param1.c(var5, true, var4);
                      if (var6 != null) {
                        var7 = 0;
                        L4: while (true) {
                          if (uc.field_d[((wa) this).field_c][6] <= var7) {
                            var7 = 0;
                            L5: while (true) {
                              if (uc.field_d[((wa) this).field_c][6] >= var7) {
                                break L3;
                              } else {
                                param1.field_l.a(750, (tc) (Object) new st(var6, 4));
                                var7--;
                                continue L5;
                              }
                            }
                          } else {
                            param1.field_l.a(750, (tc) (Object) new st(var6, 6));
                            var7++;
                            continue L4;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("wa.N(").append(78).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    private final void b(boolean param0, ha param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        jd var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = uc.field_d[((wa) this).field_c][7];
            var4 = ((wa) this).field_g - var3_int;
            L1: while (true) {
              if (var3_int + ((wa) this).field_g < var4) {
                break L0;
              } else {
                var5 = ((wa) this).field_f + -var3_int;
                L2: while (true) {
                  if (var3_int + ((wa) this).field_f < var5) {
                    var4++;
                    continue L1;
                  } else {
                    L3: {
                      var6 = param1.c(var5, true, var4);
                      if (var6 == null) {
                        break L3;
                      } else {
                        if (uc.field_d[((wa) this).field_c][6] > 0) {
                          param1.field_l.a(750, (tc) (Object) new nw(var6, param1.a(var6, (byte) -128, uc.field_d[((wa) this).field_c][5], uc.field_d[((wa) this).field_c][6]), false));
                          break L3;
                        } else {
                          var7 = 0;
                          L4: while (true) {
                            if (var7 <= uc.field_d[((wa) this).field_c][6]) {
                              break L3;
                            } else {
                              param1.field_l.a(750, (tc) (Object) new st(var6, 1));
                              var7--;
                              continue L4;
                            }
                          }
                        }
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("wa.O(").append(true).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    final static void a(int param0, ok param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            bd.a((byte) 111, new fj(param1));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("wa.T(").append(52).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
    }

    private final void a(byte param0, int param1, ha param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ne var7_ref_ne = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (uc.field_d[((wa) this).field_c][5] == 5) {
                var4_int = uc.field_d[((wa) this).field_c][7];
                var5 = ((wa) this).field_g - var4_int;
                L2: while (true) {
                  if (var4_int + ((wa) this).field_g < var5) {
                    break L1;
                  } else {
                    L3: {
                      if (var5 >= 0) {
                        if (param2.field_v > var5) {
                          var6 = -var4_int + ((wa) this).field_f;
                          L4: while (true) {
                            if (var6 > ((wa) this).field_f + var4_int) {
                              break L3;
                            } else {
                              L5: {
                                if (var6 >= 0) {
                                  if (var6 >= param2.field_db) {
                                    break L3;
                                  } else {
                                    var7_ref_ne = param2.field_Eb[var5 + param2.field_v * var6];
                                    var7_ref_ne.b(true, param2.o(param1, -1));
                                    break L5;
                                  }
                                } else {
                                  break L5;
                                }
                              }
                              var6++;
                              continue L4;
                            }
                          }
                        } else {
                          break L1;
                        }
                      } else {
                        break L3;
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L6: {
              if (uc.field_d[((wa) this).field_c][5] == 6) {
                var4_int = uc.field_d[((wa) this).field_c][7];
                var5 = ((wa) this).field_g - var4_int;
                L7: while (true) {
                  if (((wa) this).field_g - -var4_int < var5) {
                    break L6;
                  } else {
                    L8: {
                      if (0 <= var5) {
                        if (param2.field_v > var5) {
                          var6 = ((wa) this).field_f - var4_int;
                          L9: while (true) {
                            if (((wa) this).field_f + var4_int < var6) {
                              break L8;
                            } else {
                              L10: {
                                if (var6 >= 0) {
                                  if (param2.field_db > var6) {
                                    param2.a((byte) 86, param1, var6, var5);
                                    break L10;
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  break L10;
                                }
                              }
                              var6++;
                              continue L9;
                            }
                          }
                        } else {
                          break L6;
                        }
                      } else {
                        break L8;
                      }
                    }
                    var5++;
                    continue L7;
                  }
                }
              } else {
                if (uc.field_d[((wa) this).field_c][5] == 3) {
                  var4_int = uc.field_d[((wa) this).field_c][7];
                  var5 = -var4_int + ((wa) this).field_g;
                  L11: while (true) {
                    if (var4_int + ((wa) this).field_g < var5) {
                      break L6;
                    } else {
                      var6 = ((wa) this).field_f + -var4_int;
                      L12: while (true) {
                        if (var4_int + ((wa) this).field_f < var6) {
                          var5++;
                          continue L11;
                        } else {
                          param2.b(var5, true, uc.field_d[((wa) this).field_c][6], param1, var6);
                          var6++;
                          continue L12;
                        }
                      }
                    }
                  }
                } else {
                  break L6;
                }
              }
            }
            L13: {
              if (uc.field_d[((wa) this).field_c][5] != 4) {
                break L13;
              } else {
                L14: {
                  var4_int = param2.a(((wa) this).field_f, 2056, ((wa) this).field_g);
                  var5 = param2.g(((wa) this).field_f, -85, ((wa) this).field_g);
                  var6 = ((wa) this).field_g;
                  var7 = ((wa) this).field_f;
                  var8 = 0;
                  var9 = 0;
                  var10 = var4_int;
                  if (1 != var10) {
                    if (2 == var10) {
                      var8 = 0;
                      var9 = 1;
                      break L14;
                    } else {
                      if (var10 == 3) {
                        var9 = 0;
                        var8 = -1;
                        break L14;
                      } else {
                        if (var10 == 0) {
                          var9 = 0;
                          var8 = 1;
                          break L14;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    var9 = -1;
                    var8 = 0;
                    break L14;
                  }
                }
                L15: while (true) {
                  if (param2.g(var7, -85, var6) != var5) {
                    param2.b(var6, true, 1, param1, var7);
                    param2.b(((wa) this).field_g + -var8, true, 1, param1, ((wa) this).field_f - var9);
                    break L13;
                  } else {
                    param2.b(var6, true, 10, param1, var7);
                    var7 = var7 + var9;
                    var6 = var6 + var8;
                    continue L15;
                  }
                }
              }
            }
            L16: {
              if (uc.field_d[((wa) this).field_c][5] != 7) {
                break L16;
              } else {
                param2.field_Eb[((wa) this).field_f * param2.field_v + ((wa) this).field_g].field_a = -1;
                param2.f(-2);
                param2.b(2);
                break L16;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var4 = decompiledCaughtException;
            stackOut_60_0 = (RuntimeException) var4;
            stackOut_60_1 = new StringBuilder().append("wa.J(").append(-100).append(',').append(param1).append(',');
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param2 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L17;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L17;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ')');
        }
    }

    final static int a(bv param0, int param1, int param2) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                break L1;
              } else {
                var4 = null;
                int discarded$2 = wa.a((bv) null, 11, -12);
                break L1;
              }
            }
            stackOut_2_0 = (param0.g(param2 + -102, param1) ^ 1 << param1 - 1) + -(1 << param1 - 1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("wa.L(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, ha param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        jd var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (uc.field_d[((wa) this).field_c][3] != 0) {
                break L1;
              } else {
                var4_ref = param1.c(((wa) this).field_f, true, ((wa) this).field_g);
                if (var4_ref == null) {
                  break L1;
                } else {
                  var4_ref.field_D = true;
                  break L1;
                }
              }
            }
            var4_int = uc.field_d[((wa) this).field_c][4];
            if (param2 == 26123) {
              L2: {
                var5 = var4_int;
                if (var5 != 4) {
                  if (var5 != 6) {
                    if (var5 != 0) {
                      if (var5 != 1) {
                        if (var5 == 3) {
                          this.b((byte) 51, param1);
                          break L2;
                        } else {
                          if (var5 != 2) {
                            break L2;
                          } else {
                            int discarded$1 = 1;
                            this.a(param1);
                            break L2;
                          }
                        }
                      } else {
                        this.b(95, param1);
                        break L2;
                      }
                    } else {
                      this.a(0, param1);
                      break L2;
                    }
                  } else {
                    this.a((byte) -100, param0, param1);
                    break L2;
                  }
                } else {
                  this.a(true, param1);
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var4;
            stackOut_24_1 = new StringBuilder().append("wa.A(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L3;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param2 + ')');
        }
    }

    final int a(int param0) {
        if (param0 != 25365) {
            return -57;
        }
        return 4;
    }

    final static void a(int param0, int param1, aj param2) {
        try {
            oj.field_r.a((byte) -119, (tc) (Object) param2);
            wr.a((byte) -57, param2, 3);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "wa.U(" + 3 + ',' + 1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(byte param0, ha param1) {
        jd var3 = null;
        RuntimeException var3_ref = null;
        jd var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var4 = param1.c(((wa) this).field_f, true, ((wa) this).field_g);
              var3 = var4;
              if (var3 != null) {
                var4.field_ab = uc.field_d[((wa) this).field_c][5];
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("wa.K(").append(51).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final void a(byte param0, ha param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -37) {
                break L1;
              } else {
                ((wa) this).field_g = 12;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("wa.D(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    private final void a(ha param0) {
        RuntimeException var3 = null;
        jd var4 = null;
        jd var5 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var4 = param0.c(((wa) this).field_f, true, ((wa) this).field_g);
                  var5 = var4;
                  if (115 != ((wa) this).field_c) {
                    break L3;
                  } else {
                    if (var5.field_N == 63) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (119 != ((wa) this).field_c) {
                    break L4;
                  } else {
                    if (43 == var5.field_N) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (((wa) this).field_c != 118) {
                    break L5;
                  } else {
                    if (var5.field_N == 59) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (((wa) this).field_c != 116) {
                    break L6;
                  } else {
                    if (var5.field_N == 58) {
                      break L2;
                    } else {
                      break L6;
                    }
                  }
                }
                if (((wa) this).field_c != 117) {
                  break L1;
                } else {
                  if (var5.field_N == 53) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              var5.field_F = true;
              param0.a(((wa) this).field_f, ((wa) this).field_g, 0, 3);
              break L1;
            }
            L7: {
              if (((wa) this).field_c == 120) {
                var4.field_C = true;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (19 != uc.field_d[((wa) this).field_c][5]) {
                break L8;
              } else {
                var5.field_bb = true;
                break L8;
              }
            }
            L9: {
              L10: {
                if (uc.field_d[((wa) this).field_c][5] != 21) {
                  break L10;
                } else {
                  var4.field_cb = var4.field_cb + uc.field_d[((wa) this).field_c][6];
                  var5.field_s = true;
                  var5.field_B = 0;
                  if (var5.field_cb > 100) {
                    var5.field_cb = 100;
                    break L10;
                  } else {
                    break L9;
                  }
                }
              }
              break L9;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("wa.P(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L11;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L11;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + true + ')');
        }
    }

    public static void c() {
        field_h = null;
        field_e = null;
    }

    wa(int param0, int param1, int param2) {
        super(param0);
        ((wa) this).field_f = param2;
        ((wa) this).field_g = param1;
    }

    final void a(ha param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -1700635440) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("wa.G(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "(<%0> players want to join)";
    }
}
