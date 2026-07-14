/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class mg extends w implements dh {
    static boolean field_B;
    w field_A;
    static int[] field_x;
    static String field_z;
    static int field_y;

    final boolean a(char param0, int param1, w param2, byte param3) {
        int var5 = -22 % ((-13 - param3) / 55);
        if (((mg) this).field_A != null) {
            if (((mg) this).field_A.a(18337)) {
                if (((mg) this).field_A.a(param0, param1, param2, (byte) 63)) {
                    return true;
                }
            }
        }
        int var6 = param1;
        if (-81 != (var6 ^ -1)) {
            return false;
        }
        return !wa.field_j[81] ? this.b(param2, 32) : this.a(param2, 20638);
    }

    final boolean a(byte param0, w param1) {
        Object var4 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 44) {
            break L0;
          } else {
            var4 = null;
            ((mg) this).a((byte) -64, (w) null, -127, -30);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((mg) this).field_A) {
              break L2;
            } else {
              if (!((mg) this).field_A.a((byte) 44, param1)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void b(StringBuilder param0, int param1, int param2, Hashtable param3) {
        int var5 = 0;
        int var6 = Lexicominos.field_L ? 1 : 0;
        StringBuilder discarded$5 = param0.append(10);
        if (param1 != -28327) {
            ((mg) this).field_A = null;
        }
        for (var5 = 0; var5 <= param2; var5++) {
            StringBuilder discarded$6 = param0.append(32);
        }
        if (((mg) this).field_A == null) {
            StringBuilder discarded$8 = param0.append("null");
        } else {
            StringBuilder discarded$9 = ((mg) this).field_A.a(1 + param2, param3, param0, -15992);
        }
    }

    final static int a(int param0, gb param1, gb param2) {
        if (param0 != 0) {
            field_z = null;
        }
        Object var4 = null;
        return hc.a(0, 0, param1, -30762, param2, (String) null, false);
    }

    mg(int param0, int param1, int param2, int param3, rd param4, vd param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    void a(w param0, int param1, int param2, int param3, int param4, int param5) {
        if (((mg) this).field_A != null) {
            ((mg) this).field_A.a(param0, param1, ((mg) this).field_o + param2, 0, ((mg) this).field_t + param4, param5);
        }
        if (param3 != 0) {
            field_B = false;
        }
    }

    public static void d(boolean param0) {
        if (param0) {
            return;
        }
        field_z = null;
        field_x = null;
    }

    boolean a(int param0, int param1, w param2, int param3, int param4, int param5, int param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -4808) {
            break L0;
          } else {
            ((mg) this).c((byte) -123);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((mg) this).field_A) {
              break L2;
            } else {
              if (!((mg) this).field_A.a(-4808, param1, param2, param3, ((mg) this).field_o + param4, ((mg) this).field_t + param5, param6)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void e(int param0) {
        if (param0 != 0) {
            mg.e(-36);
        }
    }

    void a(byte param0, w param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (!(null == ((mg) this).field_A)) {
            ((mg) this).field_A.a((byte) -119, param1, ((mg) this).field_o + param2, param3 + ((mg) this).field_t);
        }
    }

    private final boolean b(w param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param1 == 32) {
          L0: {
            L1: {
              if (((mg) this).field_A == null) {
                break L1;
              } else {
                if (((mg) this).field_A.a(18337)) {
                  break L1;
                } else {
                  if (!((mg) this).field_A.a((byte) 44, param0)) {
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

    final int c(int param0) {
        if (param0 != 15508) {
            Object var3 = null;
            ((mg) this).a((w) null, 16, 10, 65, -65, -26);
        }
        return null == ((mg) this).field_A ? 0 : ((mg) this).field_A.c(15508);
    }

    void a(byte param0, int param1, int param2, int param3) {
        if (0 == param3) {
            if (!(null == ((mg) this).field_i)) {
                ((mg) this).field_i.a(param1, param2, true, (w) this, -3284);
            }
        }
        if (!(null == ((mg) this).field_A)) {
            ((mg) this).field_A.a((byte) -115, param1 - -((mg) this).field_o, ((mg) this).field_t + param2, param3);
        }
        if (param0 != -115) {
            field_B = false;
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((mg) this).g(-81);
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        if (param3 != -15992) {
            boolean discarded$0 = ((mg) this).a(106);
        }
        if (((mg) this).a(7373, param2, param1, param0)) {
            ((mg) this).a(param2, param3 ^ -15992, param0, param1);
            ((mg) this).b(param2, param3 + -12335, param0, param1);
        }
        return param2;
    }

    final void c(byte param0) {
        if (!(null == ((mg) this).field_A)) {
            ((mg) this).field_A.c((byte) -121);
        }
        if (param0 >= -35) {
            field_y = -80;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, w param4, int param5, int param6) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param5 == -29771) {
          L0: {
            L1: {
              if (((mg) this).field_A == null) {
                break L1;
              } else {
                if (!((mg) this).field_A.a(18337)) {
                  break L1;
                } else {
                  if (!((mg) this).field_A.a(param0, param1, param2, param3, param4, param5 ^ 0, param6)) {
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

    private final boolean a(w param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param1 == 20638) {
          L0: {
            L1: {
              if (((mg) this).field_A == null) {
                break L1;
              } else {
                if (((mg) this).field_A.a(18337)) {
                  break L1;
                } else {
                  if (!((mg) this).field_A.a((byte) 44, param0)) {
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

    final boolean a(int param0) {
        if (param0 != 18337) {
            return false;
        }
        return null != ((mg) this).f(0) ? true : false;
    }

    w f(int param0) {
        w var2 = ((mg) this).field_A;
        if (param0 != 0) {
            field_z = null;
        }
        if (var2 == null) {
            return null;
        }
        if (!(!var2.a(18337))) {
            return var2;
        }
        return null;
    }

    String b(int param0) {
        String var3 = null;
        String var2 = super.b(126);
        if (null != ((mg) this).field_A) {
            var3 = ((mg) this).field_A.b(124);
            if (!(var3 == null)) {
                return var3;
            }
        }
        if (param0 <= 121) {
            Object var4 = null;
            boolean discarded$0 = ((mg) this).a((byte) 45, (w) null);
        }
        return var2;
    }

    void g(int param0) {
        if (!(((mg) this).field_A == null)) {
            ((mg) this).field_A.d(95);
        }
        if (param0 != -81) {
            ((mg) this).field_A = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = false;
        field_z = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
