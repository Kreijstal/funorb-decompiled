/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    static sb field_b;
    static boolean field_c;
    static int field_e;
    static ai field_d;
    static hl field_a;
    static re field_f;

    public static void b(int param0) {
        field_d = null;
        field_a = null;
        if (param0 >= -32) {
          m.a((byte) -98, true, -18, -57);
          field_b = null;
          field_f = null;
          return;
        } else {
          field_b = null;
          field_f = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7) {
        int var9 = 0;
        var9 = StarCannon.field_A;
        if (param6 >= 16) {
          if (param0 > param2) {
            if (param0 >= param5) {
              if (param5 > param2) {
                fl.a(param0, param1, param3, param7, param5, param4, ki.field_a, (byte) -43, param2);
                return;
              } else {
                fl.a(param0, param4, param3, param7, param2, param1, ki.field_a, (byte) -43, param5);
                return;
              }
            } else {
              fl.a(param5, param7, param3, param1, param0, param4, ki.field_a, (byte) -43, param2);
              return;
            }
          } else {
            if (param2 >= param5) {
              if (param5 > param0) {
                fl.a(param2, param1, param3, param4, param5, param7, ki.field_a, (byte) -43, param0);
                return;
              } else {
                fl.a(param2, param7, param3, param4, param0, param1, ki.field_a, (byte) -43, param5);
                return;
              }
            } else {
              fl.a(param5, param4, param3, param1, param2, param7, ki.field_a, (byte) -43, param0);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static boolean a(int param0) {
        boolean discarded$8 = false;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= 0) {
          L0: {
            discarded$8 = m.a(-56);
            if (qb.field_h <= 250) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (qb.field_h <= 250) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(byte param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        if (param0 == 112) {
          bg.field_c.e(param2, param3);
          if (param1) {
            L0: {
              var4 = fk.field_a % bg.field_c.field_u * 2;
              if (var4 >= bg.field_c.field_u) {
                var4 = -var4 + (bg.field_c.field_u + bg.field_c.field_u);
                break L0;
              } else {
                break L0;
              }
            }
            if (var4 < 10) {
              var4 = 10;
              sc.a(bg.field_c, param0 ^ 14352, 80, param2, 30, var4, 0, param3, 0);
              return;
            } else {
              L1: {
                if (-40 + bg.field_c.field_u >= var4) {
                  break L1;
                } else {
                  var4 = bg.field_c.field_u - 40;
                  break L1;
                }
              }
              sc.a(bg.field_c, param0 ^ 14352, 80, param2, 30, var4, 0, param3, 0);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        field_c = false;
        field_e = 20;
    }
}
