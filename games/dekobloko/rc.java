/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc implements Runnable {
    volatile en[] field_l;
    volatile boolean field_b;
    volatile boolean field_j;
    fd field_f;
    static vj field_e;
    static int field_a;
    static ui field_d;
    static ji field_k;
    static String field_h;
    static String field_g;
    static sg[] field_c;
    static ud field_i;

    final static int[] a(int[] param0, byte param1, int[] param2) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] stackIn_3_0 = null;
        int stackIn_6_0 = 0;
        int[] stackIn_8_0 = null;
        int[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
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
        RuntimeException var3_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = new int[8];
                        var3 = var6;
                        var4 = 0;
                        if (param1 == 47) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = (int[]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    stackIn_6_0 = 8;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        stackIn_6_0 = 8;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 <= var4) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_11_0 = (int[]) (var6);
                        stackIn_8_0 = stackIn_11_0;
                        if (var5 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_8_0[var4] = lb.a(param2[var4] ^ -1, param0[var4]);
                        var4++;
                        if (var5 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = (int[]) (var6);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    var3_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_14_0 = (RuntimeException) (var3_ref);
                    stackIn_13_0 = stackIn_14_0;
                    stackIn_14_1 = new StringBuilder().append("rc.A(");
                    stackIn_13_1 = stackIn_14_1;
                    if (param0 == null) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_15_2 = "{...}";
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_15_2 = "null";
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');
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
                    throw dh.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_e = null;
        field_k = null;
        field_c = null;
        if (param0 >= -103) {
            return;
        }
        field_g = null;
        field_d = null;
        field_i = null;
    }

    public final void run() {
        Exception exception = null;
        int var1_int = 0;
        en var2 = null;
        int var4 = 0;
        String var5 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        Throwable var3 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = client.field_A ? 1 : 0;
                    this.field_b = true;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_j) {
                            statePc = 11;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = ((Object) stateCaught_1 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = ((Object) stateCaught_2 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var1_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = ((Object) stateCaught_3 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((var1_int ^ -1) <= -3) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = ((Object) stateCaught_4 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = this.field_l[var1_int];
                        if (var4 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = ((Object) stateCaught_5 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var2 == null) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = ((Object) stateCaught_6 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2.g();
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = ((Object) stateCaught_7 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var1_int++;
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = ((Object) stateCaught_8 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ua.a(10L, -128);
                        db.a(-68, (Object) null, this.field_f);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = ((Object) stateCaught_9 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4 == 0) {
                            statePc = 1;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = ((Object) stateCaught_10 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 11: {
                    this.field_b = false;
                    statePc = 16;
                    continue stateLoop;
                }
                case 12: {
                    try {
                        exception = (Exception) ((Object) caughtException);
                        var5 = (String) null;
                        qb.a((Throwable) ((Object) exception), 16408, (String) null);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    this.field_b = false;
                    statePc = 16;
                    continue stateLoop;
                }
                case 14: {
                    try {
                        var3 = caughtException;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 15: {
                    this.field_b = false;
                    throw rc.<RuntimeException>$cfr$sneakyThrow(var3);
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(boolean param0) {
        if (param0) {
            rc.a(true);
        }
        return kf.field_Q != null ? true : false;
    }

    final static ke a(boolean param0, boolean param1, boolean param2, byte param3, boolean param4) {
        ke stackIn_2_0 = null;
        ke stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        ke stackIn_7_0 = null;
        ke stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ke stackIn_10_0 = null;
        ke stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int var6;
        int var7;
        ke var8;
        ke var9;
        L0: {
          var8 = new ke(2);
          var9 = var8;
          stackIn_2_0 = (ke) (var9);

          if (!param1) {
            stackIn_3_0 = (ke) ((Object) stackIn_2_0);
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = (ke) ((Object) stackIn_2_0);
            stackIn_3_1 = 1;
            break L0;
          }
        }
        L1: {
          stackIn_3_0.field_s = stackIn_3_1 != 0;
          if (param3 <= 0) {
            break L1;
          } else {
            rc.a(-21);
            break L1;
          }
        }
        L2: {
          stackIn_7_0 = (ke) (var9);

          if (!param2) {
            stackIn_8_0 = (ke) ((Object) stackIn_7_0);
            stackIn_8_1 = 0;
            break L2;
          } else {
            stackIn_8_0 = (ke) ((Object) stackIn_7_0);
            stackIn_8_1 = 1;
            break L2;
          }
        }
        L3: {
          stackIn_8_0.field_j = stackIn_8_1 != 0;
          stackIn_10_0 = (ke) (var9);

          if (!param0) {
            stackIn_11_0 = (ke) ((Object) stackIn_10_0);
            stackIn_11_1 = 0;
            break L3;
          } else {
            stackIn_11_0 = (ke) ((Object) stackIn_10_0);
            stackIn_11_1 = 1;
            break L3;
          }
        }
        L4: {
          stackIn_11_0.field_r = stackIn_11_1 != 0;
          var9.a(new ec(20, qn.field_rb, a.field_t), 115);
          var9.a(new ec(21, lg.field_T, a.field_t), 102);
          var8.field_f[0].field_l = 320 + -(var8.field_f[0].field_n / 2);
          var8.field_f[0].field_m = 150;
          var8.field_f[1].field_m = 250;
          var8.field_f[1].field_l = 320 - var8.field_f[1].field_n / 2;
          var9.a(-1, param4, -129);
          var6 = var8.field_f[0].field_n;
          var7 = var8.field_f[1].field_n;
          if (var6 >= var7) {
            break L4;
          } else {
            var6 = var7;
            break L4;
          }
        }
        L5: {
          var7 = w.field_kb.a(si.field_g);
          if (var7 <= var6) {
            break L5;
          } else {
            var6 = var7;
            break L5;
          }
        }
        L6: {
          var7 = w.field_kb.a(gf.a(-127, param1, param2, param0));
          if (var6 < var7) {
            var6 = var7;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          var7 = w.field_kb.a(ri.a(0, param1, param2, param0));
          if (var7 <= var6) {
            break L7;
          } else {
            var6 = var7;
            break L7;
          }
        }
        L8: {
          var7 = w.field_kb.a(kk.a(param2, param1, param0, true));
          if (var6 < var7) {
            var6 = var7;
            break L8;
          } else {
            break L8;
          }
        }
        var9.field_z = 76;
        var9.field_w = -(var6 / 2) + 280;
        var9.field_q = 260;
        var9.field_y = -var9.field_w + (var6 / 2 + 360);
        return var9;
    }

    rc() {
        this.field_l = new en[2];
        this.field_j = false;
        this.field_b = false;
    }

    static {
        int var0 = 0;
        field_a = 0;
        field_h = "Left";
        field_e = new vj();
        field_c = new sg[255];
        field_g = "Cancel unrated rematch";
        for (var0 = 0; var0 < field_c.length; var0++) {
            field_c[var0] = new sg();
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
