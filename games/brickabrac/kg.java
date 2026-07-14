/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg implements Runnable {
    private lq field_f;
    static String field_b;
    static int[] field_i;
    static jp[][] field_a;
    static String field_e;
    static String[] field_h;
    private boolean field_j;
    int field_c;
    static int[] field_d;
    private Thread field_g;

    final void a(byte param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((kg) this).field_j = true;
                    var2 = (Object) (Object) ((kg) this).field_f;
                    // monitorenter ((kg) this).field_f
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((Object) (Object) ((kg) this).field_f).notifyAll();
                        // monitorexit var2
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3 = caughtException;
                        // monitorexit var2
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 4: {
                    throw (RuntimeException) (Object) var3;
                }
                case 5: {
                    try {
                        ((kg) this).field_g.join();
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    interruptedException = (InterruptedException) (Object) caughtException;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    ((kg) this).field_g = null;
                    if (param0 < 38) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 10: {
                    ((kg) this).field_c = -29;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final kj a(ve param0, int param1, int param2) {
        kj var4 = null;
        Object var5_ref_Object = null;
        int var5 = 0;
        kj var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        kj stackIn_7_0 = null;
        kj stackOut_6_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = BrickABrac.field_J ? 1 : 0;
                    var4 = new kj();
                    var4.field_F = 1;
                    var5_ref_Object = (Object) (Object) ((kg) this).field_f;
                    // monitorenter ((kg) this).field_f
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = (kj) (Object) ((kg) this).field_f.a(true);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var6 == null) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (((long)param1 ^ -1L) != (var6.field_j ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6.field_G != param0) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (-3 != (var6.field_F ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4.field_u = false;
                        var4.field_E = var6.field_E;
                        // monitorexit var5_ref_Object
                        stackOut_6_0 = (kj) var4;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return (kj) (Object) stackIn_7_0;
                }
                case 8: {
                    try {
                        var6 = (kj) (Object) ((kg) this).field_f.e(-8394);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        // monitorexit var5_ref_Object
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5_ref_Object
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 12: {
                    throw (RuntimeException) (Object) var7;
                }
                case 13: {
                    var4.field_E = param0.a(0, param1);
                    var4.field_u = false;
                    var5 = -57 / ((-77 - param2) / 47);
                    var4.field_B = true;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0) {
        if (param0 != 21678) {
            kg.a(-67);
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = BrickABrac.field_J ? 1 : 0;
        var6 = 485 + param1 + 8 - (-2 - param4) + 8;
        sh.field_d.a(-6 + gp.field_d.field_cb, 3, 3, -6 + var6, (byte) 64);
        var7 = -5 + sh.field_d.field_cb;
        kc.field_n.a(param3, -param3 + var7, 5, param4 + 485 + param1 + 2, (byte) 64);
        g.field_n.a(param3, 0, param1, -ap.field_e.field_Ib + -param1 + kc.field_n.field_Ib, (byte) 64);
        var8 = 3 / ((49 - param0) / 40);
        ap.field_e.a(param3, 0, param1 + g.field_n.field_Ib, ap.field_e.field_Ib, (byte) 64);
        var7 = var7 - (param3 - -2);
        i.field_q.a(2, (byte) -110, 2 + (485 + param1) - -param4, 5, 5, param4, var7 - 5);
        if (null != vd.field_a) {
          vd.field_a.a(i.field_q.field_cb, i.field_q.field_P, i.field_q.field_zb, (byte) -119, i.field_q.field_Ib);
          var9 = -param1 + (gp.field_d.field_Ib + -var6);
          var10 = var9 / 2;
          var11 = param1 + var10 - -param2;
          var12 = 0;
          var13 = 0;
          if (6 > var13) {
            if ((var13 ^ -1) > -6) {
              if (null != ik.field_i[var13]) {
                L0: {
                  var14 = 3 - -((2 + gp.field_d.field_cb - 6) * var12 / (fe.field_pb + 1));
                  var12++;
                  var7 = -var14 + 3 + (var12 * (2 + (gp.field_d.field_cb - 6)) / (fe.field_pb + 1) + -2);
                  if (5 > var13) {
                    ik.field_i[var13].a(var7, var14, var6, var9, (byte) 64);
                    dp.field_w[var13].a(var7, 0, param1, -param1 + var10, (byte) 64);
                    vj.field_a[var13].a(-param5 + (var7 + -param5), param5, var10, param2, (byte) 64);
                    wd.field_F[var13].a(-param5 + -param5 + var7, param5, var11, -var11 + var9 + -param1, (byte) 64);
                    break L0;
                  } else {
                    mj.field_c.a(var7, var14, var6, var9, (byte) 64);
                    var13++;
                    break L0;
                  }
                }
                var13++;
                var13++;
                var13++;
                var13++;
                var13++;
                return;
              } else {
                var13++;
                var13++;
                var13++;
                var13++;
                var13++;
                return;
              }
            } else {
              L1: {
                var14 = 3 - -((2 + gp.field_d.field_cb - 6) * var12 / (fe.field_pb + 1));
                var12++;
                var7 = -var14 + 3 + (var12 * (2 + (gp.field_d.field_cb - 6)) / (fe.field_pb + 1) + -2);
                if (5 > var13) {
                  ik.field_i[var13].a(var7, var14, var6, var9, (byte) 64);
                  dp.field_w[var13].a(var7, 0, param1, -param1 + var10, (byte) 64);
                  vj.field_a[var13].a(-param5 + (var7 + -param5), param5, var10, param2, (byte) 64);
                  wd.field_F[var13].a(-param5 + -param5 + var7, param5, var11, -var11 + var9 + -param1, (byte) 64);
                  break L1;
                } else {
                  mj.field_c.a(var7, var14, var6, var9, (byte) 64);
                  var13++;
                  break L1;
                }
              }
              var13++;
              var13++;
              var13++;
              var13++;
              var13++;
              return;
            }
          } else {
            return;
          }
        } else {
          var9 = -param1 + (gp.field_d.field_Ib + -var6);
          var10 = var9 / 2;
          var11 = param1 + var10 - -param2;
          var12 = 0;
          var13 = 0;
          L2: while (true) {
            if (6 <= var13) {
              return;
            } else {
              L3: {
                if ((var13 ^ -1) <= -6) {
                  break L3;
                } else {
                  if (null == ik.field_i[var13]) {
                    var13++;
                    var13++;
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              var14 = 3 - -((2 + gp.field_d.field_cb - 6) * var12 / (fe.field_pb + 1));
              var12++;
              var7 = -var14 + 3 + (var12 * (2 + (gp.field_d.field_cb - 6)) / (fe.field_pb + 1) + -2);
              if (5 > var13) {
                ik.field_i[var13].a(var7, var14, var6, var9, (byte) 64);
                dp.field_w[var13].a(var7, 0, param1, -param1 + var10, (byte) 64);
                vj.field_a[var13].a(-param5 + (var7 + -param5), param5, var10, param2, (byte) 64);
                wd.field_F[var13].a(-param5 + -param5 + var7, param5, var11, -var11 + var9 + -param1, (byte) 64);
                var13++;
                continue L2;
              } else {
                mj.field_c.a(var7, var14, var6, var9, (byte) 64);
                var13++;
                continue L2;
              }
            }
          }
        }
    }

    final kj a(int param0, ve param1, byte param2) {
        kj var4 = null;
        Object var5 = null;
        var4 = new kj();
        var4.field_F = 3;
        var4.field_B = false;
        if (param2 >= -51) {
          var5 = null;
          kj discarded$2 = ((kg) this).a(26, true, (byte[]) null, (ve) null);
          var4.field_G = param1;
          var4.field_j = (long)param0;
          this.a(var4, -3);
          return var4;
        } else {
          var4.field_G = param1;
          var4.field_j = (long)param0;
          this.a(var4, -3);
          return var4;
        }
    }

    private final void a(kj param0, int param1) {
        Object var3 = null;
        Throwable var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((kg) this).field_f;
                    // monitorenter ((kg) this).field_f
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((kg) this).field_f.a((tk) (Object) param0, false);
                        ((kg) this).field_c = ((kg) this).field_c + 1;
                        ((Object) (Object) ((kg) this).field_f).notifyAll();
                        // monitorexit var3
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4 = caughtException;
                        // monitorexit var3
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 4: {
                    throw (RuntimeException) (Object) var4;
                }
                case 5: {
                    if (param1 != -3) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    kg.a((byte) -81, -120, -50, 43, 109, -99);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            kj var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = BrickABrac.field_J ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((kg) this).field_j) {
                            statePc = 21;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((kg) this).field_f;
                        // monitorenter ((kg) this).field_f
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (kj) (Object) ((kg) this).field_f.a(25609);
                            if (var7 != null) {
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
                            ((Object) (Object) ((kg) this).field_f).wait();
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
                            ((kg) this).field_c = ((kg) this).field_c - 1;
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
                            if (-3 == (var7.field_F ^ -1)) {
                                statePc = 18;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if ((var7.field_F ^ -1) == -4) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var7.field_u = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var7.field_E = var7.field_G.a(0, (int)var7.field_j);
                            var7.field_u = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            boolean discarded$1 = var7.field_G.a((byte) -123, var7.field_E, var7.field_E.length, (int)var7.field_j);
                            var7.field_u = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var2_ref = (Exception) (Object) caughtException;
                        var6 = null;
                        rk.a((String) null, (Throwable) (Object) var2_ref, 35);
                        var7.field_u = false;
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

    final kj a(int param0, boolean param1, byte[] param2, ve param3) {
        kj var5 = new kj();
        var5.field_E = param2;
        var5.field_G = param3;
        var5.field_j = (long)param0;
        var5.field_F = 2;
        var5.field_B = param1 ? true : false;
        this.a(var5, -3);
        return var5;
    }

    public static void b(int param0) {
        field_b = null;
        field_i = null;
        field_a = null;
        field_h = null;
        if (param0 != 26679) {
          field_h = null;
          field_d = null;
          field_e = null;
          return;
        } else {
          field_d = null;
          field_e = null;
          return;
        }
    }

    kg(tg param0) {
        ((kg) this).field_f = new lq();
        ((kg) this).field_j = false;
        ((kg) this).field_c = 0;
        ql var2 = param0.a(5, (Runnable) this, (byte) -72);
        while (-1 == (var2.field_f ^ -1)) {
            wj.a(-124, 10L);
        }
        if ((var2.field_f ^ -1) == -3) {
            throw new RuntimeException();
        }
        ((kg) this).field_g = (Thread) var2.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Hide game chat";
        field_i = new int[]{16494651, 27571, 12658477, 26679, 16711935};
        field_e = "Enter name of player to add to list";
        field_h = new String[16];
        field_d = new int[]{12658477, 22953, 16494651, 26679, 16711935};
    }
}
