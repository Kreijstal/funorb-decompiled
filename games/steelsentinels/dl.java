/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class dl extends lh implements lm {
    static byte[] field_O;
    static String[][] field_N;
    static int field_M;
    static ka field_J;
    ul field_K;
    static String[] field_I;
    static String[][] field_H;
    static byte[][] field_L;
    static int field_G;

    lh h(int param0) {
        jc var2 = null;
        lh var3 = null;
        int var4 = 0;
        L0: {
          var4 = SteelSentinels.field_G;
          var2 = new jc(((dl) this).field_K);
          if (param0 == -1) {
            break L0;
          } else {
            boolean discarded$2 = dl.f(-120);
            break L0;
          }
        }
        var3 = (lh) (Object) var2.b(2);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.d(param0 ^ -1)) {
              var3 = (lh) (Object) var2.d(param0 + 3);
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    boolean a(int param0, int param1, char param2, lh param3) {
        int var7 = SteelSentinels.field_G;
        jc var8 = new jc(((dl) this).field_K);
        lh var6_ref_lh = (lh) (Object) var8.b(2);
        if (param0 != 30373) {
            int discarded$0 = dl.a(76, 69, -95, -115);
        }
        while (var6_ref_lh != null) {
            // ifeq L109
            if (var6_ref_lh.d(0)) {
                if (!(!var6_ref_lh.a(param0 ^ 0, param1, param2, param3))) {
                    return true;
                }
            }
            var6_ref_lh = (lh) (Object) var8.d(2);
        }
        int var6 = param1;
        if ((var6 ^ -1) == -81) {
            return !fc.field_e[81] ? ((dl) this).b(-11963, param3) : ((dl) this).b(param3, 79);
        }
        return false;
    }

    final void a(lh param0, int param1) {
        if (param1 > -82) {
            Object var4 = null;
            boolean discarded$0 = ((dl) this).a(-93, (lh) null);
        }
        ((dl) this).field_K.a(3, (ck) (Object) param0);
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param2 - -param3 <= pb.field_c) {
            return param2;
        }
        if (param1 != 127) {
            boolean discarded$0 = dl.f(-101);
        }
        if (-param3 + param0 + param2 >= 0) {
            return -param3 + (param0 + param2);
        }
        return pb.field_c - param3;
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var7 = SteelSentinels.field_G;
        if (param3 == 0) {
            if (!(((dl) this).field_p == null)) {
                ((dl) this).field_p.a(param2, (lh) this, (byte) -30, true, param0);
            }
        }
        jc var5 = new jc(((dl) this).field_K);
        lh var6 = (lh) (Object) var5.c(2);
        while (var6 != null) {
            var6.a(((dl) this).field_z + param0, (byte) -109, ((dl) this).field_o + param2, param3);
            var6 = (lh) (Object) var5.a(true);
        }
        if (param1 > -99) {
            Object var8 = null;
            this.a((byte) -85, (Hashtable) null, (StringBuilder) null, 76);
        }
    }

    dl(int param0, int param1, int param2, int param3, qk param4) {
        super(param0, param1, param2, param3, param4, (tn) null);
        ((dl) this).field_K = new ul();
    }

    void a(int param0, int param1, lh param2, int param3) {
        int var7 = SteelSentinels.field_G;
        super.a(param0, 108, param2, param3);
        jc var5 = new jc(((dl) this).field_K);
        if (param1 <= 56) {
            return;
        }
        lh var6 = (lh) (Object) var5.b(2);
        while (var6 != null) {
            // ifeq L96
            var6.a(((dl) this).field_o + param0, 112, param2, param3 + ((dl) this).field_z);
            var6 = (lh) (Object) var5.d(2);
        }
    }

    final boolean a(int param0, lh param1) {
        int var5 = SteelSentinels.field_G;
        if (param0 != 1) {
            Object var6 = null;
            StringBuilder discarded$0 = ((dl) this).a((Hashtable) null, (StringBuilder) null, (byte) -47, 62);
        }
        jc var3 = new jc(((dl) this).field_K);
        lh var4 = (lh) (Object) var3.b(2);
        while (var4 != null) {
            if (!(!var4.a(1, param1))) {
                return true;
            }
            var4 = (lh) (Object) var3.d(param0 + 1);
        }
        return false;
    }

    final boolean b(int param0, lh param1) {
        jc var5 = null;
        lh var6 = null;
        int var7 = SteelSentinels.field_G;
        if (((dl) this).field_K.f(param0 + 11970)) {
            return false;
        }
        jc var8 = new jc(((dl) this).field_K);
        lh var4 = (lh) (Object) var8.b(2);
        while (var4 != null) {
            if (var4.d(0)) {
                var5 = new jc(((dl) this).field_K);
                ck discarded$0 = var5.a(false, (ck) (Object) var4);
                var6 = (lh) (Object) var5.d(2);
                while (var6 != null) {
                    if (!(!var6.a(param0 ^ -11964, param1))) {
                        return true;
                    }
                    var6 = (lh) (Object) var5.d(2);
                }
            }
            var4 = (lh) (Object) var8.d(param0 + 11965);
        }
        if (param0 != -11963) {
            field_L = null;
            return false;
        }
        return false;
    }

    public static void g(int param0) {
        field_J = null;
        field_O = null;
        field_L = null;
        field_N = null;
        field_H = null;
        field_I = null;
        if (param0 != -19969) {
            field_G = 67;
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        if (param2 >= -104) {
            return null;
        }
        if (((dl) this).a(param1, (byte) -91, param3, param0)) {
            ((dl) this).a(param3, param0, false, param1);
            this.a((byte) 77, param0, param1, param3);
        }
        return param1;
    }

    void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) -116, param2, param3, param4);
        if (param1 > -71) {
            field_N = null;
        }
        this.f((byte) 45);
    }

    final boolean b(lh param0, int param1) {
        jc var5 = null;
        lh var6 = null;
        int var7 = SteelSentinels.field_G;
        if (param1 <= 55) {
            field_O = null;
        }
        if (((dl) this).field_K.f(7)) {
            return false;
        }
        jc var3 = new jc(((dl) this).field_K);
        lh var4 = (lh) (Object) var3.c(2);
        while (var4 != null) {
            if (!(!var4.d(0))) {
                var5 = new jc(((dl) this).field_K);
                ck discarded$0 = var5.a(24192, (ck) (Object) var4);
                var6 = (lh) (Object) var5.a(true);
                while (var6 != null) {
                    if (!(!var6.a(1, param0))) {
                        return true;
                    }
                    var6 = (lh) (Object) var5.a(true);
                }
            }
            var4 = (lh) (Object) var3.a(true);
        }
        return false;
    }

    final static al g(byte param0) {
        if (param0 != 3) {
            dl.a(106, -66, -3, true, 74, -85, -31, 4);
        }
        return (al) (Object) new gl();
    }

    final void a(byte param0, int param1, int param2, int param3, lh param4, int param5) {
        int var10 = SteelSentinels.field_G;
        jc var7 = new jc(((dl) this).field_K);
        lh var8 = (lh) (Object) var7.b(2);
        int var9 = -102 / ((param0 - 36) / 32);
        while (var8 != null) {
            // ifeq L95
            var8.a((byte) -128, param1, ((dl) this).field_z + param2, param3 + ((dl) this).field_o, param4, param5);
            var8 = (lh) (Object) var7.d(2);
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = SteelSentinels.field_G;
          pb.d(param1, param5, param2, param0, param4);
          pb.d(param2, param0, param7, param6, param4);
          pb.d(param7, param6, param1, param5, param4);
          if (param0 >= param5) {
            break L0;
          } else {
            var8 = param1;
            param1 = param2;
            param2 = var8;
            var8 = param5;
            param5 = param0;
            param0 = var8;
            break L0;
          }
        }
        L1: {
          if (param6 < param5) {
            var8 = param1;
            param1 = param7;
            param7 = var8;
            var8 = param5;
            param5 = param6;
            param6 = var8;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param0 > param6) {
            var8 = param2;
            param2 = param7;
            param7 = var8;
            var8 = param0;
            param0 = param6;
            param6 = var8;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param2 < param7) {
            var10 = param5;
            L4: while (true) {
              if (param0 <= var10) {
                var10 = param0;
                L5: while (true) {
                  if (var10 >= param6) {
                    break L3;
                  } else {
                    var9 = (-param5 + var10) * (-param1 + param7) / (-param5 + param6) + param1;
                    var8 = param2 - -((param7 + -param2) * (-param0 + var10) / (param6 - param0));
                    pb.g(var8, var10, 1 + (-var8 + var9), param4);
                    var10++;
                    continue L5;
                  }
                }
              } else {
                var9 = param1 - -((var10 - param5) * (-param1 + param7) / (param6 + -param5));
                var8 = (param2 + -param1) * (-param5 + var10) / (-param5 + param0) + param1;
                pb.g(var8, var10, -var8 + (var9 + 1), param4);
                var10++;
                continue L4;
              }
            }
          } else {
            var10 = param5;
            L6: while (true) {
              if (param0 <= var10) {
                var10 = param0;
                L7: while (true) {
                  if (param6 <= var10) {
                    break L3;
                  } else {
                    var9 = param2 + (-param2 + param7) * (var10 + -param0) / (param6 + -param0);
                    var8 = param1 + (var10 + -param5) * (-param1 + param7) / (-param5 + param6);
                    pb.g(var8, var10, 1 + -var8 + var9, param4);
                    var10++;
                    continue L7;
                  }
                }
              } else {
                var9 = (param2 + -param1) * (-param5 + var10) / (param0 - param5) + param1;
                var8 = (param7 + -param1) * (var10 - param5) / (-param5 + param6) + param1;
                pb.g(var8, var10, 1 + -var8 + var9, param4);
                var10++;
                continue L6;
              }
            }
          }
        }
        L8: {
          if (param3) {
            break L8;
          } else {
            dl.g(64);
            break L8;
          }
        }
    }

    final boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
        int var10 = SteelSentinels.field_G;
        jc var8 = new jc(((dl) this).field_K);
        if (!param5) {
            field_M = 17;
        }
        lh var9 = (lh) (Object) var8.b(2);
        while (var9 != null) {
            // ifeq L102
            if (var9.a(param0, param1, ((dl) this).field_o + param2, param3, ((dl) this).field_z + param4, true, param6)) {
                return true;
            }
            var9 = (lh) (Object) var8.d(2);
        }
        return false;
    }

    final boolean a(byte param0, int param1, int param2, int param3, lh param4, int param5, int param6) {
        int var10 = SteelSentinels.field_G;
        if (param0 > -34) {
            ((dl) this).a(-58, (byte) 107, -39, -11);
        }
        jc var8 = new jc(((dl) this).field_K);
        lh var9 = (lh) (Object) var8.b(2);
        while (var9 != null) {
            // ifeq L113
            if (var9.d(0)) {
                if (!(!var9.a((byte) -83, param1, param2, param3, param4, param5, param6))) {
                    return true;
                }
            }
            var9 = (lh) (Object) var8.d(2);
        }
        return false;
    }

    final static boolean f(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1_ref = (Object) (Object) wc.field_i;
                    // monitorenter wc.field_i
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (ad.field_b != mn.field_y) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        // monitorexit var1_ref
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        if (param0 == 22759) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        field_G = -52;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ei.field_q = kk.field_b[ad.field_b];
                        de.field_c = pi.field_b[ad.field_b];
                        ad.field_b = 127 & 1 + ad.field_b;
                        // monitorexit var1_ref
                        stackOut_6_0 = 1;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1_ref
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean d(int param0) {
        if (param0 != 0) {
            field_J = null;
        }
        return ((dl) this).h(-1) != null ? true : false;
    }

    final void d(byte param0) {
        int var4 = SteelSentinels.field_G;
        if (param0 != -45) {
            field_N = null;
        }
        jc var2 = new jc(((dl) this).field_K);
        lh var3 = (lh) (Object) var2.b(param0 + 47);
        while (var3 != null) {
            var3.d((byte) -45);
            var3 = (lh) (Object) var2.d(2);
        }
    }

    final static boolean a(long param0, int[] param1, int param2, int param3, String param4) {
        if (!vk.a(param0, param1, param4, param3, -21)) {
            return false;
        }
        if ((param3 ^ -1) == -2) {
            param3 = 0;
        }
        ib.field_b = param3;
        en.field_e = param4;
        CharSequence var7 = (CharSequence) (Object) param4;
        bk.field_U = ui.a(1, var7);
        ti.field_p = param0;
        if (param2 >= -113) {
            return false;
        }
        mg var6 = um.a(ea.field_f, fb.field_l, pg.field_u, param1, -90);
        pa.a(12105, var6);
        return true;
    }

    private final void a(byte param0, Hashtable param1, StringBuilder param2, int param3) {
        int var8 = 0;
        int var9 = SteelSentinels.field_G;
        jc var5 = new jc(((dl) this).field_K);
        int var7 = -34 % ((-2 - param0) / 43);
        lh var6 = (lh) (Object) var5.b(2);
        while (var6 != null) {
            StringBuilder discarded$0 = param2.append(10);
            for (var8 = 0; param3 >= var8; var8++) {
                StringBuilder discarded$1 = param2.append(32);
            }
            StringBuilder discarded$2 = var6.a(param1, param2, (byte) -114, 1 + param3);
            var6 = (lh) (Object) var5.d(2);
        }
    }

    final int b(boolean param0) {
        int var5 = 0;
        int var6 = SteelSentinels.field_G;
        int var2 = 0;
        if (!param0) {
            field_L = null;
        }
        jc var3 = new jc(((dl) this).field_K);
        lh var4 = (lh) (Object) var3.b(2);
        while (var4 != null) {
            var5 = var4.b(true);
            if (var5 > var2) {
                var2 = var5;
            }
            var4 = (lh) (Object) var3.d(2);
        }
        return var2;
    }

    String e(int param0) {
        jc var2 = null;
        lh var3 = null;
        String var4 = null;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        var2 = new jc(((dl) this).field_K);
        if (param0 == 0) {
          var3 = (lh) (Object) var2.b(2);
          L0: while (true) {
            if (var3 != null) {
              var4 = var3.e(param0 ^ 0);
              if (var4 != null) {
                return var4;
              } else {
                var3 = (lh) (Object) var2.d(2);
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    private final void f(byte param0) {
        int var4 = SteelSentinels.field_G;
        if (param0 != 45) {
            return;
        }
        jc var2 = new jc(((dl) this).field_K);
        lh var3 = (lh) (Object) var2.b(2);
        while (var3 != null) {
            var3.e((byte) 102);
            var3 = (lh) (Object) var2.d(2);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new String[][]{new String[12], new String[15], null, new String[7], null, new String[5], null, new String[7], null, new String[6], null};
        field_H = new String[][]{new String[24], new String[30], new String[0], new String[14], new String[0], new String[8], new String[0], new String[14], new String[0], new String[14]};
        field_I = new String[]{"never", "once", "twice", "<%0> times"};
    }
}
