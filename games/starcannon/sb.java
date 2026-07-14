/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sb implements Runnable {
    private InputStream field_d;
    private ka field_k;
    private OutputStream field_q;
    private boolean field_i;
    private int field_r;
    private bk field_b;
    private boolean field_l;
    static p field_n;
    static String field_o;
    static String field_f;
    static String field_p;
    private int field_a;
    private java.net.Socket field_j;
    static int field_m;
    private int field_h;
    static kh field_g;
    static int field_c;
    private byte[] field_e;

    final void b(byte param0) {
        if (!(!((sb) this).field_i)) {
            return;
        }
        Object var2 = this;
        // monitorenter this
        ((sb) this).field_i = true;
        this.notifyAll();
        // monitorexit var2
        if (!(((sb) this).field_b == null)) {
            while (((sb) this).field_b.field_b == 0) {
                uc.a(-113, 1L);
            }
            if ((((sb) this).field_b.field_b ^ -1) == -2) {
                try {
                    if (false) throw (InterruptedException) null;
                    ((Thread) ((sb) this).field_b.field_f).join();
                } catch (InterruptedException interruptedException) {
                }
            }
        }
        ((sb) this).field_b = null;
        if (param0 > -20) {
            ((sb) this).field_r = 0;
        }
    }

    public static void b(int param0) {
        if (param0 < 13) {
            field_m = -57;
        }
        field_n = null;
        field_o = null;
        field_p = null;
        field_f = null;
        field_g = null;
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        L0: {
          var8 = 0;
          var9 = 65536 / param7;
          if (ki.field_l > param6) {
            param1 = param1 - (ki.field_l - param6);
            param6 = ki.field_l;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param4 >= ki.field_e) {
            break L1;
          } else {
            param7 = param7 - (-param4 + ki.field_e);
            var8 = var8 + var9 * (ki.field_e - param4);
            param4 = ki.field_e;
            break L1;
          }
        }
        L2: {
          if (param1 + param6 > ki.field_g) {
            param1 = ki.field_g - param6;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param4 + param7 > ki.field_i) {
            param7 = ki.field_i + -param4;
            break L3;
          } else {
            break L3;
          }
        }
        var10 = -param1 + ki.field_j;
        var11 = param6 + param4 * ki.field_j;
        if (param0) {
          var12 = -param7;
          L4: while (true) {
            if (var12 >= 0) {
              return;
            } else {
              var13 = 65536 - var8 >> -1363846488;
              var14 = var8 >> -1188627192;
              var15 = ((param2 & 16711935) * var13 - -((16711935 & param3) * var14) & -16711936) - -(16711680 & (param2 & 65280) * var13 + (param3 & 65280) * var14) >>> 488852616;
              var16 = -param1;
              L5: while (true) {
                if (0 <= var16) {
                  var8 = var8 + var9;
                  var11 = var11 + var10;
                  var12++;
                  continue L4;
                } else {
                  if (param5 != ki.field_a[var11]) {
                    var11++;
                    var16++;
                    continue L5;
                  } else {
                    var11++;
                    ki.field_a[var11] = var15;
                    var16++;
                    continue L5;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    sb(java.net.Socket param0, ka param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte param0) throws IOException {
        if (!(!((sb) this).field_i)) {
            return;
        }
        if (((sb) this).field_l) {
            ((sb) this).field_l = false;
            throw new IOException();
        }
        int var2 = 69 % ((param0 - 67) / 58);
    }

    final int a(int param0) throws IOException {
        if (param0 != 488852616) {
            ((sb) this).field_e = null;
        }
        if (!(!((sb) this).field_i)) {
            return 0;
        }
        return ((sb) this).field_d.read();
    }

    final static kl[] a(ia param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        kl[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        kl var6 = null;
        int var7 = 0;
        var7 = StarCannon.field_A;
        var2 = param0.e(8, 8);
        if (0 >= var2) {
          L0: {
            var3 = param0.e(param1 + -99, 12);
            var4 = new kl[var3];
            if (param1 == 107) {
              break L0;
            } else {
              field_o = null;
              break L0;
            }
          }
          var5 = 0;
          L1: while (true) {
            if (var3 <= var5) {
              return var4;
            } else {
              if (od.a(-2, param0)) {
                var6 = new kl();
                int discarded$6 = param0.e(8, 24);
                int discarded$7 = param0.e(8, 24);
                var6.field_e = param0.e(8, 24);
                int discarded$8 = param0.e(param1 ^ 99, 9);
                int discarded$9 = param0.e(8, 12);
                int discarded$10 = param0.e(8, 12);
                int discarded$11 = param0.e(param1 ^ 99, 12);
                var4[var5] = var6;
                var5++;
                continue L1;
              } else {
                var6_int = param0.e(8, wg.a(false, -1 + var5));
                var4[var5] = var4[var6_int];
                var5++;
                continue L1;
              }
            }
          }
        } else {
          return null;
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
                        var6 = StarCannon.field_A;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((sb) this).field_h != ((sb) this).field_r) {
                                statePc = 5;
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
                            if (!((sb) this).field_i) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            this.wait();
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var2 = ((sb) this).field_h;
                            if (((sb) this).field_h > ((sb) this).field_r) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var1_int = ((sb) this).field_r - ((sb) this).field_h;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var1_int = ((sb) this).field_a + -((sb) this).field_h;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if ((var1_int ^ -1) < -1) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            ((sb) this).field_q.write(((sb) this).field_e, var2, var1_int);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 12 : 32);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((sb) this).field_l = true;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            ((sb) this).field_h = (((sb) this).field_h - -var1_int) % ((sb) this).field_a;
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
                            if (((sb) this).field_h == ((sb) this).field_r) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 18 : 32);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 18 : 32);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            ((sb) this).field_q.flush();
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 18 : 32);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((sb) this).field_l = true;
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
                            if (((sb) this).field_d != null) {
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
                            ((sb) this).field_d.close();
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
                            if (((sb) this).field_q != null) {
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
                            ((sb) this).field_q.close();
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
                            if (((sb) this).field_j != null) {
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
                            ((sb) this).field_j.close();
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
                            ((sb) this).field_e = null;
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
                        hc.a((Throwable) (Object) var1_ref, (String) null, (byte) 126);
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

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5 = 0;
        if (((sb) this).field_i) {
            return;
        }
        while (-1 > (param2 ^ -1)) {
            var5 = ((sb) this).field_d.read(param3, param0, param2);
            if ((var5 ^ -1) >= -1) {
                throw new EOFException();
            }
            param2 = param2 - var5;
            param0 = param0 + var5;
        }
        if (param1 != 32498) {
            ((sb) this).field_i = true;
        }
    }

    final static void a(int param0, byte param1, hb param2) {
        hi.field_f.b(105, (rf) (Object) param2);
        hb.a(-114, param0, param2);
        if (param1 != -41) {
            field_o = null;
        }
    }

    final static void a(boolean param0, byte param1) {
        if (param1 < 93) {
            field_f = null;
        }
        qa.field_a.a(param0, false);
    }

    final void a(int param0, byte[] param1, byte param2, int param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (!((sb) this).field_i) {
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
                    if (((sb) this).field_l) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    ((sb) this).field_l = false;
                    throw new IOException();
                }
                case 5: {
                    if (((sb) this).field_e == null) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ((sb) this).field_e = new byte[((sb) this).field_a];
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var5 = this;
                    // monitorenter this
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        if (param2 == 87) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        // monitorexit var5
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return;
                }
                case 12: {
                    try {
                        var6 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var6 >= param3) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((sb) this).field_e[((sb) this).field_r] = param1[param0 + var6];
                        ((sb) this).field_r = (((sb) this).field_r - -1) % ((sb) this).field_a;
                        if ((-100 + ((sb) this).field_h - -((sb) this).field_a) % ((sb) this).field_a == ((sb) this).field_r) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw new IOException();
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var6++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (((sb) this).field_b != null) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((sb) this).field_b = ((sb) this).field_k.a(3, 115, (Runnable) this);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        this.notifyAll();
                        // monitorexit var5
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 23: {
                    if (var7 instanceof RuntimeException) throw (RuntimeException) var7;
                    if (var7 instanceof Error) throw (Error) var7;
                    throw (IOException) (Object) var7;
                }
                case 24: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    protected final void finalize() {
        ((sb) this).b((byte) -113);
    }

    final int c(int param0) throws IOException {
        if (((sb) this).field_i) {
            return 0;
        }
        if (param0 < 45) {
            sb.a(false, 123, -100, 77, -90, -56, 113, -109);
        }
        return ((sb) this).field_d.available();
    }

    final static ue a(int param0, boolean param1, boolean param2, int param3, byte param4) {
        if (param4 < 100) {
            field_g = null;
        }
        return ri.a(true, param2, param0, param3, false, param1);
    }

    private sb(java.net.Socket param0, ka param1, int param2) throws IOException {
        ((sb) this).field_i = false;
        ((sb) this).field_l = false;
        ((sb) this).field_r = 0;
        ((sb) this).field_h = 0;
        ((sb) this).field_k = param1;
        ((sb) this).field_j = param0;
        ((sb) this).field_j.setSoTimeout(30000);
        ((sb) this).field_j.setTcpNoDelay(true);
        ((sb) this).field_d = ((sb) this).field_j.getInputStream();
        ((sb) this).field_q = ((sb) this).field_j.getOutputStream();
        ((sb) this).field_a = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "<br><br><br>Become a member of Funorb to continue humanity's<br>fight against the Paragulans";
        field_f = "Visit the Account Management section on the main site to view.";
        field_p = "STORY:";
        field_n = new p();
        field_c = 10;
    }
}
