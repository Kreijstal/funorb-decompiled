/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn {
    static ie field_g;
    private int field_j;
    private int[] field_d;
    private int field_e;
    static va field_f;
    static hj field_a;
    private int field_i;
    private int[] field_b;
    static String[] field_h;
    private int field_c;
    static String field_k;

    private final void a(byte param0) {
        int var2 = 0;
        int var11 = HoldTheLine.field_D;
        int var9 = -1640531527;
        int var7 = -1640531527;
        int var5 = -1640531527;
        int var10 = -1640531527;
        int var6 = -1640531527;
        int var4 = -1640531527;
        int var3 = -1640531527;
        int var8 = -1640531527;
        int var2Lifetime1;
        int var2Lifetime2;
        if (param0 < 95) {
          wn.b(-110);
        }
        for (var2 = 0; var2 < 4; var2++) {
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
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var7 = var7 + this.field_b[4 + var2Lifetime1];
          var10 = var10 + this.field_b[var2Lifetime1 + 7];
          var3 = var3 + this.field_b[var2Lifetime1];
          var9 = var9 + this.field_b[var2Lifetime1 + 6];
          var4 = var4 + this.field_b[1 + var2Lifetime1];
          var6 = var6 + this.field_b[var2Lifetime1 + 3];
          var5 = var5 + this.field_b[var2Lifetime1 + 2];
          var8 = var8 + this.field_b[var2Lifetime1 + 5];
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var8 = var8 + var5;
          var6 = var6 + var7;
          var6 = var6 ^ var7 >>> 16;
          var9 = var9 + var6;
          var7 = var7 + var8;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
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
          this.field_d[var2Lifetime1 + 1] = var4;
          this.field_d[2 + var2Lifetime1] = var5;
          this.field_d[var2Lifetime1 + 3] = var6;
          this.field_d[4 + var2Lifetime1] = var7;
          this.field_d[var2Lifetime1 + 5] = var8;
          this.field_d[var2Lifetime1 + 6] = var9;
          this.field_d[7 + var2Lifetime1] = var10;
        }
        for (var2Lifetime2 = 0; 256 > var2Lifetime2; var2Lifetime2 += 8) {
          var4 = var4 + this.field_d[1 + var2Lifetime2];
          var8 = var8 + this.field_d[var2Lifetime2 + 5];
          var7 = var7 + this.field_d[var2Lifetime2 + 4];
          var5 = var5 + this.field_d[2 + var2Lifetime2];
          var10 = var10 + this.field_d[var2Lifetime2 + 7];
          var3 = var3 + this.field_d[var2Lifetime2];
          var6 = var6 + this.field_d[3 + var2Lifetime2];
          var9 = var9 + this.field_d[6 + var2Lifetime2];
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var8 = var8 + var5;
          var6 = var6 + var7;
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
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_d[var2Lifetime2] = var3;
          this.field_d[var2Lifetime2 + 1] = var4;
          this.field_d[var2Lifetime2 + 2] = var5;
          this.field_d[3 + var2Lifetime2] = var6;
          this.field_d[var2Lifetime2 + 4] = var7;
          this.field_d[var2Lifetime2 + 5] = var8;
          this.field_d[var2Lifetime2 + 6] = var9;
          this.field_d[7 + var2Lifetime2] = var10;
        }
        this.a(0);
        this.field_i = 256;
    }

    public static void b(int param0) {
        field_g = null;
        if (param0 != 28820) {
          return;
        }
        field_a = null;
        field_k = null;
        field_f = null;
        field_h = null;
    }

    final int c(int param0) {
        if (param0 != 256) {
          return 23;
        }
        if (this.field_i == 0) {
          this.a(param0 ^ 256);
          this.field_i = 256;
        }
        int fieldTemp$0 = this.field_i - 1;
        this.field_i = this.field_i - 1;
        return this.field_b[fieldTemp$0];
    }

    private final void a(int param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = HoldTheLine.field_D;
        int fieldTemp$0 = this.field_e + 1;
        this.field_e = this.field_e + 1;
        this.field_c = this.field_c + fieldTemp$0;
        for (var2 = param0; 256 > var2; var2++) {
          var3 = this.field_d[var2];
          if (0 == (2 & var2)) {
            if ((var2 & 1) == 0) {
              this.field_j = this.field_j ^ this.field_j << 13;
            } else {
              this.field_j = this.field_j ^ this.field_j >>> 6;
            }
          } else {
            if ((var2 & 1) != 0) {
              this.field_j = this.field_j ^ this.field_j >>> 16;
            } else {
              this.field_j = this.field_j ^ this.field_j << 2;
            }
          }
          this.field_j = this.field_j + this.field_d[128 + var2 & 255];
          dupTemp$1 = this.field_c + (this.field_d[pk.a(var3, 1020) >> 2] + this.field_j);
          var4 = dupTemp$1;
          this.field_d[var2] = dupTemp$1;
          dupTemp$2 = var3 + this.field_d[pk.a(261345, var4) >> 8 >> 2];
          this.field_c = dupTemp$2;
          this.field_b[var2] = dupTemp$2;
        }
    }

    wn(int[] param0) {
        int var2_int = 0;
        try {
          this.field_b = new int[256];
          this.field_d = new int[256];
          for (var2_int = 0; var2_int < param0.length; var2_int++) {
            this.field_b[var2_int] = param0[var2_int];
          }
          this.a((byte) 106);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "wn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "Weapons";
    }
}
