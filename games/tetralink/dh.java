/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh implements m {
    private gf[] field_f;
    static jb field_d;
    static String field_c;
    static boolean field_o;
    static wk field_q;
    static int field_l;
    static rm[] field_n;
    static int field_m;
    static kh[] field_g;
    static int field_i;
    static int field_e;
    static hl field_p;
    private je field_b;
    private ah field_j;
    private int field_h;
    private int field_k;
    private int field_a;

    final static void a(int param0) {
        dl var1 = (dl) (oa.field_u.c((byte) 125));
        if (var1 == null) {
          throw new IllegalStateException();
        }
        ra.a(var1.field_t, var1.field_p, var1.field_o);
        if (param0 != -581) {
          return;
        }
        ra.a(var1.field_r, var1.field_q, var1.field_u, var1.field_s);
        var1.field_t = null;
        fm.field_a.a(var1, false);
    }

    public final int b(int param0, int param1) {
        if (param0 != 6092) {
          bh var4 = (bh) null;
          dh.a(false, false, (el) null, (bh) null);
        }
        if (this.field_f[param1] == null) {
          return 0;
        }
        return this.field_f[param1].field_o;
    }

    public final int a(int param0, int param1) {
        if (param1 != 0) {
          this.field_b = (je) null;
        }
        if (!this.field_f[param0].field_p) {
          return 1;
        }
        return 0;
    }

    public final int[] a(float param0, int param1, boolean param2) {
        gf var8 = null;
        gf var7 = this.field_f[param1];
        gf var6 = var7;
        var6 = var7;
        if (!param2) {
          return (int[]) null;
        }
        if (var7 == null) {
        } else {
          if (var7.field_u != null) {
            if (var7.field_n == param0) {
              this.field_b.a(var7, 124);
              return var7.field_u;
            }
            var7.b(false);
            var7.a();
            this.field_a = this.field_a + 1;
          }
          if (!var7.a(param0, this.field_h, this.field_j)) {
            return null;
          }
          if (this.field_a != 0) {
            this.field_a = this.field_a - 1;
          } else {
            var8 = (gf) (this.field_b.c((byte) 126));
            var8.a();
          }
          this.field_b.a(var7, 127);
          return var7.field_u;
        }
        return null;
    }

    final static void a(boolean param0, boolean param1, el param2, bh param3) {
        int var8 = 0;
        el stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        el stackIn_12_0 = null;
        boolean stackIn_13_1 = false;
        el stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        el stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        el stackIn_21_0 = null;
        boolean stackIn_22_1 = false;
        el stackIn_24_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        var9 = TetraLink.field_J;
        try {
          if (param0) {
            param2.field_jc = param3.d((byte) -99);
          }
          param2.field_rc = param3.d((byte) -99);
          param2.field_ic = param3.d((byte) -99);
          if (!param1) {
            field_l = -120;
          }
          var4_int = param3.d((byte) -99);
          stackIn_8_0 = (el) (param2);
          stackIn_9_1 = ((128 & var4_int) != 0);
          stackIn_8_0.field_uc = stackIn_9_1;
          stackIn_12_0 = (el) (param2);
          stackIn_13_1 = (param2.field_uc) && (param2.field_rc > param2.field_jc);
          stackIn_12_0.field_xc = stackIn_13_1;
          stackIn_15_0 = (el) (param2);
          stackIn_16_1 = ((var4_int & 32) != 0);
          stackIn_15_0.field_mc = stackIn_16_1;
          stackIn_18_0 = (el) (param2);
          stackIn_19_1 = ((var4_int & 8) != 0);
          stackIn_18_0.field_kc = stackIn_19_1;
          stackIn_21_0 = (el) (param2);
          stackIn_22_1 = ((64 & var4_int) != 0);
          stackIn_21_0.field_Kb = stackIn_22_1;
          stackIn_24_0 = (el) (param2);
          if (0 != (16 & var4_int)) {
            stackIn_25_1 = 2;
          } else {
            stackIn_25_1 = 1;
          }
          stackIn_24_0.field_Zb = stackIn_25_1;
          stackIn_28_0 = (0 == (var4_int & 4)) ? 0 : 1;
          var5 = stackIn_28_0;
          stackIn_31_0 = ((2 & var4_int) == 0) ? 0 : 1;
          var6 = stackIn_31_0;
          param3.b(param2.field_sc.length, 0, param2.field_sc, 126);
          param2.field_Qb = param3.e(127);
          param2.field_Ac = k.a(0) - (long)param3.f(123);
          if (var5 == 0) {
            param2.field_bc = -1;
          } else {
            param2.field_bc = param3.f(-122);
          }
          param2.field_cc = param3.c(255);
          var7 = param3.field_t;
          param2.field_ec = param3.g((byte) 81);
          if (var6 != 0) {
            param2.field_fc = new String[param2.field_jc];
            param3.field_t = var7;
            for (var8 = 0; var8 < param2.field_jc; var8++) {
              param2.field_fc[var8] = param3.g((byte) 81);
            }
            return;
          }
          param2.field_fc = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_42_0 = var4;
          stackIn_42_1 = new StringBuilder().append("dh.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param3 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        bc var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = TetraLink.field_J;
        try {
          if (!param0) {
            field_q = (wk) null;
          }
          var1 = nd.field_Lb;
          while (jl.a(false)) {
            var1.f(8, (byte) -92);
            fieldTemp$0 = var1.field_t + 1;
            var1.field_t = var1.field_t + 1;
            var2 = fieldTemp$0;
            md.a((byte) -93, var1);
            nd.field_Lb.b(-var2 + var1.field_t, -2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1_ref), "dh.F(" + param0 + ')');
        }
    }

    public final boolean a(byte param0, int param1) {
        if (param0 != -37) {
          field_m = 14;
        }
        return this.field_h == 64 ? true : false;
    }

    public static void a(byte param0) {
        field_n = null;
        field_q = null;
        if (param0 != -55) {
          field_o = false;
        }
        field_g = null;
        field_c = null;
        field_p = null;
        field_d = null;
    }

    public final boolean a(boolean param0, int param1) {
        if (!param0) {
          this.field_b = (je) null;
          return true;
        }
        return true;
    }

    dh(ah param0, ah param1, int param2, int param3) {
        int var7 = 0;
        int[] var5 = null;
        int var6 = 0;
        bh var8 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        this.field_b = new je();
        this.field_h = 128;
        this.field_a = 0;
        try {
          this.field_k = param2;
          this.field_j = param1;
          this.field_a = this.field_k;
          this.field_h = param3;
          var12 = param0.c(0, 0);
          var11 = var12;
          var10 = var11;
          var5 = var10;
          var6 = var12.length;
          this.field_f = new gf[param0.b(-23126, 0)];
          for (var7 = 0; var6 > var7; var7++) {
            var8 = new bh(param0.a(4, var12[var7], 0));
            this.field_f[var12[var7]] = new gf(var8);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("dh.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_c = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_m = 0;
    }
}
