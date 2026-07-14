/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends pn {
    private String field_W;
    static boolean field_T;
    private String field_X;
    static String field_bb;
    static String field_Z;
    private boolean field_U;
    private boolean field_ab;
    private hb field_V;
    static ZombieDawn field_Y;

    final void a(int param0, int param1, byte param2) {
        if (param2 <= -111) {
          super.a(param0, param1, (byte) -121);
          rk.field_b.a(((sa) this).field_W, param0 - -(((sa) this).field_i >> 1998798337), 103 + param1, 16777215, -1);
          if (((sa) this).field_X != null) {
            bi.b(param0 + 20, -7 + (param1 - -120), 260, 8421504);
            int discarded$2 = rk.field_b.a(((sa) this).field_X, 20 + param0, 8 + (120 + param1), 260, 100, 16777215, -1, 1, 0, rk.field_b.field_I);
            return;
          } else {
            return;
          }
        } else {
          ((sa) this).m(-92);
          super.a(param0, param1, (byte) -121);
          rk.field_b.a(((sa) this).field_W, param0 - -(((sa) this).field_i >> 1998798337), 103 + param1, 16777215, -1);
          if (((sa) this).field_X == null) {
            return;
          } else {
            bi.b(param0 + 20, -7 + (param1 - -120), 260, 8421504);
            int discarded$3 = rk.field_b.a(((sa) this).field_X, 20 + param0, 8 + (120 + param1), 260, 100, 16777215, -1, 1, 0, rk.field_b.field_I);
            return;
          }
        }
    }

    final static int a(CharSequence param0, byte param1, int param2) {
        int var3 = 61 % ((param1 - 51) / 40);
        return tf.a(true, 5, param0, param2);
    }

    final void a(boolean param0, float param1, byte param2, String param3) {
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        boolean stackIn_16_0 = false;
        boolean stackIn_17_0 = false;
        boolean stackIn_18_0 = false;
        int stackIn_18_1 = 0;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        boolean stackOut_15_0 = false;
        boolean stackOut_17_0 = false;
        int stackOut_17_1 = 0;
        boolean stackOut_16_0 = false;
        int stackOut_16_1 = 0;
        Object stackOut_20_0 = null;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        boolean stackOut_1_0 = false;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        if (param2 <= -60) {
          L0: {
            stackOut_15_0 = param0;
            stackIn_17_0 = stackOut_15_0;
            stackIn_16_0 = stackOut_15_0;
            if (((sa) this).field_ab) {
              stackOut_17_0 = stackIn_17_0;
              stackOut_17_1 = 0;
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              break L0;
            } else {
              stackOut_16_0 = stackIn_16_0;
              stackOut_16_1 = 1;
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              break L0;
            }
          }
          if ((stackIn_18_0 ? 1 : 0) == stackIn_18_1) {
            L1: {
              stackOut_20_0 = this;
              stackIn_22_0 = stackOut_20_0;
              stackIn_21_0 = stackOut_20_0;
              if (!param0) {
                stackOut_22_0 = this;
                stackOut_22_1 = 0;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                break L1;
              } else {
                stackOut_21_0 = this;
                stackOut_21_1 = 1;
                stackIn_23_0 = stackOut_21_0;
                stackIn_23_1 = stackOut_21_1;
                break L1;
              }
            }
            ((sa) this).field_ab = stackIn_23_1 != 0;
            if (!((sa) this).field_ab) {
              ((sa) this).field_V.c(-51, 4210752, 2113632);
              if (!((sa) this).field_U) {
                ((sa) this).field_V.field_C = (int)(param1 / 100.0f * 65536.0f);
                ((sa) this).field_W = param3;
                return;
              } else {
                ((sa) this).field_V.field_F = false;
                ((sa) this).field_V.field_C = (int)(param1 / 100.0f * 65536.0f);
                ((sa) this).field_W = param3;
                return;
              }
            } else {
              ((sa) this).field_V.c(-16, 4210752, 8405024);
              ((sa) this).field_V.field_F = true;
              ((sa) this).field_V.field_C = (int)(param1 / 100.0f * 65536.0f);
              ((sa) this).field_W = param3;
              return;
            }
          } else {
            ((sa) this).field_V.field_C = (int)(param1 / 100.0f * 65536.0f);
            ((sa) this).field_W = param3;
            return;
          }
        } else {
          L2: {
            field_Y = null;
            stackOut_1_0 = param0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (((sa) this).field_ab) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L2;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L2;
            }
          }
          if ((stackIn_4_0 ? 1 : 0) == stackIn_4_1) {
            L3: {
              stackOut_6_0 = this;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (!param0) {
                stackOut_8_0 = this;
                stackOut_8_1 = 0;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                break L3;
              } else {
                stackOut_7_0 = this;
                stackOut_7_1 = 1;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                break L3;
              }
            }
            ((sa) this).field_ab = stackIn_9_1 != 0;
            if (!((sa) this).field_ab) {
              ((sa) this).field_V.c(-51, 4210752, 2113632);
              if (!((sa) this).field_U) {
                ((sa) this).field_V.field_C = (int)(param1 / 100.0f * 65536.0f);
                ((sa) this).field_W = param3;
                return;
              } else {
                ((sa) this).field_V.field_F = false;
                ((sa) this).field_V.field_C = (int)(param1 / 100.0f * 65536.0f);
                ((sa) this).field_W = param3;
                return;
              }
            } else {
              ((sa) this).field_V.c(-16, 4210752, 8405024);
              ((sa) this).field_V.field_F = true;
              ((sa) this).field_V.field_C = (int)(param1 / 100.0f * 65536.0f);
              ((sa) this).field_W = param3;
              return;
            }
          } else {
            ((sa) this).field_V.field_C = (int)(param1 / 100.0f * 65536.0f);
            ((sa) this).field_W = param3;
            return;
          }
        }
    }

    sa(dn param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((sa) this).field_X = param1;
        if (((sa) this).field_X != null) {
            var3 = rk.field_b.b(((sa) this).field_X, 260, rk.field_b.field_I);
            ((sa) this).a((byte) 94, var3 + 150, 300);
        }
        ((sa) this).field_V = new hb(13, 50, 274, 30, 15, 2113632, 4210752);
        ((sa) this).field_V.field_F = true;
        ((sa) this).field_U = false;
        ((sa) this).field_ab = false;
        ((sa) this).a((ga) (Object) ((sa) this).field_V, 10);
    }

    public static void g(byte param0) {
        field_bb = null;
        field_Y = null;
        if (param0 != 88) {
            sa.g((byte) 102);
            field_Z = null;
            return;
        }
        field_Z = null;
    }

    final void m(int param0) {
        ((sa) this).field_U = true;
        if (param0 != -31361) {
            field_T = false;
            ((sa) this).field_V.field_F = false;
            return;
        }
        ((sa) this).field_V.field_F = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = false;
        field_Z = "Please enter your age in years";
        field_bb = "Zombies across: ";
    }
}
