/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch extends k {
    static String field_eb;
    static String field_db;
    private rm field_hb;
    private String field_fb;
    private boolean field_bb;
    private String field_ib;
    static gg field_gb;
    private boolean field_cb;

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1, param2);
        tk.field_a.b(((ch) this).field_ib, param2 + (((ch) this).field_y >> -2030977247), param1 - -103, 16777215, -1);
        if (null != ((ch) this).field_fb) {
            wb.a(20 + param2, 120 + param1 + -7, 260, 8421504);
            int discarded$0 = tk.field_a.a(((ch) this).field_fb, 20 + param2, 8 + (param1 - -120), 260, 100, 16777215, -1, 1, 0, tk.field_a.field_C);
        }
    }

    public static void m(int param0) {
        field_gb = null;
        field_db = null;
        if (param0 != 30) {
            field_db = null;
            field_eb = null;
            return;
        }
        field_eb = null;
    }

    ch(fm param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((ch) this).field_fb = param1;
        if (((ch) this).field_fb != null) {
            var3 = tk.field_a.b(((ch) this).field_fb, 260, tk.field_a.field_C);
            ((ch) this).a(300, (byte) 78, var3 + 150);
        }
        ((ch) this).field_hb = new rm(13, 50, 274, 30, 15, 2113632, 4210752);
        ((ch) this).field_bb = false;
        ((ch) this).field_cb = false;
        ((ch) this).field_hb.field_W = true;
        ((ch) this).b((mf) (Object) ((ch) this).field_hb, 95);
    }

    final static rk a(boolean param0, int[] param1, rk param2) {
        rk var3 = null;
        var3 = new rk(0, 0, 0);
        var3.field_p = param2.field_p;
        var3.field_m = param2.field_m;
        if (!param0) {
          field_db = null;
          var3.field_j = param2.field_j;
          var3.field_o = param1;
          var3.field_h = param2.field_h;
          var3.field_i = param2.field_i;
          var3.field_a = param2.field_a;
          var3.field_k = param2.field_k;
          return var3;
        } else {
          var3.field_j = param2.field_j;
          var3.field_o = param1;
          var3.field_h = param2.field_h;
          var3.field_i = param2.field_i;
          var3.field_a = param2.field_a;
          var3.field_k = param2.field_k;
          return var3;
        }
    }

    final void a(String param0, float param1, boolean param2, int param3) {
        Object var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        Object stackOut_11_0 = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        L0: {
          if (((ch) this).field_bb) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = stackIn_3_0;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (param2) {
            stackOut_5_0 = stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = stackIn_4_0;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        if (stackIn_6_0 != stackIn_6_1) {
          L2: {
            stackOut_11_0 = this;
            stackIn_13_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if (!param2) {
              stackOut_13_0 = this;
              stackOut_13_1 = 0;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              break L2;
            } else {
              stackOut_12_0 = this;
              stackOut_12_1 = 1;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              break L2;
            }
          }
          ((ch) this).field_bb = stackIn_14_1 != 0;
          if (!((ch) this).field_bb) {
            ((ch) this).field_hb.b(2113632, 15016, 4210752);
            if (!((ch) this).field_cb) {
              if (param3 > -124) {
                var6 = null;
                rk discarded$4 = ch.a(true, (int[]) null, (rk) null);
                ((ch) this).field_hb.field_L = (int)(param1 / 100.0f * 65536.0f);
                ((ch) this).field_ib = param0;
                return;
              } else {
                ((ch) this).field_hb.field_L = (int)(param1 / 100.0f * 65536.0f);
                ((ch) this).field_ib = param0;
                return;
              }
            } else {
              ((ch) this).field_hb.field_W = false;
              if (param3 > -124) {
                var6 = null;
                rk discarded$5 = ch.a(true, (int[]) null, (rk) null);
                ((ch) this).field_hb.field_L = (int)(param1 / 100.0f * 65536.0f);
                ((ch) this).field_ib = param0;
                return;
              } else {
                ((ch) this).field_hb.field_L = (int)(param1 / 100.0f * 65536.0f);
                ((ch) this).field_ib = param0;
                return;
              }
            }
          } else {
            ((ch) this).field_hb.b(8405024, 15016, 4210752);
            ((ch) this).field_hb.field_W = true;
            if (param3 <= -124) {
              ((ch) this).field_hb.field_L = (int)(param1 / 100.0f * 65536.0f);
              ((ch) this).field_ib = param0;
              return;
            } else {
              var6 = null;
              rk discarded$6 = ch.a(true, (int[]) null, (rk) null);
              ((ch) this).field_hb.field_L = (int)(param1 / 100.0f * 65536.0f);
              ((ch) this).field_ib = param0;
              return;
            }
          }
        } else {
          if (param3 <= -124) {
            ((ch) this).field_hb.field_L = (int)(param1 / 100.0f * 65536.0f);
            ((ch) this).field_ib = param0;
            return;
          } else {
            var6 = null;
            rk discarded$7 = ch.a(true, (int[]) null, (rk) null);
            ((ch) this).field_hb.field_L = (int)(param1 / 100.0f * 65536.0f);
            ((ch) this).field_ib = param0;
            return;
          }
        }
    }

    final static void k(int param0) {
        vk.field_d = null;
        if (param0 != 4210752) {
          field_eb = null;
          b.field_c = null;
          uh.field_r = null;
          be.field_a = null;
          a.field_c = null;
          wm.field_b = null;
          return;
        } else {
          b.field_c = null;
          uh.field_r = null;
          be.field_a = null;
          a.field_c = null;
          wm.field_b = null;
          return;
        }
    }

    final void l(int param0) {
        if (param0 != -30336) {
            return;
        }
        ((ch) this).field_hb.field_W = false;
        ((ch) this).field_cb = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_db = "Connecting to<br>friend server...";
        field_eb = "<%0> has entered a game.";
        field_gb = null;
    }
}
