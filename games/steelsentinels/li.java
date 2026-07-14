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

    final static boolean c(int param0) {
        if (param0 == 8) {
          if (qb.g(2)) {
            if ((8 & a.field_c) != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          li.d(28);
          if (qb.g(2)) {
            if ((8 & a.field_c) != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void e(int param0) {
        L0: {
          if (vb.field_e) {
            pb.f(pb.field_i, pb.field_l, pb.field_b - pb.field_i, -pb.field_l + pb.field_d);
            qf.field_c.a(false, (byte) 127);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 0) {
          field_D = null;
          return;
        } else {
          return;
        }
    }

    li(int param0) {
        this(tj.field_e, param0);
    }

    final String c(int param0, lh param1) {
        if (param0 != -1) {
          field_y = null;
          return vn.a('*', -7477, param1.field_y.length());
        } else {
          return vn.a('*', -7477, param1.field_y.length());
        }
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
