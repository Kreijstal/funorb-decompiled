/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    static int field_a;
    static String field_c;
    static ml field_b;

    final static void a(int param0, int param1, int param2, int param3) {
        if (0 > param2) {
          param2 = -param2;
        }
        if (param3 < 0) {
          param3 = -param3;
        }
        if (param3 < param2) {
          ve.field_x[(param2 + 1) * param2 / 2 + param3] = param1;
          if (param0 != 2) {
            of.a(29, 120, 84, -51);
            return;
          }
          return;
        }
        ve.field_x[param2 + param3 * (param3 + 1) / 2] = param1;
        if (param0 != 2) {
          of.a(29, 120, 84, -51);
          return;
        }
    }

    final static void a(int param0, boolean param1, boolean param2, boolean param3) {
        km stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        km stackIn_14_0 = null;
        boolean stackIn_15_1 = false;
        km stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        km stackIn_49_0 = null;
        boolean stackIn_50_1 = false;
        km stackIn_56_0 = null;
        boolean stackIn_57_1 = false;
        km stackIn_61_0 = null;
        boolean stackIn_62_1 = false;
        je.f(-17491);
        if (sb.field_i >= 0) {
          qd.field_f.field_V = oi.a(new String[]{Integer.toString(sb.field_i)}, sa.field_m, 2);
          stackIn_7_0 = fd.field_y;
          stackIn_8_1 = (param3) && (!param2) && (!ao.field_Gb) && (null == wl.field_d) && (la.field_h == null);
          ((km) (Object) stackIn_7_0).a(stackIn_8_1, (byte) 127);
          stackIn_14_0 = hg.field_p;
          stackIn_15_1 = (param3) && (!param2) && (!ao.field_Gb) && (null == wl.field_d) && (la.field_h == null);
          ((km) (Object) stackIn_14_0).a(stackIn_15_1, (byte) 121);
          stackIn_19_0 = jj.field_a;
          stackIn_20_1 = (param3) && (!param2) && (ao.field_Gb);
          ((km) (Object) stackIn_19_0).a(stackIn_20_1, (byte) 100);
        } else {
          qd.field_f.field_V = null;
          stackIn_49_0 = fd.field_y;
          stackIn_50_1 = (param3) && (!param2) && (!ao.field_Gb) && (null == wl.field_d) && (la.field_h == null);
          ((km) (Object) stackIn_49_0).a(stackIn_50_1, (byte) 127);
          stackIn_56_0 = hg.field_p;
          stackIn_57_1 = (param3) && (!param2) && (!ao.field_Gb) && (null == wl.field_d) && (la.field_h == null);
          ((km) (Object) stackIn_56_0).a(stackIn_57_1, (byte) 121);
          stackIn_61_0 = jj.field_a;
          stackIn_62_1 = (param3) && (!param2) && (ao.field_Gb);
          ((km) (Object) stackIn_61_0).a(stackIn_62_1, (byte) 100);
        }
        dd.field_b.field_c.g(0);
        if (param1) {
          of.a(-103, -19, 6, 22);
        }
        if (0 != s.field_b.field_nb) {
          af.field_c = true;
        }
        if (0 != nd.field_a.field_nb) {
          if (gi.field_a) {
            w.a(param0, -7093);
          } else {
            if (0 < bn.field_d) {
              w.a(param0, -7093);
            } else {
              if (2 <= hd.field_d &&
                dc.field_Y[12]) {
                w.a(param0, -7093);
              }
            }
          }
        }
        if (dc.field_R.field_nb != 0) {
          if (vj.field_b.length == 1 &&
            vj.field_b[0] != oj.field_Vb) {
            oj.field_Vb = vj.field_b[0];
          }
          qa.a((byte) 78, 0, p.field_e, param0, true, oj.field_Vb);
        }
        if (nk.field_H.field_nb != 0) {
          ao.field_Gb = false;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 != 110) {
          return;
        }
        field_b = null;
    }

    static {
        field_c = "Accept draw";
    }
}
