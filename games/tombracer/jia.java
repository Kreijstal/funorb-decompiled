/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jia implements ms {
    private lw field_b;
    private waa[] field_c;
    static jqa field_a;

    public static void a(byte param0) {
        if (param0 != 31) {
          field_a = (jqa) null;
        }
        field_a = null;
    }

    public final void a(int param0, int param1, int param2) {
        int var5 = 0;
        int stackIn_8_0 = 0;
        waa[] var4;
        waa var6;
        int var7;
        waa[] var8;
        var7 = TombRacer.field_G ? 1 : 0;
        var8 = this.field_c;
        var4 = var8;
        for (var5 = 0; var5 < var8.length; var5++) {
          var6 = var8[var5];
          var6.a(param2, 6, param0);
        }
        if (!this.field_b.field_b) {
          stackIn_8_0 = 1348493408;
        } else {
          stackIn_8_0 = (!oj.field_tb[hra.field_b]) ? 1627324416 : 805371648;
        }
        qk.a(stackIn_8_0, tga.field_a, param0, param1 ^ 20688, this.a(-8660), 20 + this.a(false), 16, -10 + param2);
        if (!oj.field_tb[hra.field_b] &&
          this.field_b.field_b) {
          qr.field_v.a((aa) null, this.a(false), 0, 0, param0, -1, (int[]) null, 1, -16711423, pg.field_A, (byte) -122, this.a(false), 0, (nh[]) null, param2, 1);
        } else if (oj.field_tb[hra.field_b] &&
          this.field_b.field_b) {
          qr.field_v.a((aa) null, this.a(false), 0, 0, param0, -1, (int[]) null, 1, -16711423, gka.field_f, (byte) 93, this.a(false), 0, (nh[]) null, param2, 1);
        } else {
          qr.field_v.a((aa) null, this.a(false), 0, 0, param0, 553648127, (int[]) null, 1, -2147417855, qqa.field_p, (byte) -38, this.a(false), 0, (nh[]) null, param2, 1);
        }
        if (param1 != 20726) {
          this.field_c = (waa[]) null;
        }
        this.field_b.a((byte) 74, param0, param2);
    }

    public final boolean a(int param0, int param1, char param2) {
        if (param0 != -18602) {
          this.b(114);
        }
        return false;
    }

    public final int a(boolean param0) {
        if (param0) {
          field_a = (jqa) null;
        }
        return 140;
    }

    public final void b(int param0) {
        waa[] var2_ref_waa__;
        int var2;
        int var3;
        waa var4_ref_waa;
        int var4;
        int var5;
        waa[] var6;
        int var3Lifetime1;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param0 != -7109) {
          field_a = (jqa) null;
        }
        var6 = this.field_c;
        var2_ref_waa__ = var6;
        for (var3 = 0; var6.length > var3; var3++) {
          var4_ref_waa = var6[var3];
          var4_ref_waa.b(-9310);
        }
        this.field_b.c(param0 + 4637);
        var2 = this.field_b.a((byte) -120);
        var3Lifetime1 = this.field_b.a(param0 ^ -7082);
        var4 = 0;
        if (var2 < 0) {
          var2 = 0;
          var4 = 1;
        } else {
          if (var2 > this.a(false)) {
            var2 = this.a(false);
            var4 = 1;
          }
        }
        if (var3Lifetime1 >= 0) {
          if (var3Lifetime1 > this.a(-8660)) {
            var3Lifetime1 = this.a(param0 - 1551);
            var4 = 1;
          }
        } else {
          var4 = 1;
          var3Lifetime1 = 0;
        }
        if (var4 != 0) {
          this.field_b.a(-115, var3Lifetime1, var2);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        if (param5 < 15) {
          jia.a((byte) -91);
        }
        if (ica.field_a) {
          tga.field_a.v(param4 >> 14, -param2 >> 14, -param6 >> 14, param0 >> 14, -param8 >> 14, -param7 >> 14, jg.a(param1, (byte) -60, param3), 1);
        } else {
          tga.field_a.ea(param4 >> 14, -param2 >> 14, -param6 >> 14, param0 >> 14, -param8 >> 14, -param7 >> 14, 2048, jg.a(param1, (byte) -107, param3), 1);
        }
    }

    public final int a(int param0) {
        if (param0 != -8660) {
          this.field_b = (lw) null;
        }
        return 140;
    }

    public jia() {
        int var1 = 0;
        this.field_c = new waa[10];
        this.field_b = new lw();
        this.field_b.a(-112, this.a(-8660) / 2, this.a(false) / 2);
        for (var1 = 0; this.field_c.length > var1; var1++) {
          this.field_c[var1] = new waa(this.a(false), this.a(-8660));
        }
    }

    static {
    }
}
