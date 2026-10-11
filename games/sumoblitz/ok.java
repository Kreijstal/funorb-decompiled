/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    private int field_a;
    private int[] field_e;
    static boolean field_b;
    static hr[] field_j;
    private int[] field_c;
    static int field_k;
    static hr[] field_f;
    private int field_g;
    private int field_h;
    static ri[] field_d;
    private int field_i;

    private final void c(byte param0) {
        int var2 = 0;
        int var11 = Sumoblitz.field_L ? 1 : 0;
        int var3 = -1640531527;
        int var9 = -1640531527;
        int var4 = -1640531527;
        int var7 = -1640531527;
        int var6 = -1640531527;
        int var8 = -1640531527;
        int var5 = -1640531527;
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
          var3 = var3 + var4;
          var5 = var5 + var10;
        }
        if (param0 != -34) {
          return;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var10 = var10 + this.field_c[7 + var2Lifetime1];
          var9 = var9 + this.field_c[6 + var2Lifetime1];
          var5 = var5 + this.field_c[var2Lifetime1 + 2];
          var3 = var3 + this.field_c[var2Lifetime1];
          var8 = var8 + this.field_c[var2Lifetime1 + 5];
          var6 = var6 + this.field_c[var2Lifetime1 + 3];
          var7 = var7 + this.field_c[var2Lifetime1 + 4];
          var4 = var4 + this.field_c[var2Lifetime1 + 1];
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
          this.field_e[var2Lifetime1] = var3;
          this.field_e[1 + var2Lifetime1] = var4;
          this.field_e[var2Lifetime1 + 2] = var5;
          this.field_e[3 + var2Lifetime1] = var6;
          this.field_e[var2Lifetime1 + 4] = var7;
          this.field_e[5 + var2Lifetime1] = var8;
          this.field_e[var2Lifetime1 + 6] = var9;
          this.field_e[var2Lifetime1 + 7] = var10;
        }
        for (var2Lifetime2 = 0; 256 > var2Lifetime2; var2Lifetime2 += 8) {
          var4 = var4 + this.field_e[var2Lifetime2 + 1];
          var9 = var9 + this.field_e[6 + var2Lifetime2];
          var3 = var3 + this.field_e[var2Lifetime2];
          var5 = var5 + this.field_e[2 + var2Lifetime2];
          var6 = var6 + this.field_e[var2Lifetime2 + 3];
          var7 = var7 + this.field_e[4 + var2Lifetime2];
          var8 = var8 + this.field_e[var2Lifetime2 + 5];
          var10 = var10 + this.field_e[7 + var2Lifetime2];
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
          this.field_e[var2Lifetime2] = var3;
          this.field_e[var2Lifetime2 + 1] = var4;
          this.field_e[2 + var2Lifetime2] = var5;
          this.field_e[3 + var2Lifetime2] = var6;
          this.field_e[var2Lifetime2 + 4] = var7;
          this.field_e[var2Lifetime2 + 5] = var8;
          this.field_e[6 + var2Lifetime2] = var9;
          this.field_e[var2Lifetime2 + 7] = var10;
        }
        this.a((byte) 87);
        this.field_g = 256;
    }

    final int a(int param0) {
        if (param0 != 256) {
          this.c((byte) -25);
        }
        if (this.field_g == 0) {
          this.a((byte) -45);
          this.field_g = 256;
        }
        int fieldTemp$0 = this.field_g - 1;
        this.field_g = this.field_g - 1;
        return this.field_c[fieldTemp$0];
    }

    public static void b(byte param0) {
        field_j = null;
        field_d = null;
        if (param0 > -110) {
          field_b = false;
        }
        field_f = null;
    }

    private final void a(byte param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var3 = 71 % ((param0 - 17) / 37);
        int fieldTemp$0 = this.field_a + 1;
        this.field_a = this.field_a + 1;
        this.field_h = this.field_h + fieldTemp$0;
        for (var2 = 0; var2 < 256; var2++) {
          var4 = this.field_e[var2];
          if (0 != (var2 & 2)) {
            if (0 == (1 & var2)) {
              this.field_i = this.field_i ^ this.field_i << 2;
            } else {
              this.field_i = this.field_i ^ this.field_i >>> 16;
            }
          } else {
            if ((1 & var2) != 0) {
              this.field_i = this.field_i ^ this.field_i >>> 6;
            } else {
              this.field_i = this.field_i ^ this.field_i << 13;
            }
          }
          this.field_i = this.field_i + this.field_e[var2 + 128 & 255];
          dupTemp$1 = this.field_i + this.field_e[eb.a(1020, var4) >> 2] + this.field_h;
          var5 = dupTemp$1;
          this.field_e[var2] = dupTemp$1;
          dupTemp$2 = var4 + this.field_e[eb.a(255, var5 >> 8 >> 2)];
          this.field_h = dupTemp$2;
          this.field_c[var2] = dupTemp$2;
        }
    }

    final static l[] a(int param0, pl param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        l[] var4 = null;
        int var5 = 0;
        l var6_ref_l = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        l[] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_int = param1.b(8, (byte) -97);
          if (var2_int > 0) {
            stackIn_3_0 = null;
            return (l[]) (stackIn_3_0);
          }
          var3 = param1.b(12, (byte) -115);
          var4 = new l[var3];
          var5 = 0;
          if (param0 > -74) {
            field_k = 85;
          }
          while (var3 > var5) {
            if (!kh.a(param1, false)) {
              var6 = param1.b(si.c(-1 + var5, 1), (byte) -123);
              var4[var5] = var4[var6];
            } else {
              var6_ref_l = new l();
              param1.b(24, (byte) -89);
              param1.b(24, (byte) -117);
              var6_ref_l.field_b = param1.b(24, (byte) -119);
              param1.b(9, (byte) -119);
              param1.b(12, (byte) -101);
              param1.b(12, (byte) -125);
              param1.b(12, (byte) -93);
              var4[var5] = var6_ref_l;
            }
            var5++;
          }
          stackIn_12_0 = var4;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("ok.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        gk var4_ref_gk = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        gk var17 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Sumoblitz.field_L ? 1 : 0;
        try {
          pn.field_k = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = mr.field_b.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var1_int > var3; var3++) {
            var4_ref_gk = mr.field_b[var3];
            var4_ref_gk.a(false);
            cb.a((byte) 79, var3);
            var5 = var4_ref_gk.field_T + var4_ref_gk.field_t >> 1;
            var6 = var4_ref_gk.field_j + var4_ref_gk.field_f >> 1;
            var7 = var4_ref_gk.field_P + var4_ref_gk.field_S >> 1;
            var8 = pn.field_k[9] >> 2;
            var9 = pn.field_k[10] >> 2;
            var10_int = pn.field_k[11] >> 2;
            var11 = var9 * uc.field_b[4] + uc.field_b[3] * var8 + uc.field_b[5] * var10_int >> 14;
            var12 = var10_int * uc.field_b[8] + uc.field_b[7] * var9 + var8 * uc.field_b[6] >> 14;
            var13 = uc.field_b[11] * var10_int + (uc.field_b[9] * var8 + uc.field_b[10] * var9) >> 14;
            var2[var3] = var13 * var7 + var11 * var5 + var12 * var6 >> 16;
          }
          var3Lifetime1 = pn.field_k[9] >> 8;
          var4 = pn.field_k[10] >> 8;
          var5Lifetime1 = pn.field_k[11] >> 8;
          var6Lifetime1 = td.field_u << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = ic.b(var6Lifetime1, -431) >> 8;
          var9Lifetime1 = cn.c(param0 - 256, var6Lifetime1) >> 8;
          if (ko.field_p != -1 &&
            pi.field_e != -1) {
            var9Lifetime1 = -128;
            var7Lifetime1 = ko.field_p - 320;
            var8Lifetime1 = -pi.field_e + 240;
          }
          var10 = (double)param0 / Math.sqrt((double)(var9Lifetime1 * var9Lifetime1 + (var7Lifetime1 * var7Lifetime1 + var8Lifetime1 * var8Lifetime1)));
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var12Lifetime1 = -var3Lifetime1 + var7Lifetime1;
          var13Lifetime1 = -var4 + var8Lifetime1;
          var14 = var9Lifetime1 - var5Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var13Lifetime1 * var13Lifetime1 + (var12Lifetime1 * var12Lifetime1 + var14 * var14)));
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          var14 = (int)((double)var14 * var10Lifetime1);
          for (var15 = 0; var15 < mr.field_b.length; var15++) {
            var16 = 0;
            for (var17_int = 1; mr.field_b.length > var17_int; var17_int++) {
              if (var21[var17_int] > var21[var16]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17 = mr.field_b[var16];
            cb.a((byte) 79, var16);
            for (var18 = 0; 3 > var18; var18++) {
              uc.field_b[var18] = uc.field_b[var18] + kh.field_c[var15][var18];
            }
            up.a(pn.field_k, uc.field_b, false, false, var17, true, -1622738130);
            qu.a(var7Lifetime1, var17, var14, var12Lifetime1, var9Lifetime1, var13Lifetime1, (byte) -9, var8Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "ok.F(" + param0 + ')');
        }
    }

    ok(int[] param0) {
        int var2_int = 0;
        try {
          this.field_c = new int[256];
          this.field_e = new int[256];
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            this.field_c[var2_int] = param0[var2_int];
          }
          this.c((byte) -34);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ok.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = false;
    }
}
