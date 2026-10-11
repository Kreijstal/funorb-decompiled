/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn extends RuntimeException {
    Throwable field_a;
    String field_d;
    static int field_f;
    static float field_g;
    static String field_c;
    static nh[][] field_e;
    static String field_b;

    final static hl a(int param0) {
        if (param0 != 12) {
          cn.a(false);
          return qj.b(0);
        }
        return qj.b(0);
    }

    final static void a(boolean param0, int param1, int param2, boolean param3) {
        hl stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean stackIn_9_2 = false;
        hl stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        boolean stackIn_16_2 = false;
        hl stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        boolean stackIn_21_2 = false;
        hl stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        boolean stackIn_54_2 = false;
        hl stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        boolean stackIn_61_2 = false;
        hl stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        boolean stackIn_66_2 = false;
        lj.a((byte) -97);
        if (0 <= aa.field_Pb) {
          uh.field_e.field_jb = sk.a(new String[]{Integer.toString(aa.field_Pb)}, wb.field_b, 120);
          if (param2 != 21485) {
            return;
          }
          stackIn_8_0 = hn.field_P;
          stackIn_8_1 = 0;
          stackIn_9_2 = (param3) && (!param0) && (!hm.field_b) && (qb.field_N == null) && (qe.field_a == null);
          ((hl) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_9_2);
          stackIn_15_0 = qe.field_c;
          stackIn_15_1 = 0;
          stackIn_16_2 = (param3) && (!param0) && (!hm.field_b) && (qb.field_N == null) && (qe.field_a == null);
          ((hl) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_16_2);
          stackIn_20_0 = t.field_q;
          stackIn_20_1 = 0;
          stackIn_21_2 = (param3) && (!param0) && (hm.field_b);
          ((hl) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_21_2);
        } else {
          uh.field_e.field_jb = null;
          if (param2 != 21485) {
            return;
          }
          stackIn_53_0 = hn.field_P;
          stackIn_53_1 = 0;
          stackIn_54_2 = (param3) && (!param0) && (!hm.field_b) && (qb.field_N == null) && (qe.field_a == null);
          ((hl) (Object) stackIn_53_0).a(stackIn_53_1, stackIn_54_2);
          stackIn_60_0 = qe.field_c;
          stackIn_60_1 = 0;
          stackIn_61_2 = (param3) && (!param0) && (!hm.field_b) && (qb.field_N == null) && (qe.field_a == null);
          ((hl) (Object) stackIn_60_0).a(stackIn_60_1, stackIn_61_2);
          stackIn_65_0 = t.field_q;
          stackIn_65_1 = 0;
          stackIn_66_2 = (param3) && (!param0) && (hm.field_b);
          ((hl) (Object) stackIn_65_0).a(stackIn_65_1, stackIn_66_2);
        }
        gg.field_j.field_g.c(true);
        if (gg.field_i.field_F != 0) {
          bh.field_p = true;
        }
        if (ei.field_q.field_F != 0) {
          if (oa.field_r) {
            gg.a(param1, 0);
          } else {
            if (mb.field_C > 0) {
              gg.a(param1, 0);
            } else {
              if (2 <= dd.field_c &&
                sn.field_a[12]) {
                gg.a(param1, 0);
              }
            }
          }
        }
        if (je.field_e.field_F != 0) {
          if (1 == cl.field_f.length &&
            cl.field_f[0] != TetraLink.field_N) {
            TetraLink.field_N = cl.field_f[0];
          }
          al.a(0, true, ej.field_o, param1, true, TetraLink.field_N);
        }
        if (0 != wb.field_a.field_F) {
          hm.field_b = false;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_e = (nh[][]) null;
        field_b = null;
        field_c = null;
    }

    cn(Throwable param0, String param1) {
        this.field_a = param0;
        this.field_d = param1;
    }

    static {
        field_c = "This option cannot be combined with the current '<%0>' setting.";
        field_b = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
    }
}
