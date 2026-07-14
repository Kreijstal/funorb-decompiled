/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class dg extends rj implements f {
    rj field_y;
    static ei field_z;

    public static void h(int param0) {
        if (param0 != 32) {
            field_z = null;
        }
        field_z = null;
    }

    final boolean a(int param0, rj param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -2147483648) {
          L0: {
            L1: {
              if (null == ((dg) this).field_y) {
                break L1;
              } else {
                if (!((dg) this).field_y.a(-2147483648, param1)) {
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

    final void a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        int var5 = 0;
        int var6 = stellarshard.field_B;
        StringBuilder discarded$0 = param1.append(10);
        for (var5 = 0; var5 <= param3; var5++) {
            StringBuilder discarded$1 = param1.append(32);
        }
        if (param0 != -81) {
            return;
        }
        if (((dg) this).field_y != null) {
            StringBuilder discarded$3 = ((dg) this).field_y.a(param3 + 1, false, param1, param2);
        } else {
            StringBuilder discarded$4 = param1.append("null");
        }
    }

    void a(int param0, int param1, rj param2, int param3, int param4, int param5) {
        if (!(null == ((dg) this).field_y)) {
            ((dg) this).field_y.a(param0, -126, param2, ((dg) this).field_w + param3, param4 + ((dg) this).field_k, param5);
        }
        int var7 = -107 % ((-50 - param1) / 57);
    }

    final boolean e(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            boolean discarded$0 = this.b(false, (rj) null);
        }
        return ((dg) this).a(257) != null ? true : false;
    }

    final static void g(int param0) {
        if (param0 != 16608) {
            dg.h(58);
        }
        rh.a(17, (byte) -72);
    }

    final boolean a(int param0, int param1, rj param2, int param3, int param4, int param5, int param6) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param4 > 30) {
            break L0;
          } else {
            ((dg) this).field_y = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((dg) this).field_y == null) {
              break L2;
            } else {
              if (!((dg) this).field_y.e(0)) {
                break L2;
              } else {
                if (!((dg) this).field_y.a(param0, param1, param2, param3, 38, param5, param6)) {
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

    final static ml a(boolean param0, int param1) {
        ml var2 = new ml(true);
        if (param1 != 0) {
            field_z = null;
        }
        var2.field_a = param0 ? true : false;
        return var2;
    }

    final void c(boolean param0) {
        if (!param0) {
            ((dg) this).a(-30, (byte) -11, 55, -83);
        }
        if (!(((dg) this).field_y == null)) {
            ((dg) this).field_y.c(true);
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        if (-1 == (param0 ^ -1)) {
            if (!(null == ((dg) this).field_u)) {
                ((dg) this).field_u.a(true, param3, param2, (rj) this, 4549);
            }
        }
        if (param1 != -57) {
            return;
        }
        if (!(null == ((dg) this).field_y)) {
            ((dg) this).field_y.a(param0, (byte) -57, param2 - -((dg) this).field_k, param3 + ((dg) this).field_w);
        }
    }

    String d(int param0) {
        String var3 = null;
        String var2 = super.d(param0);
        if (((dg) this).field_y != null) {
            var3 = ((dg) this).field_y.d(3690);
            if (var3 != null) {
                return var3;
            }
        }
        return var2;
    }

    final boolean a(int param0, int param1, char param2, rj param3) {
        if (null != ((dg) this).field_y) {
            if (((dg) this).field_y.e(0)) {
                if (((dg) this).field_y.a(29657, param1, param2, param3)) {
                    return true;
                }
            }
        }
        if (param0 != 29657) {
            Object var6 = null;
            boolean discarded$0 = ((dg) this).a((rj) null, -24, -59, -50, 25, (byte) -57, -73);
        }
        int var5 = param1;
        if (-81 == (var5 ^ -1)) {
            return !si.field_jb[81] ? this.a(true, param3) : this.b(true, param3);
        }
        return false;
    }

    rj a(int param0) {
        if (param0 != 257) {
            field_z = null;
        }
        rj var2 = ((dg) this).field_y;
        if (var2 == null) {
            return null;
        }
        if (!(!var2.e(0))) {
            return var2;
        }
        return null;
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        ((dg) this).a((byte) 79);
    }

    void a(int param0, boolean param1, int param2, rj param3) {
        if (param1) {
            Object var6 = null;
            ((dg) this).a(111, (StringBuilder) null, (Hashtable) null, 2);
        }
        super.a(param0, param1, param2, param3);
        if (!(null == ((dg) this).field_y)) {
            ((dg) this).field_y.a(((dg) this).field_k + param0, param1, ((dg) this).field_w + param2, param3);
        }
    }

    boolean a(rj param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param5 >= 24) {
          L0: {
            L1: {
              if (((dg) this).field_y == null) {
                break L1;
              } else {
                if (!((dg) this).field_y.a(param0, param1, param2, param3, ((dg) this).field_w + param4, (byte) 109, param6 - -((dg) this).field_k)) {
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

    dg(int param0, int param1, int param2, int param3, uk param4, lf param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final int a(boolean param0) {
        if (param0) {
            String discarded$0 = ((dg) this).d(-101);
        }
        return null != ((dg) this).field_y ? ((dg) this).field_y.a(false) : 0;
    }

    private final boolean a(boolean param0, rj param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            dg.g(-100);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((dg) this).field_y) {
              break L2;
            } else {
              if (((dg) this).field_y.e(0)) {
                break L2;
              } else {
                if (!((dg) this).field_y.a(-2147483648, param1)) {
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

    StringBuilder a(int param0, boolean param1, StringBuilder param2, Hashtable param3) {
        if (!(!((dg) this).a((byte) -120, param3, param2, param0))) {
            ((dg) this).a((byte) 111, param0, param2, param3);
            ((dg) this).a(-81, param2, param3, param0);
        }
        if (param1) {
            ((dg) this).a(118, (byte) 62, -12, 90);
        }
        return param2;
    }

    private final boolean b(boolean param0, rj param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if (((dg) this).field_y == null) {
                break L1;
              } else {
                if (((dg) this).field_y.e(0)) {
                  break L1;
                } else {
                  if (!((dg) this).field_y.a(-2147483648, param1)) {
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
          return false;
        }
    }

    void a(byte param0) {
        if (!(null == ((dg) this).field_y)) {
            ((dg) this).field_y.f(0);
        }
        if (param0 != 79) {
            ((dg) this).field_y = null;
        }
    }

    static {
    }
}
