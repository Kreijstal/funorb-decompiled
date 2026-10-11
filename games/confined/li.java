/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li implements fe {
    static String field_e;
    private int field_c;
    static boolean field_l;
    private int field_j;
    private int field_a;
    private int field_d;
    private int field_g;
    private int field_b;
    private ok field_i;
    static String field_f;
    static sg field_m;
    private int field_h;
    static String field_n;
    static e field_k;

    public final void a(byte param0, int param1, boolean param2, fj param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        jh var14 = null;
        fj stackIn_3_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          if (!(param3 instanceof jh)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (fj) (param3);
          }
          var14 = (jh) (stackIn_3_0);
          fn.e(param3.field_q + param1, param4 + param3.field_m, param3.field_F, param3.field_z, this.field_d);
          if (var14 == null) {
          }
          var7 = var14.field_P + param3.field_q + param1;
          var8 = param3.field_m + (param4 + var14.field_S);
          if (param0 > -97) {
            field_n = (String) null;
          }
          fn.e(var7, var8, var14.field_W, this.field_j);
          if (var14.field_T != -1) {
            var9 = (double)var14.field_T * 3.141592653589793 * 2.0 / (double)var14.field_Q;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_W);
            var12 = (int)(Math.cos(var9) * (double)var14.field_W);
            fn.e(var11 + var7, var12 + var8, 1, this.field_h);
          }
          fn.e(var7, var8, 2, 1);
          var9Lifetime1 = (double)var14.field_V * 3.141592653589793 * 2.0 / (double)var14.field_Q;
          var11Lifetime1 = (int)(-Math.sin(var9Lifetime1) * (double)var14.field_W);
          var12Lifetime1 = (int)(Math.cos(var9Lifetime1) * (double)var14.field_W);
          fn.f(var7, var8, var11Lifetime1 + var7, var12Lifetime1 + var8, 1);
          if (this.field_i == null) {
            return;
          }
          var13 = this.field_a + var14.field_W + var14.field_P;
          this.field_i.a(param3.field_B, param1 + (param3.field_q + var13), param4 - (-param3.field_m - this.field_c), -this.field_a - (var13 - param3.field_F), param3.field_z - (this.field_a << 1), this.field_g, this.field_b, 1, 1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("li.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_e = null;
        if (param0 == 1) {
          field_k = null;
          field_m = null;
          field_n = null;
          return;
        }
        li.a(117);
        field_k = null;
        field_m = null;
        field_n = null;
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
          java.net.URL var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          int var4 = 0;
          RuntimeException stackIn_6_0 = null;
          StringBuilder stackIn_6_1 = null;
          String stackIn_7_2 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var3 = new java.net.URL(param0.getCodeBase(), param2);
              var3 = pn.a(var3, (byte) -33, param0);
              pk.a(true, var3.toString(), param0, (byte) -116);
              var4 = 116 / ((param1 - 61) / 43);
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_6_0 = var3_ref2;
            stackIn_6_1 = new StringBuilder().append("li.A(");
            if (param0 == null) {
              stackIn_7_2 = "null";
            } else {
              stackIn_7_2 = "{...}";
            }
            stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    li(ok param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_h = param6;
          this.field_i = param0;
          this.field_g = param3;
          this.field_c = param2;
          this.field_d = param7;
          this.field_j = param5;
          this.field_b = param4;
          this.field_a = param1;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "li.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_e = "Keep an eye#on your Ready#Energy Meter.#If it runs out,#stop firing and#let it recharge.";
        field_n = "Highscores";
        field_f = "Thank you for playing.";
        field_k = new e(6, 0, 4, 2);
    }
}
