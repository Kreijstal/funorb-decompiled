/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class kf extends ce implements ra {
    static int field_M;
    static String field_N;
    static qc field_I;
    static String field_R;
    static ud field_P;
    static w field_Q;
    static int field_O;
    static int field_L;
    vj field_H;
    static ke field_G;
    static String field_J;
    static int field_K;

    final boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return null != this.e((byte) -74) ? true : false;
    }

    void a(ce param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        rd var5 = null;
        ce var6 = null;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 38) {
                break L1;
              } else {
                this.a(false);
                break L1;
              }
            }
            super.a(param0, 68, param2, param3);
            var5 = new rd(this.field_H);
            var6 = (ce) ((Object) var5.a((byte) 71));
            L2: while (true) {
              L3: {
                if (var6 == null) {
                  break L3;
                } else {
                  if (!var6.a((byte) 38)) {
                    break L3;
                  } else {
                    var6.a(param0, 47, this.field_D + param2, param3 - -this.field_u);
                    var6 = (ce) ((Object) var5.a(-62));
                    if (var7 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("kf.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(ce param0, byte param1) {
        try {
            if (param1 != -55) {
                ce var4 = (ce) null;
                this.a(false, (ce) null);
            }
            this.field_H.a(param0, 2777);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "kf.KC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    boolean a(int param0, int param1, ce param2, char param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ce var9 = null;
        rd var10 = null;
        boolean stackIn_4_0 = false;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            var10 = new rd(this.field_H);
            var6 = 18 % ((-22 - param0) / 49);
            var9 = (ce) ((Object) var10.a((byte) 71));
            L1: while (true) {
              L2: {
                L3: {
                  if (var9 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var9.a((byte) 124);
                    stackIn_12_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      if (!stackIn_4_0) {
                        break L3;
                      } else {
                        L4: {
                          if (!var9.a(true)) {
                            break L4;
                          } else {
                            if (var9.a(-79, param1, param2, param3)) {
                              stackIn_9_0 = 1;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var9 = (ce) ((Object) var10.a(-78));
                        if (var8 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackIn_12_0 = param1;
                break L2;
              }
              var7 = stackIn_12_0;
              if (-81 == (var7 ^ -1)) {
                L5: {
                  if (!bj.field_d[81]) {
                    stackIn_17_0 = this.a(32, param2);
                    break L5;
                  } else {
                    stackIn_17_0 = this.a(param2, (byte) -120);
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("kf.QA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_17_0;
        }
    }

    final void a(int param0, int param1, int param2, ce param3, int param4, int param5) {
        rd var7 = null;
        ce var8 = null;
        int var9 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        RuntimeException var7_ref = null;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            var7 = new rd(this.field_H);
            var8 = (ce) ((Object) var7.a((byte) 71));
            L1: while (true) {
              L2: {
                L3: {
                  if (var8 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var8.a((byte) 119);
                    stackIn_7_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      if (!stackIn_4_0) {
                        break L3;
                      } else {
                        var8.a(param0, param1 ^ 0, this.field_u + param2, param3, this.field_D + param4, param5);
                        var8 = (ce) ((Object) var7.a(-126));
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackIn_7_0 = param1;
                break L2;
              }
              L4: {
                if (stackIn_7_0 == 64) {
                  break L4;
                } else {
                  field_J = (String) null;
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var7_ref);

            stackIn_12_1 = new StringBuilder().append("kf.IB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static String a(CharSequence param0, byte param1) {
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        boolean stackIn_7_0 = false;
        int stackIn_13_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_19_0 = 0;
        String stackIn_26_0 = null;
        boolean stackIn_30_0 = false;
        int stackIn_35_0 = 0;
        Object stackIn_37_0 = null;
        String stackIn_39_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        boolean stackOut_14_0;
        boolean stackOut_29_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              var2_int = 0;
              var3 = param0.length();
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3 <= var2_int) {
                      break L3;
                    } else {
                      stackOut_6_0 = ug.a(param0.charAt(var2_int), 32);
                      stackIn_13_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var9 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_7_0) {
                          break L3;
                        } else {
                          var2_int++;
                          if (var9 == 0) {
                            continue L1;
                          } else {
                            stackIn_13_0 = var2_int;
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  stackIn_13_0 = var2_int;
                  break L2;
                }
                L4: while (true) {
                  L5: {
                    L6: {
                      if (stackIn_13_0 >= var3) {
                        break L6;
                      } else {
                        stackOut_14_0 = ug.a(param0.charAt(var3 + -1), 32);
                        stackIn_19_0 = stackOut_14_0 ? 1 : 0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var9 != 0) {
                          break L5;
                        } else {
                          if (!stackIn_15_0) {
                            break L6;
                          } else {
                            var3--;
                            if (var9 == 0) {
                              stackIn_13_0 = var2_int;
                              continue L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                    }
                    stackIn_19_0 = -var2_int + var3;
                    break L5;
                  }
                  var4 = stackIn_19_0;
                  if ((var4 ^ -1) <= -2) {
                    if (12 >= var4) {
                      var5 = new StringBuilder(var4);
                      if (param1 == 2) {
                        var6 = var2_int;
                        L7: while (true) {
                          L8: {
                            L9: {
                              if (var3 <= var6) {
                                break L9;
                              } else {
                                var7 = param0.charAt(var6);
                                stackOut_29_0 = oe.a((char) var7, param1 ^ -6239);
                                stackIn_35_0 = stackOut_29_0 ? 1 : 0;
                                stackIn_30_0 = stackOut_29_0;
                                if (var9 != 0) {
                                  break L8;
                                } else {
                                  L10: {
                                    if (!stackIn_30_0) {
                                      break L10;
                                    } else {
                                      var8 = un.a(228, (char) var7);
                                      if (var8 == 0) {
                                        break L10;
                                      } else {
                                        discarded$0 = var5.append((char) var8);
                                        break L10;
                                      }
                                    }
                                  }
                                  var6++;
                                  if (var9 == 0) {
                                    continue L7;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            stackIn_35_0 = 0;
                            break L8;
                          }
                          if (stackIn_35_0 != var5.length()) {
                            stackIn_39_0 = var5.toString();
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            stackIn_37_0 = null;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                      } else {
                        stackIn_26_0 = (String) null;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var2);

            stackIn_42_1 = new StringBuilder().append("kf.MC(");

            if (param0 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L11;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L11;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_26_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (String) ((Object) stackIn_37_0);
            } else {
              return stackIn_39_0;
            }
          }
        }
    }

    final int d(int param0) {
        int var2;
        rd var3;
        ce var4;
        int var5;
        int var6;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        var6 = client.field_A ? 1 : 0;
        var2 = 0;
        var3 = new rd(this.field_H);
        var4 = (ce) ((Object) var3.a((byte) 71));
        L0: while (true) {
          L1: {
            L2: {
              if (var4 == null) {
                break L2;
              } else {
                var5 = var4.d(-31);
                stackIn_8_0 = var2;

                stackIn_8_1 = var5;

                if (var6 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_8_0 < stackIn_8_1) {
                      var2 = var5;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var4 = (ce) ((Object) var3.a(-61));
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackIn_8_0 = -18;
            stackIn_8_1 = (36 - param0) / 51;
            break L1;
          }
          var5 = stackIn_8_0 / stackIn_8_1;
          return var2;
        }
    }

    String c(byte param0) {
        rd var2;
        ce var3;
        String var4;
        int var5;
        ce var6;
        Object stackIn_6_0 = null;
        L0: {
          var5 = client.field_A ? 1 : 0;
          var2 = new rd(this.field_H);
          var3 = (ce) ((Object) var2.a((byte) 71));
          if (param0 == 113) {
            break L0;
          } else {
            var6 = (ce) null;
            this.a(59, 12, 76, (ce) null, -65, -4, true);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.c((byte) 113);
            stackIn_6_0 = null;

            if (var5 == 0) {
              if (stackIn_6_0 == var4) {
                var3 = (ce) ((Object) var2.a(-47));
                if (var5 == 0) {
                  continue L1;
                } else {
                  return null;
                }
              } else {
                return var4;
              }
            } else {
              return (String) ((Object) stackIn_6_0);
            }
          } else {
            return null;
          }
        }
    }

    private final void g(int param0) {
        rd var2 = null;
        ce var3 = null;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = client.field_A ? 1 : 0;
                    if (param0 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_L = -109;
                    statePc = 9;
                    continue stateLoop;
                }
                case 2: {
                    var2 = new rd(this.field_H);
                    var3 = (ce) ((Object) var2.a((byte) 71));
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var3 != null) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    var3.f(121);
                    var3 = (ce) ((Object) var2.a(param0 + -57));
                    if (var4 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    if (var4 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    var2 = new rd(this.field_H);
                    var3 = (ce) ((Object) var2.a((byte) 71));
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var3 != null) {
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
                    var3.f(121);
                    var3 = (ce) ((Object) var2.a(param0 + -57));
                    if (var4 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                case 14: {
                    if (var4 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        ce var7;
        if (param4 != -16555) {
          var7 = (ce) null;
          this.a((ce) null, (byte) 126);
          super.b(param0, param1, param2, param3, param4 + 0);
          this.g(0);
          return;
        } else {
          super.b(param0, param1, param2, param3, param4 + 0);
          this.g(0);
          return;
        }
    }

    final boolean a(ce param0, byte param1) {
        RuntimeException var3 = null;
        ce var4 = null;
        rd var5 = null;
        ce var6 = null;
        int var7 = 0;
        rd var8 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_6_0;
        boolean stackOut_10_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!this.field_H.b(-105)) {
                            statePc = 4;
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
                        stackIn_3_0 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        var8 = new rd(this.field_H);
                        var4 = (ce) ((Object) var8.a(true));
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var4 == null) {
                            statePc = 17;
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
                        stackOut_6_0 = var4.a(true);
                        stackIn_18_0 = stackOut_6_0 ? 1 : 0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var7 != 0) {
                            statePc = 18;
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
                        if (!stackIn_7_0) {
                            statePc = 16;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = new rd(this.field_H);
                        var5.a(var4, (byte) -88);
                        var6 = (ce) ((Object) var5.d(2078965185));
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var6 == null) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = var6.a(false, param0);
                        stackIn_18_0 = stackOut_10_0 ? 1 : 0;
                        stackIn_11_0 = stackOut_10_0;
                        if (var7 != 0) {
                            statePc = 18;
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
                        if (stackIn_11_0) {
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
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_14_0 = 1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0 != 0;
                }
                case 15: {
                    try {
                        var6 = (ce) ((Object) var5.d(2078965185));
                        if (var7 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var4 = (ce) ((Object) var8.d(2078965185));
                        if (var7 == 0) {
                            statePc = 5;
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
                        stackIn_18_0 = param1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (stackIn_18_0 < -16) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        field_Q = (w) null;
                        return false;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
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
                    return stackIn_21_0 != 0;
                }
                case 22: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_24_0 = (RuntimeException) (var3);
                    stackIn_23_0 = stackIn_24_0;
                    stackIn_24_1 = new StringBuilder().append("kf.QC(");
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
                    throw dh.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void d(byte param0) {
        rd var2 = null;
        ce var3 = null;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = client.field_A ? 1 : 0;
                    var2 = new rd(this.field_H);
                    if (param0 == -95) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.c((byte) 50);
                    statePc = 9;
                    continue stateLoop;
                }
                case 2: {
                    var3 = (ce) ((Object) var2.a((byte) 71));
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var3 != null) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    var3.d((byte) -95);
                    var3 = (ce) ((Object) var2.a(-98));
                    if (var4 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    if (var4 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    var3 = (ce) ((Object) var2.a((byte) 71));
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var3 != null) {
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
                    var3.d((byte) -95);
                    var3 = (ce) ((Object) var2.a(-98));
                    if (var4 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                case 14: {
                    if (var4 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
        rd var8 = null;
        RuntimeException var8_ref = null;
        ce var9 = null;
        int var10 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            var8 = new rd(this.field_H);
            var9 = (ce) ((Object) var8.a((byte) 71));
            if (param6 == -55) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (var9 == null) {
                      break L3;
                    } else {
                      stackOut_5_0 = var9.a((byte) 120);
                      stackIn_13_0 = stackOut_5_0 ? 1 : 0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var10 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_6_0) {
                          break L3;
                        } else {
                          if (var9.a(param0, param1, param2, param3, this.field_D + param4, this.field_u + param5, (byte) -55)) {
                            stackIn_10_0 = 1;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            var9 = (ce) ((Object) var8.a(-113));
                            if (var10 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackIn_13_0 = 0;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var8_ref);

            stackIn_16_1 = new StringBuilder().append("kf.LB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    kf(int param0, int param1, int param2, int param3, gl param4) {
        super(param0, param1, param2, param3, param4, (kg) null);
        this.field_H = new vj();
    }

    final boolean a(int param0, int param1, int param2, ce param3, int param4, int param5, boolean param6) {
        RuntimeException var8 = null;
        ce var9 = null;
        int var10 = 0;
        ce var11 = null;
        rd var12 = null;
        boolean stackIn_6_0 = false;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var12 = new rd(this.field_H);
              if (!param6) {
                break L1;
              } else {
                var11 = (ce) null;
                this.a(true, (ce) null);
                break L1;
              }
            }
            var9 = (ce) ((Object) var12.a((byte) 71));
            L2: while (true) {
              L3: {
                L4: {
                  if (var9 == null) {
                    break L4;
                  } else {
                    stackOut_5_0 = var9.a((byte) 67);
                    stackIn_14_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var10 != 0) {
                      break L3;
                    } else {
                      if (!stackIn_6_0) {
                        break L4;
                      } else {
                        L5: {
                          if (!var9.a(true)) {
                            break L5;
                          } else {
                            if (var9.a(param0, param1, param2, param3, param4, param5, param6)) {
                              stackIn_11_0 = 1;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var9 = (ce) ((Object) var12.a(-128));
                        if (var10 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackIn_14_0 = 0;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var8);

            stackIn_17_1 = new StringBuilder().append("kf.FC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    private final void a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        RuntimeException runtimeException = null;
        ce var6 = null;
        int var7 = 0;
        int var8 = 0;
        StringBuilder var9 = null;
        rd var10 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var9 = (StringBuilder) null;
                        this.a((Hashtable) null, -83, (StringBuilder) null, true);
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
                        var10 = new rd(this.field_H);
                        var6 = (ce) ((Object) var10.a((byte) 71));
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6 == null) {
                            statePc = 22;
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
                        discarded$11 = param2.append('\n');
                        if (var8 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var7 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var7 > param0) {
                            statePc = 12;
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
                        discarded$12 = param2.append(' ');
                        var7++;
                        if (var8 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var8 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6.a(param3, 1 + param0, param2, true);
                        var6 = (ce) ((Object) var10.a(-113));
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var8 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 22;
                        }
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
                    stackIn_17_1 = new StringBuilder().append("kf.OC(").append(param0).append(',').append(param1).append(',');
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
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_0 = stackIn_20_0;
                    stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
                    stackIn_19_1 = stackIn_20_1;
                    if (param3 == null) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_21_2 = "{...}";
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_21_2 = "null";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    throw dh.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        rd var5 = null;
        ce var6 = null;
        int var7 = 0;
        rd var8 = null;
        rd var9 = null;
        rd var10 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = client.field_A ? 1 : 0;
                    if (param2 != 0) {
                        statePc = 3;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_p == null) {
                        statePc = 16;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_p.a(true, param0, param3, (byte) -108, (ce) (this));
                    statePc = 30;
                    continue stateLoop;
                }
                case 3: {
                    var8 = new rd(this.field_H);
                    var5 = var8;
                    var6 = (ce) ((Object) var8.a(true));
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var6 != null) {
                        statePc = 9;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (param1 <= -103) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.a(59, -115, 20, 76);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 9: {
                    var6.a(param0 + this.field_u, -124, param2, param3 - -this.field_D);
                    var6 = (ce) ((Object) var8.d(2078965185));
                    if (var7 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return;
                }
                case 11: {
                    if (var7 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (param1 <= -103) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    this.a(59, -115, 20, 76);
                    return;
                }
                case 14: {
                    return;
                }
                case 16: {
                    var9 = new rd(this.field_H);
                    var5 = var9;
                    var6 = (ce) ((Object) var9.a(true));
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (var6 == null) {
                        statePc = 26;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var6.a(param0 + this.field_u, -124, param2, param3 - -this.field_D);
                    var6 = (ce) ((Object) var9.d(2078965185));
                    if (var7 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    return;
                }
                case 20: {
                    if (var7 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (param1 > -103) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    return;
                }
                case 24: {
                    this.a(59, -115, 20, 76);
                    return;
                }
                case 26: {
                    if (param1 <= -103) {
                        statePc = 29;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    this.a(59, -115, 20, 76);
                    return;
                }
                case 29: {
                    return;
                }
                case 30: {
                    var10 = new rd(this.field_H);
                    var5 = var10;
                    var6 = (ce) ((Object) var10.a(true));
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (var6 == null) {
                        statePc = 39;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var6.a(param0 + this.field_u, -124, param2, param3 - -this.field_D);
                    var6 = (ce) ((Object) var10.d(2078965185));
                    if (var7 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    return;
                }
                case 34: {
                    if (var7 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (param1 <= -103) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    this.a(59, -115, 20, 76);
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    return;
                }
                case 39: {
                    if (param1 <= -103) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    this.a(59, -115, 20, 76);
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a(0, param1, param0, param2)) {
                break L1;
              } else {
                this.a((byte) 72, param2, param0, param1);
                this.a(param1, 0, param2, param0);
                break L1;
              }
            }
            L2: {
              if (param3) {
                break L2;
              } else {
                field_P = (ud) null;
                break L2;
              }
            }
            stackIn_5_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("kf.MB(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    final boolean a(int param0, ce param1) {
        RuntimeException var3 = null;
        ce var4 = null;
        rd var5 = null;
        ce var6 = null;
        int var7 = 0;
        rd var8 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_12_0 = false;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_7_0;
        boolean stackOut_11_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_H.b(-15)) {
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
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        var8 = new rd(this.field_H);
                        var4 = (ce) ((Object) var8.a((byte) 71));
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var4 == null) {
                            statePc = 18;
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
                        stackOut_7_0 = var4.a(true);
                        stackIn_19_0 = stackOut_7_0 ? 1 : 0;
                        stackIn_8_0 = stackOut_7_0;
                        if (var7 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (!stackIn_8_0) {
                            statePc = 17;
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
                        var5 = new rd(this.field_H);
                        var5.a(var4, false);
                        var6 = (ce) ((Object) var5.a(param0 ^ -24));
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var6 == null) {
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
                        stackOut_11_0 = var6.a(false, param1);
                        stackIn_19_0 = stackOut_11_0 ? 1 : 0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var7 != 0) {
                            statePc = 19;
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
                        if (stackIn_12_0) {
                            statePc = 14;
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
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = 1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return stackIn_15_0 != 0;
                }
                case 16: {
                    try {
                        var6 = (ce) ((Object) var5.a(param0 + -119));
                        if (var7 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var4 = (ce) ((Object) var8.a(-109));
                        if (var7 == 0) {
                            statePc = 6;
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
                        stackIn_19_0 = param0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (stackIn_19_0 == 32) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        kf.h(-42);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
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
                    return stackIn_22_0 != 0;
                }
                case 23: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_25_0 = (RuntimeException) (var3);
                    stackIn_24_0 = stackIn_25_0;
                    stackIn_25_1 = new StringBuilder().append("kf.PC(").append(param0).append(',');
                    stackIn_24_1 = stackIn_25_1;
                    if (param1 == null) {
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
                    throw dh.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void h(int param0) {
        if (param0 < 72) {
          kf.h(-51);
          field_P = null;
          field_R = null;
          field_Q = null;
          field_I = null;
          field_J = null;
          field_N = null;
          field_G = null;
          return;
        } else {
          field_P = null;
          field_R = null;
          field_Q = null;
          field_I = null;
          field_J = null;
          field_N = null;
          field_G = null;
          return;
        }
    }

    ce e(byte param0) {
        rd var2;
        ce var3;
        int var4;
        boolean stackIn_3_0 = false;
        int stackIn_8_0 = 0;
        boolean stackOut_2_0;
        var4 = client.field_A ? 1 : 0;
        var2 = new rd(this.field_H);
        var3 = (ce) ((Object) var2.a((byte) 71));
        L0: while (true) {
          L1: {
            L2: {
              if (var3 == null) {
                break L2;
              } else {
                stackOut_2_0 = var3.a(true);
                stackIn_8_0 = stackOut_2_0 ? 1 : 0;
                stackIn_3_0 = stackOut_2_0;
                if (var4 != 0) {
                  break L1;
                } else {
                  if (stackIn_3_0) {
                    return var3;
                  } else {
                    var3 = (ce) ((Object) var2.a(-92));
                    if (var4 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackIn_8_0 = param0;
            break L1;
          }
          if (stackIn_8_0 == -74) {
            return null;
          } else {
            field_P = (ud) null;
            return null;
          }
        }
    }

    final boolean a(boolean param0, ce param1) {
        rd var3 = null;
        RuntimeException var3_ref = null;
        ce var4 = null;
        int var5 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_O = -99;
                break L1;
              }
            }
            var3 = new rd(this.field_H);
            var4 = (ce) ((Object) var3.a((byte) 71));
            L2: while (true) {
              L3: {
                L4: {
                  if (var4 == null) {
                    break L4;
                  } else {
                    stackOut_5_0 = var4.a(false, param1);
                    stackIn_11_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      if (!stackIn_6_0) {
                        var4 = (ce) ((Object) var3.a(-69));
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      } else {
                        stackIn_8_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
                stackIn_11_0 = 0;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("kf.EC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    static {
        field_R = "Offer draw";
        field_N = "Unable to connect to the data server. Please check any firewall you are using.";
        field_L = -1;
        field_J = "This is your RuneScape clan if you have one.";
    }
}
