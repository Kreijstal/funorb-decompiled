/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn extends pp {
    static sna field_j;
    static String field_k;
    static String field_i;
    int field_m;
    int field_l;

    final void a(aga param0, op param1, int param2) {
        aga var4 = this.field_h.a(52, param1);
        if (param2 != 12) {
          return;
        }
        try {
          var4.field_J = this.field_m;
          var4.field_x = this.field_l;
          param1.field_a[this.field_l][this.field_m].field_l = var4;
          var4.f(32);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "cn.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(lu param0, byte param1) {
        try {
          super.a(param0, (byte) 100);
          er.a(this.field_h, 109, param0);
          param0.d(this.field_l, 0);
          int var3_int = -63 % ((param1 - 34) / 58);
          param0.d(this.field_m, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "cn.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean d(byte param0) {
        if (param0 <= 9) {
          return false;
        }
        return !sea.field_j ? true : false;
    }

    final static void a(byte param0, int param1, kv param2, int[] param3, int param4, int param5, kv param6) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = BachelorFridge.field_y;
        try {
          param5 -= 3;
          if (param6.field_q < param1) {
            param1 = param6.field_q;
          }
          var7_int = 1 + param6.field_q;
          if (param0 >= -60) {
            return;
          }
          for (var8 = 1; -1 + param6.field_p > var8; var8++) {
            for (var9 = 1; param1 > var9; var9++) {
              var10 = 255 & param6.field_v[var7_int];
              if ((param6.field_v[param6.field_q + var7_int] & 255) > var10) {
                var10 = param6.field_v[var7_int + param6.field_q] & 255;
              }
              if ((255 & param6.field_v[-param6.field_q + var7_int]) > var10) {
                var10 = 255 & param6.field_v[-param6.field_q + var7_int];
              }
              if (var10 < (param6.field_v[param6.field_q + var7_int + 1] & 255)) {
                var10 = 255 & param6.field_v[1 + param6.field_q + var7_int];
              }
              if ((255 & param6.field_v[-1 + (-param6.field_q + var7_int)]) > var10) {
                var10 = param6.field_v[-param6.field_q + var7_int - 1] & 255;
              }
              if ((param6.field_v[param6.field_q + (var7_int - 1)] & 255) > var10) {
                var10 = 255 & param6.field_v[-1 + var7_int + param6.field_q];
              }
              if (var10 < (param6.field_v[1 - param6.field_q + var7_int] & 255)) {
                var10 = 255 & param6.field_v[1 + (-param6.field_q + var7_int)];
              }
              if (var10 < (255 & param6.field_v[var7_int + 1])) {
                var10 = param6.field_v[var7_int + 1] & 255;
              }
              if (var10 < (param6.field_v[var7_int - 1] & 255)) {
                var10 = 255 & param6.field_v[var7_int - 1];
              }
              incrementValue$0 = var7_int;
              var7_int++;
              param2.field_v[incrementValue$0] = var10;
            }
            var7_int = var7_int + (param6.field_q - param1 + 1);
          }
          var7_intLifetime1 = 0;
          for (var8Lifetime1 = 0; param6.field_p > var8Lifetime1; var8Lifetime1++) {
            var9Lifetime1 = param3[param3.length * var8Lifetime1 / param6.field_p];
            for (var10Lifetime1 = 0; param1 > var10Lifetime1; var10Lifetime1++) {
              var11 = 255 & param6.field_v[var7_intLifetime1];
              var12 = 255 & param2.field_v[var7_intLifetime1];
              var13 = 0;
              var13 = var13 | (65280 & (var9Lifetime1 >> 16) * var11) << 8;
              var13 = var13 | 65280 & ((65280 & var9Lifetime1) >> 8) * var11;
              var13 = var13 | (65280 & var11 * (255 & var9Lifetime1)) >> 8;
              if (param6.field_v[var7_intLifetime1] >= 0) {
                tla.a(param4 + var10Lifetime1, -1898743704, var13, var8Lifetime1 + param5, var12);
              }
              var7_intLifetime1++;
            }
            var7_intLifetime1 = var7_intLifetime1 + (param6.field_q - param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_40_0 = var7;
          stackIn_40_1 = new StringBuilder().append("cn.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',');
          if (param3 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          stackIn_46_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    final static kka a(byte param0, int param1) {
        kka var2 = new kka();
        gs.field_l.a(var2, true);
        ah.a(4, param1);
        int var3 = 89 % ((66 - param0) / 56);
        return var2;
    }

    public static void e(byte param0) {
        field_i = null;
        field_j = null;
        field_k = null;
        if (param0 <= 84) {
          field_i = (String) null;
        }
    }

    cn(nq param0, int param1, int param2) {
        try {
          this.field_l = param1;
          this.field_h = param0;
          this.field_m = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "cn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_k = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_i = "Off";
    }
}
