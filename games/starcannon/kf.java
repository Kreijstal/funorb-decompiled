/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class kf extends uj implements ch {
    static int field_v;
    uj field_t;
    static String field_u;

    public static void a(int param0) {
        if (param0 != 0) {
            field_v = 98;
        }
        field_u = null;
    }

    String d(int param0) {
        String var3 = null;
        String var2 = super.d(param0);
        if (!(null == ((kf) this).field_t)) {
            var3 = ((kf) this).field_t.d(12606);
            if (!(var3 == null)) {
                return var3;
            }
        }
        return var2;
    }

    kf(int param0, int param1, int param2, int param3, de param4, qg param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final int c(boolean param0) {
        if (param0) {
            return -44;
        }
        return null == ((kf) this).field_t ? 0 : ((kf) this).field_t.c(param0);
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 <= 115) {
            Object var7 = null;
            StringBuilder discarded$0 = ((kf) this).a((Hashtable) null, (StringBuilder) null, (byte) -25, 62);
        }
        super.a(param0, param1, (byte) 121, param3, param4);
        ((kf) this).f(-77);
    }

    final boolean a(uj param0, char param1, byte param2, int param3) {
        if (null != ((kf) this).field_t) {
            if (((kf) this).field_t.d(true)) {
                if (!(!((kf) this).field_t.a(param0, param1, (byte) -90, param3))) {
                    return true;
                }
            }
        }
        int var5 = param3;
        if (!((var5 ^ -1) != -81)) {
            return wc.field_c[81] ? this.b(-91, param0) : this.c(0, param0);
        }
        if (param2 != -90) {
            return false;
        }
        return false;
    }

    boolean a(uj param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param4 == -11) {
          L0: {
            L1: {
              if (((kf) this).field_t == null) {
                break L1;
              } else {
                if (!((kf) this).field_t.a(param0, param1, param2 + ((kf) this).field_s, ((kf) this).field_j + param3, (byte) -11, param5, param6)) {
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

    final boolean d(boolean param0) {
        if (!param0) {
            ((kf) this).field_t = null;
        }
        return null != ((kf) this).e(0) ? true : false;
    }

    private final boolean c(int param0, uj param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (null == ((kf) this).field_t) {
                break L1;
              } else {
                if (((kf) this).field_t.d(true)) {
                  break L1;
                } else {
                  if (!((kf) this).field_t.a(0, param1)) {
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

    final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        int var5 = 0;
        StringBuilder discarded$5 = param3.append(10);
        if (param2 != -349) {
            Object var6 = null;
            boolean discarded$6 = ((kf) this).a(-87, -65, -10, 79, (uj) null, 82, 123);
        }
        for (var5 = 0; var5 <= param1; var5++) {
            StringBuilder discarded$7 = param3.append(32);
        }
        if (null == ((kf) this).field_t) {
            StringBuilder discarded$9 = param3.append("null");
        } else {
            StringBuilder discarded$10 = ((kf) this).field_t.a(param0, param3, (byte) 39, 1 + param1);
        }
    }

    uj e(int param0) {
        if (param0 != 0) {
            field_u = null;
        }
        uj var2 = ((kf) this).field_t;
        if (var2 == null) {
            return null;
        }
        if (!(!var2.d(true))) {
            return var2;
        }
        return null;
    }

    void f(int param0) {
        int var2 = -121 / ((param0 - 47) / 52);
        if (!(((kf) this).field_t == null)) {
            ((kf) this).field_t.d((byte) -30);
        }
    }

    final boolean a(int param0, uj param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (null == ((kf) this).field_t) {
                break L1;
              } else {
                if (!((kf) this).field_t.a(0, param1)) {
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

    final boolean a(int param0, int param1, int param2, int param3, uj param4, int param5, int param6) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param6 == -81) {
            break L0;
          } else {
            field_u = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((kf) this).field_t) {
              break L2;
            } else {
              if (!((kf) this).field_t.d(true)) {
                break L2;
              } else {
                if (!((kf) this).field_t.a(param0, param1, param2, param3, param4, param5, -81)) {
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

    void a(int param0, int param1, int param2, uj param3, byte param4, int param5) {
        if (param4 != -22) {
            field_u = null;
        }
        if (null != ((kf) this).field_t) {
            ((kf) this).field_t.a(param0, param1 - -((kf) this).field_j, param2 + ((kf) this).field_s, param3, (byte) -22, param5);
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (0 == param0) {
            if (!(((kf) this).field_o == null)) {
                ((kf) this).field_o.a(param1, true, 122, param3, (uj) this);
            }
        }
        if (param2 != 49) {
            ((kf) this).field_t = null;
        }
        if (!(((kf) this).field_t == null)) {
            ((kf) this).field_t.a(param0, param1 - -((kf) this).field_s, (byte) 49, ((kf) this).field_j + param3);
        }
    }

    final void b(byte param0) {
        if (!(((kf) this).field_t == null)) {
            ((kf) this).field_t.b((byte) -101);
        }
        if (param0 >= -72) {
            String discarded$0 = ((kf) this).d(104);
        }
    }

    private final boolean b(int param0, uj param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 <= -88) {
            break L0;
          } else {
            field_u = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((kf) this).field_t) {
              break L2;
            } else {
              if (((kf) this).field_t.d(true)) {
                break L2;
              } else {
                if (!((kf) this).field_t.a(0, param1)) {
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

    void a(int param0, int param1, uj param2, int param3) {
        if (param0 < 27) {
            return;
        }
        super.a(87, param1, param2, param3);
        if (!(((kf) this).field_t == null)) {
            ((kf) this).field_t.a(89, ((kf) this).field_s + param1, param2, param3 - -((kf) this).field_j);
        }
    }

    StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        if (((kf) this).a(param0, 0, param1, param3)) {
            ((kf) this).a(param0, param1, param3, 19103);
            ((kf) this).a(param0, param3, param2 + -388, param1);
        }
        if (param2 != 39) {
            String discarded$0 = ((kf) this).d(-10);
        }
        return param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "To server list";
    }
}
