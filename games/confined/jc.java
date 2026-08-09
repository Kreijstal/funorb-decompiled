/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    static int field_e;
    static int[] field_f;
    static String field_a;
    static String[] field_d;
    static ck field_c;
    static boolean field_g;
    static String field_b;

    final static boolean a(int param0) {
        int var1;
        L0: {
          if ((ai.field_i ^ -1) == 0) {
            if (!jj.a(1, (byte) -78)) {
              return false;
            } else {
              ai.field_i = e.field_c.c(32);
              e.field_c.field_n = 0;
              break L0;
            }
          } else {
            break L0;
          }
        }
        if (ai.field_i == -2) {
          if (!jj.a(2, (byte) -111)) {
            return false;
          } else {
            ai.field_i = e.field_c.a((byte) 25);
            e.field_c.field_n = 0;
            var1 = -122 / ((param0 - -9) / 57);
            return jj.a(ai.field_i, (byte) 43);
          }
        } else {
          var1 = -122 / ((param0 - -9) / 57);
          return jj.a(ai.field_i, (byte) 43);
        }
    }

    final static void a(String param0, int param1, float param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              og.field_h = param2;
              ui.field_b = param0;
              if (param1 == 10265) {
                break L1;
              } else {
                field_d = (String[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("jc.C(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_f = null;
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != -92) {
            field_a = (String) null;
        }
    }

    static {
        field_a = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_f = new int[]{0, 0, 0, -65536, 0, 0, 0, 65536, 0, 0, 0, -65536};
        field_b = "You have 1 unread message!";
    }
}
