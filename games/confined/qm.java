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
        int var1 = 86 / ((param0 + 12) / 61);
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
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -2) {
            qm.c(67);
          }
          stackIn_3_0 = qd.a('*', param0.field_B.length(), (byte) -118);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qm.K(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
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
