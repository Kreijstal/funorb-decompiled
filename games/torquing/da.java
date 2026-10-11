/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static String field_e;
    static ka field_b;
    private boolean field_f;
    static k field_d;
    private String field_c;
    static int field_g;
    static int field_a;

    final static byte[] a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 43 % ((44 - param0) / 60);
          stackIn_1_0 = dn.field_i.a(-127, param1, "");
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("da.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final String b(byte param0) {
        int var2 = 82 / ((param0 - 48) / 58);
        return this.field_c;
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 > 88) {
          field_b = null;
          field_d = null;
          return;
        }
        String var2 = (String) null;
        da.a((byte) 80, (String) null);
        field_b = null;
        field_d = null;
    }

    da(String param0) {
        this(param0, false);
    }

    final boolean a(byte param0) {
        int var2 = 25 % ((param0 + 1) / 41);
        return this.field_f;
    }

    da(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_c = param0;
          if (this.field_c == null) {
            this.field_c = "";
          }
          stackIn_6_1 = (param1);
          this.field_f = stackIn_6_1;
          if (0 != this.field_c.length()) {
            return;
          }
          this.field_f = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("da.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_e = "Fullscreen mode";
        field_b = new ka(0, 0);
        field_d = new k(10, 2, 2, 0);
    }
}
