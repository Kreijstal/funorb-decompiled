/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oj extends om {
    private int field_A;
    static String field_C;
    private int field_G;
    static int field_y;
    private int field_z;
    static ko[] field_L;
    static String field_M;
    private boolean field_I;
    private int field_F;
    static am field_E;
    static dl field_B;
    private boolean field_J;
    static db field_H;

    final void a(int param0, int param1, int param2, int param3, qm param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            ((oj) this).field_s = 0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "oj.PA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        RuntimeException var5 = null;
        Object stackIn_7_0 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (((oj) this).a(0, param0, param3, param2)) {
                ((oj) this).a(param0, (byte) 120, param3, param2);
                ((oj) this).a(param3, param2, param0, -50);
                StringBuilder discarded$26 = param3.append(" revert=").append(((oj) this).field_J);
                if (((oj) this).field_A == 2147483647) {
                  break L1;
                } else {
                  if (((oj) this).field_F == 2147483647) {
                    break L1;
                  } else {
                    StringBuilder discarded$27 = param3.append(" to ").append(((oj) this).field_A).append(',').append(((oj) this).field_F);
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            if (param1 <= -85) {
              stackOut_8_0 = (StringBuilder) param3;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (StringBuilder) (Object) stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("oj.MA(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_9_0;
    }

    private oj(int param0, int param1, int param2, int param3, wo param4, bi param5, qm param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((oj) this).field_A = 2147483647;
        ((oj) this).field_F = 2147483647;
        try {
            ((oj) this).field_w = param6;
            ((oj) this).field_J = param7 ? true : false;
            ((oj) this).field_I = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "oj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void a(boolean param0, f[][] param1, int param2, int param3, double param4, int param5, double param6, int param7, byte param8, double param9) {
        RuntimeException var13 = null;
        int var14 = 0;
        double var15 = 0.0;
        double var17 = 0.0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        wm var29 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var28 = CrazyCrystals.field_B;
        try {
          L0: {
            var29 = jf.a(param7 - -param3, param5, 0, param5 + param2, param7);
            if (var29 != null) {
              var14 = (int)Math.ceil(param6);
              var15 = -param9 + (double)(param5 + param2 / 2);
              var17 = param6 + (double)(param3 / 2 + param7) - param4;
              var19 = (int)Math.floor(-0.01 + ((double)param5 - var15) / (2.0 * param6));
              var20 = (int)Math.floor(0.01 + (param6 * 2.0 + (-var15 + (double)(param5 - -param2))) / (param6 * 2.0));
              var21 = (int)Math.floor(-0.01 + (-var17 + (double)param7) / (param6 * 2.0));
              var22 = (int)Math.floor((3.0 * param6 + (-var17 + (double)(param3 + param7))) / (2.0 * param6) + 1.01);
              var23 = var21;
              L1: while (true) {
                if (var23 >= var22) {
                  var29.a((byte) -6);
                  break L0;
                } else {
                  var24 = (int)Math.floor(param6 * 2.0 * (double)var23 + var17);
                  var25 = (int)Math.floor(var15 + (double)var19 * (2.0 * param6)) & -2;
                  var26 = var19;
                  L2: while (true) {
                    if (var20 <= var26) {
                      var23++;
                      continue L1;
                    } else {
                      L3: {
                        var27 = (int)Math.floor(var15 + (double)(1 + var26) * (param6 * 2.0)) & -2;
                        if (var25 < var27) {
                          L4: {
                            L5: {
                              if (var23 < 0) {
                                break L5;
                              } else {
                                if (param1.length <= var23) {
                                  break L5;
                                } else {
                                  if (var26 < 0) {
                                    break L5;
                                  } else {
                                    if (param1[var23].length <= var26) {
                                      break L5;
                                    } else {
                                      param1[var23][var26].a(var14, -117, var27 + -var25 >> 1, false, var24, var25);
                                      break L4;
                                    }
                                  }
                                }
                              }
                            }
                            param1[0][0].a(var14, -35, -var25 + var27 >> 1, false, var24, var25);
                            break L4;
                          }
                          var25 = var27;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var26++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var13 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var13;
            stackOut_22_1 = new StringBuilder().append("oj.F(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + -32 + ',' + param9 + ')');
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var5_int = -59 / ((param1 - -50) / 59);
                  if (!(((oj) this).field_w instanceof pc)) {
                    break L3;
                  } else {
                    if (!((pc) (Object) ((oj) this).field_w).field_x) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (((oj) this).field_s == 1) {
                  L4: {
                    var6 = qh.field_i + (-((oj) this).field_z + -param3);
                    var7 = bm.field_h - ((oj) this).field_G - param2;
                    if (var6 != ((oj) this).field_r) {
                      break L4;
                    } else {
                      if (~((oj) this).field_j == ~var7) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ((oj) this).field_j = var7;
                  ((oj) this).field_r = var6;
                  if (!(((oj) this).field_l instanceof kc)) {
                    break L1;
                  } else {
                    ((kc) (Object) ((oj) this).field_l).a((byte) -20, param2, (oj) this, param3);
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
              if (!((oj) this).field_J) {
                break L1;
              } else {
                L5: {
                  if (((oj) this).field_A == ((oj) this).field_r) {
                    break L5;
                  } else {
                    L6: {
                      var6 = -((oj) this).field_r + ((oj) this).field_A;
                      stackOut_7_0 = this;
                      stackOut_7_1 = ((oj) this).field_r;
                      stackIn_11_0 = stackOut_7_0;
                      stackIn_11_1 = stackOut_7_1;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      if (Math.abs(var6) > 2) {
                        stackOut_11_0 = this;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = var6 >> 1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        break L6;
                      } else {
                        stackOut_8_0 = this;
                        stackOut_8_1 = stackIn_8_1;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (var6 <= 0) {
                          stackOut_10_0 = this;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = -1;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_12_1 = stackOut_10_1;
                          stackIn_12_2 = stackOut_10_2;
                          break L6;
                        } else {
                          stackOut_9_0 = this;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = 1;
                          stackIn_12_0 = stackOut_9_0;
                          stackIn_12_1 = stackOut_9_1;
                          stackIn_12_2 = stackOut_9_2;
                          break L6;
                        }
                      }
                    }
                    ((oj) this).field_r = stackIn_12_1 + stackIn_12_2;
                    break L5;
                  }
                }
                if (~((oj) this).field_j == ~((oj) this).field_F) {
                  break L1;
                } else {
                  L7: {
                    var6 = ((oj) this).field_F - ((oj) this).field_j;
                    stackOut_14_0 = this;
                    stackOut_14_1 = ((oj) this).field_j;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    if (2 >= Math.abs(var6)) {
                      stackOut_16_0 = this;
                      stackOut_16_1 = stackIn_16_1;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      if (var6 <= 0) {
                        stackOut_18_0 = this;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = -1;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        stackIn_19_2 = stackOut_18_2;
                        break L7;
                      } else {
                        stackOut_17_0 = this;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_19_2 = stackOut_17_2;
                        break L7;
                      }
                    } else {
                      stackOut_15_0 = this;
                      stackOut_15_1 = stackIn_15_1;
                      stackOut_15_2 = var6 >> 1;
                      stackIn_19_0 = stackOut_15_0;
                      stackIn_19_1 = stackOut_15_1;
                      stackIn_19_2 = stackOut_15_2;
                      break L7;
                    }
                  }
                  ((oj) this).field_j = stackIn_19_1 + stackIn_19_2;
                  break L1;
                }
              }
            }
            super.a(param0, -116, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var5;
            stackOut_27_1 = new StringBuilder().append("oj.N(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static bc a(int param0, int param1, java.awt.Component param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            bc var5 = null;
            tk var5_ref = null;
            bc stackIn_1_0 = null;
            tk stackIn_3_0 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            bc stackOut_0_0 = null;
            tk stackOut_2_0 = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              try {
                var4 = Class.forName("hg");
                var5 = (bc) var4.newInstance();
                var5.a(112, param0, param2, param3);
                stackOut_0_0 = (bc) var5;
                stackIn_1_0 = stackOut_0_0;
                return stackIn_1_0;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref = decompiledCaughtException;
                var5_ref = new tk();
                ((bc) (Object) var5_ref).a(113, param0, param2, param3);
                stackOut_2_0 = (tk) var5_ref;
                stackIn_3_0 = stackOut_2_0;
                return (bc) (Object) stackIn_3_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L0: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var4_ref2;
                stackOut_4_1 = new StringBuilder().append("oj.E(").append(param0).append(',').append(6641).append(',');
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param2 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L0;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L0;
                }
              }
              throw dn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void f() {
        field_M = null;
        field_L = null;
        field_C = null;
        field_E = null;
        field_H = null;
        field_B = null;
    }

    final void a(int param0) {
        if (param0 != -8346) {
            return;
        }
        super.a(param0);
        ((oj) this).field_w.a(((oj) this).field_f, 0, 0, ((oj) this).field_g, (byte) -52);
        ((oj) this).field_F = ((oj) this).field_j;
        ((oj) this).field_A = ((oj) this).field_r;
    }

    final boolean a(int param0, int param1, qm param2, boolean param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        Object var9 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
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
            L1: {
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (!param3) {
                break L1;
              } else {
                var9 = null;
                ((oj) this).a((qm) null, 27, 42, -63);
                break L1;
              }
            }
            L2: {
              if (var8_int == 0) {
                break L2;
              } else {
                if (!((oj) this).field_I) {
                  break L2;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
            if (!((oj) this).a(param1, param0, false, param4, param6)) {
              stackOut_12_0 = var8_int;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              L3: {
                if (param5 == 1) {
                  ((oj) this).field_G = -param4 + (param1 + -((oj) this).field_j);
                  ok.field_e = (oj) this;
                  ((oj) this).field_z = -((oj) this).field_r + (param6 + -param0);
                  break L3;
                } else {
                  break L3;
                }
              }
              ((oj) this).field_s = param5;
              stackOut_10_0 = 1;
              stackIn_11_0 = stackOut_10_0;
              return stackIn_11_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var8;
            stackOut_14_1 = new StringBuilder().append("oj.KA(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_13_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "This ball has a subtle difference from the last one. Did you notice?";
        field_L = new ko[7];
        field_C = "Here be crystals.";
        field_y = 640;
    }
}
