/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class kj extends pj implements c {
    pj field_y;
    static String field_z;
    static gj field_x;

    void a(int param0, int param1, int param2, int param3) {
        if (param2 != 1048575) {
            Object var6 = null;
            boolean discarded$0 = ((kj) this).a((byte) -108, (pj) null, 80, 49, -111, 20, 18);
        }
        if (-1 == (param1 ^ -1)) {
            if (((kj) this).field_j != null) {
                ((kj) this).field_j.a(param0, param3, (pj) this, -4394, true);
            }
        }
        if (null != ((kj) this).field_y) {
            ((kj) this).field_y.a(param0 - -((kj) this).field_n, param1, param2 + 0, param3 + ((kj) this).field_s);
        }
    }

    public static void a(byte param0) {
        if (param0 < 56) {
            return;
        }
        field_z = null;
        field_x = null;
    }

    void b(byte param0) {
        int var2 = 23 / ((param0 - 55) / 49);
        if (!(((kj) this).field_y == null)) {
            ((kj) this).field_y.c(-26385);
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4, int param5, pj param6) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (!param0) {
          L0: {
            L1: {
              if (((kj) this).field_y == null) {
                break L1;
              } else {
                if (!((kj) this).field_y.d(-81)) {
                  break L1;
                } else {
                  if (!((kj) this).field_y.a(false, param1, param2, param3, param4, param5, param6)) {
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

    final static void i(int param0) {
        int var1 = 0;
        if ((ij.field_g ^ -1) >= -33) {
            ia.b(0, -23235);
        } else {
            var1 = ij.field_g % 32;
            if (var1 == 0) {
                var1 = 32;
            }
            ia.b(ij.field_g - var1, -23235);
        }
        var1 = 2 / ((param0 - 56) / 41);
    }

    kj(int param0, int param1, int param2, int param3, td param4, ag param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    String g(int param0) {
        String var3 = null;
        String var2 = super.g(param0);
        if (!(null == ((kj) this).field_y)) {
            var3 = ((kj) this).field_y.g(-8235);
            if (!(var3 == null)) {
                return var3;
            }
        }
        return var2;
    }

    final void h(int param0) {
        if (null != ((kj) this).field_y) {
            ((kj) this).field_y.h(0);
        }
        if (param0 != 0) {
            Object var3 = null;
            ((kj) this).a(-33, 14, (byte) 60, (pj) null, 79, -69);
        }
    }

    boolean a(byte param0, pj param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < -115) {
            break L0;
          } else {
            String discarded$2 = ((kj) this).g(-12);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((kj) this).field_y) {
              break L2;
            } else {
              if (!((kj) this).field_y.a((byte) -125, param1, param2, param3 + ((kj) this).field_s, param4, param5, ((kj) this).field_n + param6)) {
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

    final int f(int param0) {
        if (param0 != -20598) {
            return 86;
        }
        return null == ((kj) this).field_y ? 0 : ((kj) this).field_y.f(param0 ^ 0);
    }

    final static void j(int param0) {
        o.d(-1);
        il.a(param0, 0);
    }

    void a(int param0, int param1, byte param2, pj param3, int param4, int param5) {
        if (!(null == ((kj) this).field_y)) {
            ((kj) this).field_y.a(param0 + ((kj) this).field_n, param1, (byte) -128, param3, ((kj) this).field_s + param4, param5);
        }
        if (param2 > -91) {
            String discarded$0 = ((kj) this).g(-88);
        }
    }

    final boolean a(char param0, int param1, pj param2, int param3) {
        if (((kj) this).field_y != null) {
            if (((kj) this).field_y.d(-81)) {
                if (((kj) this).field_y.a(param0, param1, param2, 0)) {
                    return true;
                }
            }
        }
        int var5 = param1;
        if (!(var5 != 80)) {
            return !ek.field_a[81] ? this.b(8740, param2) : this.a((byte) -110, param2);
        }
        if (param3 != 0) {
            return true;
        }
        return false;
    }

    StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        if (((kj) this).a(9882, param3, param2, param1)) {
            ((kj) this).a(param2, (byte) -98, param1, param3);
            ((kj) this).a(param3, param2, -19956, param1);
        }
        if (param0 >= -23) {
            field_x = null;
        }
        return param3;
    }

    private final boolean b(int param0, pj param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == 8740) {
            break L0;
          } else {
            field_x = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((kj) this).field_y == null) {
              break L2;
            } else {
              if (((kj) this).field_y.d(-81)) {
                break L2;
              } else {
                if (!((kj) this).field_y.a(-81, param1)) {
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

    final void a(StringBuilder param0, int param1, int param2, Hashtable param3) {
        int var5 = 0;
        int var6 = OrbDefence.field_D ? 1 : 0;
        if (param2 != -19956) {
            return;
        }
        StringBuilder discarded$0 = param0.append(10);
        for (var5 = 0; var5 <= param1; var5++) {
            StringBuilder discarded$1 = param0.append(32);
        }
        if (((kj) this).field_y != null) {
            StringBuilder discarded$3 = ((kj) this).field_y.a((byte) -61, param3, 1 + param1, param0);
        } else {
            StringBuilder discarded$4 = param0.append("null");
        }
    }

    private final boolean a(byte param0, pj param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 <= -59) {
          L0: {
            L1: {
              if (((kj) this).field_y == null) {
                break L1;
              } else {
                if (((kj) this).field_y.d(-81)) {
                  break L1;
                } else {
                  if (!((kj) this).field_y.a(-81, param1)) {
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

    void a(byte param0, pj param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (!(((kj) this).field_y == null)) {
            ((kj) this).field_y.a((byte) -77, param1, param2 - -((kj) this).field_s, ((kj) this).field_n + param3);
        }
    }

    final boolean d(int param0) {
        if (param0 != -81) {
            field_x = null;
        }
        return ((kj) this).c(false) != null ? true : false;
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((kj) this).b((byte) 127);
    }

    pj c(boolean param0) {
        pj var2 = ((kj) this).field_y;
        if (var2 != null) {
            if (!(!var2.d(-81))) {
                return var2;
            }
        }
        if (!param0) {
            return null;
        }
        return null;
    }

    final static void a(hj param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        pa.field_d = param8;
        ok.field_f = param4;
        qb.field_c = param3;
        ld.field_a = param5;
        ba.field_c = param7;
        if (param2 != 45) {
            kj.a((byte) -79);
        }
        qf.field_m = param1;
        vg.field_l = param6;
        pf.field_b = param0;
    }

    final boolean a(int param0, pj param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -81) {
            break L0;
          } else {
            field_x = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((kj) this).field_y == null) {
              break L2;
            } else {
              if (!((kj) this).field_y.a(param0 + 0, param1)) {
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
        field_z = "Loading graphics";
        field_x = null;
    }
}
