/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gj implements Runnable {
    private int field_o;
    private boolean field_i;
    private ib field_b;
    private int field_n;
    private OutputStream field_k;
    static java.awt.Color field_a;
    private byte[] field_h;
    private boolean field_e;
    private fe field_c;
    private int field_g;
    private java.net.Socket field_m;
    private InputStream field_d;
    static String field_f;
    static int[] field_j;
    static volatile int field_l;

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Transmogrify.field_A ? 1 : 0;
                    if (!((gj) this).field_e) {
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
                    if (((gj) this).field_i) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    ((gj) this).field_i = false;
                    throw new IOException();
                }
                case 5: {
                    if (null != ((gj) this).field_h) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((gj) this).field_h = new byte[((gj) this).field_o];
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
                        if (param0 == 9) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((gj) this).run();
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param2 <= var6) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((gj) this).field_h[((gj) this).field_g] = param1[var6 + param3];
                        ((gj) this).field_g = (((gj) this).field_g + 1) % ((gj) this).field_o;
                        if ((((gj) this).field_o + (((gj) this).field_n + -100)) % ((gj) this).field_o == ((gj) this).field_g) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw new IOException();
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (null == ((gj) this).field_b) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((gj) this).field_b = ((gj) this).field_c.a((Runnable) this, 3, 65535);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.notifyAll();
                        // monitorexit var5
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 22: {
                    if (var7 instanceof RuntimeException) throw (RuntimeException) var7;
                    if (var7 instanceof Error) throw (Error) var7;
                    throw (IOException) (Object) var7;
                }
                case 23: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_a = null;
        field_j = null;
        if (param0 > -69) {
            field_f = null;
        }
    }

    gj(java.net.Socket param0, fe param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(boolean param0) {
        int var4 = 0;
        var4 = Transmogrify.field_A ? 1 : 0;
        if (!(!((gj) this).field_e)) {
            return;
        }
        Object var2 = this;
        // monitorenter this
        ((gj) this).field_e = param0 ? true : false;
        this.notifyAll();
        // monitorexit var2
        if (null != ((gj) this).field_b) {
            while (0 == ((gj) this).field_b.field_c) {
                pg.a(1L, -94);
            }
            if (!(-2 != (((gj) this).field_b.field_c ^ -1))) {
                try {
                    if (false) throw (InterruptedException) null;
                    ((Thread) ((gj) this).field_b.field_g).join();
                } catch (InterruptedException interruptedException) {
                }
            }
        }
        ((gj) this).field_b = null;
    }

    final static int a(byte param0, String param1, boolean param2) {
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long var8 = 0L;
        int var10_int = 0;
        Object var10 = null;
        int var11 = 0;
        char[] var15 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var11 = Transmogrify.field_A ? 1 : 0;
        var3 = 0;
        var15 = param1.toCharArray();
        var5 = -108 % ((param0 - 46) / 49);
        var6 = 0;
        L0: while (true) {
          if (var6 >= param1.length()) {
            return li.field_n[-var3 + param1.length()];
          } else {
            L1: {
              if (var3 > 2) {
                stackOut_4_0 = var3 - -1;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 3;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            var7 = stackIn_5_0 + var6;
            L2: while (true) {
              if (param1.length() < var7) {
                var6++;
                continue L0;
              } else {
                var8 = 0L;
                var10_int = var6;
                L3: while (true) {
                  if (var10_int >= var7) {
                    var10 = ac.field_n.a(-126, var8);
                    L4: while (true) {
                      L5: {
                        if (var10 == null) {
                          break L5;
                        } else {
                          L6: {
                            if ((Object) (Object) param1 == var10) {
                              break L6;
                            } else {
                              dj.field_b.setLength(0);
                              StringBuilder discarded$1 = dj.field_b.append(param1.substring(var6, var7));
                              if (-1 == ((String) var10).indexOf(dj.field_b.toString())) {
                                break L6;
                              } else {
                                var3 = var7 - var6;
                                break L5;
                              }
                            }
                          }
                          var10 = ac.field_n.b(-1);
                          continue L4;
                        }
                      }
                      if (param2) {
                        ac.field_n.a((Object) (Object) param1, (byte) 26, var8);
                        if (null == ac.field_n.a(-128, var8)) {
                          throw new IllegalStateException();
                        } else {
                          var7++;
                          continue L2;
                        }
                      } else {
                        var7++;
                        continue L2;
                      }
                    }
                  } else {
                    var8 = -var8 + (var8 << 791048133) - -(long)(255 & var15[var10_int]);
                    var10_int++;
                    continue L3;
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = Transmogrify.field_A ? 1 : 0;
        if (param3 != 5768) {
            return;
        }
        if (!(!((gj) this).field_e)) {
            return;
        }
        while (param1 > 0) {
            var5 = ((gj) this).field_d.read(param2, param0, param1);
            if (-1 <= (var5 ^ -1)) {
                throw new EOFException();
            }
            param0 = param0 + var5;
            param1 = param1 - var5;
        }
    }

    final static void a(byte param0, cf param1, int param2) {
        hj var3 = ff.field_D;
        var3.a(false, param2);
        var3.f(param0 + 6306, param1.field_g);
        if (param0 != 83) {
            return;
        }
        var3.c(param1.field_h, -159688920);
    }

    final static void a(boolean param0, int param1) {
        int discarded$4 = wf.a(-1);
        if (!param0) {
            gj.b(-59);
        }
    }

    final static q a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        var2 = param1.length();
        if (var2 == param0) {
          return ai.field_a;
        } else {
          if (-64 <= (var2 ^ -1)) {
            var3 = 0;
            L0: while (true) {
              if (var3 < var2) {
                var4 = param1.charAt(var3);
                if (var4 == 45) {
                  L1: {
                    if (var3 == 0) {
                      break L1;
                    } else {
                      if (var2 - 1 == var3) {
                        break L1;
                      } else {
                        var3++;
                        continue L0;
                      }
                    }
                  }
                  return vc.field_N;
                } else {
                  if ((li.field_o.indexOf(var4) ^ -1) == 0) {
                    return vc.field_N;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              } else {
                return null;
              }
            }
          } else {
            return rd.field_d;
          }
        }
    }

    final static void e(int param0) {
        if (param0 != 0) {
            Object var2 = null;
            int discarded$0 = gj.a((byte) -24, (String) null, true);
        }
        ha.field_a = null;
        hk.field_c = null;
    }

    final void d(int param0) throws IOException {
        int var2 = -36 / ((param0 - 16) / 54);
        if (((gj) this).field_e) {
            return;
        }
        if (!(!((gj) this).field_i)) {
            ((gj) this).field_i = false;
            throw new IOException();
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
                        var6 = Transmogrify.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((gj) this).field_g != ((gj) this).field_n) {
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
                            if (((gj) this).field_e) {
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
                            var2 = ((gj) this).field_n;
                            if (((gj) this).field_n <= ((gj) this).field_g) {
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
                            var1_int = ((gj) this).field_o - ((gj) this).field_n;
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
                            var1_int = ((gj) this).field_g + -((gj) this).field_n;
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
                            if ((var1_int ^ -1) < -1) {
                                statePc = 11;
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
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            ((gj) this).field_k.write(((gj) this).field_h, var2, var1_int);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 13 : 30);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((gj) this).field_i = true;
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
                            ((gj) this).field_n = (var1_int + ((gj) this).field_n) % ((gj) this).field_o;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (((gj) this).field_n != ((gj) this).field_g) {
                                statePc = 1;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 18 : 30);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            ((gj) this).field_k.flush();
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 18 : 30);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((gj) this).field_i = true;
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
                            if (((gj) this).field_d == null) {
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
                            ((gj) this).field_d.close();
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (null != ((gj) this).field_k) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((gj) this).field_k.close();
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
                            if (null == ((gj) this).field_m) {
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
                            ((gj) this).field_m.close();
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
                            ((gj) this).field_h = null;
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
                        d.a((Throwable) (Object) var1_ref, 28, (String) null);
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

    final int c(int param0) throws IOException {
        if (((gj) this).field_e) {
            return 0;
        }
        if (param0 != 1) {
            return 119;
        }
        return ((gj) this).field_d.read();
    }

    final static String a(int param0) {
        if (param0 > -100) {
            gj.a(false, 74);
        }
        if (w.field_a == null) {
            return "";
        }
        return w.field_a;
    }

    final static boolean a(int[] param0, byte param1) {
        long var2 = 0L;
        b var4_ref_b = null;
        int var4 = 0;
        int var5_int = 0;
        b var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Transmogrify.field_A ? 1 : 0;
        if (ll.field_Q == lj.field_z) {
          L0: {
            var2 = lk.a(0);
            if (aa.field_a == 0) {
              break L0;
            } else {
              if (-1 >= (md.field_k ^ -1)) {
                break L0;
              } else {
                var4_ref_b = (b) (Object) le.field_C.a((byte) -95);
                if (var4_ref_b == null) {
                  break L0;
                } else {
                  if (var4_ref_b.field_g >= var2) {
                    break L0;
                  } else {
                    var4_ref_b.c(5);
                    tg.field_a = var4_ref_b.field_h.length;
                    nf.field_l.field_h = 0;
                    var5_int = 0;
                    L1: while (true) {
                      if (tg.field_a <= var5_int) {
                        bd.field_t = nf.field_k;
                        nf.field_k = dg.field_a;
                        dg.field_a = ca.field_e;
                        ca.field_e = var4_ref_b.field_j;
                        return true;
                      } else {
                        nf.field_l.field_g[var5_int] = var4_ref_b.field_h[var5_int];
                        var5_int++;
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          }
          L2: {
            if (param1 > 83) {
              break L2;
            } else {
              field_f = null;
              break L2;
            }
          }
          L3: while (true) {
            L4: {
              if (0 > md.field_k) {
                nf.field_l.field_h = 0;
                if (ue.a(1, 0)) {
                  md.field_k = nf.field_l.l(-12135);
                  nf.field_l.field_h = 0;
                  tg.field_a = param0[md.field_k];
                  break L4;
                } else {
                  return false;
                }
              } else {
                break L4;
              }
            }
            if (!ce.a(0)) {
              return false;
            } else {
              if (aa.field_a != 0) {
                L5: {
                  var4 = aa.field_a;
                  if (lj.field_x == 0.0) {
                    break L5;
                  } else {
                    var4 = (int)((double)var4 + d.field_c.nextGaussian() * lj.field_x);
                    if (0 <= var4) {
                      break L5;
                    } else {
                      var4 = 0;
                      break L5;
                    }
                  }
                }
                var5 = new b((long)var4 + var2, md.field_k, new byte[tg.field_a]);
                var6 = 0;
                L6: while (true) {
                  if (tg.field_a <= var6) {
                    le.field_C.a((wf) (Object) var5, -100);
                    md.field_k = -1;
                    continue L3;
                  } else {
                    var5.field_h[var6] = nf.field_l.field_g[var6];
                    var6++;
                    continue L6;
                  }
                }
              } else {
                bd.field_t = nf.field_k;
                nf.field_k = dg.field_a;
                dg.field_a = ca.field_e;
                ca.field_e = md.field_k;
                md.field_k = -1;
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    protected final void finalize() {
        ((gj) this).a(true);
    }

    final int a(byte param0) throws IOException {
        if (((gj) this).field_e) {
            return 0;
        }
        int var2 = -83 / ((-62 - param0) / 36);
        return ((gj) this).field_d.available();
    }

    private gj(java.net.Socket param0, fe param1, int param2) throws IOException {
        ((gj) this).field_i = false;
        ((gj) this).field_n = 0;
        ((gj) this).field_e = false;
        ((gj) this).field_g = 0;
        ((gj) this).field_c = param1;
        ((gj) this).field_m = param0;
        ((gj) this).field_m.setSoTimeout(30000);
        ((gj) this).field_m.setTcpNoDelay(true);
        ((gj) this).field_d = ((gj) this).field_m.getInputStream();
        ((gj) this).field_k = ((gj) this).field_m.getOutputStream();
        ((gj) this).field_o = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Orb points: <%0>";
        field_a = new java.awt.Color(10040319);
        field_l = 0;
    }
}
