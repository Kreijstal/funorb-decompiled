/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ak extends lk implements ik {
    lk field_x;
    static volatile int field_y;
    static String field_w;
    static int field_z;

    void a(int param0, int param1, int param2, int param3) {
        if (param2 <= 33) {
            return;
        }
        if (0 == param0) {
            if (null != ((ak) this).field_j) {
                ((ak) this).field_j.a(param1, (lk) this, (byte) 5, true, param3);
            }
        }
        if (!(((ak) this).field_x == null)) {
            ((ak) this).field_x.a(param0, ((ak) this).field_i + param1, 56, ((ak) this).field_r + param3);
        }
    }

    public static void h(int param0) {
        field_w = null;
        if (param0 < 118) {
            ak.h(-55);
        }
    }

    final boolean a(lk param0, boolean param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (!param1) {
          L0: {
            L1: {
              if (((ak) this).field_x == null) {
                break L1;
              } else {
                if (!((ak) this).field_x.a(param0, param1)) {
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

    private final boolean a(lk param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param1 >= 101) {
            break L0;
          } else {
            field_z = -78;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((ak) this).field_x == null) {
              break L2;
            } else {
              if (((ak) this).field_x.e(1)) {
                break L2;
              } else {
                if (!((ak) this).field_x.a(param0, false)) {
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

    final boolean e(int param0) {
        if (param0 != 1) {
            field_w = null;
        }
        return null != ((ak) this).a(0) ? true : false;
    }

    final static String a(int param0, String param1, String param2, String param3) {
        int var5 = Bounce.field_N;
        if (param0 <= 12) {
            return null;
        }
        int var4 = param3.indexOf(param1);
        while (-1 != var4) {
            param3 = param3.substring(0, var4) + param2 + param3.substring(var4 + param1.length());
            var4 = param3.indexOf(param1, param2.length() + var4);
        }
        return param3;
    }

    boolean a(int param0, lk param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param4 == 28455) {
            break L0;
          } else {
            boolean discarded$2 = ((ak) this).e(-72);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((ak) this).field_x == null) {
              break L2;
            } else {
              if (!((ak) this).field_x.a(param0, param1, param2 + ((ak) this).field_r, param3, 28455, param5, param6 - -((ak) this).field_i)) {
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

    ak(int param0, int param1, int param2, int param3, fc param4, sk param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    lk a(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            ((ak) this).a(122, 60, (lk) null, 29, -123, -17);
        }
        lk var2 = ((ak) this).field_x;
        if (var2 == null) {
            return null;
        }
        if (!var2.e(param0 ^ 1)) {
            return null;
        }
        return var2;
    }

    void a(int param0, int param1, int param2, lk param3) {
        super.a(param0, param1, param2, param3);
        if (!(null == ((ak) this).field_x)) {
            ((ak) this).field_x.a(-1, param1 + ((ak) this).field_r, ((ak) this).field_i + param2, param3);
        }
    }

    String d(int param0) {
        String var3 = null;
        String var2 = super.d(param0);
        if (!(null == ((ak) this).field_x)) {
            var3 = ((ak) this).field_x.d(0);
            if (var3 != null) {
                return var3;
            }
        }
        return var2;
    }

    final void c(byte param0) {
        if (!(((ak) this).field_x == null)) {
            ((ak) this).field_x.c((byte) 98);
        }
        if (param0 <= 80) {
            field_z = 38;
        }
    }

    final void a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        int var5 = 0;
        int var6 = Bounce.field_N;
        StringBuilder discarded$5 = param3.append(10);
        if (param1 != 12) {
            Object var7 = null;
            ((ak) this).a(-7, -32, -97, (lk) null);
        }
        for (var5 = 0; var5 <= param2; var5++) {
            StringBuilder discarded$6 = param3.append(32);
        }
        if (null != ((ak) this).field_x) {
            StringBuilder discarded$8 = ((ak) this).field_x.a(1 + param2, true, param0, param3);
        } else {
            StringBuilder discarded$9 = param3.append("null");
        }
    }

    StringBuilder a(int param0, boolean param1, Hashtable param2, StringBuilder param3) {
        if (!param1) {
            return null;
        }
        if (!(!((ak) this).a(param2, param3, (byte) 14, param0))) {
            ((ak) this).a(param0, param3, param2, 32362);
            ((ak) this).a(param2, (byte) 12, param0, param3);
        }
        return param3;
    }

    void a(int param0, int param1, lk param2, int param3, int param4, int param5) {
        if (((ak) this).field_x != null) {
            ((ak) this).field_x.a(param0, param1 - -((ak) this).field_r, param2, param3 + ((ak) this).field_i, 34, param5);
        }
        if (param4 != 34) {
            Object var8 = null;
            StringBuilder discarded$0 = ((ak) this).a(59, true, (Hashtable) null, (StringBuilder) null);
        }
    }

    final boolean a(lk param0, char param1, int param2, int param3) {
        if (param3 != -14565) {
            field_w = null;
        }
        if (null != ((ak) this).field_x) {
            if (((ak) this).field_x.e(1)) {
                if (!(!((ak) this).field_x.a(param0, param1, param2, param3 ^ 0))) {
                    return true;
                }
            }
        }
        int var5 = param2;
        if (-81 != (var5 ^ -1)) {
            return false;
        }
        return ng.field_a[81] ? this.a(param0, param3 + 14675) : this.a(true, param0);
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, lk param5, boolean param6) {
        Object var9 = null;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param6) {
            break L0;
          } else {
            var9 = null;
            ((ak) this).a(27, 100, (lk) null, 64, 123, -58);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((ak) this).field_x) {
              break L2;
            } else {
              if (!((ak) this).field_x.e(1)) {
                break L2;
              } else {
                if (!((ak) this).field_x.a(param0, param1, param2, param3, param4, param5, true)) {
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

    final int f(int param0) {
        if (param0 != 0) {
            ((ak) this).field_x = null;
        }
        return ((ak) this).field_x != null ? ((ak) this).field_x.f(0) : 0;
    }

    private final boolean a(boolean param0, lk param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            ((ak) this).field_x = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((ak) this).field_x == null) {
              break L2;
            } else {
              if (((ak) this).field_x.e(1)) {
                break L2;
              } else {
                if (!((ak) this).field_x.a(param1, false)) {
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

    void i(int param0) {
        if (param0 > -21) {
            field_z = 102;
        }
        if (!(null == ((ak) this).field_x)) {
            ((ak) this).field_x.g(11213);
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1 ^ 0, param2, param3, param4);
        ((ak) this).i(-46);
        if (param1 != 80) {
            int discarded$0 = ((ak) this).f(-100);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = -1;
        field_y = 0;
    }
}
