/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ge {
    private long[] field_c;
    static ob field_d;
    private byte[] field_i;
    private byte[] field_j;
    private long[] field_k;
    private int field_h;
    private long[] field_g;
    private long[] field_a;
    private int field_e;
    static java.util.zip.CRC32 field_f;
    private long[] field_b;

    public static void b(int param0) {
        field_d = null;
        int var1 = -34 % ((param0 - 31) / 51);
        field_f = null;
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = Geoblox.field_C;
        if (param0 >= 103) {
          var2 = 0;
          var3 = 0;
          L0: while (true) {
            if ((var2 ^ -1) <= -9) {
              var2 = 0;
              L1: while (true) {
                if ((var2 ^ -1) <= -9) {
                  var2 = 1;
                  L2: while (true) {
                    if (10 < var2) {
                      var2 = 0;
                      L3: while (true) {
                        if (var2 >= 8) {
                          return;
                        } else {
                          ((ge) this).field_c[var2] = f.a(((ge) this).field_c[var2], f.a(((ge) this).field_b[var2], ((ge) this).field_g[var2]));
                          var2++;
                          continue L3;
                        }
                      }
                    } else {
                      var3 = 0;
                      L4: while (true) {
                        if ((var3 ^ -1) <= -9) {
                          var3 = 0;
                          L5: while (true) {
                            if (-9 >= (var3 ^ -1)) {
                              ((ge) this).field_a[0] = f.a(((ge) this).field_a[0], qc.field_h[var2]);
                              var3 = 0;
                              L6: while (true) {
                                if (var3 >= 8) {
                                  var3 = 0;
                                  L7: while (true) {
                                    if (8 <= var3) {
                                      var2++;
                                      continue L2;
                                    } else {
                                      ((ge) this).field_b[var3] = ((ge) this).field_k[var3];
                                      var3++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  ((ge) this).field_k[var3] = ((ge) this).field_a[var3];
                                  var7 = 0;
                                  var4 = var7;
                                  var5 = 56;
                                  L8: while (true) {
                                    if (var7 >= 8) {
                                      var3++;
                                      continue L6;
                                    } else {
                                      ((ge) this).field_k[var3] = f.a(((ge) this).field_k[var3], qc.field_g[var7][cd.a(255, (int)(((ge) this).field_b[cd.a(-var7 + var3, 7)] >>> var5))]);
                                      var7++;
                                      var5 -= 8;
                                      continue L8;
                                    }
                                  }
                                }
                              }
                            } else {
                              ((ge) this).field_a[var3] = ((ge) this).field_k[var3];
                              var3++;
                              continue L5;
                            }
                          }
                        } else {
                          ((ge) this).field_k[var3] = 0L;
                          var4 = 0;
                          var5 = 56;
                          L9: while (true) {
                            if ((var4 ^ -1) <= -9) {
                              var3++;
                              continue L4;
                            } else {
                              ((ge) this).field_k[var3] = f.a(((ge) this).field_k[var3], qc.field_g[var4][cd.a(255, (int)(((ge) this).field_a[cd.a(7, var3 + -var4)] >>> var5))]);
                              var5 -= 8;
                              var4++;
                              continue L9;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  ((ge) this).field_a[var2] = ((ge) this).field_c[var2];
                  ((ge) this).field_b[var2] = f.a(((ge) this).field_g[var2], ((ge) this).field_c[var2]);
                  var2++;
                  continue L1;
                }
              }
            } else {
              ((ge) this).field_g[var2] = f.a(cj.a((long)((ge) this).field_i[7 + var3], 255L), f.a(f.a(f.a(f.a(cj.a(1095216660480L, (long)((ge) this).field_i[var3 - -3] << 2028813600), f.a(cj.a(255L, (long)((ge) this).field_i[var3 - -2]) << 500873448, f.a(cj.a((long)((ge) this).field_i[var3 + 1] << 1835312432, 71776119061217280L), (long)((ge) this).field_i[var3] << -1648548680))), cj.a((long)((ge) this).field_i[4 + var3] << -1312887208, 4278190080L)), cj.a(16711680L, (long)((ge) this).field_i[var3 + 5] << -1498542512)), cj.a((long)((ge) this).field_i[var3 - -6] << -1331544312, 65280L)));
              var3 += 8;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final void a(byte[] param0, long param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Geoblox.field_C;
        var5 = 0;
        var6 = 7 & 8 - (7 & (int)param1);
        var7 = 7 & ((ge) this).field_h;
        var9 = param1;
        var11 = 31;
        var12 = param2;
        L0: while (true) {
          if (-1 < (var11 ^ -1)) {
            L1: while (true) {
              if (8L >= param1) {
                L2: {
                  if ((param1 ^ -1L) >= -1L) {
                    var8 = 0;
                    break L2;
                  } else {
                    var8 = param0[var5] << var6 & 255;
                    ((ge) this).field_i[((ge) this).field_e] = (byte)lb.a((int) ((ge) this).field_i[((ge) this).field_e], var8 >>> var7);
                    break L2;
                  }
                }
                L3: {
                  if (8L > param1 + (long)var7) {
                    ((ge) this).field_h = (int)((long)((ge) this).field_h + param1);
                    break L3;
                  } else {
                    L4: {
                      param1 = param1 - (long)(8 + -var7);
                      ((ge) this).field_e = ((ge) this).field_e + 1;
                      ((ge) this).field_h = ((ge) this).field_h + (-var7 + 8);
                      if ((((ge) this).field_h ^ -1) != -513) {
                        break L4;
                      } else {
                        this.c(118);
                        ((ge) this).field_h = 0;
                        ((ge) this).field_e = 0;
                        break L4;
                      }
                    }
                    ((ge) this).field_i[((ge) this).field_e] = (byte)cd.a(var8 << -var7 + 8, 255);
                    ((ge) this).field_h = ((ge) this).field_h + (int)param1;
                    break L3;
                  }
                }
                return;
              } else {
                L5: {
                  var8 = 255 & param0[var5] << var6 | (param0[var5 + 1] & 255) >>> -var6 + 8;
                  if (-1 < (var8 ^ -1)) {
                    break L5;
                  } else {
                    if (256 <= var8) {
                      break L5;
                    } else {
                      L6: {
                        ((ge) this).field_i[((ge) this).field_e] = (byte)lb.a((int) ((ge) this).field_i[((ge) this).field_e], var8 >>> var7);
                        ((ge) this).field_h = ((ge) this).field_h + (-var7 + 8);
                        ((ge) this).field_e = ((ge) this).field_e + 1;
                        if (512 == ((ge) this).field_h) {
                          this.c(param2 ^ 111);
                          ((ge) this).field_e = 0;
                          ((ge) this).field_h = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      ((ge) this).field_i[((ge) this).field_e] = (byte)cd.a(255, var8 << -var7 + 8);
                      param1 = param1 - 8L;
                      ((ge) this).field_h = ((ge) this).field_h + var7;
                      var5++;
                      continue L1;
                    }
                  }
                }
                throw new RuntimeException("LOGIC ERROR");
              }
            }
          } else {
            var12 = var12 + ((255 & (int)var9) + (((ge) this).field_j[var11] & 255));
            ((ge) this).field_j[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
            continue L0;
          }
        }
    }

    final static boolean a(String param0, byte param1) {
        if (param1 != 12) {
            field_d = null;
        }
        CharSequence var3 = (CharSequence) (Object) param0;
        return vg.field_b.equals((Object) (Object) oe.a(var3, 12));
    }

    final void a(byte[] param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        L0: {
          var8 = Geoblox.field_C;
          ((ge) this).field_i[((ge) this).field_e] = (byte)lb.a((int) ((ge) this).field_i[((ge) this).field_e], 128 >>> cd.a(((ge) this).field_h, 7));
          ((ge) this).field_e = ((ge) this).field_e + 1;
          if (-33 <= (((ge) this).field_e ^ -1)) {
            break L0;
          } else {
            L1: while (true) {
              if (((ge) this).field_e >= 64) {
                this.c(116);
                ((ge) this).field_e = 0;
                break L0;
              } else {
                ((ge) this).field_e = ((ge) this).field_e + 1;
                ((ge) this).field_i[((ge) this).field_e] = (byte) 0;
                continue L1;
              }
            }
          }
        }
        L2: {
          if (param2) {
            break L2;
          } else {
            ((ge) this).a(-38);
            break L2;
          }
        }
        L3: while (true) {
          if ((((ge) this).field_e ^ -1) <= -33) {
            sf.a(((ge) this).field_j, 0, ((ge) this).field_i, 32, 32);
            this.c(117);
            var4 = 0;
            var5 = param1;
            L4: while (true) {
              if (-9 >= (var4 ^ -1)) {
                return;
              } else {
                var6 = ((ge) this).field_c[var4];
                param0[var5] = (byte)(int)(var6 >>> -462128648);
                param0[1 + var5] = (byte)(int)(var6 >>> 2049056944);
                param0[2 + var5] = (byte)(int)(var6 >>> -537680344);
                param0[var5 + 3] = (byte)(int)(var6 >>> -1996870816);
                param0[var5 - -4] = (byte)(int)(var6 >>> -1477542184);
                param0[var5 - -5] = (byte)(int)(var6 >>> 1023994704);
                param0[6 + var5] = (byte)(int)(var6 >>> 182120456);
                param0[var5 - -7] = (byte)(int)var6;
                var4++;
                var5 += 8;
                continue L4;
              }
            }
          } else {
            ((ge) this).field_e = ((ge) this).field_e + 1;
            ((ge) this).field_i[((ge) this).field_e] = (byte) 0;
            continue L3;
          }
        }
    }

    final static int a(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            Object var2 = null;
            qc var3 = null;
            int stackIn_12_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_32_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_11_0 = 0;
            int stackOut_23_0 = 0;
            int stackOut_26_0 = 0;
            int stackOut_31_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (-5 < (wg.field_i.field_b ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (wg.field_i.field_q != -1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return 3;
                    }
                    case 3: {
                        if (wg.field_i.field_q != -2) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return 4;
                    }
                    case 5: {
                        return 1;
                    }
                    case 6: {
                        try {
                            if (qh.field_J != 0) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            gj.field_s = ph.field_i.a(vg.field_a, gh.field_z, false);
                            qh.field_J = qh.field_J + 1;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (qh.field_J != 1) {
                                statePc = 15;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (gj.field_s.field_a == 2) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = eb.a(-1, 28625);
                            stackIn_12_0 = stackOut_11_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return stackIn_12_0;
                    }
                    case 13: {
                        try {
                            if (1 != gj.field_s.field_a) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            qh.field_J = qh.field_J + 1;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (param0 == -74) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var2 = null;
                            boolean discarded$2 = ge.a((String) null, (byte) -15);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (2 != qh.field_J) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            li.field_a = new ba((java.net.Socket) gj.field_s.field_b, ph.field_i);
                            var3 = new qc(13);
                            ke.a(pc.field_C, true, hc.field_T, bm.field_u, var3);
                            var3.d((byte) -54, 15);
                            var3.c((byte) 95, ag.field_l);
                            li.field_a.a(100, 0, 13, var3.field_j);
                            qh.field_J = qh.field_J + 1;
                            eb.field_b = 30000L + oa.a(param0 + -12446);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (-4 != (qh.field_J ^ -1)) {
                                statePc = 29;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (0 < li.field_a.a((byte) 78)) {
                                statePc = 25;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (oa.a(-12520) > eb.field_b) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            stackOut_23_0 = eb.a(-2, param0 ^ -28569);
                            stackIn_24_0 = stackOut_23_0;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        return stackIn_24_0;
                    }
                    case 25: {
                        try {
                            var1_int = li.field_a.c(-17422);
                            if (-1 == (var1_int ^ -1)) {
                                statePc = 28;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            stackOut_26_0 = eb.a(var1_int, 28625);
                            stackIn_27_0 = stackOut_26_0;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        return stackIn_27_0;
                    }
                    case 28: {
                        try {
                            qh.field_J = qh.field_J + 1;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (4 == qh.field_J) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            return -1;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            wg.field_i.a((Object) (Object) li.field_a, false, si.field_c);
                            gj.field_s = null;
                            qh.field_J = 0;
                            li.field_a = null;
                            stackOut_31_0 = 0;
                            stackIn_32_0 = stackOut_31_0;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        return stackIn_32_0;
                    }
                    case 33: {
                        var1 = (IOException) (Object) caughtException;
                        return eb.a(-3, 28625);
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

    final void a(int param0) {
        int var2 = 0;
        int var3 = Geoblox.field_C;
        for (var2 = 0; -33 < (var2 ^ -1); var2++) {
            ((ge) this).field_j[var2] = (byte) 0;
        }
        ((ge) this).field_i[0] = (byte) 0;
        ((ge) this).field_h = 0;
        ((ge) this).field_e = 0;
        for (var2 = 0; 8 > var2; var2++) {
            ((ge) this).field_c[var2] = 0L;
        }
        if (param0 <= 51) {
            ((ge) this).field_e = 101;
        }
    }

    ge() {
        ((ge) this).field_c = new long[8];
        ((ge) this).field_i = new byte[64];
        ((ge) this).field_j = new byte[32];
        ((ge) this).field_e = 0;
        ((ge) this).field_h = 0;
        ((ge) this).field_b = new long[8];
        ((ge) this).field_a = new long[8];
        ((ge) this).field_g = new long[8];
        ((ge) this).field_k = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new java.util.zip.CRC32();
    }
}
