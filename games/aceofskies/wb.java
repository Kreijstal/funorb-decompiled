/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb {
    static char[] field_b;
    private int field_g;
    private long[] field_e;
    private int field_c;
    private long[] field_d;
    static gh[] field_i;
    private byte[] field_h;
    private long[] field_f;
    private byte[] field_j;
    private long[] field_a;
    private long[] field_k;

    private final void a(byte param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var3Lifetime1Lifetime3;
        int var4Lifetime1Lifetime1;
        var6 = AceOfSkies.field_G ? 1 : 0;
        var2 = 0;
        var3 = 0;
        var4 = 116 % ((param0 - 75) / 32);
        while (var2 < 8) {
          this.field_e[var2] = un.a(ct.a(255L, (long)this.field_j[7 + var3]), un.a(ct.a((long)this.field_j[6 + var3] << 8, 65280L), un.a(ct.a(255L, (long)this.field_j[var3 + 5]) << 16, un.a(un.a(un.a(un.a((long)this.field_j[var3] << 56, ct.a((long)this.field_j[1 + var3], 255L) << 48), ct.a((long)this.field_j[2 + var3], 255L) << 40), ct.a((long)this.field_j[var3 + 3], 255L) << 32), ct.a((long)this.field_j[4 + var3] << 24, 4278190080L)))));
          var3 += 8;
          var2++;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_d[var2Lifetime1];
          arrayValue$1 = this.field_e[var2Lifetime1];
          this.field_f[var2Lifetime1] = dupTemp$0;
          this.field_k[var2Lifetime1] = un.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.field_a[var3Lifetime1] = 0L;
            var4Lifetime1 = 0;
            var5 = 56;
            while (var4Lifetime1 < 8) {
              this.field_a[var3Lifetime1] = un.a(this.field_a[var3Lifetime1], aj.field_t[var4Lifetime1][pg.a((int)(this.field_f[pg.a(var3Lifetime1 - var4Lifetime1, 7)] >>> var5), 255)]);
              var5 -= 8;
              var4Lifetime1++;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.field_f[var3Lifetime1Lifetime1] = this.field_a[var3Lifetime1Lifetime1];
          }
          this.field_f[0] = un.a(this.field_f[0], aj.field_w[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; 8 > var3Lifetime1Lifetime2; var3Lifetime1Lifetime2++) {
            this.field_a[var3Lifetime1Lifetime2] = this.field_f[var3Lifetime1Lifetime2];
            var4Lifetime1Lifetime1 = 0;
            var5Lifetime1 = 56;
            while (var4Lifetime1Lifetime1 < 8) {
              this.field_a[var3Lifetime1Lifetime2] = un.a(this.field_a[var3Lifetime1Lifetime2], aj.field_t[var4Lifetime1Lifetime1][pg.a(255, (int)(this.field_k[pg.a(-var4Lifetime1Lifetime1 + var3Lifetime1Lifetime2, 7)] >>> var5Lifetime1))]);
              var5Lifetime1 -= 8;
              var4Lifetime1Lifetime1++;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; 8 > var3Lifetime1Lifetime3; var3Lifetime1Lifetime3++) {
            this.field_k[var3Lifetime1Lifetime3] = this.field_a[var3Lifetime1Lifetime3];
          }
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_d[var2Lifetime3] = un.a(this.field_d[var2Lifetime3], un.a(this.field_k[var2Lifetime3], this.field_e[var2Lifetime3]));
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 17337) {
            return;
          }
          var2 = param0.getParameter("username");
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (AceOfSkies.a(var3, -119) != 0L) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("wb.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte[] param0, byte param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          this.field_j[this.field_g] = (byte)vo.a((int) this.field_j[this.field_g], 128 >>> pg.a(7, this.field_c));
          this.field_g = this.field_g + 1;
          if (this.field_g > 32) {
            while (64 > this.field_g) {
              fieldTemp$0 = this.field_g;
              this.field_g = this.field_g + 1;
              this.field_j[fieldTemp$0] = (byte) 0;
            }
            this.a((byte) 114);
            this.field_g = 0;
          }
          while (this.field_g < 32) {
            fieldTemp$1 = this.field_g;
            this.field_g = this.field_g + 1;
            this.field_j[fieldTemp$1] = (byte) 0;
          }
          au.a(this.field_h, 0, this.field_j, 32, 32);
          this.a((byte) 107);
          if (param1 != 82) {
            return;
          }
          var4_int = 0;
          var5 = param2;
          while (var4_int < 8) {
            var6 = this.field_d[var4_int];
            param0[var5] = (byte)(int)(var6 >>> 56);
            param0[1 + var5] = (byte)(int)(var6 >>> 48);
            param0[var5 + 2] = (byte)(int)(var6 >>> 40);
            param0[var5 + 3] = (byte)(int)(var6 >>> 32);
            param0[var5 + 4] = (byte)(int)(var6 >>> 24);
            param0[var5 + 5] = (byte)(int)(var6 >>> 16);
            param0[6 + var5] = (byte)(int)(var6 >>> 8);
            param0[var5 + 7] = (byte)(int)var6;
            var5 += 8;
            var4_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("wb.F(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static fn a(boolean param0, String param1, String param2, long param3, boolean param4) {
        RuntimeException var6 = null;
        java.applet.Applet var7 = null;
        ki stackIn_5_0 = null;
        ko stackIn_8_0 = null;
        pm stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param4) {
            var7 = (java.applet.Applet) null;
            wb.a((java.applet.Applet) null, -75);
          }
          if (param3 == 0L &&
            param1 != null) {
            stackIn_5_0 = new ki(param1, param2);
            return (fn) ((Object) stackIn_5_0);
          }
          if (!param0) {
            stackIn_10_0 = new pm(param3, param2);
            return (fn) ((Object) stackIn_10_0);
          }
          stackIn_8_0 = new ko(param3, param2);
          return (fn) ((Object) stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("wb.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = AceOfSkies.field_G ? 1 : 0;
        int var2Lifetime1;
        for (var2 = 0; 32 > var2; var2++) {
          this.field_h[var2] = (byte) 0;
        }
        this.field_c = 0;
        this.field_g = 0;
        this.field_j[0] = (byte)param0;
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          this.field_d[var2Lifetime1] = 0L;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_i = null;
        field_b = null;
    }

    final void a(int param0, byte[] param1, long param2) {
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var8Lifetime1;
        var13 = AceOfSkies.field_G ? 1 : 0;
        try {
          var5_int = 0;
          var6 = param0 - ((int)param2 & 7) & 7;
          var7 = 7 & this.field_c;
          var9 = param2;
          var11 = 31;
          var12 = 0;
          while (0 <= var11) {
            var12 = var12 + ((this.field_h[var11] & 255) + ((int)var9 & 255));
            this.field_h[var11] = (byte)var12;
            var9 = var9 >>> 8;
            var12 = var12 >>> 8;
            var11--;
          }
          while (param2 > 8L) {
            var8 = param1[var5_int] << var6 & 255 | (255 & param1[var5_int + 1]) >>> 8 - var6;
            if (0 <= var8 &&
              var8 < 256) {
              this.field_j[this.field_g] = (byte)vo.a((int) this.field_j[this.field_g], var8 >>> var7);
              this.field_c = this.field_c + (8 - var7);
              this.field_g = this.field_g + 1;
              if (this.field_c == 512) {
                this.a((byte) 109);
                this.field_c = 0;
                this.field_g = 0;
              }
              this.field_j[this.field_g] = (byte)pg.a(255, var8 << 8 - var7);
              param2 = param2 - 8L;
              this.field_c = this.field_c + var7;
              var5_int++;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param2 > 0L) {
            stackIn_15_0 = 255;
            stackIn_15_1 = param1[var5_int] << var6;
            var8Lifetime1 = stackIn_15_0 & stackIn_15_1;
            this.field_j[this.field_g] = (byte)vo.a((int) this.field_j[this.field_g], var8Lifetime1 >>> var7);
          } else {
            var8Lifetime1 = 0;
          }
          if (param2 + (long)var7 < 8L) {
            this.field_c = (int)((long)this.field_c + param2);
          } else {
            this.field_g = this.field_g + 1;
            param2 = param2 - (long)(8 - var7);
            this.field_c = this.field_c + (-var7 + 8);
            if (this.field_c == 512) {
              this.a((byte) 123);
              this.field_g = 0;
              this.field_c = 0;
            }
            this.field_j[this.field_g] = (byte)pg.a(255, var8Lifetime1 << -var7 + 8);
            this.field_c = this.field_c + (int)param2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("wb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(')').toString());
        }
    }

    wb() {
        this.field_g = 0;
        this.field_c = 0;
        this.field_h = new byte[32];
        this.field_e = new long[8];
        this.field_f = new long[8];
        this.field_a = new long[8];
        this.field_d = new long[8];
        this.field_j = new byte[64];
        this.field_k = new long[8];
    }

    static {
        field_b = new char[]{(char)91, (char)93, (char)35};
        nb.a(10536, 50);
    }
}
