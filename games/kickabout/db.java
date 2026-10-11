/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    int field_i;
    short[] field_f;
    private static byte[] field_k;
    je field_e;
    private static short[] field_n;
    private static short[] field_g;
    byte[] field_j;
    short[] field_m;
    short[] field_d;
    short[] field_c;
    short[] field_a;
    private static short[] field_l;
    private static short[] field_b;
    private static short[] field_h;

    public static void a() {
        field_b = null;
        field_l = null;
        field_g = null;
        field_h = null;
        field_n = null;
        field_k = null;
    }

    db(byte[] param0, je param1) {
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        iw var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        iw var14 = null;
        int var9Lifetime1;
        this.field_i = -1;
        this.field_e = null;
        this.field_e = param1;
        try {
          var14 = new iw(param0);
          var4 = new iw(param0);
          var14.h((byte) -126);
          var14.field_n = var14.field_n + 2;
          var5 = var14.h((byte) -112);
          var6 = 0;
          var7 = -1;
          var8 = -1;
          var4.field_n = var14.field_n + var5;
          for (var9 = 0; var9 < var5; var9++) {
            var10 = this.field_e.field_o[var9];
            if (var10 == 0) {
              var7 = var9;
            }
            var11 = var14.h((byte) -114);
            if (var11 > 0) {
              if (var10 == 0) {
                var8 = var9;
              }
              field_b[var6] = (short)var9;
              var12 = 0;
              if (var10 == 3) {
                var12 = 128;
              }
              if ((var11 & 1) == 0) {
                field_l[var6] = (short)var12;
              } else {
                field_l[var6] = (short)var4.e(83);
              }
              if ((var11 & 2) == 0) {
                field_g[var6] = (short)var12;
              } else {
                field_g[var6] = (short)var4.e(-120);
              }
              if ((var11 & 4) == 0) {
                field_h[var6] = (short)var12;
              } else {
                field_h[var6] = (short)var4.e(-119);
              }
              field_k[var6] = (byte)(var11 >>> 3 & 3);
              if (var10 == 2) {
                field_l[var6] = (short)(((field_l[var6] & 255) << 3) + (field_l[var6] >> 8 & 7));
                field_g[var6] = (short)(((field_g[var6] & 255) << 3) + (field_g[var6] >> 8 & 7));
                field_h[var6] = (short)(((field_h[var6] & 255) << 3) + (field_h[var6] >> 8 & 7));
              }
              field_n[var6] = (short)-1;
              if (var10 != 1 &&
                var10 != 2 &&
                var10 != 3) {
                if (var10 != 5 &&
                  var10 != 7) {
                }
              } else {
                if (var7 > var8) {
                  field_n[var6] = (short)var7;
                  var8 = var7;
                }
              }
              var6++;
            }
          }
          if (var4.field_n != param0.length) {
            throw new RuntimeException();
          }
          this.field_i = var6;
          this.field_a = new short[var6];
          this.field_c = new short[var6];
          this.field_f = new short[var6];
          this.field_d = new short[var6];
          this.field_m = new short[var6];
          this.field_j = new byte[var6];
          var13 = 0;
          var9Lifetime1 = var13;
          while (var13 < var6) {
            this.field_a[var13] = field_b[var13];
            this.field_c[var13] = field_l[var13];
            this.field_f[var13] = field_g[var13];
            this.field_d[var13] = field_h[var13];
            this.field_m[var13] = field_n[var13];
            this.field_j[var13] = field_k[var13];
            var13++;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          this.field_i = 0;
        }
    }

    static {
        field_g = new short[500];
        field_n = new short[500];
        field_k = new byte[500];
        field_h = new short[500];
        field_l = new short[500];
        field_b = new short[500];
    }
}
