/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl extends ci {
    static int field_m;

    final int[] c(int param0, int param1) {
        int var4 = 0;
        int[] var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param0 != 1) {
          CharSequence var7 = (CharSequence) null;
          fl.a((byte) -31, (CharSequence) null);
        }
        int[] var8 = this.field_i.a((byte) -111, param1);
        int[] var3 = var8;
        if (this.field_i.field_d) {
          for (var4 = 0; ns.field_g > var4; var4++) {
            this.d(var4, param1, -5455);
            var5 = this.c(0, -70, fv.field_e);
            var8[var4] = var5[boa.field_o];
          }
        }
        return var3;
    }

    final static String a(byte param0, CharSequence param1) {
        int var5 = 0;
        int var2_int = 0;
        int var3 = 0;
        char[] var4 = null;
        int var6 = 0;
        int var7 = 0;
        char[] var8 = null;
        char[] var9 = null;
        String stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          var3 = 4 % ((64 - param0) / 38);
          var2_int = param1.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          var9 = new char[var2_int];
          var8 = var9;
          var4 = var8;
          for (var5 = 0; var2_int > var5; var5++) {
            var6 = param1.charAt(var5);
            if (65 <= var6 &&
              var6 <= 90) {
              var4[var5] = (char)(32 + var6);
            } else if ((var6 < 97 ||
              var6 > 122) &&
              (var6 < 48 ||
              var6 > 57)) {
              var4[var5] = (char)95;
            } else {
              var4[var5] = (char)var6;
            }
          }
          stackIn_20_0 = new String(var9);
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("fl.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final void d(int param0, int param1, int param2) {
        int var4;
        int var5;
        float var6;
        int var7;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param2 != -5455) {
          field_m = -128;
        }
        var4 = ht.field_Fb[param0];
        var5 = sj.field_b[param1];
        var6 = (float)Math.atan2((double)(-2048 + var4), (double)(var5 - 2048));
        if ((double)var6 >= -3.141592653589793 &&
          -2.356194490192345 >= (double)var6) {
          fv.field_e = param1;
          boa.field_o = param0;
        } else if ((double)var6 <= -1.5707963267948966 &&
          (double)var6 >= -2.356194490192345) {
          boa.field_o = param1;
          fv.field_e = param0;
        } else if (-0.7853981633974483 >= (double)var6 &&
          -1.5707963267948966 <= (double)var6) {
          fv.field_e = param0;
          boa.field_o = -param1 + ns.field_g;
        } else if (var6 <= 0.0f &&
          (double)var6 >= -0.7853981633974483) {
          boa.field_o = param0;
          fv.field_e = qda.field_i - param1;
        } else if (0.0f <= var6 &&
          (double)var6 <= 0.7853981633974483) {
          fv.field_e = qda.field_i - param1;
          boa.field_o = ns.field_g - param0;
        } else if ((double)var6 >= 0.7853981633974483 &&
          (double)var6 <= 1.5707963267948966) {
          boa.field_o = ns.field_g - param1;
          fv.field_e = qda.field_i - param0;
        } else if ((double)var6 >= 1.5707963267948966 &&
          2.356194490192345 >= (double)var6) {
          boa.field_o = param1;
          fv.field_e = qda.field_i - param0;
        } else {
          if (2.356194490192345 <= (double)var6 &&
            (double)var6 <= 3.141592653589793) {
            fv.field_e = param1;
            boa.field_o = -param0 + ns.field_g;
          }
        }
        fv.field_e = fv.field_e & hba.field_b;
        boa.field_o = boa.field_o & una.field_b;
    }

    final void a(byte param0, uia param1, int param2) {
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (0 == param2) {
            stackIn_5_1 = (param1.h(param0 + 148) == 1);
            this.field_g = stackIn_5_1;
          }
          if (param0 != 107) {
            field_m = -44;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("fl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final int[][] b(int param0, int param1) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int[][] var14 = null;
        int var9 = TombRacer.field_G ? 1 : 0;
        int[][] var13 = this.field_h.a(param0, (byte) -43);
        int[][] var11 = var13;
        int[][] var10 = var11;
        int[][] var3 = var10;
        if (this.field_h.field_f) {
          var4 = var13[0];
          var5 = var13[1];
          var6 = var13[2];
          for (var7 = 0; var7 < ns.field_g; var7++) {
            this.d(var7, param0, -5455);
            var14 = this.a(fv.field_e, 0, -1);
            var4[var7] = var14[0][boa.field_o];
            var5[var7] = var14[1][boa.field_o];
            var6[var7] = var14[2][boa.field_o];
          }
        }
        if (param1 != -1) {
          this.d(68, 15, 61);
        }
        return var3;
    }

    public fl() {
        super(1, false);
    }

    static {
        field_m = 0;
    }
}
