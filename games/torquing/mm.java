/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mm implements Runnable {
    static int field_g;
    static int field_d;
    private fj field_i;
    private rc field_f;
    private DataInputStream field_c;
    private rc field_a;
    private vh field_j;
    private int field_e;
    private rc field_b;
    private java.net.URL field_k;
    static boolean field_h;

    final fj a(boolean param0) {
        if ((((mm) this).field_e ^ -1) == -4) {
            return ((mm) this).field_i;
        }
        if (param0) {
            return null;
        }
        ((mm) this).finalize();
        return null;
    }

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
                        var4 = Torquing.field_u;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((mm) this).field_i.field_j.length <= ((mm) this).field_i.field_n) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var1_int = ((mm) this).field_c.read(((mm) this).field_i.field_j, ((mm) this).field_i.field_n, ((mm) this).field_i.field_j.length + -((mm) this).field_i.field_n);
                            if (var1_int >= 0) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            ((mm) this).field_i.field_n = ((mm) this).field_i.field_n + var1_int;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (((mm) this).field_i.field_j.length != ((mm) this).field_i.field_n) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((mm) this).field_i.field_j.length + " " + ((mm) this).field_k);
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var1 = this;
                            // monitorenter this
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            ((mm) this).finalize();
                            ((mm) this).field_e = 3;
                            // monitorexit var1
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var2 = caughtException;
                            // monitorexit var1
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            throw (RuntimeException) (Object) var2;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var1_ref = (Exception) (Object) caughtException;
                        var2_ref = this;
                        // monitorenter this
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        try {
                            ((mm) this).finalize();
                            ((mm) this).field_e = ((mm) this).field_e + 1;
                            // monitorexit var2_ref
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var3 = caughtException;
                            // monitorexit var2_ref
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        throw (RuntimeException) (Object) var3;
                    }
                    case 18: {
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

    final static void a(byte param0) {
        if (param0 != 60) {
            return;
        }
        qi.field_c = false;
        int discarded$0 = kj.field_d.i((byte) -101);
    }

    final synchronized boolean a(int param0) {
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
                    if (((mm) this).field_e < 2) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return true;
                }
                case 2: {
                    if (-1 == (((mm) this).field_e ^ -1)) {
                        statePc = 4;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (((mm) this).field_f == null) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((mm) this).field_f = ((mm) this).field_j.a(param0 ^ 3, ((mm) this).field_k);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (((mm) this).field_f.field_a != 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return false;
                }
                case 9: {
                    if (1 == ((mm) this).field_f.field_a) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((mm) this).field_e = ((mm) this).field_e + 1;
                    ((mm) this).field_f = null;
                    return false;
                }
                case 11: {
                    if (((mm) this).field_e == 1) {
                        statePc = 13;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (null == ((mm) this).field_b) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    ((mm) this).field_b = ((mm) this).field_j.a(((mm) this).field_k.getHost(), 443, -60);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (-1 != (((mm) this).field_b.field_a ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return false;
                }
                case 18: {
                    if (((mm) this).field_b.field_a == 1) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    ((mm) this).field_e = ((mm) this).field_e + 1;
                    ((mm) this).field_b = null;
                    return false;
                }
                case 20: {
                    if (null == ((mm) this).field_c) {
                        statePc = 22;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 22: {
                    try {
                        if (-1 == (((mm) this).field_e ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ((mm) this).field_c = (DataInputStream) ((mm) this).field_f.field_d;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (1 != ((mm) this).field_e) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var4 = (java.net.Socket) ((mm) this).field_b.field_d;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((mm) this).field_k.getFile() + "\n\n");
                        var3.write(vg.a(var5, (byte) -126));
                        ((mm) this).field_c = new DataInputStream(var4.getInputStream());
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
                        ((mm) this).field_i.field_n = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    var2 = (IOException) (Object) caughtException;
                    ((mm) this).finalize();
                    ((mm) this).field_e = ((mm) this).field_e + 1;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (param0 == 3) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    return true;
                }
                case 32: {
                    if (((mm) this).field_a != null) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    ((mm) this).field_a = ((mm) this).field_j.a((byte) -102, 5, (Runnable) this);
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (((mm) this).field_a.field_a == 0) {
                        statePc = 36;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 36: {
                    return false;
                }
                case 37: {
                    if (-2 == (((mm) this).field_a.field_a ^ -1)) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    ((mm) this).finalize();
                    ((mm) this).field_e = ((mm) this).field_e + 1;
                    return false;
                }
                case 39: {
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static long a(CharSequence param0, byte param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Torquing.field_u;
        var2 = 0L;
        var4 = param0.length();
        var5 = 0;
        L0: while (true) {
          L1: {
            if (var5 >= var4) {
              break L1;
            } else {
              L2: {
                L3: {
                  var2 = var2 * 37L;
                  var6 = param0.charAt(var5);
                  if (65 > var6) {
                    break L3;
                  } else {
                    if (var6 > 90) {
                      break L3;
                    } else {
                      var2 = var2 + (long)(1 + var6 - 65);
                      break L2;
                    }
                  }
                }
                L4: {
                  if (var6 < 97) {
                    break L4;
                  } else {
                    if (122 < var6) {
                      break L4;
                    } else {
                      var2 = var2 + (long)(1 - -var6 + -97);
                      break L2;
                    }
                  }
                }
                if (48 > var6) {
                  break L2;
                } else {
                  if (57 < var6) {
                    break L2;
                  } else {
                    var2 = var2 + (long)(27 - (-var6 - -48));
                    break L2;
                  }
                }
              }
              if ((var2 ^ -1L) <= -177917621779460414L) {
                break L1;
              } else {
                var5++;
                continue L0;
              }
            }
          }
          L5: while (true) {
            L6: {
              if (0L != var2 % 37L) {
                break L6;
              } else {
                if (0L == var2) {
                  break L6;
                } else {
                  var2 = var2 / 37L;
                  continue L5;
                }
              }
            }
            L7: {
              if (param1 >= 86) {
                break L7;
              } else {
                field_h = false;
                break L7;
              }
            }
            return var2;
          }
        }
    }

    protected final void finalize() {
        if (((mm) this).field_f != null) {
            if (null != ((mm) this).field_f.field_d) {
                try {
                    ((DataInputStream) ((mm) this).field_f.field_d).close();
                } catch (Exception exception) {
                }
            }
            ((mm) this).field_f = null;
        }
        if (!(null == ((mm) this).field_b)) {
            if (!(((mm) this).field_b.field_d == null)) {
                try {
                    ((java.net.Socket) ((mm) this).field_b.field_d).close();
                } catch (Exception exception) {
                }
            }
            ((mm) this).field_b = null;
        }
        if (!(((mm) this).field_c == null)) {
            try {
                ((mm) this).field_c.close();
            } catch (Exception exception) {
            }
            ((mm) this).field_c = null;
        }
        ((mm) this).field_a = null;
    }

    mm(vh param0, java.net.URL param1, int param2) {
        ((mm) this).field_j = param0;
        ((mm) this).field_k = param1;
        ((mm) this).field_i = new fj(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = -1;
        field_h = false;
    }
}
