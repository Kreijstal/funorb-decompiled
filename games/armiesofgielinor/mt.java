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
        return ((mt) this).field_b.substring(0, ((mt) this).field_c) + "|" + ((mt) this).field_b.substring(((mt) this).field_c);
    }

    final char b(int param0) {
        if (param0 != -1) {
            ((mt) this).field_b = null;
        }
        int fieldTemp$0 = ((mt) this).field_c;
        ((mt) this).field_c = ((mt) this).field_c + 1;
        return ((mt) this).field_b.charAt(fieldTemp$0);
    }

    final boolean a(byte param0) {
        if (param0 != 16) {
            return true;
        }
        return ~((mt) this).field_c <= ~((mt) this).field_a ? true : false;
    }

    public static void a(int param0) {
        field_e = null;
        field_g = null;
        if (param0 > -116) {
            Object var2 = null;
            String discarded$0 = mt.a((bv) null, false);
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
                    field_g = null;
                    break L2;
                  }
                }
                var4 = new String(var3);
                stackOut_6_0 = (String) var4;
                stackIn_7_0 = stackOut_6_0;
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
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("mt.D(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
        return stackIn_7_0;
    }

    mt(String param0) {
        ((mt) this).field_c = 0;
        try {
            ((mt) this).field_b = param0;
            ((mt) this).field_a = ((mt) this).field_b.length();
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "mt.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = false;
        field_g = "You can only use Fortify on a village.";
    }
}
