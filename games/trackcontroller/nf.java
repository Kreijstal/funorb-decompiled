/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    private int field_c;
    static int field_e;
    private int[] field_d;
    private int[] field_i;
    static String[] field_g;
    static String field_h;
    static boolean field_f;
    private int field_b;
    private int field_j;
    private int field_a;

    private final void a(int param0) {
        int var2 = 0;
        int var11 = TrackController.field_F ? 1 : 0;
        int var10 = -1640531527;
        int var6 = -1640531527;
        int var3 = -1640531527;
        int var2Lifetime1;
        int var2Lifetime2;
        if (param0 <= 11) {
          this.c(100);
        }
        int var9 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        for (var2 = 0; var2 < 4; var2++) {
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var10 = var10 + this.field_i[var2Lifetime1 + 7];
          var8 = var8 + this.field_i[var2Lifetime1 + 5];
          var4 = var4 + this.field_i[var2Lifetime1 + 1];
          var3 = var3 + this.field_i[var2Lifetime1];
          var9 = var9 + this.field_i[var2Lifetime1 + 6];
          var7 = var7 + this.field_i[var2Lifetime1 + 4];
          var6 = var6 + this.field_i[3 + var2Lifetime1];
          var5 = var5 + this.field_i[var2Lifetime1 + 2];
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_d[var2Lifetime1] = var3;
          this.field_d[1 + var2Lifetime1] = var4;
          this.field_d[2 + var2Lifetime1] = var5;
          this.field_d[3 + var2Lifetime1] = var6;
          this.field_d[4 + var2Lifetime1] = var7;
          this.field_d[5 + var2Lifetime1] = var8;
          this.field_d[var2Lifetime1 + 6] = var9;
          this.field_d[var2Lifetime1 + 7] = var10;
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var8 = var8 + this.field_d[var2Lifetime2 + 5];
          var7 = var7 + this.field_d[var2Lifetime2 + 4];
          var6 = var6 + this.field_d[var2Lifetime2 + 3];
          var10 = var10 + this.field_d[var2Lifetime2 + 7];
          var9 = var9 + this.field_d[6 + var2Lifetime2];
          var3 = var3 + this.field_d[var2Lifetime2];
          var4 = var4 + this.field_d[var2Lifetime2 + 1];
          var5 = var5 + this.field_d[var2Lifetime2 + 2];
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var9 = var9 + var6;
          var7 = var7 + var8;
          var7 = var7 ^ var8 << 10;
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_d[var2Lifetime2] = var3;
          this.field_d[1 + var2Lifetime2] = var4;
          this.field_d[2 + var2Lifetime2] = var5;
          this.field_d[var2Lifetime2 + 3] = var6;
          this.field_d[var2Lifetime2 + 4] = var7;
          this.field_d[var2Lifetime2 + 5] = var8;
          this.field_d[var2Lifetime2 + 6] = var9;
          this.field_d[var2Lifetime2 + 7] = var10;
        }
        this.a((byte) 35);
        this.field_a = 256;
    }

    public static void b(int param0) {
        field_h = null;
        if (param0 != 261211) {
          field_g = (String[]) null;
        }
        field_g = null;
    }

    final static void a(boolean param0, String param1, String param2, byte param3) {
        try {
          qg.field_c = param2;
          lf.field_T = param1;
          nb.a(rk.field_Z, param0, param3 - 16152);
          if (param3 != -105) {
            field_h = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "nf.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = TrackController.field_F ? 1 : 0;
        int fieldTemp$0 = this.field_b + 1;
        this.field_b = this.field_b + 1;
        this.field_j = this.field_j + fieldTemp$0;
        if (param0 != 35) {
          this.a((byte) 91);
        }
        for (var2 = 0; var2 < 256; var2++) {
          var3 = this.field_d[var2];
          if ((2 & var2) == 0) {
            if ((1 & var2) != 0) {
              this.field_c = this.field_c ^ this.field_c >>> 6;
            } else {
              this.field_c = this.field_c ^ this.field_c << 13;
            }
          } else {
            if (0 != (var2 & 1)) {
              this.field_c = this.field_c ^ this.field_c >>> 16;
            } else {
              this.field_c = this.field_c ^ this.field_c << 2;
            }
          }
          this.field_c = this.field_c + this.field_d[var2 + 128 & 255];
          dupTemp$1 = this.field_j + (this.field_d[tc.a(1020, var3) >> 2] + this.field_c);
          var4 = dupTemp$1;
          this.field_d[var2] = dupTemp$1;
          dupTemp$2 = var3 + this.field_d[tc.a(var4, 261211) >> 8 >> 2];
          this.field_j = dupTemp$2;
          this.field_i[var2] = dupTemp$2;
        }
    }

    final int c(int param0) {
        if (0 == this.field_a) {
          this.a((byte) 35);
          this.field_a = 256;
        }
        if (param0 <= 124) {
          this.a((byte) 58);
        }
        int fieldTemp$0 = this.field_a - 1;
        this.field_a = this.field_a - 1;
        return this.field_i[fieldTemp$0];
    }

    nf(int[] param0) {
        int var2_int = 0;
        try {
          this.field_i = new int[256];
          this.field_d = new int[256];
          for (var2_int = 0; var2_int < param0.length; var2_int++) {
            this.field_i[var2_int] = param0[var2_int];
          }
          this.a(66);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "nf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = false;
        field_h = "Show my scores and my friends' scores. ";
    }
}
