/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends dk {
    int field_K;
    int field_F;
    int field_G;
    static boolean[] field_D;
    int field_E;
    static String[] field_A;
    static hl[] field_H;
    int field_I;
    static hl field_J;
    int field_B;

    public static void e(byte param0) {
        field_J = null;
        field_H = null;
        field_D = null;
        field_A = null;
        if (param0 > 107) {
          return;
        }
        field_D = (boolean[]) null;
    }

    final static void a(gi param0, int param1, int param2, boolean param3) {
        try {
          qc.field_g = param1;
          u.field_c = param0;
          if (!param3) {
            field_J = (hl) null;
          }
          qf.field_g = param2;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "el.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static jk[] a(boolean param0, ka param1) {
        int var5 = 0;
        jk[] stackIn_3_0 = null;
        jk[] stackIn_9_0 = null;
        jk[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        jk[] var4 = null;
        jk var6 = null;
        gi var7 = null;
        bk var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        try {
          if (!param1.a((byte) -68)) {
            stackIn_3_0 = new jk[]{};
            return stackIn_3_0;
          }
          var8 = param1.a(-125);
          while (var8.field_b == 0) {
            uc.a(-108, 10L);
          }
          if (var8.field_b == 2) {
            stackIn_9_0 = new jk[]{};
            return stackIn_9_0;
          }
          var10 = (int[]) (var8.field_f);
          var9 = var10;
          var3 = var9;
          if (param0) {
            var7 = (gi) null;
            el.a((gi) null, 30, 44, true);
          }
          var4 = new jk[var10.length >> 2];
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = new jk();
            var4[var5] = var6;
            var6.field_d = var3[var5 << 2];
            var6.field_h = var3[1 + (var5 << 2)];
            var6.field_e = var3[(var5 << 2) + 2];
            var6.field_i = var3[(var5 << 2) + 3];
          }
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("el.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static hl[] b(int param0, int param1, int param2, int param3) {
        if (param1 != 22396) {
          return (hl[]) null;
        }
        return oj.a(-1, param0, 1, param2, param3);
    }

    final boolean a(uj param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = StarCannon.field_A;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -param2 + (-this.field_s - this.field_K) + param5;
          var9 = param1 + (-this.field_G + (-this.field_j - param3));
          if (var9 * var9 + var8_int * var8_int >= this.field_I * this.field_I) {
            return true;
          }
          var10 = Math.atan2((double)var9, (double)var8_int) - qd.field_z;
          if (!(0.0 > var10)) {
            if (0.0 < var10) {
              var10 = var10 + 3.141592653589793 / (double)this.field_B;
            }
          } else {
            var10 = var10 - 3.141592653589793 / (double)this.field_B;
          }
          this.field_F = (int)((double)this.field_B * var10 / 6.283185307179586);
          while (this.field_B <= this.field_F) {
            this.field_F = this.field_F - this.field_B;
          }
          while (this.field_F < 0) {
            this.field_F = this.field_F + this.field_B;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_20_0 = var8;
          stackIn_20_1 = new StringBuilder().append("el.G(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private el() throws Throwable {
        throw new Error();
    }

    static {
        field_D = new boolean[64];
        field_A = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
