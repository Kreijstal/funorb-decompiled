/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ht {
    private static short[] field_j;
    ig field_n;
    short[] field_a;
    private static short[] field_b;
    private static short[] field_g;
    short[] field_f;
    short[] field_h;
    private static byte[] field_c;
    int field_d;
    byte[] field_m;
    private static short[] field_k;
    short[] field_l;
    private static short[] field_e;
    short[] field_i;

    ht(byte[] param0, ig param1) {
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        PacketBuffer var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        PacketBuffer var14 = null;
        int var9Lifetime1;
        this.field_d = -1;
        this.field_n = null;
        this.field_n = param1;
        try {
          var14 = new PacketBuffer(param0);
          var4 = new PacketBuffer(param0);
          var14.k(0);
          var14.position = var14.position + 2;
          var5 = var14.k(0);
          var6 = 0;
          var7 = -1;
          var8 = -1;
          var4.position = var14.position + var5;
          for (var9 = 0; var9 < var5; var9++) {
            var10 = this.field_n.field_p[var9];
            if (var10 == 0) {
              var7 = var9;
            }
            var11 = var14.k(0);
            if (var11 > 0) {
              if (var10 == 0) {
                var8 = var9;
              }
              field_j[var6] = (short)var9;
              var12 = 0;
              if (var10 == 3) {
                var12 = 128;
              }
              if ((var11 & 1) == 0) {
                field_k[var6] = (short)var12;
              } else {
                field_k[var6] = (short)var4.a(114);
              }
              if ((var11 & 2) == 0) {
                field_e[var6] = (short)var12;
              } else {
                field_e[var6] = (short)var4.a(95);
              }
              if ((var11 & 4) == 0) {
                field_b[var6] = (short)var12;
              } else {
                field_b[var6] = (short)var4.a(55);
              }
              field_c[var6] = (byte)(var11 >>> 3 & 3);
              if (var10 == 2) {
                field_k[var6] = (short)(((field_k[var6] & 255) << 3) + (field_k[var6] >> 8 & 7));
                field_e[var6] = (short)(((field_e[var6] & 255) << 3) + (field_e[var6] >> 8 & 7));
                field_b[var6] = (short)(((field_b[var6] & 255) << 3) + (field_b[var6] >> 8 & 7));
              }
              field_g[var6] = (short)-1;
              if (var10 != 1 &&
                var10 != 2 &&
                var10 != 3) {
                if (var10 != 5 &&
                  var10 != 7) {
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
          if (var4.position != param0.length) {
            throw new RuntimeException();
          }
          this.field_d = var6;
          this.field_a = new short[var6];
          this.field_l = new short[var6];
          this.field_f = new short[var6];
          this.field_h = new short[var6];
          this.field_i = new short[var6];
          this.field_m = new byte[var6];
          var13 = 0;
          var9Lifetime1 = var13;
          while (var13 < var6) {
            this.field_a[var13] = field_j[var13];
            this.field_l[var13] = field_k[var13];
            this.field_f[var13] = field_e[var13];
            this.field_h[var13] = field_b[var13];
            this.field_i[var13] = field_g[var13];
            this.field_m[var13] = field_c[var13];
            var13++;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          this.field_d = 0;
        }
    }

    public static void a() {
        field_j = null;
        field_k = null;
        field_e = null;
        field_b = null;
        field_g = null;
        field_c = null;
    }

    static {
        field_j = new short[500];
        field_b = new short[500];
        field_g = new short[500];
        field_k = new short[500];
        field_c = new byte[500];
        field_e = new short[500];
    }
}
