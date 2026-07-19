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
            boolean discarded$1 = false;
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Object var2_ref2 = null;
            Throwable var4 = null;
            int var5 = 0;
            bi var6 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            L0: while (true) {
              L1: {
                if (this.field_a) {
                  break L1;
                } else {
                  var2_ref2 = this.field_b;
                  synchronized (var2_ref2) {
                    L2: {
                      var6 = (bi) ((Object) this.field_b.d(5518));
                      if (var5 != 0) {
                        decompiledRegionSelector0 = 0;
                        break L2;
                      } else {
                        L3: {
                          L4: {
                            if (var6 == null) {
                              break L4;
                            } else {
                              this.field_e = this.field_e - 1;
                              if (var5 == 0) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          try {
                            L5: {
                              this.field_b.wait();
                              break L5;
                            }
                          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L6: {
                              interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                              break L6;
                            }
                          }
                          if (var5 == 0) {
                            decompiledRegionSelector0 = 1;
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                        decompiledRegionSelector0 = 2;
                        break L2;
                      }
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    break L1;
                  } else {
                    if (decompiledRegionSelector0 == 1) {
                      continue L0;
                    } else {
                      try {
                        L7: {
                          L8: {
                            L9: {
                              if ((var6.field_G ^ -1) == -3) {
                                break L9;
                              } else {
                                if (-4 == (var6.field_G ^ -1)) {
                                  var6.field_F = var6.field_H.a((int)var6.field_t, 3);
                                  if (var5 == 0) {
                                    decompiledRegionSelector1 = 1;
                                    break L7;
                                  } else {
                                    break L9;
                                  }
                                } else {
                                  var6.field_u = false;
                                  break L8;
                                }
                              }
                            }
                            discarded$1 = var6.field_H.a((byte) 107, var6.field_F.length, var6.field_F, (int)var6.field_t);
                            var6.field_u = false;
                            break L8;
                          }
                          decompiledRegionSelector1 = 0;
                          break L7;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L10: {
                          var2_ref = (Exception) (Object) decompiledCaughtException;
                          gb.a((Throwable) ((Object) var2_ref), (String) null, 10);
                          decompiledRegionSelector1 = 1;
                          break L10;
                        }
                      }
                      if (decompiledRegionSelector1 == 0) {
                        continue L0;
                      } else {
                        var6.field_u = false;
                        continue L0;
                      }
                    }
                  }
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static nh[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        nh[] var10 = null;
        nh[] var11_ref_nh__ = null;
        int var11 = 0;
        int var12 = 0;
        nh var13_ref_nh = null;
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
        var15 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var9 = param5 + param7 + param8;
        var10 = new nh[]{new nh(var9, var9), new nh(param1, var9), new nh(var9, var9), new nh(var9, param1), new nh(64, 64), new nh(var9, param1), new nh(var9, var9), new nh(param1, var9), new nh(var9, var9)};
        var11_ref_nh__ = var10;
        var12 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var11_ref_nh__.length <= var12) {
                break L2;
              } else {
                var13_ref_nh = var11_ref_nh__[var12];
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
                        if (var13_ref_nh.field_B.length <= var14) {
                          break L5;
                        } else {
                          var13_ref_nh.field_B[var14] = param2;
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
              if (var11 >= param7) {
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
                      if (var12 >= var9) {
                        var11++;
                        break L9;
                      } else {
                        var10[6].field_B[(-var11 + (var9 - 1)) * var9 + var12] = param3;
                        var10[8].field_B[(var9 - (var11 - -1)) * var9 + var12] = param3;
                        var10[2].field_B[-var11 + (var9 - 1 + var9 * var12)] = param3;
                        var10[8].field_B[var9 * var12 - 1 - (-var9 + var11)] = param3;
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
              stackOut_23_0 = param7;
              stackOut_23_1 = var11;
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              L11: while (true) {
                L12: {
                  if (stackIn_24_0 <= stackIn_24_1) {
                    var11 = -122 % ((param0 - 24) / 62);
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
                      if (var12 >= var9) {
                        var11++;
                        continue L10;
                      } else {
                        var10[0].field_B[var12 + var9 * var11] = param4;
                        var10[0].field_B[var12 * var9 - -var11] = param4;
                        stackOut_27_0 = -var11 + var9;
                        stackOut_27_1 = var12;
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
                    if (var12 >= param1) {
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
                            if (param7 <= var13) {
                              var12++;
                              break L16;
                            } else {
                              var10[7].field_B[param1 * (-1 + (-var13 + var9)) + var12] = param3;
                              var10[5].field_B[var12 * var9 - 1 - (-var9 - -var13)] = param3;
                              var10[1].field_B[param1 * var13 - -var12] = param4;
                              var10[3].field_B[var13 + var12 * var9] = param4;
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
                  var11 = stackIn_42_0;
                  L17: while (true) {
                    L18: {
                      if (var11 >= param1 >> 1081690369) {
                        break L18;
                      } else {
                        var12 = 0;
                        L19: while (true) {
                          L20: {
                            if (param5 <= var12) {
                              var11++;
                              break L20;
                            } else {
                              var10[1].field_B[var11 + (-1 + var9 - var12) * param1] = param6;
                              var10[3].field_B[var11 * var9 + -1 + (var9 + -var12)] = param6;
                              var10[7].field_B[param1 * var12 + var11] = param6;
                              var10[5].field_B[var11 * var9 - -var12] = param6;
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
        }
    }

    private final void a(bi param0, byte param1) {
        bi discarded$3 = null;
        Object var3 = null;
        RuntimeException var3_ref = null;
        Throwable var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var3 = this.field_b;
            synchronized (var3) {
              L1: {
                L2: {
                  if (param1 < -112) {
                    break L2;
                  } else {
                    discarded$3 = this.a(62, 59, (ik) null);
                    break L2;
                  }
                }
                this.field_b.a(param0, 0);
                this.field_e = this.field_e + 1;
                this.field_b.notifyAll();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3_ref);
            stackOut_8_1 = new StringBuilder().append("n.G(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0) {
        q discarded$2 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 64) {
            break L0;
          } else {
            discarded$2 = n.a(31, (bl) null, -33, -104, -11, -95);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == uj.field_j) {
              break L2;
            } else {
              if (tl.field_O != ik.field_d) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final bi a(ik param0, int param1, int param2) {
        bi var4 = null;
        RuntimeException var4_ref = null;
        bi stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        bi stackOut_2_0 = null;
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
              var4 = new bi();
              var4.field_H = param0;
              if (param2 == 7) {
                break L1;
              } else {
                field_g = (java.awt.Canvas) null;
                break L1;
              }
            }
            var4.field_y = false;
            var4.field_t = (long)param1;
            var4.field_G = 3;
            this.a(var4, (byte) -117);
            stackOut_2_0 = (bi) (var4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4_ref);
            stackOut_4_1 = new StringBuilder().append("n.F(");
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
          throw ie.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void b(int param0) {
        boolean discarded$0 = false;
        if (param0 != -31553) {
            discarded$0 = n.a(-17);
        }
        field_g = null;
        field_h = null;
        field_f = null;
    }

    final bi a(int param0, int param1, ik param2) {
        bi var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        bi var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        int stackIn_5_0 = 0;
        bi stackIn_10_0 = null;
        int stackIn_17_0 = 0;
        bi stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        bi stackOut_9_0 = null;
        int stackOut_16_0 = 0;
        bi stackOut_19_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var4 = new bi();
            var4.field_G = 1;
            var5 = this.field_b;
            synchronized (var5) {
              L1: {
                var6 = (bi) ((Object) this.field_b.a(true));
                L2: while (true) {
                  L3: {
                    if (var6 == null) {
                      break L3;
                    } else {
                      stackOut_4_0 = ((var6.field_t ^ -1L) < ((long)param1 ^ -1L) ? -1 : ((var6.field_t ^ -1L) == ((long)param1 ^ -1L) ? 0 : 1));
                      stackIn_17_0 = stackOut_4_0;
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
                              if (-3 == (var6.field_G ^ -1)) {
                                var4.field_u = false;
                                var4.field_F = var6.field_F;
                                stackOut_9_0 = (bi) (var4);
                                stackIn_10_0 = stackOut_9_0;
                                return stackIn_10_0;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        var6 = (bi) ((Object) this.field_b.c(97));
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
                var4.field_F = param2.a(param1, 3);
                var4.field_u = false;
                var4.field_y = true;
                stackOut_16_0 = param0;
                stackIn_17_0 = stackOut_16_0;
                break L5;
              }
            }
            L6: {
              if (stackIn_17_0 == 6) {
                break L6;
              } else {
                this.field_a = false;
                break L6;
              }
            }
            stackOut_19_0 = (bi) (var4);
            stackIn_20_0 = stackOut_19_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var4_ref);
            stackOut_21_1 = new StringBuilder().append("n.A(").append(param0).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        return stackIn_20_0;
    }

    final static q a(int param0, bl param1, int param2, int param3, int param4, int param5) {
        java.awt.Component discarded$9 = null;
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        q var7 = null;
        java.awt.Frame var8 = null;
        q stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        q stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var8 = nj.a(param0, param5, param1, false, param2, param4);
            var6 = var8;
            if (var8 != null) {
              L1: {
                var7 = new q();
                var7.field_a = var8;
                discarded$9 = var7.field_a.add((java.awt.Component) ((Object) var7));
                var7.setBounds(0, 0, param2, param4);
                var7.addFocusListener(var7);
                var7.requestFocus();
                if (param3 == 9764) {
                  break L1;
                } else {
                  field_f = (String) null;
                  break L1;
                }
              }
              stackOut_5_0 = (q) (var7);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var6_ref);
            stackOut_7_1 = new StringBuilder().append("n.C(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_6_0;
    }

    final bi a(int param0, ik param1, byte[] param2, int param3) {
        bi var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        bi stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        bi stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            var5 = new bi();
            var5.field_t = (long)param0;
            var6 = -73 % ((-42 - param3) / 51);
            var5.field_H = param1;
            var5.field_y = false;
            var5.field_F = param2;
            var5.field_G = 2;
            this.a(var5, (byte) -124);
            stackOut_0_0 = (bi) (var5);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var5_ref);
            stackOut_2_1 = new StringBuilder().append("n.D(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    final void a(byte param0) {
        try {
            int var3 = 0;
            this.field_a = true;
            synchronized (this.field_b) {
                var3 = -87 / ((param0 - -9) / 47);
                this.field_b.notifyAll();
            }
            try {
                this.field_d.join();
            } catch (InterruptedException interruptedException) {
            }
            this.field_d = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    n(bl param0) {
        RuntimeException runtimeException = null;
        il var2 = null;
        int var3 = 0;
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
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        this.field_b = new hl();
        this.field_a = false;
        this.field_e = 0;
        try {
          L0: {
            var2 = param0.a((Runnable) (this), 5, (byte) 127);
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
                if ((var2.field_b ^ -1) != -3) {
                  this.field_d = (Thread) (var2.field_g);
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
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("n.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    static {
        field_f = "Medium";
    }
}
