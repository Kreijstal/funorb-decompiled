/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jia extends k {
    static String field_l;
    private int field_n;
    static java.applet.Applet field_m;
    private int field_k;

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        boolean stackIn_13_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = BachelorFridge.field_y;
        try {
          if (param0 != -71) {
            field_m = (java.applet.Applet) null;
          }
          var4_int = param2;
          if (var4_int != 0) {
            if (var4_int == 1) {
              this.field_n = param1.b(16711935);
            } else {
              if (var4_int == 2) {
                stackIn_13_1 = (1 == param1.b(param0 ^ -16711866));
                this.field_f = stackIn_13_1;
              }
            }
          } else {
            this.field_k = param1.b(16711935);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("jia.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_l = null;
        if (param0) {
          field_l = (String) null;
        }
        field_m = null;
    }

    public jia() {
        super(1, false);
        this.field_n = 1;
        this.field_k = 1;
    }

    final int[][] a(boolean param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[][][] var38 = null;
        int[][][] var30 = null;
        int[][][] var8 = null;
        int var9_int = 0;
        int[][] var46 = null;
        int[][] var50 = null;
        int[] var49 = null;
        int[] var48 = null;
        int[] var47 = null;
        int var18_int = 0;
        int var19_int = 0;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int var21 = 0;
        int var22 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int var15 = 0;
        int var16 = 0;
        int[][] var51 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var23 = BachelorFridge.field_y;
        int[][] var37 = this.field_h.a(param1, -858);
        int[][] var29 = var37;
        int[][] var3 = var29;
        int var22Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        if (param0) {
          this.field_k = -49;
        }
        if (this.field_h.field_b) {
          var4 = this.field_n + this.field_n + 1;
          var5 = 65536 / var4;
          var6 = 1 + this.field_k + this.field_k;
          var7 = 65536 / var6;
          var38 = new int[var4][][];
          var30 = var38;
          var8 = var30;
          for (var9_int = param1 - this.field_n; this.field_n + param1 >= var9_int; var9_int++) {
            var46 = this.a((byte) -59, 0, var9_int & it.field_r);
            var50 = new int[3][hh.field_d];
            var12 = 0;
            var13 = 0;
            var14 = 0;
            var49 = var46[0];
            var48 = var46[1];
            var47 = var46[2];
            for (var18_int = -this.field_k; this.field_k >= var18_int; var18_int++) {
              var19_int = var18_int & wp.field_r;
              var14 = var14 + var47[var19_int];
              var13 = var13 + var48[var19_int];
              var12 = var12 + var49[var19_int];
            }
            var18 = var50[0];
            var19 = var50[1];
            var20 = var50[2];
            var21 = 0;
            while (var21 < hh.field_d) {
              var18[var21] = var7 * var12 >> 16;
              var19[var21] = var7 * var13 >> 16;
              var20[var21] = var14 * var7 >> 16;
              var22 = -this.field_k + var21 & wp.field_r;
              var13 = var13 - var48[var22];
              var21++;
              var14 = var14 - var47[var22];
              var12 = var12 - var49[var22];
              var22Lifetime1 = var21 + this.field_k & wp.field_r;
              var13 = var13 + var48[var22Lifetime1];
              var14 = var14 + var47[var22Lifetime1];
              var12 = var12 + var49[var22Lifetime1];
            }
            var8[-param1 + var9_int + this.field_n] = var50;
          }
          var9 = var37[0];
          var10 = var37[1];
          var11 = var37[2];
          for (var12Lifetime1 = 0; var12Lifetime1 < hh.field_d; var12Lifetime1++) {
            var13Lifetime1 = 0;
            var14Lifetime1 = 0;
            var15 = 0;
            for (var16 = 0; var4 > var16; var16++) {
              var51 = var38[var16];
              var14Lifetime1 = var14Lifetime1 + var51[1][var12Lifetime1];
              var13Lifetime1 = var13Lifetime1 + var51[0][var12Lifetime1];
              var15 = var15 + var51[2][var12Lifetime1];
            }
            var9[var12Lifetime1] = var5 * var13Lifetime1 >> 16;
            var10[var12Lifetime1] = var5 * var14Lifetime1 >> 16;
            var11[var12Lifetime1] = var15 * var5 >> 16;
          }
        }
        return var3;
    }

    final static void a(po param0, mla param1, int param2, byte param3, String param4) {
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        try {
          var5_int = 0;
          var6 = -1;
          for (var7 = 1; var7 < param4.length(); var7++) {
            var8 = param4.charAt(var7);
            if (60 == var8) {
              var6 = (var5_int >> 8) + (param1.field_a[0] + param0.a(param4.substring(0, var7)));
            }
            if (-1 == var6) {
              if (32 == var8) {
                var5_int = var5_int + param2;
              }
              param1.field_a[var7] = param1.field_a[0] + (var5_int >> 8) + param0.a(param4.substring(0, var7 + 1)) - param0.a((char) var8);
            } else {
              param1.field_a[var7] = var6;
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          if (param3 >= -63) {
            field_l = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("jia.D(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
          String var3 = null;
          String var4 = null;
          String var5 = null;
          try {
            if (param1 >= -64) {
              field_m = (java.applet.Applet) null;
            }
            rha.field_d = param0;
            try {
              var3 = param2.getParameter("cookieprefix");
              var4 = param2.getParameter("cookiehost");
              var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
              if (param0.length() == 0) {
                var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              ac.a("document.cookie=\"" + var5 + "\"", param2, 113);
            } catch (Throwable throwable) {
            }
            eha.a(-119, param2);
          } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "jia.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int[] a(int param0, int param1) {
        int var11 = 0;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int[][] var8;
        int var9;
        int var10;
        int[] var10_ref_int__;
        int[] var11_ref_int__;
        int var12;
        int var13;
        int var14;
        int var15;
        int[] var16;
        int[][] var17;
        int[] var18;
        int[][] var19;
        int var9Lifetime1;
        int var13Lifetime1;
        var14 = BachelorFridge.field_y;
        var3 = this.field_j.a(param0, -1);
        if (this.field_j.field_m) {
          var4 = this.field_n + (this.field_n + 1);
          var5 = 65536 / var4;
          var6 = 1 + this.field_k + this.field_k;
          var7 = 65536 / var6;
          var19 = new int[var4][];
          var17 = var19;
          var8 = var17;
          for (var9 = param0 - this.field_n; var9 <= param0 + this.field_n; var9++) {
            var10_ref_int__ = this.a(0, it.field_r & var9, (byte) 107);
            var18 = new int[hh.field_d];
            var16 = var18;
            var11_ref_int__ = var16;
            var12 = 0;
            for (var13 = -this.field_k; this.field_k >= var13; var13++) {
              var12 = var12 + var10_ref_int__[var13 & wp.field_r];
            }
            var15 = 0;
            var13Lifetime1 = var15;
            while (var15 < hh.field_d) {
              var11_ref_int__[var15] = var7 * var12 >> 16;
              var12 = var12 - var10_ref_int__[-this.field_k + var15 & wp.field_r];
              var15++;
              var12 = var12 + var10_ref_int__[wp.field_r & var15 + this.field_k];
            }
            var8[-param0 + this.field_n + var9] = var18;
          }
          for (var9Lifetime1 = 0; hh.field_d > var9Lifetime1; var9Lifetime1++) {
            var10 = 0;
            for (var11 = 0; var11 < var4; var11++) {
              var10 = var10 + var19[var11][var9Lifetime1];
            }
            var3[var9Lifetime1] = var10 * var5 >> 16;
          }
        }
        if (param1 != 0) {
          this.field_n = -124;
        }
        return var3;
    }

    static {
        field_l = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
