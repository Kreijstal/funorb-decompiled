/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm {
    static String field_b;
    private int field_a;
    static String field_d;
    static dh field_j;
    private int[] field_c;
    private int field_f;
    private int[] field_g;
    private int field_e;
    static int field_i;
    private int field_h;

    final static boolean a(int param0, int param1, eh param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 10332) {
            field_b = (String) null;
          }
          var4 = param2.b(param1, 27034);
          var3 = var4;
          if (var4 == null) {
            return false;
          }
          d.a((byte) -82, var4);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("mm.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = Virogrid.field_F ? 1 : 0;
        if (param0 > -1) {
          this.a(-121);
        }
        int fieldTemp$0 = this.field_f + 1;
        this.field_f = this.field_f + 1;
        this.field_h = this.field_h + fieldTemp$0;
        for (var2 = 0; var2 < 256; var2++) {
          var3 = this.field_c[var2];
          if (0 != (2 & var2)) {
            if (0 != (var2 & 1)) {
              this.field_e = this.field_e ^ this.field_e >>> 16;
            } else {
              this.field_e = this.field_e ^ this.field_e << 2;
            }
          } else {
            if (0 != (var2 & 1)) {
              this.field_e = this.field_e ^ this.field_e >>> 6;
            } else {
              this.field_e = this.field_e ^ this.field_e << 13;
            }
          }
          this.field_e = this.field_e + this.field_c[128 + var2 & 255];
          dupTemp$1 = this.field_e + (this.field_c[rb.a(255, var3 >> 2)] + this.field_h);
          var4 = dupTemp$1;
          this.field_c[var2] = dupTemp$1;
          dupTemp$2 = this.field_c[rb.a(var4, 261354) >> 8 >> 2] + var3;
          this.field_h = dupTemp$2;
          this.field_g[var2] = dupTemp$2;
        }
    }

    final static void a(int param0, long param1) {
        if (param1 <= 0L) {
          return;
        }
        if (param1 % 10L == 0L) {
          mh.a(param1 - 1L, (byte) -88);
          mh.a(1L, (byte) -88);
        } else {
          mh.a(param1, (byte) -88);
        }
        if (param0 >= -6) {
          field_j = (dh) null;
        }
    }

    final int a(int param0) {
        if (this.field_a == 0) {
          this.a((byte) -73);
          this.field_a = 256;
        }
        if (param0 != 5180) {
          return -32;
        }
        int fieldTemp$0 = this.field_a - 1;
        this.field_a = this.field_a - 1;
        return this.field_g[fieldTemp$0];
    }

    final static char a(int param0, byte param1) {
        int var3 = 0;
        int var2 = 255 & param1;
        if (param0 <= 85) {
          mm.a(true);
        }
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 >= 128 &&
          160 > var2) {
          var3 = cg.field_f[var2 - 128];
          if (var3 == 0) {
            var3 = 63;
          }
          var2 = var3;
        }
        return (char)var2;
    }

    private final void b(int param0) {
        int var2 = 0;
        int var11 = Virogrid.field_F ? 1 : 0;
        int var7 = -1640531527;
        int var9 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var10 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var8 = -1640531527;
        int var2Lifetime1;
        int var2Lifetime2;
        for (var2 = 0; var2 < 4; var2++) {
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
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
        }
        if (param0 < 7) {
          eh var12 = (eh) null;
          mm.a(119, -92, (eh) null);
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var4 = var4 + this.field_g[1 + var2Lifetime1];
          var8 = var8 + this.field_g[var2Lifetime1 + 5];
          var9 = var9 + this.field_g[var2Lifetime1 + 6];
          var10 = var10 + this.field_g[var2Lifetime1 + 7];
          var3 = var3 + this.field_g[var2Lifetime1];
          var7 = var7 + this.field_g[4 + var2Lifetime1];
          var5 = var5 + this.field_g[var2Lifetime1 + 2];
          var6 = var6 + this.field_g[3 + var2Lifetime1];
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
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_c[var2Lifetime1] = var3;
          this.field_c[var2Lifetime1 + 1] = var4;
          this.field_c[var2Lifetime1 + 2] = var5;
          this.field_c[var2Lifetime1 + 3] = var6;
          this.field_c[var2Lifetime1 + 4] = var7;
          this.field_c[5 + var2Lifetime1] = var8;
          this.field_c[var2Lifetime1 + 6] = var9;
          this.field_c[7 + var2Lifetime1] = var10;
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var10 = var10 + this.field_c[7 + var2Lifetime2];
          var7 = var7 + this.field_c[4 + var2Lifetime2];
          var9 = var9 + this.field_c[var2Lifetime2 + 6];
          var8 = var8 + this.field_c[var2Lifetime2 + 5];
          var5 = var5 + this.field_c[2 + var2Lifetime2];
          var6 = var6 + this.field_c[3 + var2Lifetime2];
          var4 = var4 + this.field_c[var2Lifetime2 + 1];
          var3 = var3 + this.field_c[var2Lifetime2];
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
          this.field_c[var2Lifetime2] = var3;
          this.field_c[1 + var2Lifetime2] = var4;
          this.field_c[2 + var2Lifetime2] = var5;
          this.field_c[var2Lifetime2 + 3] = var6;
          this.field_c[4 + var2Lifetime2] = var7;
          this.field_c[5 + var2Lifetime2] = var8;
          this.field_c[6 + var2Lifetime2] = var9;
          this.field_c[var2Lifetime2 + 7] = var10;
        }
        this.a((byte) -9);
        this.field_a = 256;
    }

    public static void a(boolean param0) {
        if (param0) {
          mm.a(-39, (byte) 66);
        }
        field_j = null;
        field_d = null;
        field_b = null;
    }

    mm(int[] param0) {
        int var2_int = 0;
        try {
          this.field_g = new int[256];
          this.field_c = new int[256];
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            this.field_g[var2_int] = param0[var2_int];
          }
          this.b(83);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "mm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Click";
        field_j = null;
        field_d = "Waiting for fonts";
        field_i = 640;
    }
}
