/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    static vo field_a;
    static String field_b;
    static String field_d;
    static String field_e;
    static int field_c;
    static int field_f;

    public static void a(byte param0) {
        field_e = null;
        if (param0 == -43) {
          field_d = null;
          field_b = null;
          field_a = null;
          return;
        }
        we.a((byte) 95);
        field_d = null;
        field_b = null;
        field_a = null;
    }

    final static int a(int param0, boolean param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        if (!param1) {
          param0 = param0 & 8191;
          if (param0 < 4096) {
            if (param0 < 2048) {
              stackIn_19_0 = mg.field_b[2048 - param0];
            } else {
              stackIn_19_0 = -mg.field_b[param0 - 2048];
            }
            return stackIn_19_0;
          }
          if (param0 < 6144) {
            stackIn_15_0 = -mg.field_b[6144 - param0];
          } else {
            stackIn_15_0 = mg.field_b[-6144 + param0];
          }
          return stackIn_15_0;
        }
        we.a((byte) 50);
        param0 = param0 & 8191;
        if (param0 < 4096) {
          if (param0 < 2048) {
            stackIn_9_0 = mg.field_b[2048 - param0];
          } else {
            stackIn_9_0 = -mg.field_b[param0 - 2048];
          }
          return stackIn_9_0;
        }
        if (param0 < 6144) {
          stackIn_5_0 = -mg.field_b[6144 - param0];
        } else {
          stackIn_5_0 = mg.field_b[-6144 + param0];
        }
        return stackIn_5_0;
    }

    final static void a(boolean param0, boolean param1, byte param2, int param3) {
        hd stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean stackIn_8_2 = false;
        hd stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        boolean stackIn_17_2 = false;
        hd stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        boolean stackIn_22_2 = false;
        hd stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        boolean stackIn_52_2 = false;
        hd stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        boolean stackIn_61_2 = false;
        hd stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        boolean stackIn_66_2 = false;
        pa.b((byte) 123);
        if (mi.field_d >= 0) {
          li.field_a.field_E = vo.$cfr$intArgs$a$53ce4ab4c593(-18, id.field_r, new String[]{Integer.toString(mi.field_d)});
          stackIn_51_0 = ss.field_c;
          stackIn_51_1 = 0;
          stackIn_52_2 = (param0) && (!param1) && (!qv.field_f) && (uv.field_i == null) && (null == ow.field_b);
          ((hd) (Object) stackIn_51_0).b(stackIn_51_1, stackIn_52_2);
          if (param2 > -37) {
            we.a((byte) -81);
          }
          stackIn_60_0 = af.field_d;
          stackIn_60_1 = 0;
          stackIn_61_2 = (param0) && (!param1) && (!qv.field_f) && (uv.field_i == null) && (ow.field_b == null);
          ((hd) (Object) stackIn_60_0).b(stackIn_60_1, stackIn_61_2);
          stackIn_65_0 = kk.field_j;
          stackIn_65_1 = 0;
          stackIn_66_2 = (param0) && (!param1) && (qv.field_f);
          ((hd) (Object) stackIn_65_0).b(stackIn_65_1, stackIn_66_2);
        } else {
          li.field_a.field_E = null;
          stackIn_7_0 = ss.field_c;
          stackIn_7_1 = 0;
          stackIn_8_2 = (param0) && (!param1) && (!qv.field_f) && (uv.field_i == null) && (null == ow.field_b);
          ((hd) (Object) stackIn_7_0).b(stackIn_7_1, stackIn_8_2);
          if (param2 > -37) {
            we.a((byte) -81);
          }
          stackIn_16_0 = af.field_d;
          stackIn_16_1 = 0;
          stackIn_17_2 = (param0) && (!param1) && (!qv.field_f) && (uv.field_i == null) && (ow.field_b == null);
          ((hd) (Object) stackIn_16_0).b(stackIn_16_1, stackIn_17_2);
          stackIn_21_0 = kk.field_j;
          stackIn_21_1 = 0;
          stackIn_22_2 = (param0) && (!param1) && (qv.field_f);
          ((hd) (Object) stackIn_21_0).b(stackIn_21_1, stackIn_22_2);
        }
        tn.field_d.field_b.h((byte) 47);
        if (rg.field_a.field_sb != 0) {
          mg.field_f = true;
        }
        if (dr.field_d.field_sb != 0) {
          if (fv.field_d) {
            ov.a(-43, param3);
          } else {
            if (eq.field_d > 0) {
              ov.a(-43, param3);
            } else {
              if (tk.field_Ib >= 2 &&
                ne.field_G[12]) {
                ov.a(-43, param3);
              }
            }
          }
        }
        if (ps.field_b.field_sb != 0) {
          if (1 == rn.field_d.length &&
            rn.field_d[0] != ir.field_D) {
            ir.field_D = rn.field_d[0];
          }
          oa.a(false, param3, ir.field_D, true, 0, no.field_J);
        }
        if (ao.field_a.field_sb != 0) {
          qv.field_f = false;
        }
    }

    static {
        field_b = "This password contains your Player Name, and would be easy to guess";
        field_e = "Encouraging rule breaking";
        field_c = 1;
        field_d = "Go to the Orb Downloads section of FunOrb.com to purchase this item";
        field_f = 0;
    }
}
