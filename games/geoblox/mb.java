/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static String[] field_a;
    private String field_d;
    private boolean field_c;
    static od field_b;

    mb(String param0) {
        this(param0, false);
    }

    final String b(int param0) {
        if (param0 != 16925) {
            this.a((byte) -83);
            return this.field_d;
        }
        return this.field_d;
    }

    mb(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_d = param0;
          if (null == this.field_d) {
            this.field_d = "";
          }
          if (!param1) {
            stackIn_6_1 = false;
          } else {
            stackIn_6_1 = true;
          }
          ((mb) (this)).field_c = stackIn_6_1;
          if (this.field_d.length() != 0) {
            return;
          }
          this.field_c = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = (RuntimeException) (var3);
          stackIn_12_1 = new StringBuilder().append("mb.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    final boolean a(byte param0) {
        if (param0 <= 74) {
            return false;
        }
        return this.field_c;
    }

    static {
        field_a = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_b = new od("email");
    }
}
