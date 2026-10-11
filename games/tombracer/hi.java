/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends nv {
    private int field_s;
    static String field_p;
    private int field_r;
    private int field_n;
    private int field_o;
    static int[] field_q;

    final void k(int param0) {
        int var5 = 0;
        ffa[] var3;
        fsa var4;
        ffa var6;
        int var7;
        npa var8;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param0 != 5418) {
          this.p((byte) 4);
        }
        this.b(0);
        var8 = this.b(true).field_u;
        var3 = var8.a((byte) -26, this.field_g);
        var4 = this.e(6);
        for (var5 = 0; var3.length > var5; var5++) {
          var6 = var3[var5];
          if (var6.a(-77) &&
            var6 != var4 &&
            io.a(var6.c(param0 - 5435), this.field_g.e(9648), (byte) -55, var6.a((byte) 55), this.field_g.d(param0 - 5415), var6.e(9648), this.field_g.a((byte) 55), this.field_g.c(-21), var6.d(3))) {
            var6.a(100, true, 1, this.field_o, this.field_n, 0);
          }
        }
    }

    private final void b(int param0) {
        int var2 = hua.a((byte) 111, this.field_g.g(-25787) >> 2);
        int var3 = bua.a(param0, this.field_g.g(-25787) >> 2);
        this.field_n = -gqa.a(this.field_r, (byte) 24, var2) + gqa.a(this.field_s, (byte) 24, var3);
        this.field_o = -gqa.a(this.field_s, (byte) 24, var2) + gqa.a(this.field_r, (byte) 24, var3);
    }

    final int a(int param0, int param1) {
        if (param1 > -48) {
          this.field_o = -40;
        }
        return param0;
    }

    public static void c(int param0) {
        field_q = null;
        if (param0 != 6) {
          field_p = (String) null;
        }
        field_p = null;
    }

    final int a(boolean param0) {
        if (param0) {
          return -20;
        }
        return 1;
    }

    final static iu[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7, int param8) {
        int var14 = 0;
        int var9;
        iu[] var10;
        iu[] var11_ref_iu__;
        int var11;
        int var12;
        iu var13;
        int var15;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        var15 = TombRacer.field_G ? 1 : 0;
        var9 = param1 + (param5 + param3);
        var10 = new iu[]{new iu(var9, var9), new iu(param6, var9), new iu(var9, var9), new iu(var9, param6), new iu(64, 64), new iu(var9, param6), new iu(var9, var9), new iu(param6, var9), new iu(var9, var9)};
        if (!param7) {
          hi.c(-100);
        }
        var11_ref_iu__ = var10;
        for (var12 = 0; var11_ref_iu__.length > var12; var12++) {
          var13 = var11_ref_iu__[var12];
          for (var14 = 0; var14 < var13.field_r.length; var14++) {
            var13.field_r[var14] = param2;
          }
        }
        for (var11 = 0; var11 < param5; var11++) {
          for (var12Lifetime1 = 0; var9 > var12Lifetime1; var12Lifetime1++) {
            var10[6].field_r[(-var11 + var9 - 1) * var9 + var12Lifetime1] = param8;
            var10[8].field_r[var9 * (-1 + (-var11 + var9)) + var12Lifetime1] = param8;
            var10[2].field_r[var12Lifetime1 * var9 + var9 - 1 - var11] = param8;
            var10[8].field_r[var12Lifetime1 * var9 + var9 + (-1 - var11)] = param8;
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param5; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var12Lifetime2 < var9; var12Lifetime2++) {
            var10[0].field_r[var9 * var11Lifetime1 + var12Lifetime2] = param4;
            var10[0].field_r[var12Lifetime2 * var9 + var11Lifetime1] = param4;
            if (-var11Lifetime1 + var9 > var12Lifetime2) {
              var10[2].field_r[var9 * var11Lifetime1 + var12Lifetime2] = param4;
              var10[6].field_r[var9 * var12Lifetime2 + var11Lifetime1] = param4;
            }
          }
        }
        for (var11Lifetime2 = 0; var11Lifetime2 < param6; var11Lifetime2++) {
          for (var12Lifetime3 = 0; param5 > var12Lifetime3; var12Lifetime3++) {
            var10[7].field_r[param6 * (-var12Lifetime3 + (var9 - 1)) + var11Lifetime2] = param8;
            var10[5].field_r[-1 + var9 - (var12Lifetime3 - var11Lifetime2 * var9)] = param8;
            var10[1].field_r[param6 * var12Lifetime3 + var11Lifetime2] = param4;
            var10[3].field_r[var9 * var11Lifetime2 + var12Lifetime3] = param4;
          }
        }
        for (var11Lifetime3 = 0; var11Lifetime3 < param6 >> 1; var11Lifetime3++) {
          for (var12Lifetime4 = 0; param1 > var12Lifetime4; var12Lifetime4++) {
            var10[1].field_r[param6 * (-1 - var12Lifetime4 + var9) + var11Lifetime3] = param0;
            var10[3].field_r[var11Lifetime3 * var9 - (var12Lifetime4 - var9 + 1)] = param0;
            var10[7].field_r[param6 * var12Lifetime4 + var11Lifetime3] = param0;
            var10[5].field_r[var9 * var11Lifetime3 + var12Lifetime4] = param0;
          }
        }
        return var10;
    }

    final void h(int param0) {
        if (param0 != 28701) {
          return;
        }
        super.h(param0 + 0);
        this.field_s = -this.field_s;
    }

    hi(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
          this.field_s = bla.a(true, 4, param1.b((byte) 44, 4)) << 16;
          this.field_r = bla.a(true, 4, param1.b((byte) 44, 4)) << 16;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean p(byte param0) {
        if (param0 != 120) {
          kh var3 = (kh) null;
          this.a(false, (kh) null);
        }
        return true;
    }

    final void a(boolean param0, fsa param1) {
        try {
          super.a(param0, param1);
          param1.b((byte) 60, 3);
          this.b(0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hi.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
          param1.a((byte) -125, dqa.a(true, this.field_s >> 16, 4), 4);
          param1.a((byte) -127, dqa.a(true, this.field_r >> 16, 4), 4);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hi.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = new int[]{15, 35, 12, 18, 33};
    }
}
