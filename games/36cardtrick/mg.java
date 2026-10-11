/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    static kc[] field_j;
    short[] field_g;
    short[] field_N;
    short[] field_J;
    private boolean field_L;
    short[] field_a;
    short[] field_l;
    short[] field_p;
    int field_s;
    short[] field_I;
    short[] field_H;
    int[] field_w;
    int[] field_F;
    int field_u;
    short[] field_t;
    short[] field_v;
    short[] field_n;
    short[] field_d;
    short[] field_k;
    int[] field_h;
    short field_c;
    short field_M;
    short[] field_Q;
    int[] field_o;
    int field_i;
    int field_f;
    int[] field_P;
    static String field_K;
    short[] field_O;
    static int field_q;
    int[] field_G;
    short[] field_B;
    short field_C;
    int[] field_x;
    short[] field_r;
    int field_e;
    byte[] field_D;
    int[] field_m;
    int field_z;
    short[] field_b;
    byte field_E;
    int[] field_y;

    private final void a(int param0) {
        this.field_L = false;
        int var2 = -31 / ((-56 - param0) / 59);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = Main.field_T;
        for (var5 = 0; this.field_C > var5; var5++) {
          this.field_r[var5] = (short)(this.field_r[var5] + param1);
          this.field_b[var5] = (short)(this.field_b[var5] + param2);
          this.field_O[var5] = (short)(this.field_O[var5] + param3);
        }
        if (param0) {
          field_K = (String) null;
        }
        this.a(99);
    }

    final static void a(int param0, boolean param1) {
        if (param0 != 50) {
          throw new IllegalArgumentException();
        }
        if (!param1) {
          mg.c((byte) -99);
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = Main.field_T;
        if (0 > h.field_F) {
          return;
        }
        var3 = -135 + param0;
        var4 = param2 - 35;
        var5 = 256;
        if (75 > h.field_F) {
          var5 = (h.field_F << 8) / 75;
        }
        if (h.field_F > 200) {
          var5 = (-h.field_F + 250 << 8) / 50;
        }
        dl.a(88, id.field_e);
        jb.b();
        vj.d();
        de.b(33);
        if (var5 < 256) {
          vj.a(0, 0, vj.field_l, vj.field_g, 0, 256 - var5);
        }
        gg.a(14756);
        if (h.field_F < 150) {
          id.field_e.c(var3, var4);
        } else {
          sg.field_d.e(15 + var3, 10 + var4, var5);
        }
        var6 = h.field_F - 125;
        if (param1 != 207) {
          field_j = (kc[]) null;
        }
        if (0 < var6 &&
          var6 < 50) {
          if (var6 >= 20) {
            if (var6 < 30) {
              rc.field_i.b(var3, var4, 256);
            } else {
              var7 = (12800 - var6 * 256) / 20;
              rc.field_i.b(var3, var4, var7);
            }
          } else {
            var7 = 256 * var6 / 20;
            rc.field_i.b(var3, var4, var7);
          }
        }
        var6Lifetime1 = h.field_F - 140;
        if (0 < var6Lifetime1) {
          var7Lifetime1 = 256;
          if (var6Lifetime1 < 20) {
            var7Lifetime1 = 256 * var6Lifetime1 / 20;
          }
          qg.field_z.e(15 + var3, 10 + var4, var7Lifetime1 * var5 >> 8);
        }
        return;
    }

    final static void c(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        String var6 = null;
        String var7 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = Main.field_T;
        int var1_intLifetime1;
        int var1_intLifetime2;
        int var3Lifetime1;
        int var4Lifetime1;
        try {
          cj.field_l = new int[]{105, 151, 380, 418, 411, 373, 368, 368, 368, 368, 368};
          nk.field_a = new int[]{217, 216, 34, 263, 347, 148, 149, 149, 149, 104, 62};
          fh.field_G = new int[][]{new int[]{0, 5, 1, 3, 4, 8, 6, 9, 12}, new int[]{7, 3, 4, 5, 10}, new int[]{11}, new int[]{17}, new int[]{16, 17}, new int[]{16, 17}, new int[]{15}, new int[]{15}, new int[]{15}, new int[]{13, 14}, new int[]{21, 17}};
          kb.field_b = new int[]{36, 36, 64, 64, 36, 36, 36, 36, 36, 36, 36};
          ia.field_c = new kc[22];
          var1_int = qa.field_b.a(bk.field_c[3]);
          var2 = qa.field_b.a(bk.field_c[4]);
          if (var1_int < var2) {
            var1_int = var2;
          }
          t.field_i = -80 + (207 + var1_int) >> 1;
          for (var1_intLifetime1 = 0; var1_intLifetime1 <= 14; var1_intLifetime1++) {
            ia.field_c[var1_intLifetime1] = new kc(207, 34);
            ia.field_c[var1_intLifetime1].c();
            vj.c(0, 0, 207, 34, 6962948);
            vj.g(4, 4, 203, 30);
            field_j[4].b(0, 0);
            var6 = bk.field_c[var1_intLifetime1];
            var3 = qa.field_b.a(var6);
            var4 = -var3 + 207 >> 1;
            if (var1_intLifetime1 == 3 ||
              4 == var1_intLifetime1) {
              var4 = -var3 + t.field_i;
            }
            a.a(16777214, var6, -1, var4, 16777215, 23);
          }
          if (param0 != 96) {
            mg.a(-44, 89, -75);
          }
          for (var1_intLifetime2 = 15; var1_intLifetime2 <= 21; var1_intLifetime2++) {
            ia.field_c[var1_intLifetime2] = new kc(120, 31);
            ia.field_c[var1_intLifetime2].c();
            vj.c(0, 0, 207, 34, 6962948);
            vj.g(2, 2, 118, 29);
            field_j[4].b(0, 0);
            var7 = bk.field_c[var1_intLifetime2];
            var3Lifetime1 = qa.field_b.a(var7);
            var4Lifetime1 = 120 - var3Lifetime1 >> 1;
            a.a(16777214, var7, param0 ^ -97, var4Lifetime1, 16777215, 23);
          }
          gf.field_e.a(200);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "mg.B(" + param0 + ')');
        }
    }

    final static void b(byte param0) {
        int var8_int = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int var19 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        uh var4_ref_uh = null;
        int var5 = 0;
        ad var6 = null;
        int var6_int = 0;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
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
        w var27 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = Main.field_T;
        try {
          var27 = rd.field_j;
          if (param0 >= -119) {
            field_K = (String) null;
          }
          var2 = var27.f(-121);
          if (var2 == 0) {
            var3 = var27.d((byte) 72);
            var4_ref_uh = (uh) (tl.field_a.a((byte) 74));
            while (var4_ref_uh != null) {
              if (var3 != var4_ref_uh.field_g) {
                var4_ref_uh = (uh) (tl.field_a.b((byte) -119));
                continue;
              }
              break;
            }
            if (var4_ref_uh == null) {
              mc.a((byte) -127);
              return;
            }
            var5 = var27.f(-120);
            if (var5 != 0) {
              var6_int = var4_ref_uh.field_k;
              c.field_w[0].field_d = false;
              c.field_w[0].field_f = null;
              var7 = var4_ref_uh.field_h;
              c.field_w[0].field_e = ri.field_c;
              for (var8_int = 1; var8_int < var5; var8_int++) {
                c.field_w[var8_int].field_e = var27.c(false);
                c.field_w[var8_int].field_d = false;
                if (var27.f(56) == 1) {
                  c.field_w[var8_int].field_f = var27.c(false);
                } else {
                  c.field_w[var8_int].field_f = null;
                }
              }
              dupTemp$0 = new String[3][var6_int];
              var4_ref_uh.field_m = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6_int];
              dupTemp$1 = new long[3][var6_int];
              var4_ref_uh.field_j = dupTemp$1;
              var10 = dupTemp$1;
              dupTemp$2 = new int[3][var6_int * var7];
              var4_ref_uh.field_q = dupTemp$2;
              var11 = dupTemp$2;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var27.f(-126);
              if (var18 > 0) {
                for (var19 = 0; var19 < var18; var19++) {
                  var20 = var27.f(121);
                  var21 = c.field_w[var20].field_e;
                  var22 = var27.d(true);
                  var24 = var27.field_i;
                  if (var6_int > var19) {
                    var8[0][var12] = var21;
                    var9[0][var12] = c.field_w[var20].field_f;
                    var10[0][var12] = var22;
                    var12++;
                    for (var25 = 0; var7 > var25; var25++) {
                      incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var27.e((byte) 126);
                    }
                  }
                  if (var21 != null &&
                    rc.a(true, var21)) {
                    var8[1][var13] = ri.field_c;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var13++;
                    var27.field_i = var24;
                    for (var25Lifetime1 = 0; var7 > var25Lifetime1; var25Lifetime1++) {
                      incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var27.e((byte) 125);
                    }
                  }
                  if (var6_int > var14 &&
                    !c.field_w[var20].field_d) {
                    c.field_w[var20].field_d = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = c.field_w[var20].field_f;
                    var10[2][var14] = var22;
                    var14++;
                    var27.field_i = var24;
                    for (var25Lifetime2 = 0; var25Lifetime2 < var7; var25Lifetime2++) {
                      incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var27.e((byte) 124);
                    }
                  }
                }
              }
            }
            var4_ref_uh.field_o = true;
            var4_ref_uh.c(104);
            return;
          }
          if (1 == var2) {
            var3Lifetime1 = var27.d((byte) 72);
            var4 = var27.d(true);
            var6 = (ad) (od.field_b.a((byte) 74));
            while (var6 != null) {
              if (var6.field_p != var3Lifetime1) {
                var6 = (ad) (od.field_b.b((byte) -122));
                continue;
              }
              break;
            }
            if (var6 == null) {
              mc.a((byte) -125);
              return;
            }
            var6.field_h = var4;
            var6.c(83);
            return;
          }
          k.a((Throwable) null, (byte) -101, "HS1: " + aj.a((byte) 92));
          mc.a((byte) -126);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "mg.F(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = Main.field_T;
        int var6 = 0;
        if (param2 != -6670) {
          this.a(-1, -111, -21, -90, 53);
        }
        while (this.field_C > var6) {
          this.field_r[var6] = (short)(this.field_r[var6] * param4 / param3);
          this.field_b[var6] = (short)(this.field_b[var6] * param0 / param3);
          this.field_O[var6] = (short)(this.field_O[var6] * param1 / param3);
          var6++;
        }
        this.a(param2 ^ -6671);
    }

    public static void b(int param0) {
        field_j = null;
        if (param0 <= 30) {
          return;
        }
        field_K = null;
    }

    final void a(byte param0) {
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
        var12 = Main.field_T;
        if (this.field_L) {
          return;
        }
        this.field_L = true;
        var2 = 32767;
        var3 = 32767;
        var4 = 32767;
        var5 = -32768;
        var6 = -32768;
        var7 = -32768;
        for (var8 = 0; var8 < this.field_C; var8++) {
          var9 = this.field_r[var8];
          var10 = this.field_b[var8];
          var11 = this.field_O[var8];
          if (var2 > var9) {
            var2 = var9;
          }
          if (var10 < var3) {
            var3 = var10;
          }
          if (var6 < var10) {
            var6 = var10;
          }
          if (var9 > var5) {
            var5 = var9;
          }
          if (var7 < var11) {
            var7 = var11;
          }
          if (var4 > var11) {
            var4 = var11;
          }
        }
        this.field_s = var3;
        this.field_i = var7;
        this.field_u = var6;
        this.field_f = var5;
        this.field_e = var2;
        this.field_z = var4;
        if (param0 < 110) {
          this.a(false, -125, -90, -67);
        }
    }

    mg() {
        this.field_L = false;
        this.field_E = (byte) 0;
    }

    static {
        field_K = "Create a free Account";
    }
}
