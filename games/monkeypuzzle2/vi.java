/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    static String[] field_b;
    static String field_a;

    public static void a(int param0) {
        String var2;
        if (param0 != 0) {
          var2 = (String) null;
          vi.a((String) null, 23, false);
          field_a = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          return;
        }
    }

    final static void a(String param0, int param1, boolean param2) {
        ja.field_F = param2;
        ah.field_h = true;
        if (param1 != 12345) {
            return;
        }
        try {
            me.field_f = new ha(wg.field_j, pj.field_c, param0, fk.field_a, ja.field_F);
            wg.field_j.b((byte) -63, me.field_f);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "vi.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        String var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 39) {
                break L1;
              } else {
                var3 = (String) null;
                vi.a((String) null, 30, false);
                break L1;
              }
            }
            stackIn_3_0 = wk.a(90, 10, param1, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("vi.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0) {
        if (!param0) {
            CharSequence var2 = (CharSequence) null;
            vi.a(97, (CharSequence) null);
            fg.field_a = 0;
            return;
        }
        fg.field_a = 0;
    }

    static {
        field_b = new String[16];
        field_a = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
