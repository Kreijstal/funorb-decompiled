/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qa {
    private byte[] field_a;
    private byte[] field_b;
    static int[] field_i;
    private gl field_m;
    private long field_n;
    private int field_e;
    private long field_c;
    private long field_g;
    static String field_h;
    private long field_d;
    private long field_k;
    private long field_l;
    private int field_f;
    static boolean field_j;

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
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
                    var14 = CrazyCrystals.field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1.length >= param3 + param2) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(-param1.length + param3 + param2);
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (0L == (((qa) this).field_n ^ -1L)) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((qa) this).field_g ^ -1L) > (((qa) this).field_n ^ -1L)) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((long)((qa) this).field_e + ((qa) this).field_n >= ((qa) this).field_g + (long)param3) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        eg.a(((qa) this).field_a, (int)(-((qa) this).field_n + ((qa) this).field_g), param1, param2, param3);
                        ((qa) this).field_g = ((qa) this).field_g + (long)param3;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var5_long = ((qa) this).field_g;
                        var7 = param2;
                        var8 = param3;
                        if ((((qa) this).field_g ^ -1L) > (((qa) this).field_k ^ -1L)) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((((qa) this).field_g ^ -1L) <= (((qa) this).field_k - -(long)((qa) this).field_f ^ -1L)) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var9_int = (int)((long)((qa) this).field_f - -((qa) this).field_k - ((qa) this).field_g);
                        if (param3 < var9_int) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9_int = param3;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        eg.a(((qa) this).field_b, (int)(-((qa) this).field_k + ((qa) this).field_g), param1, param2, var9_int);
                        param2 = param2 + var9_int;
                        ((qa) this).field_g = ((qa) this).field_g + (long)var9_int;
                        param3 = param3 - var9_int;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (((qa) this).field_b.length >= param3) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((qa) this).field_m.a(((qa) this).field_g, param0 + -224);
                        ((qa) this).field_l = ((qa) this).field_g;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((param3 ^ -1) >= -1) {
                            statePc = 26;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var9_int = ((qa) this).field_m.a(param1, param2, param3, (byte) -68);
                        if (var9_int != -1) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        param3 = param3 - var9_int;
                        ((qa) this).field_l = ((qa) this).field_l + (long)var9_int;
                        param2 = param2 + var9_int;
                        ((qa) this).field_g = ((qa) this).field_g + (long)var9_int;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (param3 <= 0) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.c(-1);
                        var9_int = param3;
                        if (((qa) this).field_f < var9_int) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var9_int = ((qa) this).field_f;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        eg.a(((qa) this).field_b, 0, param1, param2, var9_int);
                        ((qa) this).field_g = ((qa) this).field_g + (long)var9_int;
                        param3 = param3 - var9_int;
                        param2 = param2 + var9_int;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (-1L != ((qa) this).field_n) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (((qa) this).field_g >= ((qa) this).field_n) {
                            statePc = 35;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (param3 > 0) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var9_int = (int)(((qa) this).field_n + -((qa) this).field_g) + param2;
                        if (param3 + param2 >= var9_int) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9_int = param2 + param3;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var9_int <= param2) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        param2++;
                        param1[param2] = (byte) 0;
                        param3--;
                        ((qa) this).field_g = ((qa) this).field_g + 1L;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9 = -1L;
                        if ((((qa) this).field_n ^ -1L) > (var5_long ^ -1L)) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (((qa) this).field_n < (long)var8 + var5_long) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((((qa) this).field_n ^ -1L) < (var5_long ^ -1L)) {
                            statePc = 42;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var5_long >= ((qa) this).field_n + (long)((qa) this).field_e) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var9 = var5_long;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var9 = ((qa) this).field_n;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var11 = -1L;
                        if ((var5_long ^ -1L) <= ((long)((qa) this).field_e + ((qa) this).field_n ^ -1L)) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (((long)((qa) this).field_e + ((qa) this).field_n ^ -1L) < (var5_long - -(long)var8 ^ -1L)) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var11 = ((qa) this).field_n - -(long)((qa) this).field_e;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (((qa) this).field_n >= var5_long + (long)var8) {
                            statePc = 49;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if ((long)((qa) this).field_e + ((qa) this).field_n >= var5_long + (long)var8) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var11 = var5_long - -(long)var8;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (0L <= (var9 ^ -1L)) {
                            statePc = 53;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if ((var11 ^ -1L) >= (var9 ^ -1L)) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var13 = (int)(var11 + -var9);
                        eg.a(((qa) this).field_a, (int)(-((qa) this).field_n + var9), param1, var7 + (int)(var9 + -var5_long), var13);
                        if (((qa) this).field_g >= var11) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        param3 = (int)((long)param3 - (var11 - ((qa) this).field_g));
                        ((qa) this).field_g = var11;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (param0 == 106) {
                            statePc = 57;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 56: {
                    var5 = (IOException) (Object) caughtException;
                    ((qa) this).field_l = -1L;
                    throw var5;
                }
                case 57: {
                    if (-1 > (param3 ^ -1)) {
                        statePc = 59;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 59: {
                    throw new EOFException();
                }
                case 60: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        if (param0 <= 80) {
          return;
        } else {
          L0: {
            if ((((qa) this).field_n ^ -1L) == 0L) {
              break L0;
            } else {
              L1: {
                if (((qa) this).field_l != ((qa) this).field_n) {
                  ((qa) this).field_m.a(((qa) this).field_n, -88);
                  ((qa) this).field_l = ((qa) this).field_n;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                ((qa) this).field_m.a(120, 0, ((qa) this).field_e, ((qa) this).field_a);
                ((qa) this).field_l = ((qa) this).field_l + (long)((qa) this).field_e;
                if ((((qa) this).field_l ^ -1L) >= (((qa) this).field_c ^ -1L)) {
                  break L2;
                } else {
                  ((qa) this).field_c = ((qa) this).field_l;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var2 = -1L;
                  if (((qa) this).field_k > ((qa) this).field_n) {
                    break L4;
                  } else {
                    if (((qa) this).field_n < ((qa) this).field_k - -(long)((qa) this).field_f) {
                      var2 = ((qa) this).field_n;
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (((qa) this).field_k < ((qa) this).field_n) {
                  break L3;
                } else {
                  if ((((qa) this).field_k ^ -1L) > (((qa) this).field_n + (long)((qa) this).field_e ^ -1L)) {
                    var2 = ((qa) this).field_k;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                L6: {
                  var4 = -1L;
                  if (((qa) this).field_n + (long)((qa) this).field_e <= ((qa) this).field_k) {
                    break L6;
                  } else {
                    if (((qa) this).field_k + (long)((qa) this).field_f >= ((qa) this).field_n + (long)((qa) this).field_e) {
                      var4 = ((qa) this).field_n - -(long)((qa) this).field_e;
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (((qa) this).field_k - -(long)((qa) this).field_f <= ((qa) this).field_n) {
                  break L5;
                } else {
                  if (((qa) this).field_k - -(long)((qa) this).field_f > ((qa) this).field_n - -(long)((qa) this).field_e) {
                    break L5;
                  } else {
                    var4 = ((qa) this).field_k + (long)((qa) this).field_f;
                    break L5;
                  }
                }
              }
              L7: {
                if ((var2 ^ -1L) >= 0L) {
                  break L7;
                } else {
                  if (var2 >= var4) {
                    break L7;
                  } else {
                    var6 = (int)(var4 - var2);
                    eg.a(((qa) this).field_a, (int)(var2 - ((qa) this).field_n), ((qa) this).field_b, (int)(var2 + -((qa) this).field_k), var6);
                    break L7;
                  }
                }
              }
              ((qa) this).field_n = -1L;
              ((qa) this).field_e = 0;
              break L0;
            }
          }
          return;
        }
    }

    final void a(byte[] param0, int param1) throws IOException {
        if (param1 > -69) {
            return;
        }
        ((qa) this).a((byte) 106, param0, 0, param0.length);
    }

    final void a(long param0, int param1) throws IOException {
        if (0L > param0) {
            throw new IOException();
        }
        if (param1 != -1) {
            return;
        }
        ((qa) this).field_g = param0;
    }

    private final void c(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = CrazyCrystals.field_B;
          ((qa) this).field_f = 0;
          if (((qa) this).field_g != ((qa) this).field_l) {
            ((qa) this).field_m.a(((qa) this).field_g, param0 + -89);
            ((qa) this).field_l = ((qa) this).field_g;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -1) {
          return;
        } else {
          ((qa) this).field_k = ((qa) this).field_g;
          L1: while (true) {
            L2: {
              if (((qa) this).field_f >= ((qa) this).field_b.length) {
                break L2;
              } else {
                L3: {
                  var2 = -((qa) this).field_f + ((qa) this).field_b.length;
                  if (-200000001 <= (var2 ^ -1)) {
                    break L3;
                  } else {
                    var2 = 200000000;
                    break L3;
                  }
                }
                var3 = ((qa) this).field_m.a(((qa) this).field_b, ((qa) this).field_f, var2, (byte) -63);
                if ((var3 ^ -1) != 0) {
                  ((qa) this).field_f = ((qa) this).field_f + var3;
                  ((qa) this).field_l = ((qa) this).field_l + (long)var3;
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            return;
          }
        }
    }

    final void d(int param0) throws IOException {
        if (param0 != -200000001) {
            return;
        }
        this.a((byte) 88);
        ((qa) this).field_m.d(91);
    }

    final long b(int param0) {
        if (param0 != 0) {
            ((qa) this).field_d = 73L;
        }
        return ((qa) this).field_d;
    }

    final static dp a(byte param0, int param1) {
        dp var2 = new dp();
        if (param0 != 121) {
            field_h = null;
        }
        pm.field_c.b(0, (jb) (Object) var2);
        eq.b(param0 ^ 123, param1);
        return var2;
    }

    qa(gl param0, int param1, int param2) throws IOException {
        ((qa) this).field_n = -1L;
        ((qa) this).field_e = 0;
        ((qa) this).field_k = -1L;
        ((qa) this).field_m = param0;
        ((qa) this).field_c = param0.a(48);
        ((qa) this).field_d = param0.a(48);
        ((qa) this).field_a = new byte[param2];
        ((qa) this).field_b = new byte[param1];
        ((qa) this).field_g = 0L;
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        int var5_int = 0;
        long var6 = 0L;
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = CrazyCrystals.field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((((qa) this).field_g - -(long)param3 ^ -1L) < (((qa) this).field_d ^ -1L)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((qa) this).field_d = ((qa) this).field_g - -(long)param3;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((qa) this).field_n == -1L) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((((qa) this).field_n ^ -1L) < (((qa) this).field_g ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (((qa) this).field_g > (long)((qa) this).field_e + ((qa) this).field_n) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.a((byte) 103);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((((qa) this).field_n ^ -1L) == 0L) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((((qa) this).field_g - -(long)param3 ^ -1L) < (((qa) this).field_n + (long)((qa) this).field_a.length ^ -1L)) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5_int = (int)(-((qa) this).field_g + ((qa) this).field_n + (long)((qa) this).field_a.length);
                        eg.a(param1, param2, ((qa) this).field_a, (int)(((qa) this).field_g - ((qa) this).field_n), var5_int);
                        ((qa) this).field_g = ((qa) this).field_g + (long)var5_int;
                        param3 = param3 - var5_int;
                        param2 = param2 + var5_int;
                        ((qa) this).field_e = ((qa) this).field_a.length;
                        this.a((byte) 95);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5_int = 7 / ((82 - param0) / 36);
                        if (param3 <= ((qa) this).field_a.length) {
                            statePc = 41;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((((qa) this).field_l ^ -1L) != (((qa) this).field_g ^ -1L)) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((qa) this).field_m.a(((qa) this).field_g, -99);
                        ((qa) this).field_l = ((qa) this).field_g;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((qa) this).field_m.a(120, param2, param3, param1);
                        ((qa) this).field_l = ((qa) this).field_l + (long)param3;
                        if (((qa) this).field_l > ((qa) this).field_c) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((qa) this).field_c = ((qa) this).field_l;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var6 = -1L;
                        var8 = -1L;
                        if ((((qa) this).field_g ^ -1L) > (((qa) this).field_k ^ -1L)) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (((long)((qa) this).field_f + ((qa) this).field_k ^ -1L) < (((qa) this).field_g ^ -1L)) {
                            statePc = 27;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((((qa) this).field_k ^ -1L) > (((qa) this).field_g ^ -1L)) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (((qa) this).field_k < (long)param3 + ((qa) this).field_g) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var6 = ((qa) this).field_k;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var6 = ((qa) this).field_g;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((((qa) this).field_g - -(long)param3 ^ -1L) >= (((qa) this).field_k ^ -1L)) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (((qa) this).field_g + (long)param3 <= (long)((qa) this).field_f + ((qa) this).field_k) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (((qa) this).field_k - -(long)((qa) this).field_f <= ((qa) this).field_g) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (((qa) this).field_k + (long)((qa) this).field_f > (long)param3 + ((qa) this).field_g) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var8 = ((qa) this).field_k + (long)((qa) this).field_f;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var8 = (long)param3 + ((qa) this).field_g;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var6 <= -1L) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((var8 ^ -1L) < (var6 ^ -1L)) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var10 = (int)(var8 + -var6);
                        eg.a(param1, (int)(-((qa) this).field_g + ((long)param2 + var6)), ((qa) this).field_b, (int)(-((qa) this).field_k + var6), var10);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        ((qa) this).field_g = ((qa) this).field_g + (long)param3;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 40: {
                    return;
                }
                case 41: {
                    try {
                        if (0 >= param3) {
                            statePc = 49;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (((qa) this).field_n == -1L) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ((qa) this).field_n = ((qa) this).field_g;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        eg.a(param1, param2, ((qa) this).field_a, (int)(-((qa) this).field_n + ((qa) this).field_g), param3);
                        ((qa) this).field_g = ((qa) this).field_g + (long)param3;
                        if (((long)((qa) this).field_e ^ -1L) <= (-((qa) this).field_n + ((qa) this).field_g ^ -1L)) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        ((qa) this).field_e = (int)(-((qa) this).field_n + ((qa) this).field_g);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 47: {
                    return;
                }
                case 48: {
                    var5 = (IOException) (Object) caughtException;
                    ((qa) this).field_l = -1L;
                    throw var5;
                }
                case 49: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_i = null;
        if (param0 != -6142) {
            dp discarded$0 = qa.a((byte) -3, -85);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new int[8192];
        field_h = "You can make him move using the keys indicated above.";
    }
}
