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
            InterruptedException interruptedException = null;
            Object var2 = null;
            int var5 = 0;
            bi var6 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2_ref = null;
            Exception var2_ref2 = null;
            var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            L0: while (true) {
              L1: {
                L2: {
                  if (this.field_a) {
                    break L2;
                  } else {
                    var2_ref = this.field_b;
                    synchronized (var2_ref) {
                      L3: {
                        var6 = (bi) ((Object) this.field_b.d(5518));
                        if (var5 != 0) {
                          decompiledRegionSelector0 = 0;
                          break L3;
                        } else {
                          L4: {
                            L5: {
                              if (var6 == null) {
                                break L5;
                              } else {
                                this.field_e = this.field_e - 1;
                                if (var5 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            try {
                              L6: {
                                this.field_b.wait();
                                break L6;
                              }
                            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                              decompiledCaughtException = decompiledCaughtParameter0;
                              L7: {
                                interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                                break L7;
                              }
                            }
                            if (var5 == 0) {
                              decompiledRegionSelector0 = 1;
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                          decompiledRegionSelector0 = 2;
                          break L3;
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
                          L8: {
                            L9: {
                              L10: {
                                if ((var6.field_G ^ -1) == -3) {
                                  break L10;
                                } else {
                                  if (-4 == (var6.field_G ^ -1)) {
                                    var6.field_F = var6.field_H.a((int)var6.field_t, 3);
                                    if (var5 == 0) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              var6.field_H.a((byte) 107, var6.field_F.length, var6.field_F, (int)var6.field_t);
                              break L9;
                            }
                            break L8;
                          }
                        } catch (java.lang.Exception decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L11: {
                            var2_ref2 = (Exception) (Object) decompiledCaughtException;
                            gb.a((Throwable) ((Object) var2_ref2), (String) null, 10);
                            break L11;
                          }
                        }
                        var6.field_u = false;
                        if (var5 == 0) {
                          continue L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                break L1;
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
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_45_0 = 0;
        int statePc = 0;
        int var9 = 0;
        nh[] var10 = null;
        nh[] var11_ref_nh__ = null;
        int var11 = 0;
        int var12 = 0;
        nh var13_ref_nh = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                    var9 = param5 + param7 + param8;
                    var10 = new nh[]{new nh(var9, var9), new nh(param1, var9), new nh(var9, var9), new nh(var9, param1), new nh(64, 64), new nh(var9, param1), new nh(var9, var9), new nh(param1, var9), new nh(var9, var9)};
                    var11_ref_nh__ = var10;
                    var12 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var11_ref_nh__.length <= var12) {
                        statePc = 10;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var13_ref_nh = var11_ref_nh__[var12];
                    stackIn_11_0 = 0;
                    stackIn_3_0 = stackIn_11_0;
                    if (var15 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var14 = stackIn_3_0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var13_ref_nh.field_B.length <= var14) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var13_ref_nh.field_B[var14] = param2;
                    var14++;
                    if (var15 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var15 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var12++;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (var15 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var11 = stackIn_11_0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var11 >= param7) {
                        statePc = 21;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_22_0 = 0;
                    stackIn_14_0 = stackIn_22_0;
                    if (var15 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var12 = stackIn_14_0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var12 >= var9) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var10[6].field_B[(-var11 + (var9 - 1)) * var9 + var12] = param3;
                    var10[8].field_B[(var9 - (var11 - -1)) * var9 + var12] = param3;
                    var10[2].field_B[-var11 + (var9 - 1 + var9 * var12)] = param3;
                    var10[8].field_B[var9 * var12 - 1 - (-var9 + var11)] = param3;
                    var12++;
                    if (var15 != 0) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var15 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var11++;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (var15 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var11 = stackIn_22_0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = param7;
                    stackIn_24_1 = var11;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (stackIn_24_0 <= stackIn_24_1) {
                        statePc = 33;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_34_0 = 0;
                    stackIn_26_0 = stackIn_34_0;
                    if (var15 != 0) {
                        statePc = 34;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var12 = stackIn_26_0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (var12 >= var9) {
                        statePc = 32;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var10[0].field_B[var12 + var9 * var11] = param4;
                    var10[0].field_B[var12 * var9 - -var11] = param4;
                    stackIn_24_0 = -var11 + var9;
                    stackIn_29_0 = stackIn_24_0;
                    stackIn_24_1 = var12;
                    stackIn_29_1 = stackIn_24_1;
                    if (var15 != 0) {
                        statePc = 24;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (stackIn_29_0 <= stackIn_29_1) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var10[2].field_B[var12 + var9 * var11] = param4;
                    var10[6].field_B[var11 + var9 * var12] = param4;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var12++;
                    if (var15 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var11++;
                    if (var15 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var11 = -122 % ((param0 - 24) / 62);
                    stackIn_34_0 = 0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var12 = stackIn_34_0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (var12 >= param1) {
                        statePc = 44;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_45_0 = 0;
                    stackIn_37_0 = stackIn_45_0;
                    if (var15 != 0) {
                        statePc = 45;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var13 = stackIn_37_0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (param7 <= var13) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var10[7].field_B[param1 * (-1 + (-var13 + var9)) + var12] = param3;
                    var10[5].field_B[var12 * var9 - 1 - (-var9 - -var13)] = param3;
                    var10[1].field_B[param1 * var13 - -var12] = param4;
                    var10[3].field_B[var13 + var12 * var9] = param4;
                    var13++;
                    if (var15 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (var15 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var12++;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (var15 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    stackIn_45_0 = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var11 = stackIn_45_0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (var11 >= param1 >> 1081690369) {
                        statePc = 54;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var12 = 0;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (param5 <= var12) {
                        statePc = 52;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var10[1].field_B[var11 + (-1 + var9 - var12) * param1] = param6;
                    var10[3].field_B[var11 * var9 + -1 + (var9 + -var12)] = param6;
                    var10[7].field_B[param1 * var12 + var11] = param6;
                    var10[5].field_B[var11 * var9 - -var12] = param6;
                    var12++;
                    if (var15 != 0) {
                        statePc = 53;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (var15 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var11++;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (var15 == 0) {
                        statePc = 46;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    return var10;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(bi param0, byte param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3 = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            var3 = this.field_b;
            synchronized (var3) {
              L1: {
                L2: {
                  if (param1 < -112) {
                    break L2;
                  } else {
                    this.a(62, 59, (ik) null);
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
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("n.G(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 64) {
            break L0;
          } else {
            n.a(31, (bl) null, -33, -104, -11, -95);
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
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final bi a(ik param0, int param1, int param2) {
        bi var4 = null;
        RuntimeException var4_ref = null;
        bi stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = (bi) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("n.F(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void b(int param0) {
        if (param0 != -31553) {
            n.a(-17);
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
        int var8 = 0;
        bi stackIn_10_0 = null;
        int stackIn_17_0 = 0;
        bi stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
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
                      stackIn_17_0 = ((var6.field_t ^ -1L) < ((long)param1 ^ -1L) ? -1 : ((var6.field_t ^ -1L) == ((long)param1 ^ -1L) ? 0 : 1));

                      if (var8 != 0) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L4: {
                          if (stackIn_17_0 != 0) {
                            break L4;
                          } else {
                            if (var6.field_H != param2) {
                              break L4;
                            } else {
                              if (-3 == (var6.field_G ^ -1)) {
                                var4.field_u = false;
                                var4.field_F = var6.field_F;
                                stackIn_10_0 = (bi) (var4);
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
                stackIn_17_0 = param0;
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
            stackIn_20_0 = (bi) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4_ref);

            stackIn_23_1 = new StringBuilder().append("n.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        return stackIn_20_0;
    }

    final static q a(int param0, bl param1, int param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        q var7 = null;
        java.awt.Frame var8 = null;
        q stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var8 = nj.a(param0, param5, param1, false, param2, param4);
            var6 = var8;
            if (var8 != null) {
              L1: {
                var7 = new q();
                var7.field_a = var8;
                var7.field_a.add((java.awt.Component) ((Object) var7));
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
              stackIn_6_0 = (q) (var7);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6_ref);

            stackIn_9_1 = new StringBuilder().append("n.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_1_0 = (bi) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5_ref);

            stackIn_4_1 = new StringBuilder().append("n.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param3 + ')');
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
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                    this.field_b = new hl();
                    this.field_a = false;
                    this.field_e = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = param0.a((Runnable) (this), 5, (byte) 127);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2.field_b != 0) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        kk.a(10L, true);
                        if (var3 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var2.field_b ^ -1) != -3) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.field_d = (Thread) (var2.field_g);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_11_0 = (RuntimeException) (runtimeException);
                    stackIn_10_0 = stackIn_11_0;
                    stackIn_11_1 = new StringBuilder().append("n.<init>(");
                    stackIn_10_1 = stackIn_11_1;
                    if (param0 == null) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_12_2 = "{...}";
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_12_2 = "null";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    throw ie.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_f = "Medium";
    }
}
