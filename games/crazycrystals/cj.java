/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj extends qf implements Cloneable {
    private int field_z;
    private boolean field_B;
    static ko field_x;
    private int field_D;
    static int field_A;
    static String field_E;
    static String field_C;
    private int field_F;
    static String field_y;

    final void c(boolean param0, boolean param1) {
        if (!(!param1)) {
            return;
        }
        if (!param0) {
            byte[] var4 = (byte[]) null;
            cj.a(-101, 72, (md) null, (byte[]) null);
        }
        to.field_c = to.field_c + 1;
    }

    final void f(int param0, int param1, f[][] param2, int param3) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                field_C = (String) null;
                break L1;
              }
            }
            L2: {
              if (0 < this.field_z) {
                this.field_z = this.field_z - 1;
                if (0 != this.field_z) {
                  break L2;
                } else {
                  this.field_B = true;
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (0 != this.field_z) {
                break L3;
              } else {
                if (this.field_B) {
                  break L3;
                } else {
                  super.f(1, param1, param2, param3);
                  break L3;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("cj.LA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        double var7_double;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        L0: {
          var11 = CrazyCrystals.field_B;
          if (param0) {
            break L0;
          } else {
            var7_double = -Math.cos((double)this.field_F * 0.09817477042468103) + 1.0;
            var9 = (int)Math.floor(0.5 + (double)param2 * var7_double / 12.0);
            param1 = param1 + var9;
            var10 = (int)Math.floor((double)param3 * var7_double / 12.0 + 0.5);
            param2 = param2 - var9;
            param4 = param4 + var10;
            param3 = param3 - var10;
            break L0;
          }
        }
        L1: {
          if (0 >= param2) {
            break L1;
          } else {
            if (0 >= param3) {
              break L1;
            } else {
              if (this.field_u) {
                var7 = param1 + param2 << -1893408604;
                var8 = (param3 << -67635741) + (param4 << 286858980);
                var9 = 4096 * param2 / 24;
                var10 = (int)(Math.random() * 2048.0 - 1024.0);
                al.field_a.a(384, 576, var7, var8, var10, var9);
                break L1;
              } else {
                L2: {
                  if ((param2 ^ -1) != -25) {
                    break L2;
                  } else {
                    if (-25 == (param3 ^ -1)) {
                      al.field_a.a(param1, param4 + -param3);
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                al.field_a.b(param1, -param3 + param4, param2 * 2, 3 * param3);
                break L1;
              }
            }
          }
        }
        if (param5 == 4261) {
          L3: {
            if (!param0) {
              break L3;
            } else {
              an.field_q.c(Integer.toString(this.field_D), param2 + param1, 6 + (param3 / 2 + param4), 16760896, -1);
              break L3;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final f g(int param0, int param1, f[][] param2, int param3) {
        vh dupTemp$1 = null;
        ig stackIn_14_0 = null;
        f[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        f stackIn_18_2 = null;
        Object stackIn_18_3 = null;
        int stackIn_18_4 = 0;
        int stackIn_18_5 = 0;
        f[][] stackIn_18_6 = null;
        int stackIn_18_7 = 0;
        int stackIn_18_8 = 0;
        f[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        f stackIn_19_2 = null;
        Object stackIn_19_3 = null;
        int stackIn_19_4 = 0;
        int stackIn_19_5 = 0;
        f[][] stackIn_19_6 = null;
        f[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        f stackIn_20_2 = null;
        Object stackIn_20_3 = null;
        int stackIn_20_4 = 0;
        int stackIn_20_5 = 0;
        f[][] stackIn_20_6 = null;
        int stackIn_20_7 = 0;
        int stackIn_20_8 = 0;
        f[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        f stackIn_21_2 = null;
        Object stackIn_21_3 = null;
        int stackIn_21_4 = 0;
        int stackIn_21_5 = 0;
        f[][] stackIn_21_6 = null;
        f[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        f stackIn_22_2 = null;
        Object stackIn_22_3 = null;
        int stackIn_22_4 = 0;
        int stackIn_22_5 = 0;
        f[][] stackIn_22_6 = null;
        f[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        f stackIn_23_2 = null;
        Object stackIn_23_3 = null;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        f[][] stackIn_23_6 = null;
        dl[] stackIn_23_7 = null;
        f[] stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        f stackIn_28_2 = null;
        Object stackIn_28_3 = null;
        int stackIn_28_4 = 0;
        int stackIn_28_5 = 0;
        f[][] stackIn_28_6 = null;
        int stackIn_28_7 = 0;
        int stackIn_28_8 = 0;
        f[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        f stackIn_29_2 = null;
        Object stackIn_29_3 = null;
        int stackIn_29_4 = 0;
        int stackIn_29_5 = 0;
        f[][] stackIn_29_6 = null;
        f[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        f stackIn_30_2 = null;
        Object stackIn_30_3 = null;
        int stackIn_30_4 = 0;
        int stackIn_30_5 = 0;
        f[][] stackIn_30_6 = null;
        int stackIn_30_7 = 0;
        int stackIn_30_8 = 0;
        f[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        f stackIn_31_2 = null;
        Object stackIn_31_3 = null;
        int stackIn_31_4 = 0;
        int stackIn_31_5 = 0;
        f[][] stackIn_31_6 = null;
        f[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        f stackIn_32_2 = null;
        Object stackIn_32_3 = null;
        int stackIn_32_4 = 0;
        int stackIn_32_5 = 0;
        f[][] stackIn_32_6 = null;
        f[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        f stackIn_33_2 = null;
        Object stackIn_33_3 = null;
        int stackIn_33_4 = 0;
        int stackIn_33_5 = 0;
        f[][] stackIn_33_6 = null;
        dl[] stackIn_33_7 = null;
        f[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        f stackIn_39_2 = null;
        Object stackIn_39_3 = null;
        int stackIn_39_4 = 0;
        int stackIn_39_5 = 0;
        f[][] stackIn_39_6 = null;
        f[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        f stackIn_40_2 = null;
        Object stackIn_40_3 = null;
        int stackIn_40_4 = 0;
        int stackIn_40_5 = 0;
        f[][] stackIn_40_6 = null;
        f[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        f stackIn_41_2 = null;
        Object stackIn_41_3 = null;
        int stackIn_41_4 = 0;
        int stackIn_41_5 = 0;
        f[][] stackIn_41_6 = null;
        dl[] stackIn_41_7 = null;
        f[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        f stackIn_47_2 = null;
        Object stackIn_47_3 = null;
        int stackIn_47_4 = 0;
        int stackIn_47_5 = 0;
        f[][] stackIn_47_6 = null;
        f[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        f stackIn_48_2 = null;
        Object stackIn_48_3 = null;
        int stackIn_48_4 = 0;
        int stackIn_48_5 = 0;
        f[][] stackIn_48_6 = null;
        f[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        f stackIn_49_2 = null;
        Object stackIn_49_3 = null;
        int stackIn_49_4 = 0;
        int stackIn_49_5 = 0;
        f[][] stackIn_49_6 = null;
        dl[] stackIn_49_7 = null;
        f stackIn_53_0 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        f var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = CrazyCrystals.field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (ab.field_D != null) {
                            statePc = 11;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        to.field_c = to.field_c - 1;
                        var5_int = this.a(false);
                        mb.field_g = mb.field_g + 5;
                        fn.field_j = fn.field_j + 5;
                        var6 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var6 >= 3) {
                            statePc = 11;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (-1 != (1 << var6 & var5_int ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        dupTemp$1 = q.field_a[var6];
                        dupTemp$1.field_g = dupTemp$1.field_g + 1;
                        mb.field_g = mb.field_g + 3;
                        fn.field_j = fn.field_j + 4;
                        if (to.field_c == 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        qg.field_q = qg.field_q | 1 << var6;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6++;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_l.a((byte) 82, (f) (this));
                        if ((this.field_D ^ -1) == param3) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        dd.field_c.a(64, param1 * 12, param0 * 12, 0, (byte) -111);
                        stackIn_14_0 = new ig((f) (this), bd.field_n, this.field_l, false);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return (f) ((Object) stackIn_14_0);
                }
                case 15: {
                    try {
                        var5 = this.field_l.a((f) (this), param0, param1, param2, ba.field_g, (byte) -87).a((f) (this), param0, param1, param2, jg.field_i, (byte) -87);
                        var6 = 1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var6 > this.field_D) {
                            statePc = 25;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var7 = param2[param0][param1 + -var6].b((byte) 98) ? 1 : 0;
                        stackIn_20_0 = param2[param0];
                        stackIn_18_0 = stackIn_20_0;
                        stackIn_20_1 = -var6 + param1;
                        stackIn_18_1 = stackIn_20_1;
                        stackIn_20_2 = param2[param0][param1 - var6];
                        stackIn_18_2 = stackIn_20_2;
                        stackIn_20_3 = this;
                        stackIn_18_3 = stackIn_20_3;
                        stackIn_20_4 = param0;
                        stackIn_18_4 = stackIn_20_4;
                        stackIn_20_5 = -var6 + param1;
                        stackIn_18_5 = stackIn_20_5;
                        stackIn_20_6 = (f[][]) (param2);
                        stackIn_18_6 = stackIn_20_6;
                        stackIn_20_7 = var6 ^ -1;
                        stackIn_18_7 = stackIn_20_7;
                        stackIn_20_8 = this.field_D ^ -1;
                        stackIn_18_8 = stackIn_20_8;
                        if (true) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_48_0 = (f[]) ((Object) stackIn_18_0);
                        stackIn_19_0 = stackIn_48_0;
                        stackIn_48_1 = stackIn_18_1;
                        stackIn_19_1 = stackIn_48_1;
                        stackIn_48_2 = (f) ((Object) stackIn_18_2);
                        stackIn_19_2 = stackIn_48_2;
                        stackIn_48_3 = this;
                        stackIn_19_3 = stackIn_48_3;
                        stackIn_48_4 = stackIn_18_4;
                        stackIn_19_4 = stackIn_48_4;
                        stackIn_48_5 = stackIn_18_5;
                        stackIn_19_5 = stackIn_48_5;
                        stackIn_48_6 = (f[][]) ((Object) stackIn_18_6);
                        stackIn_19_6 = stackIn_48_6;
                        if (stackIn_18_7 == stackIn_18_8) {
                            statePc = 48;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_47_0 = (f[]) ((Object) stackIn_19_0);
                        stackIn_47_1 = stackIn_19_1;
                        stackIn_47_2 = (f) ((Object) stackIn_19_2);
                        stackIn_47_3 = this;
                        stackIn_47_4 = stackIn_19_4;
                        stackIn_47_5 = stackIn_19_5;
                        stackIn_47_6 = (f[][]) ((Object) stackIn_19_6);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_22_0 = (f[]) ((Object) stackIn_20_0);
                        stackIn_21_0 = stackIn_22_0;
                        stackIn_22_1 = stackIn_20_1;
                        stackIn_21_1 = stackIn_22_1;
                        stackIn_22_2 = (f) ((Object) stackIn_20_2);
                        stackIn_21_2 = stackIn_22_2;
                        stackIn_22_3 = this;
                        stackIn_21_3 = stackIn_22_3;
                        stackIn_22_4 = stackIn_20_4;
                        stackIn_21_4 = stackIn_22_4;
                        stackIn_22_5 = stackIn_20_5;
                        stackIn_21_5 = stackIn_22_5;
                        stackIn_22_6 = (f[][]) ((Object) stackIn_20_6);
                        stackIn_21_6 = stackIn_22_6;
                        if (stackIn_20_7 == stackIn_20_8) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_23_0 = (f[]) ((Object) stackIn_21_0);
                        stackIn_23_1 = stackIn_21_1;
                        stackIn_23_2 = (f) ((Object) stackIn_21_2);
                        stackIn_23_3 = this;
                        stackIn_23_4 = stackIn_21_4;
                        stackIn_23_5 = stackIn_21_5;
                        stackIn_23_6 = (f[][]) ((Object) stackIn_21_6);
                        stackIn_23_7 = ba.field_g;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = (f[]) ((Object) stackIn_22_0);
                        stackIn_23_1 = stackIn_22_1;
                        stackIn_23_2 = (f) ((Object) stackIn_22_2);
                        stackIn_23_3 = this;
                        stackIn_23_4 = stackIn_22_4;
                        stackIn_23_5 = stackIn_22_5;
                        stackIn_23_6 = (f[][]) ((Object) stackIn_22_6);
                        stackIn_23_7 = hj.field_b;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_23_0[stackIn_23_1] = ((f) (Object) stackIn_23_2).a((f) (this), stackIn_23_4, stackIn_23_5, stackIn_23_6, stackIn_23_7, (byte) -87);
                        if (var7 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var6++;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var6 = 1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var6 > this.field_D) {
                            statePc = 36;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var7 = param2[param0][param1 + var6].b((byte) 97) ? 1 : 0;
                        stackIn_30_0 = param2[param0];
                        stackIn_28_0 = stackIn_30_0;
                        stackIn_30_1 = var6 + param1;
                        stackIn_28_1 = stackIn_30_1;
                        stackIn_30_2 = param2[param0][var6 + param1];
                        stackIn_28_2 = stackIn_30_2;
                        stackIn_30_3 = this;
                        stackIn_28_3 = stackIn_30_3;
                        stackIn_30_4 = param0;
                        stackIn_28_4 = stackIn_30_4;
                        stackIn_30_5 = param1 - -var6;
                        stackIn_28_5 = stackIn_30_5;
                        stackIn_30_6 = (f[][]) (param2);
                        stackIn_28_6 = stackIn_30_6;
                        stackIn_30_7 = var6;
                        stackIn_28_7 = stackIn_30_7;
                        stackIn_30_8 = this.field_D;
                        stackIn_28_8 = stackIn_30_8;
                        if (true) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_48_0 = (f[]) ((Object) stackIn_28_0);
                        stackIn_29_0 = stackIn_48_0;
                        stackIn_48_1 = stackIn_28_1;
                        stackIn_29_1 = stackIn_48_1;
                        stackIn_48_2 = (f) ((Object) stackIn_28_2);
                        stackIn_29_2 = stackIn_48_2;
                        stackIn_48_3 = this;
                        stackIn_29_3 = stackIn_48_3;
                        stackIn_48_4 = stackIn_28_4;
                        stackIn_29_4 = stackIn_48_4;
                        stackIn_48_5 = stackIn_28_5;
                        stackIn_29_5 = stackIn_48_5;
                        stackIn_48_6 = (f[][]) ((Object) stackIn_28_6);
                        stackIn_29_6 = stackIn_48_6;
                        if (stackIn_28_7 == stackIn_28_8) {
                            statePc = 48;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_47_0 = (f[]) ((Object) stackIn_29_0);
                        stackIn_47_1 = stackIn_29_1;
                        stackIn_47_2 = (f) ((Object) stackIn_29_2);
                        stackIn_47_3 = this;
                        stackIn_47_4 = stackIn_29_4;
                        stackIn_47_5 = stackIn_29_5;
                        stackIn_47_6 = (f[][]) ((Object) stackIn_29_6);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_32_0 = (f[]) ((Object) stackIn_30_0);
                        stackIn_31_0 = stackIn_32_0;
                        stackIn_32_1 = stackIn_30_1;
                        stackIn_31_1 = stackIn_32_1;
                        stackIn_32_2 = (f) ((Object) stackIn_30_2);
                        stackIn_31_2 = stackIn_32_2;
                        stackIn_32_3 = this;
                        stackIn_31_3 = stackIn_32_3;
                        stackIn_32_4 = stackIn_30_4;
                        stackIn_31_4 = stackIn_32_4;
                        stackIn_32_5 = stackIn_30_5;
                        stackIn_31_5 = stackIn_32_5;
                        stackIn_32_6 = (f[][]) ((Object) stackIn_30_6);
                        stackIn_31_6 = stackIn_32_6;
                        if (stackIn_30_7 == stackIn_30_8) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_33_0 = (f[]) ((Object) stackIn_31_0);
                        stackIn_33_1 = stackIn_31_1;
                        stackIn_33_2 = (f) ((Object) stackIn_31_2);
                        stackIn_33_3 = this;
                        stackIn_33_4 = stackIn_31_4;
                        stackIn_33_5 = stackIn_31_5;
                        stackIn_33_6 = (f[][]) ((Object) stackIn_31_6);
                        stackIn_33_7 = ba.field_g;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = (f[]) ((Object) stackIn_32_0);
                        stackIn_33_1 = stackIn_32_1;
                        stackIn_33_2 = (f) ((Object) stackIn_32_2);
                        stackIn_33_3 = this;
                        stackIn_33_4 = stackIn_32_4;
                        stackIn_33_5 = stackIn_32_5;
                        stackIn_33_6 = (f[][]) ((Object) stackIn_32_6);
                        stackIn_33_7 = q.field_b;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_33_0[stackIn_33_1] = ((f) (Object) stackIn_33_2).a((f) (this), stackIn_33_4, stackIn_33_5, stackIn_33_6, stackIn_33_7, (byte) -87);
                        if (var7 != 0) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var6++;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var6 = 1;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var6 > this.field_D) {
                            statePc = 44;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var7 = param2[param0 - var6][param1].b((byte) 112) ? 1 : 0;
                        stackIn_40_0 = param2[-var6 + param0];
                        stackIn_39_0 = stackIn_40_0;
                        stackIn_40_1 = param1;
                        stackIn_39_1 = stackIn_40_1;
                        stackIn_40_2 = param2[param0 - var6][param1];
                        stackIn_39_2 = stackIn_40_2;
                        stackIn_40_3 = this;
                        stackIn_39_3 = stackIn_40_3;
                        stackIn_40_4 = -var6 + param0;
                        stackIn_39_4 = stackIn_40_4;
                        stackIn_40_5 = param1;
                        stackIn_39_5 = stackIn_40_5;
                        stackIn_40_6 = (f[][]) (param2);
                        stackIn_39_6 = stackIn_40_6;
                        if (var6 != this.field_D) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_41_0 = (f[]) ((Object) stackIn_39_0);
                        stackIn_41_1 = stackIn_39_1;
                        stackIn_41_2 = (f) ((Object) stackIn_39_2);
                        stackIn_41_3 = this;
                        stackIn_41_4 = stackIn_39_4;
                        stackIn_41_5 = stackIn_39_5;
                        stackIn_41_6 = (f[][]) ((Object) stackIn_39_6);
                        stackIn_41_7 = pl.field_B;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_41_0 = (f[]) ((Object) stackIn_40_0);
                        stackIn_41_1 = stackIn_40_1;
                        stackIn_41_2 = (f) ((Object) stackIn_40_2);
                        stackIn_41_3 = this;
                        stackIn_41_4 = stackIn_40_4;
                        stackIn_41_5 = stackIn_40_5;
                        stackIn_41_6 = (f[][]) ((Object) stackIn_40_6);
                        stackIn_41_7 = jg.field_i;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_41_0[stackIn_41_1] = ((f) (Object) stackIn_41_2).a((f) (this), stackIn_41_4, stackIn_41_5, stackIn_41_6, stackIn_41_7, (byte) -87);
                        if (var7 != 0) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var6++;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var6 = 1;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var6 > this.field_D) {
                            statePc = 52;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var7 = param2[var6 + param0][param1].b((byte) 58) ? 1 : 0;
                        stackIn_48_0 = param2[var6 + param0];
                        stackIn_47_0 = stackIn_48_0;
                        stackIn_48_1 = param1;
                        stackIn_47_1 = stackIn_48_1;
                        stackIn_48_2 = param2[var6 + param0][param1];
                        stackIn_47_2 = stackIn_48_2;
                        stackIn_48_3 = this;
                        stackIn_47_3 = stackIn_48_3;
                        stackIn_48_4 = var6 + param0;
                        stackIn_47_4 = stackIn_48_4;
                        stackIn_48_5 = param1;
                        stackIn_47_5 = stackIn_48_5;
                        stackIn_48_6 = (f[][]) (param2);
                        stackIn_47_6 = stackIn_48_6;
                        if (var6 == this.field_D) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_49_0 = (f[]) ((Object) stackIn_47_0);
                        stackIn_49_1 = stackIn_47_1;
                        stackIn_49_2 = (f) ((Object) stackIn_47_2);
                        stackIn_49_3 = this;
                        stackIn_49_4 = stackIn_47_4;
                        stackIn_49_5 = stackIn_47_5;
                        stackIn_49_6 = (f[][]) ((Object) stackIn_47_6);
                        stackIn_49_7 = jg.field_i;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_49_0 = (f[]) ((Object) stackIn_48_0);
                        stackIn_49_1 = stackIn_48_1;
                        stackIn_49_2 = (f) ((Object) stackIn_48_2);
                        stackIn_49_3 = this;
                        stackIn_49_4 = stackIn_48_4;
                        stackIn_49_5 = stackIn_48_5;
                        stackIn_49_6 = (f[][]) ((Object) stackIn_48_6);
                        stackIn_49_7 = cl.field_n;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_49_0[stackIn_49_1] = ((f) (Object) stackIn_49_2).a((f) (this), stackIn_49_4, stackIn_49_5, stackIn_49_6, stackIn_49_7, (byte) -87);
                        if (var7 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var6++;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_53_0 = (f) (var5);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 53: {
                    return stackIn_53_0;
                }
                case 54: {
                    var5_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_56_0 = (RuntimeException) (var5_ref);
                    stackIn_55_0 = stackIn_56_0;
                    stackIn_56_1 = new StringBuilder().append("cj.HC(").append(param0).append(',').append(param1).append(',');
                    stackIn_55_1 = stackIn_56_1;
                    if (param2 == null) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackIn_57_0 = (RuntimeException) ((Object) stackIn_55_0);
                    stackIn_57_1 = (StringBuilder) ((Object) stackIn_55_1);
                    stackIn_57_2 = "{...}";
                    statePc = 57;
                    continue stateLoop;
                }
                case 56: {
                    stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
                    stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
                    stackIn_57_2 = "null";
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    throw dn.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static byte[] a(int param0, int param1, md param2, byte[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_5_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param1 == 2048) {
                break L1;
              } else {
                cj.f((byte) 73);
                break L1;
              }
            }
            var4_int = param2.d((byte) -61, param0);
            if (-1 != (var4_int ^ -1)) {
              L2: {
                L3: {
                  if (param3 == null) {
                    break L3;
                  } else {
                    if (param3.length != var4_int) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                param3 = new byte[var4_int];
                break L2;
              }
              L4: {
                var5 = param2.d((byte) -58, 3);
                var6 = (byte)param2.d((byte) -104, 8);
                if (-1 <= (var5 ^ -1)) {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param3[var7] = (byte)var6;
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param3[var7] = (byte)(param2.d((byte) -69, var5) + var6);
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackIn_18_0 = (byte[]) (param3);
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
          L7: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("cj.GC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_5_0);
        } else {
          return stackIn_18_0;
        }
    }

    cj(f param0, int param1, int param2, int param3) {
        super(param0);
        this.field_B = false;
        this.field_z = 0;
        try {
            this.field_F = (3 * param2 - -(5 * param3)) % 64;
            this.field_D = param1;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "cj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1) {
        this.field_D = param0;
        if (param1 < 61) {
            byte[] var4 = (byte[]) null;
            cj.a(29, -120, (md) null, (byte[]) null);
        }
    }

    final boolean b(byte param0) {
        if (param0 <= 43) {
            f var3 = (f) null;
            this.a(-108, 119, (f[][]) null, (f) null, (byte) -39);
        }
        return this.field_B;
    }

    public static void f(byte param0) {
        field_x = null;
        if (param0 != -21) {
            return;
        }
        field_C = null;
        field_y = null;
        field_E = null;
    }

    final nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        nj stackIn_2_0 = null;
        nj stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 23525) {
              stackIn_4_0 = ng.a(kd.field_i, param1, new cj(new kp(-1), this.field_D, 0, 0), (byte) -83, bd.field_l);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nj) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("cj.V(").append(param0).append(',');

            if (param1 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final boolean a(mj param0, boolean param1, f[][] param2) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              stackIn_2_0 = this;

              if (!param1) {
                stackIn_3_0 = this;
                stackIn_3_1 = 0;
                break L1;
              } else {
                stackIn_3_0 = this;
                stackIn_3_1 = 1;
                break L1;
              }
            }
            ((cj) (this)).field_B = stackIn_3_1 != 0;
            this.a((byte) 95, param0.field_a);
            stackIn_4_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("cj.PA(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final f e(int param0, int param1, f[][] param2, int param3) {
        RuntimeException var5 = null;
        f stackIn_2_0 = null;
        f stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.field_B) {
              if (param3 > 120) {
                stackIn_7_0 = this;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (f) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              b.field_a = b.field_a + -3;
              we.field_h = we.field_h + -6;
              je.field_j = je.field_j + -3;
              fp.field_a = fp.field_a + -6;
              stackIn_2_0 = this.g(param0, param1, param2, -1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("cj.OA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return (f) (this);
          }
        }
    }

    final boolean a(byte param0, f[][] param1, f param2) {
        RuntimeException var4 = null;
        fq var5 = null;
        int stackIn_5_0 = 0;
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
              if (param0 == 42) {
                break L1;
              } else {
                var5 = (fq) null;
                this.a(96, -108, 70, (f[][]) null, -76, (fq) null, -124);
                break L1;
              }
            }
            if (0 != this.field_z) {
              stackIn_5_0 = 1;
              break L0;
            } else {
              this.field_z = 2;
              this.a((byte) 63, param2);
              b.field_a = b.field_a + -4;
              we.field_h = we.field_h + -8;
              fp.field_a = fp.field_a + -8;
              je.field_j = je.field_j + -4;
              fn.field_j = fn.field_j - ob.field_l;
              wd.field_j = wd.field_j + 1;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("cj.FB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(int param0, f[][] param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_F = (3 * param2 - -(5 * param3)) % 64;
              if (param0 == -35) {
                break L1;
              } else {
                this.field_B = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("cj.KC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean c(f[][] param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              fn.field_j = fn.field_j + ob.field_l;
              wd.field_j = wd.field_j - 1;
              we.field_h = we.field_h + 20;
              fp.field_a = fp.field_a + 20;
              je.field_j = je.field_j + 10;
              b.field_a = b.field_a + 10;
              if (param2 <= 0) {
                break L1;
              } else {
                field_x = (ko) null;
                break L1;
              }
            }
            this.field_B = true;
            wd.field_j = wd.field_j + 1;
            mb.field_g = mb.field_g + ob.field_l;
            stackIn_3_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("cj.KA(");

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
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static int[] d(int param0, int param1, int param2) {
        int var3 = rl.b(param1, (byte) -23);
        int var4 = tm.a(param1, 500);
        int var5 = rl.b(param2, (byte) -23);
        int var6 = tm.a(param2, 500);
        if (param0 > -64) {
            field_y = (String) null;
        }
        int var7 = (int)((long)var5 * (long)var3 >> -444876976);
        int var8 = (int)((long)var6 * (long)var3 >> -2020812336);
        int var9 = (int)((long)var5 * (long)var4 >> 1863610320);
        int var10 = (int)((long)var6 * (long)var4 >> -428674864);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final void c(int param0, int param1, f[][] param2, int param3) {
        if (param1 != 0) {
            return;
        }
        try {
            this.field_F = (this.field_F - -1) % 64;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "cj.W(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, f[][] param3, int param4, fq param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_4_0 = false;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != (this.field_z ^ -1)) {
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if (!this.field_B) {
                stackIn_4_0 = super.a(param0, -1, param2, param3, param4, param5, param6);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var8);

            stackIn_9_1 = new StringBuilder().append("cj.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final f a(int param0, int param1, f[][] param2, f param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        Object stackIn_1_0 = null;
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
            ob.field_l = ob.field_l + 1;
            var6_int = -110 / ((73 - param4) / 42);
            fn.field_j = fn.field_j - wd.field_j;
            this.field_B = true;
            this.a((byte) 123, param3);
            stackIn_1_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var6);

            stackIn_4_1 = new StringBuilder().append("cj.L(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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

            if (param3 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param4 + ')');
        }
        return (f) (this);
    }

    static {
        field_E = "To get a score or proceed beyond this level, complete the earlier ones first!";
        field_C = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_y = "Crystal";
    }
}
