/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    static ta field_f;
    static int field_b;
    static ek field_d;
    static String field_a;
    static String field_g;
    static String field_c;
    static int field_e;

    final static bj a(boolean param0, int param1, boolean param2, int param3, boolean param4) {
        return eg.a(-104, param1, false, param2, param0, param3);
    }

    public static void b(byte param0) {
        field_f = null;
        field_d = null;
        field_a = null;
        field_g = null;
        if (param0 < 125) {
          field_d = null;
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    final static void a(byte param0) {
        if (fh.field_b == 10) {
          dg.a((byte) 117);
          fh.field_b = 11;
          if (param0 <= -2) {
            ul.field_a = true;
            return;
          } else {
            field_d = null;
            ul.field_a = true;
            return;
          }
        } else {
          if (!wc.b(false)) {
            dg.a((byte) 117);
            fh.field_b = 11;
            if (param0 > -2) {
              field_d = null;
              ul.field_a = true;
              return;
            } else {
              ul.field_a = true;
              return;
            }
          } else {
            if (param0 <= -2) {
              ul.field_a = true;
              return;
            } else {
              field_d = null;
              ul.field_a = true;
              return;
            }
          }
        }
    }

    final static boolean a(bj param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = param0.b(-1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("eb.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 124 + 41);
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_a = "Visit the Account Management section on the main site to view.";
        field_f = new ta();
        field_c = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_g = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_e = 0;
    }
}
