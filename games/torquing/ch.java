/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch extends am {
    private final void d(int param0, int param1, int param2) {
        int var4;
        int var5;
        float var6;
        int var7;
        boolean decompiledFrameRemainder0 = true;
        var7 = Torquing.field_u;
        var4 = q.field_b[param1];
        var5 = dp.field_a[param2];
        var6 = (float)Math.atan2((double)(-2048 + var4), (double)(var5 - param0));
        if ((double)var6 >= -3.141592653589793 &&
          (double)var6 <= -2.356194490192345) {
          gd.field_c = param2;
          tp.field_o = param1;
        } else if ((double)var6 <= -1.5707963267948966 &&
          (double)var6 >= -2.356194490192345) {
          gd.field_c = param1;
          tp.field_o = param2;
        } else if (-0.7853981633974483 >= (double)var6 &&
          (double)var6 >= -1.5707963267948966) {
          gd.field_c = param1;
          tp.field_o = ci.field_c - param2;
        } else if (var6 <= 0.0f &&
          -0.7853981633974483 <= (double)var6) {
          gd.field_c = -param2 + um.field_o;
          tp.field_o = param1;
        } else if (var6 >= 0.0f &&
          (double)var6 <= 0.7853981633974483) {
          tp.field_o = -param1 + ci.field_c;
          gd.field_c = -param2 + um.field_o;
        } else if (0.7853981633974483 <= (double)var6 &&
          1.5707963267948966 >= (double)var6) {
          tp.field_o = ci.field_c - param2;
          gd.field_c = um.field_o - param1;
        } else if ((double)var6 >= 1.5707963267948966 &&
          (double)var6 <= 2.356194490192345) {
          gd.field_c = -param1 + um.field_o;
          tp.field_o = param2;
        } else {
          if (2.356194490192345 <= (double)var6) {
            if (!(3.141592653589793 >= (double)var6)) {
              tp.field_o = tp.field_o & jh.field_A;
              gd.field_c = gd.field_c & vp.field_I;
              decompiledFrameRemainder0 = false;
            }
            else {
              gd.field_c = param2;
              tp.field_o = -param1 + ci.field_c;
            }
          }
        }
        if (decompiledFrameRemainder0) {
          tp.field_o = tp.field_o & jh.field_A;
          gd.field_c = gd.field_c & vp.field_I;
        }

    }

    final int[] a(byte param0, int param1) {
        int var4 = 0;
        int[] var5 = null;
        int var6 = Torquing.field_u;
        if (param0 < 86) {
          return (int[]) null;
        }
        int[] var7 = this.field_l.a(param1, 25657);
        int[] var3 = var7;
        if (this.field_l.field_b) {
          for (var4 = 0; ci.field_c > var4; var4++) {
            this.d(2048, var4, param1);
            var5 = this.b(0, 0, gd.field_c);
            var7[var4] = var5[tp.field_o];
          }
        }
        return var3;
    }

    final static byte[] a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 115) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          var2_int = param0.length;
          var3 = new byte[var2_int];
          dk.a(param0, 0, var3, 0, var2_int);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ch.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(fj param0, int param1, int param2) {
        if (param1 != 35) {
          return;
        }
        try {
          if (param2 == 0) {
            this.field_p = param0.i((byte) -101) == 1 ? true : false;
          }
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "ch.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public ch() {
        super(1, false);
    }

    final int[][] a(int param0, int param1) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int[][] var14 = null;
        int var9 = Torquing.field_u;
        int[][] var13 = this.field_r.a(15142, param1);
        int[][] var11 = var13;
        int[][] var10 = var11;
        int[][] var3 = var10;
        if (param0 != -29116) {
          return (int[][]) null;
        }
        if (this.field_r.field_b) {
          var4 = var13[0];
          var5 = var13[1];
          var6 = var13[2];
          for (var7 = 0; var7 < ci.field_c; var7++) {
            this.d(2048, var7, param1);
            var14 = this.c(24066, gd.field_c, 0);
            var4[var7] = var14[0][tp.field_o];
            var5[var7] = var14[1][tp.field_o];
            var6[var7] = var14[2][tp.field_o];
          }
        }
        return var10;
    }

    static {
    }
}
