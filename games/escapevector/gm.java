/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm {
    static String field_d;
    static ed field_a;
    static hh field_b;
    static String field_e;
    static String field_f;
    static int[] field_c;

    final static ed[] a(int param0, int param1, mf param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        ed[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 8192) {
            field_e = (String) null;
          }
          if (uc.a(param2, param3 ^ -8272, param0, param1)) {
            stackIn_6_0 = g.e(15556);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (ed[]) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("gm.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        if (param0 != 8192) {
          field_d = (String) null;
          return eb.field_H;
        }
        return eb.field_H;
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_f = null;
        if (param0 == 8192) {
          field_e = null;
          field_c = null;
          field_a = null;
          return;
        }
        mf var2 = (mf) null;
        gm.a(13, 47, (mf) null, 3);
        field_e = null;
        field_c = null;
        field_a = null;
    }

    static {
        field_f = "Unable to connect to the data server. Please check any firewall you are using.";
        field_d = "Loading sound effects";
        field_c = new int[8192];
    }
}
