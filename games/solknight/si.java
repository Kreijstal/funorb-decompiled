/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class si extends rc implements oh {
    rc field_G;
    static pc field_C;
    static int field_E;
    static String field_D;
    static int field_B;
    static int[] field_F;
    static int field_A;

    String c(byte param0) {
        String var3 = null;
        if (param0 <= 14) {
            field_E = -28;
        }
        String var2 = super.c((byte) 89);
        if (!(((si) this).field_G == null)) {
            var3 = ((si) this).field_G.c((byte) 72);
            if (var3 != null) {
                return var3;
            }
        }
        return var2;
    }

    final void g(int param0) {
        if (((si) this).field_G != null) {
            ((si) this).field_G.g(0);
        }
        if (param0 != 0) {
            ((si) this).field_G = null;
        }
    }

    final void a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        int var5 = 0;
        int var6 = SolKnight.field_L ? 1 : 0;
        StringBuilder discarded$5 = param1.append(10);
        if (param3 != -19156) {
            return;
        }
        for (var5 = 0; var5 <= param2; var5++) {
            StringBuilder discarded$6 = param1.append(32);
        }
        if (null != ((si) this).field_G) {
            StringBuilder discarded$8 = ((si) this).field_G.a(-62, param0, param1, 1 + param2);
        } else {
            StringBuilder discarded$9 = param1.append("null");
        }
    }

    final boolean a(char param0, byte param1, int param2, rc param3) {
        if (null != ((si) this).field_G) {
            if (((si) this).field_G.b(true)) {
                if (!(!((si) this).field_G.a(param0, (byte) 127, param2, param3))) {
                    return true;
                }
            }
        }
        int var5 = 122 / ((31 - param1) / 56);
        int var6 = param2;
        if ((var6 ^ -1) != -81) {
            return false;
        }
        return !fh.field_d[81] ? this.b(32, param3) : this.a(param3, -125);
    }

    rc h(int param0) {
        if (param0 != 0) {
            int discarded$0 = ((si) this).f(-42);
        }
        rc var2 = ((si) this).field_G;
        if (var2 == null) {
            return null;
        }
        if (!var2.b(true)) {
            return null;
        }
        return var2;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param3 == param1) {
            if (!(null == ((si) this).field_w)) {
                ((si) this).field_w.a((byte) 118, param0, true, param2, (rc) this);
            }
        }
        if (((si) this).field_G != null) {
            ((si) this).field_G.a(param0 - -((si) this).field_j, param1, param2 - -((si) this).field_m, 0);
        }
    }

    public static void i(int param0) {
        if (param0 < 122) {
            Object var2 = null;
            ol discarded$0 = si.a((da) null, (String) null, true, (String) null, (da) null);
        }
        field_F = null;
        field_D = null;
        field_C = null;
    }

    si(int param0, int param1, int param2, int param3, j param4, dg param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    private final boolean b(int param0, rc param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == 32) {
            break L0;
          } else {
            ((si) this).field_G = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((si) this).field_G) {
              break L2;
            } else {
              if (((si) this).field_G.b(true)) {
                break L2;
              } else {
                if (!((si) this).field_G.a(param0 ^ -1431, param1)) {
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

    boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (!param2) {
          L0: {
            L1: {
              if (null == ((si) this).field_G) {
                break L1;
              } else {
                if (!((si) this).field_G.a(param0, param1 + ((si) this).field_m, param2, param3, param4, param5 + ((si) this).field_j, param6)) {
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

    final static int a(mb param0, mb param1, int param2) {
        if (param2 >= -75) {
            Object var4 = null;
            int discarded$0 = si.a((mb) null, (mb) null, -96);
        }
        Object var5 = null;
        return vb.a(0, 0, false, (String) null, param0, param1, -21760);
    }

    final int f(int param0) {
        int var2 = 101 % ((17 - param0) / 43);
        return null == ((si) this).field_G ? 0 : ((si) this).field_G.f(-124);
    }

    void a(int param0) {
        if (param0 >= -102) {
            field_B = 1;
        }
        if (((si) this).field_G != null) {
            ((si) this).field_G.d(1);
        }
    }

    final boolean a(int param0, rc param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -1463) {
            break L0;
          } else {
            field_C = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((si) this).field_G == null) {
              break L2;
            } else {
              if (!((si) this).field_G.a(-1463, param1)) {
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

    final static ol a(da param0, String param1, boolean param2, String param3, da param4) {
        if (!param2) {
            return null;
        }
        int var5 = param4.c(91, param1);
        int var6 = param4.a(param3, -1, var5);
        return cd.a(param4, var6, var5, true, param0);
    }

    final static void a(int param0, byte param1, int param2, int param3, gb param4) {
        param4.c(-115, 12);
        param4.a(true, 17);
        if (param1 != 22) {
            field_B = -110;
        }
        param4.a(true, param3);
        param4.a(true, param0);
        param4.c(-119, param2);
    }

    void a(int param0, int param1, int param2, rc param3) {
        super.a(param0, param1, param2, param3);
        if (!(((si) this).field_G == null)) {
            ((si) this).field_G.a(param0 + ((si) this).field_m, 18874, param2 + ((si) this).field_j, param3);
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3 ^ param3, param4);
        ((si) this).a(-126);
    }

    void a(int param0, int param1, rc param2, int param3, int param4, int param5) {
        if (((si) this).field_G != null) {
            ((si) this).field_G.a(param0, param1 + 0, param2, param3 - -((si) this).field_j, param4, ((si) this).field_m + param5);
        }
        if (param1 != 0) {
            Object var8 = null;
            boolean discarded$0 = this.b(-57, (rc) null);
        }
    }

    private final boolean a(rc param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param1 < -23) {
            break L0;
          } else {
            ((si) this).a(93, -58, -93, 34);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((si) this).field_G) {
              break L2;
            } else {
              if (((si) this).field_G.b(true)) {
                break L2;
              } else {
                if (!((si) this).field_G.a(-1463, param0)) {
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

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        if (param0 >= -41) {
            return null;
        }
        if (!(!((si) this).a(param2, -1, param1, param3))) {
            ((si) this).b(param2, 77, param1, param3);
            ((si) this).a(param1, param2, param3, -19156);
        }
        return param2;
    }

    final boolean b(boolean param0) {
        if (!param0) {
            field_D = null;
        }
        return ((si) this).h(0) != null ? true : false;
    }

    final boolean a(int param0, rc param1, int param2, int param3, int param4, int param5, byte param6) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param6 > 33) {
            break L0;
          } else {
            field_F = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((si) this).field_G) {
              break L2;
            } else {
              if (!((si) this).field_G.b(true)) {
                break L2;
              } else {
                if (!((si) this).field_G.a(param0, param1, param2, param3, param4, param5, (byte) 123)) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new pc();
        field_D = "Click";
        field_F = new int[10];
        field_B = 0;
    }
}
