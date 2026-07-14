/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ai implements Runnable {
    private gb field_m;
    static int[] field_j;
    private ng field_k;
    private gb field_g;
    private DataInputStream field_e;
    private gb field_f;
    static int[] field_c;
    static dl field_b;
    private int field_d;
    private un field_a;
    static vc field_h;
    static String field_n;
    static String field_l;
    private java.net.URL field_i;

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var4 = CrazyCrystals.field_B;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((ai) this).field_k.field_f >= ((ai) this).field_k.field_h.length) {
                                statePc = 5;
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
                            var1_int = ((ai) this).field_e.read(((ai) this).field_k.field_h, ((ai) this).field_k.field_f, -((ai) this).field_k.field_f + ((ai) this).field_k.field_h.length);
                            if (-1 >= (var1_int ^ -1)) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            ((ai) this).field_k.field_f = ((ai) this).field_k.field_f + var1_int;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (((ai) this).field_k.field_f == ((ai) this).field_k.field_h.length) {
                                statePc = 7;
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
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((ai) this).field_k.field_h.length + " " + ((ai) this).field_i);
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var1 = this;
                            // monitorenter this
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            ((ai) this).finalize();
                            ((ai) this).field_d = 3;
                            // monitorexit var1
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var2 = caughtException;
                            // monitorexit var1
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            throw (RuntimeException) (Object) var2;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        var1_ref = (Exception) (Object) caughtException;
                        var2_ref = this;
                        // monitorenter this
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            ((ai) this).finalize();
                            ((ai) this).field_d = ((ai) this).field_d + 1;
                            // monitorexit var2_ref
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var3 = caughtException;
                            // monitorexit var2_ref
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        throw (RuntimeException) (Object) var3;
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

    protected final void finalize() {
        if (null != ((ai) this).field_g) {
            if (((ai) this).field_g.field_b != null) {
                try {
                    ((DataInputStream) ((ai) this).field_g.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((ai) this).field_g = null;
        }
        if (!(((ai) this).field_m == null)) {
            if (!(((ai) this).field_m.field_b == null)) {
                try {
                    ((java.net.Socket) ((ai) this).field_m.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((ai) this).field_m = null;
        }
        if (((ai) this).field_e != null) {
            try {
                ((ai) this).field_e.close();
            } catch (Exception exception) {
            }
            ((ai) this).field_e = null;
        }
        ((ai) this).field_f = null;
    }

    final ng a(byte param0) {
        if (!(3 != ((ai) this).field_d)) {
            return ((ai) this).field_k;
        }
        if (param0 == -111) {
            return null;
        }
        return null;
    }

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        field_j = null;
        field_c = null;
        if (param0 != 8076) {
            return;
        }
        field_n = null;
        field_l = null;
    }

    final synchronized boolean b(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((ai) this).field_d >= 2) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return true;
                }
                case 3: {
                    if (-1 == (((ai) this).field_d ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (((ai) this).field_g != null) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((ai) this).field_g = ((ai) this).field_a.a(5, ((ai) this).field_i);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (0 == ((ai) this).field_g.field_a) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return false;
                }
                case 10: {
                    if ((((ai) this).field_g.field_a ^ -1) != -2) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    ((ai) this).field_g = null;
                    ((ai) this).field_d = ((ai) this).field_d + 1;
                    return false;
                }
                case 13: {
                    if ((((ai) this).field_d ^ -1) == -2) {
                        statePc = 15;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (null == ((ai) this).field_m) {
                        statePc = 17;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    ((ai) this).field_m = ((ai) this).field_a.a(443, false, ((ai) this).field_i.getHost());
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (((ai) this).field_m.field_a == 0) {
                        statePc = 20;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 20: {
                    return false;
                }
                case 21: {
                    if ((((ai) this).field_m.field_a ^ -1) != -2) {
                        statePc = 23;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 23: {
                    ((ai) this).field_d = ((ai) this).field_d + 1;
                    ((ai) this).field_m = null;
                    return false;
                }
                case 24: {
                    if (null == ((ai) this).field_e) {
                        statePc = 26;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 26: {
                    try {
                        if (0 == ((ai) this).field_d) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        ((ai) this).field_e = (DataInputStream) ((ai) this).field_g.field_b;
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
                        if ((((ai) this).field_d ^ -1) != -2) {
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
                        var4 = (java.net.Socket) ((ai) this).field_m.field_b;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((ai) this).field_i.getFile() + "\n\n");
                        var3.write(sn.a(var5, 83));
                        ((ai) this).field_e = new DataInputStream(var4.getInputStream());
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ((ai) this).field_k.field_f = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 33: {
                    var2 = (IOException) (Object) caughtException;
                    ((ai) this).finalize();
                    ((ai) this).field_d = ((ai) this).field_d + 1;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (((ai) this).field_f == null) {
                        statePc = 36;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 36: {
                    ((ai) this).field_f = ((ai) this).field_a.a((Runnable) this, param0 ^ 2, 5);
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (((ai) this).field_f.field_a != param0) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    return false;
                }
                case 39: {
                    if (((ai) this).field_f.field_a == 1) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    ((ai) this).finalize();
                    ((ai) this).field_d = ((ai) this).field_d + 1;
                    return false;
                }
                case 41: {
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(int param0, int param1) {
        if (!(-1 != param1)) {
            return true;
        }
        if (param0 != 100) {
            Object var3 = null;
            int discarded$0 = ai.a((rh) null, false, (String) null, 83, (rh) null, (byte) -124, -103);
        }
        return (1 << param1 & v.field_c) != 0 ? true : false;
    }

    final static boolean a(byte param0, String param1) {
        if (param0 != 82) {
            Object var3 = null;
            boolean discarded$0 = ai.a((byte) -21, (String) null);
        }
        CharSequence var4 = (CharSequence) (Object) param1;
        return lk.field_b.equals((Object) (Object) fe.a(60136, var4));
    }

    final static int a(rh param0, boolean param1, String param2, int param3, rh param4, byte param5, int param6) {
        String var8 = null;
        int var9 = 0;
        String var9_ref = null;
        int var10 = 0;
        String var11_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        ng stackIn_10_0 = null;
        ng stackIn_11_0 = null;
        ng stackIn_12_0 = null;
        String stackIn_12_1 = null;
        ng stackIn_13_0 = null;
        ng stackIn_14_0 = null;
        ng stackIn_15_0 = null;
        String stackIn_15_1 = null;
        ng stackOut_9_0 = null;
        ng stackOut_11_0 = null;
        String stackOut_11_1 = null;
        ng stackOut_10_0 = null;
        String stackOut_10_1 = null;
        ng stackOut_12_0 = null;
        ng stackOut_14_0 = null;
        String stackOut_14_1 = null;
        ng stackOut_13_0 = null;
        String stackOut_13_1 = null;
        L0: {
          var13 = CrazyCrystals.field_B;
          if (param5 > 79) {
            break L0;
          } else {
            field_n = null;
            break L0;
          }
        }
        L1: {
          var14 = param0.a((byte) -108);
          var8 = param4.a((byte) -108);
          if (null == oi.field_c) {
            if (te.a((byte) -19, false)) {
              break L1;
            } else {
              return -1;
            }
          } else {
            break L1;
          }
        }
        L2: {
          if (gj.field_k == cf.field_a) {
            L3: {
              tp.field_f.field_f = 0;
              ja.field_f = null;
              if (param2 != null) {
                L4: {
                  var9 = 0;
                  if (param1) {
                    var9 = var9 | 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  sp.field_c.field_f = 0;
                  sp.field_c.a(og.field_w.nextInt(), -16384);
                  sp.field_c.a(og.field_w.nextInt(), -16384);
                  sp.field_c.a(var14, (byte) -103);
                  sp.field_c.a(var8, (byte) -99);
                  var15 = (CharSequence) (Object) param2;
                  sp.field_c.a(ba.a(48, var15), (byte) -120);
                  sp.field_c.c(-161478600, param3);
                  sp.field_c.a(true, param6);
                  sp.field_c.a(true, var9);
                  tp.field_f.a(true, 18);
                  tp.field_f.field_f = tp.field_f.field_f + 2;
                  var10 = tp.field_f.field_f;
                  var11_ref = mf.a(le.b((byte) -20), -28697);
                  if (var11_ref == null) {
                    var11_ref = "";
                    break L5;
                  } else {
                    break L5;
                  }
                }
                tp.field_f.b(var11_ref, (byte) -23);
                tg.a(sp.field_c, (ng) (Object) tp.field_f, gn.field_S, -105, lm.field_j);
                tp.field_f.b(977272835, -var10 + tp.field_f.field_f);
                break L3;
              } else {
                L6: {
                  sp.field_c.field_f = 0;
                  sp.field_c.a(og.field_w.nextInt(), -16384);
                  sp.field_c.a(og.field_w.nextInt(), -16384);
                  stackOut_9_0 = sp.field_c;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (!param0.a(-124)) {
                    stackOut_11_0 = (ng) (Object) stackIn_11_0;
                    stackOut_11_1 = "";
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L6;
                  } else {
                    stackOut_10_0 = (ng) (Object) stackIn_10_0;
                    stackOut_10_1 = (String) var14;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L6;
                  }
                }
                L7: {
                  ((ng) (Object) stackIn_12_0).a(stackIn_12_1, (byte) -93);
                  stackOut_12_0 = sp.field_c;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_13_0 = stackOut_12_0;
                  if (param4.a(-113)) {
                    stackOut_14_0 = (ng) (Object) stackIn_14_0;
                    stackOut_14_1 = (String) var8;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    break L7;
                  } else {
                    stackOut_13_0 = (ng) (Object) stackIn_13_0;
                    stackOut_13_1 = "";
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    break L7;
                  }
                }
                ((ng) (Object) stackIn_15_0).a(stackIn_15_1, (byte) -115);
                tp.field_f.a(true, 16);
                tp.field_f.field_f = tp.field_f.field_f + 1;
                var9 = tp.field_f.field_f;
                tg.a(sp.field_c, (ng) (Object) tp.field_f, gn.field_S, -122, lm.field_j);
                tp.field_f.c((byte) 46, tp.field_f.field_f - var9);
                break L3;
              }
            }
            ak.a(-1, (byte) -48);
            gj.field_k = kp.field_k;
            break L2;
          } else {
            break L2;
          }
        }
        L8: {
          if (gj.field_k != kp.field_k) {
            break L8;
          } else {
            if (!fq.a(1, (byte) -125)) {
              break L8;
            } else {
              L9: {
                var9 = kd.field_n.h(255);
                kd.field_n.field_f = 0;
                if (var9 < 100) {
                  break L9;
                } else {
                  if (var9 > 105) {
                    break L9;
                  } else {
                    gj.field_k = ga.field_F;
                    gj.field_o = new String[-100 + var9];
                    break L8;
                  }
                }
              }
              if (248 != var9) {
                if (-100 != (var9 ^ -1)) {
                  bf.field_b = var9;
                  rk.field_b = -1;
                  gj.field_k = kf.field_b;
                  break L8;
                } else {
                  boolean discarded$1 = fq.a(ui.b((byte) -123), (byte) 75);
                  ja.field_f = new Boolean(hm.a((ng) (Object) kd.field_n, -2));
                  kd.field_n.field_f = 0;
                  break L8;
                }
              } else {
                cb.a(1148, le.b((byte) -20));
                re.field_j = bo.field_m;
                jj.a(4);
                ec.field_g = false;
                return var9;
              }
            }
          }
        }
        L10: {
          if (gj.field_k != ga.field_F) {
            break L10;
          } else {
            var9 = 2;
            if (!fq.a(var9, (byte) -50)) {
              break L10;
            } else {
              var10 = kd.field_n.c((byte) -7);
              kd.field_n.field_f = 0;
              if (fq.a(var10, (byte) -40)) {
                var11 = gj.field_o.length;
                var12 = 0;
                L11: while (true) {
                  if (var12 >= var11) {
                    jj.a(4);
                    ec.field_g = false;
                    return 100 - -var11;
                  } else {
                    gj.field_o[var12] = kd.field_n.d(93);
                    var12++;
                    continue L11;
                  }
                }
              } else {
                break L10;
              }
            }
          }
        }
        L12: {
          if (gj.field_k == kf.field_b) {
            if (ol.f((byte) 60)) {
              L13: {
                if (-256 != (bf.field_b ^ -1)) {
                  re.field_j = kd.field_n.i(122);
                  break L13;
                } else {
                  var9_ref = kd.field_n.a(0);
                  if (var9_ref == null) {
                    break L13;
                  } else {
                    ah.a(-72, var9_ref, le.b((byte) -20));
                    break L13;
                  }
                }
              }
              jj.a(4);
              ec.field_g = false;
              return bf.field_b;
            } else {
              break L12;
            }
          } else {
            break L12;
          }
        }
        L14: {
          if (null == oi.field_c) {
            if (!ec.field_g) {
              var9 = fe.field_j;
              fe.field_j = gj.field_l;
              ec.field_g = true;
              gj.field_l = var9;
              break L14;
            } else {
              L15: {
                if (30000L >= wd.d(-1322)) {
                  re.field_j = re.field_k;
                  break L15;
                } else {
                  re.field_j = jm.field_f;
                  break L15;
                }
              }
              ec.field_g = false;
              return 249;
            }
          } else {
            break L14;
          }
        }
        return -1;
    }

    ai(un param0, java.net.URL param1, int param2) {
        ((ai) this).field_a = param0;
        ((ai) this).field_i = param1;
        ((ai) this).field_k = new ng(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[256];
        field_n = "Tutorial";
        field_j = new int[12];
        field_l = "Email address is unavailable";
    }
}
