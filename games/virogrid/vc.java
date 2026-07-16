/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc extends dc {
    private dg field_gb;
    static int[] field_eb;
    static String field_db;
    static int field_bb;
    private String field_lb;
    static mg[][] field_fb;
    static int[] field_jb;
    private String field_kb;
    private boolean field_ib;
    static String field_hb;
    private boolean field_cb;

    final void b(int param0, int param1, int param2) {
        super.b(param0, 22, param2);
        on.field_b.c(((vc) this).field_lb, param2 + (((vc) this).field_g >> 396120801), 103 + param0, 16777215, -1);
        if (param1 >= 8) {
          if (((vc) this).field_kb != null) {
            df.b(20 + param2, 113 + param0, 260, 8421504);
            int discarded$2 = on.field_b.a(((vc) this).field_kb, param2 - -20, param0 + 120 - -8, 260, 100, 16777215, -1, 1, 0, on.field_b.field_H);
            return;
          } else {
            return;
          }
        } else {
          vc.g((byte) 3);
          if (((vc) this).field_kb == null) {
            return;
          } else {
            df.b(20 + param2, 113 + param0, 260, 8421504);
            int discarded$3 = on.field_b.a(((vc) this).field_kb, param2 - -20, param0 + 120 - -8, 260, 100, 16777215, -1, 1, 0, on.field_b.field_H);
            return;
          }
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        Object var4 = null;
        mi.a((String) null, param1, param0, true);
        if (param2 != -16113) {
            vc.a(true, true, -42);
        }
    }

    public static void g(byte param0) {
        field_db = null;
        field_eb = null;
        field_hb = null;
        if (param0 < 57) {
            return;
        }
        field_fb = null;
        field_jb = null;
    }

    final void a(float param0, boolean param1, boolean param2, String param3) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        if (((vc) this).field_cb != param2) {
          L0: {
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param2) {
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
          ((vc) this).field_cb = stackIn_8_1 != 0;
          if (!((vc) this).field_cb) {
            ((vc) this).field_gb.d(4210752, 2113632, 123);
            if (!((vc) this).field_ib) {
              ((vc) this).field_lb = param3;
              ((vc) this).field_gb.field_C = (int)(param0 / 100.0f * 65536.0f);
              if (param1) {
                vc.g((byte) 54);
                return;
              } else {
                return;
              }
            } else {
              ((vc) this).field_gb.field_z = false;
              ((vc) this).field_lb = param3;
              ((vc) this).field_gb.field_C = (int)(param0 / 100.0f * 65536.0f);
              if (param1) {
                vc.g((byte) 54);
                return;
              } else {
                return;
              }
            }
          } else {
            ((vc) this).field_gb.d(4210752, 8405024, 125);
            ((vc) this).field_gb.field_z = true;
            ((vc) this).field_lb = param3;
            ((vc) this).field_gb.field_C = (int)(param0 / 100.0f * 65536.0f);
            if (!param1) {
              return;
            } else {
              vc.g((byte) 54);
              return;
            }
          }
        } else {
          ((vc) this).field_lb = param3;
          ((vc) this).field_gb.field_C = (int)(param0 / 100.0f * 65536.0f);
          if (!param1) {
            return;
          } else {
            vc.g((byte) 54);
            return;
          }
        }
    }

    vc(je param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((vc) this).field_kb = param1;
        if (null != ((vc) this).field_kb) {
            var3 = on.field_b.a(((vc) this).field_kb, 260, on.field_b.field_H);
            ((vc) this).c(150 - -var3, 120, 300);
        }
        ((vc) this).field_gb = new dg(13, 50, 274, 30, 15, 2113632, 4210752);
        ((vc) this).field_gb.field_z = true;
        ((vc) this).field_cb = false;
        ((vc) this).field_ib = false;
        ((vc) this).a((fi) (Object) ((vc) this).field_gb, (byte) -78);
    }

    final void k(int param0) {
        ((vc) this).field_ib = true;
        ((vc) this).field_gb.field_z = false;
        int var2 = -44 / ((param0 - -54) / 59);
    }

    final static void h(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = (Object) (Object) pm.field_l;
        synchronized (var1) {
          L0: {
            L1: {
              j.field_e = hc.field_d;
              ng.field_Q = ng.field_Q + 1;
              nl.field_u = ka.field_i;
              hk.field_Jb = sm.field_a;
              if (param0 <= -30) {
                break L1;
              } else {
                field_eb = null;
                break L1;
              }
            }
            w.field_J = wg.field_a;
            wg.field_a = false;
            oi.field_g = we.field_g;
            ii.field_b = ei.field_f;
            a.field_y = hk.field_Mb;
            we.field_g = 0;
            break L0;
          }
        }
    }

    final static rm a(eh param0, String param1, String param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param0.a(-1, param2);
        var5 = param0.a(-60, var4, param1);
        if (param3 <= 23) {
          field_hb = null;
          return bd.a(var5, var4, -2071, param0);
        } else {
          return bd.a(var5, var4, -2071, param0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_eb = new int[]{1, 1, 1, 3, 2, 1, 1, 2, 5, 1};
        field_db = "You cannot move";
    }
}
