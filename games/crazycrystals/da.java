/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class da extends ue {
    private double field_h;
    private boolean field_f;
    private re field_n;
    private int field_o;
    private int field_m;
    private boolean field_l;
    private boolean field_q;
    private int field_s;
    private int field_g;
    private int field_e;
    private boolean field_k;
    private int field_i;
    private int field_r;
    private f[][] field_p;
    private int field_j;

    private final void c(int param0) {
        int discarded$0 = 0;
        int var2;
        if (this.field_r != 1) {
          return;
        }
        var2 = this.field_s + 1;
        if (mo.field_l == 0) {
          if (this.field_e >= var2 &&
            this.field_g > this.field_e) {
            this.field_e = var2 - 1;
          }
          if (this.field_g + 1 > var2) {
            var2 = 1 + this.field_g;
          }
        }
        if (this.field_e >= var2 &&
          this.field_e < 20) {
          this.field_e = var2 - 1;
        }
        if (var2 < 22) {
          var2 = 22;
        }
        if (this.field_e >= var2 &&
          this.field_e < 40) {
          this.field_e = var2 - 1;
        }
        if (param0 > -19) {
          discarded$0 = this.c((byte) -122);
        }
        if (var2 < 42) {
          var2 = 42;
        }
        if (var2 <= this.field_e &&
          60 > this.field_e) {
          this.field_e = -1 + var2;
        }
        return;
    }

    private final int b(int param0, int param1) {
        int var5 = 0;
        int var3 = param0;
        int var4 = this.field_m;
        var3 = var3 + this.c(param0, 20);
        var4 = var4 + this.c(this.field_m, 20);
        int var6 = 74 % ((42 - param1) / 54);
        if (var4 > 13) {
          var5 = -(20 * this.field_j) + 230;
        } else {
          var5 = 230 - 10 * var4;
        }
        return var5 + var3 * 20;
    }

    private final int c(byte param0) {
        int var3 = -16 / ((-24 - param0) / 37);
        int var2 = -7 + this.field_m;
        var2 = var2 + this.c(this.field_m, 20);
        return var2;
    }

    private final boolean f(int param0, int param1) {
        if (param0 < this.field_s) {
          return true;
        }
        if (param1 <= 1) {
          return false;
        }
        if (this.field_r == 1) {
          if (param0 == 20) {
            return true;
          }
          if (40 == param0) {
            return true;
          }
        }
        return false;
    }

    da(re param0, int param1, int param2, int param3) {
        super(param3 + 5);
        this.field_o = -1;
        try {
          if (!(a.field_b instanceof da)) {
            co.field_x = 0;
          }
          this.field_m = param3;
          this.field_n = param0;
          this.field_r = param1;
          this.b(false);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "da.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int e(int param0, int param1) {
        int discarded$0 = 0;
        if (this.field_r != 1) {
          return param1;
        }
        int var3 = param1;
        int var4 = 1 + this.field_s;
        if (0 == mo.field_l) {
          if (var4 - 1 == param1) {
            var3 = -1 + this.field_g;
          }
          if (var4 < 1 + this.field_g) {
            var4 = 1 + this.field_g;
          }
        }
        if (param1 == var4 - 1) {
          var3 = 19;
        }
        if (var4 < 22) {
          var4 = 22;
        }
        if (var4 - 1 == param1) {
          var3 = 39;
        }
        if (var4 < 42) {
          var4 = 42;
        }
        if (param1 == -1 + var4) {
          var3 = 59;
        }
        if (param1 > var3) {
          var3 = param1;
        }
        if (param0 < 101) {
          discarded$0 = this.c(24, 119);
        }
        return var3;
    }

    private final String a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 20) {
            this.field_n = (re) null;
          }
          if (this.field_r != 1) {
            stackIn_5_0 = (String) (param0);
            return stackIn_5_0;
          }
          var4_int = this.e(118, param1);
          if (param1 == var4_int) {
            stackIn_10_0 = (String) (param0);
            return stackIn_10_0;
          }
          stackIn_8_0 = param1 + 1 + "-" + (1 + var4_int) + ". ";
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("da.W(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(int param0, byte param1, boolean param2, int param3) {
        int var4;
        int var5;
        int var6;
        if (!param2) {
          if (jk.field_g[param3] > jk.field_g[param0]) {
            return true;
          }
          if (jk.field_g[param3] < jk.field_g[param0]) {
            return false;
          }
          if (mh.field_l[param0] < mh.field_l[param3]) {
            return true;
          }
          if (mh.field_l[param3] < mh.field_l[param0]) {
            return false;
          }
        } else {
          if (mh.field_l[param3] > mh.field_l[param0]) {
            return true;
          }
          if (mh.field_l[param3] < mh.field_l[param0]) {
            return false;
          }
          if (jk.field_g[param0] < jk.field_g[param3]) {
            return true;
          }
          if (jk.field_g[param3] < jk.field_g[param0]) {
            return false;
          }
        }
        var4 = dk.field_l[param0] + j.field_i[param0] + cd.field_u[param0];
        var5 = cd.field_u[param3] + j.field_i[param3] + dk.field_l[param3];
        if (var4 < var5) {
          return true;
        }
        var6 = 84 / ((-14 - param1) / 55);
        if (var4 > var5) {
          return false;
        }
        return !(param3 <= param0);
    }

    final void b(int param0) {
        re stackIn_6_0 = null;
        int stackIn_7_1 = 0;
        int var2;
        f[][] var3;
        String var3_ref;
        double var4;
        String var4_ref_String;
        int var5;
        String var6;
        String var7;
        int var8;
        int var9;
        int var10;
        f[][] var11;
        var10 = CrazyCrystals.field_B;
        if (this.field_f &&
          co.field_x < 20) {
          this.field_n.e(122);
          this.g(-47);
        } else {
          if (this.field_n.field_f > 0) {
            this.field_n.e(48);
            this.g(param0 ^ 121);
          } else {
            this.field_n.e(18);
            this.g(param0 + 112);
            stackIn_6_0 = this.field_n;
            if (this.field_k) {
              stackIn_7_1 = -1;
            } else {
              stackIn_7_1 = this.field_r;
            }
            ((re) (Object) stackIn_6_0).a(stackIn_7_1, false);
          }
        }
        var2 = co.field_x * (336 * co.field_x) / 400 - 16;
        wi.a(23, jn.field_o, 122, 336, (byte) -71, 16 + var2);
        if (var2 < 0) {
          var2 = 0;
        }
        kh.d(31, 130, 31 + var2, 450);
        if (param0 != 8) {
          return;
        }
        this.c(true);
        if (this.field_e >= 0 &&
          this.f(this.field_e, 59)) {
          var11 = this.field_p;
          var3 = var11;
          var4 = this.field_h;
          oj.a(false, var3, 320, 320, var4 * (double)var11.length, 31, var4, 130, (byte) -32, (double)var11[0].length * var4);
          if (this.field_e > this.field_i) {
            var6 = ci.a(new String[]{((an) (this.field_d[this.field_e])).field_p}, io.field_J, 3);
            var7 = cj.field_E;
            var8 = 20 * go.field_l.a(var6, 304);
            var9 = go.field_l.a(var7, 304) * 20;
            kh.d(31, 130, 320, var8, 0, 192);
            kh.a(31, var8 + 130, 320, 0, 160);
            kh.a(31, 130 + (var8 + 1), 320, 0, 128);
            kh.a(31, 130 + var8 + 2, 320, 0, 96);
            kh.a(31, 3 + var8 + 130, 320, 0, 64);
            kh.a(31, var8 + 134, 320, 0, 32);
            kh.a(31, -5 - var9 + 450, 320, 0, 32);
            kh.a(31, -var9 + 446, 320, 0, 64);
            kh.a(31, 450 + (-var9 - 3), 320, 0, 96);
            kh.a(31, 448 - var9, 320, 0, 128);
            kh.a(31, -1 + (450 - var9), 320, 0, 160);
            kh.d(31, -var9 + 450, 320, var9, 0, 192);
            go.field_l.a(var6, 39, 132, 304, 316, 16777215, -1, 1, 0, 20);
            go.field_l.a(var7, 39, 132, 304, 316, 16777215, -1, 1, 2, 20);
          }
        } else {
          kh.d(31, 130, 320, 320, 0, 192);
          if (this.field_e >= 0) {
            if (this.field_e >= this.field_g) {
              if (this.e(param0 + 112, this.field_e) == this.field_e) {
                var3_ref = an.field_u;
              } else {
                var3_ref = ro.field_t;
              }
              var5 = 16760896;
              var4_ref_String = vl.field_c;
            } else {
              var5 = 8438015;
              if (this.e(118, this.field_e) != this.field_e) {
                var3_ref = mb.field_a;
              } else {
                var3_ref = go.field_k;
              }
              var4_ref_String = me.field_d + "<br>" + vo.field_a + "<br>" + bh.field_a;
              var3_ref = var4_ref_String;
              var3_ref = var4_ref_String;
            }
            if (rc.a(-106)) {
              var3_ref = var3_ref + "<br><br>" + var4_ref_String;
            }
            go.field_l.a(var3_ref, 39, 130, 304, 320, var5, -1, 1, 1, 20);
          }
        }
        kh.c();
        if (co.field_x == 20) {
          go.field_l.b(b.field_b, 611, 54, 16777215, -1);
          kh.f(383, 60, 228, 2, 12640511);
          this.b(this.field_m, 22370, this.field_d.length);
        }
    }

    private final void c(boolean param0) {
        int var10;
        kb var3;
        f[][] var4;
        int var5;
        double var6;
        int var8;
        int var9;
        Vector var11;
        var10 = CrazyCrystals.field_B;
        if (this.field_o != this.field_e) {
          if (0 <= this.field_e &&
            this.f(this.field_e, 56)) {
            var11 = ol.field_z[this.field_r];
            var3 = (kb) (var11.elementAt(this.field_e));
            var4 = var3.field_b;
            var5 = var4[0].length;
            if (var4.length > var5) {
              var5 = var4.length;
            }
            var6 = 160.0 / (double)var5;
            this.field_h = var6;
            var8 = 0;
            var9 = 0;
            if (var4.length < var4[0].length) {
              var9 = (var4[0].length - (var4.length - 1)) / 2;
            } else {
              if (var4.length > var4[0].length) {
                var8 = (-var4[0].length + var4.length + 1) / 2;
              }
            }
            this.field_p = md.a(var9, true, var8, 82, var4);
          } else {
            this.field_p = (f[][]) null;
          }
          this.field_o = this.field_e;
        }
        if (!param0) {
          this.field_q = false;
        }
    }

    private final void g(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var2Lifetime1;
        var6 = CrazyCrystals.field_B;
        for (var2 = 0; 480 > var2; var2++) {
          var3 = var2 - 350;
          var4 = -var2 + 130;
          if (var4 > var3) {
            var3 = var4;
          }
          var5 = 256 - 256 * var3 / 50;
          if (0 <= var5) {
            if (var5 > 256) {
              var5 = 256;
            }
            kh.a(371, var2, 260, 0, var5 * co.field_x / 40);
          }
        }
        if (co.field_x == 20) {
          this.b(0, 22370, this.field_m);
        }
        var2Lifetime1 = -56 / ((32 - param0) / 59);
    }

    final boolean a(int param0) {
        if (param0 <= 99) {
          this.field_f = false;
        }
        if (this.field_b.field_c >= 0 &&
          this.field_m > this.field_b.field_c &&
          this.field_b.a(true)) {
          this.field_e = this.field_b.field_c;
          this.d(24902);
          return true;
        }
        if (this.field_b.field_c == this.field_m &&
          this.field_b.a(true) &&
          this.field_e >= 0 &&
          this.f(this.field_e, 117)) {
          this.field_f = true;
          return true;
        }
        if (this.field_m + 1 == this.field_b.field_c &&
          this.field_b.a(true) &&
          rc.a(-123)) {
          this.field_l = true;
          return true;
        }
        if (2 + this.field_m == this.field_b.field_c &&
          this.field_b.a(true)) {
          this.field_k = true;
          return true;
        }
        if (this.field_b.field_c == 3 + this.field_m &&
          this.field_b.c(96) &&
          this.field_j > 6) {
          this.field_j = this.field_j - 1;
        }
        if (this.field_b.field_c == 4 + this.field_m &&
          this.field_b.c(96) &&
          this.field_j < this.c((byte) 98)) {
          this.field_j = this.field_j + 1;
          return false;
        }
        return false;
    }

    private final int c(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        var6 = CrazyCrystals.field_B;
        if (this.field_r != 1) {
          return 0;
        }
        var3 = 1;
        if (param0 >= 20) {
          var3 += 2;
        }
        if (param0 >= 40) {
          var3 += 2;
        }
        if (this.field_i >= 60 &&
          param0 >= 60) {
          var3 += 2;
        }
        var4 = this.field_s + 1;
        if (mo.field_l == 0) {
          var5 = this.field_g - var4;
          if (var5 >= 0) {
            if (this.field_g > param0) {
              if (param0 >= var4) {
                return -1000;
              }
            } else {
              var3 = var3 - var5;
            }
          }
          if (var4 < 1 + this.field_g) {
            var4 = 1 + this.field_g;
          }
        }
        var5Lifetime1 = -var4 + param1;
        if (var5Lifetime1 >= 0) {
          if (20 <= param0) {
            var3 = var3 - var5Lifetime1;
          } else {
            if (param0 >= var4) {
              return -1000;
            }
          }
        }
        if (var4 < 22) {
          var4 = 22;
        }
        var5Lifetime2 = 40 - var4;
        if (var5Lifetime2 >= 0) {
          if (param0 < 40) {
            if (var4 <= param0) {
              return -1000;
            }
          } else {
            var3 = var3 - var5Lifetime2;
          }
        }
        if (var4 < 42) {
          var4 = 42;
        }
        var5Lifetime3 = 60 - var4;
        if (var5Lifetime3 >= 0) {
          if (param0 < 60) {
            if (param0 >= var4) {
              return -1000;
            }
          } else {
            var3 = var3 - var5Lifetime3;
          }
        }
        var5Lifetime4 = -60 + this.field_m;
        if (this.field_i < 60) {
          if (this.field_m <= param0) {
            var3 = var3 - var5Lifetime4;
          } else {
            if (60 <= param0) {
              return -1000;
            }
          }
        }
        return var3;
    }

    private final void d(int param0) {
        boolean discarded$0 = false;
        if (this.d(this.field_e, -1)) {
          return;
        }
        if (param0 != 24902) {
          discarded$0 = this.f(72, 53);
        }
        this.field_j = this.field_e;
        this.field_j = this.field_j + this.c(this.field_e, param0 - 24882);
        this.e(17832);
    }

    final static int a(boolean param0, boolean param1) {
        int stackIn_59_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_79_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = CrazyCrystals.field_B;
        try {
          wn.field_b = wn.field_b + 65536;
          while (65536 <= pn.b(wn.field_b, 160, h.field_a)) {
            wn.field_b = wn.field_b - h.field_a;
            hl.field_g = hl.field_g + 1;
          }
          var2_int = -1;
          if (!param1) {
            da.a(false, true);
          }
          if (nl.field_f != null) {
            var2_int = nl.field_f.length;
          } else {
            if (ld.field_v != null) {
              var2_int = ld.field_v.length;
            }
          }
          if (var2_int != -1) {
            boolean decompiledFrameRemainder0 = true;
            if (h.field_c > mb.field_f) {
              mb.field_f = mb.field_f + 1;
              if (mb.field_f > h.field_b && (null == nl.field_f ||
                null == nl.field_f[ue.field_a])) {
                mb.field_f = mb.field_f - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (h.field_c <= mb.field_f &&
                  null == nl.field_f[(1 + ue.field_a) % var2_int]) {
                  mb.field_f = mb.field_f - 1;
                }
              }
            }
            if (mb.field_f >= h.field_c) {
              rd.field_f = ue.field_a;
              if (!ve.field_t) {
                ue.field_a = ue.field_a - 1;
                if (0 > ue.field_a) {
                  ue.field_a = ue.field_a + var2_int;
                }
              } else {
                ue.field_a = ue.field_a + 1;
                if (ue.field_a >= var2_int) {
                  ue.field_a = ue.field_a - var2_int;
                }
              }
              mb.field_f = mb.field_f - h.field_c;
            }
            if (mb.field_f > h.field_b) {
              ve.field_t = true;
            }
          }
          if (qk.field_H != null) {
            var3 = 357 - qk.field_H.field_o / 2;
            var4 = 0;
            if (pj.field_v != 0 &&
              var3 < dp.field_h &&
              var3 + qk.field_H.field_u > dp.field_h) {
              if (to.field_a > 269 - qk.field_H.field_l &&
                269 > to.field_a) {
                var4 = 1;
                ve.field_t = false;
                mb.field_f = h.field_c;
              }
              if (to.field_a > 586 &&
                qk.field_H.field_l + 586 > to.field_a) {
                var4 = 1;
                ve.field_t = true;
                mb.field_f = h.field_c;
              }
            }
            if (var4 == 0 &&
              h.field_b < mb.field_f &&
              var3 < bm.field_h &&
              bm.field_h < qk.field_H.field_u + var3) {
              if (-qk.field_H.field_l + 269 < qh.field_i &&
                qh.field_i < 269) {
                mb.field_f = h.field_b;
              }
              if (qh.field_i > 586 &&
                qh.field_i < 586 + qk.field_H.field_l) {
                mb.field_f = h.field_b;
              }
            }
          }
          if (param0) {
            bc.field_f.a(0, og.a(0, dp.field_h, to.field_a), og.a(0, bm.field_h, qh.field_i));
            if (bc.field_f.a(true)) {
              if (0 == bc.field_f.field_c) {
                stackIn_59_0 = 3;
                return stackIn_59_0;
              }
              if (bc.field_f.field_c == 1) {
                stackIn_62_0 = 2;
                return stackIn_62_0;
              }
            }
            while (ge.b(-83)) {
              bc.field_f.a(0, (byte) 104);
              if (bc.field_f.a(true)) {
                if (bc.field_f.field_c == 0) {
                  stackIn_69_0 = 3;
                  return stackIn_69_0;
                }
                if (bc.field_f.field_c == 1) {
                  stackIn_73_0 = 1;
                  return stackIn_73_0;
                }
              }
              if (pj.field_q != 13) {
                continue;
              }
              stackIn_77_0 = 1;
              return stackIn_77_0;
            }
          }
          stackIn_79_0 = 0;
          return stackIn_79_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2), "da.AA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0) {
        int discarded$0 = 0;
        ik dupTemp$1 = null;
        ik dupTemp$2 = null;
        int stackIn_41_1 = 0;
        int stackIn_59_1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var4Lifetime1;
        var6 = CrazyCrystals.field_B;
        if (this.field_k) {
          if (co.field_x > 0) {
            co.field_x = co.field_x - 1;
          }
          if (co.field_x == 0) {
            a.field_b = (ue) ((Object) this.field_n);
            this.field_n.a(this.field_b.field_i, -13880);
          }
          this.field_n.a(param0);
          return;
        }
        this.field_n.f(-116);
        this.field_n.c((byte) 111);
        this.field_n.a((byte) 20, this.field_r);
        if (this.field_f) {
          if (co.field_x > 0) {
            co.field_x = co.field_x - 1;
          }
          if (0 == co.field_x) {
            rl.a((byte) 26, this.field_r, this.field_e);
          }
          return;
        }
        if (this.field_l) {
          if (0 < co.field_x) {
            co.field_x = co.field_x - 1;
          }
          this.field_n.c(2, 40, 180);
          if (40 > this.field_n.field_f) {
            return;
          }
          if (!this.field_q) {
            rk.a(0);
            this.field_b.a(-1, true, -1);
            this.field_q = true;
            return;
          }
          this.field_q = false;
          this.field_l = false;
          if (!rc.a(-71)) {
            this.b(false);
          }
        }
        if (co.field_x < 20) {
          co.field_x = co.field_x + 1;
        }
        this.field_n.c(-1);
        if (!this.field_b.g(-1)) {
          this.field_j = this.field_j + 3 * of.field_H;
          this.e(17832);
          while (ge.b(-35)) {
            if (pj.field_q == 80) {
              if (this.field_m > this.field_b.field_c &&
                this.field_e >= 0) {
                if (0 <= this.field_e &&
                  this.f(this.field_e, 32)) {
                  this.field_b.field_c = this.field_m;
                } else if (rc.a(-69)) {
                  this.field_b.field_c = 1 + this.field_m;
                } else {
                  this.field_b.field_c = 2 + this.field_m;
                }
              } else {
                if (this.field_e < 0) {
                  if (this.field_s <= this.field_i) {
                    stackIn_41_1 = 0;
                  } else {
                    stackIn_41_1 = this.field_i;
                  }
                  this.field_e = stackIn_41_1;
                }
                this.d(24902);
                this.field_b.field_c = this.field_e;
              }
              this.field_b.field_i = false;
            }
            if (pj.field_q == 96) {
              while (true) {
                if (this.field_b.field_c != this.field_m + 2) {
                  if (this.field_b.field_c == this.field_m + 1) {
                    this.field_b.field_c = this.field_m;
                  } else {
                    if (this.field_e < 0) {
                      if (this.field_s > this.field_i) {
                        stackIn_59_1 = this.field_i;
                      } else {
                        stackIn_59_1 = 0;
                      }
                      this.field_e = stackIn_59_1;
                    }
                    this.d(24902);
                    this.field_b.field_c = this.field_e;
                  }
                } else {
                  this.field_b.field_c = this.field_m + 1;
                }
                if (this.field_m == this.field_b.field_c) {
                  if (this.field_e < 0) {
                    continue;
                  }
                  if (!this.f(this.field_e, 65)) {
                    continue;
                  }
                }
                if (this.field_m + 1 == this.field_b.field_c &&
                  !rc.a(-123)) {
                  continue;
                }
                break;
              }
              this.field_b.field_i = false;
            }
            if (pj.field_q == 97) {
              while (true) {
                if (this.field_b.field_c != this.field_m) {
                  if (this.field_m + 1 != this.field_b.field_c) {
                    if (this.field_m + 2 != this.field_b.field_c) {
                      this.field_b.field_c = this.field_m;
                    }
                  } else {
                    this.field_b.field_c = 2 + this.field_m;
                  }
                } else {
                  this.field_b.field_c = this.field_m + 1;
                }
                if (this.field_m == this.field_b.field_c) {
                  if (0 > this.field_e) {
                    continue;
                  }
                  if (!this.f(this.field_e, 8)) {
                    continue;
                  }
                }
                if (this.field_m + 1 == this.field_b.field_c &&
                  !rc.a(-115)) {
                  continue;
                }
                break;
              }
              this.field_b.field_i = false;
            }
            if (pj.field_q == 98) {
              while (true) {
                if (2 + this.field_m != this.field_b.field_c) {
                  if (this.field_b.field_c != this.field_m + 1) {
                    if (this.field_b.field_c == this.field_m) {
                      if (this.field_e < 0) {
                        this.field_e = -1 + this.field_m;
                      }
                      this.d(24902);
                      this.field_b.field_c = this.field_e;
                    } else {
                      if (0 < this.field_e) {
                        this.field_e = this.field_e - 1;
                        this.d(24902);
                        this.field_b.field_c = this.field_e;
                      } else {
                        this.field_b.field_c = 2 + this.field_m;
                        this.field_e = -1;
                      }
                    }
                  } else {
                    this.field_b.field_c = this.field_m;
                  }
                } else {
                  this.field_b.field_c = 1 + this.field_m;
                }
                if (this.field_m == this.field_b.field_c) {
                  if (this.field_e < 0) {
                    continue;
                  }
                  if (!this.f(this.field_e, 20)) {
                    continue;
                  }
                }
                if (this.field_b.field_c == this.field_m + 1 &&
                  !rc.a(-93)) {
                  continue;
                }
                if (this.d(this.field_b.field_c, -1)) {
                  continue;
                }
                break;
              }
              this.field_b.field_i = false;
            }
            if (99 == pj.field_q) {
              while (true) {
                if (this.field_b.field_c == this.field_m) {
                  this.field_b.field_c = this.field_m + 1;
                } else {
                  if (this.field_b.field_c != this.field_m + 1) {
                    if (this.field_b.field_c != 2 + this.field_m ||
                      this.field_e < 0) {
                      if (this.field_e < this.field_m - 1) {
                        this.field_e = this.field_e + 1;
                        this.d(24902);
                        this.field_b.field_c = this.field_e;
                      } else {
                        this.field_b.field_c = this.field_m;
                        this.field_e = -1;
                      }
                    }
                  } else {
                    this.field_b.field_c = this.field_m + 2;
                  }
                }
                if (this.field_b.field_c == this.field_m) {
                  if (this.field_e < 0) {
                    continue;
                  }
                  if (!this.f(this.field_e, 23)) {
                    continue;
                  }
                }
                if (this.field_b.field_c == 1 + this.field_m &&
                  !rc.a(-46)) {
                  continue;
                }
                if (this.d(this.field_b.field_c, -1)) {
                  continue;
                }
                break;
              }
              this.field_b.field_i = false;
            }
            if (pj.field_q == 104) {
              if (this.field_e < 0) {
                this.field_e = this.field_j;
              }
              this.field_e = this.field_e - 7;
              if (this.field_e < 0) {
                this.field_e = 0;
              }
              this.c(-62);
              this.d(24902);
              this.field_b.field_i = false;
              this.field_b.field_c = this.field_e;
            }
            if (pj.field_q == 105) {
              if (0 > this.field_e) {
                this.field_e = this.field_j;
              }
              this.field_e = this.field_e + 7;
              if (-1 + this.field_m < this.field_e) {
                this.field_e = -1 + this.field_m;
              }
              this.f(-101);
              this.d(24902);
              this.field_b.field_c = this.field_e;
              this.field_b.field_i = false;
            }
            if (pj.field_q == 102) {
              this.field_e = 0;
              this.d(24902);
              this.field_b.field_i = false;
              this.field_b.field_c = this.field_e;
            }
            if (103 == pj.field_q) {
              this.field_e = this.field_m - 1;
              this.f(116);
              this.d(24902);
              this.field_b.field_c = this.field_e;
              this.field_b.field_i = false;
            }
            if (pj.field_q == 84 ||
              83 == pj.field_q) {
              this.field_b.field_i = false;
              if (this.field_m + 1 == this.field_b.field_c &&
                rc.a(-52)) {
                this.field_l = true;
                return;
              }
              if (this.field_b.field_c == this.field_m + 2) {
                this.field_k = true;
                return;
              }
              if (this.field_e >= 0 &&
                this.f(this.field_e, 119)) {
                this.field_f = true;
                return;
              }
            }
            if (pj.field_q != 13) {
              continue;
            }
            this.field_b.field_i = false;
            this.field_k = true;
            return;
          }
        }
        var2 = -1;
        var3 = -1;
        for (var4 = 0; this.field_d.length > var4; var4++) {
          if (this.field_d[var4] != null && (var4 != this.field_m ||
            0 <= this.field_e &&
            this.f(this.field_e, 46))) {
            if (this.field_d[var4].b(0)) {
              var2 = var4;
            }
            if (this.field_d[var4].a(-85)) {
              var3 = var4;
            }
          }
        }
        this.field_b.a(0, var3, var2);
        if (this.a(117)) {
          return;
        }
        var7 = 0;
        var4Lifetime1 = var7;
        if (param0) {
          discarded$0 = this.c((byte) 35);
        }
        while (this.field_m > var7) {
          var5 = this.b(var7, -19);
          if (var5 < this.field_d[var7].field_d) {
            dupTemp$1 = this.field_d[var7];
            dupTemp$1.field_d = dupTemp$1.field_d + (var5 - this.field_d[var7].field_d >> 3);
          } else {
            dupTemp$2 = this.field_d[var7];
            dupTemp$2.field_d = dupTemp$2.field_d - (-var5 + this.field_d[var7].field_d >> 3);
          }
          var7++;
        }
        return;
    }

    final static void a(String param0, int param1, String param2) {
        if (sp.field_a != null) {
          sp.field_a.i((byte) -18);
        }
        mk.field_b = new vk(param0, param2, false, true, true);
        if (param1 <= 57) {
          return;
        }
        try {
          jm.field_d.a((qm) (mk.field_b), (byte) -50);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "da.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean d(int param0, int param1) {
        if (this.field_r != 1) {
          return false;
        }
        if (param1 != -1) {
          this.field_g = 94;
        }
        int var3 = 1 + this.field_s;
        if (mo.field_l == 0) {
          if (param0 >= var3 &&
            this.field_g > param0) {
            return true;
          }
          if (1 + this.field_g > var3) {
            var3 = 1 + this.field_g;
          }
        }
        if (var3 <= param0 &&
          20 > param0) {
          return true;
        }
        if (var3 < 22) {
          var3 = 22;
        }
        if (param0 >= var3 &&
          param0 < 40) {
          return true;
        }
        if (42 > var3) {
          var3 = 42;
        }
        if (var3 <= param0 &&
          param0 < 60) {
          return true;
        }
        if (60 > this.field_i &&
          param0 >= 60) {
          if (param0 >= this.field_m) {
            return false;
          }
          return true;
        }
        return false;
    }

    private final void f(int param0) {
        int var2;
        int var3;
        if (this.field_r != 1) {
          return;
        }
        var2 = 1 + this.field_s;
        if (mo.field_l == 0) {
          if (var2 <= this.field_e &&
            this.field_e < this.field_g) {
            this.field_e = this.field_g;
          }
          if (var2 < this.field_g + 1) {
            var2 = 1 + this.field_g;
          }
        }
        if (var2 <= this.field_e &&
          this.field_e < 20) {
          this.field_e = 20;
        }
        if (var2 < 22) {
          var2 = 22;
        }
        if (this.field_e >= var2 &&
          this.field_e < 40) {
          this.field_e = 40;
        }
        var3 = 91 / ((-10 - param0) / 48);
        if (var2 < 42) {
          var2 = 42;
        }
        if (this.field_i < 60) {
          if (var2 <= this.field_e &&
            this.field_e < this.field_m) {
            this.field_e = -1 + var2;
            return;
          }
        } else {
          if (this.field_e < var2) {
            return;
          }
          if (this.field_e < 60) {
            this.field_e = 60;
            return;
          }
        }
        return;
    }

    private final void b(boolean param0) {
        int var3 = 0;
        int stackIn_12_1 = 0;
        String var4;
        String var6;
        Object var7;
        int var8;
        Vector var9;
        kb var10;
        String var11;
        String var12;
        Object var7Lifetime1;
        Object var7Lifetime2;
        Object var7Lifetime3;
        Object var7Lifetime4;
        Object var7Lifetime5;
        Object var7Lifetime6;
        var8 = CrazyCrystals.field_B;
        this.field_p = (f[][]) null;
        this.field_g = 0;
        this.field_o = -1;
        if (ol.field_z[this.field_r] != null) {
          this.field_g = ol.field_z[this.field_r].size();
        }
        this.field_i = ke.field_b[this.field_r];
        if (this.field_r == 1 &&
          mo.field_l == 0) {
          this.field_g = 15;
        }
        this.field_s = 1 + this.field_i;
        if (this.field_s > this.field_g) {
          this.field_s = this.field_g;
        }
        if (this.field_i < this.field_s) {
          stackIn_12_1 = this.field_i;
        } else {
          stackIn_12_1 = 0;
        }
        this.field_e = stackIn_12_1;
        this.d(24902);
        this.field_b.field_c = -1;
        var9 = ol.field_z[this.field_r];
        this.field_d = new ik[5 + this.field_m];
        for (var3 = 0; this.field_m > var3; var3++) {
          var4 = sm.field_h;
          if (this.f(var3, 4)) {
            var10 = (kb) (var9.elementAt(var3));
            var11 = var10.field_e;
            var4 = var11;
            var4 = var11;
            var4 = var11;
            if (this.field_i == var3) {
              var4 = var11 + mf.field_r;
            }
            if (this.field_i < var3) {
              var4 = var4 + pe.field_n;
            }
          }
          if (var3 >= this.field_g && (1 != this.field_r ||
            var3 != 20 &&
            var3 != 40)) {
            var4 = ug.field_d;
            var7 = var4;
            var7Lifetime6 = var4;
          }
          var12 = 1 + var3 + ". ";
          var7Lifetime1 = var12;
          var7Lifetime2 = var12;
          var6 = this.a(var12, var3, 20);
          var7Lifetime3 = var6;
          var7Lifetime4 = var6;
          var7Lifetime5 = null;
          if (this.field_r == 1) {
            if (var3 == 0) {
              var7Lifetime5 = md.field_t[0];
            }
            if (var3 == 20) {
              var7Lifetime5 = md.field_t[1];
            }
            if (var3 == 40) {
              var7Lifetime5 = md.field_t[2];
            }
            if (var3 == 60) {
              var7Lifetime5 = md.field_t[3];
            }
          }
          this.field_d[var3] = (ik) ((Object) new an(-go.field_l.a(var12) + 410, this.b(var3, -15), var6 + var4, 0, (String) (var7Lifetime5)));
        }
        if (rc.a(-98)) {
          this.field_d[this.field_m] = (ik) ((Object) new mh(380, 398, 240, mh.field_m, 2));
          this.field_d[1 + this.field_m] = (ik) ((Object) new mh(380, 424, 240, si.field_a, 2));
        } else {
          this.field_d[this.field_m] = (ik) ((Object) new mh(380, 424, 240, mh.field_m, 2));
        }
        this.field_d[2 + this.field_m] = (ik) ((Object) new mh(380, 450, 240, ag.field_a, 2));
        this.field_d[this.field_m + 3] = (ik) ((Object) new wd(600, 200, 30, 30, param0));
        this.field_d[4 + this.field_m] = (ik) ((Object) new wd(600, 250, 30, 30, true));
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        ik stackIn_44_0 = null;
        boolean stackIn_45_1 = false;
        int var5;
        int var6;
        var6 = CrazyCrystals.field_B;
        if (param1 != 22370) {
          this.e(-89);
        }
        for (var4 = param0; var4 < param2; var4++) {
          if (null != this.field_d[var4] && ((this.field_m != var4 ||
            this.field_e >= 0 &&
            this.f(this.field_e, 42)) &&
            (var4 != this.field_m + 3 ||
            13 < this.field_m &&
            6 < this.field_j) &&
            (var4 != 4 + this.field_m ||
            this.field_m > 13 &&
            !(this.field_j >= this.c((byte) -90))))) {
            var5 = 8438015;
            if (this.field_m <= var4) {
              var5 = 12640511;
            }
            if (var4 >= this.field_g &&
              this.field_m > var4 && (this.field_r != 1 ||
              20 != var4 &&
              var4 != 40)) {
              var5 = 16760896;
            }
            if (var4 == this.field_b.field_c ||
              var4 == this.field_e) {
              var5 = 16777215;
            }
            stackIn_44_0 = this.field_d[var4];
            stackIn_45_1 = (16777215 == var5);
            ((ik) (Object) stackIn_44_0).a(stackIn_45_1, var5, 1);
          }
        }
    }

    private final void e(int param0) {
        int var2;
        var2 = this.c((byte) -99);
        if (this.field_j < 6) {
          this.field_j = 6;
        } else {
          if (var2 < this.field_j) {
            this.field_j = var2;
          }
        }
        if (param0 != 17832) {
          this.a(true);
        }
    }

    static {
    }
}
