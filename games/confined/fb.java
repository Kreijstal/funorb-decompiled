/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static fi field_e;
    static java.awt.Canvas field_b;
    static String[] field_d;
    static vj field_a;
    static String field_c;

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        field_d = null;
        field_a = null;
        field_e = null;
        if (param0) {
            field_d = (String[]) null;
        }
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4;
        var4 = param2;
        if (!param0) {
          L0: {
            if (param1) {
              var4 += 2;
              break L0;
            } else {
              break L0;
            }
          }
          if (param3) {
            var4++;
            return qc.field_k[var4];
          } else {
            return qc.field_k[var4];
          }
        } else {
          L1: {
            var4 += 4;
            if (param1) {
              var4 += 2;
              break L1;
            } else {
              break L1;
            }
          }
          if (!param3) {
            return qc.field_k[var4];
          } else {
            var4++;
            return qc.field_k[var4];
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        c.field_t = param2;
        if (param1 > -5) {
            field_c = (String) null;
            ah.field_Q = param0;
            return;
        }
        ah.field_Q = param0;
    }

    final static n a(int param0, int param1, String param2) {
        og var3 = null;
        RuntimeException var3_ref = null;
        og stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = new og();
              if (param0 == 12) {
                break L1;
              } else {
                field_d = (String[]) null;
                break L1;
              }
            }
            ((n) ((Object) var3)).field_b = param2;
            ((n) ((Object) var3)).field_c = param1;
            stackIn_3_0 = (og) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("fb.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (n) ((Object) stackIn_3_0);
    }

    static {
        field_e = new fi();
        field_d = new String[10];
    }
}
