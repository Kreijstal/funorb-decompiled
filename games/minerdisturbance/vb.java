/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vb {
    static int field_b;
    static String field_d;
    static ta field_c;
    static String field_a;

    abstract g a(byte param0);

    public static void a(int param0) {
        field_a = null;
        if (param0 != -7672) {
            vb.a(119);
            field_d = null;
            field_c = null;
            return;
        }
        field_d = null;
        field_c = null;
    }

    abstract byte[] a(int param0, int param1);

    abstract int a(byte param0, int param1);

    final static void a(ea param0, int param1) {
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
              ti.a((byte) 126);
              eh.a(param0.field_D, param0.field_x, param0.field_A);
              if (param1 >= 124) {
                break L1;
              } else {
                vb.a(-15);
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

            stackIn_5_1 = new StringBuilder().append("vb.K(");

            if (param0 == null) {
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
          throw lj.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    static {
        field_d = "Create a free account to start using this feature";
        field_c = new ta();
        field_a = "Connection lost - attempting to reconnect";
    }
}
