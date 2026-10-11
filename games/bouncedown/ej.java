/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    static String field_b;
    static tg field_a;
    static int field_d;
    static String field_c;
    static String field_e;

    final static void a(int param0, String param1) {
        System.out.println("Error: " + ak.a(param0 ^ 123, "%0a", "\n", param1));
        if (param0 != 100) {
          field_d = -84;
        }
    }

    final static void a(int param0, String[] param1, String param2, int param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String[] var6 = null;
        int stackIn_8_0 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Bounce.field_N;
        try {
          vc.field_F = he.field_p;
          if (param0 != param3) {
            if (100 <= param0 &&
              param0 <= 105) {
              var4 = param1;
              oh.a((byte) -29, var4);
              oa.field_c = qj.a(false, param1);
              return;
            }
            oa.field_c = wb.a(param0, param3 - 254, param2);
            return;
          }
          stackIn_8_0 = 5579;
          stackIn_9_1 = !(13 <= cg.field_a);
          oa.field_c = r.a(stackIn_8_0, stackIn_9_1);
          var6 = (String[]) null;
          oh.a((byte) -29, (String[]) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_13_0 = var4_ref;
          stackIn_13_1 = new StringBuilder().append("ej.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        int var1 = 36 % ((53 - param0) / 44);
        field_b = null;
        field_a = null;
        field_e = null;
        field_c = null;
    }

    final static boolean b(int param0) {
        if (param0 >= 0) {
          field_b = (String) null;
          if (dh.field_a == null) {
            return false;
          }
          if (pj.field_a == b.field_b) {
            return true;
          }
          return false;
        }
        if (dh.field_a == null) {
          return false;
        }
        if (pj.field_a == b.field_b) {
          return true;
        }
        return false;
    }

    static {
        field_e = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_c = null;
    }
}
