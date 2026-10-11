/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de extends ma {
    static int field_M;
    static ph field_W;
    private mm field_T;
    private int field_O;
    static qm field_U;
    static String field_ab;
    private boolean field_S;
    static String field_P;
    private int field_X;
    private int field_Q;
    static int field_R;
    static uf field_V;
    static boolean field_Z;
    private String field_Y;

    de(int param0, int param1, int param2, int param3, ce param4, boolean param5, int param6, int param7, mm param8, int param9, String param10) {
        super(param0, param1, param2, param3, (gl) null, (kg) null);
        boolean stackIn_4_1 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          stackIn_4_1 = (param5);
          this.field_S = stackIn_4_1;
          this.field_X = param9;
          this.field_L = param4;
          this.field_O = param7;
          this.field_T = param8;
          this.field_Y = param10;
          this.field_Q = param6;
          var12_int = -this.field_O + this.field_Q;
          var13 = this.field_T.b(param10, var12_int, this.field_T.field_R) + this.field_O * 2;
          if (var13 > param3) {
            this.b(var13, param2, param0, param1, -16555);
          } else {
            var13 = param3;
          }
          if (!this.field_S) {
            stackIn_10_0 = this.field_Q + this.field_O * 2;
          } else {
            stackIn_10_0 = 0;
          }
          var14 = stackIn_10_0;
          this.field_L.b(-(this.field_O * 2) + param3, param2 - this.field_Q - 3 * this.field_O, var14, this.field_O + (var13 - param3 >> 1), -16555);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("de.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_W = null;
        field_V = null;
        field_P = null;
        field_U = null;
        if (param0 >= -117) {
          field_P = (String) null;
        }
        field_ab = null;
    }

    static int b(int param0, int param1) {
        return param0 | param1;
    }

    final static void a(boolean param0, int param1, String param2, int param3, boolean param4) {
        String stackIn_4_0 = null;
        int stackIn_26_0 = 0;
        String stackIn_26_1 = null;
        boolean stackIn_27_2 = false;
        int stackIn_39_0 = 0;
        int stackIn_40_1 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var7Lifetime1;
        int var9Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        var10 = client.field_A ? 1 : 0;
        try {
          ph.field_Ab = true;
          kk.field_k = param3;
          var11 = param2;
          if (!param4) {
            stackIn_4_0 = me.field_C;
          } else {
            stackIn_4_0 = qn.field_rb;
          }
          var6 = stackIn_4_0;
          if (kk.field_k == 0) {
            var7 = te.a(var11, 116, 480, pj.field_N, wf.field_q);
            var8 = var7 + 3;
            ug.field_q = new int[var8];
            ef.field_M = new String[var8];
            for (var9 = 0; var9 < var8; var9++) {
              ug.field_q[var9] = -1;
            }
            ef.field_T = new int[2];
            for (var9 = 0; var9 < var7; var9++) {
              ef.field_M[var9] = pj.field_N[var9];
            }
            ef.field_M[-3 + var8] = "";
            ef.field_M[var8 - 2] = var6;
            ug.field_q[var8 - 2] = 0;
            ef.field_T[0] = 1;
            ef.field_M[-1 + var8] = og.field_gb;
            ug.field_q[-1 + var8] = 1;
            ef.field_T[1] = 2;
          } else {
            if (kk.field_k != 1) {
              throw new IllegalArgumentException();
            }
            var7 = te.a(var11, 104, 480, pj.field_N, wf.field_q);
            var8 = 2 + var7;
            ug.field_q = new int[var8];
            ef.field_M = new String[var8];
            for (var9 = 0; var9 < var8; var9++) {
              ug.field_q[var9] = -1;
            }
            ef.field_T = new int[1];
            for (var9 = 0; var9 < var7; var9++) {
              ef.field_M[var9] = pj.field_N[var9];
            }
            ef.field_M[var8 - 2] = "";
            ef.field_M[-1 + var8] = og.field_gb;
            ug.field_q[-1 + var8] = 0;
            ef.field_T[0] = 2;
          }
          wj.field_Jb.field_l = ef.field_T.length;
          var7Lifetime1 = 0;
          var8Lifetime1 = 0;
          if (param1 != -5540) {
            return;
          }
          while (var8Lifetime1 < ef.field_M.length) {
            stackIn_26_0 = 0;
            stackIn_26_1 = ef.field_M[var8Lifetime1];
            stackIn_27_2 = !(0 > ug.field_q[var8Lifetime1]);
            var9Lifetime1 = qb.a(stackIn_26_0, stackIn_26_1, stackIn_27_2);
            if (ug.field_q[var8Lifetime1] != -1) {
              var9Lifetime1 = var9Lifetime1 + ba.field_d * 2;
            }
            if (var9Lifetime1 > var7Lifetime1) {
              var7Lifetime1 = var9Lifetime1;
            }
            var8Lifetime1++;
          }
          ac.field_A = (je.field_c + le.field_t << 1) * wj.field_Jb.field_l;
          fb.field_f = -(var7Lifetime1 >> 1) + (af.field_f + var7Lifetime1);
          ad.field_a = af.field_f - (var7Lifetime1 >> 1);
          for (var8Lifetime2 = 0; var8Lifetime2 < ef.field_M.length; var8Lifetime2++) {
            stackIn_39_0 = ac.field_A;
            if (ug.field_q[var8Lifetime2] < 0) {
              stackIn_40_1 = ma.field_I;
            } else {
              stackIn_40_1 = vb.field_V;
            }
            ac.field_A = stackIn_39_0 + stackIn_40_1;
          }
          rn.field_d = kk.field_e - (ac.field_A >> 1);
          wj.field_Jb.a(0, 0, pm.a(pm.field_f, -2141435999, bh.field_g), param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_45_0 = var5;
          stackIn_45_1 = new StringBuilder().append("de.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param0 + this.field_u;
        int var6 = this.field_D + param3;
        if (param1 > -103) {
          return;
        }
        super.a(param0, -109, param2, param3);
        if (param2 != 0) {
          return;
        }
        int var7 = this.field_S ? this.field_t + (-this.field_Q - 2 * this.field_O) : 0;
        this.field_T.a(this.field_Y, var7 + var5 + this.field_O, var6 + this.field_O, -this.field_O + this.field_Q, this.field_y - 2 * this.field_O, this.field_X, -1, this.field_S ? 0 : 2, 1, this.field_T.field_R);
    }

    final static ck[] c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = client.field_A ? 1 : 0;
        ck[] var1 = new ck[ec.field_g];
        for (var2 = 0; var2 < ec.field_g; var2++) {
          var3 = hc.field_c[var2] * tm.field_a[var2];
          var4 = tc.field_Nb[var2];
          var5 = new int[var3];
          for (var6 = 0; var6 < var3; var6++) {
            var5[var6] = mb.field_d[lb.a((int) var4[var6], 255)];
          }
          var1[var2] = new ck(ed.field_f, i.field_d, sg.field_d[var2], fh.field_a[var2], tm.field_a[var2], hc.field_c[var2], var5);
        }
        oa.a(126);
        if (param0) {
          field_W = (ph) null;
        }
        return var1;
    }

    final String c(byte param0) {
        int var2 = this.field_L.field_q ? 1 : 0;
        this.field_L.field_q = this.field_q;
        String var3 = this.field_L.c(param0);
        this.field_L.field_q = var2 != 0 ? true : false;
        return var3;
    }

    static {
        field_ab = "If you do nothing the game will revert to normal view in <%0> second.";
        field_P = "Instructions";
        field_Z = false;
        field_U = new qm(12, 0, 1, 0);
    }
}
