/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ij extends gj implements da {
    static int[] field_H;
    private String[] field_K;
    static String[] field_J;
    static int field_I;
    static int field_L;
    private bb[] field_M;
    static si[] field_F;
    private pe field_G;

    final boolean a(int param0, int param1, qa param2, char param3) {
        if (!(!super.a(param0 ^ 0, param1, param2, param3))) {
            return true;
        }
        if (!(-99 != (param1 ^ -1))) {
            return ((ij) this).b(param2, -28533);
        }
        if (param0 != -2) {
            return true;
        }
        if (param1 == 99) {
            return ((ij) this).a(32, param2);
        }
        return false;
    }

    ij(pe param0) {
        super(0, 0, 0, 0, (ch) null);
        ((ij) this).field_G = param0;
    }

    final static int a(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            ni var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_36_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_23_0 = 0;
            int stackOut_31_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_35_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if ((td.field_k.field_c ^ -1) <= -5) {
                            statePc = 2;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if ((td.field_k.field_b ^ -1) != 0) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return 3;
                    }
                    case 4: {
                        if ((td.field_k.field_b ^ -1) == 1) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return 1;
                    }
                    case 6: {
                        return 4;
                    }
                    case 7: {
                        try {
                            if (lc.field_r == -1) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            nj.field_a = mh.field_x.a(il.field_g, (byte) 32, fh.field_g);
                            lc.field_r = lc.field_r + 1;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (-2 != lc.field_r) {
                                statePc = 17;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (2 == nj.field_a.field_b) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = wb.a(-1, 5);
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return stackIn_14_0;
                    }
                    case 15: {
                        try {
                            if ((nj.field_a.field_b ^ -1) != -2) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            lc.field_r = lc.field_r + 1;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if ((lc.field_r ^ -1) != -3) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            jj.field_M = new td((java.net.Socket) nj.field_a.field_e, mh.field_x);
                            var2 = new ni(13);
                            ob.a(wj.field_d, of.field_b, (byte) -19, b.field_a, var2);
                            var2.a(-11, 15);
                            var2.a(tj.field_c, (byte) -28);
                            jj.field_M.a((byte) -92, 13, 0, var2.field_k);
                            lc.field_r = lc.field_r + 1;
                            mk.field_e = 30000L + lj.a((byte) -80);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (3 == lc.field_r) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (0 >= jj.field_M.e(-110)) {
                                statePc = 26;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var1_int = jj.field_M.f(1605772320);
                            if (-1 == (var1_int ^ -1)) {
                                statePc = 25;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            stackOut_23_0 = wb.a(var1_int, 5);
                            stackIn_24_0 = stackOut_23_0;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        return stackIn_24_0;
                    }
                    case 25: {
                        try {
                            lc.field_r = lc.field_r + 1;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if ((lj.a((byte) -25) ^ -1L) < (mk.field_e ^ -1L)) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            stackOut_28_0 = wb.a(-2, 5);
                            stackIn_29_0 = stackOut_28_0;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        return stackIn_29_0;
                    }
                    case 30: {
                        try {
                            if (param0 > 94) {
                                statePc = 33;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            stackOut_31_0 = -52;
                            stackIn_32_0 = stackOut_31_0;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        return stackIn_32_0;
                    }
                    case 33: {
                        try {
                            if (-5 == (lc.field_r ^ -1)) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            return -1;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            td.field_k.a((Object) (Object) jj.field_M, md.field_S, (byte) 105);
                            lc.field_r = 0;
                            jj.field_M = null;
                            nj.field_a = null;
                            stackOut_35_0 = 0;
                            stackIn_36_0 = stackOut_35_0;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        return stackIn_36_0;
                    }
                    case 37: {
                        var1 = (IOException) (Object) caughtException;
                        return wb.a(-3, 5);
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

    final static void a(int param0, String param1, String param2) {
        if (param0 != -1) {
            ij.e((byte) 47);
        }
        if (ok.field_x != null) {
            ok.field_x.n(-22645);
        }
        lg.field_b = new ul(param1, param2, false, true, true);
        ak.field_a.d((qa) (Object) lg.field_b, 26034);
    }

    public static void e(byte param0) {
        field_H = null;
        field_F = null;
        if (param0 != -20) {
            ij.e((byte) -66);
        }
        field_J = null;
    }

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = fleas.field_A ? 1 : 0;
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((ij) this).field_K.length) {
            L1: {
              if (param4 != ((ij) this).field_M[((ij) this).field_K.length]) {
                break L1;
              } else {
                ((ij) this).field_G.a(-92);
                break L1;
              }
            }
            L2: {
              if (param3 == 248) {
                break L2;
              } else {
                ij.e((byte) -83);
                break L2;
              }
            }
            return;
          } else {
            if (((ij) this).field_M[var6] == param4) {
              ((ij) this).field_G.a(((ij) this).field_K[var6], (byte) -96);
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        super.b(param0, param1, param2, param3);
        if (param3 != 0) {
            return;
        }
        fa var5 = ug.field_e;
        if (((ij) this).field_K != null) {
            int discarded$0 = var5.a(lc.field_s, param1 + ((ij) this).field_y, ((ij) this).field_z + param0, ((ij) this).field_u, 20, 16777215, -1, 0, 0, var5.field_H + var5.field_K);
        }
    }

    final void a(String[] param0, int param1) {
        int var3 = 0;
        int var4_int = 0;
        me var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = fleas.field_A ? 1 : 0;
          ((ij) this).field_C.f(1);
          if (param0 == null) {
            break L0;
          } else {
            if (-1 != (param0.length ^ -1)) {
              var3 = param0.length;
              ((ij) this).field_K = new String[var3];
              var4_int = 0;
              L1: while (true) {
                if (var3 <= var4_int) {
                  var4 = new me(ug.field_e, 0, 1);
                  ((ij) this).field_M = new bb[var3 - -1];
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var3) {
                      ((ij) this).field_M[var3] = new bb(ue.field_b, (kd) this);
                      var5 = -104 / ((param1 - 15) / 54);
                      ((ij) this).field_M[var3].field_p = (ch) (Object) var4;
                      ((ij) this).field_M[var3].a(0, 100, (var3 - -1) * 16 + 20, 15, 80);
                      ((ij) this).a((qa) (Object) ((ij) this).field_M[var3], (byte) -112);
                      return;
                    } else {
                      ((ij) this).field_M[var5] = new bb(((ij) this).field_K[var5], (kd) this);
                      ((ij) this).field_M[var5].field_p = (ch) (Object) var4;
                      ((ij) this).field_M[var5].field_m = lh.field_d;
                      ((ij) this).field_M[var5].a(0, 80, 20 + var5 * 16, 15, 80);
                      ((ij) this).a((qa) (Object) ((ij) this).field_M[var5], (byte) -89);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  ((ij) this).field_K[var4_int] = al.a((CharSequence) (Object) param0[var4_int], (byte) 111).replace(' ', ' ');
                  var4_int++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
        ((ij) this).field_K = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = 10;
        field_J = new String[]{"Complete first five levels of either set", "Complete first ten levels of either set", "Complete first twenty levels of either set", "Complete all levels of both sets", "Destroy the golden walls on level 'Golden Fleas'", "Save all fleas on level 1 of the Classic set", "Save all fleas on level 2 of the Classic set", "Save all fleas on level 3 of the Classic set", "Save all fleas on level 4 of the Classic set", "Save all fleas on level 5 of the Classic set", "Complete level 12 of the New set without any fleas drowning", "Get all fleas in the air at the same time on any level", "Complete the first five levels (of either set) without restarting", "Complete the first ten levels (of either set) without restarting", "Complete the first twenty levels (of either set) without restarting", "Complete all levels (of either set) without restarting"};
    }
}
