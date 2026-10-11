/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cr extends br {
    byte[] field_f;
    static cj field_i;
    boolean field_h;
    static int field_j;
    static String field_g;

    public static void b(boolean param0) {
        if (!param0) {
          field_g = (String) null;
          field_i = null;
          field_g = null;
          return;
        }
        field_i = null;
        field_g = null;
    }

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = qc.b((byte) -32, param0);
          if (param2 == param1.indexOf(param0) &&
            param1.indexOf(var3) == -1) {
            stackIn_12_0 = (param1.startsWith(param0)) || (param1.startsWith(var3)) || (param1.endsWith(param0)) || (param1.endsWith(var3));
            return stackIn_12_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("cr.B(");
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
          throw fa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        if (param1 >= -80) {
          return 109;
        }
        return em.field_W[param0];
    }

    static int b(int param0, int param1) {
        return param0 | param1;
    }

    cr() {
    }

    final static boolean a(byte param0) {
        int var1 = 35 / ((-63 - param0) / 49);
        if (null != pk.field_b) {
          return true;
        }
        if (oe.a(123)) {
          return true;
        }
        if (null != bk.field_i) {
          return true;
        }
        if (!nc.a((byte) 68)) {
          return false;
        }
        return true;
    }

    static {
        field_i = new cj();
        field_g = "Zombies are your thing if you have this trait equipped. You'll gain more Research Points from any zombies that return through your portal.";
    }
}
