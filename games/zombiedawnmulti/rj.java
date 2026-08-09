/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rj extends id {
    private boolean field_H;
    static int field_J;
    static ja[] field_I;
    static int field_F;
    private boolean field_G;

    final void f(byte param0) {
        if (param0 >= -79) {
            rj.i(14);
        }
    }

    rj(int param0, int param1, int param2) {
        super(param0, param1, param2);
        int var4;
        L0: {
          L1: {
            this.field_G = false;
            this.field_H = false;
            var4 = hp.a((byte) 104, g.field_a, 2);
            if (var4 == 1) {
              break L1;
            } else {
              if (2 != var4) {
                break L0;
              } else {
                this.field_H = true;
                if (!ZombieDawnMulti.field_E) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          this.field_G = true;
          break L0;
        }
    }

    final static void a(int param0, byte param1, String param2) {
        try {
            er.field_i = un.field_k;
            int var3_int = 75 % ((43 - param1) / 55);
            b.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rj.K(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, nm param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param1.c(this.g(65) + -24, -20126);
              var4 = param1.d(this.h(96) + -24, 106);
              if ((var3_int ^ -1) > 47) {
                break L1;
              } else {
                if (47 < (var4 ^ -1)) {
                  break L1;
                } else {
                  if (640.0f * param1.field_d < (float)var3_int) {
                    break L1;
                  } else {
                    if (480.0f * param1.field_d < (float)var4) {
                      break L1;
                    } else {
                      L2: {
                        L3: {
                          if (!this.field_G) {
                            break L3;
                          } else {
                            cp.field_X[this.field_C].b(var3_int, var4);
                            if (var5 == 0) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L4: {
                          if (!this.field_H) {
                            break L4;
                          } else {
                            cp.field_X[this.field_C].a(var3_int, var4);
                            if (var5 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        cp.field_X[this.field_C].g(var3_int, var4);
                        break L2;
                      }
                      L5: {
                        if (param0 == -10136) {
                          break L5;
                        } else {
                          rj.i(-46);
                          break L5;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("rj.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void j(int param0) {
        field_I = null;
        if (param0 != 8784) {
            field_F = -106;
        }
    }

    final static void i(int param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        kj var4 = null;
        nh var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        ga var28 = null;
        ga var29 = null;
        long[][] var36 = null;
        int[][] var37 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var26 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 3) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        rj.j(-22);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var28 = s.field_e;
                        var29 = var28;
                        var2 = var29.g(param0 + 31362);
                        if (var2 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var2 != 1) {
                            statePc = 18;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3 = var29.d((byte) 69);
                        var29.a((byte) -30);
                        var4 = (kj) ((Object) md.field_u.c(102));
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var4 == null) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_15_0 = var4.field_i;
                        stackIn_8_0 = stackIn_15_0;
                        if (var26 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 != var3) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var26 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var4 = (kj) ((Object) md.field_u.b(6));
                        if (var26 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var4 == null) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = -115;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ak.a((byte) stackIn_15_0);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return;
                }
                case 17: {
                    try {
                        var4.a(true);
                        if (var26 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        bd.a("HS1: " + ci.a(param0 ^ 3), (Throwable) null, false);
                        ak.a((byte) -123);
                        if (var26 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var3 = var29.d((byte) 69);
                        var4_ref = (nh) ((Object) pn.field_f.c(71));
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var4_ref == null) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_28_0 = var3 ^ -1;
                        stackIn_23_0 = stackIn_28_0;
                        if (var26 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0 == (var4_ref.field_l ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var4_ref = (nh) ((Object) pn.field_f.b(6));
                        if (var26 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var4_ref == null) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = -119;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        ak.a((byte) stackIn_28_0);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return;
                }
                case 30: {
                    try {
                        var5 = var29.g(param0 ^ 31366);
                        if (var5 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var4_ref.a(true);
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var6 = var4_ref.field_k;
                        ha.field_j[0].field_g = false;
                        ha.field_j[0].field_d = ta.field_lb;
                        ha.field_j[0].field_c = null;
                        var7 = var4_ref.field_f;
                        var8_int = 1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var5 <= var8_int) {
                            statePc = 40;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ha.field_j[var8_int].field_d = var28.f((byte) -121);
                        ha.field_j[var8_int].field_g = false;
                        stackIn_41_0 = 1;
                        stackIn_35_0 = stackIn_41_0;
                        stackIn_41_1 = var29.g(31365);
                        stackIn_35_1 = stackIn_41_1;
                        if (var26 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0 != stackIn_35_1) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ha.field_j[var8_int].field_c = var29.f((byte) -81);
                        if (var26 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        ha.field_j[var8_int].field_c = null;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var8_int++;
                        if (var26 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_41_0 = 3;
                        stackIn_41_1 = var6;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var8 = new String[stackIn_41_0][stackIn_41_1];
                        var9 = new String[3][var6];
                        var36 = new long[3][var6];
                        var37 = new int[3][var7 * var6];
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var29.g(31365);
                        if ((var18 ^ -1) < -1) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var19 = 0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var18 > var19) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var4_ref.a(true);
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var20 = var28.g(31365);
                        var21 = ha.field_j[var20].field_d;
                        var22 = var29.a((byte) -30);
                        var24 = var29.field_j;
                        if (var26 != 0) {
                            statePc = 75;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var6 > var19) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var8[0][var12] = var21;
                        var9[0][var12] = ha.field_j[var20].field_c;
                        var36[0][var12] = var22;
                        var12++;
                        var25 = 0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var7 <= var25) {
                            statePc = 54;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        incrementValue$0 = var15;
                        var15++;
                        var37[0][incrementValue$0] = var28.i(-1478490344);
                        var25++;
                        if (var26 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var26 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var21 == null) {
                            statePc = 62;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (sf.a(1, var21)) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var8[1][var13] = ta.field_lb;
                        var9[1][var13] = null;
                        var36[1][var13] = var22;
                        var13++;
                        var29.field_j = var24;
                        var25 = 0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var7 <= var25) {
                            statePc = 62;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        incrementValue$1 = var16;
                        var16++;
                        var37[1][incrementValue$1] = var28.i(-1478490344);
                        var25++;
                        if (var26 != 0) {
                            statePc = 71;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var26 == 0) {
                            statePc = 58;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var14 >= var6) {
                            statePc = 70;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (!ha.field_j[var20].field_g) {
                            statePc = 65;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        ha.field_j[var20].field_g = true;
                        var8[2][var14] = var21;
                        var9[2][var14] = ha.field_j[var20].field_c;
                        var36[2][var14] = var22;
                        var14++;
                        var29.field_j = var24;
                        var25 = 0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var25 >= var7) {
                            statePc = 70;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        incrementValue$2 = var17;
                        var17++;
                        var37[2][incrementValue$2] = var28.i(-1478490344);
                        var25++;
                        if (var26 != 0) {
                            statePc = 71;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (var26 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var19++;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (var26 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var4_ref.a(true);
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 74: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var1), "rj.J(" + param0 + ')');
                }
                case 75: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
