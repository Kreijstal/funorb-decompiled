/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nia extends ci {
    static String field_m;

    final int[] c(int param0, int param1) {
        int var7 = 0;
        int[] var3;
        int var8;
        int var9;
        int[] var19;
        int[] var20;
        int[] var21;
        var9 = TombRacer.field_G ? 1 : 0;
        var3 = this.field_i.a((byte) 23, param1);
        if (this.field_i.field_d) {
          var21 = this.c(0, -39, param1);
          var20 = this.c(1, -74, param1);
          var19 = this.c(2, -7, param1);
          for (var7 = 0; ns.field_g > var7; var7++) {
            var8 = var19[var7];
            if (var8 == 4096) {
              var3[var7] = var21[var7];
            } else {
              if (var8 == 0) {
                var3[var7] = var20[var7];
              } else {
                var3[var7] = var20[var7] * (4096 - var8) + var8 * var21[var7] >> 12;
              }
            }
          }
        }
        if (param0 == 1) {
          return var3;
        }
        return (int[]) null;
    }

    final int[][] b(int param0, int param1) {
        int var16 = 0;
        int[][] var3;
        int[] var7;
        int[] var8;
        int[] var9;
        int var17;
        int var19;
        int[][] var20;
        int[][] var21;
        int[][] var31;
        int[][] var50;
        int[][] var51;
        int[] var52;
        int[] var53;
        int[] var54;
        int[] var55;
        int[] var56;
        int[] var57;
        int[] var58;
        int var18;
        int[] var56Lifetime1;
        var19 = TombRacer.field_G ? 1 : 0;
        if (param1 != -1) {
          nia.d(86);
        }
        var31 = this.field_h.a(param0, (byte) 113);
        var21 = var31;
        var20 = var21;
        var3 = var20;
        if (this.field_h.field_f) {
          var52 = this.c(2, -104, param0);
          var50 = this.a(param0, 0, -1);
          var51 = this.a(param0, 1, param1 + 0);
          var7 = var31[0];
          var8 = var31[1];
          var9 = var31[2];
          var53 = var50[0];
          var54 = var50[1];
          var55 = var50[2];
          var56 = var51[0];
          var57 = var51[1];
          var58 = var51[2];
          for (var16 = 0; var16 < ns.field_g; var16++) {
            var17 = var52[var16];
            if (4096 != var17) {
              var56Lifetime1 = var51[0];
              if (0 == var17) {
                var56Lifetime1 = var51[0];
                var7[var16] = var56Lifetime1[var16];
                var8[var16] = var57[var16];
                var9[var16] = var58[var16];
              } else {
                var18 = 4096 - var17;
                var7[var16] = var17 * var53[var16] + var56Lifetime1[var16] * var18 >> 12;
                var8[var16] = var18 * var57[var16] + var17 * var54[var16] >> 12;
                var9[var16] = var18 * var58[var16] + var55[var16] * var17 >> 12;
              }
            } else {
              var7[var16] = var53[var16];
              var8[var16] = var54[var16];
              var9[var16] = var55[var16];
            }
          }
        }
        return var3;
    }

    final static iu a(cn param0, String param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        iu stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.b(param1, -7768);
          var6 = 88 / ((-9 - param3) / 60);
          var5 = param0.a(true, param2, var4_int);
          stackIn_1_0 = ot.a(var4_int, var5, param0, true);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("nia.D(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    public nia() {
        super(3, false);
    }

    final static void d(int param0) {
        tga.field_a = baa.field_d.field_i.field_d;
        tga.field_a.b(8192);
        iga.field_o = uja.a((byte) 65, tga.field_a);
        sw.k((byte) 94);
        hm.h((byte) 45);
        if (param0 != -25405) {
          String var2 = (String) null;
          nia.a((cn) null, (String) null, (String) null, 78);
        }
        rka.a(false);
        ina.a(tga.field_a, 0);
        ob.a(tga.field_a, 17186);
        wpa.a(tga.field_a, -90);
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        int var6 = 0;
        int incrementValue$1 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          if (param3 != 255) {
            var10 = (byte[]) null;
            nia.a((byte[]) null, -10, 68, 102);
          }
          var12 = new char[param2];
          var11 = var12;
          var4 = var11;
          var5 = 0;
          for (var6 = 0; param2 > var6; var6++) {
            var7 = 255 & param0[var6 + param1];
            if (var7 != 0) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = gha.field_a[var7 - 128];
                if (0 == var8) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$1] = (char)var7;
            }
          }
          stackIn_15_0 = new String(var12, 0, var5);
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_18_0 = var4_ref;
          stackIn_18_1 = new StringBuilder().append("nia.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0, uia param1, int param2) {
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 == 0) {
            stackIn_4_1 = (param1.h(255) == 1);
            this.field_g = stackIn_4_1;
          }
          if (param0 != 107) {
            field_m = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("nia.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void c(int param0) {
        if (param0 > -118) {
          field_m = (String) null;
        }
        field_m = null;
    }

    static {
        field_m = "Invalid date";
    }
}
