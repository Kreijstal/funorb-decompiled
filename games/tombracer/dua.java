/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dua extends me {
    static String field_j;

    final boolean a(int param0, char param1, byte param2) {
        int var4 = 66 / ((29 - param2) / 57);
        return false;
    }

    final void a(byte param0) {
        if (param0 > -107) {
          this.a(false);
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
          field_j = (String) null;
          return false;
        }
        return false;
    }

    dua(qh param0) {
        super(param0);
    }

    final void b(byte param0) {
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_52_0 = 0;
        int var2;
        int var3;
        int var4;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        String var17;
        int var18;
        int var19;
        dt var20;
        la var21;
        la var22;
        dt var23;
        la var24;
        la var25;
        int var3Lifetime1;
        int var4Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var16Lifetime2;
        int var19Lifetime1;
        int var9Lifetime3;
        int var12Lifetime3;
        int var13Lifetime3;
        int var16Lifetime3;
        String var17Lifetime1;
        var18 = TombRacer.field_G ? 1 : 0;
        var2 = this.field_i.l(92);
        if (param0 < -13) {
          if (var2 == -1) {
            return;
          }
          var3 = 26;
          var4 = 26;
          if (!this.field_g.d((byte) 113)) {
            var4 = var4 * 2;
          }
          var23 = this.field_g.f(0, 0);
          var6 = 0;
          var7 = var23.l(-7);
          var8 = koa.b(0) >> 1;
          if (var7 % 2 == 0) {
            stackIn_49_0 = var4;
          } else {
            stackIn_49_0 = var4 >> 1;
          }
          var9 = -stackIn_49_0 + var8 + var4 * (var7 >> 1);
          if (var7 % 2 != 0) {
            stackIn_52_0 = var4 >> 1;
          } else {
            stackIn_52_0 = var4;
          }
          var10 = -stackIn_52_0 + var8 - var4 * (var7 >> 1);
          var11 = var9;
          tga.field_a.KA(10, -6 + var10, var3 + 16 + 6, var10 + var7 * var4 + 4);
          for (var12 = var6; var7 > var12; var12++) {
            var24 = var23.a(true, var12);
            if (var24 != null &&
              !var24.j(0)) {
              var13 = 16;
              var14 = var3;
              var16 = var9;
              ega.field_e.a(var13 - 4, var16 - 5);
              var9 = var9 - (var4 << 1);
              if (!var24.j(0)) {
                if (var23.d(28091)) {
                  var17 = String.valueOf(1 + var12 / 2);
                } else {
                  var17 = String.valueOf(1 + var12);
                }
                dh.a(kn.field_p, 192, 1, 0, -8 + var13, var3, 16777215, -1 + var16, 0, 29870, 1, 16 + var14, var17);
              }
            }
          }
          var9Lifetime3 = var11;
          var19 = 0;
          var12Lifetime3 = var19;
          while (this.field_g.field_P > var19) {
            var13Lifetime3 = this.field_g.field_c.field_e[var19];
            var25 = this.field_g.field_H[var13Lifetime3].f((byte) 113);
            if (var25.c(72) >= var6 &&
              var25.c(-87) < var7) {
              var15 = 16;
              var16Lifetime3 = var9Lifetime3 - var4 * this.field_g.i(1, var13Lifetime3);
              var16Lifetime3 = var16Lifetime3 + var4 * this.field_g.field_H[var13Lifetime3].f(false) / var25.s(-113);
              var15 = var15 + var3 * this.field_g.field_H[var13Lifetime3].w(63) / var25.m((byte) -86);
              this.field_g.field_H[var13Lifetime3].n((byte) -111).a(var15, 124, var16Lifetime3);
            }
            var19++;
          }
          tga.field_a.la();
          return;
        }
        field_j = (String) null;
        if (var2 == -1) {
          return;
        }
        var3Lifetime1 = 26;
        var4Lifetime1 = 26;
        if (!this.field_g.d((byte) 113)) {
          var4Lifetime1 = var4Lifetime1 * 2;
        }
        var20 = this.field_g.f(0, 0);
        var6Lifetime1 = 0;
        var7Lifetime1 = var20.l(-7);
        var8Lifetime1 = koa.b(0) >> 1;
        if (var7Lifetime1 % 2 == 0) {
          stackIn_9_0 = var4Lifetime1;
        } else {
          stackIn_9_0 = var4Lifetime1 >> 1;
        }
        var9Lifetime1 = -stackIn_9_0 + var8Lifetime1 + var4Lifetime1 * (var7Lifetime1 >> 1);
        if (var7Lifetime1 % 2 != 0) {
          stackIn_12_0 = var4Lifetime1 >> 1;
        } else {
          stackIn_12_0 = var4Lifetime1;
        }
        var10Lifetime1 = -stackIn_12_0 + var8Lifetime1 - var4Lifetime1 * (var7Lifetime1 >> 1);
        var11Lifetime1 = var9Lifetime1;
        tga.field_a.KA(10, -6 + var10Lifetime1, var3Lifetime1 + 16 + 6, var10Lifetime1 + var7Lifetime1 * var4Lifetime1 + 4);
        for (var12Lifetime1 = var6Lifetime1; var7Lifetime1 > var12Lifetime1; var12Lifetime1++) {
          var21 = var20.a(true, var12Lifetime1);
          if (var21 != null &&
            !var21.j(0)) {
            var13Lifetime1 = 16;
            var14Lifetime1 = var3Lifetime1;
            var16Lifetime1 = var9Lifetime1;
            ega.field_e.a(var13Lifetime1 - 4, var16Lifetime1 - 5);
            var9Lifetime1 = var9Lifetime1 - (var4Lifetime1 << 1);
            if (!var21.j(0)) {
              if (var20.d(28091)) {
                var17Lifetime1 = String.valueOf(1 + var12Lifetime1 / 2);
              } else {
                var17Lifetime1 = String.valueOf(1 + var12Lifetime1);
              }
              dh.a(kn.field_p, 192, 1, 0, -8 + var13Lifetime1, var3Lifetime1, 16777215, -1 + var16Lifetime1, 0, 29870, 1, 16 + var14Lifetime1, var17Lifetime1);
            }
          }
        }
        var9Lifetime2 = var11Lifetime1;
        var19Lifetime1 = 0;
        var12Lifetime2 = var19Lifetime1;
        while (this.field_g.field_P > var19Lifetime1) {
          var13Lifetime2 = this.field_g.field_c.field_e[var19Lifetime1];
          var22 = this.field_g.field_H[var13Lifetime2].f((byte) 113);
          if (var22.c(72) >= var6Lifetime1 &&
            var22.c(-87) < var7Lifetime1) {
            var15Lifetime1 = 16;
            var16Lifetime2 = var9Lifetime2 - var4Lifetime1 * this.field_g.i(1, var13Lifetime2);
            var16Lifetime2 = var16Lifetime2 + var4Lifetime1 * this.field_g.field_H[var13Lifetime2].f(false) / var22.s(-113);
            var15Lifetime1 = var15Lifetime1 + var3Lifetime1 * this.field_g.field_H[var13Lifetime2].w(63) / var22.m((byte) -86);
            this.field_g.field_H[var13Lifetime2].n((byte) -111).a(var15Lifetime1, 124, var16Lifetime2);
          }
          var19Lifetime1++;
        }
        tga.field_a.la();
        return;
    }

    public static void d(byte param0) {
        if (param0 > -125) {
          return;
        }
        field_j = null;
    }

    static {
        field_j = "Email is valid";
    }
}
