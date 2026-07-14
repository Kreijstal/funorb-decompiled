/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends vg {
    private String field_Z;
    private boolean field_eb;
    static String field_fb;
    private String field_db;
    private boolean field_gb;
    private jm field_cb;
    static mf field_ab;
    static int[] field_bb;
    static hh field_hb;

    final void d(boolean param0) {
        ((w) this).field_gb = param0 ? true : false;
        ((w) this).field_cb.field_G = false;
    }

    final static rk[] c(boolean param0) {
        if (param0) {
            return null;
        }
        return bf.field_M;
    }

    final void a(int param0, String param1, float param2, boolean param3) {
        int var5 = 0;
        int stackIn_3_0 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        L0: {
          var5 = 46 / ((param0 - -43) / 54);
          if (param3) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        if (stackIn_3_0 == (((w) this).field_eb ? 1 : 0)) {
          L1: {
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param3) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L1;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L1;
            }
          }
          ((w) this).field_eb = stackIn_8_1 != 0;
          if (!((w) this).field_eb) {
            ((w) this).field_cb.a(4210752, 2113632, -127);
            if (!((w) this).field_gb) {
              ((w) this).field_db = param1;
              ((w) this).field_cb.field_B = (int)(param2 / 100.0f * 65536.0f);
              return;
            } else {
              ((w) this).field_cb.field_G = false;
              ((w) this).field_db = param1;
              ((w) this).field_cb.field_B = (int)(param2 / 100.0f * 65536.0f);
              return;
            }
          } else {
            ((w) this).field_cb.a(4210752, 8405024, -127);
            ((w) this).field_cb.field_G = true;
            ((w) this).field_db = param1;
            ((w) this).field_cb.field_B = (int)(param2 / 100.0f * 65536.0f);
            return;
          }
        } else {
          ((w) this).field_db = param1;
          ((w) this).field_cb.field_B = (int)(param2 / 100.0f * 65536.0f);
          return;
        }
    }

    public static void n(int param0) {
        field_fb = null;
        field_hb = null;
        if (param0 != 300) {
          field_hb = null;
          field_ab = null;
          field_bb = null;
          return;
        } else {
          field_ab = null;
          field_bb = null;
          return;
        }
    }

    w(tb param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((w) this).field_Z = param1;
        if (null != ((w) this).field_Z) {
            var3 = dl.field_b.b(((w) this).field_Z, 260, dl.field_b.field_r);
            ((w) this).b(255, 150 - -var3, 300);
        }
        ((w) this).field_cb = new jm(13, 50, 274, 30, 15, 2113632, 4210752);
        ((w) this).field_cb.field_G = true;
        ((w) this).field_eb = false;
        ((w) this).field_gb = false;
        ((w) this).b((hm) (Object) ((w) this).field_cb, false);
    }

    final void b(int param0, int param1, byte param2) {
        super.b(param0, param1, (byte) 109);
        dl.field_b.c(((w) this).field_db, param1 + (((w) this).field_g >> -135666879), 103 + param0, 16777215, -1);
        if (param2 >= 80) {
          if (((w) this).field_Z != null) {
            em.e(param1 - -20, -7 + (120 + param0), 260, 8421504);
            int discarded$2 = dl.field_b.a(((w) this).field_Z, 20 + param1, 8 + (param0 + 120), 260, 100, 16777215, -1, 1, 0, dl.field_b.field_r);
            return;
          } else {
            return;
          }
        } else {
          ((w) this).field_eb = true;
          if (((w) this).field_Z == null) {
            return;
          } else {
            em.e(param1 - -20, -7 + (120 + param0), 260, 8421504);
            int discarded$3 = dl.field_b.a(((w) this).field_Z, 20 + param1, 8 + (param0 + 120), 260, 100, 16777215, -1, 1, 0, dl.field_b.field_r);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_fb = "Unfortunately we are unable to create an account for you at this time.";
        field_bb = new int[]{20, 28};
    }
}
