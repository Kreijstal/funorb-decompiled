/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh extends to {
    static String[] field_v;
    static int field_u;

    public static void d(byte param0) {
        int var1 = 81 / ((19 - param0) / 47);
        field_v = null;
    }

    private sh(int param0, int param1, int param2, int param3, ir param4, no param5, ea param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_s = param6;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "sh.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, ea param4, byte param5) {
        hg var7 = null;
        hg var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          super.a(param0, param1, param2, param3, param4, param5);
          var8 = mm.field_a;
          var7 = var8;
          if (var8 != null) {
            if (!this.a(param2, param1, param5 ^ -122, param0, param3)) {
              return;
            }
            if (this.field_o instanceof ma) {
              ((ma) (this.field_o)).a(var8, -16073, this);
              mm.field_a = null;
              return;
            }
            if (var8.field_o instanceof ma) {
              ((ma) (var8.field_o)).a(var8, -16073, this);
              mm.field_a = null;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_10_0 = var7_ref;
          stackIn_10_1 = new StringBuilder().append("sh.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(')').toString());
        }
    }

    final static wu a(CipherPacketBuffer param0, byte param1) {
        int var7 = 0;
        wu stackIn_5_0 = null;
        wu stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        wu var5 = null;
        int var6 = 0;
        int var8 = 0;
        var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var2_int = param0.b((byte) 81, 8);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          if (param1 != -14) {
            stackIn_5_0 = (wu) null;
            return stackIn_5_0;
          }
          var3 = tn.a(83, param0) ? 1 : 0;
          var4 = tn.a(-64, param0) ? 1 : 0;
          var5 = new wu();
          var5.field_r = (short)param0.b((byte) 87, 16);
          var5.field_z = ua.a(param0, var5.field_z, 0, 16);
          var5.field_P = ua.a(param0, var5.field_P, param1 + 14, 16);
          var5.field_F = ua.a(param0, var5.field_F, 0, 16);
          var5.field_K = (short)param0.b((byte) 119, 16);
          var5.field_I = ua.a(param0, var5.field_I, param1 + 14, 16);
          var5.field_t = ua.a(param0, var5.field_t, 0, 16);
          var5.field_m = ua.a(param0, var5.field_m, 0, 16);
          if (var3 != 0) {
            var5.field_q = (short)param0.b((byte) 83, 16);
            var5.field_H = ua.a(param0, var5.field_H, 0, 16);
            var5.field_L = ua.a(param0, var5.field_L, 0, 16);
            var5.field_n = ua.a(param0, var5.field_n, param1 ^ -14, 16);
            var5.field_B = ua.a(param0, var5.field_B, 0, 16);
            var5.field_g = ua.a(param0, var5.field_g, param1 + 14, 16);
            var5.field_D = ua.a(param0, var5.field_D, 0, 16);
          }
          if (var4 != 0) {
            param0.b((byte) 84, 16);
            var5.field_G = ua.a(param0, var5.field_G, param1 ^ -14, 16);
            var5.field_d = ua.a(param0, var5.field_d, 0, 16);
            var5.field_y = ua.a(param0, var5.field_y, 0, 16);
            var5.field_C = ua.a(param0, var5.field_C, param1 + 14, 16);
            var5.field_v = ua.a(param0, var5.field_v, 0, 16);
          }
          if (tn.a(122, param0)) {
            var5.field_u = ua.a(param0, var5.field_u, param1 + 14, 16);
          }
          if (tn.a(83, param0)) {
            var5.field_x = ao.a(param0, var5.field_x, true, 16);
            var6 = 0;
            for (var7 = 0; var7 < var5.field_x.length; var7++) {
              if (var6 < (var5.field_x[var7] & 255)) {
                var6 = 255 & var5.field_x[var7];
              }
            }
            if (0 == var6) {
              var5.field_x = null;
            } else {
              var5.field_f = (byte)(var6 + 1);
            }
          }
          stackIn_25_0 = var5;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("sh.W(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_v = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_u = 640;
    }
}
