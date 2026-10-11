/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    static le field_e;
    static pj field_b;
    static String field_d;
    private String field_a;
    private boolean field_g;
    static volatile boolean field_c;
    static int field_f;

    final boolean b(int param0) {
        if (param0 != 0) {
          return true;
        }
        return this.field_g;
    }

    aj(String param0) {
        this(param0, false);
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_e = null;
        if (param0 != -14958) {
          aj.a(-119);
        }
    }

    final String a(byte param0) {
        if (param0 >= -75) {
          field_f = -96;
          return this.field_a;
        }
        return this.field_a;
    }

    aj(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_a = param0;
          stackIn_4_1 = (param1);
          this.field_g = stackIn_4_1;
          if (null == this.field_a) {
            this.field_a = "";
          }
          if (this.field_a.length() != 0) {
            return;
          }
          this.field_g = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("aj.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_d = "Go Back";
        field_c = false;
        field_f = 4;
        field_b = new pj();
    }
}
