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
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -47) {
            field_ib = (ob) null;
          }
          stackIn_5_0 = (gj.a((byte) -116, param0) != null);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("aa.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        if (!param0) {
          field_ib = null;
          field_kb = null;
          field_lb = null;
          field_nb = null;
          field_hb = null;
          field_gb = null;
          return;
        }
        String var2 = (String) null;
        aa.a((String) null, (byte) 75);
        field_ib = null;
        field_kb = null;
        field_lb = null;
        field_nb = null;
        field_hb = null;
        field_gb = null;
    }

    static {
        field_gb = "Waiting for levels";
        field_ib = new ob();
        field_kb = "The Village";
    }
}
