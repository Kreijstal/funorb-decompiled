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
        try {
            ((ola) this).field_vb = param6;
            ((ola) this).field_Cb = param1;
            ((ola) this).field_Hb = param4;
            ((ola) this).field_tb = param7;
            ((ola) this).field_ub = param2;
            ((ola) this).field_Ab = param3;
            ((ola) this).field_Gb = param8;
            ((ola) this).field_wb = param5;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ola.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    final static void e(byte param0) {
        bta.field_q = 0;
        int discarded$2 = -21844;
        bb.a();
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

    final static void f() {
        int var1 = 0;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          var1 = 1;
          if (nfa.field_n != null) {
            var2 = (Object) (Object) nfa.field_n;
            synchronized (var2) {
              L1: {
                nfa.field_n = null;
                break L1;
              }
            }
            break L0;
          } else {
            break L0;
          }
        }
    }

    public static void d() {
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
        try {
            ((ola) this).field_Db[((ola) this).field_zb].field_eb = true;
            ((ola) this).field_Db[((ola) this).field_zb].field_bb = 1;
            ((ola) this).b(-125, (jea) (Object) ((ola) this).field_Db[((ola) this).field_zb]);
            ((ola) this).field_Fb[((ola) this).field_zb] = param1;
            ((ola) this).field_zb = ((ola) this).field_zb + 1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ola.F(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(iu param0, int param1, String param2, boolean param3) {
        try {
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
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ola.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final static void a(int param0, ena param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            hba.field_c = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ola.H(").append(13).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_yb = new fta();
    }
}
