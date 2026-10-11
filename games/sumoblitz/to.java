/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class to extends ms {
    private int field_r;
    private int field_l;
    private int field_k;
    private int field_p;
    private boolean field_v;
    private int field_n;
    static hr[] field_s;
    private int field_u;
    private int field_q;
    private String field_o;
    static hr field_m;
    static byte[] field_t;

    final boolean a(int param0) {
        int fieldTemp$0 = 0;
        if (param0 == 80) {
          fieldTemp$0 = this.field_u + 1;
          this.field_u = this.field_u + 1;
          return this.field_l + this.field_n + this.field_r < fieldTemp$0 ? true : false;
        }
        field_m = (hr) null;
        int fieldTemp$1 = this.field_u + 1;
        this.field_u = this.field_u + 1;
        return this.field_l + this.field_n + this.field_r < fieldTemp$1 ? true : false;
    }

    final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != -70) {
          to.c(false);
        }
        if (this.field_r > this.field_u) {
          var2 = (this.field_u << 8) / this.field_r;
          if (var2 > 255) {
            var2 = 255;
          }
          var3 = 80 * (this.field_r - this.field_u) / this.field_r;
          if (this.field_v) {
            qv.field_k.a(100, 5023231 | var2 << 24, 0, 320, 160, (int[]) null, (hr[]) null, this.field_p + var3, -1, 0, 0, -8787, this.field_o, (aa) null, 1, 1);
            uq.field_a.a(100, var2 << 24 | 16777215, 0, 320, 160, (int[]) null, (hr[]) null, this.field_p + var3, -1, 0, 0, -8787, this.field_o, (aa) null, 1, 1);
          } else {
            qv.field_k.a(this.field_o, var2 << 24 | 5023231, -1, this.field_p + var3, this.field_k, 0);
            uq.field_a.a(this.field_o, var2 << 24 | this.field_q, -1, var3 + this.field_p, this.field_k, 0);
          }
          return;
        }
        if (this.field_u < this.field_n + this.field_r) {
          var2Lifetime1 = (this.field_u << 8) / this.field_r;
          if (var2Lifetime1 > 255) {
            var2Lifetime1 = 255;
          }
          if (!this.field_v) {
            qv.field_k.a(this.field_o, 5023231 | var2Lifetime1 << 24, -1, this.field_p, this.field_k, param0 + 70);
            uq.field_a.a(this.field_o, this.field_q | var2Lifetime1 << 24, -1, this.field_p, this.field_k, 0);
          } else {
            qv.field_k.a(100, var2Lifetime1 << 24 | 5023231, 0, 320, 160, (int[]) null, (hr[]) null, this.field_p, -1, 0, 0, -8787, this.field_o, (aa) null, 1, 1);
            uq.field_a.a(100, 16777215 | var2Lifetime1 << 24, 0, 320, 160, (int[]) null, (hr[]) null, this.field_p, -1, 0, 0, -8787, this.field_o, (aa) null, 1, 1);
          }
          return;
        }
        var2Lifetime2 = -this.field_n + (this.field_u - this.field_r);
        var3Lifetime1 = (-var2Lifetime2 + this.field_l << 8) / this.field_l;
        if (var3Lifetime1 <= 0) {
          return;
        }
        if (var3Lifetime1 > 255) {
          var3Lifetime1 = 255;
        }
        var4 = 80 * var2Lifetime2 / this.field_l;
        if (!this.field_v) {
          qv.field_k.a(this.field_o, 5023231 | var3Lifetime1 << 24, -1, -var4 + this.field_p, this.field_k, 0);
          uq.field_a.a(this.field_o, var3Lifetime1 << 24 | this.field_q, -1, this.field_p - var4, this.field_k, param0 ^ -70);
        } else {
          qv.field_k.a(100, 5023231 | var3Lifetime1 << 24, 0, 320, 160, (int[]) null, (hr[]) null, -var4 + this.field_p, -1, 0, 0, param0 - 8717, this.field_o, (aa) null, 1, 1);
          uq.field_a.a(100, var3Lifetime1 << 24 | 16777215, 0, 320, 160, (int[]) null, (hr[]) null, -var4 + this.field_p, -1, 0, 0, -8787, this.field_o, (aa) null, 1, 1);
        }
    }

    public static void c(boolean param0) {
        field_t = null;
        field_m = null;
        field_s = null;
        if (param0) {
          field_m = (hr) null;
        }
    }

    to(String param0, int param1, int param2, int param3) {
        try {
          this.field_u = 0;
          this.field_l = 80;
          this.field_n = 20;
          this.field_p = param3;
          this.field_k = param2;
          this.field_r = 20;
          this.field_q = param1;
          this.field_o = param0;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "to.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    to(String param0, int param1) {
        try {
          this.field_l = 80;
          this.field_k = 320;
          this.field_n = 0;
          this.field_p = 240;
          this.field_r = 20;
          this.field_q = param1;
          this.field_o = param0;
          this.field_u = 0;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "to.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_t = new byte[520];
    }
}
