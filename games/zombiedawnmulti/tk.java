/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tk extends nc {
    static int field_m;
    static cj field_l;
    static int field_n;
    static String field_o;
    static java.awt.Canvas field_q;
    private int field_p;

    private final void e(int param0) {
        if (param0 >= -88) {
          this.e(-105);
        }
        on.field_bb = new ki[63];
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int stackIn_17_0;
        int stackIn_17_1;
        int stackIn_17_2;
        int stackIn_17_3;
        int stackIn_18_4 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param2 != -2939) {
          field_o = (String) null;
        }
        for (var4 = 0; var4 < 3; var4++) {
          var5 = var4 * 73;
          s.field_c.a(420 + var5, 341);
          if (s.field_c.b(var5 + 420, 341, bd.field_g, bo.field_d)) {
            q.field_d = 5 + var4;
          }
          var6 = ll.field_k.field_s[var4];
          if (255 != var6 &&
            var6 < 63) {
            var7 = ll.field_k.d(var6, param2 + 2992) ? 1 : 0;
            wa.field_b[var6 - 18].g(429 + var5, 357);
            var8 = ll.field_k.field_t[var6];
            if (ll.field_k.d(var6, 53)) {
              var8 = cr.a(var6, -97);
            }
            var8 = var8 * 29 / cr.a(var6, -109);
            stackIn_17_0 = 473 + var5;
            stackIn_17_1 = -var8 + 386;
            stackIn_17_2 = 7;
            stackIn_17_3 = var8;
            if (var7 == 0) {
              stackIn_18_4 = param1;
            } else {
              stackIn_18_4 = param0;
            }
            oo.e(stackIn_17_0, stackIn_17_1, stackIn_17_2, stackIn_17_3, stackIn_18_4);
            if (h.i(51603) &&
              jk.a((byte) -70, var6)) {
              el.field_E.a(var5 + 419, 345);
            }
          }
        }
    }

    final void a(boolean param0) {
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0;
        int stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        int stackIn_38_4 = 0;
        int stackIn_40_0;
        int stackIn_40_1;
        int stackIn_40_2;
        int stackIn_40_3;
        int stackIn_41_4 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        Object var6;
        int var6_int;
        int var7;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        super.a(param0);
        b.field_a.a(41, b.field_a.field_zb, 850, wa.field_g);
        b.field_a.c(false, -1);
        cp.field_O = -1;
        kn.field_b = -1;
        q.field_d = -1;
        oo.h(0, 53, 640, 85);
        var2 = 112;
        for (var3 = 0; var3 < 3; var3++) {
          if (bo.field_d >= 43 &&
            bo.field_d <= 78 &&
            var2 <= bd.field_g &&
            var2 + 120 >= bd.field_g) {
            kn.field_b = var3;
          }
          if (var3 == ao.field_d) {
            var5 = 65280;
            var4 = 16768512;
            var6_int = 1783040;
          } else {
            if (var3 == kn.field_b &&
              !ud.field_S) {
              var6_int = 3884288;
              var5 = 3202868;
              var4 = 16768544;
            } else {
              var4 = 8886132;
              var6_int = 1774864;
              var5 = 44800;
            }
          }
          oo.e(var2, 43, 120, 35, 10, var4);
          oo.a(var2 + 2, 45, 116, 31, 10, var5, var6_int);
          pb.field_e.b(fl.field_b[var3], 60 + var2, 69, 16646020, -1);
          var2 += 141;
        }
        this.a(56, 86, 172, 18, (byte) -92);
        var3Lifetime1 = 0;
        var4Lifetime1 = 0;
        var5Lifetime1 = 0;
        if (lh.field_l != 255) {
          if (32 <= lh.field_l) {
            stackIn_22_0 = (lh.field_l <= 38) ? 1 : 0;
          } else {
            stackIn_22_0 = 0;
          }
          var5Lifetime1 = stackIn_22_0;
          if (lh.field_l >= 44) {
            stackIn_28_0 = (lh.field_l <= 62) ? 1 : 0;
          } else {
            stackIn_28_0 = 0;
          }
          var4Lifetime1 = stackIn_28_0;
          if (lh.field_l >= 0) {
            stackIn_34_0 = (lh.field_l < 19) ? 1 : 0;
          } else {
            stackIn_34_0 = 0;
          }
          var3Lifetime1 = stackIn_34_0;
        }
        stackIn_37_0 = 7;
        stackIn_37_1 = 337;
        stackIn_37_2 = 328;
        stackIn_37_3 = 80;
        stackIn_38_4 = (var3Lifetime1 != 0) ? 16711680 : 0;
        oo.f(stackIn_37_0, stackIn_37_1, stackIn_37_2, stackIn_37_3, stackIn_38_4, 128);
        stackIn_40_0 = 337;
        stackIn_40_1 = 337;
        stackIn_40_2 = 296;
        stackIn_40_3 = 80;
        stackIn_41_4 = (var4Lifetime1 == 0) ? 0 : 16711680;
        oo.f(stackIn_40_0, stackIn_40_1, stackIn_40_2, stackIn_40_3, stackIn_41_4, 128);
        oo.a(9, 339, 74, 76, 0);
        oo.a(10, 340, 72, 74, 6575425, 3354915);
        oo.a(339, 339, 74, 76, 0);
        oo.a(340, 340, 72, 74, 1989419, 597262);
        qp.field_w.a(ve.field_a, 10, 340, 72, 74, 16777215, -1, 1, 1, 0);
        qp.field_w.a(en.field_f, 339, 339, 72, 74, 16777215, -1, 1, 1, 0);
        this.a(var5Lifetime1 != 0, (byte) -120, 14680064, 53248);
        this.b(14680064, 53248, -2939);
        this.d((byte) -104);
        this.e((byte) -67);
        if (lh.field_l != 255) {
          var6 = null;
          if (lh.field_l >= 0 &&
            lh.field_l < 19) {
            var6 = wa.field_b[lh.field_l];
          } else if (32 <= lh.field_l &&
            lh.field_l <= 38) {
            var6 = wa.field_b[lh.field_l - 32 + 19];
          } else {
            if (lh.field_l >= 44 &&
              lh.field_l <= 62) {
              var6 = wa.field_b[-44 + (lh.field_l + 26)];
            }
          }
          if (var6 != null) {
            ((ja) (var6)).c(bd.field_g - 8, bo.field_d - 8, 200);
          }
        }
    }

    final void c(boolean param0) {
        int var8 = 0;
        int stackIn_3_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int[] var6;
        int var7;
        int[] var7_ref_int__;
        int var9;
        int var10;
        int var3Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var5Lifetime6;
        int var5Lifetime7;
        int var5Lifetime8;
        int var5Lifetime9;
        int var5Lifetime10;
        int var3Lifetime2;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        stackIn_3_0 = (kj.field_q < 2) ? 0 : 1;
        var2 = stackIn_3_0;
        var7 = sj.field_p;
        if (var7 == 1) {
          if (var2 != 0) {
            var4 = 8;
            for (var7 = 0; var7 < 5; var7++) {
              var3 = ll.field_k.field_m[var7];
              if (ll.field_k.c(127, var3) &&
                !ll.field_k.d(var3, 53)) {
                ll.field_k.a(34, var4, var3);
              }
              var3Lifetime2 = ll.field_k.field_g[var7];
              if (ll.field_k.c(127, var3Lifetime2) &&
                !ll.field_k.d(var3Lifetime2, 53)) {
                ll.field_k.a(-88, var4, var3Lifetime2);
              }
            }
            for (var7 = 0; var7 < 3; var7++) {
              var3Lifetime1 = ll.field_k.field_s[var7];
              if (ll.field_k.c(127, var3Lifetime1) &&
                !ll.field_k.d(var3Lifetime1, 53)) {
                ll.field_k.a(-98, var4, var3Lifetime1);
              }
            }
            this.e(-100);
          }
        } else {
          if (10 == var7) {
            if (var2 != 0) {
              var5 = hp.a((byte) 29, g.field_a, 63);
              if (ll.field_k.c(127, var5) &&
                !ll.field_k.d(var5, 53)) {
                ll.field_k.a(40, 10, var5);
                this.e(-125);
              }
              var5Lifetime1 = hp.a((byte) -77, g.field_a, 63);
              if (ll.field_k.c(127, var5Lifetime1) &&
                !ll.field_k.d(var5Lifetime1, 53)) {
                ll.field_k.a(-106, 10, var5Lifetime1);
                this.e(-106);
              }
              var5Lifetime2 = hp.a((byte) -74, g.field_a, 63);
              if (ll.field_k.c(127, var5Lifetime2) &&
                !ll.field_k.d(var5Lifetime2, 53)) {
                ll.field_k.a(91, 10, var5Lifetime2);
                this.e(-95);
              }
              var5Lifetime3 = hp.a((byte) -91, g.field_a, 63);
              if (ll.field_k.c(127, var5Lifetime3) &&
                !ll.field_k.d(var5Lifetime3, 53)) {
                ll.field_k.a(117, 10, var5Lifetime3);
                this.e(-121);
              }
              var5Lifetime4 = hp.a((byte) 123, g.field_a, 63);
              if (ll.field_k.c(127, var5Lifetime4) &&
                !ll.field_k.d(var5Lifetime4, 53)) {
                ll.field_k.a(125, 10, var5Lifetime4);
                this.e(-122);
              }
              var5Lifetime5 = hp.a((byte) -115, g.field_a, 63);
              if (ll.field_k.c(127, var5Lifetime5) &&
                !ll.field_k.d(var5Lifetime5, 53)) {
                ll.field_k.a(-100, 10, var5Lifetime5);
                this.e(-90);
              }
              var5Lifetime6 = hp.a((byte) -69, g.field_a, 63);
              if (ll.field_k.c(127, var5Lifetime6) &&
                !ll.field_k.d(var5Lifetime6, 53)) {
                ll.field_k.a(56, 10, var5Lifetime6);
                this.e(-100);
              }
              var5Lifetime7 = hp.a((byte) -125, g.field_a, 63);
              if (ll.field_k.c(127, var5Lifetime7) &&
                !ll.field_k.d(var5Lifetime7, 53)) {
                ll.field_k.a(97, 10, var5Lifetime7);
                this.e(-117);
              }
              var5Lifetime8 = hp.a((byte) 82, g.field_a, 63);
              if (ll.field_k.c(127, var5Lifetime8) &&
                !ll.field_k.d(var5Lifetime8, 53)) {
                ll.field_k.a(76, 10, var5Lifetime8);
                this.e(-101);
              }
              var5Lifetime9 = hp.a((byte) 104, g.field_a, 63);
              if (ll.field_k.c(127, var5Lifetime9) &&
                !ll.field_k.d(var5Lifetime9, 53)) {
                ll.field_k.a(76, 10, var5Lifetime9);
                this.e(-109);
              }
              var5Lifetime10 = hp.a((byte) -85, g.field_a, 63);
              if (ll.field_k.c(127, var5Lifetime10)) {
                if (!ll.field_k.d(var5Lifetime10, 53)) {
                  ll.field_k.a(-100, 10, var5Lifetime10);
                  this.e(-92);
                  ll.field_k.c((byte) -108);
                } else {
                  ll.field_k.c((byte) -108);
                }
              } else {
                ll.field_k.c((byte) -108);
              }
            }
          } else {
            if (11 != var7) {
              if (var7 != 5) {
                if (var7 == 12 &&
                  var2 != 0) {
                  ll.field_k.e(-6821, 33);
                  ll.field_k.e(-6821, 2);
                  ll.field_k.e(-6821, 57);
                  ll.field_k.e(-6821, 0);
                  ll.field_k.e(-6821, 1);
                  ll.field_k.e(-6821, 58);
                  ll.field_k.c((byte) -93);
                  ll.field_k.e(-6821, 16);
                  for (var7 = 0; var7 < 19; var7++) {
                    ll.field_k.e(-6821, var7);
                  }
                  for (var7 = 44; var7 < 62; var7++) {
                    ll.field_k.e(-6821, var7);
                  }
                  for (var7 = 32; var7 <= 38; var7++) {
                    ll.field_k.e(-6821, var7);
                  }
                  this.e(-109);
                }
              } else {
                if (var2 != 0) {
                  var6 = new int[]{58, 0, 53, 59, 8, 32, 3, 52, 9, 2, 56, 10, 51, 1, 61, 60, 4, 54, 57, 34, 55, 50, 11, 49, 33, 7, 16};
                  var7_ref_int__ = var6;
                  for (var8 = 0; var7_ref_int__.length > var8; var8++) {
                    var9 = var7_ref_int__[var8];
                    ll.field_k.a(-86, 9999, var9);
                  }
                }
              }
            } else {
              if (var2 != 0) {
                ll.field_k.field_f = 0L;
                ll.field_k.field_n = ej.a((byte) 120);
                for (var7 = 0; ll.field_k.field_t.length > var7; var7++) {
                  ll.field_k.field_t[var7] = 0;
                }
                this.e(-100);
              }
            }
          }
        }
        super.c(param0);
    }

    private final void a(boolean param0, byte param1, int param2, int param3) {
        int stackIn_27_0;
        int stackIn_27_1;
        int stackIn_27_2;
        int stackIn_27_3;
        int stackIn_28_4 = 0;
        int stackIn_41_0;
        int stackIn_41_1;
        int stackIn_41_2;
        int stackIn_41_3;
        int stackIn_42_4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var12Lifetime1;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        var5 = ll.field_k.g((byte) 125);
        var6 = 0;
        if (param1 != -120) {
          return;
        }
        while (var6 < 5) {
          var7 = 50 * var6;
          if (pf.field_a.b(84 + var7, 340, bd.field_g, bo.field_d)) {
            q.field_d = var6;
          }
          if (var5 > var6) {
            if (param0 &&
              pb.a(ll.field_k.field_m[var6], -20, lh.field_l)) {
              pf.field_a.a(var7 + 84, 340, 128, 8388608);
            } else {
              pf.field_a.a(var7 + 84, 340);
            }
            var8 = ll.field_k.field_m[var6];
            var9 = ll.field_k.field_g[var6];
            if (var8 != 255) {
              if (var8 < 63) {
                var10 = ll.field_k.d(var8, 53) ? 1 : 0;
                var11 = ll.field_k.d(var9, param1 ^ -67) ? 1 : 0;
                wa.field_b[var8].g(90 + var7, 354);
                var12 = ll.field_k.field_t[var8];
                if (var10 != 0) {
                  var12 = cr.a(var8, -111);
                }
                var12 = 28 * var12 / cr.a(var8, -112);
                stackIn_27_0 = var7 + 120;
                stackIn_27_1 = 378 - var12;
                stackIn_27_2 = 8;
                stackIn_27_3 = var12;
                if (var10 != 0) {
                  stackIn_28_4 = param2;
                } else {
                  stackIn_28_4 = param3;
                }
                oo.e(stackIn_27_0, stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_28_4);
                if (var9 != 255) {
                  if (63 > var9) {
                    wa.field_b[-13 + var9].g(90 + var7, 384);
                    if (var6 != q.field_d) {
                    }
                    var12Lifetime1 = ll.field_k.field_t[var9];
                    if (ll.field_k.d(var9, 53)) {
                      var12Lifetime1 = cr.a(var9, param1 ^ 10);
                    }
                    var12Lifetime1 = var12Lifetime1 * 28 / cr.a(var9, -115);
                    stackIn_41_0 = 120 + var7;
                    stackIn_41_1 = -var12Lifetime1 + 410;
                    stackIn_41_2 = 8;
                    stackIn_41_3 = var12Lifetime1;
                    if (var11 != 0) {
                      stackIn_42_4 = param2;
                    } else {
                      stackIn_42_4 = param3;
                    }
                    oo.e(stackIn_41_0, stackIn_41_1, stackIn_41_2, stackIn_41_3, stackIn_42_4);
                  }
                  if (ll.field_k.a(45, -126) &&
                    var8 != 255 &&
                    17 != var8) {
                    el.field_E.a(84 + var7, 340);
                  }
                } else {
                  if (ll.field_k.a(45, -126) &&
                    var8 != 255 &&
                    17 != var8) {
                    el.field_E.a(84 + var7, 340);
                  }
                }
              } else {
                if (ll.field_k.a(45, -126) &&
                  var8 != 255 &&
                  17 != var8) {
                  el.field_E.a(84 + var7, 340);
                }
              }
            } else {
              if (ll.field_k.a(45, -126) &&
                var8 != 255 &&
                17 != var8) {
                el.field_E.a(84 + var7, 340);
              }
            }
            if (h.i(51603) && (jk.a((byte) -51, var8) ||
              jk.a((byte) -103, var9))) {
              el.field_E.a(84 + var7, 340);
            }
          } else {
            pf.field_a.a(var7 + 84, 340, 32);
          }
          var6++;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        super.a(param0, param1, param2);
        this.e(-107);
        this.field_p = 0;
    }

    final void b(byte param0) {
        th.b((byte) -61);
        super.b(param0);
    }

    tk(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        ja var12 = null;
        ja var9 = null;
        int var10 = 0;
        try {
          on.field_bb = new ki[63];
          lh.field_l = 255;
          var12 = fq.field_k;
          var9 = fq.field_k.f();
          rq.field_u = new int[255];
          for (var10 = 0; var10 < 255; var10++) {
            rq.field_u[var10] = var10 * 65793;
          }
          bp.field_u.field_ab = wc.field_M;
          cr.field_i.field_ab = df.field_Q;
          b.field_a = new mj(0L, ih.field_d, var12, var9, bp.field_u, cr.field_i, false);
          b.field_a.field_Q = 315;
          b.field_a.field_zb = 631;
          this.field_p = 0;
          b.field_a.field_x = 5;
          b.field_a.field_z = 15;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "tk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param1 != -562798775) {
          this.field_p = 119;
        }
        int var7 = ((wf.field_m << 1) / 3 + 10 * param2) % 29;
        int var8 = -var7 + 29;
        int var9 = q.$cfr$intArgs$a$f0c91481eb80(-126, (var7 << 10) / 29) >> 9;
        int var10 = (var7 * param0 + param5 * var8 << 4) / 29;
        int var11 = (param3 * var7 + var8 * param4 << 4) / 29;
        oo.a(var10, var11, 64, var9, rq.field_u);
    }

    private final void e(byte param0) {
        int var17 = 0;
        int stackIn_37_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        rp var6;
        int var7;
        int var8;
        int var9;
        String var10;
        ef var11;
        int var12;
        int var13;
        String[] var14;
        int var16;
        int var18;
        int var19;
        String var20;
        int[] var24;
        int var4Lifetime1;
        int var16Lifetime1;
        var19 = ZombieDawnMulti.field_E ? 1 : 0;
        if (ud.field_S) {
          return;
        }
        if (param0 != -67) {
          return;
        }
        var6 = ll.field_k;
        var7 = -1;
        var8 = -1;
        if (cp.field_O != 255 &&
          cp.field_O != -1) {
          var7 = cp.field_O;
        } else {
          if (q.field_d < 5) {
            if (0 <= q.field_d) {
              if (q.field_d >= var6.g((byte) -80)) {
                var7 = -2;
              } else {
                var8 = var6.field_g[q.field_d];
                var7 = var6.field_m[q.field_d];
              }
            }
          } else {
            var7 = var6.field_s[-5 + q.field_d];
          }
          if (h.i(51603) &&
            jk.a((byte) -51, var7)) {
            var7 = -3;
          }
        }
        if (255 == var7) {
          var7 = -1;
        }
        if (var8 == 255) {
          var8 = -1;
        }
        if (-1 == var7) {
          gf.field_f = 0;
        } else {
          if (gf.field_f == 0 &&
            10 < b.a(true)) {
            gf.field_f = gf.field_f + 1;
          }
          if (gf.field_f > 0) {
            gf.field_f = gf.field_f + 2;
            if (255 < gf.field_f) {
              gf.field_f = 255;
            }
            stackIn_37_0 = (!var6.c(127, var7)) ? 0 : 1;
            var9 = stackIn_37_0;
            if (var7 == -2) {
              var10 = vc.field_b;
            } else {
              if (var7 == -3) {
                var10 = ik.field_b;
              } else {
                var20 = wq.field_g[var7][var9];
                var10 = var20;
                if (-1 != var8) {
                  var10 = var20 + ii.field_b + wq.field_g[var8][var9];
                }
              }
            }
            var11 = qp.field_w;
            var12 = var11.a(var10);
            var13 = 8 * gf.field_f;
            var4 = qp.field_w.field_w * (1 + ro.a(-124, '<', (CharSequence) ((Object) var10)));
            if (var13 > 255) {
              var13 = 255;
            }
            while (400 < var12) {
              var12 = var12 / 2;
              var4 = var4 * 2;
            }
            var14 = new String[var11.b(var10, var12)];
            var24 = new int[var14.length];
            for (var16 = 0; var16 < var14.length; var16++) {
              var24[var16] = var12;
            }
            var11.a(var10, var24, var14);
            var16Lifetime1 = 0;
            for (var17 = 0; var14.length > var17; var17++) {
              var18 = var11.a(var14[var17]);
              if (var16Lifetime1 < var18) {
                var16Lifetime1 = var18;
              }
            }
            var5 = var16Lifetime1;
            var4Lifetime1 = var14.length * qp.field_w.field_w;
            var2 = bd.field_g;
            var3 = 32 + bo.field_d;
            if (var2 >= 0) {
              if (var5 + var2 > 635) {
                var2 = -var5 + 640 - 5;
              }
            } else {
              var2 = 0;
            }
            if (var3 + var4Lifetime1 > 475) {
              var3 = -5 + (-var4Lifetime1 + 480);
            }
            oo.b(var2 - 2, -2 + var3, var5 + 8, var4Lifetime1 + 8, 4, 0, var13 / 2);
            oo.b(-4 + var2, var3 - 4, 8 + var5, var4Lifetime1 + 8, 4, 5005603, var13);
            var11.a(var10, var2, var3, var5, var4Lifetime1, 16777215, 0, var13, 1, 1, 0);
          }
        }
    }

    final static void a(hp param0, int param1, int param2) {
        ga var6 = null;
        int var4 = 0;
        try {
          if (param1 < 13) {
            hp var5 = (hp) null;
            tk.a((hp) null, -88, 107);
          }
          var6 = ma.field_a;
          var6.b((byte) -35, param2);
          var6.field_j = var6.field_j + 1;
          var4 = var6.field_j;
          var6.a(121, 1);
          var6.a(127, param0.field_v);
          var6.c(param0.field_f, 0);
          var6.b(-118, param0.field_q);
          var6.b(92, param0.field_u);
          var6.b(-115, param0.field_r);
          var6.b(100, param0.field_n);
          var6.f(var4, 115);
          var6.e(70, var6.field_j - var4);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "tk.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, byte param4) {
        int var16 = 0;
        ki stackIn_21_0 = null;
        int var7;
        int var8;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int[][] var34;
        int[] var35;
        int[] var36;
        int var11Lifetime1;
        int var12Lifetime1;
        int var14Lifetime1;
        int var19Lifetime1;
        int var23Lifetime1;
        var24 = ZombieDawnMulti.field_E ? 1 : 0;
        oo.h(5, 54, 635, 330);
        var34 = em.field_Y[ao.field_d];
        var7 = 0;
        var8 = -9 / ((-16 - param4) / 50);
        while (var7 < var34.length) {
          var35 = var34[var7];
          var10 = var35.length;
          for (var11 = 0; var11 < var10; var11++) {
            var12 = var35[var11];
            if (var12 != 255) {
              continue;
            }
            var10 = var11;
            break;
          }
          var11Lifetime1 = (-var10 + var35.length) * param0 / 2;
          if (0 != var10) {
            for (var12Lifetime1 = 0; var10 > var12Lifetime1; var12Lifetime1++) {
              var13 = var35[var12Lifetime1];
              if (255 != var13 &&
                ll.field_k.g(var13, 4)) {
                stackIn_21_0 = on.field_bb[var13];
                if (stackIn_21_0 == null) {
                  var14 = param3 + var7 * param2 - wa.field_g;
                  var15 = var11Lifetime1 + param1 + var12Lifetime1 * param0;
                  on.field_bb[var13] = new ki(var13, var14, var15);
                }
                on.field_bb[var13].field_q = -wa.field_g + (param3 + var7 * param2);
                on.field_bb[var13].a(true);
                if (on.field_bb[var13].b((byte) 39) &&
                  lh.field_l == 255 &&
                  !ud.field_S) {
                  cp.field_O = var13;
                  on.field_bb[var13].field_b.e(on.field_bb[var13].field_q, on.field_bb[var13].field_g, (q.$cfr$intArgs$a$f0c91481eb80(-60, wf.field_m << 4) >> 9) + 128);
                }
                var14Lifetime1 = on.field_bb[var13].field_c;
                if (ll.field_k.g(var14Lifetime1, 4)) {
                  var36 = em.field_ab[var14Lifetime1];
                  for (var16 = 0; var36.length > var16; var16++) {
                    var17 = var36[var16];
                    if (var17 != 255 &&
                      ll.field_k.g(var17, 4)) {
                      var18 = -1;
                      var19 = 0;
                      while (var19 < on.field_bb.length) {
                        if (on.field_bb[var19] != null &&
                          var17 == on.field_bb[var19].field_c) {
                          var18 = var19;
                          var19 = on.field_bb.length;
                        }
                        var19++;
                      }
                      if (var18 != -1 &&
                        on.field_bb[var18] != null) {
                        var19Lifetime1 = -3 + on.field_bb[var13].field_q;
                        var20 = on.field_bb[var13].field_b.field_w / 2 + on.field_bb[var13].field_g;
                        var21 = on.field_bb[var13].field_b.field_x + (on.field_bb[var18].field_q + 3);
                        var22 = on.field_bb[var13].field_b.field_w / 2 + on.field_bb[var18].field_g;
                        for (var23 = -1; var23 < 1; var23++) {
                          oo.g(var19Lifetime1, var20 + var23, var21, var23 + var22, 11528032);
                        }
                        if (ll.field_k.c(127, var14Lifetime1)) {
                          for (var23Lifetime1 = 0; var23Lifetime1 < 3; var23Lifetime1++) {
                            this.b(var19Lifetime1, -562798775, var23Lifetime1, var20, var22, var21);
                          }
                        }
                        oo.a(var19Lifetime1, -4 + var20, 4, 9, 1);
                        oo.a(var19Lifetime1 + 1, -3 + var20, 2, 7, 11316396, 5066061);
                        oo.a(var21 - 4, -4 + var22, 4, 9, 1);
                        oo.a(-3 + var21, -3 + var22, 2, 7, 11316396, 5066061);
                      }
                    }
                  }
                }
              }
            }
          }
          var7++;
        }
        oo.c();
    }

    public static void c(byte param0) {
        field_o = null;
        field_l = null;
        field_q = null;
        if (param0 >= -62) {
          hp var2 = (hp) null;
          tk.a((hp) null, -91, 7);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        oo.h(param5, param2, param4 + param5 + (param1 << 1), (param1 << 1) + param2 + param0);
        o.field_h.c(param5, param2);
        oo.f(param5, param2, param4 + (param1 << 1), param0 + (param1 << 1), 2560, 160);
        ak.a((param1 << 1) + param4, param0 + (param1 << 1), -5, param5, param2);
        oo.c();
        if (param3 >= -55) {
          this.b((byte) 22);
        }
    }

    final void a(int param0) {
        boolean stackIn_6_0 = false;
        boolean stackIn_27_0 = false;
        boolean stackIn_56_0 = false;
        boolean stackIn_60_0 = false;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        rp var8;
        int var9;
        rp var10;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var4Lifetime2;
        int var5Lifetime2;
        int var5Lifetime2Lifetime1;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        stackIn_6_0 = (bd.field_g >= 600) && (620 > bd.field_g) && (bo.field_d >= 10) && (bo.field_d <= 30);
        u.field_i = stackIn_6_0;
        if (ud.field_S) {
          this.field_p = this.field_p + 1;
          var2 = 0;
          for (var3 = 0; var3 < lc.field_m.length; var3++) {
            if (lc.field_m[var3]) {
              var2 = 1;
            }
          }
          if (var2 != 0) {
            ud.field_S = false;
          }
          if (kd.field_b == 1) {
            ud.field_S = false;
          }
          return;
        }
        this.field_p = 0;
        if (kd.field_b == 1 &&
          u.field_i) {
          stackIn_27_0 = !(ud.field_S);
          ud.field_S = stackIn_27_0;
          this.field_p = 2000;
        }
        boolean decompiledFrameRemainder0 = true;
        super.a(param0 ^ 0);
        var8 = ll.field_k;
        var10 = var8;
        var3Lifetime1 = var10.g((byte) 123);
        en.a(~param0, 4);
        if (lh.field_l != 255 &&
          q.field_d != -1) {
          if (lh.field_l >= 44 &&
            lh.field_l <= 62) {
            if ((!(0 > q.field_d)) &&
              (!(q.field_d >= 5))) {
              en.a(-1, 6);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (0 <= lh.field_l &&
              lh.field_l < 19) {
              if (!(var3Lifetime1 > q.field_d)) {
                en.a(-1, 6);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (32 <= lh.field_l &&
                lh.field_l < 38 && (!(q.field_d >= 0) ||
                !(var3Lifetime1 > q.field_d) ||
                !pb.a(var8.field_m[q.field_d], -20, lh.field_l))) {
                en.a(param0 - 1, 6);
              }
            }
          }
        }
        if (c.field_b &&
          pq.field_f != 0) {
          stackIn_56_0 = !(wf.field_m - sq.field_S >= 25);
          kk.field_u = stackIn_56_0;
          sq.field_S = wf.field_m;
        } else {
          kk.field_u = false;
        }
        stackIn_60_0 = (pq.field_f == param0);
        c.field_b = stackIn_60_0;
        if (kk.field_u) {
          L17: {
            if (ll.field_k.c(127, cp.field_O)) {
              if (0 <= cp.field_O &&
                cp.field_O < 19) {
                var4 = var10.g((byte) -42);
                var5 = 0;
                if ((var5 == 0)) {
                  var6 = 0;
                  while (true) {
                    if (var6 >= var4) {
                      break L17;
                    }
                    if (var10.field_m[var6] != 255) {
                      var6++;
                      continue;
                    }
                    break;
                  }
                  var10.field_m[var6] = cp.field_O;
                  nm.b(-128, 87);
                }
                break L17;
              }
              if (cp.field_O >= 44 &&
                cp.field_O <= 62) {
                var4Lifetime2 = 0;
                for (var5Lifetime2 = 0; var5Lifetime2 < 3; var5Lifetime2++) {
                  if (var10.field_s[var5Lifetime2] != cp.field_O) {
                    continue;
                  }
                  var4Lifetime2 = 1;
                  break;
                }
                if (var4Lifetime2 == 0) {
                  var5Lifetime2Lifetime1 = 0;
                  while (3 > var5Lifetime2Lifetime1) {
                    if (255 != var10.field_s[var5Lifetime2Lifetime1]) {
                      var5Lifetime2Lifetime1++;
                      continue;
                    }
                    var10.field_s[var5Lifetime2Lifetime1] = cp.field_O;
                    nm.b(-127, 87);
                    break;
                  }
                }
              }
            }
          }
          if (q.field_d >= 0 &&
            q.field_d < 5) {
            if (380 < bo.field_d) {
              var10.field_g[q.field_d] = 255;
            }
            var10.field_m[q.field_d] = 255;
          } else {
            if (q.field_d >= 5) {
              var10.field_s[-5 + q.field_d] = 255;
            }
          }
        }
        b.field_a.a(-11838, true);
        wa.field_g = b.field_a.a(850, b.field_a.field_zb, -18367);
        var4Lifetime1 = -10;
        wa.field_g = wa.field_g + var4Lifetime1 * t.field_d;
        var5Lifetime1 = -100;
        if (b.field_a.k(20)) {
          wa.field_g = wa.field_g + var4Lifetime1;
        }
        if (b.field_a.h(4690)) {
          wa.field_g = wa.field_g - var4Lifetime1;
        }
        if (b.field_a.j(param0 ^ 64)) {
          wa.field_g = wa.field_g + var5Lifetime1;
        }
        if (b.field_a.c((byte) -104)) {
          wa.field_g = wa.field_g - var5Lifetime1;
        }
        if (wa.field_g < 0) {
          wa.field_g = 0;
        }
        if (wa.field_g > -b.field_a.field_zb + 850) {
          wa.field_g = -b.field_a.field_zb + 850;
        }
        if (1 == kd.field_b) {
          if (255 != cp.field_O &&
            var10.c(127, cp.field_O)) {
            lh.field_l = cp.field_O;
            nm.b(-126, 90);
          }
          if (kn.field_b == -1) {
            if (lh.field_l == 255 &&
              q.field_d != -1) {
              if (q.field_d < 5) {
                if (bo.field_d >= 380) {
                  lh.field_l = var10.field_g[q.field_d];
                  nm.b(param0 ^ -128, 90);
                } else {
                  lh.field_l = var10.field_m[q.field_d];
                  nm.b(-128, 90);
                  var10.field_m[q.field_d] = 255;
                }
                var10.field_g[q.field_d] = 255;
              } else {
                lh.field_l = var10.field_s[q.field_d - 5];
                nm.b(-128, 90);
                var10.field_s[q.field_d - 5] = 255;
              }
            }
          } else {
            ao.field_d = kn.field_b;
            nm.b(-126, 91);
          }
        }
        if (pq.field_f != 1) {
          L34: {
            if (q.field_d != -1 &&
              lh.field_l != 255) {
              if (q.field_d >= 5) {
                if (lh.field_l >= 44 &&
                  lh.field_l <= 62) {
                  var9 = 0;
                  var6Lifetime1 = var9;
                  while (3 > var9) {
                    if (~lh.field_l == ~var10.field_s[var9]) {
                      var10.field_s[var9] = 255;
                    }
                    var9++;
                  }
                  var10.field_s[-5 + q.field_d] = lh.field_l;
                  nm.b(param0 - 127, 87);
                }
              } else {
                if (q.field_d < var3Lifetime1) {
                  if (lh.field_l >= 0 &&
                    lh.field_l < 19) {
                    var10.field_m[q.field_d] = lh.field_l;
                    if (!(pb.a(lh.field_l, -20, var10.field_g[q.field_d]))) {
                      var10.field_g[q.field_d] = 255;
                      nm.b(-126, 87);
                    }
                    break L34;
                  }
                  if (lh.field_l >= 32 &&
                    lh.field_l <= 38 &&
                    pb.a(var10.field_m[q.field_d], -20, lh.field_l)) {
                    var10.field_g[q.field_d] = lh.field_l;
                    nm.b(-128, 87);
                  }
                }
              }
            }
          }
          lh.field_l = 255;
        }
    }

    private final void d(byte param0) {
        int var7;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime2Lifetime1;
        int var5Lifetime3Lifetime1;
        int var5Lifetime4Lifetime1;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        if (u.field_i) {
          oo.d(610, 20, 9, 16777215);
        } else {
          if (ud.field_S) {
            oo.d(610, 20, 9, 65280);
          } else {
            oo.d(610, 20, 9, 16711680, (q.$cfr$intArgs$a$f0c91481eb80(-104, wf.field_m << 5) >> 9) + 128);
          }
        }
        if (param0 >= -85) {
          field_n = 43;
        }
        jl.field_u.c(600, 10);
        if (ud.field_S) {
          oo.f(0, 0, 640, 480, 0, 64);
          var6 = 10;
          var2 = 445;
          var3 = 2;
          var4 = 120;
          var5 = pb.field_e.a(cc.field_a, var4, 0);
          this.a(var5, var6, var3, -79, var4, var2);
          pb.field_e.a(cc.field_a, var2 + var6, var6 + var3, var4, var5, 16777215, -1, 0, 0, 0);
          lh.field_m.a(-3 + ((var6 << 1) + (var2 + var4)), 8 + var3);
          if (this.field_p > 0) {
            var2Lifetime1 = 200;
            var4Lifetime1 = 390;
            var3Lifetime1 = 100;
            var5Lifetime1 = pb.field_e.a(uc.field_g, var4Lifetime1, 0);
            this.a(var5Lifetime1, var6, var3Lifetime1, -105, var4Lifetime1, var2Lifetime1);
            pb.field_e.a(uc.field_g, var2Lifetime1 + var6, var3Lifetime1 + var6, var4Lifetime1, var5Lifetime1, 16777215, -1, 0, 0, 0);
            ip.field_e.a(var2Lifetime1 + 50, var3Lifetime1 + 3 - ip.field_e.field_b);
            oi.field_k.a(var2Lifetime1 + 50, var5Lifetime1 + var3Lifetime1 - 3 + (var6 << 1));
            lh.field_m.a(var2Lifetime1 - (-var4Lifetime1 - (var6 << 1) + 3), var3Lifetime1 + (var5Lifetime1 >> 1));
            uo.field_n.a(var2Lifetime1 + (-var6 - 1), (var5Lifetime1 >> 1) + var3Lifetime1);
          }
          if (this.field_p > 100) {
            var2Lifetime2 = 50;
            var5Lifetime2 = 80;
            var4Lifetime2 = 250;
            var3Lifetime2 = 280;
            var5Lifetime2Lifetime1 = pb.field_e.a(wq.field_d, var4Lifetime2, 0);
            this.a(var5Lifetime2Lifetime1, var6, var3Lifetime2, -126, var4Lifetime2, var2Lifetime2);
            pb.field_e.a(wq.field_d, var6 + var2Lifetime2, var3Lifetime2 + var6, var4Lifetime2, var5Lifetime2Lifetime1, 16777215, -1, 0, 0, 0);
            oi.field_k.a(var2Lifetime2 + 50, var5Lifetime2Lifetime1 + var3Lifetime2 + (-3 + (var6 << 1)));
          }
          if (this.field_p > 300) {
            var5Lifetime3 = 80;
            var3Lifetime3 = 400;
            var4Lifetime3 = 250;
            var2Lifetime3 = 50;
            if (p.field_e == 1 ||
              p.field_e == 2) {
              var3Lifetime3 -= 10;
            }
            var5Lifetime3Lifetime1 = pb.field_e.a(jf.field_c, var4Lifetime3, 0);
            this.a(var5Lifetime3Lifetime1, var6, var3Lifetime3, -71, var4Lifetime3, var2Lifetime3);
            pb.field_e.a(jf.field_c, var6 + var2Lifetime3, var3Lifetime3 + var6, var4Lifetime3, var5Lifetime3Lifetime1, 16777215, -1, 0, 0, 0);
            ip.field_e.a(50 + var2Lifetime3, -ip.field_e.field_b + (var3Lifetime3 + 3));
          }
          if (this.field_p > 200) {
            var3Lifetime4 = 280;
            var4Lifetime4 = 250;
            var5Lifetime4 = 80;
            var2Lifetime4 = 350;
            var5Lifetime4Lifetime1 = pb.field_e.a(pi.field_h, var4Lifetime4, 0);
            this.a(var5Lifetime4Lifetime1, var6, var3Lifetime4, -118, var4Lifetime4, var2Lifetime4);
            pb.field_e.a(pi.field_h, var2Lifetime4 + var6, var6 + var3Lifetime4, var4Lifetime4, var5Lifetime4Lifetime1, 16777215, -1, 0, 0, 0);
            oi.field_k.a(80 + var2Lifetime4, var5Lifetime4Lifetime1 - 3 + (var3Lifetime4 + (var6 << 1)));
          }
        }
    }

    static {
        field_o = "Show lobby chat from my friends";
    }
}
