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
        if (!(null == this.field_y)) {
            id.a(127, this.field_y);
        }
    }

    final boolean c(byte param0) {
        int fieldTemp$1 = 0;
        uea var2_ref_uea;
        int var2;
        int var3;
        int var4;
        je var5;
        if (!this.field_m.a((byte) -106)) {
          if (!this.field_E.a((byte) -106)) {
            L0: {
              if (null != this.field_y) {
                break L0;
              } else {
                var5 = je.a(rt.field_a[20], 256, 192);
                var5.d(-1);
                this.field_y = tw.a(var5, (byte) -36);
                break L0;
              }
            }
            fieldTemp$1 = this.field_F + 1;
            this.field_F = this.field_F + 1;
            if (this.field_H > fieldTemp$1) {
              L1: {
                if (24 == (this.field_F ^ -1)) {
                  var2_ref_uea = new uea(this.field_q, this.field_C.field_s, this.field_C.field_u, 16777215);
                  ((kj) ((Object) var2_ref_uea)).a(0);
                  break L1;
                } else {
                  break L1;
                }
              }
              var2 = 38 % ((param0 - 71) / 47);
              if (this.field_F == 0) {
                this.d(58);
                jja.a(192, -1, 3);
                var3 = this.field_G - -(this.field_F * this.field_v);
                var4 = this.field_x - -(this.field_B * this.field_F);
                this.field_q.field_s.c(18, -var4 + 240, -var3 + 320);
                return false;
              } else {
                var3 = this.field_G - -(this.field_F * this.field_v);
                var4 = this.field_x - -(this.field_B * this.field_F);
                this.field_q.field_s.c(18, -var4 + 240, -var3 + 320);
                return false;
              }
            } else {
              this.e((byte) -111);
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final void d(int param0) {
        if (param0 <= 19) {
          this.field_E = (taa) null;
          this.field_C.a(this.field_q.field_h, false);
          return;
        } else {
          this.field_C.a(this.field_q.field_h, false);
          return;
        }
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
            this.field_A = -1 == (1 & m.field_a.nextInt() ^ -1) ? true : false;
            this.field_B = 2;
            this.field_v = this.field_B << -337509823;
            if (this.field_A) {
                this.field_w = (this.field_C.field_u + 7) * 64 / this.field_v;
                this.field_H = (448 + 64 * (this.field_q.field_h.field_B + -this.field_C.field_u)) / this.field_v;
            } else {
                this.field_w = 64 * (7 - -this.field_C.field_s) / this.field_v;
                this.field_H = (64 * (-this.field_C.field_s + this.field_q.field_h.field_z) + 448) / this.field_v;
            }
            if (this.field_A) {
                this.field_v = -this.field_v;
            }
            this.field_F = -this.field_w;
            var4 = this.field_G - this.field_w * this.field_v;
            var5 = -(this.field_B * this.field_w) + this.field_x;
            this.field_E = new taa(this.field_q, 0, 0);
            this.field_E.field_k = 320 + -var4;
            this.field_E.field_j = -var5 + 240;
            this.a(27799, this.field_E);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "mm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int stackIn_7_0 = 0;
        L0: {
          if (param0 < -10) {
            break L0;
          } else {
            this.c(-72);
            break L0;
          }
        }
        L1: {
          var2 = this.field_F * this.field_v + this.field_G;
          var2 = var2 + this.field_q.field_s.field_b;
          var3 = this.field_B * this.field_F + this.field_x;
          var3 = var3 + this.field_q.field_s.field_B;
          var4 = this.field_F >> 884302819 & 1;
          var5 = (via.a(this.field_F << -2106147960, (byte) 102) >> 2072970701) + 64;
          var6 = 65536;
          if ((this.field_F ^ -1) >= 63) {
            break L1;
          } else {
            if (this.field_F >= 64) {
              break L1;
            } else {
              L2: {
                if ((this.field_F ^ -1) <= -1) {
                  stackIn_7_0 = 64 + -this.field_F;
                  break L2;
                } else {
                  stackIn_7_0 = 64 + this.field_F;
                  break L2;
                }
              }
              var7 = stackIn_7_0;
              var6 = var6 - (var7 * var7 << 1659532100);
              break L1;
            }
          }
        }
        var5 = var5 * var6 >> 859116912;
        if (-1 >= (this.field_F ^ -1)) {
          var7 = -(var5 >> 637485570) + 64;
          var8 = 48 + -(var5 >> 1651542242);
          nk.a(this.field_q.field_s.field_y, -(var7 >> 1716495265) + 64 + var2, 24 + (var3 + -(var8 >> -789608095)), var7, var8);
          if (this.field_A) {
            ho.field_j[var4].a(var2, -var5 + var3 + -45);
            return;
          } else {
            ho.field_j[var4].c(var2, -45 + var3 - var5);
            return;
          }
        } else {
          var7 = od.field_w[this.field_C.field_q].field_f;
          if (-5 < (var7 ^ -1)) {
            ve.field_m[var7][(this.field_q.field_L >> -1558015102) % 25].e(var2 - -44, -var5 + var3);
            var7 = -(var5 >> 637485570) + 64;
            var8 = 48 + -(var5 >> 1651542242);
            nk.a(this.field_q.field_s.field_y, -(var7 >> 1716495265) + 64 + var2, 24 + (var3 + -(var8 >> -789608095)), var7, var8);
            if (this.field_A) {
              ho.field_j[var4].a(var2, -var5 + var3 + -45);
              return;
            } else {
              ho.field_j[var4].c(var2, -45 + var3 - var5);
              return;
            }
          } else {
            var7 -= 4;
            ve.field_m[var7][(this.field_q.field_L >> -1558015102) % 25].e(var2 - -44, -var5 + var3);
            var7 = -(var5 >> 637485570) + 64;
            var8 = 48 + -(var5 >> 1651542242);
            nk.a(this.field_q.field_s.field_y, -(var7 >> 1716495265) + 64 + var2, 24 + (var3 + -(var8 >> -789608095)), var7, var8);
            if (this.field_A) {
              ho.field_j[var4].a(var2, -var5 + var3 + -45);
              return;
            } else {
              ho.field_j[var4].c(var2, -45 + var3 - var5);
              return;
            }
          }
        }
    }

    static {
    }
}
