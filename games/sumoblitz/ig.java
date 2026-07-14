/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ig {
    static jn field_b;
    static pl field_a;

    final static boolean b(int param0) {
        ah[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ah var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wc var12 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        if (ku.field_J != null) {
          if (0 != (an.field_a ^ -1)) {
            if (ku.field_J.length <= an.field_a) {
              return false;
            } else {
              var12 = ku.field_J[an.field_a];
              var2 = var12.field_b;
              var3 = 0;
              var4 = 26 / ((67 - param0) / 42);
              var5 = 0;
              L0: while (true) {
                if (var5 >= var2.length) {
                  g.field_c = g.field_c + 1;
                  if (var3 == 0) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  if (var2[var5] != null) {
                    if (var2[var5].field_F == g.field_c) {
                      var6 = var2[var5];
                      var7 = var6.field_C;
                      var8 = var6.field_z;
                      var9 = var6.field_Q;
                      var10 = var6.field_N;
                      var3 = 1;
                      oc.a(uj.a(var9, var7, var10, (byte) 84, var8), false);
                      var5++;
                      continue L0;
                    } else {
                      var5++;
                      continue L0;
                    }
                  } else {
                    var5++;
                    continue L0;
                  }
                }
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void a(int param0) {
        if (param0 != 22075) {
            ig.a(66);
        }
        lf.a(0, 256);
    }

    final static int a(String param0, boolean param1) {
        String var3 = null;
        byte[] var4 = null;
        Object var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        Throwable var8 = null;
        int var8_int = 0;
        int var9 = 0;
        String var10 = null;
        File var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Sumoblitz.field_L ? 1 : 0;
                    if (param1) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_b = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (!qn.field_e.field_f) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return -1;
                }
                case 5: {
                    if (mi.field_b.containsKey((Object) (Object) param0)) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return 100;
                }
                case 8: {
                    var10 = ua.a((byte) 53, param0);
                    if (var10 == null) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return -1;
                }
                case 11: {
                    var3 = pn.field_n + var10;
                    if (ha.field_e.b("", var3, -1)) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return -1;
                }
                case 13: {
                    if (ha.field_e.a(var3, 100)) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    return ha.field_e.a(var3, (byte) 33);
                }
                case 15: {
                    var19 = ha.field_e.a("", var3, -1);
                    var17 = var19;
                    var15 = var17;
                    var13 = var15;
                    var4 = var13;
                    var5 = null;
                    var11 = el.a(var10, (byte) -8);
                    if (var4 == null) {
                        statePc = 32;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var11 == null) {
                        statePc = 32;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var6 = 1;
                    var18 = si.a(var11, (byte) -23);
                    var16 = var18;
                    var14 = var16;
                    var12 = var14;
                    var7 = var12;
                    if (var7 == null) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (var18.length == var19.length) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var6 = 0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 21: {
                    var8_int = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (var18.length <= var8_int) {
                        statePc = 27;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var18[var8_int] != var19[var8_int]) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var6 = 0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    var8_int++;
                    statePc = 22;
                    continue stateLoop;
                }
                case 27: {
                    try {
                        if (var6 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        boolean discarded$1 = qn.field_e.a(var19, -31357, var11);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 30: {
                    var8 = caughtException;
                    return -1;
                }
                case 31: {
                    hw.a(var11, param0, 23295);
                    return 100;
                }
                case 32: {
                    return -1;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            field_a = null;
        }
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new jn();
    }
}
