/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rq {
    short[] field_j;
    short[] field_m;
    byte[] field_a;
    private static short[] field_c;
    short[] field_k;
    private static short[] field_n;
    private static short[] field_h;
    private static short[] field_b;
    private static byte[] field_e;
    short[] field_d;
    nk field_f;
    short[] field_l;
    int field_i;
    private static short[] field_g;

    public static void a() {
        field_c = null;
        field_h = null;
        field_n = null;
        field_b = null;
        field_g = null;
        field_e = null;
    }

    rq(byte[] param0, nk param1) {
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        uia var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        uia var14 = null;
        int var9Lifetime1;
        this.field_f = null;
        this.field_i = 0;
        this.field_f = param1;
        try {
          var14 = new uia(param0);
          var4 = new uia(param0);
          var14.h(255);
          var14.field_h = var14.field_h + 2;
          var5 = var14.h(255);
          var6 = 0;
          var7 = -1;
          var8 = -1;
          var4.field_h = var14.field_h + var5;
          for (var9 = 0; var9 < var5; var9++) {
            var10 = this.field_f.field_h[var9];
            if (var10 == 0) {
              var7 = var9;
            }
            var11 = var14.h(255);
            if (var11 > 0) {
              if (var10 == 0) {
                var8 = var9;
              }
              field_c[var6] = (short)var9;
              var12 = 0;
              if (var10 == 3 ||
                var10 == 10) {
                var12 = 128;
              }
              if ((var11 & 1) == 0) {
                field_h[var6] = (short)var12;
              } else {
                field_h[var6] = (short)var4.f((byte) -128);
              }
              if ((var11 & 2) == 0) {
                field_n[var6] = (short)var12;
              } else {
                field_n[var6] = (short)var4.f((byte) -128);
              }
              if ((var11 & 4) == 0) {
                field_b[var6] = (short)var12;
              } else {
                field_b[var6] = (short)var4.f((byte) -128);
              }
              field_e[var6] = (byte)(var11 >>> 3 & 3);
              if (var10 == 2 ||
                var10 == 9) {
                field_h[var6] = (short)(field_h[var6] << 2 & 16383);
                field_n[var6] = (short)(field_n[var6] << 2 & 16383);
                field_b[var6] = (short)(field_b[var6] << 2 & 16383);
              }
              field_g[var6] = (short)-1;
              if (var10 != 1 &&
                var10 != 2 &&
                var10 != 3) {
                if (var10 != 5 &&
                  var10 != 7 &&
                  var10 != 9 &&
                  var10 != 10 &&
                  var10 != 8) {
                }
              } else {
                if (var7 > var8) {
                  field_g[var6] = (short)var7;
                  var8 = var7;
                }
              }
              var6++;
            }
          }
          if (var4.field_h != param0.length) {
            throw new RuntimeException();
          }
          this.field_i = var6;
          this.field_m = new short[var6];
          this.field_l = new short[var6];
          this.field_k = new short[var6];
          this.field_d = new short[var6];
          this.field_j = new short[var6];
          this.field_a = new byte[var6];
          var13 = 0;
          var9Lifetime1 = var13;
          while (var13 < var6) {
            this.field_m[var13] = field_c[var13];
            this.field_l[var13] = field_h[var13];
            this.field_k[var13] = field_n[var13];
            this.field_d[var13] = field_b[var13];
            this.field_j[var13] = field_g[var13];
            this.field_a[var13] = field_e[var13];
            var13++;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          this.field_i = 0;
        }
    }

    static {
        field_c = new short[500];
        field_e = new byte[500];
        field_n = new short[500];
        field_h = new short[500];
        field_g = new short[500];
        field_b = new short[500];
    }
}
