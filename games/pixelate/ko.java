/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko extends ka {
    static String field_ib;
    static int field_hb;
    private String field_gb;
    static int field_cb;
    private boolean field_db;
    private String field_kb;
    private oc field_bb;
    private boolean field_ab;
    static int field_fb;
    static ak field_eb;
    static String field_jb;

    public static void n(int param0) {
        field_ib = null;
        field_eb = null;
        field_jb = null;
        if (param0 > -98) {
            Object var2 = null;
            ko.a(false, (String) null, 30);
        }
    }

    ko(kn param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((ko) this).field_gb = param1;
        if (null != ((ko) this).field_gb) {
            var3 = ba.field_d.a(((ko) this).field_gb, 260, ba.field_d.field_w);
            ((ko) this).a(150 + var3, (byte) -110, 300);
        }
        ((ko) this).field_bb = new oc(13, 50, 274, 30, 15, 2113632, 4210752);
        ((ko) this).field_db = false;
        ((ko) this).field_bb.field_Y = true;
        ((ko) this).field_ab = false;
        ((ko) this).b((ng) (Object) ((ko) this).field_bb, 80);
    }

    final static void a(boolean param0, boolean param1) {
        dm.a(param1, param0, 0);
    }

    final void o(int param0) {
        ((ko) this).field_db = true;
        ((ko) this).field_bb.field_Y = false;
        if (param0 != 30) {
            Object var3 = null;
            ko.a(true, (String) null, -92);
        }
    }

    final void a(int param0, int param1, boolean param2) {
        if (param2) {
          super.a(param0, param1, param2);
          ba.field_d.b(((ko) this).field_kb, param0 - -(((ko) this).field_E >> -421102143), param1 + 103, 16777215, -1);
          if (((ko) this).field_gb != null) {
            t.b(param0 + 20, 120 + param1 + -7, 260, 8421504);
            int discarded$2 = ba.field_d.a(((ko) this).field_gb, 20 + param0, 128 + param1, 260, 100, 16777215, -1, 1, 0, ba.field_d.field_w);
            return;
          } else {
            return;
          }
        } else {
          field_ib = null;
          super.a(param0, param1, param2);
          ba.field_d.b(((ko) this).field_kb, param0 - -(((ko) this).field_E >> -421102143), param1 + 103, 16777215, -1);
          if (((ko) this).field_gb == null) {
            return;
          } else {
            t.b(param0 + 20, 120 + param1 + -7, 260, 8421504);
            int discarded$3 = ba.field_d.a(((ko) this).field_gb, 20 + param0, 128 + param1, 260, 100, 16777215, -1, 1, 0, ba.field_d.field_w);
            return;
          }
        }
    }

    final void a(String param0, float param1, int param2, boolean param3) {
        int stackIn_3_0 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        L0: {
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
        if (stackIn_3_0 == (((ko) this).field_ab ? 1 : 0)) {
          L1: {
            stackOut_8_0 = this;
            stackIn_10_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (!param3) {
              stackOut_10_0 = this;
              stackOut_10_1 = 0;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L1;
            } else {
              stackOut_9_0 = this;
              stackOut_9_1 = 1;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              break L1;
            }
          }
          ((ko) this).field_ab = stackIn_11_1 != 0;
          if (((ko) this).field_ab) {
            ((ko) this).field_bb.a((byte) 98, 8405024, 4210752);
            ((ko) this).field_bb.field_Y = true;
            if (param2 != 7595) {
              return;
            } else {
              ((ko) this).field_kb = param0;
              ((ko) this).field_bb.field_Q = (int)(param1 / 100.0f * 65536.0f);
              return;
            }
          } else {
            ((ko) this).field_bb.a((byte) 92, 2113632, 4210752);
            if (((ko) this).field_db) {
              ((ko) this).field_bb.field_Y = false;
              if (param2 != 7595) {
                return;
              } else {
                ((ko) this).field_kb = param0;
                ((ko) this).field_bb.field_Q = (int)(param1 / 100.0f * 65536.0f);
                return;
              }
            } else {
              if (param2 != 7595) {
                return;
              } else {
                ((ko) this).field_kb = param0;
                ((ko) this).field_bb.field_Q = (int)(param1 / 100.0f * 65536.0f);
                return;
              }
            }
          }
        } else {
          if (param2 != 7595) {
            return;
          } else {
            ((ko) this).field_kb = param0;
            ((ko) this).field_bb.field_Q = (int)(param1 / 100.0f * 65536.0f);
            return;
          }
        }
    }

    final static void a(boolean param0, String param1, int param2) {
        Object var4 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          dk.field_c = true;
          if (!param0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        ke.field_d = stackIn_3_0 != 0;
        if (param2 != -26027) {
          var4 = null;
          ko.a(true, (String) null, -84);
          to.field_r = new vk(wa.field_c, ba.field_d, param1, to.field_s, ke.field_d);
          wa.field_c.b(param2 ^ 32140, (ng) (Object) to.field_r);
          return;
        } else {
          to.field_r = new vk(wa.field_c, ba.field_d, param1, to.field_s, ke.field_d);
          wa.field_c.b(param2 ^ 32140, (ng) (Object) to.field_r);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ib = "You have entered another game.";
        field_jb = "Lobby";
    }
}
