/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    static String field_b;
    static int field_d;
    static qm field_e;
    static long field_g;
    static ud field_i;
    static String field_a;
    static String field_h;
    static int field_f;
    static int[] field_c;

    final static void a(byte param0) {
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        boolean stackIn_32_0 = false;
        int stackIn_37_0 = 0;
        boolean stackIn_40_0 = false;
        int stackIn_46_0 = 0;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_31_0;
        boolean stackOut_39_0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        cl var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        uf var13 = null;
        uf var14 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var13 = de.field_V;
                        var14 = var13;
                        var2 = var14.d((byte) -110);
                        var3 = (cl) ((Object) oe.field_I.c((byte) -54));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var3 == null) {
                            statePc = 8;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_11_0 = var2;
                        stackIn_4_0 = stackIn_11_0;
                        if (var12 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 != var3.field_q) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var12 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3 = (cl) ((Object) oe.field_I.d(true));
                        if (var12 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var3 == null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = 122;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        si.a(stackIn_11_0);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return;
                }
                case 13: {
                    try {
                        var4 = var14.d((byte) -125);
                        if (-1 == (var4 ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5 = var3.field_z;
                        t.field_cb[0] = oa.field_f;
                        var6_int = 1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var4 <= var6_int) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        t.field_cb[var6_int] = var13.c((byte) -38);
                        var6_int++;
                        if (var12 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var12 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ba.a(2147483647, var4, var5);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var6_int = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var6_int >= var4) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        pn.a(63, var14);
                        stackIn_29_0 = -1;
                        stackIn_23_0 = stackIn_29_0;
                        stackIn_29_1 = var6_int ^ -1;
                        stackIn_23_1 = stackIn_29_1;
                        if (var12 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0 == stackIn_23_1) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ri.a(var6_int, dj.field_Y, -1, vm.field_s, tj.field_Pb, oc.field_c);
                        if (var12 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var3.field_p = oc.field_c;
                        var3.field_o = dj.field_Y;
                        var3.field_w = tj.field_Pb;
                        var3.field_t = vm.field_s;
                        ri.a(var6_int, dj.field_Y, -1, vm.field_s, tj.field_Pb, oc.field_c);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var6_int++;
                        if (var12 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_29_0 = var5;
                        stackIn_29_1 = 6;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        pd.a(stackIn_29_0, (byte) stackIn_29_1);
                        dupTemp$0 = new String[2][var5];
                        var3.field_x = dupTemp$0;
                        var6 = dupTemp$0;
                        dupTemp$1 = new int[2][var5 * 4];
                        var3.field_u = dupTemp$1;
                        var7 = dupTemp$1;
                        var8 = og.field_eb;
                        var9 = 0;
                        var10 = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var8 <= var9) {
                            statePc = 36;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var11 = ch.field_a[var9];
                        var6[0][var10] = t.field_cb[var11];
                        var7[0][var10 * 4] = ad.field_i[var11];
                        var7[0][1 + var10 * 4] = oa.field_e[var11];
                        var7[0][2 + 4 * var10] = ln.field_a[var11];
                        var7[0][3 + var10 * 4] = mk.field_b[var11];
                        stackOut_31_0 = k.a(t.field_cb[var11], true);
                        stackIn_37_0 = stackOut_31_0 ? 1 : 0;
                        stackIn_32_0 = stackOut_31_0;
                        if (var12 != 0) {
                            statePc = 37;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (!stackIn_32_0) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (-1 != (oa.field_e[var11] + (ln.field_a[var11] - -mk.field_b[var11]) ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var6[0][var10] = null;
                        var10--;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9++;
                        var10++;
                        if (var12 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9 = 0;
                        stackIn_37_0 = 0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var10 = stackIn_37_0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var8 <= var9) {
                            statePc = 45;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var11 = ch.field_a[var9 + var5];
                        var6[1][var10] = t.field_cb[var11];
                        var7[1][var10 * 4] = ad.field_i[var11];
                        var7[1][1 + 4 * var10] = oa.field_e[var11];
                        var7[1][4 * var10 + 2] = ln.field_a[var11];
                        var7[1][4 * var10 + 3] = mk.field_b[var11];
                        stackOut_39_0 = k.a(t.field_cb[var11], true);
                        stackIn_46_0 = stackOut_39_0 ? 1 : 0;
                        stackIn_40_0 = stackOut_39_0;
                        if (var12 != 0) {
                            statePc = 46;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (stackIn_40_0) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (-1 != (ln.field_a[var11] + oa.field_e[var11] + mk.field_b[var11] ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var6[1][var10] = null;
                        var10--;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var10++;
                        var9++;
                        if (var12 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_46_0 = param0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (stackIn_46_0 > 107) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        ul.a(-19, 9, -103);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var3.field_A = true;
                        var3.b((byte) 104);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var1), "ul.A(" + param0 + ')');
                }
                case 51: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(byte param0) {
        field_h = null;
        field_b = null;
        field_a = null;
        if (param0 != -75) {
          field_d = -77;
          field_e = null;
          field_c = null;
          field_i = null;
          return;
        } else {
          field_e = null;
          field_c = null;
          field_i = null;
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 == -28705) {
          if (-3 < (param1 ^ -1)) {
            if (5 > param0) {
              return 0;
            } else {
              return 1;
            }
          } else {
            return 2;
          }
        } else {
          ul.a(55, 34);
          if (-3 < (param1 ^ -1)) {
            if (5 > param0) {
              return 0;
            } else {
              return 1;
            }
          } else {
            return 2;
          }
        }
    }

    final static void a(int param0, int param1) {
        uf var2;
        if (param1 != 4) {
          field_e = (qm) null;
          var2 = we.field_b;
          var2.f(param0, -4);
          var2.a(true, 1);
          var2.a(true, 1);
          return;
        } else {
          var2 = we.field_b;
          var2.f(param0, -4);
          var2.a(true, 1);
          var2.a(true, 1);
          return;
        }
    }

    static {
        field_b = "Challenge Highscores";
        field_e = new qm(6, 0, 4, 2);
        field_g = 20000000L;
        field_a = "Respect";
        field_h = "Clan";
        field_c = new int[5];
        field_f = 3;
    }
}
