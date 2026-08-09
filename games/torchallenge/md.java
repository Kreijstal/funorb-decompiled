/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class md implements Iterator {
    static ka field_b;
    static int field_i;
    static int field_h;
    private da field_g;
    private da field_c;
    static boolean field_a;
    static boolean field_f;
    private int field_d;
    private fd field_e;
    static qe field_j;

    public final Object next() {
        int fieldTemp$1 = 0;
        da var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        da stackIn_3_0 = null;
        da stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (this.field_g == this.field_e.field_a[-1 + this.field_d]) {
              L1: while (true) {
                L2: {
                  if ((this.field_e.field_d ^ -1) >= (this.field_d ^ -1)) {
                    break L2;
                  } else {
                    fieldTemp$1 = this.field_d;
                    this.field_d = this.field_d + 1;
                    var1 = this.field_e.field_a[fieldTemp$1].field_f;
                    if (var1 == this.field_e.field_a[-1 + this.field_d]) {
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    } else {
                      this.field_c = var1;
                      this.field_g = var1.field_f;
                      stackIn_7_0 = (da) (var1);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
                stackIn_10_0 = null;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              var1 = this.field_g;
              this.field_g = var1.field_f;
              this.field_c = var1;
              stackIn_3_0 = (da) (var1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1_ref), "md.next()");
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    private final void a(int param0) {
        this.field_d = 1;
        this.field_c = null;
        if (param0 < 82) {
            return;
        }
        try {
            this.field_g = this.field_e.field_a[0].field_f;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "md.C(" + param0 + ')');
        }
    }

    final static boolean a(byte param0) {
        RuntimeException var1 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        boolean stackIn_18_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 69) {
                break L1;
              } else {
                md.b(109);
                break L1;
              }
            }
            L2: {
              if (bb.field_i == -1) {
                if (pe.a((byte) 81, 1)) {
                  bb.field_i = id.field_b.j(-116);
                  id.field_b.field_q = 0;
                  break L2;
                } else {
                  stackIn_8_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if ((bb.field_i ^ -1) == 1) {
                if (pe.a((byte) 102, 2)) {
                  bb.field_i = id.field_b.c(false);
                  id.field_b.field_q = 0;
                  break L3;
                } else {
                  stackIn_15_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                break L3;
              }
            }
            stackIn_18_0 = pe.a((byte) 75, bb.field_i);
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "md.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_18_0;
          }
        }
    }

    public static void b(int param0) {
        if (param0 != -1) {
            return;
        }
        try {
            field_j = null;
            field_b = null;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "md.B(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, vg param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        boolean stackOut_9_0;
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
        int var20 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = TorChallenge.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = sa.a((byte) 119, 3 * (param3 + -param2));
                        var6 = param2 * 3;
                        var7 = -10 + var5_int;
                        qc.b(0);
                        if (0 >= param4.field_s) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null == param4.field_z) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ef.c(-13730);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ni.field_f = 0;
                        var8 = 0;
                        var9 = 101 % ((param0 - -60) / 54);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((param4.field_x ^ -1) >= (var8 ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var10 = param4.field_i[var8];
                        var11 = param4.field_w[var8];
                        var12 = param4.field_F[var8];
                        stackOut_9_0 = param1;
                        stackIn_45_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var20 != 0) {
                            statePc = 45;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!stackIn_10_0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var13 = tj.field_a[var10];
                        var14 = si.field_K[var10];
                        var15 = -var13 + tj.field_a[var11];
                        var16 = -var13 + tj.field_a[var12];
                        var17 = si.field_K[var11] - var14;
                        var18 = si.field_K[var12] - var14;
                        if (-1 >= (-(var16 * var17) + var15 * var18 ^ -1)) {
                            statePc = 43;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var13 = bg.field_O[var10];
                        if (2147483647 != (var13 ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var20 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var14 = bg.field_O[var11];
                        if (-2147483648 == var14) {
                            statePc = 43;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var15 = bg.field_O[var12];
                        if ((var15 ^ -1) == 2147483647) {
                            statePc = 43;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var16 = -var6 + (var15 + var14 + var13);
                        stackIn_23_0 = vf.field_b.length;
                        stackIn_21_0 = stackIn_23_0;
                        stackIn_23_1 = 1;
                        stackIn_21_1 = stackIn_23_1;
                        if (var7 < 0) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_24_0 = stackIn_21_0;
                        stackIn_24_1 = stackIn_21_1;
                        stackIn_24_2 = var16 >> var7;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = stackIn_23_0;
                        stackIn_24_1 = stackIn_23_1;
                        stackIn_24_2 = var16 << -var7;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var17 = stackIn_24_0 - (stackIn_24_1 - -stackIn_24_2);
                        var18 = vf.field_b[var17];
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((var18 >> 714814180 ^ -1) == -1) {
                            statePc = 34;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var17--;
                        stackIn_35_0 = var17 ^ -1;
                        stackIn_27_0 = stackIn_35_0;
                        stackIn_35_1 = -1;
                        stackIn_27_1 = stackIn_35_1;
                        if (var20 != 0) {
                            statePc = 35;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (stackIn_27_0 <= stackIn_27_1) {
                            statePc = 33;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        System.err.println("Out of range!");
                        if (var20 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var18 = vf.field_b[var17];
                        if (var20 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_35_0 = var17 << -654632060;
                        stackIn_35_1 = var18;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var19 = stackIn_35_0 + stackIn_35_1;
                        k.field_e[var19] = var8;
                        vf.field_b[var17] = 1 + var18;
                        if (0 >= param4.field_s) {
                            statePc = 42;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (param4.field_z != null) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        dupTemp$0 = param4.field_z[var8];
                        m.field_i[dupTemp$0] = m.field_i[dupTemp$0] + 1;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        ni.field_f = ni.field_f + 1;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var8++;
                        if (var20 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_45_0 = -1;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (stackIn_45_0 <= (param4.field_s ^ -1)) {
                            statePc = 61;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (null == param4.field_z) {
                            statePc = 61;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (m.field_i.length <= var9) {
                            statePc = 61;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var10 = m.field_i[var9];
                        m.field_i[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var20 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var20 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 56: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_59_0 = (RuntimeException) (var5);
                    stackIn_57_0 = stackIn_59_0;
                    stackIn_59_1 = new StringBuilder().append("md.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_57_1 = stackIn_59_1;
                    if (param4 == null) {
                        statePc = 59;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    stackIn_60_0 = (RuntimeException) ((Object) stackIn_57_0);
                    stackIn_60_1 = (StringBuilder) ((Object) stackIn_57_1);
                    stackIn_60_2 = "{...}";
                    statePc = 60;
                    continue stateLoop;
                }
                case 59: {
                    stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
                    stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
                    stackIn_60_2 = "null";
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    throw oj.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ')');
                }
                case 61: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final boolean hasNext() {
        int fieldTemp$1 = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (this.field_g != this.field_e.field_a[this.field_d + -1]) {
              stackIn_5_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: while (true) {
                L2: {
                  if ((this.field_e.field_d ^ -1) >= (this.field_d ^ -1)) {
                    break L2;
                  } else {
                    fieldTemp$1 = this.field_d;
                    this.field_d = this.field_d + 1;
                    if (this.field_e.field_a[fieldTemp$1].field_f == this.field_e.field_a[-1 + this.field_d]) {
                      this.field_g = this.field_e.field_a[this.field_d + -1];
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    } else {
                      this.field_g = this.field_e.field_a[this.field_d + -1].field_f;
                      stackIn_9_0 = 1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "md.hasNext()");
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    public final void remove() {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            if (this.field_c != null) {
              this.field_c.a(true);
              this.field_c = null;
              break L0;
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "md.remove()");
        }
    }

    md(fd param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_c = null;
        try {
          L0: {
            this.field_e = param0;
            this.a(101);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("md.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    static {
        field_a = false;
        field_i = -1;
        field_h = 480;
    }
}
