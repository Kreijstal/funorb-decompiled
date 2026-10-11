/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl implements uj {
    static String field_c;
    static int field_b;
    static wh field_a;

    public final void a(boolean param0) {
        if (param0) {
          field_a = (wh) null;
          bc.field_a = 4;
          tb.field_a = 2;
          return;
        }
        bc.field_a = 4;
        tb.field_a = 2;
    }

    final static int a(String param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -15388) {
            hl.b((byte) 12);
          }
          if (param1) {
            stackIn_6_0 = ta.field_b.a(param0);
            return stackIn_6_0;
          }
          stackIn_4_0 = gh.field_b.a(param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("hl.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean b(byte param0) {
        int var1 = -4 / ((58 - param0) / 61);
        if (20 > af.field_u) {
          return true;
        }
        if (!bi.a(-11)) {
          return true;
        }
        if (a.field_d <= 0) {
          return false;
        }
        if (!wc.b(false)) {
          return true;
        }
        return false;
    }

    public final String a(byte param0) {
        int var2 = 29 / ((param0 + 33) / 62);
        return "Make Boulders";
    }

    public static void b(boolean param0) {
        if (param0) {
          field_c = (String) null;
          field_a = null;
          field_c = null;
          return;
        }
        field_a = null;
        field_c = null;
    }

    final static int a(int param0) {
        if (param0 >= -63) {
          return -104;
        }
        return 1;
    }

    static {
        field_c = "Burnt the Brightest";
    }
}
