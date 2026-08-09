/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf extends Exception {
    static ts field_e;
    static String[] field_b;
    static String field_c;
    static dg field_a;
    static int field_d;

    public rf() {
    }

    final static boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0) {
          L0: {
            field_b = (String[]) null;
            if ((mi.field_a ^ -1) != -2) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((mi.field_a ^ -1) != -2) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
          field_c = (String) null;
          field_a = null;
          field_e = null;
          field_c = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_e = null;
          field_c = null;
          field_b = null;
          return;
        }
    }

    final static g a(String param0, int param1, boolean param2) {
        nw var3 = null;
        RuntimeException var3_ref = null;
        nw stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = new nw();
              if (param2) {
                break L1;
              } else {
                field_b = (String[]) null;
                break L1;
              }
            }
            ((g) ((Object) var3)).field_b = param0;
            ((g) ((Object) var3)).field_d = param1;
            stackIn_3_0 = (nw) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("rf.C(");

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
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (g) ((Object) stackIn_3_0);
    }

    static {
        field_e = new ts(8, 0, 4, 1);
        field_c = "Menu";
        field_b = new String[255];
    }
}
