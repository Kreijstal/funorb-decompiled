/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    private int[] field_c;
    static ak field_b;
    private int field_d;
    private int[] field_h;
    private int field_i;
    static boolean field_g;
    static String field_j;
    private int field_f;
    private int field_e;
    static String field_a;

    final static hh a(int param0, fm param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 114) {
            field_a = (String) null;
          }
          if (rk.a(param2, false, param1, param0)) {
            return tj.b((byte) -103);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("lh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var12 = Pixelate.field_H ? 1 : 0;
        int var9 = -1640531527;
        int var5 = -1640531527;
        int var7 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var6 = -1640531527;
        int var11 = -48 % ((param0 - 36) / 44);
        int var8 = -1640531527;
        int var10 = -1640531527;
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
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var3 = var3 + this.field_h[var2Lifetime1];
          var7 = var7 + this.field_h[4 + var2Lifetime1];
          var4 = var4 + this.field_h[var2Lifetime1 + 1];
          var8 = var8 + this.field_h[var2Lifetime1 + 5];
          var10 = var10 + this.field_h[var2Lifetime1 + 7];
          var5 = var5 + this.field_h[2 + var2Lifetime1];
          var6 = var6 + this.field_h[3 + var2Lifetime1];
          var9 = var9 + this.field_h[6 + var2Lifetime1];
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
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_c[var2Lifetime1] = var3;
          this.field_c[var2Lifetime1 + 1] = var4;
          this.field_c[var2Lifetime1 + 2] = var5;
          this.field_c[3 + var2Lifetime1] = var6;
          this.field_c[4 + var2Lifetime1] = var7;
          this.field_c[5 + var2Lifetime1] = var8;
          this.field_c[6 + var2Lifetime1] = var9;
          this.field_c[7 + var2Lifetime1] = var10;
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var3 = var3 + this.field_c[var2Lifetime2];
          var10 = var10 + this.field_c[7 + var2Lifetime2];
          var4 = var4 + this.field_c[var2Lifetime2 + 1];
          var9 = var9 + this.field_c[6 + var2Lifetime2];
          var5 = var5 + this.field_c[var2Lifetime2 + 2];
          var7 = var7 + this.field_c[var2Lifetime2 + 4];
          var6 = var6 + this.field_c[3 + var2Lifetime2];
          var8 = var8 + this.field_c[5 + var2Lifetime2];
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
          this.field_c[var2Lifetime2 + 2] = var5;
          this.field_c[3 + var2Lifetime2] = var6;
          this.field_c[4 + var2Lifetime2] = var7;
          this.field_c[5 + var2Lifetime2] = var8;
          this.field_c[6 + var2Lifetime2] = var9;
          this.field_c[var2Lifetime2 + 7] = var10;
        }
        this.a(false);
        this.field_e = 256;
    }

    final int a(int param0) {
        if (0 == this.field_e) {
          this.a(false);
          this.field_e = 256;
        }
        if (param0 != 256) {
          this.field_f = -113;
        }
        int fieldTemp$0 = this.field_e - 1;
        this.field_e = this.field_e - 1;
        return this.field_h[fieldTemp$0];
    }

    private final void a(boolean param0) {
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = Pixelate.field_H ? 1 : 0;
        int fieldTemp$0 = this.field_d + 1;
        this.field_d = this.field_d + 1;
        this.field_i = this.field_i + fieldTemp$0;
        var2 = 0;
        if (param0) {
          this.field_f = 19;
        }
        while (var2 < 256) {
          var3 = this.field_c[var2];
          if ((2 & var2) == 0) {
            if (0 != (var2 & 1)) {
              this.field_f = this.field_f ^ this.field_f >>> 6;
            } else {
              this.field_f = this.field_f ^ this.field_f << 13;
            }
          } else {
            if ((1 & var2) != 0) {
              this.field_f = this.field_f ^ this.field_f >>> 16;
            } else {
              this.field_f = this.field_f ^ this.field_f << 2;
            }
          }
          this.field_f = this.field_f + this.field_c[255 & var2 + 128];
          dupTemp$1 = this.field_i + this.field_f + this.field_c[cm.a(255, var3 >> 2)];
          var4 = dupTemp$1;
          this.field_c[var2] = dupTemp$1;
          dupTemp$2 = this.field_c[cm.a(255, var4 >> 8 >> 2)] + var3;
          this.field_i = dupTemp$2;
          this.field_h[var2] = dupTemp$2;
          var2++;
        }
    }

    public static void c(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 7) {
          return;
        }
        field_j = null;
    }

    final static ld a(fm param0, int param1, int param2, fm param3, int param4) {
        RuntimeException var5 = null;
        ld stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!rk.a(param4, false, param0, param1)) {
            return null;
          }
          if (param2 != 48077700) {
            field_j = (String) null;
          }
          stackIn_6_0 = on.a(param3.a(param1, param4, true), param2 ^ 48077726);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("lh.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(')').toString());
        }
    }

    lh(int[] param0) {
        int var2_int = 0;
        try {
          this.field_h = new int[256];
          this.field_c = new int[256];
          for (var2_int = 0; var2_int < param0.length; var2_int++) {
            this.field_h[var2_int] = param0[var2_int];
          }
          this.b(-60);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "lh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = "Security";
        field_a = "Please try again in a few minutes.";
    }
}
