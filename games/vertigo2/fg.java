/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends sp {
    private we field_W;
    static nj field_eb;
    private String field_fb;
    private boolean field_ab;
    private String field_bb;
    static String field_cb;
    private boolean field_Z;
    static String field_X;
    static int field_Y;
    static String field_db;

    public static void m(int param0) {
        field_db = null;
        field_cb = null;
        field_eb = null;
        if (param0 != -15691) {
            field_eb = null;
            field_X = null;
            return;
        }
        field_X = null;
    }

    final void c(boolean param0) {
        ((fg) this).field_W.field_F = false;
        ((fg) this).field_ab = param0 ? true : false;
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 > -92) {
          return;
        } else {
          L0: {
            super.a((byte) -108, param1, param2);
            sg.field_a.c(((fg) this).field_bb, (((fg) this).field_n >> 812366273) + param1, 103 + param2, 16777215, -1);
            if (null != ((fg) this).field_fb) {
              bi.b(param1 - -20, param2 + 120 + -7, 260, 8421504);
              int discarded$1 = sg.field_a.a(((fg) this).field_fb, 20 + param1, 8 + (120 + param2), 260, 100, 16777215, -1, 1, 0, sg.field_a.field_z);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final static String a(r param0, String param1, String param2, int param3) {
        if (!param0.b(0)) {
          return param2;
        } else {
          if (param3 != 274) {
            return null;
          } else {
            return param1 + " - " + param0.d(-1) + "%";
          }
        }
    }

    fg(sd param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((fg) this).field_fb = param1;
        if (null != ((fg) this).field_fb) {
            var3 = sg.field_a.a(((fg) this).field_fb, 260, sg.field_a.field_z);
            ((fg) this).b(-1535749535, 300, var3 + 150);
        }
        ((fg) this).field_W = new we(13, 50, 274, 30, 15, 2113632, 4210752);
        ((fg) this).field_Z = false;
        ((fg) this).field_ab = false;
        ((fg) this).field_W.field_F = true;
        ((fg) this).c((byte) -12, (iq) (Object) ((fg) this).field_W);
    }

    final void a(float param0, int param1, boolean param2, String param3) {
        Object var6 = null;
        int stackIn_4_0 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_19_0 = 0;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        Object stackOut_21_0 = null;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        if (param1 == 4210752) {
          L0: {
            if (((fg) this).field_Z) {
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            } else {
              stackOut_17_0 = 1;
              stackIn_19_0 = stackOut_17_0;
              break L0;
            }
          }
          if (stackIn_19_0 == (param2 ? 1 : 0)) {
            L1: {
              stackOut_21_0 = this;
              stackIn_23_0 = stackOut_21_0;
              stackIn_22_0 = stackOut_21_0;
              if (!param2) {
                stackOut_23_0 = this;
                stackOut_23_1 = 0;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                break L1;
              } else {
                stackOut_22_0 = this;
                stackOut_22_1 = 1;
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                break L1;
              }
            }
            ((fg) this).field_Z = stackIn_24_1 != 0;
            if (!((fg) this).field_Z) {
              ((fg) this).field_W.b(2113632, param1 ^ -4210721, 4210752);
              if (!((fg) this).field_ab) {
                ((fg) this).field_W.field_G = (int)(param0 / 100.0f * 65536.0f);
                ((fg) this).field_bb = param3;
                return;
              } else {
                ((fg) this).field_W.field_F = false;
                ((fg) this).field_W.field_G = (int)(param0 / 100.0f * 65536.0f);
                ((fg) this).field_bb = param3;
                return;
              }
            } else {
              ((fg) this).field_W.b(8405024, -55, 4210752);
              ((fg) this).field_W.field_F = true;
              ((fg) this).field_W.field_G = (int)(param0 / 100.0f * 65536.0f);
              ((fg) this).field_bb = param3;
              return;
            }
          } else {
            ((fg) this).field_W.field_G = (int)(param0 / 100.0f * 65536.0f);
            ((fg) this).field_bb = param3;
            return;
          }
        } else {
          L2: {
            var6 = null;
            ((fg) this).a(-1.3080865144729614f, -13, false, (String) null);
            if (((fg) this).field_Z) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L2;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L2;
            }
          }
          if (stackIn_4_0 == (param2 ? 1 : 0)) {
            L3: {
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param2) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            ((fg) this).field_Z = stackIn_10_1 != 0;
            if (!((fg) this).field_Z) {
              ((fg) this).field_W.b(2113632, param1 ^ -4210721, 4210752);
              if (!((fg) this).field_ab) {
                ((fg) this).field_W.field_G = (int)(param0 / 100.0f * 65536.0f);
                ((fg) this).field_bb = param3;
                return;
              } else {
                ((fg) this).field_W.field_F = false;
                ((fg) this).field_W.field_G = (int)(param0 / 100.0f * 65536.0f);
                ((fg) this).field_bb = param3;
                return;
              }
            } else {
              ((fg) this).field_W.b(8405024, -55, 4210752);
              ((fg) this).field_W.field_F = true;
              ((fg) this).field_W.field_G = (int)(param0 / 100.0f * 65536.0f);
              ((fg) this).field_bb = param3;
              return;
            }
          } else {
            ((fg) this).field_W.field_G = (int)(param0 / 100.0f * 65536.0f);
            ((fg) this).field_bb = param3;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_cb = "You have withdrawn your request to join.";
        field_X = "Remove <%0> from friend list";
        field_Y = 20;
        field_eb = new nj();
        field_db = "Game full";
    }
}
