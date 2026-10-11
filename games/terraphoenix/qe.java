/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    static volatile int field_l;
    static ci field_k;
    static String field_h;
    private int field_b;
    private int[] field_a;
    static String field_g;
    static og field_f;
    private int field_d;
    static String field_j;
    private int field_e;
    private int field_c;
    private int[] field_i;

    public static void a(boolean param0) {
        field_f = null;
        field_h = null;
        field_k = null;
        if (!param0) {
          fa var2 = (fa) null;
          qe.a(-54, (fa) null);
        }
        field_g = null;
        field_j = null;
    }

    private final void a(byte param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = Terraphoenix.field_V;
        int fieldTemp$0 = this.field_c + 1;
        this.field_c = this.field_c + 1;
        this.field_e = this.field_e + fieldTemp$0;
        for (var2 = 0; var2 < 256; var2++) {
          var3 = this.field_a[var2];
          if ((2 & var2) != 0) {
            if (0 != (var2 & 1)) {
              this.field_b = this.field_b ^ this.field_b >>> 16;
            } else {
              this.field_b = this.field_b ^ this.field_b << 2;
            }
          } else {
            if ((var2 & 1) == 0) {
              this.field_b = this.field_b ^ this.field_b << 13;
            } else {
              this.field_b = this.field_b ^ this.field_b >>> 6;
            }
          }
          this.field_b = this.field_b + this.field_a[128 + var2 & 255];
          dupTemp$1 = this.field_e + (this.field_a[dg.a(var3, 1020) >> 2] + this.field_b);
          var4 = dupTemp$1;
          this.field_a[var2] = dupTemp$1;
          dupTemp$2 = this.field_a[dg.a(var4, 261306) >> 8 >> 2] + var3;
          this.field_e = dupTemp$2;
          this.field_i[var2] = dupTemp$2;
        }
        if (param0 != -38) {
          field_h = (String) null;
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var11 = Terraphoenix.field_V;
        int var2Lifetime1;
        int var2Lifetime2;
        if (param0 != -1) {
          this.field_i = (int[]) null;
        }
        int var6 = -1640531527;
        int var3 = -1640531527;
        int var8 = -1640531527;
        int var4 = -1640531527;
        int var9 = -1640531527;
        int var10 = -1640531527;
        int var5 = -1640531527;
        int var7 = -1640531527;
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
          var9 = var9 + var6;
          var7 = var7 + var8;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
        }
        for (var2Lifetime1 = 0; 256 > var2Lifetime1; var2Lifetime1 += 8) {
          var6 = var6 + this.field_i[var2Lifetime1 + 3];
          var7 = var7 + this.field_i[4 + var2Lifetime1];
          var4 = var4 + this.field_i[var2Lifetime1 + 1];
          var5 = var5 + this.field_i[var2Lifetime1 + 2];
          var9 = var9 + this.field_i[var2Lifetime1 + 6];
          var8 = var8 + this.field_i[5 + var2Lifetime1];
          var10 = var10 + this.field_i[var2Lifetime1 + 7];
          var3 = var3 + this.field_i[var2Lifetime1];
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
          this.field_a[var2Lifetime1] = var3;
          this.field_a[1 + var2Lifetime1] = var4;
          this.field_a[2 + var2Lifetime1] = var5;
          this.field_a[3 + var2Lifetime1] = var6;
          this.field_a[4 + var2Lifetime1] = var7;
          this.field_a[var2Lifetime1 + 5] = var8;
          this.field_a[6 + var2Lifetime1] = var9;
          this.field_a[var2Lifetime1 + 7] = var10;
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var9 = var9 + this.field_a[var2Lifetime2 + 6];
          var4 = var4 + this.field_a[1 + var2Lifetime2];
          var8 = var8 + this.field_a[5 + var2Lifetime2];
          var5 = var5 + this.field_a[var2Lifetime2 + 2];
          var3 = var3 + this.field_a[var2Lifetime2];
          var6 = var6 + this.field_a[3 + var2Lifetime2];
          var10 = var10 + this.field_a[var2Lifetime2 + 7];
          var7 = var7 + this.field_a[var2Lifetime2 + 4];
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
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_a[var2Lifetime2] = var3;
          this.field_a[1 + var2Lifetime2] = var4;
          this.field_a[var2Lifetime2 + 2] = var5;
          this.field_a[var2Lifetime2 + 3] = var6;
          this.field_a[var2Lifetime2 + 4] = var7;
          this.field_a[var2Lifetime2 + 5] = var8;
          this.field_a[6 + var2Lifetime2] = var9;
          this.field_a[var2Lifetime2 + 7] = var10;
        }
        this.a((byte) -38);
        this.field_d = 256;
    }

    final int a(int param0) {
        if (param0 < 64) {
          this.field_e = -7;
        }
        if (this.field_d == 0) {
          this.a((byte) -38);
          this.field_d = 256;
        }
        int fieldTemp$0 = this.field_d - 1;
        this.field_d = this.field_d - 1;
        return this.field_i[fieldTemp$0];
    }

    final static void a(int param0, fa param1) {
        int var3 = 0;
        int var4 = 0;
        ee var5 = null;
        int[] var6 = null;
        int var7 = 0;
        uc var8 = null;
        int var9 = 0;
        uc var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = Terraphoenix.field_V;
        try {
          var8 = new uc(param1.a("logo.fo3d", "", -21653));
          var10 = var8;
          var3 = var10.a(-16384);
          var10.k(-1694261224);
          qk.field_l = ig.a(-25831, var10);
          cm.field_b = new ee[var3];
          vh.field_j = new int[var3][];
          if (param0 != -28664) {
            return;
          }
          for (var4 = 0; var3 > var4; var4++) {
            cm.field_b[var4] = fc.a(11043, var8);
          }
          var10.n(8);
          var9 = 0;
          var4Lifetime1 = var9;
          while (var9 < var3) {
            var5 = cm.field_b[var9];
            var5.a(true, 6, 6, 1, 6);
            var5.c((byte) 41);
            var6 = new int[]{var5.field_K + var5.field_r >> 1, var5.field_a + var5.field_M >> 1, var5.field_t + var5.field_v >> 1};
            vh.field_j[var9] = var6;
            var5.a(true, -var6[2], -var6[0], -var6[1]);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("qe.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    qe(int[] param0) {
        int var2_int = 0;
        try {
          this.field_i = new int[256];
          this.field_a = new int[256];
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            this.field_i[var2_int] = param0[var2_int];
          }
          this.b(-1);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "qe.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Grunt with shielded armour";
        field_h = "Unpacking graphics";
        field_l = 0;
        field_j = "KPA-B";
    }
}
