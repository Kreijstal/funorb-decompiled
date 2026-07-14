/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta extends al {
    static String field_jb;
    static String field_ob;
    static int[] field_ib;
    static String field_lb;
    private boolean field_kb;
    static cj field_gb;
    private String field_rb;
    private boolean field_nb;
    static char[] field_pb;
    private le field_qb;
    private String field_mb;
    static ak field_hb;

    public static void k(byte param0) {
        if (param0 > -61) {
          return;
        } else {
          field_ob = null;
          field_ib = null;
          field_hb = null;
          field_lb = null;
          field_gb = null;
          field_pb = null;
          field_jb = null;
          return;
        }
    }

    final void l(int param0) {
        ((ta) this).field_qb.field_L = false;
        ((ta) this).field_nb = true;
        if (param0 <= 110) {
            ((ta) this).field_nb = true;
        }
    }

    ta(vk param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((ta) this).field_mb = param1;
        if (null != ((ta) this).field_mb) {
            var3 = ci.field_d.a(((ta) this).field_mb, 260, ci.field_d.field_C);
            ((ta) this).b(300, var3 + 150, 78);
        }
        ((ta) this).field_qb = new le(13, 50, 274, 30, 15, 2113632, 4210752);
        ((ta) this).field_kb = false;
        ((ta) this).field_qb.field_L = true;
        ((ta) this).field_nb = false;
        ((ta) this).b((byte) 107, (cf) (Object) ((ta) this).field_qb);
    }

    final void a(String param0, float param1, int param2, boolean param3) {
        int stackIn_3_0 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        L0: {
          if (((ta) this).field_kb) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        if (stackIn_3_0 != (param3 ? 1 : 0)) {
          ((ta) this).field_qb.field_B = (int)(65536.0f * (param1 / 100.0f));
          ((ta) this).field_rb = param0;
          if (param2 < 24) {
            field_gb = null;
            return;
          } else {
            return;
          }
        } else {
          L1: {
            stackOut_4_0 = this;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (!param3) {
              stackOut_6_0 = this;
              stackOut_6_1 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              break L1;
            } else {
              stackOut_5_0 = this;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L1;
            }
          }
          ((ta) this).field_kb = stackIn_7_1 != 0;
          if (((ta) this).field_kb) {
            ((ta) this).field_qb.a(4210752, 8405024, (byte) -95);
            ((ta) this).field_qb.field_L = true;
            ((ta) this).field_qb.field_B = (int)(65536.0f * (param1 / 100.0f));
            ((ta) this).field_rb = param0;
            if (param2 < 24) {
              field_gb = null;
              return;
            } else {
              return;
            }
          } else {
            ((ta) this).field_qb.a(4210752, 2113632, (byte) 117);
            if (((ta) this).field_nb) {
              ((ta) this).field_qb.field_L = false;
              ((ta) this).field_qb.field_B = (int)(65536.0f * (param1 / 100.0f));
              ((ta) this).field_rb = param0;
              if (param2 >= 24) {
                return;
              } else {
                field_gb = null;
                return;
              }
            } else {
              ((ta) this).field_qb.field_B = (int)(65536.0f * (param1 / 100.0f));
              ((ta) this).field_rb = param0;
              if (param2 >= 24) {
                return;
              } else {
                field_gb = null;
                return;
              }
            }
          }
        }
    }

    final static void b(byte param0, String param1) {
        int var2 = 34 / ((param0 - -20) / 42);
    }

    final void a(boolean param0, int param1, int param2) {
        if (!param0) {
          L0: {
            field_hb = null;
            super.a(param0, param1, param2);
            ci.field_d.b(((ta) this).field_rb, param1 + (((ta) this).field_n >> -368012767), 103 + param2, 16777215, -1);
            if (null != ((ta) this).field_mb) {
              oo.b(param1 - -20, 120 + (param2 - 7), 260, 8421504);
              int discarded$2 = ci.field_d.a(((ta) this).field_mb, param1 + 20, param2 - -120 + 8, 260, 100, 16777215, -1, 1, 0, ci.field_d.field_C);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            super.a(param0, param1, param2);
            ci.field_d.b(((ta) this).field_rb, param1 + (((ta) this).field_n >> -368012767), 103 + param2, 16777215, -1);
            if (null != ((ta) this).field_mb) {
              oo.b(param1 - -20, 120 + (param2 - 7), 260, 8421504);
              int discarded$3 = ci.field_d.a(((ta) this).field_mb, param1 + 20, param2 - -120 + 8, 260, 100, 16777215, -1, 1, 0, ci.field_d.field_C);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_jb = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_pb = new char[128];
    }
}
