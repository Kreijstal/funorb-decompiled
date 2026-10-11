/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aea extends k {
    static kv field_k;

    private final void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        float var6;
        int var7;
        var7 = BachelorFridge.field_y;
        var4 = jq.field_k[param2];
        var5 = tj.field_f[param1];
        if (param0 != 1) {
          return;
        }
        var6 = (float)Math.atan2((double)(-2048 + var4), (double)(-2048 + var5));
        if ((double)var6 >= -3.141592653589793 &&
          (double)var6 <= -2.356194490192345) {
          kk.field_s = param1;
          kb.field_g = param2;
        } else if (-1.5707963267948966 >= (double)var6 &&
          -2.356194490192345 <= (double)var6) {
          kk.field_s = param2;
          kb.field_g = param1;
        } else if (-0.7853981633974483 >= (double)var6 &&
          -1.5707963267948966 <= (double)var6) {
          kb.field_g = -param1 + hh.field_d;
          kk.field_s = param2;
        } else if (var6 <= 0.0f &&
          (double)var6 >= -0.7853981633974483) {
          kb.field_g = param2;
          kk.field_s = bi.field_g - param1;
        } else if (0.0f <= var6 &&
          0.7853981633974483 >= (double)var6) {
          kk.field_s = bi.field_g - param1;
          kb.field_g = -param2 + hh.field_d;
        } else if (0.7853981633974483 <= (double)var6 &&
          (double)var6 <= 1.5707963267948966) {
          kb.field_g = -param1 + hh.field_d;
          kk.field_s = -param2 + bi.field_g;
        } else if (1.5707963267948966 <= (double)var6 &&
          (double)var6 <= 2.356194490192345) {
          kk.field_s = -param2 + bi.field_g;
          kb.field_g = param1;
        } else {
          if ((double)var6 >= 2.356194490192345 &&
            (double)var6 <= 3.141592653589793) {
            kb.field_g = -param2 + hh.field_d;
            kk.field_s = param1;
          }
        }
        kb.field_g = kb.field_g & wp.field_r;
        kk.field_s = kk.field_s & it.field_r;
    }

    final int[][] a(boolean param0, int param1) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int[][] var14 = null;
        int var9 = BachelorFridge.field_y;
        if (param0) {
          this.a(false, -63);
        }
        int[][] var13 = this.field_h.a(param1, -858);
        int[][] var11 = var13;
        int[][] var10 = var11;
        int[][] var3 = var10;
        if (this.field_h.field_b) {
          var4 = var13[0];
          var5 = var13[1];
          var6 = var13[2];
          for (var7 = 0; var7 < hh.field_d; var7++) {
            this.a(1, param1, var7);
            var14 = this.a((byte) -91, 0, kk.field_s);
            var4[var7] = var14[0][kb.field_g];
            var5[var7] = var14[1][kb.field_g];
            var6[var7] = var14[2][kb.field_g];
          }
        }
        return var10;
    }

    final int[] a(int param0, int param1) {
        int var4 = 0;
        int[] var5 = null;
        int var6 = BachelorFridge.field_y;
        if (param1 != 0) {
          this.a(false, 106);
        }
        int[] var7 = this.field_j.a(param0, -1);
        int[] var3 = var7;
        if (this.field_j.field_m) {
          for (var4 = 0; hh.field_d > var4; var4++) {
            this.a(param1 ^ 1, param0, var4);
            var5 = this.a(0, kk.field_s, (byte) 118);
            var7[var4] = var5[kb.field_g];
          }
        }
        return var3;
    }

    public static void d(int param0) {
        if (param0 <= 87) {
          return;
        }
        field_k = null;
    }

    public aea() {
        super(1, false);
    }

    final void a(byte param0, lu param1, int param2) {
        lu var5 = null;
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 == 0) {
            stackIn_5_1 = (param1.b(param0 + 16712006) == 1);
            this.field_f = stackIn_5_1;
          }
          if (param0 != -71) {
            var5 = (lu) null;
            this.a((byte) 63, (lu) null, 61);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("aea.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
