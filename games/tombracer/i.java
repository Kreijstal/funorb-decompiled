/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i extends ka implements e {
    private ya field_g;
    private oa field_f;
    long field_nativeid;
    rga[] field_d;
    ava[] field_e;

    final void a(gda param0, el param1, int param2) {
        if (param1 == null) {
            ((i) this).field_f.m().a((ka) this, param0, (int[]) null, param2);
        } else {
            oa.field_t[5] = 0;
            ((i) this).field_f.m().a((ka) this, param0, oa.field_t, param2);
        }
    }

    final native void wa();

    private final native void l(long param0, int param1, int[] param2, int param3, int param4, int param5, int param6, boolean param7);

    final void b() {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((i) this).field_f.field_l <= 1) {
                        statePc = 6;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var1 = this;
                    // monitorenter this
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        ((i) this).field_a = false;
                        this.notifyAll();
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 5: {
                    throw (RuntimeException) (Object) var2;
                }
                case 6: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
    }

    final ka a(byte param0, int param1, boolean param2) {
        return ((i) this).field_f.m().a((i) this, param0, param1, param2);
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6) {
        this.l(((i) this).field_nativeid, param0, param1, param2, param3, param4, param5, param6);
    }

    final native void ZA(i param0, i param1, int param2, boolean param3, boolean param4);

    final native void O(int param0, int param1, int param2);

    private final native void R(oa param0, ya param1, int param2, int param3, int[] param4, int[] param5, int[] param6, int[] param7, short[] param8, int param9, short[] param10, short[] param11, short[] param12, byte[] param13, byte[] param14, byte[] param15, byte[] param16, short[] param17, short[] param18, int[] param19, byte param20, short[] param21, int param22, byte[] param23, short[] param24, short[] param25, short[] param26, int[] param27, int[] param28, int[] param29, byte[] param30, byte[] param31, int[] param32, int[] param33, int[] param34, int[] param35, int param36, int param37, int param38, int param39, int param40, int param41, int[] param42);

    final native boolean NA();

    final native void I(int param0, int[] param1, int param2, int param3, int param4, boolean param5, int param6, int[] param7);

    final void a() {
        try {
            Object var1 = null;
            Object var1_ref = null;
            InterruptedException var2 = null;
            Throwable var3 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (((i) this).field_f.field_l <= 1) {
                break L0;
              } else {
                var1_ref = this;
                // monitorenter this
                try {
                  L1: while (true) {
                    if (!((i) this).field_a) {
                      var2 = (InterruptedException) (Object) decompiledCaughtException;
                    } else {
                      try {
                        this.wait();
                      } catch (java.lang.InterruptedException decompiledCaughtParameter) {
                        decompiledCaughtException = decompiledCaughtParameter;
                      }
                      continue L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  ((i) this).field_a = true;
                  // monitorexit var1_ref
                }
                break L0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final native void oa(oa param0);

    final native void FA(int param0);

    final native void H(int param0, int param1, int param2);

    final void a(gda param0, el param1, int param2, int param3) {
        if (param1 == null) {
            ((i) this).field_f.m().a((ka) this, param0, (int[]) null, param2, param3);
        } else {
            oa.field_t[5] = 0;
            ((i) this).field_f.m().a((ka) this, param0, oa.field_t, param2, param3);
        }
    }

    protected final void finalize() {
        if (((i) this).field_nativeid != 0L) {
            ho.a(-1, (e) this);
        }
    }

    i(oa param0, ya param1, oc param2, int param3, int param4, int param5, int param6) {
        int var12 = 0;
        int var15 = 0;
        jt var18 = null;
        jt var21 = null;
        lp var17 = null;
        jt var19 = null;
        ((i) this).field_f = param0;
        ((i) this).field_g = param1;
        ((i) this).field_e = param2.field_B;
        ((i) this).field_d = param2.field_e;
        int var8 = param2.field_B == null ? 0 : param2.field_B.length;
        int var9 = param2.field_e == null ? 0 : param2.field_e.length;
        int var10 = 0;
        int[] var28 = new int[var8 * 3 + var9];
        int[] var26 = var28;
        int[] var24 = var26;
        int[] var22 = var24;
        int[] var11 = var22;
        for (var12 = 0; var12 < var8; var12++) {
            var10++;
            var11[var10] = ((i) this).field_e[var12].field_a;
            var10++;
            var11[var10] = ((i) this).field_e[var12].field_c;
            var10++;
            var11[var10] = ((i) this).field_e[var12].field_b;
        }
        for (var12 = 0; var12 < var9; var12++) {
            var10++;
            var11[var10] = ((i) this).field_d[var12].field_a;
        }
        var12 = param2.field_m == null ? 0 : param2.field_m.length;
        int[] var29 = new int[var12 * 8];
        int[] var27 = var29;
        int[] var25 = var27;
        int[] var23 = var25;
        int[] var13 = var23;
        int var14 = 0;
        for (var15 = 0; var15 < var12; var15++) {
            var18 = param2.field_m[var15];
            var21 = var18;
            var17 = fw.a(var21.field_d, false);
            var14++;
            var13[var14] = var18.field_a;
            var14++;
            var13[var14] = var17.field_d;
            var14++;
            var13[var14] = var17.field_b;
            var14++;
            var13[var14] = var17.field_f;
            var14++;
            var13[var14] = var17.field_c;
            var14++;
            var13[var14] = var17.field_e;
            var14++;
            var13[var14] = var17.field_i ? -1 : 0;
        }
        int var20 = 0;
        var15 = var20;
        while (var20 < var12) {
            var19 = param2.field_m[var20];
            var14++;
            var13[var14] = var19.field_b;
            var20++;
        }
        this.R(((i) this).field_f, ((i) this).field_g, param2.field_E, param2.field_L, param2.field_b, param2.field_I, param2.field_p, param2.field_l, param2.field_y, param2.field_o, param2.field_a, param2.field_t, param2.field_J, param2.field_G, param2.field_C, param2.field_n, param2.field_g, param2.field_A, param2.field_r, param2.field_D, param2.field_k, param2.field_h, param2.field_F, param2.field_u, param2.field_s, param2.field_q, param2.field_K, param2.field_j, param2.field_f, param2.field_x, param2.field_i, param2.field_z, param2.field_d, param2.field_v, param2.field_c, var28, var8, var9, param3, param4, param5, param6, var29);
    }

    i(oa param0) {
        ((i) this).field_f = param0;
        ((i) this).field_g = null;
        this.oa(param0);
    }

    public final native void w(boolean param0);
}
