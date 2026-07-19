/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends km {
    private km field_Eb;
    private int[] field_Kb;
    private int field_Ib;
    private int field_Pb;
    private int field_Lb;
    private int field_Fb;
    private km field_Hb;
    static dl field_Ob;
    private mg[] field_Jb;
    private int field_Qb;
    private int field_Mb;
    private int field_Nb;
    private hk[] field_Gb;

    final static void a(java.awt.Component param0, boolean param1) {
        try {
            param0.addMouseListener(pm.field_l);
            if (param1) {
                java.awt.Component var3 = (java.awt.Component) null;
                ga.a((java.awt.Component) null, true);
            }
            param0.addMouseMotionListener(pm.field_l);
            param0.addFocusListener(pm.field_l);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "ga.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int b(boolean param0, byte param1) {
        int discarded$0 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        this.a(param0, (byte) 98);
        if (!param0) {
            return -2;
        }
        int var3 = 0;
        if (param1 != -89) {
            discarded$0 = this.b(true, (byte) -14);
        }
        while (this.field_Qb > var3) {
            if (!(this.field_Gb[var3].field_nb == 0)) {
                return this.field_Kb[var3];
            }
            var3++;
        }
        if (!(oi.field_g == 0)) {
            return -1;
        }
        return this.field_Nb;
    }

    public static void i(int param0) {
        field_Ob = null;
        if (param0 >= -47) {
            field_Ob = (dl) null;
        }
    }

    final boolean g(int param0) {
        if (!(this.field_Nb == -2)) {
            return false;
        }
        if (param0 > -34) {
            this.field_Kb = (int[]) null;
        }
        if (-14 != (um.field_Gb ^ -1)) {
            return true;
        }
        this.field_Nb = -1;
        return true;
    }

    final void a(int param0, String param1, int param2) {
        try {
            this.field_Gb[this.field_Qb] = new hk(0L, (km) null, (km) null, this.field_Eb, (mg) null, param1);
            this.field_Gb[this.field_Qb].field_x = this.field_Jb;
            this.field_Gb[this.field_Qb].field_ib = true;
            this.field_Gb[this.field_Qb].field_D = param0;
            this.a(param0 ^ 1, this.field_Gb[this.field_Qb]);
            this.field_Kb[this.field_Qb] = param2;
            this.field_Qb = this.field_Qb + 1;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "ga.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(String param0, byte param1, int param2, mg param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              this.field_Gb[this.field_Qb] = new hk(0L, (km) null, (km) null, this.field_Eb, param3, param0);
              this.field_Gb[this.field_Qb].field_x = this.field_Jb;
              this.field_Gb[this.field_Qb].field_ib = true;
              this.field_Gb[this.field_Qb].field_D = 1;
              this.a(param1 + -89, this.field_Gb[this.field_Qb]);
              this.field_Kb[this.field_Qb] = param2;
              this.field_Qb = this.field_Qb + 1;
              if (param1 == 89) {
                break L1;
              } else {
                this.field_Fb = -30;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ga.A(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static boolean h(int param0) {
        if (param0 != -20940) {
            java.awt.Component var2 = (java.awt.Component) null;
            ga.a((java.awt.Component) null, false);
        }
        return ql.field_q.a((byte) 19);
    }

    ga(km param0, mg[] param1, km param2, km param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        this.field_Nb = -2;
        this.field_Kb = new int[256];
        this.field_Gb = new hk[256];
        try {
            this.field_Jb = param1;
            this.field_Mb = param8;
            this.field_Ib = param5;
            this.field_Pb = param7;
            this.field_Hb = param2;
            this.field_Fb = param4;
            this.field_Eb = param3;
            this.field_Lb = param6;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "ga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Virogrid.field_F ? 1 : 0;
          if (-1 == (this.field_Qb ^ -1)) {
            this.field_Gb[this.field_Qb] = new hk(0L, (km) null, (km) null, this.field_Hb, (mg) null, cg.field_a);
            this.field_Gb[this.field_Qb].field_D = 1;
            this.a(0, this.field_Gb[this.field_Qb]);
            this.field_Kb[this.field_Qb] = -1;
            this.field_Qb = this.field_Qb + 1;
            break L0;
          } else {
            break L0;
          }
        }
        var6 = 0;
        var7 = param1;
        L1: while (true) {
          if (var7 >= this.field_Qb) {
            var6 = var6 + 2 * this.field_Fb;
            var7 = this.field_Mb * this.field_Qb + this.field_Pb - -this.field_Pb;
            var8 = sh.b(0, param2, param3, var6);
            var9 = p.a(-1, var7, param4, param0);
            this.a(var8, var7, var6, (byte) -87, var9);
            var10 = 0;
            L2: while (true) {
              if (var10 >= this.field_Qb) {
                return;
              } else {
                this.field_Gb[var10].a(-(2 * this.field_Fb) + var6, this.field_Fb, 2, var10 * this.field_Mb + this.field_Pb, this.field_Lb, this.field_Mb, this.field_Ib);
                var10++;
                continue L2;
              }
            }
          } else {
            var8 = this.field_Gb[var7].c(-89, this.field_Lb, this.field_Ib);
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

    ga(ga param0) {
        this(param0, param0.field_Jb, param0.field_Hb, param0.field_Eb, param0.field_Fb, param0.field_Ib, param0.field_Lb, param0.field_Pb, param0.field_Mb);
    }

    static {
        field_Ob = new dl();
    }
}
