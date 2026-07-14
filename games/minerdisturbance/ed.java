/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ed {
    boolean field_i;
    static String[][] field_b;
    static int[][] field_a;
    String[] field_d;
    static ea[] field_g;
    static String field_f;
    boolean field_c;
    int field_e;
    String field_h;

    final static void a(int param0) {
        int var1 = 0;
        if (mn.field_x != -kc.field_d + 0) {
          if (250 + -kc.field_d == mn.field_x) {
            var1 = 122 % ((43 - param0) / 55);
            mn.field_x = mn.field_x + 1;
            return;
          } else {
            var1 = 122 % ((43 - param0) / 55);
            mn.field_x = mn.field_x + 1;
            return;
          }
        } else {
          var1 = 122 % ((43 - param0) / 55);
          mn.field_x = mn.field_x + 1;
          return;
        }
    }

    final static void a(byte param0, boolean param1) {
        ie.a(param1, false, 81);
        if (param0 > -100) {
            ed.a(false);
        }
    }

    final static void b(int param0) {
        int var2 = 0;
        sl var3 = null;
        var2 = MinerDisturbance.field_ab;
        var3 = (sl) (Object) vb.field_c.b(88);
        L0: while (true) {
          if (var3 == null) {
            if (param0 != 4) {
              field_b = null;
              return;
            } else {
              return;
            }
          } else {
            qd.a(4, (byte) -90, var3);
            var3 = (sl) (Object) vb.field_c.b((byte) 56);
            continue L0;
          }
        }
    }

    public static void c(int param0) {
        field_f = null;
        if (param0 != -20613) {
          boolean discarded$2 = ed.a(false, (byte) -8);
          field_b = null;
          field_a = null;
          field_g = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_g = null;
          return;
        }
    }

    final static void a(String param0, String param1, int param2) {
        L0: {
          if (sj.field_h != null) {
            sj.field_h.s(2121792);
            break L0;
          } else {
            break L0;
          }
        }
        di.field_D = new cl(param1, param0, false, true, true);
        de.field_a.a((byte) -126, (fe) (Object) di.field_D);
        if (param2 != -1) {
          field_g = null;
          return;
        } else {
          return;
        }
    }

    final static boolean a(boolean param0, byte param1) {
        try {
            int var2 = 0;
            IOException var3 = null;
            ld var4 = null;
            int stackIn_9_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_8_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (dk.field_b == null) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        dk.field_b = mm.field_b.a(wf.field_U, jc.field_E, (byte) 73);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        var2 = -97 % ((-24 - param1) / 56);
                        if (-1 != (dk.field_b.field_c ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return false;
                    }
                    case 5: {
                        ck.field_d = sf.a((byte) -121);
                        sk.field_c = sf.a((byte) -121);
                        if (dk.field_b.field_c != 1) {
                            statePc = 12;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ci.field_i = new ll((java.net.Socket) dk.field_b.field_a, mm.field_b);
                            var4 = kj.field_a;
                            sn.field_c.field_o = 0;
                            var4.field_o = 0;
                            if (!param0) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = -2;
                            stackIn_9_0 = stackOut_7_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = -1;
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            lc.field_s = stackIn_9_0;
                            rd.field_a = stackIn_9_0;
                            ud.field_a = stackIn_9_0;
                            qd.field_Q = cm.field_p;
                            le.a(cm.field_q, (sb) (Object) sn.field_c, sj.field_c, ii.field_a, -80);
                            bk.a((byte) 124, -1);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        dk.field_b = null;
                        return true;
                    }
                    case 11: {
                        var3 = (IOException) (Object) caughtException;
                        qd.field_Q = dk.field_c;
                        dk.field_b = null;
                        return true;
                    }
                    case 12: {
                        qd.field_Q = dk.field_c;
                        dk.field_b = null;
                        return true;
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

    ed(boolean param0) {
        ((ed) this).field_c = param0 ? true : false;
    }

    final static void a(boolean param0) {
        if (!qc.field_b) {
            throw new IllegalStateException();
        }
        jb.field_q = param0;
        ed.a((byte) -122, true);
        fh.field_b = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[][]{new String[1]};
        field_f = "Close";
    }
}
