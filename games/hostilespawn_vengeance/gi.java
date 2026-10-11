/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static String field_m;
    static bd field_f;
    private int[] field_k;
    private int field_e;
    private int field_g;
    static int[] field_l;
    static bd field_d;
    static String field_n;
    private int field_i;
    private int field_b;
    static gb field_h;
    private int[] field_a;
    static bd field_c;
    static bd field_j;

    private final void a(int param0) {
        int var2 = 0;
        int var11 = HostileSpawn.field_I ? 1 : 0;
        int var4 = -1640531527;
        int var10 = -1640531527;
        int var8 = -1640531527;
        int var6 = -1640531527;
        int var5 = -1640531527;
        int var7 = -1640531527;
        int var3 = -1640531527;
        int var9 = -1640531527;
        int var2Lifetime1;
        int var2Lifetime2;
        if (param0 != -7) {
          return;
        }
        for (var2 = 0; var2 < 4; var2++) {
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var8 = var8 + var5;
          var6 = var6 + var7;
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
          var3 = var3 + var4;
          var5 = var5 + var10;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var10 = var10 + this.field_k[var2Lifetime1 + 7];
          var8 = var8 + this.field_k[var2Lifetime1 + 5];
          var7 = var7 + this.field_k[var2Lifetime1 + 4];
          var9 = var9 + this.field_k[var2Lifetime1 + 6];
          var6 = var6 + this.field_k[3 + var2Lifetime1];
          var3 = var3 + this.field_k[var2Lifetime1];
          var5 = var5 + this.field_k[2 + var2Lifetime1];
          var4 = var4 + this.field_k[1 + var2Lifetime1];
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
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
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_a[var2Lifetime1] = var3;
          this.field_a[1 + var2Lifetime1] = var4;
          this.field_a[2 + var2Lifetime1] = var5;
          this.field_a[3 + var2Lifetime1] = var6;
          this.field_a[4 + var2Lifetime1] = var7;
          this.field_a[var2Lifetime1 + 5] = var8;
          this.field_a[6 + var2Lifetime1] = var9;
          this.field_a[7 + var2Lifetime1] = var10;
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var9 = var9 + this.field_a[var2Lifetime2 + 6];
          var6 = var6 + this.field_a[var2Lifetime2 + 3];
          var5 = var5 + this.field_a[var2Lifetime2 + 2];
          var4 = var4 + this.field_a[1 + var2Lifetime2];
          var8 = var8 + this.field_a[var2Lifetime2 + 5];
          var10 = var10 + this.field_a[7 + var2Lifetime2];
          var3 = var3 + this.field_a[var2Lifetime2];
          var7 = var7 + this.field_a[var2Lifetime2 + 4];
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
          this.field_a[var2Lifetime2] = var3;
          this.field_a[1 + var2Lifetime2] = var4;
          this.field_a[2 + var2Lifetime2] = var5;
          this.field_a[var2Lifetime2 + 3] = var6;
          this.field_a[var2Lifetime2 + 4] = var7;
          this.field_a[var2Lifetime2 + 5] = var8;
          this.field_a[var2Lifetime2 + 6] = var9;
          this.field_a[var2Lifetime2 + 7] = var10;
        }
        this.a((byte) 109);
        this.field_e = 256;
    }

    final static boolean b(byte param0) {
        int var1 = -87 % ((13 - param0) / 38);
        return li.field_o;
    }

    final int a(boolean param0) {
        if (!param0) {
          field_m = (String) null;
        }
        if (0 == this.field_e) {
          this.a((byte) 112);
          this.field_e = 256;
        }
        int fieldTemp$0 = this.field_e - 1;
        this.field_e = this.field_e - 1;
        return this.field_k[fieldTemp$0];
    }

    private final void a(byte param0) {
        int fieldTemp$0 = 0;
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = HostileSpawn.field_I ? 1 : 0;
        if (param0 < 106) {
          return;
        }
        fieldTemp$0 = this.field_i + 1;
        this.field_i = this.field_i + 1;
        this.field_b = this.field_b + fieldTemp$0;
        for (var2 = 0; var2 < 256; var2++) {
          var3 = this.field_a[var2];
          if (0 != (2 & var2)) {
            if (0 == (var2 & 1)) {
              this.field_g = this.field_g ^ this.field_g << 2;
            } else {
              this.field_g = this.field_g ^ this.field_g >>> 16;
            }
          } else {
            if ((var2 & 1) != 0) {
              this.field_g = this.field_g ^ this.field_g >>> 6;
            } else {
              this.field_g = this.field_g ^ this.field_g << 13;
            }
          }
          this.field_g = this.field_g + this.field_a[255 & 128 + var2];
          dupTemp$1 = this.field_b + (this.field_g + this.field_a[ua.a(1020, var3) >> 2]);
          var4 = dupTemp$1;
          this.field_a[var2] = dupTemp$1;
          dupTemp$2 = this.field_a[ua.a(var4 >> 8, 1020) >> 2] + var3;
          this.field_b = dupTemp$2;
          this.field_k[var2] = dupTemp$2;
        }
        return;
    }

    gi(int[] param0) {
        int var2_int = 0;
        try {
          this.field_a = new int[256];
          this.field_k = new int[256];
          for (var2_int = 0; var2_int < param0.length; var2_int++) {
            this.field_k[var2_int] = param0[var2_int];
          }
          this.a(-7);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "gi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(boolean param0) {
        field_f = null;
        field_j = null;
        if (!param0) {
          field_j = (bd) null;
        }
        field_n = null;
        field_h = null;
        field_m = null;
        field_l = null;
        field_c = null;
        field_d = null;
    }

    static {
        field_m = "Pistol";
        field_n = "Close";
        field_l = new int[8192];
    }
}
