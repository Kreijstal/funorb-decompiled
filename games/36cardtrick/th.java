/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static int field_a;
    static String field_b;

    final static void a(int param0, int param1) {
        byte[] stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        byte[] stackIn_1_2 = null;
        int stackIn_1_3 = 0;
        byte[] stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        byte[] stackIn_2_2 = null;
        int stackIn_2_3 = 0;
        byte[] stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        byte[] stackIn_3_2 = null;
        int stackIn_3_3 = 0;
        byte stackIn_3_4 = 0;
        byte[] stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        byte[] stackOut_0_2 = null;
        int stackOut_0_3 = 0;
        byte[] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        byte[] stackOut_2_2 = null;
        int stackOut_2_3 = 0;
        byte stackOut_2_4 = 0;
        byte[] stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        byte[] stackOut_1_2 = null;
        int stackOut_1_3 = 0;
        byte stackOut_1_4 = 0;
        L0: {
          jc.field_O.field_l[od.field_a] = (short)(param1 >> -1077771007);
          jc.field_O.field_l[qf.field_F] = (short)(param1 >> -1077771007);
          stackOut_0_0 = jc.field_O.field_O;
          stackOut_0_1 = qf.field_F;
          stackOut_0_2 = jc.field_O.field_O;
          stackOut_0_3 = od.field_a;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          if (bc.a(param1, 1) == 0) {
            stackOut_2_0 = (byte[]) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = (byte[]) (Object) stackIn_2_2;
            stackOut_2_3 = stackIn_2_3;
            stackOut_2_4 = cf.field_d;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            break L0;
          } else {
            stackOut_1_0 = (byte[]) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = (byte[]) (Object) stackIn_1_2;
            stackOut_1_3 = stackIn_1_3;
            stackOut_1_4 = sc.field_a;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            break L0;
          }
        }
        stackIn_3_2[stackIn_3_3] = stackIn_3_4;
        stackIn_3_0[stackIn_3_1] = stackIn_3_4;
        if (param0 <= 82) {
          field_a = 85;
          return;
        } else {
          return;
        }
    }

    final static boolean a(boolean param0) {
        if (param0) {
          if (-21 >= (g.field_A ^ -1)) {
            if (ri.b((byte) 64)) {
              if ((qb.field_b ^ -1) < -1) {
                if (c.b(true)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    public static void b(boolean param0) {
        field_b = null;
        if (!param0) {
            field_a = -14;
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = 0;
        tk.field_c = tk.field_c + 1;
        rj.field_p = rj.field_p - af.field_ob;
        vf.field_b = vf.field_b + af.field_ob;
        var3 = param1 << param2;
        if ((var3 & db.field_m) == 0) {
          ue.field_d = ue.field_d | var3;
          nb.field_e = nb.field_e | var3;
          db.field_m = db.field_m | var3;
          if (!jf.field_n) {
            if (dl.d(0)) {
              ij.field_h.a((qb) (Object) new dh(param2, param0, tk.field_a, jl.field_h, ol.field_W, bc.field_a), 27362);
              return true;
            } else {
              dh discarded$2 = uh.a(tk.field_a, (byte) 119, 4, param0, ol.field_W, param2, jl.field_h, bc.field_a);
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 9;
        field_b = "Age:";
    }
}
