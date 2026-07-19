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
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        if (param0 != -1) {
          this.field_b = (String) null;
          fieldTemp$4 = this.field_c;
          this.field_c = this.field_c + 1;
          return this.field_b.charAt(fieldTemp$4);
        } else {
          fieldTemp$5 = this.field_c;
          this.field_c = this.field_c + 1;
          return this.field_b.charAt(fieldTemp$5);
        }
    }

    final boolean a(byte param0) {
        if (param0 != 16) {
            return true;
        }
        return (this.field_c ^ -1) <= (this.field_a ^ -1) ? true : false;
    }

    public static void a(int param0) {
        String discarded$0 = null;
        field_e = null;
        field_g = null;
        if (param0 > -116) {
            bv var2 = (bv) null;
            discarded$0 = mt.a((bv) null, false);
        }
    }

    final static String a(bv param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4_int = 0;
        String var4 = null;
        int var5 = 0;
        String stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param0.g(61, 2) - -1;
            var3 = new byte[var2_int];
            var4_int = 0;
            L1: while (true) {
              L2: {
                if (var4_int >= var2_int) {
                  if (param1) {
                    break L2;
                  } else {
                    field_g = (String) null;
                    break L2;
                  }
                } else {
                  var3[var4_int] = (byte)(int)sa.a(param0, -1, -15329);
                  var4_int++;
                  if (var5 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              var4 = new String(var3);
              stackOut_8_0 = (String) (var4);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("mt.D(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
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
