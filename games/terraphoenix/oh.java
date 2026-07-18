/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    boolean field_a;
    int field_c;
    static int field_e;
    int field_d;
    static im field_b;
    static int field_f;
    int field_g;

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -66) {
                break L1;
              } else {
                field_f = -86;
                break L1;
              }
            }
            L2: {
              L3: {
                param1 = je.a(80, "", param1, '_');
                var3 = wa.a((byte) -117, param1);
                if (param2.indexOf(param1) != -1) {
                  break L3;
                } else {
                  if (param2.indexOf(var3) == -1) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_7_0 = 1;
              stackIn_10_0 = stackOut_7_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("oh.E(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((oh) this).a(true) <= 0) {
                break L1;
              } else {
                ((oh) this).field_c = ((oh) this).a(true);
                break L1;
              }
            }
            L2: {
              if (((oh) this).a(true) != 0) {
                break L2;
              } else {
                ((oh) this).field_c = 1000;
                break L2;
              }
            }
            L3: {
              if (param0 == 0) {
                break L3;
              } else {
                ((oh) this).field_d = -80;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "oh.D(" + param0 + ')');
        }
    }

    final oh a(rk param0, rk param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_42_0 = null;
        Object stackIn_55_0 = null;
        Object stackIn_68_0 = null;
        Object stackIn_71_0 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        Object stackOut_28_0 = null;
        Object stackOut_41_0 = null;
        Object stackOut_54_0 = null;
        Object stackOut_67_0 = null;
        Object stackOut_70_0 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param2 == 8) {
                break L1;
              } else {
                oh discarded$1 = ((oh) this).a((rk) null, (rk) null, -102);
                break L1;
              }
            }
            L2: {
              if (!((oh) this).field_a) {
                break L2;
              } else {
                L3: {
                  var4_int = 8;
                  if (~((oh) this).field_g != ~var4_int) {
                    break L3;
                  } else {
                    L4: {
                      if (param0.field_a[var4_int] <= 0) {
                        break L4;
                      } else {
                        param0.field_a[var4_int] = param0.field_a[var4_int] - 1;
                        if (var5 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (param1.field_a[var4_int] > 0) {
                      param1.field_a[var4_int] = param1.field_a[var4_int] - 1;
                      break L3;
                    } else {
                      stackOut_15_0 = null;
                      stackIn_16_0 = stackOut_15_0;
                      return (oh) (Object) stackIn_16_0;
                    }
                  }
                }
                L5: {
                  var4_int = 9;
                  if (var4_int == ((oh) this).field_g) {
                    if (0 < param0.field_a[var4_int]) {
                      param0.field_a[var4_int] = param0.field_a[var4_int] - 1;
                      break L5;
                    } else {
                      L6: {
                        if (param1.field_a[var4_int] <= 0) {
                          break L6;
                        } else {
                          param1.field_a[var4_int] = param1.field_a[var4_int] - 1;
                          if (var5 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      stackOut_28_0 = null;
                      stackIn_29_0 = stackOut_28_0;
                      return (oh) (Object) stackIn_29_0;
                    }
                  } else {
                    break L5;
                  }
                }
                L7: {
                  var4_int = 12;
                  if (((oh) this).field_g != var4_int) {
                    break L7;
                  } else {
                    L8: {
                      if (param0.field_a[var4_int] <= 0) {
                        break L8;
                      } else {
                        param0.field_a[var4_int] = param0.field_a[var4_int] - 1;
                        if (var5 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (param1.field_a[var4_int] > 0) {
                      param1.field_a[var4_int] = param1.field_a[var4_int] - 1;
                      break L7;
                    } else {
                      stackOut_41_0 = null;
                      stackIn_42_0 = stackOut_41_0;
                      return (oh) (Object) stackIn_42_0;
                    }
                  }
                }
                L9: {
                  var4_int = 13;
                  if (~((oh) this).field_g != ~var4_int) {
                    break L9;
                  } else {
                    if (param0.field_a[var4_int] > 0) {
                      param0.field_a[var4_int] = param0.field_a[var4_int] - 1;
                      break L9;
                    } else {
                      L10: {
                        if (param1.field_a[var4_int] <= 0) {
                          break L10;
                        } else {
                          param1.field_a[var4_int] = param1.field_a[var4_int] - 1;
                          if (var5 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      stackOut_54_0 = null;
                      stackIn_55_0 = stackOut_54_0;
                      return (oh) (Object) stackIn_55_0;
                    }
                  }
                }
                var4_int = 14;
                if (~((oh) this).field_g != ~var4_int) {
                  break L2;
                } else {
                  L11: {
                    if (0 >= param0.field_a[var4_int]) {
                      break L11;
                    } else {
                      param0.field_a[var4_int] = param0.field_a[var4_int] - 1;
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L11;
                      }
                    }
                  }
                  if (param1.field_a[var4_int] > 0) {
                    param1.field_a[var4_int] = param1.field_a[var4_int] - 1;
                    break L2;
                  } else {
                    stackOut_67_0 = null;
                    stackIn_68_0 = stackOut_67_0;
                    return (oh) (Object) stackIn_68_0;
                  }
                }
              }
            }
            ((oh) this).field_a = false;
            stackOut_70_0 = this;
            stackIn_71_0 = stackOut_70_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_72_0 = (RuntimeException) var4;
            stackOut_72_1 = new StringBuilder().append("oh.B(");
            stackIn_75_0 = stackOut_72_0;
            stackIn_75_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param0 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L12;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_76_0 = stackOut_73_0;
              stackIn_76_1 = stackOut_73_1;
              stackIn_76_2 = stackOut_73_2;
              break L12;
            }
          }
          L13: {
            stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
            stackOut_76_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_76_2).append(',');
            stackIn_79_0 = stackOut_76_0;
            stackIn_79_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param1 == null) {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L13;
            } else {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "{...}";
              stackIn_80_0 = stackOut_77_0;
              stackIn_80_1 = stackOut_77_1;
              stackIn_80_2 = stackOut_77_2;
              break L13;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_80_0, stackIn_80_2 + ',' + param2 + ')');
        }
        return (oh) this;
    }

    final int a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0) {
              stackOut_3_0 = od.field_c[((oh) this).field_g].field_o;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -114;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "oh.A(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    public static void b(int param0) {
        if (param0 != 6) {
            return;
        }
        try {
            field_b = null;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "oh.F(" + param0 + ')');
        }
    }

    final static ci[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        ci[] var10 = null;
        ci[] var11_ref_ci__ = null;
        int var11 = 0;
        int var12 = 0;
        ci var13 = null;
        int var14 = 0;
        int var15 = 0;
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_53_0 = 0;
        ci[] stackIn_64_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_52_0 = 0;
        ci[] stackOut_63_0 = null;
        Object stackOut_2_0 = null;
        var15 = Terraphoenix.field_V;
        try {
          L0: {
            var9_int = param1 + (param6 - -param5);
            if (param2 == 1) {
              var10 = new ci[]{new ci(var9_int, var9_int), new ci(param3, var9_int), new ci(var9_int, var9_int), new ci(var9_int, param3), new ci(64, 64), new ci(var9_int, param3), new ci(var9_int, var9_int), new ci(param3, var9_int), new ci(var9_int, var9_int)};
              var11_ref_ci__ = var10;
              var12 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var12 >= var11_ref_ci__.length) {
                      break L3;
                    } else {
                      var13 = var11_ref_ci__[var12];
                      stackOut_6_0 = 0;
                      stackIn_16_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var15 != 0) {
                        break L2;
                      } else {
                        var14 = stackIn_7_0;
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (var13.field_z.length <= var14) {
                                break L6;
                              } else {
                                var13.field_z[var14] = param7;
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
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L2;
                }
                var11 = stackIn_16_0;
                L7: while (true) {
                  L8: {
                    L9: {
                      if (param6 <= var11) {
                        break L9;
                      } else {
                        stackOut_18_0 = 0;
                        stackIn_28_0 = stackOut_18_0;
                        stackIn_19_0 = stackOut_18_0;
                        if (var15 != 0) {
                          break L8;
                        } else {
                          var12 = stackIn_19_0;
                          L10: while (true) {
                            L11: {
                              L12: {
                                if (var9_int <= var12) {
                                  break L12;
                                } else {
                                  var10[6].field_z[(var9_int + -var11 + -1) * var9_int - -var12] = param4;
                                  var10[8].field_z[var12 + (-var11 + (var9_int - 1)) * var9_int] = param4;
                                  var10[2].field_z[var12 * var9_int + -1 + (var9_int + -var11)] = param4;
                                  var10[8].field_z[var12 * var9_int - (var11 + (1 + -var9_int))] = param4;
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
                    stackOut_27_0 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    break L8;
                  }
                  var11 = stackIn_28_0;
                  L13: while (true) {
                    stackOut_29_0 = param6;
                    stackOut_29_1 = var11;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    L14: while (true) {
                      L15: {
                        L16: {
                          if (stackIn_30_0 <= stackIn_30_1) {
                            break L16;
                          } else {
                            stackOut_31_0 = 0;
                            stackIn_41_0 = stackOut_31_0;
                            stackIn_32_0 = stackOut_31_0;
                            if (var15 != 0) {
                              break L15;
                            } else {
                              var12 = stackIn_32_0;
                              L17: while (true) {
                                L18: {
                                  if (~var12 <= ~var9_int) {
                                    break L18;
                                  } else {
                                    var10[0].field_z[var12 - -(var11 * var9_int)] = param0;
                                    var10[0].field_z[var12 * var9_int + var11] = param0;
                                    stackOut_34_0 = var12;
                                    stackOut_34_1 = -var11 + var9_int;
                                    stackIn_30_0 = stackOut_34_0;
                                    stackIn_30_1 = stackOut_34_1;
                                    stackIn_35_0 = stackOut_34_0;
                                    stackIn_35_1 = stackOut_34_1;
                                    if (var15 != 0) {
                                      continue L14;
                                    } else {
                                      L19: {
                                        if (stackIn_35_0 >= stackIn_35_1) {
                                          break L19;
                                        } else {
                                          var10[2].field_z[var9_int * var11 + var12] = param0;
                                          var10[6].field_z[var9_int * var12 - -var11] = param0;
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
                        stackOut_40_0 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        break L15;
                      }
                      var11 = stackIn_41_0;
                      L20: while (true) {
                        L21: {
                          L22: {
                            if (~param3 >= ~var11) {
                              break L22;
                            } else {
                              stackOut_43_0 = 0;
                              stackIn_53_0 = stackOut_43_0;
                              stackIn_44_0 = stackOut_43_0;
                              if (var15 != 0) {
                                break L21;
                              } else {
                                var12 = stackIn_44_0;
                                L23: while (true) {
                                  L24: {
                                    L25: {
                                      if (~var12 <= ~param6) {
                                        break L25;
                                      } else {
                                        var10[7].field_z[var11 + param3 * (var9_int + (-var12 - 1))] = param4;
                                        var10[5].field_z[var9_int * var11 - var12 - -var9_int - 1] = param4;
                                        var10[1].field_z[param3 * var12 + var11] = param0;
                                        var10[3].field_z[var12 + var11 * var9_int] = param0;
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
                          stackOut_52_0 = 0;
                          stackIn_53_0 = stackOut_52_0;
                          break L21;
                        }
                        var11 = stackIn_53_0;
                        L26: while (true) {
                          L27: {
                            if (~var11 <= ~(param3 >> -444692095)) {
                              break L27;
                            } else {
                              var12 = 0;
                              L28: while (true) {
                                L29: {
                                  L30: {
                                    if (param5 <= var12) {
                                      break L30;
                                    } else {
                                      var10[1].field_z[param3 * (-1 + (-var12 + var9_int)) - -var11] = param8;
                                      var10[3].field_z[-var12 + (-1 + (var9_int + var11 * var9_int))] = param8;
                                      var10[7].field_z[var12 * param3 + var11] = param8;
                                      var10[5].field_z[var12 + var11 * var9_int] = param8;
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
                          stackOut_63_0 = (ci[]) var10;
                          stackIn_64_0 = stackOut_63_0;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (ci[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var9, "oh.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_64_0;
    }

    oh(int param0) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((oh) this).field_d = 8;
              ((oh) this).field_g = param0;
              ((oh) this).field_c = od.field_c[param0].field_o;
              if (((oh) this).field_c == -1) {
                ((oh) this).field_c = 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((oh) this).field_a = false;
              if (0 != ((oh) this).field_c) {
                break L2;
              } else {
                ((oh) this).field_c = 1000;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qk.a((Throwable) (Object) runtimeException, "oh.<init>(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 500;
        field_b = new im();
        field_f = 0;
    }
}
