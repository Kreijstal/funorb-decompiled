/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd extends ae {
    static boolean field_T;
    int field_S;
    static hl field_Q;
    static int field_ab;
    int field_bb;
    int field_V;
    static int[] field_Y;
    int field_U;
    static oh field_X;
    static int[] field_W;
    static oh field_P;
    static kh[] field_cb;
    int field_R;
    int field_Z;

    final boolean a(na param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = TetraLink.field_J;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          var8 = -((qd) this).field_V + -param1 + (-((qd) this).field_t + param6);
          var9 = param5 + -param3 + -((qd) this).field_w - ((qd) this).field_Z;
          if (var9 * var9 + var8 * var8 < ((qd) this).field_bb * ((qd) this).field_bb) {
            var10 = Math.atan2((double)var9, (double)var8) - ik.field_b;
            if (var10 < 0.0) {
              var10 = var10 - 3.141592653589793 / (double)((qd) this).field_R;
              ((qd) this).field_S = (int)((double)((qd) this).field_R * var10 / 6.283185307179586);
              L0: while (true) {
                if (((qd) this).field_S >= ((qd) this).field_R) {
                  ((qd) this).field_S = ((qd) this).field_S - ((qd) this).field_R;
                  continue L0;
                } else {
                  L1: while (true) {
                    if ((((qd) this).field_S ^ -1) <= -1) {
                      return true;
                    } else {
                      ((qd) this).field_S = ((qd) this).field_S + ((qd) this).field_R;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              if (0.0 < var10) {
                var10 = var10 + 3.141592653589793 / (double)((qd) this).field_R;
                ((qd) this).field_S = (int)((double)((qd) this).field_R * var10 / 6.283185307179586);
                L2: while (true) {
                  if (((qd) this).field_S >= ((qd) this).field_R) {
                    ((qd) this).field_S = ((qd) this).field_S - ((qd) this).field_R;
                    continue L2;
                  } else {
                    L3: while (true) {
                      if ((((qd) this).field_S ^ -1) <= -1) {
                        return true;
                      } else {
                        ((qd) this).field_S = ((qd) this).field_S + ((qd) this).field_R;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                ((qd) this).field_S = (int)((double)((qd) this).field_R * var10 / 6.283185307179586);
                L4: while (true) {
                  if (((qd) this).field_S >= ((qd) this).field_R) {
                    ((qd) this).field_S = ((qd) this).field_S - ((qd) this).field_R;
                    continue L4;
                  } else {
                    L5: while (true) {
                      if ((((qd) this).field_S ^ -1) <= -1) {
                        return true;
                      } else {
                        ((qd) this).field_S = ((qd) this).field_S + ((qd) this).field_R;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static el c(int param0, int param1) {
        gb stackIn_4_0 = null;
        gb stackIn_8_0 = null;
        Object stackOut_7_0 = null;
        gb stackOut_6_0 = null;
        Object stackOut_3_0 = null;
        gb stackOut_2_0 = null;
        if (param0 < 107) {
          L0: {
            field_P = null;
            if (null == db.field_e) {
              stackOut_7_0 = null;
              stackIn_8_0 = (gb) (Object) stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = db.field_e.a((long)param1, 1);
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return (el) (Object) stackIn_8_0;
        } else {
          L1: {
            if (null == db.field_e) {
              stackOut_3_0 = null;
              stackIn_4_0 = (gb) (Object) stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = db.field_e.a((long)param1, 1);
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return (el) (Object) stackIn_4_0;
        }
    }

    public static void d(boolean param0) {
        if (!param0) {
            return;
        }
        field_cb = null;
        field_Y = null;
        field_W = null;
        field_P = null;
        field_Q = null;
        field_X = null;
    }

    private qd() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = new int[4];
        field_T = false;
    }
}
