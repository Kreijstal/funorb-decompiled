/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh extends d implements ih, cg {
    static boolean field_k;
    hn field_m;
    static int field_n;
    static String field_l;

    final String e(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_2_0 = null;
        String stackIn_7_0 = null;
        Object stackOut_1_0 = null;
        String stackOut_6_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2_int = ((qh) this).field_m.g((byte) 12);
                        if (param0 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = null;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return (String) (Object) stackIn_2_0;
                }
                case 3: {
                    try {
                        var3 = ((qh) this).field_m.a(false);
                        var4 = ((qh) this).field_m.f((byte) 94);
                        var5 = df.a(true);
                        if (var4 < 1890) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 <= var5 - 3) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = sk.a(new String[2], fm.field_d, param0 + 122);
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    try {
                        if (!fk.a(var4, (byte) -40, var2_int, var3)) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        return null;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    var2 = (NumberFormatException) (Object) caughtException;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    return nm.field_y;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void a(byte param0, nn param1) {
        int var3 = -10 / ((-18 - param0) / 63);
        ((qh) this).a(125);
    }

    final static boolean a(int param0, int param1, byte param2, int param3, int param4, boolean param5, int param6) {
        L0: {
          if (!ak.a(3058)) {
            break L0;
          } else {
            L1: {
              we.a(param5, param0, param2 + 28, param4);
              if (null == hd.field_s) {
                break L1;
              } else {
                if (!hd.field_s.a(param4, param1, param5, (byte) 53, param6)) {
                  break L1;
                } else {
                  param5 = false;
                  gg.c((byte) 43);
                  break L1;
                }
              }
            }
            ej.a(param5, param4, (byte) 107);
            mn.a(param5, -1, param3);
            param5 = false;
            break L0;
          }
        }
        if (param2 != -30) {
          return true;
        } else {
          return param5;
        }
    }

    public static void d(byte param0) {
        if (param0 != -34) {
            field_k = false;
            field_l = null;
            return;
        }
        field_l = null;
    }

    final static void a(gd param0, int param1, int param2, int param3, int param4, int param5, rb param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        pf var13 = null;
        gd.a(param0.field_Rb, 255, param0.field_Yb, -1, param6, (int[]) null, param0.field_Nb, (hl) (Object) param0, -1);
        hd.field_s.a(19, true);
        hd.field_s.a(0, (int[]) null, true);
        hd.field_s.a(true);
        var13 = hd.field_s;
        var8 = param1;
        var9 = param4;
        var10 = param5;
        var11 = param2;
        var13.field_j.a(var10, var9, -74, var11, var8);
        if (param3 >= -48) {
          var12 = null;
          qh.a((gd) null, 6, 79, 49, 30, -92, (rb) null);
          return;
        } else {
          return;
        }
    }

    public final boolean b(int param0) {
        if (param0 != 13074) {
            return false;
        }
        return ((qh) this).field_m.h(-30886);
    }

    final static void a(boolean param0, byte param1, int param2, ri param3, int param4) {
        bn.field_c.a(param3, param2, !param0 ? true : false, param4, 1000000, (byte) -128);
        int var5 = 120 / ((param1 - -1) / 47);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        Object var8 = null;
        ck.field_bb.a((byte) -85, param2, param6, param3, param0);
        if (param4 == 1000000) {
          if (gl.field_o != null) {
            gl.field_o.a(param5, param3, param5 + -d.field_e, param1, param3, 0);
            return;
          } else {
            return;
          }
        } else {
          var8 = null;
          qh.a((gd) null, -102, -101, -48, -5, -49, (rb) null);
          if (gl.field_o == null) {
            return;
          } else {
            gl.field_o.a(param5, param3, param5 + -d.field_e, param1, param3, 0);
            return;
          }
        }
    }

    public final void a(nn param0, byte param1) {
        if (param1 != 101) {
            ((qh) this).field_m = null;
        }
    }

    final jk a(boolean param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        jk stackIn_3_0 = null;
        jk stackIn_7_0 = null;
        jk stackIn_10_0 = null;
        Throwable decompiledCaughtException = null;
        jk stackOut_2_0 = null;
        jk stackOut_6_0 = null;
        jk stackOut_9_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2_int = ((qh) this).field_m.g((byte) 12);
                        var3 = ((qh) this).field_m.a(param0);
                        var4 = ((qh) this).field_m.f((byte) 66);
                        var5 = df.a(true);
                        if ((var4 ^ -1) > -1891) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = db.field_h;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        if (var4 > -3 + var5) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = db.field_h;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    try {
                        if (fk.a(var4, (byte) -40, var2_int, var3)) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = db.field_h;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    var2 = (NumberFormatException) (Object) caughtException;
                    return db.field_h;
                }
                case 12: {
                    return pf.field_a;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public qh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "<%0> wants to join";
    }
}
