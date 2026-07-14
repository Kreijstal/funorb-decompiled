/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class il {
    private int field_c;
    static th field_e;
    private long field_d;
    private byte[] field_h;
    private long field_g;
    private tc field_m;
    private int field_f;
    private long field_j;
    private byte[] field_a;
    private long field_k;
    private long field_i;
    static qj[] field_l;
    private long field_b;

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
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
                    var14 = TrackController.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0.length < param1 + param2) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(-param0.length + param2 + param1);
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((il) this).field_j == -1L) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((il) this).field_b < ((il) this).field_j) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((long)((il) this).field_f + ((il) this).field_j < ((il) this).field_b + (long)param1) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        pd.a(((il) this).field_h, (int)(((il) this).field_b + -((il) this).field_j), param0, param2, param1);
                        ((il) this).field_b = ((il) this).field_b + (long)param1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var5_long = ((il) this).field_b;
                        var7 = param2;
                        var8 = param1;
                        if ((((il) this).field_b ^ -1L) > (((il) this).field_d ^ -1L)) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((((il) this).field_d + (long)((il) this).field_c ^ -1L) < (((il) this).field_b ^ -1L)) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9_int = (int)((long)((il) this).field_c - ((il) this).field_b - -((il) this).field_d);
                        if (param1 < var9_int) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9_int = param1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        pd.a(((il) this).field_a, (int)(((il) this).field_b + -((il) this).field_d), param0, param2, var9_int);
                        param1 = param1 - var9_int;
                        ((il) this).field_b = ((il) this).field_b + (long)var9_int;
                        param2 = param2 + var9_int;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param1 > ((il) this).field_a.length) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (param1 <= 0) {
                            statePc = 25;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.b((byte) 66);
                        var9_int = param1;
                        if (var9_int <= ((il) this).field_c) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var9_int = ((il) this).field_c;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        pd.a(((il) this).field_a, 0, param0, param2, var9_int);
                        param1 = param1 - var9_int;
                        ((il) this).field_b = ((il) this).field_b + (long)var9_int;
                        param2 = param2 + var9_int;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((il) this).field_m.a(true, ((il) this).field_b);
                        ((il) this).field_i = ((il) this).field_b;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (0 >= param1) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var9_int = ((il) this).field_m.a(param0, (byte) 74, param2, param1);
                        if (-1 == var9_int) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        param2 = param2 + var9_int;
                        ((il) this).field_i = ((il) this).field_i + (long)var9_int;
                        param1 = param1 - var9_int;
                        ((il) this).field_b = ((il) this).field_b + (long)var9_int;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (0L == (((il) this).field_j ^ -1L)) {
                            statePc = 52;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((((il) this).field_b ^ -1L) <= (((il) this).field_j ^ -1L)) {
                            statePc = 32;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (0 >= param1) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var9_int = param2 + (int)(((il) this).field_j - ((il) this).field_b);
                        if (var9_int <= param2 + param1) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9_int = param1 + param2;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var9_int <= param2) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        param1--;
                        param2++;
                        param0[param2] = (byte) 0;
                        ((il) this).field_b = ((il) this).field_b + 1L;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9 = -1L;
                        if (((il) this).field_j < var5_long) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var5_long + (long)var8 <= ((il) this).field_j) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9 = ((il) this).field_j;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var5_long < ((il) this).field_j) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((long)((il) this).field_f + ((il) this).field_j > var5_long) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var9 = var5_long;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var11 = -1L;
                        if ((var5_long ^ -1L) <= (((il) this).field_j + (long)((il) this).field_f ^ -1L)) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (((long)var8 + var5_long ^ -1L) > (((il) this).field_j + (long)((il) this).field_f ^ -1L)) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var11 = ((il) this).field_j - -(long)((il) this).field_f;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (((il) this).field_j >= var5_long - -(long)var8) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((var5_long - -(long)var8 ^ -1L) < (((il) this).field_j - -(long)((il) this).field_f ^ -1L)) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var11 = (long)var8 + var5_long;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var9 <= -1L) {
                            statePc = 52;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if ((var11 ^ -1L) >= (var9 ^ -1L)) {
                            statePc = 52;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var13 = (int)(-var9 + var11);
                        pd.a(((il) this).field_h, (int)(var9 - ((il) this).field_j), param0, (int)(var9 - var5_long) + var7, var13);
                        if ((((il) this).field_b ^ -1L) > (var11 ^ -1L)) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        param1 = (int)((long)param1 - (var11 + -((il) this).field_b));
                        ((il) this).field_b = var11;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 51: {
                    var5 = (IOException) (Object) caughtException;
                    ((il) this).field_i = -1L;
                    throw var5;
                }
                case 52: {
                    if (param3 < param1) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    return;
                }
                case 54: {
                    throw new EOFException();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(int param0, CharSequence param1) {
        if (param0 > -29) {
            return null;
        }
        return oe.a(param1, (byte) -70, false);
    }

    final void a(long param0, boolean param1) throws IOException {
        if (!((param0 ^ -1L) <= -1L)) {
            throw new IOException();
        }
        ((il) this).field_b = param0;
        if (!param1) {
            ((il) this).field_g = -51L;
        }
    }

    final long a(byte param0) {
        if (param0 >= -72) {
            return 9L;
        }
        return ((il) this).field_k;
    }

    final void d(int param0) throws IOException {
        this.a(-120);
        ((il) this).field_m.a(-31576);
        if (param0 != 0) {
            int discarded$0 = il.c(57);
        }
    }

    final static int c(int param0) {
        if (param0 != -14496) {
            il.b(-115);
        }
        return (int)(1000000000L / ba.field_f);
    }

    private final void a(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = TrackController.field_F ? 1 : 0;
        if (param0 > -110) {
          return;
        } else {
          L0: {
            if (-1L == ((il) this).field_j) {
              break L0;
            } else {
              L1: {
                if ((((il) this).field_j ^ -1L) != (((il) this).field_i ^ -1L)) {
                  ((il) this).field_m.a(true, ((il) this).field_j);
                  ((il) this).field_i = ((il) this).field_j;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                ((il) this).field_m.a(0, ((il) this).field_f, 0, ((il) this).field_h);
                ((il) this).field_i = ((il) this).field_i + (long)((il) this).field_f;
                if ((((il) this).field_g ^ -1L) <= (((il) this).field_i ^ -1L)) {
                  break L2;
                } else {
                  ((il) this).field_g = ((il) this).field_i;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var2 = -1L;
                  if (((il) this).field_d > ((il) this).field_j) {
                    break L4;
                  } else {
                    if (((il) this).field_j >= ((il) this).field_d + (long)((il) this).field_c) {
                      break L4;
                    } else {
                      var2 = ((il) this).field_j;
                      break L3;
                    }
                  }
                }
                if (((il) this).field_j > ((il) this).field_d) {
                  break L3;
                } else {
                  if ((((il) this).field_d ^ -1L) > ((long)((il) this).field_f + ((il) this).field_j ^ -1L)) {
                    var2 = ((il) this).field_d;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                L6: {
                  var4 = -1L;
                  if (((il) this).field_d >= ((il) this).field_j + (long)((il) this).field_f) {
                    break L6;
                  } else {
                    if (((il) this).field_d + (long)((il) this).field_c >= (long)((il) this).field_f + ((il) this).field_j) {
                      var4 = (long)((il) this).field_f + ((il) this).field_j;
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if ((long)((il) this).field_c + ((il) this).field_d <= ((il) this).field_j) {
                  break L5;
                } else {
                  if (((il) this).field_j - -(long)((il) this).field_f >= (long)((il) this).field_c + ((il) this).field_d) {
                    var4 = ((il) this).field_d - -(long)((il) this).field_c;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L7: {
                if (-1L >= var2) {
                  break L7;
                } else {
                  if ((var4 ^ -1L) < (var2 ^ -1L)) {
                    var6 = (int)(-var2 + var4);
                    pd.a(((il) this).field_h, (int)(-((il) this).field_j + var2), ((il) this).field_a, (int)(-((il) this).field_d + var2), var6);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              ((il) this).field_f = 0;
              ((il) this).field_j = -1L;
              break L0;
            }
          }
          return;
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_l = null;
        if (param0 != -1) {
            il.b(-44);
        }
    }

    private final void b(byte param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        if (param0 <= 26) {
          return;
        } else {
          L0: {
            ((il) this).field_c = 0;
            if ((((il) this).field_b ^ -1L) != (((il) this).field_i ^ -1L)) {
              ((il) this).field_m.a(true, ((il) this).field_b);
              ((il) this).field_i = ((il) this).field_b;
              break L0;
            } else {
              break L0;
            }
          }
          ((il) this).field_d = ((il) this).field_b;
          L1: while (true) {
            L2: {
              if (((il) this).field_c >= ((il) this).field_a.length) {
                break L2;
              } else {
                L3: {
                  var2 = ((il) this).field_a.length + -((il) this).field_c;
                  if (200000000 >= var2) {
                    break L3;
                  } else {
                    var2 = 200000000;
                    break L3;
                  }
                }
                var3 = ((il) this).field_m.a(((il) this).field_a, (byte) 74, ((il) this).field_c, var2);
                if (-1 == var3) {
                  break L2;
                } else {
                  ((il) this).field_i = ((il) this).field_i + (long)var3;
                  ((il) this).field_c = ((il) this).field_c + var3;
                  continue L1;
                }
              }
            }
            return;
          }
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
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
                    var10 = TrackController.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((il) this).field_k < ((il) this).field_b + (long)param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((il) this).field_k = ((il) this).field_b + (long)param0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (-1L == ((il) this).field_j) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((il) this).field_b >= ((il) this).field_j) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.a(-114);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (((il) this).field_b <= ((il) this).field_j + (long)((il) this).field_f) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.a(-114);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (((il) this).field_j == -1L) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (((long)((il) this).field_h.length + ((il) this).field_j ^ -1L) > ((long)param0 + ((il) this).field_b ^ -1L)) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5_int = (int)(((il) this).field_j - (((il) this).field_b - (long)((il) this).field_h.length));
                        pd.a(param2, param3, ((il) this).field_h, (int)(((il) this).field_b - ((il) this).field_j), var5_int);
                        param0 = param0 - var5_int;
                        ((il) this).field_b = ((il) this).field_b + (long)var5_int;
                        param3 = param3 + var5_int;
                        ((il) this).field_f = ((il) this).field_h.length;
                        this.a(-113);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (((il) this).field_h.length >= param0) {
                            statePc = 36;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((((il) this).field_i ^ -1L) == (((il) this).field_b ^ -1L)) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((il) this).field_m.a(true, ((il) this).field_b);
                        ((il) this).field_i = ((il) this).field_b;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((il) this).field_m.a(0, param0, param3, param2);
                        ((il) this).field_i = ((il) this).field_i + (long)param0;
                        if ((((il) this).field_g ^ -1L) <= (((il) this).field_i ^ -1L)) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((il) this).field_g = ((il) this).field_i;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var5_long = -1L;
                        var7 = -1L;
                        if (((il) this).field_b < ((il) this).field_d) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (((il) this).field_d + (long)((il) this).field_c <= ((il) this).field_b) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var5_long = ((il) this).field_b;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (((il) this).field_d < ((il) this).field_b) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (((il) this).field_d >= (long)param0 + ((il) this).field_b) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var5_long = ((il) this).field_d;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (((il) this).field_b - -(long)param0 <= ((il) this).field_d) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (((il) this).field_b + (long)param0 > ((il) this).field_d - -(long)((il) this).field_c) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var7 = ((il) this).field_b + (long)param0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((((il) this).field_b ^ -1L) <= (((il) this).field_d - -(long)((il) this).field_c ^ -1L)) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((((il) this).field_d + (long)((il) this).field_c ^ -1L) < (((il) this).field_b - -(long)param0 ^ -1L)) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var7 = (long)((il) this).field_c + ((il) this).field_d;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var5_long <= -1L) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if ((var7 ^ -1L) >= (var5_long ^ -1L)) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9 = (int)(-var5_long + var7);
                        pd.a(param2, (int)((long)param3 + var5_long - ((il) this).field_b), ((il) this).field_a, (int)(var5_long + -((il) this).field_d), var9);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ((il) this).field_b = ((il) this).field_b + (long)param0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 35: {
                    return;
                }
                case 36: {
                    try {
                        if ((param0 ^ -1) >= param1) {
                            statePc = 43;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (0L != (((il) this).field_j ^ -1L)) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        ((il) this).field_j = ((il) this).field_b;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        pd.a(param2, param3, ((il) this).field_h, (int)(-((il) this).field_j + ((il) this).field_b), param0);
                        ((il) this).field_b = ((il) this).field_b + (long)param0;
                        if (-((il) this).field_j + ((il) this).field_b <= (long)((il) this).field_f) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        ((il) this).field_f = (int)(((il) this).field_b - ((il) this).field_j);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 41: {
                    return;
                }
                case 42: {
                    var5 = (IOException) (Object) caughtException;
                    ((il) this).field_i = -1L;
                    throw var5;
                }
                case 43: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    il(tc param0, int param1, int param2) throws IOException {
        ((il) this).field_d = -1L;
        ((il) this).field_j = -1L;
        ((il) this).field_f = 0;
        ((il) this).field_m = param0;
        ((il) this).field_g = param0.a((byte) 121);
        ((il) this).field_k = param0.a((byte) 121);
        ((il) this).field_b = 0L;
        ((il) this).field_h = new byte[param2];
        ((il) this).field_a = new byte[param1];
    }

    final void a(int param0, byte[] param1) throws IOException {
        if (param0 > -113) {
            il.b(46);
        }
        ((il) this).a(param1, param1.length, 0, 0);
    }

    static {
    }
}
