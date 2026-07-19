/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class aoa implements ntb {
    private anb field_a;
    private int field_d;
    private int field_b;
    private int field_e;
    static int[] field_c;
    private int field_f;

    private final int a(ml[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ml var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            L1: while (true) {
              if (var5 >= param2) {
                L2: {
                  if (param1 <= -1) {
                    break L2;
                  } else {
                    aoa.a(true);
                    break L2;
                  }
                }
                stackOut_18_0 = var4_int << -1632899805;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                var6 = param0[var5];
                var7 = var6.field_c.field_c;
                if (!var6.k((byte) 86)) {
                  if (2 != var7) {
                    if (-9 != (var7 ^ -1)) {
                      if (9 != var7) {
                        if (var7 != 10) {
                          var8 = var6.field_c.a((byte) 24).j(118);
                          if (var8 > var4_int) {
                            var4_int = var8;
                            var5++;
                            continue L1;
                          } else {
                            var5++;
                            continue L1;
                          }
                        } else {
                          var5++;
                          continue L1;
                        }
                      } else {
                        var5++;
                        continue L1;
                      }
                    } else {
                      var5++;
                      continue L1;
                    }
                  } else {
                    var5++;
                    continue L1;
                  }
                } else {
                  var5++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var4);
            stackOut_20_1 = new StringBuilder().append("aoa.I(");
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
              break L3;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_19_0;
    }

    final void a(sg param0, int param1, lta param2, pe param3) {
        try {
            int var5_int = -5 / ((-71 - param1) / 50);
            c.a(param2.b(true, param0.field_e - -this.field_d), param2.a(param0.field_d - -this.field_e, (byte) 124), param2.a(param0.field_d, (byte) 127), param2.b(true, param0.field_e), -16777216, 16776960);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "aoa.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, sg param1, pe param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        crb[] var6 = null;
        int var7 = 0;
        crb[] var8 = null;
        int var9 = 0;
        crb var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var16 = VoidHunters.field_G;
        try {
          L0: {
            var4_int = 0;
            var5 = param0;
            var6 = param2.a(true);
            var7 = param1.g(-101);
            var8 = var6;
            var9 = 0;
            L1: while (true) {
              if (var9 >= var8.length) {
                this.field_d = this.field_d + var5;
                this.field_e = this.field_e + var4_int;
                break L0;
              } else {
                var10 = var8[var9];
                if (var10 != null) {
                  var11 = var10.g(-42) + var7 >> 2034632486;
                  var12 = var10.field_d + -param1.field_d;
                  var13 = var10.field_e - param1.field_e;
                  var14 = ar.a(var12, (byte) 122, var13) >> -26321655;
                  if (var14 <= var11 / 2) {
                    L2: {
                      if ((var14 ^ -1) >= -1) {
                        var14 = 1;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var15 = ecb.a(-var13, (byte) -77, -var12);
                    var4_int = var4_int + fc.a(var15, (byte) -106) * var11 / (var14 * var14);
                    var5 = var5 + var11 * eu.a(var15, 40) / (var14 * var14);
                    var9++;
                    continue L1;
                  } else {
                    var9++;
                    continue L1;
                  }
                } else {
                  var9++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4);
            stackOut_13_1 = new StringBuilder().append("aoa.G(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        RuntimeException runtimeException = null;
        aoa var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              var3 = (aoa) ((Object) param0);
              var4 = 0;
              if (var3.field_b == this.field_b) {
                break L1;
              } else {
                var4 = 1;
                System.out.println("int parent_player has changed. before=" + var3.field_b + ", now=" + this.field_b);
                break L1;
              }
            }
            if (param1 < -19) {
              L2: {
                if (var4 == 0) {
                  break L2;
                } else {
                  System.out.println("This instance of ShipAI has changed");
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (runtimeException);
            stackOut_7_1 = new StringBuilder().append("aoa.F(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(boolean param0, int param1, sg param2, pe param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              this.field_d = 0;
              if (!param0) {
                break L1;
              } else {
                field_c = (int[]) null;
                break L1;
              }
            }
            L2: {
              this.field_a = null;
              this.field_e = 0;
              this.field_f = 0;
              this.a(param3, (byte) -89, param2, param1);
              if (!param2.g(param0)) {
                var5_int = param2.field_k.l(-8913);
                if (var5_int <= 0) {
                  break L2;
                } else {
                  this.a(0, param2, param3);
                  this.a(param3, (byte) -103, param2);
                  break L2;
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("aoa.J(").append(param0).append(',').append(param1).append(',');
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
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
            if (param1) {
                pe var4 = (pe) null;
                this.a((sg) null, 11, (lta) null, (pe) null);
            }
            this.field_b = param0.i(0, 4);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "aoa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        aoa var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3 = (aoa) ((Object) param1);
              var4 = -12 % ((param0 - 22) / 59);
              if (var3.field_b == this.field_b) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("aoa.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_c = null;
    }

    final boolean a(sg param0, byte param1, pe param2) {
        int discarded$1 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Random var9_ref_Random = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ij var16_ref_ij = null;
        int var17 = 0;
        Object var18_ref = null;
        int var18 = 0;
        tj var18_ref_tj = null;
        ml var19_ref_ml = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        tv var24 = null;
        int stackIn_83_0 = 0;
        int stackIn_85_0 = 0;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_92_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_84_0 = 0;
        int stackOut_82_0 = 0;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        var18_ref = null;
        var23 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 == -73) {
                break L1;
              } else {
                var24 = (tv) null;
                this.b((byte) -82, (tv) null);
                break L1;
              }
            }
            L2: {
              var4_int = param0.field_f;
              var5 = param0.field_h;
              var6 = param0.field_n;
              var7 = param0.field_k.b(127, 0);
              var8 = this.a(lcb.field_q, -18, var7);
              if (var8 <= cab.field_p) {
                break L2;
              } else {
                var8 = cab.field_p;
                break L2;
              }
            }
            L3: {
              if (!param0.g(false)) {
                break L3;
              } else {
                L4: {
                  var9_ref_Random = new Random((long)(param0.field_l * th.field_o));
                  var10 = 1000;
                  if (this.field_a == null) {
                    var10 = 4000;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (-1 != (hob.a(var9_ref_Random, var10, 125) ^ -1)) {
                  break L3;
                } else {
                  fnb.a(50, param0.field_e, param0.field_d, false, 94, 512);
                  break L3;
                }
              }
            }
            L5: {
              this.a(false, var8, param0, param2);
              var9 = 0;
              var10 = 0;
              var11 = 0;
              if (this.field_a != null) {
                L6: {
                  var10 = this.field_a.field_k.field_r;
                  var11 = this.field_a.field_k.field_n;
                  var12 = -param0.field_d + var10;
                  var13 = var11 + -param0.field_e;
                  var14 = ar.a(var12, (byte) 109, var13);
                  var15 = ecb.a(var13, (byte) -77, var12);
                  if (16384 + var8 < var14) {
                    if (0 == this.field_e) {
                      break L6;
                    } else {
                      if (this.field_d == 0) {
                        break L6;
                      } else {
                        var16 = ecb.a(this.field_d, (byte) -77, this.field_e);
                        this.field_f = rrb.a(22433, var16 + -param0.e(param1 ^ -73)) << -1140029496;
                        break L6;
                      }
                    }
                  } else {
                    var16 = 0;
                    var17 = 2147483647;
                    var18 = 0;
                    L7: while (true) {
                      if (var18 >= var7) {
                        L8: {
                          if (-2147483648 < (var17 ^ -1)) {
                            this.field_f = var16 << -1424292856;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (di.field_p == 0) {
                            discarded$1 = param0.a(8, var11, var10);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var9 = var9 | 16;
                        break L6;
                      } else {
                        var19_ref_ml = lcb.field_q[var18];
                        var20 = var19_ref_ml.field_c.field_c;
                        if (!var19_ref_ml.k((byte) 48)) {
                          if ((var20 ^ -1) != -3) {
                            if (var20 != 8) {
                              if (9 != var20) {
                                if (var20 != 10) {
                                  L10: {
                                    if (var8 >> 859646691 <= var19_ref_ml.field_c.a((byte) 24).j(127)) {
                                      var21 = var19_ref_ml.g((byte) -127);
                                      var22 = rrb.a(param1 + 22506, var15 - var21);
                                      if (var17 > Math.abs(var22)) {
                                        var17 = Math.abs(var22);
                                        var16 = var22;
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    } else {
                                      break L10;
                                    }
                                  }
                                  var18++;
                                  continue L7;
                                } else {
                                  var18++;
                                  continue L7;
                                }
                              } else {
                                var18++;
                                continue L7;
                              }
                            } else {
                              var18++;
                              continue L7;
                            }
                          } else {
                            var18++;
                            continue L7;
                          }
                        } else {
                          var18++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
                L11: {
                  if (cab.field_p <= var14) {
                    break L11;
                  } else {
                    param0.a(-73, 2, param2, var11, var10);
                    param0.a(-126, 6, param2, var11, var10);
                    if (param0.n(31390)) {
                      break L11;
                    } else {
                      param0.a(param1 ^ 30, 3, param2, var11, var10);
                      break L11;
                    }
                  }
                }
                if (!param0.field_k.b((byte) 70, 7)) {
                  break L5;
                } else {
                  var16_ref_ij = param2.c(true);
                  var17 = 0;
                  var18_ref_tj = (tj) ((Object) var16_ref_ij.d(0));
                  L12: while (true) {
                    L13: {
                      if (var18_ref_tj == null) {
                        break L13;
                      } else {
                        L14: {
                          if (-7 != (var18_ref_tj.g((byte) -104) ^ -1)) {
                            break L14;
                          } else {
                            if (var18_ref_tj.d((byte) -119) == param0.field_l) {
                              var19 = var18_ref_tj.field_d - param0.field_d;
                              var20 = var18_ref_tj.field_e + -param0.field_e;
                              var21 = ar.a(var19, (byte) 115, var20);
                              if (var21 < bpa.field_a) {
                                var17 = 1;
                                break L13;
                              } else {
                                break L14;
                              }
                            } else {
                              break L14;
                            }
                          }
                        }
                        var18_ref_tj = (tj) ((Object) var16_ref_ij.a((byte) 55));
                        continue L12;
                      }
                    }
                    if (var17 != 0) {
                      param0.a(-111, 7, param2, var11, var10);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
              } else {
                break L5;
              }
            }
            L15: {
              L16: {
                var12 = 1024;
                var13 = 1024;
                var14 = this.field_e - var4_int;
                var15 = -var5 + this.field_d;
                var16 = this.field_f - var6;
                if (var14 != 0) {
                  break L16;
                } else {
                  if (var15 != 0) {
                    break L16;
                  } else {
                    if (var16 == 0) {
                      break L15;
                    } else {
                      break L16;
                    }
                  }
                }
              }
              L17: {
                if (Math.abs(var16) > var12) {
                  if (var16 <= 0) {
                    if (-1 < (var16 ^ -1)) {
                      var9 = var9 | 4;
                      break L17;
                    } else {
                      break L17;
                    }
                  } else {
                    var9 = var9 | 8;
                    break L17;
                  }
                } else {
                  break L17;
                }
              }
              L18: {
                if (var14 != 0) {
                  break L18;
                } else {
                  if (-1 != (var15 ^ -1)) {
                    break L18;
                  } else {
                    break L15;
                  }
                }
              }
              L19: {
                var17 = ecb.a(var15, (byte) -77, var14);
                var18 = param0.e(0);
                var19 = rrb.a(22433, var17 - var18);
                var20 = rrb.a(22433, -4096 - (var18 - var17));
                var21 = rrb.a(22433, 2048 - (var18 - var17));
                var22 = rrb.a(param1 + 22506, var17 - var18 - 2048);
                if (Math.abs(var19) >= var13) {
                  break L19;
                } else {
                  var9 = var9 | 1;
                  break L19;
                }
              }
              L20: {
                if (var13 > Math.abs(var20)) {
                  var9 = var9 | 2;
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: {
                if (var13 <= Math.abs(var21)) {
                  break L21;
                } else {
                  var9 = var9 | 32;
                  break L21;
                }
              }
              if (Math.abs(var22) >= var13) {
                break L15;
              } else {
                var9 = var9 | 64;
                break L15;
              }
            }
            if (var9 == 0) {
              stackOut_84_0 = 0;
              stackIn_85_0 = stackOut_84_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              param0.a(param2, var9, false, var10, var11);
              stackOut_82_0 = 1;
              stackIn_83_0 = stackOut_82_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var4 = decompiledCaughtException;
            stackOut_86_0 = (RuntimeException) (var4);
            stackOut_86_1 = new StringBuilder().append("aoa.O(");
            stackIn_88_0 = stackOut_86_0;
            stackIn_88_1 = stackOut_86_1;
            stackIn_87_0 = stackOut_86_0;
            stackIn_87_1 = stackOut_86_1;
            if (param0 == null) {
              stackOut_88_0 = (RuntimeException) ((Object) stackIn_88_0);
              stackOut_88_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackOut_88_2 = "null";
              stackIn_89_0 = stackOut_88_0;
              stackIn_89_1 = stackOut_88_1;
              stackIn_89_2 = stackOut_88_2;
              break L22;
            } else {
              stackOut_87_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackOut_87_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackOut_87_2 = "{...}";
              stackIn_89_0 = stackOut_87_0;
              stackIn_89_1 = stackOut_87_1;
              stackIn_89_2 = stackOut_87_2;
              break L22;
            }
          }
          L23: {
            stackOut_89_0 = (RuntimeException) ((Object) stackIn_89_0);
            stackOut_89_1 = ((StringBuilder) (Object) stackIn_89_1).append(stackIn_89_2).append(',').append(param1).append(',');
            stackIn_91_0 = stackOut_89_0;
            stackIn_91_1 = stackOut_89_1;
            stackIn_90_0 = stackOut_89_0;
            stackIn_90_1 = stackOut_89_1;
            if (param2 == null) {
              stackOut_91_0 = (RuntimeException) ((Object) stackIn_91_0);
              stackOut_91_1 = (StringBuilder) ((Object) stackIn_91_1);
              stackOut_91_2 = "null";
              stackIn_92_0 = stackOut_91_0;
              stackIn_92_1 = stackOut_91_1;
              stackIn_92_2 = stackOut_91_2;
              break L23;
            } else {
              stackOut_90_0 = (RuntimeException) ((Object) stackIn_90_0);
              stackOut_90_1 = (StringBuilder) ((Object) stackIn_90_1);
              stackOut_90_2 = "{...}";
              stackIn_92_0 = stackOut_90_0;
              stackIn_92_1 = stackOut_90_1;
              stackIn_92_2 = stackOut_90_2;
              break L23;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_92_0), stackIn_92_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_83_0 != 0;
        } else {
          return stackIn_85_0 != 0;
        }
    }

    final int a(byte param0) {
        int var2 = -17 / ((param0 - -52) / 54);
        return -1 + this.field_b;
    }

    private final void a(pe param0, byte param1, sg param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        sg[] var7 = null;
        sg[] var8 = null;
        int var9 = 0;
        sg var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var16 = VoidHunters.field_G;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            if (param1 == -103) {
              var6 = param2.g(-100);
              var7 = param0.d(1000);
              var8 = var7;
              var9 = 0;
              L1: while (true) {
                if (var8.length <= var9) {
                  this.field_d = this.field_d + var5;
                  this.field_e = this.field_e + var4_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var10 = var8[var9];
                  if (var10 != null) {
                    if (param2 != var10) {
                      if (var10.q((byte) 70) == param2.q((byte) 97)) {
                        L2: {
                          var11 = var6 - -var10.g(-86) >> -136151738;
                          var12 = -param2.field_d + var10.field_d;
                          var13 = var10.field_e - param2.field_e;
                          var14 = ar.a(var12, (byte) 109, var13) >> 1819599689;
                          if (256 >= var14) {
                            L3: {
                              if ((var14 ^ -1) >= -1) {
                                var14 = 1;
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                            var15 = ecb.a(-var13, (byte) -77, -var12);
                            var4_int = var4_int + var11 * fc.a(var15, (byte) 85) / (var14 * var14);
                            var5 = var5 + eu.a(var15, 107) * var11 / (var14 * var14);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        var9++;
                        continue L1;
                      } else {
                        var9++;
                        continue L1;
                      }
                    } else {
                      var9++;
                      continue L1;
                    }
                  } else {
                    var9++;
                    continue L1;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var4);
            stackOut_20_1 = new StringBuilder().append("aoa.E(");
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
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          L5: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(pe param0, byte param1, sg param2, int param3) {
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
        sg var16 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              var16 = gca.a(param0, (byte) 63, this.a((byte) 70), param2);
              if (var16 != null) {
                L2: {
                  var6 = var16.field_k.field_r;
                  var7 = var16.field_k.field_n;
                  var8 = ecb.a(param2.field_e + -var7, (byte) -77, -var6 + param2.field_d);
                  var9 = param3;
                  var10 = var6 - -((fc.a(var8, (byte) 38) >> -1745236888) * (var9 >> 982898344));
                  var11 = (var9 >> 766529672) * (eu.a(var8, 127) >> -374889976) + var7;
                  var12 = 256;
                  var13 = -param2.field_d + var10;
                  var14 = var11 + -param2.field_e;
                  var15 = ar.a(var13, (byte) 120, var14);
                  if (var12 >= var15) {
                    break L2;
                  } else {
                    var13 = var12 * var13 / (var15 >> -929561340);
                    var14 = var14 * var12 / (var15 >> -2006160956);
                    break L2;
                  }
                }
                this.field_d = var14;
                this.field_a = (anb) ((Object) var16);
                this.field_e = var13;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (param1 < -76) {
                break L3;
              } else {
                this.field_a = (anb) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("aoa.M(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          L5: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        this.field_b = param0 - -1;
        if (!param1) {
            field_c = (int[]) null;
        }
    }

    public final void b(byte param0, tv param1) {
        aoa var6 = null;
        aoa var7 = null;
        boolean discarded$0 = false;
        try {
            var6 = (aoa) ((Object) param1);
            var7 = var6;
            if (param0 < 54) {
                tv var4 = (tv) null;
                discarded$0 = this.a((byte) -32, (tv) null);
            }
            var7.field_b = this.field_b;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "aoa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void b(faa param0, int param1) {
        if (param1 > -109) {
            return;
        }
        try {
            param0.a(-632, this.field_b, 4);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "aoa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_c = new int[8192];
    }
}
