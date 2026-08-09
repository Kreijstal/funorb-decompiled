/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    String[] field_d;
    boolean field_f;
    static String field_b;
    static String field_e;
    int field_g;
    String field_c;
    boolean field_a;

    public static void a(byte param0) {
        field_b = null;
        if (param0 > -31) {
            rg.b((byte) 118);
            field_e = null;
            return;
        }
        field_e = null;
    }

    final static void b(byte param0) {
        ta.a((byte) -118, vi.b(0));
        if (param0 >= -60) {
            field_e = (String) null;
        }
    }

    final static void a(int param0, String param1, String param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              d.a(param2, false, param1, 0);
              if (param0 == -8742) {
                break L1;
              } else {
                rg.a((byte) -58);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("rg.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ')');
        }
    }

    rg(boolean param0) {
        this.field_f = param0 ? true : false;
    }

    static {
        field_b = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_e = "Go Back";
    }
}
