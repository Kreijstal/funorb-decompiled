/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mk extends rb implements fb {
    private fn field_g;
    static String field_f;
    static String field_d;
    static int field_e;
    static String field_i;
    static boolean field_h;

    public final boolean b(int param0) {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 >= 12) {
          if (null != ((mk) this).field_g.field_v) {
            if (((mk) this).field_g.field_v.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return true;
        }
    }

    abstract gu a(int param0, String param1);

    public final void b(fn param0, int param1) {
        try {
            ((mk) this).a(126);
            int var3_int = 59 % ((-80 - param1) / 33);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "mk.FA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    mk(fn param0) {
        try {
            ((mk) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "mk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    abstract String a(byte param0, String param1);

    final String b(byte param0) {
        if (param0 != -71) {
          field_h = false;
          return ((mk) this).a((byte) 115, ((mk) this).field_g.field_v);
        } else {
          return ((mk) this).a((byte) 115, ((mk) this).field_g.field_v);
        }
    }

    final gu c(int param0) {
        int var2 = 85 / ((56 - param0) / 32);
        return ((mk) this).a(-3137, ((mk) this).field_g.field_v);
    }

    public final void a(fn param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 80) {
                break L1;
              } else {
                field_i = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("mk.EA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void f() {
        field_d = null;
        field_f = null;
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = null;
        field_d = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        field_e = -1;
        field_i = "STRENGTH";
        field_h = true;
    }
}
