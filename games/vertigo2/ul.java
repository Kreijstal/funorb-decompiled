/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    int field_l;
    private static short[] field_c;
    mb field_a;
    private static short[] field_i;
    short[] field_k;
    short[] field_e;
    short[] field_n;
    short[] field_f;
    private static short[] field_m;
    private static short[] field_j;
    short[] field_d;
    private static byte[] field_b;
    byte[] field_g;
    private static short[] field_h;

    public static void a() {
        field_c = null;
        field_m = null;
        field_j = null;
        field_h = null;
        field_i = null;
        field_b = null;
    }

    ul(byte[] param0, mb param1) {
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        ed var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ed var14 = null;
        int var9Lifetime1;
        this.field_a = null;
        this.field_l = -1;
        this.field_a = param1;
        try {
          var14 = new ed(param0);
          var4 = new ed(param0);
          var14.h(-11);
          var14.field_u = var14.field_u + 2;
          var5 = var14.h(-11);
          var6 = 0;
          var7 = -1;
          var8 = -1;
          var4.field_u = var14.field_u + var5;
          for (var9 = 0; var9 < var5; var9++) {
            var10 = this.field_a.field_r[var9];
            if (var10 == 0) {
              var7 = var9;
            }
            var11 = var14.h(-11);
            if (var11 > 0) {
              if (var10 == 0) {
                var8 = var9;
              }
              field_c[var6] = (short)var9;
              var12 = 0;
              if (var10 == 3) {
                var12 = 128;
              }
              if ((var11 & 1) == 0) {
                field_m[var6] = (short)var12;
              } else {
                field_m[var6] = (short)var4.j(-3084);
              }
              if ((var11 & 2) == 0) {
                field_j[var6] = (short)var12;
              } else {
                field_j[var6] = (short)var4.j(-3084);
              }
              if ((var11 & 4) == 0) {
                field_h[var6] = (short)var12;
              } else {
                field_h[var6] = (short)var4.j(-3084);
              }
              field_b[var6] = (byte)(var11 >>> 3 & 3);
              if (var10 == 2) {
                field_m[var6] = (short)(((field_m[var6] & 255) << 3) + (field_m[var6] >> 8 & 7));
                field_j[var6] = (short)(((field_j[var6] & 255) << 3) + (field_j[var6] >> 8 & 7));
                field_h[var6] = (short)(((field_h[var6] & 255) << 3) + (field_h[var6] >> 8 & 7));
              }
              field_i[var6] = (short)-1;
              if (var10 != 1 &&
                var10 != 2 &&
                var10 != 3) {
                if (var10 != 5 &&
                  var10 != 7) {
                }
              } else {
                if (var7 > var8) {
                  field_i[var6] = (short)var7;
                  var8 = var7;
                }
              }
              var6++;
            }
          }
          if (var4.field_u != param0.length) {
            throw new RuntimeException();
          }
          this.field_l = var6;
          this.field_f = new short[var6];
          this.field_d = new short[var6];
          this.field_n = new short[var6];
          this.field_k = new short[var6];
          this.field_e = new short[var6];
          this.field_g = new byte[var6];
          var13 = 0;
          var9Lifetime1 = var13;
          while (var13 < var6) {
            this.field_f[var13] = field_c[var13];
            this.field_d[var13] = field_m[var13];
            this.field_n[var13] = field_j[var13];
            this.field_k[var13] = field_h[var13];
            this.field_e[var13] = field_i[var13];
            this.field_g[var13] = field_b[var13];
            var13++;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          this.field_l = 0;
        }
    }

    static {
        field_c = new short[500];
        field_i = new short[500];
        field_j = new short[500];
        field_m = new short[500];
        field_b = new byte[500];
        field_h = new short[500];
    }
}
