/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vf implements Runnable {
    private int field_f;
    static String[] field_l;
    private InputStream field_g;
    private int field_h;
    private boolean field_i;
    private OutputStream field_j;
    private boolean field_k;
    private en field_a;
    private rk field_e;
    private int field_c;
    private byte[] field_b;
    private java.net.Socket field_d;

    protected final void finalize() {
        ((vf) this).a(1);
    }

    public static void c(byte param0) {
        field_l = null;
        if (param0 <= -123) {
            return;
        }
        field_l = (String[]) null;
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = AceOfSkies.field_G ? 1 : 0;
                    if (((vf) this).field_k) {
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
                    if (((vf) this).field_i) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((vf) this).field_i = false;
                    throw new IOException();
                }
                case 6: {
                    if (null != ((vf) this).field_b) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ((vf) this).field_b = new byte[((vf) this).field_c];
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
                        if (param0 <= var6) {
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
                        ((vf) this).field_b[((vf) this).field_h] = param3[var6 + param1];
                        ((vf) this).field_h = (((vf) this).field_h - -1) % ((vf) this).field_c;
                        if (((vf) this).field_h != (((vf) this).field_f + ((vf) this).field_c + -100) % ((vf) this).field_c) {
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
                        if (null == ((vf) this).field_a) {
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
                        ((vf) this).field_a = ((vf) this).field_e.a(3, 1048576, (Runnable) this);
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
                        var6 = 44 / ((param2 - -35) / 56);
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

    public final void run() {
        try {
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Object var3 = null;
            IOException var3_ref = null;
            int var6 = 0;
            String var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = AceOfSkies.field_G ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((vf) this).field_f != ((vf) this).field_h) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (!((vf) this).field_k) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 29;
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
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (((vf) this).field_f <= ((vf) this).field_h) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var1_int = ((vf) this).field_c + -((vf) this).field_f;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var1_int = -((vf) this).field_f + ((vf) this).field_h;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var2 = ((vf) this).field_f;
                            if (-1 > (var1_int ^ -1)) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            ((vf) this).field_j.write(((vf) this).field_b, var2, var1_int);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 12 : 29);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((vf) this).field_i = true;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            ((vf) this).field_f = (var1_int + ((vf) this).field_f) % ((vf) this).field_c;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (((vf) this).field_h != ((vf) this).field_f) {
                                statePc = 1;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 17 : 29);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            ((vf) this).field_j.flush();
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 17 : 29);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((vf) this).field_i = true;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (null == ((vf) this).field_g) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ((vf) this).field_g.close();
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (((vf) this).field_j == null) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((vf) this).field_j.close();
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (((vf) this).field_d != null) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((vf) this).field_d.close();
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var1 = (IOException) (Object) caughtException;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            ((vf) this).field_b = null;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        var1_ref = (Exception) (Object) caughtException;
                        var7 = (String) null;
                        v.a((String) null, (byte) -52, (Throwable) (Object) var1_ref);
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 30: {
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

    final static String a(long param0, int param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = AceOfSkies.field_G ? 1 : 0;
        if (0L < param0) {
          if (-6582952005840035282L < (param0 ^ -1L)) {
            if (-1L != (param0 % 37L ^ -1L)) {
              if (param1 != 28304) {
                return (String) null;
              } else {
                var3 = 0;
                var4 = param0;
                L0: while (true) {
                  if (0L == var4) {
                    var6 = new StringBuilder(var3);
                    L1: while (true) {
                      if (param0 == 0L) {
                        StringBuilder discarded$2 = var6.reverse();
                        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                        return var6.toString();
                      } else {
                        L2: {
                          var7 = param0;
                          param0 = param0 / 37L;
                          var9 = ou.field_n[(int)(var7 + -(param0 * 37L))];
                          if (var9 == 95) {
                            var10 = -1 + var6.length();
                            var9 = 160;
                            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        StringBuilder discarded$3 = var6.append(var9);
                        continue L1;
                      }
                    }
                  } else {
                    var4 = var4 / 37L;
                    var3++;
                    continue L0;
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final int a(byte param0) throws IOException {
        if (((vf) this).field_k) {
            return 0;
        }
        int var2 = 60 / ((param0 - 26) / 55);
        return ((vf) this).field_g.read();
    }

    final int b(int param0) throws IOException {
        if (((vf) this).field_k) {
            return 0;
        }
        if (param0 >= -110) {
            ((vf) this).finalize();
            return ((vf) this).field_g.available();
        }
        return ((vf) this).field_g.available();
    }

    final void b(byte param0) throws IOException {
        if (((vf) this).field_k) {
          return;
        } else {
          if (!((vf) this).field_i) {
            if (param0 > 56) {
              return;
            } else {
              ((vf) this).run();
              return;
            }
          } else {
            ((vf) this).field_i = false;
            throw new IOException();
          }
        }
    }

    vf(java.net.Socket param0, rk param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0) {
        Object var2 = null;
        InterruptedException var2_ref = null;
        Throwable var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = AceOfSkies.field_G ? 1 : 0;
                    if (!((vf) this).field_k) {
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
                        ((vf) this).field_k = true;
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
                    if (null != ((vf) this).field_a) {
                        statePc = 12;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((vf) this).field_a = null;
                    if (param0 == 1) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    vf.c((byte) -69);
                    return;
                }
                case 10: {
                    return;
                }
                case 12: {
                    if (((vf) this).field_a.field_a != 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    wf.a(1L, false);
                    statePc = 12;
                    continue stateLoop;
                }
                case 14: {
                    if (1 == ((vf) this).field_a.field_a) {
                        statePc = 19;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    ((vf) this).field_a = null;
                    if (param0 == 1) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    vf.c((byte) -69);
                    return;
                }
                case 17: {
                    return;
                }
                case 19: {
                    try {
                        ((Thread) ((vf) this).field_a.field_f).join();
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    ((vf) this).field_a = null;
                    if (param0 == 1) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    vf.c((byte) -69);
                    return;
                }
                case 22: {
                    return;
                }
                case 24: {
                    var2_ref = (InterruptedException) (Object) caughtException;
                    ((vf) this).field_a = null;
                    if (param0 == 1) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    vf.c((byte) -69);
                    return;
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, byte[] param2, boolean param3) throws IOException {
        int var5 = 0;
        int var6 = 0;
        var6 = AceOfSkies.field_G ? 1 : 0;
        if (param3) {
          if (!((vf) this).field_k) {
            L0: while (true) {
              if (0 < param1) {
                var5 = ((vf) this).field_g.read(param2, param0, param1);
                if ((var5 ^ -1) < -1) {
                  param1 = param1 - var5;
                  param0 = param0 + var5;
                  continue L0;
                } else {
                  throw new EOFException();
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          ((vf) this).field_k = false;
          if (!((vf) this).field_k) {
            L1: while (true) {
              if (0 < param1) {
                var5 = ((vf) this).field_g.read(param2, param0, param1);
                if ((var5 ^ -1) < -1) {
                  param1 = param1 - var5;
                  param0 = param0 + var5;
                  continue L1;
                } else {
                  throw new EOFException();
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

    private vf(java.net.Socket param0, rk param1, int param2) throws IOException {
        ((vf) this).field_i = false;
        ((vf) this).field_k = false;
        ((vf) this).field_f = 0;
        ((vf) this).field_h = 0;
        ((vf) this).field_e = param1;
        ((vf) this).field_d = param0;
        ((vf) this).field_d.setSoTimeout(30000);
        ((vf) this).field_d.setTcpNoDelay(true);
        ((vf) this).field_g = ((vf) this).field_d.getInputStream();
        ((vf) this).field_j = ((vf) this).field_d.getOutputStream();
        ((vf) this).field_c = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
