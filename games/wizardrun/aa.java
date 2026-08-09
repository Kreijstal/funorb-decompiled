/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa extends hh {
    String field_mb;
    int field_ob;
    static String field_gb;
    static ob field_ib;
    static String field_nb;
    String field_jb;
    static String field_hb;
    static String field_kb;
    static mh field_lb;

    aa() {
        super(0L, (hh) null);
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -47) {
                break L1;
              } else {
                field_ib = (ob) null;
                break L1;
              }
            }
            L2: {
              if (gj.a((byte) -116, param0) == null) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("aa.D(");

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
          throw bd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    public static void c(boolean param0) {
        String var2;
        if (param0) {
          var2 = (String) null;
          aa.a((String) null, (byte) 75);
          field_ib = null;
          field_kb = null;
          field_lb = null;
          field_nb = null;
          field_hb = null;
          field_gb = null;
          return;
        } else {
          field_ib = null;
          field_kb = null;
          field_lb = null;
          field_nb = null;
          field_hb = null;
          field_gb = null;
          return;
        }
    }

    static {
        field_gb = "Waiting for levels";
        field_ib = new ob();
        field_kb = "The Village";
    }
}
