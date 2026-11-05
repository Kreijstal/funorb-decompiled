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
        if (param1) {
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
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param0 != 1) {
            field_C = (String) null;
          }
          if (0 < this.field_z) {
            this.field_z = this.field_z - 1;
            if (0 == this.field_z) {
              this.field_B = true;
            }
          }
          if (0 == this.field_z &&
            !this.field_B) {
            super.f(1, param1, param2, param3);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("cj.LA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        double var7_double;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var9Lifetime1;
        int var10Lifetime1;
        var11 = CrazyCrystals.field_B;
        if (!param0) {
          var7_double = -Math.cos((double)this.field_F * 0.09817477042468103) + 1.0;
          var9 = (int)Math.floor(0.5 + (double)param2 * var7_double / 12.0);
          param1 = param1 + var9;
          var10 = (int)Math.floor((double)param3 * var7_double / 12.0 + 0.5);
          param2 = param2 - var9;
          param4 = param4 + var10;
          param3 = param3 - var10;
        }
        if (0 < param2 &&
          0 < param3) {
          if (this.field_u) {
            var7 = param1 + param2 << 4;
            var8 = (param3 << 3) + (param4 << 4);
            var9Lifetime1 = 4096 * param2 / 24;
            var10Lifetime1 = (int)(Math.random() * 2048.0 - 1024.0);
            al.field_a.a(384, 576, var7, var8, var10Lifetime1, var9Lifetime1);
          } else {
            if (param2 == 24 &&
              param3 == 24) {
              al.field_a.a(param1, param4 - param3);
            } else {
              al.field_a.b(param1, -param3 + param4, param2 * 2, 3 * param3);
            }
          }
        }
        if (param5 != 4261) {
          return;
        }
        if (param0) {
          an.field_q.c(Integer.toString(this.field_D), param2 + param1, 6 + (param3 / 2 + param4), 16760896, -1);
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
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 2. */
                            {
                                to.field_c = to.field_c - 1;
                                var5_int = this.a(false);
                                mb.field_g = mb.field_g + 5;
                                fn.field_j = fn.field_j + 5;
                                var6 = 0;
                                statePc = 3;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_1) {
                        statePc = ((Object) stateCaught_1 instanceof RuntimeException ? 54 : -1);
                        if (statePc == -1) {
                            throw cj.<RuntimeException>$cfr$sneakyThrow(stateCaught_1);
                        }
                        caughtException = stateCaught_1;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var6 >= 3) {
                            statePc = 11;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 4. */
                            {
                                if ((1 << var6 & var5_int) != 0) {
                                    /* Inlined CFG state: 7. */
                                    {
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
                                    }
                                } else {
                                    /* Inlined CFG state: 5. */
                                    {
                                        statePc = 10;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_3) {
                        statePc = ((Object) stateCaught_3 instanceof RuntimeException ? 54 : -1);
                        if (statePc == -1) {
                            throw cj.<RuntimeException>$cfr$sneakyThrow(stateCaught_3);
                        }
                        caughtException = stateCaught_3;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        statePc = ((Object) stateCaught_8 instanceof RuntimeException ? 54 : -1);
                        if (statePc == -1) {
                            throw cj.<RuntimeException>$cfr$sneakyThrow(stateCaught_8);
                        }
                        caughtException = stateCaught_8;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        qg.field_q = qg.field_q | 1 << var6;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        statePc = ((Object) stateCaught_9 instanceof RuntimeException ? 54 : -1);
                        if (statePc == -1) {
                            throw cj.<RuntimeException>$cfr$sneakyThrow(stateCaught_9);
                        }
                        caughtException = stateCaught_9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6++;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        statePc = ((Object) stateCaught_10 instanceof RuntimeException ? 54 : -1);
                        if (statePc == -1) {
                            throw cj.<RuntimeException>$cfr$sneakyThrow(stateCaught_10);
                        }
                        caughtException = stateCaught_10;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_l.a((byte) 82, (f) (this));
                        if (~this.field_D == param3) {
                            /* Inlined CFG state: 13. */
                            {
                                dd.field_c.a(64, param1 * 12, param0 * 12, 0, (byte) -111);
                                stackIn_14_0 = new ig((f) (this), bd.field_n, this.field_l, false);
                                statePc = 14;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 12. */
                            {
                                /* Sequential CFG blocks: 12, 15. */
                                {
                                }
                                {
                                    var5 = this.field_l.a((f) (this), param0, param1, param2, ba.field_g, (byte) -87).a((f) (this), param0, param1, param2, jg.field_i, (byte) -87);
                                    var6 = 1;
                                    statePc = 16;
                                    continue stateLoop;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_11) {
                        statePc = ((Object) stateCaught_11 instanceof RuntimeException ? 54 : -1);
                        if (statePc == -1) {
                            throw cj.<RuntimeException>$cfr$sneakyThrow(stateCaught_11);
                        }
                        caughtException = stateCaught_11;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return (f) ((Object) stackIn_14_0);
                }
                case 16: {
                    try {
                        if (var6 > this.field_D) {
                            statePc = 25;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 17. */
                            {
                                var7 = param2[param0][param1 - var6].b((byte) 98) ? 1 : 0;
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
                                stackIn_20_7 = ~var6;
                                stackIn_18_7 = stackIn_20_7;
                                stackIn_20_8 = ~this.field_D;
                                stackIn_18_8 = stackIn_20_8;
                                if (true) {
                                    /* Inlined CFG state: 20. */
                                    {
                                        stackIn_22_0 = stackIn_20_0;
                                        stackIn_21_0 = stackIn_22_0;
                                        stackIn_22_1 = stackIn_20_1;
                                        stackIn_21_1 = stackIn_22_1;
                                        stackIn_22_2 = stackIn_20_2;
                                        stackIn_21_2 = stackIn_22_2;
                                        stackIn_22_3 = this;
                                        stackIn_21_3 = stackIn_22_3;
                                        stackIn_22_4 = stackIn_20_4;
                                        stackIn_21_4 = stackIn_22_4;
                                        stackIn_22_5 = stackIn_20_5;
                                        stackIn_21_5 = stackIn_22_5;
                                        stackIn_22_6 = stackIn_20_6;
                                        stackIn_21_6 = stackIn_22_6;
                                        if (stackIn_20_7 == stackIn_20_8) {
                                            /* Inlined CFG state: 22. */
                                            {
                                                stackIn_23_0 = stackIn_22_0;
                                                stackIn_23_1 = stackIn_22_1;
                                                stackIn_23_2 = stackIn_22_2;
                                                stackIn_23_3 = this;
                                                stackIn_23_4 = stackIn_22_4;
                                                stackIn_23_5 = stackIn_22_5;
                                                stackIn_23_6 = stackIn_22_6;
                                                stackIn_23_7 = hj.field_b;
                                                statePc = 23;
                                                continue stateLoop;
                                            }
                                        } else {
                                            /* Inlined CFG state: 21. */
                                            {
                                                stackIn_23_0 = stackIn_21_0;
                                                stackIn_23_1 = stackIn_21_1;
                                                stackIn_23_2 = stackIn_21_2;
                                                stackIn_23_3 = this;
                                                stackIn_23_4 = stackIn_21_4;
                                                stackIn_23_5 = stackIn_21_5;
                                                stackIn_23_6 = stackIn_21_6;
                                                stackIn_23_7 = ba.field_g;
                                                statePc = 23;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                } else {
                                    /* Inlined CFG state: 18. */
                                    {
                                        stackIn_48_0 = stackIn_18_0;
                                        stackIn_19_0 = stackIn_48_0;
                                        stackIn_48_1 = stackIn_18_1;
                                        stackIn_19_1 = stackIn_48_1;
                                        stackIn_48_2 = stackIn_18_2;
                                        stackIn_19_2 = stackIn_48_2;
                                        stackIn_48_3 = this;
                                        stackIn_19_3 = stackIn_48_3;
                                        stackIn_48_4 = stackIn_18_4;
                                        stackIn_19_4 = stackIn_48_4;
                                        stackIn_48_5 = stackIn_18_5;
                                        stackIn_19_5 = stackIn_48_5;
                                        stackIn_48_6 = stackIn_18_6;
                                        stackIn_19_6 = stackIn_48_6;
                                        if (stackIn_18_7 == stackIn_18_8) {
                                            statePc = 48;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 19. */
                                            {
                                                stackIn_47_0 = stackIn_19_0;
                                                stackIn_47_1 = stackIn_19_1;
                                                stackIn_47_2 = stackIn_19_2;
                                                stackIn_47_3 = this;
                                                stackIn_47_4 = stackIn_19_4;
                                                stackIn_47_5 = stackIn_19_5;
                                                stackIn_47_6 = stackIn_19_6;
                                                statePc = 47;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_16) {
                        statePc = ((Object) stateCaught_16 instanceof RuntimeException ? 54 : -1);
                        if (statePc == -1) {
                            throw cj.<RuntimeException>$cfr$sneakyThrow(stateCaught_16);
                        }
                        caughtException = stateCaught_16;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_23_0[stackIn_23_1] = ((f) (Object) stackIn_23_2).a((f) (this), stackIn_23_4, stackIn_23_5, stackIn_23_6, stackIn_23_7, (byte) -87);
                        if (var7 == 0) {
                            statePc = 25;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 24. */
                            {
                                var6++;
                                statePc = 16;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_23) {
                        statePc = ((Object) stateCaught_23 instanceof RuntimeException ? 54 : -1);
                        if (statePc == -1) {
                            throw cj.<RuntimeException>$cfr$sneakyThrow(stateCaught_23);
                        }
                        caughtException = stateCaught_23;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var6 = 1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        statePc = ((Object) stateCaught_25 instanceof RuntimeException ? 54 : -1);
                        if (statePc == -1) {
                            throw cj.<RuntimeException>$cfr$sneakyThrow(stateCaught_25);
                        }
                        caughtException = stateCaught_25;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var6 > this.field_D) {
                            statePc = 36;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 27. */
                            {
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
                                stackIn_30_5 = param1 + var6;
                                stackIn_28_5 = stackIn_30_5;
                                stackIn_30_6 = (f[][]) (param2);
                                stackIn_28_6 = stackIn_30_6;
                                stackIn_30_7 = var6;
                                stackIn_28_7 = stackIn_30_7;
                                stackIn_30_8 = this.field_D;
                                stackIn_28_8 = stackIn_30_8;
                                if (true) {
                                    /* Inlined CFG state: 30. */
                                    {
                                        stackIn_32_0 = stackIn_30_0;
                                        stackIn_31_0 = stackIn_32_0;
                                        stackIn_32_1 = stackIn_30_1;
                                        stackIn_31_1 = stackIn_32_1;
                                        stackIn_32_2 = stackIn_30_2;
                                        stackIn_31_2 = stackIn_32_2;
                                        stackIn_32_3 = this;
                                        stackIn_31_3 = stackIn_32_3;
                                        stackIn_32_4 = stackIn_30_4;
                                        stackIn_31_4 = stackIn_32_4;
                                        stackIn_32_5 = stackIn_30_5;
                                        stackIn_31_5 = stackIn_32_5;
                                        stackIn_32_6 = stackIn_30_6;
                                        stackIn_31_6 = stackIn_32_6;
                                        if (stackIn_30_7 == stackIn_30_8) {
                                            /* Inlined CFG state: 32. */
                                            {
                                                stackIn_33_0 = stackIn_32_0;
                                                stackIn_33_1 = stackIn_32_1;
                                                stackIn_33_2 = stackIn_32_2;
                                                stackIn_33_3 = this;
                                                stackIn_33_4 = stackIn_32_4;
                                                stackIn_33_5 = stackIn_32_5;
                                                stackIn_33_6 = stackIn_32_6;
                                                stackIn_33_7 = q.field_b;
                                                statePc = 33;
                                                continue stateLoop;
                                            }
                                        } else {
                                            /* Inlined CFG state: 31. */
                                            {
                                                stackIn_33_0 = stackIn_31_0;
                                                stackIn_33_1 = stackIn_31_1;
                                                stackIn_33_2 = stackIn_31_2;
                                                stackIn_33_3 = this;
                                                stackIn_33_4 = stackIn_31_4;
                                                stackIn_33_5 = stackIn_31_5;
                                                stackIn_33_6 = stackIn_31_6;
                                                stackIn_33_7 = ba.field_g;
                                                statePc = 33;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                } else {
                                    /* Inlined CFG state: 28. */
                                    {
                                        stackIn_48_0 = stackIn_28_0;
                                        stackIn_29_0 = stackIn_48_0;
                                        stackIn_48_1 = stackIn_28_1;
                                        stackIn_29_1 = stackIn_48_1;
                                        stackIn_48_2 = stackIn_28_2;
                                        stackIn_29_2 = stackIn_48_2;
                                        stackIn_48_3 = this;
                                        stackIn_29_3 = stackIn_48_3;
                                        stackIn_48_4 = stackIn_28_4;
                                        stackIn_29_4 = stackIn_48_4;
                                        stackIn_48_5 = stackIn_28_5;
                                        stackIn_29_5 = stackIn_48_5;
                                        stackIn_48_6 = stackIn_28_6;
                                        stackIn_29_6 = stackIn_48_6;
                                        if (stackIn_28_7 == stackIn_28_8) {
                                            statePc = 48;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 29. */
                                            {
                                                stackIn_47_0 = stackIn_29_0;
                                                stackIn_47_1 = stackIn_29_1;
                                                stackIn_47_2 = stackIn_29_2;
                                                stackIn_47_3 = this;
                                                stackIn_47_4 = stackIn_29_4;
                                                stackIn_47_5 = stackIn_29_5;
                                                stackIn_47_6 = stackIn_29_6;
                                                statePc = 47;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_26) {
                        statePc = ((Object) stateCaught_26 instanceof RuntimeException ? 54 : -1);
                        if (statePc == -1) {
                            throw cj.<RuntimeException>$cfr$sneakyThrow(stateCaught_26);
                        }
                        caughtException = stateCaught_26;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_33_0[stackIn_33_1] = ((f) (Object) stackIn_33_2).a((f) (this), stackIn_33_4, stackIn_33_5, stackIn_33_6, stackIn_33_7, (byte) -87);
                        if (var7 != 0) {
                            /* Inlined CFG state: 35. */
                            {
                                var6++;
                                statePc = 26;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 34. */
                            {
                                statePc = 36;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_33) {
                        statePc = ((Object) stateCaught_33 instanceof RuntimeException ? 54 : -1);
                        if (statePc == -1) {
                            throw cj.<RuntimeException>$cfr$sneakyThrow(stateCaught_33);
                        }
                        caughtException = stateCaught_33;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var6 = 1;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        statePc = ((Object) stateCaught_36 instanceof RuntimeException ? 54 : -1);
                        if (statePc == -1) {
                            throw cj.<RuntimeException>$cfr$sneakyThrow(stateCaught_36);
                        }
                        caughtException = stateCaught_36;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var6 > this.field_D) {
                            statePc = 44;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 38. */
                            {
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
                                    /* Inlined CFG state: 40. */
                                    {
                                        stackIn_41_0 = stackIn_40_0;
                                        stackIn_41_1 = stackIn_40_1;
                                        stackIn_41_2 = stackIn_40_2;
                                        stackIn_41_3 = this;
                                        stackIn_41_4 = stackIn_40_4;
                                        stackIn_41_5 = stackIn_40_5;
                                        stackIn_41_6 = stackIn_40_6;
                                        stackIn_41_7 = jg.field_i;
                                        statePc = 41;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 39. */
                                    {
                                        stackIn_41_0 = stackIn_39_0;
                                        stackIn_41_1 = stackIn_39_1;
                                        stackIn_41_2 = stackIn_39_2;
                                        stackIn_41_3 = this;
                                        stackIn_41_4 = stackIn_39_4;
                                        stackIn_41_5 = stackIn_39_5;
                                        stackIn_41_6 = stackIn_39_6;
                                        stackIn_41_7 = pl.field_B;
                                        statePc = 41;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_37) {
                        statePc = ((Object) stateCaught_37 instanceof RuntimeException ? 54 : -1);
                        if (statePc == -1) {
                            throw cj.<RuntimeException>$cfr$sneakyThrow(stateCaught_37);
                        }
                        caughtException = stateCaught_37;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_41_0[stackIn_41_1] = ((f) (Object) stackIn_41_2).a((f) (this), stackIn_41_4, stackIn_41_5, stackIn_41_6, stackIn_41_7, (byte) -87);
                        if (var7 != 0) {
                            /* Inlined CFG state: 43. */
                            {
                                var6++;
                                statePc = 37;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 42. */
                            {
                                statePc = 44;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_41) {
                        statePc = ((Object) stateCaught_41 instanceof RuntimeException ? 54 : -1);
                        if (statePc == -1) {
                            throw cj.<RuntimeException>$cfr$sneakyThrow(stateCaught_41);
                        }
                        caughtException = stateCaught_41;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var6 = 1;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        statePc = ((Object) stateCaught_44 instanceof RuntimeException ? 54 : -1);
                        if (statePc == -1) {
                            throw cj.<RuntimeException>$cfr$sneakyThrow(stateCaught_44);
                        }
                        caughtException = stateCaught_44;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var6 > this.field_D) {
                            statePc = 52;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 46. */
                            {
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
                            }
                        }
                    } catch (Throwable stateCaught_45) {
                        statePc = ((Object) stateCaught_45 instanceof RuntimeException ? 54 : -1);
                        if (statePc == -1) {
                            throw cj.<RuntimeException>$cfr$sneakyThrow(stateCaught_45);
                        }
                        caughtException = stateCaught_45;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_49_0 = stackIn_47_0;
                        stackIn_49_1 = stackIn_47_1;
                        stackIn_49_2 = stackIn_47_2;
                        stackIn_49_3 = this;
                        stackIn_49_4 = stackIn_47_4;
                        stackIn_49_5 = stackIn_47_5;
                        stackIn_49_6 = stackIn_47_6;
                        stackIn_49_7 = jg.field_i;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        statePc = ((Object) stateCaught_47 instanceof RuntimeException ? 54 : -1);
                        if (statePc == -1) {
                            throw cj.<RuntimeException>$cfr$sneakyThrow(stateCaught_47);
                        }
                        caughtException = stateCaught_47;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_49_0 = stackIn_48_0;
                        stackIn_49_1 = stackIn_48_1;
                        stackIn_49_2 = stackIn_48_2;
                        stackIn_49_3 = this;
                        stackIn_49_4 = stackIn_48_4;
                        stackIn_49_5 = stackIn_48_5;
                        stackIn_49_6 = stackIn_48_6;
                        stackIn_49_7 = cl.field_n;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        statePc = ((Object) stateCaught_48 instanceof RuntimeException ? 54 : -1);
                        if (statePc == -1) {
                            throw cj.<RuntimeException>$cfr$sneakyThrow(stateCaught_48);
                        }
                        caughtException = stateCaught_48;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_49_0[stackIn_49_1] = ((f) (Object) stackIn_49_2).a((f) (this), stackIn_49_4, stackIn_49_5, stackIn_49_6, stackIn_49_7, (byte) -87);
                        if (var7 != 0) {
                            /* Inlined CFG state: 51. */
                            {
                                var6++;
                                statePc = 45;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 50. */
                            {
                                statePc = 52;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_49) {
                        statePc = ((Object) stateCaught_49 instanceof RuntimeException ? 54 : -1);
                        if (statePc == -1) {
                            throw cj.<RuntimeException>$cfr$sneakyThrow(stateCaught_49);
                        }
                        caughtException = stateCaught_49;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_53_0 = (f) (var5);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        statePc = ((Object) stateCaught_52 instanceof RuntimeException ? 54 : -1);
                        if (statePc == -1) {
                            throw cj.<RuntimeException>$cfr$sneakyThrow(stateCaught_52);
                        }
                        caughtException = stateCaught_52;
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
                        /* Inlined CFG state: 56. */
                        {
                            stackIn_57_0 = stackIn_56_0;
                            stackIn_57_1 = stackIn_56_1;
                            stackIn_57_2 = "null";
                            statePc = 57;
                            continue stateLoop;
                        }
                    } else {
                        /* Inlined CFG state: 55. */
                        {
                            stackIn_57_0 = stackIn_55_0;
                            stackIn_57_1 = stackIn_55_1;
                            stackIn_57_2 = "{...}";
                            statePc = 57;
                            continue stateLoop;
                        }
                    }
                }
                case 57: {
                    throw dn.a((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_57_1).append(stackIn_57_2).append(',').append(param3).append(')').toString());
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
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = CrazyCrystals.field_B;
        try {
          if (param1 != 2048) {
            cj.f((byte) 73);
          }
          var4_int = param2.d((byte) -61, param0);
          if (var4_int == 0) {
            stackIn_5_0 = null;
            return (byte[]) (stackIn_5_0);
          }
          if (param3 == null ||
            param3.length != var4_int) {
            param3 = new byte[var4_int];
          }
          var5 = param2.d((byte) -58, 3);
          var6 = (byte)param2.d((byte) -104, 8);
          if (var5 <= 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param3[var7] = (byte)var6;
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param3[var7] = (byte)(param2.d((byte) -69, var5) + var6);
            }
          }
          stackIn_18_0 = (byte[]) (param3);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("cj.GC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    cj(f param0, int param1, int param2, int param3) {
        super(param0);
        this.field_B = false;
        this.field_z = 0;
        try {
          this.field_F = (3 * param2 + 5 * param3) % 64;
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
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 23525) {
            stackIn_4_0 = ng.a(kd.field_i, param1, new cj(new kp(-1), this.field_D, 0, 0), (byte) -83, bd.field_l);
            return stackIn_4_0;
          }
          stackIn_2_0 = (nj) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("cj.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean a(mj param0, boolean param1, f[][] param2) {
        RuntimeException var4 = null;
        boolean stackIn_3_1 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_1 = (param1);
          this.field_B = stackIn_3_1;
          this.a((byte) 95, param0.field_a);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("cj.PA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final f e(int param0, int param1, f[][] param2, int param3) {
        RuntimeException var5 = null;
        f stackIn_2_0 = null;
        f stackIn_5_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_B) {
            if (param3 > 120) {
              return (f) (this);
            }
            stackIn_5_0 = (f) null;
            return stackIn_5_0;
          }
          b.field_a = b.field_a - 3;
          we.field_h = we.field_h - 6;
          je.field_j = je.field_j - 3;
          fp.field_a = fp.field_a - 6;
          stackIn_2_0 = this.g(param0, param1, param2, -1);
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("cj.OA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(byte param0, f[][] param1, f param2) {
        RuntimeException var4 = null;
        fq var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 42) {
            var5 = (fq) null;
            this.a(96, -108, 70, (f[][]) null, -76, (fq) null, -124);
          }
          if (0 != this.field_z) {
            return true;
          }
          this.field_z = 2;
          this.a((byte) 63, param2);
          b.field_a = b.field_a - 4;
          we.field_h = we.field_h - 8;
          fp.field_a = fp.field_a - 8;
          je.field_j = je.field_j - 4;
          fn.field_j = fn.field_j - ob.field_l;
          wd.field_j = wd.field_j + 1;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("cj.FB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(int param0, f[][] param1, int param2, int param3) {
        try {
          this.field_F = (3 * param2 + 5 * param3) % 64;
          if (param0 != -35) {
            this.field_B = true;
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "cj.KC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean c(f[][] param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          fn.field_j = fn.field_j + ob.field_l;
          wd.field_j = wd.field_j - 1;
          we.field_h = we.field_h + 20;
          fp.field_a = fp.field_a + 20;
          je.field_j = je.field_j + 10;
          b.field_a = b.field_a + 10;
          if (param2 > 0) {
            field_x = (ko) null;
          }
          this.field_B = true;
          wd.field_j = wd.field_j + 1;
          mb.field_g = mb.field_g + ob.field_l;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("cj.KA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int[] d(int param0, int param1, int param2) {
        int var3 = rl.b(param1, (byte) -23);
        int var4 = tm.a(param1, 500);
        int var5 = rl.b(param2, (byte) -23);
        int var6 = tm.a(param2, 500);
        if (param0 > -64) {
          field_y = (String) null;
        }
        int var7 = (int)((long)var5 * (long)var3 >> 16);
        int var8 = (int)((long)var6 * (long)var3 >> 16);
        int var9 = (int)((long)var5 * (long)var4 >> 16);
        int var10 = (int)((long)var6 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final void c(int param0, int param1, f[][] param2, int param3) {
        if (param1 != 0) {
          return;
        }
        try {
          this.field_F = (this.field_F + 1) % 64;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "cj.W(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, f[][] param3, int param4, fq param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != ~this.field_z) {
            return false;
          }
          if (this.field_B) {
            return false;
          }
          stackIn_4_0 = super.a(param0, -1, param2, param3, param4, param5, param6);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("cj.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param6).append(')').toString());
        }
    }

    final f a(int param0, int param1, f[][] param2, f param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ob.field_l = ob.field_l + 1;
          var6_int = -110 / ((73 - param4) / 42);
          fn.field_j = fn.field_j - wd.field_j;
          this.field_B = true;
          this.a((byte) 123, param3);
          return (f) (this);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("cj.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_E = "To get a score or proceed beyond this level, complete the earlier ones first!";
        field_C = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_y = "Crystal";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
