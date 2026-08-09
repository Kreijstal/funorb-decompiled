/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends ki implements ka {
    static String[] field_M;
    private ge field_K;
    static String field_E;
    static o[] field_F;
    private pj[] field_J;
    static mf field_I;
    static int field_L;
    static int field_N;
    static mg field_G;
    static int field_H;
    private String[] field_D;

    final static int a(int param0, byte param1) {
        int var2;
        int var3;
        L0: {
          var3 = SolKnight.field_L ? 1 : 0;
          qf.field_a = null;
          ug.field_f = 0;
          if (param1 == -86) {
            break L0;
          } else {
            field_L = -67;
            break L0;
          }
        }
        L1: {
          L2: {
            ik.field_b = null;
            var2 = ue.field_a;
            ue.field_a = vc.field_e;
            if (param0 != 51) {
              break L2;
            } else {
              il.field_c.field_c = 2;
              if (var3 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (param0 == 50) {
              break L3;
            } else {
              il.field_c.field_c = 1;
              if (var3 == 0) {
                break L1;
              } else {
                break L3;
              }
            }
          }
          il.field_c.field_c = 5;
          break L1;
        }
        L4: {
          vc.field_e = var2;
          il.field_c.field_l = il.field_c.field_l + 1;
          if (2 > il.field_c.field_l) {
            break L4;
          } else {
            if ((param0 ^ -1) != -52) {
              break L4;
            } else {
              return 2;
            }
          }
        }
        L5: {
          if (-3 < (il.field_c.field_l ^ -1)) {
            break L5;
          } else {
            if (param0 == 50) {
              return 5;
            } else {
              break L5;
            }
          }
        }
        if ((il.field_c.field_l ^ -1) <= -5) {
          return 1;
        } else {
          return -1;
        }
    }

    final boolean a(char param0, byte param1, int param2, rc param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, (byte) -77, param2, param3)) {
              var5_int = -102 / ((param1 - 31) / 56);
              if (98 != param2) {
                if (99 != param2) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_8_0 = this.b(108, param3);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = this.a((byte) -112, param3);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("ua.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_10_0 != 0;
            }
          }
        }
    }

    public static void e(byte param0) {
        field_I = null;
        int var1 = -23 % ((param0 - 11) / 52);
        field_F = null;
        field_M = null;
        field_E = null;
        field_G = null;
    }

    final static void a(byte param0) {
        if (param0 > -92) {
            ua.a((byte) 57);
        }
        hc.a(lf.field_e, false, ug.field_d, true);
        ga.field_G = true;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (!(-1 == (param1 ^ -1))) {
            return;
        }
        mg var5 = field_G;
        if (this.field_D != null) {
            var5.a(nb.field_d, param2 + this.field_m, this.field_j + param0, this.field_t, 20, 16777215, -1, 0, 0, var5.field_s + var5.field_F);
        }
    }

    final static void a(int param0, byte[] param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_68_2 = 0;
        int stackIn_69_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        gb var16 = null;
        gb var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var16 = new gb(param1);
                        var17 = var16;
                        var17.field_m = -2 + param1.length;
                        nb.field_c = var17.i(39);
                        qf.field_d = new int[nb.field_c];
                        rg.field_e = new boolean[nb.field_c];
                        ph.field_h = new int[nb.field_c];
                        uj.field_b = new int[nb.field_c];
                        sa.field_l = new int[nb.field_c];
                        jc.field_c = new byte[nb.field_c][];
                        uf.field_s = new byte[nb.field_c][];
                        var17.field_m = -(nb.field_c * 8) + param1.length - 7;
                        kl.field_a = var17.i(param0 ^ -8);
                        we.field_e = var17.i(28);
                        var3 = 1 + (255 & var17.j(255));
                        var4 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (nb.field_c <= var4) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ph.field_h[var4] = var16.i(-116);
                        var4++;
                        if (var15 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var15 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var4 >= nb.field_c) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        qf.field_d[var4] = var16.i(-110);
                        var4++;
                        if (var15 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var15 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var4 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var4 >= nb.field_c) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        sa.field_l[var4] = var16.i(11);
                        var4++;
                        if (var15 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var15 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var4 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (nb.field_c <= var4) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        uj.field_b[var4] = var16.i(param0 + 40);
                        var4++;
                        if (var15 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var15 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var17.field_m = param1.length + (-7 + -(8 * nb.field_c) + 3 + -(3 * var3));
                        ig.field_H = new int[var3];
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var4 = 1;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var4 >= var3) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ig.field_H[var4] = var16.b(false);
                        stackIn_29_0 = ig.field_H[var4];
                        stackIn_25_0 = stackIn_29_0;
                        if (var15 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 != 0) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        ig.field_H[var4] = 1;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var4++;
                        if (var15 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var17.field_m = 0;
                        stackIn_29_0 = param0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var4 = stackIn_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = var4 ^ -1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_32_0 = stackIn_31_0;
                        stackIn_32_1 = nb.field_c ^ -1;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (stackIn_32_0 <= stackIn_32_1) {
                            statePc = 80;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var5 = sa.field_l[var4];
                        var6 = uj.field_b[var4];
                        var7 = var5 * var6;
                        var20 = new byte[var7];
                        var18 = var20;
                        var8 = var18;
                        jc.field_c[var4] = var20;
                        var21 = new byte[var7];
                        var19 = var21;
                        var9 = var19;
                        uf.field_s[var4] = var21;
                        var10 = 0;
                        var11 = var17.j(255);
                        if (var15 != 0) {
                            statePc = 81;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (0 != (var11 & 1)) {
                            statePc = 49;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var12 = 0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var12 >= var7) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var8[var12] = var16.a((byte) -14);
                        var12++;
                        if (var15 != 0) {
                            statePc = 74;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var15 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((2 & var11) == 0) {
                            statePc = 73;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var12 = 0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var7 <= var12) {
                            statePc = 48;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        dupTemp$0 = var16.a((byte) -14);
                        var9[var12] = dupTemp$0;
                        var13 = dupTemp$0;
                        stackIn_32_0 = var10;
                        stackIn_44_0 = stackIn_32_0;
                        stackIn_32_1 = var13 ^ -1;
                        stackIn_44_1 = stackIn_32_1;
                        if (var15 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_46_0 = stackIn_44_0;
                        stackIn_45_0 = stackIn_46_0;
                        if (stackIn_44_1 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_47_0 = stackIn_45_0;
                        stackIn_47_1 = 1;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_47_0 = stackIn_46_0;
                        stackIn_47_1 = 0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var10 = stackIn_47_0 | stackIn_47_1;
                        var12++;
                        if (var15 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var15 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var12 = 0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var5 <= var12) {
                            statePc = 59;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackIn_60_0 = 0;
                        stackIn_52_0 = stackIn_60_0;
                        if (var15 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var13 = stackIn_52_0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var6 <= var13) {
                            statePc = 57;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var8[var12 - -(var13 * var5)] = var16.a((byte) -14);
                        var13++;
                        if (var15 != 0) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var15 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var12++;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var15 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        stackIn_60_0 = var11 & 2;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (stackIn_60_0 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var12 = 0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackIn_63_0 = var12 ^ -1;
                        stackIn_63_1 = var5;
                        stackIn_63_2 = -1;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (stackIn_63_0 <= (stackIn_63_1 ^ stackIn_63_2)) {
                            statePc = 73;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackIn_31_0 = 0;
                        stackIn_65_0 = stackIn_31_0;
                        if (var15 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var13 = stackIn_65_0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var6 <= var13) {
                            statePc = 72;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        dupTemp$1 = var16.a((byte) -14);
                        var9[var12 - -(var13 * var5)] = dupTemp$1;
                        var14 = dupTemp$1;
                        stackIn_63_0 = var10;
                        stackIn_68_0 = stackIn_63_0;
                        stackIn_63_1 = 0;
                        stackIn_68_1 = stackIn_63_1;
                        stackIn_63_2 = var14 ^ -1;
                        stackIn_68_2 = stackIn_63_2;
                        if (var15 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackIn_70_0 = stackIn_68_0;
                        stackIn_69_0 = stackIn_70_0;
                        if (stackIn_68_1 == stackIn_68_2) {
                            statePc = 70;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        stackIn_71_0 = stackIn_69_0;
                        stackIn_71_1 = 1;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackIn_71_0 = stackIn_70_0;
                        stackIn_71_1 = 0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var10 = stackIn_71_0 | stackIn_71_1;
                        var13++;
                        if (var15 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var12++;
                        if (var15 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        rg.field_e[var4] = var10 != 0;
                        var4++;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (var15 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 76: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_78_0 = (RuntimeException) (var2);
                    stackIn_77_0 = stackIn_78_0;
                    stackIn_78_1 = new StringBuilder().append("ua.J(").append(param0).append(',');
                    stackIn_77_1 = stackIn_78_1;
                    if (param1 == null) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_77_0);
                    stackIn_79_1 = (StringBuilder) ((Object) stackIn_77_1);
                    stackIn_79_2 = "{...}";
                    statePc = 79;
                    continue stateLoop;
                }
                case 78: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
                    stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
                    stackIn_79_2 = "null";
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    throw fc.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ')');
                }
                case 80: {
                    return;
                }
                case 81: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static ol a(boolean param0, byte[] param1) {
        ol var2 = null;
        RuntimeException var2_ref = null;
        ol stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  field_H = -117;
                  break L1;
                }
              }
              var2 = new ol(param1, ph.field_h, qf.field_d, sa.field_l, uj.field_b, ig.field_H, jc.field_c);
              og.a((byte) -97);
              stackIn_6_0 = (ol) (var2);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("ua.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    public final void a(int param0, int param1, int param2, pj param3, boolean param4) {
        int var6_int = 0;
        int var7 = 0;
        pj stackIn_10_0 = null;
        pj stackIn_10_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param4) {
              var6_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var6_int >= this.field_D.length) {
                      break L3;
                    } else {
                      stackIn_10_0 = (pj) (param3);

                      stackIn_10_1 = this.field_J[var6_int];

                      if (var7 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_10_0 != stackIn_10_1) {
                            break L4;
                          } else {
                            this.field_K.a(param4, this.field_D[var6_int]);
                            break L4;
                          }
                        }
                        var6_int++;
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackIn_10_0 = (pj) (param3);
                  stackIn_10_1 = this.field_J[this.field_D.length];
                  break L2;
                }
                L5: {
                  if (stackIn_10_0 != stackIn_10_1) {
                    break L5;
                  } else {
                    this.field_K.a((byte) 22);
                    break L5;
                  }
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
          L6: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("ua.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static mb h(int param0) {
        if (param0 != 0) {
            field_F = (o[]) null;
        }
        return new mb(sg.b(-1), he.a(71));
    }

    ua(ge param0) {
        super(0, 0, 0, 0, (j) null);
        try {
            this.field_K = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ua.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, String[] param1) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        ri var4 = null;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_B.a(true);
                        if (param1 == null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param1.length != 0) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.field_D = null;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        var3_int = param1.length;
                        this.field_D = new String[var3_int];
                        var4_int = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var4_int >= var3_int) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_D[var4_int] = gh.a(-31433, (CharSequence) ((Object) param1[var4_int])).replace(' ', ' ');
                        var4_int++;
                        if (var6 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 = new ri(field_G, 0, 1);
                        this.field_J = new pj[var3_int + 1];
                        if (param0 == 20870) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        field_L = -28;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var3_int <= var5) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_J[var5] = new pj(this.field_D[var5], (dg) (this));
                        this.field_J[var5].field_w = (j) ((Object) var4);
                        this.field_J[var5].field_z = he.field_f;
                        this.field_J[var5].b(15, 80, 0, 0, 20 - -(16 * var5));
                        this.a(this.field_J[var5], 5411);
                        var5++;
                        if (var6 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var6 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.field_J[var3_int] = new pj(wc.field_d, (dg) (this));
                        this.field_J[var3_int].field_w = (j) ((Object) var4);
                        this.field_J[var3_int].b(15, 100, 0, 0, 20 - -((1 + var3_int) * 16));
                        this.a(this.field_J[var3_int], 5411);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_20_0 = (RuntimeException) (var3);
                    stackIn_19_0 = stackIn_20_0;
                    stackIn_20_1 = new StringBuilder().append("ua.H(").append(param0).append(',');
                    stackIn_19_1 = stackIn_20_1;
                    if (param1 == null) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_21_2 = "{...}";
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_21_2 = "null";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    throw fc.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_E = "Subscribing members have access to fullscreen mode.<br>TODO Game-specific benefits, screenshots, etc.";
        field_M = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_L = 0;
    }
}
