/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static String field_d;
    static int field_e;
    static int field_c;
    static le field_b;
    private int[] field_a;

    public static void a(int param0) {
        if (param0 != -1) {
          return;
        }
        field_b = null;
        field_d = null;
    }

    final static String a(CharSequence param0, byte param1, boolean param2) {
        int var4 = 0;
        String var3 = null;
        int var5 = 0;
        CharSequence var6 = null;
        String stackIn_5_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          if (param1 != -70) {
            var6 = (CharSequence) null;
            oe.a((CharSequence) null, (byte) 1, false);
          }
          var3 = lb.a(param0, param2, 1236);
          if (var3 != null) {
            stackIn_5_0 = var3;
            return stackIn_5_0;
          }
          for (var4 = 0; var4 < param0.length(); var4++) {
            if (!ue.a(-16490, param0.charAt(var4))) {
              stackIn_12_0 = gj.field_d;
              return stackIn_12_0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("oe.D(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    oe(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          var2_int = 1;
          while (var2_int <= param0.length + (param0.length >> 1)) {
            var2_int = var2_int << 1;
          }
          this.field_a = new int[var2_int + var2_int];
          for (var3 = 0; var2_int + var2_int > var3; var3++) {
            this.field_a[var3] = -1;
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < param0.length; var3Lifetime1++) {
            var4 = var2_int - 1 & param0[var3Lifetime1];
            while (this.field_a[1 + var4 + var4] != -1) {
              var4 = var2_int - 1 & var4 + 1;
            }
            this.field_a[var4 + var4] = param0[var3Lifetime1];
            this.field_a[1 + var4 + var4] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("oe.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(boolean param0, kk param1, kk param2, kk param3, int param4) {
        try {
          sa.field_Q = c.a("", param4 + 59176);
          sa.field_Q.a(false, true);
          ak.a(param3, param1, param2, 127);
          jh.a(-128);
          fd.field_h = hf.field_f;
          if (param4 != -28484) {
            CharSequence var6 = (CharSequence) null;
            oe.a((CharSequence) null, (byte) 110, true);
          }
          rk.field_X = hf.field_f;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "oe.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = TrackController.field_F ? 1 : 0;
        var3 = (this.field_a.length >> 1) - 1;
        if (param1 != -26556) {
          return -121;
        }
        var4 = param0 & var3;
        while (true) {
          var5 = this.field_a[1 + var4 + var4];
          if (var5 == -1) {
            return -1;
          }
          if (param0 == this.field_a[var4 + var4]) {
            return var5;
          }
          var4 = var3 & var4 + 1;
        }
    }

    static {
        field_d = "Achievements";
        field_b = new le();
    }
}
