/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge implements Runnable {
    static String[][] field_b;
    volatile boolean field_g;
    static String field_a;
    static fc field_h;
    lk field_e;
    volatile boolean field_c;
    volatile ie[] field_f;
    static String[] field_d;

    public final void run() {
        Exception exception = null;
        int var1_int = 0;
        ie var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = EscapeVector.field_A;
        ((ge) this).field_g = true;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  if (((ge) this).field_c) {
                    break L3;
                  } else {
                    if (var4 != 0) {
                      break L2;
                    } else {
                      var1_int = 0;
                      L4: while (true) {
                        L5: {
                          if (var1_int >= 2) {
                            en.a((byte) -95, 10L);
                            af.a((byte) -61, ((ge) this).field_e, (Object) null);
                            break L5;
                          } else {
                            var2 = ((ge) this).field_f[var1_int];
                            if (var4 != 0) {
                              break L5;
                            } else {
                              L6: {
                                if (var2 == null) {
                                  break L6;
                                } else {
                                  var2.d();
                                  break L6;
                                }
                              }
                              var1_int++;
                              continue L4;
                            }
                          }
                        }
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                ((ge) this).field_g = false;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            exception = (Exception) (Object) decompiledCaughtException;
            pf.a(false, (String) null, (Throwable) (Object) exception);
            ((ge) this).field_g = false;
            break L7;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          ((ge) this).field_g = false;
          throw ge.<RuntimeException>$cfr$sneakyThrow(var3);
        }
    }

    final static ed[] a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int param8) {
        int var9 = 0;
        ed[] var10 = null;
        ed[] var11_ref_ed__ = null;
        int var11 = 0;
        int var12 = 0;
        ed var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_44_0 = 0;
        int stackOut_2_0 = 0;
        byte stackOut_10_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_35_0 = 0;
        var15 = EscapeVector.field_A;
        var9 = param0 + param2 + param3;
        var10 = new ed[]{new ed(var9, var9), new ed(param8, var9), new ed(var9, var9), new ed(var9, param8), new ed(64, 64), new ed(var9, param8), new ed(var9, var9), new ed(param8, var9), new ed(var9, var9)};
        var11_ref_ed__ = var10;
        var12 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var11_ref_ed__.length <= var12) {
                break L2;
              } else {
                var13 = var11_ref_ed__[var12];
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
                        if (var13.field_B.length <= var14) {
                          break L5;
                        } else {
                          var13.field_B[var14] = param7;
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
            stackOut_10_0 = param5;
            stackIn_11_0 = stackOut_10_0;
            break L1;
          }
          if (stackIn_11_0 == 33) {
            var11 = 0;
            L6: while (true) {
              L7: {
                if (var11 >= param0) {
                  stackOut_23_0 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  break L7;
                } else {
                  stackOut_15_0 = 0;
                  stackIn_24_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (var15 != 0) {
                    break L7;
                  } else {
                    var12 = stackIn_16_0;
                    L8: while (true) {
                      L9: {
                        if (var9 <= var12) {
                          var11++;
                          break L9;
                        } else {
                          var10[6].field_B[var12 + var9 * (-var11 + var9 - 1)] = param6;
                          var10[8].field_B[var12 + (-1 + var9 - var11) * var9] = param6;
                          var10[2].field_B[-1 + (var9 - (var11 - var12 * var9))] = param6;
                          var10[8].field_B[var12 * var9 - var11 - (-var9 - -1)] = param6;
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
              var11 = stackIn_24_0;
              L10: while (true) {
                stackOut_25_0 = param0;
                stackOut_25_1 = var11;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                L11: while (true) {
                  L12: {
                    if (stackIn_26_0 <= stackIn_26_1) {
                      stackOut_32_0 = 0;
                      stackIn_33_0 = stackOut_32_0;
                      break L12;
                    } else {
                      stackOut_27_0 = 0;
                      stackIn_33_0 = stackOut_27_0;
                      stackIn_28_0 = stackOut_27_0;
                      if (var15 != 0) {
                        break L12;
                      } else {
                        var12 = stackIn_28_0;
                        if (var9 <= var12) {
                          var11++;
                          continue L10;
                        } else {
                          var10[0].field_B[var9 * var11 + var12] = param4;
                          var10[0].field_B[var9 * var12 - -var11] = param4;
                          stackOut_29_0 = var9 + -var11;
                          stackOut_29_1 = var12;
                          stackIn_26_0 = stackOut_29_0;
                          stackIn_26_1 = stackOut_29_1;
                          continue L11;
                        }
                      }
                    }
                  }
                  var11 = stackIn_33_0;
                  L13: while (true) {
                    L14: {
                      if (param8 <= var11) {
                        stackOut_43_0 = 0;
                        stackIn_44_0 = stackOut_43_0;
                        break L14;
                      } else {
                        stackOut_35_0 = 0;
                        stackIn_44_0 = stackOut_35_0;
                        stackIn_36_0 = stackOut_35_0;
                        if (var15 != 0) {
                          break L14;
                        } else {
                          var12 = stackIn_36_0;
                          L15: while (true) {
                            L16: {
                              if (param0 <= var12) {
                                var11++;
                                break L16;
                              } else {
                                var10[7].field_B[var11 + param8 * (-1 + (var9 + -var12))] = param6;
                                var10[5].field_B[var11 * var9 + (var9 - (1 - -var12))] = param6;
                                var10[1].field_B[param8 * var12 - -var11] = param4;
                                var10[3].field_B[var12 + var11 * var9] = param4;
                                var12++;
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
                    var11 = stackIn_44_0;
                    L17: while (true) {
                      L18: {
                        if (param8 >> 1 <= var11) {
                          break L18;
                        } else {
                          var12 = 0;
                          L19: while (true) {
                            L20: {
                              if (var12 >= param3) {
                                var11++;
                                break L20;
                              } else {
                                var10[1].field_B[(var9 + -var12 + -1) * param8 + var11] = param1;
                                var10[3].field_B[var11 * var9 + (var9 - (1 - -var12))] = param1;
                                var10[7].field_B[var12 * param8 - -var11] = param1;
                                var10[5].field_B[var12 + var9 * var11] = param1;
                                var12++;
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
          } else {
            return null;
          }
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  if (param0 >= 14) {
                    var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                    param1.getAppletContext().showDocument(sh.a((byte) 119, param1, var2), "_top");
                    break L0;
                  } else {
                    return;
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  break L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("ge.A(").append(param0).append(44);
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        bd var4_ref_bd = null;
        int var4 = 0;
        Object var5 = null;
        byte[] var5_array = null;
        int var6 = 0;
        byte[] var7 = null;
        ei var8 = null;
        c var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param0 == 124) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            L2: {
              L3: {
                var9 = om.field_g;
                var2 = var9.e(param0 ^ 124);
                if (var2 == 0) {
                  break L3;
                } else {
                  L4: {
                    if (var2 == 1) {
                      break L4;
                    } else {
                      pf.a(false, "A1: " + hf.b((byte) -65), (Throwable) null);
                      nm.a(16);
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var3 = var9.g(-5053);
                  var4_ref_bd = (bd) (Object) rd.field_b.a(false);
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var4_ref_bd == null) {
                          break L7;
                        } else {
                          stackOut_9_0 = var4_ref_bd.field_i;
                          stackIn_15_0 = stackOut_9_0;
                          stackIn_10_0 = stackOut_9_0;
                          if (var6 != 0) {
                            break L6;
                          } else {
                            if (stackIn_10_0 == var3) {
                              break L7;
                            } else {
                              var4_ref_bd = (bd) (Object) rd.field_b.b((byte) 70);
                              if (var6 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                      if (var4_ref_bd == null) {
                        stackOut_14_0 = 16;
                        stackIn_15_0 = stackOut_14_0;
                        break L6;
                      } else {
                        var4_ref_bd.c((byte) -68);
                        if (var6 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    nm.a(stackIn_15_0);
                    return;
                  }
                }
              }
              var8 = (ei) (Object) nf.field_w.a(false);
              if (var8 == null) {
                nm.a(16);
                return;
              } else {
                L8: {
                  L9: {
                    var4 = var9.e(0);
                    if (var4 == 0) {
                      break L9;
                    } else {
                      var13 = new byte[var4];
                      var12 = var13;
                      var11 = var12;
                      var10 = var11;
                      var7 = var10;
                      var5_array = var7;
                      var9.a(var13, (byte) -96, 0, var4);
                      if (var6 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var5_array = null;
                  break L8;
                }
                var9.field_m = var9.field_m + 4;
                if (var9.h(param0 ^ 124)) {
                  var8.field_g = true;
                  var8.field_h = var5_array;
                  var8.c((byte) -126);
                  break L2;
                } else {
                  nm.a(16);
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "ge.B(" + param0 + 41);
        }
    }

    final static void a(int param0, int[] param1, int param2, int param3, byte param4, int param5, int param6, int param7, int[] param8, int param9) {
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
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
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
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
        var11 = EscapeVector.field_A;
        try {
          L0: {
            if (param4 <= -55) {
              var10_int = param7;
              L1: while (true) {
                L2: {
                  if (var10_int >= 0) {
                    break L2;
                  } else {
                    if (var11 != 0) {
                      break L2;
                    } else {
                      param5 = param0;
                      L3: while (true) {
                        L4: {
                          if (param5 >= 0) {
                            stackOut_14_0 = param9;
                            stackOut_14_1 = param3;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            break L4;
                          } else {
                            int incrementValue$38 = param6;
                            param6++;
                            stackOut_8_0 = -1;
                            stackOut_8_1 = ~param1[incrementValue$38];
                            stackIn_15_0 = stackOut_8_0;
                            stackIn_15_1 = stackOut_8_1;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            if (var11 != 0) {
                              break L4;
                            } else {
                              L5: {
                                L6: {
                                  if (stackIn_9_0 != stackIn_9_1) {
                                    break L6;
                                  } else {
                                    param9++;
                                    if (var11 == 0) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                param2 = param8[param9];
                                int incrementValue$39 = param9;
                                param9++;
                                param8[incrementValue$39] = -(ae.a(param2, 16579836) >> 2) + param2;
                                break L5;
                              }
                              param5++;
                              continue L3;
                            }
                          }
                        }
                        param9 = stackIn_15_0 + stackIn_15_1;
                        var10_int++;
                        continue L1;
                      }
                    }
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var10 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var10;
            stackOut_17_1 = new StringBuilder().append("ge.D(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          L8: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param8 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw t.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param9 + 41);
        }
    }

    public static void b(byte param0) {
        if (param0 >= -11) {
            ge.a((byte) -77, (java.applet.Applet) null);
        }
        field_b = null;
        field_d = null;
        field_h = null;
        field_a = null;
    }

    ge() {
        ((ge) this).field_f = new ie[2];
        ((ge) this).field_c = false;
        ((ge) this).field_g = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Auto-shield reactivated";
        field_h = new fc();
        field_d = new String[]{"All scores", "My scores", "Best each"};
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
