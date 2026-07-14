/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class rg extends cf implements dh {
    cf field_B;
    static ri field_C;
    static String field_D;

    final void a(Hashtable param0, boolean param1, StringBuilder param2, int param3) {
        int var5 = 0;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!param1) {
            cf discarded$0 = ((rg) this).f(-102);
        }
        StringBuilder discarded$1 = param2.append(10);
        for (var5 = 0; var5 <= param3; var5++) {
            StringBuilder discarded$2 = param2.append(32);
        }
        if (null != ((rg) this).field_B) {
            StringBuilder discarded$4 = ((rg) this).field_B.a(7, param0, 1 + param3, param2);
        } else {
            StringBuilder discarded$5 = param2.append("null");
        }
    }

    StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        if (((rg) this).a(param1, 9, param3, param2)) {
            ((rg) this).a(param2, param3, (byte) 26, param1);
            ((rg) this).a(param1, true, param3, param2);
        }
        if (param0 != 7) {
            boolean discarded$0 = ((rg) this).c(-4);
        }
        return param3;
    }

    void a(int param0) {
        if (param0 != -18384) {
            ((rg) this).field_B = null;
        }
        if (!(null == ((rg) this).field_B)) {
            ((rg) this).field_B.e(-1);
        }
    }

    String d(byte param0) {
        String var4 = null;
        String var2 = super.d((byte) 117);
        int var3 = 6 % ((53 - param0) / 57);
        if (((rg) this).field_B != null) {
            var4 = ((rg) this).field_B.d((byte) 110);
            if (!(var4 == null)) {
                return var4;
            }
        }
        return var2;
    }

    final int f(byte param0) {
        if (param0 != 44) {
            return -111;
        }
        return null != ((rg) this).field_B ? ((rg) this).field_B.f((byte) 44) : 0;
    }

    void a(int param0, cf param1, int param2, int param3, boolean param4, int param5) {
        if (null != ((rg) this).field_B) {
            ((rg) this).field_B.a(param0, param1, ((rg) this).field_i + param2, param3, true, ((rg) this).field_y + param5);
        }
        if (!param4) {
            field_C = null;
        }
    }

    private final boolean a(cf param0, byte param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param1 <= -124) {
            break L0;
          } else {
            ((rg) this).field_B = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((rg) this).field_B == null) {
              break L2;
            } else {
              if (((rg) this).field_B.c(125)) {
                break L2;
              } else {
                if (!((rg) this).field_B.a(param0, 0)) {
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

    rg(int param0, int param1, int param2, int param3, nl param4, bj param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final boolean a(byte param0, int param1, int param2, int param3, int param4, int param5, cf param6) {
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          L1: {
            var8 = 66 / ((param0 - 48) / 37);
            if (null == ((rg) this).field_B) {
              break L1;
            } else {
              if (!((rg) this).field_B.c(125)) {
                break L1;
              } else {
                if (!((rg) this).field_B.a((byte) -125, param1, param2, param3, param4, param5, param6)) {
                  break L1;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L0;
                }
              }
            }
          }
          stackOut_4_0 = 0;
          stackIn_5_0 = stackOut_4_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    cf f(int param0) {
        if (param0 != -1963) {
            field_C = null;
        }
        cf var2 = ((rg) this).field_B;
        if (var2 == null) {
            return null;
        }
        if (!var2.c(param0 ^ -2005)) {
            return null;
        }
        return var2;
    }

    public static void a(byte param0) {
        if (param0 != -39) {
            rg.a((byte) 21);
        }
        field_D = null;
        field_C = null;
    }

    final void c(byte param0) {
        if (param0 != 32) {
            return;
        }
        if (!(null == ((rg) this).field_B)) {
            ((rg) this).field_B.c((byte) 32);
        }
    }

    void a(int param0, cf param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (((rg) this).field_B != null) {
            ((rg) this).field_B.a(-5407, param1, ((rg) this).field_y + param2, ((rg) this).field_i + param3);
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        ((rg) this).a(param2 ^ -14052);
    }

    final boolean a(int param0, char param1, cf param2, int param3) {
        if (param3 != -6208) {
            field_C = null;
        }
        if (((rg) this).field_B != null) {
            if (((rg) this).field_B.c(127)) {
                if (!(!((rg) this).field_B.a(param0, param1, param2, -6208))) {
                    return true;
                }
            }
        }
        int var5 = param0;
        if ((var5 ^ -1) == -81) {
            return !lc.field_m[81] ? this.a(param2, (byte) -125) : this.a(-81, param2);
        }
        return false;
    }

    private final boolean a(int param0, cf param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == -81) {
            break L0;
          } else {
            boolean discarded$2 = ((rg) this).c(-108);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((rg) this).field_B) {
              break L2;
            } else {
              if (((rg) this).field_B.c(127)) {
                break L2;
              } else {
                if (!((rg) this).field_B.a(param1, 0)) {
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

    void a(int param0, int param1, int param2, int param3) {
        if (param0 != -2) {
            int discarded$0 = ((rg) this).f((byte) 0);
        }
        if (param2 == 0) {
            if (null != ((rg) this).field_h) {
                ((rg) this).field_h.a(true, param1, -15112, param3, (cf) this);
            }
        }
        if (null != ((rg) this).field_B) {
            ((rg) this).field_B.a(param0 ^ 0, ((rg) this).field_i + param1, param2, ((rg) this).field_y + param3);
        }
    }

    boolean a(int param0, int param1, int param2, cf param3, int param4, int param5, int param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param4 == -24) {
          L0: {
            L1: {
              if (null == ((rg) this).field_B) {
                break L1;
              } else {
                if (!((rg) this).field_B.a(param0, param1, param2, param3, -24, param5 + ((rg) this).field_y, ((rg) this).field_i + param6)) {
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

    final boolean c(int param0) {
        if (param0 < 123) {
            field_D = null;
        }
        return null != ((rg) this).f(-1963) ? true : false;
    }

    final static sk g(int param0) {
        if (param0 != -18799) {
            return null;
        }
        if (!(null != lh.field_g)) {
            lh.field_g = new sk();
            lh.field_g.a(125269879, ke.field_h);
            lh.field_g.field_d = 2763306;
            lh.field_g.field_p = 14;
            lh.field_g.field_e = 0;
            lh.field_g.field_c = 5;
            lh.field_g.field_l = 6;
            lh.field_g.field_h = cp.field_H;
            lh.field_g.field_b = 7697781;
            lh.field_g.field_m = 4;
        }
        return lh.field_g;
    }

    final boolean a(cf param0, int param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 == 0) {
          L0: {
            L1: {
              if (null == ((rg) this).field_B) {
                break L1;
              } else {
                if (!((rg) this).field_B.a(param0, 0)) {
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
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Connecting to<br>friend server...";
    }
}
