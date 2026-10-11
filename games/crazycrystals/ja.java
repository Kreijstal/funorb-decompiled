/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ja extends ff {
    private int field_g;
    static Boolean field_f;
    static dl[] field_h;

    final static void d(byte param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        jg var4_ref_jg = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        jg var17 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = CrazyCrystals.field_B;
        try {
          ai.field_j = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = rn.field_o.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var1_int > var3; var3++) {
            var4_ref_jg = rn.field_o[var3];
            var4_ref_jg.b(32767);
            vh.a(var3, 10718);
            var5 = var4_ref_jg.field_j + var4_ref_jg.field_x >> 1;
            var6 = var4_ref_jg.field_E + var4_ref_jg.field_C >> 1;
            var7 = var4_ref_jg.field_p + var4_ref_jg.field_e >> 1;
            var8 = ai.field_j[9] >> 2;
            var9 = ai.field_j[10] >> 2;
            var10_int = ai.field_j[11] >> 2;
            var11 = kf.field_a[5] * var10_int + var8 * kf.field_a[3] + var9 * kf.field_a[4] >> 14;
            var12 = var9 * kf.field_a[7] + (var8 * kf.field_a[6] + var10_int * kf.field_a[8]) >> 14;
            var13 = kf.field_a[10] * var9 + (var8 * kf.field_a[9] + var10_int * kf.field_a[11]) >> 14;
            var2[var3] = var13 * var7 + (var11 * var5 + var12 * var6) >> 16;
          }
          var3Lifetime1 = ai.field_j[9] >> 8;
          var4 = ai.field_j[10] >> 8;
          var5Lifetime1 = ai.field_j[11] >> 8;
          var6Lifetime1 = sn.field_c << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = rl.b(var6Lifetime1, (byte) -23) >> 8;
          var9Lifetime1 = tm.a(var6Lifetime1, 500) >> 8;
          if (qh.field_i != -1 &&
            bm.field_h != -1) {
            var7Lifetime1 = qh.field_i - 320;
            var9Lifetime1 = -128;
            var8Lifetime1 = -bm.field_h + 240;
          }
          var10 = 256.0 / Math.sqrt((double)(var7Lifetime1 * var7Lifetime1 - (-(var8Lifetime1 * var8Lifetime1) - var9Lifetime1 * var9Lifetime1)));
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var12Lifetime1 = var7Lifetime1 - var3Lifetime1;
          var13Lifetime1 = -var4 + var8Lifetime1;
          var14 = -var5Lifetime1 + var9Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var12Lifetime1 * var12Lifetime1 + var13Lifetime1 * var13Lifetime1 + var14 * var14));
          var14 = (int)((double)var14 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          if (param0 != -67) {
            return;
          }
          for (var15 = 0; var15 < rn.field_o.length; var15++) {
            var16 = 0;
            for (var17_int = 1; rn.field_o.length > var17_int; var17_int++) {
              if (var21[var17_int] > var21[var16]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17 = rn.field_o[var16];
            vh.a(var16, 10718);
            for (var18 = 0; var18 < 3; var18++) {
              kf.field_a[var18] = kf.field_a[var18] + je.field_d[var15][var18];
            }
            wl.a(ai.field_j, var17, 9, false, false, kf.field_a, true);
            tg.a(var9Lifetime1, var7Lifetime1, var12Lifetime1, -9206, var14, var8Lifetime1, var17, var13Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1), "ja.H(" + param0 + ')');
        }
    }

    final static boolean a(char param0, byte param1) {
        int var2;
        boolean stackIn_11_0 = false;
        boolean decompiledFrameRemainder0 = true;
        var2 = 32 % ((-73 - param1) / 42);
        if ((param0 < 48 ||
          param0 > 57) && (param0 < 65 ||
          param0 > 90) && (97 > param0 ||
          122 < param0)) {
          stackIn_11_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_11_0 = true;
        }
        return stackIn_11_0;
    }

    final static void a(vc param0, int param1, int param2, int param3, int param4, int param5) {
        try {
          tn.e((byte) -128);
          if (param5 != -17213) {
            field_h = (dl[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ja.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void b(int param0) {
        int var5 = 0;
        dl stackIn_7_0 = null;
        ef stackIn_20_0 = null;
        String stackIn_21_1 = null;
        int var2;
        dl var3;
        int var4;
        ln var6;
        int var7;
        dl var8;
        kk var9;
        int var2Lifetime1;
        var7 = CrazyCrystals.field_B;
        this.a(7.5, true);
        if (jj.field_b >= 0) {
          for (var2 = 0; var2 < ma.field_n.length; var2++) {
            if (q.field_a[ma.field_n[var2]].field_h) {
              stackIn_7_0 = jd.field_A;
            } else {
              stackIn_7_0 = vj.field_a[11][this.field_g >> 2];
            }
            var8 = stackIn_7_0;
            var3 = var8;
            var4 = ek.field_f[ma.field_n[var2]];
            var8.c(-37 + 15 * m.field_l[var2], -37 + (240 + jj.field_b) + 0 - 24, var4);
            if (q.field_a[ma.field_n[var2]].field_i != 0) {
              go.field_l.b(Integer.toString(q.field_a[ma.field_n[var2]].field_i), 15 * (m.field_l[var2] + 9) - 37, 460 + (0 + jj.field_b - 255), var4, -1);
            }
            if (0 != pd.field_g[var2]) {
              go.field_l.b(Integer.toString(pd.field_g[var2]), -37 + (m.field_l[var2] + 9) * 15, -255 + (0 + jj.field_b) + 480, 16760896, -1);
            }
            if (!vh.field_a) {
              for (var5 = ib.field_l[var2]; r.field_i[var2] > var5; var5++) {
                var6 = (ln) (vm.field_j[var2].elementAt(var5));
                an.field_q.a(var6.field_a, -37 + m.field_l[var2] * 15, 252 + (jj.field_b - 255) + 15 * (var5 + fo.field_m[var2]), var4, -1);
                stackIn_20_0 = an.field_q;
                if (var6.field_e == 0) {
                  stackIn_21_1 = "<times>2";
                } else {
                  stackIn_21_1 = Integer.toString(var6.field_e);
                }
                ((ef) (Object) stackIn_20_0).b(stackIn_21_1, 135 + (15 * m.field_l[var2] - 37), -15 + (jj.field_b + (fo.field_m[var2] + var5) * 15 + 12), 16760896, -1);
              }
            }
          }
          for (var2Lifetime1 = 0; bp.field_b.size() > var2Lifetime1; var2Lifetime1++) {
            var9 = (kk) (bp.field_b.elementAt(var2Lifetime1));
            var9.a((byte) 35);
          }
        }
        if (param0 != -1771219320) {
          field_f = (Boolean) null;
        }
    }

    final static void a(int param0, f[][] param1, int param2, boolean param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = CrazyCrystals.field_B;
        try {
          for (var5_int = param0 + 1; var5_int < -1 - param0 + param1.length; var5_int++) {
            for (var6 = 1 + param2; var6 < -1 - param2 + param1[0].length; var6++) {
              if (param1[var5_int][var6] instanceof c) {
                na.a(var6, param3, param1, var5_int, param4 ^ 76);
              }
            }
          }
          if (param4 != 1) {
            field_f = (Boolean) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ja.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_f = null;
        if (param0 != 27348) {
          field_h = (dl[]) null;
        }
        field_h = null;
    }

    ja() {
        int incrementValue$0 = 0;
        String[] var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var8;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var4Lifetime1;
        this.field_g = 0;
        bp.field_b = new Vector();
        tb.field_d.a(wc.field_q, 100, 128 * qd.field_r, 8192);
        var2 = 31;
        var3 = 11;
        if (ul.field_g != 1) {
          if (ul.field_g != 2) {
            if (ul.field_g != 3) {
              var1 = new String[]{"      @   @@@ @ @ @@@ @        ", "      @   @   @ @ @   @        ", "      @   @@  @ @ @@  @        ", "      @   @    @  @   @        ", "      @@@ @@@  @  @@@ @@@      ", "                               ", "@@@ @@@ @ @ @@@ @   @@@ @@@ @@@", "@   @ @ @@@ @ @ @   @    @  @  ", "@   @ @ @ @ @@@ @   @@   @  @@ ", "@   @ @ @ @ @   @   @    @  @  ", "@@@ @@@ @ @ @   @@@ @@@  @  @@@"};
            } else {
              var1 = new String[]{"     @@@ @@@ @ @    @@  @@@    ", "     @    @  @@@    @ @ @ @    ", "     @@@  @  @ @    @ @ @ @    ", "     @    @  @ @    @ @ @ @    ", "     @   @@@ @ @    @@  @@@    ", "                               ", "             @                 ", "            @                  ", "      @  @ @@@ @ @ @@@ @       ", "      @@ @  @  @ @ @   @       ", "      @ @@  @  @ @ @@@ @       ", "      @  @  @  @ @ @   @       ", "      @  @ @@@  @  @@@ @@@     "};
              var3 = 13;
            }
          } else {
            var1 = new String[]{"   @  @ @@@ @ @ @@@  @  @ @    ", "   @@ @  @  @ @ @   @ @ @ @    ", "   @ @@  @  @ @ @@  @@@ @ @    ", "   @  @  @   @  @   @ @ @ @    ", "   @  @ @@@  @  @@@ @ @ @@@    ", "                            @  ", " @@@ @@@ @@@ @ @ @@@ @  @ @@@  ", "  @  @   @ @ @@@  @  @@ @ @    ", "  @  @@  @@  @ @  @  @ @@ @@   ", "  @  @   @ @ @ @  @  @  @ @    ", "  @  @@@ @ @ @ @ @@@ @  @ @@@  "};
          }
        } else {
          var1 = new String[]{"      @   @@@ @ @ @@@ @        ", "      @   @   @ @ @   @        ", "      @   @@  @ @ @@  @        ", "      @   @    @  @   @        ", "      @@@ @@@  @  @@@ @@@      ", "                               ", "  @@@ @@@ @@@ @  @ @@  @@@ @@@ ", "  @ @ @   @   @@ @ @ @ @    @  ", "  @@  @@  @@  @ @@ @ @ @@   @  ", "  @ @ @   @   @  @ @ @ @    @  ", "  @@@ @@@ @@@ @  @ @@  @@@  @  "};
        }
        kk.field_a = dp.a(37, -27919, var3 + 2, var1, 37 - var2 >> 1, 35);
        var4 = 0;
        for (var5 = 0; var5 < 3; var5++) {
          if (q.field_a[var5].field_b) {
            var4++;
          }
        }
        m.field_l = new int[var4];
        pd.field_g = new int[var4];
        ma.field_n = new int[var4];
        var4Lifetime1 = 0;
        for (var5Lifetime1 = 0; var5Lifetime1 < 3; var5Lifetime1++) {
          if (q.field_a[var5Lifetime1].field_b) {
            incrementValue$0 = var4Lifetime1;
            var4Lifetime1++;
            ma.field_n[incrementValue$0] = var5Lifetime1;
          }
        }
        var5Lifetime2 = (-(11 * var4Lifetime1) + 39) / 2;
        for (var6 = 0; var4Lifetime1 > var6; var6++) {
          m.field_l[var6] = var5Lifetime2 + var6 * 11;
        }
        if (!vh.field_a) {
          this.e(15);
        }
        var8 = 0;
        var6Lifetime1 = var8;
        while (var8 < var4Lifetime1) {
          kk.field_a[15][m.field_l[var8]] = aj.field_s;
          kk.field_a[15][m.field_l[var8] + 1] = aj.field_s;
          kk.field_a[15][2 + m.field_l[var8]] = aj.field_s;
          kk.field_a[16][m.field_l[var8]] = aj.field_s;
          kk.field_a[16][m.field_l[var8] + 1] = aj.field_s;
          kk.field_a[16][m.field_l[var8] + 2] = aj.field_s;
          kk.field_a[17][m.field_l[var8]] = aj.field_s;
          kk.field_a[17][1 + m.field_l[var8]] = aj.field_s;
          kk.field_a[17][2 + m.field_l[var8]] = aj.field_s;
          var8++;
        }
        jj.field_b = (int)Math.floor(-172.5);
        this.field_c = (l) ((Object) new ek());
    }

    final void a(int param0) {
        super.a(param0 ^ 0);
        if (param0 != -1) {
          this.field_g = 31;
        }
        kj.a((byte) 37);
    }

    private final void e(int param0) {
        int var4_int = 0;
        int var8 = 0;
        ln[] stackIn_17_0;
        ln[] stackIn_17_1;
        int stackIn_17_2;
        ba stackIn_17_3;
        ba stackIn_17_4;
        ba stackIn_18_3 = null;
        ba stackIn_18_4 = null;
        String stackIn_18_5 = null;
        int stackIn_20_2;
        fn stackIn_20_3;
        fn stackIn_20_4;
        fn stackIn_21_3 = null;
        fn stackIn_21_4 = null;
        String stackIn_21_5 = null;
        int stackIn_23_2;
        fh stackIn_23_3;
        fh stackIn_23_4;
        fh stackIn_24_3;
        fh stackIn_24_4;
        String stackIn_24_5;
        int var2;
        int var3;
        ln[] var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var5Lifetime1;
        int var6Lifetime1;
        var9 = CrazyCrystals.field_B;
        var2 = 0;
        var3 = 0;
        for (var4_int = 0; var4_int < 3; var4_int++) {
          if (q.field_a[var4_int].field_b) {
            var2++;
            var5 = 0;
            for (var6 = 0; 2 > var6; var6++) {
              var5 = var5 + q.field_a[var4_int].field_e[var6];
            }
            if (var3 < var5) {
              var3 = var5;
            }
          }
        }
        if (param0 != 15) {
          field_h = (dl[]) null;
        }
        ln[] array$0 = new ln[8];
        stackIn_17_0 = array$0;
        stackIn_17_1 = array$0;
        stackIn_17_2 = 3;
        stackIn_17_3 = null;
        stackIn_17_4 = null;
        if (var2 == 1) {
          stackIn_18_3 = null;
          stackIn_18_4 = null;
          stackIn_18_5 = og.field_y;
        } else {
          stackIn_18_3 = null;
          stackIn_18_4 = null;
          stackIn_18_5 = ra.field_a;
        }
        stackIn_17_1[stackIn_17_2] = (ln) ((Object) new ba(stackIn_18_5, 50, var2, var3));
        stackIn_20_2 = 4;
        stackIn_20_3 = null;
        stackIn_20_4 = null;
        if (var2 != 1) {
          stackIn_21_3 = null;
          stackIn_21_4 = null;
          stackIn_21_5 = je.field_h;
        } else {
          stackIn_21_3 = null;
          stackIn_21_4 = null;
          stackIn_21_5 = og.field_u;
        }
        stackIn_17_0[stackIn_20_2] = (ln) ((Object) new fn(stackIn_21_5, 50, var2, var3));
        stackIn_23_2 = 5;
        stackIn_23_3 = null;
        stackIn_23_4 = null;
        if (var2 != 1) {
          stackIn_24_3 = null;
          stackIn_24_4 = null;
          stackIn_24_5 = tf.field_b;
        } else {
          stackIn_24_3 = null;
          stackIn_24_4 = null;
          stackIn_24_5 = mn.field_m;
        }
        stackIn_17_0[stackIn_23_2] = (ln) ((Object) new fh(stackIn_24_5, 50, var2, var3));
        stackIn_17_0[6] = (ln) ((Object) new le(jn.field_l, 0, var2, var3));
        stackIn_17_0[7] = (ln) ((Object) new go(kp.field_l, -100, var2, var3));
        var4 = stackIn_17_0;
        vm.field_j = new Vector[ma.field_n.length];
        fo.field_m = new int[ma.field_n.length];
        ib.field_l = new int[ma.field_n.length];
        r.field_i = new int[ma.field_n.length];
        for (var5Lifetime1 = 0; var5Lifetime1 < vm.field_j.length; var5Lifetime1++) {
          vm.field_j[var5Lifetime1] = new Vector();
          for (var6Lifetime1 = 0; var4.length > var6Lifetime1; var6Lifetime1++) {
            var7 = var4[var6Lifetime1].a(ma.field_n[var5Lifetime1], (byte) -18);
            for (var8 = 0; var7 > var8; var8++) {
              vm.field_j[var5Lifetime1].addElement(var4[var6Lifetime1]);
            }
          }
        }
    }

    final te b(byte param0) {
        int var2;
        kk var3;
        int var4;
        var4 = CrazyCrystals.field_B;
        if (param0 != -39) {
          this.a(-27);
        }
        if (jj.field_b >= 0) {
          this.field_g = this.field_g + 1;
          if (bp.field_c[11] << 2 <= this.field_g) {
            this.field_g = fg.field_j[11] << 2;
          }
        }
        var2 = 0;
        while (bp.field_b.size() > var2) {
          var3 = (kk) (bp.field_b.elementAt(var2));
          if (!var3.b(-49)) {
            bp.field_b.removeElementAt(var2);
            continue;
          }
          var2++;
        }
        return super.b((byte) -39);
    }

    static {
    }
}
