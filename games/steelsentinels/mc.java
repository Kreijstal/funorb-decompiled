/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static int field_a;
    static String field_b;
    static String field_e;
    static LoginConnectionStage field_c;
    static String field_d;

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final static void a(String param0, float param1, int param2) {
        if (param2 != -21801) {
          return;
        }
        try {
          ClientException.field_i = param0;
          IterableNodeHashTable.field_l = param1;
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "mc.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_e = null;
        if (param0 != 23225) {
          return;
        }
        field_d = null;
        field_c = null;
    }

    static {
        field_b = "COMPONENTS";
        field_e = "Respawns - ";
        field_c = new LoginConnectionStage();
        field_d = "NO SLOT";
    }
}
