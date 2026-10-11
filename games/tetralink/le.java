/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends hl {
    private int field_Ob;
    private int field_Zb;
    private int field_Sb;
    static String field_Lb;
    private int field_Kb;
    private int[] field_Ub;
    private nh[] field_Qb;
    private int field_Tb;
    private char[] field_Wb;
    static int field_Xb;
    private int field_Rb;
    private le field_Yb;
    private int field_Mb;
    private int field_Nb;
    static String field_Vb;
    private le[] field_Pb;

    le(long param0, hl param1, hl param2, hl param3, le[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        int var13 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        Object var14 = null;
        int var15 = 0;
        jb var17 = null;
        jb var18 = null;
        this.field_Zb = -1;
        try {
          this.field_Wb = param7;
          this.field_Ub = param5;
          this.field_Pb = param4;
          this.field_Kb = this.field_Ub.length;
          var17 = param3.field_Ib;
          var18 = var17;
          this.field_Ob = 2 + var18.field_N + var18.field_K;
          this.field_Mb = 0;
          this.field_Tb = this.field_Ob * this.field_Kb;
          this.field_Qb = new nh[this.field_Kb];
          var11 = "<col=999999>";
          var12 = "</col>";
          for (var13 = 0; var13 < this.field_Kb; var13++) {
            if (this.field_Wb[var13] > 0) {
              param6[var13] = var11 + lg.a(false, this.field_Wb[var13]).toUpperCase() + ": " + var12 + param6[var13];
            }
            var14 = null;
            if (null != this.field_Pb[var13] ||
              -1 == this.field_Ub[var13]) {
              var14 = ab.field_R;
            }
            this.field_Qb[var13] = new nh(0L, param2, (hl) null, param3, (oh) (var14), param6[var13]);
            this.a((byte) 97, this.field_Qb[var13]);
            var15 = var17.b(param6[var13]);
            if (this.field_Mb < var15) {
              this.field_Mb = var15;
            }
          }
          this.field_Mb = this.field_Mb + (10 + ab.field_R.field_t);
          this.e(144, 12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("le.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param5 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param6 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param7 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    public static void j(int param0) {
        field_Lb = null;
        int var1 = -107 % ((10 - param0) / 47);
        field_Vb = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7;
        int var8;
        int var9;
        int var7Lifetime1;
        var9 = TetraLink.field_J;
        this.field_Sb = this.field_Mb + 2 * param0;
        this.a((byte) -123, this.field_Sb, param4 - this.field_Tb, this.field_Tb, param2);
        if (this.field_Rb != param1) {
          this.field_Rb = param1;
          this.e(144, this.field_Nb);
        }
        for (var7 = 0; var7 < this.field_Kb; var7++) {
          this.field_Qb[var7].b(param5 + 0, this.field_Sb, this.field_Qb[var7].field_yb, param3, 0, param0, this.field_Ob);
        }
        if (~this.field_Zb != param5 &&
          null != this.field_Pb[this.field_Zb]) {
          var7Lifetime1 = this.field_Pb[this.field_Zb].field_Kb;
          for (var8 = this.field_Ob * (this.field_Zb + var7Lifetime1) + this.field_yb; var8 > param4; var8 = var8 - this.field_Ob) {
          }
          this.field_Pb[this.field_Zb].a(param0, this.field_Qb[this.field_Zb].field_z, this.field_Sb + param2, param3, var8, param5 + 0);
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4_int = 0;
        nh var5;
        int var6;
        nh stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        le var4;
        le var7;
        var6 = TetraLink.field_J;
        for (var4_int = param0; this.field_Qb.length > var4_int; var4_int++) {
          var5 = this.field_Qb[var4_int];
          if (var5.field_F == 1) {
            this.a(var4_int, param2, param0 ^ 16, param1);
            stackIn_7_0 = var5;
            stackIn_8_1 = (this.field_Zb == var4_int);
            stackIn_7_0.field_zb = stackIn_8_1;
          }
        }
        if (this.field_Zb != -1) {
          var7 = this.field_Pb[this.field_Zb];
          var4 = var7;
          if (var4 != null) {
            var7.a(0, param1, param2);
          }
        }
        if (this.field_Nb > 0) {
          this.e(144, -1 + this.field_Nb);
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        String var8;
        int var5Lifetime1;
        var7 = TetraLink.field_J;
        if (param0 == this.field_Zb) {
          this.i(20424);
          this.e(144, 0);
        } else {
          if (null != this.field_Pb[param0]) {
            this.i(20424);
            this.e(144, 0);
            this.field_Zb = param0;
            this.field_Yb = this.field_Pb[this.field_Zb];
            ba.a(this.field_Yb, 123);
            this.field_Yb.e(144, 12);
          } else {
            if (this.field_Ub[param0] != -1) {
              var5 = 32768 | this.field_Ub[param0];
              var6 = sf.field_d;
              if (0 == var6 &&
                qb.field_N != null) {
                var6 = 1;
              }
              if (2 == fh.a((byte) 79, var6)) {
                vj.a(var6, param3, 1, 90);
              }
              var8 = (String) null;
              eo.a(-3, var5, param1, ka.field_m, sf.field_d, (String) null);
              pf.a(ka.field_m, sf.field_d, var5, vj.field_o, (byte) 88);
              go.c((byte) 42);
              kj.a((byte) 45);
            } else {
              cm.a((byte) -119);
              go.c((byte) 42);
            }
          }
        }
        var5Lifetime1 = 30 / ((-69 - param2) / 55);
    }

    final static boolean a(int param0, char param1) {
        int var3 = 0;
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TetraLink.field_J;
        try {
          if ((param1 <= 0 ||
            param1 >= 128) &&
            (param1 < 160 ||
            param1 > 255)) {
            if (param1 != 0) {
              var6 = hc.field_o;
              var2 = var6;
              for (var3 = 0; var6.length > var3; var3++) {
                var4 = var6[var3];
                if (~var4 == ~param1) {
                  return true;
                }
              }
            }
            if (param0 != 128) {
              le.j(100);
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2_ref), "le.A(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean c(boolean param0) {
        int var2;
        nh[] var3;
        int var4;
        nh var5;
        int var6;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_8_1 = 0;
        int stackIn_16_0 = 0;
        var6 = TetraLink.field_J;
        var2 = param0 ? 1 : 0;
        var3 = this.field_Qb;
        var4 = 0;
        while (var3.length > var4) {
          var5 = var3[var4];
          stackIn_5_0 = var2;
          stackIn_5_1 = -1;
          if (stackIn_5_1 == ~var5.field_F) {
            stackIn_8_1 = 0;
          } else {
            stackIn_8_1 = 1;
          }
          var2 = stackIn_5_0 | stackIn_8_1;
          var4++;
        }
        if (var2 == 0 &&
          this.field_Zb != -1 &&
          this.field_Pb[this.field_Zb] != null) {
          stackIn_16_0 = (!this.field_Pb[this.field_Zb].c(false)) ? 0 : 1;
          var2 = stackIn_16_0;
        }
        return var2 != 0;
    }

    private final void e(int param0, int param1) {
        int var5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = TetraLink.field_J;
        if (param0 != 144) {
          return;
        }
        this.field_Nb = param1;
        for (var5 = 0; this.field_Kb > var5; var5++) {
          var3 = var5 * this.field_Ob;
          var4 = this.field_Nb * this.field_Nb;
          this.field_Qb[var5].field_yb = (var3 * (144 - var4) + (-this.field_z + this.field_Rb) * var4) / 144;
        }
    }

    final boolean b(int param0, int param1, int param2) {
        int var7 = 0;
        int var8 = TetraLink.field_J;
        int var5 = -33 / ((-63 - param0) / 34);
        int var4 = dg.field_e == 85 ? 1 : 0;
        if (null != this.field_Yb) {
          if (var4 != 0 &&
            this.field_Yb.field_Zb == -1) {
            this.i(20424);
            this.e(144, 0);
            return true;
          }
          return this.field_Yb.b(-97, param1, param2);
        }
        if (this.field_Yb == null && gl.field_o == this &&
          var4 != 0) {
          go.c((byte) 42);
          return true;
        }
        int var6 = tb.field_m;
        if (0 < var6) {
          if (var6 == tk.field_a) {
            var6 = 63;
          }
          for (var7 = 0; var7 < this.field_Wb.length; var7++) {
            if (this.field_Wb[var7] == var6) {
              this.a(var7, param1, -126, param2);
              return true;
            }
          }
        }
        return false;
    }

    final void i(int param0) {
        int var3 = 0;
        nh var4 = null;
        int var5 = TetraLink.field_J;
        nh[] var6 = this.field_Qb;
        nh[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          var4.field_zb = false;
          var4.field_F = 0;
        }
        if (param0 != 20424) {
          this.c(true);
        }
        if (null != this.field_Yb) {
          this.field_Yb.i(20424);
          this.field_Yb.b(false);
        }
        this.field_Yb = null;
        this.field_Zb = -1;
        this.e(144, 12);
    }

    final int h(int param0) {
        if (param0 != 0) {
          return -83;
        }
        return this.field_Sb + (null == this.field_Yb ? 0 : this.field_Yb.h(0));
    }

    final static int d(int param0, int param1) {
        if (param1 != -28583) {
          le.d(1, -44);
        }
        param0 = param0 & 8191;
        if (param0 >= 4096) {
          return param0 >= 6144 ? -km.field_n[-param0 + 8192] : -km.field_n[param0 - 4096];
        }
        return param0 >= 2048 ? km.field_n[4096 - param0] : km.field_n[param0];
    }

    static {
        field_Lb = "You have entered another game.";
        field_Vb = "Full";
    }
}
