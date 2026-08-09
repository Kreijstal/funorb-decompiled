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
        if (param0 > -53) {
          field_g = (pf) null;
          field_c = null;
          field_b = null;
          field_i = null;
          field_g = null;
          field_d = null;
          field_e = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_i = null;
          field_g = null;
          field_d = null;
          field_e = null;
          return;
        }
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
              this.field_h = param0;
              if (null != this.field_h) {
                break L1;
              } else {
                this.field_h = "";
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
            ((am) (this)).field_a = stackIn_6_1 != 0;
            if (this.field_h.length() != 0) {
              break L0;
            } else {
              this.field_a = false;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("am.<init>(");

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
        field_b = "Accept";
        field_d = new int[]{2, 2, 2, 2, 2, 5, 3, 5, 2, 5, 10, 2, 3, 1};
        field_f = -1;
        field_e = "Loading graphics";
    }
}
