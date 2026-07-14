/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vq {
    static lg field_i;
    int[] field_D;
    byte[] field_K;
    static String field_p;
    int field_A;
    int field_d;
    int field_E;
    int field_w;
    int field_e;
    int[] field_m;
    int field_H;
    static int[] field_q;
    int field_y;
    int field_t;
    int[] field_b;
    static int field_r;
    int field_l;
    int[] field_G;
    byte field_n;
    byte[] field_J;
    boolean[] field_g;
    static String field_k;
    int[][] field_I;
    boolean[] field_o;
    int field_C;
    int field_s;
    int field_v;
    byte[] field_F;
    byte[] field_f;
    int field_u;
    int[][] field_a;
    int[][] field_h;
    int field_x;
    int field_B;
    byte[][] field_z;
    byte[] field_c;
    byte[] field_j;

    final static void a(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (param0 != 256) {
          var5 = null;
          String discarded$2 = vq.a((java.applet.Applet) null, (byte) 54);
          var9 = eb.field_g;
          var7 = var9;
          var6 = var7;
          var1 = var6;
          var2 = 0;
          var3 = var9.length;
          L0: while (true) {
            if (var2 >= var3) {
              return;
            } else {
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              continue L0;
            }
          }
        } else {
          var10 = eb.field_g;
          var8 = var10;
          var6 = var8;
          var1 = var6;
          var2 = 0;
          var3 = var10.length;
          L1: while (true) {
            if (var2 >= var3) {
              return;
            } else {
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              continue L1;
            }
          }
        }
    }

    final static String a(java.applet.Applet param0, byte param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_9_0 = null;
            String stackOut_8_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = Vertigo2.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param1 > 84) {
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
                            field_r = 66;
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
                            var9 = param0.getParameter("cookieprefix");
                            var3 = var9 + "settings";
                            var4 = (String) je.a(param0, false, "getcookies");
                            var5 = jr.a((byte) -9, ';', var4);
                            var6 = 0;
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
                            if (var5.length <= var6) {
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
                            var7 = var5[var6].indexOf('=');
                            if ((var7 ^ -1) > -1) {
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
                            if (var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
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
                            stackOut_8_0 = var5[var6].substring(1 + var7).trim();
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
                            var6++;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var2 = caughtException;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (null != v.field_b) {
                            statePc = 15;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        return v.field_b;
                    }
                    case 16: {
                        return param0.getParameter("settings");
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

    public static void a(byte param0) {
        field_k = null;
        field_i = null;
        int var1 = 26 % ((47 - param0) / 63);
        field_p = null;
        field_q = null;
    }

    vq() {
        ((vq) this).field_K = new byte[18002];
        ((vq) this).field_m = new int[16];
        ((vq) this).field_D = new int[257];
        ((vq) this).field_o = new boolean[256];
        ((vq) this).field_F = new byte[18002];
        ((vq) this).field_v = 0;
        ((vq) this).field_I = new int[6][258];
        ((vq) this).field_g = new boolean[16];
        ((vq) this).field_f = new byte[4096];
        ((vq) this).field_h = new int[6][258];
        ((vq) this).field_G = new int[256];
        ((vq) this).field_u = 0;
        ((vq) this).field_z = new byte[6][258];
        ((vq) this).field_b = new int[6];
        ((vq) this).field_c = new byte[256];
        ((vq) this).field_a = new int[6][258];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        field_p = "Names cannot start or end with space or underscore";
        field_k = "Level <%0> - Unlucky!";
        field_r = 0;
    }
}
