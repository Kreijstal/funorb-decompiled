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
        uea var2_ref_uea = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        je var5 = null;
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
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        aj var6 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              this.field_C = param1;
              var6 = this.field_q.field_s.a(this.field_C.field_u, (byte) -128, this.field_C.field_s);
              this.field_x = var6.field_a - this.field_q.field_s.field_B;
              this.field_G = -this.field_q.field_s.field_b + var6.field_c;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (-1 != (1 & m.field_a.nextInt() ^ -1)) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((mm) (this)).field_A = stackIn_4_1 != 0;
              this.field_B = 2;
              this.field_v = this.field_B << -337509823;
              if (!this.field_A) {
                this.field_w = 64 * (7 - -this.field_C.field_s) / this.field_v;
                this.field_H = (64 * (-this.field_C.field_s + this.field_q.field_h.field_z) + 448) / this.field_v;
                break L2;
              } else {
                this.field_w = (this.field_C.field_u + 7) * 64 / this.field_v;
                this.field_H = (448 + 64 * (this.field_q.field_h.field_B + -this.field_C.field_u)) / this.field_v;
                break L2;
              }
            }
            L3: {
              if (!this.field_A) {
                break L3;
              } else {
                this.field_v = -this.field_v;
                break L3;
              }
            }
            this.field_F = -this.field_w;
            var4 = this.field_G - this.field_w * this.field_v;
            var5 = -(this.field_B * this.field_w) + this.field_x;
            this.field_E = new taa(this.field_q, 0, 0);
            this.field_E.field_k = 320 + -var4;
            this.field_E.field_j = -var5 + 240;
            this.a(27799, this.field_E);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("mm.<init>(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
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
                  stackOut_6_0 = 64 + -this.field_F;
                  stackIn_7_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = 64 + this.field_F;
                  stackIn_7_0 = stackOut_5_0;
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
