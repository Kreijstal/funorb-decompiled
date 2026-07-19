/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class nl extends kb implements gw {
    static String field_D;
    kb field_E;
    static String field_F;
    static String field_G;
    static String field_C;

    void b(boolean param0) {
        boolean discarded$0 = false;
        if (null != this.field_E) {
            this.field_E.e(0);
        }
        if (!param0) {
            kb var3 = (kb) null;
            discarded$0 = this.a(-121, -73, 76, 99, (kb) null, -116, -36);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, kb param6) {
        RuntimeException var8 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param5 >= 93) {
                break L1;
              } else {
                this.a(87, -41, (byte) 121, -47);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_E) {
                  break L3;
                } else {
                  if (!this.field_E.a(false)) {
                    break L3;
                  } else {
                    if (!this.field_E.a(param0, param1, param2, param3, param4, 96, param6)) {
                      break L3;
                    } else {
                      stackOut_5_0 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      break L2;
                    }
                  }
                }
              }
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var8);
            stackOut_8_1 = new StringBuilder().append("nl.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param6 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    void a(int param0, int param1, int param2, kb param3) {
        RuntimeException var5 = null;
        kb var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0 + 0, param1, param2, param3);
              if (param0 == 32722) {
                break L1;
              } else {
                var6 = (kb) null;
                this.a(-74, (kb) null, -57, (byte) -35, 30, 107);
                break L1;
              }
            }
            L2: {
              if (this.field_E == null) {
                break L2;
              } else {
                this.field_E.a(32722, this.field_B + param1, param2 + this.field_p, param3);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5);
            stackOut_5_1 = new StringBuilder().append("nl.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    void a(int param0, kb param1, int param2, byte param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              var7_int = -82 % ((param3 - -58) / 53);
              if (this.field_E == null) {
                break L1;
              } else {
                this.field_E.a(param0 - -this.field_p, param1, param2, (byte) 109, param4, this.field_B + param5);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var7);
            stackOut_3_1 = new StringBuilder().append("nl.JA(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void f(int param0) {
        if (!(null == this.field_E)) {
            this.field_E.f(1);
        }
        if (param0 != 1) {
            iw var3 = (iw) null;
            nl.a(-28, -106, (iw) null);
        }
    }

    StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        kl var6 = null;
        StringBuilder stackIn_6_0 = null;
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
        StringBuilder stackOut_5_0 = null;
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
              if (this.a(param3, param0, (byte) 39, param1)) {
                this.a(param0, param3, true, param1);
                this.a(param3, param0, 106, param1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 == 26477) {
                break L2;
              } else {
                var6 = (kl) null;
                nl.a((kl) null, (qb[][]) null, (kl) null, (byte) -118);
                break L2;
              }
            }
            stackOut_5_0 = (StringBuilder) (param1);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("nl.OA(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');
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
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            discarded$14 = param3.append('\n');
            var5_int = -96 / ((param2 - 43) / 54);
            var6 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var6 > param1) {
                    if (null != this.field_E) {
                      break L3;
                    } else {
                      discarded$15 = param3.append("null");
                      if (var7 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    discarded$16 = param3.append(' ');
                    var6++;
                    if (var7 != 0) {
                      break L3;
                    } else {
                      continue L1;
                    }
                  }
                }
                discarded$17 = this.field_E.a(param1 - -1, param3, 26477, param0);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("nl.HA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final int g(int param0) {
        if (param0 != -31989) {
            kb var3 = (kb) null;
            this.a(87, 114, -83, (kb) null);
        }
        return this.field_E != null ? this.field_E.g(-31989) : 0;
    }

    nl(int param0, int param1, int param2, int param3, kh param4, qo param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
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
              if (param3 > 103) {
                break L1;
              } else {
                field_C = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_E) {
                  break L3;
                } else {
                  if (!this.field_E.a(param0, param1 - -this.field_B, param2 - -this.field_p, 125, param4, param5, param6)) {
                    break L3;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
              }
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var8);
            stackOut_7_1 = new StringBuilder().append("nl.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final static void a(byte[] param0, int param1, int param2, String[] param3, String[][] param4, byte[] param5, String[][] param6, kl param7, wk[][] param8, wk[][] param9, String[] param10, int[] param11, String[] param12, boolean param13, int param14) {
        nf[] array$3 = null;
        nf[] array$4 = null;
        nf[] array$5 = null;
        RuntimeException var15 = null;
        je var16 = null;
        int var17_int = 0;
        je var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        int var19 = 0;
        Object var20 = null;
        String var20_ref = null;
        int var21 = 0;
        iw var22 = null;
        je var24 = null;
        je var25 = null;
        je stackIn_4_0 = null;
        je stackIn_4_1 = null;
        long stackIn_4_2 = 0L;
        je stackIn_4_3 = null;
        je stackIn_5_0 = null;
        je stackIn_5_1 = null;
        long stackIn_5_2 = 0L;
        je stackIn_5_3 = null;
        je stackIn_6_0 = null;
        je stackIn_6_1 = null;
        long stackIn_6_2 = 0L;
        je stackIn_6_3 = null;
        String stackIn_6_4 = null;
        int stackIn_37_0 = 0;
        int stackIn_54_0 = 0;
        nf stackIn_64_0 = null;
        Object stackIn_71_0 = null;
        nf stackIn_85_0 = null;
        Object stackIn_91_0 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_96_2 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_102_2 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_108_2 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        String stackIn_111_2 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_114_2 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        String stackIn_117_2 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        String stackIn_120_2 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        String stackIn_123_2 = null;
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        String stackIn_126_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        je stackOut_3_0 = null;
        je stackOut_3_1 = null;
        long stackOut_3_2 = 0L;
        je stackOut_3_3 = null;
        je stackOut_5_0 = null;
        je stackOut_5_1 = null;
        long stackOut_5_2 = 0L;
        je stackOut_5_3 = null;
        String stackOut_5_4 = null;
        je stackOut_4_0 = null;
        je stackOut_4_1 = null;
        long stackOut_4_2 = 0L;
        je stackOut_4_3 = null;
        String stackOut_4_4 = null;
        int stackOut_53_0 = 0;
        int stackOut_36_0 = 0;
        nf stackOut_63_0 = null;
        je stackOut_70_0 = null;
        nf stackOut_84_0 = null;
        je stackOut_90_0 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        String stackOut_107_2 = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        String stackOut_106_2 = null;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        String stackOut_110_2 = null;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        String stackOut_109_2 = null;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        RuntimeException stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        String stackOut_113_2 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        String stackOut_112_2 = null;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        String stackOut_116_2 = null;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        String stackOut_115_2 = null;
        RuntimeException stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        String stackOut_119_2 = null;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        RuntimeException stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        String stackOut_122_2 = null;
        RuntimeException stackOut_121_0 = null;
        StringBuilder stackOut_121_1 = null;
        String stackOut_121_2 = null;
        RuntimeException stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        String stackOut_125_2 = null;
        RuntimeException stackOut_124_0 = null;
        StringBuilder stackOut_124_1 = null;
        String stackOut_124_2 = null;
        Object var17_ref = null;
        var21 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              tr.field_F = param5;
              lm.field_e = param11;
              ob.field_M = param10;
              ll.field_Mb = param6;
              wb.field_a = param4;
              cj.field_j = param3;
              gt.field_f = param12;
              ei.field_h = param14;
              mi.field_r = param0;
              jn.field_b = param8;
              ju.field_a = param9;
              mt.field_d = param2;
              rs.field_p = fk.a("gameprivacy", (byte) -128, param7, "lobby");
              bp.field_d = fk.a("ratedgame", (byte) -125, param7, "lobby");
              mo.field_g = fk.a("opentome", (byte) -124, param7, "lobby");
              lm.field_h = fk.a("allowspectators", (byte) -125, param7, "lobby");
              ks.field_u = new String[5];
              ks.field_u[1] = pc.field_i;
              ks.field_u[3] = ek.field_f;
              ks.field_u[2] = kd.field_L;
              ks.field_u[0] = ns.field_D;
              ks.field_u[4] = io.field_p;
              nf.field_Kb = new je(0L, (je) null);
              rj.field_F = new je(0L, te.field_p, su.field_b);
              cm.field_a = new je(0L, br.field_e, rh.field_g);
              ne.field_f = new dn(0L, new je(0L, (je) null), cb.field_c, ri.field_b);
              nf.field_Kb.a(rj.field_F, 79);
              if (!fh.field_c) {
                break L1;
              } else {
                nf.field_Kb.a(cm.field_a, 69);
                break L1;
              }
            }
            L2: {
              nf.field_Kb.a(ne.field_f, 59);
              ne.field_f.field_Nb.a(0, eq.field_h);
              ne.field_f.field_Nb.field_Fb = 1;
              var24 = ne.field_f.field_Nb;
              var25 = var24;
              var25.field_Eb = 1;
              t.field_g = new je(0L, eq.field_h);
              t.field_g.field_Eb = 1;
              cp.field_d = new je(0L, kd.field_M, eq.field_e.toUpperCase());
              tg.field_n = new je(0L, be.field_y, nr.field_d.toUpperCase());
              of.field_Lb = new je(0L, sh.field_m);
              r.field_v = new je(0L, te.field_p, tc.field_a);
              ek.field_c = new je(0L, ho.field_a, wb.field_c);
              sr.field_p = new je(0L, ho.field_a, fk.field_g);
              bs.field_a = new je(0L, ho.field_a, fw.field_H);
              ee.field_A = new je(0L, ho.field_a, hs.field_D);
              wl.field_K = new je(0L, br.field_e, rt.field_B);
              bv.field_x = new dn(0L, new je(0L, (je) null), cb.field_c, ri.field_b);
              fj.field_d = new je(0L, nd.field_a, l.field_f.toUpperCase());
              fj.field_d.field_xb = fh.field_c;
              stackOut_3_0 = null;
              stackOut_3_1 = null;
              stackOut_3_2 = 0L;
              stackOut_3_3 = nd.field_a;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              stackIn_5_3 = stackOut_3_3;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              stackIn_4_3 = stackOut_3_3;
              if (!fh.field_c) {
                stackOut_5_0 = null;
                stackOut_5_1 = null;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = (je) ((Object) stackIn_5_3);
                stackOut_5_4 = jf.field_G;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                stackIn_6_3 = stackOut_5_3;
                stackIn_6_4 = stackOut_5_4;
                break L2;
              } else {
                stackOut_4_0 = null;
                stackOut_4_1 = null;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = (je) ((Object) stackIn_4_3);
                stackOut_4_4 = cq.field_C;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_6_2 = stackOut_4_2;
                stackIn_6_3 = stackOut_4_3;
                stackIn_6_4 = stackOut_4_4;
                break L2;
              }
            }
            L3: {
              pe.field_x = new je(stackIn_6_2, stackIn_6_3, ((String) (Object) stackIn_6_4).toUpperCase());
              ov.field_i = new je(0L, (je) null);
              ov.field_i.a(tg.field_n, 92);
              ov.field_i.a(of.field_Lb, 47);
              of.field_Lb.a(r.field_v, 38);
              of.field_Lb.a(ek.field_c, 114);
              of.field_Lb.a(sr.field_p, 121);
              if (!fh.field_c) {
                break L3;
              } else {
                of.field_Lb.a(bs.field_a, 114);
                break L3;
              }
            }
            L4: {
              of.field_Lb.a(ee.field_A, 78);
              of.field_Lb.a(wl.field_K, 99);
              of.field_Lb.a(bv.field_x, 70);
              if (!fh.field_c) {
                break L4;
              } else {
                ov.field_i.a(fj.field_d, 127);
                break L4;
              }
            }
            L5: {
              ov.field_i.a(pe.field_x, 93);
              vu.field_Q = new je(0L, eq.field_h);
              vu.field_Q.field_Eb = 1;
              vu.field_Q.field_Fb = 0;
              td.field_g = new je(0L, bw.field_h, ul.field_f.toUpperCase());
              qc.field_c = new je(0L, jm.field_b);
              qc.field_c.a(vu.field_Q, 116);
              qc.field_c.a(td.field_g, 89);
              uj.field_l = new je(0L, cb.field_c);
              uj.field_l.a(0, eq.field_h);
              uj.field_l.field_Fb = 1;
              var16 = uj.field_l;
              var16.field_Eb = 1;
              eb.field_c = new je(0L, (je) null);
              gg.field_E = new je(0L, eq.field_h);
              gg.field_E.field_Eb = 1;
              di.field_l = new je(0L, te.field_p, su.field_b);
              pj.field_D = new je(0L, br.field_e, rh.field_g);
              bu.field_a = new dn(0L, new je(0L, (je) null), cb.field_c, ri.field_b);
              eb.field_c.a(gg.field_E, 72);
              eb.field_c.a(di.field_l, 83);
              if (fh.field_c) {
                eb.field_c.a(pj.field_D, 107);
                break L5;
              } else {
                break L5;
              }
            }
            eb.field_c.a(bu.field_a, 109);
            mp.field_Lb = new je(0L, kd.field_M, pl.field_v.toUpperCase());
            kd.field_F = new je(0L, be.field_y);
            vc.field_l = new je(0L, sh.field_m);
            iu.field_d = new je(0L, rn.field_a, tb.field_d.toUpperCase());
            rl.field_z = new je[param1 - -4];
            pu.field_k = new nf[4 + param1][];
            rl.field_z[0] = new je(0L, fp.field_Lb, et.field_c);
            pu.field_k[0] = new nf[6];
            var17_int = 0;
            L6: while (true) {
              L7: {
                L8: {
                  L9: {
                    L10: {
                      if ((var17_int ^ -1) <= -6) {
                        break L10;
                      } else {
                        pu.field_k[0][var17_int + 1] = new nf(0L, eb.field_a, (je) null, ms.field_k, rs.field_p[var17_int], ks.field_u[var17_int]);
                        var17_int++;
                        if (var21 != 0) {
                          break L9;
                        } else {
                          if (var21 == 0) {
                            continue L6;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    if ((lm.field_e.length ^ -1) <= -3) {
                      rl.field_z[1] = new je(0L, fp.field_Lb, ep.field_h);
                      array$3 = new nf[1 + lm.field_e.length];
                      pu.field_k[1] = array$3;
                      pu.field_k[1][0] = new nf(0L, eb.field_a, (je) null, ms.field_k, (wk) null, ki.field_a);
                      break L9;
                    } else {
                      break L8;
                    }
                  }
                  var17_int = 0;
                  L11: while (true) {
                    if (lm.field_e.length <= var17_int) {
                      break L8;
                    } else {
                      pu.field_k[1][var17_int - -1] = new nf(0L, eb.field_a, (je) null, ms.field_k, (wk) null, Integer.toString(lm.field_e[var17_int]));
                      var17_int++;
                      if (var21 != 0) {
                        break L7;
                      } else {
                        if (var21 == 0) {
                          continue L11;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                }
                rl.field_z[2] = new je(0L, fp.field_Lb, oj.field_p);
                pu.field_k[2] = new nf[]{new nf(0L, eb.field_a, (je) null, ms.field_k, (wk) null, ki.field_a), new nf(0L, eb.field_a, (je) null, ms.field_k, lm.field_h[0], gm.field_e), new nf(0L, eb.field_a, (je) null, ms.field_k, lm.field_h[1], po.field_b)};
                break L7;
              }
              L12: {
                L13: {
                  if (ei.field_h > 1) {
                    rl.field_z[3] = new je(0L, fp.field_Lb, wp.field_u);
                    array$4 = new nf[1 + ei.field_h];
                    pu.field_k[3] = array$4;
                    pu.field_k[3][0] = new nf(0L, eb.field_a, (je) null, ms.field_k, (wk) null, ki.field_a);
                    var17_int = 0;
                    L14: while (true) {
                      if (var17_int >= ei.field_h) {
                        break L13;
                      } else {
                        pu.field_k[3][1 + var17_int] = new nf(0L, eb.field_a, (je) null, ms.field_k, (wk) null, gt.field_f[var17_int]);
                        var17_int++;
                        if (var21 != 0) {
                          break L12;
                        } else {
                          if (var21 == 0) {
                            continue L14;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                  } else {
                    break L13;
                  }
                }
                var17_int = 0;
                break L12;
              }
              L15: while (true) {
                L16: {
                  if (param1 <= var17_int) {
                    stackOut_53_0 = 0;
                    stackIn_54_0 = stackOut_53_0;
                    break L16;
                  } else {
                    rl.field_z[var17_int + 4] = new je(0L, fp.field_Lb, ob.field_M[var17_int]);
                    array$5 = new nf[rn.a(255, (int) mi.field_r[var17_int]) + 1];
                    pu.field_k[var17_int + 4] = array$5;
                    pu.field_k[var17_int + 4][0] = new nf(0L, eb.field_a, (je) null, ms.field_k, (wk) null, ki.field_a);
                    stackOut_36_0 = 0;
                    stackIn_54_0 = stackOut_36_0;
                    stackIn_37_0 = stackOut_36_0;
                    if (var21 != 0) {
                      break L16;
                    } else {
                      var18 = stackIn_37_0;
                      L17: while (true) {
                        L18: {
                          L19: {
                            if (var18 >= (mi.field_r[var17_int] & 255)) {
                              break L19;
                            } else {
                              if (var21 != 0) {
                                break L18;
                              } else {
                                L20: {
                                  if (jn.field_b == null) {
                                    var19_ref = null;
                                    break L20;
                                  } else {
                                    if (jn.field_b[var17_int] != null) {
                                      var19_ref = jn.field_b[var17_int][var18];
                                      break L20;
                                    } else {
                                      var19_ref = null;
                                      break L20;
                                    }
                                  }
                                }
                                L21: {
                                  if (ll.field_Mb != null) {
                                    if (ll.field_Mb[var17_int] != null) {
                                      var20_ref = ll.field_Mb[var17_int][var18];
                                      break L21;
                                    } else {
                                      var20_ref = null;
                                      break L21;
                                    }
                                  } else {
                                    var20_ref = null;
                                    break L21;
                                  }
                                }
                                pu.field_k[var17_int + 4][1 + var18] = new nf(0L, eb.field_a, (je) null, ms.field_k, (wk) (var19_ref), var20_ref);
                                var18++;
                                if (var21 == 0) {
                                  continue L17;
                                } else {
                                  break L19;
                                }
                              }
                            }
                          }
                          var17_int++;
                          break L18;
                        }
                        continue L15;
                      }
                    }
                  }
                }
                var17_int = stackIn_54_0;
                L22: while (true) {
                  L23: {
                    L24: {
                      L25: {
                        if (param1 - -4 <= var17_int) {
                          break L25;
                        } else {
                          if (var21 != 0) {
                            break L24;
                          } else {
                            L26: {
                              if (null == rl.field_z[var17_int]) {
                                break L26;
                              } else {
                                rl.field_z[var17_int].field_pb = 11;
                                break L26;
                              }
                            }
                            L27: {
                              if (pu.field_k[var17_int] != null) {
                                var18 = 0;
                                L28: while (true) {
                                  if (pu.field_k[var17_int].length <= var18) {
                                    break L27;
                                  } else {
                                    stackOut_63_0 = pu.field_k[var17_int][var18];
                                    stackIn_71_0 = stackOut_63_0;
                                    stackIn_64_0 = stackOut_63_0;
                                    if (var21 != 0) {
                                      break L23;
                                    } else {
                                      L29: {
                                        if (stackIn_64_0 == null) {
                                          break L29;
                                        } else {
                                          if (null == pu.field_k[var17_int][var18].field_Ob) {
                                            break L29;
                                          } else {
                                            pu.field_k[var17_int][var18].field_Ob.field_pb = 11;
                                            break L29;
                                          }
                                        }
                                      }
                                      var18++;
                                      if (var21 == 0) {
                                        continue L28;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L27;
                              }
                            }
                            var17_int++;
                            if (var21 == 0) {
                              continue L22;
                            } else {
                              break L25;
                            }
                          }
                        }
                      }
                      lm.field_b = new je(0L, nd.field_a);
                      so.field_d = new je(0L, nd.field_a);
                      pi.field_N = new je(0L, ke.field_e);
                      pi.field_N.a(0, eq.field_h);
                      break L24;
                    }
                    stackOut_70_0 = pi.field_N;
                    stackIn_71_0 = stackOut_70_0;
                    break L23;
                  }
                  L30: {
                    var17_ref = stackIn_71_0;
                    pi.field_N.field_Fb = 1;
                    if (!param13) {
                      break L30;
                    } else {
                      var22 = (iw) null;
                      nl.a(-73, 39, (iw) null);
                      break L30;
                    }
                  }
                  ((je) (var17_ref)).field_Eb = 1;
                  pd.field_c = new je(0L, (je) null);
                  pd.field_c.a(kd.field_F, 44);
                  pd.field_c.a(vc.field_l, 68);
                  vc.field_l.a(iu.field_d, 106);
                  var18 = 0;
                  L31: while (true) {
                    L32: {
                      L33: {
                        L34: {
                          if (var18 >= param1 - -4) {
                            break L34;
                          } else {
                            if (var21 != 0) {
                              break L32;
                            } else {
                              L35: {
                                L36: {
                                  if (var18 != 1) {
                                    break L36;
                                  } else {
                                    if (2 > lm.field_e.length) {
                                      break L35;
                                    } else {
                                      break L36;
                                    }
                                  }
                                }
                                L37: {
                                  if (var18 != 3) {
                                    break L37;
                                  } else {
                                    if ((ei.field_h ^ -1) >= -2) {
                                      break L35;
                                    } else {
                                      break L37;
                                    }
                                  }
                                }
                                vc.field_l.a(rl.field_z[var18], 86);
                                var19 = 0;
                                L38: while (true) {
                                  if (var19 >= pu.field_k[var18].length) {
                                    break L35;
                                  } else {
                                    stackOut_84_0 = pu.field_k[var18][var19];
                                    stackIn_91_0 = stackOut_84_0;
                                    stackIn_85_0 = stackOut_84_0;
                                    if (var21 != 0) {
                                      break L33;
                                    } else {
                                      L39: {
                                        if (stackIn_85_0 != null) {
                                          vc.field_l.a(pu.field_k[var18][var19], 48);
                                          break L39;
                                        } else {
                                          break L39;
                                        }
                                      }
                                      var19++;
                                      if (var21 == 0) {
                                        continue L38;
                                      } else {
                                        break L35;
                                      }
                                    }
                                  }
                                }
                              }
                              var18++;
                              if (var21 == 0) {
                                continue L31;
                              } else {
                                break L34;
                              }
                            }
                          }
                        }
                        pd.field_c.a(lm.field_b, 77);
                        pd.field_c.a(so.field_d, 69);
                        pd.field_c.a(pi.field_N, 91);
                        bk.field_f = new je(0L, hr.field_m, em.field_d.toUpperCase());
                        stackOut_90_0 = new je(0L, bw.field_h, dr.field_D.toUpperCase());
                        stackIn_91_0 = stackOut_90_0;
                        break L33;
                      }
                      dv.field_m = (je) ((Object) stackIn_91_0);
                      break L32;
                    }
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L40: {
            var15 = decompiledCaughtException;
            stackOut_93_0 = (RuntimeException) (var15);
            stackOut_93_1 = new StringBuilder().append("nl.FA(");
            stackIn_95_0 = stackOut_93_0;
            stackIn_95_1 = stackOut_93_1;
            stackIn_94_0 = stackOut_93_0;
            stackIn_94_1 = stackOut_93_1;
            if (param0 == null) {
              stackOut_95_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackOut_95_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackOut_95_2 = "null";
              stackIn_96_0 = stackOut_95_0;
              stackIn_96_1 = stackOut_95_1;
              stackIn_96_2 = stackOut_95_2;
              break L40;
            } else {
              stackOut_94_0 = (RuntimeException) ((Object) stackIn_94_0);
              stackOut_94_1 = (StringBuilder) ((Object) stackIn_94_1);
              stackOut_94_2 = "{...}";
              stackIn_96_0 = stackOut_94_0;
              stackIn_96_1 = stackOut_94_1;
              stackIn_96_2 = stackOut_94_2;
              break L40;
            }
          }
          L41: {
            stackOut_96_0 = (RuntimeException) ((Object) stackIn_96_0);
            stackOut_96_1 = ((StringBuilder) (Object) stackIn_96_1).append(stackIn_96_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_98_0 = stackOut_96_0;
            stackIn_98_1 = stackOut_96_1;
            stackIn_97_0 = stackOut_96_0;
            stackIn_97_1 = stackOut_96_1;
            if (param3 == null) {
              stackOut_98_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackOut_98_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackOut_98_2 = "null";
              stackIn_99_0 = stackOut_98_0;
              stackIn_99_1 = stackOut_98_1;
              stackIn_99_2 = stackOut_98_2;
              break L41;
            } else {
              stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackOut_97_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackOut_97_2 = "{...}";
              stackIn_99_0 = stackOut_97_0;
              stackIn_99_1 = stackOut_97_1;
              stackIn_99_2 = stackOut_97_2;
              break L41;
            }
          }
          L42: {
            stackOut_99_0 = (RuntimeException) ((Object) stackIn_99_0);
            stackOut_99_1 = ((StringBuilder) (Object) stackIn_99_1).append(stackIn_99_2).append(',');
            stackIn_101_0 = stackOut_99_0;
            stackIn_101_1 = stackOut_99_1;
            stackIn_100_0 = stackOut_99_0;
            stackIn_100_1 = stackOut_99_1;
            if (param4 == null) {
              stackOut_101_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackOut_101_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackOut_101_2 = "null";
              stackIn_102_0 = stackOut_101_0;
              stackIn_102_1 = stackOut_101_1;
              stackIn_102_2 = stackOut_101_2;
              break L42;
            } else {
              stackOut_100_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackOut_100_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackOut_100_2 = "{...}";
              stackIn_102_0 = stackOut_100_0;
              stackIn_102_1 = stackOut_100_1;
              stackIn_102_2 = stackOut_100_2;
              break L42;
            }
          }
          L43: {
            stackOut_102_0 = (RuntimeException) ((Object) stackIn_102_0);
            stackOut_102_1 = ((StringBuilder) (Object) stackIn_102_1).append(stackIn_102_2).append(',');
            stackIn_104_0 = stackOut_102_0;
            stackIn_104_1 = stackOut_102_1;
            stackIn_103_0 = stackOut_102_0;
            stackIn_103_1 = stackOut_102_1;
            if (param5 == null) {
              stackOut_104_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackOut_104_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackOut_104_2 = "null";
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              stackIn_105_2 = stackOut_104_2;
              break L43;
            } else {
              stackOut_103_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackOut_103_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackOut_103_2 = "{...}";
              stackIn_105_0 = stackOut_103_0;
              stackIn_105_1 = stackOut_103_1;
              stackIn_105_2 = stackOut_103_2;
              break L43;
            }
          }
          L44: {
            stackOut_105_0 = (RuntimeException) ((Object) stackIn_105_0);
            stackOut_105_1 = ((StringBuilder) (Object) stackIn_105_1).append(stackIn_105_2).append(',');
            stackIn_107_0 = stackOut_105_0;
            stackIn_107_1 = stackOut_105_1;
            stackIn_106_0 = stackOut_105_0;
            stackIn_106_1 = stackOut_105_1;
            if (param6 == null) {
              stackOut_107_0 = (RuntimeException) ((Object) stackIn_107_0);
              stackOut_107_1 = (StringBuilder) ((Object) stackIn_107_1);
              stackOut_107_2 = "null";
              stackIn_108_0 = stackOut_107_0;
              stackIn_108_1 = stackOut_107_1;
              stackIn_108_2 = stackOut_107_2;
              break L44;
            } else {
              stackOut_106_0 = (RuntimeException) ((Object) stackIn_106_0);
              stackOut_106_1 = (StringBuilder) ((Object) stackIn_106_1);
              stackOut_106_2 = "{...}";
              stackIn_108_0 = stackOut_106_0;
              stackIn_108_1 = stackOut_106_1;
              stackIn_108_2 = stackOut_106_2;
              break L44;
            }
          }
          L45: {
            stackOut_108_0 = (RuntimeException) ((Object) stackIn_108_0);
            stackOut_108_1 = ((StringBuilder) (Object) stackIn_108_1).append(stackIn_108_2).append(',');
            stackIn_110_0 = stackOut_108_0;
            stackIn_110_1 = stackOut_108_1;
            stackIn_109_0 = stackOut_108_0;
            stackIn_109_1 = stackOut_108_1;
            if (param7 == null) {
              stackOut_110_0 = (RuntimeException) ((Object) stackIn_110_0);
              stackOut_110_1 = (StringBuilder) ((Object) stackIn_110_1);
              stackOut_110_2 = "null";
              stackIn_111_0 = stackOut_110_0;
              stackIn_111_1 = stackOut_110_1;
              stackIn_111_2 = stackOut_110_2;
              break L45;
            } else {
              stackOut_109_0 = (RuntimeException) ((Object) stackIn_109_0);
              stackOut_109_1 = (StringBuilder) ((Object) stackIn_109_1);
              stackOut_109_2 = "{...}";
              stackIn_111_0 = stackOut_109_0;
              stackIn_111_1 = stackOut_109_1;
              stackIn_111_2 = stackOut_109_2;
              break L45;
            }
          }
          L46: {
            stackOut_111_0 = (RuntimeException) ((Object) stackIn_111_0);
            stackOut_111_1 = ((StringBuilder) (Object) stackIn_111_1).append(stackIn_111_2).append(',');
            stackIn_113_0 = stackOut_111_0;
            stackIn_113_1 = stackOut_111_1;
            stackIn_112_0 = stackOut_111_0;
            stackIn_112_1 = stackOut_111_1;
            if (param8 == null) {
              stackOut_113_0 = (RuntimeException) ((Object) stackIn_113_0);
              stackOut_113_1 = (StringBuilder) ((Object) stackIn_113_1);
              stackOut_113_2 = "null";
              stackIn_114_0 = stackOut_113_0;
              stackIn_114_1 = stackOut_113_1;
              stackIn_114_2 = stackOut_113_2;
              break L46;
            } else {
              stackOut_112_0 = (RuntimeException) ((Object) stackIn_112_0);
              stackOut_112_1 = (StringBuilder) ((Object) stackIn_112_1);
              stackOut_112_2 = "{...}";
              stackIn_114_0 = stackOut_112_0;
              stackIn_114_1 = stackOut_112_1;
              stackIn_114_2 = stackOut_112_2;
              break L46;
            }
          }
          L47: {
            stackOut_114_0 = (RuntimeException) ((Object) stackIn_114_0);
            stackOut_114_1 = ((StringBuilder) (Object) stackIn_114_1).append(stackIn_114_2).append(',');
            stackIn_116_0 = stackOut_114_0;
            stackIn_116_1 = stackOut_114_1;
            stackIn_115_0 = stackOut_114_0;
            stackIn_115_1 = stackOut_114_1;
            if (param9 == null) {
              stackOut_116_0 = (RuntimeException) ((Object) stackIn_116_0);
              stackOut_116_1 = (StringBuilder) ((Object) stackIn_116_1);
              stackOut_116_2 = "null";
              stackIn_117_0 = stackOut_116_0;
              stackIn_117_1 = stackOut_116_1;
              stackIn_117_2 = stackOut_116_2;
              break L47;
            } else {
              stackOut_115_0 = (RuntimeException) ((Object) stackIn_115_0);
              stackOut_115_1 = (StringBuilder) ((Object) stackIn_115_1);
              stackOut_115_2 = "{...}";
              stackIn_117_0 = stackOut_115_0;
              stackIn_117_1 = stackOut_115_1;
              stackIn_117_2 = stackOut_115_2;
              break L47;
            }
          }
          L48: {
            stackOut_117_0 = (RuntimeException) ((Object) stackIn_117_0);
            stackOut_117_1 = ((StringBuilder) (Object) stackIn_117_1).append(stackIn_117_2).append(',');
            stackIn_119_0 = stackOut_117_0;
            stackIn_119_1 = stackOut_117_1;
            stackIn_118_0 = stackOut_117_0;
            stackIn_118_1 = stackOut_117_1;
            if (param10 == null) {
              stackOut_119_0 = (RuntimeException) ((Object) stackIn_119_0);
              stackOut_119_1 = (StringBuilder) ((Object) stackIn_119_1);
              stackOut_119_2 = "null";
              stackIn_120_0 = stackOut_119_0;
              stackIn_120_1 = stackOut_119_1;
              stackIn_120_2 = stackOut_119_2;
              break L48;
            } else {
              stackOut_118_0 = (RuntimeException) ((Object) stackIn_118_0);
              stackOut_118_1 = (StringBuilder) ((Object) stackIn_118_1);
              stackOut_118_2 = "{...}";
              stackIn_120_0 = stackOut_118_0;
              stackIn_120_1 = stackOut_118_1;
              stackIn_120_2 = stackOut_118_2;
              break L48;
            }
          }
          L49: {
            stackOut_120_0 = (RuntimeException) ((Object) stackIn_120_0);
            stackOut_120_1 = ((StringBuilder) (Object) stackIn_120_1).append(stackIn_120_2).append(',');
            stackIn_122_0 = stackOut_120_0;
            stackIn_122_1 = stackOut_120_1;
            stackIn_121_0 = stackOut_120_0;
            stackIn_121_1 = stackOut_120_1;
            if (param11 == null) {
              stackOut_122_0 = (RuntimeException) ((Object) stackIn_122_0);
              stackOut_122_1 = (StringBuilder) ((Object) stackIn_122_1);
              stackOut_122_2 = "null";
              stackIn_123_0 = stackOut_122_0;
              stackIn_123_1 = stackOut_122_1;
              stackIn_123_2 = stackOut_122_2;
              break L49;
            } else {
              stackOut_121_0 = (RuntimeException) ((Object) stackIn_121_0);
              stackOut_121_1 = (StringBuilder) ((Object) stackIn_121_1);
              stackOut_121_2 = "{...}";
              stackIn_123_0 = stackOut_121_0;
              stackIn_123_1 = stackOut_121_1;
              stackIn_123_2 = stackOut_121_2;
              break L49;
            }
          }
          L50: {
            stackOut_123_0 = (RuntimeException) ((Object) stackIn_123_0);
            stackOut_123_1 = ((StringBuilder) (Object) stackIn_123_1).append(stackIn_123_2).append(',');
            stackIn_125_0 = stackOut_123_0;
            stackIn_125_1 = stackOut_123_1;
            stackIn_124_0 = stackOut_123_0;
            stackIn_124_1 = stackOut_123_1;
            if (param12 == null) {
              stackOut_125_0 = (RuntimeException) ((Object) stackIn_125_0);
              stackOut_125_1 = (StringBuilder) ((Object) stackIn_125_1);
              stackOut_125_2 = "null";
              stackIn_126_0 = stackOut_125_0;
              stackIn_126_1 = stackOut_125_1;
              stackIn_126_2 = stackOut_125_2;
              break L50;
            } else {
              stackOut_124_0 = (RuntimeException) ((Object) stackIn_124_0);
              stackOut_124_1 = (StringBuilder) ((Object) stackIn_124_1);
              stackOut_124_2 = "{...}";
              stackIn_126_0 = stackOut_124_0;
              stackIn_126_1 = stackOut_124_1;
              stackIn_126_2 = stackOut_124_2;
              break L50;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_126_0), stackIn_126_2 + ',' + param13 + ',' + param14 + ')');
        }
    }

    kb a(int param0) {
        boolean discarded$2 = false;
        kb var2 = null;
        kb var3 = null;
        L0: {
          var2 = this.field_E;
          if (var2 == null) {
            break L0;
          } else {
            if (var2.a(false)) {
              return var2;
            } else {
              break L0;
            }
          }
        }
        if (param0 == -1848) {
          return null;
        } else {
          var3 = (kb) null;
          discarded$2 = this.a(-40, -59, -4, 58, 32, -127, (kb) null);
          return null;
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        L0: {
          if (-1 != (param3 ^ -1)) {
            break L0;
          } else {
            if (this.field_k != null) {
              this.field_k.a((kb) (this), param0, -94, true, param1);
              break L0;
            } else {
              break L0;
            }
          }
        }
        if (param2 > -82) {
          return;
        } else {
          L1: {
            if (this.field_E == null) {
              break L1;
            } else {
              this.field_E.a(this.field_B + param0, this.field_p + param1, (byte) -118, param3);
              break L1;
            }
          }
          return;
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
            field_D = (String) null;
        }
        return this.a(-1848) != null ? true : false;
    }

    String h(int param0) {
        String var2 = null;
        String var3 = null;
        if (param0 == 21384) {
          var2 = super.h(param0 + 0);
          if (this.field_E != null) {
            var3 = this.field_E.h(21384);
            if (var3 != null) {
              return var3;
            } else {
              return var2;
            }
          } else {
            return var2;
          }
        } else {
          return (String) null;
        }
    }

    public static void i(int param0) {
        field_C = null;
        if (param0 > -81) {
            field_F = (String) null;
        }
        field_D = null;
        field_G = null;
        field_F = null;
    }

    private final boolean b(int param0, kb param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (param0 == 4) {
              L1: {
                L2: {
                  if (null == this.field_E) {
                    break L2;
                  } else {
                    if (this.field_E.a(false)) {
                      break L2;
                    } else {
                      if (!this.field_E.a(11, param1)) {
                        break L2;
                      } else {
                        stackOut_6_0 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        break L1;
                      }
                    }
                  }
                }
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("nl.IA(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        String[] var6 = null;
        int stackIn_6_0 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        boolean stackOut_11_0 = false;
        boolean stackOut_10_0 = false;
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
              if (param3 == -12215) {
                break L1;
              } else {
                var6 = (String[]) null;
                nl.a((byte[]) null, 101, 110, (String[]) null, (String[][]) null, (byte[]) null, (String[][]) null, (kl) null, (wk[][]) null, (wk[][]) null, (String[]) null, (int[]) null, (String[]) null, true, 39);
                break L1;
              }
            }
            L2: {
              if (this.field_E == null) {
                break L2;
              } else {
                if (!this.field_E.a(false)) {
                  break L2;
                } else {
                  if (!this.field_E.a(param0, param1, param2, -12215)) {
                    break L2;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_6_0 = stackOut_5_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            var5_int = param1;
            if (80 == var5_int) {
              L3: {
                if (!br.field_f[81]) {
                  stackOut_11_0 = this.a(param0, (byte) 107);
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = this.b(4, param0);
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("nl.F(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_12_0;
        }
    }

    final static void a(int param0, int param1, iw param2) {
        try {
            if (param0 != 0) {
                iw var4 = (iw) null;
                nl.a(30, -59, (iw) null);
            }
            cg.field_c.a((byte) -119, (tc) (param2));
            ot.a((byte) 112, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "nl.MA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.b(true);
    }

    final static void a(kl param0, qb[][] param1, kl param2, byte param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        qb var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        fd var14 = null;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int stackIn_9_0 = 0;
        Object stackIn_11_0 = null;
        int stackIn_16_0 = 0;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_27_0 = null;
        int stackOut_8_0 = 0;
        Object stackOut_10_0 = null;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              var4_int = param1.length;
              var5 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var4_int <= var5) {
                      if (param3 >= 124) {
                        break L2;
                      } else {
                        stackOut_27_0 = null;
                        stackIn_28_0 = stackOut_27_0;
                        break L3;
                      }
                    } else {
                      if (var15 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (param1[var5] == null) {
                            break L4;
                          } else {
                            var6 = param1[var5].length;
                            var7 = 0;
                            L5: while (true) {
                              stackOut_8_0 = var6;
                              stackIn_9_0 = stackOut_8_0;
                              L6: while (true) {
                                if (stackIn_9_0 <= var7) {
                                  break L4;
                                } else {
                                  var8 = param1[var5][var7];
                                  stackOut_10_0 = null;
                                  stackIn_28_0 = stackOut_10_0;
                                  stackIn_11_0 = stackOut_10_0;
                                  if (var15 != 0) {
                                    break L3;
                                  } else {
                                    L7: {
                                      if (stackIn_11_0 == var8) {
                                        break L7;
                                      } else {
                                        var17 = var8.field_a;
                                        var16 = var17;
                                        var9 = var16;
                                        if (var9 == null) {
                                          break L7;
                                        } else {
                                          var10 = var17.length;
                                          var11 = 0;
                                          L8: while (true) {
                                            if (var11 >= var10) {
                                              break L7;
                                            } else {
                                              var12 = var17[var11] >> 103014960;
                                              var13 = ge.a(0, var12) ? 1 : 0;
                                              stackOut_15_0 = var13;
                                              stackIn_9_0 = stackOut_15_0;
                                              stackIn_16_0 = stackOut_15_0;
                                              if (var15 != 0) {
                                                continue L6;
                                              } else {
                                                L9: {
                                                  L10: {
                                                    if (stackIn_16_0 == 0) {
                                                      break L10;
                                                    } else {
                                                      if (var15 == 0) {
                                                        break L9;
                                                      } else {
                                                        break L10;
                                                      }
                                                    }
                                                  }
                                                  L11: {
                                                    var14 = new fd(param2, param0, var12);
                                                    if (null == bk.field_e) {
                                                      bk.field_e = new at();
                                                      break L11;
                                                    } else {
                                                      break L11;
                                                    }
                                                  }
                                                  bk.field_e.a((byte) -119, (tc) (var14));
                                                  break L9;
                                                }
                                                var11++;
                                                continue L8;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var7++;
                                    continue L5;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var5++;
                        continue L1;
                      }
                    }
                  }
                  field_D = (String) ((Object) stackIn_28_0);
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var4);
            stackOut_30_1 = new StringBuilder().append("nl.KA(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L12;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L12;
            }
          }
          L13: {
            stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L13;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L13;
            }
          }
          L14: {
            stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param2 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L14;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L14;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, kb param1) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
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
              if (param0 == 11) {
                break L1;
              } else {
                field_C = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_E) {
                  break L3;
                } else {
                  if (!this.field_E.a(param0 + 0, param1)) {
                    break L3;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
              }
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("nl.M(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    private final boolean a(kb param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (param1 == 107) {
              L1: {
                L2: {
                  if (null == this.field_E) {
                    break L2;
                  } else {
                    if (this.field_E.a(false)) {
                      break L2;
                    } else {
                      if (!this.field_E.a(11, param0)) {
                        break L2;
                      } else {
                        stackOut_6_0 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        break L1;
                      }
                    }
                  }
                }
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("nl.GA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    static {
        field_G = "Battle";
        field_D = "Fire";
        field_F = "Hotseat Game";
        field_C = "Location";
    }
}
