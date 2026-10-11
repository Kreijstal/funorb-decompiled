/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm extends ana {
    private cja field_C;
    private taa field_E;
    private int field_v;
    static int field_z;
    private int field_H;
    private int field_F;
    static int field_D;
    private int field_G;
    private int field_w;
    private boolean field_A;
    private int field_x;
    private cq field_y;
    private int field_B;

    private final void e(byte param0) {
        int var2 = 10 % ((-10 - param0) / 39);
        if (null != this.field_y) {
          id.a(127, this.field_y);
        }
    }

    final boolean c(byte param0) {
        je var5 = null;
        uea var2_ref_uea = null;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        if (this.field_m.a((byte) -106)) {
          return false;
        }
        if (this.field_E.a((byte) -106)) {
          return false;
        }
        if (null == this.field_y) {
          var5 = je.a(rt.field_a[20], 256, 192);
          var5.d(-1);
          this.field_y = tw.a(var5, (byte) -36);
        }
        int fieldTemp$0 = this.field_F + 1;
        this.field_F = this.field_F + 1;
        if (this.field_H <= fieldTemp$0) {
          this.e((byte) -111);
          return true;
        }
        if (this.field_F == -25) {
          var2_ref_uea = new uea(this.field_q, this.field_C.field_s, this.field_C.field_u, 16777215);
          ((kj) ((Object) var2_ref_uea)).a(0);
        }
        int var2 = 38 % ((param0 - 71) / 47);
        if (this.field_F != 0) {
          var3 = this.field_G + this.field_F * this.field_v;
          var4 = this.field_x + this.field_B * this.field_F;
          this.field_q.field_s.c(18, -var4 + 240, -var3 + 320);
          return false;
        }
        this.d(58);
        jja.a(192, -1, 3);
        var3Lifetime1 = this.field_G + this.field_F * this.field_v;
        var4Lifetime1 = this.field_x + this.field_B * this.field_F;
        this.field_q.field_s.c(18, -var4Lifetime1 + 240, -var3Lifetime1 + 320);
        return false;
    }

    private final void d(int param0) {
        if (param0 > 19) {
          this.field_C.a(this.field_q.field_h, false);
          return;
        }
        this.field_E = (taa) null;
        this.field_C.a(this.field_q.field_h, false);
    }

    mm(gj param0, cja param1) {
        super(param0, param1);
        aj var6 = null;
        int var4 = 0;
        int var5 = 0;
        try {
          this.field_C = param1;
          var6 = this.field_q.field_s.a(this.field_C.field_u, (byte) -128, this.field_C.field_s);
          this.field_x = var6.field_a - this.field_q.field_s.field_B;
          this.field_G = -this.field_q.field_s.field_b + var6.field_c;
          this.field_A = (1 & m.field_a.nextInt()) == 0 ? true : false;
          this.field_B = 2;
          this.field_v = this.field_B << 1;
          if (this.field_A) {
            this.field_w = (this.field_C.field_u + 7) * 64 / this.field_v;
            this.field_H = (448 + 64 * (this.field_q.field_h.field_B - this.field_C.field_u)) / this.field_v;
          } else {
            this.field_w = 64 * (7 + this.field_C.field_s) / this.field_v;
            this.field_H = (64 * (-this.field_C.field_s + this.field_q.field_h.field_z) + 448) / this.field_v;
          }
          if (this.field_A) {
            this.field_v = -this.field_v;
          }
          this.field_F = -this.field_w;
          var4 = this.field_G - this.field_w * this.field_v;
          var5 = -(this.field_B * this.field_w) + this.field_x;
          this.field_E = new taa(this.field_q, 0, 0);
          this.field_E.field_k = 320 - var4;
          this.field_E.field_j = -var5 + 240;
          this.a(27799, this.field_E);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "mm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0) {
        int var7 = 0;
        int var8 = 0;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var7Lifetime1Lifetime1;
        if (param0 >= -10) {
          this.c(-72);
        }
        int var2 = this.field_F * this.field_v + this.field_G;
        var2 = var2 + this.field_q.field_s.field_b;
        int var3 = this.field_B * this.field_F + this.field_x;
        var3 = var3 + this.field_q.field_s.field_B;
        int var4 = this.field_F >> 3 & 1;
        int var5 = (via.a(this.field_F << 8, (byte) 102) >> 13) + 64;
        int var6 = 65536;
        if (this.field_F > -64 &&
          this.field_F < 64) {
          var7 = this.field_F < 0 ? 64 + this.field_F : 64 - this.field_F;
          var6 = var6 - (var7 * var7 << 4);
        }
        var5 = var5 * var6 >> 16;
        if (this.field_F < 0) {
          var7Lifetime1 = od.field_w[this.field_C.field_q].field_f;
          if (var7Lifetime1 >= 4) {
            var7Lifetime1 -= 4;
          } else {
            ve.field_m[var7Lifetime1][(this.field_q.field_L >> 2) % 25].e(var2 + 44, -var5 + var3);
            var7Lifetime1 = -(var5 >> 2) + 64;
            var8 = 48 - (var5 >> 2);
            nk.a(this.field_q.field_s.field_y, -(var7Lifetime1 >> 1) + 64 + var2, 24 + (var3 - (var8 >> 1)), var7Lifetime1, var8);
            if (!this.field_A) {
              ho.field_j[var4].c(var2, -45 + var3 - var5);
              return;
            }
            ho.field_j[var4].a(var2, -var5 + var3 - 45);
            return;
          }
          ve.field_m[var7Lifetime1][(this.field_q.field_L >> 2) % 25].e(var2 + 44, -var5 + var3);
          var7Lifetime1Lifetime1 = -(var5 >> 2) + 64;
          var8Lifetime2 = 48 - (var5 >> 2);
          nk.a(this.field_q.field_s.field_y, -(var7Lifetime1Lifetime1 >> 1) + 64 + var2, 24 + (var3 - (var8Lifetime2 >> 1)), var7Lifetime1Lifetime1, var8Lifetime2);
          if (!this.field_A) {
            ho.field_j[var4].c(var2, -45 + var3 - var5);
            return;
          }
          ho.field_j[var4].a(var2, -var5 + var3 - 45);
          return;
        }
        var7Lifetime2 = -(var5 >> 2) + 64;
        var8Lifetime1 = 48 - (var5 >> 2);
        nk.a(this.field_q.field_s.field_y, -(var7Lifetime2 >> 1) + 64 + var2, 24 + (var3 - (var8Lifetime1 >> 1)), var7Lifetime2, var8Lifetime1);
        if (!this.field_A) {
          ho.field_j[var4].c(var2, -45 + var3 - var5);
          return;
        }
        ho.field_j[var4].a(var2, -var5 + var3 - 45);
    }

    static {
    }
}
