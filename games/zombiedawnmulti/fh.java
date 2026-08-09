/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    int[][] field_p;
    static String field_f;
    fc field_i;
    static ja[] field_h;
    int field_r;
    private int[][] field_a;
    int field_c;
    static String field_e;
    boolean[][] field_k;
    private int field_o;
    private qk[] field_q;
    private int[][] field_l;
    static int field_n;
    static cj field_m;
    static String field_d;
    private int field_b;
    static int field_j;
    static String field_g;

    private final qk[] a(boolean param0, qk param1, qk[] param2) {
        qk[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        qk[] var7 = null;
        qk[] stackIn_3_0 = null;
        qk[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!param0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = (qk[]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var7 = new qk[param2.length + 1];
                        var4 = var7;
                        var5 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var5 ^ -1) <= (param2.length ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var7[var5] = param2[var5];
                        var5++;
                        if (var6 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var7[param2.length] = param1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = (qk[]) (var4);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    var4_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_14_0 = (RuntimeException) (var4_ref);
                    stackIn_13_0 = stackIn_14_0;
                    stackIn_14_1 = new StringBuilder().append("fh.B(").append(param0).append(',');
                    stackIn_13_1 = stackIn_14_1;
                    if (param1 == null) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_15_2 = "{...}";
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_15_2 = "null";
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
                    stackIn_16_1 = stackIn_17_1;
                    if (param2 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    throw fa.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        var4 = param2 / 24;
        var5 = param1 / 24;
        var6 = -2 / ((-9 - param0) / 59);
        var7 = 4;
        if (!this.a(var4, (byte) 16, var5)) {
          return false;
        } else {
          L0: {
            var8 = param2 % 24;
            var9 = param1 % 24;
            if ((var4 ^ -1) != -1) {
              stackIn_6_0 = this.a(var4 + -1, (byte) 125, var5) ? 1 : 0;
              break L0;
            } else {
              stackIn_6_0 = 0;
              break L0;
            }
          }
          L1: {
            var10 = stackIn_6_0;
            if ((this.field_i.field_d + -1 ^ -1) == (var4 ^ -1)) {
              stackIn_9_0 = 0;
              break L1;
            } else {
              stackIn_9_0 = this.a(var4 + 1, (byte) 1, var5) ? 1 : 0;
              break L1;
            }
          }
          L2: {
            var11 = stackIn_9_0;
            if ((var5 ^ -1) != (this.field_i.field_e + -1 ^ -1)) {
              stackIn_12_0 = this.a(var4, (byte) 119, 1 + var5) ? 1 : 0;
              break L2;
            } else {
              stackIn_12_0 = 0;
              break L2;
            }
          }
          L3: {
            var12 = stackIn_12_0;
            if (var11 == 0) {
              break L3;
            } else {
              L4: {
                L5: {
                  stackIn_16_0 = var11;

                  if ((var9 ^ -1) > (var7 ^ -1)) {
                    break L5;
                  } else {


                    if (!this.a(1 + var4, (byte) 126, 1 + var5)) {
                      stackIn_18_0 = stackIn_16_0;
                      stackIn_18_1 = 0;
                      break L4;
                    } else {

                      break L5;
                    }
                  }
                }
                stackIn_18_0 = stackIn_16_0;
                stackIn_18_1 = 1;
                break L4;
              }
              var11 = stackIn_18_0 & stackIn_18_1;
              break L3;
            }
          }
          L6: {
            if (var10 == 0) {
              break L6;
            } else {
              L7: {
                L8: {
                  stackIn_23_0 = var10;

                  if (var9 < var7) {
                    break L8;
                  } else {


                    if (!this.a(var4 + -1, (byte) -125, 1 + var5)) {
                      stackIn_25_0 = stackIn_23_0;
                      stackIn_25_1 = 0;
                      break L7;
                    } else {

                      break L8;
                    }
                  }
                }
                stackIn_25_0 = stackIn_23_0;
                stackIn_25_1 = 1;
                break L7;
              }
              var10 = stackIn_25_0 & stackIn_25_1;
              break L6;
            }
          }
          L9: {
            if (var10 != 0) {
              break L9;
            } else {
              if (6 > var8) {
                return false;
              } else {
                break L9;
              }
            }
          }
          L10: {
            if (var11 != 0) {
              break L10;
            } else {
              if ((var8 ^ -1) < -9) {
                return false;
              } else {
                break L10;
              }
            }
          }
          L11: {
            if (var12 != 0) {
              break L11;
            } else {
              if ((var9 ^ -1) >= (var7 ^ -1)) {
                break L11;
              } else {
                return false;
              }
            }
          }
          return true;
        }
    }

    final boolean a(int param0, boolean param1, boolean param2, int param3) {
        int var5 = param0 / 24;
        int var6 = param3 / 24;
        if (-1 < (var5 ^ -1) || (var6 ^ -1) > -1 || (this.field_i.field_e ^ -1) >= (var6 ^ -1) || var5 >= this.field_i.field_d) {
            return false;
        }
        if (!param1) {
            nm var10 = (nm) null;
            this.a(110, false, (nm) null, -115);
        }
        int var7 = param0 % 24;
        int var8 = 1;
        if (param2) {
            if (!(8 >= var7)) {
                var8 = (byte)(var8 | 4);
            }
            if (!(16 <= var7)) {
                var8 = (byte)(var8 | 2);
            }
        }
        int var9 = (byte)(this.field_i.field_k[var6][var5] & 7);
        return (var8 ^ -1) == (var8 & var9 ^ -1) ? true : false;
    }

    final int a(int param0, int param1, int param2, int param3, int param4, boolean param5, boolean param6) {
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        float var8;
        int var9;
        int var10;
        int var11;
        float var12;
        float var13;
        float var14;
        float var15;
        float var16;
        int var17;
        int var18;
        int var19;
        int var20;
        var20 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.a(param1, true, param5, param0)) {
          var8 = 12.0f;
          var9 = -param3 + param1;
          var10 = -param4 + param0;
          var11 = g.b(var10 * var10 + var9 * var9);
          if (var11 == 0) {
            return 0;
          } else {
            L0: {
              var12 = var8 / (float)var11;
              var13 = var12 * (float)var9;
              if (param2 == -17201) {
                break L0;
              } else {
                this.a(54, true, false, 113);
                break L0;
              }
            }
            var14 = (float)var10 * var12;
            var15 = (float)param3;
            var16 = (float)param4;
            var17 = 1;
            var18 = 1;
            var19 = var11;
            L1: while (true) {
              L2: {
                if ((float)var19 <= var8) {
                  break L2;
                } else {
                  var16 = var16 + var14;
                  var15 = var15 + var13;
                  stackIn_27_0 = var18;

                  if (var20 != 0) {
                    return stackIn_27_0;
                  } else {
                    L3: {
                      L4: {
                        if (stackIn_27_0 == 0) {
                          break L4;
                        } else {
                          if (!this.a((int)var15, true, param5, (int)var16)) {
                            break L4;
                          } else {
                            stackIn_14_0 = 1;
                            break L3;
                          }
                        }
                      }
                      stackIn_14_0 = 0;
                      break L3;
                    }
                    L5: {
                      var18 = stackIn_14_0;
                      if (!param6) {
                        if (var18 != 0) {
                          break L5;
                        } else {
                          return -1;
                        }
                      } else {
                        L6: {
                          L7: {
                            if (var17 == 0) {
                              break L7;
                            } else {
                              if (!this.a((int)var15, true, param5, -48 + (int)var16)) {
                                break L7;
                              } else {
                                stackIn_19_0 = 1;
                                break L6;
                              }
                            }
                          }
                          stackIn_19_0 = 0;
                          break L6;
                        }
                        var17 = stackIn_19_0;
                        if (var17 != 0) {
                          break L5;
                        } else {
                          if (var18 == 0) {
                            return -1;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var19 = (int)((float)var19 - var8);
                    if (var20 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              return var11;
            }
          }
        } else {
          return -1;
        }
    }

    final void a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_9_0 = false;
        int stackIn_30_0 = 0;
        boolean stackOut_8_0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (param0 == 48) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    fh.a(true);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    this.field_q = new qk[]{};
                    var2 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    stackIn_4_0 = var2;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (stackIn_4_0 >= this.field_i.field_e) {
                        statePc = 29;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackIn_30_0 = 0;
                    stackIn_6_0 = stackIn_30_0;
                    if (var8 != 0) {
                        statePc = 30;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var3 = stackIn_6_0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (this.field_i.field_d <= var3) {
                        statePc = 28;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackOut_8_0 = this.a(var3, (byte) 5, var2);
                    stackIn_4_0 = stackOut_8_0 ? 1 : 0;
                    stackIn_9_0 = stackOut_8_0;
                    if (var8 != 0) {
                        statePc = 4;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (!stackIn_9_0) {
                        statePc = 27;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (this.a(1 + var3, (byte) 19, var2)) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var8 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var4 = this.a(var3, (byte) -30, var2 + 1) ? 1 : 0;
                    var5 = this.a(var3 + 1, (byte) 127, var2 + 1) ? 1 : 0;
                    var6 = this.a(var3, (byte) 114, var2 - 1) ? 1 : 0;
                    var7 = this.a(1 + var3, (byte) 36, -1 + var2) ? 1 : 0;
                    if (var4 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var5 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.field_q = this.a(false, new qk(24 * var3 - -1, var2 * 24 - -12), this.field_q);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (var4 != 0) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (var5 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.field_q = this.a(false, new qk(-1 + (24 * var3 + 48), 24 * var2 + 12), this.field_q);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (var6 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (var7 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 23: {
                    this.field_q = this.a(false, new qk(1 + 24 * var3, 24 * (var2 - -1) + -12), this.field_q);
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (var6 != 0) {
                        statePc = 27;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var7 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    this.field_q = this.a(false, new qk(47 + var3 * 24, (var2 - -1) * 24 + -12), this.field_q);
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    var3++;
                    if (var8 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var2++;
                    if (var8 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    this.field_a = new int[this.field_q.length][this.field_q.length];
                    stackIn_30_0 = 0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    var9 = stackIn_30_0;
                    var2 = var9;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if ((var9 ^ -1) <= (this.field_q.length ^ -1)) {
                        statePc = 41;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (var8 != 0) {
                        statePc = 41;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var3 = 0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (var3 >= this.field_q.length) {
                        statePc = 38;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    this.field_a[var9][var3] = this.a(this.field_q[var9], this.field_q[var3], (byte) -71);
                    var3++;
                    if (var8 != 0) {
                        statePc = 39;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (var8 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var9++;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (var8 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void c(int param0) {
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        ga var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        ra var12 = null;
        ab var13 = null;
        ga var14 = null;
        ra var15 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var14 = s.field_e;
                        var2 = var14.g(31365);
                        if (param0 == 1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (0 != var2) {
                            statePc = 14;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var11 = da.a(8);
                        var3 = var11;
                        var10 = var11;
                        var4 = var10;
                        var5 = var14;
                        var6 = ((k) ((Object) var5)).g(31365);
                        var7 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var7 ^ -1) <= (var6 ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var10[var7] = ((k) ((Object) var5)).i(-1478490344);
                        var7++;
                        if (var8 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var8 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var12 = (ra) ((Object) so.field_j.c(param0 ^ 60));
                        if (var12 == null) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ak.a((byte) -111);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return;
                }
                case 13: {
                    try {
                        var12.field_h = var11;
                        var12.field_k = true;
                        var12.a(true);
                        if (var8 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (1 == var2) {
                            statePc = 23;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var2 != 2) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var15 = (ra) ((Object) so.field_j.c(param0 ^ 76));
                        if (var15 == null) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ak.a((byte) -128);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return;
                }
                case 20: {
                    try {
                        var15.field_h = da.a(8);
                        var15.field_k = true;
                        var15.a(true);
                        if (var8 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        bd.a("A1: " + ci.a(0), (Throwable) null, false);
                        ak.a((byte) -118);
                        if (var8 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var13 = (ab) ((Object) ig.field_a.c(param0 ^ 73));
                        if (var13 == null) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ak.a((byte) -117);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return;
                }
                case 27: {
                    try {
                        var13.a(true);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var1), "fh.P(" + param0 + ')');
                }
                case 30: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, nm param1) {
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_54_0 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var22 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = (int)(320.0f * param1.field_d - (float)param1.field_k);
                        var4 = (int)(param1.field_d * 240.0f - (float)param1.field_g);
                        var5 = 0;
                        var7 = 44 / ((param0 - 63) / 34);
                        if (var3_int >= -24) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var5 = -(var3_int / 24);
                        var3_int = var3_int % 24;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var6 = 0;
                        if (var4 >= -24) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6 = -(var4 / 24);
                        var4 = var4 % 24;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var8 = var5 - -55;
                        var9 = 41 + var6;
                        var10 = var3_int;
                        var11 = var5;
                        var12 = 0;
                        var14 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var14 >= 41) {
                            statePc = 15;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_16_0 = 0;
                        stackIn_8_0 = stackIn_16_0;
                        if (var22 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var15 = stackIn_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (55 <= var15) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_l[var14][var15] = 0;
                        var15++;
                        if (var22 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var22 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var14++;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var22 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var13 = stackIn_16_0;
                        this.field_o = var5;
                        this.field_b = var6;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_18_0 = var6 ^ -1;
                        stackIn_18_1 = var9 ^ -1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (stackIn_18_0 <= stackIn_18_1) {
                            statePc = 37;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_38_0 = var5 ^ -1;
                        stackIn_20_0 = stackIn_38_0;
                        if (var22 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 <= (var8 ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_18_0 = var5;
                        stackIn_22_0 = stackIn_18_0;
                        stackIn_18_1 = this.field_i.field_d;
                        stackIn_22_1 = stackIn_18_1;
                        if (var22 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 >= stackIn_22_1) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((this.field_i.field_e ^ -1) < (var6 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        oo.e(var3_int, var4, 24, 24, 1);
                        var12++;
                        var3_int += 24;
                        if (var22 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var14 = this.a(var5, var6, (byte) 126);
                        var15 = (var14 & 127) >> -472508992;
                        if (var15 < 0) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((rn.field_a.length ^ -1) >= (var15 ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        rn.field_a[var15].c(var3_int, var4);
                        if (var22 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        oo.e(var3_int, var4, 24, 24, 7631988);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (!qq.field_h) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        qp.field_w.c(Integer.toString(this.field_i.field_k[var6][var5]), 12 + var3_int, 12 + var4, 16777215, 1);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var3_int += 24;
                        this.field_l[var13][var12] = var14;
                        var12++;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var5++;
                        if (var22 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var13++;
                        var4 += 24;
                        var3_int = var10;
                        var12 = 0;
                        var5 = var11;
                        var6++;
                        if (var22 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_38_0 = qq.field_h ? 1 : 0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (stackIn_38_0 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var14 = param1.a(bd.field_g, 2);
                        var15 = param1.a(true, bo.field_d);
                        var16 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((var16 ^ -1) <= (this.field_q.length ^ -1)) {
                            statePc = 53;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var17 = param1.c(this.field_q[var16].field_g, -20126);
                        var18 = param1.d(this.field_q[var16].field_h, 119);
                        stackIn_54_0 = 0;
                        stackIn_42_0 = stackIn_54_0;
                        if (var22 != 0) {
                            statePc = 54;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var19 = stackIn_42_0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((var19 ^ -1) <= (this.field_q.length ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var20 = param1.c(this.field_q[var19].field_g, -20126);
                        var21 = param1.d(this.field_q[var19].field_h, 107);
                        stackIn_49_0 = -1;
                        stackIn_45_0 = stackIn_49_0;
                        stackIn_49_1 = this.field_a[var16][var19] ^ -1;
                        stackIn_45_1 = stackIn_49_1;
                        if (var22 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (stackIn_45_0 <= stackIn_45_1) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        oo.g(var17, var18, var20, var21, 65280, 48);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var19++;
                        if (var22 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_49_0 = -1;
                        stackIn_49_1 = this.a(var15, 113, var14, this.field_q[var16].field_h, this.field_q[var16].field_g);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0 != stackIn_49_1) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var19 = param1.c(var14, -20126);
                        var20 = param1.d(var15, 122);
                        oo.g(var17, var18, var19, var20, 16711680);
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var16++;
                        if (var22 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackIn_54_0 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var16 = stackIn_54_0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if ((var16 ^ -1) <= (this.field_q.length ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var17 = 320 + this.field_q[var16].field_g + -param1.field_k;
                        var18 = -param1.field_g + (this.field_q[var16].field_h + 240);
                        oo.d(var17, var18, 2, 16711680, 256);
                        qp.field_w.b(Integer.toString(var16), var17, var18, 16777215, 0, 64);
                        var16++;
                        if (var22 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var22 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 60: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_62_0 = (RuntimeException) (var3);
                    stackIn_61_0 = stackIn_62_0;
                    stackIn_62_1 = new StringBuilder().append("fh.M(").append(param0).append(',');
                    stackIn_61_1 = stackIn_62_1;
                    if (param1 == null) {
                        statePc = 62;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    stackIn_63_0 = (RuntimeException) ((Object) stackIn_61_0);
                    stackIn_63_1 = (StringBuilder) ((Object) stackIn_61_1);
                    stackIn_63_2 = "{...}";
                    statePc = 63;
                    continue stateLoop;
                }
                case 62: {
                    stackIn_63_0 = (RuntimeException) ((Object) stackIn_62_0);
                    stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
                    stackIn_63_2 = "null";
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    throw fa.a((Throwable) ((Object) stackIn_63_0), stackIn_63_2 + ')');
                }
                case 64: {
                    return;
                }
                case 65: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(qk param0, qk param1, byte param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == -71) {
              stackIn_4_0 = this.a(param0.field_h, -47, param0.field_g, param1.field_h, param1.field_g);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 94;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("fh.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void b(boolean param0) {
        boolean discarded$0 = false;
        this.field_r = 24 * this.field_i.field_d;
        if (!param0) {
            discarded$0 = this.a(-29, (byte) -50, -96);
        }
        this.field_c = this.field_i.field_e * 24;
    }

    final int a(int param0, int param1, byte param2) {
        if (!(-1 >= (param0 ^ -1))) {
            return 0;
        }
        if (!(param1 >= 0)) {
            return 0;
        }
        if ((param1 ^ -1) <= (this.field_i.field_e ^ -1)) {
            return 0;
        }
        if ((this.field_i.field_d ^ -1) >= (param0 ^ -1)) {
            return 0;
        }
        int var4 = 26 / ((param2 - -45) / 48);
        return this.field_i.field_f[param1][param0];
    }

    fh(fc param0) {
        RuntimeException runtimeException = null;
        int[][] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[][] var6 = null;
        int[][] var7 = null;
        int[][] var8 = null;
        int[][] stackIn_3_0 = null;
        int[][] stackIn_8_0 = null;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ZombieDawnMulti.field_E ? 1 : 0;
                    this.field_l = new int[41][55];
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_i = param0;
                        this.a(48);
                        this.b(true);
                        var8 = this.field_i.field_k;
                        var7 = var8;
                        var6 = var7;
                        var2 = var6;
                        this.field_p = new int[var8.length][var8[0].length];
                        var3 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = (int[][]) (var8);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((stackIn_3_0.length ^ -1) >= (var3 ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var5 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var4 >= var8[0].length) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_3_0 = this.field_p;
                        stackIn_8_0 = stackIn_3_0;
                        if (var5 != 0) {
                            statePc = 3;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_10_0 = stackIn_8_0[var3];
                        stackIn_9_0 = stackIn_10_0;
                        stackIn_10_1 = var4;
                        stackIn_9_1 = stackIn_10_1;
                        if ((tq.b(1, var8[var3][var4]) ^ -1) != -1) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_11_0 = (int[]) ((Object) stackIn_9_0);
                        stackIn_11_1 = stackIn_9_1;
                        stackIn_11_2 = 33554432;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = (int[]) ((Object) stackIn_10_0);
                        stackIn_11_1 = stackIn_10_1;
                        stackIn_11_2 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_11_0[stackIn_11_1] = stackIn_11_2;
                        var4++;
                        if (var5 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3++;
                        if (var5 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_k = new boolean[this.field_i.field_e][this.field_i.field_d];
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (runtimeException);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("fh.<init>(");
                    stackIn_16_1 = stackIn_17_1;
                    if (param0 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    throw fa.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final th b(int param0, int param1, int param2, int param3, int param4) {
        int[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int[] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int[] stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_101_0 = 0;
        int stackIn_103_0 = 0;
        int statePc = 0;
        int var6 = 0;
        int var7 = 0;
        qk var8 = null;
        qk var9 = null;
        th var10 = null;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        nm var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = ZombieDawnMulti.field_E ? 1 : 0;
                    var6 = param3 / 24;
                    var7 = param1 / 24;
                    if (!this.a(var6, (byte) 118, var7)) {
                        statePc = 2;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (!this.a(var6, (byte) -25, var7 + -1)) {
                        statePc = 5;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    param1 -= 24;
                    if (var19 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (!this.a(var6, (byte) 32, 1 + var7)) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    param1 += 24;
                    if (var19 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (this.a(var6, (byte) 125, var7 + 2)) {
                        statePc = 15;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (this.a(var6 - -1, (byte) 21, var7)) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (!this.a(var6 - 1, (byte) 116, var7)) {
                        statePc = 16;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    param3 -= 24;
                    if (var19 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    param3 += 24;
                    if (var19 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    param1 += 48;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var7 = param1 / 24;
                    var6 = param3 / 24;
                    if (this.a(var6, (byte) 22, var7)) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return null;
                }
                case 18: {
                    if (this.a(param3, true, true, param1)) {
                        statePc = 24;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (!this.a(var6 - 1, (byte) 122, var7)) {
                        statePc = 23;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (!this.a(1 + var6, (byte) 119, var7)) {
                        statePc = 22;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 22: {
                    param3 = 24 * var6;
                    if (var19 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    param3 = 24 + 24 * var6 + -1;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var8 = new qk(param0, param2);
                    if (param4 == 8760) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var20 = (nm) null;
                    this.a(-105, true, (nm) null, 61);
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    var9 = new qk(param3, param1);
                    var10 = new th();
                    var10.a(var9, false);
                    var11 = this.a(var9, var8, (byte) -71);
                    if (-1 >= (var11 ^ -1)) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    return var10;
                }
                case 29: {
                    var23 = new int[this.field_q.length];
                    var21 = var23;
                    var12 = var21;
                    var24 = new int[this.field_q.length];
                    var22 = var24;
                    var13 = var22;
                    var14 = 0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if ((var23.length ^ -1) >= (var14 ^ -1)) {
                        statePc = 36;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var15 = this.a(var8, this.field_q[var14], (byte) -71);
                    var23[var14] = var15;
                    stackIn_93_0 = (int[]) (var13);
                    stackIn_32_0 = stackIn_93_0;
                    stackIn_93_1 = var14;
                    stackIn_32_1 = stackIn_93_1;
                    if (var19 != 0) {
                        statePc = 93;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackIn_34_0 = (int[]) ((Object) stackIn_32_0);
                    stackIn_33_0 = stackIn_34_0;
                    stackIn_34_1 = stackIn_32_1;
                    stackIn_33_1 = stackIn_34_1;
                    if (-1 >= (var15 ^ -1)) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_35_0 = (int[]) ((Object) stackIn_33_0);
                    stackIn_35_1 = stackIn_33_1;
                    stackIn_35_2 = -2;
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = (int[]) ((Object) stackIn_34_0);
                    stackIn_35_1 = stackIn_34_1;
                    stackIn_35_2 = -1;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    stackIn_35_0[stackIn_35_1] = stackIn_35_2;
                    var14++;
                    if (var19 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var14 = 1;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (var14 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var14 = 0;
                    stackIn_56_0 = 0;
                    stackIn_39_0 = stackIn_56_0;
                    if (var19 != 0) {
                        statePc = 56;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var15 = stackIn_39_0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    stackIn_41_0 = var23.length ^ -1;
                    stackIn_41_1 = var15 ^ -1;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (stackIn_41_0 >= stackIn_41_1) {
                        statePc = 54;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    stackIn_41_0 = var23[var15] ^ -1;
                    stackIn_43_0 = stackIn_41_0;
                    stackIn_41_1 = -1;
                    stackIn_43_1 = stackIn_41_1;
                    if (var19 != 0) {
                        statePc = 41;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (stackIn_43_0 > stackIn_43_1) {
                        statePc = 53;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var16 = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if ((var23.length ^ -1) >= (var16 ^ -1)) {
                        statePc = 53;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    stackIn_41_0 = -1;
                    stackIn_47_0 = stackIn_41_0;
                    stackIn_41_1 = this.field_a[var15][var16];
                    stackIn_47_1 = stackIn_41_1;
                    if (var19 != 0) {
                        statePc = 41;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (stackIn_47_0 == stackIn_47_1) {
                        statePc = 52;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (-1 == var23[var16]) {
                        statePc = 51;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (var23[var15] + this.field_a[var15][var16] >= var23[var16]) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var24 = var22;
                    var14 = 1;
                    var12[var16] = this.field_a[var15][var16] + var23[var15];
                    var24[var16] = var15;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var16++;
                    if (var19 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var15++;
                    if (var19 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (var19 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackIn_56_0 = -1;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    var15 = stackIn_56_0;
                    var16 = -1;
                    var17 = 0;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (var23.length <= var17) {
                        statePc = 66;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var18 = this.a(var9, this.field_q[var17], (byte) -71);
                    stackIn_67_0 = var18 ^ -1;
                    stackIn_59_0 = stackIn_67_0;
                    stackIn_67_1 = -1;
                    stackIn_59_1 = stackIn_67_1;
                    if (var19 != 0) {
                        statePc = 67;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (stackIn_59_0 > stackIn_59_1) {
                        statePc = 65;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (var23[var17] == -1) {
                        statePc = 65;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (0 == (var16 ^ -1)) {
                        statePc = 64;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if ((var16 ^ -1) < (var18 - -var23[var17] ^ -1)) {
                        statePc = 64;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var15 = var17;
                    var16 = var23[var17] + var18;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    var17++;
                    if (var19 == 0) {
                        statePc = 57;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    stackIn_67_0 = -1;
                    stackIn_67_1 = var16;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if (stackIn_67_0 != stackIn_67_1) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    return null;
                }
                case 69: {
                    if (var15 == -1) {
                        statePc = 73;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (var15 != var24[var15]) {
                        statePc = 72;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    return null;
                }
                case 72: {
                    var10.a(-25612, this.field_q[var15].a(30544));
                    var15 = var24[var15];
                    if (var19 == 0) {
                        statePc = 69;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    return var10;
                }
                case 75: {
                    if (var23[var15] + this.field_a[var15][var16] >= var23[var16]) {
                        statePc = 80;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var24 = var22;
                    var14 = 1;
                    var12[var16] = this.field_a[var15][var16] + var23[var15];
                    var24[var16] = var15;
                    statePc = 80;
                    continue stateLoop;
                }
                case 78: {
                    if (-1 == var23[var16]) {
                        statePc = 77;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var16++;
                    if (var19 == 0) {
                        statePc = 86;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (stackIn_82_0 == stackIn_82_1) {
                        statePc = 80;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 84: {
                    stackIn_98_0 = -1;
                    stackIn_85_0 = stackIn_98_0;
                    stackIn_98_1 = this.field_a[var15][var16];
                    stackIn_85_1 = stackIn_98_1;
                    if (var19 != 0) {
                        statePc = 98;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    stackIn_82_0 = stackIn_85_0;
                    stackIn_82_1 = stackIn_85_1;
                    statePc = 82;
                    continue stateLoop;
                }
                case 86: {
                    if ((var23.length ^ -1) >= (var16 ^ -1)) {
                        statePc = 89;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var16 = 0;
                    statePc = 86;
                    continue stateLoop;
                }
                case 89: {
                    var15++;
                    if (var19 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (stackIn_91_0 > stackIn_91_1) {
                        statePc = 89;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 93: {
                    stackIn_98_0 = stackIn_93_0[stackIn_93_1] ^ -1;
                    stackIn_94_0 = stackIn_98_0;
                    stackIn_98_1 = -1;
                    stackIn_94_1 = stackIn_98_1;
                    if (var19 != 0) {
                        statePc = 98;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    stackIn_91_0 = stackIn_94_0;
                    stackIn_91_1 = stackIn_94_1;
                    statePc = 91;
                    continue stateLoop;
                }
                case 95: {
                    stackIn_93_0 = (int[]) (var23);
                    stackIn_93_1 = var15;
                    statePc = 93;
                    continue stateLoop;
                }
                case 96: {
                    if (var19 == 0) {
                        statePc = 104;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (stackIn_98_0 >= stackIn_98_1) {
                        statePc = 96;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 100: {
                    stackIn_98_0 = var23.length ^ -1;
                    stackIn_98_1 = var15 ^ -1;
                    statePc = 98;
                    continue stateLoop;
                }
                case 101: {
                    var15 = stackIn_101_0;
                    statePc = 100;
                    continue stateLoop;
                }
                case 102: {
                    var14 = 0;
                    stackIn_56_0 = 0;
                    stackIn_103_0 = stackIn_56_0;
                    if (var19 != 0) {
                        statePc = 56;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    stackIn_101_0 = stackIn_103_0;
                    statePc = 101;
                    continue stateLoop;
                }
                case 104: {
                    if (var14 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void b(int param0) {
        ee.field_b = false;
        if (null != mj.field_Ib) {
            mj.field_Ib.c((byte) 123);
        }
        if (!(0 == va.field_a)) {
            pf.a(89);
        }
        ti.field_Y = 0;
        if (param0 != 31706) {
            fh.b(-67);
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        if (!(param0 >= 0)) {
            return false;
        }
        if (0 > param2) {
            return false;
        }
        if (!((param2 ^ -1) > (this.field_i.field_e ^ -1))) {
            return false;
        }
        int var4 = -18 / ((74 - param1) / 37);
        if (!(param0 < this.field_i.field_d)) {
            return false;
        }
        return 0 != (1 & this.field_i.field_k[param2][param0]) ? true : false;
    }

    final int[][] d(int param0) {
        int[][] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[][] stackIn_7_0 = null;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int[][] stackIn_13_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (param0 > 21) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_o = -62;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var2 = new int[this.field_i.field_e][this.field_i.field_d];
                    var3 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var3 >= this.field_i.field_e) {
                        statePc = 12;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var4 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if ((var4 ^ -1) <= (this.field_i.field_d ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    stackIn_13_0 = (int[][]) (var2);
                    stackIn_7_0 = stackIn_13_0;
                    if (var5 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackIn_9_0 = stackIn_7_0[var3];
                    stackIn_8_0 = stackIn_9_0;
                    stackIn_9_1 = var4;
                    stackIn_8_1 = stackIn_9_1;
                    if (this.a(var4, (byte) -71, var3)) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_10_0 = (int[]) ((Object) stackIn_8_0);
                    stackIn_10_1 = stackIn_8_1;
                    stackIn_10_2 = -1;
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    stackIn_10_0 = (int[]) ((Object) stackIn_9_0);
                    stackIn_10_1 = stackIn_9_1;
                    stackIn_10_2 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    stackIn_10_0[stackIn_10_1] = stackIn_10_2;
                    var4++;
                    if (var5 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var3++;
                    if (var5 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return var2;
                }
                case 13: {
                    return stackIn_13_0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 85 % ((33 - param1) / 62);
        return this.a(param0, param2, -17201, param4, param3, true, false);
    }

    final void a(int param0, boolean param1, nm param2, int param3) {
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_93_0 = 0;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        ja var15 = null;
        ja var16 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = (int)((float)(-param2.field_k) + 320.0f * param2.field_d);
                        if ((var5_int ^ -1) > 23) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5_int = var5_int % 24;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6 = (int)((float)(-param2.field_g) + param2.field_d * 240.0f);
                        if (23 >= (var6 ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var6 = var6 % 24;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var7 = var5_int;
                        var8 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = var8 ^ -1;
                        stackIn_8_1 = -42;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 <= stackIn_8_1) {
                            statePc = 92;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_93_0 = 0;
                        stackIn_10_0 = stackIn_93_0;
                        if (var14 != 0) {
                            statePc = 93;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var9 = stackIn_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var9 >= 55) {
                            statePc = 91;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_8_0 = var9 + this.field_o ^ -1;
                        stackIn_13_0 = stackIn_8_0;
                        stackIn_8_1 = this.field_k[0].length ^ -1;
                        stackIn_13_1 = stackIn_8_1;
                        if (var14 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 <= stackIn_13_1) {
                            statePc = 90;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((this.field_k.length ^ -1) < (var8 + this.field_b ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var14 == 0) {
                            statePc = 90;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var10 = this.field_l[var8][var9];
                        if ((param0 ^ -1) != -2) {
                            statePc = 46;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (!this.field_k[var8 + this.field_b][var9 - -this.field_o]) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var5_int += 24;
                        if (var14 == 0) {
                            statePc = 90;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var11 = ((var10 & 65408) >> -255187513) + -1;
                        if (var11 < 0) {
                            statePc = 45;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((var11 ^ -1) > (od.field_Ab.length ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (param1) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        oo.e(var5_int, var6, 24, 24, 16711935);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var15 = od.field_Ab[var11];
                        var16 = var15;
                        var16 = var15;
                        if (!this.field_k[var8 + this.field_b][this.field_o + var9]) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var15.c(var5_int, var6, 128);
                        if (var14 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (0 >= (1073741824 & var10)) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (0 < (536870912 & var10)) {
                            statePc = 41;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (0 >= (var10 & 1073741824)) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var15.b(var5_int, var6);
                        if (var14 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((var10 & 536870912) > 0) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var15.g(var5_int, var6);
                        if (var14 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var15.a(var5_int, var6);
                        if (var14 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var15.d(var5_int, var6);
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (!po.field_p) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (-1 == (var10 & 33554432 ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        oo.f(var5_int, var6, 24, 24, 8425216, 96);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var14 == 0) {
                            statePc = 89;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (param0 == 2) {
                            statePc = 76;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (-4 == (param0 ^ -1)) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((-2147483648 & var10) != 0) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (param1) {
                            statePc = 69;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (-1 != (var10 & 67108864 ^ -1)) {
                            statePc = 55;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        oo.f(var5_int, var6, 24, 24, 0, 128);
                        if (var14 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var11 = -1;
                        var12 = 511 & var10 >> 397339975;
                        var13 = var10 >> 1417821520 & 511;
                        if (var13 < 9) {
                            statePc = 58;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var13 > 32) {
                            statePc = 58;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var11 = -9 + var13;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if ((var12 ^ -1) > -10) {
                            statePc = 61;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (-33 > (var12 ^ -1)) {
                            statePc = 61;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var11 = var12 - 9;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if ((var13 ^ -1) != -30) {
                            statePc = 63;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var11 = 9;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (0 > var11) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var11 >= ne.field_Ab.length) {
                            statePc = 67;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        ne.field_Ab[var11].c(var5_int, var6, 128);
                        if (var14 == 0) {
                            statePc = 68;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        oo.f(var5_int, var6, 24, 24, 0, 128);
                        ne.field_Ab[21].c(var5_int, var6 - -24, 128);
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (var14 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if ((67108864 & var10 ^ -1) == -1) {
                            statePc = 72;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        oo.f(var5_int, var6, 24, 24, 65280, 128);
                        if (var14 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        oo.f(var5_int, var6, 24, 24, 16711935, 128);
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (!wh.field_c) {
                            statePc = 89;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        oo.a(var5_int, var6, 25, 25, 7864183);
                        if (var14 == 0) {
                            statePc = 89;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (this.field_k[var8 - -this.field_b][this.field_o + var9]) {
                            statePc = 78;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var5_int += 24;
                        if (var14 == 0) {
                            statePc = 90;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var11 = -1 + ((var10 & 33488896) >> 14387344);
                        if (-1 < (var11 ^ -1)) {
                            statePc = 89;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (var11 < od.field_Ab.length) {
                            statePc = 82;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var16 = od.field_Ab[var11];
                        if (-1 > (268435456 & var10 ^ -1)) {
                            statePc = 88;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if ((var10 & 134217728) > 0) {
                            statePc = 86;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var16.g(var5_int, var6);
                        if (var14 == 0) {
                            statePc = 89;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var16.a(var5_int, var6);
                        if (var14 == 0) {
                            statePc = 89;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var16.b(var5_int, var6);
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var5_int += 24;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var9++;
                        if (var14 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var5_int = var7;
                        var6 += 24;
                        var8++;
                        if (var14 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        stackIn_93_0 = param3;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (stackIn_93_0 == -1) {
                            statePc = 100;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        this.a(-106, false, true, 19);
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 96: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_98_0 = (RuntimeException) (var5);
                    stackIn_97_0 = stackIn_98_0;
                    stackIn_98_1 = new StringBuilder().append("fh.E(").append(param0).append(',').append(param1).append(',');
                    stackIn_97_1 = stackIn_98_1;
                    if (param2 == null) {
                        statePc = 98;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    stackIn_99_0 = (RuntimeException) ((Object) stackIn_97_0);
                    stackIn_99_1 = (StringBuilder) ((Object) stackIn_97_1);
                    stackIn_99_2 = "{...}";
                    statePc = 99;
                    continue stateLoop;
                }
                case 98: {
                    stackIn_99_0 = (RuntimeException) ((Object) stackIn_98_0);
                    stackIn_99_1 = (StringBuilder) ((Object) stackIn_98_1);
                    stackIn_99_2 = "null";
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    throw fa.a((Throwable) ((Object) stackIn_99_0), stackIn_99_2 + ',' + param3 + ')');
                }
                case 100: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_e = null;
        field_g = null;
        field_h = null;
        field_f = null;
        field_m = null;
        if (!param0) {
            field_n = -16;
        }
    }

    static {
        field_f = "<%0> has left the lobby.";
        field_j = 0;
        field_e = "Use this on a zombie or area to disrupt an ongoing effect. Thwart your enemies' evil plans!";
        field_g = "";
        field_d = "<%0>/<%1>";
    }
}
