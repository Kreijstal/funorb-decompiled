/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh {
    static sa field_a;
    static md field_d;
    private String field_b;
    private boolean field_h;
    static String field_e;
    private boolean field_c;
    static String field_g;
    static dd field_f;

    final static void b(int param0) {
        if (param0 != 13) {
          mh.b(22);
          tj.field_p = null;
          em.field_m = null;
          ik.field_a = null;
          hj.field_l = null;
          kb.field_S = false;
          return;
        } else {
          tj.field_p = null;
          em.field_m = null;
          ik.field_a = null;
          hj.field_l = null;
          kb.field_S = false;
          return;
        }
    }

    final static void a(int param0, int param1) {
        L0: {
          sg.field_d = 3 & param1 >> 4;
          ii.field_Q = (param1 & 13) >> 2;
          if (sg.field_d > 2) {
            sg.field_d = 2;
            break L0;
          } else {
            break L0;
          }
        }
        v.field_d = 3 & param1;
        if (2 < ii.field_Q) {
          L1: {
            ii.field_Q = 2;
            if (v.field_d > 2) {
              v.field_d = 2;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (v.field_d > 2) {
              v.field_d = 2;
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_e = null;
        if (param0 != 3) {
          mh.a(-32);
          field_g = null;
          field_f = null;
          return;
        } else {
          field_g = null;
          field_f = null;
          return;
        }
    }

    final void a(boolean param0, int param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param1 != -1730123902) {
          L0: {
            mh.b(-93);
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param0) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((mh) this).field_h = stackIn_8_1 != 0;
          ((mh) this).field_c = true;
          return;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((mh) this).field_h = stackIn_4_1 != 0;
          ((mh) this).field_c = true;
          return;
        }
    }

    final boolean b(byte param0) {
        if (param0 < 94) {
            mh.a(35);
            return ((mh) this).field_c;
        }
        return ((mh) this).field_c;
    }

    final boolean c(int param0) {
        if (param0 > -14) {
            ((mh) this).field_b = null;
            return ((mh) this).field_h;
        }
        return ((mh) this).field_h;
    }

    final String a(byte param0) {
        int var2 = 34 % ((param0 - -10) / 60);
        return ((mh) this).field_b;
    }

    mh(String param0) {
        ((mh) this).field_h = false;
        ((mh) this).field_c = false;
        try {
            ((mh) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "mh.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "White's move";
        field_g = "%L";
        field_a = new sa();
    }
}
