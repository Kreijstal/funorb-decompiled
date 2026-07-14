/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    int field_F;
    int field_k;
    byte field_t;
    int field_m;
    int[] field_c;
    int[][] field_I;
    int field_b;
    int[][] field_H;
    boolean[] field_d;
    static int field_p;
    int field_e;
    int field_g;
    static int[] field_y;
    int field_u;
    byte[] field_o;
    int field_J;
    byte[] field_z;
    byte[] field_w;
    int field_n;
    int[] field_j;
    int[][] field_a;
    int field_h;
    byte[] field_E;
    int field_C;
    int field_x;
    static int[] field_v;
    byte[][] field_q;
    int field_A;
    int[] field_r;
    static hh field_G;
    boolean[] field_f;
    int field_l;
    byte[] field_D;
    int[] field_B;
    int field_i;
    byte[] field_s;

    public static void a(int param0) {
        field_y = null;
        field_G = null;
        if (param0 != 8192) {
            field_y = null;
            field_v = null;
            return;
        }
        field_v = null;
    }

    final static void a(boolean param0, boolean param1, java.applet.Applet param2, String param3) {
        try {
            java.net.MalformedURLException malformedURLException = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (lk.field_e.startsWith("win")) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (dl.a((byte) 38, param3)) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return;
                    }
                    case 5: {
                        try {
                            param2.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        malformedURLException = (java.net.MalformedURLException) (Object) caughtException;
                        pf.a(false, "MGR1: " + param3, (Throwable) null);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        if (!param0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        return;
                    }
                    case 10: {
                        field_p = -75;
                        return;
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

    th() {
        ((th) this).field_d = new boolean[256];
        ((th) this).field_o = new byte[4096];
        ((th) this).field_I = new int[6][258];
        ((th) this).field_w = new byte[256];
        ((th) this).field_e = 0;
        ((th) this).field_a = new int[6][258];
        ((th) this).field_C = 0;
        ((th) this).field_j = new int[256];
        ((th) this).field_q = new byte[6][258];
        ((th) this).field_H = new int[6][258];
        ((th) this).field_f = new boolean[16];
        ((th) this).field_B = new int[257];
        ((th) this).field_c = new int[6];
        ((th) this).field_r = new int[16];
        ((th) this).field_E = new byte[18002];
        ((th) this).field_s = new byte[18002];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 0;
        field_y = new int[8192];
    }
}
