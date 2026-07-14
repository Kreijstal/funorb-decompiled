/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends wk {
    private boolean field_U;
    private String field_P;
    static String field_O;
    static int field_S;
    static int field_R;
    private ll field_N;
    static String field_T;
    private boolean field_Q;
    static int field_V;
    private String field_W;

    final void b(int param0, int param1, int param2) {
        super.b(param0, -57, param2);
        if (param1 >= -6) {
          return;
        } else {
          L0: {
            ne.field_v.a(((db) this).field_W, param2 + (((db) this).field_k >> 763654849), 103 + param0, 16777215, -1);
            if (null != ((db) this).field_P) {
              na.a(20 + param2, -7 + param0 - -120, 260, 8421504);
              int discarded$1 = ne.field_v.a(((db) this).field_P, 20 + param2, param0 + 120 - -8, 260, 100, 16777215, -1, 1, 0, ne.field_v.field_s);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final void m(int param0) {
        ((db) this).field_N.field_C = false;
        if (param0 != 65536) {
            field_O = null;
            ((db) this).field_Q = true;
            return;
        }
        ((db) this).field_Q = true;
    }

    final void a(boolean param0, float param1, String param2, int param3) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        if (param0 != ((db) this).field_U) {
          L0: {
            stackOut_2_0 = this;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (!param0) {
              stackOut_4_0 = this;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = this;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          ((db) this).field_U = stackIn_5_1 != 0;
          if (!((db) this).field_U) {
            ((db) this).field_N.a(4210752, (byte) 126, 2113632);
            if (!((db) this).field_Q) {
              ((db) this).field_W = param2;
              ((db) this).field_N.field_F = (int)(param1 / 100.0f * (float)param3);
              return;
            } else {
              ((db) this).field_N.field_C = false;
              ((db) this).field_W = param2;
              ((db) this).field_N.field_F = (int)(param1 / 100.0f * (float)param3);
              return;
            }
          } else {
            ((db) this).field_N.a(4210752, (byte) 126, 8405024);
            ((db) this).field_N.field_C = true;
            ((db) this).field_W = param2;
            ((db) this).field_N.field_F = (int)(param1 / 100.0f * (float)param3);
            return;
          }
        } else {
          ((db) this).field_W = param2;
          ((db) this).field_N.field_F = (int)(param1 / 100.0f * (float)param3);
          return;
        }
    }

    db(pf param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((db) this).field_P = param1;
        if (null != ((db) this).field_P) {
            var3 = ne.field_v.b(((db) this).field_P, 260, ne.field_v.field_s);
            ((db) this).c(-463076575, 300, var3 + 150);
        }
        ((db) this).field_N = new ll(13, 50, 274, 30, 15, 2113632, 4210752);
        ((db) this).field_N.field_C = true;
        ((db) this).field_U = false;
        ((db) this).field_Q = false;
        ((db) this).b((lk) (Object) ((db) this).field_N, true);
    }

    final static String a(CharSequence param0, int param1) {
        if (param1 != 8351) {
            field_O = null;
            return vd.a((byte) 88, param0, false);
        }
        return vd.a((byte) 88, param0, false);
    }

    public static void n(int param0) {
        field_T = null;
        field_O = null;
        if (param0 != 260) {
            Object var2 = null;
            String discarded$0 = db.a((CharSequence) null, -82);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "Unable to connect to the data server. Please check any firewall you are using.";
        field_S = 56;
        field_T = "Discard";
        field_R = 0;
    }
}
