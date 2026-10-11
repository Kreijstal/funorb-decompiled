/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    private String field_e;
    static int field_c;
    static String field_a;
    private boolean field_d;
    static int[] field_b;

    qj(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_e = param0;
          if (this.field_e == null) {
            this.field_e = "";
          }
          stackIn_6_1 = (param1);
          this.field_d = stackIn_6_1;
          if (0 != this.field_e.length()) {
            return;
          }
          this.field_d = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("qj.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0) {
        if (param0 <= 57) {
          return false;
        }
        return this.field_d;
    }

    final String a(boolean param0) {
        if (param0) {
          this.field_e = (String) null;
          return this.field_e;
        }
        return this.field_e;
    }

    public static void a(byte param0) {
        if (param0 != 56) {
          return;
        }
        field_b = null;
        field_a = null;
    }

    qj(String param0) {
        this(param0, false);
    }

    static {
        field_a = "Ask to join <%0>'s game";
        field_b = new int[4096];
    }
}
