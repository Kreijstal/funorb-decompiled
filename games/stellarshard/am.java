/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static String field_i;
    static int field_f;
    static re field_c;
    static int[] field_d;
    static pf field_g;
    static String field_b;
    private boolean field_a;
    private String field_h;
    static String field_e;

    am(String param0) {
        this(param0, false);
    }

    final String a(byte param0) {
        int var2 = -64 % ((53 - param0) / 50);
        return this.field_h;
    }

    final static void a(int param0, int param1, int param2) {
        ea.field_p = param1;
        fg.field_O = param0;
        int var3 = 21 % ((-58 - param2) / 59);
        n.field_L = 255;
        tl.field_c = 6;
    }

    public static void b(int param0) {
        if (param0 <= -53) {
          field_c = null;
          field_b = null;
          field_i = null;
          field_g = null;
          field_d = null;
          field_e = null;
          return;
        }
        field_g = (pf) null;
        field_c = null;
        field_b = null;
        field_i = null;
        field_g = null;
        field_d = null;
        field_e = null;
    }

    final boolean a(int param0) {
        if (param0 != 5) {
          field_g = (pf) null;
          return this.field_a;
        }
        return this.field_a;
    }

    am(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_h = param0;
          if (null == this.field_h) {
            this.field_h = "";
          }
          stackIn_6_1 = (param1);
          this.field_a = stackIn_6_1;
          if (this.field_h.length() != 0) {
            return;
          }
          this.field_a = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("am.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = "Accept";
        field_d = new int[]{2, 2, 2, 2, 2, 5, 3, 5, 2, 5, 10, 2, 3, 1};
        field_f = -1;
        field_e = "Loading graphics";
    }
}
