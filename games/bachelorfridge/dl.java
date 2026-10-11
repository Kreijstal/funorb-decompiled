/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl extends jla {
    static int[] field_j;
    private po field_g;
    static js field_h;
    static int[] field_i;
    static String[] field_k;

    final void e(int param0) {
        int var3 = 0;
        ad[] var2;
        ad var4;
        int var5;
        var5 = BachelorFridge.field_y;
        if (!um.a(true)) {
          ic.a(61);
        }
        if (rga.field_a != null) {
          var2 = rga.field_a;
          for (var3 = 0; var2.length > var3; var3++) {
            var4 = var2[var3];
            if (var4 != null) {
              var4.field_f.c(11);
            }
          }
        }
        super.e(param0);
    }

    final int a(int param0, boolean param1) {
        int var3;
        if (!param1) {
          this.p(-126);
        }
        var3 = param0;
        if (0 == var3) {
          return 260;
        }
        if (var3 == 1) {
          return 475;
        }
        throw new IllegalArgumentException();
    }

    final int b(int param0, int param1) {
        int var3;
        int var4;
        var4 = BachelorFridge.field_y;
        if (param1 != 40) {
          return -36;
        }
        var3 = param0;
        if (var3 == 0) {
          return 450;
        }
        if (var3 != 1) {
          throw new IllegalArgumentException();
        }
        return 600;
    }

    final int a(int param0, byte param1) {
        if (param1 > -38) {
          return -58;
        }
        return 418;
    }

    private final void p(int param0) {
        int var9 = 0;
        int var16 = 0;
        int stackIn_7_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        String var10;
        int var11;
        int var12;
        int var13;
        int var14;
        String var15;
        int var17;
        int var5Lifetime1;
        var17 = BachelorFridge.field_y;
        if (param0 != 1) {
          this.p(-74);
        }
        var2 = fr.field_o.length;
        var3 = pu.field_j.field_h.field_d;
        var4 = 40;
        var5 = 110;
        var6 = 14;
        var7 = 9 * var6 + 6;
        var8 = 560 / var3;
        for (var9 = 0; var3 > var9; var9++) {
          var10 = pu.field_j.field_h.field_y[var9];
          var11 = 16777215;
          var12 = 8947848;
          var5Lifetime1 = 110;
          stackIn_7_0 = ((1 & var9) != 0) ? 24 : 40;
          var13 = stackIn_7_0;
          dg.f(var4, -var6 + var5Lifetime1, var8, 2 * var6 + var7, 0, var13);
          this.field_g.a(var10, var8 / 2 + var4, var5Lifetime1, var11, -1);
          var14 = 1;
          var15 = "";
          for (var16 = 0; var16 < var2; var16++) {
            if (~this.a((byte) 54, var16) == ~var9) {
              if (var14 == 0) {
                var15 = var15 + ", ";
              } else {
                var14 = 0;
              }
              var15 = var15 + fr.field_o[var16];
            }
          }
          if (var14 != 0) {
            var15 = kha.field_j;
          }
          var5Lifetime1 += 20;
          dg.a(var4, var5Lifetime1, var8 + var4, var7 + var5Lifetime1);
          this.field_g.a(var15, var4 + 5, var5Lifetime1, -10 + var8, var7, var12, -1, 1, 0, var6);
          var4 = var4 + var8;
          dg.c();
        }
    }

    final int a(int param0, int param1) {
        int var3 = -2 % ((-64 - param0) / 38);
        return 40;
    }

    public dl() {
        super(3);
        this.field_g = (po) ((Object) jha.field_g);
    }

    private final kv b(int param0, byte param1) {
        if (param1 != 96) {
          dl.d((byte) 68);
        }
        return param0 == 0 ? jt.field_g : gj.field_F;
    }

    final boolean c(int param0, int param1) {
        if (param1 != 19950) {
          this.field_g = (po) null;
        }
        if (!pu.field_j.field_e.field_a &&
          param0 == 0) {
          return false;
        }
        if (null != sna.field_fb) {
          if (param0 != 0) {
            return true;
          }
          return false;
        }
        return true;
    }

    private final void o(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = BachelorFridge.field_y;
        var2 = param0;
        var3 = 0;
        while (rga.field_a.length > var2) {
          if (null != rga.field_a[var2]) {
            rga.field_a[var2].field_f.a(false, false, 2048, 2048, 0, -115, 256, (640 - raa.field_F * 80 >> 1) + (80 * var3 - 30), 250);
            var3++;
          }
          var2++;
        }
    }

    final void b(boolean param0, int param1, int param2) {
        kv var11 = this.b(param1, (byte) 96);
        int var5 = this.d(param1, 26891) ? 1 : 0;
        String var6 = this.d(false, pj.field_b[this.field_b][param1]);
        pia var7 = fn.field_n;
        int var8 = var5 != 0 ? !param0 ? 9 : 10 : 8;
        if (param2 != 0) {
          field_k = (String[]) null;
        }
        int var9 = this.a(param1, true) + this.b(param1, param2 + 40) >> 1;
        int var10 = this.a(param1, (byte) -48) + (this.a(-123, param1) >> 1);
        if (var5 == 0) {
          var11.b(var9 - (var11.field_n >> 1), var10 - 22, 128);
        } else {
          var11.e(var9 - (var11.field_n >> 1), var10 - 22);
        }
        ((po) ((Object) var7)).a(var6, var9, 6 + var10, var8, -1);
    }

    final void l(int param0) {
        kv discarded$0 = null;
        String var2 = null;
        int var3 = BachelorFridge.field_y;
        if (null != vj.field_m) {
          vj.field_m.c(0, 0);
        }
        dg.f(0, 0, 640, 480, 0, 128);
        nu.field_e.e(-5, 0);
        if (param0 != 9) {
          discarded$0 = this.b(23, (byte) -91);
        }
        dg.a(40, 60, 560, 215, 20, 0, 80);
        dg.a(40, 295, 560, 95, 20, 0, 80);
        if (li.field_m) {
          var2 = t.field_m;
        } else {
          if (null != dd.field_G) {
            var2 = lga.a(true, new String[]{dd.field_G}, jea.field_d);
          } else {
            var2 = kw.field_n;
          }
        }
        j.a(var2, 40, 16760896, true, 320, false);
        this.p(1);
        if (null != rga.field_a) {
          this.o(0);
        }
        this.c(true);
        if (!um.a(true)) {
          kla.b(true);
        }
    }

    public static void d(byte param0) {
        field_i = null;
        if (param0 != -39) {
          dl.d((byte) 31);
        }
        field_h = null;
        field_k = null;
        field_j = null;
    }

    private final int a(byte param0, int param1) {
        int var6 = 0;
        int var3;
        int var4;
        int var5;
        int var7;
        var7 = BachelorFridge.field_y;
        var3 = 0;
        var4 = -1;
        var5 = pu.field_j.field_h.field_d;
        if (param0 <= 35) {
          return -83;
        }
        for (var6 = 0; var6 < var5; var6++) {
          if (var3 < pu.field_j.field_h.field_H[var6].a(param1, (byte) 68)) {
            var4 = var6;
            var3 = pu.field_j.field_h.field_H[var6].a(param1, (byte) 68);
          } else {
            if (var3 == pu.field_j.field_h.field_H[var6].a(param1, (byte) 68)) {
              var4 = -2;
            }
          }
        }
        return var4;
    }

    final void j(int param0) {
        vj.field_m = null;
        super.j(param0);
    }

    static {
        field_k = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_i = new int[8192];
    }
}
