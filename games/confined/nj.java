/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj extends rg {
    private wl field_P;
    int field_Q;
    int field_S;
    static ji field_T;
    private int field_R;

    final static jb a(boolean param0, boolean param1, byte param2) {
        bd var4 = null;
        bd var5 = null;
        bd var6 = null;
        jb var7 = null;
        jb var8 = null;
        jb stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        bd stackIn_1_2 = null;
        bd stackIn_1_3 = null;
        int stackIn_1_4 = 0;
        jb stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        bd stackIn_2_2 = null;
        bd stackIn_2_3 = null;
        int stackIn_2_4 = 0;
        jb stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        bd stackIn_3_2 = null;
        bd stackIn_3_3 = null;
        int stackIn_3_4 = 0;
        String stackIn_3_5 = null;
        jb stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        bd stackOut_0_2 = null;
        bd stackOut_0_3 = null;
        int stackOut_0_4 = 0;
        jb stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        bd stackOut_2_2 = null;
        bd stackOut_2_3 = null;
        int stackOut_2_4 = 0;
        String stackOut_2_5 = null;
        jb stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        bd stackOut_1_2 = null;
        bd stackOut_1_3 = null;
        int stackOut_1_4 = 0;
        String stackOut_1_5 = null;
        L0: {
          var7 = new jb(3);
          var8 = var7;
          var8.a((byte) -128, new bd(20, lh.field_a, (ok) (Object) pn.field_a));
          stackOut_0_0 = (jb) var8;
          stackOut_0_1 = -125;
          stackOut_0_2 = null;
          stackOut_0_3 = null;
          stackOut_0_4 = 14;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_2_4 = stackOut_0_4;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          stackIn_1_4 = stackOut_0_4;
          if (param1) {
            stackOut_2_0 = (jb) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = null;
            stackOut_2_3 = null;
            stackOut_2_4 = stackIn_2_4;
            stackOut_2_5 = qc.field_i;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            stackIn_3_5 = stackOut_2_5;
            break L0;
          } else {
            stackOut_1_0 = (jb) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = null;
            stackOut_1_3 = null;
            stackOut_1_4 = stackIn_1_4;
            stackOut_1_5 = fl.field_b;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            stackIn_3_5 = stackOut_1_5;
            break L0;
          }
        }
        L1: {
          new bd(stackIn_3_4, stackIn_3_5, (ok) (Object) pn.field_a);
          ((jb) (Object) stackIn_3_0).a((byte) stackIn_3_1, stackIn_3_2);
          var8.a((byte) -118, new bd(21, na.field_U, (ok) (Object) pn.field_a));
          var7.field_h[1].field_f = pn.field_a.c(var7.field_h[1].field_a) - -100;
          var4 = var7.field_h[0];
          var7.field_h[2].field_f = 150;
          var4.field_f = 150;
          var7.field_h[1].field_j = -(var7.field_h[1].field_f / 2) + 320;
          var7.field_h[0].field_j = 32;
          if (param2 == -119) {
            break L1;
          } else {
            jb discarded$1 = nj.a(false, false, (byte) 58);
            break L1;
          }
        }
        var7.field_h[2].field_j = -32 + -var7.field_h[2].field_f + 640;
        var5 = var7.field_h[0];
        var6 = var7.field_h[1];
        var7.field_h[2].field_b = 340;
        var6.field_b = 340;
        var8.field_b = 284;
        var8.field_k = 520;
        var8.field_c = 46;
        var5.field_b = 340;
        var8.field_s = 60;
        var8.a(param0, 26206, 1);
        return var8;
    }

    final boolean a(int param0, int param1, byte param2, int param3, fj param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Confined.field_J ? 1 : 0;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          L0: {
            var8 = -param0 + (param1 - ((nj) this).field_S);
            var9 = ((nj) this).field_F + -(2 * ((nj) this).field_S);
            if (var8 > var9) {
              var8 = var9;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if ((var8 ^ -1) > -1) {
              var8 = 0;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var8 = ((nj) this).field_R * var8 / var9;
            if ((param6 ^ -1) != -2) {
              if (2 == param6) {
                var10 = 2147483647;
                var11 = -1;
                var12 = 0;
                L3: while (true) {
                  if (var12 >= ((nj) this).field_P.a((byte) 127)) {
                    if (0 > var11) {
                      break L2;
                    } else {
                      ((nj) this).field_P.a(var11, (byte) -111);
                      break L2;
                    }
                  } else {
                    var13 = -var8 + ((nj) this).field_P.a(var12, 27656);
                    var13 = var13 * var13;
                    if (var13 < var10) {
                      var10 = var13;
                      var11 = var12;
                      var12++;
                      continue L3;
                    } else {
                      var12++;
                      continue L3;
                    }
                  }
                }
              } else {
                break L2;
              }
            } else {
              ((nj) this).field_P.a((byte) -116, var8);
              break L2;
            }
          }
          return true;
        } else {
          return false;
        }
    }

    final int h(byte param0) {
        if (param0 <= 97) {
            field_T = null;
        }
        return ((nj) this).field_P.a((byte) 111);
    }

    final int a(byte param0, int param1) {
        L0: {
          if (-1 < (param1 ^ -1)) {
            break L0;
          } else {
            if (param1 < ((nj) this).field_P.a((byte) 111)) {
              L1: {
                if (param0 >= 14) {
                  break L1;
                } else {
                  nj.a((byte) 123);
                  break L1;
                }
              }
              return ((nj) this).field_P.a(param1, 27656);
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    public static void a(byte param0) {
        if (param0 != -93) {
            return;
        }
        field_T = null;
    }

    private nj() throws Throwable {
        throw new Error();
    }

    final int i(byte param0) {
        if (param0 != -96) {
            nj.a((byte) -113);
        }
        return ((nj) this).field_R;
    }

    static {
    }
}
