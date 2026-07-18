/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n implements Runnable {
    static bl field_h;
    static String field_f;
    static java.awt.Canvas field_g;
    private hl field_b;
    static int field_c;
    static long field_i;
    private Thread field_d;
    private boolean field_a;
    int field_e;

    public final void run() {
        try {
            RuntimeException runtimeException = null;
            bi var1 = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    L3: {
                      if (((n) this).field_a) {
                        break L3;
                      } else {
                        var2 = (Object) (Object) ((n) this).field_b;
                        synchronized (var2) {
                          L4: {
                            var1 = (bi) (Object) ((n) this).field_b.d(5518);
                            if (var5 != 0) {
                              decompiledRegionSelector0 = 0;
                              break L4;
                            } else {
                              L5: {
                                L6: {
                                  if (null == var1) {
                                    break L6;
                                  } else {
                                    ((n) this).field_e = ((n) this).field_e - 1;
                                    if (var5 == 0) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                {
                                  L7: {
                                    ((Object) (Object) ((n) this).field_b).wait();
                                    break L7;
                                  }
                                }
                                if (var5 == 0) {
                                  decompiledRegionSelector0 = 1;
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                              decompiledRegionSelector0 = 2;
                              break L4;
                            }
                          }
                        }
                        if (decompiledRegionSelector0 == 0) {
                          break L2;
                        } else {
                          if (decompiledRegionSelector0 == 1) {
                            continue L1;
                          } else {
                            try {
                              L9: {
                                L10: {
                                  L11: {
                                    if (var1.field_G == 2) {
                                      break L11;
                                    } else {
                                      if (var1.field_G == 3) {
                                        var1.field_F = var1.field_H.a((int)var1.field_t, 3);
                                        if (var5 == 0) {
                                          break L10;
                                        } else {
                                          break L11;
                                        }
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  boolean discarded$1 = var1.field_H.a((byte) 107, var1.field_F.length, var1.field_F, (int)var1.field_t);
                                  break L10;
                                }
                                break L9;
                              }
                            } catch (java.lang.Exception decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L12: {
                                var2_ref = (Exception) (Object) decompiledCaughtException;
                                gb.a((Throwable) (Object) var2_ref, (String) null, 10);
                                break L12;
                              }
                            }
                            var1.field_u = false;
                            if (var5 == 0) {
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
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              runtimeException = (RuntimeException) (Object) decompiledCaughtException;
              throw ie.a((Throwable) (Object) runtimeException, "n.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static nh[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        nh[] var10 = null;
        nh[] var11_ref_nh__ = null;
        int var11 = 0;
        int var12 = 0;
        nh var13_ref_nh = null;
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
        nh[] stackIn_61_0 = null;
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
        nh[] stackOut_60_0 = null;
        var15 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var9_int = param5 + param7 + param8;
            var10 = new nh[]{new nh(var9_int, var9_int), new nh(param1, var9_int), new nh(var9_int, var9_int), new nh(var9_int, param1), new nh(64, 64), new nh(var9_int, param1), new nh(var9_int, var9_int), new nh(param1, var9_int), new nh(var9_int, var9_int)};
            var11_ref_nh__ = var10;
            var12 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var11_ref_nh__.length <= var12) {
                    break L3;
                  } else {
                    var13_ref_nh = var11_ref_nh__[var12];
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
                            if (~var13_ref_nh.field_B.length >= ~var14) {
                              break L6;
                            } else {
                              var13_ref_nh.field_B[var14] = param2;
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
                    if (~var11 <= ~param7) {
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
                              if (var12 >= var9_int) {
                                break L12;
                              } else {
                                var10[6].field_B[(-var11 + (var9_int - 1)) * var9_int + var12] = param3;
                                var10[8].field_B[(var9_int - (var11 - -1)) * var9_int + var12] = param3;
                                var10[2].field_B[-var11 + (var9_int - 1 + var9_int * var12)] = param3;
                                var10[8].field_B[var9_int * var12 - 1 - (-var9_int + var11)] = param3;
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
                  stackOut_26_0 = ~param7;
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
                                if (var12 >= var9_int) {
                                  break L18;
                                } else {
                                  var10[0].field_B[var12 + var9_int * var11] = param4;
                                  var10[0].field_B[var12 * var9_int - -var11] = param4;
                                  stackOut_31_0 = -var11 + var9_int;
                                  stackOut_31_1 = var12;
                                  stackIn_27_0 = stackOut_31_0;
                                  stackIn_27_1 = stackOut_31_1;
                                  stackIn_32_0 = stackOut_31_0;
                                  stackIn_32_1 = stackOut_31_1;
                                  if (var15 != 0) {
                                    continue L14;
                                  } else {
                                    L19: {
                                      if (stackIn_32_0 <= stackIn_32_1) {
                                        break L19;
                                      } else {
                                        var10[2].field_B[var12 + var9_int * var11] = param4;
                                        var10[6].field_B[var11 + var9_int * var12] = param4;
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
                      var11 = -122 % ((param0 - 24) / 62);
                      stackOut_37_0 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      break L15;
                    }
                    var12 = stackIn_38_0;
                    L20: while (true) {
                      L21: {
                        L22: {
                          if (~var12 <= ~param1) {
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
                                    if (param7 <= var13) {
                                      break L25;
                                    } else {
                                      var10[7].field_B[param1 * (-1 + (-var13 + var9_int)) + var12] = param3;
                                      var10[5].field_B[var12 * var9_int - 1 - (-var9_int - -var13)] = param3;
                                      var10[1].field_B[param1 * var13 - -var12] = param4;
                                      var10[3].field_B[var13 + var12 * var9_int] = param4;
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
                      var11 = stackIn_50_0;
                      L26: while (true) {
                        L27: {
                          if (~var11 <= ~(param1 >> 1081690369)) {
                            break L27;
                          } else {
                            var12 = 0;
                            L28: while (true) {
                              L29: {
                                L30: {
                                  if (~param5 >= ~var12) {
                                    break L30;
                                  } else {
                                    var10[1].field_B[var11 + (-1 + var9_int - var12) * param1] = param6;
                                    var10[3].field_B[var11 * var9_int + -1 + (var9_int + -var12)] = param6;
                                    var10[7].field_B[param1 * var12 + var11] = param6;
                                    var10[5].field_B[var11 * var9_int - -var12] = param6;
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
                        stackOut_60_0 = (nh[]) var10;
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
          throw ie.a((Throwable) (Object) var9, "n.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_61_0;
    }

    private final void a(bi param0, byte param1) {
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
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
            var3 = (Object) (Object) ((n) this).field_b;
            synchronized (var3) {
              L1: {
                L2: {
                  if (param1 < -112) {
                    break L2;
                  } else {
                    bi discarded$4 = ((n) this).a(62, 59, (ik) null);
                    break L2;
                  }
                }
                ((n) this).field_b.a((uh) (Object) param0, 0);
                ((n) this).field_e = ((n) this).field_e + 1;
                ((Object) (Object) ((n) this).field_b).notifyAll();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("n.G(");
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
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0) {
        RuntimeException var1 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 64) {
                break L1;
              } else {
                q discarded$2 = n.a(31, (bl) null, -33, -104, -11, -95);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == uj.field_j) {
                  break L3;
                } else {
                  if (tl.field_O != ik.field_d) {
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
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "n.E(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final bi a(ik param0, int param1, int param2) {
        bi var4 = null;
        RuntimeException var4_ref = null;
        bi stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        bi stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var4 = new bi();
              var4.field_H = param0;
              if (param2 == 7) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            var4.field_y = false;
            var4.field_t = (long)param1;
            var4.field_G = 3;
            this.a(var4, (byte) -117);
            stackOut_3_0 = (bi) var4;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("n.F(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -31553) {
                break L1;
              } else {
                boolean discarded$2 = n.a(-17);
                break L1;
              }
            }
            field_g = null;
            field_h = null;
            field_f = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "n.H(" + param0 + ')');
        }
    }

    final bi a(int param0, int param1, ik param2) {
        RuntimeException var4 = null;
        bi var4_ref = null;
        Object var5 = null;
        bi var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        int stackIn_5_0 = 0;
        bi stackIn_17_0 = null;
        int stackIn_24_0 = 0;
        bi stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        bi stackOut_16_0 = null;
        int stackOut_23_0 = 0;
        bi stackOut_27_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var4_ref = new bi();
            var4_ref.field_G = 1;
            var5 = (Object) (Object) ((n) this).field_b;
            synchronized (var5) {
              L1: {
                var6 = (bi) (Object) ((n) this).field_b.a(true);
                L2: while (true) {
                  L3: {
                    if (null == var6) {
                      break L3;
                    } else {
                      stackOut_4_0 = (~var6.field_t < ~(long)param1 ? -1 : (~var6.field_t == ~(long)param1 ? 0 : 1));
                      stackIn_24_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var8 != 0) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L4: {
                          if (stackIn_5_0 != 0) {
                            break L4;
                          } else {
                            if (var6.field_H != param2) {
                              break L4;
                            } else {
                              if (var6.field_G == 2) {
                                var4_ref.field_u = false;
                                var4_ref.field_F = var6.field_F;
                                stackOut_16_0 = (bi) var4_ref;
                                stackIn_17_0 = stackOut_16_0;
                                return stackIn_17_0;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        var6 = (bi) (Object) ((n) this).field_b.c(97);
                        if (var8 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L1;
                }
              }
            }
            L5: {
              if (decompiledRegionSelector0 == 0) {
                break L5;
              } else {
                var4_ref.field_F = param2.a(param1, 3);
                var4_ref.field_u = false;
                var4_ref.field_y = true;
                stackOut_23_0 = param0;
                stackIn_24_0 = stackOut_23_0;
                break L5;
              }
            }
            L6: {
              if (stackIn_24_0 == 6) {
                break L6;
              } else {
                ((n) this).field_a = false;
                break L6;
              }
            }
            stackOut_27_0 = (bi) var4_ref;
            stackIn_28_0 = stackOut_27_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var4;
            stackOut_29_1 = new StringBuilder().append("n.A(").append(param0).append(',').append(param1).append(',');
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L7;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ')');
        }
        return stackIn_28_0;
    }

    final static q a(int param0, bl param1, int param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        q var7 = null;
        Object stackIn_4_0 = null;
        q stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        q stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var6 = nj.a(param0, param5, param1, false, param2, param4);
            if (var6 == null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (q) (Object) stackIn_4_0;
            } else {
              L1: {
                var7 = new q();
                var7.field_a = var6;
                java.awt.Component discarded$3 = var7.field_a.add((java.awt.Component) (Object) var7);
                var7.setBounds(0, 0, param2, param4);
                var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
                var7.requestFocus();
                if (param3 == 9764) {
                  break L1;
                } else {
                  field_f = null;
                  break L1;
                }
              }
              stackOut_8_0 = (q) var7;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6_ref;
            stackOut_10_1 = new StringBuilder().append("n.C(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_9_0;
    }

    final bi a(int param0, ik param1, byte[] param2, int param3) {
        bi var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        bi stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        bi stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var5 = new bi();
            var5.field_t = (long)param0;
            var6 = -73 % ((-42 - param3) / 51);
            var5.field_H = param1;
            var5.field_y = false;
            var5.field_F = param2;
            var5.field_G = 2;
            this.a(var5, (byte) -124);
            stackOut_0_0 = (bi) var5;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5_ref;
            stackOut_2_1 = new StringBuilder().append("n.D(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
          throw ie.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    final void a(byte param0) {
        InterruptedException interruptedException = null;
        RuntimeException runtimeException = null;
        Object var2 = null;
        int var3 = 0;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            ((n) this).field_a = true;
            var2 = (Object) (Object) ((n) this).field_b;
            synchronized (var2) {
              L1: {
                var3 = -87 / ((param0 - -9) / 47);
                ((Object) (Object) ((n) this).field_b).notifyAll();
                break L1;
              }
            }
            try {
              L2: {
                ((n) this).field_d.join();
                break L2;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                break L3;
              }
            }
            ((n) this).field_d = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ie.a((Throwable) (Object) runtimeException, "n.I(" + param0 + ')');
        }
    }

    n(bl param0) {
        RuntimeException runtimeException = null;
        il var2 = null;
        int var3 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        ((n) this).field_b = new hl();
        ((n) this).field_a = false;
        ((n) this).field_e = 0;
        try {
          L0: {
            var2 = param0.a((Runnable) this, 5, (byte) 127);
            L1: while (true) {
              L2: {
                L3: {
                  if (var2.field_b != 0) {
                    break L3;
                  } else {
                    kk.a(10L, true);
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (var2.field_b != 2) {
                  ((n) this).field_d = (Thread) var2.field_g;
                  break L2;
                } else {
                  throw new RuntimeException();
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("n.<init>(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Medium";
    }
}
