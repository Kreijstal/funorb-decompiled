/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tk {
    static int field_b;
    static al field_f;
    static bi[] field_c;
    static String[] field_e;
    static od field_a;
    static String field_d;
    static int field_g;

    final static void a(int param0, String param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 13) {
                break L1;
              } else {
                tk.a(-71);
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

            stackIn_5_1 = new StringBuilder().append("tk.P(").append(param0).append(',');

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
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    abstract we a(byte param0);

    abstract int a(int param0, boolean param1);

    abstract byte[] a(int param0, int param1);

    final static void a(byte param0, boolean param1) {
        dl.a(param1, true, true);
        if (param0 >= -89) {
            field_e = (String[]) null;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_d = null;
        field_f = null;
        field_e = null;
        if (param0 != 15866) {
            field_a = (od) null;
        }
    }

    static {
        field_b = 0;
        field_f = new al("");
        field_c = new bi[13];
        field_d = "Level";
        field_g = 0;
    }
}
