/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ol {
    int field_a;
    static boolean field_e;
    static String field_d;
    static boolean field_b;
    static vi field_c;

    ol() {
        ((ol) this).field_a = 0;
    }

    final static String a(CharSequence[] param0, int param1) {
        if (param1 != 550) {
          field_b = false;
          return s.a(param0.length, param0, 0, -124);
        } else {
          return s.a(param0.length, param0, 0, -124);
        }
    }

    final static void a(kl param0, kl param1, byte param2) {
        pj.field_M = param1;
        if (param2 < 98) {
            field_e = true;
            qk.field_j = param0;
            return;
        }
        qk.field_j = param0;
    }

    final static String a(int param0, va param1, byte param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_5_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_4_0 = null;
        try {
          L0: {
            var3_int = param1.g(11681);
            if (param0 >= var3_int) {
              break L0;
            } else {
              var3_int = param0;
              break L0;
            }
          }
          L1: {
            var4 = new byte[var3_int];
            if (param2 >= 35) {
              break L1;
            } else {
              field_d = null;
              break L1;
            }
          }
          param1.field_m = param1.field_m + fb.field_d.a(false, 0, var4, var3_int, param1.field_m, param1.field_k);
          var5 = bi.a(0, var3_int, var4, false);
          stackOut_4_0 = (String) var5;
          stackIn_5_0 = stackOut_4_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_5_0;
        }
        return null;
    }

    final static boolean a(int param0, boolean param1) {
        try {
            IOException var2 = null;
            Object var3 = null;
            mg var5 = null;
            mg var6 = null;
            int stackIn_12_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_11_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (ab.field_h != null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        ab.field_h = sb.field_e.a(aa.field_nb, vl.field_d, (byte) -20);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (-1 == (ab.field_h.field_a ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return false;
                    }
                    case 5: {
                        hi.field_k = d.a((byte) 119);
                        eg.field_C = d.a((byte) 119);
                        if (param0 >= 118) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        var3 = null;
                        ol.a((kl) null, (kl) null, (byte) -16);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        if (-2 == (ab.field_h.field_a ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        wh.field_j = sf.field_i;
                        ab.field_h = null;
                        return true;
                    }
                    case 9: {
                        try {
                            jc.field_H = new hi((java.net.Socket) ab.field_h.field_e, sb.field_e);
                            n.field_b.field_m = 0;
                            var5 = nk.field_N;
                            var6 = var5;
                            var6.field_m = 0;
                            wh.field_j = tj.field_G;
                            if (param1) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = -1;
                            stackIn_12_0 = stackOut_10_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = -2;
                            stackIn_12_0 = stackOut_11_0;
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
                            l.field_P = stackIn_12_0;
                            wizardrun.field_E = stackIn_12_0;
                            me.field_c = stackIn_12_0;
                            cd.a(bl.field_a, (va) (Object) n.field_b, 20443, vk.field_l, df.field_a);
                            id.a((byte) -67, -1);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        ab.field_h = null;
                        return true;
                    }
                    case 14: {
                        var2 = (IOException) (Object) caughtException;
                        wh.field_j = sf.field_i;
                        ab.field_h = null;
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

    public static void a(boolean param0) {
        field_c = null;
        field_d = null;
        if (param0) {
            field_b = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_b = false;
        field_d = "Press Enter or click to continue";
    }
}
