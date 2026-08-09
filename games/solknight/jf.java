/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jf {
    le[] field_c;
    static bc field_a;
    static String field_b;

    final int a(int param0, int param1, int param2, String param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var5 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 == 21107) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var11 = (String) null;
                        this.a(-66, 103, -92, (String) null);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5_int = 0;
                        var6 = 0;
                        var7 = param3.length();
                        var8 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var7 <= var8) {
                            statePc = 18;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var9 = param3.charAt(var8);
                        var13 = -61;
                        var12 = var9 ^ -1;
                        if (var10 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var12 != var13) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var12 >= var13) {
                            statePc = 21;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = 1;
                        if (var10 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var9 == 62) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var6 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var9 == 32) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var5_int++;
                        if (var10 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var6 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var8++;
                        if (var10 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (0 >= var5_int) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = (-param0 + param1 << 439492808) / var5_int;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return stackIn_20_0;
                }
                case 21: {
                    try {
                        stackIn_22_0 = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    return stackIn_22_0;
                }
                case 23: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_25_0 = (RuntimeException) (var5);
                    stackIn_24_0 = stackIn_25_0;
                    stackIn_25_1 = new StringBuilder().append("jf.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_24_1 = stackIn_25_1;
                    if (param3 == null) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_26_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_26_2 = "{...}";
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
                    stackIn_26_2 = "null";
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    throw fc.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, int param1, int param2) {
        int stackIn_20_0 = 0;
        int var4;
        int var5;
        int var7;
        int var8;
        le var11;
        var8 = SolKnight.field_L ? 1 : 0;
        if (this.field_c != null) {
          if (0 != this.field_c.length) {
            if (param1 < this.field_c[0].field_g) {
              return -1;
            } else {
              if (param1 <= this.field_c[this.field_c.length - 1].field_e) {
                if (1 != this.field_c.length) {
                  if (param0 == -2592) {
                    var4 = 0;
                    var5 = 0;
                    L0: while (true) {
                      if (var5 < this.field_c.length) {
                        var11 = this.field_c[var5];
                        stackIn_20_0 = var11.field_g;

                        if (var8 == 0) {
                          L1: {
                            if (stackIn_20_0 > param1) {
                              break L1;
                            } else {
                              if (var11.field_e >= param1) {
                                var7 = var11.a(param2, false);
                                if (var7 != -1) {
                                  return var7 + var4;
                                } else {
                                  return -1;
                                }
                              } else {
                                break L1;
                              }
                            }
                          }
                          var4 = var4 + (var11.field_c.length - 1);
                          var5++;
                          if (var8 == 0) {
                            continue L0;
                          } else {
                            return -1;
                          }
                        } else {
                          return stackIn_20_0;
                        }
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    return -51;
                  }
                } else {
                  return this.field_c[0].a(param2, false);
                }
              } else {
                return -1;
              }
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final int a(int param0, int param1) {
        le[] var3;
        int var4;
        le var5;
        int var6;
        le[] var7;
        int stackIn_5_0 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        var7 = this.field_c;
        var3 = var7;
        var4 = param0;
        L0: while (true) {
          if (var7.length > var4) {
            var5 = var7[var4];
            stackIn_5_0 = var5.field_c.length ^ -1;

            if (var6 == 0) {
              if (stackIn_5_0 < (param1 ^ -1)) {
                return var5.field_c[param1];
              } else {
                param1 = param1 - (var5.field_c.length - 1);
                var4++;
                if (var6 == 0) {
                  continue L0;
                } else {
                  return 0;
                }
              }
            } else {
              return stackIn_5_0;
            }
          } else {
            return 0;
          }
        }
    }

    final int b(int param0) {
        int var2;
        le[] var3;
        int var4;
        le var5;
        int var6;
        int var7;
        var7 = SolKnight.field_L ? 1 : 0;
        var2 = -1;
        if (null != this.field_c) {
          var3 = this.field_c;
          var4 = 0;
          L0: while (true) {
            if (var3.length > var4) {
              var5 = var3[var4];
              if (var7 == 0) {
                L1: {
                  if (var5 != null) {
                    var6 = var5.a((byte) 110);
                    if (var2 < var6) {
                      var2 = var6;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                var4++;
                if (var7 == 0) {
                  continue L0;
                } else {
                  if (param0 == 62) {
                    return var2;
                  } else {
                    this.a((byte) 22);
                    return var2;
                  }
                }
              } else {
                return var2;
              }
            } else {
              if (param0 != 62) {
                this.a((byte) 22);
                return var2;
              } else {
                return var2;
              }
            }
          }
        } else {
          if (param0 != 62) {
            this.a((byte) 22);
            return var2;
          } else {
            return var2;
          }
        }
    }

    final int a(byte param0) {
        int var2;
        int stackIn_3_0 = 0;
        var2 = 5 % ((60 - param0) / 43);
        if (this.field_c != null) {
          if (this.field_c.length <= 0) {
            return 0;
          } else {
            return -this.field_c[0].field_g + this.field_c[this.field_c.length + -1].field_e;
          }
        } else {
          stackIn_3_0 = 0;
          return stackIn_3_0;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -25616) {
            field_b = (String) null;
        }
    }

    final int a(byte param0, int param1) {
        int var3;
        le var4;
        int var5;
        int var6;
        int var7;
        var5 = SolKnight.field_L ? 1 : 0;
        var3 = 0;
        L0: while (true) {
          L1: {
            if (this.field_c.length <= var3) {
              break L1;
            } else {
              var4 = this.field_c[var3];
              var7 = param1 ^ -1;
              var6 = var4.field_c.length ^ -1;
              if (var5 != 0) {
                if (var6 > var7) {
                  field_b = (String) null;
                  return this.field_c.length;
                } else {
                  return this.field_c.length;
                }
              } else {
                if (var6 >= var7) {
                  param1 = param1 - (var4.field_c.length - 1);
                  var3++;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                } else {
                  return var3;
                }
              }
            }
          }
          if (param0 > -87) {
            field_b = (String) null;
            return this.field_c.length;
          } else {
            return this.field_c.length;
          }
        }
    }

    static {
    }
}
