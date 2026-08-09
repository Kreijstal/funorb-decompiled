/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends be {
    int[] field_C;
    String field_H;
    static String[] field_z;
    char[] field_G;
    static int field_B;
    boolean field_D;
    int[] field_E;
    static int field_A;
    char[] field_y;
    static int field_F;

    final static void f(byte param0) {
        if (param0 > -68) {
            ac.f((byte) 55);
            kk.field_n = 0;
            cg.a(true);
            return;
        }
        kk.field_n = 0;
        cg.a(true);
    }

    final static ck[] a(int param0, String param1, String param2, ji param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ck[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param3.b(-1, param1);
              var5 = param3.a(var4_int, 13030, param2);
              if (param0 == 0) {
                break L1;
              } else {
                ac.g((byte) 24);
                break L1;
              }
            }
            stackIn_3_0 = si.a(var5, var4_int, param3, (byte) -46);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("ac.C(").append(param0).append(',');

            if (param1 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(byte param0, wl param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == -4) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_H = (String) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3_int = param1.d((byte) -60);
                        if ((var3_int ^ -1) == -1) {
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
                        this.a(var3_int, param1, -127);
                        if (var4 == 0) {
                            statePc = 6;
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
                        return;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var4 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_11_0 = (RuntimeException) (var3);
                    stackIn_10_0 = stackIn_11_0;
                    stackIn_11_1 = new StringBuilder().append("ac.F(").append(param0).append(',');
                    stackIn_10_1 = stackIn_11_1;
                    if (param1 == null) {
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
                    throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void g(byte param0) {
        if (param0 != -17) {
            ac.g((byte) -64);
            field_z = null;
            return;
        }
        field_z = null;
    }

    private final void a(int param0, wl param1, int param2) {
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        char stackIn_9_2 = 0;
        char[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        char[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        char stackIn_21_2 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (param0 == 1) {
                    break L3;
                  } else {
                    L4: {
                      if (-3 != (param0 ^ -1)) {
                        break L4;
                      } else {
                        var4_int = param1.d((byte) -47);
                        this.field_G = new char[var4_int];
                        this.field_C = new int[var4_int];
                        var5 = 0;
                        L5: while (true) {
                          L6: {
                            if ((var5 ^ -1) <= (var4_int ^ -1)) {
                              break L6;
                            } else {
                              this.field_C[var5] = param1.e(3);
                              var6 = param1.g((byte) -99);
                              if (var7 != 0) {
                                break L1;
                              } else {
                                L7: {
                                  stackIn_8_0 = this.field_G;

                                  stackIn_8_1 = var5;

                                  if (0 == var6) {
                                    stackIn_9_0 = (char[]) ((Object) stackIn_8_0);
                                    stackIn_9_1 = stackIn_8_1;
                                    stackIn_9_2 = (char)0;
                                    break L7;
                                  } else {
                                    stackIn_9_0 = (char[]) ((Object) stackIn_8_0);
                                    stackIn_9_1 = stackIn_8_1;
                                    stackIn_9_2 = jb.a((byte) var6, (byte) 78);
                                    break L7;
                                  }
                                }
                                stackIn_9_0[stackIn_9_1] = stackIn_9_2;
                                var5++;
                                if (var7 == 0) {
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          if (var7 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L8: {
                      if (3 == param0) {
                        break L8;
                      } else {
                        if (-5 != (param0 ^ -1)) {
                          break L2;
                        } else {
                          this.field_D = true;
                          if (var7 == 0) {
                            break L2;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    var4_int = param1.d((byte) -37);
                    this.field_E = new int[var4_int];
                    this.field_y = new char[var4_int];
                    var5 = 0;
                    L9: while (true) {
                      L10: {
                        if (var4_int <= var5) {
                          break L10;
                        } else {
                          this.field_E[var5] = param1.e(3);
                          var6 = param1.g((byte) -107);
                          if (var7 != 0) {
                            break L1;
                          } else {
                            L11: {
                              stackIn_20_0 = this.field_y;

                              stackIn_20_1 = var5;

                              if (-1 == (var6 ^ -1)) {
                                stackIn_21_0 = (char[]) ((Object) stackIn_20_0);
                                stackIn_21_1 = stackIn_20_1;
                                stackIn_21_2 = (char)0;
                                break L11;
                              } else {
                                stackIn_21_0 = (char[]) ((Object) stackIn_20_0);
                                stackIn_21_1 = stackIn_20_1;
                                stackIn_21_2 = jb.a((byte) var6, (byte) 88);
                                break L11;
                              }
                            }
                            stackIn_21_0[stackIn_21_1] = stackIn_21_2;
                            var5++;
                            if (var7 == 0) {
                              continue L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      if (var7 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_H = param1.c((byte) -38);
                break L2;
              }
              var4_int = 8 % ((2 - param2) / 44);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var4);

            stackIn_28_1 = new StringBuilder().append("ac.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L12;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L12;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ')');
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = client.field_A ? 1 : 0;
                    if (param0 == -1) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    if (this.field_E != null) {
                        statePc = 14;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (this.field_C != null) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 6: {
                    var2 = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if ((var2 ^ -1) > (this.field_C.length ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 10: {
                    this.field_C[var2] = de.b(this.field_C[var2], 32768);
                    var2++;
                    if (var3 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return;
                }
                case 12: {
                    if (var3 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                case 14: {
                    var2 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var2 >= this.field_E.length) {
                        statePc = 28;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.field_E[var2] = de.b(this.field_E[var2], 32768);
                    var2++;
                    if (var3 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return;
                }
                case 18: {
                    if (var3 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (this.field_C == null) {
                        statePc = 27;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var2 = 0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if ((var2 ^ -1) <= (this.field_C.length ^ -1)) {
                        statePc = 27;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    this.field_C[var2] = de.b(this.field_C[var2], 32768);
                    var2++;
                    if (var3 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    return;
                }
                case 24: {
                    if (var3 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    return;
                }
                case 27: {
                    return;
                }
                case 28: {
                    if (this.field_C == null) {
                        statePc = 35;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var2 = 0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if ((var2 ^ -1) <= (this.field_C.length ^ -1)) {
                        statePc = 35;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    this.field_C[var2] = de.b(this.field_C[var2], 32768);
                    var2++;
                    if (var3 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    return;
                }
                case 33: {
                    if (var3 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    return;
                }
                case 35: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ac() {
        this.field_D = false;
    }

    static {
        field_z = new String[]{"Master Challenge: prove your prowess", "Unlock 4 more vibrant and varied themes", "Large bucket: grow shapes to the limit", "Use special items in multiplayer...", "...to turn things around spectacularly!", "Loads of extra Achievements", null, null};
        field_B = 480;
    }
}
