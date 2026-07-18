/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends br {
    private int field_o;
    private rl field_i;
    static ip field_n;
    private int field_k;
    static boolean field_f;
    private int field_j;
    private int field_h;
    private int field_l;
    private int field_p;
    private int field_g;
    private int field_m;

    final static String a(String param0, int param1, String param2, String param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_21_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param0.length();
              var5 = param2.length();
              var6 = param3.length();
              if (param1 > 53) {
                break L1;
              } else {
                sa.a((md) null, (int[]) null, false, (int[]) null, (byte) -11, true, true);
                break L1;
              }
            }
            if (0 != var5) {
              L2: {
                var7 = var4_int;
                var8 = -var5 + var6;
                if (var8 != 0) {
                  var9_int = 0;
                  L3: while (true) {
                    var9_int = param0.indexOf(param2, var9_int);
                    if (0 > var9_int) {
                      break L2;
                    } else {
                      var9_int = var9_int + var5;
                      var7 = var7 + var8;
                      if (var12 == 0) {
                        continue L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              var9 = new StringBuilder(var7);
              var10 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    L7: {
                      var11 = param0.indexOf(param2, var10);
                      if (var11 >= 0) {
                        break L7;
                      } else {
                        if (var12 != 0) {
                          break L6;
                        } else {
                          if (var12 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    StringBuilder discarded$3 = var9.append(param0.substring(var10, var11));
                    StringBuilder discarded$4 = var9.append(param3);
                    var10 = var5 + var11;
                    break L6;
                  }
                  if (var12 == 0) {
                    continue L4;
                  } else {
                    break L5;
                  }
                }
                StringBuilder discarded$5 = var9.append(param0.substring(var10));
                stackOut_21_0 = var9.toString();
                stackIn_22_0 = stackOut_21_0;
                break L0;
              }
            } else {
              throw new IllegalArgumentException("Key cannot have zero length");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var4;
            stackOut_23_1 = new StringBuilder().append("sa.G(");
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L8;
            }
          }
          L9: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L9;
            }
          }
          L10: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param3 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L10;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L10;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ')');
        }
        return stackIn_22_0;
    }

    final boolean b(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                boolean discarded$2 = ((sa) this).a(-16, -55, 69);
                break L1;
              }
            }
            L2: {
              L3: {
                if (((sa) this).field_h < ((sa) this).field_l) {
                  break L3;
                } else {
                  if (((sa) this).field_k != 0) {
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "sa.A(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final void d(int param0) {
        ((sa) this).field_k = 0;
        if (param0 >= -89) {
            return;
        }
        try {
            ((sa) this).field_h = ((sa) this).field_l;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "sa.B(" + param0 + ')');
        }
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        br var2_ref = null;
        int var2_int = 0;
        lm var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_8_0 = false;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_7_0 = false;
        int stackOut_16_0 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (((sa) this).b(true)) {
              return;
            } else {
              L1: {
                L2: {
                  int fieldTemp$1 = ((sa) this).field_m;
                  ((sa) this).field_m = ((sa) this).field_m + 1;
                  if (fieldTemp$1 <= 10) {
                    break L2;
                  } else {
                    ((sa) this).field_m = 0;
                    var2_ref = ((sa) this).field_i.field_u.c(87);
                    L3: while (true) {
                      if (!(var2_ref instanceof ek)) {
                        break L2;
                      } else {
                        stackOut_7_0 = var2_ref instanceof lm;
                        stackIn_17_0 = stackOut_7_0 ? 1 : 0;
                        stackIn_8_0 = stackOut_7_0;
                        if (var6 != 0) {
                          break L1;
                        } else {
                          L4: {
                            if (stackIn_8_0) {
                              var3 = (lm) (Object) var2_ref;
                              var4 = var3.e((byte) -112) + -((sa) this).field_p;
                              var5 = var3.g(1829947600) + -((sa) this).field_o;
                              if (var4 * var4 - -(var5 * var5) >= 66564) {
                                break L4;
                              } else {
                                var3.a(-12, (sa) this);
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          }
                          var2_ref = var2_ref.field_d;
                          if (var6 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                ((sa) this).field_g = ((sa) this).field_g + 7;
                stackOut_16_0 = ~((sa) this).field_l;
                stackIn_17_0 = stackOut_16_0;
                break L1;
              }
              L5: {
                L6: {
                  if (stackIn_17_0 < ~((sa) this).field_h) {
                    break L6;
                  } else {
                    ((sa) this).field_k = ((sa) this).field_k - ((sa) this).field_j;
                    if (var6 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (((sa) this).field_k >= 256) {
                    break L7;
                  } else {
                    ((sa) this).field_k = ((sa) this).field_k + ((sa) this).field_j;
                    break L7;
                  }
                }
                ((sa) this).field_h = ((sa) this).field_h + 1;
                break L5;
              }
              L8: {
                if (((sa) this).field_g <= 256) {
                  break L8;
                } else {
                  ((sa) this).field_g = 0;
                  break L8;
                }
              }
              L9: {
                var2_int = -106 % ((param0 - 35) / 42);
                if (((sa) this).field_k <= 256) {
                  break L9;
                } else {
                  ((sa) this).field_k = 256;
                  break L9;
                }
              }
              L10: {
                if (((sa) this).field_k < 0) {
                  ((sa) this).field_k = 0;
                  break L10;
                } else {
                  break L10;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "sa.C(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 >= -53) {
            return;
        }
        try {
            field_n = null;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "sa.H(" + param0 + ')');
        }
    }

    final static void a(md param0, int[] param1, boolean param2, int[] param3, byte param4, boolean param5, boolean param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        var30 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = 2147483647;
              var8 = -2147483648;
              var21 = param1[3] >> 2;
              var22 = param1[4] >> 2;
              var23 = param1[5] >> 2;
              var24 = param1[6] >> 2;
              var25 = param1[7] >> 2;
              var26 = param1[8] >> 2;
              var27 = param1[9] >> 2;
              var28 = param1[10] >> 2;
              var13 = var24 * param3[3] + param3[4] * var25 + param3[5] * var26 >> 14;
              var29 = param1[11] >> 2;
              var12 = var21 * param3[3] - (-(param3[4] * var22) - var23 * param3[5]) >> 14;
              var15 = param3[7] * var22 + (param3[6] * var21 - -(param3[8] * var23)) >> 14;
              var20 = var28 * param3[10] + param3[9] * var27 + var29 * param3[11] >> 14;
              var16 = var26 * param3[8] + (param3[6] * var24 - -(param3[7] * var25)) >> 14;
              var19 = var26 * param3[11] + param3[9] * var24 - -(param3[10] * var25) >> 14;
              var14 = var27 * param3[3] + (var28 * param3[4] + var29 * param3[5]) >> 14;
              var17 = param3[7] * var28 + (var27 * param3[6] - -(param3[8] * var29)) >> 14;
              var18 = var22 * param3[10] + (param3[9] * var21 - -(param3[11] * var23)) >> 14;
              var21 = -param1[0] + param3[0];
              var22 = -param1[1] + param3[1];
              var23 = -param1[2] + param3[2];
              var9 = var23 * param1[5] + (var21 * param1[3] - -(var22 * param1[4])) >> 16 + -eq.field_g;
              var10 = param1[8] * var23 + param1[7] * var22 + var21 * param1[6] >> 16 + -eq.field_g;
              var11 = param1[11] * var23 + var22 * param1[10] + var21 * param1[9] >> 16;
              var21 = ep.field_d;
              var22 = ep.field_c;
              if (param4 == -121) {
                break L1;
              } else {
                field_n = null;
                break L1;
              }
            }
            var23 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (param0.field_n <= var23) {
                      break L5;
                    } else {
                      var24 = param0.field_k[var23];
                      var25 = param0.field_E[var23];
                      var26 = param0.field_v[var23];
                      var27 = (var15 * var25 + (var24 * var12 + var18 * var26) >> -eq.field_g + 16) + var9;
                      var28 = (var19 * var26 + (var25 * var16 + var24 * var13) >> -eq.field_g + 16) + var10;
                      var29 = var11 + (var20 * var26 + (var17 * var25 + var14 * var24) >> 16);
                      stackOut_6_0 = -51;
                      stackOut_6_1 = ~var29;
                      stackIn_60_0 = stackOut_6_0;
                      stackIn_60_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var30 != 0) {
                        L6: while (true) {
                          if (stackIn_60_0 >= stackIn_60_1) {
                            break L4;
                          } else {
                            if (eb.field_J.length <= var18) {
                              break L4;
                            } else {
                              var19 = param0.field_A[var18];
                              var20 = param0.field_p[var18];
                              var21 = param0.field_b[var18];
                              eb.field_J[var18] = var20 * var12 + (var19 * var9 - -(var21 * var15)) >> 16;
                              bq.field_g[var18] = var21 * var16 + var20 * var13 + var10 * var19 >> 16;
                              wp.field_i[var18] = var19 * var11 + var20 * var14 + var21 * var17 >> 16;
                              var18++;
                              if (var30 == 0) {
                                stackOut_59_0 = ~param0.field_o;
                                stackOut_59_1 = ~var18;
                                stackIn_60_0 = stackOut_59_0;
                                stackIn_60_1 = stackOut_59_1;
                                continue L6;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      } else {
                        L7: {
                          L8: {
                            if (stackIn_7_0 >= stackIn_7_1) {
                              break L8;
                            } else {
                              hl.field_f[var23] = -2147483648;
                              if (var30 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            lo.field_j[var23] = var21 + var27 / var29;
                            jk.field_k[var23] = var28 / var29 + var22;
                            if (~var8 <= ~var29) {
                              break L9;
                            } else {
                              var8 = var29;
                              break L9;
                            }
                          }
                          L10: {
                            if (var7_int <= var29) {
                              break L10;
                            } else {
                              var7_int = var29;
                              break L10;
                            }
                          }
                          hl.field_f[var23] = var29;
                          break L7;
                        }
                        L11: {
                          if (!param5) {
                            break L11;
                          } else {
                            vi.field_b[var23] = var27 >> eq.field_g;
                            ok.field_r[var23] = var28 >> eq.field_g;
                            hp.field_s[var23] = var29;
                            break L11;
                          }
                        }
                        var23++;
                        if (var30 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  L12: {
                    if (param0.field_t == null) {
                      break L12;
                    } else {
                      if (param0.field_w == null) {
                        break L12;
                      } else {
                        if (param0.field_I == null) {
                          break L12;
                        } else {
                          if (null == param0.field_e) {
                            break L12;
                          } else {
                            if (param0.field_h == null) {
                              break L12;
                            } else {
                              if (param0.field_q == null) {
                                break L12;
                              } else {
                                if (null == param0.field_f) {
                                  break L12;
                                } else {
                                  if (null == param0.field_O) {
                                    break L12;
                                  } else {
                                    if (param0.field_i != null) {
                                      var23 = 0;
                                      L13: while (true) {
                                        if (param0.field_B <= var23) {
                                          break L12;
                                        } else {
                                          var24 = param0.field_t[var23];
                                          var25 = param0.field_w[var23];
                                          var26 = param0.field_I[var23];
                                          nm.field_m[var23] = var9 + (var25 * var15 + var24 * var12 + var18 * var26 >> 16);
                                          nh.field_i[var23] = var10 - -(var13 * var24 + var25 * var16 - -(var26 * var19) >> 16);
                                          cj.field_F[var23] = (var20 * var26 + (var17 * var25 + var24 * var14) >> 16) + var11;
                                          var24 = param0.field_e[var23];
                                          var25 = param0.field_h[var23];
                                          var26 = param0.field_q[var23];
                                          fk.field_m[var23] = var9 - -(var12 * var24 + var15 * var25 - -(var26 * var18) >> 16);
                                          bh.field_c[var23] = var10 - -(var24 * var13 + (var25 * var16 + var26 * var19) >> 16);
                                          de.field_c[var23] = var11 - -(var20 * var26 + (var17 * var25 + var14 * var24) >> 16);
                                          var24 = param0.field_f[var23];
                                          var25 = param0.field_O[var23];
                                          var26 = param0.field_i[var23];
                                          fl.field_c[var23] = (var24 * var12 + var15 * var25 + var18 * var26 >> 16) + var9;
                                          qe.field_o[var23] = (var19 * var26 + (var25 * var16 + var13 * var24) >> 16) + var10;
                                          ll.field_f[var23] = (var14 * var24 + var17 * var25 + var26 * var20 >> 16) + var11;
                                          var23++;
                                          if (var30 != 0) {
                                            break L3;
                                          } else {
                                            if (var30 == 0) {
                                              continue L13;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  if (!param2) {
                    break L4;
                  } else {
                    var9 = param3[3];
                    var10 = param3[4];
                    var11 = param3[5];
                    var12 = param3[6];
                    var13 = param3[7];
                    var14 = param3[8];
                    var15 = param3[9];
                    var16 = param3[10];
                    var17 = param3[11];
                    var18 = 0;
                    L14: while (true) {
                      stackOut_59_0 = ~param0.field_o;
                      stackOut_59_1 = ~var18;
                      stackIn_60_0 = stackOut_59_0;
                      stackIn_60_1 = stackOut_59_1;
                      if (stackIn_60_0 >= stackIn_60_1) {
                        break L4;
                      } else {
                        if (eb.field_J.length <= var18) {
                          break L4;
                        } else {
                          var19 = param0.field_A[var18];
                          var20 = param0.field_p[var18];
                          var21 = param0.field_b[var18];
                          eb.field_J[var18] = var20 * var12 + (var19 * var9 - -(var21 * var15)) >> 16;
                          bq.field_g[var18] = var21 * var16 + var20 * var13 + var10 * var19 >> 16;
                          wp.field_i[var18] = var19 * var11 + var20 * var14 + var21 * var17 >> 16;
                          var18++;
                          if (var30 == 0) {
                            continue L14;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                ho.a(param0, var8, var7_int, param6, 16634);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var7;
            stackOut_67_1 = new StringBuilder().append("sa.F(");
            stackIn_70_0 = stackOut_67_0;
            stackIn_70_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param0 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L15;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_71_0 = stackOut_68_0;
              stackIn_71_1 = stackOut_68_1;
              stackIn_71_2 = stackOut_68_2;
              break L15;
            }
          }
          L16: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
            stackIn_74_0 = stackOut_71_0;
            stackIn_74_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param1 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L16;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_75_0 = stackOut_72_0;
              stackIn_75_1 = stackOut_72_1;
              stackIn_75_2 = stackOut_72_2;
              break L16;
            }
          }
          L17: {
            stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
            stackOut_75_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',').append(param2).append(',');
            stackIn_78_0 = stackOut_75_0;
            stackIn_78_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param3 == null) {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L17;
            } else {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "{...}";
              stackIn_79_0 = stackOut_76_0;
              stackIn_79_1 = stackOut_76_1;
              stackIn_79_2 = stackOut_76_2;
              break L17;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_79_0, stackIn_79_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 121) {
                break L1;
              } else {
                ((sa) this).field_h = 67;
                break L1;
              }
            }
            ((sa) this).field_o = param2;
            ((sa) this).field_p = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var4, "sa.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    sa(ge param0, int param1, int param2, int param3) {
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
        ((sa) this).field_m = 0;
        try {
          L0: {
            ((sa) this).field_i = param0.field_A;
            ((sa) this).field_k = 0;
            ((sa) this).field_l = param3;
            ((sa) this).field_p = param1;
            ((sa) this).field_j = 3;
            ((sa) this).field_o = param2;
            ((sa) this).field_g = 0;
            ((sa) this).field_h = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("sa.<init>(");
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
          throw fa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == 17310) {
                break L1;
              } else {
                ((sa) this).c(-105);
                break L1;
              }
            }
            L2: {
              var4_int = -((sa) this).field_p + param0;
              var5 = -((sa) this).field_o + param2;
              if (var4_int * var4_int + var5 * var5 >= 66564) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var4, "sa.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = false;
        field_n = new ip();
    }
}
