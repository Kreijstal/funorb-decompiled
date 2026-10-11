/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ola {
    wda[][] field_i;
    private mj field_f;
    private saa field_c;
    private eaa field_q;
    jfa[] field_r;
    static af field_p;
    private int field_d;
    ula field_j;
    int field_n;
    boolean field_h;
    private sna field_a;
    static wma field_g;
    jt field_k;
    sna field_s;
    eaa field_m;
    private int field_o;
    private int field_l;
    static ph field_e;
    private String field_b;

    final void a(boolean param0) {
        int discarded$0 = 0;
        int var3 = 0;
        int var2;
        int var4;
        jfa var5;
        int var2Lifetime1;
        var4 = BachelorFridge.field_y;
        if (1 == lf.field_c &&
          !this.field_h &&
          !this.a((byte) -77)) {
          if (this.a(mk.field_p, gd.field_m, false)) {
            var5 = this.a(mk.field_p, -4456, gd.field_m);
            if (var5 != null) {
              discarded$0 = this.b(-1, gd.field_m);
              var5.a(false);
              var5.g(0);
              this.field_j = new ula(mk.field_p, gd.field_m, var5, var5.field_u, var5.field_l);
              this.field_h = true;
            }
          }
        } else {
          if (0 == fia.field_t &&
            this.field_h &&
            this.field_j != null) {
            var2 = this.field_k.g(50);
            if (this.e(-103) &&
              var2 != -1 &&
              null == this.field_r[var2]) {
              qm.a(3, 7758);
              this.field_r[var2] = this.field_j.field_c;
              ik.a(this.field_j.field_g, this.field_j.field_c, -6622, var2);
              this.field_j.field_c.field_v.a(false, 0, 0, true, -1);
              this.field_j = null;
            } else {
              if (this.a(this.field_j.field_c, gd.field_m, -19906, mk.field_p)) {
                qm.a(2, 7758);
                this.field_m.a(this.field_j.field_c, param0);
                this.field_j = null;
              } else {
                if (this.d(74)) {
                  if (this.field_c.field_s == null &&
                    this.field_c.field_o <= 0) {
                    this.field_c.field_k = this.field_j.field_c;
                    this.field_c.field_s = new gaa(100, 150, 440, 160, this.f(83), this.field_c.field_k);
                  }
                } else {
                  if (null == this.field_c.field_s) {
                    this.field_j.field_d = true;
                  }
                }
              }
            }
            this.field_h = false;
          }
        }
        if (this.field_j != null) {
          this.field_j.a((byte) 125);
          if (this.field_h) {
            this.field_j.field_a = (float)gd.field_m;
            this.field_j.field_i = (float)mk.field_p;
          } else {
            if (!this.field_j.field_d) {
              this.field_m.a(this.field_j.field_c, true);
              this.field_j = null;
            }
          }
        }
        this.a(-11);
        if (null == dc.field_y) {
          return;
        }
        var2Lifetime1 = 0;
        if (!param0) {
          this.field_s = (sna) null;
        }
        while (var2Lifetime1 < this.field_i.length) {
          for (var3 = 0; var3 < this.field_i.length; var3++) {
            if (null != this.field_i[var2Lifetime1][var3].field_f &&
              dc.field_y[this.field_i[var2Lifetime1][var3].field_e].a(this.field_i[var2Lifetime1][var3].field_f.field_p, this.field_i[var2Lifetime1][var3].field_f.field_j, mk.field_p, gd.field_m)) {
              uca.a(7, (byte) 119);
            }
          }
          var2Lifetime1++;
        }
    }

    private final void c(int param0) {
        sna var2 = mka.a(13558251, 13558251, 13558251, (byte) -119, jha.field_g, 13558251, 1118481, 13558251);
        if (param0 <= 40) {
          return;
        }
        var2.field_A = bla.field_p;
        var2.field_db = op.field_I;
        var2.field_eb = wd.field_w;
        this.field_s = new sna("shop", var2, 515, 8, 72, 70, "");
        this.field_a = new sna("arena", var2, 43, 333, 90, 80, "");
    }

    private final boolean e(int param0) {
        int var2;
        if (!iaa.field_a) {
          return false;
        }
        var2 = 30 % ((param0 - 6) / 58);
        if (!(mk.field_p >= this.field_k.field_l.field_kb) ||
          !(this.field_k.field_l.field_kb + this.field_k.field_l.field_sb >= mk.field_p) ||
          !(gd.field_m >= this.field_k.field_l.field_rb) ||
          !(this.field_k.field_l.field_p + this.field_k.field_l.field_rb >= gd.field_m)) {
          if (mk.field_p <= 376) {
            return false;
          }
          if (1 != this.field_k.field_a) {
            return false;
          }
        }
        return true;
    }

    final void a(int param0, int param1) {
        int var4_int = 0;
        int var6 = 0;
        kv[] stackIn_5_0 = null;
        int stackIn_6_1 = 0;
        jfa var4;
        int var5;
        int var7;
        es var8;
        int var5Lifetime1;
        var7 = BachelorFridge.field_y;
        var8 = (es) (this.field_q.b((byte) 90));
        while (var8 != null) {
          var8.a(128, param1);
          var8 = (es) (this.field_q.c(0));
        }
        gba.field_xb.e(10 + param1, 75);
        ln.field_v.e(param1 + 14, 79);
        stackIn_5_0 = pja.field_b;
        if (-1 + this.field_m.g(0) == -1) {
          stackIn_6_1 = 9;
        } else {
          stackIn_6_1 = -1 + this.field_m.g(0);
        }
        ((kv) (Object) stackIn_5_0[stackIn_6_1]).e(28 + param1, 79);
        if (!this.field_a.field_T) {
          if (8 < this.field_o) {
            ve.field_l[0].e(param1 + 35, 358);
          } else {
            if (this.field_o <= 6) {
              if (this.field_o > 4) {
                ve.field_l[2].e(35 + param1, 358);
              } else {
                if (this.field_o <= 2) {
                  if (this.field_o > 0) {
                    ve.field_l[3].e(param1 + 35, 358);
                  } else {
                    ve.field_l[4].e(param1 + 35, 358);
                  }
                } else {
                  ve.field_l[3].e(35 + param1, 358);
                }
              }
            } else {
              ve.field_l[1].e(35 + param1, 358);
            }
          }
          this.field_o = this.field_o - 1;
          if (this.field_o < 0) {
            this.field_o = 0;
          }
        } else {
          if (2 <= this.field_o) {
            if (4 <= this.field_o) {
              if (this.field_o >= 6) {
                if (this.field_o < 8) {
                  ve.field_l[0].e(param1 + 35, 358);
                } else {
                  if (10 <= this.field_o) {
                    ve.field_l[0].e(param1 + 35, 358);
                  } else {
                    ve.field_l[1].e(param1 + 35, 358);
                  }
                }
              } else {
                ve.field_l[1].e(35 + param1, 358);
              }
            } else {
              ve.field_l[2].e(param1 + 35, 358);
            }
          } else {
            ve.field_l[3].e(param1 + 35, 358);
          }
          this.field_o = this.field_o + 1;
          if (this.field_o > 10) {
            this.field_o = 10;
          }
        }
        if (vr.field_b % 200 != 1 &&
          vr.field_b % 200 != 4 &&
          this.field_a.field_T) {
          ot.field_e.e(param1 + 48, 330);
        } else {
          rea.field_k.e(48 + param1, 330);
        }
        for (var4_int = 0; var4_int < 6; var4_int++) {
          for (var5 = 0; var5 < 10; var5++) {
            if (this.field_i[var4_int][var5].field_f != null) {
              this.field_i[var4_int][var5].field_f.a(false, param1);
            }
          }
        }
        var4 = (jfa) (this.field_m.b((byte) 90));
        while (var4 != null) {
          nk.a(qa.field_k, param1 + (var4.field_n + 22), 9 + var4.field_k, 28, 18);
          var4.a((byte) 83, param1);
          var4 = (jfa) (this.field_m.c(0));
        }
        for (var5Lifetime1 = 0; var5Lifetime1 < 6; var5Lifetime1++) {
          for (var6 = 0; var6 < 10; var6++) {
            if (this.field_i[var5Lifetime1][var6].field_f != null &&
              this.field_i[var5Lifetime1][var6].field_f.field_n > 0) {
              oo.field_q[-this.field_i[var5Lifetime1][var6].field_f.field_n + 24].e(param1 + (-6 + this.field_i[var5Lifetime1][var6].field_f.field_p), -32 + this.field_i[var5Lifetime1][var6].field_f.field_j);
            }
          }
        }
        this.field_k.a(param1, 8687);
        if (this.field_j != null) {
          if (this.e(-122)) {
            kaa.field_l[0].e(param1 + 0, 6);
            if (this.field_l < 2) {
              kaa.field_l[1].e(0 + param1, 72);
            } else {
              if (this.field_l >= 4) {
                if (this.field_l < 6) {
                  kaa.field_l[2].e(0 + param1, 72);
                } else {
                  if (8 <= this.field_l) {
                    kaa.field_l[1].e(0 + param1, 72);
                  } else {
                    kaa.field_l[3].e(param1 + 0, 72);
                  }
                }
              } else {
                kaa.field_l[3].e(param1 + 0, 72);
              }
            }
            this.field_l = this.field_l + 1;
          } else {
            this.field_l = 0;
          }
          this.field_j.b(-17613);
        }
        if (null != this.field_f) {
          dg.g(0, 0, 640, 480);
          this.field_f.a((byte) -115);
        }
        if (param0 > -123) {
          this.c(97);
        }
    }

    final static void c(byte param0) {
        int var8_int = 0;
        int var19 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        nc var4 = null;
        mha var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        pf var28 = null;
        long[][] var35 = null;
        int[][] var36 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = BachelorFridge.field_y;
        try {
          if (param0 > -45) {
            field_p = (af) null;
          }
          var28 = ig.field_m;
          var2 = var28.b(16711935);
          if (var2 == 0) {
            var3 = var28.e((byte) 70);
            var4_ref = (mha) (wba.field_g.b((byte) 90));
            while (var4_ref != null) {
              if (var4_ref.field_f != var3) {
                var4_ref = (mha) (wba.field_g.c(0));
                continue;
              }
              break;
            }
            if (var4_ref == null) {
              vc.a((byte) -73);
              return;
            }
            var5 = var28.b(16711935);
            if (0 == var5) {
              var4_ref.a(false);
              return;
            }
            var6 = var4_ref.field_h;
            mi.field_l[0].field_e = cha.field_l;
            mi.field_l[0].field_b = null;
            var7 = var4_ref.field_i;
            mi.field_l[0].field_c = false;
            for (var8_int = 1; var8_int < var5; var8_int++) {
              mi.field_l[var8_int].field_e = var28.g(-82);
              mi.field_l[var8_int].field_c = false;
              if (var28.b(16711935) == 1) {
                mi.field_l[var8_int].field_b = var28.g(-60);
              } else {
                mi.field_l[var8_int].field_b = null;
              }
            }
            var8 = new String[3][var6];
            var9 = new String[3][var6];
            var35 = new long[3][var6];
            var36 = new int[3][var6 * var7];
            var12 = 0;
            var13 = 0;
            var14 = 0;
            var15 = 0;
            var16 = 0;
            var17 = 0;
            var18 = var28.b(16711935);
            if (var18 <= 0) {
              var4_ref.a(false);
              return;
            }
            for (var19 = 0; var19 < var18; var19++) {
              var20 = var28.b(16711935);
              var21 = mi.field_l[var20].field_e;
              var22 = var28.c(-117);
              var24 = var28.field_g;
              if (var6 > var19) {
                var8[0][var12] = var21;
                var9[0][var12] = mi.field_l[var20].field_b;
                var35[0][var12] = var22;
                for (var25 = 0; var25 < var7; var25++) {
                  incrementValue$0 = var15;
                  var15++;
                  var36[0][incrementValue$0] = var28.f(81);
                }
                var12++;
              }
              if (var21 != null &&
                wb.a((byte) 52, var21)) {
                var8[1][var13] = cha.field_l;
                var9[1][var13] = null;
                var35[1][var13] = var22;
                var28.field_g = var24;
                var13++;
                for (var25Lifetime1 = 0; var7 > var25Lifetime1; var25Lifetime1++) {
                  incrementValue$1 = var16;
                  var16++;
                  var36[1][incrementValue$1] = var28.f(-101);
                }
              }
              if (var6 > var14 &&
                !mi.field_l[var20].field_c) {
                mi.field_l[var20].field_c = true;
                var8[2][var14] = var21;
                var9[2][var14] = mi.field_l[var20].field_b;
                var35[2][var14] = var22;
                var14++;
                var28.field_g = var24;
                for (var25Lifetime2 = 0; var25Lifetime2 < var7; var25Lifetime2++) {
                  incrementValue$2 = var17;
                  var17++;
                  var36[2][incrementValue$2] = var28.f(-127);
                }
              }
            }
            var4_ref.a(false);
            return;
          }
          if (var2 == 1) {
            var3Lifetime1 = var28.e((byte) 46);
            var28.c(-109);
            var4 = (nc) (tb.field_c.b((byte) 90));
            while (var4 != null) {
              if (var4.field_j != var3Lifetime1) {
                var4 = (nc) (tb.field_c.c(0));
                continue;
              }
              break;
            }
            if (var4 != null) {
              var4.a(false);
              return;
            }
            vc.a((byte) -99);
            return;
          }
          cv.a(1, "HS1: " + nia.d((byte) -108), (Throwable) null);
          vc.a((byte) -76);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "ola.H(" + param0 + ')');
        }
    }

    private final void b(int param0) {
        if (param0 >= -45) {
          this.field_l = 124;
        }
        this.field_b = String.valueOf(50);
        this.field_b = this.field_b + ":: ";
        if (this.field_d < jha.field_g.a(this.field_b)) {
          this.field_d = this.field_d + 1;
        } else {
          this.field_d = -jha.field_g.a(this.field_b);
        }
    }

    final static void b(byte param0) {
        ep.a(17, 8192);
        if (param0 > 0) {
          field_g = (wma) null;
        }
    }

    final void e(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5;
        jfa var6;
        var5 = BachelorFridge.field_y;
        if (null != this.field_f) {
          if (this.field_f.b(0) == 0) {
            this.field_f = null;
          }
          return;
        }
        var6 = (jfa) (this.field_m.b((byte) 90));
        while (var6 != null) {
          var6.d(108);
          var6 = (jfa) (this.field_m.c(0));
        }
        for (var3 = 0; 6 > var3; var3++) {
          for (var4 = 0; var4 < 10; var4++) {
            if (null != this.field_i[var3][var4].field_f) {
              if (this.field_i[var3][var4].field_f.field_g) {
                this.field_i[var3][var4].field_f.field_a = false;
              } else {
                this.field_i[var3][var4].field_f.b(24981);
                if (this.field_i[var3][var4].field_f.field_b <= 12 &&
                  this.field_i[var3][var4].field_f.field_a && (this.field_m.g(0) < 7 &&
                  this.field_j != null ||
                  !(this.field_m.g(0) >= 8) &&
                  null == this.field_j)) {
                  if (!this.field_i[var3][var4].field_f.field_f) {
                    this.field_i[var3][var4].field_f.field_n = 24;
                  }
                  this.field_i[var3][var4].field_f.field_f = true;
                }
                if (0 >= this.field_i[var3][var4].field_f.field_b &&
                  this.field_i[var3][var4].field_f.field_n <= 12 &&
                  this.field_i[var3][var4].field_f.field_a && (this.field_m.g(0) < 7 &&
                  null != this.field_j ||
                  !(this.field_m.g(0) >= 8) &&
                  this.field_j == null)) {
                  qm.a(0, 7758);
                  this.field_m.a(new jfa(new rk(gfa.field_a[this.field_i[var3][var4].field_f.field_e]), var3, var4, this.field_i), true);
                  wf.a(3909, var3, this.field_i[var3][var4].field_f.field_e, (jfa) (this.field_m.a(6)), var4);
                  uca.a(9, (byte) 99);
                  this.field_q.a(new es(this.field_i[var3][var4].field_f.field_p, this.field_i[var3][var4].field_f.field_j, kla.a(6, m.field_a, -2147483648)), true);
                  this.field_i[var3][var4].field_f.field_a = false;
                }
              }
            }
          }
        }
        this.b(-116);
        if (param0 <= 29) {
          this.field_k = (jt) null;
        }
        return;
    }

    private final boolean d(int param0) {
        if (!mka.field_j) {
          return false;
        }
        int var2 = -24 / ((param0 + 54) / 43);
        if (d.field_H.field_kb <= mk.field_p &&
          d.field_H.field_sb + d.field_H.field_kb >= mk.field_p &&
          d.field_H.field_rb <= gd.field_m &&
          gd.field_m <= d.field_H.field_p + d.field_H.field_rb) {
          return true;
        }
        return false;
    }

    private final void a(int param0) {
        int var3;
        var3 = BachelorFridge.field_y;
        this.field_s.a(param0 ^ -19849, true);
        if (param0 != -11) {
          this.field_h = true;
        }
        this.field_a.a(19842, true);
        if (this.field_a.field_T) {
          if (af.field_a) {
            uca.a(6, (byte) -35);
          }
          au.field_c = 5;
        }
        if (1 == this.field_a.field_R &&
          gla.field_k) {
          boolean decompiledFrameRemainder0 = true;
          if (!this.field_m.e(12917) && (!bp.e(-29919) ||
            af.field_a)) {
            qa.d(123);
            decompiledFrameRemainder0 = false;
          }
          else {
            if (bp.e(param0 - 29908) &&
              !af.field_a) {
              this.field_f = new mj(100, 150, 440, 160, iv.field_i);
            } else {
              this.field_f = new mj(100, 150, 440, 160, vu.field_o);
            }
          }
          uca.a(37, (byte) -115);
        }
        if (this.field_s.field_T) {
          if (af.field_a) {
            uca.a(1, (byte) 127);
          }
          au.field_c = 2;
        }
        if (this.field_s.field_R == 1 &&
          this.field_k.field_a == 2 && pka.field_f) {
          uca.a(30, (byte) -35);
          lla.a(true, (byte) 99, 0);
          iu.d(37);
          rs.a(true);
          sia.field_h = false;
          lg.a(true, 12, true);
        }
    }

    private final boolean a(int param0, int param1, boolean param2) {
        boolean stackIn_8_0 = false;
        if (param2) {
          this.field_s = (sna) null;
        }
        stackIn_8_0 = (param0 > 20) && (param0 < 355) && (param1 > 0) && (param1 < 480);
        return stackIn_8_0;
    }

    private final int b(int param0, int param1) {
        if (param0 == ~this.field_n) {
          if (0 < param1 &&
            param1 < 146) {
            return 0;
          }
          if (param1 > 152 &&
            param1 < 242) {
            return 1;
          }
          if (param1 > 234 &&
            param1 < 334) {
            return 2;
          }
          if (param1 > 330 &&
            430 > param1) {
            return 3;
          }
        }
        return -1;
    }

    final void a(byte param0, lu param1) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        it var5_ref_it = null;
        rk var6 = null;
        int var7 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        var7 = BachelorFridge.field_y;
        try {
          for (var3_int = 0; 6 > var3_int; var3_int++) {
            for (var4 = 0; var4 < 10; var4++) {
              this.field_i[var3_int][var4] = new wda(param1);
            }
          }
          var3_intLifetime1 = param1.b(16711935);
          for (var4Lifetime1 = 0; var3_intLifetime1 > var4Lifetime1; var4Lifetime1++) {
            var5_ref_it = new it(param1);
            this.field_i[var5_ref_it.field_h][var5_ref_it.field_m].field_f = var5_ref_it;
          }
          var4Lifetime2 = param1.b(16711935);
          this.field_m = new eaa();
          if (param0 > -115) {
            return;
          }
          for (var5 = 0; var5 < var4Lifetime2; var5++) {
            var6 = gka.a(param1, 255);
            this.field_m.a(var6, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("ola.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final boolean a(byte param0) {
        if (this.field_j != null &&
          this.field_j.field_d) {
          return true;
        }
        if (param0 >= -72) {
          return true;
        }
        if (this.field_k.field_h != null &&
          this.field_k.field_h.field_d) {
          return true;
        }
        if (this.field_k.field_p != null &&
          this.field_k.field_p.field_e) {
          return true;
        }
        return false;
    }

    final void a(boolean param0, saa param1) {
        int[] var6 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = BachelorFridge.field_y;
        try {
          this.field_c = param1;
          this.field_k = new jt(this);
          this.c(59);
          qa.field_k = new kv(49, 49);
          var6 = new int[256];
          var3 = var6;
          if (param0) {
            field_g = (wma) null;
          }
          for (var4 = 0; 256 > var4; var4++) {
            var6[var4] = var4 * 65793;
          }
          qa.field_k.b();
          dg.a(400, 400, 384, 77, var3);
          hga.field_U.a((byte) 122);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ola.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(jfa param0, int param1, int param2, int param3) {
        int discarded$1 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_m.g(0) == 8) {
            return false;
          }
          var5_int = (param3 - 10) / 56;
          var6 = (-84 + param1) / 39;
          if (var5_int < 0) {
            return false;
          }
          if (var5_int >= 6) {
            return false;
          }
          if (var6 < 0) {
            return false;
          }
          if (var6 >= 10) {
            return false;
          }
          param0.field_o = null;
          param0.field_l = var6;
          param0.field_u = var5_int;
          param0.field_n = param0.c((byte) -116);
          if (param2 != -19906) {
            discarded$1 = this.b(70, -107);
          }
          param0.field_k = param0.b(true);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("ola.N(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0, ola param1) {
        int var4 = 0;
        int var3_int = 0;
        rk var3 = null;
        int var5 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = BachelorFridge.field_y;
        try {
          this.field_i = param1.field_i;
          var3_int = 0;
          if (param0 < 74) {
            return;
          }
          while (6 > var3_int) {
            for (var4 = 0; var4 < 10; var4++) {
              if (this.field_i[var3_int][var4].field_f != null) {
                this.field_i[var3_int][var4].field_f.a((byte) -51);
              }
            }
            var3_int++;
          }
          this.field_m = new eaa();
          var3 = (rk) (param1.field_m.b((byte) 90));
          while (var3 != null) {
            this.field_m.a(new jfa(var3, kla.a(6, var3.field_p, -2147483648), kla.a(10, var3.field_p, -2147483648), this.field_i), true);
            var3 = (rk) (param1.field_m.c(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("ola.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_p = null;
        if (param0 != -120) {
          return;
        }
        field_e = null;
        field_g = null;
    }

    final boolean a(byte param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        it var7;
        int var8;
        saa var9;
        var8 = BachelorFridge.field_y;
        var5 = (param2 - 10) / 56;
        var6 = (-84 + param1) / 39;
        if (var5 >= 0 &&
          var5 < 6) {
          if (var6 < 0) {
            return false;
          }
          if (var6 >= 10) {
            return false;
          }
          if (this.field_i[var5][var6].field_e != 1 &&
            this.field_i[var5][var6].field_e != 2) {
            while (var6 < 10) {
              if (this.field_i[var5][var6].field_e == 1) {
                break;
              }
              if (2 == this.field_i[var5][var6].field_e) {
                break;
              }
              var6++;
            }
          }
          var7 = new it(var5, var6, param3);
          if (param0 != -89) {
            var9 = (saa) null;
            this.a(true, (saa) null);
          }
          if (this.field_i[var5][var6].field_f == null ||
            !this.field_i[var5][var6].field_f.field_a) {
            sm.a(false, param3, var5, var6);
          }
          return this.field_i[var5][var6].a(false, var7);
        }
        return false;
    }

    final jfa a(int param0, int param1, int param2) {
        int var5 = BachelorFridge.field_y;
        jfa var4 = (jfa) (this.field_m.b((byte) 90));
        while (var4 != null) {
          if (var4.a(jc.field_r, (byte) 119, nfa.field_a)) {
            return var4;
          }
          var4 = (jfa) (this.field_m.c(0));
        }
        if (param1 == -4456) {
          return null;
        }
        this.a(-48, -94, 71);
        return null;
    }

    private final boolean f(int param0) {
        int var2 = this.field_m.g(0) - (-this.field_k.f(62) - 1);
        int var3 = -54 % ((-16 - param0) / 41);
        return var2 > 4 ? true : false;
    }

    public ola() {
        this.field_n = 0;
        this.field_r = new jfa[50];
        this.field_i = fs.a(1);
        this.field_m = new eaa();
        this.field_q = new eaa();
    }

    static {
    }
}
