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
        RuntimeException runtimeException = null;
        int var1_int = 0;
        Exception var1 = null;
        ie var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            ((ge) this).field_g = true;
            try {
              L1: {
                L2: while (true) {
                  L3: {
                    L4: {
                      if (((ge) this).field_c) {
                        break L4;
                      } else {
                        if (var4 != 0) {
                          break L3;
                        } else {
                          var1_int = 0;
                          L5: while (true) {
                            L6: {
                              L7: {
                                if (var1_int >= 2) {
                                  break L7;
                                } else {
                                  var2 = ((ge) this).field_f[var1_int];
                                  if (var4 != 0) {
                                    break L6;
                                  } else {
                                    L8: {
                                      if (null == var2) {
                                        break L8;
                                      } else {
                                        var2.d();
                                        break L8;
                                      }
                                    }
                                    var1_int++;
                                    if (var4 == 0) {
                                      continue L5;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              en.a((byte) -95, 10L);
                              af.a((byte) -61, ((ge) this).field_e, (Object) null);
                              break L6;
                            }
                            if (var4 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    ((ge) this).field_g = false;
                    break L3;
                  }
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var1 = (Exception) (Object) decompiledCaughtException;
                pf.a(false, (String) null, (Throwable) (Object) var1);
                ((ge) this).field_g = false;
                break L9;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = decompiledCaughtException;
              ((ge) this).field_g = false;
              throw ge.<RuntimeException>$cfr$sneakyThrow(var3);
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw t.a((Throwable) (Object) runtimeException, "ge.run()");
        }
    }

    final static ed[] a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        ed[] var10 = null;
        ed[] var11_ref_ed__ = null;
        int var11 = 0;
        int var12 = 0;
        ed var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        Object stackIn_15_0 = null;
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
        ed[] stackIn_64_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        byte stackOut_12_0 = 0;
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
        ed[] stackOut_63_0 = null;
        Object stackOut_14_0 = null;
        var15 = EscapeVector.field_A;
        try {
          L0: {
            var9_int = param0 + param2 + param3;
            var10 = new ed[]{new ed(var9_int, var9_int), new ed(param8, var9_int), new ed(var9_int, var9_int), new ed(var9_int, param8), new ed(64, 64), new ed(var9_int, param8), new ed(var9_int, var9_int), new ed(param8, var9_int), new ed(var9_int, var9_int)};
            var11_ref_ed__ = var10;
            var12 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var11_ref_ed__.length <= var12) {
                    break L3;
                  } else {
                    var13 = var11_ref_ed__[var12];
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
                            if (var13.field_B.length <= var14) {
                              break L6;
                            } else {
                              var13.field_B[var14] = param7;
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
                stackOut_12_0 = param5;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              }
              if (stackIn_13_0 == 33) {
                var11 = 0;
                L7: while (true) {
                  L8: {
                    L9: {
                      if (var11 >= param0) {
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
                                  var10[6].field_B[var12 + var9_int * (-var11 + var9_int - 1)] = param6;
                                  var10[8].field_B[var12 + (-1 + var9_int - var11) * var9_int] = param6;
                                  var10[2].field_B[-1 + (var9_int - (var11 - var12 * var9_int))] = param6;
                                  var10[8].field_B[var12 * var9_int - var11 - (-var9_int - -1)] = param6;
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
                    stackOut_29_0 = param0;
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
                                  if (var9_int <= var12) {
                                    break L18;
                                  } else {
                                    var10[0].field_B[var9_int * var11 + var12] = param4;
                                    var10[0].field_B[var9_int * var12 - -var11] = param4;
                                    stackOut_34_0 = var9_int + -var11;
                                    stackOut_34_1 = var12;
                                    stackIn_30_0 = stackOut_34_0;
                                    stackIn_30_1 = stackOut_34_1;
                                    stackIn_35_0 = stackOut_34_0;
                                    stackIn_35_1 = stackOut_34_1;
                                    if (var15 != 0) {
                                      continue L14;
                                    } else {
                                      L19: {
                                        if (stackIn_35_0 <= stackIn_35_1) {
                                          break L19;
                                        } else {
                                          var10[2].field_B[var12 - -(var9_int * var11)] = param4;
                                          var10[6].field_B[var12 * var9_int + var11] = param4;
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
                            if (~param8 >= ~var11) {
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
                                      if (param0 <= var12) {
                                        break L25;
                                      } else {
                                        var10[7].field_B[var11 + param8 * (-1 + (var9_int + -var12))] = param6;
                                        var10[5].field_B[var11 * var9_int + (var9_int - (1 - -var12))] = param6;
                                        var10[1].field_B[param8 * var12 - -var11] = param4;
                                        var10[3].field_B[var12 + var11 * var9_int] = param4;
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
                            if (~(param8 >> 1770480481) >= ~var11) {
                              break L27;
                            } else {
                              var12 = 0;
                              L28: while (true) {
                                L29: {
                                  L30: {
                                    if (var12 >= param3) {
                                      break L30;
                                    } else {
                                      var10[1].field_B[(var9_int + -var12 + -1) * param8 + var11] = param1;
                                      var10[3].field_B[var11 * var9_int + (var9_int - (1 - -var12))] = param1;
                                      var10[7].field_B[var12 * param8 - -var11] = param1;
                                      var10[5].field_B[var12 + var9_int * var11] = param1;
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
                          stackOut_63_0 = (ed[]) var10;
                          stackIn_64_0 = stackOut_63_0;
                          break L0;
                        }
                      }
                    }
                  }
                }
              } else {
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                return (ed[]) (Object) stackIn_15_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var9, "ge.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_64_0;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
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
                stackOut_6_1 = new StringBuilder().append("ge.A(").append(param0).append(',');
                stackIn_9_0 = stackOut_6_0;
                stackIn_9_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_10_0 = stackOut_7_0;
                  stackIn_10_1 = stackOut_7_1;
                  stackIn_10_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw t.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        c var1_ref = null;
        int var2 = 0;
        ei var3 = null;
        int var3_int = 0;
        bd var4_ref_bd = null;
        int var4 = 0;
        Object var5 = null;
        byte[] var5_array = null;
        int var6 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_21_0 = 0;
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
                var1_ref = om.field_g;
                var2 = var1_ref.e(param0 ^ 124);
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
                  var3_int = var1_ref.g(-5053);
                  var4_ref_bd = (bd) (Object) rd.field_b.a(false);
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var4_ref_bd == null) {
                          break L7;
                        } else {
                          stackOut_13_0 = var4_ref_bd.field_i;
                          stackIn_22_0 = stackOut_13_0;
                          stackIn_14_0 = stackOut_13_0;
                          if (var6 != 0) {
                            break L6;
                          } else {
                            if (stackIn_14_0 == var3_int) {
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
                      if (null == var4_ref_bd) {
                        stackOut_21_0 = 16;
                        stackIn_22_0 = stackOut_21_0;
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
                    nm.a(stackIn_22_0);
                    return;
                  }
                }
              }
              var3 = (ei) (Object) nf.field_w.a(false);
              if (var3 == null) {
                nm.a(16);
                return;
              } else {
                L8: {
                  L9: {
                    var4 = var1_ref.e(0);
                    if (var4 == 0) {
                      break L9;
                    } else {
                      var5_array = new byte[var4];
                      var1_ref.a(var5_array, (byte) -96, 0, var4);
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
                var1_ref.field_m = var1_ref.field_m + 4;
                if (var1_ref.h(param0 ^ 124)) {
                  var3.field_g = true;
                  var3.field_h = var5_array;
                  var3.c((byte) -126);
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
          throw t.a((Throwable) (Object) var1, "ge.B(" + param0 + ')');
        }
    }

    final static void a(int param0, int[] param1, int param2, int param3, byte param4, int param5, int param6, int param7, int[] param8, int param9) {
        RuntimeException runtimeException = null;
        int var10_int = 0;
        int var11 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            if (param4 <= -55) {
              var10_int = param7;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var10_int >= 0) {
                      break L3;
                    } else {
                      if (var11 != 0) {
                        break L2;
                      } else {
                        param5 = param0;
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (param5 >= 0) {
                                break L6;
                              } else {
                                int incrementValue$6 = param6;
                                param6++;
                                stackOut_8_0 = -1;
                                stackOut_8_1 = ~param1[incrementValue$6];
                                stackIn_18_0 = stackOut_8_0;
                                stackIn_18_1 = stackOut_8_1;
                                stackIn_9_0 = stackOut_8_0;
                                stackIn_9_1 = stackOut_8_1;
                                if (var11 != 0) {
                                  break L5;
                                } else {
                                  L7: {
                                    L8: {
                                      if (stackIn_9_0 != stackIn_9_1) {
                                        break L8;
                                      } else {
                                        param9++;
                                        if (var11 == 0) {
                                          break L7;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    param2 = param8[param9];
                                    int incrementValue$7 = param9;
                                    param9++;
                                    param8[incrementValue$7] = -(ae.a(param2, 16579836) >> -1125526814) + param2;
                                    break L7;
                                  }
                                  param5++;
                                  if (var11 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            stackOut_17_0 = param9;
                            stackOut_17_1 = param3;
                            stackIn_18_0 = stackOut_17_0;
                            stackIn_18_1 = stackOut_17_1;
                            break L5;
                          }
                          param9 = stackIn_18_0 + stackIn_18_1;
                          var10_int++;
                          if (var11 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            runtimeException = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) runtimeException;
            stackOut_20_1 = new StringBuilder().append("ge.D(").append(param0).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L9;
            }
          }
          L10: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param8 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L10;
            }
          }
          throw t.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param9 + ')');
        }
    }

    public static void b(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -11) {
                break L1;
              } else {
                ge.a((byte) -77, (java.applet.Applet) null);
                break L1;
              }
            }
            field_b = null;
            field_d = null;
            field_h = null;
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "ge.C(" + param0 + ')');
        }
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
