/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm extends db {
    static boolean[] field_C;
    static java.awt.Image field_z;
    static String field_A;
    static bm[] field_B;
    static int field_y;

    public static void c(int param0) {
        field_z = null;
        field_C = null;
        field_B = null;
        int var1 = 86 / ((param0 - -12) / 61);
        field_A = null;
    }

    qm(int param0) {
        this(gm.field_cb, param0);
    }

    final String b(fj param0, int param1) {
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
              if (param1 == -2) {
                break L1;
              } else {
                qm.c(67);
                break L1;
              }
            }
            stackIn_3_0 = qd.a('*', param0.field_B.length(), (byte) -118);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("qm.K(");

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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    private qm(ok param0, int param1) {
        super(param0, param1);
    }

    static {
        field_C = new boolean[]{false, true, true, true, false, true, true, true, false, false, false, false, true};
        field_y = -1;
        field_A = "<col=FFFFFF>Lasers:</col> this upgrade gives you focused beams of light that operate at any distance and inflict continuous damage on whatever they hit. Hold <col=FFFFFF><%0></col> to fire, and remember to manage your ready energy.";
    }
}
