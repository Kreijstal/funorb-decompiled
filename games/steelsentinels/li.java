/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends ag {
    static long field_w;
    static fm field_x;
    static String field_y;
    static String field_C;
    static int field_v;
    static gk[] field_z;
    static String[] field_B;
    static int field_A;
    static String field_E;
    static wk[][] field_D;

    final static boolean c() {
        int discarded$3 = 2;
        if (!qb.g()) {
            return false;
        }
        if ((8 & a.field_c) != 0) {
            return false;
        }
        return true;
    }

    final static void e() {
        if (!(!vb.field_e)) {
            pb.f(pb.field_i, pb.field_l, pb.field_b - pb.field_i, -pb.field_l + pb.field_d);
            qf.field_c.a(false, (byte) 127);
        }
    }

    li(int param0) {
        this(tj.field_e, param0);
    }

    final String c(int param0, lh param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_y = null;
                break L1;
              }
            }
            stackOut_2_0 = vn.a('*', -7477, param1.field_y.length());
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("li.G(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    public static void d(int param0) {
        field_x = null;
        field_y = null;
        field_C = null;
        field_z = null;
        field_D = null;
        if (param0 != -30874) {
          li.d(-15);
          field_E = null;
          field_B = null;
          return;
        } else {
          field_E = null;
          field_B = null;
          return;
        }
    }

    private li(mi param0, int param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new fm(11, 0, 1, 2);
        field_B = new String[]{"Close assault guns", "Flak cannons", "Explosive cannons", "Rifled cannons", "Artillery", "Bombs", "Energised kinetic weapons", "Laser weapons", "Super laser weapons", "Plasma weapons", "EMP weapons", "Rapier missiles", "Air death missiles", "Piercer rockets", "EMP rockets", "Airburst rockets", "Multirockets", "Heavy rockets", "Destructor rockets", "Atomics"};
        field_C = "This game has started.";
        field_y = "Music: ";
        field_E = "Get access to new components by expending solarite cubes on engineering. Until you engineer a component, it cannot be equipped on a sentinel.";
    }
}
