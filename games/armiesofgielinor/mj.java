/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    static int field_b;
    static int field_c;
    static String field_a;

    final static void a(byte param0) {
        je stackIn_2_0;
        int stackIn_2_1;
        int stackIn_2_2;
        int stackIn_2_3;
        je stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        L0: {
          stackIn_2_0 = rj.field_F;

          stackIn_2_1 = 18;

          stackIn_2_2 = -20500;

          stackIn_2_3 = nf.field_Kb.field_gb;

          if (fh.field_c) {
            stackIn_3_0 = (je) ((Object) stackIn_2_0);
            stackIn_3_1 = stackIn_2_1;
            stackIn_3_2 = stackIn_2_2;
            stackIn_3_3 = stackIn_2_3;
            stackIn_3_4 = 40 + (jn.field_c - -4);
            break L0;
          } else {
            stackIn_3_0 = (je) ((Object) stackIn_2_0);
            stackIn_3_1 = stackIn_2_1;
            stackIn_3_2 = stackIn_2_2;
            stackIn_3_3 = stackIn_2_3;
            stackIn_3_4 = 0;
            break L0;
          }
        }
        ((je) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3 - stackIn_3_4, 0, 0);
        cm.field_a.a(18, -20500, jn.field_c + 42, 0, -2 + (nf.field_Kb.field_gb + -jn.field_c + -40));
        ne.field_f.a(0, false, nf.field_Kb.field_gb, 2, jn.field_c, 20, nf.field_Kb.field_ob - 20);
        if (param0 < 29) {
          field_b = -104;
          return;
        } else {
          return;
        }
    }

    final static void b(byte param0) {
        if (l.field_a == null) {
          L0: {
            if (mt.field_e != null) {
              mt.field_e.f();
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 > -79) {
            mj.b((byte) 93);
            return;
          } else {
            return;
          }
        } else {
          L1: {
            l.field_a.f();
            if (mt.field_e != null) {
              mt.field_e.f();
              break L1;
            } else {
              break L1;
            }
          }
          if (param0 <= -79) {
            return;
          } else {
            mj.b((byte) 93);
            return;
          }
        }
    }

    public static void c(byte param0) {
        if (param0 >= -23) {
            mj.b((byte) 115);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        field_b = 480;
        field_c = 20;
        field_a = "This option cannot be combined with the current settings for:  ";
    }
}
