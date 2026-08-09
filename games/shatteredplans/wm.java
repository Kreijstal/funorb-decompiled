/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm {
    static int field_b;
    static String field_a;
    static String field_f;
    static int field_c;
    static nf[] field_d;
    static String field_e;

    final static bi a(int param0, int param1) {
        bi var2 = new bi(dc.field_F.field_z, dc.field_F.field_w);
        ra.a(param1 ^ -110);
        var2.e();
        dc.field_F.b(0, 0, param0 < param1 ? 2105376 : param0);
        cg.i(0);
        return var2;
    }

    public static void a(boolean param0) {
        field_f = null;
        field_d = null;
        field_e = null;
        field_a = null;
        if (param0) {
            field_a = (String) null;
        }
    }

    final static int a(CharSequence param0, int param1, byte param2) {
        RuntimeException var3 = null;
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
              if (param2 == 11) {
                break L1;
              } else {
                field_e = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = fc.a(param1, param0, (byte) 124, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("wm.B(");

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
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        nj.b(-120);
    }

    final static double a(int param0, byte param1, int param2) {
        if (param1 <= 90) {
          return 0.18024758453966921;
        } else {
          return (double)(param0 * param0) * (double)(param2 * 3 - param0 * 2) / (double)(param2 * (param2 * param2));
        }
    }

    static {
        field_b = 256;
        field_f = "Single-player Skirmish";
        field_a = "Click to show the Fleet Info window.";
        field_e = "Press <col=2F5FBF>'ENTER'</col> to continue.";
    }
}
