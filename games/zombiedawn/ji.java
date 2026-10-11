/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static String[] field_f;
    static long[] field_c;
    private boolean field_e;
    private String field_b;
    static String field_d;
    static String field_a;

    ji(String param0) {
        this(param0, false);
    }

    final boolean b(int param0) {
        if (param0 != 32) {
          this.a(-113);
          return this.field_e;
        }
        return this.field_e;
    }

    ji(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_b = param0;
          stackIn_4_1 = (param1);
          this.field_e = stackIn_4_1;
          if (this.field_b == null) {
            this.field_b = "";
          }
          if (this.field_b.length() != 0) {
            return;
          }
          this.field_e = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ji.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(int param0) {
        if (param0 != -1) {
          return (String) null;
        }
        return this.field_b;
    }

    public static void c(int param0) {
        field_a = null;
        int var1 = 78 % ((-75 - param0) / 36);
        field_c = null;
        field_d = null;
        field_f = null;
    }

    final static vn[] a(dj param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        vn[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        vn[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            stackIn_2_0 = (vn[]) null;
            return stackIn_2_0;
          }
          if (ph.a(param2, 31043, param3, param0)) {
            stackIn_7_0 = ro.a((byte) 110);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (vn[]) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ji.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_f = new String[]{"By rating", "By win percentage"};
        field_d = "Please send me news and updates (I can unsubscribe at any time)";
        field_c = new long[32];
        field_a = "Unpacking levels";
    }
}
