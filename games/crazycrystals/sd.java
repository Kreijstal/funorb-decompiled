/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends ga implements lf {
    static String field_T;
    private int field_P;
    static dl[] field_R;
    private n field_S;

    public final n a(int param0) {
        if (param0 >= -40) {
            n discarded$0 = ((sd) this).a(-19);
            return ((sd) this).field_S;
        }
        return ((sd) this).field_S;
    }

    sd(String param0, bi param1, int param2) {
        super(param0, param1, param2);
    }

    public static void h(byte param0) {
        field_R = null;
        field_T = null;
        if (param0 != 54) {
            field_T = null;
        }
    }

    final void h(int param0) {
        Object var3 = null;
        if (param0 <= 125) {
          L0: {
            var3 = null;
            ((sd) this).a((qm) null, 84, -107, 114);
            super.h(127);
            if (null != ((sd) this).field_S) {
              ((sd) this).field_S.b((byte) 78);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            super.h(127);
            if (null != ((sd) this).field_S) {
              ((sd) this).field_S.b((byte) 78);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        int var5 = -123 / ((param1 - -50) / 59);
        super.a(param0, -115, param2, param3);
        ((sd) this).field_P = -param3 + -((sd) this).field_r + qh.field_i;
    }

    final void a(boolean param0, n param1) {
        if (!param0) {
            return;
        }
        ((sd) this).field_S = param1;
    }

    final String a(byte param0) {
        if (param0 < -23) {
          if (((sd) this).field_m) {
            if (null == ((sd) this).field_t) {
              return null;
            } else {
              sc.a(qh.field_i - -((sd) this).field_g + -((sd) this).field_P, 125, bm.field_h);
              return ((sd) this).field_t;
            }
          } else {
            return null;
          }
        } else {
          field_R = null;
          if (((sd) this).field_m) {
            if (null == ((sd) this).field_t) {
              return null;
            } else {
              sc.a(qh.field_i - -((sd) this).field_g + -((sd) this).field_P, 125, bm.field_h);
              return ((sd) this).field_t;
            }
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = null;
    }
}
