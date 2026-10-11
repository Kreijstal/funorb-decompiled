/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn extends we {
    static String field_r;

    final boolean b(int param0, int param1) {
        if (param1 != -30487) {
          return true;
        }
        return this.c(param0, 0);
    }

    private final int h(int param0, int param1) {
        if (param1 != 1) {
          this.b(true, true, 29);
        }
        return this.field_m[param0].e(param1 ^ -164);
    }

    public static void d(int param0) {
        if (param0 != 72) {
          return;
        }
        field_r = null;
    }

    final int a(int param0, byte param1) {
        if (param1 != -48) {
          this.a(-68, false);
        }
        return this.a((byte) 112, param0) + this.h(param0, 1);
    }

    final void b(boolean param0, boolean param1, int param2) {
        int var4;
        int var5;
        int var6;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param2 < 0) {
          return;
        }
        if (this.field_m.length <= param2) {
          return;
        }
        if (!this.b(param2, -30487)) {
          return;
        }
        super.b(param0, param1, param2);
        var4 = this.field_m[param2].field_g;
        var5 = var4;
        if (var5 != 10) {
          if (11 == var5 &&
            this.field_k.a(false)) {
            this.b(-103, param1);
          }
        } else {
          if (this.field_k.a(param0)) {
            this.a(1, param1);
          }
        }
    }

    final void a(boolean param0, int param1, byte param2) {
        int stackIn_27_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_57_0 = 0;
        String[] var4;
        String[] var5;
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
        String[] var16;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var11Lifetime2;
        int var11Lifetime2Lifetime1;
        var15 = TombRacer.field_G ? 1 : 0;
        be.a(sea.field_q.toUpperCase(), 1, qr.field_v, 2497287, -1, 160, 1, param1 - 20, 0, -1, (byte) 60, 320);
        ua.a(4, qr.field_v, rka.a(td.field_r, true), 600, -1, param1 + 72, 11288327);
        var16 = vna.field_d[td.field_r];
        var4 = var16;
        var5 = up.field_h[td.field_r];
        ura.a(-10985);
        var6 = Math.max(var5.length, var16.length);
        var7 = 80 + param1;
        for (var8 = 0; var8 < var6; var8++) {
          var9 = 80;
          var10 = 470;
          if (var8 < var5.length) {
            if (null == no.field_m) {
              return;
            }
            if (no.field_m[td.field_r].length > var8 &&
              no.field_m[td.field_r][var8] != -1) {
              var10 -= 60;
              var9 += 60;
            }
          }
          if (var8 < var16.length &&
            null != var16[var8]) {
            var7 += 30;
            var11 = 0;
            if (var8 < no.field_m[td.field_r].length &&
              no.field_m[td.field_r][var8] == -2) {
              var11 -= 60;
            }
            ts.a(-1, -22, var7, var16[var8].toUpperCase(), var9 + var11, eda.field_f, 11288327);
            var7 += 10;
          }
          if (var5.length > var8) {
            if (var8 < no.field_m[td.field_r].length &&
              0 <= no.field_m[td.field_r][var8] &&
              no.field_p[td.field_r][var8] != 3) {
              var11Lifetime2 = no.field_q[td.field_r][var8];
              if (27 != no.field_u[td.field_r][var8]) {
                if (1 == no.field_p[td.field_r][var8]) {
                  var12 = 20;
                  var13 = var11Lifetime2;
                  var14 = 4;
                  hp.a(var13, 512 + no.field_r[td.field_r][var8], no.field_s[td.field_r][var8], wma.a(var14, 12166, 1), -1918106173, var7 + no.field_k[td.field_r][var8] + var12, -50 + var9);
                }
              } else {
                var12 = -4;
                var13 = var11Lifetime2;
                stackIn_27_0 = (no.field_p[td.field_r][var8] == 1) ? 1 : 109;
                var14 = stackIn_27_0;
                hp.a(var13, no.field_r[td.field_r][var8], no.field_s[td.field_r][var8], wma.a(var14, 12166, 1), -1918106173, var12 + (no.field_k[td.field_r][var8] + var7), -50 + var9);
              }
              if (no.field_p[td.field_r][var8] == 2) {
                hp.a(var11Lifetime2, 1024, no.field_s[td.field_r][var8], wma.a(31, 12166, 1), -1918106173, var7 + no.field_k[td.field_r][var8] - 16, var9 - 50);
                hp.a(var11Lifetime2, 1024, no.field_s[td.field_r][var8], wma.a(29, 12166, 1), -1918106173, -16 + var7 + no.field_k[td.field_r][var8], var9 - 65);
                hp.a(var11Lifetime2, 0, no.field_s[td.field_r][var8], wma.a(29, 12166, 1), -1918106173, var7 + (no.field_k[td.field_r][var8] + 16), var9 - 34);
                hp.a(var11Lifetime2, 512, no.field_s[td.field_r][var8], wma.a(29, 12166, 1), -1918106173, var7 + no.field_k[td.field_r][var8] + 16, -65 + var9);
                hp.a(var11Lifetime2, 1536, no.field_s[td.field_r][var8], wma.a(29, 12166, 1), -1918106173, var7 + no.field_k[td.field_r][var8] - 16, -34 + var9);
              }
              hp.a(var11Lifetime2, no.field_r[td.field_r][var8], no.field_s[td.field_r][var8], wma.a(no.field_u[td.field_r][var8], 12166, no.field_m[td.field_r][var8]), -1918106173, var7 + no.field_k[td.field_r][var8], -50 + var9);
            }
            var11Lifetime2Lifetime1 = kn.field_p.a((aa) null, var10, 15, 0, var7, fm.a(false, -1), wca.field_l, 0, fm.a(false, 65793), var5[var8], (byte) 99, 640, 0, id.field_h, var9, 0);
            if (td.field_r > 0) {
              var11Lifetime2Lifetime1 = Math.max(var11Lifetime2Lifetime1, 3);
            }
            var7 = var7 + (10 + 15 * var11Lifetime2Lifetime1);
          }
        }
        se.f((byte) -6);
        if (param2 >= -9) {
          return;
        }
        if (0 == td.field_r) {
          var8Lifetime1 = 205 + param1;
          stackIn_45_0 = (0L >= bva.b((byte) -107) / 1000L % 2L) ? 0 : 1;
          var9Lifetime1 = stackIn_45_0;
          stackIn_48_0 = (var9Lifetime1 != 0) ? 0 : 4;
          var10Lifetime1 = stackIn_48_0;
          stackIn_51_0 = (var9Lifetime1 == 0) ? 6 : 2;
          var11Lifetime1 = stackIn_51_0;
          stackIn_54_0 = (var9Lifetime1 != 0) ? 1 : 7;
          var12Lifetime1 = stackIn_54_0;
          taa.a((byte) -112, var8Lifetime1, var10Lifetime1, 80);
          stackIn_57_0 = (var9Lifetime1 == 0) ? 5 : 3;
          var13Lifetime1 = stackIn_57_0;
          taa.a((byte) -107, var8Lifetime1, var12Lifetime1, 96);
          taa.a((byte) -126, var8Lifetime1, var11Lifetime1, 112);
          taa.a((byte) -108, var8Lifetime1, var13Lifetime1, 127);
          taa.a((byte) -107, 25 + var8Lifetime1, 9, 115);
          taa.a((byte) -123, var8Lifetime1 + 50, 8, 118);
          taa.a((byte) -108, var8Lifetime1 + 75, 10, 115);
          taa.a((byte) -109, var8Lifetime1 + 100, 11, 106);
        }
    }

    final int g(int param0, int param1) {
        if (param1 != 30) {
          field_r = (String) null;
        }
        return this.field_n - this.field_m[param0].d(11919) / 2;
    }

    private final void a(int param0, boolean param1) {
        int var3 = 0;
        if (param0 != 1) {
          return;
        }
        td.field_r = td.field_r - 1;
        if (!param1 &&
          td.field_r == 0) {
          var3 = fna.field_h;
          fna.field_h = 97;
          this.field_k.a(1, 63);
          fna.field_h = var3;
        }
    }

    final boolean a(int param0, char param1, int param2) {
        int var4;
        int var5;
        int var6;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        stackIn_3_0 = (this.c(0, 0)) ? 0 : 1;
        var4 = stackIn_3_0;
        stackIn_6_0 = (this.c(2, 0)) ? 2 : 1;
        var5 = stackIn_6_0;
        if (13 != param0) {
          if (!this.field_k.a((byte) -127)) {
            do {
              if (param0 == 97) {
                if (var4 < this.field_k.field_h) {
                  this.field_k.b(this.field_k.field_h - 1, -115);
                } else {
                  this.field_k.b(var5, 89);
                }
              }
              if (param0 == 96) {
                if (this.field_k.field_h >= 0 &&
                  var5 > this.field_k.field_h) {
                  this.field_k.b(1 + this.field_k.field_h, 80);
                } else {
                  this.field_k.b(var4, param2 + 94);
                }
              }
            } while (!this.b(this.field_k.field_h, -30487));
          }
          this.field_k.b((byte) -50);
          this.b(false, false, this.field_k.field_h);
        } else {
          this.c(-6);
        }
        if (param2 == 1) {
          return true;
        }
        this.a(116, '￟', -90);
        return true;
    }

    final int a(byte param0, int param1) {
        int discarded$0 = 0;
        int var3 = this.h(param1, 1);
        if (param0 <= 111) {
          discarded$0 = this.h(-63, 56);
        }
        if (param1 == 1) {
          return 0;
        }
        if (param1 == 2) {
          return 640 - var3;
        }
        return -(var3 >> 1) + 320;
    }

    private final void b(int param0, boolean param1) {
        int var3 = 0;
        td.field_r = td.field_r + 1;
        if (param0 > -89) {
          return;
        }
        if (!param1 &&
          10 == td.field_r) {
          var3 = fna.field_h;
          fna.field_h = 96;
          this.field_k.a(1, 95);
          fna.field_h = var3;
        }
    }

    jn(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final boolean c(int param0, int param1) {
        if (param1 != 0) {
          this.b(57, true);
        }
        if (param0 == 1 &&
          td.field_r == 0) {
          return false;
        }
        if (param0 == 2 &&
          10 == td.field_r) {
          return false;
        }
        return super.c(param0, 0);
    }

    static {
        field_r = "Orb points: ";
    }
}
