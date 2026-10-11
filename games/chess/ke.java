/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static String field_e;
    static int field_d;
    private int field_k;
    private int[] field_j;
    static km[] field_g;
    private int field_m;
    static String field_b;
    static String field_l;
    private int field_h;
    static String[] field_i;
    private int field_f;
    static String field_c;
    private int[] field_a;

    final static int a(byte[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 21106) {
            stackIn_4_0 = ci.a(-82, param0, 0, param2);
            return stackIn_4_0;
          }
          stackIn_2_0 = -122;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ke.F(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final int b(int param0) {
        if (param0 == ~this.field_k) {
          this.a(true);
          this.field_k = 256;
        }
        int fieldTemp$0 = this.field_k - 1;
        this.field_k = this.field_k - 1;
        return this.field_a[fieldTemp$0];
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = Chess.field_G;
        if (!param0) {
          this.a(true);
        }
        int fieldTemp$0 = this.field_h + 1;
        this.field_h = this.field_h + 1;
        this.field_f = this.field_f + fieldTemp$0;
        for (var2 = 0; var2 < 256; var2++) {
          var3 = this.field_j[var2];
          if ((2 & var2) == 0) {
            if ((var2 & 1) == 0) {
              this.field_m = this.field_m ^ this.field_m << 13;
            } else {
              this.field_m = this.field_m ^ this.field_m >>> 6;
            }
          } else {
            if ((var2 & 1) != 0) {
              this.field_m = this.field_m ^ this.field_m >>> 16;
            } else {
              this.field_m = this.field_m ^ this.field_m << 2;
            }
          }
          this.field_m = this.field_m + this.field_j[255 & var2 + 128];
          dupTemp$1 = this.field_m + this.field_j[ce.a(1020, var3) >> 2] + this.field_f;
          var4 = dupTemp$1;
          this.field_j[var2] = dupTemp$1;
          dupTemp$2 = var3 + this.field_j[ce.a(var4, 261311) >> 8 >> 2];
          this.field_f = dupTemp$2;
          this.field_a[var2] = dupTemp$2;
        }
    }

    final static void a(int param0, int param1, String param2, int param3, int param4, String param5) {
        int var7 = 0;
        nk var8 = qn.field_U;
        var8.f(param3, param0 ^ -9832);
        var8.field_l = var8.field_l + 1;
        if (param0 != 9822) {
          return;
        }
        try {
          var7 = var8.field_l;
          var8.c(param1, (byte) 127);
          if (param1 == 2) {
            var8.a(param0 - 9921, param2);
          }
          if (param5 == null) {
            var8.b(param4, 119);
          } else {
            rm.a(var8, param5, param0 ^ 16701600);
          }
          var8.a(-var7 + var8.field_l, -1);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ke.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var11 = Chess.field_G;
        int var2Lifetime1;
        int var2Lifetime2;
        if (param0 != 41) {
          byte[] var12 = (byte[]) null;
          ke.a((byte[]) null, -20, 3);
        }
        int var5 = -1640531527;
        int var9 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var6 = -1640531527;
        int var8 = -1640531527;
        int var7 = -1640531527;
        int var10 = -1640531527;
        for (var2 = 0; 4 > var2; var2++) {
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
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
        }
        for (var2Lifetime1 = 0; 256 > var2Lifetime1; var2Lifetime1 += 8) {
          var6 = var6 + this.field_a[3 + var2Lifetime1];
          var5 = var5 + this.field_a[2 + var2Lifetime1];
          var9 = var9 + this.field_a[var2Lifetime1 + 6];
          var8 = var8 + this.field_a[var2Lifetime1 + 5];
          var4 = var4 + this.field_a[var2Lifetime1 + 1];
          var10 = var10 + this.field_a[7 + var2Lifetime1];
          var3 = var3 + this.field_a[var2Lifetime1];
          var7 = var7 + this.field_a[4 + var2Lifetime1];
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
          this.field_j[var2Lifetime1] = var3;
          this.field_j[1 + var2Lifetime1] = var4;
          this.field_j[var2Lifetime1 + 2] = var5;
          this.field_j[var2Lifetime1 + 3] = var6;
          this.field_j[var2Lifetime1 + 4] = var7;
          this.field_j[var2Lifetime1 + 5] = var8;
          this.field_j[6 + var2Lifetime1] = var9;
          this.field_j[var2Lifetime1 + 7] = var10;
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var8 = var8 + this.field_j[5 + var2Lifetime2];
          var6 = var6 + this.field_j[3 + var2Lifetime2];
          var7 = var7 + this.field_j[var2Lifetime2 + 4];
          var4 = var4 + this.field_j[var2Lifetime2 + 1];
          var10 = var10 + this.field_j[var2Lifetime2 + 7];
          var9 = var9 + this.field_j[var2Lifetime2 + 6];
          var3 = var3 + this.field_j[var2Lifetime2];
          var5 = var5 + this.field_j[2 + var2Lifetime2];
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
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_j[var2Lifetime2] = var3;
          this.field_j[var2Lifetime2 + 1] = var4;
          this.field_j[var2Lifetime2 + 2] = var5;
          this.field_j[3 + var2Lifetime2] = var6;
          this.field_j[var2Lifetime2 + 4] = var7;
          this.field_j[var2Lifetime2 + 5] = var8;
          this.field_j[6 + var2Lifetime2] = var9;
          this.field_j[var2Lifetime2 + 7] = var10;
        }
        this.a(true);
        this.field_k = 256;
    }

    final static lb a(int param0) {
        if (param0 != -27212) {
          byte[] var2 = (byte[]) null;
          ke.a((byte[]) null, 98, 120);
        }
        return rm.field_M;
    }

    public static void a(byte param0) {
        field_i = null;
        int var1 = 34 % ((-24 - param0) / 47);
        field_b = null;
        field_e = null;
        field_l = null;
        field_c = null;
        field_g = null;
    }

    ke(int[] param0) {
        int var2_int = 0;
        try {
          this.field_a = new int[256];
          this.field_j = new int[256];
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            this.field_a[var2_int] = param0[var2_int];
          }
          this.b((byte) 41);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ke.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = 3;
        field_b = "Ignore";
        field_l = "Spectate";
        field_i = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_c = "The game options are not all set.";
        field_e = "You are playing as <%0>";
    }
}
