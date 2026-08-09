/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static lk field_b;
    static int[] field_a;
    static boolean field_c;

    public static void b(byte param0) {
        if (param0 < 120) {
            field_b = (lk) null;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0) {
        if (k.field_g == 10 || !ej.a(12931)) {
            rh.d((byte) -117);
            k.field_g = 11;
        }
        lh.field_e = true;
        if (param0 < 1) {
            field_b = (lk) null;
        }
    }

    final static le[] c(byte param0) {
        boolean stackIn_5_0 = false;
        int stackIn_22_0 = 0;
        boolean stackOut_4_0;
        int statePc = 0;
        le[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6_ref_int__ = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var12 = null;
        int[] var14 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = MonkeyPuzzle2.field_F ? 1 : 0;
                    if (param0 == 16) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    cf.a((byte) 37);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var1 = new le[eg.field_c];
                    var2 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var2 >= eg.field_c) {
                        statePc = 21;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var3 = da.field_c[var2] * ra.field_ab[var2];
                    var17 = cb.field_b[var2];
                    stackOut_4_0 = j.field_d[var2];
                    stackIn_22_0 = stackOut_4_0 ? 1 : 0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var8 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (!stackIn_5_0) {
                        statePc = 13;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var18 = jj.field_E[var2];
                    var14 = new int[var3];
                    var12 = var14;
                    var6_ref_int__ = var12;
                    var7 = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (var7 >= var3) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var6_ref_int__[var7] = bd.a(fk.field_d[ch.a(255, (int) var17[var7])], ch.a(var18[var7] << -1472808104, -16777216));
                    var7++;
                    if (var8 != 0) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var8 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var1[var2] = (le) ((Object) new ae(nj.field_d, qk.field_a, qc.field_P[var2], mb.field_b[var2], da.field_c[var2], ra.field_ab[var2], var14));
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var8 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var10 = new int[var3];
                    var6 = 0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (var3 <= var6) {
                        statePc = 18;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var10[var6] = fk.field_d[ch.a(255, (int) var17[var6])];
                    var6++;
                    if (var8 != 0) {
                        statePc = 20;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var8 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var1[var2] = new le(nj.field_d, qk.field_a, qc.field_P[var2], mb.field_b[var2], da.field_c[var2], ra.field_ab[var2], var10);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    var2++;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (var8 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = -54;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    gb.a(stackIn_22_0);
                    return var1;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static cc a(int param0) {
        try {
            Throwable var1 = null;
            cc stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (param0 == 255) {
                    break L1;
                  } else {
                    cf.c((byte) 16);
                    break L1;
                  }
                }
                stackIn_3_0 = (cc) (Class.forName("nb").newInstance());
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        int var0 = 0;
        int var1 = 0;
        field_b = new lk();
        field_a = new int[256];
        for (var0 = 0; var0 < 256; var0++) {
            var1 = var0 * 3 / 2 - -var0;
            if (!(255 >= var1)) {
                var1 = 255;
            }
            field_a[var0] = ch.a(16746712, var1 << 138009392);
            field_a[var0] = bd.a(field_a[var0], ch.a(var0 * var0 >> -1260120827, 1962934527) << -1808416344);
        }
    }
}
