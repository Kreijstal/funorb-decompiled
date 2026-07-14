/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fi implements Runnable {
    private il field_c;
    private bl field_i;
    private DataInputStream field_a;
    private int field_g;
    static int[] field_h;
    private od field_j;
    private il field_f;
    private java.net.URL field_d;
    private il field_b;
    static he[] field_e;

    final static String a(int param0, byte param1, int param2, CharSequence[] param3) {
        CharSequence var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (0 == param0) {
          return "";
        } else {
          if (param0 != 1) {
            if (param1 <= -16) {
              var4 = param2 + param0;
              var5 = 0;
              var6_int = param2;
              L0: while (true) {
                if (var4 <= var6_int) {
                  var6 = new StringBuilder(var5);
                  var7 = param2;
                  L1: while (true) {
                    if (var7 >= var4) {
                      return var6.toString();
                    } else {
                      var8 = param3[var7];
                      if (var8 == null) {
                        StringBuilder discarded$2 = var6.append("null");
                        var7++;
                        continue L1;
                      } else {
                        StringBuilder discarded$3 = var6.append(var8);
                        var7++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  var7_ref_CharSequence = param3[var6_int];
                  if (var7_ref_CharSequence == null) {
                    var5 += 4;
                    var6_int++;
                    continue L0;
                  } else {
                    var5 = var5 + var7_ref_CharSequence.length();
                    var6_int++;
                    continue L0;
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            var10 = param3[param2];
            var4_ref = var10;
            if (var4_ref == null) {
              return "null";
            } else {
              return ((Object) (Object) var10).toString();
            }
          }
        }
    }

    final od a(byte param0) {
        if (param0 < 121) {
            ((fi) this).field_c = null;
        }
        if (3 != ((fi) this).field_g) {
            return null;
        }
        return ((fi) this).field_j;
    }

    public static void a(int param0) {
        field_e = null;
        field_h = null;
        if (param0 <= 100) {
            field_h = null;
        }
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
                        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((fi) this).field_j.field_j >= ((fi) this).field_j.field_h.length) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var1_int = ((fi) this).field_a.read(((fi) this).field_j.field_h, ((fi) this).field_j.field_j, -((fi) this).field_j.field_j + ((fi) this).field_j.field_h.length);
                            if (-1 < (var1_int ^ -1)) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            ((fi) this).field_j.field_j = ((fi) this).field_j.field_j + var1_int;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (((fi) this).field_j.field_j != ((fi) this).field_j.field_h.length) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((fi) this).field_j.field_h.length + " " + ((fi) this).field_d);
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var1 = this;
                            // monitorenter this
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            ((fi) this).finalize();
                            ((fi) this).field_g = 3;
                            // monitorexit var1
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var2 = caughtException;
                            // monitorexit var1
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            throw (RuntimeException) (Object) var2;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var1_ref = (Exception) (Object) caughtException;
                        var2_ref = this;
                        // monitorenter this
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        try {
                            ((fi) this).finalize();
                            ((fi) this).field_g = ((fi) this).field_g + 1;
                            // monitorexit var2_ref
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var3 = caughtException;
                            // monitorexit var2_ref
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        throw (RuntimeException) (Object) var3;
                    }
                    case 17: {
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
                    if (2 > ((fi) this).field_g) {
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
                    if (0 == ((fi) this).field_g) {
                        statePc = 4;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (null == ((fi) this).field_c) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((fi) this).field_c = ((fi) this).field_i.a(98, ((fi) this).field_d);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (((fi) this).field_c.field_b == 0) {
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
                    if (1 == ((fi) this).field_c.field_b) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ((fi) this).field_g = ((fi) this).field_g + 1;
                    ((fi) this).field_c = null;
                    return false;
                }
                case 12: {
                    if (param0 == ((fi) this).field_g) {
                        statePc = 14;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (null == ((fi) this).field_f) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 16: {
                    ((fi) this).field_f = ((fi) this).field_i.a(((fi) this).field_d.getHost(), 443, 44);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (-1 == ((fi) this).field_f.field_b) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    return false;
                }
                case 20: {
                    if (-2 == ((fi) this).field_f.field_b) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    ((fi) this).field_g = ((fi) this).field_g + 1;
                    ((fi) this).field_f = null;
                    return false;
                }
                case 22: {
                    if (null != ((fi) this).field_a) {
                        statePc = 32;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    try {
                        if (0 == ((fi) this).field_g) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ((fi) this).field_a = (DataInputStream) ((fi) this).field_c.field_g;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (1 == ((fi) this).field_g) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var4 = (java.net.Socket) ((fi) this).field_f.field_g;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((fi) this).field_d.getFile() + "\n\n");
                        var3.write(b.a((byte) -120, var5));
                        ((fi) this).field_a = new DataInputStream(var4.getInputStream());
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ((fi) this).field_j.field_j = 0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    var2 = (IOException) (Object) caughtException;
                    ((fi) this).finalize();
                    ((fi) this).field_g = ((fi) this).field_g + 1;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (null != ((fi) this).field_b) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    ((fi) this).field_b = ((fi) this).field_i.a((Runnable) this, 5, (byte) 28);
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (((fi) this).field_b.field_b != 0) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    return false;
                }
                case 36: {
                    if ((((fi) this).field_b.field_b ^ -1) == -2) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((fi) this).finalize();
                    ((fi) this).field_g = ((fi) this).field_g + 1;
                    return false;
                }
                case 38: {
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    protected final void finalize() {
        if (((fi) this).field_c != null) {
            if (null != ((fi) this).field_c.field_g) {
                try {
                    ((DataInputStream) ((fi) this).field_c.field_g).close();
                } catch (Exception exception) {
                }
            }
            ((fi) this).field_c = null;
        }
        if (!(((fi) this).field_f == null)) {
            if (null != ((fi) this).field_f.field_g) {
                try {
                    ((java.net.Socket) ((fi) this).field_f.field_g).close();
                } catch (Exception exception) {
                }
            }
            ((fi) this).field_f = null;
        }
        if (!(null == ((fi) this).field_a)) {
            try {
                ((fi) this).field_a.close();
            } catch (Exception exception) {
            }
            ((fi) this).field_a = null;
        }
        ((fi) this).field_b = null;
    }

    fi(bl param0, java.net.URL param1, int param2) {
        ((fi) this).field_i = param0;
        ((fi) this).field_d = param1;
        ((fi) this).field_j = new od(param2);
    }

    static {
    }
}
