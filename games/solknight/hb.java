/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class hb {
    private long field_i;
    private long field_e;
    private byte[] field_k;
    private long field_d;
    static double field_n;
    static String field_l;
    private byte[] field_g;
    private long field_a;
    static String[] field_m;
    private sg field_o;
    private int field_h;
    private long field_f;
    private int field_c;
    private long field_b;
    static String field_j;

    final void a(long param0, byte param1) throws IOException {
        if (param1 != 45) {
          return;
        }
        if (param0 < 0L) {
          throw new IOException();
        }
        this.field_e = param0;
    }

    final void d(boolean param0) throws IOException {
        if (param0) {
          return;
        }
        this.b(83);
        this.field_o.a((byte) 7);
    }

    final void b(byte[] param0, int param1, int param2, int param3) throws IOException {
        int incrementValue$0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        Throwable decompiledCaughtException = null;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var9_intLifetime1Lifetime1;
        var14 = SolKnight.field_L ? 1 : 0;
        try {
          try {
            if (param0.length < param3 + param2) {
              throw new ArrayIndexOutOfBoundsException(param2 + param3 - param0.length);
            }
            if (this.field_d != -1L &&
              this.field_e >= this.field_d &&
              this.field_d + (long)this.field_c >= (long)param3 + this.field_e) {
              fk.a(this.field_g, (int)(-this.field_d + this.field_e), param0, param2, param3);
              this.field_e = this.field_e + (long)param3;
              return;
            }
            var5_long = this.field_e;
            var7 = param2;
            var8 = param3;
            if (this.field_e >= this.field_f &&
              this.field_e < (long)this.field_h + this.field_f) {
              var9_int = (int)((long)this.field_h + (this.field_f - this.field_e));
              if (param3 < var9_int) {
                var9_int = param3;
              }
              fk.a(this.field_k, (int)(this.field_e - this.field_f), param0, param2, var9_int);
              param3 = param3 - var9_int;
              this.field_e = this.field_e + (long)var9_int;
              param2 = param2 + var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (param3 > this.field_k.length) {
              this.field_o.a(this.field_e, (byte) 101);
              this.field_a = this.field_e;
              while (param3 > 0) {
                var9_intLifetime1 = this.field_o.a(-1, param2, param3, param0);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                this.field_e = this.field_e + (long)var9_intLifetime1;
                param3 = param3 - var9_intLifetime1;
                param2 = param2 + var9_intLifetime1;
                this.field_a = this.field_a + (long)var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (0 < param3)) {
              this.c(true);
              var9_intLifetime1Lifetime1 = param3;
              if (this.field_h < var9_intLifetime1Lifetime1) {
                var9_intLifetime1Lifetime1 = this.field_h;
              }
              fk.a(this.field_k, 0, param0, param2, var9_intLifetime1Lifetime1);
              param2 = param2 + var9_intLifetime1Lifetime1;
              this.field_e = this.field_e + (long)var9_intLifetime1Lifetime1;
              param3 = param3 - var9_intLifetime1Lifetime1;
            }
            if (-1L != this.field_d) {
              if (this.field_e < this.field_d &&
                param3 > 0) {
                var9_intLifetime2 = param2 + (int)(-this.field_e + this.field_d);
                if (param3 + param2 < var9_intLifetime2) {
                  var9_intLifetime2 = param2 + param3;
                }
                while (param2 < var9_intLifetime2) {
                  param3--;
                  incrementValue$0 = param2;
                  param2++;
                  param0[incrementValue$0] = (byte) 0;
                  this.field_e = this.field_e + 1L;
                }
              }
              var9 = -1L;
              var11 = -1L;
              if (this.field_d >= var5_long &&
                this.field_d < (var5_long + (long)var8)) {
                var9 = this.field_d;
              } else {
                if (var5_long >= this.field_d &&
                  (this.field_d + (long)this.field_c) > var5_long) {
                  var9 = var5_long;
                }
              }
              if ((long)this.field_c + this.field_d > var5_long &&
                var5_long + (long)var8 >= this.field_d + (long)this.field_c) {
                var11 = (long)this.field_c + this.field_d;
              } else {
                if ((var5_long + (long)var8) > this.field_d &&
                  (this.field_d + (long)this.field_c) >= (var5_long + (long)var8)) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (var9 > -1L &&
                var9 < var11) {
                var13 = (int)(-var9 + var11);
                fk.a(this.field_g, (int)(-this.field_d + var9), param0, var7 + (int)(var9 - var5_long), var13);
                if (this.field_e < var11) {
                  param3 = (int)((long)param3 - (var11 - this.field_e));
                  this.field_e = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_a = -1L;
            throw var5;
          }
          if (param1 >= -63) {
            this.field_d = -60L;
          }
          if (param3 <= 0) {
            return;
          }
          throw new EOFException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_64_0 = var5_ref;
          stackIn_64_1 = new StringBuilder().append("hb.I(");
          if (param0 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void c(boolean param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = SolKnight.field_L ? 1 : 0;
        this.field_h = 0;
        if (~this.field_a != ~this.field_e) {
          this.field_o.a(this.field_e, (byte) 91);
          this.field_a = this.field_e;
        }
        this.field_f = this.field_e;
        if (!param0) {
          return;
        }
        while (this.field_h < this.field_k.length) {
          var2 = this.field_k.length - this.field_h;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.field_o.a(-1, this.field_h, var2, this.field_k);
          if (-1 == var3) {
            break;
          }
          this.field_h = this.field_h + var3;
          this.field_a = this.field_a + (long)var3;
        }
    }

    final static void a(boolean param0) {
        int stackIn_142_0 = 0;
        int stackIn_219_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        rb var3_ref_rb = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var1_intLifetime1;
        int var1_intLifetime2;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var3Lifetime1;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          if (vk.field_p >= 10 &&
            0 == (1 << kb.field_b & fa.field_f)) {
            ic.field_t = ic.field_t + (bi.field_i >>> 11 << kb.field_b);
            fa.field_f = fa.field_f | 1 << kb.field_b;
            lc.field_h = lc.field_h | 1 << kb.field_b;
            var1_int = ii.a(fa.field_f & 255, 126);
            vk.a(246, (byte) 89, 9);
            if (var1_int == 4) {
              vk.a(245, (byte) 89, 10);
            }
            if (8 == var1_int) {
              vk.a(244, (byte) 89, 11);
            }
          }
          if (25 <= vk.field_p &&
            0 == (1 << 8 + kb.field_b & fa.field_f)) {
            ic.field_t = ic.field_t + (bi.field_i >>> 11 << kb.field_b + 8);
            fa.field_f = fa.field_f | 1 << kb.field_b + 8;
            lc.field_h = lc.field_h | 1 << kb.field_b + 8;
            var1_intLifetime1 = ii.a(fa.field_f & 65280, 127);
            vk.a(243, (byte) 89, 12);
            if (var1_intLifetime1 == 4) {
              vk.a(242, (byte) 89, 13);
            }
            if (var1_intLifetime1 == 8) {
              vk.a(241, (byte) 89, 14);
            }
          }
          if (vk.field_p >= 50 &&
            (fa.field_f & 65536) == 0) {
            lc.field_h = lc.field_h | 65536;
            fa.field_f = fa.field_f | 65536;
            ic.field_t = ic.field_t + (bi.field_i >>> 11 << 16);
            vk.a(240, (byte) 89, 15);
          }
          if (vk.field_p > oa.field_m) {
            oa.field_m = vk.field_p;
          }
          var1_intLifetime2 = 0;
          if (kf.field_G != null) {
            for (var2 = 0; kf.field_G.length > var2; var2++) {
              var3_ref_rb = kf.field_G[var2];
              if (var3_ref_rb != null &&
                var3_ref_rb.field_j >= 25 &&
                var3_ref_rb.field_j <= 30) {
                var1_intLifetime2 = 1;
                break;
              }
            }
          }
          if (!pg.field_e &&
            lk.field_b >= qh.field_a[kb.field_b] &&
            var1_intLifetime2 == 0 &&
            kd.field_a == -1 &&
            uf.field_p >= 0) {
            jg.field_b = jg.field_b + 1;
            if (!(jg.field_b <= 50) ||
              kb.field_b == 7) {
              boolean decompiledFrameRemainder0 = true;
              jg.field_b = 0;
              kh.field_d = 255;
              if (kb.field_b != 7 && (kb.field_b != 2 ||
                !(ob.field_l <= 0))) {
                gb.a(true, 5, -128);
                decompiledFrameRemainder0 = false;
              }
              else {
                lk.field_e = lk.field_e + oa.field_m * 100;
                ic.field_t = ic.field_t - 100 * oa.field_m;
                if (kb.field_b == 7) {
                  lk.field_e = lk.field_e + 5000;
                  ic.field_t = ic.field_t - 5000;
                }
                me.a(false);
                gb.a(true, 6, -128);
                pk.a((byte) -96, 5, false);
              }
              vk.field_p = 0;
            }
          } else {
            if (jg.field_b > 0) {
              jg.field_b = jg.field_b - 1;
            }
          }
          if (!param0) {
            field_j = (String) null;
          }
          cb.field_a = 15 * cb.field_a / 16 - 1;
          if (0 < ia.field_hb &&
            kd.field_a == -1) {
            ia.field_hb = ia.field_hb + 1;
            if (50 < ia.field_hb &&
              7 > kb.field_b ||
              !(ia.field_hb <= 100)) {
              ia.field_hb = 0;
              vk.field_p = 0;
            }
          }
          if (cb.field_a < 0) {
            cb.field_a = 0;
          }
          if (0 <= ve.field_b) {
            pl.field_a = 0;
          }
          if (cb.field_a < 128 &&
            0 < vk.field_p) {
            cb.field_a = 128;
          }
          if (pl.field_a > 0) {
            ci.field_ib = 256;
            ic.field_t = ic.field_t - pl.field_a;
            lk.field_e = lk.field_e + pl.field_a;
            pl.field_a = 0;
            me.a(false);
          }
          ci.field_ib = 15 * ci.field_ib / 16 - 1;
          if (ci.field_ib < 0) {
            ci.field_ib = 0;
          }
          if (0 < fg.field_a) {
            fg.field_a = fg.field_a - 1;
            if (0 >= fg.field_a) {
              bi.field_h = bi.field_h - 1;
              if (bi.field_h > 0) {
                fg.field_a = 500;
              }
            }
          }
          if (ci.field_ib < 128) {
            ci.field_ib = 128;
          }
          if (vk.field_p >= 25 &&
            bi.field_h < 2) {
            fg.field_a = 500;
            bi.field_h = 2;
            mb.a(param0, 1, 256);
          }
          if (vk.field_p >= 10) {
            fg.field_a = 500;
          }
          if (vk.field_p >= 10 &&
            bi.field_h < 1) {
            fg.field_a = 1500;
            bi.field_h = 1;
            mb.a(param0, 0, 256);
          }
          if (pg.field_e) {
            vk.field_p = 0;
          }
          if (pg.field_e &&
            kd.field_a != -1 ||
            !(0 > ve.field_b)) {
            lk.field_b = 0;
          }
          if (qh.field_a[kb.field_b] > lk.field_b && (kd.field_a == -1 ||
            pg.field_e)) {
            mf.field_A = mf.field_A + 1;
          }
          if (uf.field_p > 0 &&
            200 > wc.field_c) {
            wc.field_c = wc.field_c + 1;
          }
          if (pg.field_e &&
            -1 == kd.field_a) {
            if (ve.field_b < 0 &&
              of.field_g > 50) {
              k.field_c = k.field_c + 1;
            }
            of.field_g = of.field_g + 1;
            if (of.field_g <= 50) {
              m.a(10, -ea.field_p[kb.field_b] + (720 + bk.a(128, jb.field_g, (byte) 47)) - 64 << 4, bk.a(128, jb.field_g, (byte) -46) - 64 << 4, (byte) -6, 0, 0);
            }
            if (50 < of.field_g && (hg.field_F == 1 ||
              fh.field_d[84] ||
              fh.field_d[83])) {
              of.field_g = 501;
            }
            if (of.field_g > 500) {
              uf.field_p = uf.field_p - 1;
              if (kb.field_b == 7 ||
                !(0 <= uf.field_p)) {
                kh.field_d = 255;
                if (il.b(507)) {
                  gb.a(true, 8, -128);
                } else {
                  ah.b(true);
                  kh.field_c = null;
                  if (jl.field_d != 0) {
                    gb.a(true, 7, -127);
                  } else {
                    gb.a(true, 2, -128);
                  }
                }
                stackIn_142_0 = (ob.field_l <= 0) ? 9 : 0;
                fb.field_c = stackIn_142_0;
                for (var2Lifetime1 = 0; var2Lifetime1 < kf.field_G.length; var2Lifetime1++) {
                  kf.field_G[var2Lifetime1] = null;
                }
                ve.field_b = 240;
                pk.a((byte) -96, 4, false);
              }
            }
          }
          if (ve.field_b >= 0) {
            lk.field_b = 0;
          }
          if (!pg.field_e) {
            of.field_g = 0;
          }
          if (kd.field_a == -1 ||
            pg.field_e ||
            !(ve.field_b < 0)) {
            if (100 < mf.field_A && (!pg.field_e ||
              -1 != kd.field_a &&
              pg.field_e ||
              !(ve.field_b < 0))) {
              var2Lifetime2 = bk.a(5, jb.field_g, (byte) -52);
              if (kb.field_b == 0 &&
                var2Lifetime2 == 0) {
                var2Lifetime2 = 1;
              }
              if (0 == kb.field_b &&
                var2Lifetime2 >= 3) {
                var2Lifetime2 = 1;
              }
              if (kb.field_b == 1 &&
                var2Lifetime2 >= 4) {
                var2Lifetime2 = 2;
              }
              if (ib.field_h < kb.field_b &&
                bk.a(2, jb.field_g, (byte) 76) == 0 &&
                qh.field_a[kb.field_b] - 50 < lk.field_b &&
                0 < kb.field_b) {
                var2Lifetime2 = 5;
              }
              if (-1 + (qh.field_a[kb.field_b] - lk.field_b) < var2Lifetime2) {
                var2Lifetime2 = -1 - lk.field_b + qh.field_a[kb.field_b];
              }
              if (var2Lifetime2 < 0) {
                var2Lifetime2 = 0;
              }
              var3 = 1;
              if (0 == var2Lifetime2) {
                if (!pg.field_e) {
                  lk.field_b = lk.field_b + 1;
                }
                mf.field_A = mf.field_A - (25 + kb.field_b);
                var3 = 64;
              }
              if (var2Lifetime2 == 1) {
                var3 = 32;
                mf.field_A = mf.field_A - (30 + 2 * kb.field_b);
                if (!pg.field_e) {
                  lk.field_b = lk.field_b + 2;
                }
              }
              if (var2Lifetime2 == 2) {
                var3 = 24;
                mf.field_A = mf.field_A - (kb.field_b * 3 + 35);
                if (!pg.field_e) {
                  lk.field_b = lk.field_b + 3;
                }
              }
              if (3 == var2Lifetime2) {
                var3 = 16;
                if (!pg.field_e) {
                  lk.field_b = lk.field_b + 4;
                }
                mf.field_A = mf.field_A - (40 + 4 * kb.field_b);
              }
              if (4 == var2Lifetime2) {
                var3 = 8;
                if (!pg.field_e) {
                  lk.field_b = lk.field_b + 5;
                }
                mf.field_A = mf.field_A - (45 + 5 * kb.field_b);
              }
              if (var2Lifetime2 == 5) {
                ib.field_h = ib.field_h + 1;
                mf.field_A = mf.field_A - (kb.field_b * 5 + 50);
                var3 = 8;
                if (!pg.field_e) {
                  lk.field_b = lk.field_b + 6;
                }
              }
              if (kb.field_b == 0) {
                var3 -= 8;
              }
              var3 = var3 + kb.field_b;
              var4 = -640 + bk.a(1280, jb.field_g, (byte) 91) << 4;
              var5 = -2048;
              var6 = (bk.a(1280, jb.field_g, (byte) 51) - 640 << 4) * (-kb.field_b + 7) / 7;
              if (var2Lifetime2 == 5) {
                var6 = 0;
              }
              if (ve.field_b >= 0) {
                if (var4 >= 0) {
                  stackIn_219_0 = var6 / 5 - 5120;
                } else {
                  stackIn_219_0 = -5120 + var6 / 3;
                }
                var6 = stackIn_219_0;
              }
              var7 = 11520;
              var8 = var6 - var4;
              var9 = var7 - var5;
              var10 = (int)Math.sqrt((double)(var8 * var8 + var9 * var9));
              m.a(var2Lifetime2 + 25, var5, var4, (byte) -6, var9 * var3 / var10, var3 * var8 / var10);
            }
            if (f.field_d > 0) {
              f.field_d = f.field_d - 1;
            }
            vk.b((byte) -126);
            if (pg.field_e &&
              f.field_d > 0) {
              pg.field_e = false;
            }
            if (pg.field_e &&
              0 < uf.field_p) {
              f.field_d = 250;
              uf.field_p = uf.field_p - 1;
              pg.field_e = false;
            }
          }
          if (pg.field_e ||
            -1 != kd.field_a) {
            si.field_E = (si.field_E * 9 + 240) / 10;
            wd.field_c = 9 * wd.field_c / 10;
          }
          if (!pg.field_e &&
            kd.field_a == -1 ||
            !(ve.field_b < 0)) {
            var2Lifetime3 = gb.field_j;
            if (var2Lifetime3 < 0) {
              var2Lifetime3 = 0;
            }
            var3Lifetime1 = ad.field_m;
            if (640 <= var2Lifetime3) {
              var2Lifetime3 = 639;
            }
            if (var3Lifetime1 < 0) {
              var3Lifetime1 = 0;
            }
            if (var3Lifetime1 >= 480) {
              var3Lifetime1 = 479;
            }
            if (kd.field_a == -1 && (!(gb.field_j <= -1) ||
              0 != wb.field_c)) {
              si.field_E = (var3Lifetime1 / 2 + 9 * si.field_E) / 10;
              wd.field_c = (9 * wd.field_c + (var2Lifetime3 - 320)) / 10;
            }
            be.c(false);
          }
          if (kd.field_a == -1) {
            while (wk.a((byte) -56)) {
              if (13 != el.field_n) {
                continue;
              }
              if (!pg.field_e) {
                gb.a(true, 1, -128);
                continue;
              }
              f.field_d = 0;
              of.field_g = 500;
            }
          }
          if (fh.field_d[82] &&
            el.field_n == 80 &&
            !pg.field_e &&
            -1 == kd.field_a &&
            lh.field_s >= 2) {
            kh.field_d = 255;
            gb.a(false, 5, -127);
            lc.field_p = lc.field_p + 1;
            ic.field_t = ic.field_t - 1;
            vk.field_p = 0;
            oa.field_n = true;
            if (1 + kb.field_b < 8) {
              lk.field_b = qh.field_a[kb.field_b];
              var2Lifetime4 = -ud.field_k + (-100 + qh.field_a[1 + kb.field_b]);
              bi.field_i = bi.field_i + var2Lifetime4;
              lc.field_p = lc.field_p + var2Lifetime4 * (lc.field_h >>> 17);
              ud.field_k = qh.field_a[1 + kb.field_b] - 100;
            } else {
              lk.field_e = lk.field_e + oa.field_m * 100;
              ic.field_t = ic.field_t - (oa.field_m * 100 + 5000);
              lk.field_e = lk.field_e + 5000;
              me.a(false);
              if (!il.b(507)) {
                ah.b(param0);
                kh.field_c = null;
              }
              gb.a(true, 6, -127);
              pk.a((byte) -96, 5, false);
            }
            lk.field_f = 0;
          }
          if (2 <= lh.field_s &&
            fh.field_d[32]) {
            ic.field_t = ic.field_t - 1;
            fg.field_a = 500;
            lc.field_p = lc.field_p + 1;
            oa.field_n = true;
            bi.field_h = 1;
          }
          if (lh.field_s >= 2 &&
            fh.field_d[33]) {
            bi.field_h = 2;
            oa.field_n = true;
            fg.field_a = 500;
            ic.field_t = ic.field_t - 1;
            lc.field_p = lc.field_p + 1;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "hb.J(" + param0 + ')');
        }
    }

    public static void b(boolean param0) {
        field_j = null;
        field_m = null;
        field_l = null;
        if (!param0) {
          field_l = (String) null;
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          try {
            if ((this.field_e + (long)param2) > this.field_i) {
              this.field_i = (long)param2 + this.field_e;
            }
            if (this.field_d != -1L && (this.field_e < this.field_d ||
              (this.field_d + (long)this.field_c) < this.field_e)) {
              this.b(param1 ^ -20344);
            }
            if (this.field_d != -1L &&
              this.field_d + (long)this.field_g.length < (long)param2 + this.field_e) {
              var5_int = (int)((long)this.field_g.length + (this.field_d - this.field_e));
              fk.a(param0, param3, this.field_g, (int)(this.field_e - this.field_d), var5_int);
              param2 = param2 - var5_int;
              this.field_e = this.field_e + (long)var5_int;
              param3 = param3 + var5_int;
              this.field_c = this.field_g.length;
              this.b(116);
            }
            if (this.field_g.length >= param2) {
              if (param1 != -20291) {
                this.field_k = (byte[]) null;
              }
              if (param2 <= 0) {
                return;
              }
              if (this.field_d == -1L) {
                this.field_d = this.field_e;
              }
              fk.a(param0, param3, this.field_g, (int)(-this.field_d + this.field_e), param2);
              this.field_e = this.field_e + (long)param2;
              if (-this.field_d + this.field_e > (long)this.field_c) {
                this.field_c = (int)(this.field_e - this.field_d);
              }
              return;
            }
            if (~this.field_e != ~this.field_a) {
              this.field_o.a(this.field_e, (byte) 116);
              this.field_a = this.field_e;
            }
            this.field_o.a(param2, param0, -1, param3);
            this.field_a = this.field_a + (long)param2;
            if (this.field_b < this.field_a) {
              this.field_b = this.field_a;
            }
            var5_long = -1L;
            var7 = -1L;
            if (this.field_f <= this.field_e &&
              (long)this.field_h + this.field_f > this.field_e) {
              var5_long = this.field_e;
            } else {
              if (this.field_f >= this.field_e &&
                this.field_e + (long)param2 > this.field_f) {
                var5_long = this.field_f;
              }
            }
            if (this.field_f < (long)param2 + this.field_e &&
              (this.field_f + (long)this.field_h) >= (this.field_e + (long)param2)) {
              var7 = (long)param2 + this.field_e;
            } else {
              if (this.field_e < (long)this.field_h + this.field_f &&
                this.field_f + (long)this.field_h <= (long)param2 + this.field_e) {
                var7 = this.field_f + (long)this.field_h;
              }
            }
            if (var5_long > -1L &&
              var7 > var5_long) {
              var9 = (int)(-var5_long + var7);
              fk.a(param0, (int)(-this.field_e + (var5_long + (long)param3)), this.field_k, (int)(-this.field_f + var5_long), var9);
            }
            this.field_e = this.field_e + (long)param2;
            return;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_a = -1L;
            throw var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_51_0 = var5_ref;
          stackIn_51_1 = new StringBuilder().append("hb.F(");
          if (param0 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0, byte[] param1) throws IOException {
        try {
          if (param0 <= 3) {
            this.a(-96);
          }
          this.b(param1, -90, 0, param1.length);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "hb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final long a(int param0) {
        if (param0 != 33) {
          this.field_c = 27;
        }
        return this.field_i;
    }

    private final void b(int param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        var7 = SolKnight.field_L ? 1 : 0;
        if (this.field_d != -1L) {
          if (~this.field_d != ~this.field_a) {
            this.field_o.a(this.field_d, (byte) 72);
            this.field_a = this.field_d;
          }
          this.field_o.a(this.field_c, this.field_g, -1, 0);
          this.field_a = this.field_a + (long)this.field_c;
          if (this.field_b < this.field_a) {
            this.field_b = this.field_a;
          }
          var2 = -1L;
          var4 = -1L;
          if (this.field_f <= this.field_d &&
            ((long)this.field_h + this.field_f) > this.field_d) {
            var2 = this.field_d;
          } else {
            if (this.field_f >= this.field_d &&
              this.field_d + (long)this.field_c > this.field_f) {
              var2 = this.field_f;
            }
          }
          if (((long)this.field_c + this.field_d) > this.field_f &&
            (long)this.field_h + this.field_f >= this.field_d + (long)this.field_c) {
            var4 = this.field_d + (long)this.field_c;
          } else {
            if (((long)this.field_h + this.field_f) > this.field_d &&
              ((long)this.field_h + this.field_f) <= (this.field_d + (long)this.field_c)) {
              var4 = (long)this.field_h + this.field_f;
            }
          }
          if (var2 > -1L &&
            var2 < var4) {
            var6 = (int)(-var2 + var4);
            fk.a(this.field_g, (int)(var2 - this.field_d), this.field_k, (int)(var2 - this.field_f), var6);
          }
          this.field_c = 0;
          this.field_d = -1L;
        }
        if (param0 <= 31) {
          this.field_a = -125L;
        }
    }

    hb(sg param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_d = -1L;
        this.field_f = -1L;
        this.field_c = 0;
        try {
          this.field_o = param0;
          dupTemp$0 = param0.a(-1);
          this.field_b = dupTemp$0;
          this.field_i = dupTemp$0;
          this.field_e = 0L;
          this.field_g = new byte[param2];
          this.field_k = new byte[param1];
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "hb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_l = "achievements to collect";
        field_m = new String[]{"Order of the Moon", "Order of the Planet", "Order of the System", "Order of the Galaxy", "Order of the Universe", "Solar Squire", "Solar Knight", "Solar Prince", "Solar King", "Combo Bonus", "Combo Collector", "Combo Champion", "Mega Bonus", "Mega Collector", "Mega Champion", "Ultimate Bonus"};
        field_j = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_n = 0.0;
    }
}
