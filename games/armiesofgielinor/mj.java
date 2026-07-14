/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    static int field_b;
    static int field_c;
    static String field_a;

    final static void a(byte param0) {
        je stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        int stackIn_1_3 = 0;
        je stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        je stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        je stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        int stackOut_0_3 = 0;
        je stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        je stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        L0: {
          stackOut_0_0 = rj.field_F;
          stackOut_0_1 = 18;
          stackOut_0_2 = -20500;
          stackOut_0_3 = nf.field_Kb.field_gb;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          if (fh.field_c) {
            stackOut_2_0 = (je) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = stackIn_2_3;
            stackOut_2_4 = 40 + (jn.field_c - -4);
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            break L0;
          } else {
            stackOut_1_0 = (je) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = stackIn_1_3;
            stackOut_1_4 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 480;
        field_c = 20;
        field_a = "This option cannot be combined with the current settings for:  ";
    }
}
