/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends lu {
    static int field_B;
    static int field_A;
    static wk field_y;
    static og[] field_w;
    static volatile boolean field_z;
    static String field_x;
    static boolean field_C;

    final String d(int param0, kb param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ol.b((byte) 38);
                break L1;
              }
            }
            stackIn_3_0 = no.a('*', true, param1.field_v.length());
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ol.AA(").append(param0).append(',');

            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    ol(int param0) {
        this(ArmiesOfGielinor.field_J, param0);
    }

    public static void b(byte param0) {
        field_y = null;
        if (param0 <= 30) {
            ol.b((byte) -13);
            field_x = null;
            field_w = null;
            return;
        }
        field_x = null;
        field_w = null;
    }

    private ol(ka param0, int param1) {
        super(param0, param1);
    }

    static {
        field_A = 5;
        field_x = "Please select options in the following rows:  ";
        field_z = true;
    }
}
