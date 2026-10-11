/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn {
    static je field_c;
    static boolean field_e;
    static kk[] field_a;
    static wc field_f;
    static String field_d;
    static int field_b;
    static String field_g;

    final static void a(byte param0, float param1, String param2) {
        try {
          if (param0 != -24) {
            field_a = (kk[]) null;
          }
          UnitSpell.field_e = param2;
          TelepopEvent.field_C = param1;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "bn.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(byte param0, int param1, int param2) {
        if (param1 == 1) {
          if (is.a(4, param2)) {
            return 29;
          }
          if (param0 < -7) {
            return ce.field_I[param1];
          }
          return 111;
        }
        if (param0 < -7) {
          return ce.field_I[param1];
        }
        return 111;
    }

    final static boolean a(boolean param0) {
        if (!hf.field_c) {
          return false;
        }
        if (param0) {
          return true;
        }
        if (rs.field_t != 0) {
          return false;
        }
        return true;
    }

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        if (param0 == 29022) {
          field_a = null;
          field_f = null;
          field_c = null;
          return;
        }
        field_d = (String) null;
        field_a = null;
        field_f = null;
        field_c = null;
    }

    final static void a(boolean param0, boolean param1, int param2, int param3) {
        je stackIn_7_0 = null;
        boolean stackIn_7_1 = false;
        boolean stackIn_8_2 = false;
        je stackIn_14_0 = null;
        boolean stackIn_14_1 = false;
        boolean stackIn_15_2 = false;
        je stackIn_19_0 = null;
        boolean stackIn_19_1 = false;
        boolean stackIn_20_2 = false;
        je stackIn_56_0 = null;
        boolean stackIn_56_1 = false;
        boolean stackIn_57_2 = false;
        je stackIn_63_0 = null;
        boolean stackIn_63_1 = false;
        boolean stackIn_64_2 = false;
        je stackIn_68_0 = null;
        boolean stackIn_68_1 = false;
        boolean stackIn_69_2 = false;
        int var5;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        bh.d(false);
        if (GlobalSpell.field_g >= 0) {
          t.field_g.field_X = fo.a(4800, AttackEvent.field_F, new String[]{Integer.toString(GlobalSpell.field_g)});
          stackIn_56_0 = no.field_T;
          stackIn_56_1 = true;
          stackIn_57_2 = (param0) && (!param1) && (!bw.field_g) && (vu.field_M == null) && (null == no.field_K);
          ((je) (Object) stackIn_56_0).a(stackIn_56_1, stackIn_57_2);
          stackIn_63_0 = ov.field_i;
          stackIn_63_1 = true;
          stackIn_64_2 = (param0) && (!param1) && (!bw.field_g) && (vu.field_M == null) && (no.field_K == null);
          ((je) (Object) stackIn_63_0).a(stackIn_63_1, stackIn_64_2);
          stackIn_68_0 = qc.field_c;
          stackIn_68_1 = true;
          stackIn_69_2 = (param0) && (!param1) && (bw.field_g);
          ((je) (Object) stackIn_68_0).a(stackIn_68_1, stackIn_69_2);
          SpellCastEvent.field_E.field_a.l(10000);
          if (cp.field_d.field_yb != 0) {
            cg.field_a = true;
          }
          if (param2 < 60) {
            return;
          }
          if (fj.field_d.field_yb != 0) {
            if (bj.field_k) {
              gu.a(-61, param3);
            } else {
              if (df.field_M > 0) {
                gu.a(-61, param3);
              } else {
                if (2 <= hi.field_j &&
                  br.field_f[12]) {
                  gu.a(-61, param3);
                } else {
                  mo.field_w = true;
                }
              }
            }
          }
        } else {
          t.field_g.field_X = null;
          stackIn_7_0 = no.field_T;
          stackIn_7_1 = true;
          stackIn_8_2 = (param0) && (!param1) && (!bw.field_g) && (vu.field_M == null) && (null == no.field_K);
          ((je) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_8_2);
          stackIn_14_0 = ov.field_i;
          stackIn_14_1 = true;
          stackIn_15_2 = (param0) && (!param1) && (!bw.field_g) && (vu.field_M == null) && (no.field_K == null);
          ((je) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_15_2);
          stackIn_19_0 = qc.field_c;
          stackIn_19_1 = true;
          stackIn_20_2 = (param0) && (!param1) && (bw.field_g);
          ((je) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_20_2);
          SpellCastEvent.field_E.field_a.l(10000);
          if (cp.field_d.field_yb != 0) {
            cg.field_a = true;
          }
          if (param2 < 60) {
            return;
          }
          if (fj.field_d.field_yb != 0) {
            if (bj.field_k) {
              gu.a(-61, param3);
            } else {
              if (df.field_M > 0) {
                gu.a(-61, param3);
              } else {
                if (2 <= hi.field_j) {
                  if (br.field_f[12]) {
                    gu.a(-61, param3);
                  } else {
                    mo.field_w = true;
                  }
                } else {
                  mo.field_w = true;
                }
              }
            }
          }
        }
        if (VineGrowthAction.field_x.field_yb != 0) {
          if (lm.field_e.length == 1 &&
            TextCursor.field_d != lm.field_e[0]) {
            TextCursor.field_d = lm.field_e[0];
          }
          MovementPresentation.a(param3, TextCursor.field_d, 0, true, DeployEvent.field_F, 5623);
        }
        if (td.field_g.field_yb != 0) {
          bw.field_g = false;
        }
    }

    static {
        field_e = true;
        field_d = "Hide chat";
        field_g = "Members only.";
    }
}
