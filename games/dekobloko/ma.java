/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ma extends ce implements ra {
    static w field_J;
    static String[] field_H;
    static w field_G;
    static int field_I;
    ce field_L;
    static ck field_K;

    void a(int param0, int param1, int param2, ce param3, int param4, int param5) {
        boolean discarded$1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (param1 == 64) {
                break L1;
              } else {
                discarded$1 = this.a((ce) null, (byte) -1);
                break L1;
              }
            }
            L2: {
              if (this.field_L != null) {
                this.field_L.a(param0, 64, param2 + this.field_u, param3, this.field_D + param4, param5);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var7);

            stackIn_11_1 = new StringBuilder().append("ma.IB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (-1 != (param2 ^ -1)) {
                break L1;
              } else {
                if (this.field_p != null) {
                  this.field_p.a(true, param0, param3, (byte) -98, (ce) (this));
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (this.field_L == null) {
                break L2;
              } else {
                this.field_L.a(param0 + this.field_u, -119, param2, param3 - -this.field_D);
                break L2;
              }
            }
            L3: {
              if (param1 <= -103) {
                break L3;
              } else {
                field_G = (w) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var5), "ma.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        try {
            super.b(param0, param1, param2, param3, param4);
            this.b(true);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ma.DA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int d(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = 99 / ((36 - param0) / 51);
              if (this.field_L == null) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = this.field_L.d(125);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "ma.DC(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    String c(byte param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String var3 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = super.c(param0);
              if (this.field_L == null) {
                break L1;
              } else {
                var3 = this.field_L.c((byte) 113);
                if (var3 != null) {
                  stackIn_5_0 = (String) (var3);
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackIn_7_0 = (String) (var2);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2_ref), "ma.R(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    ce a(int param0) {
        ce var2 = null;
        RuntimeException var2_ref = null;
        ce stackIn_7_0 = null;
        ce stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = this.field_L;
              if (var2 == null) {
                break L1;
              } else {
                if (var2.a(true)) {
                  stackIn_7_0 = (ce) (var2);
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (param0 == 14) {
              stackIn_12_0 = null;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_10_0 = (ce) null;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2_ref), "ma.N(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return (ce) ((Object) stackIn_12_0);
          }
        }
    }

    void a(ce param0, int param1, int param2, int param3) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              super.a(param0, 119, param2, param3);
              if (this.field_L != null) {
                this.field_L.a(param0, 110, param2 - -this.field_D, this.field_u + param3);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 > 38) {
                break L2;
              } else {
                this.b(false);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("ma.A(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean a(ce param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -112) {
                break L1;
              } else {
                this.a(112, -42, (ce) null, -60, 72, 122, (byte) 63);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_L == null) {
                  break L3;
                } else {
                  if (this.field_L.a(true)) {
                    break L3;
                  } else {
                    if (!this.field_L.a(false, param0)) {
                      break L3;
                    } else {
                      stackIn_13_0 = 1;
                      break L2;
                    }
                  }
                }
              }
              stackIn_13_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("ma.H(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final boolean a(boolean param0, ce param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              L1: {
                L2: {
                  if (null == this.field_L) {
                    break L2;
                  } else {
                    if (!this.field_L.a(false, param1)) {
                      break L2;
                    } else {
                      stackIn_10_0 = 1;
                      break L1;
                    }
                  }
                }
                stackIn_10_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("ma.EC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final boolean a(int param0, int param1, int param2, ce param3, int param4, int param5, boolean param6) {
        RuntimeException var8 = null;
        ce stackIn_9_0 = null;
        ce stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param6) {
                break L1;
              } else {
                this.field_L = (ce) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_L == null) {
                  break L3;
                } else {
                  L4: {
                    stackIn_9_0 = this.field_L;

                    if (param6) {
                      stackIn_10_0 = (ce) ((Object) stackIn_9_0);
                      stackIn_10_1 = 0;
                      break L4;
                    } else {

                      stackIn_10_0 = (ce) ((Object) stackIn_9_0);
                      stackIn_10_1 = 1;
                      break L4;
                    }
                  }
                  if (!((ce) (Object) stackIn_10_0).a(stackIn_10_1 != 0)) {
                    break L3;
                  } else {
                    if (!this.field_L.a(param0, param1, param2, param3, param4, param5, false)) {
                      break L3;
                    } else {
                      stackIn_17_0 = 1;
                      break L2;
                    }
                  }
                }
              }
              stackIn_17_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var8);

            stackIn_21_1 = new StringBuilder().append("ma.FC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final static wb a(int param0, boolean param1, byte param2) {
        nm stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        nm stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        nm stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        wb stackIn_21_0 = null;
        w stackIn_42_0 = null;
        w stackIn_44_0 = null;
        w stackIn_45_0 = null;
        String stackIn_45_1 = null;
        w stackIn_46_0 = null;
        w stackIn_48_0 = null;
        w stackIn_49_0 = null;
        String stackIn_49_1 = null;
        int stackIn_53_0 = 0;
        Object stackIn_92_0 = null;
        Object stackIn_100_0 = null;
        wb stackOut_20_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        vj var4 = null;
        Object var5 = null;
        Object var6 = null;
        wb var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        pf var17 = null;
        String var18 = null;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 > 54) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ma.e((byte) -34);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_7_0 = k.field_b.field_Rb;
                        stackIn_5_0 = stackIn_7_0;
                        stackIn_7_1 = kf.field_O - -2;
                        stackIn_5_1 = stackIn_7_1;
                        stackIn_7_2 = (kf.field_O + 2) * (3 * param0);
                        stackIn_5_2 = stackIn_7_2;
                        stackIn_7_3 = -15230;
                        stackIn_5_3 = stackIn_7_3;
                        if (k.field_b.field_Rb != ki.field_w) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_8_0 = (nm) ((Object) stackIn_5_0);
                        stackIn_8_1 = stackIn_5_1;
                        stackIn_8_2 = stackIn_5_2;
                        stackIn_8_3 = stackIn_5_3;
                        stackIn_8_4 = 1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = (nm) ((Object) stackIn_7_0);
                        stackIn_8_1 = stackIn_7_1;
                        stackIn_8_2 = stackIn_7_2;
                        stackIn_8_3 = stackIn_7_3;
                        stackIn_8_4 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var3_int = ((nm) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4 != 0, 2, param1) ? 1 : 0;
                        var4 = k.field_b.field_Sb.field_M;
                        var5 = null;
                        if (-3 == (jj.field_b ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        tb.field_c.field_Hb = false;
                        jc.field_c.field_Y = wm.field_k;
                        if (1 != jj.field_b) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        k.field_b.field_Rb.field_Rb.field_Y = si.field_m;
                        if (var19 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        k.field_b.field_Rb.field_Rb.field_Y = wf.field_m;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        gk.a(k.field_b.field_Sb, true);
                        if (var19 == 0) {
                            statePc = 99;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        tb.field_c.field_Hb = true;
                        jc.field_c.field_Y = cm.a((byte) 98, ve.field_cc, new String[]{f.field_w});
                        k.field_b.field_Rb.field_Rb.field_Y = null;
                        var6 = null;
                        var7 = (wb) ((Object) var4.c((byte) -108));
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (null == var7) {
                            statePc = 91;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var8 = 0;
                        stackOut_20_0 = (wb) (var7);
                        stackIn_92_0 = stackOut_20_0;
                        stackIn_21_0 = stackOut_20_0;
                        if (var19 != 0) {
                            statePc = 92;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0.field_M != null) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var7.field_Sb = new w(0L, gg.field_G);
                        var7.a(var7.field_Sb, -16834);
                        var7.field_Yb = new w(0L, fc.field_f);
                        var7.a(var7.field_Yb, -16834);
                        var7.field_Wb = new w(0L, gg.field_G);
                        var7.a(var7.field_Wb, -16834);
                        var7.field_Yb.field_X = 2;
                        var7.d(-112);
                        var8 = 1;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var7.field_mb = k.field_b.field_Sb.field_mb;
                        var9 = 0;
                        if (var7.field_Vb != null) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var10 = 13369344;
                        var11 = 16737894;
                        if (var19 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (f.field_w != var7.field_Vb) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var10 = 52224;
                        var11 = 6750054;
                        if (var19 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var11 = 16777062;
                        var10 = 13421568;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var12 = 0;
                        if (var7.field_Tb == null) {
                            statePc = 37;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var7.field_Tb.equals("")) {
                            statePc = 37;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var7.field_Wb.field_Bb = var11;
                        var7.field_Wb.field_I = a.field_p;
                        var7.field_Wb.a(3 + a.field_p.field_K, 0, var9, kf.field_O, 0);
                        var12 = 1;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var7.field_Yb.field_G = var10;
                        var7.field_Sb.field_G = var10;
                        var7.field_Yb.field_fb = var11;
                        var7.field_Sb.field_fb = var11;
                        var7.field_Yb.field_rb = var11;
                        var7.field_Sb.field_rb = var11;
                        var7.field_Yb.field_Bb = var11;
                        var7.field_Sb.field_Bb = var11;
                        var13 = 0;
                        var14 = -2 + (var7.field_mb - 80);
                        if (var12 != 0) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var13 = a.field_p.field_K + 3;
                        var14 = var14 - var13;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_44_0 = var7.field_Sb;
                        stackIn_42_0 = stackIn_44_0;
                        if (0 >= var14) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_45_0 = (w) ((Object) stackIn_42_0);
                        stackIn_45_1 = mm.a(var7.field_Sb.field_J, var7.field_Ob, var14);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_45_0 = (w) ((Object) stackIn_44_0);
                        stackIn_45_1 = var7.field_Ob;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_45_0.field_Y = stackIn_45_1;
                        var7.field_Sb.a(var14, 0, var9, kf.field_O, var13);
                        stackIn_48_0 = var7.field_Yb;
                        stackIn_46_0 = stackIn_48_0;
                        if (null != var7.field_Vb) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_49_0 = (w) ((Object) stackIn_46_0);
                        stackIn_49_1 = rg.field_b;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_49_0 = (w) ((Object) stackIn_48_0);
                        stackIn_49_1 = var7.field_Vb;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_49_0.field_Y = stackIn_49_1;
                        var7.field_Yb.a(80, 0, var9, kf.field_O, var7.field_mb + -80);
                        if (var7.field_Sb.field_Y.equals(var7.field_Ob)) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_53_0 = 1;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_53_0 = 0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var15 = stackIn_53_0;
                        var9 = var9 + kf.field_O;
                        if (var3_int != 0) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var7.field_F = var9 - var7.field_N;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var8 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        k.field_b.field_Sb.a((w) (var6), var7, 2, 0);
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var7.field_Wb == null) {
                            statePc = 63;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var7.field_Wb.field_jb) {
                            statePc = 88;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var7.field_ob == 0) {
                            statePc = 79;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var16 = var7.field_Ob;
                        sl.a(var16, (int[]) null, (byte) 101, k.field_b.field_Rb, var7, (String) null, 0L, -1, -1);
                        var5 = var7;
                        if (var7.field_Vb == null) {
                            statePc = 78;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (wi.a(-103, w.field_H.field_b)) {
                            statePc = 78;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (!wc.field_n) {
                            statePc = 75;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (wl.field_p) {
                            statePc = 77;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var17 = w.field_H;
                        var18 = cm.a((byte) 111, ai.field_M, new String[]{var16});
                        var17.field_h.a(var18, 8, 80);
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var17 = w.field_H;
                        var18 = cm.a((byte) 99, wa.field_e, new String[]{var16});
                        var17.field_h.a(var18, 18, 65);
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (var19 == 0) {
                            statePc = 90;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (!var7.field_Sb.field_jb) {
                            statePc = 90;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (var15 != 0) {
                            statePc = 87;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        sl.field_g = var7.field_Ob;
                        if (var19 == 0) {
                            statePc = 90;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        sl.field_g = var7.field_Tb;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var6 = var7;
                        var7 = (wb) ((Object) var4.d(true));
                        if (var19 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        stackIn_92_0 = k.field_b.field_Ob;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (((w) ((Object) stackIn_92_0)).field_ob == 0) {
                            statePc = 95;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        vh.field_h = new hb(k.field_b.field_Ob.field_E, k.field_b.field_Ob.field_pb, k.field_b.field_Ob.field_mb, k.field_b.field_Ob.field_N, h.field_g, ah.field_h, ua.field_H, ua.field_H);
                        of.field_d = 0;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if ((k.field_b.field_Nb.field_ob ^ -1) != -1) {
                            statePc = 98;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        vh.field_h = new hb(k.field_b.field_Nb.field_E, k.field_b.field_Nb.field_pb, k.field_b.field_Nb.field_mb, k.field_b.field_Nb.field_N, fj.field_b, ah.field_h, ua.field_H, ua.field_H);
                        of.field_d = 1;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        stackIn_100_0 = var5;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 100: {
                    return (wb) ((Object) stackIn_100_0);
                }
                case 101: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var3), "ma.K(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.a(-67, 8, (ce) null, -37, -30, 67, (byte) -40);
                break L1;
              }
            }
            L2: {
              if (null == this.a(14)) {
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "ma.TB(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static pi a(ji param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_5_0 = null;
        pi stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 21828) {
                break L1;
              } else {
                ma.a(-121, true, (byte) -35);
                break L1;
              }
            }
            if (gb.a(param1, param0, param2, 78)) {
              stackIn_7_0 = a.b(0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("ma.J(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (pi) ((Object) stackIn_5_0);
        } else {
          return stackIn_7_0;
        }
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_8_0 = 0;
        boolean stackIn_16_0 = false;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_L == null) {
                break L1;
              } else {
                if (!this.field_L.a(true)) {
                  break L1;
                } else {
                  if (!this.field_L.a(-125, param1, param2, param3)) {
                    break L1;
                  } else {
                    stackIn_8_0 = 1;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            var5_int = param1;
            if (-81 == (var5_int ^ -1)) {
              L2: {
                if (bj.field_d[81]) {
                  stackIn_16_0 = this.a(param2, (byte) -112);
                  break L2;
                } else {
                  stackIn_16_0 = this.b(false, param2);
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              var5_int = 24 / ((param0 - -22) / 49);
              stackIn_18_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("ma.QA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L3;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0;
          } else {
            return stackIn_18_0 != 0;
          }
        }
    }

    private final boolean b(boolean param0, ce param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        ce stackIn_9_0 = null;
        ce stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              L1: {
                L2: {
                  if (null == this.field_L) {
                    break L2;
                  } else {
                    L3: {
                      stackIn_9_0 = this.field_L;

                      if (param0) {
                        stackIn_10_0 = (ce) ((Object) stackIn_9_0);
                        stackIn_10_1 = 0;
                        break L3;
                      } else {

                        stackIn_10_0 = (ce) ((Object) stackIn_9_0);
                        stackIn_10_1 = 1;
                        break L3;
                      }
                    }
                    if (((ce) (Object) stackIn_10_0).a(stackIn_10_1 != 0)) {
                      break L2;
                    } else {
                      if (!this.field_L.a(false, param1)) {
                        break L2;
                      } else {
                        stackIn_17_0 = 1;
                        break L1;
                      }
                    }
                  }
                }
                stackIn_17_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("ma.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_17_0 != 0;
        }
    }

    final static tj a(int param0, long param1) {
        RuntimeException var3 = null;
        tj stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -98) {
                break L1;
              } else {
                field_G = (w) null;
                break L1;
              }
            }
            stackIn_4_0 = (tj) ((Object) ob.field_i.a(24710, param1));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var3), "ma.O(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    ma(int param0, int param1, int param2, int param3, gl param4, kg param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void a(byte param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var5 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        discarded$12 = param2.append('\n');
                        if (param0 <= -37) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.a(36, -51, (ce) null, -111, 8, 107, (byte) -44);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var5_int = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5_int > param1) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        discarded$13 = param2.append(' ');
                        var5_int++;
                        if (var6 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
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
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (this.field_L != null) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        discarded$14 = param2.append("null");
                        if (var6 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.field_L.a(param3, param1 + 1, param2, true);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_19_0 = (RuntimeException) (var5);
                    stackIn_17_0 = stackIn_19_0;
                    stackIn_19_1 = new StringBuilder().append("ma.M(").append(param0).append(',').append(param1).append(',');
                    stackIn_17_1 = stackIn_19_1;
                    if (param2 == null) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_20_2 = "{...}";
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_20_2 = "null";
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_0 = stackIn_23_0;
                    stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
                    stackIn_21_1 = stackIn_23_1;
                    if (param3 == null) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_21_1);
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
                    throw dh.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
                }
                case 25: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (null != this.field_L) {
                this.field_L.f(112);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0) {
                break L2;
              } else {
                this.a(true);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "ma.KB(" + param0 + ')');
        }
    }

    final void d(byte param0) {
        if (param0 != -95) {
            return;
        }
        try {
            if (this.field_L != null) {
                this.field_L.d((byte) -95);
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ma.WB(" + param0 + ')');
        }
    }

    public static void e(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 < -78) {
                break L1;
              } else {
                field_H = (String[]) null;
                break L1;
              }
            }
            field_J = null;
            field_G = null;
            field_H = null;
            field_K = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "ma.I(" + param0 + ')');
        }
    }

    boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
        RuntimeException var8 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param6 == -55) {
                break L1;
              } else {
                this.a(59);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_L == null) {
                  break L3;
                } else {
                  if (!this.field_L.a(param0, param1, param2, param3, this.field_D + param4, this.field_u + param5, (byte) -55)) {
                    break L3;
                  } else {
                    stackIn_10_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_10_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8);

            stackIn_14_1 = new StringBuilder().append("ma.LB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_10_0 != 0;
    }

    StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(0, param1, param0, param2)) {
                this.a((byte) 72, param2, param0, param1);
                this.a((byte) -116, param1, param2, param0);
                break L1;
              } else {
                break L1;
              }
            }
            if (param3) {
              stackIn_8_0 = (StringBuilder) (param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_6_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("ma.MB(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_8_0;
        }
    }

    final static int a(int param0, byte param1) {
        int stackIn_4_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_46_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            if (0 == param0) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param0 ^ -1) < -1) {
                L1: {
                  var2_int = 1;
                  if (param0 > 65535) {
                    param0 = param0 >> 16;
                    var2_int += 16;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (-256 > (param0 ^ -1)) {
                    param0 = param0 >> 8;
                    var2_int += 8;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (-16 > (param0 ^ -1)) {
                    param0 = param0 >> 4;
                    var2_int += 4;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if ((param0 ^ -1) < -4) {
                    var2_int += 2;
                    param0 = param0 >> 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (1 < param0) {
                    param0 = param0 >> 1;
                    var2_int++;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                stackIn_29_0 = var2_int;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1 >= 46) {
                  L6: {
                    var2_int = 2;
                    if (65535 >= (param0 ^ -1)) {
                      break L6;
                    } else {
                      param0 = param0 >> 16;
                      var2_int += 16;
                      break L6;
                    }
                  }
                  L7: {
                    if (param0 >= -256) {
                      break L7;
                    } else {
                      param0 = param0 >> 8;
                      var2_int += 8;
                      break L7;
                    }
                  }
                  L8: {
                    if (15 >= (param0 ^ -1)) {
                      break L8;
                    } else {
                      var2_int += 4;
                      param0 = param0 >> 4;
                      break L8;
                    }
                  }
                  L9: {
                    if ((param0 ^ -1) > 3) {
                      var2_int += 2;
                      param0 = param0 >> 2;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (1 >= (param0 ^ -1)) {
                      break L10;
                    } else {
                      param0 = param0 >> 1;
                      var2_int++;
                      break L10;
                    }
                  }
                  stackIn_46_0 = var2_int;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_32_0 = 45;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "ma.L(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_29_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_32_0;
            } else {
              return stackIn_46_0;
            }
          }
        }
    }

    static {
        field_H = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
