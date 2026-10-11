/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm extends un {
    static String[] field_q;

    final static String a(int param0, char param1) {
        int var2 = -82 / ((param0 - 2) / 53);
        return String.valueOf(param1);
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(false, param0) == jq.field_b) {
            stackIn_2_0 = dd.field_a;
            return stackIn_2_0;
          }
          if (param1 == -1276425040) {
            stackIn_7_0 = gi.field_h;
            return stackIn_7_0;
          }
          stackIn_5_0 = (String) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("hm.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_q = null;
        if (param0) {
          hm.a(-45, '\035');
        }
    }

    hm(pm param0) {
        super(param0);
    }

    final re a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        re stackIn_7_0 = null;
        re stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            hm.b(true);
          }
          stackIn_5_0 = (null != gi.a(4, param1)) ? 0 : 1;
          var3_int = stackIn_5_0;
          if (var3_int != 0) {
            stackIn_9_0 = db.field_b;
            return stackIn_9_0;
          }
          stackIn_7_0 = jq.field_b;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("hm.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_q = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
