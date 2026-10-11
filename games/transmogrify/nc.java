/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends ni {
    static qj field_q;
    static sj field_s;
    static int field_t;
    static int[] field_p;
    static String[] field_r;

    final String c(qg param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > 53) {
            stackIn_4_0 = hk.a(0, param0.field_k.length(), '*');
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("nc.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    nc(int param0) {
        this(vd.field_h, param0);
    }

    public static void c(int param0) {
        field_s = null;
        field_p = null;
        field_q = null;
        if (param0 <= 93) {
          field_s = (sj) null;
          field_r = null;
          return;
        }
        field_r = null;
    }

    private nc(kg param0, int param1) {
        super(param0, param1);
    }

    static {
        field_q = null;
        field_t = -754974565;
        field_p = new int[4];
        field_r = new String[16];
    }
}
