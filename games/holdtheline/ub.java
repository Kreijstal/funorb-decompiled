/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ub extends n implements jm {
    static go field_A;
    static String field_D;
    n field_B;
    static int[] field_C;
    static String field_E;

    final boolean a(int param0, n param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param6 == -24898) {
            break L0;
          } else {
            field_D = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((ub) this).field_B == null) {
              break L2;
            } else {
              if (!((ub) this).field_B.c((byte) -20)) {
                break L2;
              } else {
                if (!((ub) this).field_B.a(param0, param1, param2, param3, param4, param5, param6 + 0)) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    String f(int param0) {
        String var3 = null;
        String var2 = super.f(param0);
        if (((ub) this).field_B != null) {
            var3 = ((ub) this).field_B.f(0);
            if (var3 != null) {
                return var3;
            }
        }
        return var2;
    }

    void a(int param0, n param1, int param2, byte param3) {
        super.a(param0, param1, param2, param3);
        if (!(null == ((ub) this).field_B)) {
            ((ub) this).field_B.a(((ub) this).field_k + param0, param1, ((ub) this).field_o + param2, (byte) -3);
        }
    }

    final boolean a(n param0, int param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 == -25823) {
          L0: {
            L1: {
              if (null == ((ub) this).field_B) {
                break L1;
              } else {
                if (!((ub) this).field_B.a(param0, -25823)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final static fl a(byte[] param0, int param1, int param2) {
        fl var3 = new fl(param0);
        if (param2 != 0) {
            return null;
        }
        pd.field_e.a((byte) -86, (hl) (Object) var3);
        om.a(27391, var3, param1);
        return var3;
    }

    private final boolean b(int param0, n param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == -81) {
          L0: {
            L1: {
              if (null == ((ub) this).field_B) {
                break L1;
              } else {
                if (((ub) this).field_B.c((byte) -20)) {
                  break L1;
                } else {
                  if (!((ub) this).field_B.a(param1, param0 + -25742)) {
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    private final boolean a(int param0, n param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == 3) {
            break L0;
          } else {
            field_C = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((ub) this).field_B) {
              break L2;
            } else {
              if (((ub) this).field_B.c((byte) -20)) {
                break L2;
              } else {
                if (!((ub) this).field_B.a(param1, -25823)) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    void a(int param0) {
        if (!(((ub) this).field_B == null)) {
            ((ub) this).field_B.g(82);
        }
        int var2 = 91 / ((param0 - -68) / 32);
    }

    n a(byte param0) {
        n var2 = ((ub) this).field_B;
        if (var2 != null) {
            if (var2.c((byte) -20)) {
                return var2;
            }
        }
        if (param0 > 120) {
            return null;
        }
        return null;
    }

    boolean a(int param0, int param1, int param2, n param3, byte param4, int param5, int param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param4 == -108) {
          L0: {
            L1: {
              if (null == ((ub) this).field_B) {
                break L1;
              } else {
                if (!((ub) this).field_B.a(((ub) this).field_k + param0, param1, param2 + ((ub) this).field_o, param3, (byte) -108, param5, param6)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final static uh a(int param0, int param1) {
        if (param1 <= 40) {
            ub.e((byte) 22);
        }
        uh var2 = new uh(param0, false);
        return var2;
    }

    final void e(int param0) {
        if (null != ((ub) this).field_B) {
            ((ub) this).field_B.e(112);
        }
        if (param0 <= 15) {
            field_A = null;
        }
    }

    final int d(byte param0) {
        if (param0 > -66) {
            return 73;
        }
        return ((ub) this).field_B != null ? ((ub) this).field_B.d((byte) -83) : 0;
    }

    ub(int param0, int param1, int param2, int param3, dh param4, tb param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    StringBuilder a(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        if (!(!((ub) this).a(20720, param2, param3, param0))) {
            ((ub) this).a(param2, param0, true, param3);
            ((ub) this).a((byte) 123, param0, param3, param2);
        }
        int var5 = 107 / ((0 - param1) / 49);
        return param3;
    }

    final boolean a(n param0, int param1, byte param2, char param3) {
        if (((ub) this).field_B != null) {
            if (((ub) this).field_B.c((byte) -20)) {
                if (!(!((ub) this).field_B.a(param0, param1, (byte) -78, param3))) {
                    return true;
                }
            }
        }
        int var5 = param1;
        if (!(-81 != (var5 ^ -1))) {
            return lk.field_g[81] ? this.a(3, param0) : this.b(param2 ^ 29, param0);
        }
        if (param2 != -78) {
            Object var6 = null;
            boolean discarded$0 = ((ub) this).a((n) null, 55);
            return false;
        }
        return false;
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((ub) this).a(117);
    }

    void a(int param0, n param1, int param2, int param3, byte param4, int param5) {
        if (null != ((ub) this).field_B) {
            ((ub) this).field_B.a(param0, param1, param2 - -((ub) this).field_o, param3 - -((ub) this).field_k, (byte) -9, param5);
        }
        if (param4 != -9) {
            Object var8 = null;
            boolean discarded$0 = ((ub) this).a((n) null, 41, (byte) 18, '2');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (0 == param3) {
            if (((ub) this).field_l != null) {
                ((ub) this).field_l.a(true, param2, -95, (n) this, param1);
            }
        }
        if (((ub) this).field_B != null) {
            ((ub) this).field_B.a(-9532, ((ub) this).field_o + param1, ((ub) this).field_k + param2, param3);
        }
        if (param0 != -9532) {
            field_E = null;
        }
    }

    final boolean c(byte param0) {
        if (param0 != -20) {
            return false;
        }
        return null != ((ub) this).a((byte) 123) ? true : false;
    }

    public static void e(byte param0) {
        field_A = null;
        field_C = null;
        field_D = null;
        if (param0 < 80) {
            field_C = null;
        }
        field_E = null;
    }

    final void a(byte param0, int param1, StringBuilder param2, Hashtable param3) {
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        StringBuilder discarded$0 = param2.append(10);
        for (var5 = 0; var5 <= param1; var5++) {
            StringBuilder discarded$1 = param2.append(32);
        }
        if (null == ((ub) this).field_B) {
            StringBuilder discarded$3 = param2.append("null");
        } else {
            StringBuilder discarded$4 = ((ub) this).field_B.a(param1 - -1, (byte) -97, param3, param2);
        }
        var5 = 39 % ((param0 - 66) / 34);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Pressing <img=0> will fire a weapon if you have one <col=1>red</col> powerup. Laying <col=1>mines</col> or firing the <col=1>machine gun</col> will not cause any powerups to be lost.";
        field_C = new int[]{5, 3, 1, 0};
        field_E = "End of free game!";
    }
}
