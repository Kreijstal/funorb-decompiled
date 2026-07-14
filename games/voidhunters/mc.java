/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class mc extends shb implements nea {
    shb field_t;
    static int field_u;

    final int c(int param0) {
        if (param0 != 0) {
            field_u = 110;
        }
        return null == ((mc) this).field_t ? 0 : ((mc) this).field_t.c(0);
    }

    boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param6 < -17) {
            break L0;
          } else {
            field_u = -57;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((mc) this).field_t == null) {
              break L2;
            } else {
              if (!((mc) this).field_t.a(param0, ((mc) this).field_g + param1, param2, param3, param4, param5 - -((mc) this).field_r, (byte) -109)) {
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

    String d(byte param0) {
        String var3 = null;
        String var2 = super.d(param0);
        if (null != ((mc) this).field_t) {
            var3 = ((mc) this).field_t.d((byte) 125);
            if (var3 != null) {
                return var3;
            }
        }
        return var2;
    }

    final boolean a(int param0, shb param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (((mc) this).field_t == null) {
                break L1;
              } else {
                if (!((mc) this).field_t.a(param0 ^ 0, param1)) {
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

    final boolean e(byte param0) {
        if (param0 != -120) {
            return true;
        }
        return ((mc) this).d(param0 ^ -6075) != null ? true : false;
    }

    void a(int param0, int param1, int param2, shb param3) {
        super.a(param0, param1, param2, param3);
        if (!(null == ((mc) this).field_t)) {
            ((mc) this).field_t.a(((mc) this).field_r + param0, ((mc) this).field_g + param1, param2 + 0, param3);
        }
    }

    final static void a(int param0, boolean param1) {
        if (!(-1 <= (lia.field_b ^ -1))) {
            if (!(!bv.field_d)) {
                dma.e(0, 0, dma.field_g, hca.field_o.field_u);
                dd.field_o.b(param1, 45);
            }
        }
        if (param0 >= -117) {
            Object var3 = null;
            mc.a((ml) null, -56);
        }
        if (-1 <= (nf.field_a ^ -1)) {
            // ifle L114
        }
        if (wo.field_o) {
            dma.e(0, 0, dma.field_g, hca.field_o.field_u);
            jfb.field_o.b(param1, -91);
        }
    }

    final static void a(ml param0, int param1) {
        param0.a(1, 2, new ml(13));
        param0.a(param1 ^ 26, 8, new ml(13));
        param0.a(1, 11, new ml(13));
        param0.a(1, 4, new ml(25));
        param0.a(1, 6, new ml(25));
        param0.a(1, 5, new ml(25));
        ml var3 = new ml(29);
        var3.a(1, 0, new ml(27));
        var3.a(1, 1, new ml(13));
        param0.a(1, 0, var3);
        ml var4 = new ml(29);
        var4.a(1, 0, new ml(param1));
        var4.a(1, 2, new ml(13));
        param0.a(1, 10, var4);
    }

    void a(int param0) {
        int var2 = -14 % ((param0 - -80) / 42);
        if (!(null == ((mc) this).field_t)) {
            ((mc) this).field_t.a(false);
        }
    }

    StringBuilder a(boolean param0, Hashtable param1, int param2, StringBuilder param3) {
        if (((mc) this).a(param1, param2, (byte) 115, param3)) {
            ((mc) this).a(71, param2, param1, param3);
            ((mc) this).a(param2, 13, param3, param1);
        }
        if (param0) {
            ((mc) this).field_t = null;
        }
        return param3;
    }

    void a(byte param0, int param1, int param2, int param3, shb param4, int param5) {
        if (null != ((mc) this).field_t) {
            ((mc) this).field_t.a((byte) 122, param1 + ((mc) this).field_g, param2, ((mc) this).field_r + param3, param4, param5);
        }
        int var7 = -98 % ((52 - param0) / 52);
    }

    void b(int param0, int param1, int param2, int param3) {
        if (param2 <= 47) {
            shb discarded$0 = ((mc) this).d(-117);
        }
        if (0 == param1) {
            if (!(null == ((mc) this).field_q)) {
                ((mc) this).field_q.a(103, (shb) this, param0, param3, true);
            }
        }
        if (!(null == ((mc) this).field_t)) {
            ((mc) this).field_t.b(((mc) this).field_g + param0, param1, 127, param3 - -((mc) this).field_r);
        }
    }

    private final boolean b(int param0, shb param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 < -83) {
            break L0;
          } else {
            boolean discarded$2 = ((mc) this).e((byte) 65);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((mc) this).field_t) {
              break L2;
            } else {
              if (((mc) this).field_t.e((byte) -120)) {
                break L2;
              } else {
                if (!((mc) this).field_t.a(0, param1)) {
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

    final void a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        StringBuilder discarded$0 = param2.append(10);
        for (var5 = 0; var5 <= param0; var5++) {
            StringBuilder discarded$1 = param2.append(32);
        }
        if (null == ((mc) this).field_t) {
            StringBuilder discarded$3 = param2.append("null");
        } else {
            StringBuilder discarded$4 = ((mc) this).field_t.a(false, param3, param0 - -1, param2);
        }
        if (param1 != 13) {
            ((mc) this).field_t = null;
        }
    }

    private final boolean a(byte param0, shb param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == -47) {
            break L0;
          } else {
            field_u = 81;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((mc) this).field_t) {
              break L2;
            } else {
              if (((mc) this).field_t.e((byte) -120)) {
                break L2;
              } else {
                if (!((mc) this).field_t.a(0, param1)) {
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

    final boolean a(int param0, int param1, shb param2, char param3) {
        if (param0 != -15834) {
            Object var6 = null;
            boolean discarded$0 = ((mc) this).a(-72, 29, -110, -50, (shb) null, 73, (byte) 9);
        }
        if (((mc) this).field_t != null) {
            if (((mc) this).field_t.e((byte) -120)) {
                if (!(!((mc) this).field_t.a(-15834, param1, param2, param3))) {
                    return true;
                }
            }
        }
        int var5 = param1;
        if ((var5 ^ -1) == -81) {
            return si.field_o[81] ? this.b(-125, param2) : this.a((byte) -47, param2);
        }
        return false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3 + 0, param4);
        ((mc) this).a(-124);
        if (param3 != 1) {
            field_u = 87;
        }
    }

    final void f(byte param0) {
        if (param0 != -34) {
            field_u = -111;
        }
        if (null != ((mc) this).field_t) {
            ((mc) this).field_t.f((byte) -34);
        }
    }

    mc(int param0, int param1, int param2, int param3, wwa param4, sba param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    shb d(int param0) {
        if (param0 != 6093) {
            ((mc) this).field_t = null;
        }
        shb var2 = ((mc) this).field_t;
        if (var2 == null) {
            return null;
        }
        if (!var2.e((byte) -120)) {
            return null;
        }
        return var2;
    }

    final boolean a(int param0, int param1, int param2, shb param3, int param4, int param5, int param6) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param1 == -6006) {
          L0: {
            L1: {
              if (null == ((mc) this).field_t) {
                break L1;
              } else {
                if (!((mc) this).field_t.e((byte) -120)) {
                  break L1;
                } else {
                  if (!((mc) this).field_t.a(param0, -6006, param2, param3, param4, param5, param6)) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = 5;
    }
}
