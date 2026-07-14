/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class gj {
    private byte[] field_e;
    private long field_k;
    private byte[] field_i;
    private long field_d;
    private long field_b;
    private int field_h;
    private long field_c;
    private sr field_j;
    private long field_g;
    private int field_f;
    private long field_a;

    final static void c(int param0) {
        bw.a(false, ra.c(param0 ^ 2));
        if (param0 != 0) {
            Object var2 = null;
            gj.a(42L, (java.applet.Applet) null, false, (String) null, (String) null);
        }
    }

    final static void a(long param0, java.applet.Applet param1, boolean param2, String param3, String param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            try {
              var8 = param1.getParameter("cookiehost");
              var7 = var8;
              var7 = var8;
              if (param2) {
                L0: {
                  var9 = param4 + "=" + param3 + "; version=1; path=/; domain=" + var8;
                  var7 = var9;
                  var7 = var9;
                  if ((param0 ^ -1L) > -1L) {
                    var7 = var9 + "; Discard;";
                    break L0;
                  } else {
                    var7 = var9 + "; Expires=" + fi.a(param0 * 1000L + wq.a(-123), true) + "; Max-Age=" + param0;
                    break L0;
                  }
                }
                tw.a("document.cookie=\"" + var7 + "\"", -15428, param1);
              } else {
                return;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var6 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        IOException var5 = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = Sumoblitz.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 + param1 <= param2.length) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(param1 + (param0 + -param2.length));
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((((gj) this).field_g ^ -1L) == 0L) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((gj) this).field_d < ((gj) this).field_g) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((((gj) this).field_d + (long)param0 ^ -1L) < ((long)((gj) this).field_h + ((gj) this).field_g ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        la.a(((gj) this).field_i, (int)(-((gj) this).field_g + ((gj) this).field_d), param2, param1, param0);
                        ((gj) this).field_d = ((gj) this).field_d + (long)param0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        var5_long = ((gj) this).field_d;
                        var7 = param1;
                        var8 = param0;
                        if ((((gj) this).field_d ^ -1L) > (((gj) this).field_b ^ -1L)) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (((gj) this).field_d < ((gj) this).field_b + (long)((gj) this).field_f) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var9_int = (int)((long)((gj) this).field_f + (-((gj) this).field_d - -((gj) this).field_b));
                        if (param0 >= var9_int) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9_int = param0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        la.a(((gj) this).field_e, (int)(((gj) this).field_d - ((gj) this).field_b), param2, param1, var9_int);
                        param1 = param1 + var9_int;
                        ((gj) this).field_d = ((gj) this).field_d + (long)var9_int;
                        param0 = param0 - var9_int;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (param0 <= ((gj) this).field_e.length) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((gj) this).field_j.a((byte) -100, ((gj) this).field_d);
                        ((gj) this).field_k = ((gj) this).field_d;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (-1 <= (param0 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var9_int = ((gj) this).field_j.b(param2, 2, param0, param1);
                        if ((var9_int ^ -1) == 0) {
                            statePc = 25;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((gj) this).field_d = ((gj) this).field_d + (long)var9_int;
                        ((gj) this).field_k = ((gj) this).field_k + (long)var9_int;
                        param1 = param1 + var9_int;
                        param0 = param0 - var9_int;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((param0 ^ -1) < -1) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        this.a(-1);
                        var9_int = param0;
                        if (((gj) this).field_f < var9_int) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var9_int = ((gj) this).field_f;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        la.a(((gj) this).field_e, 0, param2, param1, var9_int);
                        ((gj) this).field_d = ((gj) this).field_d + (long)var9_int;
                        param1 = param1 + var9_int;
                        param0 = param0 - var9_int;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (param3 < -51) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return;
                }
                case 27: {
                    try {
                        if (((gj) this).field_g != -1L) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((((gj) this).field_d ^ -1L) <= (((gj) this).field_g ^ -1L)) {
                            statePc = 37;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (-1 > (param0 ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9_int = (int)(-((gj) this).field_d + ((gj) this).field_g) + param1;
                        if (param0 + param1 < var9_int) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9_int = param0 + param1;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (param1 >= var9_int) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        param0--;
                        param1++;
                        param2[param1] = (byte) 0;
                        ((gj) this).field_d = ((gj) this).field_d + 1L;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var9 = -1L;
                        var11 = -1L;
                        if (var5_long > ((gj) this).field_g) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (((long)var8 + var5_long ^ -1L) < (((gj) this).field_g ^ -1L)) {
                            statePc = 44;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (((gj) this).field_g > var5_long) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var5_long < (long)((gj) this).field_h + ((gj) this).field_g) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var9 = var5_long;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var9 = ((gj) this).field_g;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var5_long >= (long)((gj) this).field_h + ((gj) this).field_g) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if ((long)var8 + var5_long < ((gj) this).field_g + (long)((gj) this).field_h) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var11 = (long)((gj) this).field_h + ((gj) this).field_g;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if ((((gj) this).field_g ^ -1L) <= (var5_long + (long)var8 ^ -1L)) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (((gj) this).field_g + (long)((gj) this).field_h < var5_long + (long)var8) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var11 = (long)var8 + var5_long;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (-1L >= var9) {
                            statePc = 58;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var9 >= var11) {
                            statePc = 58;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var13 = (int)(var11 - var9);
                        la.a(((gj) this).field_i, (int)(-((gj) this).field_g + var9), param2, (int)(var9 - var5_long) + var7, var13);
                        if ((var11 ^ -1L) < (((gj) this).field_d ^ -1L)) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        param0 = (int)((long)param0 - (var11 - ((gj) this).field_d));
                        ((gj) this).field_d = var11;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 57: {
                    var5 = (IOException) (Object) caughtException;
                    ((gj) this).field_k = -1L;
                    throw var5;
                }
                case 58: {
                    if (param0 > 0) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    return;
                }
                case 60: {
                    throw new EOFException();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(byte param0) throws IOException {
        int var2 = 0;
        long var2_long = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Sumoblitz.field_L ? 1 : 0;
          if ((((gj) this).field_g ^ -1L) == 0L) {
            break L0;
          } else {
            L1: {
              if (((gj) this).field_k != ((gj) this).field_g) {
                ((gj) this).field_j.a((byte) -115, ((gj) this).field_g);
                ((gj) this).field_k = ((gj) this).field_g;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((gj) this).field_j.a(((gj) this).field_i, 0, ((gj) this).field_h, 1);
              ((gj) this).field_k = ((gj) this).field_k + (long)((gj) this).field_h;
              if (((gj) this).field_k <= ((gj) this).field_c) {
                break L2;
              } else {
                ((gj) this).field_c = ((gj) this).field_k;
                break L2;
              }
            }
            L3: {
              L4: {
                var2_long = -1L;
                var4 = -1L;
                if (((gj) this).field_g < ((gj) this).field_b) {
                  break L4;
                } else {
                  if ((((gj) this).field_b + (long)((gj) this).field_f ^ -1L) >= (((gj) this).field_g ^ -1L)) {
                    break L4;
                  } else {
                    var2_long = ((gj) this).field_g;
                    break L3;
                  }
                }
              }
              if ((((gj) this).field_b ^ -1L) > (((gj) this).field_g ^ -1L)) {
                break L3;
              } else {
                if (((gj) this).field_g + (long)((gj) this).field_h > ((gj) this).field_b) {
                  var2_long = ((gj) this).field_b;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if (((gj) this).field_b >= ((gj) this).field_g + (long)((gj) this).field_h) {
                  break L6;
                } else {
                  if ((long)((gj) this).field_f + ((gj) this).field_b < ((gj) this).field_g + (long)((gj) this).field_h) {
                    break L6;
                  } else {
                    var4 = ((gj) this).field_g + (long)((gj) this).field_h;
                    break L5;
                  }
                }
              }
              if ((long)((gj) this).field_f + ((gj) this).field_b <= ((gj) this).field_g) {
                break L5;
              } else {
                if ((((gj) this).field_b - -(long)((gj) this).field_f ^ -1L) >= ((long)((gj) this).field_h + ((gj) this).field_g ^ -1L)) {
                  var4 = (long)((gj) this).field_f + ((gj) this).field_b;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (0L <= (var2_long ^ -1L)) {
                break L7;
              } else {
                if ((var2_long ^ -1L) <= (var4 ^ -1L)) {
                  break L7;
                } else {
                  var6 = (int)(-var2_long + var4);
                  la.a(((gj) this).field_i, (int)(-((gj) this).field_g + var2_long), ((gj) this).field_e, (int)(-((gj) this).field_b + var2_long), var6);
                  break L7;
                }
              }
            }
            ((gj) this).field_g = -1L;
            ((gj) this).field_h = 0;
            break L0;
          }
        }
        var2 = -14 / ((67 - param0) / 34);
    }

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
        IOException var5 = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Sumoblitz.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((long)param1 + ((gj) this).field_d ^ -1L) < (((gj) this).field_a ^ -1L)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((gj) this).field_a = (long)param1 + ((gj) this).field_d;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (0L == (((gj) this).field_g ^ -1L)) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((gj) this).field_g > ((gj) this).field_d) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (((long)((gj) this).field_h + ((gj) this).field_g ^ -1L) > (((gj) this).field_d ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.b((byte) 115);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (0L == (((gj) this).field_g ^ -1L)) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (((gj) this).field_g + (long)((gj) this).field_i.length >= ((gj) this).field_d + (long)param1) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5_int = (int)(((gj) this).field_g + -((gj) this).field_d + (long)((gj) this).field_i.length);
                        la.a(param0, param3, ((gj) this).field_i, (int)(-((gj) this).field_g + ((gj) this).field_d), var5_int);
                        ((gj) this).field_d = ((gj) this).field_d + (long)var5_int;
                        param1 = param1 - var5_int;
                        param3 = param3 + var5_int;
                        ((gj) this).field_h = ((gj) this).field_i.length;
                        this.b((byte) 109);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (((gj) this).field_i.length >= param1) {
                            statePc = 36;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((((gj) this).field_d ^ -1L) == (((gj) this).field_k ^ -1L)) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((gj) this).field_j.a((byte) -99, ((gj) this).field_d);
                        ((gj) this).field_k = ((gj) this).field_d;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((gj) this).field_j.a(param0, param3, param1, 1);
                        ((gj) this).field_k = ((gj) this).field_k + (long)param1;
                        if (((gj) this).field_k > ((gj) this).field_c) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((gj) this).field_c = ((gj) this).field_k;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5_long = -1L;
                        if (((gj) this).field_b > ((gj) this).field_d) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (((long)((gj) this).field_f + ((gj) this).field_b ^ -1L) >= (((gj) this).field_d ^ -1L)) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var5_long = ((gj) this).field_d;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((((gj) this).field_d ^ -1L) < (((gj) this).field_b ^ -1L)) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((long)param1 + ((gj) this).field_d <= ((gj) this).field_b) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var5_long = ((gj) this).field_b;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var7 = -1L;
                        if (((gj) this).field_b >= (long)param1 + ((gj) this).field_d) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((((gj) this).field_b + (long)((gj) this).field_f ^ -1L) > (((gj) this).field_d - -(long)param1 ^ -1L)) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var7 = (long)param1 + ((gj) this).field_d;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((((gj) this).field_d ^ -1L) <= ((long)((gj) this).field_f + ((gj) this).field_b ^ -1L)) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (((long)((gj) this).field_f + ((gj) this).field_b ^ -1L) < ((long)param1 + ((gj) this).field_d ^ -1L)) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var7 = (long)((gj) this).field_f + ((gj) this).field_b;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((var5_long ^ -1L) >= 0L) {
                            statePc = 34;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var7 > var5_long) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9 = (int)(var7 - var5_long);
                        la.a(param0, (int)(-((gj) this).field_d + (var5_long + (long)param3)), ((gj) this).field_e, (int)(var5_long + -((gj) this).field_b), var9);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ((gj) this).field_d = ((gj) this).field_d + (long)param1;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 35: {
                    return;
                }
                case 36: {
                    try {
                        if (0 >= param1) {
                            statePc = 44;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (0L == (((gj) this).field_g ^ -1L)) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        ((gj) this).field_g = ((gj) this).field_d;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        la.a(param0, param3, ((gj) this).field_i, (int)(-((gj) this).field_g + ((gj) this).field_d), param1);
                        ((gj) this).field_d = ((gj) this).field_d + (long)param1;
                        if (((gj) this).field_d + -((gj) this).field_g > (long)((gj) this).field_h) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        ((gj) this).field_h = (int)(((gj) this).field_d + -((gj) this).field_g);
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    return;
                }
                case 44: {
                    try {
                        var5_int = -89 % ((20 - param2) / 41);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    var5 = (IOException) (Object) caughtException;
                    ((gj) this).field_k = -1L;
                    throw var5;
                }
                case 47: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0) throws IOException {
        this.b((byte) -114);
        if (param0 != -1) {
            gj.c(-23);
        }
        ((gj) this).field_j.b(0);
    }

    final void a(byte[] param0, byte param1) throws IOException {
        int var3 = 47 / ((84 - param1) / 39);
        ((gj) this).a(param0.length, 0, param0, -127);
    }

    final void a(int param0, long param1) throws IOException {
        if (-1L < (param1 ^ -1L)) {
          throw new IOException();
        } else {
          L0: {
            if (param0 == -7564) {
              break L0;
            } else {
              ((gj) this).field_g = -40L;
              break L0;
            }
          }
          ((gj) this).field_d = param1;
          return;
        }
    }

    final long a(byte param0) {
        if (param0 != -60) {
            return 111L;
        }
        return ((gj) this).field_a;
    }

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Sumoblitz.field_L ? 1 : 0;
        ((gj) this).field_f = 0;
        if (((gj) this).field_k != ((gj) this).field_d) {
            ((gj) this).field_j.a((byte) 54, ((gj) this).field_d);
            ((gj) this).field_k = ((gj) this).field_d;
        }
        if (param0 != -1) {
            Object var5 = null;
            gj.a(20L, (java.applet.Applet) null, true, (String) null, (String) null);
        }
        ((gj) this).field_b = ((gj) this).field_d;
        while (((gj) this).field_f < ((gj) this).field_e.length) {
            var2 = ((gj) this).field_e.length - ((gj) this).field_f;
            if (!(var2 <= 200000000)) {
                var2 = 200000000;
            }
            var3 = ((gj) this).field_j.b(((gj) this).field_e, 2, var2, ((gj) this).field_f);
            // ifeq L167
            ((gj) this).field_k = ((gj) this).field_k + (long)var3;
            ((gj) this).field_f = ((gj) this).field_f + var3;
        }
    }

    gj(sr param0, int param1, int param2) throws IOException {
        ((gj) this).field_h = 0;
        ((gj) this).field_b = -1L;
        ((gj) this).field_g = -1L;
        ((gj) this).field_j = param0;
        ((gj) this).field_c = param0.a(100);
        ((gj) this).field_a = param0.a(100);
        ((gj) this).field_i = new byte[param2];
        ((gj) this).field_e = new byte[param1];
        ((gj) this).field_d = 0L;
    }

    final static int a(byte param0, int param1) {
        if (param0 != -84) {
            int discarded$0 = gj.a((byte) 37, 116);
        }
        return fi.a(param1, iv.field_b, (byte) -96);
    }

    static {
    }
}
