/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq extends ana {
    private boolean field_v;
    private taa field_A;
    static int field_z;
    static String field_G;
    static boolean field_x;
    private int field_C;
    static kv field_E;
    private ct field_D;
    private int field_y;
    private int field_B;
    private int field_H;
    private int field_w;
    private ad field_F;

    public static void b(boolean param0) {
        field_G = null;
        field_E = null;
        if (param0) {
          gq.a(false, -86);
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 != 19626) {
          return;
        }
        nw.a(false, param0, (byte) 85);
    }

    gq(gj param0, ct param1) {
        super(param0, param1);
        bj var4 = null;
        this.field_v = false;
        try {
          this.field_D = param1;
          var4 = (bj) (this.field_D.field_o.b((byte) 90));
          this.field_F = var4.field_h.a(-27449, this.field_q);
          this.field_y = -this.field_F.field_s.field_x + var4.field_i;
          this.field_w = var4.field_l - this.field_F.field_s.field_J;
          this.field_H = (int)Math.sqrt((double)((this.field_w * this.field_w + this.field_y * this.field_y) * 100));
          this.field_C = (int)Math.sqrt((double)(256 * (this.field_y * this.field_y + this.field_w * this.field_w)));
          this.field_A = new taa(this.field_q, this.field_F);
          this.a(27799, this.field_A);
          this.field_B = 25 + this.field_H;
          this.field_F.field_o = 0;
          this.field_F.field_r = 0;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "gq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void e(byte param0) {
        if (param0 == 49) {
          this.d(6);
          this.f((byte) 107);
          this.field_F.field_o = 0;
          this.field_F.field_k = 0;
          this.field_F.field_r = 0;
          return;
        }
    }

    final boolean c(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        if (this.field_A.a((byte) -106)) {
          return false;
        }
        if (this.field_H + 12 <= this.field_B) {
          fieldTemp$0 = this.field_B - 1;
          this.field_B = this.field_B - 1;
          if (fieldTemp$0 > 0) {
            if (this.field_B < this.field_H) {
              var2 = this.field_H >> 1;
              this.field_F.field_r = (-this.field_B + this.field_H) * (this.field_w << 16) / this.field_H;
              this.field_F.field_k = this.field_C * (4 * (this.field_B * (this.field_H - this.field_B))) / (this.field_H * this.field_H);
              if (var2 < -10 + this.field_H) {
                var2 = this.field_H - 10;
              }
              this.field_F.field_o = (this.field_y << 16) * (-this.field_B + this.field_H) / this.field_H;
              this.field_q.field_s.a(this.field_F, 106);
              var3 = 85 % ((71 - param0) / 47);
              return false;
            }
            return false;
          }
          if (-25 > this.field_B) {
            return true;
          }
          if (this.field_B == 0) {
            this.e((byte) 49);
            return false;
          }
          return false;
        }
        if (this.field_v) {
          fieldTemp$1 = this.field_B - 1;
          this.field_B = this.field_B - 1;
          if (fieldTemp$1 > 0) {
            if (this.field_B < this.field_H) {
              var2Lifetime1 = this.field_H >> 1;
              this.field_F.field_r = (-this.field_B + this.field_H) * (this.field_w << 16) / this.field_H;
              this.field_F.field_k = this.field_C * (4 * (this.field_B * (this.field_H - this.field_B))) / (this.field_H * this.field_H);
              if (var2Lifetime1 < -10 + this.field_H) {
                var2Lifetime1 = this.field_H - 10;
              }
              this.field_F.field_o = (this.field_y << 16) * (-this.field_B + this.field_H) / this.field_H;
              this.field_q.field_s.a(this.field_F, 106);
              var3Lifetime1 = 85 % ((71 - param0) / 47);
              return false;
            }
            return false;
          }
          if (-25 <= this.field_B) {
            if (this.field_B == 0) {
              this.e((byte) 49);
            }
            return false;
          }
          return true;
        }
        this.field_v = true;
        aba.a((byte) 89, 34);
        int fieldTemp$2 = this.field_B - 1;
        this.field_B = this.field_B - 1;
        if (fieldTemp$2 > 0) {
          if (this.field_B < this.field_H) {
            var2Lifetime2 = this.field_H >> 1;
            this.field_F.field_r = (-this.field_B + this.field_H) * (this.field_w << 16) / this.field_H;
            this.field_F.field_k = this.field_C * (4 * (this.field_B * (this.field_H - this.field_B))) / (this.field_H * this.field_H);
            if (var2Lifetime2 < -10 + this.field_H) {
              var2Lifetime2 = this.field_H - 10;
            }
            this.field_F.field_o = (this.field_y << 16) * (-this.field_B + this.field_H) / this.field_H;
            this.field_q.field_s.a(this.field_F, 106);
            var3Lifetime2 = 85 % ((71 - param0) / 47);
            return false;
          }
          return false;
        }
        if (-25 <= this.field_B) {
          if (this.field_B == 0) {
            this.e((byte) 49);
          }
          return false;
        }
        return true;
    }

    private final void d(int param0) {
        pp var3;
        ad var4;
        bj var5;
        ad var6;
        int var7;
        aga var8;
        var7 = BachelorFridge.field_y;
        var8 = this.field_D.field_l.a(36, this.field_q.field_h);
        if (var8.i(-114)) {
          return;
        }
        if (param0 != 6) {
          return;
        }
        var3 = (pp) (this.field_D.field_o.b((byte) 90));
        while (var3 != null) {
          var4 = var3.field_h.a(param0 ^ -27455, this.field_q);
          var4.b(-1, 6);
          if (var3 instanceof bj) {
            var5 = (bj) (var3);
            var6 = var5.field_h.a(-27449, this.field_q);
            this.field_q.a(var5.field_i, var6, (byte) 48, var5.field_l);
          } else {
            if (!(var3 instanceof iv)) {
              var3.a(var8, this.field_q.field_h, param0 ^ 10);
            }
          }
          var3 = (pp) (this.field_D.field_o.c(0));
        }
    }

    private final void f(byte param0) {
        pp var3 = null;
        ad var4 = null;
        int var5 = BachelorFridge.field_y;
        aga var2 = this.field_D.field_l.a(70, this.field_q.field_h);
        if (var2.i(-112)) {
          return;
        }
        if (param0 >= 37) {
          var3 = (pp) (this.field_D.field_o.b((byte) 90));
          while (var3 != null) {
            var4 = var3.field_h.a(-27449, this.field_q);
            var4.b(-1, 6);
            if (var3 instanceof iv) {
              var3.a(var2, this.field_q.field_h, 12);
              this.a(27799, new ek(this.field_q, var4, var3.field_f));
            }
            var3 = (pp) (this.field_D.field_o.c(0));
          }
          return;
        }
    }

    static {
    }
}
