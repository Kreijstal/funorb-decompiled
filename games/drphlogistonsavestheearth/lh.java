/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends od {
    static int[] field_n;
    static ok field_l;
    private ta field_o;
    static int field_m;
    static nh field_p;
    private int field_q;

    final int e(byte param0) {
        if (param0 != 121) {
            Object var3 = null;
            ((lh) this).a(-86, 117, (byte[]) null, (byte) -63);
            ((lh) this).field_j = ((lh) this).field_j + 1;
            return 255 & ((lh) this).field_h[((lh) this).field_j] - ((lh) this).field_o.b((byte) -57);
        }
        ((lh) this).field_j = ((lh) this).field_j + 1;
        return 255 & ((lh) this).field_h[((lh) this).field_j] - ((lh) this).field_o.b((byte) -57);
    }

    final void a(int param0, int param1, byte[] param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var5 = 0;
        if (param3 > -114) {
          return;
        } else {
          L0: while (true) {
            if (var5 < param0) {
              ((lh) this).field_j = ((lh) this).field_j + 1;
              param2[param1 + var5] = (byte)(((lh) this).field_h[((lh) this).field_j] + -((lh) this).field_o.b((byte) -115));
              var5++;
              continue L0;
            } else {
              return;
            }
          }
        }
    }

    final static void a(nh[] param0, byte param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != null) {
            if ((param2 ^ -1) >= -1) {
                return;
            }
            var6 = param0[0].field_z;
            if (param1 <= 46) {
                return;
            }
            var7 = param0[2].field_z;
            var8 = param0[1].field_z;
            param0[0].b(param4, param5, param3);
            param0[2].b(param4 + param2 - var7, param5, param3);
            wj.b(rb.field_e);
            wj.d(param4 - -var6, param5, param4 + (param2 + -var7), param0[1].field_C + param5);
            var9 = param4 + var6;
            var10 = -var7 + (param4 - -param2);
            param4 = var9;
            while (var10 > param4) {
                param0[1].b(param4, param5, param3);
                param4 = param4 + var8;
            }
            wj.a(rb.field_e);
            return;
        }
    }

    lh(byte[] param0) {
        super(param0);
    }

    final void a(byte param0, int[] param1) {
        if (param0 > -100) {
            ((lh) this).field_o = null;
            ((lh) this).field_o = new ta(param1);
            return;
        }
        ((lh) this).field_o = new ta(param1);
    }

    lh(int param0) {
        super(param0);
    }

    final static void b(long param0, byte param1) {
        int var3 = 0;
        InterruptedException var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = 95 % ((param1 - 54) / 48);
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        Thread.sleep(param0);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    var4 = (InterruptedException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void o(int param0) {
        ((lh) this).field_j = (((lh) this).field_q + 7) / 8;
        if (param0 <= -107) {
            return;
        }
        field_l = null;
    }

    final void d(byte param0) {
        int var2 = -98 / ((param0 - -11) / 42);
        ((lh) this).field_q = 8 * ((lh) this).field_j;
    }

    final void d(int param0, int param1) {
        if (param1 != -18392) {
            lh.b(2L, (byte) -21);
            ((lh) this).field_j = ((lh) this).field_j + 1;
            ((lh) this).field_h[((lh) this).field_j] = (byte)(((lh) this).field_o.b((byte) 127) + param0);
            return;
        }
        ((lh) this).field_j = ((lh) this).field_j + 1;
        ((lh) this).field_h[((lh) this).field_j] = (byte)(((lh) this).field_o.b((byte) 127) + param0);
    }

    final int e(int param0, byte param1) {
        int var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int var3 = ((lh) this).field_q >> -1680078269;
        int var4 = 8 - (((lh) this).field_q & 7);
        int var6 = 47 / ((param1 - -33) / 51);
        int var5 = 0;
        ((lh) this).field_q = ((lh) this).field_q + param0;
        while (param0 > var4) {
            var3++;
            var5 = var5 + ((((lh) this).field_h[var3] & ji.field_a[var4]) << param0 + -var4);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (var4 == param0) {
            var5 = var5 + (((lh) this).field_h[var3] & ji.field_a[var4]);
        } else {
            var5 = var5 + (((lh) this).field_h[var3] >> -param0 + var4 & ji.field_a[param0]);
        }
        return var5;
    }

    public static void p(int param0) {
        field_l = null;
        field_p = null;
        if (param0 != 0) {
            field_n = null;
            field_n = null;
            return;
        }
        field_n = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[2];
    }
}
