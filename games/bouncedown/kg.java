/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    private int field_h;
    static String field_j;
    static int field_f;
    private int field_a;
    private boolean field_c;
    static gk field_b;
    tg field_o;
    static String field_d;
    tg[] field_n;
    static boolean field_i;
    static rb field_k;
    static int[] field_g;
    private int field_l;
    private int field_m;
    private int field_e;

    final kg a(byte param0, int param1) {
        ((kg) this).field_a = param1;
        if (param0 <= 6) {
            ((kg) this).field_m = -22;
        }
        return (kg) this;
    }

    final kg a(boolean param0, byte param1) {
        int var3 = -74 / ((param1 - 63) / 40);
        ((kg) this).field_c = param0 ? true : false;
        return (kg) this;
    }

    final kg a(int param0, byte param1) {
        if (param1 > -47) {
            return null;
        }
        ((kg) this).field_h = param0;
        return (kg) this;
    }

    final void a(kg param0, byte param1) {
        try {
            param0.field_o = ((kg) this).field_o;
            param0.field_h = ((kg) this).field_h;
            param0.field_l = ((kg) this).field_l;
            if (param1 != 55) {
                field_k = null;
            }
            param0.field_n = ((kg) this).field_n;
            param0.field_c = ((kg) this).field_c;
            param0.field_a = ((kg) this).field_a;
            param0.field_m = ((kg) this).field_m;
            param0.field_e = ((kg) this).field_e;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "kg.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(int param0) {
        ((kg) this).field_e = 256;
        ((kg) this).field_o = null;
        ((kg) this).field_a = 0;
        if (param0 != -29776) {
            field_b = null;
        }
        ((kg) this).field_n = null;
        ((kg) this).field_h = -1;
        ((kg) this).field_m = 0;
        ((kg) this).field_l = 0;
    }

    final static tg[] a(int param0, int param1, int param2, int param3, int param4) {
        tg[] var6 = new tg[9];
        tg[] var5 = var6;
        tg dupTemp$0 = hc.a(1, param2, (byte) -126);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        tg dupTemp$1 = hc.a(1, param0, (byte) -123);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param4 != 0) {
            var6[4] = hc.a(64, param4, (byte) -127);
        }
        return var5;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8) {
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
        Object var20 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        var19 = Bounce.field_N;
        try {
          L0: {
            L1: {
              if (param3 < 0) {
                break L1;
              } else {
                if (~param2 <= ~qk.field_g) {
                  break L1;
                } else {
                  L2: {
                    if (param8 >= 0) {
                      break L2;
                    } else {
                      if (0 <= param0) {
                        break L2;
                      } else {
                        if (param4 < 0) {
                          return;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param8 < qk.field_a) {
                      break L3;
                    } else {
                      if (~param0 > ~qk.field_a) {
                        break L3;
                      } else {
                        if (param4 >= qk.field_a) {
                          return;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    var14 = param3 + -param2;
                    if (~param1 == ~param2) {
                      L5: {
                        if (~param3 != ~param2) {
                          var15 = param3 - param1;
                          if (param8 >= param0) {
                            var10 = param8 << 16;
                            var9_int = param0 << 16;
                            var11 = (-param0 + param4 << 16) / var15;
                            var12 = (-param8 + param4 << 16) / var14;
                            break L5;
                          } else {
                            var11 = (param4 + -param8 << 16) / var14;
                            var10 = param0 << 16;
                            var12 = (-param0 + param4 << 16) / var15;
                            var9_int = param8 << 16;
                            break L5;
                          }
                        } else {
                          var9_int = param8 << 16;
                          var10 = param0 << 16;
                          var11 = 0;
                          var12 = 0;
                          break L5;
                        }
                      }
                      L6: {
                        if (0 > param2) {
                          param2 = Math.min(-param2, -param2 + param1);
                          var10 = var10 + param2 * var12;
                          var9_int = var9_int + var11 * param2;
                          param2 = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var13 = 0;
                      break L4;
                    } else {
                      L7: {
                        var10 = param8 << 16;
                        var9_int = param8 << 16;
                        var15 = -param2 + param1;
                        var11 = (param0 + -param8 << 16) / var15;
                        var12 = (param4 + -param8 << 16) / var14;
                        if (var12 <= var11) {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          break L7;
                        } else {
                          var13 = 0;
                          break L7;
                        }
                      }
                      L8: {
                        L9: {
                          if (param2 < 0) {
                            if (param1 >= 0) {
                              param2 = -param2;
                              var10 = var10 + var12 * param2;
                              var9_int = var9_int + param2 * var11;
                              param2 = 0;
                              break L9;
                            } else {
                              param2 = param1 - param2;
                              var9_int = var9_int + param2 * var11;
                              var10 = var10 + var12 * param2;
                              param2 = param1;
                              break L8;
                            }
                          } else {
                            break L9;
                          }
                        }
                        var16 = qk.field_b[param2];
                        L10: while (true) {
                          if (param1 <= param2) {
                            break L8;
                          } else {
                            L11: {
                              var17 = var9_int >> 16;
                              if (qk.field_a > var17) {
                                var18 = (var10 >> 16) + -(var9_int >> 16);
                                if (var18 != 0) {
                                  L12: {
                                    if (qk.field_a <= var17 - -var18) {
                                      var18 = -1 + (qk.field_a + -var17);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  if (var17 >= 0) {
                                    la.a(param6, 2, var18, var17 + var16, param5);
                                    break L11;
                                  } else {
                                    la.a(param6, 2, var17 + var18, var16, param5);
                                    break L11;
                                  }
                                } else {
                                  if (var17 < 0) {
                                    break L11;
                                  } else {
                                    if (~qk.field_a >= ~var17) {
                                      break L11;
                                    } else {
                                      la.a(param6, 2, var18, var16 + var17, param5);
                                      break L11;
                                    }
                                  }
                                }
                              } else {
                                break L11;
                              }
                            }
                            param2++;
                            if (~param2 <= ~qk.field_g) {
                              return;
                            } else {
                              var10 = var10 + var12;
                              var16 = var16 + na.field_e;
                              var9_int = var9_int + var11;
                              continue L10;
                            }
                          }
                        }
                      }
                      var16 = param3 - param1;
                      if (0 != var16) {
                        L13: {
                          if (var13 != 0) {
                            var10 = param0 << 16;
                            break L13;
                          } else {
                            var9_int = param0 << 16;
                            break L13;
                          }
                        }
                        var17 = param4 << 16;
                        var11 = (-var9_int + var17) / var16;
                        var12 = (-var10 + var17) / var16;
                        break L4;
                      } else {
                        var12 = 0;
                        var11 = 0;
                        break L4;
                      }
                    }
                  }
                  L14: {
                    if (param7 >= 74) {
                      break L14;
                    } else {
                      var20 = null;
                      qh discarded$1 = kg.a(-100, (String) null);
                      break L14;
                    }
                  }
                  L15: {
                    if (param2 < 0) {
                      param2 = -param2;
                      var10 = var10 + var12 * param2;
                      var9_int = var9_int + var11 * param2;
                      param2 = 0;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  var15 = qk.field_b[param2];
                  L16: while (true) {
                    if (param3 <= param2) {
                      break L0;
                    } else {
                      L17: {
                        var16 = var9_int >> 16;
                        if (qk.field_a > var16) {
                          var17 = (var10 >> 16) - (var9_int >> 16);
                          if (var17 == 0) {
                            if (var16 < 0) {
                              break L17;
                            } else {
                              if (~qk.field_a >= ~var16) {
                                break L17;
                              } else {
                                la.a(param6, 2, var17, var16 - -var15, param5);
                                break L17;
                              }
                            }
                          } else {
                            L18: {
                              if (~qk.field_a >= ~(var17 + var16)) {
                                var17 = -1 + qk.field_a + -var16;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            if (var16 < 0) {
                              la.a(param6, 2, var17 + var16, var15, param5);
                              break L17;
                            } else {
                              la.a(param6, 2, var17, var15 + var16, param5);
                              break L17;
                            }
                          }
                        } else {
                          break L17;
                        }
                      }
                      param2++;
                      if (param2 < qk.field_g) {
                        var9_int = var9_int + var11;
                        var15 = var15 + na.field_e;
                        var10 = var10 + var12;
                        continue L16;
                      } else {
                        return;
                      }
                    }
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
            stackOut_80_0 = (RuntimeException) var9;
            stackOut_80_1 = new StringBuilder().append("kg.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_82_0 = stackOut_80_0;
            stackIn_82_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param5 == null) {
              stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
              stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L19;
            } else {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "{...}";
              stackIn_83_0 = stackOut_81_0;
              stackIn_83_1 = stackOut_81_1;
              stackIn_83_2 = stackOut_81_2;
              break L19;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_83_0, stackIn_83_2 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    final static qh a(int param0, String param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        qh stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        qh stackOut_2_0 = null;
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
              if (param0 == 2) {
                break L1;
              } else {
                var3 = null;
                kg.a(-22, -118, -32, 113, 57, (int[]) null, 57, 112, 26);
                break L1;
              }
            }
            stackOut_2_0 = new qh(param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("kg.G(").append(param0).append(44);
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
          throw ii.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final void a(int param0, qi param1, lk param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        String var7 = null;
        int var7_int = 0;
        int var8 = 0;
        tj stackIn_16_0 = null;
        String stackIn_16_1 = null;
        tj stackIn_17_0 = null;
        String stackIn_17_1 = null;
        tj stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        tj stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        tj stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        tj stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        tj stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        int stackIn_22_5 = 0;
        int stackIn_22_6 = 0;
        int stackIn_22_7 = 0;
        tj stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        int stackIn_23_6 = 0;
        int stackIn_23_7 = 0;
        tj stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        int stackIn_24_7 = 0;
        int stackIn_24_8 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        tj stackOut_15_0 = null;
        String stackOut_15_1 = null;
        tj stackOut_17_0 = null;
        String stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        tj stackOut_16_0 = null;
        String stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        tj stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        tj stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        tj stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        tj stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        int stackOut_21_5 = 0;
        int stackOut_21_6 = 0;
        int stackOut_21_7 = 0;
        tj stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        int stackOut_23_7 = 0;
        int stackOut_23_8 = 0;
        tj stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        int stackOut_22_6 = 0;
        int stackOut_22_7 = 0;
        int stackOut_22_8 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              ve.a(param2.field_m, param2.field_i + param0, ((kg) this).field_n, (byte) -128, param2.field_k, param3 + param2.field_r);
              var6_int = -105 / ((74 - param4) / 44);
              if (((kg) this).field_o == null) {
                break L1;
              } else {
                L2: {
                  var7_int = ((kg) this).field_a + param2.field_r + param3;
                  var8 = ((kg) this).field_m + (param0 + param2.field_i);
                  if (param1.field_d != 1) {
                    break L2;
                  } else {
                    var7_int = var7_int + (param2.field_k - ((kg) this).field_o.field_t) / 2;
                    break L2;
                  }
                }
                L3: {
                  if (1 == param1.field_p) {
                    var8 = var8 + (param2.field_m - ((kg) this).field_o.field_o) / 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param1.field_d == 2) {
                    var7_int = var7_int + (-((kg) this).field_o.field_t + param2.field_k);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (2 != param1.field_p) {
                    break L5;
                  } else {
                    var8 = var8 + (param2.field_m + -((kg) this).field_o.field_o);
                    break L5;
                  }
                }
                ((kg) this).field_o.a(var7_int, var8);
                break L1;
              }
            }
            L6: {
              var7 = param1.a(true, param2);
              if (var7 == null) {
                break L6;
              } else {
                if (param1.field_b == null) {
                  break L6;
                } else {
                  if (((kg) this).field_l < 0) {
                    break L6;
                  } else {
                    L7: {
                      stackOut_15_0 = param1.field_b;
                      stackOut_15_1 = (String) var7;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      if (((kg) this).field_a != -2147483648) {
                        stackOut_17_0 = (tj) (Object) stackIn_17_0;
                        stackOut_17_1 = (String) (Object) stackIn_17_1;
                        stackOut_17_2 = ((kg) this).field_a;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        break L7;
                      } else {
                        stackOut_16_0 = (tj) (Object) stackIn_16_0;
                        stackOut_16_1 = (String) (Object) stackIn_16_1;
                        stackOut_16_2 = 0;
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_18_2 = stackOut_16_2;
                        break L7;
                      }
                    }
                    L8: {
                      stackOut_18_0 = (tj) (Object) stackIn_18_0;
                      stackOut_18_1 = (String) (Object) stackIn_18_1;
                      stackOut_18_2 = stackIn_18_2 + (param1.field_m + (param3 - -param2.field_r));
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_20_2 = stackOut_18_2;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      stackIn_19_2 = stackOut_18_2;
                      if (-2147483648 != ((kg) this).field_m) {
                        stackOut_20_0 = (tj) (Object) stackIn_20_0;
                        stackOut_20_1 = (String) (Object) stackIn_20_1;
                        stackOut_20_2 = stackIn_20_2;
                        stackOut_20_3 = ((kg) this).field_m;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        stackIn_21_2 = stackOut_20_2;
                        stackIn_21_3 = stackOut_20_3;
                        break L8;
                      } else {
                        stackOut_19_0 = (tj) (Object) stackIn_19_0;
                        stackOut_19_1 = (String) (Object) stackIn_19_1;
                        stackOut_19_2 = stackIn_19_2;
                        stackOut_19_3 = 0;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_21_2 = stackOut_19_2;
                        stackIn_21_3 = stackOut_19_3;
                        break L8;
                      }
                    }
                    L9: {
                      stackOut_21_0 = (tj) (Object) stackIn_21_0;
                      stackOut_21_1 = (String) (Object) stackIn_21_1;
                      stackOut_21_2 = stackIn_21_2;
                      stackOut_21_3 = stackIn_21_3 + (param0 - -param2.field_i - -param1.field_o);
                      stackOut_21_4 = -param1.field_k + -param1.field_m + param2.field_k;
                      stackOut_21_5 = -param1.field_n + -param1.field_o + param2.field_m;
                      stackOut_21_6 = ((kg) this).field_l;
                      stackOut_21_7 = ((kg) this).field_h;
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      stackIn_23_2 = stackOut_21_2;
                      stackIn_23_3 = stackOut_21_3;
                      stackIn_23_4 = stackOut_21_4;
                      stackIn_23_5 = stackOut_21_5;
                      stackIn_23_6 = stackOut_21_6;
                      stackIn_23_7 = stackOut_21_7;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      stackIn_22_2 = stackOut_21_2;
                      stackIn_22_3 = stackOut_21_3;
                      stackIn_22_4 = stackOut_21_4;
                      stackIn_22_5 = stackOut_21_5;
                      stackIn_22_6 = stackOut_21_6;
                      stackIn_22_7 = stackOut_21_7;
                      if (((kg) this).field_e != -2147483648) {
                        stackOut_23_0 = (tj) (Object) stackIn_23_0;
                        stackOut_23_1 = (String) (Object) stackIn_23_1;
                        stackOut_23_2 = stackIn_23_2;
                        stackOut_23_3 = stackIn_23_3;
                        stackOut_23_4 = stackIn_23_4;
                        stackOut_23_5 = stackIn_23_5;
                        stackOut_23_6 = stackIn_23_6;
                        stackOut_23_7 = stackIn_23_7;
                        stackOut_23_8 = ((kg) this).field_e;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        stackIn_24_3 = stackOut_23_3;
                        stackIn_24_4 = stackOut_23_4;
                        stackIn_24_5 = stackOut_23_5;
                        stackIn_24_6 = stackOut_23_6;
                        stackIn_24_7 = stackOut_23_7;
                        stackIn_24_8 = stackOut_23_8;
                        break L9;
                      } else {
                        stackOut_22_0 = (tj) (Object) stackIn_22_0;
                        stackOut_22_1 = (String) (Object) stackIn_22_1;
                        stackOut_22_2 = stackIn_22_2;
                        stackOut_22_3 = stackIn_22_3;
                        stackOut_22_4 = stackIn_22_4;
                        stackOut_22_5 = stackIn_22_5;
                        stackOut_22_6 = stackIn_22_6;
                        stackOut_22_7 = stackIn_22_7;
                        stackOut_22_8 = 256;
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        stackIn_24_2 = stackOut_22_2;
                        stackIn_24_3 = stackOut_22_3;
                        stackIn_24_4 = stackOut_22_4;
                        stackIn_24_5 = stackOut_22_5;
                        stackIn_24_6 = stackOut_22_6;
                        stackIn_24_7 = stackOut_22_7;
                        stackIn_24_8 = stackOut_22_8;
                        break L9;
                      }
                    }
                    int discarded$1 = ((tj) (Object) stackIn_24_0).a(stackIn_24_1, stackIn_24_2, stackIn_24_3, stackIn_24_4, stackIn_24_5, stackIn_24_6, stackIn_24_7, stackIn_24_8, param1.field_d, param1.field_p, param1.field_f);
                    break L6;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var6;
            stackOut_26_1 = new StringBuilder().append("kg.J(").append(param0).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L10;
            }
          }
          L11: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L11;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final kg a(tg[] param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            ((kg) this).field_n = param0;
            if (param1 == -1) {
              stackOut_3_0 = this;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (kg) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("kg.K(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return (kg) this;
    }

    final kg b(int param0, byte param1) {
        if (param1 >= -30) {
            return null;
        }
        ((kg) this).field_m = param0;
        return (kg) this;
    }

    final kg a(int param0, int param1) {
        if (param1 != -2) {
            kg discarded$0 = ((kg) this).a(true, (byte) -16);
        }
        ((kg) this).field_l = param0;
        return (kg) this;
    }

    public static void a() {
        field_k = null;
        field_j = null;
        field_g = null;
        field_d = null;
        field_b = null;
    }

    final void a(kg param0, int param1, int param2, qi param3, boolean param4, lk param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              if (((kg) this).field_c) {
                param0.a(param2, param3, param5, param1, -89);
                param0.a(-29776);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((kg) this).field_a == -2147483648) {
                break L2;
              } else {
                param0.field_a = ((kg) this).field_a;
                break L2;
              }
            }
            L3: {
              if (((kg) this).field_l >= -1) {
                param0.field_l = ((kg) this).field_l;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (null != ((kg) this).field_o) {
                param0.field_o = ((kg) this).field_o;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (((kg) this).field_m == -2147483648) {
                break L5;
              } else {
                param0.field_m = ((kg) this).field_m;
                break L5;
              }
            }
            L6: {
              if (null == ((kg) this).field_n) {
                break L6;
              } else {
                param0.field_n = ((kg) this).field_n;
                break L6;
              }
            }
            L7: {
              if (((kg) this).field_h >= -1) {
                param0.field_h = ((kg) this).field_h;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (((kg) this).field_e == -2147483648) {
                break L8;
              } else {
                param0.field_e = ((kg) this).field_e;
                break L8;
              }
            }
            L9: {
              if (!param4) {
                break L9;
              } else {
                kg discarded$1 = ((kg) this).a(-108, 126);
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var7;
            stackOut_23_1 = new StringBuilder().append("kg.E(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L10;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L10;
            }
          }
          L11: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
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
          L12: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44).append(param4).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param5 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L12;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L12;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 41);
        }
    }

    kg() {
        ((kg) this).field_h = -2;
        ((kg) this).field_a = -2147483648;
        ((kg) this).field_o = null;
        ((kg) this).field_c = false;
        ((kg) this).field_m = -2147483648;
        ((kg) this).field_n = null;
        ((kg) this).field_e = -2147483648;
        ((kg) this).field_l = -2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = null;
        field_f = 0;
        field_d = "Create a free account to start using this feature";
        field_i = true;
        field_g = new int[8192];
    }
}
