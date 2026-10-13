/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk extends h {
    static String field_G;
    static jp[] field_J;
    static int field_I;
    int field_K;
    static int field_H;

    public sk() {
        super(0, 0, 0, 0, (ub) null, (uh) null);
        this.field_K = 256;
    }

    final static void a(String[] args, int param1, oi param2, int param3, boolean param4, int param5) {
        int var8 = 0;
        GameplayScreen stackIn_10_0 = null;
        boolean stackIn_10_1 = false;
        boolean stackIn_11_2 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int[] var7 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var12 = null;
        int[] var15 = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          fj.field_Ub = null;
          ep.field_i = 23;
          fp.field_z = 57;
          od.field_c = 13;
          if (param5 != -12665) {
            sk.a(122);
          }
          og.field_Wb = 3;
          hg.field_e = 51550 + (hi.field_w.b(102) << 16);
          ek.field_kb = 72;
          qm.field_a = 40;
          tm.field_g = 11;
          var6_int = (1 << param3) - 1;
          var12 = new int[param3];
          var10 = var12;
          var7 = var10;
          for (var8 = 0; param3 > var8; var8++) {
            var7[var8] = hi.field_w.b(97);
          }
          var15 = id.a(hi.field_w, false);
          pe.field_o = new GameplayScreen(args, -1, var6_int, param2, var12, var15);
          pe.field_o.a((byte) 119, param1);
          pe.field_o.field_q = true;
          stackIn_10_0 = pe.field_o;
          stackIn_10_1 = pe.field_o.field_s;
          stackIn_11_2 = (kb.field_Yb >= 2) && (param3 == 1) && (qg.field_t);
          stackIn_10_0.field_s = stackIn_10_1 | stackIn_11_2;
          ng.a(param4, 103, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("sk.E(");
          if (args == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void i(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        int[] var1Lifetime1;
        int var2Lifetime1;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          if (hd.field_d == null) {
            return;
          }
          if (lp.field_rb instanceof km) {
            ((km) (lp.field_rb)).d((byte) 79);
          }
          lp.field_rb = hd.field_d;
          hd.field_d = null;
          kh.field_a = 0;
          if (cc.field_G) {
            cc.field_G = false;
            pe.field_o = null;
          }
          if (param0 > -112) {
            field_J = (jp[]) null;
          }
          if (eb.field_l) {
            fj.field_Ub = null;
            lp.field_wb.clear((byte) -121);
            var9 = mk.field_b;
            var7 = var9;
            var4 = var7;
            var1 = var4;
            for (var2 = 0; var2 < 8; var2++) {
              var9[var2] = 0;
            }
            var10 = pl.field_b;
            var8 = var10;
            var5 = var8;
            var1Lifetime1 = var5;
            var6 = 0;
            var2Lifetime1 = var6;
            while (8 > var6) {
              var10[var6] = 0;
              var6++;
            }
            eb.field_l = false;
          }
          if (dp.field_y) {
            eq.a(7);
            bf.a((byte) 119);
            uc.e(-94);
            dp.field_y = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1_ref), "sk.B(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (param2 != 0) {
          return;
        }
        if (this.field_E == null) {
          return;
        }
        if (0 == this.field_K) {
          return;
        }
        if (256 == this.field_K) {
          this.field_E.a(param0 + this.field_w, param1 + this.field_o, param2, (byte) -11);
          return;
        }
        jp var6 = new jp(this.field_E.field_t, this.field_E.field_s);
        fc.a(-113, var6);
        this.field_E.a(0, 0, param2, param3);
        sc.b(param3 ^ 119);
        var6.b(param1 + this.field_o, param0 + this.field_w, this.field_K);
    }

    public static void a(int param0) {
        if (param0 != 51550) {
          field_G = (String) null;
        }
        field_J = null;
        field_G = null;
    }

    final static l a(byte param0, kl param1) {
        l var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        l stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new l(param1, param1);
          var3 = 30 % ((param0 - 58) / 43);
          wd.field_v.addLast(var2, (byte) 3);
          ob.field_J.b(param1);
          stackIn_1_0 = var2;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_4_0 = var2_ref;
          stackIn_4_1 = new StringBuilder().append("sk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    sk(oc param0) {
        super(param0.field_o, param0.field_w, param0.field_t, param0.field_s, (ub) null, (uh) null);
        try {
          param0.a(this.field_s, 0, 0, (byte) -119, this.field_t);
          this.field_K = 256;
          this.field_E = param0;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "sk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
