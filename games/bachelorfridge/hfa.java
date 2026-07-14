/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class hfa extends wj implements e {
    static String field_y;
    static fea field_z;
    static String field_B;
    wj field_A;

    void a(byte param0, int param1, int param2, int param3) {
        if (0 == param2) {
            if (((hfa) this).field_f != null) {
                ((hfa) this).field_f.a(param3, (wj) this, 32679, param1, true);
            }
        }
        if (!(null == ((hfa) this).field_A)) {
            ((hfa) this).field_A.a((byte) 125, param1 + ((hfa) this).field_v, param2, param3 - -((hfa) this).field_s);
        }
        int var5 = 19 / ((param0 - -20) / 54);
    }

    public static void g(int param0) {
        if (param0 != -81) {
            boolean discarded$0 = hfa.a(-77, 73);
        }
        field_y = null;
        field_B = null;
        field_z = null;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param1 == 13) {
            break L0;
          } else {
            field_B = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((hfa) this).field_A == null) {
              break L2;
            } else {
              if (!((hfa) this).field_A.e(param1 ^ 1010)) {
                break L2;
              } else {
                if (!((hfa) this).field_A.a(param0, 13, param2, param3, param4, param5, param6)) {
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

    boolean b(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 == -7375) {
          L0: {
            L1: {
              if (((hfa) this).field_A == null) {
                break L1;
              } else {
                if (!((hfa) this).field_A.b(param0, -7375, param2 + ((hfa) this).field_s, param3, param4 - -((hfa) this).field_v, param5, param6)) {
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

    final static boolean a(int param0, int param1) {
        if (param1 != 2) {
            field_y = null;
        }
        return 2 <= param0 ? true : false;
    }

    String c(byte param0) {
        String var3 = null;
        String var2 = this.c(param0);
        if (!(((hfa) this).field_A == null)) {
            var3 = ((hfa) this).field_A.c((byte) 16);
            if (!(var3 == null)) {
                return var3;
            }
        }
        return var2;
    }

    hfa(int param0, int param1, int param2, int param3, qda param4, pl param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final int b(int param0) {
        if (param0 > -3) {
            return -117;
        }
        return ((hfa) this).field_A == null ? 0 : ((hfa) this).field_A.b(-34);
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        this.a(param0, param1, param2, param3, param4);
        ((hfa) this).a(-81);
    }

    StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        if (param2 < 20) {
            ((hfa) this).field_A = null;
        }
        if (((hfa) this).a(param0, param1, param3, (byte) 121)) {
            ((hfa) this).a(9, param0, param3, param1);
            ((hfa) this).b(param1, param0, param3, 108);
        }
        return param3;
    }

    void a(int param0) {
        if (((hfa) this).field_A != null) {
            ((hfa) this).field_A.d(6);
        }
        if (param0 != -81) {
            field_z = null;
        }
    }

    final boolean e(int param0) {
        if (param0 != 1023) {
            field_y = null;
        }
        return null != ((hfa) this).d((byte) 111) ? true : false;
    }

    final boolean a(int param0, int param1, char param2, wj param3) {
        if (((hfa) this).field_A != null) {
            if (((hfa) this).field_A.e(1023)) {
                if (((hfa) this).field_A.a(10, param1, param2, param3)) {
                    return true;
                }
            }
        }
        int var5 = param1;
        if ((var5 ^ -1) == -81) {
            return !wga.field_q[81] ? this.b(-14391, param3) : this.a(0, param3);
        }
        if (param0 != 10) {
            Object var6 = null;
            boolean discarded$0 = ((hfa) this).b(-49, 33, 67, -11, -47, (wj) null, 62);
            return false;
        }
        return false;
    }

    final void b(int param0, Hashtable param1, StringBuilder param2, int param3) {
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        StringBuilder discarded$4 = param2.append(10);
        if (param3 < 107) {
            return;
        }
        for (var5 = 0; var5 <= param0; var5++) {
            StringBuilder discarded$5 = param2.append(32);
        }
        if (((hfa) this).field_A != null) {
            StringBuilder discarded$7 = ((hfa) this).field_A.a(param1, 1 + param0, (byte) 74, param2);
        } else {
            StringBuilder discarded$8 = param2.append("null");
        }
    }

    void a(int param0, int param1, byte param2, wj param3, int param4, int param5) {
        if (param2 != -101) {
            field_y = null;
        }
        if (!(null == ((hfa) this).field_A)) {
            ((hfa) this).field_A.a(((hfa) this).field_s + param0, param1, (byte) -101, param3, param4, param5 - -((hfa) this).field_v);
        }
    }

    void a(int param0, int param1, wj param2, int param3) {
        this.a(param0, param1, param2, param3);
        if (((hfa) this).field_A != null) {
            ((hfa) this).field_A.a(param0 - -((hfa) this).field_s, ((hfa) this).field_v + param1, param2, 20);
        }
    }

    final void f(int param0) {
        if (param0 != 31) {
            return;
        }
        if (((hfa) this).field_A != null) {
            ((hfa) this).field_A.f(31);
        }
    }

    private final boolean a(int param0, wj param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            wj discarded$2 = ((hfa) this).d((byte) 124);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((hfa) this).field_A == null) {
              break L2;
            } else {
              if (((hfa) this).field_A.e(1023)) {
                break L2;
              } else {
                if (!((hfa) this).field_A.a(param1, param0 + -97)) {
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

    private final boolean b(int param0, wj param1) {
        Object var4 = null;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == -14391) {
            break L0;
          } else {
            var4 = null;
            boolean discarded$2 = ((hfa) this).a(124, 28, -53, 58, -115, (wj) null, -70);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((hfa) this).field_A == null) {
              break L2;
            } else {
              if (((hfa) this).field_A.e(param0 ^ -15306)) {
                break L2;
              } else {
                if (!((hfa) this).field_A.a(param1, -83)) {
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

    wj d(byte param0) {
        wj var2 = ((hfa) this).field_A;
        if (var2 != null) {
            if (var2.e(1023)) {
                return var2;
            }
        }
        if (param0 > 38) {
            return null;
        }
        int discarded$0 = ((hfa) this).b(93);
        return null;
    }

    final boolean a(wj param0, int param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1 < -78) {
            break L0;
          } else {
            int discarded$2 = ((hfa) this).b(-31);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((hfa) this).field_A == null) {
              break L2;
            } else {
              if (!((hfa) this).field_A.a(param0, -113)) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Quit";
        field_B = "Game";
    }
}
