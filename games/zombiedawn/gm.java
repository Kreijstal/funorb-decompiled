/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gm implements Runnable {
    private OutputStream field_d;
    private int field_n;
    private int field_g;
    static int field_k;
    static dj field_h;
    private ec field_m;
    static String field_f;
    private byte[] field_e;
    private InputStream field_a;
    private boolean field_b;
    private op field_c;
    private boolean field_i;
    private int field_j;
    private java.net.Socket field_l;

    final void a(int param0, boolean param1, int param2, byte[] param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ZombieDawn.field_J;
                    if (!((gm) this).field_b) {
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
                    if (((gm) this).field_i) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    ((gm) this).field_i = false;
                    throw new IOException();
                }
                case 5: {
                    if (null == ((gm) this).field_e) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ((gm) this).field_e = new byte[((gm) this).field_g];
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
                        var6 = 0;
                        if (param1) {
                            statePc = 12;
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
                        // monitorexit var5
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return;
                }
                case 12: {
                    try {
                        if (param0 <= var6) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((gm) this).field_e[((gm) this).field_n] = param3[param2 + var6];
                        ((gm) this).field_n = (((gm) this).field_n + 1) % ((gm) this).field_g;
                        if (((gm) this).field_n != (((gm) this).field_g + ((gm) this).field_j - 100) % ((gm) this).field_g) {
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
                        throw new IOException();
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6++;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (null != ((gm) this).field_c) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((gm) this).field_c = ((gm) this).field_m.a(3, (Runnable) this, true);
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

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        if (param3 == 0) {
          if (!((gm) this).field_b) {
            L0: while (true) {
              if ((param1 ^ -1) < -1) {
                var5 = ((gm) this).field_a.read(param2, param0, param1);
                if (var5 <= 0) {
                  throw new EOFException();
                } else {
                  param0 = param0 + var5;
                  param1 = param1 - var5;
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
          ((gm) this).field_c = null;
          if (!((gm) this).field_b) {
            L1: while (true) {
              if ((param1 ^ -1) < -1) {
                var5 = ((gm) this).field_a.read(param2, param0, param1);
                if (var5 <= 0) {
                  throw new EOFException();
                } else {
                  param0 = param0 + var5;
                  param1 = param1 - var5;
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

    final int b(byte param0) throws IOException {
        if (param0 < -2) {
          if (((gm) this).field_b) {
            return 0;
          } else {
            return ((gm) this).field_a.available();
          }
        } else {
          gm.b(6);
          if (((gm) this).field_b) {
            return 0;
          } else {
            return ((gm) this).field_a.available();
          }
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        if (param0 < 72) {
          var2 = null;
          gm.a((rc) null, (byte) -84, 22);
          field_f = null;
          field_h = null;
          return;
        } else {
          field_f = null;
          field_h = null;
          return;
        }
    }

    final int a(boolean param0) throws IOException {
        Object var3 = null;
        if (!((gm) this).field_b) {
          if (param0) {
            var3 = null;
            gm.a((rc) null, (byte) 8, -92);
            return ((gm) this).field_a.read();
          } else {
            return ((gm) this).field_a.read();
          }
        } else {
          return 0;
        }
    }

    protected final void finalize() {
        ((gm) this).a(-89);
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
                        var6 = ZombieDawn.field_J;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((gm) this).field_n != ((gm) this).field_j) {
                                statePc = 6;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (((gm) this).field_b) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            this.wait();
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (((gm) this).field_n < ((gm) this).field_j) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var1_int = ((gm) this).field_n + -((gm) this).field_j;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var1_int = -((gm) this).field_j + ((gm) this).field_g;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var2 = ((gm) this).field_j;
                            if (0 >= var1_int) {
                                statePc = 1;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            ((gm) this).field_d.write(((gm) this).field_e, var2, var1_int);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 12 : 30);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((gm) this).field_i = true;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            ((gm) this).field_j = (var1_int + ((gm) this).field_j) % ((gm) this).field_g;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (((gm) this).field_n == ((gm) this).field_j) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 18 : 30);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 18 : 30);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            ((gm) this).field_d.flush();
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 18 : 30);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((gm) this).field_i = true;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (((gm) this).field_a != null) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((gm) this).field_a.close();
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (null == ((gm) this).field_d) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((gm) this).field_d.close();
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (((gm) this).field_l == null) {
                                statePc = 28;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            ((gm) this).field_l.close();
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var1 = (IOException) (Object) caughtException;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            ((gm) this).field_e = null;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        var1_ref = (Exception) (Object) caughtException;
                        var7 = null;
                        ae.a((Throwable) (Object) var1_ref, 10331, (String) null);
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 31: {
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

    final static void b(int param0) {
        hf.field_I = 0;
        if (param0 == -23148) {
            return;
        }
        field_k = -44;
    }

    final static void a(rc param0, byte param1, int param2) {
        if (param1 < 109) {
            return;
        }
        hk.field_F.a(0, (le) (Object) param0);
        rm.a((byte) -92, param2, param0);
    }

    final void a(int param0) {
        Object var2_ref_Object = null;
        int var2 = 0;
        InterruptedException var2_ref_InterruptedException = null;
        Throwable var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ZombieDawn.field_J;
                    if (((gm) this).field_b) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    var2_ref_Object = this;
                    // monitorenter this
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        ((gm) this).field_b = true;
                        this.notifyAll();
                        // monitorexit var2_ref_Object
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3 = caughtException;
                        // monitorexit var2_ref_Object
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var3;
                }
                case 8: {
                    if (((gm) this).field_c != null) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((gm) this).field_c = null;
                    var2 = 38 / ((-7 - param0) / 45);
                    return;
                }
                case 10: {
                    if (((gm) this).field_c.field_f != -1) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ld.a(1L, (byte) 89);
                    statePc = 10;
                    continue stateLoop;
                }
                case 12: {
                    if (-2 == ((gm) this).field_c.field_f) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    ((gm) this).field_c = null;
                    var2 = 38 / ((-7 - param0) / 45);
                    return;
                }
                case 14: {
                    try {
                        ((Thread) ((gm) this).field_c.field_d).join();
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    ((gm) this).field_c = null;
                    var2 = 38 / ((-7 - param0) / 45);
                    return;
                }
                case 16: {
                    var2_ref_InterruptedException = (InterruptedException) (Object) caughtException;
                    ((gm) this).field_c = null;
                    var2 = 38 / ((-7 - param0) / 45);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(byte param0) throws IOException {
        if (param0 == 85) {
          if (!((gm) this).field_b) {
            if (((gm) this).field_i) {
              ((gm) this).field_i = false;
              throw new IOException();
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((gm) this).finalize();
          if (!((gm) this).field_b) {
            if (((gm) this).field_i) {
              ((gm) this).field_i = false;
              throw new IOException();
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    gm(java.net.Socket param0, ec param1) throws IOException {
        this(param0, param1, 5000);
    }

    private gm(java.net.Socket param0, ec param1, int param2) throws IOException {
        ((gm) this).field_n = 0;
        ((gm) this).field_b = false;
        ((gm) this).field_j = 0;
        ((gm) this).field_i = false;
        ((gm) this).field_m = param1;
        ((gm) this).field_l = param0;
        ((gm) this).field_l.setSoTimeout(30000);
        ((gm) this).field_l.setTcpNoDelay(true);
        ((gm) this).field_a = ((gm) this).field_l.getInputStream();
        ((gm) this).field_d = ((gm) this).field_l.getOutputStream();
        ((gm) this).field_g = param2;
    }

    final static on a(byte[] param0, int param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        var6 = ZombieDawn.field_J;
        if (param1 >= -3) {
          return null;
        } else {
          var2 = 0;
          var10 = new byte[param0.length + 24];
          var9 = var10;
          var8 = var9;
          var7 = var8;
          var3 = var7;
          var2 = 0;
          L0: while (true) {
            if (-5 >= (var2 ^ -1)) {
              var2++;
              var4 = md.a(var2, param0, 82);
              var2++;
              var5 = md.a(var2, param0, 65);
              fb.a(4, var10, (byte) 69, var4);
              fb.a(5, var10, (byte) 61, var5);
              fb.a(6, var10, (byte) 79, var4);
              fb.a(7, var10, (byte) 80, var5);
              fb.a(8, var10, (byte) 56, var4);
              fb.a(9, var10, (byte) -64, var5);
              fb.a(10, var10, (byte) 66, var4);
              fb.a(11, var10, (byte) 74, var5);
              var2 = 6;
              L1: while (true) {
                if (param0.length / 4 <= var2) {
                  return vk.a((byte) -83, var10);
                } else {
                  fb.a(6 + var2, var3, (byte) 42, md.a(var2, param0, 93));
                  var2++;
                  continue L1;
                }
              }
            } else {
              fb.a(var2, var3, (byte) -81, md.a(var2, param0, 70));
              var2++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 65;
        field_f = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
