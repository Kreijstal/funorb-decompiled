/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab implements td {
    private int field_m;
    private int field_d;
    private int field_b;
    private kc field_k;
    private int field_c;
    private int field_a;
    private int field_i;
    static ml field_j;
    private int field_e;
    static im field_h;
    static hj[] field_g;
    static int field_f;
    static int field_l;

    public final void a(int param0, int param1, pj param2, int param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        bj var15 = null;
        pj stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        pj stackOut_1_0 = null;
        L0: {
          if (!(param2 instanceof bj)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (pj) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (pj) param2;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var15 = (bj) (Object) stackIn_3_0;
          ul.h(param2.field_s + param1, param0 - -param2.field_n, param2.field_m, param2.field_r, ((ab) this).field_a);
          if (var15 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = var15.field_H + param1 + param2.field_s;
          var8 = param2.field_n + param0 - -var15.field_K;
          ul.f(var7, var8, var15.field_G, ((ab) this).field_d);
          if (var15.field_L == -1) {
            break L2;
          } else {
            var9 = 2.0 * ((double)var15.field_L * 3.141592653589793) / (double)var15.field_I;
            var11 = (int)(-Math.sin(var9) * (double)var15.field_G);
            var12 = (int)(Math.cos(var9) * (double)var15.field_G);
            ul.f(var7 - -var11, var12 + var8, 1, ((ab) this).field_i);
            break L2;
          }
        }
        ul.f(var7, var8, 2, 1);
        var9 = 2.0 * (3.141592653589793 * (double)var15.field_J) / (double)var15.field_I;
        var11 = (int)(-Math.sin(var9) * (double)var15.field_G);
        if (param3 == -4394) {
          var12 = (int)(Math.cos(var9) * (double)var15.field_G);
          ul.b(var7, var8, var7 - -var11, var12 + var8, 1);
          if (null == ((ab) this).field_k) {
            return;
          } else {
            var13 = ((ab) this).field_m + (var15.field_H + var15.field_G);
            int discarded$2 = ((ab) this).field_k.a(param2.field_l, param2.field_s + (param1 + var13), param0 - -param2.field_n - -((ab) this).field_b, param2.field_m - (var13 - -((ab) this).field_m), param2.field_r - (((ab) this).field_m << -839238015), ((ab) this).field_e, ((ab) this).field_c, 1, 1, 0);
            return;
          }
        } else {
          var14 = null;
          ((ab) this).a(19, 76, (pj) null, 43, true);
          var12 = (int)(Math.cos(var9) * (double)var15.field_G);
          ul.b(var7, var8, var7 - -var11, var12 + var8, 1);
          if (null == ((ab) this).field_k) {
            return;
          } else {
            var13 = ((ab) this).field_m + (var15.field_H + var15.field_G);
            int discarded$3 = ((ab) this).field_k.a(param2.field_l, param2.field_s + (param1 + var13), param0 - -param2.field_n - -((ab) this).field_b, param2.field_m - (var13 - -((ab) this).field_m), param2.field_r - (((ab) this).field_m << -839238015), ((ab) this).field_e, ((ab) this).field_c, 1, 1, 0);
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_j = null;
        if (param0) {
            field_h = null;
            field_g = null;
            field_h = null;
            return;
        }
        field_g = null;
        field_h = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        Object var2 = null;
        int var3 = 0;
        Throwable var4 = null;
        int var5 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = OrbDefence.field_D ? 1 : 0;
                    var1 = -43 % ((-78 - param0) / 46);
                    var2 = (Object) (Object) ad.field_b;
                    // monitorenter ad.field_b
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        md.field_g = pk.field_H;
                        ji.field_c = ji.field_c + 1;
                        if ((wg.field_p ^ -1) <= -1) {
                            statePc = 6;
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
                        var3 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (112 <= var3) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ek.field_a[var3] = false;
                        var3++;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        wg.field_p = al.field_b;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (al.field_b == wg.field_p) {
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
                        var3 = gl.field_i[al.field_b];
                        al.field_b = al.field_b + 1 & 127;
                        if (0 <= var3) {
                            statePc = 9;
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
                        ek.field_a[var3 ^ -1] = false;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ek.field_a[var3] = true;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        pk.field_H = uf.field_a;
                        // monitorexit var2
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var4 = caughtException;
                        // monitorexit var2
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) var4;
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ab(kc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((ab) this).field_d = param5;
        ((ab) this).field_c = param4;
        ((ab) this).field_k = param0;
        ((ab) this).field_b = param2;
        ((ab) this).field_e = param3;
        ((ab) this).field_m = param1;
        ((ab) this).field_i = param6;
        ((ab) this).field_a = param7;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new ml(1);
        field_h = new im();
        field_l = -1;
    }
}
