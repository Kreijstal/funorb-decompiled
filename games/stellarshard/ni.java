/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static String field_b;
    static int field_e;
    static int[] field_f;
    static int[] field_c;
    static boolean field_a;
    static int field_d;

    public static void a(int param0) {
        field_f = null;
        field_b = null;
        if (param0 >= -39) {
          Object var2 = (Object) null;
          ni.a((ej) null, (Object) null, 118);
        }
        field_c = null;
    }

    final static boolean a(pf param0, pf param1, pf param2, byte param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2.a((byte) -36) &&
            param2.a("commonui", (byte) -109)) {
            if (param0.a((byte) -36) &&
              param0.a("commonui", (byte) -109)) {
              if (param1.a((byte) -36) &&
                param1.a("button.gif", (byte) -109)) {
                if (param3 == -104) {
                  return true;
                }
                field_a = true;
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("ni.D(");
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
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(boolean param0, int param1, ka param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            if (param0) {
              stackIn_2_0 = (String) null;
              return stackIn_2_0;
            }
            var3_int = param2.d((byte) 113);
            if (param1 < var3_int) {
              var3_int = param1;
            }
            var4 = new byte[var3_int];
            param2.field_k = param2.field_k + fl.field_b.a(param2.field_r, param2.field_k, 0, var4, var3_int, true);
            var5 = kk.a(var3_int, (byte) 122, 0, var4);
            stackIn_7_0 = var5;
            return stackIn_7_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_9_0 = "Cabbage";
            return stackIn_9_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ni.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(ej param0, Object param1, int param2) {
        int var3_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        var5 = stellarshard.field_B;
        try {
          if (param0.field_s == null) {
            return;
          }
          var4 = -47 % ((param2 + 70) / 41);
          for (var3_int = 0; 50 > var3_int; var3_int++) {
            if (param0.field_s.peekEvent() != null) {
              jj.a((byte) -115, 1L);
              continue;
            }
            break;
          }
          try {
            if (param1 != null) {
              param0.field_s.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param1, 1001, "dummy")));
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("ni.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        int var0 = 0;
        double var1 = 0.0;
        int var0Lifetime1;
        double var1Lifetime1;
        field_b = "Open in popup window";
        field_f = new int[65536];
        field_c = new int[65536];
        field_a = true;
        field_e = 0;
        for (var0 = 0; var0 < 65536; var0++) {
          var1 = -Math.sqrt((double)var0) + 256.0;
          field_f[var0] = (int)(0.5 + var1 * var1);
        }
        for (var0Lifetime1 = 0; var0Lifetime1 < 65536; var0Lifetime1++) {
          var1Lifetime1 = Math.sqrt((double)var0Lifetime1);
          field_c[var0Lifetime1] = (int)Math.floor(-(9.0 * var1Lifetime1) + 768.5 + (double)var0Lifetime1 * 0.0234375);
        }
    }
}
