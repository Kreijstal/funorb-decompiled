/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kaa extends pu {
    static kv[] field_l;
    static int field_m;

    final static boolean b(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        boolean stackIn_5_0 = false;
        Throwable decompiledCaughtException = null;
        var1_ref = vv.field_e;
        synchronized (var1_ref) {
          if (gha.field_q == jaa.field_s) {
            return false;
          }
          gf.field_k = aq.field_a[gha.field_q];
          dla.field_j = dla.field_i[gha.field_q];
          gha.field_q = param0 & 1 + gha.field_q;
          stackIn_5_0 = true;
        }
        return stackIn_5_0;
    }

    public static void d(byte param0) {
        if (param0 <= 106) {
          return;
        }
        field_l = null;
    }

    final static String c(int param0) {
        String var1 = "";
        if (ola.field_e != null) {
          var1 = ola.field_e.a(1);
        }
        if (var1.length() == 0) {
          var1 = uaa.d((byte) -82);
        }
        if (param0 > 14) {
          if (var1.length() == 0) {
            var1 = qfa.field_t;
          }
          return var1;
        }
        String var2 = (String) null;
        kaa.a((String) null, (byte) -3);
        if (var1.length() == 0) {
          var1 = qfa.field_t;
        }
        return var1;
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          if (param1 != 63) {
            kaa.d((byte) -125);
          }
          for (var2_int = 0; param0.length() > var2_int; var2_int++) {
            var3 = param0.charAt(var2_int);
            if (!ml.a(-130697146, (char) var3) &&
              !ula.a((char) var3, 48)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("kaa.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
