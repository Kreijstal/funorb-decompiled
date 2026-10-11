/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static td field_b;
    static qk field_c;
    private boolean field_f;
    private String field_e;
    static le field_a;
    static String[] field_d;

    final String a(int param0) {
        if (param0 != 0) {
          jk.a(false);
          return this.field_e;
        }
        return this.field_e;
    }

    final static void a(boolean param0) {
        db.field_a = new kl();
        vb.field_h.c(db.field_a, (byte) 48);
        if (param0) {
          jk.a((byte) 87);
        }
    }

    jk(String param0) {
        this(param0, false);
    }

    final boolean b(boolean param0) {
        if (!param0) {
          this.field_f = false;
          return this.field_f;
        }
        return this.field_f;
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        field_d = null;
        if (param0 != -63) {
          field_b = (td) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    jk(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_e = param0;
          if (null == this.field_e) {
            this.field_e = "";
          }
          stackIn_6_1 = (param1);
          this.field_f = stackIn_6_1;
          if (this.field_e.length() != 0) {
            return;
          }
          this.field_f = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("jk.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = new td();
        field_d = new String[]{"All scores", "My scores", "Best each"};
    }
}
