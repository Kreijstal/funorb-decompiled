/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    private String field_a;
    static boolean field_b;
    static md field_g;
    static gd field_d;
    private boolean field_c;
    static String field_h;
    static int field_e;
    static rg field_f;

    final boolean a(byte param0) {
        int var2 = -99 % ((param0 - 83) / 38);
        return this.field_c;
    }

    cd(String param0) {
        this(param0, false);
    }

    final String b(int param0) {
        if (param0 != -1) {
          cd.a(96);
          return this.field_a;
        }
        return this.field_a;
    }

    public static void a(int param0) {
        if (param0 != -1) {
          return;
        }
        field_h = null;
        field_d = null;
        field_f = null;
        field_g = null;
    }

    cd(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_a = param0;
          if (null == this.field_a) {
            this.field_a = "";
          }
          stackIn_6_1 = (param1);
          this.field_c = stackIn_6_1;
          if (this.field_a.length() != 0) {
            return;
          }
          this.field_c = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("cd.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = false;
        field_h = "Quit";
        field_g = new md();
    }
}
