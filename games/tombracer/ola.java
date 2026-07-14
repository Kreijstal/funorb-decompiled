/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ola extends jea {
    static int field_Eb;
    private int field_tb;
    private tv[] field_Db;
    static fta field_yb;
    private int[] field_Fb;
    private int field_Gb;
    private int field_zb;
    private int field_wb;
    private int field_vb;
    private jea field_ub;
    private iu[] field_Cb;
    private int field_Hb;
    static uia field_Bb;
    private jea field_Ab;
    static ka[] field_Ib;
    private int field_xb;

    final void b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          if (((ola) this).field_zb == 0) {
            ((ola) this).field_Db[((ola) this).field_zb] = new tv(0L, (jea) null, (jea) null, ((ola) this).field_ub, (iu) null, ns.field_c);
            ((ola) this).field_Db[((ola) this).field_zb].field_bb = 1;
            ((ola) this).b(-128, (jea) (Object) ((ola) this).field_Db[((ola) this).field_zb]);
            ((ola) this).field_Fb[((ola) this).field_zb] = -1;
            ((ola) this).field_zb = ((ola) this).field_zb + 1;
            break L0;
          } else {
            break L0;
          }
        }
        var6 = 0;
        var7 = 0;
        L1: while (true) {
          if (((ola) this).field_zb <= var7) {
            var6 = var6 + ((ola) this).field_Hb * 2;
            if (param2 < -50) {
              var7 = ((ola) this).field_tb + (((ola) this).field_zb * ((ola) this).field_Gb + ((ola) this).field_tb);
              var8 = bt.a((byte) -8, var6, param3, param4);
              var9 = hsa.a(param1, var7, param0, (byte) -98);
              ((ola) this).a(var6, var7, -23776, var9, var8);
              var10 = 0;
              L2: while (true) {
                if (((ola) this).field_zb <= var10) {
                  return;
                } else {
                  ((ola) this).field_Db[var10].a(var6 - ((ola) this).field_Hb * 2, ((ola) this).field_Hb, ((ola) this).field_vb, ((ola) this).field_Gb, 0, ((ola) this).field_wb, ((ola) this).field_tb - -(var10 * ((ola) this).field_Gb));
                  var10++;
                  continue L2;
                }
              }
            } else {
              return;
            }
          } else {
            var8 = ((ola) this).field_Db[var7].b(((ola) this).field_wb, 16474, ((ola) this).field_vb);
            if (var6 < var8) {
              var6 = var8;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    final boolean f(int param0) {
        if (((ola) this).field_xb != param0) {
            return false;
        }
        if (fna.field_h == 13) {
            ((ola) this).field_xb = -1;
            return true;
        }
        return true;
    }

    ola(jea param0, iu[] param1, jea param2, jea param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        ((ola) this).field_Db = new tv[256];
        ((ola) this).field_Fb = new int[256];
        ((ola) this).field_xb = -2;
        ((ola) this).field_vb = param6;
        ((ola) this).field_Cb = param1;
        ((ola) this).field_Hb = param4;
        ((ola) this).field_tb = param7;
        ((ola) this).field_ub = param2;
        ((ola) this).field_Ab = param3;
        ((ola) this).field_Gb = param8;
        ((ola) this).field_wb = param5;
    }

    final static void e(byte param0) {
        bta.field_q = 0;
        bb.a(-21844);
        if (param0 <= 95) {
            field_Eb = -113;
        }
    }

    ola(ola param0) {
        this((jea) (Object) param0, param0.field_Cb, param0.field_ub, param0.field_Ab, param0.field_Hb, param0.field_wb, param0.field_vb, param0.field_tb, param0.field_Gb);
    }

    final int d(int param0, boolean param1) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        ((ola) this).c(-102, param1);
        if (!(param1)) {
            return -2;
        }
        for (var3 = 0; var3 < ((ola) this).field_zb; var3++) {
            if (0 != ((ola) this).field_Db[var3].field_y) {
                return ((ola) this).field_Fb[var3];
            }
        }
        if (hf.field_b != param0) {
            return -1;
        }
        return ((ola) this).field_xb;
    }

    final static void f(byte param0) {
        int var1 = 0;
        Object var2 = null;
        Throwable var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = 1 % ((-53 - param0) / 62);
                    if (nfa.field_n != null) {
                        statePc = 2;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var2 = (Object) (Object) nfa.field_n;
                    // monitorenter nfa.field_n
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        nfa.field_n = null;
                        // monitorexit var2
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3 = caughtException;
                        // monitorexit var2
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var3;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void d(byte param0) {
        if (param0 != -39) {
            ola.f((byte) -65);
        }
        field_yb = null;
        field_Ib = null;
        field_Bb = null;
    }

    final void a(byte param0, int param1, String param2) {
        ((ola) this).field_Db[((ola) this).field_zb] = new tv(0L, (jea) null, (jea) null, ((ola) this).field_Ab, (iu) null, param2);
        ((ola) this).field_Db[((ola) this).field_zb].field_C = ((ola) this).field_Cb;
        if (param0 > -63) {
            return;
        }
        ((ola) this).field_Db[((ola) this).field_zb].field_eb = true;
        ((ola) this).field_Db[((ola) this).field_zb].field_bb = 1;
        ((ola) this).b(-125, (jea) (Object) ((ola) this).field_Db[((ola) this).field_zb]);
        ((ola) this).field_Fb[((ola) this).field_zb] = param1;
        ((ola) this).field_zb = ((ola) this).field_zb + 1;
    }

    final void a(iu param0, int param1, String param2, boolean param3) {
        ((ola) this).field_Db[((ola) this).field_zb] = new tv(0L, (jea) null, (jea) null, ((ola) this).field_Ab, param0, param2);
        ((ola) this).field_Db[((ola) this).field_zb].field_C = ((ola) this).field_Cb;
        if (param3) {
            ((ola) this).field_Cb = null;
        }
        ((ola) this).field_Db[((ola) this).field_zb].field_eb = true;
        ((ola) this).field_Db[((ola) this).field_zb].field_bb = 1;
        ((ola) this).b(-128, (jea) (Object) ((ola) this).field_Db[((ola) this).field_zb]);
        ((ola) this).field_Fb[((ola) this).field_zb] = param1;
        ((ola) this).field_zb = ((ola) this).field_zb + 1;
    }

    final static void a(int param0, ena param1) {
        hba.field_c = param1;
        if (param0 != 13) {
            field_Eb = -36;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_yb = new fta();
    }
}
