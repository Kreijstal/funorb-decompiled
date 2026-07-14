/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eu extends o {
    static String field_k;
    md field_i;
    int field_h;
    static int field_g;
    static String field_j;

    public eu() {
        super(new kc());
    }

    final void a(int param0, int param1, double param2, md param3) {
        ((eu) this).field_i = param3;
        ((eu) this).field_d.a(((eu) this).field_i.field_d, true);
        ((eu) this).field_b = 20.0;
        ((eu) this).field_h = 64;
        ((eu) this).field_f = param1;
        ((eu) this).field_e = ((eu) this).field_i.field_e;
        ((eu) this).a((byte) 111, (double)param0);
        ((eu) this).a(param2, (byte) 25);
        ((eu) this).b(24.0, 128);
    }

    final static void b(int param0) {
        try {
            Exception var1 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param0 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        field_g = -18;
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (null == vs.field_g) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            vs.field_g.a(true, 0L);
                            vs.field_g.a(24, nm.field_c.field_f, nm.field_c.field_g, -105);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        nm.field_c.field_g = nm.field_c.field_g + 24;
                        return;
                    }
                    case 5: {
                        var1 = (Exception) (Object) caughtException;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        nm.field_c.field_g = nm.field_c.field_g + 24;
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, int param1, boolean param2) {
        int var3 = -50 % ((-21 - param0) / 51);
        ec.field_t = 0;
        ci.field_d = param1;
        if (!(ci.field_d < 0)) {
            aa.field_b[ci.field_d].a(param2, 1);
        }
    }

    public static void c(int param0) {
        if (param0 != 24) {
            eu.c(111);
            field_j = null;
            field_k = null;
            return;
        }
        field_j = null;
        field_k = null;
    }

    final static byte[] a(byte[] param0, int param1, byte param2, int param3) {
        byte[] var6 = new byte[param1];
        byte[] var4 = var6;
        int var5 = -115 / ((param2 - -94) / 32);
        au.a(param0, param3, var6, 0, param1);
        return var6;
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = AceOfSkies.field_G ? 1 : 0;
        qm.a(ft.field_o, (byte) -31, op.field_a, param1, param0, os.field_w, 0);
        var2 = 0;
        L0: while (true) {
          if (os.field_w <= var2) {
            qm.a(fj.field_d, (byte) -52, nh.field_a, false, param0 + param0, os.field_w + param0, param0);
            if (param0 < os.field_w) {
              os.field_w = param0;
              return;
            } else {
              return;
            }
          } else {
            uf.field_d[param0 + var2] = var2;
            var2++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_j = "Back";
    }
}
