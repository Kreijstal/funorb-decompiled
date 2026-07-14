/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class joa {
    static int field_a;
    static kn field_c;
    static jea field_d;
    private java.util.zip.Inflater field_b;

    final static qla a(String param0, cn param1, String param2, byte param3) {
        int var4 = 0;
        byte[] var5 = null;
        var4 = 52 % ((param3 - 12) / 56);
        var5 = param1.a(param2, (byte) 126, param0);
        if (var5 == null) {
          return null;
        } else {
          return new qla(var5);
        }
    }

    public joa() {
        this(-1, 1000000, 1000000);
    }

    final void a(byte param0, byte[] param1, uia param2) {
        try {
            if (-32 == (param2.field_g[param2.field_h] ^ -1)) {
                // if_icmpne L47
            } else {
                throw new RuntimeException("");
            }
            if (null == ((joa) this).field_b) {
                ((joa) this).field_b = new java.util.zip.Inflater(true);
            }
            try {
                ((joa) this).field_b.setInput(param2.field_g, param2.field_h + 10, param2.field_g.length - (10 + (param2.field_h + 8)));
                int discarded$0 = ((joa) this).field_b.inflate(param1);
            } catch (Exception exception) {
                ((joa) this).field_b.reset();
                throw new RuntimeException("");
            }
            if (param0 != -34) {
                field_d = null;
            } else {
                ((joa) this).field_b.reset();
                return;
            }
            ((joa) this).field_b.reset();
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(boolean param0, byte param1) {
        try {
            int var2 = 0;
            IOException var3 = null;
            kh var4 = null;
            int stackIn_10_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_9_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (la.field_R == null) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        la.field_R = kqa.field_a.a(-24818, rsa.field_x, nn.field_b);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        var2 = -67 % ((param1 - 67) / 35);
                        if (0 != la.field_R.field_b) {
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
                        mha.field_D = bva.b((byte) -107);
                        ue.field_s = bva.b((byte) -107);
                        if (la.field_R.field_b == 1) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        km.field_p = af.field_g;
                        la.field_R = null;
                        return true;
                    }
                    case 7: {
                        try {
                            oba.field_e = new jqa((java.net.Socket) la.field_R.field_f, kqa.field_a);
                            ql.field_k.field_h = 0;
                            var4 = vc.field_q;
                            km.field_p = sua.field_G;
                            var4.field_h = 0;
                            if (!param0) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = -2;
                            stackIn_10_0 = stackOut_8_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = -1;
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            vua.field_B = stackIn_10_0;
                            hla.field_xb = stackIn_10_0;
                            ufa.field_c = stackIn_10_0;
                            ea.a((byte) -125, csa.field_g, (uia) (Object) ql.field_k, vh.field_g, be.field_c);
                            bl.a(-1, -1);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        la.field_R = null;
                        return true;
                    }
                    case 12: {
                        var3 = (IOException) (Object) caughtException;
                        km.field_p = af.field_g;
                        la.field_R = null;
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
        Object var2 = null;
        field_d = null;
        if (param0) {
          var2 = null;
          qla discarded$2 = joa.a((String) null, (cn) null, (String) null, (byte) 49);
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    final static String a(boolean param0, byte param1, String param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        StringBuilder stackIn_9_0 = null;
        StringBuilder stackIn_10_0 = null;
        StringBuilder stackIn_11_0 = null;
        String stackIn_11_1 = null;
        StringBuilder stackOut_8_0 = null;
        StringBuilder stackOut_10_0 = null;
        String stackOut_10_1 = null;
        StringBuilder stackOut_9_0 = null;
        String stackOut_9_1 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        var3 = 0;
        var4 = 58 % ((3 - param1) / 60);
        L0: while (true) {
          if (16 > var3) {
            if (dra.field_b[var3].equalsIgnoreCase(param2)) {
              L1: {
                if (param0) {
                  v.b(var3, 0);
                  break L1;
                } else {
                  aoa.a(120, var3);
                  break L1;
                }
              }
              L2: {
                stackOut_8_0 = new StringBuilder().append(param2).append(" set ");
                stackIn_10_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (!param0) {
                  stackOut_10_0 = (StringBuilder) (Object) stackIn_10_0;
                  stackOut_10_1 = "Off";
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  break L2;
                } else {
                  stackOut_9_0 = (StringBuilder) (Object) stackIn_9_0;
                  stackOut_9_1 = "On";
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  break L2;
                }
              }
              return stackIn_11_1;
            } else {
              var3++;
              continue L0;
            }
          } else {
            return "Learn to spell";
          }
        }
    }

    private joa(int param0, int param1, int param2) {
    }

    static {
    }
}
