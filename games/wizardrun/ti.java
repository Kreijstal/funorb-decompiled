/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    private int field_e;
    private int[] field_f;
    private int[] field_b;
    private int field_d;
    private int field_c;
    static int field_a;
    private int field_g;
    static String field_h;

    final static wd a(byte param0) {
        if (fi.field_y == ej.field_b) {
          throw new IllegalStateException();
        }
        if (fi.field_y == mi.field_z) {
          fi.field_y = ej.field_b;
          return ki.field_F;
        }
        int var1 = 86 / ((param0 - 59) / 38);
        return null;
    }

    private final void b(int param0) {
        int var2 = 0;
        int var11 = wizardrun.field_H;
        int var2Lifetime1;
        int var2Lifetime2;
        if (param0 > -92) {
          field_a = 113;
        }
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var5 = -1640531527;
        int var4 = -1640531527;
        int var10 = -1640531527;
        int var3 = -1640531527;
        int var6 = -1640531527;
        int var9 = -1640531527;
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
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var9 = var9 + this.field_f[var2Lifetime1 + 6];
          var6 = var6 + this.field_f[3 + var2Lifetime1];
          var4 = var4 + this.field_f[1 + var2Lifetime1];
          var3 = var3 + this.field_f[var2Lifetime1];
          var10 = var10 + this.field_f[7 + var2Lifetime1];
          var7 = var7 + this.field_f[var2Lifetime1 + 4];
          var8 = var8 + this.field_f[var2Lifetime1 + 5];
          var5 = var5 + this.field_f[2 + var2Lifetime1];
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
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_b[var2Lifetime1] = var3;
          this.field_b[var2Lifetime1 + 1] = var4;
          this.field_b[var2Lifetime1 + 2] = var5;
          this.field_b[3 + var2Lifetime1] = var6;
          this.field_b[4 + var2Lifetime1] = var7;
          this.field_b[5 + var2Lifetime1] = var8;
          this.field_b[var2Lifetime1 + 6] = var9;
          this.field_b[var2Lifetime1 + 7] = var10;
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var6 = var6 + this.field_b[3 + var2Lifetime2];
          var4 = var4 + this.field_b[var2Lifetime2 + 1];
          var9 = var9 + this.field_b[6 + var2Lifetime2];
          var7 = var7 + this.field_b[4 + var2Lifetime2];
          var3 = var3 + this.field_b[var2Lifetime2];
          var10 = var10 + this.field_b[7 + var2Lifetime2];
          var8 = var8 + this.field_b[var2Lifetime2 + 5];
          var5 = var5 + this.field_b[2 + var2Lifetime2];
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
          this.field_b[var2Lifetime2] = var3;
          this.field_b[1 + var2Lifetime2] = var4;
          this.field_b[2 + var2Lifetime2] = var5;
          this.field_b[var2Lifetime2 + 3] = var6;
          this.field_b[4 + var2Lifetime2] = var7;
          this.field_b[5 + var2Lifetime2] = var8;
          this.field_b[var2Lifetime2 + 6] = var9;
          this.field_b[var2Lifetime2 + 7] = var10;
        }
        this.d((byte) 121);
        this.field_g = 256;
    }

    private final void d(byte param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = wizardrun.field_H;
        int fieldTemp$0 = this.field_c + 1;
        this.field_c = this.field_c + 1;
        this.field_d = this.field_d + fieldTemp$0;
        if (param0 < 116) {
          return;
        }
        for (var2 = 0; var2 < 256; var2++) {
          var3 = this.field_b[var2];
          if (0 == (var2 & 2)) {
            if ((1 & var2) == 0) {
              this.field_e = this.field_e ^ this.field_e << 13;
            } else {
              this.field_e = this.field_e ^ this.field_e >>> 6;
            }
          } else {
            if (0 != (var2 & 1)) {
              this.field_e = this.field_e ^ this.field_e >>> 16;
            } else {
              this.field_e = this.field_e ^ this.field_e << 2;
            }
          }
          this.field_e = this.field_e + this.field_b[128 + var2 & 255];
          dupTemp$1 = this.field_d + (this.field_e + this.field_b[kl.b(255, var3 >> 2)]);
          var4 = dupTemp$1;
          this.field_b[var2] = dupTemp$1;
          dupTemp$2 = this.field_b[kl.b(261240, var4) >> 8 >> 2] + var3;
          this.field_d = dupTemp$2;
          this.field_f[var2] = dupTemp$2;
        }
        return;
    }

    public static void c(byte param0) {
        if (param0 != -80) {
          field_a = 73;
        }
        field_h = null;
    }

    final int b(byte param0) {
        if (0 == this.field_g) {
          this.d((byte) 121);
          this.field_g = 256;
        }
        if (param0 <= 58) {
          this.b(13);
        }
        int fieldTemp$0 = this.field_g - 1;
        this.field_g = this.field_g - 1;
        return this.field_f[fieldTemp$0];
    }

    final static gb a(int param0, String param1, kl param2, String param3, kl param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        gb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param2.b(-1, param1);
          var6 = param2.a(var5_int, param3, param0 - 800875572);
          if (param0 != 800863586) {
            field_h = (String) null;
          }
          stackIn_3_0 = dh.a(var6, var5_int, (byte) -119, param4, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ti.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    ti(int[] param0) {
        int var2_int = 0;
        try {
          this.field_b = new int[256];
          this.field_f = new int[256];
          for (var2_int = 0; var2_int < param0.length; var2_int++) {
            this.field_f[var2_int] = param0[var2_int];
          }
          this.b(-97);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "ti.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = wizardrun.field_H;
        try {
          if (!pk.a((byte) -35)) {
            if (ki.field_E != null &&
              ki.field_E.field_b) {
              di.a((byte) 60);
              kj.field_b.b((ub) (new vg(kj.field_b, cf.field_f)), (byte) 96);
            }
            return;
          }
          if (param0 != 8) {
            return;
          }
          kj.field_b.a(param0 + 118, true, ne.field_g, sf.field_d);
          kj.field_b.g((byte) 118);
          while (ae.a(-61)) {
            kj.field_b.a(param0 ^ -125, vk.field_r, ae.field_a);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "ti.B(" + param0 + ')');
        }
    }

    static {
        field_h = "Back";
    }
}
