/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe extends rh {
    int field_I;
    static String field_J;
    static int field_L;
    int field_M;
    int field_S;
    int field_R;
    static long field_N;
    static int field_Q;
    static long field_P;
    int field_K;
    int field_O;

    final static void a(bh param0, int param1) {
        try {
          qc.field_e.b(param0);
          if (param1 != 2) {
            kk var3 = (kk) null;
            fe.a(-87, (kk) null);
          }
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "fe.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void j(int param0) {
        field_J = null;
        if (param0 > -85) {
          kk var2 = (kk) null;
          fe.a(126, (kk) null);
        }
    }

    final static void a(boolean param0, wb param1, int param2) {
        try {
          kg.a(param0, (byte) 116, param2, param1);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "fe.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(al param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = TrackController.field_F ? 1 : 0;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -this.field_p - param5 - (this.field_S - param2);
          var9 = -param6 - this.field_m + (-this.field_R + param1);
          if (this.field_I * this.field_I > var8_int * var8_int + var9 * var9) {
            var10 = Math.atan2((double)var9, (double)var8_int) - md.field_a;
            if (0.0 > var10) {
              var10 = var10 - 3.141592653589793 / (double)this.field_M;
            } else {
              if (var10 > 0.0) {
                var10 = var10 + 3.141592653589793 / (double)this.field_M;
              }
            }
            this.field_O = (int)((double)this.field_M * var10 / 6.283185307179586);
            while (this.field_M <= this.field_O) {
              this.field_O = this.field_O - this.field_M;
            }
            while (this.field_O < 0) {
              this.field_O = this.field_O + this.field_M;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_18_0 = var8;
          stackIn_18_1 = new StringBuilder().append("fe.R(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private fe() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, kk param1) {
        int var3 = 0;
        int var4 = 0;
        pf var5 = null;
        int[] var6 = null;
        int var7 = 0;
        wb var8 = null;
        la var9 = null;
        int var10 = 0;
        la var11 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          var9 = new la(param1.a("logo.fo3d", -1, ""));
          var11 = var9;
          var3 = var11.h(param0 - 13961);
          var11.h((byte) 31);
          lg.field_d = hb.a(12, var11);
          if (param0 != 30344) {
            var8 = (wb) null;
            fe.a(true, (wb) null, -7);
          }
          ef.field_a = new pf[var3];
          kc.field_c = new int[var3][];
          for (var4 = 0; var4 < var3; var4++) {
            ef.field_a[var4] = sf.a(var9, false);
          }
          var11.g((byte) -106);
          var10 = 0;
          var4Lifetime1 = var10;
          while (var10 < var3) {
            var5 = ef.field_a[var10];
            var5.a(6, 1, (byte) 117, 6, 6);
            var5.b(param0 - 15642);
            var6 = new int[]{var5.field_u + var5.field_i >> 1, var5.field_p + var5.field_n >> 1, var5.field_k + var5.field_w >> 1};
            kc.field_c[var10] = var6;
            var5.a(-var6[2], (byte) 123, -var6[0], -var6[1]);
            var10++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("fe.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_J = "This password is part of your Player Name, and would be easy to guess";
        field_L = 0;
    }
}
