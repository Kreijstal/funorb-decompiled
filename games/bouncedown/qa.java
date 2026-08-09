/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends ai {
    static String field_g;
    static int field_h;
    static int field_j;
    static long field_i;

    private qa() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 19108) {
            CharSequence var2 = (CharSequence) null;
            qa.a((CharSequence) null, true);
        }
    }

    final static String a(CharSequence param0, boolean param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = pa.a(ma.a((byte) 120, param0), 7);
              if (param1) {
                break L1;
              } else {
                field_g = (String) null;
                break L1;
              }
            }
            L2: {
              if (var2 != null) {
                break L2;
              } else {
                var2 = "";
                break L2;
              }
            }
            stackIn_5_0 = (String) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2_ref);

            stackIn_8_1 = new StringBuilder().append("qa.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    static {
        field_g = "Cancel";
        field_h = 0;
        field_j = 0;
    }
}
