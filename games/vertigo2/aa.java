/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa extends cr {
    private int[] field_Ob;
    private int field_Rb;
    static int[] field_Jb;
    private aa field_Ib;
    private char[] field_Hb;
    private int field_Pb;
    static int field_Vb;
    private int field_Tb;
    private int field_Mb;
    private aa[] field_Wb;
    private int field_Ub;
    private int field_Qb;
    static String[] field_Sb;
    private nk[] field_Lb;
    private int field_Kb;
    private int field_Nb;

    final boolean a(int param0, boolean param1, int param2) {
        int var6 = 0;
        int var7 = Vertigo2.field_L ? 1 : 0;
        int var4 = de.field_f == 85 ? 1 : 0;
        if (null != this.field_Ib) {
          if (var4 != 0 &&
            this.field_Ib.field_Ub == -1) {
            this.a((byte) 34);
            this.c(0, 0);
            return true;
          }
          return this.field_Ib.a(param0, false, param2);
        }
        if (null == this.field_Ib &&
          ji.field_n == this &&
          var4 != 0) {
          bm.g(0);
          return true;
        }
        int var5 = ji.field_r;
        if (var5 > 0) {
          if (v.field_c == var5) {
            var5 = 63;
          }
          for (var6 = 0; this.field_Hb.length > var6; var6++) {
            if (this.field_Hb[var6] == var5) {
              this.a(var6, param2, 32768, param0);
              return true;
            }
          }
        }
        if (param1) {
          this.a((byte) -1);
        }
        return false;
    }

    aa(long param0, cr param1, cr param2, cr param3, aa[] param4, int[] param5, String[] param6, char[] param7) {
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
        cc var17 = null;
        cc var18 = null;
        this.field_Ub = -1;
        try {
          this.field_Hb = param7;
          this.field_Wb = param4;
          this.field_Ob = param5;
          this.field_Tb = this.field_Ob.length;
          var17 = param3.field_z;
          var18 = var17;
          this.field_Mb = 2 + var18.field_z + var18.field_M;
          this.field_Rb = this.field_Mb * this.field_Tb;
          this.field_Lb = new nk[this.field_Tb];
          this.field_Nb = 0;
          var11 = "<col=999999>";
          var12 = "</col>";
          for (var13 = 0; var13 < this.field_Tb; var13++) {
            if (0 < this.field_Hb[var13]) {
              param6[var13] = var11 + bj.a(0, this.field_Hb[var13]).toUpperCase() + ": " + var12 + param6[var13];
            }
            var14 = null;
            if (this.field_Wb[var13] != null ||
              -1 == this.field_Ob[var13]) {
              var14 = fm.field_g;
            }
            this.field_Lb[var13] = new nk(0L, param2, (cr) null, param3, (er) (var14), param6[var13]);
            this.b(this.field_Lb[var13], 118);
            var15 = var17.c(param6[var13]);
            if (var15 > this.field_Nb) {
              this.field_Nb = var15;
            }
          }
          this.field_Nb = this.field_Nb + (fm.field_g.field_x + 10);
          this.c(0, 12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("aa.<init>(").append(param0).append(',');
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
          throw wn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7;
        int var8;
        int var9;
        int var10;
        int var8Lifetime1;
        var10 = Vertigo2.field_L ? 1 : 0;
        var7 = 22 % ((-86 - param5) / 40);
        this.field_Qb = param3 * 2 + this.field_Nb;
        this.a(107, this.field_Qb, this.field_Rb, param0 - this.field_Rb, param4);
        if (param1 != this.field_Kb) {
          this.field_Kb = param1;
          this.c(0, this.field_Pb);
        }
        for (var8 = 0; var8 < this.field_Tb; var8++) {
          this.field_Lb[var8].a(this.field_Lb[var8].field_N, this.field_Qb, param2, this.field_Mb, param3, 1, 0);
        }
        if (this.field_Ub != -1 &&
          this.field_Wb[this.field_Ub] != null) {
          var8Lifetime1 = this.field_Wb[this.field_Ub].field_Tb;
          for (var9 = this.field_N + this.field_Mb * (this.field_Ub + var8Lifetime1); param0 < var9; var9 = var9 - this.field_Mb) {
          }
          this.field_Wb[this.field_Ub].a(var9, this.field_Lb[this.field_Ub].field_C, param2, param3, param4 + this.field_Qb, 122);
        }
    }

    private final void c(int param0, int param1) {
        int var5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        this.field_Pb = param1;
        for (var5 = param0; this.field_Tb > var5; var5++) {
          var3 = this.field_Mb * var5;
          var4 = this.field_Pb * this.field_Pb;
          this.field_Lb[var5].field_N = ((-this.field_C + this.field_Kb) * var4 + var3 * (-var4 + 144)) / 144;
        }
    }

    final void a(byte param0) {
        int var3 = 0;
        nk var4 = null;
        int var5 = Vertigo2.field_L ? 1 : 0;
        nk[] var6 = this.field_Lb;
        nk[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
          var4 = var6[var3];
          var4.field_tb = 0;
          var4.field_V = false;
        }
        if (param0 != 34) {
          this.a(-5, -11, -120, 53);
        }
        if (null != this.field_Ib) {
          this.field_Ib.a((byte) 34);
          this.field_Ib.c(2);
        }
        this.field_Ib = null;
        this.field_Ub = -1;
        this.c(param0 ^ 34, 12);
    }

    final int k(int param0) {
        if (param0 != 12282) {
          this.field_Pb = 32;
        }
        return this.field_Qb + (this.field_Ib != null ? this.field_Ib.k(12282) : 0);
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        String var8;
        var7 = Vertigo2.field_L ? 1 : 0;
        if (this.field_Ub != param0) {
          if (this.field_Wb[param0] != null) {
            this.a((byte) 34);
            this.c(0, 0);
            this.field_Ub = param0;
            this.field_Ib = this.field_Wb[this.field_Ub];
            bq.a(this.field_Ib, -1);
            this.field_Ib.c(0, 12);
          } else {
            if (this.field_Ob[param0] == -1) {
              or.b((byte) 110);
              bm.g(0);
            } else {
              var5 = this.field_Ob[param0] | 32768;
              var6 = ui.field_g;
              if (var6 == 0 &&
                null != gd.field_j) {
                var6 = 1;
              }
              if (ab.a(0, var6) == 2) {
                cf.a(var6, 1, param3, (byte) 119);
              }
              var8 = (String) null;
              tf.a(ui.field_g, ea.field_b, 47, (String) null, param1, var5);
              ug.a(ui.field_g, param2 - 32771, var5, ie.field_Nb, ea.field_b);
              bm.g(param2 - 32768);
              kk.a((byte) 43);
            }
          }
        } else {
          this.a((byte) 34);
          this.c(param2 - 32768, 0);
        }
        if (param2 != 32768) {
          this.field_Wb = (aa[]) null;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4_int = 0;
        nk var5;
        int var6;
        nk stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        aa var4;
        aa var7;
        var6 = Vertigo2.field_L ? 1 : 0;
        for (var4_int = 0; var4_int < this.field_Lb.length; var4_int++) {
          var5 = this.field_Lb[var4_int];
          if (1 == var5.field_tb) {
            this.a(var4_int, param0, 32768, param2);
            stackIn_7_0 = var5;
            stackIn_8_1 = (this.field_Ub == var4_int);
            stackIn_7_0.field_V = stackIn_8_1;
          }
        }
        if (param1 != 538) {
          this.a((byte) -37);
        }
        if (this.field_Ub != -1) {
          var7 = this.field_Wb[this.field_Ub];
          var4 = var7;
          if (var4 != null) {
            var7.a(param0, 538, param2);
          }
        }
        if (this.field_Pb > 0) {
          this.c(0, -1 + this.field_Pb);
        }
    }

    public static void m(int param0) {
        field_Jb = null;
        if (param0 != -29238) {
          aa.m(73);
        }
        field_Sb = null;
    }

    final boolean l(int param0) {
        int var4 = 0;
        nk var5 = null;
        int var6 = Vertigo2.field_L ? 1 : 0;
        int var2 = 0;
        nk[] var3 = this.field_Lb;
        for (var4 = param0; var3.length > var4; var4++) {
          var5 = var3[var4];
          var2 = var2 | (0 != var5.field_tb ? 1 : 0);
        }
        if (var2 == 0 && this.field_Ub != -1 &&
          this.field_Wb[this.field_Ub] != null) {
          var2 = this.field_Wb[this.field_Ub].l(0) ? 1 : 0;
        }
        return var2 != 0;
    }

    static {
        field_Jb = new int[]{7, 28};
        field_Sb = new String[]{"Block", "Fan", "Portal", "Glue", "Barrier", "Trap", "Bomb", "Cracked", "Puller", "Pusher", "Metal", "Phased"};
    }
}
