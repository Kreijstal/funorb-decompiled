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
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          if (this.field_zb == 0) {
            this.field_Db[this.field_zb] = new tv(0L, (jea) null, (jea) null, this.field_ub, (iu) null, ns.field_c);
            this.field_Db[this.field_zb].field_bb = 1;
            this.b(-128, this.field_Db[this.field_zb]);
            this.field_Fb[this.field_zb] = -1;
            this.field_zb = this.field_zb + 1;
            break L0;
          } else {
            break L0;
          }
        }
        var6 = 0;
        var7 = 0;
        L1: while (true) {
          if (this.field_zb <= var7) {
            var6 = var6 + this.field_Hb * 2;
            if (param2 < -50) {
              var7 = this.field_tb + (this.field_zb * this.field_Gb + this.field_tb);
              var8 = bt.a((byte) -8, var6, param3, param4);
              var9 = hsa.a(param1, var7, param0, (byte) -98);
              this.a(var6, var7, -23776, var9, var8);
              var10 = 0;
              L2: while (true) {
                if (this.field_zb <= var10) {
                  return;
                } else {
                  this.field_Db[var10].a(var6 - this.field_Hb * 2, this.field_Hb, this.field_vb, this.field_Gb, 0, this.field_wb, this.field_tb - -(var10 * this.field_Gb));
                  var10++;
                  continue L2;
                }
              }
            } else {
              return;
            }
          } else {
            var8 = this.field_Db[var7].b(this.field_wb, 16474, this.field_vb);
            if ((var6 ^ -1) > (var8 ^ -1)) {
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
        if (this.field_xb != param0) {
            return false;
        }
        if (fna.field_h == 13) {
            this.field_xb = -1;
            return true;
        }
        return true;
    }

    ola(jea param0, iu[] param1, jea param2, jea param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        this.field_Db = new tv[256];
        this.field_Fb = new int[256];
        this.field_xb = -2;
        try {
            this.field_vb = param6;
            this.field_Cb = param1;
            this.field_Hb = param4;
            this.field_tb = param7;
            this.field_ub = param2;
            this.field_Ab = param3;
            this.field_Gb = param8;
            this.field_wb = param5;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ola.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void e(byte param0) {
        bta.field_q = 0;
        bb.a(-21844);
        if (param0 <= 95) {
            field_Eb = -113;
        }
    }

    ola(ola param0) {
        this(param0, param0.field_Cb, param0.field_ub, param0.field_Ab, param0.field_Hb, param0.field_wb, param0.field_vb, param0.field_tb, param0.field_Gb);
    }

    final int d(int param0, boolean param1) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        this.c(-102, param1);
        if (!(param1)) {
            return -2;
        }
        for (var3 = 0; var3 < this.field_zb; var3++) {
            if (0 != this.field_Db[var3].field_y) {
                return this.field_Fb[var3];
            }
        }
        if (hf.field_b != param0) {
            return -1;
        }
        return this.field_xb;
    }

    final static void f(byte param0) {
        int var1 = 0;
        Throwable decompiledCaughtException = null;
        Object var2 = null;
        L0: {
          var1 = 1 % ((-53 - param0) / 62);
          if (nfa.field_n != null) {
            var2 = nfa.field_n;
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

    public static void d(byte param0) {
        if (param0 != -39) {
            ola.f((byte) -65);
        }
        field_yb = null;
        field_Ib = null;
        field_Bb = null;
    }

    final void a(byte param0, int param1, String param2) {
        this.field_Db[this.field_zb] = new tv(0L, (jea) null, (jea) null, this.field_Ab, (iu) null, param2);
        this.field_Db[this.field_zb].field_C = this.field_Cb;
        if (param0 > -63) {
            return;
        }
        try {
            this.field_Db[this.field_zb].field_eb = true;
            this.field_Db[this.field_zb].field_bb = 1;
            this.b(-125, this.field_Db[this.field_zb]);
            this.field_Fb[this.field_zb] = param1;
            this.field_zb = this.field_zb + 1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ola.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(iu param0, int param1, String param2, boolean param3) {
        try {
            this.field_Db[this.field_zb] = new tv(0L, (jea) null, (jea) null, this.field_Ab, param0, param2);
            this.field_Db[this.field_zb].field_C = this.field_Cb;
            if (param3) {
                this.field_Cb = (iu[]) null;
            }
            this.field_Db[this.field_zb].field_eb = true;
            this.field_Db[this.field_zb].field_bb = 1;
            this.b(-128, this.field_Db[this.field_zb]);
            this.field_Fb[this.field_zb] = param1;
            this.field_zb = this.field_zb + 1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ola.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(int param0, ena param1) {
        try {
            hba.field_c = param1;
            if (param0 != 13) {
                field_Eb = -36;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ola.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_yb = new fta();
    }
}
