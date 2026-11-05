/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn extends pd {
    private int field_h;
    static String[] field_l;
    private int field_k;
    static byte[][] field_i;
    static sj field_j;
    static String field_m;

    final void a(byte param0) {
        tb.field_d.a(de.field_l, 100, this.field_h * gi.field_m * 48, this.field_k / this.field_h);
        this.field_h = 0;
        this.field_k = 0;
        int var2 = 123 % ((param0 - 29) / 42);
    }

    final pb b(byte param0) {
        if (param0 >= -127) {
          mn.b(true);
        }
        return (pb) ((Object) new ti());
    }

    final static dl[] c(int param0) {
        int var2 = 0;
        int var6 = 0;
        int var7 = 0;
        dl[] var1;
        int var3;
        byte[] var5;
        int[] var6_ref_int__;
        int var8;
        byte[] var9;
        int[] var10;
        byte[] var12;
        int[] var13;
        byte[] var16;
        int[] var17;
        byte[] var21;
        int[] var22;
        var8 = CrazyCrystals.field_B;
        var1 = new dl[mg.field_a];
        for (var2 = param0; var2 < mg.field_a; var2++) {
          var3 = je.field_c[var2] * uo.field_l[var2];
          var21 = ui.field_c[var2];
          if (!rh.field_a[var2]) {
            var10 = new int[var3];
            var22 = var10;
            for (var6 = 0; var6 < var3; var6++) {
              var10[var6] = gh.field_z[pf.b((int) var21[var6], 255)];
            }
            var1[var2] = new dl(km.field_c, bo.field_o, uo.field_k[var2], jm.field_a[var2], uo.field_l[var2], je.field_c[var2], var22);
          } else {
            var16 = ng.field_g[var2];
            var12 = var16;
            var9 = var12;
            var5 = var9;
            var17 = new int[var3];
            var13 = var17;
            var6_ref_int__ = var13;
            for (var7 = 0; var7 < var3; var7++) {
              var6_ref_int__[var7] = hm.a(gh.field_z[pf.b((int) var21[var7], 255)], pf.b((int) var16[var7], 255) << 24);
            }
            var1[var2] = (dl) ((Object) new vi(km.field_c, bo.field_o, uo.field_k[var2], jm.field_a[var2], uo.field_l[var2], je.field_c[var2], var17));
          }
        }
        ok.a(param0 ^ 2188450);
        return var1;
    }

    final static void b(boolean param0) {
        vl.field_f.a((byte) -116);
        vl.field_f = null;
        if (param0) {
          field_l = (String[]) null;
        }
        be.field_d.a((byte) -21);
        be.field_d = null;
        tl.field_a.a((byte) -87);
        tl.field_a = null;
        jo.field_p.a((byte) -96);
        jo.field_p = null;
        sa.field_mb.a((byte) -54);
        sa.field_mb = null;
        io.field_M.a((byte) -98);
        io.field_M = null;
        ec.field_k.a((byte) -43);
        ec.field_k = null;
    }

    public static void c(byte param0) {
        field_l = null;
        field_i = (byte[][]) null;
        field_m = null;
        field_j = null;
        if (param0 != 19) {
          field_j = (sj) null;
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var6 = CrazyCrystals.field_B;
        if (!param0) {
          field_j = (sj) null;
        }
        param2 = param2 + param3;
        while (param2 > param3) {
          pd.field_g[param1] = pd.field_g[param1] + (4 > q.field_a[ma.field_n[param1]].field_c[param3] ? 50 : 100);
          param3++;
        }
    }

    mn() {
        this.field_h = 0;
        this.field_k = 0;
    }

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        RuntimeException var6 = null;
        f stackIn_2_0 = null;
        int stackIn_6_0 = 0;
        f stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_2_0 = (f) null;
            return stackIn_2_0;
          }
          this.field_k = this.field_k + param3;
          this.field_h = this.field_h + 1;
          stackIn_6_0 = (q.field_a[ma.field_n[param1]].field_c[param2] < 4) ? 50 : 100;
          ph.a(stackIn_6_0, (byte) 107, param1, param4);
          stackIn_7_0 = bm.field_g;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("mn.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_l = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_i = new byte[1000][];
        field_j = new sj(0, 2, 2, 1);
        field_m = "All Spiders";
    }
}
