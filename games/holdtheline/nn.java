/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nn implements Runnable {
    private int field_l;
    private boolean field_h;
    private java.net.Socket field_e;
    private int field_m;
    private byte[] field_j;
    private int field_c;
    static String[] field_g;
    private OutputStream field_d;
    private boolean field_a;
    private af field_k;
    private ib field_b;
    private InputStream field_i;
    static char[] field_f;

    final void d(int param0) {
        int var4 = 0;
        var4 = HoldTheLine.field_D;
        if (((nn) this).field_h) {
            return;
        }
        if (param0 != 21135) {
            field_g = null;
        }
        Object var2 = this;
        // monitorenter this
        ((nn) this).field_h = true;
        this.notifyAll();
        // monitorexit var2
        if (((nn) this).field_k != null) {
            while (((nn) this).field_k.field_d == 0) {
                qe.a(1L, (byte) 45);
            }
            if ((((nn) this).field_k.field_d ^ -1) == -2) {
                try {
                    if (false) throw (InterruptedException) null;
                    ((Thread) ((nn) this).field_k.field_b).join();
                } catch (InterruptedException interruptedException) {
                }
            }
        }
        ((nn) this).field_k = null;
    }

    final static void b(byte param0) {
        int var2 = 0;
        qn var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        da var14 = null;
        int[][] var18 = null;
        L0: {
          var12 = HoldTheLine.field_D;
          var14 = rd.field_e;
          if (param0 < -124) {
            break L0;
          } else {
            nn.b(25);
            break L0;
          }
        }
        var2 = var14.f((byte) -85);
        var3 = (qn) (Object) cf.field_z.b((byte) 97);
        L1: while (true) {
          L2: {
            if (var3 == null) {
              break L2;
            } else {
              if (var2 != var3.field_j) {
                var3 = (qn) (Object) cf.field_z.c((byte) 93);
                continue L1;
              } else {
                break L2;
              }
            }
          }
          if (var3 == null) {
            r.a(-28036);
            return;
          } else {
            L3: {
              var4 = var14.f((byte) -31);
              if (var4 != 0) {
                wd.field_v[0] = ng.field_e;
                var5 = var3.field_i;
                var6_int = 1;
                L4: while (true) {
                  if (var6_int >= var4) {
                    cc.a(var4, false, var5);
                    var6_int = 0;
                    L5: while (true) {
                      if (var6_int >= var4) {
                        uf.a(0, var5);
                        var6 = new String[2][var5];
                        var18 = new int[2][var5 * 4];
                        var8 = in.field_h;
                        var9 = 0;
                        var10 = 0;
                        L6: while (true) {
                          if (var8 <= var9) {
                            var9 = 0;
                            var13 = 0;
                            var10 = var13;
                            L7: while (true) {
                              if (var8 <= var9) {
                                break L3;
                              } else {
                                var11 = im.field_h[var5 - -var9];
                                var6[1][var13] = wd.field_v[var11];
                                var18[1][4 * var13] = va.field_j[var11];
                                var18[1][var13 * 4 - -1] = da.field_u[var11];
                                var18[1][4 * var13 + 2] = ua.field_c[var11];
                                var18[1][var13 * 4 - -3] = fj.field_q[var11];
                                if (ra.a(wd.field_v[var11], false)) {
                                  if (fj.field_q[var11] + da.field_u[var11] - -ua.field_c[var11] == 0) {
                                    var6[1][var13] = null;
                                    var13--;
                                    var9++;
                                    var13++;
                                    continue L7;
                                  } else {
                                    var9++;
                                    var13++;
                                    continue L7;
                                  }
                                } else {
                                  var9++;
                                  var13++;
                                  continue L7;
                                }
                              }
                            }
                          } else {
                            var11 = im.field_h[var9];
                            var6[0][var10] = wd.field_v[var11];
                            var18[0][var10 * 4] = va.field_j[var11];
                            var18[0][1 + var10 * 4] = da.field_u[var11];
                            var18[0][2 + var10 * 4] = ua.field_c[var11];
                            var18[0][4 * var10 - -3] = fj.field_q[var11];
                            if (ra.a(wd.field_v[var11], false)) {
                              if (fj.field_q[var11] + (da.field_u[var11] - -ua.field_c[var11]) == 0) {
                                var6[0][var10] = null;
                                var10--;
                                var10++;
                                var9++;
                                continue L6;
                              } else {
                                var10++;
                                var9++;
                                continue L6;
                              }
                            } else {
                              var10++;
                              var9++;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        im.a(76, (th) (Object) var14);
                        if (-1 == (var6_int ^ -1)) {
                          rl.a(dk.field_l, ef.field_b, ae.field_a, (byte) 106, var6_int, si.field_jb);
                          var6_int++;
                          continue L5;
                        } else {
                          rl.a(dk.field_l, ef.field_b, ae.field_a, (byte) 108, var6_int, si.field_jb);
                          var6_int++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    wd.field_v[var6_int] = var14.j(-1231);
                    var6_int++;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
            var3.d(0);
            return;
          }
        }
    }

    final int c(int param0) throws IOException {
        if (param0 != -27418) {
            return -14;
        }
        if (!(!((nn) this).field_h)) {
            return 0;
        }
        return ((nn) this).field_i.read();
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = HoldTheLine.field_D;
                    if (!((nn) this).field_h) {
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
                    if (!((nn) this).field_a) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((nn) this).field_a = false;
                    throw new IOException();
                }
                case 4: {
                    if (null == ((nn) this).field_j) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((nn) this).field_j = new byte[((nn) this).field_m];
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var5 = this;
                    // monitorenter this
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        var6 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param0 <= var6) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ((nn) this).field_j[((nn) this).field_c] = param1[var6 + param2];
                        ((nn) this).field_c = (1 + ((nn) this).field_c) % ((nn) this).field_m;
                        if (((nn) this).field_c != (-100 + ((nn) this).field_m + ((nn) this).field_l) % ((nn) this).field_m) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw new IOException();
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6++;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (param3 == 1) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((nn) this).run();
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (null == ((nn) this).field_k) {
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
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((nn) this).field_k = ((nn) this).field_b.a((byte) -28, 3, (Runnable) this);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.notifyAll();
                        // monitorexit var5
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 21: {
                    if (var7 instanceof RuntimeException) throw (RuntimeException) var7;
                    if (var7 instanceof Error) throw (Error) var7;
                    throw (IOException) (Object) var7;
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    nn(java.net.Socket param0, ib param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var6 = 0;
        int var7 = HoldTheLine.field_D;
        int var5 = 90 % ((param3 - 89) / 35);
        if (((nn) this).field_h) {
            return;
        }
        while ((param1 ^ -1) < -1) {
            var6 = ((nn) this).field_i.read(param0, param2, param1);
            if (0 >= var6) {
                throw new EOFException();
            }
            param2 = param2 + var6;
            param1 = param1 - var6;
        }
    }

    final static void a(boolean param0) {
        if (param0) {
            nn.a(false);
        }
    }

    protected final void finalize() {
        ((nn) this).d(21135);
    }

    final void c(boolean param0) throws IOException {
        if (!param0) {
            ((nn) this).field_m = 101;
        }
        if (((nn) this).field_h) {
            return;
        }
        if (((nn) this).field_a) {
            ((nn) this).field_a = false;
            throw new IOException();
        }
    }

    public final void run() {
        try {
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
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
                        var6 = HoldTheLine.field_D;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((nn) this).field_l == ((nn) this).field_c) {
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
                            if (((nn) this).field_h) {
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
                            statePc = 19;
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
                            var2 = ((nn) this).field_l;
                            if (((nn) this).field_l <= ((nn) this).field_c) {
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
                            var1_int = ((nn) this).field_m + -((nn) this).field_l;
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
                            var1_int = -((nn) this).field_l + ((nn) this).field_c;
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
                            if (var1_int <= 0) {
                                statePc = 1;
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
                            ((nn) this).field_d.write(((nn) this).field_j, var2, var1_int);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 13 : 32);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((nn) this).field_a = true;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            ((nn) this).field_l = (var1_int + ((nn) this).field_l) % ((nn) this).field_m;
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
                            if (((nn) this).field_c != ((nn) this).field_l) {
                                statePc = 1;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 18 : 32);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            ((nn) this).field_d.flush();
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 18 : 32);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((nn) this).field_a = true;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (null != ((nn) this).field_i) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((nn) this).field_i.close();
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (null != ((nn) this).field_d) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((nn) this).field_d.close();
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
                            if (((nn) this).field_e != null) {
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
                            ((nn) this).field_e.close();
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
                            ((nn) this).field_j = null;
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
                        bl.a((Throwable) (Object) var1_ref, (byte) 94, (String) null);
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

    final static boolean a(byte param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 < -126) {
            break L0;
          } else {
            boolean discarded$2 = nn.a(-24);
            break L0;
          }
        }
        L1: {
          L2: {
            if (pf.field_d > -21) {
              break L2;
            } else {
              if (!jn.a((byte) -30)) {
                break L2;
              } else {
                L3: {
                  if (-1 >= q.field_c) {
                    break L3;
                  } else {
                    if (ai.a(-118)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    public static void b(int param0) {
        field_g = null;
        field_f = null;
        if (param0 != 15281) {
            field_g = null;
        }
    }

    final int b(boolean param0) throws IOException {
        if (param0) {
            return -52;
        }
        if (((nn) this).field_h) {
            return 0;
        }
        return ((nn) this).field_i.available();
    }

    final static boolean a(int param0) {
        if (hk.field_a != null) {
            if (!(null == ho.field_j)) {
                return true;
            }
        }
        if (param0 > -3) {
            field_f = null;
        }
        if (!fb.field_i.b("font24", 118)) {
            return false;
        }
        if (!fb.field_i.b("overlayfont", -118)) {
            return false;
        }
        hk.field_a = ko.a(false);
        ho.field_j = om.a("font24", ef.field_c, "", 8192, fb.field_i);
        return true;
    }

    private nn(java.net.Socket param0, ib param1, int param2) throws IOException {
        ((nn) this).field_l = 0;
        ((nn) this).field_h = false;
        ((nn) this).field_c = 0;
        ((nn) this).field_a = false;
        ((nn) this).field_e = param0;
        ((nn) this).field_b = param1;
        ((nn) this).field_e.setSoTimeout(30000);
        ((nn) this).field_e.setTcpNoDelay(true);
        ((nn) this).field_i = ((nn) this).field_e.getInputStream();
        ((nn) this).field_d = ((nn) this).field_e.getOutputStream();
        ((nn) this).field_m = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new char[]{(char)91, (char)93, (char)35};
    }
}
