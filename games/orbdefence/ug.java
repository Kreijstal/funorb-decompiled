/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends hi {
    static tl field_p;
    static String field_o;
    private vi field_n;
    static int field_q;
    static String field_r;

    final static boolean a(byte param0, be param1) {
        int var2 = -88 / ((2 - param0) / 56);
        return param1.b((byte) -72);
    }

    final String a(int param0, String param1) {
        ga var3 = null;
        if (((ug) this).field_n instanceof ib) {
          var3 = ((ib) (Object) ((ug) this).field_n).a((byte) -115);
          if (var3 == null) {
            if (param1.equals((Object) (Object) ((ug) this).field_n.field_l)) {
              if (param0 == -11300) {
                return null;
              } else {
                return null;
              }
            } else {
              return cc.field_i;
            }
          } else {
            if (var3.d(param0 + 3453) == nc.field_bb) {
              if (param1.equals((Object) (Object) ((ug) this).field_n.field_l)) {
                return var3.a(123);
              } else {
                return cc.field_i;
              }
            } else {
              return var3.a(123);
            }
          }
        } else {
          if (param1.equals((Object) (Object) ((ug) this).field_n.field_l)) {
            if (param0 == -11300) {
              return null;
            } else {
              return null;
            }
          } else {
            return cc.field_i;
          }
        }
    }

    public static void b(byte param0) {
        field_o = null;
        int var1 = 49 / ((param0 - 7) / 43);
        field_r = null;
        field_p = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        ul.d(param2, param1, param4, param3, 0);
        param1++;
        param3 -= 2;
        param2++;
        param4 -= 2;
        ul.a(param2, param1, param4, param3, 11184810, 4605510);
        param2 += 2;
        param3 -= 4;
        param1 += 2;
        param4 -= 4;
        ul.c(param2, param1, param4, param3, 2500134, 5921370);
        param3 -= 2;
        param1++;
        param4 -= 2;
        param2++;
        if (param0 < 32) {
          return;
        } else {
          ul.d(param2, param1, param4, param3, 0);
          param1++;
          param2++;
          param4 -= 2;
          param3 -= 2;
          ul.a(param2, param1, param4, param3, 394758, 1710618);
          gk.field_a.e(param2, param1, param4, param3, 64);
          return;
        }
    }

    final qd a(String param0, byte param1) {
        ga var3 = null;
        qd stackIn_5_0 = null;
        qd stackIn_15_0 = null;
        qd stackIn_22_0 = null;
        qd stackOut_21_0 = null;
        qd stackOut_20_0 = null;
        qd stackOut_14_0 = null;
        qd stackOut_13_0 = null;
        qd stackOut_4_0 = null;
        qd stackOut_3_0 = null;
        if (((ug) this).field_n instanceof ib) {
          var3 = ((ib) (Object) ((ug) this).field_n).a((byte) 22);
          if (var3 == null) {
            if (param1 != -99) {
              return null;
            } else {
              L0: {
                if (!param0.equals((Object) (Object) ((ug) this).field_n.field_l)) {
                  stackOut_21_0 = vh.field_h;
                  stackIn_22_0 = stackOut_21_0;
                  break L0;
                } else {
                  stackOut_20_0 = nc.field_bb;
                  stackIn_22_0 = stackOut_20_0;
                  break L0;
                }
              }
              return stackIn_22_0;
            }
          } else {
            if (var3.d(-7847) == nc.field_bb) {
              if (param1 != -99) {
                return null;
              } else {
                L1: {
                  if (!param0.equals((Object) (Object) ((ug) this).field_n.field_l)) {
                    stackOut_14_0 = vh.field_h;
                    stackIn_15_0 = stackOut_14_0;
                    break L1;
                  } else {
                    stackOut_13_0 = nc.field_bb;
                    stackIn_15_0 = stackOut_13_0;
                    break L1;
                  }
                }
                return stackIn_15_0;
              }
            } else {
              return vh.field_h;
            }
          }
        } else {
          if (param1 != -99) {
            return null;
          } else {
            L2: {
              if (!param0.equals((Object) (Object) ((ug) this).field_n.field_l)) {
                stackOut_4_0 = vh.field_h;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = nc.field_bb;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    ug(vi param0, vi param1) {
        super(param0);
        ((ug) this).field_n = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "MEGA SHOT";
        field_p = new tl();
    }
}
