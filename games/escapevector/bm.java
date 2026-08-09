/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm {
    static String field_g;
    static hh field_a;
    static String field_d;
    static String field_f;
    static int field_c;
    static String field_e;
    static nn field_b;

    final static void a(int param0) {
        cg.d(param0 ^ 36);
        lj.a(param0, 30);
    }

    final static lm a(String param0, int param1, int param2) {
        lm var3 = null;
        RuntimeException var3_ref = null;
        lm stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = new lm(false);
              var3.field_g = param1;
              if (param2 == 4) {
                break L1;
              } else {
                field_g = (String) null;
                break L1;
              }
            }
            var3.field_f = param0;
            stackIn_3_0 = (lm) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("bm.B(");

            if (param0 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 110) {
          bm.a(95);
          field_b = null;
          field_f = null;
          field_g = null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_b = null;
          field_f = null;
          field_g = null;
          field_a = null;
          field_e = null;
          return;
        }
    }

    final static void b(byte param0) {
        if (param0 != 62) {
            bm.a((byte) -121);
        }
    }

    static {
        field_c = 0;
        field_f = "Waiting for music";
        field_d = "Continue";
        field_e = "virtual_layer3_tile.jpg";
    }
}
