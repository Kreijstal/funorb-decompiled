/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qb extends dd {
    static im field_r;
    static String field_t;
    private qk field_v;
    static ln field_s;
    static ck field_q;
    static int field_u;
    static w field_p;

    final void d(byte param0) {
        if (param0 < 107) {
            ((qb) this).d((byte) 12);
        }
        if (!(null == ((qb) this).field_v)) {
            ((qb) this).field_v.a(0);
        }
    }

    final void a(Object param0, byte param1, boolean param2) {
        try {
            Exception var4_ref_Exception = null;
            int var4 = 0;
            IOException var5 = null;
            pj var5_ref = null;
            Exception var6 = null;
            int var7 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = client.field_A ? 1 : 0;
                        if (null != ((qb) this).field_v) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            ((qb) this).field_v.a(0);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        var4_ref_Exception = (Exception) (Object) caughtException;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        ((qb) this).field_v = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        ((qb) this).field_v = (qk) param0;
                        this.e((byte) -15);
                        this.a((byte) -124, param2);
                        var4 = -84 % ((param1 - -75) / 50);
                        ((qb) this).field_h = null;
                        ((qb) this).field_c.field_n = 0;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        var5_ref = (pj) (Object) ((qb) this).field_g.a((byte) -111);
                        if (var5_ref != null) {
                            statePc = 9;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        ((qb) this).field_d.a((be) (Object) var5_ref, -7267);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 10: {
                        var5_ref = (pj) (Object) ((qb) this).field_l.a((byte) -71);
                        if (var5_ref == null) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        ((qb) this).field_n.a((be) (Object) var5_ref, -7267);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 12: {
                        if (0 != ((qb) this).field_f) {
                            statePc = 14;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        try {
                            ((qb) this).field_i.field_n = 0;
                            ((qb) this).field_i.a(true, 4);
                            ((qb) this).field_i.a(true, (int) ((qb) this).field_f);
                            ((qb) this).field_i.a(0, false);
                            ((qb) this).field_v.a(0, ((qb) this).field_i.field_r.length, 1, ((qb) this).field_i.field_r);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        var5 = (IOException) (Object) caughtException;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        try {
                            ((qb) this).field_v.a(0);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        var6 = (Exception) (Object) caughtException;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        ((qb) this).field_j = ((qb) this).field_j + 1;
                        ((qb) this).field_o = -2;
                        ((qb) this).field_v = null;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        ((qb) this).field_b = 0;
                        ((qb) this).field_e = ik.a(4);
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

    private final void a(byte param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            wl stackIn_3_0 = null;
            int stackIn_3_1 = 0;
            wl stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            wl stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            int stackIn_5_2 = 0;
            wl stackOut_2_0 = null;
            int stackOut_2_1 = 0;
            wl stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            int stackOut_3_2 = 0;
            wl stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != ((qb) this).field_v) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return;
                    }
                    case 2: {
                        try {
                            ((qb) this).field_i.field_n = 0;
                            stackOut_2_0 = ((qb) this).field_i;
                            stackOut_2_1 = 1;
                            stackIn_4_0 = stackOut_2_0;
                            stackIn_4_1 = stackOut_2_1;
                            stackIn_3_0 = stackOut_2_0;
                            stackIn_3_1 = stackOut_2_1;
                            if (!param1) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = (wl) (Object) stackIn_3_0;
                            stackOut_3_1 = stackIn_3_1;
                            stackOut_3_2 = 2;
                            stackIn_5_0 = stackOut_3_0;
                            stackIn_5_1 = stackOut_3_1;
                            stackIn_5_2 = stackOut_3_2;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = (wl) (Object) stackIn_4_0;
                            stackOut_4_1 = stackIn_4_1;
                            stackOut_4_2 = 3;
                            stackIn_5_0 = stackOut_4_0;
                            stackIn_5_1 = stackOut_4_1;
                            stackIn_5_2 = stackOut_4_2;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((wl) (Object) stackIn_5_0).a(stackIn_5_1 != 0, stackIn_5_2);
                            if (param0 < -108) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return;
                    }
                    case 7: {
                        try {
                            ((qb) this).field_i.a(-93, 0L);
                            ((qb) this).field_v.a(0, ((qb) this).field_i.field_r.length, 1, ((qb) this).field_i.field_r);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        try {
                            ((qb) this).field_v.a(0);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        ((qb) this).field_j = ((qb) this).field_j + 1;
                        ((qb) this).field_o = -2;
                        ((qb) this).field_v = null;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
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

    final static int a(boolean param0, int param1, jg param2, int param3, int param4, jg param5, String param6) {
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        String var10_ref = null;
        int var11 = 0;
        String var12_ref = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var15 = null;
        Object var16 = null;
        CharSequence var17 = null;
        wl stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        wl stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        wl stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_14_2 = null;
        wl stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        wl stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        wl stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        String stackIn_17_2 = null;
        wl stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        wl stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String stackOut_13_2 = null;
        wl stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        String stackOut_12_2 = null;
        wl stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        wl stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        String stackOut_16_2 = null;
        wl stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        String stackOut_15_2 = null;
        L0: {
          var16 = null;
          var14 = client.field_A ? 1 : 0;
          var15 = param2.a((byte) 56);
          var12_ref = var15;
          var12_ref = var15;
          var8 = -65 / ((-58 - param3) / 43);
          var9 = param5.a((byte) 56);
          var12_ref = var9;
          var12_ref = var9;
          if (null != qc.field_s) {
            break L0;
          } else {
            if (mb.a(false, -75)) {
              break L0;
            } else {
              return -1;
            }
          }
        }
        L1: {
          if (ph.field_xb == ba.field_f) {
            L2: {
              wb.field_Ub = null;
              we.field_b.field_n = 0;
              if (param6 == null) {
                L3: {
                  vi.field_A.field_n = 0;
                  vi.field_A.a(gg.field_A.nextInt(), false);
                  vi.field_A.a(gg.field_A.nextInt(), false);
                  stackOut_11_0 = vi.field_A;
                  stackOut_11_1 = 8;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  if (!param2.a(true)) {
                    stackOut_13_0 = (wl) (Object) stackIn_13_0;
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = "";
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    break L3;
                  } else {
                    stackOut_12_0 = (wl) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = (String) var15;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    break L3;
                  }
                }
                L4: {
                  ((wl) (Object) stackIn_14_0).b(stackIn_14_1, stackIn_14_2);
                  stackOut_14_0 = vi.field_A;
                  stackOut_14_1 = 8;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  if (param5.a(true)) {
                    stackOut_16_0 = (wl) (Object) stackIn_16_0;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = (String) var9;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    break L4;
                  } else {
                    stackOut_15_0 = (wl) (Object) stackIn_15_0;
                    stackOut_15_1 = stackIn_15_1;
                    stackOut_15_2 = "";
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_17_2 = stackOut_15_2;
                    break L4;
                  }
                }
                ((wl) (Object) stackIn_17_0).b(stackIn_17_1, stackIn_17_2);
                we.field_b.a(true, 16);
                we.field_b.field_n = we.field_b.field_n + 1;
                var10 = we.field_b.field_n;
                re.a(uk.field_p, ea.field_k, (wl) (Object) we.field_b, vi.field_A, 0);
                we.field_b.b(-var10 + we.field_b.field_n, true);
                break L2;
              } else {
                L5: {
                  var10 = 0;
                  if (!param0) {
                    break L5;
                  } else {
                    var10 = var10 | 1;
                    break L5;
                  }
                }
                L6: {
                  vi.field_A.field_n = 0;
                  vi.field_A.a(gg.field_A.nextInt(), false);
                  vi.field_A.a(gg.field_A.nextInt(), false);
                  vi.field_A.b(8, var15);
                  vi.field_A.b(8, var9);
                  var17 = (CharSequence) (Object) param6;
                  vi.field_A.b(8, bc.a(var17, 65));
                  vi.field_A.d(-1, param4);
                  vi.field_A.a(true, param1);
                  vi.field_A.a(true, var10);
                  we.field_b.a(true, 18);
                  we.field_b.field_n = we.field_b.field_n + 2;
                  var11 = we.field_b.field_n;
                  var12_ref = a.a(se.h(25144), (byte) 121);
                  if (var12_ref != null) {
                    break L6;
                  } else {
                    var12_ref = "";
                    break L6;
                  }
                }
                we.field_b.a(0, var12_ref);
                re.a(uk.field_p, ea.field_k, (wl) (Object) we.field_b, vi.field_A, 0);
                we.field_b.b(true, -var11 + we.field_b.field_n);
                break L2;
              }
            }
            wj.c(4792, -1);
            ph.field_xb = kb.field_c;
            break L1;
          } else {
            break L1;
          }
        }
        L7: {
          if (kb.field_c != ph.field_xb) {
            break L7;
          } else {
            if (!pe.b(25973, 1)) {
              break L7;
            } else {
              L8: {
                var10 = de.field_V.d((byte) -70);
                de.field_V.field_n = 0;
                if (var10 < 100) {
                  break L8;
                } else {
                  if ((var10 ^ -1) < -106) {
                    break L8;
                  } else {
                    ph.field_xb = ll.field_a;
                    ph.field_Eb = new String[-100 + var10];
                    break L7;
                  }
                }
              }
              if (var10 == 248) {
                jg.a(se.h(25144), 0);
                rk.field_Y = tj.field_ic;
                si.a(89);
                jd.field_Qb = false;
                return var10;
              } else {
                if (99 == var10) {
                  boolean discarded$1 = pe.b(25973, vi.d(1));
                  wb.field_Ub = new Boolean(f.a((wl) (Object) de.field_V, 19));
                  de.field_V.field_n = 0;
                  break L7;
                } else {
                  sm.field_e = -1;
                  bh.field_k = var10;
                  ph.field_xb = rb.field_f;
                  break L7;
                }
              }
            }
          }
        }
        L9: {
          if (ph.field_xb == ll.field_a) {
            var10 = 2;
            if (pe.b(25973, var10)) {
              var11 = de.field_V.e(3);
              de.field_V.field_n = 0;
              if (!pe.b(25973, var11)) {
                break L9;
              } else {
                var12 = ph.field_Eb.length;
                var13 = 0;
                L10: while (true) {
                  if (var12 <= var13) {
                    si.a(60);
                    jd.field_Qb = false;
                    return var12 + 100;
                  } else {
                    ph.field_Eb[var13] = de.field_V.b(true);
                    var13++;
                    continue L10;
                  }
                }
              }
            } else {
              break L9;
            }
          } else {
            break L9;
          }
        }
        L11: {
          if (rb.field_f != ph.field_xb) {
            break L11;
          } else {
            if (!fh.a((byte) 117)) {
              break L11;
            } else {
              L12: {
                if (255 == bh.field_k) {
                  var10_ref = de.field_V.c(-16829);
                  if (var10_ref == null) {
                    break L12;
                  } else {
                    a.a(var10_ref, false, se.h(25144));
                    break L12;
                  }
                } else {
                  rk.field_Y = de.field_V.c((byte) -38);
                  break L12;
                }
              }
              si.a(105);
              jd.field_Qb = false;
              return bh.field_k;
            }
          }
        }
        L13: {
          if (null == qc.field_s) {
            if (!jd.field_Qb) {
              var10 = hc.field_a;
              hc.field_a = ef.field_P;
              jd.field_Qb = true;
              ef.field_P = var10;
              break L13;
            } else {
              L14: {
                if (30000L < sl.a(-1)) {
                  rk.field_Y = kh.field_f;
                  break L14;
                } else {
                  rk.field_Y = re.field_u;
                  break L14;
                }
              }
              jd.field_Qb = false;
              return 249;
            }
          } else {
            break L13;
          }
        }
        return -1;
    }

    final boolean a(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            pj var2_ref = null;
            int var2_int = 0;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Exception var5_ref_Exception = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            long var12 = 0L;
            Object var14 = null;
            pj var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_19_0 = 0;
            int stackIn_48_0 = 0;
            int stackIn_64_0 = 0;
            int stackIn_87_0 = 0;
            int stackOut_18_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_86_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = client.field_A ? 1 : 0;
                        if (null != ((qb) this).field_v) {
                            statePc = 2;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2_long = ik.a(param0 ^ -52);
                        var4 = (int)(-((qb) this).field_e + var2_long);
                        if (200 >= var4) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        var4 = 200;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        ((qb) this).field_e = var2_long;
                        ((qb) this).field_b = ((qb) this).field_b + var4;
                        if (-30001 <= (((qb) this).field_b ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            ((qb) this).field_v.a(0);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        var5_ref_Exception = (Exception) (Object) caughtException;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        ((qb) this).field_v = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (null != ((qb) this).field_v) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        if (((qb) this).c((byte) -114) != 0) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (((qb) this).c(param0 ^ -56) != 0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        return true;
                    }
                    case 13: {
                        return false;
                    }
                    case 14: {
                        try {
                            ((qb) this).field_v.b((byte) -124);
                            var2_ref = (pj) (Object) ((qb) this).field_d.b(-2198);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var2_ref == null) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            ((qb) this).field_i.field_n = 0;
                            ((qb) this).field_i.a(true, 1);
                            ((qb) this).field_i.a(-71, var2_ref.field_r);
                            ((qb) this).field_v.a(0, ((qb) this).field_i.field_r.length, 1, ((qb) this).field_i.field_r);
                            ((qb) this).field_g.a((be) (Object) var2_ref, -7267);
                            var2_ref = (pj) (Object) ((qb) this).field_d.b((byte) 20);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (param0 == -56) {
                                statePc = 20;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            stackOut_18_0 = 0;
                            stackIn_19_0 = stackOut_18_0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        return stackIn_19_0 != 0;
                    }
                    case 20: {
                        try {
                            var2_ref = (pj) (Object) ((qb) this).field_n.b(-2198);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var2_ref == null) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((qb) this).field_i.field_n = 0;
                            ((qb) this).field_i.a(true, 0);
                            ((qb) this).field_i.a(-98, var2_ref.field_r);
                            ((qb) this).field_v.a(0, ((qb) this).field_i.field_r.length, 1, ((qb) this).field_i.field_r);
                            ((qb) this).field_l.a((be) (Object) var2_ref, -7267);
                            var2_ref = (pj) (Object) ((qb) this).field_n.b((byte) 20);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var2_int = 0;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (var2_int <= -101) {
                                statePc = 86;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var3_int = ((qb) this).field_v.b(0);
                            if (-1 > var3_int) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (-1 != (var3_int ^ -1)) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            return true;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            ((qb) this).field_b = 0;
                            var4 = 0;
                            if (null != ((qb) this).field_h) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var4 = 10;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (0 != ((qb) this).field_h.field_K) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var4 = 1;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if ((var4 ^ -1) >= -1) {
                                statePc = 71;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var5 = -((qb) this).field_c.field_n + var4;
                            if (var5 <= var3_int) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var5 = var3_int;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            ((qb) this).field_v.a(var5, ((qb) this).field_c.field_n, (byte) 17, ((qb) this).field_c.field_r);
                            if (((qb) this).field_f == 0) {
                                statePc = 41;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var6 = 0;
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (var5 <= var6) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            ((qb) this).field_c.field_r[((qb) this).field_c.field_n - -var6] = (byte)qm.b((int) ((qb) this).field_c.field_r[((qb) this).field_c.field_n + var6], (int) ((qb) this).field_f);
                            var6++;
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            ((qb) this).field_c.field_n = ((qb) this).field_c.field_n + var5;
                            if (((qb) this).field_c.field_n >= var4) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (((qb) this).field_h == null) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            ((qb) this).field_c.field_n = 0;
                            var6 = ((qb) this).field_c.d((byte) -48);
                            var7 = ((qb) this).field_c.i(7553);
                            var8 = ((qb) this).field_c.d((byte) -99);
                            var9 = ((qb) this).field_c.i(7553);
                            var10 = 127 & var8;
                            if (0 == (128 & var8)) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            stackOut_46_0 = 1;
                            stackIn_48_0 = stackOut_46_0;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            stackOut_47_0 = 0;
                            stackIn_48_0 = stackOut_47_0;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            var11 = stackIn_48_0;
                            var12 = (long)var7 + ((long)var6 << -1415245088);
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 53;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var14_ref = (pj) (Object) ((qb) this).field_l.b(param0 + -2142);
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (var14_ref == null) {
                                statePc = 58;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (var14_ref.field_r == var12) {
                                statePc = 58;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var14_ref = (pj) (Object) ((qb) this).field_l.b((byte) 20);
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            var14_ref = (pj) (Object) ((qb) this).field_g.b(-2198);
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (var14_ref == null) {
                                statePc = 58;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if ((var14_ref.field_r ^ -1L) != (var12 ^ -1L)) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var14_ref = (pj) (Object) ((qb) this).field_g.b((byte) 20);
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (var14_ref == null) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (var10 == 0) {
                                statePc = 63;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            stackOut_62_0 = 9;
                            stackIn_64_0 = stackOut_62_0;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            stackOut_63_0 = 5;
                            stackIn_64_0 = stackOut_63_0;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            var15 = stackIn_64_0;
                            ((qb) this).field_h = var14_ref;
                            ((qb) this).field_h.field_J = new wl(var9 - -var15 - -((qb) this).field_h.field_M);
                            ((qb) this).field_h.field_J.a(true, var10);
                            ((qb) this).field_h.field_J.a(var9, false);
                            ((qb) this).field_h.field_K = 10;
                            ((qb) this).field_c.field_n = 0;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (0 == ((qb) this).field_h.field_K) {
                                statePc = 67;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (-1 != ((qb) this).field_c.field_r[0]) {
                                statePc = 69;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            ((qb) this).field_h.field_K = 1;
                            ((qb) this).field_c.field_n = 0;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            ((qb) this).field_h = null;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            var5 = -((qb) this).field_h.field_M + ((qb) this).field_h.field_J.field_r.length;
                            var6 = -((qb) this).field_h.field_K + 512;
                            if (var6 > var5 + -((qb) this).field_h.field_J.field_n) {
                                statePc = 73;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            var6 = var5 + -((qb) this).field_h.field_J.field_n;
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if (var6 > var3_int) {
                                statePc = 76;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            var6 = var3_int;
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            ((qb) this).field_v.a(var6, ((qb) this).field_h.field_J.field_n, (byte) 17, ((qb) this).field_h.field_J.field_r);
                            if (0 == ((qb) this).field_f) {
                                statePc = 81;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            var7 = 0;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if (var7 >= var6) {
                                statePc = 81;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            ((qb) this).field_h.field_J.field_r[var7 + ((qb) this).field_h.field_J.field_n] = (byte)qm.b((int) ((qb) this).field_h.field_J.field_r[var7 + ((qb) this).field_h.field_J.field_n], (int) ((qb) this).field_f);
                            var7++;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            ((qb) this).field_h.field_K = ((qb) this).field_h.field_K + var6;
                            ((qb) this).field_h.field_J.field_n = ((qb) this).field_h.field_J.field_n + var6;
                            if (((qb) this).field_h.field_J.field_n != var5) {
                                statePc = 83;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            ((qb) this).field_h.e((byte) 116);
                            ((qb) this).field_h.field_z = false;
                            ((qb) this).field_h = null;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            if (512 != ((qb) this).field_h.field_K) {
                                statePc = 85;
                            } else {
                                statePc = 84;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            ((qb) this).field_h.field_K = 0;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var2_int++;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            stackOut_86_0 = 1;
                            stackIn_87_0 = stackOut_86_0;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        return stackIn_87_0 != 0;
                    }
                    case 88: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 89;
                        continue stateLoop;
                    }
                    case 89: {
                        try {
                            ((qb) this).field_v.a(0);
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 92;
                        continue stateLoop;
                    }
                    case 92: {
                        ((qb) this).field_j = ((qb) this).field_j + 1;
                        ((qb) this).field_o = -2;
                        ((qb) this).field_v = null;
                        if (((qb) this).c((byte) -115) != 0) {
                            statePc = 95;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    }
                    case 93: {
                        if (-1 != (((qb) this).c(0) ^ -1)) {
                            statePc = 95;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    }
                    case 94: {
                        return true;
                    }
                    case 95: {
                        return false;
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
        try {
            ((qb) this).field_v.a(0);
            // if_icmpeq L26
            boolean discarded$0 = ((qb) this).a((byte) -2);
        } catch (Exception exception) {
        }
        ((qb) this).field_o = -1;
        ((qb) this).field_j = ((qb) this).field_j + 1;
        ((qb) this).field_v = null;
        ((qb) this).field_f = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    public static void d(int param0) {
        field_s = null;
        field_q = null;
        field_p = null;
        int var1 = -57 % ((60 - param0) / 50);
        field_t = null;
        field_r = null;
    }

    final static int a(int param0, String param1, boolean param2) {
        if (param0 != 0) {
            return 14;
        }
        if (!param2) {
            return wf.field_q.a(param1);
        }
        return aj.field_d.a(param1);
    }

    final static void a(int param0, byte param1, kn param2) {
        pb.field_c.a((bh) (Object) param2, 2777);
        if (param1 != 85) {
            field_t = null;
        }
        fm.a((byte) -113, param0, param2);
    }

    final static void a(Throwable param0, int param1, String param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            mh var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            fd stackIn_10_0 = null;
            java.net.URL stackIn_10_1 = null;
            java.net.URL stackIn_10_2 = null;
            java.net.URL stackIn_10_3 = null;
            StringBuilder stackIn_10_4 = null;
            fd stackIn_11_0 = null;
            java.net.URL stackIn_11_1 = null;
            java.net.URL stackIn_11_2 = null;
            java.net.URL stackIn_11_3 = null;
            StringBuilder stackIn_11_4 = null;
            fd stackIn_12_0 = null;
            java.net.URL stackIn_12_1 = null;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            StringBuilder stackIn_12_4 = null;
            String stackIn_12_5 = null;
            fd stackOut_9_0 = null;
            java.net.URL stackOut_9_1 = null;
            java.net.URL stackOut_9_2 = null;
            java.net.URL stackOut_9_3 = null;
            StringBuilder stackOut_9_4 = null;
            fd stackOut_10_0 = null;
            java.net.URL stackOut_10_1 = null;
            java.net.URL stackOut_10_2 = null;
            java.net.URL stackOut_10_3 = null;
            StringBuilder stackOut_10_4 = null;
            String stackOut_10_5 = null;
            fd stackOut_11_0 = null;
            java.net.URL stackOut_11_1 = null;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            StringBuilder stackOut_11_4 = null;
            String stackOut_11_5 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = client.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3_ref = "";
                            if (param0 == null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var3_ref = j.a(param0, (byte) 37);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (param2 == null) {
                                statePc = 7;
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
                            if (param0 == null) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var3_ref = var3_ref + " | ";
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
                            var3_ref = var3_ref + param2;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            im.a(18239, var3_ref);
                            var3_ref = bh.a(0, var3_ref, "%3a", ":");
                            var3_ref = bh.a(param1 + -16408, var3_ref, "%40", "@");
                            var3_ref = bh.a(param1 ^ param1, var3_ref, "%26", "&");
                            var7 = bh.a(0, var3_ref, "%23", "#");
                            if (null != th.field_b) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return;
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = o.field_f;
                            stackOut_9_1 = null;
                            stackOut_9_2 = null;
                            stackOut_9_3 = th.field_b.getCodeBase();
                            stackOut_9_4 = new StringBuilder().append("clienterror.ws?c=").append(wb.field_Rb).append("&u=");
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            stackIn_11_3 = stackOut_9_3;
                            stackIn_11_4 = stackOut_9_4;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            stackIn_10_2 = stackOut_9_2;
                            stackIn_10_3 = stackOut_9_3;
                            stackIn_10_4 = stackOut_9_4;
                            if (eh.field_d != null) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = (fd) (Object) stackIn_10_0;
                            stackOut_10_1 = null;
                            stackOut_10_2 = null;
                            stackOut_10_3 = (java.net.URL) (Object) stackIn_10_3;
                            stackOut_10_4 = (StringBuilder) (Object) stackIn_10_4;
                            stackOut_10_5 = "" + ua.field_B;
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            stackIn_12_2 = stackOut_10_2;
                            stackIn_12_3 = stackOut_10_3;
                            stackIn_12_4 = stackOut_10_4;
                            stackIn_12_5 = stackOut_10_5;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = (fd) (Object) stackIn_11_0;
                            stackOut_11_1 = null;
                            stackOut_11_2 = null;
                            stackOut_11_3 = (java.net.URL) (Object) stackIn_11_3;
                            stackOut_11_4 = (StringBuilder) (Object) stackIn_11_4;
                            stackOut_11_5 = eh.field_d;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            stackIn_12_2 = stackOut_11_2;
                            stackIn_12_3 = stackOut_11_3;
                            stackIn_12_4 = stackOut_11_4;
                            stackIn_12_5 = stackOut_11_5;
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
                            new java.net.URL(stackIn_12_3, stackIn_12_5 + "&v1=" + fd.field_k + "&v2=" + fd.field_c + "&e=" + var7);
                            var4 = ((fd) (Object) stackIn_12_0).a(stackIn_12_1, (byte) 42);
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
                            if (var4.field_c != 0) {
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
                            ua.a(1L, -128);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (1 != var4.field_c) {
                                statePc = 19;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var5 = (DataInputStream) var4.field_b;
                            int discarded$1 = var5.read();
                            var5.close();
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
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

    private final void e(byte param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param0 == -15) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return;
                    }
                    case 2: {
                        if (((qb) this).field_v != null) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            ((qb) this).field_i.field_n = 0;
                            ((qb) this).field_i.a(true, 6);
                            ((qb) this).field_i.b((byte) 46, 3);
                            ((qb) this).field_i.d(-1, 0);
                            ((qb) this).field_v.a(0, ((qb) this).field_i.field_r.length, 1, ((qb) this).field_i.field_r);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        try {
                            ((qb) this).field_v.a(param0 + 15);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        ((qb) this).field_v = null;
                        ((qb) this).field_j = ((qb) this).field_j + 1;
                        ((qb) this).field_o = -2;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
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

    public qb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = 22;
        field_s = new ln();
    }
}
