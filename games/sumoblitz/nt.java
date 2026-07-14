/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class nt extends ms {
    int field_q;
    static String field_l;
    int field_o;
    static qp[][] field_n;
    static boolean field_r;
    int field_k;
    int field_p;
    static tv[] field_m;

    boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        ((nt) this).field_p = ((nt) this).field_p - 1;
        if (param0 != -2567) {
          L0: {
            ((nt) this).field_p = -86;
            if (((nt) this).field_p != 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((nt) this).field_p != 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    void a(ha param0, int param1) {
        if (param1 >= -121) {
          return;
        } else {
          ua.field_g[0].a((float)((nt) this).field_k, (float)((nt) this).field_o, 1848 - (int)((double)((nt) this).field_p / 30.0 * 2048.0), 0, 1, 0, 2);
          return;
        }
    }

    final static boolean a(byte param0) {
        if (param0 > 82) {
          if (null != qk.field_O) {
            if (kw.field_c != ga.field_j) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$5 = nt.a((byte) 13);
          if (null != qk.field_O) {
            if (kw.field_c != ga.field_j) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void c(int param0) {
        if (param0 != 0) {
            return;
        }
        rd.a(17, -103);
    }

    final static void a(byte[] param0, int param1, File param2, int param3) throws IOException {
        DataInputStream var4 = null;
        EOFException var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = new DataInputStream((InputStream) (Object) new BufferedInputStream((InputStream) (Object) new FileInputStream(param2)));
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4.readFully(param0, 0, param3);
                        if (param1 == 7039) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_r = true;
                        var4.close();
                        return;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    var5 = (EOFException) (Object) caughtException;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var4.close();
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    nt(int param0, int param1, int param2, int param3) {
        ((nt) this).field_q = param3;
        ((nt) this).field_k = param1;
        ((nt) this).field_p = param0;
        ((nt) this).field_o = param2;
    }

    public static void d(int param0) {
        field_m = null;
        field_n = null;
        field_l = null;
        if (param0 != 31295) {
            field_r = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "challenge";
        field_n = new qp[3][];
        field_m = new tv[9];
    }
}
