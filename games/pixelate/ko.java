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

    public static void n() {
        field_ib = null;
        field_eb = null;
        field_jb = null;
    }

    ko(kn param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            ((ko) this).field_gb = param1;
            if (null != ((ko) this).field_gb) {
                var3_int = ba.field_d.a(((ko) this).field_gb, 260, ba.field_d.field_w);
                ((ko) this).a(150 + var3_int, (byte) -110, 300);
            }
            ((ko) this).field_bb = new oc(13, 50, 274, 30, 15, 2113632, 4210752);
            ((ko) this).field_db = false;
            ((ko) this).field_bb.field_Y = true;
            ((ko) this).field_ab = false;
            ((ko) this).b((ng) (Object) ((ko) this).field_bb, 80);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ko.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(boolean param0, boolean param1) {
        dm.a(true, param0, 0);
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
          ba.field_d.b(((ko) this).field_kb, param0 - -(((ko) this).field_E >> 1), param1 + 103, 16777215, -1);
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
          ba.field_d.b(((ko) this).field_kb, param0 - -(((ko) this).field_E >> 1), param1 + 103, 16777215, -1);
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
        RuntimeException runtimeException = null;
        int stackIn_3_0 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param3) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              if (stackIn_3_0 != (((ko) this).field_ab ? 1 : 0)) {
                break L2;
              } else {
                L3: {
                  stackOut_4_0 = this;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (!param3) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L3;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L3;
                  }
                }
                ((ko) this).field_ab = stackIn_7_1 != 0;
                if (((ko) this).field_ab) {
                  ((ko) this).field_bb.a((byte) 98, 8405024, 4210752);
                  ((ko) this).field_bb.field_Y = true;
                  break L2;
                } else {
                  ((ko) this).field_bb.a((byte) 92, 2113632, 4210752);
                  if (!((ko) this).field_db) {
                    break L2;
                  } else {
                    ((ko) this).field_bb.field_Y = false;
                    break L2;
                  }
                }
              }
            }
            if (param2 == 7595) {
              ((ko) this).field_kb = param0;
              ((ko) this).field_bb.field_Q = (int)(param1 / 100.0f * 65536.0f);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) runtimeException;
            stackOut_15_1 = new StringBuilder().append("ko.P(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void a(boolean param0, String param1, int param2) {
        try {
            dk.field_c = true;
            ke.field_d = param0 ? true : false;
            if (param2 != -26027) {
                Object var4 = null;
                ko.a(true, (String) null, -84);
            }
            to.field_r = new vk(wa.field_c, ba.field_d, param1, to.field_s, ke.field_d);
            wa.field_c.b(param2 ^ 32140, (ng) (Object) to.field_r);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ko.Q(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
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
