/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fp extends wf {
    int field_e;
    static int field_g;
    int field_f;

    final static boolean a(byte param0, boolean param1) {
        try {
            int var2 = 0;
            IOException var3 = null;
            dl var4 = null;
            int stackIn_11_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_10_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null == gr.field_b) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        gr.field_b = ii.field_j.a(2, ca.field_g, sg.field_b);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (-1 == (gr.field_b.field_a ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return false;
                    }
                    case 6: {
                        var2 = 72 / ((-10 - param0) / 56);
                        co.field_e = kh.a(-114);
                        ff.field_b = kh.a(-114);
                        if ((gr.field_b.field_a ^ -1) == -2) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        ca.field_f = pj.field_f;
                        gr.field_b = null;
                        return true;
                    }
                    case 8: {
                        try {
                            ft.field_l = new vf((java.net.Socket) gr.field_b.field_f, ii.field_j);
                            var4 = nm.field_c;
                            q.field_p.field_g = 0;
                            var4.field_g = 0;
                            if (!param1) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = -2;
                            stackIn_11_0 = stackOut_9_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = -1;
                            stackIn_11_0 = stackOut_10_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            ga.field_l = stackIn_11_0;
                            kg.field_b = stackIn_11_0;
                            hi.field_w = stackIn_11_0;
                            ca.field_f = qa.field_b;
                            tr.a((rb) (Object) q.field_p, ut.field_a, id.field_d, ko.field_f, 0);
                            fr.a(-34, -1);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        gr.field_b = null;
                        return true;
                    }
                    case 13: {
                        var3 = (IOException) (Object) caughtException;
                        ca.field_f = pj.field_f;
                        gr.field_b = null;
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

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 < 21) {
          field_g = -99;
          qk.a((byte) -92);
          vp.a(param4, param1, param3, param2);
          return;
        } else {
          qk.a((byte) -92);
          vp.a(param4, param1, param3, param2);
          return;
        }
    }

    private fp() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
    }
}
