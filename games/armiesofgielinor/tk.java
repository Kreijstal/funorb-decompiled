/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tk implements kh {
    private ka field_g;
    private int field_e;
    private int field_l;
    private int field_i;
    private int field_h;
    private int field_k;
    private int field_j;
    private int field_d;
    private int field_a;
    private int field_b;
    private int field_m;
    static boolean[] field_f;
    private int field_c;

    final static kl a(int param0, boolean param1, int param2, boolean param3, boolean param4, int param5) {
        try {
            bc var6 = null;
            IOException var6_ref = null;
            bc var7 = null;
            bm var8 = null;
            Object stackIn_2_0 = null;
            kl stackIn_17_0 = null;
            Throwable decompiledCaughtException = null;
            Object stackOut_1_0 = null;
            kl stackOut_16_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            if (param2 == 1) {
                                statePc = 3;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            stackOut_1_0 = null;
                            stackIn_2_0 = stackOut_1_0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        return (kl) (Object) stackIn_2_0;
                    }
                    case 3: {
                        try {
                            var6 = null;
                            if (null != vq.field_c.field_r) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            rg.field_b = new ue(vq.field_c.field_r, 5200, 0);
                            vq.field_c.field_r = null;
                            var6 = new bc(255, rg.field_b, new ue(vq.field_c.field_d, 12000, 0), 2097152);
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var7 = null;
                            if (null != rg.field_b) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (mu.field_b != null) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            mu.field_b = new ue[vq.field_c.field_c.length];
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (mu.field_b[param0] != null) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            mu.field_b[param0] = new ue(vq.field_c.field_c[param0], 12000, 0);
                            vq.field_c.field_c[param0] = null;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var7 = new bc(param0, rg.field_b, mu.field_b[param0], 2097152);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var8 = oi.field_c.a(param3, var7, param0, 0, var6);
                            if (param4) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var8.c(31637);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = new kl((ew) (Object) var8, param1, param5);
                            stackIn_17_0 = stackOut_16_0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        return (kl) (Object) stackIn_17_0;
                    }
                    case 18: {
                        var6_ref = (IOException) (Object) caughtException;
                        throw new RuntimeException(var6_ref.toString());
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
        field_f = null;
        if (param0 > -36) {
            kl discarded$0 = tk.a(-28, true, 82, false, false, -112);
        }
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vu var11 = null;
        kb stackIn_3_0 = null;
        kb stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param0 instanceof vu) {
            stackOut_2_0 = (kb) param0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (kb) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (vu) (Object) stackIn_3_0;
          if (var11 != null) {
            param3 = param3 & var11.field_I;
            break L1;
          } else {
            break L1;
          }
        }
        if (param2 >= -79) {
          L2: {
            ((tk) this).field_e = -101;
            var7 = 5592405;
            qn.f(param1 - -param0.field_B, param0.field_p + param4, param0.field_l, param0.field_w, ((tk) this).field_l);
            if (!param3) {
              break L2;
            } else {
              var7 = 16777215;
              break L2;
            }
          }
          L3: {
            var8 = ((tk) this).field_i + (param1 + param0.field_B);
            var9 = param0.field_p + (param4 - -((tk) this).field_m);
            qn.g(var8, var9, ((tk) this).field_h, ((tk) this).field_j, 5592405);
            qn.f(var8, var9, ((tk) this).field_h, ((tk) this).field_j, var7);
            if (var11.field_K) {
              qn.h(var8, var9, ((tk) this).field_h + var8, ((tk) this).field_j + var9, 1);
              qn.h(var8 - -((tk) this).field_h, var9, var8, ((tk) this).field_j + var9, 1);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (((tk) this).field_g == null) {
              break L4;
            } else {
              var10 = ((tk) this).field_a + ((tk) this).field_h + ((tk) this).field_i;
              int discarded$2 = ((tk) this).field_g.a(param0.field_v, param1 - -param0.field_B + var10, param0.field_p + param4 + ((tk) this).field_k, -((tk) this).field_a - var10 + param0.field_l, param0.field_w - (((tk) this).field_a << -845089535), ((tk) this).field_b, ((tk) this).field_c, ((tk) this).field_d, ((tk) this).field_e, 0);
              break L4;
            }
          }
          return;
        } else {
          L5: {
            var7 = 5592405;
            qn.f(param1 - -param0.field_B, param0.field_p + param4, param0.field_l, param0.field_w, ((tk) this).field_l);
            if (!param3) {
              break L5;
            } else {
              var7 = 16777215;
              break L5;
            }
          }
          L6: {
            var8 = ((tk) this).field_i + (param1 + param0.field_B);
            var9 = param0.field_p + (param4 - -((tk) this).field_m);
            qn.g(var8, var9, ((tk) this).field_h, ((tk) this).field_j, 5592405);
            qn.f(var8, var9, ((tk) this).field_h, ((tk) this).field_j, var7);
            if (var11.field_K) {
              qn.h(var8, var9, ((tk) this).field_h + var8, ((tk) this).field_j + var9, 1);
              qn.h(var8 - -((tk) this).field_h, var9, var8, ((tk) this).field_j + var9, 1);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (((tk) this).field_g == null) {
              break L7;
            } else {
              var10 = ((tk) this).field_a + ((tk) this).field_h + ((tk) this).field_i;
              int discarded$3 = ((tk) this).field_g.a(param0.field_v, param1 - -param0.field_B + var10, param0.field_p + param4 + ((tk) this).field_k, -((tk) this).field_a - var10 + param0.field_l, param0.field_w - (((tk) this).field_a << -845089535), ((tk) this).field_b, ((tk) this).field_c, ((tk) this).field_d, ((tk) this).field_e, 0);
              break L7;
            }
          }
          return;
        }
    }

    tk(ka param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((tk) this).field_e = 1;
        ((tk) this).field_d = 1;
        ((tk) this).field_i = param5;
        ((tk) this).field_b = param3;
        ((tk) this).field_c = param4;
        ((tk) this).field_j = param7;
        ((tk) this).field_k = param2;
        ((tk) this).field_a = param1;
        ((tk) this).field_m = param6;
        ((tk) this).field_h = param8;
        ((tk) this).field_g = param0;
        ((tk) this).field_l = param9;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new boolean[64];
    }
}
