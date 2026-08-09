/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ne {
    static rh field_a;
    pi[] field_c;
    static int[] field_b;
    static fh field_d;

    final int a(int param0, String param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var5 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 0;
                        var6 = 0;
                        var7 = param1.length();
                        var8 = param2;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var7 <= var8) {
                            statePc = 16;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var9 = param1.charAt(var8);
                        var12 = -61;
                        var11 = var9 ^ -1;
                        if (var10 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var11 != var12) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var11 >= var12) {
                            statePc = 19;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = 1;
                        if (var10 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var9 != 62) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = 0;
                        if (var10 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var6 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var9 == 32) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5_int++;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var8++;
                        if (var10 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (0 >= var5_int) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_18_0 = (param3 + -param0 << 1573935784) / var5_int;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0;
                }
                case 19: {
                    try {
                        stackIn_20_0 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return stackIn_20_0;
                }
                case 21: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_23_0 = (RuntimeException) (var5);
                    stackIn_22_0 = stackIn_23_0;
                    stackIn_23_1 = new StringBuilder().append("ne.P(").append(param0).append(',');
                    stackIn_22_1 = stackIn_23_1;
                    if (param1 == null) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_24_2 = "{...}";
                    statePc = 24;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_24_2 = "null";
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    throw pf.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != -84) {
            ne.a((byte) 82);
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    final int a(boolean param0) {
        if (param0) {
          if (null != this.field_c) {
            if ((this.field_c.length ^ -1) >= -1) {
              return 0;
            } else {
              return this.field_c[-1 + this.field_c.length].field_c - this.field_c[0].field_a;
            }
          } else {
            return 0;
          }
        } else {
          field_b = (int[]) null;
          if (null != this.field_c) {
            if ((this.field_c.length ^ -1) >= -1) {
              return 0;
            } else {
              return this.field_c[-1 + this.field_c.length].field_c - this.field_c[0].field_a;
            }
          } else {
            return 0;
          }
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    final int b(int param0, int param1) {
        int var3;
        pi var4;
        int var5;
        int stackIn_7_0 = 0;
        var5 = fleas.field_A ? 1 : 0;
        if (param1 == -1) {
          var3 = 0;
          L0: while (true) {
            if (var3 < this.field_c.length) {
              var4 = this.field_c[var3];
              stackIn_7_0 = param0 ^ -1;

              if (var5 == 0) {
                if (stackIn_7_0 <= (var4.field_d.length ^ -1)) {
                  param0 = param0 - (var4.field_d.length + -1);
                  var3++;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    return this.field_c.length;
                  }
                } else {
                  return var3;
                }
              } else {
                return stackIn_7_0;
              }
            } else {
              return this.field_c.length;
            }
          }
        } else {
          return 33;
        }
    }

    final int b(byte param0) {
        int var2;
        pi[] var3;
        int var4;
        pi var5;
        int var6;
        int var7;
        var7 = fleas.field_A ? 1 : 0;
        if (param0 == 97) {
          var2 = -1;
          if (this.field_c == null) {
            return var2;
          } else {
            var3 = this.field_c;
            var4 = 0;
            L0: while (true) {
              L1: {
                if (var3.length <= var4) {
                  break L1;
                } else {
                  L2: {
                    var5 = var3[var4];
                    if (var5 == null) {
                      break L2;
                    } else {
                      var6 = var5.b((byte) -42);
                      if (var2 >= var6) {
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
          this.a(false);
          var2 = -1;
          if (this.field_c == null) {
            return var2;
          } else {
            var3 = this.field_c;
            var4 = 0;
            L3: while (true) {
              L4: {
                if (var3.length <= var4) {
                  break L4;
                } else {
                  L5: {
                    var5 = var3[var4];
                    if (var5 == null) {
                      break L5;
                    } else {
                      var6 = var5.b((byte) -42);
                      if (var2 >= var6) {
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

    final int a(int param0, int param1, byte param2) {
        int stackIn_21_0 = 0;
        int var4;
        int var5;
        pi var6;
        int var7;
        int var8;
        var8 = fleas.field_A ? 1 : 0;
        if (null != this.field_c) {
          if (this.field_c.length != 0) {
            if (this.field_c[0].field_a > param1) {
              return -1;
            } else {
              if (this.field_c[-1 + this.field_c.length].field_c < param1) {
                return -1;
              } else {
                if ((this.field_c.length ^ -1) != -2) {
                  var4 = 0;
                  if (param2 < -104) {
                    var5 = 0;
                    L0: while (true) {
                      if (var5 < this.field_c.length) {
                        var6 = this.field_c[var5];
                        stackIn_21_0 = var6.field_a ^ -1;

                        if (var8 == 0) {
                          L1: {
                            if (stackIn_21_0 < (param1 ^ -1)) {
                              break L1;
                            } else {
                              if (param1 > var6.field_c) {
                                break L1;
                              } else {
                                var7 = var6.a(6759, param0);
                                if ((var7 ^ -1) != 0) {
                                  return var4 - -var7;
                                } else {
                                  return -1;
                                }
                              }
                            }
                          }
                          var4 = var4 + (-1 + var6.field_d.length);
                          var5++;
                          if (var8 == 0) {
                            continue L0;
                          } else {
                            return -1;
                          }
                        } else {
                          return stackIn_21_0;
                        }
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    return -97;
                  }
                } else {
                  return this.field_c[0].a(6759, param0);
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

    final int c(int param0, int param1) {
        pi[] var3;
        int var4;
        pi var5;
        int var6;
        pi[] var7;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        var6 = fleas.field_A ? 1 : 0;
        var7 = this.field_c;
        var3 = var7;
        if (param0 == -1) {
          var4 = 0;
          L0: while (true) {
            if (var4 < var7.length) {
              var5 = var7[var4];
              stackIn_15_0 = param1;

              if (var6 == 0) {
                if (stackIn_15_0 >= var5.field_d.length) {
                  param1 = param1 - (-1 + var5.field_d.length);
                  var4++;
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    return 0;
                  }
                } else {
                  return var5.field_d[param1];
                }
              } else {
                return stackIn_15_0;
              }
            } else {
              return 0;
            }
          }
        } else {
          field_a = (rh) null;
          var4 = 0;
          L1: while (true) {
            if (var4 < var7.length) {
              var5 = var7[var4];
              stackIn_6_0 = param1;

              if (var6 == 0) {
                if (stackIn_6_0 >= var5.field_d.length) {
                  param1 = param1 - (-1 + var5.field_d.length);
                  var4++;
                  if (var6 == 0) {
                    continue L1;
                  } else {
                    return 0;
                  }
                } else {
                  return var5.field_d[param1];
                }
              } else {
                return stackIn_6_0;
              }
            } else {
              return 0;
            }
          }
        }
    }

    static {
        field_b = new int[256];
        field_d = new fh(0, 2, 2, 1);
    }
}
