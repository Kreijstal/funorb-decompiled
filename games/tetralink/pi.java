/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    static wf field_c;
    static uf field_a;
    static String field_e;
    static String field_d;
    static String field_b;

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 17510) {
                break L1;
              } else {
                field_a = (uf) null;
                break L1;
              }
            }
            L2: {
              if (param0 == null) {
                break L2;
              } else {
                if (param0.length() < mn.field_e) {
                  break L2;
                } else {
                  if (param0.length() <= qf.field_i) {
                    stackIn_9_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
            }
            stackIn_7_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("pi.A(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 > -2) {
          field_e = (String) null;
          field_e = null;
          field_a = null;
          field_d = null;
          field_b = null;
          return;
        } else {
          field_e = null;
          field_a = null;
          field_d = null;
          field_b = null;
          return;
        }
    }

    static {
        field_d = "Just play";
        field_e = "Unpacking models";
        field_b = "You must be a member to play with the current options.";
    }
}
