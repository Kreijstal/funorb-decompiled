/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pm {
    private int[] field_b;
    private bl field_a;
    private bl field_e;
    private hr field_d;
    private ha field_c;

    final static void a(int param0, int param1, hg param2) {
        pl var5 = null;
        int var4 = 0;
        try {
          var5 = as.field_v;
          var5.g(param0, 8);
          var5.field_p = var5.field_p + 1;
          var4 = var5.field_p;
          var5.b((byte) 39, param1);
          var5.b((byte) 99, param2.field_u);
          var5.b((byte) 63, param2.field_q);
          var5.e(48, param2.field_r);
          var5.e(48, param2.field_s);
          var5.e(48, param2.field_n);
          var5.e(48, param2.field_p);
          var5.a(var4, false);
          var5.c(var5.field_p - var4, -13745);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "pm.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0) {
        bl var2 = null;
        bl var2Lifetime1;
        this.field_c.K(this.field_b);
        if (param0 < -40) {
          if (this.field_a != null) {
            var2 = this.field_a;
            this.field_a = this.field_a.field_f;
          } else {
            var2 = new bl();
          }
          var2.a(this.field_e, this.field_b[1], this.field_b[2], this.field_d, -1, this.field_b[3], this.field_b[0]);
          this.field_e = var2;
          return;
        }
        this.field_e = (bl) null;
        if (this.field_a != null) {
          var2Lifetime1 = this.field_a;
          this.field_a = this.field_a.field_f;
        } else {
          var2Lifetime1 = new bl();
        }
        var2Lifetime1.a(this.field_e, this.field_b[1], this.field_b[2], this.field_d, -1, this.field_b[3], this.field_b[0]);
        this.field_e = var2Lifetime1;
    }

    final void a(int param0) {
        bl var3 = null;
        bl var2 = null;
        bl var3Lifetime1;
        bl var2Lifetime1;
        bl var3Lifetime2;
        bl var2Lifetime2;
        if (this.field_d != this.field_e.field_h) {
          this.field_c.b();
          if (null != this.field_e.field_h) {
            this.field_c.a(this.field_e.field_h, true);
          } else {
            this.field_d = this.field_e.field_h;
            this.field_c.KA(this.field_e.field_c, this.field_e.field_b, this.field_e.field_d, this.field_e.field_g);
            var3 = this.field_e;
            var2 = var3;
            this.field_e = this.field_e.field_f;
            if (param0 != 29709) {
              this.a((byte) 28);
            } else {
              var3.field_f = this.field_a;
              this.field_a = var3;
              var3.field_h = null;
              return;
            }
            var3.field_f = this.field_a;
            this.field_a = var3;
            var3.field_h = null;
            return;
          }
          this.field_d = this.field_e.field_h;
          this.field_c.KA(this.field_e.field_c, this.field_e.field_b, this.field_e.field_d, this.field_e.field_g);
          var3Lifetime2 = this.field_e;
          var2Lifetime2 = var3Lifetime2;
          this.field_e = this.field_e.field_f;
          if (param0 != 29709) {
            this.a((byte) 28);
          } else {
            var3Lifetime2.field_f = this.field_a;
            this.field_a = var3Lifetime2;
            var3Lifetime2.field_h = null;
            return;
          }
          var3Lifetime2.field_f = this.field_a;
          this.field_a = var3Lifetime2;
          var3Lifetime2.field_h = null;
          return;
        }
        this.field_c.KA(this.field_e.field_c, this.field_e.field_b, this.field_e.field_d, this.field_e.field_g);
        var3Lifetime1 = this.field_e;
        var2Lifetime1 = var3Lifetime1;
        this.field_e = this.field_e.field_f;
        if (param0 != 29709) {
          this.a((byte) 28);
        } else {
          var3Lifetime1.field_f = this.field_a;
          this.field_a = var3Lifetime1;
          var3Lifetime1.field_h = null;
          return;
        }
        var3Lifetime1.field_f = this.field_a;
        this.field_a = var3Lifetime1;
        var3Lifetime1.field_h = null;
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        this.a((byte) -50);
        this.field_c.T(param3, param1, param4, param2);
        int var6 = -53 / ((param0 + 29) / 57);
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (param0 >= 45) {
          var3 = ic.b(param2, -431);
          var4 = cn.c(0, param2);
          var5 = ic.b(param1, -431);
          var6 = cn.c(0, param1);
          var7 = (int)((long)var5 * (long)var3 >> 16);
          var8 = (int)((long)var6 * (long)var3 >> 16);
          var9 = (int)((long)var5 * (long)var4 >> 16);
          var10 = (int)((long)var4 * (long)var6 >> 16);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
        hg var11 = (hg) null;
        pm.a(-57, 125, (hg) null);
        var3 = ic.b(param2, -431);
        var4 = cn.c(0, param2);
        var5 = ic.b(param1, -431);
        var6 = cn.c(0, param1);
        var7 = (int)((long)var5 * (long)var3 >> 16);
        var8 = (int)((long)var6 * (long)var3 >> 16);
        var9 = (int)((long)var5 * (long)var4 >> 16);
        var10 = (int)((long)var4 * (long)var6 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    pm(ha param0) {
        this.field_b = new int[4];
        this.field_d = null;
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "pm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
