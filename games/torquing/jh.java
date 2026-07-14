/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class jh extends gm implements cj {
    gm field_C;
    static int field_z;
    static dg field_B;
    static ei field_y;
    static int field_A;
    static int[] field_x;

    final void a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        int var5 = 0;
        int var6 = Torquing.field_u;
        StringBuilder discarded$0 = param2.append(10);
        for (var5 = 0; var5 <= param0; var5++) {
            StringBuilder discarded$1 = param2.append(32);
        }
        if (param3 != -16493) {
            int discarded$2 = ((jh) this).d((byte) 53);
        }
        if (null != ((jh) this).field_C) {
            StringBuilder discarded$4 = ((jh) this).field_C.a(param2, (byte) 117, param1, 1 + param0);
        } else {
            StringBuilder discarded$5 = param2.append("null");
        }
    }

    StringBuilder a(StringBuilder param0, byte param1, Hashtable param2, int param3) {
        if (((jh) this).a(param1 ^ -31757, param0, param2, param3)) {
            ((jh) this).a(param0, param3, true, param2);
            ((jh) this).a(param3, param2, param0, -16493);
        }
        if (param1 != 117) {
            ((jh) this).c((byte) 28);
        }
        return param0;
    }

    void a(int param0, gm param1, int param2, int param3) {
        int var5 = -52 / ((param0 - -28) / 43);
        super.a(26, param1, param2, param3);
        if (!(null == ((jh) this).field_C)) {
            ((jh) this).field_C.a(27, param1, ((jh) this).field_k + param2, param3 - -((jh) this).field_w);
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        super.a((byte) -59, param1, param2, param3, param4);
        ((jh) this).f((byte) 112);
        int var6 = 2 / ((66 - param0) / 57);
    }

    gm a(boolean param0) {
        if (!param0) {
            field_B = null;
        }
        gm var2 = ((jh) this).field_C;
        if (var2 == null) {
            return null;
        }
        if (!(!var2.g(2))) {
            return var2;
        }
        return null;
    }

    jh(int param0, int param1, int param2, int param3, el param4, ca param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    void a(int param0, byte param1, int param2, int param3) {
        if (param0 == 0) {
            if (!(((jh) this).field_q == null)) {
                ((jh) this).field_q.a(108, param2, param3, true, (gm) this);
            }
        }
        if (!(((jh) this).field_C == null)) {
            ((jh) this).field_C.a(param0, (byte) -107, ((jh) this).field_k + param2, param3 + ((jh) this).field_w);
        }
        if (param1 > -7) {
            Object var6 = null;
            boolean discarded$0 = this.a(-5, (gm) null);
        }
    }

    final int d(byte param0) {
        if (param0 != 28) {
            return -20;
        }
        return ((jh) this).field_C == null ? 0 : ((jh) this).field_C.d((byte) 28);
    }

    final void c(byte param0) {
        if (param0 < 89) {
            return;
        }
        if (((jh) this).field_C != null) {
            ((jh) this).field_C.c((byte) 125);
        }
    }

    final boolean g(int param0) {
        if (param0 != 2) {
            ((jh) this).c((byte) -59);
        }
        return ((jh) this).a(true) != null ? true : false;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, gm param5, byte param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param6 >= 5) {
            break L0;
          } else {
            field_A = -64;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((jh) this).field_C == null) {
              break L2;
            } else {
              if (!((jh) this).field_C.a(param0, ((jh) this).field_w + param1, ((jh) this).field_k + param2, param3, param4, param5, (byte) 100)) {
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

    private final boolean a(int param0, gm param1) {
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          L1: {
            var3 = -115 % ((41 - param0) / 37);
            if (((jh) this).field_C == null) {
              break L1;
            } else {
              if (((jh) this).field_C.g(2)) {
                break L1;
              } else {
                if (!((jh) this).field_C.a(param1, false)) {
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

    final static void a(wl param0, int param1) {
        if (param1 != 0) {
            field_y = null;
        }
        np.a(param0, true, 126);
    }

    void a(int param0, int param1, int param2, byte param3, gm param4, int param5) {
        if (param3 <= 109) {
            return;
        }
        if (((jh) this).field_C != null) {
            ((jh) this).field_C.a(((jh) this).field_k + param0, param1 - -((jh) this).field_w, param2, (byte) 119, param4, param5);
        }
    }

    String b(int param0) {
        String var3 = null;
        String var2 = super.b(param0);
        if (!(null == ((jh) this).field_C)) {
            var3 = ((jh) this).field_C.b(0);
            if (!(var3 == null)) {
                return var3;
            }
        }
        return var2;
    }

    final boolean a(int param0, gm param1, char param2, int param3) {
        if (null != ((jh) this).field_C) {
            if (((jh) this).field_C.g(2)) {
                if (((jh) this).field_C.a(param0, param1, param2, -123)) {
                    return true;
                }
            }
        }
        int var5 = param0;
        if ((var5 ^ -1) == -81) {
            return i.field_P[81] ? this.a((byte) -69, param1) : this.a(119, param1);
        }
        var5 = 65 % ((-33 - param3) / 57);
        return false;
    }

    public static void a(byte param0) {
        int var1 = 13 % ((-49 - param0) / 33);
        field_y = null;
        field_B = null;
        field_x = null;
    }

    final boolean a(int param0, boolean param1, int param2, int param3, gm param4, int param5, int param6) {
        Object var9 = null;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (!param1) {
            break L0;
          } else {
            var9 = null;
            boolean discarded$2 = ((jh) this).a(1, false, 78, 35, (gm) null, 4, 60);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((jh) this).field_C) {
              break L2;
            } else {
              if (!((jh) this).field_C.g(2)) {
                break L2;
              } else {
                if (!((jh) this).field_C.a(param0, false, param2, param3, param4, param5, param6)) {
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

    final boolean a(gm param0, boolean param1) {
        Object var4 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (!param1) {
            break L0;
          } else {
            var4 = null;
            jh.a((wl) null, -33);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((jh) this).field_C == null) {
              break L2;
            } else {
              if (!((jh) this).field_C.a(param0, false)) {
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

    private final boolean a(byte param0, gm param1) {
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          L1: {
            var3 = -1 / ((-15 - param0) / 54);
            if (null == ((jh) this).field_C) {
              break L1;
            } else {
              if (((jh) this).field_C.g(2)) {
                break L1;
              } else {
                if (!((jh) this).field_C.a(param1, false)) {
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

    void f(byte param0) {
        if (!(((jh) this).field_C == null)) {
            ((jh) this).field_C.e((byte) 88);
        }
        if (param0 <= 103) {
            Object var3 = null;
            ((jh) this).a(-121, (gm) null, 8, -63);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new ei();
    }
}
