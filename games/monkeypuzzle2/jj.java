/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jj extends t {
    static int field_F;
    static byte[][] field_E;
    private bl field_C;
    private String[] field_D;
    static String field_B;
    private pj field_G;

    void a(we param0, int param1, int param2, byte param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, (byte) -28);
              this.field_C = null;
              if (param3 < -13) {
                break L1;
              } else {
                this.field_D = (String[]) null;
                break L1;
              }
            }
            L2: {
              if (this.field_g) {
                var5_int = ei.field_a + (-param2 - this.field_r);
                var6 = -this.field_e + -param1 + p.field_a;
                this.field_C = this.b(var6, var5_int, 2);
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
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("jj.E(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static cj a(String[] args, boolean param1) {
        cj var2 = null;
        RuntimeException var2_ref = null;
        cj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = new cj(false);
              if (param1) {
                break L1;
              } else {
                jj.d((byte) -44);
                break L1;
              }
            }
            var2.field_g = args;
            stackIn_3_0 = (cj) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("jj.B(");

            if (args == null) {
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
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void c(int param0, int param1, int param2, int param3) {
        if (param3 != -1) {
            this.a(-61, 36, 65, -22);
        }
        this.a(((ui) ((Object) this.field_h)).a((we) (this), false), 13361, param0, param2, param1);
    }

    boolean a(we param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              field_F = -112;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("jj.AA(");

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
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 13361) {
            jj.c((byte) -53);
        }
        super.a(param0, param1 + 0, param2, param3, param4);
        this.a(true);
    }

    final void a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int statePc = 0;
        int var2 = 0;
        ui var3 = null;
        aa var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        be var12 = null;
        int var13 = 0;
        int var14 = 0;
        bl var15 = null;
        int var16 = 0;
        String var17 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = MonkeyPuzzle2.field_F ? 1 : 0;
                    this.field_G = new pj();
                    var2 = 0;
                    if (param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var17 = (String) null;
                    this.a(true, 111, (String) null);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var3 = (ui) ((Object) this.field_h);
                    var4 = var3.a(-1, (we) (this));
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    var5 = this.field_s.indexOf("<hotspot=", var2);
                    stackIn_4_0 = 0;
                    stackIn_4_1 = var5 ^ -1;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (stackIn_4_0 == stackIn_4_1) {
                        statePc = 23;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var7 = this.field_s.indexOf(">", var5);
                    var6 = this.field_s.substring(var5 + 9, var7);
                    var7 = Integer.parseInt(var6);
                    var2 = this.field_s.indexOf("</hotspot>", var5);
                    var8 = var4.b(var5, -51);
                    var9 = var4.b(var2, -21);
                    var10 = null;
                    if (var16 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var11 = var8;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (var11 > var9) {
                        statePc = 21;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var12 = var4.field_c[var11];
                    stackIn_4_0 = var8;
                    stackIn_9_0 = stackIn_4_0;
                    stackIn_4_1 = var11;
                    stackIn_9_1 = stackIn_4_1;
                    if (var16 != 0) {
                        statePc = 4;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (stackIn_9_0 == stackIn_9_1) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = var12.field_c[0];
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = var4.a(-75, var5);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    var13 = stackIn_12_0;
                    if (var11 == var9) {
                        statePc = 16;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var12 == null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_17_0 = var12.field_c[-1 + var12.field_c.length];
                    statePc = 17;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_17_0 = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = var4.a(116, var2);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var14 = stackIn_17_0;
                    var15 = new bl(var7, var13, var12.field_a, -var13 + var14, Math.max(var3.a(2), var12.field_f - var12.field_a));
                    if (var10 != null) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    ((bl) (var10)).field_e = var15;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    var10 = var15;
                    this.field_G.a(-8212, var15);
                    var11++;
                    if (var16 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (var16 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void d(byte param0) {
        field_E = (byte[][]) null;
        field_B = null;
        if (param0 != 117) {
            jj.b(true);
        }
    }

    final static boolean a(int param0, ki param1, int param2, int param3) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_139_0 = 0;
        RuntimeException stackIn_141_0 = null;
        StringBuilder stackIn_141_1 = null;
        RuntimeException stackIn_142_0 = null;
        StringBuilder stackIn_142_1 = null;
        RuntimeException stackIn_143_0 = null;
        StringBuilder stackIn_143_1 = null;
        String stackIn_143_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        ki var32_ref_ki = null;
        int var32 = 0;
        int var33 = 0;
        int[] var40 = null;
        int[] var41 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var33 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        param3 = param3 - (-param1.field_I.field_n + nd.field_b.field_n) / 2;
                        param2 = param2 - (-param1.field_I.field_m + nd.field_b.field_m) / 2;
                        param2 = param2 + nd.field_b.field_r;
                        param3 = param3 + nd.field_b.field_q;
                        var4_int = sb.field_m.field_r - param2;
                        var5 = sb.field_m.field_q - param3;
                        var6 = nd.field_b.field_k;
                        if (var4_int < var6) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_4_0 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = sb.field_m.field_k;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var7 = stackIn_4_0;
                        var8 = nd.field_b.field_j;
                        if ((var5 ^ -1) > (var8 ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_7_0 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = sb.field_m.field_j;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var9 = stackIn_7_0;
                        if (var4_int > 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_10_0 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_10_0 = var4_int;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var10 = stackIn_10_0;
                        if (0 < var5) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_13_0 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = var5;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var11 = stackIn_13_0;
                        var12 = var7 + var4_int;
                        if (var12 <= var6) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var12 = var6;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var13 = var5 - -var9;
                        var12 = var12 - var10;
                        if (var8 >= var13) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var13 = var8;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var13 = var13 - var11;
                        var14 = var10 + var11 * var6;
                        if (param0 == -32680) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        field_E = (byte[][]) null;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var15 = -var12 + var6;
                        var16 = var10 + (-var4_int + (-var5 + var11) * var7);
                        var17 = var7 - var12;
                        var40 = nd.field_b.field_s;
                        var41 = sb.field_m.field_s;
                        var20 = 0;
                        var21 = 0;
                        var22 = 0;
                        var23 = 0;
                        var24 = -1;
                        var25 = -1;
                        var26 = -1;
                        var27 = -1;
                        var28 = 0;
                        var29 = var13;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var29 <= 0) {
                            statePc = 46;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_47_0 = var12;
                        stackIn_22_0 = stackIn_47_0;
                        if (var33 != 0) {
                            statePc = 47;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var30 = stackIn_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var30 <= 0) {
                            statePc = 44;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_45_0 = 0;
                        stackIn_25_0 = stackIn_45_0;
                        stackIn_45_1 = var40[var14];
                        stackIn_25_1 = stackIn_45_1;
                        if (var33 != 0) {
                            statePc = 45;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 != stackIn_25_1) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (0 != var41[var16]) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var31 = var41[var16];
                        if (var31 >= 16777212) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var32_ref_ki = e.field_a[-1 + var31];
                        stackIn_32_0 = var28;
                        stackIn_31_0 = stackIn_32_0;
                        if ((var32_ref_ki.field_w ^ -1) != -4) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_33_0 = stackIn_31_0;
                        stackIn_33_1 = 1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = stackIn_32_0;
                        stackIn_33_1 = 0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var28 = stackIn_33_0 | stackIn_33_1;
                        jc.a(var32_ref_ki, (byte) -124, param1);
                        if (var33 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((var31 ^ -1) == -16777214) {
                            statePc = 42;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (16777212 == var31) {
                            statePc = 41;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (-16777216 != (var31 ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var20++;
                        var24 = var16;
                        if (var33 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (16777214 == var31) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var21++;
                        var27 = var16;
                        if (var33 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var23++;
                        var26 = var16;
                        if (var33 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var25 = var16;
                        var22++;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var14++;
                        var16++;
                        var30--;
                        if (var33 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var16 = var16 + var17;
                        stackIn_45_0 = var14;
                        stackIn_45_1 = var15;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var14 = stackIn_45_0 + stackIn_45_1;
                        var29--;
                        if (var33 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_47_0 = var22;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (stackIn_47_0 > 10) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var23 <= 10) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_52_0 = 1;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackIn_52_0 = 0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var29 = stackIn_52_0;
                        if (var20 > 5) {
                            statePc = 55;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (-6 <= (var21 ^ -1)) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackIn_57_0 = 1;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackIn_57_0 = 0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var30 = stackIn_57_0;
                        if (var29 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var30 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        return false;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var29 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var30 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if ((var20 - -var21 ^ -1) >= (var22 - -var23 ^ -1)) {
                            statePc = 65;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackIn_66_0 = 1;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackIn_66_0 = 0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var30 = stackIn_66_0;
                        if (var30 != 0) {
                            statePc = 68;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackIn_69_0 = 1;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackIn_69_0 = 0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var29 = stackIn_69_0;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var30 != 0) {
                            statePc = 72;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (var20 >= var21) {
                            statePc = 75;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (0.0f >= param1.field_D) {
                            statePc = 92;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (0.0f > param1.field_D) {
                            statePc = 105;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var20 > var21) {
                            statePc = 78;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var31 = var24 / sb.field_m.field_k;
                        var32 = var24 + -(var31 * sb.field_m.field_k);
                        if (nh.a(1 + var32, var31, (int)param1.field_q, (int)(param1.field_q + param1.field_D), -5425, var32, (int)(param1.field_v + param1.field_B), (int)param1.field_B, var31)) {
                            statePc = 80;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (100.0f > ((float)(-ok.field_b) + param1.field_q) * (param1.field_q - (float)ok.field_b)) {
                            statePc = 82;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        param1.field_q = (float)(ok.field_b + param1.field_y);
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (var29 != 0) {
                            statePc = 87;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (((float)(-ll.field_a) + param1.field_B) * ((float)(-ll.field_a) + param1.field_B) < 100.0f) {
                            statePc = 86;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        param1.field_B = (float)ll.field_a;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (param1.field_m != 0) {
                            statePc = 90;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        param1.field_D = -param1.field_D;
                        if (var33 == 0) {
                            statePc = 91;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        param1.field_q = param1.field_q - 1.0f;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (var33 == 0) {
                            statePc = 105;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var31 = var27 / sb.field_m.field_k;
                        var32 = var27 - sb.field_m.field_k * var31;
                        if (nh.a(var32 - -1, var31, (int)param1.field_q, (int)(param1.field_D + param1.field_q), -5425, var32, (int)(param1.field_v + param1.field_B), (int)param1.field_B, var31)) {
                            statePc = 94;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if ((param1.field_q - (float)ok.field_b) * (param1.field_q - (float)ok.field_b) < 100.0f) {
                            statePc = 96;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        param1.field_q = (float)(ok.field_b - param1.field_y);
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (var29 != 0) {
                            statePc = 101;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (100.0f > ((float)(-ll.field_a) + param1.field_B) * ((float)(-ll.field_a) + param1.field_B)) {
                            statePc = 100;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        param1.field_B = (float)ll.field_a;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (-1 == (param1.field_m ^ -1)) {
                            statePc = 104;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        param1.field_q = param1.field_q + 1.0f;
                        if (var33 == 0) {
                            statePc = 105;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        param1.field_D = -param1.field_D;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (var29 != 0) {
                            statePc = 107;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if ((var22 ^ -1) <= (var23 ^ -1)) {
                            statePc = 122;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (param1.field_v > 0.0f) {
                            statePc = 122;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var31 = var26 / sb.field_m.field_k;
                        var32 = -(var31 * sb.field_m.field_k) + var26 + 80;
                        if (nh.a(var32, var31, (int)param1.field_q, (int)(param1.field_D + param1.field_q), param0 + 27255, var32, (int)(param1.field_B + param1.field_v), (int)param1.field_B, var31 - 1)) {
                            statePc = 111;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (var30 != 0) {
                            statePc = 114;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (100.0f <= (param1.field_q - (float)ok.field_b) * (param1.field_q - (float)ok.field_b)) {
                            statePc = 114;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        param1.field_q = (float)ok.field_b;
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (100.0f > ((float)(-ll.field_a) + param1.field_B) * ((float)(-ll.field_a) + param1.field_B)) {
                            statePc = 116;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        param1.field_B = (float)(ll.field_a + -param1.field_G);
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (param1.field_m == 0) {
                            statePc = 120;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        param1.field_B = param1.field_B + 1.0f;
                        if (var33 == 0) {
                            statePc = 121;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        param1.field_v = -param1.field_v;
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if (var33 == 0) {
                            statePc = 136;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if ((var23 ^ -1) <= (var22 ^ -1)) {
                            statePc = 136;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (param1.field_v >= 0.0f) {
                            statePc = 125;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        var31 = var25 / sb.field_m.field_k;
                        var32 = 80 + var25 + -(var31 * sb.field_m.field_k);
                        if (!nh.a(var32, var31, (int)param1.field_q, (int)(param1.field_D + param1.field_q), -5425, var32, (int)(param1.field_B + param1.field_v), (int)param1.field_B, var31 + -1)) {
                            statePc = 132;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (100.0f > ((float)(-ll.field_a) + param1.field_B) * (param1.field_B - (float)ll.field_a)) {
                            statePc = 128;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        param1.field_B = (float)(ll.field_a - -param1.field_G);
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        if (var30 != 0) {
                            statePc = 132;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (100.0f <= (param1.field_q - (float)ok.field_b) * (param1.field_q - (float)ok.field_b)) {
                            statePc = 132;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        param1.field_q = (float)ok.field_b;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (-1 != (param1.field_m ^ -1)) {
                            statePc = 135;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        param1.field_v = -param1.field_v;
                        if (var33 == 0) {
                            statePc = 136;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        param1.field_B = param1.field_B - 1.0f;
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if (var28 != 0) {
                            statePc = 138;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        stackIn_139_0 = 1;
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        stackIn_139_0 = 0;
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 139: {
                    return stackIn_139_0 != 0;
                }
                case 140: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_142_0 = (RuntimeException) (var4);
                    stackIn_141_0 = stackIn_142_0;
                    stackIn_142_1 = new StringBuilder().append("jj.S(").append(param0).append(',');
                    stackIn_141_1 = stackIn_142_1;
                    if (param1 == null) {
                        statePc = 142;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    stackIn_143_0 = (RuntimeException) ((Object) stackIn_141_0);
                    stackIn_143_1 = (StringBuilder) ((Object) stackIn_141_1);
                    stackIn_143_2 = "{...}";
                    statePc = 143;
                    continue stateLoop;
                }
                case 142: {
                    stackIn_143_0 = (RuntimeException) ((Object) stackIn_142_0);
                    stackIn_143_1 = (StringBuilder) ((Object) stackIn_142_1);
                    stackIn_143_2 = "null";
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    throw la.a((Throwable) ((Object) stackIn_143_0), stackIn_143_2 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void c(byte param0) {
        int statePc = 0;
        Throwable caughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        ki var2_ref_ki = null;
        int var2 = 0;
        int var3 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        bd.field_b.a(-8212, new ki(1, 0, 0));
                        bd.field_b.a(-8212, new ki(1, 0, 0));
                        bd.field_b.a(-8212, new ki(1, 1, 0));
                        bd.field_b.a(-8212, new ki(1, 1, 0));
                        bd.field_b.a(-8212, new ki(1, 2, 0));
                        bd.field_b.a(-8212, new ki(1, 2, 0));
                        bd.field_b.a(-8212, new ki(1, 3, 0));
                        bd.field_b.a(-8212, new ki(1, 3, 0));
                        bd.field_b.a(-8212, new ki(1, 4, 0));
                        bd.field_b.a(-8212, new ki(1, 4, 0));
                        bd.field_b.a(-8212, new ki(1, 0, 0));
                        bd.field_b.a(-8212, new ki(1, 0, 0));
                        var1_int = 0;
                        var2_ref_ki = (ki) ((Object) bd.field_b.a((byte) -117));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2_ref_ki == null) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2_ref_ki.field_B = rl.field_c[var1_int][0];
                        var2_ref_ki.field_q = rl.field_c[var1_int][1];
                        var2_ref_ki = (ki) ((Object) bd.field_b.d((byte) 63));
                        if (var3 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var1_int = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((ii.field_E ^ -1) >= (var1_int ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ii.field_U[var1_int] = -1;
                        var1_int++;
                        if (var3 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var3 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        bl.a(50, uh.field_e);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var2 = 93 / ((-18 - param0) / 35);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw la.a((Throwable) ((Object) var1), "jj.D(" + param0 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean b(boolean param0) {
        ki var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_B = (String) null;
                break L1;
              }
            }
            var1 = (ki) ((Object) hd.field_u.a((byte) -117));
            L2: while (true) {
              L3: {
                L4: {
                  if (var1 == null) {
                    break L4;
                  } else {
                    stackOut_5_0 = var1.field_E;
                    stackIn_12_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var2 != 0) {
                      break L3;
                    } else {
                      if (!stackIn_6_0) {
                        stackIn_9_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var1 = (ki) ((Object) hd.field_u.d((byte) 63));
                        if (var2 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackIn_12_0 = 1;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1_ref), "jj.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (!(0 == param1)) {
            return;
        }
        ui var5 = (ui) ((Object) this.field_h);
        bl var6 = this.field_C;
        if (var6 == null) {
        } else {
            var7 = var5.a(param3, (byte) 113, (we) (this));
            var8 = var5.a((we) (this), -94, param2);
            do {
                hk.a(var6.field_l + var7 - 2, -2 + var8 + var6.field_n, 53, 2 + var6.field_i, var6.field_j + 2);
                var6 = var6.field_e;
            } while (var6 != null);
        }
    }

    private final bl b(int param0, int param1, int param2) {
        bl var4 = null;
        bl var5 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = MonkeyPuzzle2.field_F ? 1 : 0;
                    var4 = (bl) ((Object) this.field_G.a((byte) -117));
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var4 == null) {
                        statePc = 14;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (var6 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return null;
                }
                case 4: {
                    var5 = var4;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var5 == null) {
                        statePc = 13;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    stackIn_15_0 = var5.field_l;
                    stackIn_7_0 = stackIn_15_0;
                    stackIn_15_1 = param1;
                    stackIn_7_1 = stackIn_15_1;
                    if (var6 != 0) {
                        statePc = 15;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (stackIn_7_0 > stackIn_7_1) {
                        statePc = 12;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var5.field_n > param0) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var5.field_l + var5.field_i <= param1) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if ((param0 ^ -1) < (var5.field_n - -var5.field_j ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return var4;
                }
                case 12: {
                    var5 = var5.field_e;
                    if (var6 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var4 = (bl) ((Object) this.field_G.d((byte) 63));
                    if (var6 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = param2;
                    stackIn_15_1 = 2;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (stackIn_15_0 != stackIn_15_1) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    return null;
                }
                case 17: {
                    this.field_G = (pj) null;
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param0 >= -23) {
            this.a((byte) -81);
        }
        super.b(-102, param1, param2, param3);
        int var5 = -this.field_r + param1;
        int var6 = param2 - this.field_e;
        bl var7 = this.b(var6, var5, 2);
        if (var7 != null) {
            if (!(this.field_o == null)) {
                ((u) ((Object) this.field_o)).a(var7.field_h, -21099, (jj) (this), param3);
            }
        }
    }

    final void a(boolean param0, int param1, String param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null == this.field_D) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((this.field_D.length ^ -1) >= (param1 ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var7 = new String[param1 - -1];
                        var8 = var7;
                        var4 = var8;
                        if (this.field_D == null) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var5 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var5 >= this.field_D.length) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var7[var5] = this.field_D[var5];
                        var5++;
                        if (var6 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var6 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_D = var8;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!param0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return;
                }
                case 13: {
                    try {
                        this.field_D[param1] = param2;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (runtimeException);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("jj.J(").append(param0).append(',').append(param1).append(',');
                    stackIn_16_1 = stackIn_17_1;
                    if (param2 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
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
                    throw la.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    String a(byte param0) {
        if (param0 != 54) {
            return (String) null;
        }
        if (null == this.field_C) {
            return null;
        }
        if (null == this.field_D) {
            return null;
        }
        if (this.field_C.field_h >= this.field_D.length) {
            return null;
        }
        return this.field_D[this.field_C.field_h];
    }

    jj(String param0, ml param1) {
        super(param0, (of) null);
        this.field_C = null;
        try {
            this.field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "jj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_B = "Passwords must be between 5 and 20 letters and numbers";
    }
}
