/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mg extends hn implements hi {
    static int field_i;
    static ak field_h;
    static String field_g;
    static String field_k;
    static boolean field_l;
    private c field_j;

    public static void d(int param0) {
        field_g = null;
        field_h = null;
        field_k = null;
        int var1 = -28;
    }

    abstract String a(int param0, String param1);

    final String c(int param0) {
        if (param0 != -1) {
          boolean discarded$2 = ((mg) this).a(10);
          return ((mg) this).a(-128, ((mg) this).field_j.field_q);
        } else {
          return ((mg) this).a(-128, ((mg) this).field_j.field_q);
        }
    }

    public final boolean a(int param0) {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -22265) {
          if (null != ((mg) this).field_j.field_q) {
            if (((mg) this).field_j.field_q.length() == 0) {
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

    abstract dj a(String param0, boolean param1);

    public final void a(int param0, c param1) {
        try {
            ((mg) this).b(2048);
            int var3_int = -22 % ((-30 - param0) / 60);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "mg.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(c param0, int param1) {
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
              if (param1 == 4) {
                break L1;
              } else {
                field_i = -81;
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
            stackOut_3_1 = new StringBuilder().append("mg.H(");
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
          throw aa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final dj a(boolean param0) {
        Object var3 = null;
        if (!param0) {
          var3 = null;
          String discarded$2 = ((mg) this).a(17, (String) null);
          return ((mg) this).a(((mg) this).field_j.field_q, param0);
        } else {
          return ((mg) this).a(((mg) this).field_j.field_q, param0);
        }
    }

    mg(c param0) {
        try {
            ((mg) this).field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "mg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Shortcut Reference";
        field_k = "Options Menu";
    }
}
