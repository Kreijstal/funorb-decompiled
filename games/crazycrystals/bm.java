/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm {
    private int field_i;
    static int field_h;
    private int[] field_a;
    private int field_b;
    private int[] field_f;
    private int field_d;
    static String field_j;
    static int[][] field_e;
    private int field_c;
    static f field_g;

    final static String b(byte param0) {
        if (param0 <= 88) {
          return (String) null;
        }
        if (null == je.field_g) {
          return "";
        }
        return je.field_g;
    }

    final static void a(int param0, dl[] param1) {
        try {
          if (param0 != 6437) {
            field_h = -125;
          }
          nl.field_f = param1;
          if (null != nl.field_f &&
            3 > param1.length) {
            throw new IllegalArgumentException("");
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "bm.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        if (0 == this.field_b) {
          this.a(-95);
          this.field_b = 256;
          if (param0) {
            bm.b((byte) 50);
            fieldTemp$0 = this.field_b - 1;
            this.field_b = this.field_b - 1;
            return this.field_f[fieldTemp$0];
          }
          fieldTemp$1 = this.field_b - 1;
          this.field_b = this.field_b - 1;
          return this.field_f[fieldTemp$1];
        }
        if (!param0) {
          fieldTemp$2 = this.field_b - 1;
          this.field_b = this.field_b - 1;
          return this.field_f[fieldTemp$2];
        }
        bm.b((byte) 50);
        int fieldTemp$3 = this.field_b - 1;
        this.field_b = this.field_b - 1;
        return this.field_f[fieldTemp$3];
    }

    public static void a(byte param0) {
        field_j = null;
        field_g = null;
        if (param0 != -66) {
          return;
        }
        field_e = (int[][]) null;
    }

    private final void b(boolean param0) {
        int var2 = 0;
        int var11 = CrazyCrystals.field_B;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var10 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var7 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var2Lifetime1;
        int var2Lifetime2;
        for (var2 = 0; 4 > var2; var2++) {
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var9 = var9 + var6;
          var7 = var7 + var8;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
        }
        for (var2Lifetime1 = 0; 256 > var2Lifetime1; var2Lifetime1 += 8) {
          var10 = var10 + this.field_f[var2Lifetime1 + 7];
          var4 = var4 + this.field_f[1 + var2Lifetime1];
          var5 = var5 + this.field_f[var2Lifetime1 + 2];
          var9 = var9 + this.field_f[var2Lifetime1 + 6];
          var6 = var6 + this.field_f[var2Lifetime1 + 3];
          var8 = var8 + this.field_f[5 + var2Lifetime1];
          var7 = var7 + this.field_f[var2Lifetime1 + 4];
          var3 = var3 + this.field_f[var2Lifetime1];
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
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_a[var2Lifetime1] = var3;
          this.field_a[1 + var2Lifetime1] = var4;
          this.field_a[var2Lifetime1 + 2] = var5;
          this.field_a[var2Lifetime1 + 3] = var6;
          this.field_a[var2Lifetime1 + 4] = var7;
          this.field_a[5 + var2Lifetime1] = var8;
          this.field_a[var2Lifetime1 + 6] = var9;
          this.field_a[var2Lifetime1 + 7] = var10;
        }
        var2Lifetime2 = 0;
        if (param0) {
          while (256 > var2Lifetime2) {
            var4 = var4 + this.field_a[var2Lifetime2 + 1];
            var3 = var3 + this.field_a[var2Lifetime2];
            var8 = var8 + this.field_a[var2Lifetime2 + 5];
            var7 = var7 + this.field_a[4 + var2Lifetime2];
            var9 = var9 + this.field_a[var2Lifetime2 + 6];
            var6 = var6 + this.field_a[var2Lifetime2 + 3];
            var5 = var5 + this.field_a[2 + var2Lifetime2];
            var10 = var10 + this.field_a[7 + var2Lifetime2];
            var3 = var3 ^ var4 << 11;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> 2;
            var5 = var5 + var6;
            var7 = var7 + var4;
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
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> 9;
            var5 = var5 + var10;
            var3 = var3 + var4;
            this.field_a[var2Lifetime2] = var3;
            this.field_a[var2Lifetime2 + 1] = var4;
            this.field_a[var2Lifetime2 + 2] = var5;
            this.field_a[var2Lifetime2 + 3] = var6;
            this.field_a[4 + var2Lifetime2] = var7;
            this.field_a[5 + var2Lifetime2] = var8;
            this.field_a[6 + var2Lifetime2] = var9;
            this.field_a[var2Lifetime2 + 7] = var10;
            var2Lifetime2 += 8;
          }
          this.a(-53);
          this.field_b = 256;
          return;
        }
        this.field_b = -11;
        while (256 > var2Lifetime2) {
          var4 = var4 + this.field_a[var2Lifetime2 + 1];
          var3 = var3 + this.field_a[var2Lifetime2];
          var8 = var8 + this.field_a[var2Lifetime2 + 5];
          var7 = var7 + this.field_a[4 + var2Lifetime2];
          var9 = var9 + this.field_a[var2Lifetime2 + 6];
          var6 = var6 + this.field_a[var2Lifetime2 + 3];
          var5 = var5 + this.field_a[2 + var2Lifetime2];
          var10 = var10 + this.field_a[7 + var2Lifetime2];
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
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
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_a[var2Lifetime2] = var3;
          this.field_a[var2Lifetime2 + 1] = var4;
          this.field_a[var2Lifetime2 + 2] = var5;
          this.field_a[var2Lifetime2 + 3] = var6;
          this.field_a[4 + var2Lifetime2] = var7;
          this.field_a[5 + var2Lifetime2] = var8;
          this.field_a[6 + var2Lifetime2] = var9;
          this.field_a[var2Lifetime2 + 7] = var10;
          var2Lifetime2 += 8;
        }
        this.a(-53);
        this.field_b = 256;
    }

    bm(int[] param0) {
        int var2_int = 0;
        try {
          this.field_a = new int[256];
          this.field_f = new int[256];
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            this.field_f[var2_int] = param0[var2_int];
          }
          this.b(true);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "bm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0) {
        int fieldTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int fieldTemp$3 = 0;
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = CrazyCrystals.field_B;
        if (param0 <= -35) {
          fieldTemp$0 = this.field_d + 1;
          this.field_d = this.field_d + 1;
          this.field_c = this.field_c + fieldTemp$0;
          for (var2 = 0; 256 > var2; var2++) {
            var3 = this.field_a[var2];
            if ((var2 & 2) == 0) {
              if ((var2 & 1) != 0) {
                this.field_i = this.field_i ^ this.field_i >>> 6;
              } else {
                this.field_i = this.field_i ^ this.field_i << 13;
              }
            } else {
              if ((var2 & 1) == 0) {
                this.field_i = this.field_i ^ this.field_i << 2;
              } else {
                this.field_i = this.field_i ^ this.field_i >>> 16;
              }
            }
            this.field_i = this.field_i + this.field_a[var2 + 128 & 255];
            dupTemp$1 = this.field_a[pf.b(255, var3 >> 2)] + this.field_i + this.field_c;
            var4 = dupTemp$1;
            this.field_a[var2] = dupTemp$1;
            dupTemp$2 = var3 + this.field_a[pf.b(1020, var4 >> 8) >> 2];
            this.field_c = dupTemp$2;
            this.field_f[var2] = dupTemp$2;
          }
          return;
        }
        field_j = (String) null;
        fieldTemp$3 = this.field_d + 1;
        this.field_d = this.field_d + 1;
        this.field_c = this.field_c + fieldTemp$3;
        for (var2Lifetime1 = 0; 256 > var2Lifetime1; var2Lifetime1++) {
          var3Lifetime1 = this.field_a[var2Lifetime1];
          if ((var2Lifetime1 & 2) == 0) {
            if ((var2Lifetime1 & 1) != 0) {
              this.field_i = this.field_i ^ this.field_i >>> 6;
            } else {
              this.field_i = this.field_i ^ this.field_i << 13;
            }
          } else {
            if ((var2Lifetime1 & 1) == 0) {
              this.field_i = this.field_i ^ this.field_i << 2;
            } else {
              this.field_i = this.field_i ^ this.field_i >>> 16;
            }
          }
          this.field_i = this.field_i + this.field_a[var2Lifetime1 + 128 & 255];
          dupTemp$4 = this.field_a[pf.b(255, var3Lifetime1 >> 2)] + this.field_i + this.field_c;
          var4Lifetime1 = dupTemp$4;
          this.field_a[var2Lifetime1] = dupTemp$4;
          dupTemp$5 = var3Lifetime1 + this.field_a[pf.b(1020, var4Lifetime1 >> 8) >> 2];
          this.field_c = dupTemp$5;
          this.field_f[var2Lifetime1] = dupTemp$5;
        }
        return;
    }

    static {
        field_h = 0;
        field_j = "Achieved";
        field_g = (f) ((Object) new kp(-1));
    }
}
