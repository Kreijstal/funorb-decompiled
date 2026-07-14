/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pj implements Runnable {
    static int[][] field_b;
    static int[] field_o;
    private int field_q;
    private byte[] field_d;
    static int[] field_l;
    private boolean field_g;
    private boolean field_r;
    private ht field_i;
    private InputStream field_f;
    static int[] field_c;
    private eh field_m;
    private int field_j;
    static int[] field_h;
    private int field_e;
    private OutputStream field_p;
    private java.net.Socket field_k;
    static kf field_n;
    static String field_a;

    final int b(int param0) throws IOException {
        if (!(!((pj) this).field_g)) {
            return 0;
        }
        int var2 = 120 / ((param0 - 21) / 63);
        return ((pj) this).field_f.available();
    }

    protected final void finalize() {
        ((pj) this).a((byte) 55);
    }

    final void c(byte param0) throws IOException {
        if (param0 != 34) {
            pj.a(100, 22, -76, 55, -23, -24, -104);
        }
        if (((pj) this).field_g) {
            return;
        }
        if (((pj) this).field_r) {
            ((pj) this).field_r = false;
            throw new IOException();
        }
    }

    pj(java.net.Socket param0, ht param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte param0) {
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        if (!(!((pj) this).field_g)) {
            return;
        }
        Object var2 = this;
        // monitorenter this
        ((pj) this).field_g = true;
        this.notifyAll();
        if (param0 < 26) {
            Object var5 = null;
            pj.a(true, (vr) null);
        }
        // monitorexit var2
        if (!(null == ((pj) this).field_m)) {
            while (-1 == ((pj) this).field_m.field_f) {
                gda.a(false, 1L);
            }
            if (!(-2 != ((pj) this).field_m.field_f)) {
                try {
                    if (false) throw (InterruptedException) null;
                    ((Thread) ((pj) this).field_m.field_e).join();
                } catch (InterruptedException interruptedException) {
                }
            }
        }
        ((pj) this).field_m = null;
    }

    final static void a(boolean param0, vr param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        bk.field_v = param1;
        bca.field_n = new al[50][12];
        if (!param0) {
            return;
        }
        for (var2 = 0; (var2 ^ -1) > -51; var2++) {
            for (var3 = 0; (var3 ^ -1) > -13; var3++) {
                bca.field_n[var2][var3] = new al((hs) null);
            }
        }
    }

    final static void a(String param0, byte param1, long param2) {
        gk.field_d = 2;
        bd.field_k = param0;
        CharSequence var6 = (CharSequence) (Object) param0;
        df.field_s = fq.a(0, var6);
        eaa.field_a = param2;
        bb.h(0);
        if (param1 <= 42) {
            Object var5 = null;
            pj.a(true, (vr) null);
        }
    }

    final void a(int param0, byte[] param1, boolean param2, int param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = BachelorFridge.field_y;
                    if (!((pj) this).field_g) {
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
                    if (!((pj) this).field_r) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((pj) this).field_r = false;
                    throw new IOException();
                }
                case 4: {
                    if (null != ((pj) this).field_d) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((pj) this).field_d = new byte[((pj) this).field_e];
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var5 = this;
                    // monitorenter this
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        if (!param2) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        field_a = null;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var6 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param3 <= var6) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ((pj) this).field_d[((pj) this).field_j] = param1[var6 + param0];
                        ((pj) this).field_j = (1 + ((pj) this).field_j) % ((pj) this).field_e;
                        if (((pj) this).field_j != (((pj) this).field_e + ((pj) this).field_q + -100) % ((pj) this).field_e) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw new IOException();
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (null == ((pj) this).field_m) {
                            statePc = 16;
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
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((pj) this).field_m = ((pj) this).field_i.a((Runnable) this, 2, 3);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.notifyAll();
                        // monitorexit var5
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 20: {
                    if (var7 instanceof RuntimeException) throw (RuntimeException) var7;
                    if (var7 instanceof Error) throw (Error) var7;
                    throw (IOException) (Object) var7;
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, byte param1, byte[] param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        if (param1 < 63) {
            ((pj) this).field_k = null;
        }
        if (((pj) this).field_g) {
            return;
        }
        while (-1 > (param3 ^ -1)) {
            var5 = ((pj) this).field_f.read(param2, param0, param3);
            if ((var5 ^ -1) >= -1) {
                throw new EOFException();
            }
            param3 = param3 - var5;
            param0 = param0 + var5;
        }
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = 34 % ((57 - param0) / 37);
        field_o = null;
        field_l = null;
        field_n = null;
        field_a = null;
        field_c = null;
        field_h = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var23 = 0;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int stackIn_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        L0: {
          var23 = BachelorFridge.field_y;
          gp.a(true, param4);
          var7 = 0;
          var8 = param4 + -param1;
          if ((var8 ^ -1) <= -1) {
            break L0;
          } else {
            var8 = 0;
            break L0;
          }
        }
        L1: {
          var9 = param4;
          if (param2 == 170) {
            break L1;
          } else {
            pj.a(-84, 121, -44, 18, 93, 118, -63);
            break L1;
          }
        }
        L2: {
          var10 = -param4;
          var11 = var8;
          var12 = -var8;
          var13 = -1;
          var14 = -1;
          if (an.field_q > param0) {
            break L2;
          } else {
            if (param0 <= ha.field_n) {
              var39 = tj.field_b[param0];
              var16 = cr.a(eo.field_l, param3 - param4, pw.field_x, 0);
              var17 = cr.a(eo.field_l, param3 + param4, pw.field_x, param2 + -170);
              var18 = cr.a(eo.field_l, -var8 + param3, pw.field_x, param2 ^ 170);
              var19 = cr.a(eo.field_l, var8 + param3, pw.field_x, param2 + -170);
              hba.a(param5, var16, var39, 7, var18);
              hba.a(param6, var18, var39, param2 + -163, var19);
              hba.a(param5, var19, var39, 7, var17);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: while (true) {
          if (var7 >= var9) {
            return;
          } else {
            L4: {
              var13 += 2;
              var14 += 2;
              var10 = var10 + var13;
              var12 = var12 + var14;
              if (-1 < var12) {
                break L4;
              } else {
                if (-2 <= var11) {
                  var11--;
                  var12 = var12 - (var11 << 884406497);
                  it.field_l[var11] = var7;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              var7++;
              if (var10 < 0) {
                break L5;
              } else {
                var9--;
                var10 = var10 - (var9 << 673634721);
                var15 = -var9 + param0;
                var16 = param0 + var9;
                if (var16 < an.field_q) {
                  break L5;
                } else {
                  if (ha.field_n >= var15) {
                    if (var8 > var9) {
                      L6: {
                        var17 = it.field_l[var9];
                        var18 = cr.a(eo.field_l, var7 + param3, pw.field_x, param2 + -170);
                        var19 = cr.a(eo.field_l, param3 - var7, pw.field_x, 0);
                        var20 = cr.a(eo.field_l, param3 + var17, pw.field_x, 0);
                        var21 = cr.a(eo.field_l, -var17 + param3, pw.field_x, 0);
                        if (ha.field_n < var16) {
                          break L6;
                        } else {
                          var40 = tj.field_b[var16];
                          hba.a(param5, var19, var40, 7, var21);
                          hba.a(param6, var21, var40, 7, var20);
                          hba.a(param5, var20, var40, 7, var18);
                          break L6;
                        }
                      }
                      if (an.field_q <= var15) {
                        var41 = tj.field_b[var15];
                        hba.a(param5, var19, var41, 7, var21);
                        hba.a(param6, var21, var41, param2 ^ 173, var20);
                        hba.a(param5, var20, var41, 7, var18);
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      L7: {
                        var17 = cr.a(eo.field_l, var7 + param3, pw.field_x, 0);
                        var18 = cr.a(eo.field_l, -var7 + param3, pw.field_x, 0);
                        if (ha.field_n >= var16) {
                          hba.a(param5, var18, tj.field_b[var16], 7, var17);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      if (an.field_q > var15) {
                        break L5;
                      } else {
                        hba.a(param5, var18, tj.field_b[var15], 7, var17);
                        break L5;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
              }
            }
            var15 = param0 - var7;
            var16 = param0 - -var7;
            if (var16 < an.field_q) {
              continue L3;
            } else {
              if (ha.field_n < var15) {
                continue L3;
              } else {
                var17 = param3 + var9;
                var18 = -var9 + param3;
                if (eo.field_l > var17) {
                  continue L3;
                } else {
                  if (pw.field_x >= var18) {
                    var17 = cr.a(eo.field_l, var17, pw.field_x, param2 ^ 170);
                    var18 = cr.a(eo.field_l, var18, pw.field_x, 0);
                    if (var7 >= var8) {
                      L8: {
                        if (var16 <= ha.field_n) {
                          hba.a(param5, var18, tj.field_b[var16], 7, var17);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      if (var15 < an.field_q) {
                        continue L3;
                      } else {
                        hba.a(param5, var18, tj.field_b[var15], param2 + -163, var17);
                        continue L3;
                      }
                    } else {
                      L9: {
                        if (var11 < var7) {
                          stackOut_36_0 = it.field_l[var7];
                          stackIn_37_0 = stackOut_36_0;
                          break L9;
                        } else {
                          stackOut_35_0 = var11;
                          stackIn_37_0 = stackOut_35_0;
                          break L9;
                        }
                      }
                      L10: {
                        var19 = stackIn_37_0;
                        var20 = cr.a(eo.field_l, param3 + var19, pw.field_x, 0);
                        var21 = cr.a(eo.field_l, -var19 + param3, pw.field_x, 0);
                        if (ha.field_n < var16) {
                          break L10;
                        } else {
                          var42 = tj.field_b[var16];
                          hba.a(param5, var18, var42, 7, var21);
                          hba.a(param6, var21, var42, 7, var20);
                          hba.a(param5, var20, var42, 7, var17);
                          break L10;
                        }
                      }
                      if (an.field_q <= var15) {
                        var43 = tj.field_b[var15];
                        hba.a(param5, var18, var43, 7, var21);
                        hba.a(param6, var21, var43, param2 ^ 173, var20);
                        hba.a(param5, var20, var43, 7, var17);
                        continue L3;
                      } else {
                        continue L3;
                      }
                    }
                  } else {
                    continue L3;
                  }
                }
              }
            }
          }
        }
    }

    public final void run() {
        try {
            IOException var1 = null;
            Exception var1_ref = null;
            int var1_int = 0;
            int var2 = 0;
            Object var3 = null;
            IOException var3_ref = null;
            int var6 = 0;
            Object var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = BachelorFridge.field_y;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((pj) this).field_j == ((pj) this).field_q) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (((pj) this).field_g) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            this.wait();
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (((pj) this).field_q <= ((pj) this).field_j) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var1_int = ((pj) this).field_e + -((pj) this).field_q;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var1_int = -((pj) this).field_q + ((pj) this).field_j;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var2 = ((pj) this).field_q;
                            if ((var1_int ^ -1) < -1) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            ((pj) this).field_p.write(((pj) this).field_d, var2, var1_int);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 14 : 32);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((pj) this).field_r = true;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            ((pj) this).field_q = (var1_int + ((pj) this).field_q) % ((pj) this).field_e;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (((pj) this).field_q != ((pj) this).field_j) {
                                statePc = 1;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 19 : 32);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            ((pj) this).field_p.flush();
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 19 : 32);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((pj) this).field_r = true;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (((pj) this).field_f != null) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((pj) this).field_f.close();
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (((pj) this).field_p == null) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((pj) this).field_p.close();
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (((pj) this).field_k != null) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            ((pj) this).field_k.close();
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var1 = (IOException) (Object) caughtException;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            ((pj) this).field_d = null;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        var1_ref = (Exception) (Object) caughtException;
                        var7 = null;
                        cv.a(1, (String) null, (Throwable) (Object) var1_ref);
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
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

    private pj(java.net.Socket param0, ht param1, int param2) throws IOException {
        ((pj) this).field_q = 0;
        ((pj) this).field_r = false;
        ((pj) this).field_g = false;
        ((pj) this).field_j = 0;
        ((pj) this).field_k = param0;
        ((pj) this).field_i = param1;
        ((pj) this).field_k.setSoTimeout(30000);
        ((pj) this).field_k.setTcpNoDelay(true);
        ((pj) this).field_f = ((pj) this).field_k.getInputStream();
        ((pj) this).field_p = ((pj) this).field_k.getOutputStream();
        ((pj) this).field_e = param2;
    }

    final int b(byte param0) throws IOException {
        if (!(!((pj) this).field_g)) {
            return 0;
        }
        if (param0 != -47) {
            Object var3 = null;
            pj.a(true, (vr) null);
        }
        return ((pj) this).field_f.read();
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, kv[] param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = BachelorFridge.field_y;
        if (param5 != null) {
            if (0 >= param4) {
                return;
            }
            var6 = param5[0].field_n;
            var7 = param5[2].field_n;
            var8 = param5[1].field_n;
            param5[0].e(param0, param3, param1);
            param5[2].e(param4 + param0 + -var7, param3, param1);
            dg.a(eha.field_q);
            dg.c(var6 + param0, param3, -var7 + (param0 + param4), param3 - -param5[1].field_o);
            var9 = var6 + param0;
            var10 = param0 - -param4 + -var7;
            param0 = var9;
            while (var10 > param0) {
                param5[1].e(param0, param3, param1);
                param0 = param0 + var8;
            }
            if (param2 != 447) {
                field_b = null;
            }
            dg.b(eha.field_q);
            return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[16];
        field_b = new int[16][];
        field_l = new int[16];
        field_c = new int[16];
        field_h = new int[16];
        ku.a(46, 460, new int[7], 190, 170, 36, 0);
        ku.a(-117, 460, new int[5], 132, 170, 36, 1);
        ku.a(-57, 460, new int[7], 34, 170, 36, 2);
        ku.a(-57, 460, new int[2], 200, 170, 36, 3);
        ku.a(97, 460, new int[5], 34, 170, 36, 4);
        ku.a(40, 460, new int[4], 410, 180, 36, 5);
        ku.a(-58, 460, new int[3], 447, 70, 36, 6);
        ku.a(-91, 460, new int[2], 400, 180, 36, 7);
        ku.a(26, 460, new int[2], 400, 180, 36, 8);
        ku.a(-55, 460, new int[2], 400, 180, 36, 9);
        ku.a(-81, 460, new int[1], 400, 290, 36, 10);
        ku.a(101, 460, new int[0], 200, 170, 36, 11);
        ku.a(-108, 460, new int[3], 200, 170, 36, 12);
        ku.a(42, 460, new int[2], 200, 170, 36, 13);
        ku.a(-101, 460, new int[4], 200, 170, 36, 14);
        ku.a(-97, 460, new int[4], 237, 170, 36, 15);
        field_a = "Spectating...";
        field_n = new kf();
    }
}
