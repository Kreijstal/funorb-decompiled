/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc extends ca {
    static int field_j;
    byte[] field_h;
    static int field_g;
    static String field_f;
    static int field_i;

    final static fa[] a(int param0, se param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        fa[] var4 = null;
        int var5 = 0;
        fa var6 = null;
        int var6_int = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        fa[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        fa[] stackOut_10_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = param1.h(8, 8);
            if (var2_int <= 0) {
              var3 = param1.h(param0, 8);
              var4 = new fa[var3];
              var5 = 0;
              L1: while (true) {
                L2: {
                  if (~var5 <= ~var3) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        if (eg.a(param1, 26678)) {
                          break L4;
                        } else {
                          var6_int = param1.h(ge.a(false, var5 - 1), 8);
                          var4[var5] = var4[var6_int];
                          if (var7 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var6 = new fa();
                      int discarded$6 = param1.h(24, param0 + -4);
                      int discarded$7 = param1.h(24, 8);
                      var6.field_d = param1.h(24, 8);
                      int discarded$8 = param1.h(9, param0 + -4);
                      int discarded$9 = param1.h(12, 8);
                      int discarded$10 = param1.h(12, param0 + -4);
                      int discarded$11 = param1.h(12, 8);
                      var4[var5] = var6;
                      break L3;
                    }
                    var5++;
                    if (var7 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_10_0 = (fa[]) var4;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (fa[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("mc.E(").append(param0).append(44);
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L5;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_11_0;
    }

    final static void a(ki param0, int param1, ki param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            me.field_g = param0;
            if (param1 == -29608) {
              sf.field_q = param2;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("mc.D(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param1).append(44);
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    mc(byte[] param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((mc) this).field_h = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("mc.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw dd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    public static void c(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 12) {
                break L1;
              } else {
                String discarded$2 = mc.a((ki) null, (String) null, (String) null, 2, -19);
                break L1;
              }
            }
            field_f = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var1, "mc.C(" + param0 + 41);
        }
    }

    final static void a(int param0, int param1, wd param2, boolean param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
        boolean stackIn_13_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0 = false;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        byte stackOut_47_0 = 0;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        var19 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -2147483648) {
                break L1;
              } else {
                field_i = 85;
                break L1;
              }
            }
            L2: {
              var5_int = uh.a((byte) -70, 3 * (param4 - param0));
              var6 = param0 * 3;
              var7 = var5_int + -10;
              hi.a(false);
              if (param2.field_m <= 0) {
                break L2;
              } else {
                if (null == param2.field_t) {
                  break L2;
                } else {
                  ec.l(102);
                  break L2;
                }
              }
            }
            fg.field_u = 0;
            var8 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (~var8 <= ~param2.field_u) {
                    break L5;
                  } else {
                    var9 = param2.field_M[var8];
                    var10 = param2.field_e[var8];
                    var11 = param2.field_l[var8];
                    stackOut_12_0 = param3;
                    stackIn_48_0 = stackOut_12_0 ? 1 : 0;
                    stackIn_13_0 = stackOut_12_0;
                    if (var19 != 0) {
                      break L4;
                    } else {
                      L6: {
                        L7: {
                          if (stackIn_13_0) {
                            var12 = a.field_t[var9];
                            var13 = ph.field_x[var9];
                            var14 = -var12 + a.field_t[var10];
                            var15 = -var12 + a.field_t[var11];
                            var16 = ph.field_x[var10] + -var13;
                            var17 = ph.field_x[var11] - var13;
                            if (0 <= -(var16 * var15) + var17 * var14) {
                              break L6;
                            } else {
                              break L7;
                            }
                          } else {
                            break L7;
                          }
                        }
                        var12 = dg.field_B[var9];
                        if (-2147483648 == var12) {
                          break L6;
                        } else {
                          L8: {
                            var13 = dg.field_B[var10];
                            if (var13 != -2147483648) {
                              break L8;
                            } else {
                              if (var19 == 0) {
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var14 = dg.field_B[var11];
                          if (-2147483648 == var14) {
                            break L6;
                          } else {
                            L9: {
                              var15 = var14 + (var12 + (var13 + -var6));
                              stackOut_24_0 = vf.field_a.length;
                              stackOut_24_1 = 1;
                              stackIn_27_0 = stackOut_24_0;
                              stackIn_27_1 = stackOut_24_1;
                              stackIn_25_0 = stackOut_24_0;
                              stackIn_25_1 = stackOut_24_1;
                              if (var7 >= 0) {
                                stackOut_27_0 = stackIn_27_0;
                                stackOut_27_1 = stackIn_27_1;
                                stackOut_27_2 = var15 >> var7;
                                stackIn_28_0 = stackOut_27_0;
                                stackIn_28_1 = stackOut_27_1;
                                stackIn_28_2 = stackOut_27_2;
                                break L9;
                              } else {
                                stackOut_25_0 = stackIn_25_0;
                                stackOut_25_1 = stackIn_25_1;
                                stackOut_25_2 = var15 << -var7;
                                stackIn_28_0 = stackOut_25_0;
                                stackIn_28_1 = stackOut_25_1;
                                stackIn_28_2 = stackOut_25_2;
                                break L9;
                              }
                            }
                            var16 = stackIn_28_0 - (stackIn_28_1 - -stackIn_28_2);
                            var17 = vf.field_a[var16];
                            L10: while (true) {
                              L11: {
                                L12: {
                                  if (var17 >> 4 == 0) {
                                    break L12;
                                  } else {
                                    var16--;
                                    stackOut_30_0 = 0;
                                    stackOut_30_1 = var16;
                                    stackIn_38_0 = stackOut_30_0;
                                    stackIn_38_1 = stackOut_30_1;
                                    stackIn_31_0 = stackOut_30_0;
                                    stackIn_31_1 = stackOut_30_1;
                                    if (var19 != 0) {
                                      break L11;
                                    } else {
                                      L13: {
                                        if (stackIn_31_0 > stackIn_31_1) {
                                          System.err.println("Out of range!");
                                          if (var19 == 0) {
                                            break L6;
                                          } else {
                                            break L13;
                                          }
                                        } else {
                                          break L13;
                                        }
                                      }
                                      var17 = vf.field_a[var16];
                                      if (var19 == 0) {
                                        continue L10;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                                stackOut_37_0 = var17;
                                stackOut_37_1 = var16 << 4;
                                stackIn_38_0 = stackOut_37_0;
                                stackIn_38_1 = stackOut_37_1;
                                break L11;
                              }
                              L14: {
                                var18 = stackIn_38_0 + stackIn_38_1;
                                dm.field_g[var18] = var8;
                                vf.field_a[var16] = 1 + var17;
                                if (param2.field_m <= 0) {
                                  break L14;
                                } else {
                                  if (param2.field_t != null) {
                                    ji.field_a[param2.field_t[var8]] = ji.field_a[param2.field_t[var8]] + 1;
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              fg.field_u = fg.field_u + 1;
                              break L6;
                            }
                          }
                        }
                      }
                      var8++;
                      if (var19 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                stackOut_47_0 = param2.field_m;
                stackIn_48_0 = stackOut_47_0;
                break L4;
              }
              L15: {
                L16: {
                  if (stackIn_48_0 <= 0) {
                    break L16;
                  } else {
                    if (null != param2.field_t) {
                      var8 = 0;
                      var9 = 0;
                      L17: while (true) {
                        if (ji.field_a.length <= var9) {
                          break L16;
                        } else {
                          var10 = ji.field_a[var9];
                          ji.field_a[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          if (var19 != 0) {
                            break L15;
                          } else {
                            if (var19 == 0) {
                              continue L17;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                    } else {
                      break L16;
                    }
                  }
                }
                break L15;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var5 = decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var5;
            stackOut_61_1 = new StringBuilder().append("mc.B(").append(param0).append(44).append(param1).append(44);
            stackIn_64_0 = stackOut_61_0;
            stackIn_64_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param2 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L18;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_65_0 = stackOut_62_0;
              stackIn_65_1 = stackOut_62_1;
              stackIn_65_2 = stackOut_62_2;
              break L18;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_65_0, stackIn_65_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static String a(ki param0, String param1, String param2, int param3, int param4) {
        RuntimeException var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
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
              if (param4 < -56) {
                break L1;
              } else {
                String discarded$2 = mc.a((ki) null, (String) null, (String) null, -91, -6);
                break L1;
              }
            }
            if (param0.b(-1)) {
              stackOut_6_0 = param1 + " - " + param0.b((byte) -97, param3) + "%";
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = (String) param2;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("mc.A(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L4;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_7_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "If you do nothing the game will revert to normal view in <%0> second.";
        field_g = -1;
    }
}
