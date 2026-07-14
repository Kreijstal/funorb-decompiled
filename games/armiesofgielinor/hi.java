/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hi implements Runnable {
    static String field_h;
    private OutputStream field_n;
    private hd field_e;
    static String[] field_m;
    private int field_b;
    private boolean field_k;
    private InputStream field_f;
    static ep field_i;
    private wo field_d;
    static String field_a;
    private java.net.Socket field_l;
    private byte[] field_c;
    private int field_p;
    private int field_g;
    private boolean field_o;
    static int field_j;

    final static void a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 == 41) {
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
                    if (va.field_w != null) {
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
                    var1 = (Object) (Object) va.field_w;
                    // monitorenter va.field_w
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        va.field_w = null;
                        // monitorexit var1
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 8: {
                    throw (RuntimeException) (Object) var2;
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(byte param0) {
        field_h = null;
        if (param0 <= 72) {
          field_h = null;
          field_m = null;
          field_i = null;
          field_a = null;
          return;
        } else {
          field_m = null;
          field_i = null;
          field_a = null;
          return;
        }
    }

    hi(java.net.Socket param0, hd param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ArmiesOfGielinor.field_M ? 1 : 0;
                    if (!((hi) this).field_k) {
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
                    if (!((hi) this).field_o) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((hi) this).field_o = false;
                    throw new IOException();
                }
                case 4: {
                    if (((hi) this).field_c == null) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((hi) this).field_c = new byte[((hi) this).field_p];
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
                        if (param1 == 20) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        // monitorexit var5
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        var6 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (param3 <= var6) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((hi) this).field_c[((hi) this).field_g] = param0[param2 + var6];
                        ((hi) this).field_g = (((hi) this).field_g - -1) % ((hi) this).field_p;
                        if (((hi) this).field_g == (-100 + ((hi) this).field_p + ((hi) this).field_b) % ((hi) this).field_p) {
                            statePc = 15;
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
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw new IOException();
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var6++;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (null == ((hi) this).field_d) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((hi) this).field_d = ((hi) this).field_e.a(3, param1 + -20, (Runnable) this);
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

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == 0) {
          if (!((hi) this).field_k) {
            L0: while (true) {
              if (0 < param2) {
                var5 = ((hi) this).field_f.read(param3, param1, param2);
                if (0 >= var5) {
                  throw new EOFException();
                } else {
                  param2 = param2 - var5;
                  param1 = param1 + var5;
                  continue L0;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          ((hi) this).run();
          if (!((hi) this).field_k) {
            L1: while (true) {
              if (0 < param2) {
                var5 = ((hi) this).field_f.read(param3, param1, param2);
                if (0 >= var5) {
                  throw new EOFException();
                } else {
                  param2 = param2 - var5;
                  param1 = param1 + var5;
                  continue L1;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final int d(byte param0) throws IOException {
        if (((hi) this).field_k) {
            return 0;
        }
        if (param0 != 43) {
            field_j = -2;
            return ((hi) this).field_f.available();
        }
        return ((hi) this).field_f.available();
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
                        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((hi) this).field_g == ((hi) this).field_b) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (((hi) this).field_k) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 33;
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
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (((hi) this).field_g < ((hi) this).field_b) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var1_int = -((hi) this).field_b + ((hi) this).field_g;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var1_int = -((hi) this).field_b + ((hi) this).field_p;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var2 = ((hi) this).field_b;
                            if ((var1_int ^ -1) < -1) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            ((hi) this).field_n.write(((hi) this).field_c, var2, var1_int);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 14 : 33);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((hi) this).field_o = true;
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
                            ((hi) this).field_b = (var1_int + ((hi) this).field_b) % ((hi) this).field_p;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (((hi) this).field_b == ((hi) this).field_g) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 20 : 33);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 20 : 33);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            ((hi) this).field_n.flush();
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 20 : 33);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((hi) this).field_o = true;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (null == ((hi) this).field_f) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((hi) this).field_f.close();
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (((hi) this).field_n != null) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            ((hi) this).field_n.close();
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (null != ((hi) this).field_l) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            ((hi) this).field_l.close();
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var1 = (IOException) (Object) caughtException;
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
                            ((hi) this).field_c = null;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        var1_ref = (Exception) (Object) caughtException;
                        var7 = null;
                        af.a((Throwable) (Object) var1_ref, -65, (String) null);
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 34: {
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

    final static void b(boolean param0) {
        int var1 = 0;
        L0: {
          if (bp.field_e < -33) {
            L1: {
              var1 = bp.field_e % 32;
              if (-1 != var1) {
                break L1;
              } else {
                var1 = 32;
                break L1;
              }
            }
            mh.a(bp.field_e + -var1, (byte) -109);
            break L0;
          } else {
            mh.a(0, (byte) -109);
            break L0;
          }
        }
        if (!param0) {
          return;
        } else {
          hi.b((byte) -114);
          return;
        }
    }

    final void c(byte param0) {
        Object var2 = null;
        InterruptedException var2_ref = null;
        Throwable var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ArmiesOfGielinor.field_M ? 1 : 0;
                    if (!((hi) this).field_k) {
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
                    var2 = this;
                    // monitorenter this
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        ((hi) this).field_k = true;
                        this.notifyAll();
                        // monitorexit var2
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
                        var3 = caughtException;
                        // monitorexit var2
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var3;
                }
                case 7: {
                    if (param0 == -45) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    if (((hi) this).field_d != null) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((hi) this).field_d = null;
                    return;
                }
                case 11: {
                    if (((hi) this).field_d.field_g != 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    nu.a(1L, 0);
                    statePc = 11;
                    continue stateLoop;
                }
                case 13: {
                    if ((((hi) this).field_d.field_g ^ -1) != -2) {
                        statePc = 17;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    try {
                        ((Thread) ((hi) this).field_d.field_f).join();
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    ((hi) this).field_d = null;
                    return;
                }
                case 16: {
                    var2_ref = (InterruptedException) (Object) caughtException;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    ((hi) this).field_d = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0) throws IOException {
        if (!param0) {
            return;
        }
        if (((hi) this).field_k) {
            return;
        }
        if (!(!((hi) this).field_o)) {
            ((hi) this).field_o = false;
            throw new IOException();
        }
    }

    protected final void finalize() {
        ((hi) this).c((byte) -45);
    }

    final int a(int param0) throws IOException {
        if (((hi) this).field_k) {
          return 0;
        } else {
          if (param0 <= 1) {
            field_j = 65;
            return ((hi) this).field_f.read();
          } else {
            return ((hi) this).field_f.read();
          }
        }
    }

    private hi(java.net.Socket param0, hd param1, int param2) throws IOException {
        ((hi) this).field_b = 0;
        ((hi) this).field_o = false;
        ((hi) this).field_g = 0;
        ((hi) this).field_k = false;
        ((hi) this).field_e = param1;
        ((hi) this).field_l = param0;
        ((hi) this).field_l.setSoTimeout(30000);
        ((hi) this).field_l.setTcpNoDelay(true);
        ((hi) this).field_f = ((hi) this).field_l.getInputStream();
        ((hi) this).field_n = ((hi) this).field_l.getOutputStream();
        ((hi) this).field_p = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "You currently have an ongoing mission in progress<br><br><col=FFFF00><%0></col>.<br><br>Starting a new mission will abort the currently ongoing mission.<br><br>Do you wish to continue?";
        field_m = new String[]{"Skirmish", "Warrior", "Ranger", "Mage", "Flying", "Helper", "Creeper", "Titan"};
        field_a = "Earn runes to access new gods and units.";
    }
}
