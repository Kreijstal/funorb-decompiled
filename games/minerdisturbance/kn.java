/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class kn extends fe implements rk {
    static String[][] field_D;
    static int field_E;
    static ln[] field_F;
    static ql[][] field_H;
    ta field_G;

    boolean a(char param0, fe param1, byte param2, int param3) {
        int var7 = MinerDisturbance.field_ab;
        hh var9 = new hh(((kn) this).field_G);
        fe var8 = (fe) (Object) var9.d(param2 + -19785);
        while (var8 != null) {
            // ifeq L92
            if (var8.k(param2 + -5)) {
                if (var8.a(param0, param1, (byte) -79, param3)) {
                    return true;
                }
            }
            var8 = (fe) (Object) var9.a(12537);
        }
        if (param2 != -79) {
            ((kn) this).field_G = null;
        }
        int var6 = param3;
        if ((var6 ^ -1) == -81) {
            return !qd.field_O[81] ? ((kn) this).a(param1, (byte) 12) : ((kn) this).b(param1, param2 ^ -79);
        }
        return false;
    }

    final static String a(int param0) {
        if (param0 != 0) {
            field_F = null;
        }
        return pm.field_b;
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var7 = MinerDisturbance.field_ab;
        if (param3 == 0) {
            if (null != ((kn) this).field_A) {
                ((kn) this).field_A.a(param0 + 12084, param1, (fe) this, param2, true);
            }
        }
        hh var9 = new hh(((kn) this).field_G);
        if (param0 != 4) {
            Object var8 = null;
            boolean discarded$0 = ((kn) this).a(53, -89, 49, -8, (byte) -101, (fe) null, 25);
        }
        fe var6 = (fe) (Object) var9.a(true);
        while (var6 != null) {
            var6.a((byte) 4, ((kn) this).field_u + param1, ((kn) this).field_t + param2, param3);
            var6 = (fe) (Object) var9.c(-119);
        }
    }

    final String h(int param0) {
        hh var2 = null;
        fe var3 = null;
        String var4 = null;
        int var5 = 0;
        var5 = MinerDisturbance.field_ab;
        var2 = new hh(((kn) this).field_G);
        if (param0 == -27867) {
          var3 = (fe) (Object) var2.d(-19864);
          L0: while (true) {
            if (var3 != null) {
              var4 = var3.h(-27867);
              if (var4 == null) {
                var3 = (fe) (Object) var2.a(12537);
                continue L0;
              } else {
                return var4;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, fe param4, int param5) {
        int var9 = MinerDisturbance.field_ab;
        hh var7 = new hh(((kn) this).field_G);
        fe var8 = (fe) (Object) var7.d(-19864);
        while (var8 != null) {
            // ifeq L92
            var8.a(param0 + ((kn) this).field_u, param1, param2, param3 - -((kn) this).field_t, param4, param5 + 0);
            var8 = (fe) (Object) var7.a(12537);
        }
        if (param5 != 0) {
            field_D = null;
        }
    }

    final boolean a(fe param0, byte param1) {
        hh var5 = null;
        fe var6 = null;
        int var7 = MinerDisturbance.field_ab;
        if (((kn) this).field_G.e((byte) 108)) {
            return false;
        }
        hh var3 = new hh(((kn) this).field_G);
        if (param1 != 12) {
            field_F = null;
        }
        fe var4 = (fe) (Object) var3.d(-19864);
        while (var4 != null) {
            if (var4.k(45)) {
                var5 = new hh(((kn) this).field_G);
                pi discarded$0 = var5.a((pi) (Object) var4, (byte) 92);
                var6 = (fe) (Object) var5.a(12537);
                while (var6 != null) {
                    if (!(!var6.a(param0, 121))) {
                        return true;
                    }
                    var6 = (fe) (Object) var5.a(param1 + 12525);
                }
            }
            var4 = (fe) (Object) var3.a(12537);
        }
        return false;
    }

    final boolean a(fe param0, int param1) {
        int var5 = MinerDisturbance.field_ab;
        hh var3 = new hh(((kn) this).field_G);
        if (param1 < 119) {
            return false;
        }
        fe var4 = (fe) (Object) var3.d(-19864);
        while (var4 != null) {
            if (var4.a(param0, 126)) {
                return true;
            }
            var4 = (fe) (Object) var3.a(12537);
        }
        return false;
    }

    void a(int param0, int param1, byte param2, fe param3) {
        int var7 = MinerDisturbance.field_ab;
        super.a(param0, param1, (byte) 110, param3);
        if (param2 <= 49) {
            return;
        }
        hh var5 = new hh(((kn) this).field_G);
        fe var6 = (fe) (Object) var5.d(-19864);
        while (var6 != null) {
            // ifeq L100
            var6.a(((kn) this).field_t + param0, ((kn) this).field_u + param1, (byte) 90, param3);
            var6 = (fe) (Object) var5.a(12537);
        }
    }

    private final void b(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        int var7 = 0;
        int var8 = MinerDisturbance.field_ab;
        hh var10 = new hh(((kn) this).field_G);
        if (param0 != -84) {
            Object var9 = null;
            String discarded$0 = kn.a((String) null, (byte) -102, (java.applet.Applet) null);
        }
        fe var6 = (fe) (Object) var10.d(-19864);
        while (var6 != null) {
            StringBuilder discarded$1 = param3.append(10);
            for (var7 = 0; var7 <= param2; var7++) {
                StringBuilder discarded$2 = param3.append(32);
            }
            StringBuilder discarded$3 = var6.a((byte) -70, param1, 1 + param2, param3);
            var6 = (fe) (Object) var10.a(12537);
        }
    }

    final static void a(id param0, byte param1) {
        int var2 = 0;
        id var3 = null;
        int var4 = 0;
        var4 = MinerDisturbance.field_ab;
        if (null == param0.field_e) {
          return;
        } else {
          L0: {
            L1: {
              if (-1 != param0.field_f) {
                break L1;
              } else {
                if (-1 != param0.field_d) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            var2 = 0;
            L2: while (true) {
              if (var2 >= sb.field_p) {
                break L0;
              } else {
                var3 = im.field_a[var2];
                if (-3 == (var3.field_g ^ -1)) {
                  if (param0.field_f == var3.field_f) {
                    if (param0.field_d == var3.field_d) {
                      return;
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          }
          L3: {
            if (null != param0.field_a) {
              break L3;
            } else {
              break L3;
            }
          }
          kh.a(param0, 14288);
          var2 = 69 % ((param1 - 11) / 53);
          return;
        }
    }

    final int b(byte param0) {
        int var5 = 0;
        int var6 = MinerDisturbance.field_ab;
        int var2 = 0;
        hh var3 = new hh(((kn) this).field_G);
        if (param0 > -88) {
            field_E = -9;
        }
        fe var4 = (fe) (Object) var3.d(-19864);
        while (var4 != null) {
            var5 = var4.b((byte) -120);
            if (var2 < var5) {
                var2 = var5;
            }
            var4 = (fe) (Object) var3.a(12537);
        }
        return var2;
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4, fe param5, int param6) {
        int var10 = MinerDisturbance.field_ab;
        hh var8 = new hh(((kn) this).field_G);
        fe var9 = (fe) (Object) var8.d(-19864);
        while (var9 != null) {
            // ifeq L93
            if (var9.k(35)) {
                if (var9.a(param0, param1, param2, param3, (byte) -100, param5, param6)) {
                    return true;
                }
            }
            var9 = (fe) (Object) var8.a(12537);
        }
        if (param4 > -53) {
            ((kn) this).field_G = null;
            return false;
        }
        return false;
    }

    final void g(int param0) {
        int var4 = MinerDisturbance.field_ab;
        hh var2 = new hh(((kn) this).field_G);
        if (param0 != 4966) {
            Object var5 = null;
            StringBuilder discarded$0 = ((kn) this).a((byte) 55, (Hashtable) null, -74, (StringBuilder) null);
        }
        fe var3 = (fe) (Object) var2.d(-19864);
        while (var3 != null) {
            var3.g(4966);
            var3 = (fe) (Object) var2.a(12537);
        }
    }

    kn(int param0, int param1, int param2, int param3, ad param4) {
        super(param0, param1, param2, param3, param4, (rm) null);
        ((kn) this).field_G = new ta();
    }

    final static void a(int param0, java.applet.Applet param1) {
        if (param0 != 13569) {
            return;
        }
        tk.a("", param1, (byte) -3);
        ne.a(param1, 30433);
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, fe param5, int param6) {
        int var10 = MinerDisturbance.field_ab;
        hh var8 = new hh(((kn) this).field_G);
        fe var9 = (fe) (Object) var8.d(-19864);
        while (var9 != null) {
            // ifeq L96
            if (var9.a(param0, param1 - -((kn) this).field_t, 0, param3, param4, param5, ((kn) this).field_u + param6)) {
                return true;
            }
            var9 = (fe) (Object) var8.a(12537);
        }
        if (param2 != 0) {
            field_D = null;
            return false;
        }
        return false;
    }

    final static String a(String param0, byte param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_9_0 = null;
            String stackOut_8_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = MinerDisturbance.field_ab;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = (String) lk.a((byte) 18, "getcookies", param2);
                            var4 = h.a(';', true, var3);
                            if (param1 == 114) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            field_D = null;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var5 = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 13;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (0 > var6) {
                                statePc = 10;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var4[var5].substring(0, var6).trim().equals((Object) (Object) param0)) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = var4[var5].substring(1 + var6).trim();
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return stackIn_9_0;
                    }
                    case 10: {
                        try {
                            var5++;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var3_ref = caughtException;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        return null;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 >= -33) {
            Object var7 = null;
            boolean discarded$0 = ((kn) this).a(62, -126, -100, 75, (byte) -107, (fe) null, 81);
        }
        super.a(param0, -49, param2, param3, param4);
        this.c((byte) -48);
    }

    final boolean b(fe param0, int param1) {
        hh var5 = null;
        fe var6 = null;
        int var7 = MinerDisturbance.field_ab;
        if (((kn) this).field_G.e((byte) 125)) {
            return false;
        }
        hh var9 = new hh(((kn) this).field_G);
        fe var4 = (fe) (Object) var9.a(true);
        while (var4 != null) {
            if (var4.k(-118)) {
                var5 = new hh(((kn) this).field_G);
                pi discarded$0 = var5.a(false, (pi) (Object) var4);
                var6 = (fe) (Object) var5.c(-126);
                while (var6 != null) {
                    if (!(!var6.a(param0, 122))) {
                        return true;
                    }
                    var6 = (fe) (Object) var5.c(-120);
                }
            }
            var4 = (fe) (Object) var9.c(param1 ^ -122);
        }
        if (param1 != 0) {
            Object var8 = null;
            boolean discarded$1 = ((kn) this).a((fe) null, -17);
            return false;
        }
        return false;
    }

    public static void d(byte param0) {
        if (param0 != -15) {
            return;
        }
        field_H = null;
        field_F = null;
        field_D = null;
    }

    fe m(int param0) {
        hh var2 = null;
        fe var3 = null;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = MinerDisturbance.field_ab;
          var2 = new hh(((kn) this).field_G);
          if (param0 > 107) {
            break L0;
          } else {
            var5 = null;
            StringBuilder discarded$2 = ((kn) this).a((byte) 113, (Hashtable) null, 33, (StringBuilder) null);
            break L0;
          }
        }
        var3 = (fe) (Object) var2.d(-19864);
        L1: while (true) {
          if (var3 != null) {
            if (var3.k(-98)) {
              return var3;
            } else {
              var3 = (fe) (Object) var2.a(12537);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        if (((kn) this).a(param3, true, param2, param1)) {
            ((kn) this).a(param1, param3, 34, param2);
            this.b((byte) -84, param1, param2, param3);
        }
        if (param0 != -70) {
            ((kn) this).a(28, -25, -97, -63, -17);
        }
        return param3;
    }

    final boolean k(int param0) {
        int var2 = 65 % ((-33 - param0) / 45);
        return null != ((kn) this).m(127) ? true : false;
    }

    private final void c(byte param0) {
        int var5 = MinerDisturbance.field_ab;
        hh var2 = new hh(((kn) this).field_G);
        fe var3 = (fe) (Object) var2.d(-19864);
        int var4 = 72 / ((param0 - 8) / 56);
        while (var3 != null) {
            var3.i(-5257);
            var3 = (fe) (Object) var2.a(12537);
        }
    }

    final void a(int param0, fe param1) {
        if (param0 != -1) {
            return;
        }
        ((kn) this).field_G.a((byte) -126, (pi) (Object) param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new ql[2][];
        field_D = new String[][]{new String[1]};
    }
}
