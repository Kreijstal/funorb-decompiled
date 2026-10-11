/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.io.PrintStream;

public final class Lexicominos extends nk {
    static db field_I;
    static String field_H;
    private boolean field_K;
    static boolean field_M;
    static int field_G;
    static boolean field_E;
    static String field_F;
    private int field_J;
    public static boolean field_L;

    private final boolean a(byte param0, boolean param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        db dupTemp$2 = null;
        db dupTemp$3 = null;
        int stackIn_127_0 = 0;
        int stackIn_127_1 = 0;
        int stackIn_150_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_159_1 = 0;
        int[] stackIn_170_0 = null;
        int stackIn_180_0 = 0;
        int stackIn_189_0 = 0;
        int stackIn_189_1 = 0;
        int stackIn_203_0 = 0;
        int stackIn_205_0 = 0;
        int stackIn_205_1 = 0;
        int stackIn_219_0 = 0;
        eb[] stackIn_241_0 = null;
        eb[] stackIn_251_0 = null;
        boolean stackIn_254_0 = false;
        boolean stackIn_261_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_253_0;
        eb[] var3 = null;
        int var3_int = 0;
        db[] var3_array = null;
        ke var3_ref = null;
        RuntimeException var3_ref2 = null;
        int var4 = 0;
        ke var4_ref_ke = null;
        int var5_int = 0;
        eb[] var5 = null;
        int var6 = 0;
        db var6_ref_db = null;
        int var7_int = 0;
        db var7 = null;
        int[] var7_array = null;
        db[] var7_array2 = null;
        int[] var8_ref_int__ = null;
        int var8 = 0;
        int[] var9 = null;
        int var9_int = 0;
        int var10_int = 0;
        int[] var10 = null;
        int var11_int = 0;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var10Lifetime1;
        int[] var11Lifetime1;
        int stackIn_127_0Lifetime1;
        int stackIn_127_1Lifetime1;
        int var6Lifetime1;
        int var8Lifetime1;
        var17 = field_L ? 1 : 0;
        try {
          if (kc.field_m[0] == null) {
            if (th.field_p.c(-61) &&
              th.field_p.a("basic", 10762)) {
              if (!th.field_p.a("roman20", param0 + 10848)) {
                al.a(16, rh.a(th.field_p, (byte) 68, "roman20", v.field_t, li.field_P), 0.0f);
                return false;
              }
              if (!th.field_p.a("roman12", 10762)) {
                al.a(16, rh.a(th.field_p, (byte) 94, "roman12", v.field_t, li.field_P), 0.0f);
                return false;
              }
              if (gg.field_d.c(106) &&
                gg.field_d.a("roman20", 10762)) {
                if (!gg.field_d.a("roman12", param0 ^ -10848)) {
                  al.a(16, rh.a(gg.field_d, (byte) 124, "roman12", v.field_t, li.field_P), 0.0f);
                  return false;
                }
                if (gl.field_a.c(81) &&
                  gl.field_a.a((byte) -124)) {
                  if (hc.field_gb.c(79) &&
                    hc.field_gb.a((byte) 120)) {
                    if (ga.field_a.c(-114) &&
                      ga.field_a.a((byte) -118)) {
                      if (ec.field_b.c(113) &&
                        ec.field_b.a((byte) 70)) {
                        if (dl.field_d.c(87) &&
                          dl.field_d.a((byte) -118)) {
                          if (ci.field_e.c(param0 ^ -5) &&
                            ci.field_e.a((byte) 55)) {
                            if (hh.field_L.c(99) &&
                              hh.field_L.a((byte) -127)) {
                              if (ci.field_a.c(118) &&
                                ci.field_a.a((byte) 15)) {
                                al.a(param0 + 102, qk.field_b, 90.0f);
                                this.d(18380);
                                if (!param1) {
                                  return false;
                                }
                                kj.c(true);
                                kc.field_m[0] = sd.a(gl.field_a, "", "turnover_page").c();
                                kc.field_m[1] = sd.a(gl.field_a, "", "drop_book").c();
                                kc.field_m[4] = sd.a(gl.field_a, "", "x2").c();
                                kc.field_m[5] = sd.a(gl.field_a, "", "x3").c();
                                kc.field_m[6] = sd.a(gl.field_a, "", "x4").c();
                                kc.field_m[7] = sd.a(gl.field_a, "", "x5").c();
                                var3_ref = sd.a(gl.field_a, "", "score_increase_loop").c();
                                var4_ref_ke = sd.a(gl.field_a, "", "score_increase_stop").c();
                                kc.field_m[2] = aj.a((byte) -42, var4_ref_ke, var3_ref);
                                th.field_o[2] = cc.a(kc.field_m[2], 100, 128);
                                kc.field_m[8] = ba.a(hc.field_gb, "", "lexi_block_stop").a();
                                vb.field_r = new ja(hc.field_gb, gl.field_a);
                                kc.field_m[9] = vb.field_r.a((byte) -80, "drum_075_claves");
                                th.field_o[9] = cc.a(kc.field_m[9], 100, 128);
                                dl.b(5);
                                return false;
                              }
                              al.a(16, rh.a(ci.field_a, (byte) 97, "index", fg.field_a, sg.field_f), 86.0f);
                              return false;
                            }
                            al.a(16, rh.a(hh.field_L, (byte) 119, "", ia.field_F, ee.field_e), (float)(10 + hh.field_L.b("", (byte) 112) * 76 / 100));
                            return false;
                          }
                          al.a(16, rh.a(ci.field_e, (byte) 113, "", v.field_t, li.field_P), 10.0f);
                          return false;
                        }
                        al.a(16, rh.a(dl.field_d, (byte) 98, "", pe.field_e, qf.field_s), 9.0f);
                        return false;
                      }
                      al.a(16, rh.a(ec.field_b, (byte) 42, "", ni.field_d, fj.field_y), 6.0f);
                      return false;
                    }
                    al.a(16, qg.a((byte) 100, ga.field_a, ni.field_d, 0, fj.field_y), 5.0f);
                    return false;
                  }
                  al.a(param0 + 102, rh.a(hc.field_gb, (byte) 37, "", kj.field_p, e.field_h), 4.0f);
                  return false;
                }
                al.a(param0 + 102, rh.a(gl.field_a, (byte) 122, "", kj.field_p, e.field_h), 1.0f);
                return false;
              }
              al.a(16, rh.a(gg.field_d, (byte) 37, "roman20", v.field_t, li.field_P), 0.0f);
              return false;
            }
            al.a(16, rh.a(th.field_p, (byte) 55, "basic", pe.field_e, qf.field_s), 0.0f);
            return false;
          }
          if (ec.field_b != null) {
            al.a(16, pl.field_b, 91.0f);
            this.d(param0 + 18466);
            hc.field_gb = null;
            gl.field_a = null;
            aa.field_i[0] = ih.a(ec.field_b, "", "game");
            aa.field_i[1] = ih.a(ec.field_b, "", "game2");
            aa.field_i[2] = ih.a(ec.field_b, "", "game3");
            aa.field_i[3] = ih.a(ec.field_b, "", "game4");
            aa.field_i[4] = ih.a(ec.field_b, "", "game5");
            aa.field_i[5] = ih.a(ec.field_b, "", "panic");
            aa.field_i[6] = ih.a(ec.field_b, "", "titlescreen");
            aa.field_i[7] = ih.a(ec.field_b, "", "gameover");
            var3_int = 0;
            boolean decompiledNaturalLoopExit4 = false;
            while (!(decompiledNaturalLoopExit4 = (!(aa.field_i.length > var3_int)))) {
              if (var17 == 0) {
                if (aa.field_i[var3_int] != null) {
                  uh.field_n.field_A.a(0, aa.field_i[var3_int], (byte) 102, vb.field_r, ga.field_a);
                }
                var3_int++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit4) {
              uh.field_n.field_A.c(-94);
              ga.field_a = null;
              vb.field_r = null;
              ec.field_b = null;
              dl.b(5);
            }
            return false;
          }
          if (null != th.field_p) {
            ob.field_e = df.a("basic", "orbcoin", th.field_p, (byte) -70);
            e.field_u = df.a("basic", "unachieved", th.field_p, (byte) -41);
            bi.field_a = hb.a(gg.field_d, 246, "roman20", "", th.field_p);
            mk.field_h = hb.a(gg.field_d, 246, "roman12", "", th.field_p);
            tb.field_a = hb.a(dl.field_d, "scorefont", "", ci.field_e, -2569);
            jh.field_d = hb.a(ci.field_e, 246, "", "lexfont", dl.field_d);
            th.field_p = null;
            gg.field_d = null;
          }
          if (jj.field_f != null) {
            if (param0 != -86) {
              return true;
            }
            if (hh.field_L != null) {
              al.a(16, qa.field_b, 93.0f);
              this.d(param0 + 18466);
              ib.field_a = ig.a(hh.field_L.a((byte) 127, "introanim.acp", ""), -66);
              hh.field_L = null;
            }
            if (ci.field_a == null) {
              if (qc.field_d == null) {
                qc.field_d = el.a(0, ia.field_H);
                v.field_B.b(1);
                dl.b(5);
                return false;
              }
              if (null == ne.field_b) {
                ne.field_b = el.a(0, lg.field_c);
                v.field_B.b(1);
                dl.b(param0 ^ -81);
                return false;
              }
              var3_int = 0;
              do {
                if (var3_int >= 15) {
                  th.field_r = 0;
                  ed.field_v = 90;
                  cg.field_j = -1;
                  aa.field_j = -2;
                  break;
                }
                vg.field_d[var3_int] = new sg(this, var3_int);
                var3_int++;
              } while (var17 == 0);
              return true;
            }
            boolean decompiledFrameCompleted0 = true;
            al.a(16, we.field_j, 99.0f);
            this.d(param0 ^ -18330);
            if (id.field_w == null) {
              var3 = ed.a(ci.field_a, true);
              var4 = 0;
              var5_int = 0;
              boolean decompiledNaturalLoopExit3 = false;
              while (!(decompiledNaturalLoopExit3 = (var3.length <= var5_int))) {
                stackIn_241_0 = var3;
                if (var17 == 0) {
                  if (stackIn_241_0[var5_int] != null) {
                    var4++;
                  }
                  var5_int++;
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit3) {
                incrementValue$0 = var4;
                var4--;
                stackIn_241_0 = new eb[incrementValue$0];
              }
              var5 = stackIn_241_0;
              var6 = var3.length - 1;
              boolean decompiledNaturalLoopExit2 = false;
              while (!(decompiledNaturalLoopExit2 = (var6 < 0))) {
                stackIn_251_0 = var3;
                if (var17 == 0) {
                  if (stackIn_251_0[var6] != null) {
                    incrementValue$1 = var4;
                    var4--;
                    var5[incrementValue$1] = var3[var6];
                  }
                  var6--;
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit2) {
                stackIn_251_0 = var5;
              }
              id.field_w = new oj[stackIn_251_0.length];
              var6Lifetime1 = 0;
              while (!(id.field_w.length <= var6Lifetime1)) {
                id.field_w[var6Lifetime1] = new oj(dl.field_d, ci.field_e, var5[var6Lifetime1]);
                stackOut_253_0 = ug.field_s.equals(id.field_w[var6Lifetime1].field_k);
                stackIn_261_0 = stackOut_253_0;
                stackIn_254_0 = stackOut_253_0;
                if (var17 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_254_0) {
                  rg.field_b = var6Lifetime1;
                }
                var6Lifetime1++;
              }
            }
            if (decompiledFrameCompleted0) {
              dl.field_d = null;
              ci.field_a = null;
              ci.field_e = null;
              dl.b(5);
              stackIn_261_0 = false;
            }
            return stackIn_261_0;
          }
          al.a(param0 ^ -70, gf.field_q, 92.0f);
          this.d(18380);
          cb.field_n = df.a("", "bookbg", dl.field_d, (byte) -69);
          pa.field_a = df.a("", "leftpage", dl.field_d, (byte) -83);
          va.field_m = df.a("", "rightpage", dl.field_d, (byte) -64);
          var3_array = td.a("", "frame", dl.field_d, 22306);
          var4 = 150;
          var5_int = 100;
          var6_ref_db = new db(var4, var5_int);
          var6_ref_db.b();
          va.field_m.b(-104, -198);
          var3_array[4] = new db(var4 << 1, var5_int << 1);
          var3_array[4].b();
          var6_ref_db.b(0, 0);
          var6_ref_db.g(var4, 0);
          var6_ref_db.d();
          var6_ref_db.b(0, var5_int);
          var6_ref_db.g(var4, var5_int);
          nh.field_c = new db[9];
          qb.field_o = new db[9];
          var7_int = 0;
          L18: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var7_int < 9) {
              stackIn_127_0 = -5;
              stackIn_127_1 = ~var7_int;
              if (var17 != 0) {
                if (stackIn_127_0 < stackIn_127_1) {
                  break L18;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_127_0 == stackIn_127_1) {
                  qb.field_o[var7_int] = var3_array[var7_int];
                  nh.field_c[var7_int] = null;
                } else {
                  qb.field_o[var7_int] = new db(var3_array[var7_int].field_p, var3_array[var7_int].field_u);
                  qb.field_o[var7_int].b();
                  var3_array[var7_int].e(0, 0, 11345438);
                  nh.field_c[var7_int] = new db(var3_array[var7_int].field_p, var3_array[var7_int].field_u);
                  nh.field_c[var7_int].b();
                  var3_array[var7_int].e(0, 0, 13343019);
                }
                var7_int++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              var3_array = td.a("", "frame2", dl.field_d, param0 + 22392);
              jh.field_b = new db[9];
              var7_int = 0;
              while (true) {
                stackIn_127_0Lifetime1 = -10;
                stackIn_127_1Lifetime1 = ~var7_int;
                if (stackIn_127_0Lifetime1 >= stackIn_127_1Lifetime1) {
                  break;
                }
                if (var17 != 0) {
                  break L18;
                }
                if (var7_int == 4) {
                  jh.field_b[var7_int] = null;
                } else {
                  jh.field_b[var7_int] = new db(var3_array[var7_int].field_p, var3_array[var7_int].field_u);
                  jh.field_b[var7_int].b();
                  var3_array[var7_int].e(0, 0, 13343019);
                }
                var7_int++;
              }
            }
            ef.field_d = td.a("", "achievements_lrg", dl.field_d, 22306);
            break;
          }
          var7 = df.a("", "glass_case", dl.field_d, (byte) -54);
          var7.e();
          var8_ref_int__ = var7.field_y;
          ef.field_d[10].e();
          var9 = ef.field_d[10].field_y;
          var10_int = 0;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var10_int >= 16384))) {
            var11_int = var8_ref_int__[var10_int];
            stackIn_150_0 = 0;
            if (var17 == 0) {
              if (stackIn_150_0 != var11_int) {
                var12 = var11_int >> 3 & 31 | var11_int >> 6 & 1020;
                var13 = 256 - var12;
                var14 = var9[var10_int];
                var15 = var14 & 16711935;
                var16 = 65280 & var14;
                var9[var10_int] = tb.a(vg.a(var13 * var15 + var12 * 16711935 >> 8, 16711935), vg.a(65280, var13 * var16 + var12 * 65280 >> 8));
              }
              var10_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            ef.field_d[10].f();
            stackIn_150_0 = 0;
          }
          var7_int = stackIn_150_0;
          do {
            if (!(ef.field_d.length > var7_int)) {
              ee.a((byte) -102, e.field_u);
              fc.field_e = new db[ef.field_d.length];
              md.field_A = new db[ef.field_d.length];
              break;
            }
            ee.a((byte) -102, ef.field_d[var7_int]);
            var7_int++;
          } while (var17 == 0);
          var7_int = 0;
          while (true) {
            stackIn_159_0 = var7_int;
            stackIn_159_1 = fc.field_e.length;
            if (stackIn_159_0 < stackIn_159_1) {
              fc.field_e[var7_int] = this.a(-128, ef.field_d[var7_int]);
              md.field_A[var7_int] = fc.field_e[var7_int].c();
              var8_ref_int__ = md.field_A[var7_int].field_y;
              stackIn_170_0 = var8_ref_int__;
              if (var17 == 0) {
                var9_int = stackIn_170_0.length - 1;
                while (0 <= var9_int) {
                  stackIn_159_0 = var8_ref_int__[var9_int];
                  stackIn_159_1 = 16777215;
                  if (stackIn_159_0 == stackIn_159_1) {
                    var8_ref_int__[var9_int] = 9639960;
                  }
                  var9_int--;
                }
                var7_int++;
                continue;
              }
            } else {
              ri.field_b = this.a(param0 ^ -62, e.field_u);
              fl.field_c = ri.field_b.c();
              stackIn_170_0 = fl.field_c.field_y;
            }
            var7_array = stackIn_170_0;
            var8 = -1 + var7_array.length;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var8 < 0))) {
              stackIn_180_0 = var7_array[var8];
              if (var17 == 0) {
                if (stackIn_180_0 == 16777215) {
                  var7_array[var8] = 9639960;
                }
                var8--;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              fg.field_e = new db[ef.field_d.length];
              stackIn_180_0 = 0;
            }
            var7_int = stackIn_180_0;
            do {
              if (!(var7_int < fg.field_e.length)) {
                v.field_B.b(1);
                ia.field_H = df.a("", "letterBkgnd", dl.field_d, (byte) -47);
                lg.field_c = df.a("", "letterBkgndGrey", dl.field_d, (byte) -56);
                jj.field_f = td.a("", "highlight", dl.field_d, 22306);
                th.field_l = td.a("", "multipliers", dl.field_d, 22306);
                ob.field_d = df.a("", "ingameleft", dl.field_d, (byte) -108);
                kf.field_A = td.a("", "ingameright", dl.field_d, 22306);
                wc.field_c = td.a("", "deleasy", dl.field_d, 22306);
                ij.field_n[0] = df.a("", "mmleft", dl.field_d, (byte) -53);
                ij.field_n[2] = df.a("", "pauseleft", dl.field_d, (byte) -97);
                ij.field_n[14] = ij.field_n[2];
                ij.field_n[1] = df.a("", "hsleft", dl.field_d, (byte) -117);
                dupTemp$2 = df.a("", "instleft", dl.field_d, (byte) -104);
                ij.field_n[3] = dupTemp$2;
                ij.field_n[12] = dupTemp$2;
                ij.field_n[5] = df.a("", "achleft", dl.field_d, (byte) -91);
                ij.field_n[7] = df.a("", "achgameleft", dl.field_d, (byte) -93);
                ij.field_n[6] = ij.field_n[0];
                dupTemp$3 = df.a("", "instright", dl.field_d, (byte) -40);
                na.field_a[3] = dupTemp$3;
                na.field_a[12] = dupTemp$3;
                break;
              }
              fg.field_e[var7_int] = new db(32, 32);
              fg.field_e[var7_int].b();
              ef.field_d[var7_int].b(0, 0, 32, 32);
              fg.field_e[var7_int].f();
              var7_int++;
            } while (var17 == 0);
            var7_array2 = td.a("", "mmoutlined", dl.field_d, 22306);
            gg.field_a = new db[var7_array2.length];
            ej.field_b = new db[var7_array2.length];
            var8Lifetime1 = 0;
            while (true) {
              stackIn_189_0 = ~var8Lifetime1;
              stackIn_189_1 = ~var7_array2.length;
              if (stackIn_189_0 > stackIn_189_1) {
                gg.field_a[var8Lifetime1] = var7_array2[var8Lifetime1].c();
                ej.field_b[var8Lifetime1] = var7_array2[var8Lifetime1].c();
                var9 = var7_array2[var8Lifetime1].field_y;
                var10 = gg.field_a[var8Lifetime1].field_y;
                var11 = ej.field_b[var8Lifetime1].field_y;
                stackIn_203_0 = -1 + var9.length;
                if (var17 == 0) {
                  var12 = stackIn_203_0;
                  while (var12 >= 0) {
                    stackIn_189_0 = ~var9[var12];
                    stackIn_189_1 = -16777216;
                    if (stackIn_189_0 == stackIn_189_1) {
                      var10[var12] = 0;
                    } else {
                      var11[var12] = 0;
                    }
                    var12--;
                  }
                  gg.field_a[var8Lifetime1].f();
                  var8Lifetime1++;
                  continue;
                }
              } else {
                var7_array2 = td.a("", "hsmodeconcise", dl.field_d, 22306);
                hi.field_b = new db[var7_array2.length];
                dc.field_z = new db[var7_array2.length];
                stackIn_203_0 = 0;
              }
              var8Lifetime1 = stackIn_203_0;
              while (true) {
                stackIn_205_0 = ~var7_array2.length;
                stackIn_205_1 = ~var8Lifetime1;
                if (stackIn_205_0 < stackIn_205_1) {
                  hi.field_b[var8Lifetime1] = var7_array2[var8Lifetime1].c();
                  dc.field_z[var8Lifetime1] = var7_array2[var8Lifetime1].c();
                  var9 = var7_array2[var8Lifetime1].field_y;
                  var10Lifetime1 = hi.field_b[var8Lifetime1].field_y;
                  var11Lifetime1 = dc.field_z[var8Lifetime1].field_y;
                  stackIn_219_0 = var9.length - 1;
                  if (var17 == 0) {
                    var12 = stackIn_219_0;
                    while (var12 >= 0) {
                      stackIn_205_0 = ~var9[var12];
                      stackIn_205_1 = -16777216;
                      if (stackIn_205_0 == stackIn_205_1) {
                        var10Lifetime1[var12] = 0;
                      } else {
                        var11Lifetime1[var12] = 0;
                      }
                      var12--;
                    }
                    hi.field_b[var8Lifetime1].f();
                    var8Lifetime1++;
                    continue;
                  }
                } else {
                  jf.field_N = df.a("", "slider", dl.field_d, (byte) -121);
                  ia.field_G = df.a("", "cursors", dl.field_d, (byte) -43);
                  dl.b(5);
                  stackIn_219_0 = 0;
                }
                return stackIn_219_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var3_ref2), "Lexicominos.BB(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 <= 57) {
            Lexicominos.o(111);
          }
          uh.field_D = param0;
          ij.field_p = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var3), "Lexicominos.AB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, db param1, db param2, int param3) {
        RuntimeException runtimeException = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = field_L ? 1 : 0;
        try {
          var5 = lf.field_b;
          var6 = lf.field_f;
          var7 = lf.field_a;
          param2.b();
          pa.field_a.b(0, 0);
          if (param3 >= 0) {
            vg.field_d[param3].d(48);
          }
          if (param3 < 0 ||
            var8 != 0) {
            el.field_c.d(param0 ^ 22018);
          }
          param1.b();
          if (param0 != 22110) {
            field_G = -106;
          }
          va.field_m.b(0, 0);
          if (0 > param3) {
            el.field_c.b((byte) 62);
          }
          if (0 <= param3 ||
            var8 != 0) {
            vg.field_d[param3].c(param0 - 22109);
          }
          lf.a(var5, var6, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_21_0 = runtimeException;
          stackIn_21_1 = new StringBuilder().append("Lexicominos.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, int[] param1, int param2, int param3, int[] param4, int param5, int[] param6, byte param7, int[] param8) {
        int stackIn_102_0 = 0;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        String stackIn_110_2 = null;
        StringBuilder stackIn_113_1 = null;
        String stackIn_114_2 = null;
        StringBuilder stackIn_117_1 = null;
        String stackIn_118_2 = null;
        StringBuilder stackIn_121_1 = null;
        String stackIn_122_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var10_intLifetime1;
        int var10_intLifetime2;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var11Lifetime1Lifetime1;
        int var11Lifetime1Lifetime2;
        int var12Lifetime1Lifetime1;
        int var12Lifetime1Lifetime2;
        int var13Lifetime1Lifetime1;
        int var13Lifetime1Lifetime2;
        int var14Lifetime1Lifetime1;
        int var14Lifetime1Lifetime2;
        var17 = field_L ? 1 : 0;
        try {
          if (this.field_J == 2 &&
            tj.field_i < 20) {
            this.field_J = 1;
          }
          if (this.field_J == 1) {
            if (tj.field_i < 12) {
              this.field_J = 0;
            }
            if (tj.field_i > 28) {
              this.field_J = 2;
            }
          }
          if (0 == this.field_J &&
            16 < tj.field_i) {
            this.field_J = 1;
          }
          if (0 == this.field_J) {
            param5 = 307199;
            while (0 <= param5) {
              var10_int = param6[param5];
              if (var10_int != -1) {
                param3 = 311 * ((2044 & var10_int) >> 2) + (var10_int >> 13 & 511);
                if (var10_int < 0) {
                  param4[param5] = param1[param3];
                  if (var17 != 0) {
                    param4[param5] = param8[param3];
                  }
                } else {
                  param4[param5] = param8[param3];
                }
              }
              param5--;
              if (var17 == 0) {
                continue;
              }
              break;
            }
            return;
          }
          if (this.field_J == 1) {
            param5 = 307199;
            while (0 <= param5) {
              var10_intLifetime1 = param6[param5];
              if (var10_intLifetime1 != -1) {
                param2 = var10_intLifetime1 >> 11 & 3;
                param3 = 311 * ((var10_intLifetime1 & 2044) >> 2) + ((var10_intLifetime1 & 4193849) >> 13);
                if (0 <= var10_intLifetime1) {
                  if (param2 != 0) {
                    var11 = param8[param3];
                    var12 = param8[1 + param3];
                    var13 = param2 * (16711935 & var12) + (4 - param2) * (var11 & 16711935) >> 2;
                    var14 = (var11 & 65280) * (4 - param2) + param2 * (var12 & 65280) >> 2;
                    param4[param5] = tb.a(vg.a(var14, 65280), vg.a(16711935, var13));
                  }
                  if (param2 == 0 ||
                    var17 != 0) {
                    param4[param5] = param8[param3];
                    if (var17 != 0) {
                      if (param2 != 0) {
                        var11 = param1[param3];
                        var12 = param1[1 + param3];
                        var13 = (4 - param2) * (var11 & 16711935) + (var12 & 16711935) * param2 >> 2;
                        var14 = (65280 & var12) * param2 + (4 - param2) * (var11 & 65280) >> 2;
                        param4[param5] = tb.a(vg.a(16711935, var13), vg.a(65280, var14));
                        param4[param5] = param1[param3];
                      } else {
                        param4[param5] = param1[param3];
                      }
                    }
                  }} else {
                  if (param2 != 0) {
                    var11 = param1[param3];
                    var12 = param1[1 + param3];
                    var13 = (4 - param2) * (var11 & 16711935) + (var12 & 16711935) * param2 >> 2;
                    var14 = (65280 & var12) * param2 + (4 - param2) * (var11 & 65280) >> 2;
                    param4[param5] = tb.a(vg.a(16711935, var13), vg.a(65280, var14));
                    if (var17 != 0) {
                      param4[param5] = param1[param3];
                    }
                  } else {
                    param4[param5] = param1[param3];
                  }
                }
              }
              param5--;
              if (var17 == 0) {
                continue;
              }
              break;
            }
            return;
          }
          param5 = 307199;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (param5 < 0))) {
            var10_intLifetime2 = param6[param5];
            stackIn_102_0 = ~var10_intLifetime2;
            if (var17 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_102_0 != 0) {
                param0 = 3 & var10_intLifetime2;
                param2 = var10_intLifetime2 >> 11 & 3;
                param3 = ((var10_intLifetime2 & 4186687) >> 13) + ((2044 & var10_intLifetime2) >> 2) * 311;
                if (var10_intLifetime2 < 0) {
                  if (param2 != 0 &&
                    param0 != 0) {
                    var11Lifetime1 = param1[param3];
                    var12Lifetime1 = param1[param3 + 1];
                    var13Lifetime1 = param1[param3 + 311];
                    var14Lifetime1 = param1[312 + param3];
                    var15 = param0 * ((16711935 & var14Lifetime1) * param2 + (-param2 + 4) * (var13Lifetime1 & 16711935)) + ((16711935 & var11Lifetime1) * (4 - param2) + param2 * (var12Lifetime1 & 16711935)) * (4 - param0) >> 4;
                    var16 = (4 - param0) * ((var11Lifetime1 & 65280) * (-param2 + 4) + param2 * (var12Lifetime1 & 65280)) + param0 * (param2 * (var14Lifetime1 & 65280) + (4 - param2) * (var13Lifetime1 & 65280)) >> 4;
                    param4[param5] = tb.a(vg.a(65280, var16), vg.a(16711935, var15));
                  } else {
                    if (param2 == 0) {
                      if (param0 == 0) {
                        param4[param5] = param1[param3];
                      } else {
                        var11Lifetime1 = param1[param3];
                        var12Lifetime1 = param1[param3 + 311];
                        var13Lifetime1 = (16711935 & var11Lifetime1) * (-param0 + 4) + param0 * (var12Lifetime1 & 16711935) >> 2;
                        var14Lifetime1 = param0 * (var12Lifetime1 & 65280) + (65280 & var11Lifetime1) * (-param0 + 4) >> 2;
                        param4[param5] = tb.a(vg.a(var14Lifetime1, 65280), vg.a(var13Lifetime1, 16711935));
                      }
                    } else {
                      var11Lifetime1 = param1[param3];
                      var12Lifetime1 = param1[param3 + 1];
                      var13Lifetime1 = (16711935 & var12Lifetime1) * param2 + (4 - param2) * (16711935 & var11Lifetime1) >> 2;
                      var14Lifetime1 = (65280 & var12Lifetime1) * param2 + (65280 & var11Lifetime1) * (4 - param2) >> 2;
                      param4[param5] = tb.a(vg.a(var13Lifetime1, 16711935), vg.a(var14Lifetime1, 65280));
                    }
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if (param2 == 0 ||
                    param0 == 0) {
                    if (param2 == 0) {
                      if (param0 != 0) {
                        var11Lifetime1Lifetime1 = param8[param3];
                        var12Lifetime1Lifetime1 = param8[311 + param3];
                        var13Lifetime1Lifetime1 = (16711935 & var11Lifetime1Lifetime1) * (4 - param0) + (var12Lifetime1Lifetime1 & 16711935) * param0 >> 2;
                        var14Lifetime1Lifetime1 = (65280 & var11Lifetime1Lifetime1) * (-param0 + 4) + param0 * (65280 & var12Lifetime1Lifetime1) >> 2;
                        param4[param5] = tb.a(vg.a(65280, var14Lifetime1Lifetime1), vg.a(16711935, var13Lifetime1Lifetime1));
                      } else {
                        param4[param5] = param8[param3];
                      }
                    } else {
                      var11Lifetime1Lifetime1 = param8[param3];
                      var12Lifetime1Lifetime1 = param8[1 + param3];
                      var13Lifetime1Lifetime1 = param2 * (var12Lifetime1Lifetime1 & 16711935) + (16711935 & var11Lifetime1Lifetime1) * (-param2 + 4) >> 2;
                      var14Lifetime1Lifetime1 = (-param2 + 4) * (var11Lifetime1Lifetime1 & 65280) + param2 * (var12Lifetime1Lifetime1 & 65280) >> 2;
                      param4[param5] = tb.a(vg.a(var14Lifetime1Lifetime1, 65280), vg.a(16711935, var13Lifetime1Lifetime1));
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    var11Lifetime1Lifetime2 = param8[param3];
                    var12Lifetime1Lifetime2 = param8[param3 + 1];
                    var13Lifetime1Lifetime2 = param8[311 + param3];
                    var14Lifetime1Lifetime2 = param8[311 + param3 + 1];
                    var15Lifetime1 = (4 - param0) * (param2 * (16711935 & var12Lifetime1Lifetime2) + (4 - param2) * (var11Lifetime1Lifetime2 & 16711935)) + param0 * ((16711935 & var13Lifetime1Lifetime2) * (4 - param2) + (16711935 & var14Lifetime1Lifetime2) * param2) >> 4;
                    var16Lifetime1 = ((var13Lifetime1Lifetime2 & 65280) * (4 - param2) + (65280 & var14Lifetime1Lifetime2) * param2) * param0 + ((4 - param2) * (65280 & var11Lifetime1Lifetime2) + param2 * (var12Lifetime1Lifetime2 & 65280)) * (-param0 + 4) >> 4;
                    param4[param5] = tb.a(vg.a(var16Lifetime1, 65280), vg.a(var15Lifetime1, 16711935));
                  }
                }
              }
              param5--;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_102_0 = param7;
          }
          if (stackIn_102_0 <= 109) {
            field_E = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_109_0 = var10;
          stackIn_109_1 = new StringBuilder().append("Lexicominos.WA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_110_2 = "null";
          } else {
            stackIn_110_2 = "{...}";
          }
          stackIn_113_1 = ((StringBuilder) (Object) stackIn_109_1).append(stackIn_110_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_114_2 = "null";
          } else {
            stackIn_114_2 = "{...}";
          }
          stackIn_117_1 = ((StringBuilder) (Object) stackIn_113_1).append(stackIn_114_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_118_2 = "null";
          } else {
            stackIn_118_2 = "{...}";
          }
          stackIn_121_1 = ((StringBuilder) (Object) stackIn_117_1).append(stackIn_118_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_122_2 = "null";
          } else {
            stackIn_122_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_109_0), ((StringBuilder) (Object) stackIn_121_1).append(stackIn_122_2).append(')').toString());
        }
    }

    final void b(byte param0) {
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = field_L ? 1 : 0;
        try {
          Lexicominos.o(2);
          ff.a(param0 ^ -43);
          bl.a((byte) 111);
          eb.b((byte) -100);
          hb.a((byte) 76);
          uh.a((byte) 120);
          bi.a(-1);
          of.a(param0 ^ -80);
          ka.a((byte) -81);
          nk.c((byte) 89);
          de.a(param0 ^ 73);
          qb.e(439);
          wg.c(param0 + 37);
          da.a((byte) 123);
          ee.a(param0 + 35);
          lf.c();
          sh.a(1);
          le.a();
          wd.a((byte) 11);
          qd.b(false);
          rf.b(0);
          qc.a(225);
          ga.a(param0 - 79);
          t.a(12307);
          jh.a(false);
          ah.b((byte) -95);
          il.a(0);
          df.a(true);
          af.b(param0 ^ 25);
          hi.a(5);
          ig.a(-71);
          tb.a(255);
          dd.a(1);
          td.b(0);
          ra.b(20);
          gf.b(-78);
          qk.a(false);
          b.b();
          ja.a((byte) -36);
          oj.b((byte) -26);
          fc.a(-265);
          sg.b(0);
          wb.d(5);
          pg.c(-8413);
          be.b((byte) -116);
          ge.a((byte) -59);
          ed.c(-43);
          ca.a(param0 - 163);
          kd.b(true);
          vg.b(0);
          fd.a((byte) -61);
          hl.c(true);
          na.a(true);
          cb.a(param0 + 29073);
          ek.b();
          kj.c((byte) 37);
          fg.a(param0 - 55);
          wh.a(param0 - 167);
          bk.a((byte) 98);
          ob.b(122);
          e.a(param0 - 78);
          gk.b(11);
          hf.a(param0 - 16006);
          jl.a(-15699);
          fl.a(false);
          jj.a(100);
          eg.i(-102);
          u.j((byte) -50);
          uk.i(78);
          qj.g(true);
          uc.h(param0 + 11252);
          pj.e((byte) 71);
          mh.a((byte) 119);
          ti.e(false);
          r.h(param0 ^ -45);
          sd.b();
          mf.a();
          ak.a();
          oh.a(param0 - 204);
          p.a(-127);
          bd.a(84);
          gd.e((byte) -62);
          th.j((byte) 120);
          ej.a(param0 ^ -77);
          if (param0 != 79) {
            this.field_K = false;
          }
          ad.a((byte) -108);
          nh.a(60);
          gg.a(true);
          qg.a((byte) 105);
          bj.a(true);
          kb.a(false);
          q.a((byte) 70);
          ph.a(87);
          pe.a((byte) -81);
          qf.e((byte) -15);
          ci.b((byte) -127);
          dc.f((byte) -63);
          dl.a(param0 ^ 72);
          fj.f((byte) -12);
          ug.d(64);
          vh.a((byte) 119);
          si.e(false);
          ce.a(-5602);
          ef.a(param0 ^ 79);
          ik.b((byte) -108);
          k.a();
          ne.a(338);
          nj.a((byte) -5);
          pk.a(15569);
          eh.a((byte) 99);
          rg.c(0);
          pa.b(param0 - 77);
          wc.a((byte) -50);
          dj.a(-45);
          ui.e(-1);
          he.a(-1);
          jc.a(-63);
          el.a(true);
          nl.b((byte) -125);
          ic.a();
          ok.a((byte) 28);
          pd.b(118);
          lj.a(0);
          fb.a(2);
          ib.a(false);
          og.a((byte) 124);
          ve.a(true);
          w.c(false);
          kf.e(-85);
          mg.d(false);
          ql.g((byte) 42);
          al.d((byte) 102);
          nb.d(false);
          ta.f(0);
          sk.a(82);
          oe.a(param0 + 32034);
          me.d(80);
          lb.a(-128);
          ll.a((byte) 114);
          bf.a((byte) -118);
          fa.a(param0 + 829);
          qa.a(param0 + 48);
          vl.a(96);
          ni.a((byte) 65);
          lg.c(21745);
          ck.a((byte) -18);
          rk.a(true);
          aa.b((byte) -126);
          jd.a((byte) -118);
          we.a((byte) -128);
          vf.a((byte) -53);
          ac.a(param0 - 75);
          kc.a(0);
          wj.c(false);
          rc.a(870040769);
          jf.h(-127);
          cl.o(-60);
          rl.g((byte) 93);
          re.i((byte) -27);
          md.e(344066273);
          bb.a((byte) -26);
          bc.e(false);
          ld.j(6977);
          li.a((byte) 81);
          te.a((byte) -122);
          tj.d(0);
          pl.a(0);
          kg.i(300);
          ae.j(-126);
          gi.a();
          hd.a(-115);
          kk.d(param0 - 159);
          gl.a(-116);
          hh.h(225);
          l.h(4);
          ji.b((byte) -70);
          bg.a((byte) 70);
          rh.c(-119);
          gj.d(-8601);
          ch.d(-123);
          sb.b(16478);
          vk.a(param0 ^ -30299);
          ec.a(true);
          sj.a((byte) 5);
          nc.a((byte) 88);
          d.a(false);
          cg.a((byte) -119);
          v.b(-13714);
          uj.a(true);
          id.c((byte) 96);
          di.a(false);
          ia.h(0);
          hc.g(-1);
          f.a((byte) 69);
          sa.a(0);
          vi.a(112);
          vb.a(109);
          ki.a(-119);
          mb.b(-26);
          la.a((byte) 122);
          c.a(117);
          vc.g(-16531);
          tl.a(3);
          m.a(1000);
          fk.b(false);
          pf.c(false);
          a.b(true);
          oc.a(-123);
          mc.a(29407);
          wa.a((byte) 102);
          pb.a((byte) -48);
          tg.a(0);
          n.b(23887);
          rj.b((byte) 88);
          ij.a((byte) 66);
          mk.a((byte) -101);
          ol.c(false);
          va.d((byte) -113);
          pc.d((byte) -82);
          jg.e(param0 - 25127);
          uf.c(false);
          g.e(-17779);
          rb.a((byte) 50);
          sc.a(-70);
          ri.c((byte) 117);
          tf.a(-3082);
          this.field_B = null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "Lexicominos.I(" + param0 + ')');
        }
        if (qb.field_k) {
          field_L = (var3 == 0);
        }
    }

    private final void g(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          nh.a(0, 1000000, 6, true);
          if (!ki.a((byte) -118)) {
            vc.field_D = ce.a(4, 109);
            hh.field_N = ud.a(1, -108, 10, 3, 9);
            al.a(16, ef.field_c, 100.0f);
          }
          if (param0 != -83) {
            this.b(true);
          }
          fi.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "Lexicominos.PA(" + param0 + ')');
        }
    }

    final void b(boolean param0) {
        try {
          this.a(12, 13, false, 10, 5000, 0, 11, 2);
          b.a(22050, true, 10);
          ce.field_b = b.a(jh.field_a, (java.awt.Component) ((Object) ug.field_y), 0, 4096);
          ik.field_h = b.a(jh.field_a, (java.awt.Component) ((Object) ug.field_y), 1, 2048);
          wj.field_j = new hk();
          ik.field_h.b(wj.field_j);
          uh.field_n = new uh();
          uh.field_n.field_s = new hl(uh.field_n.field_A);
          uh.field_n.field_A.a(128, true, 9);
          uh.field_n.field_s.a(128, true, 9);
          ce.field_b.b(uh.field_n);
          this.a(false, param0, true, (byte) 18, false);
          ea.field_b = 0;
          g.field_n = 10640990;
          ec.field_c = 3941155;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "Lexicominos.F(" + param0 + ')');
        }
    }

    private final boolean p(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            return true;
          }
          stackIn_10_0 = (ki.a((byte) -120)) || (this.field_K);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "Lexicominos.TA(" + param0 + ')');
        }
    }

    private final void c(boolean param0) {
        RuntimeException runtimeException = null;
        vb var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = field_L ? 1 : 0;
        try {
          if (!ki.a((byte) -119)) {
            do {
              var2 = (vb) (rb.field_b.a((byte) 56));
              if (var2 == null) {
                if (var4 == 0) {
                  break;
                }
              } else {
                eh.a(var2, 4, (byte) -4);
              }
            } while (var4 == 0);
          }
          do {
            if (!td.a(fg.field_f, param0)) {
              kc.a(0, -1);
              break;
            }
            this.m(-6721);
          } while (var4 == 0);
          var2_int = param0 ? 1 : 0;
          if (d.a((byte) -56)) {
            var3 = this.n(6);
            if (var3 == 2) {
              var2_int = 1;
            }
          }
          if (var2_int != 0) {
            wi.a(12, bi.field_a.field_E * 3 >> 1, (byte) -123, bi.field_a, 4, 4, bi.field_a.field_E + 1, 240, 320, jh.field_b, nh.field_c);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) runtimeException), "Lexicominos.NA(" + param0 + ')');
        }
    }

    private final void h(byte param0) {
        boolean discarded$1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != eg.field_C) {
            ce.a(false, eg.field_C);
            eg.field_C = null;
            dl.b(5);
          }
          dl.field_d = oj.a(false, 1);
          ci.field_a = oj.a(false, 2);
          gl.field_a = oj.a(false, 3);
          hh.field_L = oj.a(false, 5);
          ga.field_a = oj.a(false, 6);
          ec.field_b = oj.a(false, 7);
          if (param0 <= 77) {
            discarded$1 = this.p(71);
          }
          hc.field_gb = oj.a(false, 8);
          ci.field_e = oj.a(false, 9);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "Lexicominos.RA(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        boolean discarded$1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 40) {
            discarded$1 = this.p(56);
          }
          ce.field_b.a();
          ik.field_h.a();
          if (ff.field_b != null) {
            af.a(-65);
          }
          ca.c(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "Lexicominos.K(" + param0 + ')');
        }
    }

    public final void init() {
        try {
          this.a(14, "lexicominos", (byte) -107);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "Lexicominos.init()");
        }
    }

    final void d(int param0) {
        Object stackIn_5_0 = null;
        int stackIn_11_0 = 0;
        boolean stackIn_12_1 = false;
        int stackIn_64_0 = 0;
        int stackIn_87_0 = 0;
        boolean stackIn_88_1 = false;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        var4 = field_L ? 1 : 0;
        try {
          if (ff.field_b != null) {
            stackIn_5_0 = ff.field_b;
          } else {
            stackIn_5_0 = ug.field_y;
          }
          var2 = stackIn_5_0;
          if (lh.b(-24921)) {
            stackIn_11_0 = 57;
            if (ff.field_b != null) {
              stackIn_12_1 = true;
            } else {
              stackIn_12_1 = vi.field_j;
            }
            ga.$cfr$intArgs$a$f0d318109cc1(stackIn_11_0, stackIn_12_1, (java.awt.Canvas) (var2));
            return;
          }
          if (!oj.field_g) {
            uj.a(106, (java.awt.Canvas) (var2));
            return;
          }
          if (!this.p(param0 - 18380)) {
            uj.a(-101, (java.awt.Canvas) (var2));
            return;
          }
          if (aa.field_j != -2 &&
            th.field_r != -2) {
            lf.g(0, 0, 640, 20);
            cb.field_n.b(0, 0);
            lf.g(0, 460, 640, 480);
            cb.field_n.b(0, 0);
            lf.g(0, 20, 24, 460);
            cb.field_n.b(0, 0);
            lf.g(616, 20, 640, 460);
            cb.field_n.b(0, 0);
            lf.b();
          }
          boolean decompiledFrameRemainder0 = true;
          if (aa.field_j != -2 &&
            th.field_r != -2) {
            if (~aa.field_j == ~th.field_r) {
              this.a(param0 + 3730, cl.field_S, jf.field_O, aa.field_j);
              this.a(jf.field_O.field_y, cl.field_S.field_y, false);
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              boolean decompiledSharedTail0 = !(cg.field_j > 0);
              if (!decompiledSharedTail0) {
                this.a(param0 ^ 4498, cl.field_S, jf.field_O, aa.field_j);
                this.a(22110, v.field_z, bb.field_C, th.field_r);
                decompiledSharedTail0 = (var4 != 0);
              }
              if (decompiledSharedTail0) {
                this.a(22110, cl.field_S, jf.field_O, th.field_r);
                this.a(22110, v.field_z, bb.field_C, aa.field_j);
              }
              if (ed.field_v == 0) {
                this.a(jf.field_O.field_y, cl.field_S.field_y, false);
                decompiledFrameRemainder0 = (var4 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (ed.field_v != 40) {
                  this.a(jf.field_O.field_y, v.field_z.field_y, false);
                  this.a(ed.field_v, bb.field_C, (byte) 34, cl.field_S);
                  if (var4 != 0) {
                    this.a(bb.field_C.field_y, v.field_z.field_y, false);
                    this.a(22110, v.field_z, jf.field_O, 0);
                    if (ed.field_v > 40) {
                      stackIn_64_0 = 40;
                    } else {
                      stackIn_64_0 = ed.field_v;
                    }
                    var3 = stackIn_64_0;
                    this.a(-102, gk.field_f[var3], v.field_z, c.field_i[var3], qb.field_l[var3]);
                    ib.field_a[var3].a(0, 0);
                  }
                } else {
                  this.a(bb.field_C.field_y, v.field_z.field_y, false);
                  if (var4 != 0) {
                    this.a(22110, v.field_z, jf.field_O, 0);
                    if (ed.field_v > 40) {
                      stackIn_64_0 = 40;
                    } else {
                      stackIn_64_0 = ed.field_v;
                    }
                    var3 = stackIn_64_0;
                    this.a(-102, gk.field_f[var3], v.field_z, c.field_i[var3], qb.field_l[var3]);
                    ib.field_a[var3].a(0, 0);
                  }
                }
              }
            }
          } else {
            this.a(22110, v.field_z, jf.field_O, 0);
            if (ed.field_v > 40) {
              stackIn_64_0 = 40;
            } else {
              stackIn_64_0 = ed.field_v;
            }
            var3 = stackIn_64_0;
            this.a(-102, gk.field_f[var3], v.field_z, c.field_i[var3], qb.field_l[var3]);
            ib.field_a[var3].a(0, 0);
          }
          if (2 <= vb.field_i) {
            bi.field_a.c(Integer.toString(tj.field_i), 630, 25, 16711680, -1);
          }
          if (ra.a(-17977)) {
            lf.d(0, 0, lf.field_f, lf.field_a);
            rg.a(qb.field_o, 10, (byte) -105, 10);
          }
          if (je.field_a != 0) {
            var3Lifetime1 = ed.field_v << 3;
            if (var3Lifetime1 > 0) {
              lf.c(0, 0, lf.field_f, lf.field_a, 0, var3Lifetime1);
            }
          }
          if (pb.c(true) &&
            !ra.a(-17977)) {
            stackIn_87_0 = 0;
            if (null != ff.field_b) {
              stackIn_88_1 = true;
            } else {
              stackIn_88_1 = vi.field_j;
            }
            bh.a(stackIn_87_0, stackIn_88_1);
          }
          if (param0 != 18380) {
            return;
          }
          lj.a(0, (java.awt.Canvas) (var2), 0, (byte) -128);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2_ref), "Lexicominos.D(" + param0 + ')');
        }
    }

    private final void a(int[] param0, int[] param1, boolean param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(0, param1, 0, 0, lf.field_b, 0, qb.field_b, (byte) 121, param0);
          if (param2) {
            field_I = (db) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("Lexicominos.MA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(boolean param0) {
        boolean discarded$0 = false;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        StringBuilder discarded$3 = null;
        boolean stackIn_12_1 = false;
        boolean stackIn_94_1 = false;
        boolean stackIn_265_0 = false;
        PrintStream stackIn_296_0 = null;
        StringBuilder stackIn_296_1 = null;
        char stackIn_296_2 = 0;
        boolean stackIn_297_3 = false;
        fc stackIn_333_0 = null;
        boolean stackIn_334_1 = false;
        int stackIn_336_0 = 0;
        int stackIn_336_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = field_L ? 1 : 0;
        try {
          ce.field_b.e();
          ik.field_h.e();
          if (null != ff.field_b &&
            ff.field_b.field_d) {
            af.a(-53);
            ce.b(4);
          }
          stackIn_12_1 = (null != ff.field_b);
          this.c(stackIn_12_1, -1);
          if (ne.field_e) {
            this.h((byte) 121);
            ne.field_e = false;
          }
          if (lh.b(-24921)) {
            this.e((byte) 49);
            if (lh.b(-24921)) {
              if (ha.a(89) &&
                !oj.field_g) {
                discarded$0 = this.a((byte) -86, false);
              }
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          var2_int = 0;
          if (oj.field_g) {
            if (!this.p(0)) {
              if (vc.field_D != null &&
                vc.field_D.field_h) {
                this.field_K = true;
                sc.field_g = sc.field_g | vc.field_D.field_i;
                ee.field_a = ee.field_a & ~vc.field_D.field_i;
                vc.field_D = null;
                kj.c(!param0);
                qf.a(this, 117);
                decompiledFrameRemainder0 = (aa.field_j == 7);
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = (ee.field_a == 0))) {
                  aa.field_j = 1;
                  th.field_r = 1;
                  decompiledFrameRemainder0 = (var4 != 0);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameRemainder0 = (null == vc.field_D))) {
                vc.field_D = ce.a(4, 76);
                decompiledFrameRemainder0 = (var4 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              if (ra.a(-17977)) {
                if (je.field_a != 0) {
                  var2_int = 1;
                  decompiledFrameRemainder0 = (var4 != 0);
                }
                if (decompiledFrameRemainder0) {
                  var3 = lb.b(-30187);
                  switch (var3) {
                    default:
                      break;
                    case 4:
                      qc.a(-3, -3, 42);
                      if (var4 == 0) {
                        break;
                      }
                    case 2:
                      af.a(-61);
                      if (var4 == 0) {
                        break;
                      }
                    case 3:
                      kl.a(bi.field_a.field_E * 3 >> 1, 4, 320, jh.field_b, 12, bi.field_a, 4, (byte) -103, nh.field_c, true, 1 + bi.field_a.field_E, 240);
                      break;
                  }
                  if (!ra.a(-17977)) {
                    vg.field_d[aa.field_j].a(true, true);
                  }
                  decompiledFrameRemainder0 = (var4 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (ae.i(0)) {
                  stackIn_94_1 = (ff.field_b != null);
                  var3 = aa.a((nk) (this), stackIn_94_1, -96);
                  boolean decompiledSharedTail0 = (var3 != 2364824);
                  if (!decompiledSharedTail0) {
                    bg.a(482);
                    decompiledSharedTail0 = (var4 != 0);
                  }
                  if ((decompiledSharedTail0) && (1 == var3 ||
                    var3 == 2)) {
                    if (ff.field_b != null) {
                      af.a(-108);
                    }
                    if (var3 == 2) {
                      ge.a(0, kk.c(-14047));
                    }
                  }
                  if (var4 != 0) {
                    var2_int = 1;
                    hb.a(gd.field_l, true);
                    if (this.a((byte) -86, true)) {
                      kj.c(!param0);
                      this.g((byte) -83);
                      dl.b(5);
                      oj.field_g = true;
                    }
                  }
                } else {
                  var2_int = 1;
                  if (var4 != 0) {
                    hb.a(gd.field_l, true);
                    if (this.a((byte) -86, true)) {
                      kj.c(!param0);
                      this.g((byte) -83);
                      dl.b(5);
                      oj.field_g = true;
                    }
                  }
                }
              }
            }
          } else {
            hb.a(gd.field_l, true);
            if (this.a((byte) -86, true)) {
              kj.c(!param0);
              this.g((byte) -83);
              dl.b(5);
              oj.field_g = true;
            }
          }
          L23: {
            if (var2_int != 0) {
              if (je.field_a != 0) {
                if (je.field_a == 1) {
                  fieldTemp$1 = ed.field_v + 1;
                  ed.field_v = ed.field_v + 1;
                  if (fieldTemp$1 != 32) {
                    break L23;
                  }
                  if (ra.a(-17977)) {
                    pl.a((byte) -85);
                    if (var4 != 0) {
                      mk.a(14891);
                    }
                  } else {
                    mk.a(14891);
                  }
                  je.field_a = 2;
                  if (var4 == 0) {
                    break L23;
                  }
                }
                if (2 != je.field_a) {
                  fieldTemp$2 = ed.field_v - 1;
                  ed.field_v = ed.field_v - 1;
                  if (fieldTemp$2 != 0) {
                    break L23;
                  }
                  je.field_a = 0;
                  if (var4 == 0) {
                    break L23;
                  }
                }
                if (!ki.a((byte) -115)) {
                  if (el.field_c != null &&
                    el.field_c.field_J > 0 &&
                    !el.field_c.field_h) {
                    ki.field_d = gl.a(65526, 9, el.field_c.field_i, 3, el.field_c.field_f, (byte) 56, el.field_c.field_R, new int[]{el.field_c.field_J * 64 + el.field_c.field_m.field_i}, el.field_c.field_a);
                  }
                  hh.field_N = ud.a(1, -118, 10, 3, 9);
                  aa.field_j = hf.field_a;
                  if (7 == aa.field_j &&
                    ee.field_a == 0) {
                    aa.field_j = 1;
                  }
                  al.a(16, ef.field_c, 100.0f);
                  if (var4 != 0) {
                    aa.field_j = hc.field_db;
                  }
                } else {
                  aa.field_j = hc.field_db;
                }
                if (aa.field_j == -3) {
                  aa.field_j = 0;
                  kl.a(3 * bi.field_a.field_E >> 1, 4, 320, jh.field_b, 12, bi.field_a, 4, (byte) 86, nh.field_c, false, 1 + bi.field_a.field_E, 240);
                }
                je.field_a = 3;
                th.field_r = aa.field_j;
                if (var4 == 0) {
                  break L23;
                }
              }
              if (~th.field_r == ~aa.field_j) {
                if (aa.field_j != -1) {
                  vg.field_d[aa.field_j].a((byte) -88);
                  if (el.field_c == null) {
                    break L23;
                  }
                  el.field_c.b(2);
                  if (var4 == 0) {
                    break L23;
                  }
                }
                boolean decompiledNaturalLoopExit0 = false;
                while (!(decompiledNaturalLoopExit0 = (!ji.a((byte) -72)))) {
                  if (da.field_b == 13) {
                    if (vb.field_i >= 2) {
                      ob.a(0, sk.field_a, (byte) 22, ' ');
                    }
                    this.a((byte) -77, false, 2, -1);
                    if (var4 == 0) {
                      continue;
                    }
                  }
                  if (2 > vb.field_i) {
                    continue;
                  }
                  stackIn_336_0 = da.field_b;
                  stackIn_336_1 = 84;
                  if (var4 == 0) {
                    if (stackIn_336_0 == stackIn_336_1) {
                      ob.a(0, sk.field_a, (byte) 22, ' ');
                    } else {
                      if (ci.a(true, pe.field_b)) {
                        discarded$3 = sk.field_a.append(pe.field_b);
                        if (na.a(1048576, (CharSequence) ((Object) sk.field_a)) == -26658124) {
                          stackIn_265_0 = !(mg.field_B);
                          mg.field_B = stackIn_265_0;
                          ob.a(0, sk.field_a, (byte) 22, ' ');
                        } else {
                          if (na.a(1048576, (CharSequence) ((Object) sk.field_a)) == -1039745817) {
                            mg.field_B = false;
                            ob.a(0, sk.field_a, (byte) 22, ' ');
                          }
                        }
                      }
                    }
                    if (null != el.field_c &&
                      da.field_b == 50 &&
                      el.field_c.field_d < 16) {
                      el.field_c.field_t = el.field_c.field_t + 8;
                      var3 = (el.field_c.field_t >> 3) + 1;
                      if (el.field_c.field_d < var3) {
                        el.field_c.field_d = el.field_c.field_d + 1;
                        el.field_c.field_s = 0;
                        if (1 == (el.field_c.field_d & 1)) {
                          ki.a(40000 * el.field_c.field_d + 960000, el.field_c.field_I, -127);
                        }
                      }
                    }
                    if (null != el.field_c &&
                      el.field_c.field_T) {
                      stackIn_296_0 = System.out;
                      stackIn_296_1 = new StringBuilder().append("keycode=").append(da.field_b).append("; keychar=");
                      stackIn_296_2 = pe.field_b;
                      stackIn_297_3 = !(param0);
                      ((PrintStream) (Object) stackIn_296_0).println(((StringBuilder) (Object) stackIn_296_1).append(va.a(stackIn_296_2, stackIn_297_3)).toString());
                      if (65 <= pe.field_b &&
                        pe.field_b <= 90) {
                        var3 = 0;
                        while (var3 < 4) {
                          el.field_c.field_Q.field_h[var3] = pe.field_b;
                          var3++;
                        }
                        el.field_c.field_h = true;
                        continue;
                      }
                      if (pe.field_b >= 49 &&
                        55 >= pe.field_b) {
                        el.field_c.field_Q = new ha(el.field_c, -49 + pe.field_b, el.field_c.field_Q.field_h);
                        el.field_c.field_h = true;
                        continue;
                      }
                    }
                    if (null != el.field_c &&
                      pe.field_b == 102) {
                      el.field_c.field_T = true;
                    }
                    if (el.field_c != null &&
                      pe.field_b == 117) {
                      el.field_c.field_T = false;
                    }
                    if (el.field_c == null) {
                      continue;
                    }
                    if (pe.field_b != 105) {
                      continue;
                    }
                    stackIn_333_0 = el.field_c;
                    stackIn_334_1 = !(el.field_c.field_D);
                    stackIn_333_0.field_D = stackIn_334_1;
                    continue;
                  }
                  break;
                }
                if (decompiledNaturalLoopExit0) {
                  stackIn_336_0 = aa.field_j;
                  stackIn_336_1 = -1;
                }
                if (((stackIn_336_0 ^ stackIn_336_1) == 0)) {
                  el.field_c.e(1);
                }
                break L23;
              }
              ed.field_v = ed.field_v + cg.field_j;
              if (aa.field_j >= 0 &&
                vg.field_d[aa.field_j].field_m != null) {
                vg.field_d[aa.field_j].field_m.b(2);
              }
              if (aa.field_j >= 0 &&
                el.field_c != null) {
                el.field_c.b(2);
              }
              if ((ed.field_v - 20) * cg.field_j >= 20) {
                if (th.field_r == -2) {
                  if (ed.field_v != 40) {
                    break L23;
                  }
                  ge.a(0, kk.c(-14047));
                  if (var4 == 0) {
                    break L23;
                  }
                }
                if (aa.field_j >= 0 &&
                  vg.field_d[aa.field_j].field_m != null) {
                  th.field_o[2].e(0);
                  vg.field_d[aa.field_j].field_m = null;
                }
                if (6 == aa.field_j &&
                  th.field_r == 0) {
                  sc.field_g = 0;
                  ee.field_a = 0;
                  rb.field_b.g(-105);
                }
                aa.field_j = th.field_r;
                if (aa.field_j == -1) {
                }
              }
            }
          }
          this.c(param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "Lexicominos.M(" + param0 + ')');
        }
    }

    private final void a(int param0, int[] param1, db param2, int[] param3, int[] param4) {
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int stackIn_21_0Lifetime1;
        int stackIn_21_1Lifetime1;
        var30 = field_L ? 1 : 0;
        try {
          var6_int = param3[0];
          var7 = param1[0];
          var8 = 126 / ((param0 + 6) / 58);
          var9 = param4[0];
          var10 = 0;
          var11 = 1;
          while (10 > var11) {
            var12 = param3[var11];
            var13 = param1[var11];
            var14 = param4[var11];
            var15 = ce.field_c[-1 + var11];
            var16 = -var6_int + var12 + 1;
            if (var30 != 0) {
              return;
            }
            if (var16 >= 0 ||
              var30 != 0) {
              var17 = var12 + 1;
              var18 = var10 << 20;
              var19 = (var15 << 20) / var16;
              var20 = var7 << 20;
              var21 = (var13 - var7 << 20) / var16;
              var22 = 1 - var7 + var9 << 20;
              var23 = (-var9 - (-var7 - (-var13 + var14)) << 20) / var16;
              var7 = var13;
              var6_int = var12;
              while (true) {
                if (0 < var16) {
                  var24 = var20 >> 20;
                  var25 = var22 >> 20;
                  var26 = 0;
                  var27 = 471859200 / var25;
                  stackIn_21_0 = ~lf.field_h;
                  stackIn_21_1 = ~(var24 + var25);
                  if (stackIn_21_0 > stackIn_21_1) {
                    var25 = var25 - (-lf.field_h + (var24 + var25));
                  }
                  var28 = var17 - var16 + var24 * lf.field_f;
                  if (var24 < lf.field_c) {
                    var29 = lf.field_c - var24;
                    var26 = var26 + var29 * var27;
                    var28 = var28 + lf.field_f * var29;
                    var25 = var25 - var29;
                  }
                  hd.a(param2.field_y, var28, var26, var25, 0, lf.field_f, lf.field_b, var18 >> 20, 311, var27);
                  var18 = var18 + var19;
                  var20 = var20 + var21;
                  var22 = var22 + var23;
                  var16--;
                  continue;
                }
                break;
              }
              stackIn_21_0Lifetime1 = var10;
              stackIn_21_1Lifetime1 = var15;
              var10 = stackIn_21_0Lifetime1 + stackIn_21_1Lifetime1;
              var9 = var14;
            }
            var11++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_27_0 = var6;
          stackIn_27_1 = new StringBuilder().append("Lexicominos.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param3 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
          if (param4 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    private final db a(int param0, db param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        db stackIn_36_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        db var5 = null;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        var9 = field_L ? 1 : 0;
        try {
          var3_int = param1.field_s;
          var4 = param1.field_w;
          var5 = new db(param1.field_p + 16, 16 + param1.field_u);
          var5.field_s = -8 + var3_int;
          var5.field_w = -8 + var4;
          var5.b();
          var6 = 0;
          var7_int = 0;
          while (true) {
            stackIn_3_0 = param1.field_u;
            stackIn_3_1 = var7_int;
            if (stackIn_3_0 > stackIn_3_1) {
              stackIn_14_0 = 0;
              if (var9 == 0) {
                var8 = stackIn_14_0;
                while (param1.field_p > var8) {
                  incrementValue$0 = var6;
                  var6++;
                  stackIn_3_0 = -1;
                  stackIn_3_1 = ~param1.field_y[incrementValue$0];
                  if (stackIn_3_0 != stackIn_3_1) {
                    lf.c(8 + var8, var7_int + 8, 8, 16777215);
                  }
                  var8++;
                }
                var7_int++;
                continue;
              }
            } else {
              var6 = 0;
              stackIn_14_0 = 0;
            }
            var7_int = stackIn_14_0;
            L7: while (true) {
              stackIn_16_0 = param1.field_u;
              stackIn_16_1 = var7_int;
              L8: while (stackIn_16_0 > stackIn_16_1) {
                var8Lifetime1 = 0;
                while (var8Lifetime1 < param1.field_p) {
                  incrementValue$1 = var6;
                  var6++;
                  stackIn_16_0 = ~param1.field_y[incrementValue$1];
                  stackIn_16_1 = -1;
                  if (var9 != 0) {
                    continue L8;
                  }
                  if (stackIn_16_0 != stackIn_16_1) {
                    lf.c(var8Lifetime1 + 8, var7_int + 8, 4, 8421504);
                  }
                  var8Lifetime1++;
                }
                var7_int++;
                if (var9 == 0) {
                  continue L7;
                }
                break;
              }
              break;
            }
            var7 = var5.field_y;
            var8Lifetime2 = -1 + var7.length;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var8Lifetime2 < 0))) {
              stackIn_35_0 = ~var7[var8Lifetime2];
              stackIn_35_1 = -8421505;
              if (var9 == 0) {
                if (stackIn_35_0 == stackIn_35_1) {
                  var7[var8Lifetime2] = 0;
                }
                var8Lifetime2--;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_35_0 = 34;
              stackIn_35_1 = (-42 - param0) / 44;
            }
            var8Lifetime3 = stackIn_35_0 % stackIn_35_1;
            stackIn_36_0 = var5;
            return stackIn_36_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_40_0 = var3;
          stackIn_40_1 = new StringBuilder().append("Lexicominos.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    public static void o(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 2) {
            field_F = (String) null;
          }
          field_I = null;
          field_H = null;
          field_F = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "Lexicominos.LA(" + param0 + ')');
        }
    }

    final void a(byte param0, boolean param1, int param2, int param3) {
        boolean stackIn_17_0 = false;
        int stackIn_42_0 = 0;
        cd stackIn_42_1 = null;
        boolean stackIn_43_2 = false;
        boolean stackIn_46_3;
        int stackIn_46_4;
        boolean stackIn_47_5 = false;
        int[] stackIn_50_0;
        int stackIn_50_1;
        int stackIn_50_2;
        int stackIn_50_3;
        cd stackIn_50_4;
        boolean stackIn_50_5;
        int stackIn_50_6;
        boolean stackIn_51_7 = false;
        boolean stackIn_55_8;
        int stackIn_57_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_16_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var6Lifetime1;
        int var6Lifetime1Lifetime1;
        var8 = field_L ? 1 : 0;
        try {
          var5_int = 22 / ((16 - param0) / 59);
          th.field_r = param2;
          if (param2 >= 0) {
            vg.field_d[param2].field_g = param3;
          }
          if (ja.field_b[th.field_r + 2] > ja.field_b[2 + aa.field_j]) {
            cg.field_j = 1;
            ed.field_v = 0;
            if (var8 != 0) {
              cg.field_j = -1;
              ed.field_v = 40;
            }
          } else {
            cg.field_j = -1;
            ed.field_v = 40;
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder0 = true;
          if (8 <= th.field_r &&
            th.field_r <= 11) {
            var6 = 0;
            while (true) {
              if (var6 < id.field_w.length) {
                stackOut_16_0 = ug.field_s.equals(id.field_w[var6].field_k);
                stackIn_57_0 = stackOut_16_0 ? 1 : 0;
                stackIn_17_0 = stackOut_16_0;
                if (var8 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (!stackIn_17_0 ||
                  var8 != 0) {
                  var6++;
                  continue;
                }
              }
              break;
            }
            if (decompiledFrameCompleted0) {
              vg.field_d[th.field_r].field_m = new fc(this, id.field_w[var6], new Random());
              vg.field_d[th.field_r].field_m.b(-71, th.field_r - 8);
              vg.field_d[th.field_r].field_m.field_M = -92;
              vg.field_d[th.field_r].field_b = 0;
              decompiledFrameRemainder0 = (var8 != 0);
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted0)) {
            if (th.field_r == 1 &&
              !ki.a((byte) -127)) {
              hh.field_N = ud.a(1, -85, 10, 3, 9);
              decompiledFrameRemainder0 = (var8 != 0);
            }
            if ((decompiledFrameRemainder0) &&
              (th.field_r == 6)) {
              var6Lifetime1 = 50;
              var7 = 4 + bi.field_a.field_t + bi.field_a.field_G;
              var6Lifetime1 = var6Lifetime1 + bi.field_a.a(me.field_u, 254) * var7;
              stackIn_42_0 = var6Lifetime1;
              stackIn_42_1 = bi.field_a;
              stackIn_43_2 = (0 != ee.field_a);
              stackIn_46_3 = false;
              stackIn_46_4 = 52;
              stackIn_47_5 = (el.field_c.field_J != 0);
              var6Lifetime1Lifetime1 = stackIn_42_0 + ((cd) (Object) stackIn_42_1).a(ii.a(stackIn_43_2, stackIn_46_3, stackIn_46_4, stackIn_47_5), 254) * var7;
              qc.field_c[6] = var6Lifetime1Lifetime1;
              stackIn_50_0 = uk.field_U;
              stackIn_50_1 = 6;
              stackIn_50_2 = 2 * gg.field_a[0].field_x;
              stackIn_50_3 = var7;
              stackIn_50_4 = bi.field_a;
              stackIn_50_5 = false;
              stackIn_50_6 = -95;
              stackIn_51_7 = (ee.field_a != 0);
              stackIn_55_8 = (0 != el.field_c.field_J);
              stackIn_50_0[stackIn_50_1] = stackIn_50_2 + (stackIn_50_3 + ((cd) (Object) stackIn_50_4).a(ac.a(stackIn_50_5, stackIn_50_6, stackIn_51_7, stackIn_55_8), 254) * var7);
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_57_0 = ~th.field_r;
          }
          if (stackIn_57_0 <= -1) {
            vg.field_d[th.field_r].a(param1, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var5), "Lexicominos.OA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, cg param1, int param2) {
        RuntimeException runtimeException = null;
        th var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = ed.field_q;
          if (param0 != -17800) {
            field_F = (String) null;
          }
          var3.h(param2, 0);
          var3.c(param1.field_h, -1);
          var3.e(96, param1.field_k);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("Lexicominos.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, db param1, byte param2, db param3) {
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        db var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        var29 = field_L ? 1 : 0;
        try {
          if (param2 != 34) {
            field_G = -57;
          }
          var5_int = og.field_f[param0][0];
          var6 = we.field_b[param0][0];
          var7 = bg.field_f[param0][0];
          var8 = 0;
          var9 = 1;
          L1: while (true) {
            stackIn_6_0 = -11;
            stackIn_6_1 = ~var9;
            if (stackIn_6_0 < stackIn_6_1) {
              var10 = og.field_f[param0][var9];
              var11 = we.field_b[param0][var9];
              var12 = bg.field_f[param0][var9];
              var13 = ce.field_c[var9 - 1];
              var14 = 1 + (var10 - var5_int);
              if (var29 != 0) {
                return;
              }
              if (0 < var14) {
                var15 = param3;
                var18 = var6 << 20;
                var16 = var10 + 1;
                var20 = var7 << 20;
                var19 = (-var6 + var11 << 20) / var14;
                var21 = (var12 - var7 << 20) / var14;
                var17 = var8 << 20;
              } else {
                var18 = var11 << 20;
                var17 = -var8 + (311 - var13) << 20;
                var14 = 1 + (var5_int - var10);
                var16 = var5_int + 1;
                var15 = param1;
                var21 = (var7 - var12 << 20) / var14;
                var20 = var12 << 20;
                var19 = (-var11 + var6 << 20) / var14;
              }
              var22 = (var13 << 20) / var14;
              var7 = var12;
              var8 = var8 + var13;
              var6 = var11;
              while (var14 > 0) {
                var23 = var18 >> 20;
                var24 = -var23 + ((var20 >> 20) + 1);
                var25 = 0;
                var26 = 471859200 / var24;
                stackIn_6_0 = ~lf.field_h;
                stackIn_6_1 = ~(var24 + var23);
                if (stackIn_6_0 > stackIn_6_1) {
                  var24 = var24 - (var23 + var24 - lf.field_h);
                }
                var27 = lf.field_f * var23 + (-var14 + var16);
                if (lf.field_c > var23) {
                  var28 = lf.field_c - var23;
                  var27 = var27 + lf.field_f * var28;
                  var24 = var24 - var28;
                  var25 = var25 + var26 * var28;
                }
                hd.a(var15.field_y, var27, var25, var24, 0, lf.field_f, lf.field_b, var17 >> 20, 311, var26);
                var18 = var18 + var19;
                var17 = var17 + var22;
                var20 = var20 + var21;
                var14--;
              }
              var5_int = var10;
              var9++;
              continue L1;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("Lexicominos.QA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    public Lexicominos() {
        this.field_J = 2;
    }

    static {
        field_G = 0;
        field_F = "Connection lost. <%0>";
    }
}
