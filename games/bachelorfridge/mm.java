/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

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
        if (!(null == ((mm) this).field_y)) {
            id.a(127, ((mm) this).field_y);
        }
    }

    final boolean c(byte param0) {
        uea var2_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        je var5 = null;
        if (!((mm) this).field_m.a((byte) -106)) {
          if (!((mm) this).field_E.a((byte) -106)) {
            L0: {
              if (null != ((mm) this).field_y) {
                break L0;
              } else {
                var5 = je.a(rt.field_a[20], 256, 192);
                var5.d(-1);
                ((mm) this).field_y = tw.a(var5, (byte) -36);
                break L0;
              }
            }
            ((mm) this).field_F = ((mm) this).field_F + 1;
            if (((mm) this).field_H > ((mm) this).field_F + 1) {
              L1: {
                if (24 == (((mm) this).field_F ^ -1)) {
                  var2_ref = new uea(((mm) this).field_q, ((mm) this).field_C.field_s, ((mm) this).field_C.field_u, 16777215);
                  ((kj) (Object) var2_ref).a(0);
                  break L1;
                } else {
                  break L1;
                }
              }
              var2 = 38 % ((param0 - 71) / 47);
              if (((mm) this).field_F == 0) {
                this.d(58);
                jja.a(192, -1, 3);
                var3 = ((mm) this).field_G - -(((mm) this).field_F * ((mm) this).field_v);
                var4 = ((mm) this).field_x - -(((mm) this).field_B * ((mm) this).field_F);
                ((mm) this).field_q.field_s.c(18, -var4 + 240, -var3 + 320);
                return false;
              } else {
                var3 = ((mm) this).field_G - -(((mm) this).field_F * ((mm) this).field_v);
                var4 = ((mm) this).field_x - -(((mm) this).field_B * ((mm) this).field_F);
                ((mm) this).field_q.field_s.c(18, -var4 + 240, -var3 + 320);
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
          ((mm) this).field_E = null;
          ((mm) this).field_C.a(((mm) this).field_q.field_h, false);
          return;
        } else {
          ((mm) this).field_C.a(((mm) this).field_q.field_h, false);
          return;
        }
    }

    mm(gj param0, cja param1) {
        super(param0, (bca) (Object) param1);
        int var4 = 0;
        int var5 = 0;
        aj var6 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          ((mm) this).field_C = param1;
          var6 = ((mm) this).field_q.field_s.a(((mm) this).field_C.field_u, (byte) -128, ((mm) this).field_C.field_s);
          ((mm) this).field_x = var6.field_a - ((mm) this).field_q.field_s.field_B;
          ((mm) this).field_G = -((mm) this).field_q.field_s.field_b + var6.field_c;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (-1 != (1 & m.field_a.nextInt() ^ -1)) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((mm) this).field_A = stackIn_3_1 != 0;
          ((mm) this).field_B = 2;
          ((mm) this).field_v = ((mm) this).field_B << -337509823;
          if (!((mm) this).field_A) {
            ((mm) this).field_w = 64 * (7 - -((mm) this).field_C.field_s) / ((mm) this).field_v;
            ((mm) this).field_H = (64 * (-((mm) this).field_C.field_s + ((mm) this).field_q.field_h.field_z) + 448) / ((mm) this).field_v;
            break L1;
          } else {
            ((mm) this).field_w = (((mm) this).field_C.field_u + 7) * 64 / ((mm) this).field_v;
            ((mm) this).field_H = (448 + 64 * (((mm) this).field_q.field_h.field_B + -((mm) this).field_C.field_u)) / ((mm) this).field_v;
            break L1;
          }
        }
        L2: {
          if (!((mm) this).field_A) {
            break L2;
          } else {
            ((mm) this).field_v = -((mm) this).field_v;
            break L2;
          }
        }
        ((mm) this).field_F = -((mm) this).field_w;
        var4 = ((mm) this).field_G - ((mm) this).field_w * ((mm) this).field_v;
        var5 = -(((mm) this).field_B * ((mm) this).field_w) + ((mm) this).field_x;
        ((mm) this).field_E = new taa(((mm) this).field_q, 0, 0);
        ((mm) this).field_E.field_k = 320 + -var4;
        ((mm) this).field_E.field_j = -var5 + 240;
        ((mm) this).a(27799, (at) (Object) ((mm) this).field_E);
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
            ((mm) this).c(-72);
            break L0;
          }
        }
        L1: {
          var2 = ((mm) this).field_F * ((mm) this).field_v + ((mm) this).field_G;
          var2 = var2 + ((mm) this).field_q.field_s.field_b;
          var3 = ((mm) this).field_B * ((mm) this).field_F + ((mm) this).field_x;
          var3 = var3 + ((mm) this).field_q.field_s.field_B;
          var4 = ((mm) this).field_F >> 884302819 & 1;
          var5 = (via.a(((mm) this).field_F << -2106147960, (byte) 102) >> 2072970701) + 64;
          var6 = 65536;
          if ((((mm) this).field_F ^ -1) >= 63) {
            break L1;
          } else {
            if (((mm) this).field_F >= 64) {
              break L1;
            } else {
              L2: {
                if ((((mm) this).field_F ^ -1) <= -1) {
                  stackOut_6_0 = 64 + -((mm) this).field_F;
                  stackIn_7_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = 64 + ((mm) this).field_F;
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
        if (-1 >= ((mm) this).field_F) {
          var7 = -(var5 >> 637485570) + 64;
          var8 = 48 + -(var5 >> 1651542242);
          nk.a(((mm) this).field_q.field_s.field_y, -(var7 >> 1716495265) + 64 + var2, 24 + (var3 + -(var8 >> -789608095)), var7, var8);
          if (((mm) this).field_A) {
            ho.field_j[var4].a(var2, -var5 + var3 + -45);
            return;
          } else {
            ho.field_j[var4].c(var2, -45 + var3 - var5);
            return;
          }
        } else {
          var7 = od.field_w[((mm) this).field_C.field_q].field_f;
          if (-5 > var7) {
            ve.field_m[var7][(((mm) this).field_q.field_L >> -1558015102) % 25].e(var2 - -44, -var5 + var3);
            var7 = -(var5 >> 637485570) + 64;
            var8 = 48 + -(var5 >> 1651542242);
            nk.a(((mm) this).field_q.field_s.field_y, -(var7 >> 1716495265) + 64 + var2, 24 + (var3 + -(var8 >> -789608095)), var7, var8);
            if (((mm) this).field_A) {
              ho.field_j[var4].a(var2, -var5 + var3 + -45);
              return;
            } else {
              ho.field_j[var4].c(var2, -45 + var3 - var5);
              return;
            }
          } else {
            var7 -= 4;
            ve.field_m[var7][(((mm) this).field_q.field_L >> -1558015102) % 25].e(var2 - -44, -var5 + var3);
            var7 = -(var5 >> 637485570) + 64;
            var8 = 48 + -(var5 >> 1651542242);
            nk.a(((mm) this).field_q.field_s.field_y, -(var7 >> 1716495265) + 64 + var2, 24 + (var3 + -(var8 >> -789608095)), var7, var8);
            if (((mm) this).field_A) {
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
