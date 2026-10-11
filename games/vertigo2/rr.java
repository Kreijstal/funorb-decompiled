/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rr extends ji {
    static String field_A;
    static boolean[] field_z;
    static boolean field_C;
    static short[] field_D;
    static String field_y;
    static ra[] field_B;

    public rr() {
        super(1, false);
    }

    final static String a(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          if (param0 >= -74) {
            field_D = (short[]) null;
          }
          for (var4 = 0; var4 < var2_int; var4++) {
            var5 = param1.charAt(var4);
            if (65 <= var5 &&
              90 >= var5) {
              var3[var4] = (char)(var5 - 65 + 97);
            } else if ((var5 < 97 ||
              var5 > 122) &&
              (48 > var5 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          stackIn_20_0 = new String(var8);
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("rr.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final void d(int param0, int param1, int param2) {
        int var4;
        int var5;
        float var6;
        int var7;
        var7 = Vertigo2.field_L ? 1 : 0;
        var4 = rh.field_O[param1];
        var5 = lf.field_y[param2];
        var6 = (float)Math.atan2((double)(-2048 + var4), (double)(var5 - param0));
        if ((double)var6 >= -3.141592653589793 &&
          (double)var6 <= -2.356194490192345) {
          tn.field_j = param1;
          bh.field_c = param2;
        } else if ((double)var6 <= -1.5707963267948966 &&
          -2.356194490192345 <= (double)var6) {
          bh.field_c = param1;
          tn.field_j = param2;
        } else if (-0.7853981633974483 >= (double)var6 &&
          -1.5707963267948966 <= (double)var6) {
          tn.field_j = we.field_M - param2;
          bh.field_c = param1;
        } else if (0.0f >= var6 &&
          (double)var6 >= -0.7853981633974483) {
          tn.field_j = param1;
          bh.field_c = aa.field_Vb - param2;
        } else if (var6 >= 0.0f &&
          0.7853981633974483 >= (double)var6) {
          bh.field_c = aa.field_Vb - param2;
          tn.field_j = -param1 + we.field_M;
        } else if ((double)var6 >= 0.7853981633974483 &&
          (double)var6 <= 1.5707963267948966) {
          tn.field_j = we.field_M - param2;
          bh.field_c = -param1 + aa.field_Vb;
        } else {
          if ((double)var6 >= 1.5707963267948966) {
            if ((double)var6 <= 2.356194490192345) {
              tn.field_j = param2;
              bh.field_c = aa.field_Vb - param1;
            } else {
              if (2.356194490192345 <= (double)var6 &&
                (double)var6 <= 3.141592653589793) {
                tn.field_j = we.field_M - param1;
                bh.field_c = param2;
              }
            }
          } else {
            if (2.356194490192345 <= (double)var6 &&
              (double)var6 <= 3.141592653589793) {
              tn.field_j = we.field_M - param1;
              bh.field_c = param2;
            }
          }
        }
        tn.field_j = tn.field_j & rm.field_z;
        bh.field_c = bh.field_c & fk.field_x;
    }

    public static void b(byte param0) {
        field_z = null;
        field_A = null;
        field_B = null;
        field_y = null;
        field_D = null;
        int var1 = 82 % ((-3 - param0) / 49);
    }

    final void a(byte param0, int param1, ed param2) {
        ed var5 = null;
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (0 == param1) {
            stackIn_5_1 = (param2.h(-11) == 1);
            this.field_o = stackIn_5_1;
          }
          if (param0 != 110) {
            var5 = (ed) null;
            this.a((byte) -97, 81, (ed) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("rr.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final int[] c(int param0, int param1) {
        int var4 = 0;
        int[] var5 = null;
        int var6 = Vertigo2.field_L ? 1 : 0;
        int[] var7 = this.field_x.a(param0, (byte) 103);
        int[] var3 = var7;
        if (param1 <= 91) {
          this.b(58, 20);
        }
        if (this.field_x.field_i) {
          for (var4 = 0; var4 < we.field_M; var4++) {
            this.d(2048, var4, param0);
            var5 = this.a(0, -1, bh.field_c);
            var7[var4] = var5[tn.field_j];
          }
        }
        return var3;
    }

    final int[][] b(int param0, int param1) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int[][] var14 = null;
        int var9 = Vertigo2.field_L ? 1 : 0;
        if (param0 != -3780) {
          rr.b((byte) -10);
        }
        int[][] var13 = this.field_v.a(param1, param0 ^ 3778);
        int[][] var11 = var13;
        int[][] var10 = var11;
        int[][] var3 = var10;
        if (this.field_v.field_c) {
          var4 = var13[0];
          var5 = var13[1];
          var6 = var13[2];
          for (var7 = 0; var7 < we.field_M; var7++) {
            this.d(param0 ^ -1732, var7, param1);
            var14 = this.c(0, param0 ^ -3777, bh.field_c);
            var4[var7] = var14[0][tn.field_j];
            var5[var7] = var14[1][tn.field_j];
            var6[var7] = var14[2][tn.field_j];
          }
        }
        return var10;
    }

    static {
        field_A = "Rankings";
        field_D = new short[4096];
        field_y = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_C = true;
        field_B = new ra[3];
        field_z = new boolean[field_B.length];
    }
}
