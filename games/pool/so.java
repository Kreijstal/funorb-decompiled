/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class so {
    private int[] field_f;
    static vh field_k;
    private nc field_a;
    int[] field_j;
    so[] field_b;
    static hq[] field_g;
    static lr field_h;
    eg field_i;
    int[][] field_c;
    private nc[] field_e;
    int[] field_d;

    final static void a(String[][] param0, int param1, di param2, dd[][] param3, String[][] param4, int param5, int param6, dd[][] param7, String[] param8, byte[] param9, int param10, int[] param11, di param12, String[] param13, byte[] param14, int[] param15, di param16, boolean param17, qb[] param18) {
        Object var21 = null;
        em.a((String[]) null, 1, param1, param17, param16, param10, param2, param14, param11, param12, param0, param8, param9, param18, param13, param3, param4, (byte) -75, param7, param15);
        if (param5 != -25) {
            Object var20 = null;
            so.a((String[][]) null, -73, (di) null, (dd[][]) null, (String[][]) null, 7, 14, (dd[][]) null, (String[]) null, (byte[]) null, 88, (int[]) null, (di) null, (String[]) null, (byte[]) null, (int[]) null, (di) null, false, (qb[]) null);
        }
    }

    so(ko param0) {
        this();
        ((so) this).a((byte) -107, param0);
    }

    so(so[] param0) {
        this();
        ((so) this).field_b = param0;
    }

    final void a(boolean param0, int param1, int param2, byte param3, int[] param4, boolean[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        nc var10 = null;
        int var11 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        var11 = Pool.field_O;
        var7 = param2 + -1;
        var8 = 50 / ((44 - param3) / 52);
        L0: while (true) {
          if (param1 > var7) {
            return;
          } else {
            L1: {
              var9 = ((so) this).field_j[var7];
              if (param0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              stackOut_5_0 = stackIn_5_0;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (param5[var9]) {
                stackOut_7_0 = stackIn_7_0;
                stackOut_7_1 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L2;
              } else {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = 1;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                break L2;
              }
            }
            if (stackIn_8_0 == stackIn_8_1) {
              var10 = ((so) this).field_e[var9];
              if (var10.a() << 676257729 > nc.field_Y.length) {
                this.a(param4, var10, ((so) this).field_c[var9], -78);
                this.a(1, "Model too big - radixsize:" + (var10.a() << 78744129) + " maxmodelsize:" + nc.field_Y.length + " numf:" + var10.field_P, var10, param4, ((so) this).field_c[var9]);
                var7--;
                continue L0;
              } else {
                var10.a(param4, ((so) this).field_c[var9]);
                var7--;
                continue L0;
              }
            } else {
              var7--;
              continue L0;
            }
          }
        }
    }

    final void a(byte param0, int param1, int param2, int[] param3) {
        int var5 = 0;
        int var6 = 0;
        nc var7 = null;
        int var8 = 0;
        Object var9 = null;
        L0: {
          var8 = Pool.field_O;
          if (param0 <= -57) {
            break L0;
          } else {
            var9 = null;
            int discarded$2 = this.a((int[][]) null, -64, 116, (nc[]) null);
            break L0;
          }
        }
        var5 = -1 + param2;
        L1: while (true) {
          if (param1 > var5) {
            return;
          } else {
            var6 = ((so) this).field_j[var5];
            var7 = ((so) this).field_e[var6];
            if (var7.a() << -314368671 <= nc.field_Y.length) {
              var7.a(param3, ((so) this).field_c[var6]);
              var5--;
              continue L1;
            } else {
              this.a(param3, var7, ((so) this).field_c[var6], -122);
              this.a(1, "Model too big - radixsize:" + (var7.a() << -1184293503) + " maxmodelsize:" + nc.field_Y.length + " numf:" + var7.field_P, var7, param3, ((so) this).field_c[var6]);
              var5--;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = Pool.field_O;
        if (null != ((so) this).field_d) {
            ((so) this).field_d[0] = ((so) this).field_d[0] + param0;
            ((so) this).field_d[2] = ((so) this).field_d[2] + param2;
            ((so) this).field_d[1] = ((so) this).field_d[1] + param3;
        }
        if (null != ((so) this).field_b) {
            for (var5 = 0; ((so) this).field_b.length > var5; var5++) {
                ((so) this).field_b[var5].a(param0, (byte) -111, param2, param3);
            }
        }
        if (param1 > -82) {
            ((so) this).field_b = null;
        }
    }

    private final void a(int[] param0, nc param1, int[] param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        Object var18 = null;
        L0: {
          var16 = Pool.field_O;
          var5 = param1.b();
          var6 = param1.f();
          var7 = param1.g();
          if (param3 < -62) {
            break L0;
          } else {
            var17 = null;
            ((so) this).b((byte) 83, -74, 7, (int[]) null);
            break L0;
          }
        }
        var8 = param1.h();
        var9 = param1.d();
        var10 = param1.i();
        var11 = new int[]{var5, var6, var5, var6, var5, var6, var5, var6, var5, var5, var5, var5, var6, var6, var6, var6, var5, var5, var5, var5, var6, var6, var6, var6};
        var12 = new int[]{var7, var7, var7, var7, var8, var8, var8, var8, var7, var8, var7, var8, var7, var8, var7, var8, var7, var7, var8, var8, var7, var7, var8, var8};
        var13 = new int[]{var9, var9, var10, var10, var9, var9, var10, var10, var9, var9, var10, var10, var9, var9, var10, var10, var9, var10, var9, var10, var9, var10, var9, var10};
        var14 = new int[]{6697779, 6710886, 6710886, 6710886, 3368499, 6710886, 6710886, 6710886, 3355494, 6710886, 6710886, 6710886};
        hd.a(24, 0, true, var11, var13, var12, param2);
        qg.a(var13, 0, param0, var12, 24, var11, (byte) 56);
        var15 = 0;
        L1: while (true) {
          if (-25 >= var15) {
            return;
          } else {
            if (0 <= var13[var15]) {
              if (-1 <= var13[1 + var15]) {
                if (!hk.a(101, var11[var15 - -1], var11[var15], var12[var15 - -1], var13[1 + var15], var13[var15], var12[var15])) {
                  L2: {
                    var18 = null;
                    byte discarded$1 = ic.a(var12, var15, var11, (int[]) null, var13, 4);
                    if (-1 != var13[var15]) {
                      break L2;
                    } else {
                      var13[var15] = 1;
                      break L2;
                    }
                  }
                  L3: {
                    if (-1 != var13[var15 - -1]) {
                      break L3;
                    } else {
                      var13[1 + var15] = 1;
                      break L3;
                    }
                  }
                  var11[var15] = (var11[var15] << 639546601) / var13[var15] + fb.field_q;
                  var12[var15] = (var12[var15] << -894735287) / var13[var15] + fb.field_d;
                  var11[var15 - -1] = (var11[1 + var15] << 312625769) / var13[1 + var15] + fb.field_q;
                  var12[1 + var15] = (var12[var15 + 1] << -278504919) / var13[var15 - -1] + fb.field_d;
                  qh.d(var11[var15], var12[var15], var11[var15 - -1], var12[var15 - -1], var14[var15 >> 911549729]);
                  var15 += 2;
                  continue L1;
                } else {
                  var15 += 2;
                  continue L1;
                }
              } else {
                var15 += 2;
                continue L1;
              }
            } else {
              var15 += 2;
              continue L1;
            }
          }
        }
    }

    final void a(boolean param0) {
        int var5 = 0;
        eg var6 = null;
        int[] var23 = null;
        int var8 = 0;
        eg var9 = null;
        int[] var24 = null;
        int var11 = Pool.field_O;
        int var2 = this.b(120);
        if (-1 == (var2 ^ -1)) {
            return;
        }
        eg[] var3 = new eg[var2];
        int[][] var22 = new int[var2][];
        if (param0) {
            Object var12 = null;
            ((so) this).a(true, 12, -41, (byte) -7, (int[]) null, (boolean[]) null);
        }
        int discarded$0 = this.a(123, var22, 0, var3);
        for (var5 = 0; var2 > var5; var5++) {
            var6 = var3[var5];
            var23 = var22[var5];
            for (var8 = 1 + var5; var8 < var2; var8++) {
                var9 = var3[var8];
                var24 = var22[var8];
                var6.d();
                var6.a((um) (Object) var9, -var23[0] + var24[0], -var23[1] + var24[1], -var23[2] + var24[2], false);
            }
        }
    }

    final void d(int param0) {
        int var3 = 0;
        int var4 = Pool.field_O;
        int var2 = this.b(91);
        ((so) this).field_c = new int[var2][];
        ((so) this).field_e = new nc[var2];
        ((so) this).field_j = new int[var2];
        ((so) this).field_f = new int[var2];
        if (param0 <= 88) {
            ((so) this).field_j = null;
        }
        for (var3 = 0; var3 < var2; var3++) {
            ((so) this).field_j[var3] = var3;
        }
        int discarded$0 = this.a(((so) this).field_c, 0, 6710886, ((so) this).field_e);
    }

    final void b(byte param0, int param1, int param2, int[] param3) {
        int var6 = 0;
        int[] var7 = null;
        int var8 = Pool.field_O;
        int var5 = 1 / ((param0 - -54) / 52);
        for (var6 = param1; var6 < param2; var6++) {
            var7 = ((so) this).field_c[((so) this).field_j[var6]];
            ((so) this).field_f[var6] = param3[11] * (-param3[2] + var7[2]) + ((var7[0] - param3[0]) * param3[9] - -(param3[10] * (var7[1] - param3[1])));
        }
        kf.a(param2, (byte) -104, ((so) this).field_f, ((so) this).field_j, param1);
    }

    private final int a(int[][] param0, int param1, int param2, nc[] param3) {
        int var5 = 0;
        int var6 = Pool.field_O;
        if (param2 != 6710886) {
            return 33;
        }
        if (!(((so) this).field_i == null)) {
            param0[param1] = ((so) this).field_d;
            param1++;
            param3[param1] = ((so) this).field_a;
        }
        if (!(null == ((so) this).field_b)) {
            for (var5 = 0; var5 < ((so) this).field_b.length; var5++) {
                param1 = ((so) this).field_b[var5].a(param0, param1, 6710886, param3);
            }
        }
        return param1;
    }

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int var7 = 0;
        int var8 = Pool.field_O;
        if (param3 > -33) {
            field_g = null;
        }
        if (null != ((so) this).field_i) {
            ((so) this).field_a = (nc) (Object) ((so) this).field_i.a(param5, param2, param0, param1, param4, ((so) this).field_d);
        }
        if (null != ((so) this).field_b) {
            for (var7 = 0; ((so) this).field_b.length > var7; var7++) {
                ((so) this).field_b[var7].a(param0, param1, param2, (byte) -59, param4, param5);
            }
        }
    }

    private final int a(int param0, int[][] param1, int param2, eg[] param3) {
        int var5 = 0;
        int var6 = Pool.field_O;
        if (null != ((so) this).field_i) {
            param1[param2] = ((so) this).field_d;
            param2++;
            param3[param2] = ((so) this).field_i;
        }
        if (((so) this).field_b != null) {
            for (var5 = 0; var5 < ((so) this).field_b.length; var5++) {
                param2 = ((so) this).field_b[var5].a(124, param1, param2, param3);
            }
        }
        var5 = -64 / ((56 - param0) / 63);
        return param2;
    }

    final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = Pool.field_O;
        for (var3 = param1; var3 < ((so) this).field_e.length; var3++) {
            this.a(param0, ((so) this).field_e[var3], ((so) this).field_c[var3], -104);
        }
    }

    private final int b(int param0) {
        int var3 = 0;
        int var4 = Pool.field_O;
        if (param0 <= 35) {
            return 64;
        }
        int var2 = null != ((so) this).field_i ? 1 : 0;
        if (null != ((so) this).field_b) {
            for (var3 = 0; ((so) this).field_b.length > var3; var3++) {
                var2 = var2 + ((so) this).field_b[var3].b(41);
            }
        }
        return var2;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = Pool.field_O;
        ((so) this).field_d = il.a((byte) 123, ((so) this).field_d);
        if (null != ((so) this).field_b) {
            for (var2 = 0; var2 < ((so) this).field_b.length; var2++) {
                ((so) this).field_b[var2].a(0);
            }
        }
        if (param0 != 0) {
            Object var4 = null;
            ((so) this).b((byte) 26, 84, -103, (int[]) null);
        }
    }

    private final void a(int param0, String param1, nc param2, int[] param3, int[] param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var6 = param4[0] - (-((param2.b() - -param2.f()) / 2) + param3[0]);
          var7 = param4[1] - (-((param2.g() - -param2.h()) / 2) - -param3[1]);
          var8 = param4[2] - -((param2.d() + param2.i()) / 2) + -param3[2];
          var9 = var7 * param3[4] + var6 * param3[3] + var8 * param3[5] >> 466451591;
          var10 = param3[8] * var8 + (param3[7] * var7 + param3[6] * var6) >> 1344154951;
          var8 = var8 * param3[11] + param3[9] * var6 - -(var7 * param3[10]) >> -1829224976;
          if (-1 != (var8 ^ -1)) {
            break L0;
          } else {
            var8 = -1;
            break L0;
          }
        }
        var7 = fb.field_d + var10 / var8;
        var6 = var9 / var8 + fb.field_q;
        sa.field_h.b(param1, var6, var7, 16764142, param0);
    }

    final void a(byte param0, ko param1) {
        int var6 = Pool.field_O;
        ((so) this).field_b = new so[param1.a(114)];
        int var3 = 30 / ((-64 - param0) / 40);
        int var4 = 0;
        pm var5 = (pm) (Object) param1.c((byte) -94);
        while (var5 != null) {
            var4++;
            ((so) this).field_b[var4] = var5.field_n;
            var5 = (pm) (Object) param1.f((byte) -5);
        }
    }

    public static void c(int param0) {
        field_h = null;
        field_k = null;
        field_g = null;
        if (param0 != 9933) {
            field_g = null;
        }
    }

    so() {
        ((so) this).field_a = null;
        ((so) this).field_b = null;
        ((so) this).field_j = null;
        ((so) this).field_f = null;
        ((so) this).field_c = null;
        ((so) this).field_e = null;
        ((so) this).field_i = null;
        ((so) this).field_d = hp.a(ln.field_m, (byte) 88);
    }

    so(int param0) {
        ((so) this).field_a = null;
        ((so) this).field_b = null;
        ((so) this).field_j = null;
        ((so) this).field_f = null;
        ((so) this).field_c = null;
        ((so) this).field_e = null;
        ((so) this).field_i = null;
        ((so) this).field_d = hp.a(ln.field_m, (byte) 94);
        ((so) this).field_b = new so[param0];
    }

    static {
    }
}
