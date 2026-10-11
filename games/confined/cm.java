/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    short[] field_c;
    private static short[] field_m;
    short[] field_a;
    short[] field_n;
    int field_k;
    private byte[] field_d;
    short[] field_l;
    private static byte[] field_h;
    private static short[] field_b;
    short[] field_i;
    private static short[] field_e;
    private static short[] field_f;
    private static short[] field_j;
    ij field_g;

    public static void a() {
        field_e = null;
        field_j = null;
        field_b = null;
        field_f = null;
        field_m = null;
        field_h = null;
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4;
        for (var3 = 0; var3 < this.field_k; var3++) {
          var4 = this.field_i[var3];
          if (this.field_g.field_n[var4] == 0 ||
            this.field_g.field_n[var4] == 1) {
            this.field_c[var3] = (short)(this.field_c[var3] * param0 / param1);
            this.field_a[var3] = (short)(this.field_a[var3] * param0 / param1);
            this.field_l[var3] = (short)(this.field_l[var3] * param0 / param1);
          }
        }
    }

    cm(byte[] param0, ij param1) {
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        kg var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        kg var14 = null;
        int var9Lifetime1;
        this.field_g = null;
        this.field_k = -1;
        this.field_g = param1;
        try {
          var14 = new kg(param0);
          var4 = new kg(param0);
          var14.c(32);
          var14.field_n = var14.field_n + 2;
          var5 = var14.c(32);
          var6 = 0;
          var7 = -1;
          var8 = -1;
          var4.field_n = var14.field_n + var5;
          for (var9 = 0; var9 < var5; var9++) {
            var10 = this.field_g.field_n[var9];
            if (var10 == 0) {
              var7 = var9;
            }
            var11 = var14.c(32);
            if (var11 > 0) {
              if (var10 == 0) {
                var8 = var9;
              }
              field_e[var6] = (short)var9;
              var12 = 0;
              if (var10 == 3) {
                var12 = 128;
              }
              if ((var11 & 1) == 0) {
                field_j[var6] = (short)var12;
              } else {
                field_j[var6] = (short)var4.b(1647);
              }
              if ((var11 & 2) == 0) {
                field_b[var6] = (short)var12;
              } else {
                field_b[var6] = (short)var4.b(1647);
              }
              if ((var11 & 4) == 0) {
                field_f[var6] = (short)var12;
              } else {
                field_f[var6] = (short)var4.b(1647);
              }
              field_h[var6] = (byte)(var11 >>> 3 & 3);
              if (var10 == 2) {
                field_j[var6] = (short)(((field_j[var6] & 255) << 3) + (field_j[var6] >> 8 & 7));
                field_b[var6] = (short)(((field_b[var6] & 255) << 3) + (field_b[var6] >> 8 & 7));
                field_f[var6] = (short)(((field_f[var6] & 255) << 3) + (field_f[var6] >> 8 & 7));
              }
              field_m[var6] = (short)-1;
              if (var10 != 1 &&
                var10 != 2 &&
                var10 != 3) {
                if (var10 != 5 &&
                  var10 != 7) {
                }
              } else {
                if (var7 > var8) {
                  field_m[var6] = (short)var7;
                  var8 = var7;
                }
              }
              var6++;
            }
          }
          if (var4.field_n != param0.length) {
            throw new RuntimeException();
          }
          this.field_k = var6;
          this.field_i = new short[var6];
          this.field_c = new short[var6];
          this.field_a = new short[var6];
          this.field_l = new short[var6];
          this.field_n = new short[var6];
          this.field_d = new byte[var6];
          var13 = 0;
          var9Lifetime1 = var13;
          while (var13 < var6) {
            this.field_i[var13] = field_e[var13];
            this.field_c[var13] = field_j[var13];
            this.field_a[var13] = field_b[var13];
            this.field_l[var13] = field_f[var13];
            this.field_n[var13] = field_m[var13];
            this.field_d[var13] = field_h[var13];
            var13++;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          this.field_k = 0;
        }
    }

    static {
        field_m = new short[500];
        field_h = new byte[500];
        field_b = new short[500];
        field_f = new short[500];
        field_j = new short[500];
        field_e = new short[500];
    }
}
