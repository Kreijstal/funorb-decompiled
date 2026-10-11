/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    private static short[] field_e;
    private static short[] field_g;
    short[] field_l;
    short[] field_n;
    short[] field_c;
    oe field_f;
    private static short[] field_a;
    private static byte[] field_m;
    int field_d;
    private static short[] field_j;
    short[] field_b;
    private static short[] field_k;
    short[] field_h;
    byte[] field_i;

    public static void a() {
        field_a = null;
        field_k = null;
        field_j = null;
        field_g = null;
        field_e = null;
        field_m = null;
    }

    pc(byte[] param0, oe param1) {
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        bh var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        bh var14 = null;
        int var9Lifetime1;
        this.field_f = null;
        this.field_d = -1;
        this.field_f = param1;
        try {
          var14 = new bh(param0);
          var4 = new bh(param0);
          var14.d((byte) -99);
          var14.field_t = var14.field_t + 2;
          var5 = var14.d((byte) -99);
          var6 = 0;
          var7 = -1;
          var8 = -1;
          var4.field_t = var14.field_t + var5;
          for (var9 = 0; var9 < var5; var9++) {
            var10 = this.field_f.field_p[var9];
            if (var10 == 0) {
              var7 = var9;
            }
            var11 = var14.d((byte) -99);
            if (var11 > 0) {
              if (var10 == 0) {
                var8 = var9;
              }
              field_a[var6] = (short)var9;
              var12 = 0;
              if (var10 == 3) {
                var12 = 128;
              }
              if ((var11 & 1) == 0) {
                field_k[var6] = (short)var12;
              } else {
                field_k[var6] = (short)var4.e((byte) 82);
              }
              if ((var11 & 2) == 0) {
                field_j[var6] = (short)var12;
              } else {
                field_j[var6] = (short)var4.e((byte) 82);
              }
              if ((var11 & 4) == 0) {
                field_g[var6] = (short)var12;
              } else {
                field_g[var6] = (short)var4.e((byte) 82);
              }
              field_m[var6] = (byte)(var11 >>> 3 & 3);
              if (var10 == 2) {
                field_k[var6] = (short)(((field_k[var6] & 255) << 3) + (field_k[var6] >> 8 & 7));
                field_j[var6] = (short)(((field_j[var6] & 255) << 3) + (field_j[var6] >> 8 & 7));
                field_g[var6] = (short)(((field_g[var6] & 255) << 3) + (field_g[var6] >> 8 & 7));
              }
              field_e[var6] = (short)-1;
              if (var10 != 1 &&
                var10 != 2 &&
                var10 != 3) {
                if (var10 != 5 &&
                  var10 != 7) {
                }
              } else {
                if (var7 > var8) {
                  field_e[var6] = (short)var7;
                  var8 = var7;
                }
              }
              var6++;
            }
          }
          if (var4.field_t != param0.length) {
            throw new RuntimeException();
          }
          this.field_d = var6;
          this.field_b = new short[var6];
          this.field_l = new short[var6];
          this.field_h = new short[var6];
          this.field_c = new short[var6];
          this.field_n = new short[var6];
          this.field_i = new byte[var6];
          var13 = 0;
          var9Lifetime1 = var13;
          while (var13 < var6) {
            this.field_b[var13] = field_a[var13];
            this.field_l[var13] = field_k[var13];
            this.field_h[var13] = field_j[var13];
            this.field_c[var13] = field_g[var13];
            this.field_n[var13] = field_e[var13];
            this.field_i[var13] = field_m[var13];
            var13++;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          this.field_d = 0;
        }
    }

    static {
        field_e = new short[500];
        field_g = new short[500];
        field_m = new byte[500];
        field_a = new short[500];
        field_j = new short[500];
        field_k = new short[500];
    }
}
