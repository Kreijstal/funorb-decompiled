/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class am extends fj implements hi {
    fj field_H;
    static int[] field_I;

    private final boolean a(fj param0, byte param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param1 == -42) {
            break L0;
          } else {
            ((am) this).field_H = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((am) this).field_H == null) {
              break L2;
            } else {
              if (((am) this).field_H.e((byte) 107)) {
                break L2;
              } else {
                if (!((am) this).field_H.a(param0, 418)) {
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

    void a(int param0, int param1, int param2, fj param3, int param4, int param5) {
        if (!(((am) this).field_H == null)) {
            ((am) this).field_H.a(-61, ((am) this).field_m + param1, param2, param3, param4, param5 - -((am) this).field_q);
        }
        if (param0 > -18) {
            Object var8 = null;
            boolean discarded$0 = ((am) this).a(-77, -117, (byte) 21, (fj) null, 34, -52, -69);
        }
    }

    StringBuilder a(StringBuilder param0, int param1, Hashtable param2, boolean param3) {
        if (param3) {
            ((am) this).f(-102);
        }
        if (!(!((am) this).a((byte) -13, param1, param2, param0))) {
            ((am) this).a(param0, param2, (byte) -63, param1);
            ((am) this).a(param2, 3803, param0, param1);
        }
        return param0;
    }

    void f(int param0) {
        if (param0 > -49) {
            Object var3 = null;
            String discarded$0 = am.a(-97, (CharSequence) null);
        }
        if (!(((am) this).field_H == null)) {
            ((am) this).field_H.d(60);
        }
    }

    final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        int var5 = 0;
        int var6 = Confined.field_J ? 1 : 0;
        StringBuilder discarded$5 = param2.append(10);
        if (param1 != 3803) {
            Object var7 = null;
            boolean discarded$6 = ((am) this).a((fj) null, 9);
        }
        for (var5 = 0; var5 <= param3; var5++) {
            StringBuilder discarded$7 = param2.append(32);
        }
        if (null != ((am) this).field_H) {
            StringBuilder discarded$9 = ((am) this).field_H.a(param2, param3 - -1, param0, false);
        } else {
            StringBuilder discarded$10 = param2.append("null");
        }
    }

    fj a(byte param0) {
        if (param0 != -110) {
            ((am) this).field_H = null;
        }
        fj var2 = ((am) this).field_H;
        if (var2 == null) {
            return null;
        }
        if (!(!var2.e((byte) 63))) {
            return var2;
        }
        return null;
    }

    String f(byte param0) {
        String var3 = null;
        if (param0 >= -82) {
            ((am) this).a(-89, 75, (byte) -88, -37);
        }
        String var2 = super.f((byte) -117);
        if (null != ((am) this).field_H) {
            var3 = ((am) this).field_H.f((byte) -87);
            if (var3 != null) {
                return var3;
            }
        }
        return var2;
    }

    final boolean a(int param0, int param1, byte param2, fj param3, int param4, int param5, int param6) {
        Object var9 = null;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param2 == 36) {
            break L0;
          } else {
            var9 = null;
            boolean discarded$2 = this.b((fj) null, 115);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((am) this).field_H) {
              break L2;
            } else {
              if (!((am) this).field_H.e((byte) -128)) {
                break L2;
              } else {
                if (!((am) this).field_H.a(param0, param1, (byte) 36, param3, param4, param5, param6)) {
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

    boolean a(int param0, int param1, byte param2, int param3, fj param4, int param5, int param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param2 == 91) {
            break L0;
          } else {
            ((am) this).field_H = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((am) this).field_H == null) {
              break L2;
            } else {
              if (!((am) this).field_H.a(((am) this).field_q + param0, param1, (byte) 91, ((am) this).field_m + param3, param4, param5, param6)) {
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

    final boolean a(fj param0, int param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1 == 418) {
            break L0;
          } else {
            ((am) this).field_H = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((am) this).field_H) {
              break L2;
            } else {
              if (!((am) this).field_H.a(param0, param1 ^ 0)) {
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

    final void b(int param0) {
        if (!(((am) this).field_H == null)) {
            ((am) this).field_H.b(84);
        }
        if (param0 != 84) {
            Object var3 = null;
            boolean discarded$0 = ((am) this).a((fj) null, -62);
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (param2 <= 36) {
            return;
        }
        if (-1 == (param1 ^ -1)) {
            if (!(null == ((am) this).field_n)) {
                ((am) this).field_n.a((byte) -125, param3, true, (fj) this, param0);
            }
        }
        if (!(null == ((am) this).field_H)) {
            ((am) this).field_H.a(param0 - -((am) this).field_m, param1, (byte) 100, ((am) this).field_q + param3);
        }
    }

    final boolean a(fj param0, byte param1, int param2, char param3) {
        int var5 = -29 / ((47 - param1) / 43);
        if (((am) this).field_H != null) {
            if (((am) this).field_H.e((byte) -123)) {
                if (!(!((am) this).field_H.a(param0, (byte) -59, param2, param3))) {
                    return true;
                }
            }
        }
        int var6 = param2;
        if (80 == var6) {
            return mc.field_e[81] ? this.b(param0, -7244) : this.a(param0, (byte) -42);
        }
        return false;
    }

    final static void g(int param0) {
        int var1 = 0;
        int var2 = Confined.field_J ? 1 : 0;
        kh.field_gb.a((byte) 31);
        if (param0 != -4258) {
            Object var3 = null;
            String discarded$0 = am.a(-36, (CharSequence) null);
        }
        for (var1 = 0; var1 > -33; var1++) {
            wg.field_d[var1] = 0L;
        }
        for (var1 = 0; -33 > var1; var1++) {
            of.field_c[var1] = 0L;
        }
        Confined.field_D = 0;
    }

    public static void b(boolean param0) {
        if (!param0) {
            return;
        }
        field_I = null;
    }

    final static String a(int param0, CharSequence param1) {
        String var2 = hd.a(ra.a(param1, 119), (byte) 112);
        if (var2 == null) {
            var2 = "";
        }
        if (param0 <= 47) {
            return null;
        }
        return var2;
    }

    final boolean e(byte param0) {
        int var2 = -79 % ((-74 - param0) / 49);
        return ((am) this).a((byte) -110) != null ? true : false;
    }

    am(int param0, int param1, int param2, int param3, fe param4, uk param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            java.net.URL var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var4 = param1.getCodeBase();
                var3 = pn.a(var4, (byte) -33, param1).getFile();
                Object discarded$6 = kf.a((byte) 53, "updatelinks", param1, new Object[2]);
                Object discarded$7 = kf.a((byte) 53, "updatelinks", param1, new Object[2]);
                Object discarded$8 = kf.a((byte) 53, "updatelinks", param1, new Object[2]);
                Object discarded$9 = kf.a((byte) 53, "updatelinks", param1, new Object[2]);
                Object discarded$10 = kf.a((byte) 53, "updatelinks", param1, new Object[2]);
                if (param0 >= 16) {
                  break L0;
                } else {
                  field_I = null;
                  break L0;
                }
              }
              Object discarded$11 = kf.a((byte) 53, "updatelinks", param1, new Object[2]);
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int c(int param0) {
        if (param0 <= 65) {
            am.b(true);
        }
        return ((am) this).field_H != null ? ((am) this).field_H.c(94) : 0;
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        sd.field_b = param3;
        cg.field_a = param0;
        ln.field_c = param2;
        int var4 = 25 % ((77 - param1) / 33);
    }

    private final boolean b(fj param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param1 == -7244) {
            break L0;
          } else {
            ((am) this).a(87, -104, -99, 35, 47);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((am) this).field_H == null) {
              break L2;
            } else {
              if (((am) this).field_H.e((byte) 62)) {
                break L2;
              } else {
                if (!((am) this).field_H.a(param0, 418)) {
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

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-128, param1, param2, param3, param4);
        if (param0 > -109) {
            field_I = null;
        }
        ((am) this).f(-94);
    }

    void a(fj param0, int param1, int param2, int param3) {
        super.a(param0, param1 ^ 0, param2, param3);
        if (param1 != 11579568) {
            return;
        }
        if (((am) this).field_H != null) {
            ((am) this).field_H.a(param0, param1 + 0, ((am) this).field_q + param2, param3 - -((am) this).field_m);
        }
    }

    static {
    }
}
