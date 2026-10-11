/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb {
    static int[] field_h;
    private int field_i;
    static int field_e;
    private int[] field_a;
    static java.awt.Font field_c;
    private int field_b;
    private int[] field_d;
    private int field_f;
    private int field_g;
    static long[] field_j;

    public static void a(int param0) {
        if (param0 != -730625660) {
          field_c = (java.awt.Font) null;
        }
        field_j = null;
        field_h = null;
        field_c = null;
    }

    final static boolean b(int param0) {
        int var1;
        boolean stackIn_4_0 = false;
        var1 = -9 / ((param0 + 66) / 52);
        stackIn_4_0 = (m.field_b != null) && (r.field_c.a((byte) 11));
        return stackIn_4_0;
    }

    private final void a(byte param0) {
        int var3 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var2;
        int var4;
        int var5;
        var2 = -85 / ((-63 - param0) / 46);
        int fieldTemp$0 = this.field_g + 1;
        this.field_g = this.field_g + 1;
        this.field_f = this.field_f + fieldTemp$0;
        for (var3 = 0; var3 < 256; var3++) {
          var4 = this.field_a[var3];
          if (0 != (2 & var3)) {
            if ((var3 & 1) == 0) {
              this.field_i = this.field_i ^ this.field_i << 2;
            } else {
              this.field_i = this.field_i ^ this.field_i >>> 16;
            }
          } else {
            if ((var3 & 1) == 0) {
              this.field_i = this.field_i ^ this.field_i << 13;
            } else {
              this.field_i = this.field_i ^ this.field_i >>> 6;
            }
          }
          this.field_i = this.field_i + this.field_a[255 & var3 + 128];
          dupTemp$1 = this.field_f + this.field_i + this.field_a[w.a(var4, 1020) >> 2];
          var5 = dupTemp$1;
          this.field_a[var3] = dupTemp$1;
          dupTemp$2 = this.field_a[w.a(255, var5 >> 8 >> 2)] + var4;
          this.field_f = dupTemp$2;
          this.field_d[var3] = dupTemp$2;
        }
    }

    jb(int[] param0) {
        int var2_int = 0;
        try {
          this.field_a = new int[256];
          this.field_d = new int[256];
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            this.field_d[var2_int] = param0[var2_int];
          }
          this.c(119);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "jb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var7 = -1640531527;
        int var5 = -1640531527;
        int var4 = -1640531527;
        int var9 = -1640531527;
        int var10 = -1640531527;
        int var8 = -1640531527;
        int var3 = -1640531527;
        int var6 = -1640531527;
        int var2Lifetime1;
        int var2Lifetime2;
        for (var2 = 0; var2 < 4; var2++) {
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
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
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var4 = var4 + this.field_d[var2Lifetime1 + 1];
          var8 = var8 + this.field_d[var2Lifetime1 + 5];
          var10 = var10 + this.field_d[7 + var2Lifetime1];
          var6 = var6 + this.field_d[var2Lifetime1 + 3];
          var9 = var9 + this.field_d[6 + var2Lifetime1];
          var7 = var7 + this.field_d[var2Lifetime1 + 4];
          var5 = var5 + this.field_d[2 + var2Lifetime1];
          var3 = var3 + this.field_d[var2Lifetime1];
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
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_a[var2Lifetime1] = var3;
          this.field_a[var2Lifetime1 + 1] = var4;
          this.field_a[var2Lifetime1 + 2] = var5;
          this.field_a[var2Lifetime1 + 3] = var6;
          this.field_a[4 + var2Lifetime1] = var7;
          this.field_a[var2Lifetime1 + 5] = var8;
          this.field_a[var2Lifetime1 + 6] = var9;
          this.field_a[7 + var2Lifetime1] = var10;
        }
        if (param0 <= 97) {
          this.d(-28);
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var4 = var4 + this.field_a[1 + var2Lifetime2];
          var3 = var3 + this.field_a[var2Lifetime2];
          var5 = var5 + this.field_a[var2Lifetime2 + 2];
          var9 = var9 + this.field_a[var2Lifetime2 + 6];
          var6 = var6 + this.field_a[var2Lifetime2 + 3];
          var8 = var8 + this.field_a[var2Lifetime2 + 5];
          var7 = var7 + this.field_a[var2Lifetime2 + 4];
          var10 = var10 + this.field_a[7 + var2Lifetime2];
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
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_a[var2Lifetime2] = var3;
          this.field_a[1 + var2Lifetime2] = var4;
          this.field_a[2 + var2Lifetime2] = var5;
          this.field_a[var2Lifetime2 + 3] = var6;
          this.field_a[var2Lifetime2 + 4] = var7;
          this.field_a[5 + var2Lifetime2] = var8;
          this.field_a[var2Lifetime2 + 6] = var9;
          this.field_a[var2Lifetime2 + 7] = var10;
        }
        this.a((byte) -122);
        this.field_b = 256;
    }

    final int d(int param0) {
        if (this.field_b == 0) {
          this.a((byte) 100);
          this.field_b = 256;
        }
        if (param0 != 3) {
          return 22;
        }
        int fieldTemp$0 = this.field_b - 1;
        this.field_b = this.field_b - 1;
        return this.field_d[fieldTemp$0];
    }

    static {
        field_j = new long[32];
        field_h = new int[128];
    }
}
