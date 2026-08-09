/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po extends ah {
    static int[] field_wb;
    static String field_Ab;
    private kd field_yb;
    static int[] field_zb;
    static int field_xb;

    final void a(wk param0, int param1) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawn.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        bi.d(param0.a(this.a(true), (byte) -124), param0.a(this.f(237239984), 0), 250, 16711680);
                        bi.d(param0.a(this.a(true), (byte) -79), param0.a(this.f(237239984), param1 + -5060), 55, 16711935);
                        var3_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (this.field_ub <= var3_int) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4 = param0.a(this.field_jb[var3_int], (byte) -78);
                        var5 = param0.a(this.field_gb[var3_int], param1 ^ 5060);
                        bi.b(-1 + var4, var5 + -1, 3, 3, 0);
                        bi.a(var4, var5, 65280);
                        var3_int++;
                        if (var6 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param1 == 5060) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        if (null != this.field_yb) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        bi.e(param0.a(this.a(true), (byte) -122), param0.a(this.f(237239984), 0), param0.a(this.field_yb.a(true), (byte) -60), param0.a(this.field_yb.f(param1 + 237234924), 0), 65280);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (var3);
                    stackIn_15_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("po.L(");
                    stackIn_15_1 = stackIn_17_1;
                    if (param0 == null) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_15_1);
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
                    throw sh.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void l(byte param0) {
        kd discarded$1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 52) {
                break L1;
              } else {
                discarded$1 = this.m((byte) 55);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.a(false, false, -85, 55)) {
                  break L3;
                } else {
                  if (!this.a(true, false, -102, 250)) {
                    break L2;
                  } else {
                    if (1 == this.field_F) {
                      break L2;
                    } else {
                      this.p(-123);
                      if (ZombieDawn.field_J == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              this.b(true);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "po.I(" + param0 + ')');
        }
    }

    final void g(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              super.g(120);
              if (this.field_F == 10) {
                L2: {
                  if ((this.field_G ^ -1) != -1) {
                    break L2;
                  } else {
                    if (this.field_N != 5) {
                      break L2;
                    } else {
                      this.field_U = dc.a((byte) 18, 12);
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-2 != (this.field_G ^ -1)) {
                    break L3;
                  } else {
                    if (this.field_yb != null) {
                      this.field_yb.c(401408, this.f(237239984), this.a(true));
                      this.field_yb = null;
                      if (ZombieDawn.field_J == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                if (this.field_G != 2) {
                  break L1;
                } else {
                  this.e(0, -6904);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L4: {
              if (param0 > 95) {
                break L4;
              } else {
                field_wb = (int[]) null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "po.A(" + param0 + ')');
        }
    }

    public static void v(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_zb = null;
              field_Ab = null;
              if (param0 == -31113) {
                break L1;
              } else {
                po.a(69, -111, false, 104, (gd) null);
                break L1;
              }
            }
            field_wb = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "po.D(" + param0 + ')');
        }
    }

    private final void b(boolean param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_yb = this.m((byte) -95);
            if (this.field_yb == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  var2_int = this.field_yb.a(param0) + -this.a(true);
                  var3 = this.field_yb.f(237239984) + -this.f(237239984);
                  if (Math.abs(var3) <= Math.abs(var2_int)) {
                    break L2;
                  } else {
                    L3: {
                      stackIn_9_0 = this;

                      if (0 < var3) {
                        stackIn_10_0 = this;
                        stackIn_10_1 = 2;
                        break L3;
                      } else {
                        stackIn_7_0 = this;
                        stackIn_10_0 = this;
                        stackIn_10_1 = 0;
                        break L3;
                      }
                    }
                    ((po) (this)).field_S = stackIn_10_1;
                    if (ZombieDawn.field_J == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  stackIn_16_0 = this;

                  if (var2_int <= 0) {
                    stackIn_17_0 = this;
                    stackIn_17_1 = 3;
                    break L4;
                  } else {
                    stackIn_14_0 = this;
                    stackIn_17_0 = this;
                    stackIn_17_1 = 1;
                    break L4;
                  }
                }
                ((po) (this)).field_S = stackIn_17_1;
                break L1;
              }
              this.e(10, -6904);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) runtimeException), "po.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    po(int param0, int param1, int param2) {
        super(param0, param1, param2, 200704);
        this.field_yb = null;
        try {
            this.field_ub = 21;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "po.<init>(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, gd param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
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
                    var19 = ZombieDawn.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = wm.a((param3 - param1) * 3, (byte) -95);
                        var6 = 3 * param1;
                        nl.c(param0 ^ -30006);
                        var7 = var5_int - 10;
                        if (param4.field_p <= 0) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null != param4.field_F) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        jd.a(91);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        eh.field_A = 0;
                        var8 = param0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param4.field_c <= var8) {
                            statePc = 48;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var9 = param4.field_g[var8];
                        var10 = param4.field_H[var8];
                        var11 = param4.field_r[var8];
                        stackOut_10_0 = param2;
                        stackIn_49_0 = stackOut_10_0 ? 1 : 0;
                        stackIn_11_0 = stackOut_10_0;
                        if (var19 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var12 = to.field_a[var9];
                        var13 = wc.field_Nb[var9];
                        var14 = -var12 + to.field_a[var10];
                        var15 = -var12 + to.field_a[var11];
                        var16 = -var13 + wc.field_Nb[var10];
                        var17 = wc.field_Nb[var11] + -var13;
                        if (0 > var14 * var17 + -(var15 * var16)) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var19 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var12 = pj.field_s[var9];
                        if (2147483647 != (var12 ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var19 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var13 = pj.field_s[var10];
                        if (2147483647 == (var13 ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var14 = pj.field_s[var11];
                        if (-2147483648 == var14) {
                            statePc = 47;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var15 = var14 + var12 - -var13 + -var6;
                        if (var7 < 0) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_29_0 = var15 >> var7;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_29_0 = var15 << -var7;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var16 = -stackIn_29_0 + je.field_b.length - 1;
                        var17 = je.field_b[var16];
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (0 == var17 >> -916753404) {
                            statePc = 38;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var16--;
                        stackIn_39_0 = var16;
                        stackIn_32_0 = stackIn_39_0;
                        if (var19 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (stackIn_32_0 < 0) {
                            statePc = 36;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var17 = je.field_b[var16];
                        if (var19 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_39_0 = var17 + (var16 << -769810076);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var18 = stackIn_39_0;
                        uf.field_o[var18] = var8;
                        je.field_b[var16] = 1 + var17;
                        if (-1 <= (param4.field_p ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (null != param4.field_F) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        dupTemp$0 = param4.field_F[var8];
                        jp.field_f[dupTemp$0] = jp.field_f[dupTemp$0] + 1;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        eh.field_A = eh.field_A + 1;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_49_0 = param4.field_p ^ -1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0 >= -1) {
                            statePc = 67;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (null != param4.field_F) {
                            statePc = 55;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (jp.field_f.length <= var9) {
                            statePc = 67;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var10 = jp.field_f[var9];
                        jp.field_f[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var19 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var19 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 62: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_65_0 = (RuntimeException) (var5);
                    stackIn_63_0 = stackIn_65_0;
                    stackIn_65_1 = new StringBuilder().append("po.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_63_1 = stackIn_65_1;
                    if (param4 == null) {
                        statePc = 65;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    stackIn_66_0 = (RuntimeException) ((Object) stackIn_63_0);
                    stackIn_66_1 = (StringBuilder) ((Object) stackIn_63_1);
                    stackIn_66_2 = "{...}";
                    statePc = 66;
                    continue stateLoop;
                }
                case 65: {
                    stackIn_66_0 = (RuntimeException) ((Object) stackIn_65_0);
                    stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
                    stackIn_66_2 = "null";
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    throw sh.a((Throwable) ((Object) stackIn_66_0), stackIn_66_2 + ')');
                }
                case 67: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void f(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              ej.field_o = ob.field_b[param1];
              if (param0 == -1) {
                break L1;
              } else {
                field_Ab = (String) null;
                break L1;
              }
            }
            L2: {
              tm.field_h = kd.field_Fb[param1];
              if (null == qj.field_j[param1]) {
                break L2;
              } else {
                la.field_c = qj.field_j[param1];
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "po.F(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean w(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 13296) {
                break L1;
              } else {
                po.f(-73, 6);
                break L1;
              }
            }
            stackIn_4_0 = i.field_Y;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "po.E(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final kd m(byte param0) {
        Object var2 = null;
        int var3 = 0;
        le var4 = null;
        int var10 = 0;
        Object stackIn_22_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var10 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var2 = null;
              var3 = -1;
              if (param0 <= -60) {
                break L1;
              } else {
                field_wb = (int[]) null;
                break L1;
              }
            }
            var4 = dj.field_e.field_R.b((byte) 26);
            L2: while (true) {
              L3: {
                if (!(var4 instanceof fb)) {
                  break L3;
                } else {
                  L4: {
                    if (!(var4 instanceof kd)) {
                      break L4;
                    } else {
                      if ((((kd) ((Object) var4)).field_F ^ -1) == -9) {
                        break L4;
                      } else {
                        if (((kd) ((Object) var4)).x(37)) {
                          L5: {
                            var5 = ((kd) ((Object) var4)).a(true);
                            var6 = ((kd) ((Object) var4)).f(237239984);
                            var7 = -var5 + this.a(true);
                            var8 = -var6 + this.f(237239984);
                            var9 = var8 * var8 + var7 * var7;
                            if ((var9 ^ -1) > (var3 ^ -1)) {
                              break L5;
                            } else {
                              if (-1 != var3) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var3 = var9;
                          var2 = (kd) ((Object) var4);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var4 = var4.field_b;
                  if (var10 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_22_0 = var2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) (var2), "po.G(" + param0 + ')');
        }
        return (kd) ((Object) stackIn_22_0);
    }

    static {
        field_Ab = "Start Game";
        field_wb = new int[]{39, 38};
        field_zb = new int[8192];
    }
}
