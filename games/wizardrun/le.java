/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    short[] field_m;
    short[] field_O;
    private boolean field_B;
    short[] field_a;
    int[] field_l;
    static long[] field_f;
    short[] field_v;
    short[] field_z;
    short[] field_R;
    short[] field_C;
    short[] field_P;
    int[] field_q;
    short[] field_p;
    int[] field_h;
    int[] field_s;
    short[] field_I;
    short field_y;
    short[] field_G;
    int field_r;
    int[] field_t;
    short[] field_w;
    int field_K;
    short[] field_o;
    short[] field_d;
    short[] field_c;
    int[] field_F;
    byte[] field_x;
    int[] field_u;
    short[] field_Q;
    int field_M;
    int field_D;
    int field_E;
    int[] field_J;
    short[] field_k;
    static long[][] field_A;
    short field_N;
    byte field_n;
    int field_g;
    short[] field_H;
    short field_L;
    int[] field_e;
    static vd field_j;
    static int field_b;
    static int field_i;

    final void b(int param0) {
        int var8 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = wizardrun.field_H;
        if (this.field_B) {
          return;
        }
        this.field_B = true;
        var2 = 32767;
        var3 = 32767;
        if (param0 > -10) {
          field_f = (long[]) null;
        }
        var4 = 32767;
        var5 = -32768;
        var6 = -32768;
        var7 = -32768;
        for (var8 = 0; this.field_L > var8; var8++) {
          var9 = this.field_P[var8];
          var10 = this.field_a[var8];
          if (var6 < var10) {
            var6 = var10;
          }
          if (var10 < var3) {
            var3 = var10;
          }
          if (var5 < var9) {
            var5 = var9;
          }
          var11 = this.field_w[var8];
          if (var9 < var2) {
            var2 = var9;
          }
          if (var11 < var4) {
            var4 = var11;
          }
          if (var7 < var11) {
            var7 = var11;
          }
        }
        this.field_r = var5;
        this.field_K = var3;
        this.field_D = var6;
        this.field_M = var7;
        this.field_g = var2;
        this.field_E = var4;
    }

    public static void c(int param0) {
        field_j = null;
        field_f = null;
        if (param0 != 0) {
          return;
        }
        field_A = (long[][]) null;
    }

    private final void a(int param0) {
        if (param0 != -5818) {
          this.field_u = (int[]) null;
        }
        this.field_B = false;
    }

    final static void a(boolean param0, int param1, int param2) {
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        String[] stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        String stackIn_77_2 = null;
        String[] stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int stackIn_81_2 = 0;
        int stackIn_81_3 = 0;
        String stackIn_84_2 = null;
        boolean stackIn_91_0 = false;
        int stackIn_115_0 = 0;
        int stackIn_116_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = wizardrun.field_H;
        try {
          eb.field_a = true;
          oc.field_d = param1;
          if (oc.field_d == 0) {
            var3_int = bl.a((byte) 59, field_j, pe.field_z, kc.field_I, qb.field_s);
            var4 = 3 + var3_int;
            ec.field_g = new int[var4];
            a.field_b = new String[var4];
            for (var5 = 0; var5 < var4; var5++) {
              ec.field_g[var5] = -1;
            }
            h.field_s = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              a.field_b[var5] = pe.field_z[var5];
            }
            a.field_b[-3 + var4] = "";
            a.field_b[-2 + var4] = ta.field_e;
            ec.field_g[-2 + var4] = 0;
            h.field_s[0] = 4;
            a.field_b[var4 - 1] = wizardrun.field_F;
            ec.field_g[var4 - 1] = 1;
            h.field_s[1] = 5;
          } else if (oc.field_d == 1) {
            var3_int = bl.a((byte) 41, field_j, pe.field_z, kc.field_I, qb.field_s);
            var4 = 2 + var3_int;
            a.field_b = new String[var4];
            ec.field_g = new int[var4];
            for (var5 = 0; var4 > var5; var5++) {
              ec.field_g[var5] = -1;
            }
            h.field_s = new int[1];
            for (var5 = 0; var3_int > var5; var5++) {
              a.field_b[var5] = pe.field_z[var5];
            }
            a.field_b[-2 + var4] = "";
            a.field_b[-1 + var4] = wizardrun.field_F;
            ec.field_g[-1 + var4] = 0;
            h.field_s[0] = 5;
          } else if (2 != oc.field_d) {
            if (oc.field_d == 3) {
              if (!ld.field_g.field_s) {
                var3_int = bl.a((byte) -125, field_j, pe.field_z, kc.field_I, qi.field_b);
              } else {
                var3_int = bl.a((byte) 72, field_j, pe.field_z, kc.field_I, e.field_c);
              }
              var4 = 2 + var3_int;
              ec.field_g = new int[var4];
              a.field_b = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                ec.field_g[var5] = -1;
              }
              h.field_s = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                a.field_b[var5] = pe.field_z[var5];
              }
              a.field_b[-2 + var4] = "";
              a.field_b[var4 - 1] = wizardrun.field_F;
              ec.field_g[-1 + var4] = 0;
              h.field_s[0] = 5;
            } else if (oc.field_d == 4) {
              var3_int = bl.a((byte) 125, field_j, pe.field_z, kc.field_I, ib.field_b);
              var4 = var3_int + 2;
              ec.field_g = new int[var4];
              a.field_b = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                ec.field_g[var5] = -1;
              }
              h.field_s = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                a.field_b[var5] = pe.field_z[var5];
              }
              a.field_b[-2 + var4] = "";
              a.field_b[var4 - 1] = wizardrun.field_F;
              ec.field_g[var4 - 1] = 0;
              h.field_s[0] = 5;
            } else {
              if (oc.field_d != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = bl.a((byte) -100, field_j, pe.field_z, kc.field_I, wi.field_G);
              var4 = var3_int + 3;
              a.field_b = new String[var4];
              ec.field_g = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                ec.field_g[var5] = -1;
              }
              h.field_s = new int[2];
              for (var5 = 0; var5 < var3_int; var5++) {
                a.field_b[var5] = pe.field_z[var5];
              }
              a.field_b[-3 + var4] = "";
              a.field_b[var4 - 2] = tc.field_n;
              ec.field_g[-2 + var4] = 0;
              h.field_s[0] = 3;
              a.field_b[var4 - 1] = wizardrun.field_F;
              ec.field_g[var4 - 1] = 1;
              h.field_s[1] = 5;
            }
          } else {
            var3_int = bl.a((byte) 39, field_j, pe.field_z, kc.field_I, di.a(new String[]{"<br><%0><br>"}, (byte) 108, gk.field_e));
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(pe.field_z[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            ke.field_t = new String[var4];
            g.a(pe.field_z, 0, ke.field_t, 0, var4);
            ec.field_a = new String[-var4 + (var3_int - 1)];
            g.a(pe.field_z, 1 + var4, ec.field_a, 0, -var4 + var3_int - 1);
            var3_int = bl.a((byte) -112, field_j, pe.field_z, kc.field_I, di.a(new String[]{"<br><%0><br>"}, (byte) 43, ge.field_k));
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(pe.field_z[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            lb.field_f = new String[var4];
            g.a(pe.field_z, 0, lb.field_f, 0, var4);
            f.field_b = new String[-1 + (var3_int - var4)];
            g.a(pe.field_z, var4 + 1, f.field_b, 0, var3_int - var4 - 1);
            if (lb.field_f.length <= ke.field_t.length) {
              stackIn_66_0 = ke.field_t.length;
            } else {
              stackIn_66_0 = lb.field_f.length;
            }
            var5 = stackIn_66_0;
            if (f.field_b.length > ec.field_a.length) {
              stackIn_69_0 = f.field_b.length;
            } else {
              stackIn_69_0 = ec.field_a.length;
            }
            var6 = stackIn_69_0;
            var7 = var6 + (var5 + 7);
            a.field_b = new String[var7];
            ec.field_g = new int[var7];
            for (var8 = 0; var7 > var8; var8++) {
              ec.field_g[var8] = -1;
            }
            ec.field_g[1] = 0;
            h.field_s = new int[2];
            a.field_b[0] = bh.field_c;
            a.field_b[1] = ca.field_a;
            h.field_s[0] = 5;
            a.field_b[4] = hd.field_E;
            a.field_b[3] = wb.field_h;
            h.field_s[1] = 2;
            a.field_b[5] = "";
            ec.field_g[3] = 1;
            a.field_b[2] = q.field_g;
            for (var8Lifetime2 = 0; var5 > var8Lifetime2; var8Lifetime2++) {
              stackIn_76_0 = a.field_b;
              stackIn_76_1 = var8Lifetime2 + 6;
              if (0 <= lb.field_f.length + var8Lifetime2 - var5) {
                stackIn_77_2 = lb.field_f[lb.field_f.length + var8Lifetime2 - var5];
              } else {
                stackIn_77_2 = "";
              }
              stackIn_76_0[stackIn_76_1] = stackIn_77_2;
            }
            a.field_b[6 + var5] = null;
            ec.field_g[var5 + 6] = -2;
            for (var8Lifetime3 = 0; var8Lifetime3 < var6; var8Lifetime3++) {
              stackIn_81_0 = a.field_b;
              stackIn_81_1 = 7 + (var5 + var8Lifetime3);
              stackIn_81_2 = ~f.field_b.length;
              stackIn_81_3 = ~var8Lifetime3;
              if (stackIn_81_2 >= stackIn_81_3) {
                stackIn_84_2 = "";
              } else {
                stackIn_84_2 = f.field_b[var8Lifetime3];
              }
              stackIn_81_0[stackIn_81_1] = stackIn_84_2;
            }
            kh.field_g = d.a((byte) 41);
          }
          ga.field_d.field_c = h.field_s.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < a.field_b.length; var4Lifetime1++) {
            stackIn_91_0 = !(ec.field_g[var4Lifetime1] < 0);
            var5Lifetime1 = sf.a(stackIn_91_0, 110, a.field_b[var4Lifetime1]);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (oc.field_d == 2) {
            var10 = ke.field_t;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var5Lifetime2 < var10.length; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = sf.a(false, 110, var11);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = ec.field_a;
            for (var5Lifetime2Lifetime1 = 0; var4_ref_String__Lifetime1.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = sf.a(false, 110, var12);
              if (var7Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          fe.field_l = id.field_c - (var3_intLifetime1 >> 1);
          sj.field_n = var3_intLifetime1 + id.field_c - (var3_intLifetime1 >> 1);
          fh.field_f = (e.field_d + na.field_e << 1) * ga.field_d.field_c;
          for (var4Lifetime2 = 0; a.field_b.length > var4Lifetime2; var4Lifetime2++) {
            stackIn_115_0 = fh.field_f;
            if (ec.field_g[var4Lifetime2] < 0) {
              stackIn_116_1 = si.field_f;
            } else {
              stackIn_116_1 = ec.field_c;
            }
            fh.field_f = stackIn_115_0 + stackIn_116_1;
          }
          pf.field_f = ii.field_a - (fh.field_f >> 1);
          wh.field_m = new int[a.field_b.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = pf.field_f;
          while (var4Lifetime3 < a.field_b.length) {
            var6Lifetime1 = ec.field_g[var4Lifetime3];
            if (var6Lifetime1 >= 0) {
              var7Lifetime2 = sf.a(true, 110, a.field_b[var4Lifetime3]);
              var8Lifetime1 = -(var7Lifetime2 >> 1) + id.field_c;
              var5Lifetime3 = var5Lifetime3 + na.field_e;
              wh.field_m[var4Lifetime3] = new int[4];
              wh.field_m[var4Lifetime3][0] = var8Lifetime1 - vl.field_h;
              wh.field_m[var4Lifetime3][1] = var5Lifetime3;
              wh.field_m[var4Lifetime3][2] = (vl.field_h << 1) + var7Lifetime2;
              wh.field_m[var4Lifetime3][3] = ec.field_c + (e.field_d << 1);
              var5Lifetime3 = var5Lifetime3 + (na.field_e + (e.field_d << 1) + ec.field_c);
            } else {
              var5Lifetime3 = var5Lifetime3 + si.field_f;
            }
            var4Lifetime3++;
          }
          if (oc.field_d == 2) {
            ga.field_d.a(-12785, -1, param0, -1);
          } else {
            ga.field_d.a(-12785, rb.a(-578629823, pg.field_n, fi.field_B), param0, 0);
          }
          if (param2 != 15991) {
            le.c(20);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var3), "le.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = wizardrun.field_H;
        for (var5 = param3; var5 < this.field_L; var5++) {
          this.field_P[var5] = (short)(this.field_P[var5] + param2);
          this.field_a[var5] = (short)(this.field_a[var5] + param1);
          this.field_w[var5] = (short)(this.field_w[var5] + param0);
        }
        this.a(param3 - 5818);
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = wizardrun.field_H;
        for (var6 = 0; this.field_L > var6; var6++) {
          this.field_P[var6] = (short)(param3 * this.field_P[var6] / param4);
          this.field_a[var6] = (short)(this.field_a[var6] * param2 / param4);
          this.field_w[var6] = (short)(this.field_w[var6] * param0 / param4);
        }
        this.a(-5818);
        if (param1 != 108) {
          this.b(93);
        }
    }

    le() {
        this.field_B = false;
        this.field_n = (byte) 0;
    }

    static {
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        field_f = new long[11];
        field_A = new long[8][256];
        int var0 = 0;
        while (var0 < 256) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = (1 & var0) == 0 ? (long)(var1 >>> 8) : (long)(255 & var1);
            var4 = var2 << 1;
            if (var4 >= 256L) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1;
            if (!(256L > var6)) {
                var6 = var6 ^ 285L;
            }
            var8 = var2 ^ var6;
            var10 = var6 << 1;
            if (var10 >= 256L) {
                var10 = var10 ^ 285L;
            }
            var12 = var2 ^ var10;
            field_A[0][var0] = ae.a(ae.a(ae.a(var8 << 16, ae.a(var10 << 24, ae.a(ae.a(var6 << 40, ae.a(var2 << 56, var2 << 48)), var2 << 32))), var4 << 8), var12);
            for (var14 = 1; var14 < 8; var14++) {
                field_A[var14][var0] = ae.a(field_A[-1 + var14][var0] >>> 8, field_A[-1 + var14][var0] << 56);
            }
            var0++;
        }
        field_f[0] = 0L;
        for (var0 = 1; var0 <= 10; var0++) {
            var1 = 8 * (-1 + var0);
            field_f[var0] = da.a(da.a(da.a(gf.a(16711680L, field_A[5][var1 + 5]), da.a(gf.a(field_A[4][4 + var1], 4278190080L), da.a(da.a(gf.a(field_A[2][2 + var1], 280375465082880L), da.a(gf.a(field_A[0][var1], -72057594037927936L), gf.a(71776119061217280L, field_A[1][var1 + 1]))), gf.a(1095216660480L, field_A[3][var1 + 3])))), gf.a(field_A[6][var1 + 6], 65280L)), gf.a(field_A[7][var1 + 7], 255L));
        }
    }
}
