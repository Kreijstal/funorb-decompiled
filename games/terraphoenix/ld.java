/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ld {
    static int field_d;
    static int[] field_a;
    static int field_e;
    static ci field_c;
    static int[] field_h;
    static boolean field_b;
    em[] field_f;
    static String field_g;

    final int c(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 5859) {
              L1: {
                L2: {
                  if (this.field_f == null) {
                    break L2;
                  } else {
                    if (0 < this.field_f.length) {
                      stackIn_10_0 = this.field_f[-1 + this.field_f.length].field_a - this.field_f[0].field_e;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_10_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -6;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2), "ld.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_10_0;
        }
    }

    final static int a(char param0, CharSequence param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param2 >= 117) {
                break L1;
              } else {
                ld.a((byte) 70, (String) null);
                break L1;
              }
            }
            var3_int = 0;
            var4 = param1.length();
            var5 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var5 >= var4) {
                    break L4;
                  } else {
                    stackIn_14_0 = param0 ^ -1;

                    if (var6 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_14_0 != (param1.charAt(var5) ^ -1)) {
                          break L5;
                        } else {
                          var3_int++;
                          break L5;
                        }
                      }
                      var5++;
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackIn_14_0 = var3_int;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("ld.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
        }
        return stackIn_14_0;
    }

    final int a(String param0, boolean param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 0;
                        var6 = 0;
                        var7 = param0.length();
                        var8 = 0;
                        if (param1) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 100;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        if (var7 <= var8) {
                            statePc = 24;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var9 = param0.charAt(var8);
                        stackIn_25_0 = var9;
                        stackIn_6_0 = stackIn_25_0;
                        stackIn_25_1 = 60;
                        stackIn_6_1 = stackIn_25_1;
                        if (var10 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 == stackIn_6_1) {
                            statePc = 22;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var9 ^ -1) != -63) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6 = 0;
                        if (var10 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var6 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((var9 ^ -1) == -33) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var5_int++;
                        if (var10 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var6 = 1;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var8++;
                        if (var10 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_25_0 = 0;
                        stackIn_25_1 = var5_int;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 < stackIn_25_1) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = (param2 - param3 << -96498200) / var5_int;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    return stackIn_28_0;
                }
                case 29: {
                    try {
                        stackIn_30_0 = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    return stackIn_30_0;
                }
                case 31: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_34_0 = (RuntimeException) (var5);
                    stackIn_32_0 = stackIn_34_0;
                    stackIn_34_1 = new StringBuilder().append("ld.F(");
                    stackIn_32_1 = stackIn_34_1;
                    if (param0 == null) {
                        statePc = 34;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_35_1 = (StringBuilder) ((Object) stackIn_32_1);
                    stackIn_35_2 = "{...}";
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
                    stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
                    stackIn_35_2 = "null";
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    throw qk.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, int param1) {
        em[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        em var5 = null;
        int var6 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            var3 = this.field_f;
            var4 = param1;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var3.length ^ -1) >= (var4 ^ -1)) {
                    break L3;
                  } else {
                    var5 = var3[var4];
                    stackIn_13_0 = var5.field_d.length;

                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (stackIn_13_0 > param0) {
                        stackIn_10_0 = var5.field_d[param0];
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        param0 = param0 - (var5.field_d.length + -1);
                        var4++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackIn_13_0 = 0;
                break L2;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var3_ref), "ld.I(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0;
        } else {
          return stackIn_10_0;
        }
    }

    public static void a(byte param0) {
        try {
            field_g = null;
            field_h = null;
            int var1_int = -77 % ((param0 - -56) / 34);
            field_c = null;
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "ld.D(" + param0 + ')');
        }
    }

    final int b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        em[] var3 = null;
        int var4 = 0;
        em var5 = null;
        int var6 = 0;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                var2_int = -1;
                if (null != this.field_f) {
                  var3 = this.field_f;
                  var4 = 0;
                  L2: while (true) {
                    if ((var3.length ^ -1) >= (var4 ^ -1)) {
                      break L1;
                    } else {
                      L3: {
                        var5 = var3[var4];
                        if (null == var5) {
                          break L3;
                        } else {
                          var6 = var5.b(-1);
                          if ((var6 ^ -1) < (var2_int ^ -1)) {
                            var2_int = var6;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var4++;
                      if (var7 == 0) {
                        continue L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
              stackIn_16_0 = var2_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = 25;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2), "ld.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_16_0;
        }
    }

    final int b(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        em var4 = null;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            var3_int = param1;
            L1: while (true) {
              L2: {
                L3: {
                  if (this.field_f.length <= var3_int) {
                    break L3;
                  } else {
                    var4 = this.field_f[var3_int];
                    stackIn_11_0 = var4.field_d.length ^ -1;

                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (stackIn_11_0 >= (param0 ^ -1)) {
                        param0 = param0 - (-1 + var4.field_d.length);
                        var3_int++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        stackIn_8_0 = var3_int;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
                stackIn_11_0 = this.field_f.length;
                break L2;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var3), "ld.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return stackIn_8_0;
        }
    }

    final static void a(byte param0, String param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              fg.field_e = param1;
              bm.a(12, (byte) 1);
              if (param0 == -29) {
                break L1;
              } else {
                ld.a((byte) 95, (String) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("ld.E(").append(param0).append(',');

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
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static void a(int param0) {
        try {
            hl.a((byte) -93, (String) null, "");
            if (param0 != 1) {
                field_d = -10;
            }
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "ld.G(" + param0 + ')');
        }
    }

    final int a(int param0, int param1, int param2) {
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        em var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (null == this.field_f) {
                break L1;
              } else {
                if (-1 == (this.field_f.length ^ -1)) {
                  break L1;
                } else {
                  if (param2 < this.field_f[0].field_e) {
                    break L1;
                  } else {
                    if ((param2 ^ -1) < (this.field_f[this.field_f.length - 1].field_a ^ -1)) {
                      stackIn_16_0 = -1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L2: {
                        if (param1 == -1) {
                          break L2;
                        } else {
                          this.a(106, 85);
                          break L2;
                        }
                      }
                      if (1 == this.field_f.length) {
                        stackIn_24_0 = this.field_f[0].a(param0, -119);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var4_int = 0;
                        var5 = 0;
                        L3: while (true) {
                          L4: {
                            L5: {
                              if ((this.field_f.length ^ -1) >= (var5 ^ -1)) {
                                break L5;
                              } else {
                                var6 = this.field_f[var5];
                                stackIn_45_0 = param2 ^ -1;

                                if (var8 != 0) {
                                  break L4;
                                } else {
                                  L6: {
                                    if (stackIn_45_0 > (var6.field_e ^ -1)) {
                                      break L6;
                                    } else {
                                      if ((var6.field_a ^ -1) <= (param2 ^ -1)) {
                                        var7 = var6.a(param0, -118);
                                        if (var7 == -1) {
                                          stackIn_40_0 = -1;
                                          decompiledRegionSelector0 = 4;
                                          break L0;
                                        } else {
                                          stackIn_42_0 = var4_int + var7;
                                          decompiledRegionSelector0 = 5;
                                          break L0;
                                        }
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  var4_int = var4_int + (-1 + var6.field_d.length);
                                  var5++;
                                  if (var8 == 0) {
                                    continue L3;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                            stackIn_45_0 = -1;
                            break L4;
                          }
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackIn_11_0 = -1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var4), "ld.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_24_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_45_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_40_0;
                } else {
                  return stackIn_42_0;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, boolean param1, ee param2, int param3, byte param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_10_0;
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
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = je.a(-101, 3 * (-param3 + param0));
                        var6 = 3 * param3;
                        var7 = var5_int + -10;
                        am.g((byte) -3);
                        if ((param2.field_I ^ -1) >= -1) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param2.field_f != null) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        sd.a((byte) 87);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ae.field_I = 0;
                        var8 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((param2.field_l ^ -1) >= (var8 ^ -1)) {
                            statePc = 43;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var9 = param2.field_E[var8];
                        var10 = param2.field_n[var8];
                        var11 = param2.field_p[var8];
                        stackOut_10_0 = param1;
                        stackIn_44_0 = stackOut_10_0 ? 1 : 0;
                        stackIn_11_0 = stackOut_10_0;
                        if (var19 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!stackIn_11_0) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var12 = gm.field_l[var9];
                        var13 = nb.field_c[var9];
                        var14 = gm.field_l[var10] - var12;
                        var15 = -var12 + gm.field_l[var11];
                        var16 = nb.field_c[var10] - var13;
                        var17 = nb.field_c[var11] - var13;
                        if (0 <= -(var16 * var15) + var14 * var17) {
                            statePc = 42;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var12 = gd.field_e[var9];
                        if ((var12 ^ -1) == 2147483647) {
                            statePc = 42;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var13 = gd.field_e[var10];
                        if ((var13 ^ -1) == 2147483647) {
                            statePc = 42;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var14 = gd.field_e[var11];
                        if ((var14 ^ -1) != 2147483647) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var19 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var15 = var14 + (var12 - -var13) + -var6;
                        stackIn_24_0 = fc.field_e.length + -1;
                        stackIn_22_0 = stackIn_24_0;
                        if (-1 < (var7 ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_25_0 = stackIn_22_0;
                        stackIn_25_1 = var15 >> var7;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_25_0 = stackIn_24_0;
                        stackIn_25_1 = var15 << -var7;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var16 = stackIn_25_0 + -stackIn_25_1;
                        var17 = fc.field_e[var16];
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (0 == var17 >> -530873212) {
                            statePc = 34;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var16--;
                        stackIn_35_0 = -1;
                        stackIn_28_0 = stackIn_35_0;
                        stackIn_35_1 = var16 ^ -1;
                        stackIn_28_1 = stackIn_35_1;
                        if (var19 != 0) {
                            statePc = 35;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 < stackIn_28_1) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var17 = fc.field_e[var16];
                        if (var19 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_35_0 = var17;
                        stackIn_35_1 = var16 << 416667652;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var18 = stackIn_35_0 + stackIn_35_1;
                        qh.field_c[var18] = var8;
                        fc.field_e[var16] = 1 + var17;
                        if ((param2.field_I ^ -1) >= -1) {
                            statePc = 41;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (null == param2.field_f) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        dupTemp$0 = param2.field_f[var8];
                        dk.field_c[dupTemp$0] = dk.field_c[dupTemp$0] + 1;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        ae.field_I = ae.field_I + 1;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_44_0 = param4;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (stackIn_44_0 > 121) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 45: {
                    return;
                }
                case 46: {
                    try {
                        if (0 >= param2.field_I) {
                            statePc = 62;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (null == param2.field_f) {
                            statePc = 62;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (dk.field_c.length <= var9) {
                            statePc = 62;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var10 = dk.field_c[var9];
                        dk.field_c[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var19 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var19 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 57: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_60_0 = (RuntimeException) (var5);
                    stackIn_58_0 = stackIn_60_0;
                    stackIn_60_1 = new StringBuilder().append("ld.B(").append(param0).append(',').append(param1).append(',');
                    stackIn_58_1 = stackIn_60_1;
                    if (param2 == null) {
                        statePc = 60;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    stackIn_61_0 = (RuntimeException) ((Object) stackIn_58_0);
                    stackIn_61_1 = (StringBuilder) ((Object) stackIn_58_1);
                    stackIn_61_2 = "{...}";
                    statePc = 61;
                    continue stateLoop;
                }
                case 60: {
                    stackIn_61_0 = (RuntimeException) ((Object) stackIn_60_0);
                    stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
                    stackIn_61_2 = "null";
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    throw qk.a((Throwable) ((Object) stackIn_61_0), stackIn_61_2 + ',' + param3 + ',' + param4 + ')');
                }
                case 62: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_g = "Please try again in a few minutes.";
        field_h = new int[8192];
    }
}
