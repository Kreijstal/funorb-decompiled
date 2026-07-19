/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ns extends oj {
    private boolean field_J;
    private int field_H;
    static String[][][] field_A;
    private int field_z;
    private int field_C;
    private int field_Q;
    static String field_D;
    static volatile long field_P;
    private jd field_N;
    static wk field_E;
    static String field_K;
    private int field_M;
    static wk[] field_y;
    private int field_L;
    static wk field_O;
    static String field_F;

    public static void a(boolean param0) {
        field_F = null;
        if (param0) {
          ns.b(false);
          field_O = null;
          field_K = null;
          field_D = null;
          field_E = null;
          field_A = (String[][][]) null;
          field_y = null;
          return;
        } else {
          field_O = null;
          field_K = null;
          field_D = null;
          field_E = null;
          field_A = (String[][][]) null;
          field_y = null;
          return;
        }
    }

    final String a(byte param0, boolean param1) {
        String var3 = null;
        int var4 = 0;
        if (param1) {
          System.out.println("Attack event debug");
          System.out.println("Unit at " + this.field_w.field_J + "," + this.field_w.field_w);
          var4 = -24 % ((53 - param0) / 51);
          var3 = "EventAttack: pos: (" + this.field_w.field_J + "," + this.field_w.field_w + ")";
          return var3;
        } else {
          var4 = -24 % ((53 - param0) / 51);
          var3 = "EventAttack: pos: (" + this.field_w.field_J + "," + this.field_w.field_w + ")";
          return var3;
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -84) {
                break L1;
              } else {
                this.field_H = 109;
                break L1;
              }
            }
            stackOut_2_0 = this.a((byte) -39, param2, param0, true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("ns.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(boolean param0, int param1, Random param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (-1 <= (param1 ^ -1)) {
              throw new IllegalArgumentException();
            } else {
              if (pg.a(param1, -10)) {
                stackOut_5_0 = (int)((long)param1 * (4294967295L & (long)param2.nextInt()) >> -1316652512);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L1: {
                  if (!param0) {
                    break L1;
                  } else {
                    ns.b(true);
                    break L1;
                  }
                }
                var3_int = -(int)(4294967296L % (long)param1) + -2147483648;
                L2: while (true) {
                  var4 = param2.nextInt();
                  if (var3_int > var4) {
                    stackOut_12_0 = th.a(var4, 1, param1);
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("ns.D(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_13_0;
        }
    }

    final static void b(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              vl.field_n.h(32161, 76);
              if (!param0) {
                break L1;
              } else {
                field_A = (String[][][]) null;
                break L1;
              }
            }
            var1_int = 0;
            L2: while (true) {
              if (5 <= var1_int) {
                break L0;
              } else {
                vl.field_n.b(true, pg.field_d.field_d[var1_int]);
                var1_int++;
                if (var2 == 0) {
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "ns.B(" + param0 + ')');
        }
    }

    final static void d(byte param0) {
        String var1 = null;
        if (!fh.field_i) {
          throw new IllegalStateException();
        } else {
          L0: {
            if (null != qc.field_a) {
              qc.field_a.b(true);
              break L0;
            } else {
              break L0;
            }
          }
          var1 = dg.a(-123);
          np.field_Qb = new df(var1, (String) null, true, false, false);
          if (param0 < 75) {
            ns.a(true);
            rl.field_C.a(lt.field_g, 0);
            lt.field_g.a(np.field_Qb, (byte) 55);
            lt.field_g.l(105);
            return;
          } else {
            rl.field_C.a(lt.field_g, 0);
            lt.field_g.a(np.field_Qb, (byte) 55);
            lt.field_g.l(105);
            return;
          }
        }
    }

    final void a(ha param0, int param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        ic var6 = null;
        int[] var10 = null;
        at stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        ag stackIn_12_2 = null;
        ag stackIn_12_3 = null;
        int stackIn_12_4 = 0;
        int stackIn_12_5 = 0;
        int stackIn_12_6 = 0;
        int stackIn_12_7 = 0;
        int stackIn_12_8 = 0;
        int stackIn_12_9 = 0;
        int stackIn_12_10 = 0;
        at stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        ag stackIn_13_2 = null;
        ag stackIn_13_3 = null;
        int stackIn_13_4 = 0;
        int stackIn_13_5 = 0;
        int stackIn_13_6 = 0;
        int stackIn_13_7 = 0;
        int stackIn_13_8 = 0;
        int stackIn_13_9 = 0;
        int stackIn_13_10 = 0;
        at stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        ag stackIn_14_2 = null;
        ag stackIn_14_3 = null;
        int stackIn_14_4 = 0;
        int stackIn_14_5 = 0;
        int stackIn_14_6 = 0;
        int stackIn_14_7 = 0;
        int stackIn_14_8 = 0;
        int stackIn_14_9 = 0;
        int stackIn_14_10 = 0;
        int stackIn_14_11 = 0;
        at stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        ag stackIn_15_2 = null;
        ag stackIn_15_3 = null;
        int stackIn_15_4 = 0;
        int stackIn_15_5 = 0;
        int stackIn_15_6 = 0;
        int stackIn_15_7 = 0;
        int stackIn_15_8 = 0;
        int stackIn_15_9 = 0;
        int stackIn_15_10 = 0;
        int stackIn_15_11 = 0;
        at stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        ag stackIn_16_2 = null;
        ag stackIn_16_3 = null;
        int stackIn_16_4 = 0;
        int stackIn_16_5 = 0;
        int stackIn_16_6 = 0;
        int stackIn_16_7 = 0;
        int stackIn_16_8 = 0;
        int stackIn_16_9 = 0;
        int stackIn_16_10 = 0;
        int stackIn_16_11 = 0;
        at stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        ag stackIn_17_2 = null;
        ag stackIn_17_3 = null;
        int stackIn_17_4 = 0;
        int stackIn_17_5 = 0;
        int stackIn_17_6 = 0;
        int stackIn_17_7 = 0;
        int stackIn_17_8 = 0;
        int stackIn_17_9 = 0;
        int stackIn_17_10 = 0;
        int stackIn_17_11 = 0;
        int stackIn_17_12 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        at stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        ag stackOut_11_2 = null;
        ag stackOut_11_3 = null;
        int stackOut_11_4 = 0;
        int stackOut_11_5 = 0;
        int stackOut_11_6 = 0;
        int stackOut_11_7 = 0;
        int stackOut_11_8 = 0;
        int stackOut_11_9 = 0;
        int stackOut_11_10 = 0;
        at stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        ag stackOut_13_2 = null;
        ag stackOut_13_3 = null;
        int stackOut_13_4 = 0;
        int stackOut_13_5 = 0;
        int stackOut_13_6 = 0;
        int stackOut_13_7 = 0;
        int stackOut_13_8 = 0;
        int stackOut_13_9 = 0;
        int stackOut_13_10 = 0;
        int stackOut_13_11 = 0;
        at stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        ag stackOut_12_2 = null;
        ag stackOut_12_3 = null;
        int stackOut_12_4 = 0;
        int stackOut_12_5 = 0;
        int stackOut_12_6 = 0;
        int stackOut_12_7 = 0;
        int stackOut_12_8 = 0;
        int stackOut_12_9 = 0;
        int stackOut_12_10 = 0;
        int stackOut_12_11 = 0;
        at stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        ag stackOut_14_2 = null;
        ag stackOut_14_3 = null;
        int stackOut_14_4 = 0;
        int stackOut_14_5 = 0;
        int stackOut_14_6 = 0;
        int stackOut_14_7 = 0;
        int stackOut_14_8 = 0;
        int stackOut_14_9 = 0;
        int stackOut_14_10 = 0;
        int stackOut_14_11 = 0;
        at stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        ag stackOut_16_2 = null;
        ag stackOut_16_3 = null;
        int stackOut_16_4 = 0;
        int stackOut_16_5 = 0;
        int stackOut_16_6 = 0;
        int stackOut_16_7 = 0;
        int stackOut_16_8 = 0;
        int stackOut_16_9 = 0;
        int stackOut_16_10 = 0;
        int stackOut_16_11 = 0;
        int stackOut_16_12 = 0;
        at stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        ag stackOut_15_2 = null;
        ag stackOut_15_3 = null;
        int stackOut_15_4 = 0;
        int stackOut_15_5 = 0;
        int stackOut_15_6 = 0;
        int stackOut_15_7 = 0;
        int stackOut_15_8 = 0;
        int stackOut_15_9 = 0;
        int stackOut_15_10 = 0;
        int stackOut_15_11 = 0;
        int stackOut_15_12 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -26661) {
                break L1;
              } else {
                var6 = (ic) null;
                discarded$1 = this.a((at) null, (byte) 68, (ic) null);
                break L1;
              }
            }
            if (this.field_J) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_J = true;
              this.field_w = param0.c(this.field_M, true, this.field_L);
              if (null != this.field_w) {
                L2: {
                  L3: {
                    var3_int = this.field_w.field_J;
                    var4 = this.field_w.field_w;
                    if (this.field_w.a(this.field_N, (byte) 119)) {
                      break L3;
                    } else {
                      L4: {
                        if (-5 != (this.field_N.g(0) ^ -1)) {
                          break L4;
                        } else {
                          if (!this.field_w.j((byte) 103)) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        var10 = param0.a(this.field_N, var4, (byte) -128, this.field_H, this.field_w, this.field_z, var3_int);
                        stackOut_11_0 = param0.field_l;
                        stackOut_11_1 = param1 ^ -27339;
                        stackOut_11_2 = null;
                        stackOut_11_3 = null;
                        stackOut_11_4 = this.field_N.field_N;
                        stackOut_11_5 = var3_int;
                        stackOut_11_6 = var4;
                        stackOut_11_7 = this.field_z;
                        stackOut_11_8 = this.field_H;
                        stackOut_11_9 = var10[0];
                        stackOut_11_10 = var10[1];
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        stackIn_13_3 = stackOut_11_3;
                        stackIn_13_4 = stackOut_11_4;
                        stackIn_13_5 = stackOut_11_5;
                        stackIn_13_6 = stackOut_11_6;
                        stackIn_13_7 = stackOut_11_7;
                        stackIn_13_8 = stackOut_11_8;
                        stackIn_13_9 = stackOut_11_9;
                        stackIn_13_10 = stackOut_11_10;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        stackIn_12_3 = stackOut_11_3;
                        stackIn_12_4 = stackOut_11_4;
                        stackIn_12_5 = stackOut_11_5;
                        stackIn_12_6 = stackOut_11_6;
                        stackIn_12_7 = stackOut_11_7;
                        stackIn_12_8 = stackOut_11_8;
                        stackIn_12_9 = stackOut_11_9;
                        stackIn_12_10 = stackOut_11_10;
                        if ((1 & var10[2] ^ -1) >= -1) {
                          stackOut_13_0 = (at) ((Object) stackIn_13_0);
                          stackOut_13_1 = stackIn_13_1;
                          stackOut_13_2 = null;
                          stackOut_13_3 = null;
                          stackOut_13_4 = stackIn_13_4;
                          stackOut_13_5 = stackIn_13_5;
                          stackOut_13_6 = stackIn_13_6;
                          stackOut_13_7 = stackIn_13_7;
                          stackOut_13_8 = stackIn_13_8;
                          stackOut_13_9 = stackIn_13_9;
                          stackOut_13_10 = stackIn_13_10;
                          stackOut_13_11 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          stackIn_14_1 = stackOut_13_1;
                          stackIn_14_2 = stackOut_13_2;
                          stackIn_14_3 = stackOut_13_3;
                          stackIn_14_4 = stackOut_13_4;
                          stackIn_14_5 = stackOut_13_5;
                          stackIn_14_6 = stackOut_13_6;
                          stackIn_14_7 = stackOut_13_7;
                          stackIn_14_8 = stackOut_13_8;
                          stackIn_14_9 = stackOut_13_9;
                          stackIn_14_10 = stackOut_13_10;
                          stackIn_14_11 = stackOut_13_11;
                          break L5;
                        } else {
                          stackOut_12_0 = (at) ((Object) stackIn_12_0);
                          stackOut_12_1 = stackIn_12_1;
                          stackOut_12_2 = null;
                          stackOut_12_3 = null;
                          stackOut_12_4 = stackIn_12_4;
                          stackOut_12_5 = stackIn_12_5;
                          stackOut_12_6 = stackIn_12_6;
                          stackOut_12_7 = stackIn_12_7;
                          stackOut_12_8 = stackIn_12_8;
                          stackOut_12_9 = stackIn_12_9;
                          stackOut_12_10 = stackIn_12_10;
                          stackOut_12_11 = 1;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          stackIn_14_2 = stackOut_12_2;
                          stackIn_14_3 = stackOut_12_3;
                          stackIn_14_4 = stackOut_12_4;
                          stackIn_14_5 = stackOut_12_5;
                          stackIn_14_6 = stackOut_12_6;
                          stackIn_14_7 = stackOut_12_7;
                          stackIn_14_8 = stackOut_12_8;
                          stackIn_14_9 = stackOut_12_9;
                          stackIn_14_10 = stackOut_12_10;
                          stackIn_14_11 = stackOut_12_11;
                          break L5;
                        }
                      }
                      L6: {
                        stackOut_14_0 = (at) ((Object) stackIn_14_0);
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = null;
                        stackOut_14_3 = null;
                        stackOut_14_4 = stackIn_14_4;
                        stackOut_14_5 = stackIn_14_5;
                        stackOut_14_6 = stackIn_14_6;
                        stackOut_14_7 = stackIn_14_7;
                        stackOut_14_8 = stackIn_14_8;
                        stackOut_14_9 = stackIn_14_9;
                        stackOut_14_10 = stackIn_14_10;
                        stackOut_14_11 = stackIn_14_11;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_16_2 = stackOut_14_2;
                        stackIn_16_3 = stackOut_14_3;
                        stackIn_16_4 = stackOut_14_4;
                        stackIn_16_5 = stackOut_14_5;
                        stackIn_16_6 = stackOut_14_6;
                        stackIn_16_7 = stackOut_14_7;
                        stackIn_16_8 = stackOut_14_8;
                        stackIn_16_9 = stackOut_14_9;
                        stackIn_16_10 = stackOut_14_10;
                        stackIn_16_11 = stackOut_14_11;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        stackIn_15_2 = stackOut_14_2;
                        stackIn_15_3 = stackOut_14_3;
                        stackIn_15_4 = stackOut_14_4;
                        stackIn_15_5 = stackOut_14_5;
                        stackIn_15_6 = stackOut_14_6;
                        stackIn_15_7 = stackOut_14_7;
                        stackIn_15_8 = stackOut_14_8;
                        stackIn_15_9 = stackOut_14_9;
                        stackIn_15_10 = stackOut_14_10;
                        stackIn_15_11 = stackOut_14_11;
                        if (0 >= (var10[2] & 2)) {
                          stackOut_16_0 = (at) ((Object) stackIn_16_0);
                          stackOut_16_1 = stackIn_16_1;
                          stackOut_16_2 = null;
                          stackOut_16_3 = null;
                          stackOut_16_4 = stackIn_16_4;
                          stackOut_16_5 = stackIn_16_5;
                          stackOut_16_6 = stackIn_16_6;
                          stackOut_16_7 = stackIn_16_7;
                          stackOut_16_8 = stackIn_16_8;
                          stackOut_16_9 = stackIn_16_9;
                          stackOut_16_10 = stackIn_16_10;
                          stackOut_16_11 = stackIn_16_11;
                          stackOut_16_12 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          stackIn_17_2 = stackOut_16_2;
                          stackIn_17_3 = stackOut_16_3;
                          stackIn_17_4 = stackOut_16_4;
                          stackIn_17_5 = stackOut_16_5;
                          stackIn_17_6 = stackOut_16_6;
                          stackIn_17_7 = stackOut_16_7;
                          stackIn_17_8 = stackOut_16_8;
                          stackIn_17_9 = stackOut_16_9;
                          stackIn_17_10 = stackOut_16_10;
                          stackIn_17_11 = stackOut_16_11;
                          stackIn_17_12 = stackOut_16_12;
                          break L6;
                        } else {
                          stackOut_15_0 = (at) ((Object) stackIn_15_0);
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = null;
                          stackOut_15_3 = null;
                          stackOut_15_4 = stackIn_15_4;
                          stackOut_15_5 = stackIn_15_5;
                          stackOut_15_6 = stackIn_15_6;
                          stackOut_15_7 = stackIn_15_7;
                          stackOut_15_8 = stackIn_15_8;
                          stackOut_15_9 = stackIn_15_9;
                          stackOut_15_10 = stackIn_15_10;
                          stackOut_15_11 = stackIn_15_11;
                          stackOut_15_12 = 1;
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_17_1 = stackOut_15_1;
                          stackIn_17_2 = stackOut_15_2;
                          stackIn_17_3 = stackOut_15_3;
                          stackIn_17_4 = stackOut_15_4;
                          stackIn_17_5 = stackOut_15_5;
                          stackIn_17_6 = stackOut_15_6;
                          stackIn_17_7 = stackOut_15_7;
                          stackIn_17_8 = stackOut_15_8;
                          stackIn_17_9 = stackOut_15_9;
                          stackIn_17_10 = stackOut_15_10;
                          stackIn_17_11 = stackOut_15_11;
                          stackIn_17_12 = stackOut_15_12;
                          break L6;
                        }
                      }
                      ((at) (Object) stackIn_17_0).a(stackIn_17_1, new ag(stackIn_17_4, stackIn_17_5, stackIn_17_6, stackIn_17_7, stackIn_17_8, stackIn_17_9, stackIn_17_10, stackIn_17_11 != 0, stackIn_17_12 != 0, this.field_C, this.field_Q, this.field_w.field_W, this.field_N.field_W, 0));
                      if (!ArmiesOfGielinor.field_M) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  param0.field_l.a(750, new md(var3_int, var4, this.field_z, this.field_H, this.field_w.field_O));
                  break L2;
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var3);
            stackOut_20_1 = new StringBuilder().append("ns.G(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    ns(int param0, int param1, int param2, int param3, jd param4, int param5, int param6) {
        try {
            this.field_L = param0;
            this.field_H = param3;
            this.field_m = 27;
            this.field_M = param1;
            this.field_J = false;
            this.field_C = param5;
            this.field_N = param4;
            this.field_z = param2;
            this.field_Q = param6;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ns.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_A = new String[][][]{new String[][]{new String[]{"green_small_2_king_of_my_castle.lev", "small_tom.lev", "islands.lev", "Green_small_2_mf1.lev"}, new String[]{"Green_medium_4_MF4.lev", "Green_medium_4_MF3.lev", "Green_medium_4_MF2.lev", "Green_medium_4_MF1.lev"}, new String[]{"Green_large_6_mf1.lev", "Green_large_6_mf2.lev", "Green_large_6_mf3.lev", "Green_large_6_mf4.lev"}}, new String[][]{new String[]{"desert_small_2_dead_sea.lev", "desert_small_2_oasis.lev", "Desert_small_2_mf1.lev", "Desert_small_2_mf2.lev", "Desert_small_2_mf3.lev"}, new String[]{"Desert_medium_4_MF4.lev", "Desert_medium_4_MF3.lev", "Desert_medium_4_MF2.lev", "Desert_medium_4_MF1.lev"}, new String[]{"Desert_large_6_mf1.lev", "Desert_large_6_mf2.lev", "Desert_large_6_mf3.lev", "Desert_large_6_mf4.lev"}}, new String[][]{new String[]{"winter_small_2_mountain_clearing.lev", "winter_small_2_river_valley.lev", "Frozen_small_2_mf1.lev", "Frozen_small_2_mf2.lev", "Frozen_small_2_mf3.lev", "Frozen_small_2_mf4.lev"}, new String[]{"Frozen_medium_4_MF4.lev", "Frozen_medium_4_MF3.lev", "Frozen_medium_4_MF2.lev", "Frozen_medium_4_MF1.lev"}, new String[]{"Frozen_large_6_mf1.lev", "Frozen_large_6_mf2.lev", "Frozen_large_6_mf3.lev", "Frozen_large_6_mf4.lev"}}, new String[][]{new String[]{"Green_small_2_WaterbirthIsle.lev", "Green_2_Small_Swampnsea.lev", "Green_small_2_EmbryoIsles.lev", "Green_small_2_urborg.lev"}, new String[]{"Green_2_Medium_Swamp_Star.lev", "Green_medium_4_sludge_grind.lev", "Green_medium_4_fortress_isle.lev", "Green_medium_4_staggered.lev"}, new String[]{"Green_large_6_crux.lev", "Green_large_6_TheCrossing.lev", "Green_6_Large_Swampcircle.lev", "Green_6_Large_Chambers.lev"}}};
        field_D = "Invite only";
        field_P = 0L;
        field_K = "You can join this game";
        field_F = "Your rating is <%0>";
    }
}
