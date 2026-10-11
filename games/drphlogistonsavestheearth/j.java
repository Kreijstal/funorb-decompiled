/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class j {
    private boolean field_U;
    boolean field_F;
    static db field_V;
    static he[] field_db;
    static java.applet.Applet field_K;
    private boolean field_ab;
    private boolean field_W;
    static String field_Y;
    private vd field_I;
    static int field_ib;
    static int field_e;
    private int field_r;
    private int field_P;
    int field_gb;
    double field_c;
    private int field_o;
    int field_A;
    private gf[] field_v;
    private ag field_M;
    double field_j;
    int field_H;
    int field_q;
    private ib[] field_d;
    int field_T;
    private gf[] field_m;
    mk field_G;
    private bf[] field_n;
    private int field_x;
    private int field_p;
    private td[] field_hb;
    private int[] field_t;
    private Random field_l;
    private boolean field_O;
    private int field_u;
    int field_w;
    private int field_bb;
    private int field_Z;
    private int field_s;
    private int field_Q;
    private td[] field_B;
    int field_L;
    private boolean field_a;
    double field_D;
    private int field_E;
    double field_N;
    int field_R;
    private int field_S;
    private int field_g;
    private int field_b;
    private int[] field_cb;
    private int field_f;
    private ck[] field_k;
    private int field_C;
    private int field_i;
    int field_X;
    private ck[] field_h;
    private boolean field_eb;
    private ag field_z;
    int field_fb;
    private boolean field_y;
    int field_J;

    private final void G(int param0) {
        double stackIn_5_0 = 0.0;
        gg stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        boolean stackIn_38_3;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        double var5 = 0.0;
        double var7 = 0.0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        gg var11_ref_gg = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != 0) {
          return;
        }
        var5 = (double)this.field_G.field_h.length;
        var7 = var5 - 640.0;
        if (!(var7 > (double)this.field_J)) {
          stackIn_5_0 = var7;
        } else {
          stackIn_5_0 = (double)this.field_J;
        }
        boolean decompiledFrameRemainder5 = true;
        var9 = (int)stackIn_5_0;
        var11 = this.field_q;
        if (0 != var11) {
          if ((var11 != 1 ||
            var16 != 0) &&
            (decompiledFrameRemainder5 = (2 != var11 ||
            var16 != 0))) {
            boolean decompiledFrameRemainder4 = true;
            boolean decompiledFrameRemainder3 = true;
            boolean decompiledFrameRemainder2 = true;
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameRemainder0 = true;
            if (3 == var11) {
              nb.field_b.a(0, 0);
              var3 = 2 * hc.field_K[0].field_z;
              var2 = 0;
              do {
                if (var2 >= 2) {
                  be.b(sh.field_b, (int)((double)((-640 + var3) * -var9) / var7), 0);
                  break;
                }
                hc.field_K[var2].a((int)((double)((var3 - 640) * -var9) / var7), 0, 450);
                var2++;
              } while (var16 == 0);
              if (var16 == 0) {
                return;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if ((var11 != 4) &&
                (decompiledFrameRemainder1 = (var11 != 5 ||
                var16 != 0)) &&
                (decompiledFrameRemainder2 = (var11 != 6)) &&
                (decompiledFrameRemainder3 = (var11 != 7 ||
                var16 != 0)) &&
                (decompiledFrameRemainder4 = (var11 != 8))) {
                return;
              }
            }
            if ((decompiledFrameRemainder4) &&
              (decompiledFrameRemainder3) &&
              (decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1)) {
              nb.field_b.a(0, 0);
              var3 = hc.field_K[0].field_z * 2;
              var10 = (int)((double)((-640 + var3) * -var9) / var7);
              var2 = 0;
              do {
                if (var2 >= 2) {
                  sh.field_b.d(var10, 0);
                  break;
                }
                hc.field_K[var2].a(var10, 0, 450);
                var2++;
              } while (var16 == 0);
              if (sd.field_e != 2) {
                return;
              }
              var2 = 0;
              do {
                if (var2 >= 75) {
                  si.field_F.a(var10 + 300, 200, 256);
                  break;
                }
                var11 = wi.field_f[var2];
                var12 = wa.field_Q[var2] - var9 / md.field_c[var2];
                var13 = we.field_e[var2];
                var14 = jf.field_ib[var2];
                var15 = hh.field_a[var2];
                kl.field_R[var11].a(5, var13, var15, var14, var12);
                var2++;
              } while (var16 == 0);
              if (var16 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder4) &&
              (decompiledFrameRemainder3) &&
              (decompiledFrameRemainder2)) {
              nb.field_b.a(0, 0);
              var3 = 2 * hc.field_K[0].field_z;
              var2 = 0;
              while (true) {
                if (2 > var2) {
                  hc.field_K[var2].a((int)((double)((var3 - 640) * -var9) / var7), 0, 450);
                  var2++;
                  if (var16 == 0) {
                    continue;
                  }
                } else {
                  be.a(sh.field_b, (int)((double)(-var9 * (var3 - 640)) / var7), 0);
                }
                break;
              }
              if (var16 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder4) &&
              (decompiledFrameRemainder3)) {
              wj.f(0, 0, 640, 430, 7091712, 131328);
              var3 = vi.field_g.field_d;
              vi.field_g.a((int)((double)(-var9 * (var3 - 640)) / var7), 0, 128);
              var3 = cc.field_w.field_d * 2;
              cc.field_w.d((int)((double)((-640 + var3) * -var9) / var7), 0);
              cc.field_w.d((int)(-((double)((-640 + var3) * var9) / var7) + (double)(var3 / 2)), 0);
              if (var16 == 0) {
                return;
              }
            }
            if (decompiledFrameRemainder4) {
              wj.f(0, 0, 640, 430, 27648, 512);
              var3 = gb.field_e.field_d;
              gb.field_e.a((int)((double)(-var9 * (-640 + var3)) / var7), 0, 128);
              var3 = b.field_k.field_d * 2;
              b.field_k.d((int)((double)(-var9 * (var3 - 640)) / var7), 0);
              b.field_k.d((int)(-((double)((var3 - 640) * var9) / var7) + (double)(var3 / 2)), 0);
              if (var16 == 0) {
                return;
              }
            }
            wj.f(0, 0, 640, 430, 27648, 512);
            var3 = ha.field_b.field_d;
            ha.field_b.a((int)((double)((var3 - 640) * -var9) / var7), 0, 128);
            var3 = 2 * nf.field_v.field_d;
            nf.field_v.a((int)((double)((var3 - 640) * -var9) / var7), 0);
            nf.field_v.c((int)((double)(var3 / 2) - (double)((-640 + var3) * var9) / var7), 0);
            return;
          }
        } else {
          v.field_O.a(0, 0);
          var3 = oi.field_f.field_d;
          if (sd.field_e == 2) {
            this.b((byte) -51);
          }
          var4 = (int)((double)(-var9 * (var3 - 640)) / var7);
          if (sd.field_e != 0) {
            this.b((byte) 51, var4);
          }
          this.a((byte) 0, var4);
          oi.field_f.d(var4, 0);
          var3 = 2 * nj.field_o.field_d;
          nj.field_o.d((int)((double)((var3 - 640) * -var9) / var7), 0);
          nj.field_o.d((int)(-((double)(var9 * (-640 + var3)) / var7) + (double)(var3 / 2)), 0);
          if (var16 == 0) {
            return;
          }
        }
        if (decompiledFrameRemainder5) {
          wj.f(0, 0, 640, 430, 262656, 11754240);
          var3 = sg.field_e.field_d;
          var4 = (int)((double)((var3 - 640) * -var9) / var7);
          if (sd.field_e == 2) {
            this.b((byte) -101);
          }
          if (sd.field_e != 0) {
            this.b((byte) -120, var4);
          }
          this.a((byte) 0, var4);
          sg.field_e.d(var4, 0);
          var3 = nj.field_o.field_d * 2;
          nj.field_o.d((int)((double)(-var9 * (-640 + var3)) / var7), 0);
          nj.field_o.d((int)((double)(var3 / 2) - (double)(var9 * (var3 - 640)) / var7), 0);
          if (var16 == 0) {
            return;
          }
        }
        wj.f(0, 0, 640, 430, 258, 13932);
        if (sd.field_e != 0 &&
          0 <= DrPhlogistonSavesTheEarth.field_K) {
          var11_ref_gg = new gg(ib.field_a, ch.field_y, 70, 0.0, 1.0, 1.0, 1, 1.5, 0.99, 1);
          var11_ref_gg.field_o = var9 >> 3;
          var12 = DrPhlogistonSavesTheEarth.field_K * 128;
          var13 = 64 * DrPhlogistonSavesTheEarth.field_K;
          var13 = var13 >> 8;
          var14 = 255 * DrPhlogistonSavesTheEarth.field_K;
          var12 = var12 >> 8;
          var13 = var13 << 8;
          var14 = var14 >> 8;
          var12 = var12 << 16;
          stackIn_37_0 = var11_ref_gg;
          stackIn_37_1 = -1093327740;
          stackIn_37_2 = 16777215;
          stackIn_38_3 = (sd.field_e == 2);
          ((gg) (Object) stackIn_37_0).a(stackIn_37_1, stackIn_37_2, stackIn_38_3, var14 | (var13 | var12));
        }
        var3 = uk.field_h.field_d;
        var4 = (int)((double)((var3 - 640) * -var9) / var7);
        if (sd.field_e != 0) {
          this.b((byte) -105, var4);
        }
        this.a((byte) 0, var4);
        uk.field_h.d(var4, 0);
        var3 = 2 * nj.field_o.field_d;
        nj.field_o.d((int)((double)((var3 - 640) * -var9) / var7), 0);
        nj.field_o.d((int)((double)(var3 / 2) - (double)((var3 - 640) * var9) / var7), 0);
        return;

    }

    private final void E(int param0) {
        boolean decompiledFrameRemainder0 = true;
        this.field_D = this.field_D + this.field_j;
        this.field_N = this.field_N + this.field_c;
        if (((!this.field_U ||
          0 >= this.field_w) && (this.field_G.field_h.length <= (this.field_J + 640) &&
          !this.field_eb)) &&
          (decompiledFrameRemainder0 = (!(this.field_ab) ||
          !(150 > gm.field_J)))) {
          this.field_c = 5.0;
          decompiledFrameRemainder0 = !(!DrPhlogistonSavesTheEarth.field_D);
        }
        if (decompiledFrameRemainder0) {
          if (this.field_D < 0.0) {
            this.field_j = 0.0;
            this.field_D = 0.0;
          }
          if ((double)ri.field_e + this.field_D > 430.0) {
            this.field_j = 0.0;
            this.field_D = (double)(430 - ri.field_e);
          }
          if (0.0 > this.field_N) {
            this.field_N = 0.0;
            this.field_c = 0.0;
          }
          if (this.field_N + (double)am.field_l > 640.0) {
            this.field_c = 0.0;
            this.field_N = (double)(-am.field_l + 640);
          }
          this.field_j = this.field_j - this.field_j / 20.0;
          this.field_c = this.field_c - this.field_c / 20.0;
        }
        this.field_M.l(e.a(125, (int)this.field_N));
        this.field_z.l(e.a(119, (int)this.field_N));
        if (param0 != -8499) {
          this.k(-18);
        }
        if (this.field_z.m() &&
          this.field_z.f() == ((vk) (this.field_z.field_i)).field_i.length) {
          this.field_z.i(-1);
          th.a(-27610, 32, e.a(105, (int)this.field_N), nl.field_r[8]);
        }
    }

    final void d(byte param0) {
        int var2;
        int var3;
        int stackIn_3_0 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        stackIn_3_0 = (hb.field_g > 0) ? 0 : 11;
        tc.field_d = stackIn_3_0;
        if (ej.field_h != 0) {
          ek.a(-76, false, 9);
          if (var3 != 0) {
            if (0 == this.field_H) {
              ek.a(-109, false, 0);
              ek.a(-106, false, 2);
            } else {
              ek.a(-106, false, 2);
            }
          }
        } else {
          if (0 == this.field_H) {
            ek.a(-109, false, 0);
            if (var3 != 0) {
              ek.a(-106, false, 2);
            }
          } else {
            ek.a(-106, false, 2);
          }
        }
        if (param0 <= 35) {
          this.E(-104);
        }
        if (this.C(31578)) {
          r.field_d = 5;
        }
        if (!oh.a(0)) {
          bf.field_h = this.j((byte) -68);
        }
        var2 = 0;
        while (this.field_n.length > var2) {
          if (var3 == 0) {
            if (null != this.field_n[var2]) {
              this.field_n[var2].a(7769);
            }
            var2++;
            continue;
          }
          break;
        }
    }

    public static void h(int param0) {
        field_db = null;
        field_V = null;
        if (param0 != 24342) {
          j.h(-24);
        }
        field_Y = null;
        field_K = null;
    }

    private final void c(bf param0, int param1) {
        RuntimeException runtimeException = null;
        double var3_double = 0.0;
        double var5 = 0.0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            !param0.field_s &&
            0 > this.field_fb) {
            var3_double = this.field_c - param0.field_l;
            var5 = -param0.field_j + this.field_j;
            if (param1 > -115) {
              this.k(-90);
            }
            if (!cj.field_c[param0.field_Q]) {
              this.field_c = -(var3_double / 2.0) + param0.field_l;
              this.field_j = param0.field_j - var5 / 2.0;
              if (DrPhlogistonSavesTheEarth.field_D) {
                this.field_c = param0.field_l - var3_double;
                this.field_j = -var5 + param0.field_j;
              }
            } else {
              this.field_c = param0.field_l - var3_double;
              this.field_j = -var5 + param0.field_j;
            }
            this.field_N = this.field_N + this.field_c;
            this.field_D = this.field_D + this.field_j;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("j.OB(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final void s(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        if (param0 <= 79) {
          return;
        }
        do {
          if (this.field_m.length <= var2) {
            var2 = 0;
            break;
          }
          this.field_m[var2] = null;
          var2++;
        } while (var3 == 0);
        do {
          if (this.field_v.length <= var2) {
            var2 = 0;
            break;
          }
          this.field_v[var2] = null;
          var2++;
        } while (var3 == 0);
        do {
          if (this.field_d.length <= var2) {
            var2 = 0;
            break;
          }
          this.field_d[var2] = null;
          var2++;
        } while (var3 == 0);
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (this.field_n.length <= var2))) {
          if (var3 == 0) {
            if (null != this.field_n[var2]) {
              this.field_n[var2].a(7769);
            }
            this.field_n[var2] = null;
            var2++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          var2 = 0;
        }
        while (this.field_B.length > var2) {
          this.field_B[var2] = null;
          var2++;
          if (var3 != 0) {
            return;
          }
        }
        bc.field_d.c();
        wj.c();
        lb.field_C.a(119);
        fc.field_a = 0;
        this.field_b = 0;
        bc.field_f = 0;
        bg.field_k = 0;
        this.field_U = false;
        nf.field_u = 0;
        this.field_J = 0;
        dg.field_c = 0;
        lh.field_m = 0;
        this.field_Z = 0;
        this.field_ab = false;
        this.field_u = 0;
        gi.field_f = 0;
        this.field_S = 0;
        hl.field_d = false;
        cj.field_b = 0;
        return;
    }

    private final void w(int param0) {
        int var2;
        int var3;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 < 18) {
          field_ib = -47;
        }
        var2 = 0;
        while (var2 < 160) {
          if (var3 == 0) {
            if (null != this.field_d[var2]) {
              bc.field_f = bc.field_f | 1 << this.field_q;
              if (this.field_d[var2].a((byte) -127)) {
                this.field_d[var2] = null;
                nf.field_u = nf.field_u | 1 << this.field_q;
              }
            }
            var2++;
            continue;
          }
          break;
        }
    }

    private final void a(int param0, int param1, int param2, bf param3, int param4) {
        int var6_int = 0;
        td var7 = null;
        try {
          if (param4 > -106) {
            this.G(127);
          }
          var6_int = this.l((byte) 105);
          var7 = new td(param3.field_w, param0, param1, param2);
          if (param3.h(-83)) {
            pe.field_e = var7;
          }
          this.field_B[var6_int] = var7;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "j.LA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final void x(int param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        while (var2 < 3801) {
          if (null != this.field_B[var2]) {
            this.field_B[var2].a(true);
          }
          var2++;
          if (var4 == 0) {
            continue;
          }
          break;
        }
        var3 = 68 % ((16 - param0) / 58);
        if (null != cj.field_e) {
          var2Lifetime1 = 0;
          while (!(ck.field_j.length <= var2Lifetime1)) {
            if (var4 != 0) {
              break;
            }
            if (null != ck.field_j[var2Lifetime1]) {
              ck.field_j[var2Lifetime1].a(true);
            }
            var2Lifetime1++;
          }
        }
    }

    private final void b(bf param0, int param1) {
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          this.field_cb[param0.field_Q] = this.field_cb[param0.field_Q] + 1;
          var3_int = param0.field_Q;
          if (((2 != var3_int ||
            var4 != 0) && (var3_int != 39 ||
            var4 != 0) && (var3_int != 47 ||
            var4 != 0)) &&
            (decompiledFrameRemainder0 = (var3_int != 4))) {
            decompiledFrameRemainder1 = (var3_int != 14 ||
              var4 != 0);
            if (((decompiledFrameRemainder1) &&
              (decompiledFrameRemainder1 = (var3_int != 13))) &&
              (decompiledFrameRemainder2 = (var3_int != 12 ||
              var4 != 0)) &&
              (decompiledFrameRemainder3 = (var3_int == 36))) {
              decompiledFrameRemainder2 = (var4 != 0);
            }
          }
          if (((decompiledFrameRemainder3) && (decompiledFrameRemainder2) && (decompiledFrameRemainder1) && (decompiledFrameRemainder0)) &&
            (decompiledFrameRemainder3 = (this.field_cb[47] + (this.field_cb[2] + this.field_cb[39]) == 15))) {
            this.a(0, 255, (byte) -123);
            decompiledFrameRemainder3 = (var4 != 0);
          }
          if (((decompiledFrameRemainder3) && (decompiledFrameRemainder2) && (decompiledFrameRemainder1)) &&
            (decompiledFrameRemainder3 = (15 == this.field_cb[param0.field_Q]))) {
            this.a(1, 254, (byte) -83);
            decompiledFrameRemainder3 = (var4 != 0);
          }
          if (((decompiledFrameRemainder3) && (decompiledFrameRemainder2)) &&
            (decompiledFrameRemainder3 = (this.field_cb[14] + this.field_cb[13] == 15))) {
            this.a(2, 253, (byte) -127);
            decompiledFrameRemainder3 = (var4 != 0);
          }
          if ((decompiledFrameRemainder3) &&
            (this.field_cb[36] + this.field_cb[12] == 15)) {
            this.a(3, 252, (byte) -77);
          }
          if (param1 < 39) {
            this.field_L = 106;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("j.SA(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void d(int param0) {
        boolean stackIn_29_0 = false;
        boolean stackIn_31_1 = false;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (this.field_eb) {
          return;
        }
        this.field_w = this.field_w - 1;
        this.a(255, 0);
        gi.a(this.field_M, param0 ^ -6799);
        if (this.field_q >= 0) {
          fc.field_a = fc.field_a | 1 << this.field_q;
          gi.field_f = gi.field_f | 1 << this.field_q;
        }
        this.field_fb = 225;
        L2: while (true) {
          if (this.field_L > 1) {
            this.field_d[this.f(qk.a(param0, -6111))] = new ib(this.field_N, this.field_D, 7, true, false);
            this.field_L = this.field_L - 1;
            if (var5 != 0) {
              break L2;
            }
            if (var5 == 0) {
              continue;
            }
          }
          while (this.field_A > 1) {
            this.field_d[this.f(0)] = new ib(this.field_N, this.field_D, 1, true, false);
            this.field_A = this.field_A - 1;
            if (var5 != 0) {
              break L2;
            }
            if (var5 == 0) {
              continue;
            }
            break;
          }
          this.field_u = 0;
          break;
        }
        if (param0 != -6111) {
          this.k((byte) -99);
        }
        this.field_S = 0;
        var2 = e.a(110, (int)this.field_N);
        if (this.field_w <= 0) {
          tc.field_i = false;
          var3 = 0;
          L10: while (true) {
            if (var3 < this.field_n.length) {
              if (var5 != 0) {
                break L10;
              }
              if (this.field_n[var3] != null &&
                !this.field_n[var3].field_s) {
                var4 = this.field_n[var3].field_Q;
                stackIn_29_0 = tc.field_i;
                stackIn_31_1 = (var4 == 5) || (var4 == 11) || (var4 == 17) || (var4 == 18);
                tc.field_i = stackIn_29_0 | stackIn_31_1;
              }
              var3++;
              if (var5 == 0) {
                continue;
              }
            }
            sc.a(param0 + 6110, false, dm.field_x);
            this.field_eb = true;
            th.a(-27610, 64, var2, nl.field_r[9]);
            this.o(param0 ^ -6049);
            break;
          }
          this.field_s = this.field_J;
          if (var5 == 0) {
            return;
          }
        }
        this.a(9, ri.field_q + (int)this.field_D, -1, (int)this.field_N + am.field_p, param0 ^ -31963);
        this.field_z.j(64);
        od.a(param0 ^ 1630761897, this.field_z);
        return;
    }

    private final void g(int param0) {
        int stackIn_11_0 = 0;
        int stackIn_24_1 = 0;
        he stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_40_0 = 0;
        int stackIn_52_0 = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        String var10 = null;
        int var11_int = 0;
        jb var11 = null;
        int var12_int = 0;
        nh var12 = null;
        int var13_int = 0;
        double var13 = 0.0;
        int var15_int = 0;
        Runtime var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var16Lifetime1;
        var17 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        ea.field_c.a(0, 0);
        var2 = (double)this.field_gb / 256.0 * 3.141592653589793;
        var4 = 89;
        var5 = 464;
        var6 = var4 - (int)(pj.a(var2, param0 + 35407) * 27.0);
        var7 = -(int)(27.0 * ji.a(65535, var2)) + var5;
        var8 = -1;
        L0: while (true) {
          if (var8 <= 1) {
            stackIn_11_0 = -1;
            if (var17 != 0) {
              break L0;
            }
            var9 = stackIn_11_0;
            while (var9 <= 1) {
              wj.g(var4 + var9, var8 + var5, var6, var7, 16711680);
              var9++;
            }
            var8++;
            continue L0;
          }
          wj.b(89, 464, 3, 16711680);
          var8 = this.field_H;
          stackIn_11_0 = -1;
          break;
        }
        var9 = stackIn_11_0;
        do {
          if (0 == var8) {
            if (var9 < 6) {
              var9 = 6;
            }
            break;
          }
          var9++;
          var8 = var8 / 10;
        } while (var17 == 0);
        var10_int = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var9 < var10_int))) {
          var11_int = (int)(Math.floor((double)this.field_H / Math.pow(10.0, (double)(var10_int + 1))) * Math.pow(10.0, (double)(1 + var10_int)));
          var12_int = (int)Math.floor((double)(-var11_int + this.field_H) / Math.pow(10.0, (double)var10_int));
          stackIn_26_0 = pi.field_S[var12_int];
          stackIn_26_1 = ~var9;
          stackIn_26_2 = -7;
          if (var17 == 0) {
            if (stackIn_26_1 == stackIn_26_2) {
              stackIn_24_1 = 21;
            } else {
              stackIn_24_1 = 18;
            }
            ((he) (Object) stackIn_26_0).e(-(stackIn_24_1 * var10_int) + 320, 438);
            var10_int++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_26_0 = pi.field_S[this.field_L];
          stackIn_26_1 = 161;
          stackIn_26_2 = 438;
        }
        ((he) (Object) stackIn_26_0).e(stackIn_26_1, stackIn_26_2);
        if (this.field_w >= 0) {
          pi.field_S[this.field_w].e(383, 438);
        }
        dh.field_R[ah.field_J].a(408, 429);
        wj.b(this.field_t);
        wj.f(400, 425, 515, 475);
        if (this.field_J - pa.field_c <= 10) {
          dh.field_R[ib.field_t].a(408, -((-pa.field_c + this.field_J) * 5) + 479);
          if (var17 != 0) {
            dh.field_R[ib.field_t].a(408, 429);
          }
        } else {
          dh.field_R[ib.field_t].a(408, 429);
        }
        wj.a(this.field_t);
        var10 = "x" + this.field_A;
        var11 = cb.field_b;
        var12 = new nh(var11.b(var10), var11.field_x + var11.field_S);
        var12.c();
        if (param0 != -2639) {
          this.field_T = -118;
        }
        var11.c(var10, 0, var11.field_x, 16777215, -1);
        lb.field_C.a(116);
        var12.b(-(var12.field_y / 2) + 503, var12.field_w / 2 + 443);
        if (this.field_Z > 0) {
          stackIn_40_0 = (this.field_Z % 20 < 10) ? 16711680 : 0;
          var13_int = stackIn_40_0;
          cb.field_b.a(na.field_b, 620, cb.field_b.field_x + 10, var13_int, 0);
        }
        var4Lifetime1 = 551;
        var5Lifetime1 = 464;
        var13 = (double)this.field_u / 200.0 * 3.141592653589793;
        var6Lifetime1 = -(int)(27.0 * pj.a(var13, 32768)) + var4Lifetime1;
        var7Lifetime1 = -(int)(ji.a(param0 + 68174, var13) * 27.0) + var5Lifetime1;
        var15_int = -1;
        L19: while (true) {
          if (var15_int <= 1) {
            stackIn_52_0 = -1;
            if (var17 != 0) {
              break L19;
            }
            var16 = stackIn_52_0;
            while (var16 <= 1) {
              wj.g(var4Lifetime1 + var16, var5Lifetime1 + var15_int, var6Lifetime1, var7Lifetime1, 16711680);
              var16++;
            }
            var15_int++;
            continue L19;
          }
          wj.b(89, 464, 3, 16711680);
          stackIn_52_0 = this.field_F ? 1 : 0;
          break;
        }
        if (stackIn_52_0 != 0) {
          ji.field_d.b("lvl: " + Integer.toString(this.field_q) + "; fps: " + pc.field_a, 112, 32, 65280, 65280);
          ji.field_d.a("Bonus: " + this.field_R, 630, 32, 16777215, 16777215);
          var15 = Runtime.getRuntime();
          var16Lifetime1 = (int)(var15.totalMemory() - var15.freeMemory()) >> 20;
          ji.field_d.b(Integer.toString(var16Lifetime1), 330, 35, 16711680, 16711680);
        }
        return;
    }

    private final void i(int param0) {
        if (sd.field_e != 2) {
          return;
        }
        if (param0 != 215) {
          this.w(45);
        }
        if ((this.field_J & 1) == 0) {
          return;
        }
        bc.field_d = gm.a(bc.field_d, 65280, (-8096 + this.field_J) / 20, q.field_f, 16711680, true);
    }

    private final void p(int param0) {
        int var2_int;
        gg var2;
        int var3;
        gg stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        boolean stackIn_14_3;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != -3) {
          this.y(-39);
        }
        var2_int = 0;
        while (var2_int < 1400) {
          if (var3 == 0) {
            if (this.field_m[var2_int] != null) {
              this.field_m[var2_int].c((byte) 119);
            }
            var2_int++;
            continue;
          }
          break;
        }
        if (this.field_a) {
          var2 = new gg((int)((double)am.field_p + this.field_N), (int)((double)ri.field_q + this.field_D), 15, 0.0, 6.283185307179586, 1.5707963267948966, 3, 1.9, 0.92, this.field_J >> 1);
          stackIn_13_0 = var2;
          stackIn_13_1 = -1093327740;
          stackIn_13_2 = 16777215;
          stackIn_14_3 = (sd.field_e == 2);
          ((gg) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2, stackIn_14_3, 8405247);
          this.field_a = false;
        }
        return;
    }

    private final void B(int param0) {
        int stackIn_16_0;
        int stackIn_16_1;
        int stackIn_16_2;
        int stackIn_16_3;
        int stackIn_17_4 = 0;
        int stackIn_19_3;
        int[] stackIn_20_4;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        he var2 = null;
        he[] var3_ref_he__ = null;
        int var3 = 0;
        int var4 = 0;
        he var5 = null;
        he var6 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (0 >= this.field_fb) {
          var5 = kh.field_e;
          var2 = var5;
          if (this.field_y) {
            var5.c(-var5.field_a + (int)this.field_N, (int)this.field_D - var5.field_f, 128, this.field_r);
            this.field_y = false;
            if (var4 != 0) {
              var5.a(-var5.field_a + (int)this.field_N, (int)this.field_D - var5.field_f);
              var3_ref_he__ = ii.field_b;
              var6 = var3_ref_he__[(-1 + var3_ref_he__.length) * (225 - this.field_fb) / 225];
              var2 = var6;
              wj.d(0, 0, 640, 430, 16777215, this.field_fb * 255 / 225);
              var2.a(-var6.field_a + (int)this.field_N, -var6.field_f + (int)this.field_D, (225 - this.field_fb) * 256 / 225);
            }
          } else {
            var5.a(-var5.field_a + (int)this.field_N, (int)this.field_D - var5.field_f);
            if (var4 != 0) {
              var3_ref_he__ = ii.field_b;
              var6 = var3_ref_he__[(-1 + var3_ref_he__.length) * (225 - this.field_fb) / 225];
              var2 = var6;
              wj.d(0, 0, 640, 430, 16777215, this.field_fb * 255 / 225);
              var2.a(-var6.field_a + (int)this.field_N, -var6.field_f + (int)this.field_D, (225 - this.field_fb) * 256 / 225);
            }
          }
        } else {
          var3_ref_he__ = ii.field_b;
          var6 = var3_ref_he__[(-1 + var3_ref_he__.length) * (225 - this.field_fb) / 225];
          var2 = var6;
          wj.d(0, 0, 640, 430, 16777215, this.field_fb * 255 / 225);
          var2.a(-var6.field_a + (int)this.field_N, -var6.field_f + (int)this.field_D, (225 - this.field_fb) * 256 / 225);
        }
        if (param0 != -5651) {
          return;
        }
        var3 = 0;
        L5: while (true) {
          if (var3 < this.field_h.length) {
            this.field_h[var3].c(param0 + 5650);
            stackIn_36_0 = ~this.field_u;
            stackIn_36_1 = -1;
            if (var4 != 0) {
              if (stackIn_36_0 > stackIn_36_1) {
                this.field_k[var3].c(-1);
                var3++;
                return;
              }
              break L5;
            }
            if (stackIn_36_0 < stackIn_36_1) {
              stackIn_16_0 = (int)((double)am.field_l + this.field_N) << 4;
              stackIn_16_1 = (int)(this.field_D + (double)ri.field_q) << 4;
              stackIn_16_2 = 256;
              stackIn_16_3 = this.field_u;
              if (50 < this.field_u) {
                stackIn_17_4 = 2;
              } else {
                stackIn_17_4 = 4;
              }
              stackIn_19_3 = stackIn_16_3 / stackIn_17_4;
              if (50 >= this.field_u) {
                stackIn_20_4 = uh.field_j;
              } else {
                stackIn_20_4 = uh.field_l;
              }
              wj.a(stackIn_16_0, stackIn_16_1, stackIn_16_2, stackIn_19_3, stackIn_20_4);
            }
            var3++;
            continue;
          }
          if (!this.field_eb) {
            break L5;
          }
          if (null == this.field_k) {
            break L5;
          }
          var3 = 0;
          while (var3 < this.field_k.length) {
            this.field_k[var3].c(-1);
            var3++;
            if (var4 != 0) {
              return;
            }
          }
          break;
        }
        le.field_c = var2;
        return;
    }

    private final void q(int param0) {
        int var2;
        ib var3;
        int var4;
        int var5;
        boolean decompiledFrameCompleted0 = true;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if ((200 > this.field_fb ||
          !(gm.field_J <= 0)) && this.field_w > 0) {
          var2 = 0;
          while (160 > var2) {
            var3 = this.field_d[var2];
            if (var5 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            if (var3 != null &&
              ne.a(le.field_c, (int)this.field_N, (int)this.field_D, var3.field_n, (int)var3.field_d, (int)var3.field_k)) {
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameRemainder1 = true;
              boolean decompiledFrameRemainder4 = true;
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder0 = true;
              var4 = var3.field_g;
              if (((4 != var4 ||
                var5 != 0) && (var4 != 5 ||
                var5 != 0) && (var4 != 6 ||
                var5 != 0)) &&
                (decompiledFrameRemainder0 = (7 != var4)) &&
                (decompiledFrameRemainder3 = (3 != var4)) &&
                (decompiledFrameRemainder4 = (var4 != 2 ||
                var5 != 0)) &&
                (decompiledFrameRemainder2 = (var4 == 1))) {
                decompiledFrameRemainder1 = false;
              }
              if ((decompiledFrameRemainder4) &&
                (decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (decompiledFrameRemainder1) &&
                (decompiledFrameRemainder0)) {
                this.d((byte) -90, var3.field_m);
                decompiledFrameRemainder2 = false;
              }
              if ((decompiledFrameRemainder4) &&
                (decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (decompiledFrameRemainder1)) {
                this.field_L = this.field_L + 1;
                decompiledFrameRemainder2 = false;
              }
              if ((decompiledFrameRemainder4) &&
                (decompiledFrameRemainder2) &&
                (decompiledFrameRemainder1)) {
                this.field_w = this.field_w + 1;
                if (!(9 >= this.field_w)) {
                  this.field_w = 9;
                }
                decompiledFrameRemainder2 = false;
              }
              if ((decompiledFrameRemainder2) &&
                (decompiledFrameRemainder1)) {
                this.a(this.field_gb + 64, 0);
                decompiledFrameRemainder2 = false;
              }
              if (decompiledFrameRemainder2) {
                this.field_A = this.field_A + 1;
              }
              this.a(this.field_gb, 0);
              this.field_d[var2] = null;
              bg.field_k = bg.field_k | 1 << this.field_q;
              ah.a(nl.field_r[70], e.a(118, (int)this.field_N), -1321705304);
            }
            var2++;
          }
        }
        if ((decompiledFrameCompleted0) &&
          (param0 < 91)) {
          this.field_v = (gf[]) null;
        }

    }

    final void r(int param0) {
        int fieldTemp$0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int var2_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        bf var5 = null;
        nh var6 = null;
        bf var7 = null;
        bf var8 = null;
        bf var9 = null;
        bf var8Lifetime1;
        bf var8Lifetime2;
        int var2_intLifetime1;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 > -67) {
          this.a((byte) 58);
        }
        if (qe.field_a == -150) {
          System.gc();
        }
        if (~ab.field_b != ~this.field_q) {
          this.c((byte) 111);
        }
        if (null != this.field_I.h(-11151)) {
          fieldTemp$0 = this.field_bb + 1;
          this.field_bb = this.field_bb + 1;
          if (fieldTemp$0 == 335) {
            this.field_bb = 0;
            this.field_I.d(180479896);
          }
        }
        while (true) {
          if (th.a(-114)) {
            stackIn_66_0 = 150;
            stackIn_66_1 = gm.field_J;
            if (var4 == 0) {
              if (stackIn_66_0 < stackIn_66_1) {
                gm.field_J = 500;
              }
              if (di.field_c != 13) {
                continue;
              }
              if (null != rh.field_b) {
                var6 = rh.field_b;
                kg.a(wj.field_l, 0, var6.field_B, 0, var6.field_B.length);
              } else {
                rh.field_b = be.b();
              }
              rh.field_b.c();
              be.a(0, 0, 640, 480, 22070844, 255);
              lb.field_C.a(117);
              ek.a(-78, false, 1);
              return;
            }
            break;
          }
          this.E(-8499);
          this.i((byte) -1);
          this.A(1052688);
          this.I(0);
          if (qe.field_a > 0) {
            this.z(215);
            this.b(114);
            this.a(true);
            this.w(19);
            this.k(0);
            this.i(215);
            this.a(0);
            this.q(114);
            if (gm.field_J == 0) {
              this.c(-6718);
              this.b(true);
              if (!this.field_eb) {
                this.k((byte) 123);
              }
            }
            this.F(-125);
            this.field_fb = this.field_fb - 1;
            if (this.field_fb > 0) {
              this.a(11, (int)this.field_D + hi.a(ri.field_e, 4, this.field_l), -1, (int)this.field_N + hi.a(am.field_l, 4, this.field_l), 27396);
            }
            this.field_Z = this.field_Z - 1;
            if (this.n(115)) {
              this.field_J = this.field_J + 1;
              this.field_l.setSeed((long)(this.field_J + (this.field_q << 16)));
              if (var4 == 0) {
                return;
              }
            }
            if (!this.field_U ||
              this.field_ab) {
              var2_int = 0;
              while (true) {
                if (var2_int < 1600) {
                  var5 = this.field_n[var2_int];
                  var8 = var5;
                  var8Lifetime2 = var5;
                  var7 = var5;
                  if (var4 == 0) {
                    boolean decompiledFrameRemainder0 = true;
                    if (var7 != null) {
                      if (var7.a(false) ||
                        wh.field_v[var5.field_Q] ||
                        !(0 < var7.field_H)) {
                        if (!(!cj.field_c[var5.field_Q])) {
                          var7.field_o = var7.field_o + 1.0;
                        }
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        this.a(119, (gf) null, var5);
                        this.field_n[var2_int].a(7769);
                        this.field_n[var2_int] = null;
                      }
                    }
                    var2_int++;
                    continue;
                  }
                } else {
                  this.H(1);
                }
                break;
              }
              if (var4 == 0) {
                return;
              }
            }
            this.field_J = this.field_J + 1;
            this.field_l.setSeed((long)(this.field_J + (this.field_q << 16)));
            var2_intLifetime1 = this.field_q;
            if (var2_intLifetime1 == 2 &&
              var4 == 0) {
              if (this.field_J % 298 != 0) {
                return;
              }
              var2_intLifetime1 = hi.a(9, 4, this.field_l) + 19;
              if (var2_intLifetime1 >= 21) {
                var2_intLifetime1 += 2;
              }
              var8Lifetime1 = this.a(0, true, var2_intLifetime1, this.field_J, 0, true);
              var8Lifetime1.field_H = 1;
              var8Lifetime1.a(2, 10);
              var8Lifetime1.field_N = (double)(-var8Lifetime1.b((byte) 55).field_c + 430);
              var8Lifetime1.field_o = 640.0;
              return;
            } else {
              if (var2_intLifetime1 == 5 &&
                var4 == 0) {
                return;
              }
              if (var2_intLifetime1 != 8) {
                return;
              }
            }
            if (0 != this.field_J % vc.field_b[0].field_d) {
              return;
            }
            var9 = this.a(0, true, 31, this.field_J, 0, true);
            var9.field_N = (double)(430 - var9.b((byte) 55).field_c);
            var9.field_o = 640.0;
            if (var4 == 0) {
              return;
            }
          }
          stackIn_66_0 = ~qe.field_a;
          stackIn_66_1 = 149;
          break;
        }
        if (stackIn_66_0 == stackIn_66_1) {
          this.b(116);
        }
        var2 = -((double)qe.field_a / -150.0) + 1.0;
        qe.field_a = qe.field_a + 1;
        this.field_N = (double)(-am.field_l) + (double)(275 + am.field_l) * var2;
        if (ck.field_f[83]) {
          qe.field_a = qe.field_a + 10;
          return;
        }
        return;
    }

    private final void k(byte param0) {
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int var2 = 0;
        bf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var2Lifetime1;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        while (var2 < 1600) {
          var3 = this.field_n[var2];
          if (var6 != 0) {
            return;
          }
          if (var3 != null &&
            var3.m(-117) && (ne.a(le.field_c, (int)this.field_N, (int)this.field_D, var3.b((byte) 55), (int)var3.field_o, (int)var3.field_N) ||
            var3.field_D != null &&
            ne.a(le.field_c, (int)this.field_N, (int)this.field_D, var3.field_D, var3.field_d, var3.field_p))) {
            if (var3.field_s) {
              stackIn_12_0 = 0;
            } else {
              stackIn_12_0 = var3.a(16, 10) ? 1 : 0;
            }
            var4 = stackIn_12_0;
            if (var3.field_Q != 6 &&
              var3.field_Q != 37) {
              if (!wh.field_v[var3.field_Q]) {
                stackIn_18_0 = (!var3.field_s) ? 16 : 1;
                var5 = stackIn_18_0;
                this.a(-var5 + this.field_gb, 0);
              } else {
                this.a(this.field_gb - 8, 0);
              }
            } else {
              var4 = 1;
              this.a(-100 + this.field_gb, 0);
            }
            if (var4 == 0) {
              this.c(var3, -128);
            } else {
              this.b(var3, 122);
              this.d((byte) -82, wh.field_x[var3.field_Q]);
              if (var3.a(false)) {
              }
              this.a(114, (gf) null, var3);
              if (!th.field_d[var3.field_Q]) {
                this.field_n[var2].a(7769);
                this.field_n[var2] = null;
              }
              if (var3.h(40)) {
                this.a(var3, 0);
              }
            }
          }
          var2++;
        }
        var2Lifetime1 = -63 % ((44 - param0) / 57);
        return;
    }

    private final void o(int param0) {
        int var2;
        if ((lh.field_m >> this.field_q & 1) == 0 &&
          this.field_w > 0) {
          this.a(4, 251, (byte) -95);
        }
        if (0 == (gi.field_f >> this.field_q & 1)) {
          this.a(5, 250, (byte) -116);
        }
        if (0 == (1 & fc.field_a >> this.field_q)) {
          this.a(6, 249, (byte) -99);
        }
        var2 = 125 / ((param0 - 82) / 34);
        if ((1 & bc.field_f >> this.field_q) != 0 &&
          0 == (nf.field_u >> this.field_q & 1) &&
          this.field_w > 0) {
          this.a(7, 248, (byte) -125);
        }
        if ((bc.field_f >> this.field_q & 1) != 0 &&
          0 == (1 & bg.field_k >> this.field_q) &&
          this.field_w > 0) {
          this.a(8, 247, (byte) -90);
        }
        if ((1 & cj.field_b >> this.field_q) == 0 &&
          0 < this.field_w) {
          this.a(9, 246, (byte) -99);
        }
        if (2 == this.field_q &&
          this.field_w > 0) {
          this.a(10, 245, (byte) -123);
        }
        if (this.field_q == 5 &&
          this.field_w > 0) {
          this.a(11, 244, (byte) -81);
        }
        if (8 == this.field_q &&
          this.field_w > 0) {
          this.a(12, 243, (byte) -94);
          if (hc.field_G == 2) {
            this.a(14, 241, (byte) -112);
          }
        }
        if (0 == (dg.field_c >> this.field_q & 1) &&
          2 >= this.field_q && this.field_w > 0) {
          this.a(13, 242, (byte) -96);
        }
    }

    private final int j(int param0) {
        int var2;
        int var3;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        if (param0 <= 48) {
          return 48;
        }
        while (this.field_n[var2] != null) {
          var2++;
          if (var3 == 0) {
            continue;
          }
          break;
        }
        return var2;
    }

    final bg j(byte param0) {
        if (0 < this.field_H &&
          !this.field_W) {
          return vg.a(true, this.field_f, this.field_x, 3, this.field_i, 65514, this.field_g, new int[]{this.field_H}, 21);
        }
        if (param0 == -68) {
          return null;
        }
        return (bg) null;
    }

    private final void b(byte param0, int param1) {
        q.field_e.c(0, 0, 1907987);
        int var3 = -87 / ((-57 - param0) / 40);
        if (nd.field_M >= 0) {
          q.field_e.e(0, 0, nd.field_M);
        }
    }

    final void a(int param0, int param1) {
        if (param1 != 0) {
          this.A(-84);
        }
        if (this.field_fb < 0) {
          if (this.field_q >= 0 &&
            param0 < this.field_gb) {
            gi.field_f = gi.field_f | 1 << this.field_q;
          }
          this.field_y = true;
          this.field_gb = param0;
          if (255 < this.field_gb) {
            this.field_gb = 255;
          }
          if (this.field_gb < 0) {
            this.d(-6111);
            if (DrPhlogistonSavesTheEarth.field_D) {
              this.field_r = oj.field_e[this.field_gb];
            }
          } else {
            this.field_r = oj.field_e[this.field_gb];
          }
        }
    }

    private final void F(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 > -122) {
          this.b(-24);
        }
        boolean decompiledFrameCompleted0 = true;
        if (this.field_eb) {
          this.field_M.j(0);
          this.field_u = 0;
          var2 = -this.field_s + this.field_J;
          if (var2 <= 300) {
            boolean decompiledFrameCompleted1 = true;
            this.field_c = this.field_c + (-0.5 + Math.random());
            this.field_j = this.field_j + (-0.4 + Math.random());
            if (this.field_k == null) {
              this.field_k = new ck[10];
              var3 = 0;
              while (this.field_k.length > var3) {
                this.field_k[var3] = new ck();
                var3++;
                if (var4 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted1) {
              var3 = 0;
            }
            while (var3 < this.field_k.length) {
              this.field_k[var3].a((int)this.field_D + hi.a(ri.field_e, 4, this.field_l), var2 / 4, 1049600, -104, 1, (int)this.field_N + hi.a(am.field_l, 4, this.field_l));
              var3++;
              if (var4 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if ((decompiledFrameCompleted0) &&
              (var4 != 0)) {
              this.s(87);
              this.d((byte) 76);
            }
          } else {
            this.s(87);
            this.d((byte) 76);
          }
        }

    }

    private final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = qe.field_a * 3 * pi.field_S[0].field_c / -150;
        var3 = (-fk.field_m.field_h + 640) / 2;
        var4 = -(fk.field_m.field_h / 2) + 120;
        boolean decompiledSharedTail0 = !(qe.field_a <= -25);
        if (!decompiledSharedTail0) {
          fk.field_m.a(var3, var4);
          decompiledSharedTail0 = (var6 != 0);
        }
        if (decompiledSharedTail0) {
          var5_int = -(qe.field_a * 10);
          var4 = var4 - (255 - var5_int) / 2;
          fk.field_m.a(var3, var4, var5_int);
        }
        wj.f(var3 + 94, 101 + var4, var3 + 116, var4 + 131);
        var5_int = 0;
        do {
          if (var5_int > 3) {
            wj.a();
            cb.field_b.b(a.field_f, 320, 45 + var4, 16777215, 0);
            break;
          }
          pi.field_S[var5_int].e(var3 + 94, -var2 + (48 + (var4 + 53 - pi.field_S[0].field_c * -var5_int)));
          var5_int++;
        } while (var6 == 0);
        if (!param0) {
          return;
        }
        var5 = uf.field_d + (this.field_q / 3 + 1) + "-" + (this.field_q % 3 + 1);
        cb.field_b.b(var5, 320, cb.field_b.field_E + (var4 + 45), 16777215, 0);
        return;
    }

    private final void z(int param0) {
        boolean stackIn_15_0 = false;
        boolean stackIn_21_1 = false;
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (ck.field_f[98]) {
          si.field_C[0] = true;
          this.field_j = this.field_j - 0.5;
        }
        if (ck.field_f[99]) {
          this.field_j = this.field_j + 0.5;
          si.field_C[1] = true;
        }
        if (ck.field_f[96]) {
          this.field_c = this.field_c - 0.5;
          si.field_C[2] = true;
        }
        if (ck.field_f[97]) {
          this.field_c = this.field_c + 0.5;
          si.field_C[3] = true;
        }
        if (ck.field_f[81] &&
          this.field_O) {
          pa.field_c = this.field_J;
          ah.field_J = ib.field_t;
          L5: while (true) {
            ib.field_t = (ib.field_t + 1) % 4;
            stackIn_15_0 = nc.field_J[this.field_q][ib.field_t];
            do {
              if (!stackIn_15_0) {
                continue L5;
              }
              stackIn_15_0 = true;
            } while (var3 != 0);
            break;
          }
          s.field_e = stackIn_15_0;
        }
        stackIn_21_1 = !(ck.field_f[81]);
        this.field_O = stackIn_21_1;
        if (param0 != 215) {
          return;
        }
        boolean decompiledFrameRemainder3 = true;
        if (ck.field_f[em.field_e] &&
          0 != ib.field_t) {
          if (!nc.field_J[this.field_q][0]) {
            this.field_Z = 50;
            if (var3 != 0) {
              pa.field_c = this.field_J;
              ah.field_J = ib.field_t;
              ib.field_t = 0;
            }
          } else {
            pa.field_c = this.field_J;
            ah.field_J = ib.field_t;
            ib.field_t = 0;
          }
          s.field_e = true;
          decompiledFrameRemainder3 = (var3 != 0);
        }
        if (decompiledFrameRemainder3) {
          if (!ck.field_f[lb.field_A] ||
            ib.field_t == 1) {
            if ((!ck.field_f[vd.field_f] ||
              2 == ib.field_t) &&
              (decompiledFrameRemainder3 = !(!ck.field_f[lf.field_c])) &&
              (decompiledFrameRemainder3 = (ib.field_t != 3))) {
              if (nc.field_J[this.field_q][3]) {
                pa.field_c = this.field_J;
                ah.field_J = ib.field_t;
                ib.field_t = 3;
                if (var3 != 0) {
                  this.field_Z = 50;
                }
              } else {
                this.field_Z = 50;
              }
              s.field_e = true;
              decompiledFrameRemainder3 = (var3 != 0);
            }
            if (decompiledFrameRemainder3) {
              if (!nc.field_J[this.field_q][2]) {
                this.field_Z = 50;
                if (var3 != 0) {
                  pa.field_c = this.field_J;
                  ah.field_J = ib.field_t;
                  ib.field_t = 2;
                }
              } else {
                pa.field_c = this.field_J;
                ah.field_J = ib.field_t;
                ib.field_t = 2;
              }
              s.field_e = true;
              if (var3 != 0) {
                if (nc.field_J[this.field_q][1]) {
                  pa.field_c = this.field_J;
                  ah.field_J = ib.field_t;
                  ib.field_t = 1;
                  this.field_Z = 50;
                } else {
                  this.field_Z = 50;
                }
                s.field_e = true;
              }
            }
          } else {
            if (nc.field_J[this.field_q][1]) {
              pa.field_c = this.field_J;
              ah.field_J = ib.field_t;
              ib.field_t = 1;
              if (var3 != 0) {
                this.field_Z = 50;
              }
            } else {
              this.field_Z = 50;
            }
            s.field_e = true;
          }
        }
        if ((ck.field_f[83] ||
          ck.field_f[84]) &&
          (this.field_S == 0 &&
          this.field_J >= this.field_b &&
          0 >= gm.field_J)) {
          if (ib.field_t == 3) {
            ol.field_d = true;
          }
          this.field_S = this.field_A;
          lg.field_g = true;
        }
        boolean decompiledFrameRemainder2 = true;
        if (!ck.field_f[82] &&
          !ck.field_f[nj.field_a] ||
          !this.n(param0 ^ 176)) {
          if (this.field_u > 50) {
            this.a(23, (byte) 113);
            this.field_E = 0;
            nb.field_d = true;
            this.field_u = 0;
            decompiledFrameRemainder2 = (var3 != 0);
          }
          if (decompiledFrameRemainder2) {
            this.field_u = 0;
            decompiledFrameRemainder2 = (var3 != 0);
          }
        }
        if (decompiledFrameRemainder2) {
          if (this.field_u == 0) {
            od.a(-1630758008, this.field_M);
          }
          this.field_M.h(this.field_u + 196);
          this.field_M.j((int)((25.0 + (double)this.field_u / 2.0) * (double)dg.field_e / 80.0));
          this.field_u = this.field_u + 1;
          if (this.field_u > 200) {
            this.field_u = 200;
            this.field_E = this.field_E + 1;
            var2 = (int)(Math.exp((double)(-this.field_E) / 100.0) * 125.0);
            this.field_M.j(dg.field_e * var2 / 80);
          }
          if (this.field_u > 50) {
            ni.field_w = true;
          }
        }
        if (0 == this.field_u) {
          gi.a(this.field_M, 3408);
          this.field_M.i(-1);
        }
        boolean decompiledFrameRemainder1 = true;
        if (nj.field_j >= 2) {
          if (!this.field_W) {
            this.field_W = ck.field_f[12];
            decompiledFrameRemainder1 = (var3 != 0);
          }
          if (decompiledFrameRemainder1) {
            if (ck.field_f[11]) {
              if (ck.field_f[25]) {
                k.a(0, 1);
              }
              if (ck.field_f[16]) {
                k.a(0, 2);
              }
              if (ck.field_f[17]) {
                k.a(param0 ^ 215, 4);
              }
              if (ck.field_f[18]) {
                k.a(0, 8);
              }
              if (ck.field_f[19]) {
                k.a(0, 16);
              }
              if (ck.field_f[20]) {
                k.a(param0 - 215, 32);
              }
              if (ck.field_f[21]) {
                k.a(param0 - 215, 50);
              }
              if (ck.field_f[22]) {
                k.a(0, 100);
              }
            }
            if (ck.field_f[10]) {
              this.field_W = true;
              this.d((byte) -53, 1234567);
            }
            if (ck.field_f[88]) {
              this.field_W = true;
              this.d((byte) -87, -this.field_H);
            }
            if (ck.field_f[103]) {
              this.field_W = true;
              this.field_w = 0;
              this.d(-6111);
            }
            boolean decompiledFrameCompleted0 = true;
            if (ck.field_f[85]) {
              this.field_W = true;
              var2Lifetime1 = 0;
              while (var2Lifetime1 < this.field_n.length) {
                if (var3 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (null != this.field_n[var2Lifetime1]) {
                  this.field_n[var2Lifetime1].a(7769);
                }
                this.field_n[var2Lifetime1] = null;
                var2Lifetime1++;
              }
            }
            if ((decompiledFrameCompleted0) &&
              (ck.field_f[27])) {
              this.field_F = true;
              this.field_W = true;
            }
            boolean decompiledFrameRemainder0 = true;
            if (0 == (this.field_J & 15)) {
              if (ck.field_f[90]) {
                this.field_W = true;
                this.a(119, (double)hi.a(430, 4, this.field_l), 640.0, false, false);
              }
              if (ck.field_f[89]) {
                this.field_W = true;
                this.a(hi.a(430, 4, this.field_l), false, hi.a(77, 4, this.field_l), 640, 0, true);
              }
              if (ck.field_f[80] &&
                ck.field_f[86]) {
                this.field_W = true;
                if (ck.field_f[16]) {
                  this.a(0, 255, (byte) -105);
                }
                if (ck.field_f[17]) {
                  this.a(1, 254, (byte) -118);
                }
                if (ck.field_f[18]) {
                  this.a(2, 253, (byte) -81);
                }
                if (ck.field_f[19]) {
                  this.a(3, 252, (byte) -77);
                }
                if (ck.field_f[20]) {
                  this.a(4, 251, (byte) -83);
                }
                if (ck.field_f[21]) {
                  this.a(5, 250, (byte) -107);
                }
                if (ck.field_f[22]) {
                  this.a(6, 249, (byte) -121);
                }
                if (ck.field_f[23]) {
                  this.a(7, 248, (byte) -105);
                }
                if (ck.field_f[24]) {
                  this.a(8, 247, (byte) -90);
                }
                if (ck.field_f[25]) {
                  this.a(9, 246, (byte) -92);
                }
                if (ck.field_f[32]) {
                  this.a(10, 245, (byte) -105);
                }
                if (ck.field_f[33]) {
                  this.a(11, 244, (byte) -80);
                }
                if (ck.field_f[34]) {
                  this.a(12, 243, (byte) -107);
                }
                decompiledFrameRemainder0 = !(!ck.field_f[35]);
                if (decompiledFrameRemainder0) {
                  this.a(13, 242, (byte) -96);
                  decompiledFrameRemainder0 = (var3 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (ck.field_f[80] &&
                  !ck.field_f[86]) {
                  this.field_W = true;
                  if (ck.field_f[16]) {
                    this.field_d[this.f(0)] = new ib(640.0, 215.0, 1, false, false);
                  }
                  if (ck.field_f[17]) {
                    this.field_d[this.f(0)] = new ib(640.0, 215.0, 2, false, false);
                  }
                  if (ck.field_f[18]) {
                    this.field_d[this.f(qk.a(param0, 215))] = new ib(640.0, 215.0, 3, false, false);
                  }
                  if (ck.field_f[19]) {
                    this.field_d[this.f(0)] = new ib(640.0, 215.0, 4, false, false);
                  }
                  if (ck.field_f[20]) {
                    this.field_d[this.f(0)] = new ib(640.0, 215.0, 5, false, false);
                  }
                  if (ck.field_f[21]) {
                    this.field_d[this.f(qk.a(param0, 215))] = new ib(640.0, 215.0, 6, false, false);
                  }
                  decompiledFrameRemainder0 = !(!ck.field_f[22]);
                  if (decompiledFrameRemainder0) {
                    this.field_d[this.f(0)] = new ib(640.0, 215.0, 7, false, false);
                    decompiledFrameRemainder0 = (var3 != 0);
                  }
                }
                if ((decompiledFrameRemainder0) && (ck.field_f[86] &&
                  !ck.field_f[80])) {
                  this.field_W = true;
                  if (!ck.field_f[102]) {
                    if (ck.field_f[16]) {
                      this.a(250, true, 0, 640, 0, true);
                    }
                    if (ck.field_f[17]) {
                      this.a(215, true, 1, 640, 0, true);
                    }
                    if (ck.field_f[18]) {
                      this.a(215, true, 2, 640, 0, true);
                    }
                    if (ck.field_f[19]) {
                      this.a(215, true, 3, 640, 0, true);
                    }
                    if (ck.field_f[20]) {
                      this.a(215, true, 4, 640, 0, true);
                    }
                    if (ck.field_f[21]) {
                      this.a(215, true, 5, 640, 0, true);
                    }
                    if (ck.field_f[22]) {
                      this.a(215, true, 6, 640, 0, true);
                    }
                    if (ck.field_f[23]) {
                      this.a(215, true, 7, 640, 0, true);
                    }
                    if (ck.field_f[24]) {
                      this.a(215, true, 8, 640, 0, true);
                    }
                    if (ck.field_f[25]) {
                      this.a(215, true, 9, 640, 0, true);
                    }
                    if (ck.field_f[26]) {
                      this.a(215, true, 10, 640, 0, true);
                    }
                    if (ck.field_f[27]) {
                      this.a(215, true, 11, 640, 0, true);
                    }
                    if (ck.field_f[32]) {
                      this.a(215, true, 12, 640, 0, true);
                    }
                    if (ck.field_f[33]) {
                      this.a(215, true, 13, 640, 0, true);
                    }
                    if (ck.field_f[34]) {
                      this.a(215, true, 14, 640, 0, true);
                    }
                    if (ck.field_f[35]) {
                      this.a(215, true, 15, 640, 0, true);
                    }
                    if (ck.field_f[36]) {
                      this.a(215, true, 16, 640, 0, true);
                    }
                    if (ck.field_f[37]) {
                      this.a(215, true, 17, 640, 0, true);
                    }
                    if (ck.field_f[38]) {
                      this.a(215, true, 18, 640, 0, true);
                    }
                    if (ck.field_f[39]) {
                      this.a(215, true, 19, 640, 0, true);
                    }
                    if (ck.field_f[40]) {
                      this.a(215, true, 20, 640, 0, true);
                    }
                    if (ck.field_f[41]) {
                      this.a(215, true, 21, 640, 0, true);
                    }
                    if (ck.field_f[42]) {
                      this.a(215, true, 22, 640, 0, true);
                    }
                    if (ck.field_f[43]) {
                      this.a(215, true, 23, 640, 0, true);
                    }
                    if (ck.field_f[48]) {
                      this.a(215, true, 24, 640, 0, true);
                    }
                    if (ck.field_f[49]) {
                      this.a(215, true, 25, 640, 0, true);
                    }
                    if (ck.field_f[50]) {
                      this.a(215, true, 26, 640, 0, true);
                    }
                    if (ck.field_f[51]) {
                      this.a(215, true, 27, 640, 0, true);
                    }
                    if (ck.field_f[52]) {
                      this.a(215, true, 28, 640, 0, true);
                    }
                    if (ck.field_f[53]) {
                      this.a(215, true, 29, 640, 0, true);
                    }
                    if (ck.field_f[54]) {
                      this.a(215, true, 30, 640, 0, true);
                    }
                    if (ck.field_f[55]) {
                      this.a(215, true, 31, 640, 0, true);
                    }
                    if (ck.field_f[56]) {
                      this.a(215, true, 32, 640, 0, true);
                    }
                    if (ck.field_f[57]) {
                      this.a(215, true, 33, 640, 0, true);
                    }
                    if (ck.field_f[58]) {
                      this.a(215, true, 34, 640, 0, true);
                    }
                    if (ck.field_f[59]) {
                      this.a(215, true, 35, 640, 0, true);
                    }
                    if (ck.field_f[74]) {
                      this.a(215, true, 36, 640, 0, true);
                    }
                    if (ck.field_f[64]) {
                      this.a(215, true, 37, 640, 0, true);
                    }
                    if (ck.field_f[65]) {
                      this.a(215, true, 38, 640, 0, true);
                    }
                    if (ck.field_f[66]) {
                      this.a(215, true, 39, 640, 0, true);
                    }
                    if (ck.field_f[67]) {
                      this.a(215, true, 40, 640, 0, true);
                    }
                    if (ck.field_f[68]) {
                      this.a(215, true, 41, 640, 0, true);
                    }
                    if (ck.field_f[69]) {
                      this.a(215, true, 42, 640, 0, true);
                    }
                    if (ck.field_f[70]) {
                      this.a(250, true, 43, 640, 0, true);
                    }
                    if (ck.field_f[71]) {
                      this.a(250, true, 44, 640, 0, true);
                    }
                    if (ck.field_f[72]) {
                      this.a(250, true, 45, 640, 0, true);
                    }
                    decompiledFrameRemainder0 = !(!ck.field_f[73]);
                    if (decompiledFrameRemainder0) {
                      this.a(250, true, 46, 640, 0, true);
                      decompiledFrameRemainder0 = (var3 != 0);
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    if (ck.field_f[16]) {
                      this.a(250, true, 47, -90, 0, true);
                    }
                    if (ck.field_f[17]) {
                      this.a(215, true, 48, 640, 0, true);
                    }
                    if (ck.field_f[18]) {
                      this.a(215, true, 49, 640, 0, true);
                    }
                    if (ck.field_f[19]) {
                      this.a(215, true, 50, 640, 0, true);
                    }
                    if (ck.field_f[20]) {
                      this.a(215, true, 51, 640, 0, true);
                    }
                    if (ck.field_f[21]) {
                      this.a(215, true, 52, 640, 0, true);
                    }
                    if (ck.field_f[22]) {
                      this.a(215, true, 53, 640, 0, true);
                    }
                    if (ck.field_f[23]) {
                      this.a(215, true, 54, 640, 0, true);
                    }
                    if (ck.field_f[24]) {
                      this.a(215, true, 55, 640, 0, true);
                    }
                    if (ck.field_f[25]) {
                      this.a(215, true, 56, 640, 0, true);
                    }
                    if (ck.field_f[26]) {
                      this.a(215, true, 57, 640, 0, true);
                    }
                    if (ck.field_f[27]) {
                      this.a(215, true, 58, 640, 0, true);
                    }
                    if (ck.field_f[32]) {
                      this.a(215, true, 59, 640, 0, true);
                    }
                    if (ck.field_f[33]) {
                      this.a(215, true, 60, 640, 0, true);
                    }
                    if (ck.field_f[34]) {
                      this.a(215, true, 61, 640, 0, true);
                    }
                    if (ck.field_f[35]) {
                      this.a(215, true, 62, 640, 0, true);
                    }
                    if (ck.field_f[36]) {
                      this.a(215, true, 63, 640, 0, true);
                    }
                    if (ck.field_f[37]) {
                      this.a(215, true, 64, 640, 0, true);
                    }
                    if (ck.field_f[38]) {
                      this.a(215, true, 65, 640, 0, true);
                    }
                    if (ck.field_f[39]) {
                      this.a(215, true, 66, 640, 0, true);
                    }
                    if (ck.field_f[40]) {
                      this.a(215, true, 67, 640, 0, true);
                    }
                    if (ck.field_f[41]) {
                      this.a(215, true, 68, 640, 0, true);
                    }
                    if (ck.field_f[42]) {
                      this.a(215, true, 69, 640, 0, true);
                    }
                    if (ck.field_f[43]) {
                      this.a(215, true, 70, 640, 0, true);
                    }
                    if (ck.field_f[48]) {
                      this.a(215, true, 71, 640, 0, true);
                    }
                    if (ck.field_f[49]) {
                      this.a(215, true, 72, 640, 0, true);
                    }
                    if (ck.field_f[50]) {
                      this.a(215, true, 73, 640, 0, true);
                    }
                    if (ck.field_f[51]) {
                      this.a(215, true, 74, 640, 0, true);
                    }
                    if (ck.field_f[52]) {
                      this.a(215, true, 75, 640, 0, true);
                    }
                    if (ck.field_f[53]) {
                      this.a(215, true, 76, 640, 0, true);
                    }
                  }
                }
              }
            }
            if (ck.field_f[87]) {
              this.field_ab = true;
              this.field_W = true;
              this.H(1);
            }
            if (ck.field_f[2]) {
              this.field_ab = true;
              this.field_q = 0;
              this.field_W = true;
              this.H(1);
            }
            if (ck.field_f[3]) {
              this.field_W = true;
              this.field_q = 1;
              this.field_ab = true;
              this.H(1);
            }
            if (ck.field_f[4]) {
              this.field_ab = true;
              this.field_W = true;
              this.field_q = 2;
              this.H(1);
            }
            if (ck.field_f[5]) {
              this.field_q = 3;
              this.field_ab = true;
              this.field_W = true;
              this.H(1);
            }
            if (ck.field_f[6]) {
              this.field_ab = true;
              this.field_q = 4;
              this.field_W = true;
              this.H(param0 ^ 214);
            }
            if (ck.field_f[7]) {
              this.field_ab = true;
              this.field_W = true;
              this.field_q = 5;
              this.H(1);
            }
            if (ck.field_f[8]) {
              this.field_ab = true;
              this.field_q = 6;
              this.field_W = true;
              this.H(param0 ^ 214);
            }
            if (ck.field_f[9]) {
              this.field_W = true;
              this.field_q = 7;
              this.field_ab = true;
              this.H(1);
            }
          }
        }

    }

    private final void a(int param0, int param1, int param2) {
        int var5 = 97 % ((50 - param1) / 52);
        int var4 = this.m(1280);
        this.field_hb[var4] = new td(13, param2, param0, -1);
    }

    private final void i(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != -1) {
          this.v(-22);
        }
        if (this.field_q == 0 ||
          this.field_q == 3) {
          var2 = 1;
          var3 = 0;
          L11: while (true) {
            if (si.field_C.length > var3) {
              var2 = var2 != 0 & si.field_C[var3] ? 1 : 0;
              var3++;
              if (var4 == 0) {
                continue;
              }
            } else {
              if (el.field_tb == 0 &&
                var2 != 0) {
                el.field_tb = el.field_tb + 1;
              }
            }
            if (el.field_tb == 1 &&
              lg.field_g) {
              el.field_tb = el.field_tb + 1;
            }
            if (2 == el.field_tb &&
              s.field_e) {
              el.field_tb = el.field_tb + 1;
            }
            if (el.field_tb == 3 &&
              ni.field_w) {
              el.field_tb = el.field_tb + 1;
            }
            if (el.field_tb == 4 &&
              nb.field_d) {
              el.field_tb = el.field_tb + 1;
            }
            if (5 == el.field_tb &&
              ol.field_d) {
              el.field_tb = el.field_tb + 1;
            }
            if (5 == el.field_tb &&
              this.field_q == 0) {
              we.field_f = we.field_f + 1;
              if (var4 == 0) {
                break L11;
              }
            }
            if (el.field_tb != 6 ||
              this.field_q != 3) {
              we.field_f = 0;
              if (var4 == 0) {
                break L11;
              }
            }
            we.field_f = we.field_f + 1;
            break;

          }
        }

    }

    private final void a(boolean param0) {
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        Object stackIn_57_0 = null;
        gf stackIn_57_1 = null;
        int var2 = 0;
        gf var3_ref_gf = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var2Lifetime1;
        int var4Lifetime1;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (this.field_S > 0 &&
          this.field_b <= this.field_J) {
          this.a(ib.field_t + 19, (byte) 34);
          if (this.field_S <= 0) {
            boolean decompiledSharedTail1 = (ib.field_t == 2);
            if (!decompiledSharedTail1) {
              var2 = ni.field_v[ib.field_t];
              decompiledSharedTail1 = (var5 != 0);
            }
            if (decompiledSharedTail1) {
              var2 = (int)((double)ni.field_v[ib.field_t] / Math.pow(1.25, (double)this.field_A));
            }
            this.field_b = this.field_J + var2;
            if (var5 != 0) {
              this.field_b = this.field_b + gg.field_i[ib.field_t];
            }
          } else {
            this.field_b = this.field_b + gg.field_i[ib.field_t];
          }
        }
        var2Lifetime1 = 0;
        L5: while (true) {
          if (var2Lifetime1 < 1400) {
            var3_ref_gf = this.field_m[var2Lifetime1];
            stackIn_57_0 = null;
            stackIn_57_1 = var3_ref_gf;
            if (var5 != 0) {
              while (true) {
                if (stackIn_57_0 != stackIn_57_1 &&
                  this.field_v[var2Lifetime1].a((byte) -93)) {
                  this.field_v[var2Lifetime1] = null;
                }
                var2Lifetime1++;
                break L5;
              }
            }
            if (stackIn_57_0 != stackIn_57_1) {
              boolean decompiledSharedTail0 = (28 == var3_ref_gf.field_I);
              if (!decompiledSharedTail0) {
                stackIn_17_0 = (!var3_ref_gf.a(16510, this.field_D, 640.0)) ? 0 : 1;
                var4 = stackIn_17_0;
                decompiledSharedTail0 = (var5 != 0);
              }
              if (decompiledSharedTail0) {
                stackIn_21_0 = (!var3_ref_gf.a(var3_ref_gf.field_d, this.field_D + (double)ri.field_q, this.field_N + (double)am.field_p, var3_ref_gf.field_F, param0)) ? 0 : 1;
                var4 = stackIn_21_0;
              }
              if (var3_ref_gf.field_I == 20 &&
                435.0 < var3_ref_gf.field_m) {
                var4 = 1;
                this.a(ld.field_h[var3_ref_gf.field_I], (int)var3_ref_gf.field_m, gf.field_k[var3_ref_gf.field_I], (int)var3_ref_gf.field_i, 27396);
              }
              if (var4 != 0) {
                this.field_m[var2Lifetime1] = null;
              }
            }
            var2Lifetime1++;
            if (var5 == 0) {
              continue;
            }
          }
          if (!param0) {
            return;
          }
          var2Lifetime1 = 0;
          while (800 > var2Lifetime1) {
            if (null != this.field_v[var2Lifetime1] &&
              this.field_v[var2Lifetime1].a((byte) -93)) {
              this.field_v[var2Lifetime1] = null;
            }
            var2Lifetime1++;
            if (var5 == 0) {
              continue;
            }
            break;
          }
          break;
        }
        var3 = 0;
        while (this.field_h.length > var3) {
          if (var5 == 0) {
            if (this.field_u >= 50) {
              if (100 > this.field_u) {
                var4Lifetime1 = 65536 * (this.field_u >> 3);
              } else if (150 > this.field_u) {
                var4Lifetime1 = (this.field_u >> 3) * 65792;
              } else {
                var4Lifetime1 = 65537 * (this.field_u >> 3);
              }
            } else {
              var4Lifetime1 = 65793 * (this.field_u >> 4);
            }
            this.field_h[var3].a((int)(this.field_D + (double)hi.a((int)(1.5 * (double)ri.field_e), 4, this.field_l) - (double)(ri.field_e / 3)), 15, var4Lifetime1, -5, 1, (int)(this.field_N + (double)hi.a((int)((double)am.field_l * 1.5), 4, this.field_l) - (double)(am.field_l / 3)));
            var3++;
            continue;
          }
          break;
        }
        return;
    }

    private final int g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        do {
          if (this.field_m[var2] == null) {
            if (param0 != 119) {
              this.i((byte) -102);
            }
            break;
          }
          var2++;
        } while (var3 == 0);
        return var2;
    }

    private final void c(byte param0) {
        Object var2;
        int var3;
        int var4;
        boolean stackIn_15_0 = false;
        int stackIn_20_0 = 0;
        boolean stackOut_14_0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = null;
        if (0 == this.field_q) {
          var2 = oi.field_f;
        }
        if (param0 <= 109) {
          return;
        }
        if (1 == this.field_q) {
          var2 = sg.field_e;
        }
        if (2 == this.field_q) {
          var2 = uk.field_h;
        }
        if (var2 == null) {
          return;
        }
        var3 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var3 >= 20))) {
          al.field_g[var3] = hi.a(640, 4, this.field_l);
          stackOut_14_0 = ((he) (var2)).b(0, 0, al.field_g[var3], 305);
          stackIn_20_0 = stackOut_14_0 ? 1 : 0;
          stackIn_15_0 = stackOut_14_0;
          if (var4 == 0) {
            if (!stackIn_15_0) {
              var3--;
            }
            var3++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          bc.field_d.c();
          wj.f(0, 0, bc.field_d.field_y, bc.field_d.field_w, 0);
          lb.field_C.a(124);
          stackIn_20_0 = this.field_q;
        }
        ab.field_b = stackIn_20_0;
        return;
    }

    private final void c(byte param0, int param1) {
        if (0 < param1) {
          this.field_R = this.field_R + param1;
        }
        if (param0 != -61) {
          this.a(-77, -76);
        }
    }

    final void a(int param0, gf param1) {
        try {
          if (param0 != 24) {
            this.c(69);
          }
          this.field_v[this.h((byte) -111)] = param1;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "j.RA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void H(int param0) {
        int var2 = 0;
        int var3 = 0;
        nl var4 = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != 1) {
          return;
        }
        if (this.field_eb) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        this.field_Z = 0;
        this.field_fb = 0;
        if (gm.field_J >= 500) {
          this.s(94);
          var2 = 0;
          while (true) {
            if (si.field_C.length > var2) {
              si.field_C[var2] = true;
              var2++;
              if (var3 == 0) {
                continue;
              }
            } else {
              lg.field_g = true;
              s.field_e = true;
              ni.field_w = true;
              nb.field_d = true;
              wb.a(34);
            }
            break;
          }
          decompiledFrameRemainder0 = (var3 != 0);
        }
        if (decompiledFrameRemainder0) {
          if (gm.field_J == 0) {
            gf.field_D = Math.max(1 + sd.field_a.field_q, gf.field_D);
            var4 = new nl(0, -1 + gf.field_D, 0, 0, 0, 0);
            if (oh.a(param0 - 1)) {
              dl.field_M.a(var4, param0 + 254);
              if (var3 != 0) {
                rc.a(5, var4, -11659);
              }
            } else {
              rc.a(5, var4, -11659);
            }
          }
          if (!(gm.field_J > 128) ||
            this.field_R == 0) {
            gm.field_J = gm.field_J + 1;
          }
          this.o(param0 + 122);
        }

    }

    private final void u(int param0) {
        int var2;
        int var3;
        String var4;
        String var5;
        int var6;
        int var2Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if ((gm.field_J <= 0) &&
          (decompiledFrameRemainder0 = (this.field_eb))) {
          var2 = (-this.field_s + this.field_J) * 255 / 300;
          if (255 < var2) {
            var2 = 255;
          }
          be.a(64 + var2 / 2, -(var2 / 2 + 64), -(var2 / 2 + 64));
          be.b(var2 * 2 + 128);
          decompiledFrameRemainder0 = (var6 != 0);
        }
        if (decompiledFrameRemainder0) {
          if (150 < gm.field_J) {
            if (this.field_D > (double)ri.field_e) {
              this.field_j = this.field_j - 0.5;
              if (var6 != 0) {
                this.field_j = 0.0;
              }
            } else {
              this.field_j = 0.0;
            }
          }
          if (gm.field_J >= 50) {
            be.a(0, 0, 640, 430, 22070844, 255);
            var2Lifetime1 = gm.field_J * 2;
            if (255 < var2Lifetime1) {
              var2Lifetime1 = 255;
            }
            var3 = (-150 + gm.field_J) * 2;
            if (var3 > 255) {
              var3 = 255;
            }
            cb.field_b.b(vh.field_d, 320, 200, 16777215, -1, var2Lifetime1);
            if (0 > var3) {
              var3 = 0;
            }
            var4 = sa.field_g + this.field_H;
            cb.field_b.b(var4, 320, 250, 16777215, -1, var2Lifetime1);
            if (0 < this.field_R) {
              var5 = kh.field_o + this.field_T + af.field_c + this.field_X + l.field_h + this.field_R;
              cb.field_b.b(var5, 320, 255 + cb.field_b.field_x, 16777215, -1, var2Lifetime1);
              if (var2Lifetime1 > 200) {
                if (this.field_R <= 29) {
                  this.d((byte) -100, this.field_R);
                  this.field_R = 0;
                  if (var6 != 0) {
                    this.field_R = this.field_R - 29;
                    this.d((byte) -100, 29);
                  }
                } else {
                  this.field_R = this.field_R - 29;
                  this.d((byte) -100, 29);
                }
              }
            }
            cb.field_b.b(bj.field_b, 320, 320, 16711680, -1, var3);
            if (var6 != 0) {
              be.a(0, 0, 640, 430, 22070844, gm.field_J * 5);
            }
          } else {
            be.a(0, 0, 640, 430, 22070844, gm.field_J * 5);
          }
        }
        if (param0 != 7) {
          this.field_u = -51;
        }
    }

    private final void v(int param0) {
        int var2 = 0;
        int var3 = 0;
        boolean decompiledFrameCompleted0 = true;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = this.field_q;
        if (var2 == 2) {
          var2 = 0;
          while (var2 < 64) {
            wj.a(var2 * 10, i.field_c[var2], 20, 16777215, 64);
            var2++;
            if (var3 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
          }
        }
        if ((decompiledFrameCompleted0) &&
          (param0 > -56)) {
          field_e = 123;
        }

    }

    private final void a(int param0, double param1, double param2, boolean param3, boolean param4) {
        if (param0 <= 111) {
          this.b(true);
        }
        int var8 = this.field_q <= 5 ? 430 : 334;
        if ((double)var8 < param1) {
          param1 = (double)(-of.field_x.field_c + var8);
        }
        this.field_d[this.f(0)] = new ib(param2, param1, param3, param4);
    }

    private final void a(byte param0) {
        fj var2;
        int var3;
        int var4;
        int var5;
        int var6;
        fj var7;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var3 = -108 / ((param0 - 60) / 54);
        var7 = (fj) (this.field_I.h(-11151));
        var2 = var7;
        if (var2 != null) {
          var5 = this.field_bb;
          if (80 <= var5) {
            if (var5 < 230) {
              var4 = 8;
              if (var6 != 0) {
                var4 = -(var5 / 2) + 123;
                var4 = var5 / 2 - 32;
              }
            } else {
              var4 = -(var5 / 2) + 123;
              if (var6 != 0) {
                var4 = var5 / 2 - 32;
              }
            }
          } else {
            var4 = var5 / 2 - 32;
          }
          di.field_b[var7.field_h].b(8, var4);
          a.field_g.c(sc.field_b[var7.field_h], 48, a.field_g.field_x + var4, 16777215, -1);
        }
    }

    private final void d(byte param0, int param1) {
        int var3 = 0;
        if (param0 >= -37) {
          return;
        }
        if (param1 > 0) {
          var3 = (int)(cd.a((byte) 97) * (double)this.field_L * (double)param1);
          this.field_i = this.field_i + var3;
          this.field_g = this.field_g ^ var3;
          this.field_H = this.field_H + var3;
          this.field_f = this.field_f + var3;
          this.field_x = this.field_x ^ var3;
          this.field_f = this.field_f + var3;
        }
    }

    private final void c(int param0) {
        int stackIn_5_0 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        bf var6 = null;
        int var7_int = 0;
        ib var7 = null;
        int var8 = 0;
        int var9 = 0;
        bf var10 = null;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        int var19 = 0;
        int var20 = 0;
        bf var10Lifetime1;
        bf var10Lifetime2;
        int var8Lifetime1;
        double var11Lifetime1;
        double var13Lifetime1;
        var19 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (3 == this.field_q) {
          return;
        }
        var4 = this.field_G.field_h.length;
        var5 = -this.field_J + var4;
        var7_int = 0;
        while (true) {
          stackIn_5_0 = 1600;
          if (stackIn_5_0 > var7_int) {
            var6 = this.field_n[var7_int];
            var10 = var6;
            var10Lifetime2 = var6;
            if (var19 == 0) {
              if (var6 != null &&
                !var6.field_s &&
                !cj.field_c[var6.field_Q] &&
                var6.field_Q != 40) {
                var3 = var6.field_I + ((int)var6.field_o + this.field_J);
                var8 = (int)var6.field_o;
                while ((int)((double)var6.field_m + var6.field_o) > var8) {
                  stackIn_5_0 = var8 + this.field_J;
                  if (stackIn_5_0 < 0) {
                    break;
                  }
                  if (var8 < var5) {
                    var2 = -this.field_G.field_h[this.field_J + var8] + 430;
                  } else {
                    var2 = 330;
                    if (3 == this.field_q ||
                      this.field_q == 4 ||
                      5 == this.field_q) {
                      var2 = 0;
                    }
                  }
                  if (var4 > var3 &&
                    var6.field_N + (double)var6.field_O > (double)(430 - this.field_G.field_h[var3]) ||
                    var6.b((byte) 55).b((int)var6.field_o, (int)var6.field_N, var8, var2)) {
                    var6.field_j = -2.0;
                    var6.field_N = var6.field_N - 5.0;
                    var6.c(5);
                  }
                  var8++;
                }
              }
              var7_int++;
              continue;
            }
          } else {
            if (param0 != -6718) {
              this.a(121, -0.13010396482122083, -0.11679658977195154, true, true);
            }
          }
          var20 = 0;
          var8Lifetime1 = var20;
          while (var20 < 160) {
            var7 = this.field_d[var20];
            if (var19 == 0) {
              if (var7 != null &&
                var7.field_q) {
                var9 = 0;
                while (var9 < 1600) {
                  var10Lifetime1 = this.field_n[var9];
                  if (var10Lifetime1 != null &&
                    cj.field_c[var10Lifetime1.field_Q] &&
                    !var10Lifetime1.field_s &&
                    ne.a(var10Lifetime1.b((byte) 55), (int)var10Lifetime1.field_o, (int)var10Lifetime1.field_N, var7.field_n, (int)var7.field_d, (int)var7.field_k)) {
                    var11 = 0.0;
                    var11Lifetime1 = -var7.field_b - 1.0 + -1.0;
                    var13 = 0.0;
                    var7.field_b = var11Lifetime1;
                    var13Lifetime1 = -var7.field_p;
                    var7.field_p = var13Lifetime1;
                    var15 = Math.sqrt(var7.field_b * var7.field_b + var7.field_p * var7.field_p);
                    if (var15 != 0.0) {
                      var7.field_b = var7.field_b / var15;
                      var7.field_p = var7.field_p / var15;
                      var17 = Math.pow(0.95, (double)var7.field_c);
                      var7.field_b = var7.field_b * var17;
                      var7.field_p = var7.field_p * var17;
                    } else {
                      var17 = Math.random() * 6.283185307179586;
                      var7.field_b = ji.a(65535, var17);
                      var7.field_p = pj.a(var17, 32768);
                    }
                  }
                  var9++;
                }
              }
              var20++;
              continue;
            }
            break;
          }
          return;
        }
    }

    private final void a(int param0, byte param1) {
        double stackIn_99_0 = 0.0;
        double stackIn_100_1 = 0.0;
        int stackIn_111_0 = 0;
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13_int = 0;
        double var13 = 0.0;
        double var15 = 0.0;
        double[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        double var24 = 0.0;
        double var26 = 0.0;
        Object var28 = null;
        int var29 = 0;
        double var30 = 0.0;
        int var32 = 0;
        gf var32_ref_gf = null;
        int var33 = 0;
        int var34 = 0;
        double var34_double = 0.0;
        double var36 = 0.0;
        int var38 = 0;
        bf var39 = null;
        bf var40 = null;
        bf var41 = null;
        bf var42 = null;
        var38 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param1 < 21) {
          this.a(-113, -38, 62, 92, 4);
        }
        var3 = 0.0;
        var5 = 0.0;
        var7 = 0.0;
        var9 = 0.0;
        if (this.field_eb) {
          return;
        }
        boolean decompiledFrameRemainder6 = true;
        boolean decompiledFrameRemainder5 = true;
        boolean decompiledFrameRemainder4 = true;
        boolean decompiledFrameRemainder3 = true;
        boolean decompiledFrameRemainder2 = true;
        var5 = (double)ri.field_q + this.field_D;
        lh.field_m = lh.field_m | 1 << this.field_q;
        var3 = this.field_N + (double)am.field_p;
        var13_int = param0;
        if (((19 != var13_int ||
          var38 != 0) && var13_int != 24 && (var13_int != 25 ||
          var38 != 0)) &&
          (decompiledFrameRemainder2 = (var13_int != 20 ||
          var38 != 0)) &&
          (decompiledFrameRemainder3 = (var13_int != 21 ||
          var38 != 0)) &&
          (decompiledFrameRemainder4 = (22 != var13_int ||
          var38 != 0)) &&
          (decompiledFrameRemainder6 = (var13_int == 23))) {
          decompiledFrameRemainder5 = (var38 != 0);
        }
        if ((decompiledFrameRemainder6) &&
          (decompiledFrameRemainder5) &&
          (decompiledFrameRemainder4) &&
          (decompiledFrameRemainder3) &&
          (decompiledFrameRemainder2)) {
          var7 = 23.0;
          if (param0 == 25) {
            var7 = 34.0;
          }
          var9 = 0.0;
          var5 = var5 + 1.0;
          var3 = -32.0 + (this.field_N + (double)am.field_l);
          decompiledFrameRemainder6 = (var38 != 0);
        }
        if ((decompiledFrameRemainder6) &&
          (decompiledFrameRemainder5) &&
          (decompiledFrameRemainder4) &&
          (decompiledFrameRemainder3)) {
          var7 = this.field_c;
          var9 = 0.0;
          decompiledFrameRemainder6 = (var38 != 0);
        }
        if ((decompiledFrameRemainder6) &&
          (decompiledFrameRemainder5) &&
          (decompiledFrameRemainder4)) {
          param0 = 28;
          decompiledFrameRemainder6 = (var38 != 0);
        }
        if ((decompiledFrameRemainder6) &&
          (decompiledFrameRemainder5)) {
          var9 = (double)(hi.a(this.field_S * 4, 4, this.field_l) - this.field_S * 2);
          var7 = 10.0;
          decompiledFrameRemainder6 = (var38 != 0);
        }
        if (decompiledFrameRemainder6) {
          var7 = 10.0;
          var9 = 0.0;
        }
        L13: {
          L14: {
            boolean decompiledFrameCompleted0 = true;
            var32 = param0;
            if (var32 == 19 &&
              var38 == 0) {
              var32 = this.field_S;
              switch ((var38 == 0
                || var32 == 1
                || var32 == 3
                || var32 == 5
                || var32 == 6
                || var32 == 7
                || var32 == 8
                ) ? var32 : -1) {
                case 1:
                  var9 = var9 + 3.0 * (Math.random() - 0.5);
                  this.field_m[this.g((byte) 119)] = new gf(param0, var3, var5, var7, var9, 800.0, this.field_D);
                  this.field_S = 0;
                  {
                    break L13;
                  }
                case 2:
                  var11 = 2.0 * (-0.5 + Math.random()) + 0.5;
                  this.field_m[this.g((byte) 119)] = new gf(param0, var3 - 10.0, var5 - 6.0, var7, var9 + var11, 800.0, this.field_D);
                  this.field_m[this.g((byte) 119)] = new gf(param0, var3 - 10.0, 6.0 + var5, var7, var9 - var11, 800.0, this.field_D);
                  this.field_S = 0;
                  {
                    break L14;
                  }
                case 3:
                  var11 = (Math.random() - 0.5) * 1.0 + 1.0;
                  this.field_m[this.g((byte) 119)] = new gf(param0, var3 - 10.0, var5 - 6.0, var7, var9 - var11, 800.0, this.field_D);
                  this.field_m[this.g((byte) 119)] = new gf(param0, var3, var5, var7, var9, 800.0, this.field_D);
                  this.field_m[this.g((byte) 119)] = new gf(param0, -10.0 + var3, 6.0 + var5, var7, var9 + var11, 800.0, this.field_D);
                  this.field_S = 0;
                  {
                    break L14;
                  }
                case 4:
                  var11 = 0.5 + (Math.random() - 0.5) * 1.0;
                  this.field_m[this.g((byte) 119)] = new gf(param0, -10.0 + var3, -6.0 + var5, var7, var9 - var11, 800.0, this.field_D);
                  this.field_m[this.g((byte) 119)] = new gf(24, var3, var5, 2.0 + var7, var9, 800.0, this.field_D);
                  this.field_m[this.g((byte) 119)] = new gf(param0, -10.0 + var3, var5 + 6.0, var7, var9 + var11, 800.0, this.field_D);
                  this.field_S = 0;
                  {
                    break L14;
                  }
                case 5:
                  var11 = 0.5 + 2.0 * (Math.random() - 0.5);
                  this.field_m[this.g((byte) 119)] = new gf(24, -10.0 + var3, -6.0 + var5, 2.0 + var7, -var11 + var9, 800.0, this.field_D);
                  this.field_m[this.g((byte) 119)] = new gf(param0, var3, var5, var7, var9, 800.0, this.field_D);
                  this.field_m[this.g((byte) 119)] = new gf(24, var3 - 10.0, var5 + 6.0, var7 + 2.0, var9 + var11, 800.0, this.field_D);
                  this.field_S = 0;
                  {
                    break L14;
                  }
                case 6:
                  var11 = 1.0 + 1.5 * (-0.5 + Math.random());
                  this.field_m[this.g((byte) 119)] = new gf(24, var3 - 10.0, -6.0 + var5, 2.0 + var7, -var11 + var9, 800.0, this.field_D);
                  this.field_m[this.g((byte) 119)] = new gf(24, var3, var5, 2.0 + var7, var9, 800.0, this.field_D);
                  this.field_m[this.g((byte) 119)] = new gf(24, var3 - 10.0, var5 + 6.0, 2.0 + var7, var9 + var11, 800.0, this.field_D);
                  this.field_S = 0;
                  {
                    break L14;
                  }
                case 7:
                  var11 = 2.0 * (-0.5 + Math.random()) + 0.5;
                  this.field_m[this.g((byte) 119)] = new gf(24, -10.0 + var3, var5 - 6.0, var7 + 2.0, -var11 + var9, 800.0, this.field_D);
                  this.field_m[this.g((byte) 119)] = new gf(25, var3, var5, 5.0 + var7, var9, 800.0, this.field_D);
                  this.field_m[this.g((byte) 119)] = new gf(24, var3 - 10.0, var5 + 6.0, 2.0 + var7, var9 + var11, 800.0, this.field_D);
                  this.field_S = 0;
                  {
                    break L14;
                  }
                case 8:
                  var11 = 0.5 + 2.5 * (-0.5 + Math.random());
                  this.field_m[this.g((byte) 119)] = new gf(25, var3 - 10.0, -3.0 + var5, 5.0 + var7, var9 - var11, 800.0, this.field_D);
                  this.field_m[this.g((byte) 119)] = new gf(24, var3, var5, var7 + 2.0, var9, 800.0, this.field_D);
                  this.field_m[this.g((byte) 119)] = new gf(25, var3 - 10.0, var5 + 3.0, 5.0 + var7, var11 + var9, 800.0, this.field_D);
                  this.field_S = 0;
                  {
                    break L14;
                  }
                default:
                  break;
              }
              var11 = 1.0 + (-0.5 + Math.random()) * 2.5;
              this.field_m[this.g((byte) 119)] = new gf(25, -10.0 + var3, -3.0 + var5, 5.0 + var7, -var11 + var9, 800.0, this.field_D);
              this.field_m[this.g((byte) 119)] = new gf(25, var3, var5, var7 + 5.0, var9, 800.0, this.field_D);
              this.field_m[this.g((byte) 119)] = new gf(25, var3 - 10.0, var5 + 3.0, 5.0 + var7, var9 + var11, 800.0, this.field_D);
              if (this.field_S == 9) {
                this.field_S = 0;
              } else {
                this.field_S = this.field_S - 3;
              }
              break L14;
            } else if (var32 != 21 ||
              var38 != 0) {
              if (28 == var32 &&
                var38 == 0) {
                var23 = -1;
                var26 = 150.0;
                var18 = (int)((double)am.field_p + this.field_N);
                var20 = 0;
                var29 = 0;
                var28 = null;
                var19 = (int)(this.field_D + (double)ri.field_q);
                while (var29 == 0) {
                  stackIn_111_0 = 0;
                  var32 = stackIn_111_0;
                  while (1600 > var32) {
                    var39 = this.field_n[var32];
                    var40 = var39;
                    var42 = var40;
                    var40 = var39;
                    var42 = var40;
                    var41 = var39;
                    if (var41 != null &&
                      !var41.a(false) &&
                      !var41.field_s &&
                      !wh.field_v[var39.field_Q] && (0 == var20 ||
                      var41.h(63))) {
                      var24 = dl.a(true, -var41.field_o - (double)var41.field_I - (double)var20 + (double)var18, -var41.field_N - (double)var41.field_t + (double)var19);
                      stackIn_99_0 = var24;
                      if (var41.field_Q == 36) {
                        stackIn_100_1 = 30.0;
                      } else {
                        stackIn_100_1 = 0.0;
                      }
                      var24 = stackIn_99_0 - stackIn_100_1;
                      if (var24 < var26) {
                        var23 = var32;
                        var24 = var26;
                      }
                    }
                    var32++;
                  }
                  if (var23 != -1) {
                    var29 = 1;
                    continue;
                  }
                  if (var20 == 0) {
                    var20 = -100;
                    continue;
                  }
                  if (-100 != var20) {
                    var29 = 1;
                    continue;
                  }
                  var20 = 100;
                }
                stackIn_111_0 = 0;
                if (stackIn_111_0 == ~var23) {
                  this.field_a = true;
                } else {
                  var40 = this.field_n[var23];
                  var42 = var40;
                  var21 = var42.field_I + (int)var42.field_o;
                  var22 = var42.field_t + (int)var42.field_N;
                  if (var42.field_Q == 0 ||
                    var42.field_Q == 35) {
                    var22 = var22 - var42.field_t / 2;
                  }
                  var32_ref_gf = new gf(param0, var3, var5, 0.0, 0.0, (double)var21, (double)var22);
                  var32_ref_gf.field_l = this.field_J;
                  this.field_m[this.g((byte) 119)] = var32_ref_gf;
                  if (var42.a(var32_ref_gf.field_t, 10)) {
                    this.b(var42, 57);
                    this.d((byte) -63, wh.field_x[var40.field_Q]);
                    if (!var42.a(false) &&
                      qa.field_I[var40.field_Q] != 0) {
                      this.field_o = this.field_o - 1;
                    }
                    if (0 == this.field_o ||
                      !(qa.field_I[var40.field_Q] >= 0)) {
                      this.field_o = 5 + hi.a(10, 4, this.field_l);
                      var34 = Math.abs(qa.field_I[var40.field_Q]);
                      while (var34 > 0) {
                        this.a(121, var42.field_N + (double)hi.a(var42.field_O / 2, 4, this.field_l), var42.field_o + (double)hi.a(var42.field_m, 4, this.field_l), false, cj.field_c[var40.field_Q]);
                        var34--;
                      }
                    }
                    this.a(116, (gf) null, var40);
                    if (!th.field_d[var40.field_Q]) {
                      this.field_n[var23].a(7769);
                      this.field_n[var23] = null;
                    }
                    if (var42.h(-120)) {
                      this.a(var42, 0);
                    }
                  }
                }
                this.field_S = 0;
                return;
              }
              boolean decompiledFrameRemainder1 = true;
              boolean decompiledFrameRemainder0 = true;
              if (23 == var32 &&
                var38 == 0) {
                this.field_m[this.g((byte) 119)] = new gf(param0, var3, var5, var7, var9, 800.0, this.field_D, this.field_u);
                break L14;
              } else {
                if (var32 != 22) {
                  decompiledFrameRemainder0 = (var32 != 20);
                  decompiledFrameRemainder1 = !(decompiledFrameRemainder0);
                }
              }
              if ((decompiledFrameRemainder1) &&
                (decompiledFrameRemainder0)) {
                this.field_m[this.g((byte) 119)] = new gf(22, var3, var5, var7, var9, 800.0, this.field_D);
                this.field_S = this.field_S - 1;
                if (var38 == 0) {
                  break L14;
                }
              }
              if (decompiledFrameRemainder1) {
                var30 = (double)this.field_S / 4.0;
                var32 = 0;
                while (this.field_S > var32) {
                  this.field_m[this.g((byte) 119)] = new gf(param0, var3, var5, -var30 + (var7 + (double)var32), var9, 800.0, this.field_D);
                  this.field_S = this.field_S - 1;
                  var32++;
                  if (var38 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if ((decompiledFrameCompleted0) &&
                  (var38 == 0)) {
                  break L14;
                }
              }
              if (decompiledFrameCompleted0) {
                this.field_m[this.g((byte) 119)] = new gf(param0, var3, var5, var7, var9, 800.0, this.field_D);
                this.field_S = this.field_S - 1;
                break L13;
              }
            }
            if (decompiledFrameCompleted0) {
              var5 = var5 + 13.0;
              var13 = 20.0;
              var3 = var3 + 14.0;
              var17 = new double[]{0.0, 0.7853981633974483, -0.7853981633974483, 2.6179938779914944, -2.6179938779914944};
              var32 = -2;
              while (var32 <= 2) {
                var15 = (double)var32 * 0.15 / 2.0 + 1.5707963267948966;
                var33 = 0;
                while (var33 < 5) {
                  var34_double = ji.a(65535, (double)this.field_J / 5.0) * var13 * ji.a(65535, var17[var33] + var15);
                  var36 = var13 * ji.a(65535, (double)this.field_J / 5.0) * pj.a(var17[var33] + var15, 32768);
                  this.field_m[this.g((byte) 119)] = new gf(param0, var34_double + (-15.0 + var3), var36 + var5, ji.a(65535, var15 + var17[var33]) * var13, pj.a(var15 + var17[var33], 32768) * var13, 800.0, this.field_D);
                  var33++;
                }
                var32++;
              }
              this.field_S = this.field_S - 1;
            }
          }
        }
    }

    private final void e(byte param0) {
        int var2;
        int var3;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        while (var2 < 800) {
          if (var3 != 0) {
            return;
          }
          if (null != this.field_v[var2]) {
            this.field_v[var2].c((byte) 114);
          }
          var2++;
        }
        if (param0 != 97) {
          this.field_A = -89;
        }
        return;
    }

    private final void a(int param0, gf param1, bf param2) {
        int var4_int = 0;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_3_3 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          stackIn_2_1 = (int)param2.field_o + param2.field_I;
          stackIn_2_2 = (int)param2.field_N + param2.field_t;
          if (param1 != null) {
            stackIn_3_3 = gf.field_k[param1.field_I];
          } else {
            stackIn_3_3 = -1;
          }
          this.a(stackIn_2_1, stackIn_2_2, stackIn_3_3, param2, -111);
          if (param2.field_Q == 42) {
            var4_int = param2.e((byte) -122);
            if (0 < var4_int) {
              this.a(11, var4_int + ((int)param2.field_N + param2.field_t), -1, param2.field_I + (int)param2.field_o - 5, 27396);
            }
          }
          if (param0 <= 97) {
            this.a(60, -64, (byte) -16);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("j.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final bf a(int param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        bf dupTemp$1 = null;
        int var7;
        bf var8;
        int var9;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var8 = new bf(param2, param4, this.field_J, param3, param0, param1);
        if (!param5) {
          this.field_d = (ib[]) null;
        }
        if (var8.h(49)) {
          sc.a(-1, true, lh.field_l);
          this.field_U = true;
        }
        if (!var8.a(false) &&
          !param1) {
          var7 = this.j(116);
          if (var9 != 0) {
            var7 = this.e(2183);
          }
        } else {
          var7 = this.e(2183);
        }
        this.field_n[var7] = var8;
        if (!param1) {
          if (param2 == 8 ||
            param2 == 9 ||
            param2 == 10) {
            dupTemp$1 = this.field_n[var7];
            dupTemp$1.field_j = dupTemp$1.field_j / 3.0;
            if (var9 != 0) {
              this.field_n[var7].field_o = (double)param3;
            }
          }
        } else {
          this.field_n[var7].field_o = (double)param3;
        }
        this.field_n[var7].c(5);
        return var8;
    }

    private final void A(int param0) {
        int stackIn_8_0 = 0;
        int stackIn_24_0 = 0;
        int var2 = 0;
        int var3_int = 0;
        td var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var2Lifetime1;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (this.field_q != 0 &&
          this.field_q != 1) {
          return;
        }
        var2 = 0;
        if (param0 != 1052688) {
          this.y(53);
        }
        stackIn_8_0 = var2;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (stackIn_8_0 >= 2))) {
          stackIn_24_0 = 0;
          if (var4 == 0) {
            var3_int = stackIn_24_0;
            while (var3_int < 20) {
              vi.field_h[var2][var3_int].a((int)vj.field_f[var2], 3, lh.field_n[var2], -21, 1, (int)tc.field_f[var2]);
              tc.field_f[var2] = tc.field_f[var2] + 0.3;
              vj.field_f[var2] = vj.field_f[var2] + 0.6;
              stackIn_8_0 = $cfr$dcmpl(vj.field_f[var2], 305.0);
              if (stackIn_8_0 > 0) {
                nd.field_M = 256;
                this.a((int)vj.field_f[var2], -84, (int)tc.field_f[var2]);
                tc.field_f[var2] = (double)(hi.a(640, 4, this.field_l) - 100);
                vj.field_f[var2] = (double)(-hi.a(1720, 4, this.field_l));
                if (hi.a(5, 4, this.field_l) >= 4) {
                  lh.field_n[var2] = 2102528;
                } else {
                  lh.field_n[var2] = 1052688;
                }
              }
              if (640.0 < tc.field_f[var2]) {
                tc.field_f[var2] = 0.0;
              }
              var3_int++;
            }
            var2++;
            stackIn_8_0 = var2;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_24_0 = 0;
        }
        var5 = stackIn_24_0;
        var2Lifetime1 = var5;
        while (var5 < 3801) {
          var3 = this.field_hb[var5];
          if (var4 == 0) {
            if (var3 != null &&
              var3.a((byte) -107)) {
              this.field_hb[var5] = null;
            }
            var5++;
            continue;
          }
          break;
        }
        return;
    }

    private final void a(bf param0, int param1) {
        boolean stackIn_17_1 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          cj.field_e = param0.b((byte) 55);
          ti.field_a = (int)param0.field_N;
          lc.field_m = (int)param0.field_o;
          var3_int = 0;
          do {
            if (!(ck.field_j.length > var3_int)) {
              this.field_U = false;
              break;
            }
            ck.field_j[var3_int] = new td(hi.a(6, param1 + 4, this.field_l), lc.field_m + hi.a(cj.field_e.field_h, 4, this.field_l), ti.field_a + hi.a(cj.field_e.field_c, 4, this.field_l), -1);
            var3_int++;
          } while (var4 == 0);
          var3_int = param1;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.field_n.length <= var3_int))) {
            if (var4 == 0) {
              if (null != this.field_n[var3_int]) {
                this.field_U = this.field_U | this.field_n[var3_int].h(param1 ^ 80);
              }
              var3_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_17_1 = !(this.field_U);
            this.field_ab = stackIn_17_1;
          }
          if (this.field_ab) {
            this.H(1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("j.A(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final void y(int param0) {
        if (0 != sd.field_e) {
          this.G(param0 ^ 6212);
          if (DrPhlogistonSavesTheEarth.field_D) {
            wj.c();
          }
        } else {
          wj.c();
        }
        this.e((byte) 97);
        this.l(-1601);
        this.f((byte) -125);
        this.p(-3);
        this.B(-5651);
        this.x(-64);
        this.v(-122);
        if (qe.field_a <= 0) {
          this.c(true);
        }
        this.u(7);
        this.a((byte) 123);
        this.t(1);
        this.g(param0 ^ -4619);
        if (param0 != 6212) {
          this.i(-74);
        }
        if (this.field_W) {
          cb.field_b.b("Cheating!", 270, 465, 16777215, -1, (int)(ji.a(65535, (double)this.field_J / 50.0) * 128.0 + 128.0));
        }
    }

    private final boolean n(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 <= 65) {
          this.field_S = -21;
        }
        stackIn_6_0 = (640 + this.field_J < this.field_G.field_h.length) && (!this.field_ab);
        return stackIn_6_0;
    }

    private final void I(int param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = param0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (64 <= var2))) {
          i.field_c[var2] = i.field_c[var2] + 10;
          stackIn_7_0 = 430;
          stackIn_7_1 = i.field_c[var2];
          if (var4 == 0) {
            if (stackIn_7_0 < stackIn_7_1) {
              i.field_c[var2] = -20;
            }
            var2++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_7_0 = -3;
          stackIn_7_1 = ~this.field_q;
        }
        boolean decompiledFrameRemainder0 = true;
        if (stackIn_7_0 == stackIn_7_1 &&
          hi.a(100, 4, this.field_l) < 1) {
          nd.field_M = 255;
          DrPhlogistonSavesTheEarth.field_K = 255;
          var2 = 0;
          var3 = 0;
          L6: while (true) {
            ib.field_a = hi.a(640, 4, this.field_l);
            var3++;
            ch.field_y = hi.a(75, param0 + 4, this.field_l);
            var2 = var2 != 0 | q.field_e.a(0, 0, ib.field_a, ch.field_y) ? 1 : 0;
            do {
              if (var3 < 100 &&
                var2 == 0) {
                continue L6;
              }
            } while (var4 != 0);
            break;
          }
          decompiledFrameRemainder0 = false;
        }
        else {
          DrPhlogistonSavesTheEarth.field_K = DrPhlogistonSavesTheEarth.field_K - 10;
        }
        if (nd.field_M > 64) {
          nd.field_M = nd.field_M - 10;
        }
        return;
    }

    private final int m(int param0) {
        int var2;
        int var3;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != 1280) {
          return 14;
        }
        var2 = 0;
        while (this.field_hb[var2] != null) {
          var2++;
          if (var3 == 0) {
            continue;
          }
          break;
        }
        return var2;
    }

    private final int f(int param0) {
        int var2;
        int var3;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = param0;
        while (this.field_d[var2] != null) {
          var2++;
          if (var3 == 0) {
            continue;
          }
          break;
        }
        return var2;
    }

    private final void b(boolean param0) {
        bf stackIn_39_0 = null;
        boolean stackIn_40_1 = false;
        int stackIn_50_0 = 0;
        gf stackIn_67_0 = null;
        gf stackIn_124_0 = null;
        int var2 = 0;
        gf var3 = null;
        bf var4 = null;
        int var5 = 0;
        bf var6 = null;
        int var6_int = 0;
        int var8 = 0;
        int var9 = 0;
        gf var10 = null;
        gf var11 = null;
        gf var12 = null;
        gf var13 = null;
        bf var6Lifetime1;
        bf var6Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        L3: while (true) {
          if (1400 > var2) {
            var10 = this.field_m[var2];
            var12 = var10;
            var3 = var12;
            stackIn_50_0 = 0;
            if (var9 == 0) {
              var5 = stackIn_50_0;
              while (var5 < 1600) {
                stackIn_124_0 = this.field_m[var2];
                if (stackIn_124_0 != null) {
                  var4 = this.field_n[var5];
                  var6 = var4;
                  var6 = var4;
                  if (var4 != null &&
                    !var4.field_s && (ne.a(var12.field_g, (int)var12.field_i, (int)var12.field_m, var4.b((byte) 55), (int)var4.field_o, (int)var4.field_N) ||
                    var4.field_D != null &&
                    ne.a(var12.field_g, (int)var12.field_i, (int)var12.field_m, var4.field_D, var4.field_d, var4.field_p))) {
                    if (23 == var12.field_I) {
                      var6_int = 50;
                      if (!(var6_int <= var12.field_t)) {
                        var6_int = var12.field_t;
                      }
                    } else {
                      var6_int = var12.field_t;
                    }
                    if (var4.a(var6_int, 10)) {
                      this.b(var4, 64);
                      this.d((byte) -126, wh.field_x[var4.field_Q]);
                      if (!var4.a(false) &&
                        0 != qa.field_I[var4.field_Q]) {
                        this.field_o = this.field_o - 1;
                      }
                      if (this.field_o == 0 ||
                        !(qa.field_I[var4.field_Q] >= 0)) {
                        this.field_o = hi.a(10, 4, this.field_l) + 5;
                        var8 = Math.abs(qa.field_I[var4.field_Q]);
                        while (var8 > 0) {
                          this.a(123, var4.field_N + (double)hi.a(var4.field_O / 2, 4, this.field_l), var4.field_o + (double)hi.a(var4.field_m, 4, this.field_l), false, cj.field_c[var4.field_Q]);
                          var8--;
                        }
                      }
                      this.a(102, var10, var4);
                      if (!th.field_d[var4.field_Q]) {
                        this.field_n[var5].a(7769);
                        this.field_n[var5] = null;
                      }
                      if (var4.h(-65)) {
                        this.a(var4, 0);
                      }
                      stackIn_39_0 = var4;
                      stackIn_40_1 = !(param0);
                      if (((bf) (Object) stackIn_39_0).a(stackIn_40_1)) {
                        dg.field_c = dg.field_c | 1 << this.field_q;
                      }
                    }
                    if (var12.field_I == 23) {
                      var12.field_t = var12.field_t - var6_int;
                      if (var12.field_t <= 0) {
                        this.field_m[var2] = null;
                      }
                      this.a(ld.field_h[var10.field_I], var12.field_u + (int)var12.field_m, gf.field_k[var10.field_I], var12.field_q + (int)var12.field_i, 27396);
                    } else {
                      this.a(ld.field_h[var10.field_I], (int)var12.field_m + var12.field_u, gf.field_k[var10.field_I], var12.field_q + (int)var12.field_i, 27396);
                      this.field_m[var2] = null;
                    }
                  }
                  var5++;
                  continue;
                }
                break;
              }
              var2++;
              continue;
            }
          } else {
            stackIn_50_0 = ~this.field_fb;
          }
          if (stackIn_50_0 > -1) {
            var2 = 0;
            while (var2 < 800) {
              var11 = this.field_v[var2];
              var3 = var11;
              var3 = var11;
              var13 = var11;
              var3 = var13;
              stackIn_124_0 = var13;
              if (var9 != 0) {
                break L3;
              }
              if (stackIn_124_0 != null &&
                ne.a(var13.field_g, (int)var13.field_i, (int)var13.field_m, le.field_c, (int)this.field_N, (int)this.field_D)) {
                this.a(this.field_gb - var13.field_t, 0);
                this.a(ld.field_h[var11.field_I], (int)var13.field_m, gf.field_k[var11.field_I], (int)var13.field_i, 27396);
                if (!uf.field_f[var11.field_I]) {
                  this.field_v[var2] = null;
                }
              }
              var2++;
            }
          }
          if (!param0) {
            this.field_v = (gf[]) null;
          }
          var2 = 0;
          while (true) {
            if (800 <= var2) {
              return;
            }
            var3 = this.field_v[var2];
            if (var9 != 0) {
              return;
            }
            stackIn_67_0 = var3;
            if (stackIn_67_0 != null) {
              var5Lifetime2 = 0;
              while (var5Lifetime2 < 1600) {
                var6Lifetime2 = this.field_n[var5Lifetime2];
                boolean decompiledFrameRemainder1 = true;
                if (var6Lifetime2 != null) {
                  if (!wh.field_v[var6Lifetime2.field_Q]) {
                    if ((!(!var6Lifetime2.a(false))) &&
                      (!(var6Lifetime2.field_s)) &&
                      (!(!ne.a(var3.field_g, (int)var3.field_i, (int)var3.field_m, var6Lifetime2.b((byte) 55), (int)var6Lifetime2.field_o, (int)var6Lifetime2.field_N)))) {
                      this.a(ld.field_h[var3.field_I], (int)var3.field_m, gf.field_k[var3.field_I], (int)var3.field_i, 27396);
                      if (var6Lifetime2.a(var3.field_t, 10)) {
                        this.a(120, var3, var6Lifetime2);
                        if (!cj.field_c[var6Lifetime2.field_Q]) {
                          this.field_n[var5Lifetime2].a(7769);
                          this.field_n[var5Lifetime2] = null;
                        }
                      }
                      if (!uf.field_f[var3.field_I]) {
                        this.field_v[var2] = null;
                      }
                    }
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (ne.a(var3.field_g, (int)var3.field_i, (int)var3.field_m, var6Lifetime2.b((byte) 55), (int)var6Lifetime2.field_o, (int)var6Lifetime2.field_N)) {
                      this.a(ld.field_h[var3.field_I], (int)var3.field_m, gf.field_k[var3.field_I], (int)var3.field_i, 27396);
                      this.field_v[var2] = null;
                    }
                  }
                }
                var5Lifetime2++;
              }
            }
            var2++;
          }

        }
        while (true) {
          boolean decompiledFrameCompleted0 = true;
          if (stackIn_124_0 != null) {
            var5Lifetime1 = 0;
            while (var5Lifetime1 < 1600) {
              var6Lifetime1 = this.field_n[var5Lifetime1];
              if (var9 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              boolean decompiledFrameRemainder0 = true;
              if (var6Lifetime1 != null) {
                if (!wh.field_v[var6Lifetime1.field_Q]) {
                  if ((!(!var6Lifetime1.a(false))) &&
                    (!(var6Lifetime1.field_s)) &&
                    (!(!ne.a(var3.field_g, (int)var3.field_i, (int)var3.field_m, var6Lifetime1.b((byte) 55), (int)var6Lifetime1.field_o, (int)var6Lifetime1.field_N)))) {
                    this.a(ld.field_h[var3.field_I], (int)var3.field_m, gf.field_k[var3.field_I], (int)var3.field_i, 27396);
                    if (var6Lifetime1.a(var3.field_t, 10)) {
                      this.a(120, var3, var6Lifetime1);
                      if (!cj.field_c[var6Lifetime1.field_Q]) {
                        this.field_n[var5Lifetime1].a(7769);
                        this.field_n[var5Lifetime1] = null;
                      }
                    }
                    if (!uf.field_f[var3.field_I]) {
                      this.field_v[var2] = null;
                    }
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if (ne.a(var3.field_g, (int)var3.field_i, (int)var3.field_m, var6Lifetime1.b((byte) 55), (int)var6Lifetime1.field_o, (int)var6Lifetime1.field_N)) {
                    this.a(ld.field_h[var3.field_I], (int)var3.field_m, gf.field_k[var3.field_I], (int)var3.field_i, 27396);
                    this.field_v[var2] = null;
                  }
                }
              }
              var5Lifetime1++;
            }
          }
          if (decompiledFrameCompleted0) {
            var2++;
          }
          if (var9 != 0) {
            break;
          }
          if (800 <= var2) {
            return;
          }
          var3 = this.field_v[var2];
          stackIn_124_0 = var3;
        }
        return;
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (sd.field_e != 2) {
          return;
        }
        stackIn_5_0 = (2 == this.field_q) ? 381 : 305;
        var3 = stackIn_5_0;
        var4 = 0;
        while (var4 < 20) {
          bc.field_d.a(al.field_g[var4], var3 - bc.field_d.field_w, 256);
          var4++;
          if (var5 != 0) {
            return;
          }
        }
        if (param0 != 0) {
          this.a(-86, -83);
        }
        return;
    }

    private final void k(int param0) {
        int var2 = 0;
        int var4 = 0;
        td stackIn_15_0 = null;
        td stackIn_37_0 = null;
        int var2Lifetime1;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = param0;
        while (var2 < 3801) {
          stackIn_37_0 = this.field_B[var2];
          if (var4 != 0) {
            while (true) {
              if (stackIn_37_0 != null &&
                null != pe.field_e &&
                ck.field_j[var2].a((byte) -125)) {
                if (pe.field_e.field_j) {
                  ck.field_j[var2] = null;
                }
                ck.field_j[var2] = new td(hi.a(6, qk.a(param0, 4), this.field_l), lc.field_m + hi.a(cj.field_e.field_h, 4, this.field_l), ti.field_a + hi.a(cj.field_e.field_c, qk.a(param0, 4), this.field_l), -1);
              }
              var2++;
              return;
            }
          }
          if (stackIn_37_0 != null &&
            this.field_B[var2].a((byte) -106)) {
            this.field_B[var2] = null;
          }
          var2++;
          if (var4 == 0) {
            continue;
          }
          break;
        }
        if (null == cj.field_e) {
          return;
        }
        var2Lifetime1 = 0;
        while (true) {
          if (ck.field_j.length <= var2Lifetime1) {
            return;
          }
          if (var4 != 0) {
            return;
          }
          stackIn_15_0 = ck.field_j[var2Lifetime1];
          if (stackIn_15_0 != null &&
            null != pe.field_e &&
            ck.field_j[var2Lifetime1].a((byte) -125)) {
            if (pe.field_e.field_j) {
              ck.field_j[var2Lifetime1] = null;
            } else {
              ck.field_j[var2Lifetime1] = new td(hi.a(6, qk.a(param0, 4), this.field_l), lc.field_m + hi.a(cj.field_e.field_h, 4, this.field_l), ti.field_a + hi.a(cj.field_e.field_c, qk.a(param0, 4), this.field_l), -1);
            }
          }
          var2Lifetime1++;
        }
    }

    private final int h(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        var3 = 17 % ((param0 - 0) / 36);
        while (null != this.field_v[var2]) {
          var2++;
          if (var4 == 0) {
            continue;
          }
          break;
        }
        return var2;
    }

    private final void l(int param0) {
        int var2;
        int var3;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != -1601) {
          this.I(-47);
        }
        var2 = 0;
        while (var2 < 1600) {
          if (var3 == 0) {
            if (this.field_n[var2] != null) {
              this.field_n[var2].j(30325);
            }
            var2++;
            continue;
          }
          break;
        }
    }

    private final void f(byte param0) {
        int var2;
        int var3;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 > -111) {
          this.field_X = -33;
        }
        var2 = 0;
        while (160 > var2) {
          if (var3 == 0) {
            if (this.field_d[var2] != null) {
              this.field_d[var2].b((byte) -114);
            }
            var2++;
            continue;
          }
          break;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = this.l((byte) 113);
        td var7 = new td(param0, param3, param1, param2);
        if (param4 != 27396) {
          return;
        }
        this.field_B[var6] = var7;
    }

    private final int l(byte param0) {
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        ArrayIndexOutOfBoundsException var3 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 < 24) {
          return 68;
        }
        var2 = 0;
        try {
          while (this.field_B[var2] != null) {
            var2++;
            if (var4 == 0) {
              continue;
            }
            break;
          }
        } catch (java.lang.ArrayIndexOutOfBoundsException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (ArrayIndexOutOfBoundsException) (Object) decompiledCaughtException;
          var2 = 0;
          this.field_B = new td[this.field_B.length];
        }
        return var2;
    }

    private final void a(int param0) {
        int var2;
        bf var3;
        int var4;
        int var5;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = param0;
        while (var2 < 1600) {
          var3 = this.field_n[var2];
          if (var5 == 0) {
            if (var3 != null &&
              var3.d((byte) 119)) {
              this.field_n[var2].a(7769);
              this.field_n[var2] = null;
              if (!var3.a(false) &&
                var3.field_Q != 8 &&
                var3.field_Q != 9 &&
                var3.field_Q != 10) {
                cj.field_b = cj.field_b | 1 << this.field_q;
              }
              var4 = var3.field_Q;
              if (wh.field_x[var4] < 0) {
                if (0 < var3.field_H) {
                  this.c((byte) -61, -wh.field_x[var4]);
                  this.field_T = this.field_T + 1;
                }
                this.field_X = this.field_X + 1;
              }
            }
            var2++;
            continue;
          }
          break;
        }
    }

    private final int e(int param0) {
        int var2;
        int var3;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != 2183) {
          this.field_S = -10;
        }
        var2 = -1 + this.field_n.length;
        while (null != this.field_n[var2]) {
          var2--;
          if (var3 == 0) {
            continue;
          }
          break;
        }
        return var2;
    }

    private final void b(int param0) {
        int var2;
        int var3;
        int var4_int;
        bf var4;
        int var5;
        Object var6;
        int var7;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = this.field_G.field_c.length;
        var3 = -50;
        var4_int = this.field_q;
        if (6 == var4_int &&
          var7 == 0 ||
          (7 == var4_int ||
          var4_int == 8)) {
          var3 = -25;
        }
        if (param0 < 112) {
          this.field_C = 62;
        }
        var5 = 0;
        while (var5 < var2) {
          var4 = this.field_G.field_c[var5];
          if (var7 == 0) {
            if (var4 != null) {
              var6 = null;
              if (~(640 + this.field_J) != ~var4.field_k) {
                if (this.field_J == 0 &&
                  var4.field_k < (640 + this.field_J)) {
                  var6 = this.a(-var4.field_W + (430 + var3), true, var4.field_Q, var4.field_k, var4.field_J, true);
                }
              } else {
                var6 = this.a(var3 + (430 - var4.field_W), false, var4.field_Q, this.field_J, var4.field_J, true);
              }
              if (var6 != null &&
                ((bf) (var6)).field_Q == 38) {
                ((bf) (var6)).field_H = ((bf) (var6)).field_H * (1 + this.field_q);
              }
            }
            var5++;
            continue;
          }
          break;
        }
    }

    final boolean C(int param0) {
        boolean stackIn_9_0 = false;
        if (param0 != 31578) {
          this.b((byte) 45, -85);
        }
        boolean decompiledFrameRemainder0 = true;
        if (oh.a(param0 ^ 31578) && (0 != ej.field_h ||
          sd.field_a.field_H != 0 ||
          sd.field_a.field_q != 0)) {
          stackIn_9_0 = true;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_9_0 = false;
        }
        return stackIn_9_0;
    }

    private final void t(int param0) {
        int var2;
        int stackIn_5_0 = 0;
        if (ue.field_b != 0) {
          return;
        }
        this.i((byte) -1);
        if (we.field_f >= 96) {
          stackIn_5_0 = 96;
        } else {
          stackIn_5_0 = we.field_f;
        }
        var2 = stackIn_5_0;
        if (param0 != 1) {
          field_ib = -60;
        }
        if (this.field_q != 0) {
          if ((3 == this.field_q) &&
            (!(gm.field_J > 0)) &&
            (!(ol.field_i.length <= el.field_tb))) {
            cb.field_b.a(ol.field_i[el.field_tb], 0, 334, 544, 96, 16777215, 0, 2, 1, cb.field_b.field_x);
            al.field_a[1].a(-al.field_a[1].field_h + var2 + 640, 430 - al.field_a[1].field_c);
            if ((DrPhlogistonSavesTheEarth.field_D) &&
              ((-1 + ol.field_i.length) > el.field_tb)) {
              cb.field_b.a(ol.field_i[el.field_tb], 0, 334, 544, 96, 16777215, 0, 2, 1, cb.field_b.field_x);
              al.field_a[0].a(var2 + 640 - al.field_a[0].field_h, -al.field_a[0].field_c + 430);
            }
          }
        } else {
          if ((-1 + ol.field_i.length) > el.field_tb) {
            cb.field_b.a(ol.field_i[el.field_tb], 0, 334, 544, 96, 16777215, 0, 2, 1, cb.field_b.field_x);
            al.field_a[0].a(var2 + 640 - al.field_a[0].field_h, -al.field_a[0].field_c + 430);
          }
        }
    }

    private final void a(int param0, int param1, byte param2) {
        if (param2 > -75) {
          return;
        }
        int var4 = 1 << param0;
        if ((var4 & hi.field_j) != 0) {
          return;
        }
        hi.field_j = hi.field_j | var4;
        ej.field_h = ej.field_h | var4;
        this.field_I.a(new fj(param0), 255);
        if (!this.field_W) {
          nf.field_x.a(new je(param0, param1, this.field_Q, this.field_P, this.field_p, this.field_C), 255);
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_12_0 = 0;
        int var2Lifetime1;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        if (param0 >= 0) {
          this.a(36, -16, 69, 83, -103);
        }
        L1: while (true) {
          if (2 > var2) {
            stackIn_12_0 = 0;
            if (var4 != 0) {
              break L1;
            }
            var3 = stackIn_12_0;
            while (var3 < 20) {
              vi.field_h[var2][var3].c(-1);
              var3++;
            }
            var2++;
            continue L1;
          }
          stackIn_12_0 = 0;
          break;
        }
        var5 = stackIn_12_0;
        var2Lifetime1 = var5;
        while (var5 < 3801) {
          if (var4 == 0) {
            if (this.field_hb[var5] != null) {
              this.field_hb[var5].a(true);
            }
            var5++;
            continue;
          }
          break;
        }
        return;
    }

    j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_16_0 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        this.field_U = false;
        this.field_F = false;
        this.field_ab = false;
        this.field_W = false;
        this.field_I = new vd();
        this.field_o = 10;
        this.field_c = 0.0;
        this.field_A = 1;
        this.field_d = new ib[160];
        this.field_gb = 255;
        this.field_t = new int[4];
        this.field_P = 268435455;
        this.field_u = 0;
        this.field_m = new gf[1400];
        this.field_w = 3;
        this.field_L = 1;
        this.field_n = new bf[1600];
        this.field_bb = 0;
        this.field_hb = new td[3801];
        this.field_E = 0;
        this.field_Z = 0;
        this.field_O = true;
        this.field_s = 2147483647;
        this.field_T = 0;
        this.field_S = 0;
        this.field_a = false;
        this.field_D = 190.0;
        this.field_B = new td[3801];
        this.field_R = 0;
        this.field_X = 0;
        this.field_b = 0;
        this.field_h = new ck[3];
        this.field_j = 0.0;
        this.field_v = new gf[800];
        this.field_H = 0;
        this.field_cb = new int[77];
        this.field_N = (double)(-am.field_l);
        this.field_Q = 0;
        this.field_k = null;
        this.field_p = this.field_Q ^ this.field_P;
        this.field_C = 268435456 - this.field_p;
        this.field_eb = false;
        this.field_fb = -1;
        this.field_J = 0;
        ib.field_t = 0;
        qk.field_c = true;
        ej.field_h = 0;
        this.field_l = new Random(9416L);
        var2 = 0;
        do {
          if (64 <= var2) {
            var2 = 0;
            break;
          }
          i.field_c[var2] = hi.a(430, 4, this.field_l);
          var2++;
        } while (var4 == 0);
        L3: while (true) {
          if (var2 < 2) {
            tc.field_f[var2] = (double)(hi.a(640, 4, this.field_l) - 100);
            vj.field_f[var2] = (double)(-hi.a(1720, 4, this.field_l));
            stackIn_16_0 = 0;
            if (var4 != 0) {
              break L3;
            }
            var3 = stackIn_16_0;
            while (true) {
              if (20 > var3) {
                vi.field_h[var2][var3] = new ck();
                var3++;
                continue;
              }
              if (hi.a(5, 4, this.field_l) >= 4) {
                lh.field_n[var2] = 2102528;
              } else {
                lh.field_n[var2] = 1052688;
              }
              break;
            }
            var2++;
            continue L3;
          }
          stackIn_16_0 = 0;
          break;
        }
        var2 = stackIn_16_0;
        do {
          if (var2 >= 75) {
            this.field_x = -1901789184;
            gm.field_J = 0;
            this.field_g = 15132;
            qe.field_a = -150;
            this.field_f = 0;
            this.field_q = -1 + param0;
            this.field_M = ag.a(nl.field_r[5], 256, dg.field_e * 24 / 80);
            this.field_M.c(0, nl.field_r[5].field_i.length);
            this.field_M.f(-1);
            this.field_z = ag.a(nl.field_r[7], 256, 48);
            break;
          }
          wa.field_Q[var2] = hi.a(1280, 4, this.field_l);
          we.field_e[var2] = 107 + hi.a(215, 4, this.field_l);
          jf.field_ib[var2] = hi.a(65535, 4, this.field_l);
          hh.field_a[var2] = hi.a(4096, 4, this.field_l) * hi.a(2048, 4, this.field_l) >> 12;
          wi.field_f[var2] = hi.a(5, 4, this.field_l);
          md.field_c[var2] = 15 + hi.a(10, 4, this.field_l);
          var2++;
        } while (var4 == 0);
        var2 = 0;
        while (var2 < this.field_h.length) {
          this.field_h[var2] = new ck();
          var2++;
          if (var4 != 0) {
            return;
          }
        }
        this.a(255, 0);
        return;
    }

    static {
        field_V = new db(0);
        field_Y = "Logging in...";
    }

    private static int $cfr$dcmpl(double left, double right) {
        return left > right ? 1 : (left == right ? 0 : -1);
    }
}
