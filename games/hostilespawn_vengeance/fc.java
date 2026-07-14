/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class fc extends ag implements ai {
    static String field_y;
    static int field_z;
    ag field_A;

    boolean a(int param0, int param1, int param2, int param3, byte param4, ag param5, int param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param4 == 110) {
            break L0;
          } else {
            ((fc) this).j(72);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((fc) this).field_A == null) {
              break L2;
            } else {
              if (!((fc) this).field_A.a(param0, param1 + ((fc) this).field_v, ((fc) this).field_m + param2, param3, (byte) 110, param5, param6)) {
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

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((fc) this).j(80);
    }

    private final boolean b(ag param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param1 == 10) {
            break L0;
          } else {
            field_z = 26;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((fc) this).field_A) {
              break L2;
            } else {
              if (((fc) this).field_A.g(param1 ^ -9021)) {
                break L2;
              } else {
                if (!((fc) this).field_A.a((byte) -92, param0)) {
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

    String e(int param0) {
        String var3 = null;
        String var2 = super.e((int) (char)param0);
        if (!(((fc) this).field_A == null)) {
            var3 = ((fc) this).field_A.e(34);
            if (var3 != null) {
                return var3;
            }
        }
        return var2;
    }

    final static boolean i(int param0) {
        if (param0 != -1) {
            field_z = -85;
        }
        return la.a(bn.c(-1), 10295);
    }

    final boolean g(int param0) {
        if (param0 != -9015) {
            fc.h(-9);
        }
        return null != ((fc) this).a((byte) -83) ? true : false;
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (param2 <= 42) {
            Object var6 = null;
            boolean discarded$0 = ((fc) this).a((byte) 70, (ag) null);
        }
        if (param3 == 0) {
            if (!(null == ((fc) this).field_h)) {
                ((fc) this).field_h.a(param0, param1, 15430, (ag) this, true);
            }
        }
        if (((fc) this).field_A != null) {
            ((fc) this).field_A.a(param0 + ((fc) this).field_m, ((fc) this).field_v + param1, (byte) 104, param3);
        }
    }

    final void c(byte param0) {
        int var2 = 53 / ((-27 - param0) / 39);
        if (((fc) this).field_A != null) {
            ((fc) this).field_A.c((byte) 59);
        }
    }

    fc(int param0, int param1, int param2, int param3, nn param4, mh param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    private final boolean a(ag param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param1 < -123) {
          L0: {
            L1: {
              if (null == ((fc) this).field_A) {
                break L1;
              } else {
                if (((fc) this).field_A.g(-9015)) {
                  break L1;
                } else {
                  if (!((fc) this).field_A.a((byte) -120, param0)) {
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

    ag a(byte param0) {
        ag var2 = ((fc) this).field_A;
        if (param0 != -83) {
            return null;
        }
        if (var2 == null) {
            return null;
        }
        if (!var2.g(-9015)) {
            return null;
        }
        return var2;
    }

    final boolean a(int param0, int param1, int param2, int param3, ag param4, int param5, int param6) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param3 == 0) {
            break L0;
          } else {
            ((fc) this).field_A = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((fc) this).field_A) {
              break L2;
            } else {
              if (!((fc) this).field_A.g(param3 + -9015)) {
                break L2;
              } else {
                if (!((fc) this).field_A.a(param0, param1, param2, 0, param4, param5, param6)) {
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

    public static void h(int param0) {
        field_y = null;
        if (param0 != 1) {
            field_z = 55;
        }
    }

    void a(ag param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2 ^ param2, param3);
        if (null != ((fc) this).field_A) {
            ((fc) this).field_A.a(param0, param1 - -((fc) this).field_m, 0, ((fc) this).field_v + param3);
        }
    }

    void a(int param0, int param1, int param2, int param3, ag param4, int param5) {
        if (((fc) this).field_A != null) {
            ((fc) this).field_A.a(param0, ((fc) this).field_m + param1, param2 + ((fc) this).field_v, param3, param4, 0);
        }
        if (param5 != 0) {
            Object var8 = null;
            boolean discarded$0 = this.a((ag) null, 65);
        }
    }

    StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        if (!(!((fc) this).a(param3, param2, false, param1))) {
            ((fc) this).a(param2, param1, param3, 79);
            ((fc) this).a(-113, param2, param1, param3);
        }
        if (param0 < 73) {
            ag discarded$0 = ((fc) this).a((byte) 74);
        }
        return param3;
    }

    void j(int param0) {
        if (null != ((fc) this).field_A) {
            ((fc) this).field_A.c(0);
        }
        if (param0 != 80) {
            ag discarded$0 = ((fc) this).a((byte) 100);
        }
    }

    final void a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        int var5 = 0;
        int var6 = HostileSpawn.field_I ? 1 : 0;
        StringBuilder discarded$0 = param3.append(10);
        for (var5 = 0; var5 <= param1; var5++) {
            StringBuilder discarded$1 = param3.append(32);
        }
        if (param0 > -16) {
            ((fc) this).field_A = null;
        }
        if (((fc) this).field_A != null) {
            StringBuilder discarded$3 = ((fc) this).field_A.a(109, param2, 1 + param1, param3);
        } else {
            StringBuilder discarded$4 = param3.append("null");
        }
    }

    final boolean a(byte param0, ag param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 < 0) {
          L0: {
            L1: {
              if (((fc) this).field_A == null) {
                break L1;
              } else {
                if (!((fc) this).field_A.a((byte) -100, param1)) {
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

    final boolean a(int param0, ag param1, int param2, char param3) {
        if (param0 != 274) {
            return true;
        }
        if (((fc) this).field_A != null) {
            if (((fc) this).field_A.g(param0 + -9289)) {
                if (((fc) this).field_A.a(274, param1, param2, param3)) {
                    return true;
                }
            }
        }
        int var5 = param2;
        if (80 == var5) {
            return qh.field_m[81] ? this.a(param1, param0 ^ -362) : this.b(param1, 10);
        }
        return false;
    }

    final int f(int param0) {
        if (param0 != 0) {
            return -103;
        }
        return ((fc) this).field_A == null ? 0 : ((fc) this).field_A.f(param0 + 0);
    }

    static {
    }
}
