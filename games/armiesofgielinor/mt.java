/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mt {
    static String field_g;
    static boolean field_f;
    private int field_a;
    static rc field_e;
    static int field_d;
    private String field_b;
    int field_c;

    public final String toString() {
        return this.field_b.substring(0, this.field_c) + "|" + this.field_b.substring(this.field_c);
    }

    final char b(int param0) {
        if (param0 != -1) {
            this.field_b = (String) null;
        }
        int fieldTemp$0 = this.field_c;
        this.field_c = this.field_c + 1;
        return this.field_b.charAt(fieldTemp$0);
    }

    final boolean a(byte param0) {
        if (param0 != 16) {
            return true;
        }
        return (this.field_c ^ -1) <= (this.field_a ^ -1) ? true : false;
    }

    public static void a(int param0) {
        field_e = null;
        field_g = null;
        if (param0 > -116) {
            bv var2 = (bv) null;
            mt.a((bv) null, false);
        }
    }

    final static String a(bv param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4_int = 0;
        String var4 = null;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param0.g(61, 2) - -1;
            var3 = new byte[var2_int];
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= var2_int) {
                L2: {
                  if (param1) {
                    break L2;
                  } else {
                    field_g = (String) null;
                    break L2;
                  }
                }
                var4 = new String(var3);
                stackIn_7_0 = (String) (var4);
                break L0;
              } else {
                var3[var4_int] = (byte)(int)sa.a(param0, -1, -15329);
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("mt.D(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    mt(String param0) {
        this.field_c = 0;
        try {
            this.field_b = param0;
            this.field_a = this.field_b.length();
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "mt.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = false;
        field_g = "You can only use Fortify on a village.";
    }
}
