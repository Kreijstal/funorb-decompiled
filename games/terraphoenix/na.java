/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends ei {
    static String[] field_db;
    static int field_Y;
    private String field_bb;
    private String field_eb;
    private hm field_cb;
    private boolean field_W;
    static byte[][] field_Z;
    private boolean field_ab;
    static String field_X;

    final static void a(boolean param0, String param1, int param2, String param3) {
        nh.field_D = param3;
        ol.field_Hb = param1;
        int var4 = -26 / ((32 - param2) / 55);
        ta.a(fh.field_x, param0, 10);
    }

    final void a(byte param0, boolean param1, String param2, float param3) {
        Object var6 = null;
        boolean stackIn_1_0 = false;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_3_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        boolean stackOut_0_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        boolean stackOut_1_0 = false;
        int stackOut_1_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        L0: {
          stackOut_0_0 = ((na) this).field_W;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param1) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        if ((stackIn_3_0 ? 1 : 0) == stackIn_3_1) {
          L1: {
            stackOut_8_0 = this;
            stackIn_10_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (!param1) {
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
          ((na) this).field_W = stackIn_11_1 != 0;
          if (((na) this).field_W) {
            ((na) this).field_cb.a(4210752, -7062047, 8405024);
            ((na) this).field_cb.field_P = true;
            if (param0 != 60) {
              var6 = null;
              na.a(true, (String) null, 41, (String) null);
              ((na) this).field_cb.field_M = (int)(65536.0f * (param3 / 100.0f));
              ((na) this).field_eb = param2;
              return;
            } else {
              ((na) this).field_cb.field_M = (int)(65536.0f * (param3 / 100.0f));
              ((na) this).field_eb = param2;
              return;
            }
          } else {
            ((na) this).field_cb.a(4210752, -7062047, 2113632);
            if (!((na) this).field_ab) {
              if (param0 != 60) {
                var6 = null;
                na.a(true, (String) null, 41, (String) null);
                ((na) this).field_cb.field_M = (int)(65536.0f * (param3 / 100.0f));
                ((na) this).field_eb = param2;
                return;
              } else {
                ((na) this).field_cb.field_M = (int)(65536.0f * (param3 / 100.0f));
                ((na) this).field_eb = param2;
                return;
              }
            } else {
              ((na) this).field_cb.field_P = false;
              if (param0 == 60) {
                ((na) this).field_cb.field_M = (int)(65536.0f * (param3 / 100.0f));
                ((na) this).field_eb = param2;
                return;
              } else {
                var6 = null;
                na.a(true, (String) null, 41, (String) null);
                ((na) this).field_cb.field_M = (int)(65536.0f * (param3 / 100.0f));
                ((na) this).field_eb = param2;
                return;
              }
            }
          }
        } else {
          if (param0 == 60) {
            ((na) this).field_cb.field_M = (int)(65536.0f * (param3 / 100.0f));
            ((na) this).field_eb = param2;
            return;
          } else {
            var6 = null;
            na.a(true, (String) null, 41, (String) null);
            ((na) this).field_cb.field_M = (int)(65536.0f * (param3 / 100.0f));
            ((na) this).field_eb = param2;
            return;
          }
        }
    }

    final void a(int param0, int param1, byte param2) {
        super.a(param0, param1, param2);
        be.field_x.c(((na) this).field_eb, param0 + (((na) this).field_p >> -562649663), param1 + 103, 16777215, -1);
        if (null != ((na) this).field_bb) {
            l.d(20 + param0, -7 + (120 + param1), 260, 8421504);
            int discarded$0 = be.field_x.a(((na) this).field_bb, 20 + param0, param1 - -128, 260, 100, 16777215, -1, 1, 0, be.field_x.field_s);
        }
    }

    final void h(byte param0) {
        if (param0 > -73) {
          ((na) this).h((byte) 5);
          ((na) this).field_cb.field_P = false;
          ((na) this).field_ab = true;
          return;
        } else {
          ((na) this).field_cb.field_P = false;
          ((na) this).field_ab = true;
          return;
        }
    }

    na(d param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((na) this).field_bb = param1;
        if (((na) this).field_bb != null) {
            var3 = be.field_x.a(((na) this).field_bb, 260, be.field_x.field_s);
            ((na) this).b(98, 150 + var3, 300);
        }
        ((na) this).field_cb = new hm(13, 50, 274, 30, 15, 2113632, 4210752);
        ((na) this).field_ab = false;
        ((na) this).field_W = false;
        ((na) this).field_cb.field_P = true;
        ((na) this).b((byte) 95, (gl) (Object) ((na) this).field_cb);
    }

    public static void d(boolean param0) {
        field_Z = null;
        if (!param0) {
            field_Y = -73;
            field_db = null;
            field_X = null;
            return;
        }
        field_db = null;
        field_X = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Z = new byte[250][];
        field_Y = 5;
        field_X = "You have <%0> unread messages!";
        field_db = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
