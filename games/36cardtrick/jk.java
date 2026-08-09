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
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_e = param0;
              if (null != this.field_e) {
                break L1;
              } else {
                this.field_e = "";
                break L1;
              }
            }
            L2: {
              stackIn_5_0 = this;

              if (!param1) {
                stackIn_6_0 = this;
                stackIn_6_1 = 0;
                break L2;
              } else {
                stackIn_6_0 = this;
                stackIn_6_1 = 1;
                break L2;
              }
            }
            ((jk) (this)).field_f = stackIn_6_1 != 0;
            if (this.field_e.length() != 0) {
              break L0;
            } else {
              this.field_f = false;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("jk.<init>(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    static {
        field_b = new td();
        field_d = new String[]{"All scores", "My scores", "Best each"};
    }
}
