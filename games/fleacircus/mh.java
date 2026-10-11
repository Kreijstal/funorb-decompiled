/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh extends aa {
    static ce field_x;
    static int field_w;
    static int field_u;
    static String field_v;
    static int[] field_y;

    final static void a(int param0, int param1, int param2, int param3) {
        if (param1 == 1) {
          fb.field_c = param0;
          cm.field_j = param3;
          rg.field_n = param2;
          return;
        }
        mh.b(124);
        fb.field_c = param0;
        cm.field_j = param3;
        rg.field_n = param2;
    }

    mh(int param0) {
        this(ug.field_e, param0);
    }

    private mh(fa param0, int param1) {
        super(param0, param1);
    }

    final String c(int param0, qa param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 21) {
            stackIn_4_0 = ni.a(param1.field_i.length(), '*', (byte) 78);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("mh.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_v = null;
        field_x = null;
        if (param0 != 705) {
          field_w = 44;
          field_y = null;
          return;
        }
        field_y = null;
    }

    static {
        field_u = 1;
        field_v = "Tiles in the level (2/3)";
    }
}
