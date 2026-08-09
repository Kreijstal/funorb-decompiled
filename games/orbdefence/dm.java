/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dm {
    ed[] field_c;
    static hj[] field_b;
    static int[] field_g;
    static int field_a;
    static int field_e;
    static int field_f;
    static char[] field_d;

    final int a(int param0, byte param1) {
        int var3;
        ed var4;
        int var5;
        int stackIn_7_0 = 0;
        L0: {
          var5 = OrbDefence.field_D ? 1 : 0;
          if (param1 == 107) {
            break L0;
          } else {
            dm.a(43, -63, -39);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (this.field_c.length > var3) {
            var4 = this.field_c[var3];
            stackIn_7_0 = var4.field_g.length;

            if (var5 == 0) {
              if (stackIn_7_0 > param0) {
                return var3;
              } else {
                param0 = param0 - (var4.field_g.length + -1);
                var3++;
                if (var5 == 0) {
                  continue L1;
                } else {
                  return this.field_c.length;
                }
              }
            } else {
              return stackIn_7_0;
            }
          } else {
            return this.field_c.length;
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 != 1) {
          dm.a(-96, -106, true, 45, 11, -128, -46);
          lm.field_a = param2;
          kf.field_e = param1;
          return;
        } else {
          lm.field_a = param2;
          kf.field_e = param1;
          return;
        }
    }

    final int b(int param0) {
        if (param0 > 105) {
          if (null != this.field_c) {
            if (0 >= this.field_c.length) {
              return 0;
            } else {
              return -this.field_c[0].field_f + this.field_c[-1 + this.field_c.length].field_c;
            }
          } else {
            return 0;
          }
        } else {
          dm.a(-11, -7, false, 50, 72, -55, -61);
          if (null != this.field_c) {
            if (0 >= this.field_c.length) {
              return 0;
            } else {
              return -this.field_c[0].field_f + this.field_c[-1 + this.field_c.length].field_c;
            }
          } else {
            return 0;
          }
        }
    }

    final int a(int param0, int param1) {
        ed[] var3;
        int var4;
        ed var5;
        int var6;
        int stackIn_6_0 = 0;
        L0: {
          var6 = OrbDefence.field_D ? 1 : 0;
          var3 = this.field_c;
          var4 = 0;
          if (param0 <= -68) {
            break L0;
          } else {
            dm.a(-22);
            break L0;
          }
        }
        L1: while (true) {
          if (var4 < var3.length) {
            var5 = var3[var4];
            stackIn_6_0 = var5.field_g.length ^ -1;

            if (var6 == 0) {
              if (stackIn_6_0 >= (param1 ^ -1)) {
                param1 = param1 - (-1 + var5.field_g.length);
                var4++;
                if (var6 == 0) {
                  continue L1;
                } else {
                  return 0;
                }
              } else {
                return var5.field_g[param1];
              }
            } else {
              return stackIn_6_0;
            }
          } else {
            return 0;
          }
        }
    }

    final int a(int param0, int param1, byte param2) {
        int var4;
        int var5;
        int var6;
        ed var6_ref_ed;
        int var7;
        int var8;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        if (this.field_c != null) {
          if (-1 != (this.field_c.length ^ -1)) {
            if (this.field_c[0].field_f > param0) {
              return -1;
            } else {
              if (this.field_c[-1 + this.field_c.length].field_c < param0) {
                return -1;
              } else {
                if (this.field_c.length == 1) {
                  return this.field_c[0].a(param1, -1052047551);
                } else {
                  var4 = 0;
                  var5 = 0;
                  L0: while (true) {
                    if (var5 < this.field_c.length) {
                      var6_ref_ed = this.field_c[var5];
                      stackIn_20_0 = param0 ^ -1;

                      stackIn_20_1 = var6_ref_ed.field_f ^ -1;

                      if (var8 == 0) {
                        L1: {
                          if (stackIn_20_0 > stackIn_20_1) {
                            break L1;
                          } else {
                            if (var6_ref_ed.field_c >= param0) {
                              var7 = var6_ref_ed.a(param1, -1052047551);
                              if (0 != (var7 ^ -1)) {
                                return var7 + var4;
                              } else {
                                return -1;
                              }
                            } else {
                              break L1;
                            }
                          }
                        }
                        var4 = var4 + (var6_ref_ed.field_g.length - 1);
                        var5++;
                        if (var8 == 0) {
                          continue L0;
                        } else {
                          var6 = -37 % ((73 - param2) / 44);
                          return -1;
                        }
                      } else {
                        var6 = stackIn_20_0 % stackIn_20_1;
                        return -1;
                      }
                    } else {
                      var6 = -37 % ((73 - param2) / 44);
                      return -1;
                    }
                  }
                }
              }
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final int a(boolean param0) {
        int var2;
        ed[] var3;
        int var4;
        ed var5;
        int var6;
        int var7;
        var7 = OrbDefence.field_D ? 1 : 0;
        if (!param0) {
          var2 = -1;
          if (null == this.field_c) {
            return var2;
          } else {
            var3 = this.field_c;
            var4 = 0;
            L0: while (true) {
              L1: {
                if (var4 >= var3.length) {
                  break L1;
                } else {
                  L2: {
                    var5 = var3[var4];
                    if (var5 == null) {
                      break L2;
                    } else {
                      var6 = var5.a(param0);
                      if (var6 <= var2) {
                        break L2;
                      } else {
                        var2 = var6;
                        break L2;
                      }
                    }
                  }
                  var4++;
                  if (var7 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              return var2;
            }
          }
        } else {
          field_a = 108;
          var2 = -1;
          if (null == this.field_c) {
            return var2;
          } else {
            var3 = this.field_c;
            var4 = 0;
            L3: while (true) {
              L4: {
                if (var4 >= var3.length) {
                  break L4;
                } else {
                  L5: {
                    var5 = var3[var4];
                    if (var5 == null) {
                      break L5;
                    } else {
                      var6 = var5.a(param0);
                      if (var6 <= var2) {
                        break L5;
                      } else {
                        var2 = var6;
                        break L5;
                      }
                    }
                  }
                  var4++;
                  if (var7 == 0) {
                    continue L3;
                  } else {
                    break L4;
                  }
                }
              }
              return var2;
            }
          }
        }
    }

    final int a(String param0, int param1, int param2, byte param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var5 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 0;
                        var6 = 0;
                        var7 = param0.length();
                        if (param3 == 74) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_b = (hj[]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var8 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var8 >= var7) {
                            statePc = 17;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var9 = param0.charAt(var8);
                        var12 = var9;
                        var11 = 60;
                        if (var10 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var11 != var12) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var11 >= var12) {
                            statePc = 20;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = 1;
                        if (var10 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var9 != 62) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6 = 0;
                        if (var10 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var6 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var9 != 32) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var5_int++;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var8++;
                        if (var10 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (0 >= var5_int) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_19_0 = (param1 - param2 << 403695336) / var5_int;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return stackIn_19_0;
                }
                case 20: {
                    try {
                        stackIn_21_0 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0;
                }
                case 22: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_24_0 = (RuntimeException) (var5);
                    stackIn_23_0 = stackIn_24_0;
                    stackIn_24_1 = new StringBuilder().append("dm.A(");
                    stackIn_23_1 = stackIn_24_1;
                    if (param0 == null) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_25_2 = "{...}";
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_25_2 = "null";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    throw dd.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int incrementValue$0 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_14_0 = false;
        boolean stackIn_23_0 = false;
        int stackIn_26_0 = 0;
        int stackIn_36_0 = 0;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_13_0;
        boolean stackOut_22_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 > param5) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (param5 + 1 < param4) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        if (5 + param5 >= param4) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param1 == param3) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var7_int = -1 + param4;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_10_0 = param5 ^ -1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 <= (var7_int ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var8 = param5;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var8 >= var7_int) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9 = bc.field_o[var8];
                        var10 = bc.field_o[1 + var8];
                        stackOut_13_0 = hl.a(param2, -122, var10, var9);
                        stackIn_10_0 = stackOut_13_0 ? 1 : 0;
                        stackIn_14_0 = stackOut_13_0;
                        if (var15 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        bc.field_o[var8] = var10;
                        bc.field_o[1 + var8] = var9;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var8++;
                        if (var15 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var7_int--;
                        if (var15 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return;
                }
                case 20: {
                    try {
                        var7_int = (param1 >> -1303985887) - (-(param3 >> 273542273) + -(1 & (param1 & param3)));
                        var8 = param5;
                        var9 = param3;
                        var10 = param1;
                        var11 = -75 % ((-46 - param6) / 49);
                        var12 = param5;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (param4 <= var12) {
                            statePc = 35;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var13 = bc.field_o[var12];
                        stackOut_22_0 = param2;
                        stackIn_36_0 = stackOut_22_0 ? 1 : 0;
                        stackIn_23_0 = stackOut_22_0;
                        if (var15 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (!stackIn_23_0) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_26_0 = tl.field_d[var13];
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = rh.field_c[var13];
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var14 = stackIn_26_0;
                        if (var14 > var7_int) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var10 < var14) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var10 = var14;
                        if (var15 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        bc.field_o[var12] = bc.field_o[var8];
                        if (var14 < var9) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9 = var14;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        incrementValue$0 = var8;
                        var8++;
                        bc.field_o[incrementValue$0] = var13;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var12++;
                        if (var15 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        dm.a(param0, var9, param2, param3, var8, param5, 28);
                        stackIn_36_0 = param0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        dm.a(stackIn_36_0, param1, param2, var10, param4, var8, 126);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 38: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) var7), "dm.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
                }
                case 39: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_g = (int[]) null;
          field_b = null;
          field_d = null;
          field_g = null;
          return;
        } else {
          field_b = null;
          field_d = null;
          field_g = null;
          return;
        }
    }

    static {
        field_d = new char[]{(char)91, (char)93, (char)35};
        field_g = new int[16384];
    }
}
