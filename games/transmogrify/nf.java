/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nf {
    private ad field_f;
    String field_d;
    String field_h;
    static String field_q;
    mi field_c;
    boolean field_g;
    int[] field_p;
    static java.awt.Frame field_e;
    ti field_a;
    static tf field_m;
    static String field_i;
    String field_j;
    String field_n;
    int field_o;
    static hj field_l;
    String field_b;
    static int field_k;

    final char a(int param0, char param1) {
        if (param0 != 0) {
            this.a(89, '');
            return Character.toUpperCase(param1);
        }
        return Character.toUpperCase(param1);
    }

    public static void a(byte param0) {
        field_e = null;
        field_i = null;
        field_q = null;
        field_l = null;
        field_m = null;
        if (param0 == -41) {
            return;
        }
        nf.a((byte) -93);
    }

    final boolean a(int param0, sj[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param0 == -1) {
                break L1;
              } else {
                field_l = (hj) null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (param1.length <= var3_int) {
                  break L3;
                } else {
                  if (null == param1[var3_int]) {
                    break L3;
                  } else {
                    var3_int++;
                    if (var6 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var4 = new char[var3_int];
              var5 = 0;
              L4: while (true) {
                L5: {
                  if (var3_int <= var5) {
                    break L5;
                  } else {
                    var4[var5] = param1[var5].field_i;
                    var5++;
                    if (var6 == 0) {
                      continue L4;
                    } else {
                      break L5;
                    }
                  }
                }
                stackIn_11_0 = this.field_f.a((byte) 109, var4);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("nf.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        return stackIn_11_0;
    }

    final void a(byte param0, char[] param1) {
        int dupTemp$1 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 92) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_f = (ad) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.field_f.a(param1, o.field_o, false, 3670);
                        var3_int = 0;
                        var4 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = 256;
                        stackIn_5_1 = var4;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 <= stackIn_5_1) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ic.field_c[var4] = 0;
                        var4++;
                        if (var6 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4 >= param1.length) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5 = param1[var4] & 255;
                        stackIn_5_0 = -1;
                        stackIn_12_0 = stackIn_5_0;
                        stackIn_5_1 = this.field_d.indexOf(var5);
                        stackIn_12_1 = stackIn_5_1;
                        if (var6 != 0) {
                            statePc = 5;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 >= stackIn_12_1) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3_int = 1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        dupTemp$1 = ic.field_c[var5] + 1;
                        ic.field_c[var5] = dupTemp$1;
                        if ((dupTemp$1 ^ -1) == -5) {
                            statePc = 3;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var3_int != 0) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return;
                }
                case 20: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_22_0 = (RuntimeException) (var3);
                    stackIn_21_0 = stackIn_22_0;
                    stackIn_22_1 = new StringBuilder().append("nf.A(").append(param0).append(',');
                    stackIn_21_1 = stackIn_22_1;
                    if (param1 == null) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_21_1);
                    stackIn_23_2 = "{...}";
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_23_2 = "null";
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    throw ch.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    nf(ci param0, ci param1, ad param2) {
        boolean stackIn_4_0 = false;
        int stackIn_46_0 = 0;
        Object stackIn_52_0 = null;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        mi stackIn_61_1 = null;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        boolean stackOut_3_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        Object var5 = null;
        Object var6 = null;
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        Object var10 = null;
        Object var11 = null;
        int var12_int = 0;
        NumberFormatException var12 = null;
        String var13 = null;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        NumberFormatException var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        char[] var24 = null;
        Object var25 = null;
        Object var26 = null;
        int var27 = 0;
        int var28 = 0;
        CharSequence var29 = null;
        CharSequence var30 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var21 = Transmogrify.field_A ? 1 : 0;
                    var25 = null;
                    var26 = null;
                    this.field_p = new int[512];
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_f = param2;
                        this.field_o = param2.field_d;
                        var4_int = 0;
                        var5 = null;
                        var6 = null;
                        var7 = null;
                        var8 = null;
                        var9 = null;
                        var10 = null;
                        var11 = null;
                        var12_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param2.field_c.length <= var12_int) {
                            statePc = 51;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var13 = param2.field_c[var12_int][0];
                        var14 = param2.field_c[var12_int][1];
                        stackOut_3_0 = var13.startsWith("val");
                        stackIn_63_0 = stackOut_3_0 ? 1 : 0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var21 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (!stackIn_4_0) {
                            statePc = 29;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var16 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var29 = (CharSequence) ((Object) var13.substring(3));
                        var15 = aa.a(-104, var29);
                        if (-1 <= (var15 ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = ((Object) stateCaught_6 instanceof NumberFormatException ? 24 : 67);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var24 = var14.toCharArray();
                        var18 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = ((Object) stateCaught_7 instanceof NumberFormatException ? 24 : 67);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var24.length <= var18) {
                            statePc = 21;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = ((Object) stateCaught_8 instanceof NumberFormatException ? 24 : 67);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var19 = var24[var18];
                        var28 = va.field_j;
                        var27 = 2;
                        if (var21 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = ((Object) stateCaught_9 instanceof NumberFormatException ? 24 : 67);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var27 > var28) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = ((Object) stateCaught_10 instanceof NumberFormatException ? 24 : 67);
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = ((Object) stateCaught_11 instanceof NumberFormatException ? 24 : 67);
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var27 > var28) {
                            statePc = 28;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = ((Object) stateCaught_12 instanceof NumberFormatException ? 24 : 67);
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = ((Object) stateCaught_13 instanceof NumberFormatException ? 24 : 67);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (0 == this.field_p[var19]) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = ((Object) stateCaught_14 instanceof NumberFormatException ? 24 : 67);
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        System.out.println("Multiple letter values found for" + (char) var19);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = ((Object) stateCaught_15 instanceof NumberFormatException ? 24 : 67);
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.field_p[var19] = var15;
                        var20 = this.a(0, (char) var19);
                        if (-3 < (va.field_j ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = ((Object) stateCaught_16 instanceof NumberFormatException ? 24 : 67);
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var20 == var19) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = ((Object) stateCaught_17 instanceof NumberFormatException ? 24 : 67);
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (this.field_p[var20] == 0) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = ((Object) stateCaught_18 instanceof NumberFormatException ? 24 : 67);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        System.out.println("Multiple letter values found for " + (char) var20);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = ((Object) stateCaught_19 instanceof NumberFormatException ? 24 : 67);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        this.field_p[var20] = var15;
                        var18++;
                        if (var21 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = ((Object) stateCaught_20 instanceof NumberFormatException ? 24 : 67);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var21 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = ((Object) stateCaught_21 instanceof NumberFormatException ? 24 : 67);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var16 = 1;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = ((Object) stateCaught_22 instanceof NumberFormatException ? 24 : 67);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var17 = (NumberFormatException) ((Object) caughtException);
                        var16 = 1;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((va.field_j ^ -1) > -3) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var16 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        System.out.println("Unrecognised config option: " + var13);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var21 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (!"lang".equals(var13)) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var5 = var14;
                        if (var21 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ("font".equals(var13)) {
                            statePc = 49;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if ("fhei".equals(var13)) {
                            statePc = 48;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (!"vowels".equals(var13)) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var8 = var14;
                        if (var21 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (!"tut1".equals(var13)) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9 = var14.toUpperCase();
                        if (var21 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ("tut2".equals(var13)) {
                            statePc = 47;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (!"hint1".equals(var13)) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var11 = var14;
                        if (var21 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ("disabled".equals(var13)) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (-3 < (va.field_j ^ -1)) {
                            statePc = 50;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        System.out.println("Unrecognised config option: " + var13);
                        if (var21 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (!var14.equals("true")) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_46_0 = 1;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_46_0 = 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var4_int = stackIn_46_0;
                        if (var21 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var10 = var14.toUpperCase();
                        if (var21 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var7 = var14;
                        if (var21 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var6 = var14;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var12_int++;
                        if (var21 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackIn_53_0 = this;
                        stackIn_52_0 = stackIn_53_0;
                        if (var4_int == 0) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_54_0 = this;
                        stackIn_54_1 = 1;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackIn_54_0 = this;
                        stackIn_54_1 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        ((nf) (this)).field_g = stackIn_54_1 != 0;
                        if (var8 != null) {
                            statePc = 57;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        this.field_d = "AEIOU";
                        if (2 > va.field_j) {
                            statePc = 58;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        System.out.println("Forced to use default vowels for " + (String) (var5));
                        if (var21 == 0) {
                            statePc = 58;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        this.field_d = ((String) (var8)).toUpperCase();
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        this.field_n = (String) (var10);
                        this.field_b = (String) (var9);
                        this.field_h = (String) (var11);
                        this.field_j = (String) (var5);
                        var30 = (CharSequence) ((Object) ("flag_" + (String) (var5)));
                        this.field_a = pc.a("", dj.a(var30, (byte) -123), param0, -124);
                        stackIn_60_0 = this;
                        stackIn_59_0 = stackIn_60_0;
                        if (var6 != null) {
                            statePc = 60;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        stackIn_61_0 = this;
                        stackIn_61_1 = wf.field_d;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        stackIn_61_0 = this;
                        stackIn_61_1 = am.a(dj.a((CharSequence) (var6), (byte) -121), param0, (byte) 72, param1, "");
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        ((nf) (this)).field_c = stackIn_61_1;
                        if (var7 == null) {
                            statePc = 77;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackIn_63_0 = aa.a(89, (CharSequence) (var7));
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = ((Object) stateCaught_62 instanceof NumberFormatException ? 65 : 67);
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = ((Object) stateCaught_63 instanceof NumberFormatException ? 65 : 67);
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var12 = (NumberFormatException) ((Object) caughtException);
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 67: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_69_0 = (RuntimeException) (var4);
                    stackIn_68_0 = stackIn_69_0;
                    stackIn_69_1 = new StringBuilder().append("nf.<init>(");
                    stackIn_68_1 = stackIn_69_1;
                    if (param0 == null) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    stackIn_70_0 = (RuntimeException) ((Object) stackIn_68_0);
                    stackIn_70_1 = (StringBuilder) ((Object) stackIn_68_1);
                    stackIn_70_2 = "{...}";
                    statePc = 70;
                    continue stateLoop;
                }
                case 69: {
                    stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
                    stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
                    stackIn_70_2 = "null";
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    stackIn_72_0 = (RuntimeException) ((Object) stackIn_70_0);
                    stackIn_71_0 = stackIn_72_0;
                    stackIn_72_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',');
                    stackIn_71_1 = stackIn_72_1;
                    if (param1 == null) {
                        statePc = 72;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    stackIn_73_0 = (RuntimeException) ((Object) stackIn_71_0);
                    stackIn_73_1 = (StringBuilder) ((Object) stackIn_71_1);
                    stackIn_73_2 = "{...}";
                    statePc = 73;
                    continue stateLoop;
                }
                case 72: {
                    stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
                    stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
                    stackIn_73_2 = "null";
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_73_0);
                    stackIn_74_0 = stackIn_75_0;
                    stackIn_75_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',');
                    stackIn_74_1 = stackIn_75_1;
                    if (param2 == null) {
                        statePc = 75;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    stackIn_76_0 = (RuntimeException) ((Object) stackIn_74_0);
                    stackIn_76_1 = (StringBuilder) ((Object) stackIn_74_1);
                    stackIn_76_2 = "{...}";
                    statePc = 76;
                    continue stateLoop;
                }
                case 75: {
                    stackIn_76_0 = (RuntimeException) ((Object) stackIn_75_0);
                    stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
                    stackIn_76_2 = "null";
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    throw ch.a((Throwable) ((Object) stackIn_76_0), stackIn_76_2 + ')');
                }
                case 77: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_q = "Player";
        field_m = new tf(0, 2, 2, 1);
        field_k = -1;
    }
}
