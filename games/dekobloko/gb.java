/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb extends w {
    static int[] field_Pb;
    static String field_ac;
    private ck[] field_cc;
    static boolean field_Zb;
    private qd[] field_Wb;
    static int field_Vb;
    private int field_bc;
    private int field_Rb;
    private int field_Sb;
    private w field_ec;
    private w field_Qb;
    private int field_Ub;
    private int[] field_Yb;
    private int field_dc;
    private int field_Xb;
    static String field_Tb;
    private int field_Nb;
    static int field_Ob;

    final boolean f(int param0) {
        if ((this.field_dc ^ -1) != 1) {
            return false;
        }
        int var2 = -62 % ((-76 - param0) / 48);
        if (wh.field_c != 13) {
            return true;
        }
        this.field_dc = -1;
        return true;
    }

    final int b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = client.field_A ? 1 : 0;
        this.a(false, param1);
        if (!param1) {
            return -2;
        }
        for (var3 = 0; var3 < this.field_Rb; var3++) {
            if ((this.field_Wb[var3].field_ob ^ -1) != -1) {
                return this.field_Yb[var3];
            }
        }
        if (!(0 == ig.field_Yb)) {
            return -1;
        }
        var3 = -1 / ((param0 - 52) / 63);
        return this.field_dc;
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        String var12;
        L0: {
          var11 = client.field_A ? 1 : 0;
          if (0 != this.field_Rb) {
            break L0;
          } else {
            this.field_Wb[this.field_Rb] = new qd(0L, (w) null, (w) null, this.field_Qb, (ck) null, on.field_i);
            this.field_Wb[this.field_Rb].field_W = 1;
            this.a(this.field_Wb[this.field_Rb], -16834);
            this.field_Yb[this.field_Rb] = -1;
            this.field_Rb = this.field_Rb + 1;
            break L0;
          }
        }
        var6 = 0;
        var7 = 0;
        L1: while (true) {
          if (this.field_Rb <= var7) {
            L2: {
              var6 = var6 + this.field_Sb * 2;
              var7 = this.field_Rb * this.field_Xb + this.field_bc - -this.field_bc;
              var8 = vh.a(param4, -18265, var6, param1);
              var9 = o.a(param3, 0, var7, param0);
              this.a(var6, 0, var9, var7, var8);
              if (param2 >= 38) {
                break L2;
              } else {
                var12 = (String) null;
                this.a((String) null, -17, -15);
                break L2;
              }
            }
            var10 = 0;
            L3: while (true) {
              if (var10 >= this.field_Rb) {
                return;
              } else {
                this.field_Wb[var10].a(this.field_Xb, this.field_Ub, this.field_Sb, this.field_bc + this.field_Xb * var10, -(this.field_Sb * 2) + var6, this.field_Nb, 500);
                var10++;
                continue L3;
              }
            }
          } else {
            var8 = this.field_Wb[var7].b(this.field_Ub, this.field_Nb, 1940);
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

    final static void a(int param0, String param1) {
        rm.a((byte) 73, param1);
        if (param0 >= -68) {
            return;
        }
        try {
            wi.a(false, -106, jc.field_a);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "gb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, ji param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = param1.a(param2, 108, param0);
            var4 = var5;
            if (param3 > 34) {
              if (var5 != null) {
                eh.a((byte) -72, var5);
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4_ref);

            stackIn_10_1 = new StringBuilder().append("gb.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_7_0 != 0;
          }
        }
    }

    final static void a(int param0, boolean param1, byte param2, int param3) {
        if (!(jh.field_h)) {
            return;
        }
        ie.field_c.a(false, param1);
        int var4 = mg.field_bc.f(-1) ? 1 : 0;
        if (ig.field_Yb != 0 && var4 == 0) {
            param1 = false;
            qn.l(13);
        }
        if (!(!param1)) {
            mg.field_bc.a(param3, param0, -115);
        }
        if (!(var4 == 0)) {
            ie.field_c.a(false, param1);
        }
        int var5 = -27 % ((param2 - -66) / 56);
        int var6 = mg.field_bc.g(-108) + mg.field_bc.field_E;
        if ((var6 ^ -1) < -641) {
            l.field_f = l.field_f + 5;
        } else {
            if (var6 < 635) {
                if (!(0 >= l.field_f)) {
                    l.field_f = l.field_f - 5;
                }
            }
        }
    }

    final void a(int param0, int param1, ck param2, String param3) {
        this.field_Wb[this.field_Rb] = new qd(0L, (w) null, (w) null, this.field_ec, param2, param3);
        this.field_Wb[this.field_Rb].field_S = this.field_cc;
        this.field_Wb[this.field_Rb].field_Gb = true;
        this.field_Wb[this.field_Rb].field_W = 1;
        this.a(this.field_Wb[this.field_Rb], -16834);
        this.field_Yb[this.field_Rb] = param1;
        if (param0 != 4193) {
            return;
        }
        try {
            this.field_Rb = this.field_Rb + 1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "gb.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    gb(gb param0) {
        this(param0, param0.field_cc, param0.field_Qb, param0.field_ec, param0.field_Sb, param0.field_Ub, param0.field_Nb, param0.field_bc, param0.field_Xb);
    }

    gb(w param0, ck[] param1, w param2, w param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        this.field_Wb = new qd[256];
        this.field_Yb = new int[256];
        this.field_dc = -2;
        try {
            this.field_ec = param3;
            this.field_Sb = param4;
            this.field_Xb = param8;
            this.field_Ub = param5;
            this.field_Nb = param6;
            this.field_Qb = param2;
            this.field_cc = param1;
            this.field_bc = param7;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "gb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        try {
            this.field_Wb[this.field_Rb] = new qd(0L, (w) null, (w) null, this.field_ec, (ck) null, param0);
            this.field_Wb[this.field_Rb].field_S = this.field_cc;
            this.field_Wb[this.field_Rb].field_Gb = true;
            this.field_Wb[this.field_Rb].field_W = 1;
            int var4_int = -81 / ((24 - param2) / 32);
            this.a(this.field_Wb[this.field_Rb], -16834);
            this.field_Yb[this.field_Rb] = param1;
            this.field_Rb = this.field_Rb + 1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "gb.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void e(int param0) {
        field_ac = null;
        field_Pb = null;
        field_Tb = null;
        if (param0 != -2) {
            field_Vb = -46;
        }
    }

    static {
        field_ac = "Join";
        field_Vb = 0;
        field_Tb = "Encouraging rule breaking";
        field_Pb = new int[12];
        field_Ob = field_Vb;
    }
}
