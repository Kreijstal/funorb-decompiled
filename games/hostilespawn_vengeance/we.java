/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    private int field_f;
    private int field_c;
    oc field_d;
    private int field_e;
    static String field_h;
    private int field_a;
    static ll field_g;
    static int field_b;

    final void b(byte param0) {
        if (param0 >= -35) {
          this.field_e = -114;
        }
    }

    final void a(byte param0) {
        int var21 = 0;
        int var22 = 0;
        int var2;
        int var3;
        oc var4;
        int var5;
        int var6;
        oc var7;
        double var8;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var23;
        int var24;
        int var25;
        var25 = HostileSpawn.field_I ? 1 : 0;
        if (this.field_d.field_e < 0) {
          return;
        }
        if (of.field_d == dn.field_i) {
          return;
        }
        var2 = uj.field_p.field_e;
        var3 = uj.field_p.field_g;
        var4 = mm.field_m[0].field_j;
        var7 = new oc(this.field_d.field_e - var4.field_e, -var4.field_g + this.field_d.field_g);
        var8 = var7.a(param0 ^ -25098);
        var6 = this.field_c;
        if (var8 < 0.0) {
          var8 = var8 + 256.0;
        }
        var5 = this.field_e;
        var5 = var5 - (int)(200.0 * Math.sin(var8 * 3.141592653589793 / 128.0));
        var6 = var6 - (int)(200.0 * Math.cos(3.141592653589793 * var8 / 128.0));
        if (param0 != -46) {
          return;
        }
        if (Math.abs(var7.field_e) <= 13 &&
          Math.abs(var7.field_g) <= 10) {
          var6 = this.field_d.field_g * 24 - var3;
          var5 = -var2 + 24 * this.field_d.field_e;
          if (bm.field_c == 0) {
            if (ha.field_t == 0) {
              var5 += 24;
            }
            var6 += 56;
            if (ha.field_t == 1) {
              var5 += 8;
            }
            var6 -= 40;
            if (2 == ha.field_t) {
              var6 -= 24;
            }
          }
        }
        this.field_f = (this.field_f * 9 + var6) / 10;
        this.field_a = (var5 + this.field_a * 9) / 10;
        if (var5 > this.field_a) {
          this.field_a = this.field_a + 1;
        }
        if (var6 > this.field_f) {
          this.field_f = this.field_f + 1;
        }
        if (var5 < this.field_a) {
          this.field_a = this.field_a - 1;
        }
        if (var6 < this.field_f) {
          this.field_f = this.field_f - 1;
        }
        li.field_t.e(this.field_a - li.field_t.field_z / 2, -(li.field_t.field_A / 2) + this.field_f);
        var10 = this.field_a - (int)(8.0 * Math.sin(3.141592653589793 * var8 / 128.0));
        var11 = this.field_f - (int)(Math.cos(3.141592653589793 * var8 / 128.0) * 8.0);
        var12 = this.field_a - (int)(Math.sin((96.0 + var8) * 3.141592653589793 / 128.0) * 10.0);
        var13 = this.field_f - (int)(Math.cos((96.0 + var8) * 3.141592653589793 / 128.0) * 10.0);
        var14 = this.field_a - (int)(10.0 * Math.sin(3.141592653589793 * (-96.0 + var8) / 128.0));
        var15 = this.field_f - (int)(Math.cos((-96.0 + var8) * 3.141592653589793 / 128.0) * 10.0);
        li.a(var13, -1, var11, var15, var10, var14, 13684736, var12);
        si.e(this.field_a, this.field_f, 1, 0);
        si.b(this.field_a, this.field_f, 2, 7368704);
        var16 = Math.max(this.field_f - 10, 1);
        var17 = Math.min(10 + this.field_f, 478);
        var18 = Math.max(this.field_a - 10, 1);
        var19 = Math.min(this.field_a + 10, 638);
        var20 = var16 * 640;
        for (var21 = var16; var21 < var17; var21++) {
          for (var22 = var18; var22 < var19; var22++) {
            var23 = var22 + var20;
            if ((255 & si.field_i[var23] >> 16) < 100) {
              var24 = 0;
              if (13684736 == si.field_i[var23 - 1]) {
                var24++;
              }
              if (si.field_i[1 + var23] == 13684736) {
                var24++;
              }
              if (si.field_i[-640 + var23] == 13684736) {
                var24++;
              }
              if (si.field_i[var23 + 640] == 13684736) {
                var24++;
              }
              if (var24 >= 2) {
                si.field_i[var23] = 7368704;
              }
            }
          }
          var20 += 640;
        }
        return;
    }

    public static void c(byte param0) {
        int var1 = 93 / ((param0 - 55) / 49);
        field_g = null;
        field_h = null;
    }

    we(oc param0) {
        this.field_c = 232;
        this.field_e = 312;
        try {
          this.field_d = param0;
          this.field_f = this.field_c;
          this.field_a = this.field_e;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "we.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = "The entrance to this shuttle bay is blocked off.";
        field_g = new ll();
        field_b = -1;
    }
}
