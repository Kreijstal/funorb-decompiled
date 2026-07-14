/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb implements Runnable {
    static int field_i;
    static String field_a;
    static int[] field_c;
    private qk field_h;
    static int[] field_b;
    private boolean field_f;
    private Thread field_g;
    static cb field_d;
    int field_e;

    final static mg[] a(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = -56 / ((param1 - -9) / 63);
        return kh.a(1, param4, (byte) -105, param3, param2, 3, 1, param0, 1);
    }

    final static void a(String param0, String param1, java.applet.Applet param2, long param3, byte param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var8 = param2.getParameter("cookiehost");
                var7 = var8;
                var7 = var8;
                if (param4 == -2) {
                  break L0;
                } else {
                  field_d = null;
                  break L0;
                }
              }
              L1: {
                var9 = param0 + "=" + param1 + "; version=1; path=/; domain=" + var8;
                var7 = var9;
                var7 = var9;
                if (param3 >= 0L) {
                  var7 = var9 + "; Expires=" + gh.a(param3 * 1000L + hc.a(-9986), (byte) 96) + "; Max-Age=" + param3;
                  break L1;
                } else {
                  var7 = var9 + "; Discard;";
                  break L1;
                }
              }
              q.a("document.cookie=\"" + var7 + "\"", -17107, param2);
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var6 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) {
        ((sb) this).field_f = true;
        Object var2 = (Object) (Object) ((sb) this).field_h;
        // monitorenter ((sb) this).field_h
        ((Object) (Object) ((sb) this).field_h).notifyAll();
        // monitorexit var2
        if (param0 != -56) {
            return;
        }
        try {
            if (false) throw (InterruptedException) null;
            ((sb) this).field_g.join();
        } catch (InterruptedException interruptedException) {
        }
        ((sb) this).field_g = null;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            bl var6 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = Virogrid.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((sb) this).field_f) {
                            statePc = 21;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((sb) this).field_h;
                        // monitorenter ((sb) this).field_h
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var6 = (bl) (Object) ((sb) this).field_h.a((byte) -103);
                            if (var6 != null) {
                                statePc = 10;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((Object) (Object) ((sb) this).field_h).wait();
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof InterruptedException ? 7 : 12);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            interruptedException = (InterruptedException) (Object) caughtException;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            // monitorexit var2
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            ((sb) this).field_e = ((sb) this).field_e - 1;
                            // monitorexit var2
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var4 = caughtException;
                            // monitorexit var2
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        throw (RuntimeException) (Object) var4;
                    }
                    case 14: {
                        try {
                            if (var6.field_E == -3) {
                                statePc = 17;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (-4 != var6.field_E) {
                                statePc = 20;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var6.field_C = var6.field_I.a((int)var6.field_j, -54);
                            var6.field_t = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            boolean discarded$1 = var6.field_I.a(var6.field_C, (int)var6.field_j, var6.field_C.length, (byte) -45);
                            var6.field_t = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        var2_ref = (Exception) (Object) caughtException;
                        en.a((String) null, (Throwable) (Object) var2_ref, 1);
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        var6.field_t = false;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 21: {
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

    final bl a(int param0, int param1, gl param2) {
        bl var4 = null;
        Object var5 = null;
        bl var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        Object stackIn_3_0 = null;
        bl stackIn_10_0 = null;
        Object stackOut_2_0 = null;
        bl stackOut_9_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Virogrid.field_F ? 1 : 0;
                    var4 = new bl();
                    var4.field_E = 1;
                    var5 = (Object) (Object) ((sb) this).field_h;
                    // monitorenter ((sb) this).field_h
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = (bl) (Object) ((sb) this).field_h.d(param1 ^ 16577);
                        if (param1 == -16578) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        // monitorexit var5
                        stackOut_2_0 = null;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return (bl) (Object) stackIn_3_0;
                }
                case 4: {
                    try {
                        if (var6 == null) {
                            statePc = 12;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((long)param0 ^ -1L) != (var6.field_j ^ -1L)) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param2 != var6.field_I) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6.field_E == 2) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4.field_t = false;
                        var4.field_C = var6.field_C;
                        // monitorexit var5
                        stackOut_9_0 = (bl) var4;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    try {
                        var6 = (bl) (Object) ((sb) this).field_h.a(26605);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        // monitorexit var5
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) var7;
                }
                case 16: {
                    var4.field_C = param2.a(param0, param1 ^ 16542);
                    var4.field_w = true;
                    var4.field_t = false;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        tm var4 = null;
        int var4_int = 0;
        int var5 = 0;
        da var5_ref_da = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        hg var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        L0: {
          var8 = Virogrid.field_F ? 1 : 0;
          if (param0 == -61) {
            break L0;
          } else {
            mg[] discarded$1 = sb.a(-47, (byte) -80, -105, 81, 28);
            break L0;
          }
        }
        L1: {
          var9 = sh.field_qb;
          var2 = var9.g(11132);
          var3 = var9.g(11132);
          if (var2 == 0) {
            var4 = (tm) (Object) bj.field_o.a((byte) -64);
            if (var4 != null) {
              L2: {
                var5 = -var9.field_l + ba.field_a;
                var13 = var4.field_p;
                var12 = var13;
                var11 = var12;
                var10 = var11;
                var6 = var10;
                if (var13.length << -851125662 >= var5) {
                  break L2;
                } else {
                  var5 = var13.length << 235369378;
                  break L2;
                }
              }
              var7 = 0;
              L3: while (true) {
                if (var5 <= var7) {
                  var4.a(false);
                  break L1;
                } else {
                  var6[var7 >> -1694000542] = var6[var7 >> -1694000542] + (var9.g(jd.a((int) param0, -11073)) << (rb.a(var7, 3) << 1260042216));
                  var7++;
                  continue L3;
                }
              }
            } else {
              tn.a(false);
              return;
            }
          } else {
            if (-2 == (var2 ^ -1)) {
              var4_int = var9.d(123);
              var5_ref_da = (da) (Object) aj.field_m.a((byte) -105);
              L4: while (true) {
                L5: {
                  if (var5_ref_da == null) {
                    break L5;
                  } else {
                    L6: {
                      if (var5_ref_da.field_p != var3) {
                        break L6;
                      } else {
                        if (var5_ref_da.field_q != var4_int) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var5_ref_da = (da) (Object) aj.field_m.a(16213);
                    continue L4;
                  }
                }
                if (var5_ref_da == null) {
                  tn.a(false);
                  return;
                } else {
                  var5_ref_da.a(false);
                  break L1;
                }
              }
            } else {
              en.a("LR1: " + rg.a(true), (Throwable) null, 1);
              tn.a(false);
              break L1;
            }
          }
        }
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = Virogrid.field_F ? 1 : 0;
        ka.a(bl.field_F, param0, true, ka.field_m, rk.field_e, 0, 0);
        for (var2 = 0; ka.field_m > var2; var2++) {
            lk.field_Tb[param0 + var2] = var2;
        }
        ka.a(dj.field_c, param0 + param0, false, ka.field_m + param0, ka.field_k, 0, param0);
        var2 = -86 % ((10 - param1) / 33);
        if (param0 < ka.field_m) {
            ka.field_m = param0;
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = Virogrid.field_F ? 1 : 0;
        kb.field_b.d(110);
        for (var1 = 0; -33 < (var1 ^ -1); var1++) {
            ke.field_q[var1] = 0L;
        }
        for (var1 = 0; (var1 ^ -1) > -33; var1++) {
            ig.field_b[var1] = 0L;
        }
        ae.field_c = 0;
        if (param0 >= -24) {
            field_b = null;
        }
    }

    final bl a(gl param0, byte[] param1, byte param2, int param3) {
        int var6 = 28 % ((-56 - param2) / 63);
        bl var5 = new bl();
        var5.field_C = param1;
        var5.field_j = (long)param3;
        var5.field_E = 2;
        var5.field_I = param0;
        var5.field_w = false;
        this.a(var5, 0);
        return var5;
    }

    final static void a(int param0, int param1, int param2) {
        if (param2 != 14534) {
            field_a = null;
        }
        hg var3 = gk.field_g;
        var3.g(param1, 8);
        var3.a(3, param2 + -14455);
        var3.a(10, param2 ^ 14513);
        var3.a((byte) -121, param0);
    }

    public static void b(int param0) {
        field_b = null;
        field_d = null;
        field_a = null;
        if (param0 != -851125662) {
            field_b = null;
        }
        field_c = null;
    }

    private final void a(bl param0, int param1) {
        Object var3 = null;
        Throwable var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((sb) this).field_h;
                    // monitorenter ((sb) this).field_h
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((sb) this).field_h.a((wb) (Object) param0, (byte) 118);
                        ((sb) this).field_e = ((sb) this).field_e + 1;
                        if (param1 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        mg[] discarded$3 = sb.a(-78, (byte) -66, -14, -121, 83);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((Object) (Object) ((sb) this).field_h).notifyAll();
                        // monitorexit var3
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4 = caughtException;
                        // monitorexit var3
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var4;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final bl a(byte param0, int param1, gl param2) {
        if (param0 != 116) {
            bl discarded$0 = ((sb) this).a((byte) -92, 49, (gl) null);
        }
        bl var4 = new bl();
        var4.field_I = param2;
        var4.field_E = 3;
        var4.field_j = (long)param1;
        var4.field_w = false;
        this.a(var4, 0);
        return var4;
    }

    sb(pd param0) {
        ((sb) this).field_h = new qk();
        ((sb) this).field_f = false;
        ((sb) this).field_e = 0;
        un var2 = param0.a(5, (Runnable) this, 255);
        while (0 == var2.field_a) {
            mm.a(-43, 10L);
        }
        if ((var2.field_a ^ -1) == -3) {
            throw new RuntimeException();
        }
        ((sb) this).field_g = (Thread) var2.field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{2, 14, 15, 6, 5, 16, 17, 10, 11, 12};
        field_a = "Loading graphics";
        field_b = new int[4];
    }
}
