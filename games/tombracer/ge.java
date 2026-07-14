/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ge extends kna {
    private boolean field_I;
    static String field_G;
    private int field_F;
    private int field_H;

    final boolean s(int param0) {
        if (param0 != -15254) {
            ((ge) this).field_F = -66;
            return true;
        }
        return true;
    }

    void a(boolean param0, kh param1) {
        Object var4 = null;
        kh stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        kh stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        kh stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        kh stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        kh stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        kh stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        kh stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        kh stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        kh stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        kh stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        kh stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        kh stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        if (!param0) {
          super.a(param0, param1);
          if (((ge) this).A(-1)) {
            param1.a((byte) 124, ((ge) this).field_F, 4);
            if (((ge) this).B(-23309)) {
              L0: {
                if (((ge) this).C(128)) {
                  L1: {
                    stackOut_21_0 = (kh) param1;
                    stackOut_21_1 = 14;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    if (((ge) this).field_I) {
                      stackOut_23_0 = (kh) (Object) stackIn_23_0;
                      stackOut_23_1 = stackIn_23_1;
                      stackOut_23_2 = 1;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      stackIn_24_2 = stackOut_23_2;
                      break L1;
                    } else {
                      stackOut_22_0 = (kh) (Object) stackIn_22_0;
                      stackOut_22_1 = stackIn_22_1;
                      stackOut_22_2 = 0;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_24_1 = stackOut_22_1;
                      stackIn_24_2 = stackOut_22_2;
                      break L1;
                    }
                  }
                  ((kh) (Object) stackIn_24_0).a((byte) stackIn_24_1, stackIn_24_2, 1);
                  break L0;
                } else {
                  break L0;
                }
              }
              if (((ge) this).field_I) {
                return;
              } else {
                param1.a((byte) 104, ((ge) this).field_H, 4);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          var4 = null;
          ((ge) this).a((byte) -1, (mra) null, (la) null);
          super.a(param0, param1);
          if (((ge) this).A(-1)) {
            param1.a((byte) 124, ((ge) this).field_F, 4);
            if (((ge) this).B(-23309)) {
              L2: {
                if (((ge) this).C(128)) {
                  L3: {
                    stackOut_7_0 = (kh) param1;
                    stackOut_7_1 = 14;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    if (((ge) this).field_I) {
                      stackOut_9_0 = (kh) (Object) stackIn_9_0;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = 1;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      stackIn_10_2 = stackOut_9_2;
                      break L3;
                    } else {
                      stackOut_8_0 = (kh) (Object) stackIn_8_0;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = 0;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_10_2 = stackOut_8_2;
                      break L3;
                    }
                  }
                  ((kh) (Object) stackIn_10_0).a((byte) stackIn_10_1, stackIn_10_2, 1);
                  break L2;
                } else {
                  break L2;
                }
              }
              if (!((ge) this).field_I) {
                param1.a((byte) 104, ((ge) this).field_H, 4);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    abstract boolean A(int param0);

    abstract boolean B(int param0);

    ge(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        if (!((ge) this).A(-1)) {
        }
        ((ge) this).field_F = param2.b((byte) 44, 4);
        if (!((ge) this).B(-23309)) {
        }
        if (((ge) this).C(128)) {
            ((ge) this).field_I = (param2.b((byte) 44, 1) ^ -1) == -2 ? true : false;
        }
        if (!((ge) this).field_I) {
            ((ge) this).field_H = param2.b((byte) 44, 4);
        }
    }

    public static void r(byte param0) {
        if (param0 <= 92) {
            return;
        }
        field_G = null;
    }

    ge(la param0, int param1) {
        super(param0, param1);
    }

    final void a(fsa param0, int param1, nv param2, int param3) {
        mfa var5 = rm.field_a;
        gaa var6 = (gaa) (Object) var5.a(5, 87);
        var6.a(true, param3);
        var6.b(1, 96);
        var6.a(16, 120);
        var6.a(param1, 0, 1, false);
        param0.a((gr) (Object) param2, (byte) 124, (dg) (Object) var6);
    }

    final void a(byte param0, mra param1, la param2) {
        qea var5 = null;
        roa var6 = null;
        int var7 = 0;
        mg var8 = null;
        if (param0 == 43) {
          if (((ge) this).A(param0 + -44)) {
            var8 = ln.b(((ge) this).field_F, 23688);
            if (((ge) this).B(-23309)) {
              if (((ge) this).field_I) {
                var5 = param2.q(-85);
                ((ge) this).field_H = var5.a(16, param0 + -43);
                if (param1 instanceof ska) {
                  var6 = ((ska) (Object) param1).l(-2);
                  if (var6 != null) {
                    var7 = var6.a(true);
                    if (-1 <= (var7 ^ -1)) {
                      var8.a(false, ((ge) this).field_H * var8.a((byte) -94) / 16);
                      param1.a(102, var8);
                      return;
                    } else {
                      var6.b(var5.a(var7, 0), false);
                      var8.a(false, ((ge) this).field_H * var8.a((byte) -94) / 16);
                      param1.a(102, var8);
                      return;
                    }
                  } else {
                    var8.a(false, ((ge) this).field_H * var8.a((byte) -94) / 16);
                    param1.a(102, var8);
                    return;
                  }
                } else {
                  var8.a(false, ((ge) this).field_H * var8.a((byte) -94) / 16);
                  param1.a(102, var8);
                  return;
                }
              } else {
                var8.a(false, ((ge) this).field_H * var8.a((byte) -94) / 16);
                param1.a(102, var8);
                return;
              }
            } else {
              param1.a(102, var8);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final boolean s(byte param0) {
        if (param0 < 64) {
            Object var3 = null;
            ((ge) this).a(true, (kh) null);
            return ((ge) this).field_I;
        }
        return ((ge) this).field_I;
    }

    abstract boolean C(int param0);

    final boolean a(int param0) {
        if (param0 != 6) {
            return false;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Report abuse";
    }
}
