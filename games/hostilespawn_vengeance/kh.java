/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh extends w {
    static String field_X;
    private boolean field_Z;
    static boolean[] field_Q;
    private int[] field_db;
    private mn field_gb;
    static boolean[] field_cb;
    private int[] field_Y;
    private int field_W;
    static ia field_ab;
    static int[] field_ib;
    static int[] field_U;
    static int[] field_bb;
    static String[][] field_fb;
    static java.lang.reflect.Method field_eb;
    static String field_V;
    static char[] field_hb;

    final static void a(ji param0, int param1, byte param2, boolean param3) {
        Object var4 = null;
        Throwable var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (ha.field_w != null) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    r.a(1048576, 14654, param0, param1, param3);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (param2 == -105) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    if (uh.field_l == null) {
                        statePc = 16;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var4 = (Object) (Object) uj.field_m;
                    // monitorenter uj.field_m
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        uh.field_l.a(param1, -1, (byte) -77);
                        if (param0 != id.field_t) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        // monitorexit var4
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        uh.field_l.e(param2 ^ -4580);
                        uj.field_m.e();
                        id.field_t = param0;
                        if (null == id.field_t) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        uh.field_l.a(param3, (byte) 38, id.field_t);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        // monitorexit var4
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5 = caughtException;
                        // monitorexit var4
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) var5;
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized void a(int param0, int param1, byte param2) {
        if (!(0 != (param1 ^ -1))) {
            ((kh) this).field_W = param0;
            return;
        }
        super.a(param0, param1, (byte) -113);
        if (param2 >= -47) {
            Object var5 = null;
            kh.a((ji) null, 55, (byte) -98, false);
        }
        ((kh) this).field_db[param1] = param0 << -1846097044;
    }

    private final synchronized void b(int param0, int param1, int param2, int param3) {
        ((kh) this).field_Z = false;
        if (!(null != ((kh) this).field_gb)) {
            ((kh) this).field_gb = new mn();
        }
        ((kh) this).field_gb.field_d[param0] = param3;
        int var5 = ((kh) this).field_db[param0];
        int var6 = (((kh) this).field_gb.field_d[param0] << 786661388) - var5;
        int var7 = -97 % ((param2 - 58) / 42);
        int var8 = 0;
        int var9 = 0;
        if (!(0 <= var6)) {
            var9 = 1;
            var6 = -var6;
        }
        if (-1 > (var6 ^ -1)) {
            var8 = (1 + var6) / (1 + param1);
        }
        ((kh) this).field_Y[param0] = var9 != 0 ? -var8 : var8;
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        L0: {
          var9 = HostileSpawn.field_I ? 1 : 0;
          var4 = ((kh) this).g(122);
          ((kh) this).b((byte) -58, var4 * ((kh) this).field_W >> -285476600);
          super.b(param0, param1, param2);
          if (((kh) this).field_Z) {
            break L0;
          } else {
            var5 = 1;
            var6 = 0;
            L1: while (true) {
              if (var6 >= 16) {
                if (var5 != 0) {
                  ((kh) this).field_Z = true;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var7 = ((kh) this).field_Y[var6];
                if (0 != var7) {
                  L2: {
                    ((kh) this).field_db[var6] = ((kh) this).field_db[var6] + var7 * param2;
                    var8 = ((kh) this).field_gb.field_d[var6];
                    if (var8 <= ((kh) this).field_db[var6] >> 263823980) {
                      stackOut_7_0 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      break L2;
                    } else {
                      stackOut_6_0 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      break L2;
                    }
                  }
                  L3: {
                    stackOut_8_0 = stackIn_8_0;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_9_0 = stackOut_8_0;
                    if ((var7 ^ -1) >= -1) {
                      stackOut_10_0 = stackIn_10_0;
                      stackOut_10_1 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      break L3;
                    } else {
                      stackOut_9_0 = stackIn_9_0;
                      stackOut_9_1 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      break L3;
                    }
                  }
                  L4: {
                    if ((stackIn_11_0 ^ stackIn_11_1) != 0) {
                      ((kh) this).field_Y[var6] = 0;
                      ((kh) this).field_db[var6] = var8 << 1103738220;
                      break L4;
                    } else {
                      var5 = 0;
                      break L4;
                    }
                  }
                  super.a(((kh) this).field_db[var6] >> 1776273356, var6, (byte) -53);
                  var6++;
                  continue L1;
                } else {
                  var6++;
                  continue L1;
                }
              }
            }
          }
        }
        ((kh) this).b((byte) 55, var4);
    }

    final synchronized void a(mn param0, int param1, int param2) {
        if (param2 != -1702) {
            Object var5 = null;
            ((kh) this).a(false, (byte) 48, false, (ji) null);
        }
        int var4 = param1 * ug.field_g / 1000;
        this.a(var4, -17, param0);
    }

    private final void h(int param0) {
        int var2 = 0;
        int var3 = HostileSpawn.field_I ? 1 : 0;
        for (var2 = 0; -17 < (var2 ^ -1); var2++) {
            ((kh) this).field_db[var2] = 1048576;
        }
        if (param0 != 381) {
            field_bb = null;
        }
        super.a(256, -1, (byte) -107);
    }

    public static void a(byte param0) {
        field_ab = null;
        field_hb = null;
        field_eb = null;
        field_ib = null;
        field_fb = null;
        field_X = null;
        field_Q = null;
        field_cb = null;
        field_U = null;
        if (param0 > -29) {
            field_Q = null;
        }
        field_V = null;
        field_bb = null;
    }

    public kh() {
        ((kh) this).field_db = new int[16];
        ((kh) this).field_Y = new int[16];
        ((kh) this).field_W = 256;
        this.h(381);
    }

    private final synchronized void a(int param0, int param1, mn param2) {
        int var4 = 0;
        int var5 = HostileSpawn.field_I ? 1 : 0;
        ((kh) this).field_gb = param2;
        for (var4 = 0; (var4 ^ -1) > -17; var4++) {
            this.b(var4, param0, param1 ^ -128, ((kh) this).field_gb.field_d[var4]);
        }
        if (param1 != -17) {
            Object var6 = null;
            kh.a((ji) null, -104, (byte) -19, false);
        }
    }

    kh(w param0) {
        super(param0);
        ((kh) this).field_db = new int[16];
        ((kh) this).field_Y = new int[16];
        ((kh) this).field_W = 256;
        this.h(381);
    }

    final synchronized void a(boolean param0, byte param1, boolean param2, ji param3) {
        if (param1 < 123) {
            Object var6 = null;
            kh.a((ji) null, -112, (byte) 83, true);
        }
        this.h(381);
        super.a(param0, (byte) 125, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_X = "No highscores";
        field_Q = new boolean[8];
        field_cb = new boolean[field_Q.length];
        field_U = new int[]{1, 0};
        field_ib = new int[4];
        field_ab = new ia();
        field_fb = new String[][]{new String[11], new String[10]};
        field_hb = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_V = "You found a secret area! There are many areas that don't appear on your scans. Keep your eyes peeled.";
    }
}
